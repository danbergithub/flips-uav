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
  HashMap<String,Double[]> waypoints = new HashMap<String,Double[]>();
  HashMap<String,Integer> actions = new HashMap<String,Integer>();
  public StringBuilder output = new StringBuilder();
  
  public void addWaypoint(String name, Double latitude, Double longitude) {
    Double[] coordinate = new Double[2];
    coordinate[0] = latitude;
    coordinate[1] = longitude;
    waypoints.put(name, coordinate);
  }
    
  public Double[] getWaypoint(String name) {
    if (waypoints.containsKey(name)) {
      return waypoints.get(name);
    }
    return null;
  }

  public void addAction(String name, Integer value) {
    actions.put(name, value);
  }

  public Integer getAction(String name) {
    if (actions.containsKey(name)) {
      return actions.get(name);
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
	:	^(FLIGHTPLAN set flight);

set	:	defineWaypoint* defineAction*;

defineWaypoint
	:	^(DEFINE name=Identifier geo=geoCoordinate)
		{addWaypoint(name.getText(),geo.latitude,geo.longitude);}
	;

defineAction
	:	^(DEFINE name=Identifier ^(ACTION x=integerValue))
		{addAction(name.getText(),x);}
	;

flight	:	preFlight* inFlight* postFlight*;

preFlight
	:	takeoff;

inFlight:	fly
        |       loiter
        |	action
        ;

postFlight
	:	land;

// COMMAND EXPRESSIONS

takeoff	:	^(TAKEOFF time? speed? altitude?)
                {emit("TOF", "Execute Takeoff");}
        ;

fly	:	^(FLY time? yaw? speed? distance? pitch? roll? duration? waypoint* altitude?)
                {emit("FLY", "Execute");}
        ;

loiter	:	^(LOITER time? speed? loiterDirection? radius? duration? waypoint* altitude?)
                {emit("LTR", "Execute Loiter");}
        ;

land	:	^(LAND time? speed?)
                {emit("LND", "Execute Landing");}
        ;

action	:	^(ACTION x=Identifier)
	{
Integer value = getAction(x.getText());
String runValue = x.getText();
if (value != null){
    runValue = value.toString();
}

emit("CMD " + runValue, x.getText().toUpperCase() + " / Command #" + runValue);
	}
	;

// CONTROL EXPRESSIONS

time	:	^(TIME x=convertTime (y=convertTime (z=convertTime)?)? AM)
		{x = (x == 43200d) ? 0d : x;}
		{emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");}
	|	^(TIME x=convertTime (y=convertTime (z=convertTime)?)? PM)
		{x = (x == 43200d) ? 0d : x;}
		{emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");}
	|	^(TIME x=convertTime (y=convertTime (z=convertTime)?)? HOUR24)
		{emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Time");}
	;

duration:	^(DURATION x=convertTime (y=convertTime (z=convertTime)?)?)
                {emit("TIM REL " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Duration");}
        ;

pitch	:	^(PITCH x=convertAngle)
                {emit("POS PIT FIX " + x, x + " deg Pitch");}
        ;

roll	:	^(ROLL x=convertAngle)
                {emit("POS ROL FIX " + x, x + " deg Roll");}
        ;

yaw
	:	^(DIRECTION FIXED x=convertCardinalDirection)
                {emit("POS YAW FIX " + x, x + " deg Heading");}
	|	^(DIRECTION FIXED x=convertOrdinalDirection)
                {emit("POS YAW FIX " + x, x + " deg Heading");}
	|	^(DIRECTION FIXED x=convertSubOrdinalDirection)
                {emit("POS YAW FIX " + x, x + " deg Heading");}
	|       ^(DIRECTION FIXED y=convertAngle)
                {emit("POS YAW FIX " + y, y + " deg Heading");}
	|       ^(DIRECTION RELATIVE LEFT y=convertAngle)
                {emit("POS YAW REL " + -y, -y + " deg Yaw");}
	|       ^(DIRECTION RELATIVE RIGHT y=convertAngle)
                {emit("POS YAW REL " + y, y + " deg Yaw");}
	;

altitude:	^(ALTITUDE FIXED DISTANCE x=convertDistance)
                {emit("POS   Z FIX " + -x, mToft(x) + "Altitude");}
        |       ^(ALTITUDE FIXED PRESSURE y=convertPressure)
                {emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");}
	|	^(ALTITUDE FIXED x=convertFlightLevel)
		{emit("POS   Z FIX " + -x, mToft(x) + "Altitude");}
        |       ^(ALTITUDE RELATIVE CLIMB DISTANCE x=convertDistance)
                {emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");}
        |       ^(ALTITUDE RELATIVE CLIMB PRESSURE y=convertPressure)
                {emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");}
        |       ^(ALTITUDE RELATIVE DESCEND DISTANCE x=convertDistance)
                {emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");}
        |       ^(ALTITUDE RELATIVE DESCEND PRESSURE y=convertPressure)
                {emit("POS PRE REL " + y, y + " kPa Relative Pressure Altitude");}
        ;

distance:	^(DISTANCE x=convertDistance)
                {emit("POS   X REL " + x, mToft(x) + "Relative Distance");}
        |       ^(DISTANCE LEFT x=convertDistance)
                {emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");}
        |       ^(DISTANCE RIGHT x=convertDistance)
                {emit("POS   Y REL " + x, mToft(x) + "Relative Right Distance");}
        ;

radius	:	^(RADIUS x=convertDistance)
                {emit("RAD " + x, mToft(x) + "Radius");}
        ;

speed	:	^(SPEED FIXED x=convertSpeed)
                {emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");}
        |       ^(SPEED OPTIMAL MINIMUM)
                {emit("SPD AIR OPT MIN", "Minimum Air Speed");}
        |       ^(SPEED OPTIMAL CRUISE)
                {emit("SPD AIR OPT CRU", "Cruise Air Speed");}
        |       ^(SPEED OPTIMAL MAXIMUM)
                {emit("SPD AIR OPT MAX", "Maximum Air Speed");}
        |       ^(SPEED THROTTLE y=convertThrottle)
        	{emit("ACT THR FIX " + y, y + "\% Throttle");}
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

waypoint:	geo=geoCoordinate
		{String ns = geo.latitude >= 0 ? "N" : "S";}
		{String ew = geo.longitude >= 0 ? "E" : "W";}
                {emit("POS   X FIX " + geo.longitude, Math.abs(geo.longitude) + " " + ew + " Longitude");}
                {emit("POS   Y FIX " + geo.latitude, Math.abs(geo.latitude) + " " + ns + " Latitude");}
	|	^(WAYPOINT x=Identifier)
	{
Double[] coordinate = getWaypoint(x.getText());
if (coordinate != null) {
  String ns = coordinate[0] >= 0 ? "N" : "S";
  String ew = coordinate[1] >= 0 ? "E" : "W";
  emit("POS   X FIX " + coordinate[1], x.getText().toUpperCase() + " / " + Math.abs(coordinate[1]) + " " + ew + " Longitude");
  emit("POS   Y FIX " + coordinate[0], x.getText().toUpperCase() + " / " + Math.abs(coordinate[0]) + " " + ns + " Latitude");
}
else {
  emit("POS   X FIX " + x.getText(), x.getText().toUpperCase() + " Waypoint");
  emit("POS   Y FIX " + x.getText(), x.getText().toUpperCase() + " Waypoint");
}
	}
        ;

geoCoordinate returns [double latitude, double longitude]
	:	^(GEOCOORDINATE x=latitude y=longitude)
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

// UNIT CONVERSIONS

// Standard time unit is the second
convertTime returns [double r]
	:	x=numericValue HOUR
	        {r = x * 3600d;}
	|       x=numericValue MINUTE
	        {r = x * 60d;}
	|       x=numericValue SECOND
	        {r = x;}
	;

// Standard distance unit is the meter
convertDistance returns [double r]
	:	x=numericValue KILOMETER
	        {r = x * 1000d;}
	|       x=numericValue METER
	        {r = x;}
	|	x=numericValue NAUTICAL MILE
		{r = x * 1852d;}
	|       x=numericValue MILE
	        {r = x * 1609.344d;}
	|       x=numericValue YARD
	        {r = x * 0.9144d;}
	|       x=numericValue FOOT
	        {r = x * 0.3048d;}
	;

// Standard flight level (distance) unit is the meter
convertFlightLevel returns [double r]
	:	FLIGHTLEVEL x=FlightLevel
		{String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");}
		{r = Double.parseDouble(y) * 100d * 0.3048d;}
	;

// Standard pressure unit is the pascal
convertPressure returns [double r]
	:	x=numericValue KILOPASCAL
	        {r = x * 1000d;}
	|	x=numericValue HECTOPASCAL
	        {r = x * 100d;}
	|	x=numericValue PASCAL
	        {r = x;}
	|	x=numericValue BAR
	        {r = x * 100000d;}
	|	x=numericValue MILLIBAR
	        {r = x * 100d;}
	|	x=numericValue ATMOSPHERE
	        {r = x * 101325d;}
	;

// Standard speed unit is the meter/second
convertSpeed returns [double r]
	:	x=convertDistance HOUR
	        {r = x / 3600d;}
	|       x=convertDistance MINUTE
	        {r = x / 60d;}
	|       x=convertDistance SECOND
	        {r = x;}
	;

// Standard throttle unit is the percent
convertThrottle returns [double r]
	:	('no'|'zero')
		{r = 0;}
	|	'half'
		{r = 50;}
	|	'full'
		{r = 100;}
	|	x=percentValue
		{r = x;}
	;

// Standard angle unit is the degree
convertAngle returns [double r]
	:	x=numericValue DEGREE
	        {r = x;}
	|	deg=integerValue DEGREE min=numericValue MINUTE
		{r = deg + min/60d;}
	|       x=numericValue RADIAN
	        {r = x * 180d / Math.PI;}
	;

// Standard heading unit is the degree
convertCardinalDirection returns [double r]
	:	NORTH
	        {r = 0d;}
	|       EAST
	        {r = 90d;}
	|       SOUTH
	        {r = 180d;}
	|       WEST
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
	|       (DESCEND|LEFT|COUNTERCLOCKWISE)
	;

// Standard numeric value unit is the double
numericValue returns [double r]
	:	x=integerValue
		{r = (double) x;}
	|       y=FloatingPointLiteral
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
