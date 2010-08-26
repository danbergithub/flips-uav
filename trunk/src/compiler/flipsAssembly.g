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
  
  static String sToHHMMSS(double value) {
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
  
  public static String mToft(double meters) {
    return meters + " m (" + (meters / 0.3048) + " ft) ";
  }
}

// FLIGHT EXPRESSIONS

flightPlan[SymbolTable symbols]
@init {
  this.symbols = symbols;
}
	:	^(FLIGHTPLAN require* define* command*);

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
	|	loiterDirection
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
		{emit("CMD PAR " + x, "Command Parameter");}
	|	^(PARAMETER y=StringLiteral)
		{emit("CMD PAR " + y, "Command Parameter");}
	;

// ATTITUDE EXPRESSIONS

pitch
	:	^(PITCH x=convertAngle)
		{emit("POS PIT FIX " + x, x + " deg Pitch");}
	|	^(PITCH y=convertAngularRate)
		{emit("VEL PIT FIX " + y, y + " deg/s Pitch");}
	|	^(PITCH x=convertAngle ^(SPEED y=convertAngularRate))
		{emit("POS PIT FIX " + x, x + " deg Pitch");}
		{emit("VEL PIT FIX " + y, y + " deg/s Pitch");}
	;

roll
	:	^(ROLL x=convertAngle)
		{emit("POS ROL FIX " + x, x + " deg Roll");}
	|	^(ROLL y=convertAngularRate)
		{emit("VEL ROL FIX " + y, y + " deg/s Roll");}
	|	^(ROLL x=convertAngle ^(SPEED y=convertAngularRate))
		{emit("POS ROL FIX " + x, x + " deg Roll");}
		{emit("VEL ROL FIX " + y, y + " deg/s Roll");}
	|	^(ROLL LEVEL)
		{emit("POS ROL FIX 0", "0 deg/s Roll");}
	;

// ALTITUDE EXPRESSIONS

altitude
	:	^(ALTITUDE FIXED DISTANCE x=convertDistance)
		{emit("POS   Z FIX " + -x, mToft(x) + "Altitude");}
	|	^(ALTITUDE FIXED PRESSURE y=convertPressure)
		{emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");}
	|	^(ALTITUDE FIXED x=convertFlightLevel)
		{emit("POS   Z FIX " + -x, mToft(x) + "Altitude");}
	|	^(ALTITUDE RELATIVE CLIMB DISTANCE x=convertDistance)
		{emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");}
	|	^(ALTITUDE RELATIVE CLIMB PRESSURE y=convertPressure)
		{emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");}
	|	^(ALTITUDE RELATIVE DESCEND DISTANCE x=convertDistance)
		{emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");}
	|	^(ALTITUDE RELATIVE DESCEND PRESSURE y=convertPressure)
		{emit("POS PRE REL " + y, y + " kPa Relative Pressure Altitude");}
	;

// DISTANCE EXPRESSIONS

distance
	:	^(DISTANCE x=convertDistance)
		{emit("POS   X REL " + x, mToft(x) + "Relative Distance");}
	|	^(DISTANCE LEFT x=convertDistance)
		{emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");}
	|	^(DISTANCE RIGHT x=convertDistance)
		{emit("POS   Y REL " + x, mToft(x) + "Relative Right Distance");}
	;

radius
	:	^(RADIUS x=convertDistance)
		{emit("RAD " + x, mToft(x) + "Radius");}
	;

// SPEED EXPRESSIONS

speed
	:	^(SPEED FIXED x=convertSpeed)
		{emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");}
	|	^(SPEED RELATIVE FASTER x=convertSpeed)
		{emit("SPD AIR REL " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");}
	|	^(SPEED RELATIVE SLOWER x=convertSpeed)
		{emit("SPD AIR REL " + -x, -x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");}
	|	^(SPEED RELATIVE FASTER x=percentValue)
	|	^(SPEED RELATIVE SLOWER x=percentValue)
	|	^(SPEED THROTTLE x=percentValue)
		{emit("ACT THR PCT " + x, x + "\% Throttle");}
	|	^(SPEED THROTTLE x=convertAngularRate)
		{emit("ACT THR RPM " + (x / 6d), (x / 6d) + " RPM (" + x + " deg/s) Throttle");}
	;

// TIME EXPRESSIONS

time
	:	^(TIME x=convertTime (y=convertTime (z=convertTime)?)? AM)
		{x = (x == 43200d) ? 0d : x;}
		{emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");}
	|	^(TIME x=convertTime (y=convertTime (z=convertTime)?)? PM)
		{x = (x == 43200d) ? 0d : x;}
		{emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");}
	|	^(TIME x=convertTime (y=convertTime (z=convertTime)?)? HOUR24)
		{emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Time");}
	;

duration
	:	^(DURATION x=convertTime (y=convertTime (z=convertTime)?)?)
		{emit("TIM REL " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Duration");}
	;

// DIRECTION EXPRESSIONS

direction
	:	^(DIRECTION FIXED x=convertCardinalDirection)
		{emit("POS YAW FIX " + x, x + " deg Heading");}
	|	^(DIRECTION FIXED x=convertOrdinalDirection)
		{emit("POS YAW FIX " + x, x + " deg Heading");}
	|	^(DIRECTION FIXED x=convertSubOrdinalDirection)
		{emit("POS YAW FIX " + x, x + " deg Heading");}
	|	^(DIRECTION FIXED y=convertAngle)
		{emit("POS YAW FIX " + y, y + " deg Heading");}
	|	^(DIRECTION RELATIVE LEFT y=convertAngle)
		{emit("POS YAW REL " + -y, -y + " deg Yaw");}
	|	^(DIRECTION RELATIVE RIGHT y=convertAngle)
		{emit("POS YAW REL " + y, y + " deg Yaw");}
	|	^(DIRECTION RELATIVE STRAIGHT)
		{emit("POS YAW REL 0", "0 deg Yaw");}
	;

turnDirection
	:	^(DIRECTION TURN LEFT)
		{emit("DIR L", "Left Turn Direction");}
	|	^(DIRECTION TURN RIGHT)
		{emit("DIR R", "Right Turn Direction");}
	;

loiterDirection
	:	^(DIRECTION TURN CLOCKWISE)
		{emit("DIR CW", "Clockwise Loiter Direction");}
	|	^(DIRECTION TURN COUNTERCLOCKWISE)
		{emit("DIR CCW", "Counterclockwise Loiter Direction");}
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
  emit("POS   X FIX " + waypoint.getX(), waypoint.getName().toUpperCase() + " / " + mToft(Math.abs(waypoint.getX())) + waypoint.getEastWest() + " Distance");
  emit("POS   Y FIX " + waypoint.getY(), waypoint.getName().toUpperCase() + " / " + mToft(Math.abs(waypoint.getY())) + waypoint.getNorthSouth() + " Distance");
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
		{emit("POS   X FIX " + dst.east, mToft(Math.abs(dst.east)) + ew + " Distance");}
		{emit("POS   Y FIX " + dst.north, mToft(Math.abs(dst.north)) + ns + " Distance");}
	;

latitudeLongitude returns [double latitude, double longitude]
	:	x=latitude y=longitude
		{$latitude = x;}
		{$longitude = y;}
	;

latitude returns [double r]
	:	^(LATITUDE x=convertAngle NORTH)
		{r = x;}
	|	^(LATITUDE x=convertAngle SOUTH)
		{r = -x;}
	;

longitude returns [double r]
	:	^(LONGITUDE x=convertAngle EAST)
		{r = x;}
	|	^(LONGITUDE x=convertAngle WEST)
		{r = -x;}
	;

distanceCoordinate returns [double north, double east]
	:	x=distanceNorth y=distanceEast
		{$north = x;}
		{$east = y;}
	;

distanceNorth returns [double r]
	:	^(DISTANCE x=convertDistance NORTH)
		{r = x;}
	|	^(DISTANCE x=convertDistance SOUTH)
		{r = -x;}
	;

distanceEast returns [double r]
	:	^(DISTANCE x=convertDistance EAST)
		{r = x;}
	|	^(DISTANCE x=convertDistance WEST)
		{r = -x;}
	;

// UNIT CONVERSIONS

// Standard time unit is the second
convertTime returns [double r]
	:	x=numericValue y=convertTimeUnit
		{r = x * y;}
	;

// Standard time unit is the second
convertTimeUnit returns [double r]
	:	YEAR
		{r = 31557600d;}
	|	FORTNIGHT
		{r = 1209600d;}
	|	WEEK
		{r = 604800d;}
	|	DAY
		{r = 86400d;}
	|	HOUR
		{r = 3600d;}
	|	MINUTE
		{r = 60d;}
	|	SECOND
		{r = 1d;}
	|	MILLISECOND
		{r = 0.001d;}
	;

// Standard distance unit is the meter
convertDistance returns [double r]
	:	x=numericValue y=convertDistanceUnit
		{r = x * y;}
	;

// Standard distance unit is the meter
convertDistanceUnit returns [double r]
	:	KILOMETER
		{r = 1000d;}
	|	METER
		{r = 1d;}
	|	CENTIMETER
		{r = 0.01d;}
	|	NAUTICAL MILE
		{r = 1852d;}
	|	MILE
		{r = 1609.344d;}
	|	FURLONG
		{r = 201.168d;}
	|	YARD
		{r = 0.9144d;}
	|	FOOT
		{r = 0.3048d;}
	|	INCH
		{r = 0.0254d;}
	;

// Standard flight level (distance) unit is the meter
convertFlightLevel returns [double r]
	:	FLIGHTLEVEL x=FlightLevel
		{String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");}
		{r = Double.parseDouble(y) * 100d * 0.3048d;}
	;

// Standard pressure unit is the pascal
convertPressure returns [double r]
	:	x=numericValue y=convertPressureUnit
		{r = x * y;}
	;

// Standard pressure unit is the pascal
convertPressureUnit returns [double r]
	:	KILOPASCAL
		{r = 1000d;}
	|	HECTOPASCAL
		{r = 100d;}
	|	PASCAL
		{r = 1d;}
	|	BAR
		{r = 100000d;}
	|	MILLIBAR
		{r = 100d;}
	|	ATMOSPHERE
		{r = 101325d;}
	;

// Standard speed unit is the meter/second
convertSpeed returns [double r]
	:	x=convertDistance y=convertTimeUnit
		{r = x / y;}
	;

// Standard angle unit is the degree
convertAngle returns [double r]
	:	x=numericValue DEGREE
		{r = x;}
	|	deg=integerValue DEGREE minNum=numericValue MINUTE
		{r = deg + minNum/60d;}
	|	deg=integerValue DEGREE minInt=integerValue MINUTE sec=numericValue SECOND
		{r = deg + minInt/60d + sec/3600d;}
	|	x=numericValue RADIAN
		{r = x * 180d / Math.PI;}
	;

// Standard angular rate unit is the degree/second
convertAngularRate returns [double r]
	:	x=convertAngle y=convertTimeUnit
		{r = x / y;}
	|	z=numericValue REVOLUTION y=convertTimeUnit
		{r = z / y * 360d;}
	;

// Standard heading unit is the degree
convertCardinalDirection returns [double r]
	:	NORTH
		{r = 0d;}
	|	EAST
		{r = 90d;}
	|	SOUTH
		{r = 180d;}
	|	WEST
		{r = 270d;}
	;

// Standard heading unit is the degree
convertOrdinalDirection returns [double r]
	:	NORTH EAST
		{r = 45d;}
	|	SOUTH EAST
		{r = 135d;}
	|	SOUTH WEST
		{r = 225d;}
	|	NORTH WEST
		{r = 315d;}
	;

// Standard heading unit is the degree
convertSubOrdinalDirection returns [double r]
	:	NORTH NORTH EAST
		{r = 22.5d;}
	|	EAST NORTH EAST
		{r = 67.5d;}
	|	EAST SOUTH EAST
		{r = 112.5d;}
	|	SOUTH SOUTH EAST
		{r = 157.5d;}
	|	SOUTH SOUTH WEST
		{r = 202.5d;}
	|	WEST SOUTH WEST
		{r = 247.5d;}
	|	WEST NORTH WEST
		{r = 292.5d;}
	|	NORTH NORTH WEST
		{r = 337.5d;}
	;

convertDirection[double r]
	:	(CLIMB|RIGHT|CLOCKWISE)
	|	(DESCEND|LEFT|COUNTERCLOCKWISE)
	;

// Standard numeric value unit is the double
numericValue returns [double r]
	:	x=integerValue
		{r = (double) x;}
	|	y=FloatingPointLiteral
		{r = Double.parseDouble(y.getText());}
	;

integerValue returns [int r]
	:	x=BinaryLiteral
		{r = Integer.parseInt(x.getText().substring(2),2);}
	|	x=OctalLiteral
		{r = Integer.parseInt(x.getText().substring(1),8);}
	|	x=DecimalLiteral
		{r = Integer.parseInt(x.getText());}
	|	x=HexLiteral
		{r = Integer.parseInt(x.getText().substring(2),16);}
	;

percentValue returns [double r]
	:	x=numericValue PERCENT
		{r = x;}
	;
