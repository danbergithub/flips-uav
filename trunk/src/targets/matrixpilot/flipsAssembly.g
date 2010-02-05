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
  import java.util.HashMap;
}

@members {
  HashMap<String,Integer> commands = new HashMap<String,Integer>();
  HashMap<String,Double[]> waypoints = new HashMap<String,Double[]>();
  public StringBuilder output = new StringBuilder();

  public void addCommand(String name, Integer value) {
    commands.put(name, value);
  }

  public Integer getCommand(String name) {
    if (commands.containsKey(name)) {
      return commands.get(name);
    }
    return null;
  }
  
  public void addWaypoint(String name, Double north, Double east, Double type) {
    Double[] coordinate = new Double[3];
    coordinate[0] = north;
    coordinate[1] = east;
    coordinate[2] = type;
    waypoints.put(name, coordinate);
  }
    
  public Double[] getWaypoint(String name) {
    if (waypoints.containsKey(name)) {
      return waypoints.get(name);
    }
    return null;
  }

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

flightPlan
	:	^(FLIGHTPLAN define* command*);

// DEFINITIONS

define
	:	defineCommand
	|	defineWaypoint
	;

defineCommand
	:	^(DEFINE name=Identifier ^(COMMAND cmd=integerValue))
		{addCommand(name.getText(),cmd);}
	|	^(DEFINE name=Identifier ^(COMMAND cmd=integerValue PARAMETER par=integerValue))
		{addCommand(name.getText(),cmd);}
	;

defineWaypoint
	:	^(DEFINE name=Identifier ^(GEOCOORDINATE geo=latitudeLongitude))
		{addWaypoint(name.getText(),geo.latitude,geo.longitude,0d);}
	|	^(DEFINE name=Identifier ^(GEOCOORDINATE dst=distanceCoordinate))
		{addWaypoint(name.getText(),dst.north,dst.east,1d);}
	;

// COMMANDS

command
	:	flyCommand
	|	executeCommand
	;

// COMMAND EXPRESSIONS

flyCommand
	:	^(FLY flyCommandValue*)
		{emit("FLY", "Execute");}
	;

flyCommandValue
	:	distance
	|	waypoint
	|	altitude
	;

executeCommand
	:	^(EXECUTE x=Identifier executeCommandParameter*)
	{
Integer value = getCommand(x.getText());
if (value != null) {
  String runValue = value.toString();
  emit("CMD " + runValue, x.getText().toUpperCase() + " / Command #" + runValue);
}
else {
  emit("\$INCLUDE " + x.getText() + ".uav", "Include Source File '" + x.getText() + ".uav'");
}
	}
	;

executeCommandParameter
	:	^(PARAMETER x=numericValue)
		{emit("CMD PAR " + x, x + " Command Parameter");}
	;

// ALTITUDE EXPRESSIONS

altitude
	:	^(ALTITUDE FIXED DISTANCE x=convertDistance)
		{emit("POS   Z FIX " + -x, mToft(x) + "Altitude");}
	|	^(ALTITUDE FIXED x=convertFlightLevel)
		{emit("POS   Z FIX " + -x, mToft(x) + "Altitude");}
	|	^(ALTITUDE RELATIVE CLIMB DISTANCE x=convertDistance)
		{emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");}
	|	^(ALTITUDE RELATIVE DESCEND DISTANCE x=convertDistance)
		{emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");}
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

// WAYPOINT EXPRESSIONS

waypoint
	:	geoCoordinate
	|	^(WAYPOINT x=Identifier)
	{
Double[] coordinate = getWaypoint(x.getText());
if (coordinate != null) {
  String ns = coordinate[0] >= 0 ? "N" : "S";
  String ew = coordinate[1] >= 0 ? "E" : "W";
  if (coordinate[2] == 0) {
    emit("POS   X GEO " + coordinate[1], x.getText().toUpperCase() + " / " + Math.abs(coordinate[1]) + " " + ew + " Longitude");
    emit("POS   Y GEO " + coordinate[0], x.getText().toUpperCase() + " / " + Math.abs(coordinate[0]) + " " + ns + " Latitude");
  }
  if (coordinate[2] == 1) {
    emit("POS   X FIX " + coordinate[1], x.getText().toUpperCase() + " / " + mToft(Math.abs(coordinate[1])) + ew + " Distance");
    emit("POS   Y FIX " + coordinate[0], x.getText().toUpperCase() + " / " + mToft(Math.abs(coordinate[0])) + ns + " Distance");  
  }
}
else {
  emit("POS   X FIX " + x.getText(), x.getText().toUpperCase() + " Waypoint");
  emit("POS   Y FIX " + x.getText(), x.getText().toUpperCase() + " Waypoint");
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

// Standard distance unit is the meter
convertDistance returns [double r]
	:	x=numericValue KILOMETER
		{r = x * 1000d;}
	|	x=numericValue METER
		{r = x;}
	|	x=numericValue NAUTICAL MILE
		{r = x * 1852d;}
	|	x=numericValue MILE
		{r = x * 1609.344d;}
	|	x=numericValue YARD
		{r = x * 0.9144d;}
	|	x=numericValue FOOT
		{r = x * 0.3048d;}
	;

// Standard flight level (distance) unit is the meter
convertFlightLevel returns [double r]
	:	FLIGHTLEVEL x=FlightLevel
		{String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");}
		{r = Double.parseDouble(y) * 100d * 0.3048d;}
	;

// Standard angle unit is the degree
convertAngle returns [double r]
	:	x=numericValue DEGREE
		{r = x;}
	|	deg=integerValue DEGREE minNum=numericValue MINUTE
		{r = deg + minNum/60d;}
	|	x=numericValue RADIAN
		{r = x * 180d / Math.PI;}
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
