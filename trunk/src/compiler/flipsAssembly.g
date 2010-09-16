/*
 Copyright (c) 2007-2010 Robert Eunice
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

tree grammar flipsAssembly;

options {
  language = Java;
  tokenVocab = flips;
  ASTLabelType = CommonTree;
}

@header {
  import java.io.IOException;
  import java.util.HashMap;
}

@members {
  SymbolTable symbols;
  public StringBuilder output = new StringBuilder();
  
  public void emit(String instruction) {
    output.append(instruction + "\n");
  }
  
  public void emit(String instruction, String comment) {
    instruction = padRight(instruction, 25) + "// " + comment;
    output.append(instruction + "\n");
  }
  
  public static String padRight(String string, int count) {
    return String.format("\%1$-" + count + "s", string);
  }
  
  static String toHHMMSS(double value) {
    int hours = (int)value / 3600;
    int remainder = (int)value \% 3600;
    int minutes = remainder / 60;
    int seconds = remainder \% 60;
    int decimal = (int)Math.round((value - (int)value) * 1000f);
    
    return hours + ":" +
           (minutes < 10 ? "0" : "") + minutes + ":" +
           (seconds < 10 ? "0" : "") + seconds +
           (decimal != 0 ? "." + decimal : "");
  }
  
  public static String toFT(double meters) {
    return meters + " m (" + (meters / 0.3048) + " ft) ";
  }
  
  public static String toMPH(double metersPerSecond) {
    return metersPerSecond + " m/s (" + (Math.round(metersPerSecond / 1609.344 * 3600 * 100) / 100f) + " mph) ";
  }
}

// FLIGHT EXPRESSIONS

flightPlan[SymbolTable symbols]
@init {
  this.symbols = symbols;
}
	:	^(FLIGHTPLAN require* define* statement*);

// REQUIRES

require
	:	^(REQUIRE name=StringLiteral)
	{
// Read file
CharStream input = new ANTLRFileStream(name.getText().replace("\"",""));

// Lexer
flipsLexer lexer = new flipsLexer(input);
CommonTokenStream tokens = new CommonTokenStream(lexer);

// Parser and AST Construction
flipsParser parser = new flipsParser(tokens);
flipsParser.flightPlan_return root = parser.flightPlan();
CommonTree tree = root.tree;
CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

// Semantic Check and Unit Conversion
flipsAssembly walker = new flipsAssembly(nodes);
walker.flightPlan(symbols);
	}
	;
	catch [IOException ex] {
		// The file could not be found. Alert the user.
		System.out.println(ex.toString());
	}

// DEFINITIONS

define
	:	defineFlightPlan
	|	defineCommand
	|	defineSensor
	|	defineWaypoint
	;

defineFlightPlan
	:	^(DEFINE name=Identifier ^(FLIGHTPLAN fp=StringLiteral))
		{symbols.define(new FlightPlanSymbol(name.getText(),fp.getText()));}
	;

defineCommand
	:	^(DEFINE name=Identifier ^(COMMAND cmd=integerValue))
		{symbols.define(new CommandSymbol(name.getText(),cmd));}
	|	^(DEFINE name=Identifier ^(COMMAND cmd=integerValue PARAMETER par=integerValue))
		{symbols.define(new CommandSymbol(name.getText(),cmd,par));}
	;

defineSensor
	:	^(DEFINE name=Identifier ^(SENSOR sen=integerValue))
		{symbols.define(new SensorSymbol(name.getText(),sen));}
	;

defineWaypoint
	:	^(DEFINE name=Identifier ^(GEOCOORDINATE geo=latitudeLongitude))
		{symbols.define(new LatLonWaypointSymbol(name.getText(),geo.latitude,geo.longitude));}
	|	^(DEFINE name=Identifier ^(GEOCOORDINATE dst=distanceCoordinate))
		{symbols.define(new DistanceWaypointSymbol(name.getText(),dst.east,dst.north));}
	;

// STATEMENTS

statement
	:	command
	|	repeat
//	|	wait
	;

repeat
	:	^(REPEAT ^(CONDITION repeatCondition) ^(EXECUTE statement*))
		{emit("RPT END", "End Repeat");}
	;

repeatCondition
	:	x=integerValue
		{emit("RPT NUM " + x, "Repeat " + x + " Times");}
	|	^(TIME RELATIVE x=timeValue)
		{emit("RPT TIM " + x, "Repeat For " + x + " s (" + toHHMMSS(x) + ") Duration");}
	|	FOREVER
		{emit("RPT FRV", "Repeat Forever");}
	;

// COMMANDS

command
	:	flyCommand
	|	loiterCommand
	|	executeCommand
	;

// COMMAND EXPRESSIONS

flyCommand
	:	^(FLY flyCommandValue*)
		{emit("FLY", "Execute");}
	;

flyCommandValue
	:	time
	|	direction
	|	speed
	|	throttle
	|	distance
	|	pitch
	|	roll
	|	duration
	|	waypoint
	|	altitude
	;

loiterCommand
	:	^(LOITER loiterCommandValue*)
		{emit("LTR", "Execute Loiter");}
	;

loiterCommandValue
	:	time
	|	speed
	|	throttle
	|	turnDirection
	|	radius
	|	duration
	|	waypoint
	|	altitude
	;

executeCommand
	:	^(EXECUTE x=Identifier executeCommandParameter*)
	{
Symbol symbol = symbols.resolve(x.getText());
if (symbol != null && symbol instanceof CommandSymbol) {
  CommandSymbol command = (CommandSymbol)symbol;
  emit("CMD " + command.getValue(), command.getName().toUpperCase() + " / Command #" + command.getValue());
}
else if (symbol != null && symbol instanceof FlightPlanSymbol) {
  FlightPlanSymbol flightPlan = (FlightPlanSymbol)symbol;
  emit(flightPlan.compile());
}
	}
	;
	catch [IOException ex] {
		// The file could not be found. Alert the user.
		System.out.println(ex.toString());
	}

executeCommandParameter
	:	^(PARAMETER x=numericValue)
		{emit("CMD PAR " + x, x + " Command Parameter");}
	|	^(PARAMETER y=StringLiteral)
		{emit("CMD PAR " + y, "\"" + y + "\"" + " Command Parameter");}
	;

// ATTITUDE EXPRESSIONS

pitch
	:	^(PITCH FIXED x=angularValue)
		{emit("POS PIT FIX " + x, x + " deg Pitch");}
	|	^(PITCH RELATIVE x=angularValue)
		{emit("POS PIT REL " + x, x + " deg Relative Pitch");}
	|	^(PITCH FIXED y=angularRateValue)
		{emit("VEL PIT FIX " + y, y + " deg/s Pitch");}
	|	^(PITCH RELATIVE y=angularRateValue)
		{emit("VEL PIT REL " + y, y + " deg/s Relative Pitch");}
	|	^(PITCH FIXED x=angularValue y=angularRateValue)
		{emit("VEL PIT FIX " + y, y + " deg/s Pitch");}
		{emit("POS PIT FIX " + x, x + " deg Pitch");}
	|	^(PITCH RELATIVE x=angularValue y=angularRateValue)
		{emit("VEL PIT FIX " + y, y + " deg/s Pitch");}
		{emit("POS PIT REL " + x, x + " deg Relative Pitch");}
	;

roll
	:	^(ROLL FIXED x=angularValue)
		{emit("POS ROL FIX " + x, x + " deg Roll");}
	|	^(ROLL RELATIVE x=angularValue)
		{emit("POS ROL REL " + x, x + " deg Relative Roll");}
	|	^(ROLL FIXED y=angularRateValue)
		{emit("VEL ROL FIX " + y, y + " deg/s Roll");}
	|	^(ROLL RELATIVE y=angularRateValue)
		{emit("VEL ROL REL " + y, y + " deg/s Relative Roll");}
	|	^(ROLL FIXED x=angularValue y=angularRateValue)
		{emit("VEL ROL FIX " + y, y + " deg/s Roll");}
		{emit("POS ROL FIX " + x, x + " deg Roll");}
	|	^(ROLL RELATIVE x=angularValue y=angularRateValue)
		{emit("VEL ROL FIX " + y, y + " deg/s Roll");}
		{emit("POS ROL REL " + x, x + " deg Relative Roll");}
	;

yaw
	:	^(YAW FIXED x=angularValue)
		{emit("POS YAW FIX " + x, x + " deg Yaw");}
	|	^(YAW RELATIVE x=angularValue)
		{emit("POS YAW REL " + x, x + " deg Relative Yaw");}
	|	^(YAW FIXED y=angularRateValue)
		{emit("VEL YAW FIX " + y, y + " deg/s Yaw");}
	|	^(YAW RELATIVE y=angularRateValue)
		{emit("VEL YAW REL " + y, y + " deg/s Relative Yaw");}
	|	^(YAW FIXED x=angularValue y=angularRateValue)
		{emit("VEL YAW FIX " + y, y + " deg/s Yaw");}
		{emit("POS YAW FIX " + x, x + " deg Yaw");}
	|	^(YAW RELATIVE x=angularValue y=angularRateValue)
		{emit("VEL YAW FIX " + y, y + " deg/s Yaw");}
		{emit("POS YAW REL " + x, x + " deg Relative Yaw");}
	;

// ALTITUDE EXPRESSIONS

altitude
	:	^(DISTANCE FIXED Z x=distanceValue)
		{emit("POS   Z FIX " + x, toFT(-x) + "Altitude");}
	|	^(DISTANCE RELATIVE Z x=distanceValue)
		{emit("POS   Z REL " + x, toFT(-x) + "Relative Altitude");}
	|	^(DISTANCE FIXED Z y=pressureValue)
		{emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");}
	|	^(DISTANCE RELATIVE Z y=pressureValue)
		{emit("POS PRE REL " + y, y + " kPa Relative Pressure Altitude");}
	;

// DISTANCE EXPRESSIONS

distance
	:	^(DISTANCE RELATIVE X x=distanceValue)
		{emit("POS   X REL " + x, toFT(x) + "Relative X Distance");}
	|	^(DISTANCE RELATIVE Y x=distanceValue)
		{emit("POS   Y REL " + x, toFT(x) + "Relative Y Distance");}
	;

radius
	:	^(RADIUS x=distanceValue)
		{emit("RAD " + x, toFT(x) + "Radius");}
	;

// SPEED EXPRESSIONS

speed
	:	^(SPEED FIXED x=speedValue)
		{emit("SPD AIR FIX " + x, toMPH(x) + "Air Speed");}
	|	^(SPEED RELATIVE x=speedValue)
		{emit("SPD AIR REL " + x, toMPH(x) + "Relative Air Speed");}
	|	^(SPEED RELATIVE x=percentValue)
	;

throttle
	:	^(THROTTLE FIXED ^(SPEED x=percentValue))
		{emit("ACT THR FIX PCT " + x, x + "\% Throttle");}
	|	^(THROTTLE FIXED x=angularRateValue)
		{emit("ACT THR FIX RPM " + (x / 6d), (x / 6d) + " RPM (" + x + " deg/s) Throttle");}
	|	^(THROTTLE RELATIVE ^(SPEED x=percentValue))
		{emit("ACT THR REL PCT " + x, x + "\% Throttle");}
	|	^(THROTTLE RELATIVE x=angularRateValue)
		{emit("ACT THR REL RPM " + (x / 6d), (x / 6d) + " RPM (" + x + " deg/s) Throttle");}
	;

// TIME EXPRESSIONS

time
	:	^(TIME FIXED x=timeValue)
		{emit("TIM FIX " + x, x + " s (" + toHHMMSS(x) + ") Time");}
	;

duration
	:	^(TIME RELATIVE x=timeValue)
		{emit("TIM REL " + x, x + " s (" + toHHMMSS(x) + ") Duration");}
	;

// DIRECTION EXPRESSIONS

direction
	:	^(DIRECTION FIXED y=angularValue)
		{emit("POS YAW FIX " + y, y + " deg Heading");}
	|	^(DIRECTION FIXED turnDirection y=angularValue)
		{emit("POS YAW FIX " + y, y + " deg Heading");}
	|	^(DIRECTION RELATIVE y=angularValue)
		{emit("POS YAW REL " + y, y + " deg Yaw");}
	;

turnDirection
	:	^(TURN LEFT)
		{emit("DIR L", "Left Turn Direction");}
	|	^(TURN RIGHT)
		{emit("DIR R", "Right Turn Direction");}
	;

// WAYPOINT EXPRESSIONS

waypoint
	:	geoCoordinate
	|	^(WAYPOINT x=Identifier)
	{
Symbol symbol = symbols.resolve(x.getText());
if (symbol != null && symbol instanceof LatLonWaypointSymbol) {
  LatLonWaypointSymbol waypoint = (LatLonWaypointSymbol)symbol;
  emit("POS   X GEO " + waypoint.getLongitude(), waypoint.getName().toUpperCase() + " / " + Math.abs(waypoint.getLongitude()) + " " + waypoint.getEastWest() + " Longitude");
  emit("POS   Y GEO " + waypoint.getLatitude(), waypoint.getName().toUpperCase() + " / " + Math.abs(waypoint.getLatitude()) + " " + waypoint.getNorthSouth() + " Latitude");
}
else if (symbol != null && symbol instanceof DistanceWaypointSymbol) {
  DistanceWaypointSymbol waypoint = (DistanceWaypointSymbol)symbol;
  emit("POS   X FIX " + waypoint.getX(), waypoint.getName().toUpperCase() + " / " + toFT(Math.abs(waypoint.getX())) + waypoint.getEastWest() + " Distance");
  emit("POS   Y FIX " + waypoint.getY(), waypoint.getName().toUpperCase() + " / " + toFT(Math.abs(waypoint.getY())) + waypoint.getNorthSouth() + " Distance");
}
else {
  emit("POS   X FIX " + symbol.getName(), symbol.getName().toUpperCase() + " Waypoint");
  emit("POS   Y FIX " + symbol.getName(), symbol.getName().toUpperCase() + " Waypoint");
}
	}
	;

geoCoordinate
	:	^(GEOCOORDINATE geo=latitudeLongitude)
		{String ns = geo.latitude >= 0 ? "N" : "S";}
		{String ew = geo.longitude >= 0 ? "E" : "W";}
		{emit("POS   X GEO " + geo.longitude, Math.abs(geo.longitude) + " " + ew + " Longitude");}
		{emit("POS   Y GEO " + geo.latitude, Math.abs(geo.latitude) + " " + ns + " Latitude");}
	|	^(GEOCOORDINATE dst=distanceCoordinate)
		{String ns = dst.north >= 0 ? "N" : "S";}
		{String ew = dst.east >= 0 ? "E" : "W";}
		{emit("POS   X FIX " + dst.east, toFT(Math.abs(dst.east)) + ew + " Distance");}
		{emit("POS   Y FIX " + dst.north, toFT(Math.abs(dst.north)) + ns + " Distance");}
	;

latitudeLongitude returns [double latitude, double longitude]
	:	^(X x=angularValue) ^(Y y=angularValue)
		{$latitude = y;}
		{$longitude = x;}
	;

distanceCoordinate returns [double north, double east]
	:	^(X x=distanceValue) ^(Y y=distanceValue)
		{$north = y;}
		{$east = x;}
	;

angularValue returns [double r]
	:	^(ANGLE x=numericValue DEGREE)
		{$r = x;}
	;

angularRateValue returns [double r]
	:	^(SPEED x=numericValue DEGREE SECOND)
		{$r = x;}
	;

distanceValue returns [double r]
	:	^(DISTANCE x=numericValue METER)
		{$r = x;}
	;

pressureValue returns [double r]
	:	^(PRESSURE x=numericValue PASCAL)
		{$r = x;}
	;

speedValue returns [double r]
	:	^(SPEED x=numericValue METER SECOND)
		{$r = x;}
	;

timeValue returns [double r]
	:	^(TIME x=numericValue SECOND)
		{$r = x;}
	;

// Standard numeric value unit is the double
numericValue returns [double r]
	:	x=integerValue
		{$r = (double) x;}
	|	y=FloatingPointLiteral
		{$r = Double.parseDouble(y.getText());}
	;

integerValue returns [int r]
	:	x=BinaryLiteral
		{$r = Integer.parseInt(x.getText().substring(2),2);}
	|	x=OctalLiteral
		{$r = Integer.parseInt(x.getText().substring(1),8);}
	|	x=DecimalLiteral
		{$r = Integer.parseInt(x.getText());}
	|	x=HexLiteral
		{$r = Integer.parseInt(x.getText().substring(2),16);}
	;

percentValue returns [double r]
	:	x=numericValue PERCENT
		{$r = x;}
	;
