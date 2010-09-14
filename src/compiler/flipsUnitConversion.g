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

tree grammar flipsUnitConversion;

options {
  language = Java;
  tokenVocab = flips;
  ASTLabelType = CommonTree;
  output = AST;
  filter = true;
  backtrack = true;
}

topdown
	:	convertParameter
	|	convertTime
	|	convertDistance
	|	convertAltitude
	|	convertRelativeDistance
	|	convertRelativeAltitude
	|	convertFlightLevel
	|	convertPressure
	|	convertSpeed
	|	convertRelativeSpeed
	|	convertFixedThrottle
	|	convertRelativeThrottle
	|	convertAngle
	|	convertAngularRate
	|	convertDirection
	|	convertRelativeDirection
	;

// Command parameter
convertParameter returns [double r]
	:	^(PARAMETER x=numericValue)
		{$r = x.r;}
	->	^(PARAMETER FloatingPointLiteral[String.valueOf($r)])
	;

// UNIT CONVERSIONS

// Standard time unit is the second
convertTime returns [double r]
	:	^(TIME x=numericValuePositive y=convertTimeUnit)
		{$r = x.r * y.r;}
	->	^(TIME FloatingPointLiteral[String.valueOf($r)] SECOND)
	|	^(TIME ^(HOUR hr=integerValue) ^(MINUTE minn=numericValuePositive))
		{$r = hr.r * 3600d + minn.r * 60d;}
	->	^(TIME FloatingPointLiteral[String.valueOf($r)] SECOND)
	|	^(TIME ^(HOUR hr=integerValue) ^(SECOND s=numericValuePositive))
		{$r = hr.r * 3600d + s.r;}
	->	^(TIME FloatingPointLiteral[String.valueOf($r)] SECOND)
	|	^(TIME ^(HOUR hr=integerValue) ^(MINUTE min=integerValue) ^(SECOND s=numericValuePositive))
		{$r = hr.r * 3600d + min.r * 60d + s.r;}
	->	^(TIME FloatingPointLiteral[String.valueOf($r)] SECOND)
	|	^(TIME ^(MINUTE min=integerValue) ^(SECOND s=numericValuePositive))
		{$r = min.r * 60d + s.r;}
	->	^(TIME FloatingPointLiteral[String.valueOf($r)] SECOND)
	;

// Standard time unit is the second
convertTimeUnit returns [double r]
	:	YEAR
		{$r = 31557600d;}
	|	FORTNIGHT
		{$r = 1209600d;}
	|	WEEK
		{$r = 604800d;}
	|	DAY
		{$r = 86400d;}
	|	HOUR
		{$r = 3600d;}
	|	MINUTE
		{$r = 60d;}
	|	SECOND
		{$r = 1d;}
	|	MILLISECOND
		{$r = 0.001d;}
	;

// Standard distance unit is the meter
convertDistance returns [double r]
	:	^(DISTANCE x=numericValue y=convertDistanceUnit)
		{$r = x.r * y.r;}
	->	^(DISTANCE FloatingPointLiteral[String.valueOf($r)] METER)
	;

// Standard distance unit is the meter
convertDistanceUnit returns [double r]
	:	KILOMETER
		{$r = 1000d;}
	|	METER
		{$r = 1d;}
	|	CENTIMETER
		{$r = 0.01d;}
	|	NAUTICAL MILE
		{$r = 1852d;}
	|	MILE
		{$r = 1609.344d;}
	|	FURLONG
		{$r = 201.168d;}
	|	YARD
		{$r = 0.9144d;}
	|	FOOT
		{$r = 0.3048d;}
	|	INCH
		{$r = 0.0254d;}
	;

// Standard altitude unit is the meter (up is negative)
convertAltitude
	:	^(DISTANCE FIXED Z x=convertDistance)
	->	^(DISTANCE FIXED Z ^(DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER))
	;

// Standard distance unit is the meter
convertRelativeDistance
	:	^(DISTANCE RELATIVE X FORWARD x=convertDistance)
	->	^(DISTANCE RELATIVE X ^(DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER))
	|	^(DISTANCE RELATIVE X BACKWARD x=convertDistance)
	->	^(DISTANCE RELATIVE X ^(DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER))
	|	^(DISTANCE RELATIVE Y LEFT x=convertDistance)
	->	^(DISTANCE RELATIVE Y ^(DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER))
	|	^(DISTANCE RELATIVE Y RIGHT x=convertDistance)
	->	^(DISTANCE RELATIVE Y ^(DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER))
	;

// Standard altitude unit is the meter or pascal (up is negative)
convertRelativeAltitude
	:	^(DISTANCE RELATIVE Z CLIMB x=convertDistance)
	->	^(DISTANCE RELATIVE Z ^(DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER))
	|	^(DISTANCE RELATIVE Z DESCEND x=convertDistance)
	->	^(DISTANCE RELATIVE Z ^(DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER))
	|	^(DISTANCE RELATIVE Z CLIMB y=convertPressure)
	->	^(DISTANCE RELATIVE Z ^(PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL))
	|	^(DISTANCE RELATIVE Z DESCEND y=convertPressure)
	->	^(DISTANCE RELATIVE Z ^(PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL))
	;

// Standard flight level (altitude) unit is the meter (up is negative)
convertFlightLevel returns [double r]
	:	^(FLIGHTLEVEL x=FlightLevel)
		{
		 String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");
		 $r = Double.parseDouble(y) * 100d * 0.3048d;
		}
	->	^(DISTANCE FloatingPointLiteral[String.valueOf(-$r)] METER)
	;

// Standard pressure unit is the pascal
convertPressure returns [double r]
	:	^(PRESSURE x=numericValue y=convertPressureUnit)
		{$r = x.r * y.r;}
	->	^(PRESSURE FloatingPointLiteral[String.valueOf($r)] PASCAL)
	;

// Standard pressure unit is the pascal
convertPressureUnit returns [double r]
	:	KILOPASCAL
		{$r = 1000d;}
	|	HECTOPASCAL
		{$r = 100d;}
	|	PASCAL
		{$r = 1d;}
	|	BAR
		{$r = 100000d;}
	|	MILLIBAR
		{$r = 100d;}
	|	ATMOSPHERE
		{$r = 101325d;}
	;

// Standard speed unit is the meter/second
convertSpeed returns [double r]
	:	^(SPEED x=numericValue y=convertDistanceUnit z=convertTimeUnit)
		{$r = x.r * y.r / z.r;}
	->	^(SPEED FloatingPointLiteral[String.valueOf($r)] METER SECOND)
	;

// Standard speed unit is the meter/second
convertRelativeSpeed
	:	^(SPEED RELATIVE FASTER x=convertSpeed)
	->	^(SPEED RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND))
	|	^(SPEED RELATIVE SLOWER x=convertSpeed)
	->	^(SPEED RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND))
	|	^(SPEED RELATIVE FASTER ^(SPEED y=percentValue))
	->	^(SPEED RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT))
	|	^(SPEED RELATIVE SLOWER ^(SPEED y=percentValue))
	->	^(SPEED RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT))
	;

// Standard throttle unit is the degree/second
convertFixedThrottle
	:	^(THROTTLE FIXED ^(SPEED x=percentValue))
	->	^(THROTTLE FIXED ^(SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT))
	;

// Standard throttle unit is the degree/second
convertRelativeThrottle
	:	^(THROTTLE RELATIVE FASTER ^(SPEED x=percentValue))
	->	^(THROTTLE RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT))
	|	^(THROTTLE RELATIVE SLOWER ^(SPEED x=percentValue))
	->	^(THROTTLE RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT))
	|	^(THROTTLE RELATIVE FASTER y=convertAngularRate)
	->	^(THROTTLE RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND))
	|	^(THROTTLE RELATIVE SLOWER y=convertAngularRate)
	->	^(THROTTLE RELATIVE ^(SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND))
	;

// Standard angle unit is the degree
convertAngle returns [double r]
	:	^(ANGLE x=numericValue DEGREE)
		{$r = x.r;}
	->	^(ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE)
	|	^(ANGLE x=numericValue RADIAN)
		{$r = x.r * 180d / Math.PI;}
	->	^(ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE)
	|	^(ANGLE POSITIVE deg=numericValuePositive DEGREE minNum=numericValuePositive MINUTE)
		{$r = deg.r + minNum.r/60d;}
	->	^(ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE)
	|	^(ANGLE POSITIVE deg=numericValuePositive DEGREE minInt=integerValue MINUTE sec=numericValuePositive SECOND)
		{$r = deg.r + minInt.r/60d + sec.r/3600d;}
	->	^(ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE)
	|	^(ANGLE NEGATIVE deg=numericValuePositive DEGREE minNum=numericValuePositive MINUTE)
		{$r = -deg.r - minNum.r/60d;}
	->	^(ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE)
	|	^(ANGLE NEGATIVE deg=numericValuePositive DEGREE minInt=integerValue MINUTE sec=numericValuePositive SECOND)
		{$r = -deg.r - minInt.r/60d - sec.r/3600d;}
	->	^(ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE)
	|	STRAIGHT
		{$r = 0d;}
	->	^(ANGLE FloatingPointLiteral["0"] DEGREE)
	|	LEVEL
		{$r = 0d;}
	->	^(ANGLE FloatingPointLiteral["0"] DEGREE)
	;

// Standard angular rate unit is the degree/second
convertAngularRate returns [double r]
	:	^(SPEED x=convertAngle y=convertTimeUnit)
		{$r = x.r / y.r;}
	->	^(SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND)
	|	^(SPEED z=numericValue REVOLUTION y=convertTimeUnit)
		{$r = z.r / y.r * 360d;}
	->	^(SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND)
	;

// Standard heading unit is the degree
convertDirection
	:	^(DIRECTION convertCardinalDirection)
	->	convertCardinalDirection
	|	^(DIRECTION convertOrdinalDirection)
	->	convertOrdinalDirection
	|	^(DIRECTION convertSubOrdinalDirection)
	->	convertSubOrdinalDirection
	;

// Standard heading unit is the degree
convertRelativeDirection
	:	^(DIRECTION RELATIVE LEFT x=convertAngle)
	->	^(DIRECTION RELATIVE ^(ANGLE FloatingPointLiteral[String.valueOf(-x.r)] DEGREE))
	|	^(DIRECTION RELATIVE RIGHT x=convertAngle)
	->	^(DIRECTION RELATIVE ^(ANGLE FloatingPointLiteral[String.valueOf(x.r)] DEGREE))
	;

// Standard heading unit is the degree
convertCardinalDirection
	:	NORTH
	->	^(ANGLE FloatingPointLiteral["0"] DEGREE)
	|	EAST
	->	^(ANGLE FloatingPointLiteral["90"] DEGREE)
	|	SOUTH
	->	^(ANGLE FloatingPointLiteral["180"] DEGREE)
	|	WEST
	->	^(ANGLE FloatingPointLiteral["270"] DEGREE)
	;

// Standard heading unit is the degree
convertOrdinalDirection
	:	NORTH EAST
	->	^(ANGLE FloatingPointLiteral["45"] DEGREE)
	|	SOUTH EAST
	->	^(ANGLE FloatingPointLiteral["135"] DEGREE)
	|	SOUTH WEST
	->	^(ANGLE FloatingPointLiteral["225"] DEGREE)
	|	NORTH WEST
	->	^(ANGLE FloatingPointLiteral["315"] DEGREE)
	;

// Standard heading unit is the degree
convertSubOrdinalDirection
	:	NORTH NORTH EAST
	->	^(ANGLE FloatingPointLiteral["22.5"] DEGREE)
	|	EAST NORTH EAST
	->	^(ANGLE FloatingPointLiteral["67.5"] DEGREE)
	|	EAST SOUTH EAST
	->	^(ANGLE FloatingPointLiteral["112.5"] DEGREE)
	|	SOUTH SOUTH EAST
	->	^(ANGLE FloatingPointLiteral["157.5"] DEGREE)
	|	SOUTH SOUTH WEST
	->	^(ANGLE FloatingPointLiteral["202.5"] DEGREE)
	|	WEST SOUTH WEST
	->	^(ANGLE FloatingPointLiteral["247.5"] DEGREE)
	|	WEST NORTH WEST
	->	^(ANGLE FloatingPointLiteral["292.5"] DEGREE)
	|	NORTH NORTH WEST
	->	^(ANGLE FloatingPointLiteral["337.5"] DEGREE)
	;

// Standard numeric value unit is the double
percentValue returns [double r]
	:	x=numericValue PERCENT
		{$r = x.r;}
	;

// Standard numeric value unit is the double
numericValue returns [double r]
	:	POSITIVE x=integerValue
		{$r = (double) x.r;}
	|	NEGATIVE x=integerValue
		{$r = -(double) x.r;}
	|	POSITIVE y=FloatingPointLiteral
		{$r = Double.parseDouble(y.getText());}
	|	NEGATIVE y=FloatingPointLiteral
		{$r = -Double.parseDouble(y.getText());}
	;

// Standard numeric value unit is the double
numericValuePositive returns [double r]
	:	x=integerValue
		{$r = (double) x.r;}
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
