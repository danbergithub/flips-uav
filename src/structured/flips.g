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

grammar flips;

options {
  language = Java;
  ASTLabelType = CommonTree;
  output = AST;
}

tokens {
  FLIGHTPLAN;
  DEFINE;
  COMMAND;
  PARAMETER;
  SENSOR;
  FLY;
  LOITER;
  EXECUTE;
  DIRECTION;
  TURN;
  FIXED;
  RELATIVE;
  ROLL;
  PITCH;
  ALTITUDE;
  SPEED;
  FASTER;
  SLOWER;
  THROTTLE;
  TIME;
  AM;
  PM;
  HOUR24;
  DURATION;
  RADIUS;
  WAYPOINT;
  GEOCOORDINATE;
  LATITUDE;
  LONGITUDE;
  YEAR;
  FORTNIGHT;
  WEEK;
  DAY;
  HOUR;
  MINUTE;
  SECOND;
  MILLISECOND;
  DEGREE;
  RADIAN;
  DISTANCE;
  KILOMETER;
  METER;
  CENTIMETER;
  NAUTICAL;
  MILE;
  FURLONG;
  YARD;
  FOOT;
  INCH;
  LEFT;
  RIGHT;
  CLOCKWISE;
  COUNTERCLOCKWISE;
  PERCENT;
  FLIGHTLEVEL;
  PRESSURE;
  KILOPASCAL;
  HECTOPASCAL;
  PASCAL;
  BAR;
  MILLIBAR;
  ATMOSPHERE;
  CLIMB;
  DESCEND;
  NORTH;
  SOUTH;
  EAST;
  WEST;
  EQ;
  NE;
  LT;
  GT;
  LE;
  GE;
}

flightPlan
	:	define* statement*
	->	^(FLIGHTPLAN define* statement*)
	;

// DEFINITIONS

define
	:	Identifier '(' ')' '=' 'Command' '(' integerValue ')' ';'
	->	^(DEFINE Identifier ^(COMMAND integerValue))
	|	Identifier '(' ')' '=' 'Command' '(' cmd=integerValue ',' par=integerValue ')' ';'
	->	^(DEFINE Identifier ^(COMMAND $cmd PARAMETER $par))
	|	Identifier '=' 'Sensor' '(' integerValue ')' ';'
	->	^(DEFINE Identifier ^(SENSOR integerValue))
	|	Identifier '=' geoCoordinate ';'
	->	^(DEFINE Identifier geoCoordinate)
	;

// STATEMENTS

statement
	:	command
	;

// COMMANDS

command
	:	flyCommand ';'!
	|	loiterCommand ';'!
	|	executeCommand ';'!
	;

flyCommand
	:	(flyCommandValue ';')* 'Fly' '(' ')'
	->	^(FLY flyCommandValue*)
	|	(flyCommandValue ';')* 'FlyForTime' '(' durationValue ')'
	->	^(FLY flyCommandValue* ^(DURATION durationValue))
	|	(flyCommandValue ';')* 'FlyToDestination' '(' waypoint ')'
	->	^(FLY flyCommandValue* waypoint)
	;

flyCommandValue
	:	time
	|	direction
	|	speed
	|	distance
	|	pitch
	|	roll
	|	duration
	|	'SetDestination' '(' waypoint ')'
	->	waypoint
	|	altitude
	;

loiterCommand
	:	(loiterCommandValue ';')* 'Loiter' '(' ')'
	->	^(LOITER loiterCommandValue*)
	|	(loiterCommandValue ';')* 'LoiterForTime' '(' durationValue ')'
	->	^(LOITER loiterCommandValue* ^(DURATION durationValue))
	;

loiterCommandValue
	:	time
	|	speed
	|	loiterDirection
	|	radius
	|	duration
	|	'SetDestination' '(' waypoint ')'
	->	waypoint
	|	altitude
	;

executeCommand
	:	Identifier '(' ')'
	->	^(EXECUTE Identifier)
	|	Identifier '(' executeCommandParameter (',' executeCommandParameter)*  ')'
	->	^(EXECUTE Identifier executeCommandParameter+)
	;

executeCommandParameter
	:	numericValue
	->	^(PARAMETER numericValue)
	|	StringLiteral
	->	^(PARAMETER StringLiteral)
	;

// ATTITUDE EXPRESSIONS

pitch
	:	'SetPitch' '(' angularValue ')'
	->	^(PITCH angularValue)
	;

roll
	:	'SetRoll' '(' angularValue ')'
	->	^(ROLL angularValue)
	;

// ALTITUDE EXPRESSIONS

altitude
	:	fixedAltitude
	|	relativeAltitude
	;

fixedAltitude
	:	'SetAltitude' '(' altitudeValue ')'
	->	^(ALTITUDE FIXED altitudeValue)
	;

relativeAltitude
	:	'SetAltitudeRelative' '(' '+'? altitudeValue ')'
	->	^(ALTITUDE RELATIVE CLIMB altitudeValue)
	|	'SetAltitudeRelative' '(' '-' altitudeValue ')'
	->	^(ALTITUDE RELATIVE DESCEND altitudeValue)
	;

altitudeValue
	:	distanceValue
	->	DISTANCE distanceValue
	|	pressureValue
	->	PRESSURE pressureValue
	|	FlightLevel
	->	FLIGHTLEVEL FlightLevel
	;

pressureValue
	:	numericValue pressureUnit
	;

pressureUnit
	:	('kpa'|'kilopascal'|'kilopascals')
	->	KILOPASCAL
	|	('hpa'|'hectopascal'|'hectopascals')
	->	HECTOPASCAL
	|	('pa'|'pascal'|'pascals')
	->	PASCAL
	|	('bar'|'bars')
	->	BAR
	|	('mbar'|'millibar'|'millibars')
	->	MILLIBAR
	|	('atm'|'atms'|'atmosphere'|'atmospheres')
	->	ATMOSPHERE
	;

// DISTANCE EXPRESSIONS

radius
	:	'SetRadius' '(' distanceValue ')'
	->	^(RADIUS distanceValue)
	;

distance
	:	'SetDistance' '(' distanceValue ')'
	->	^(DISTANCE distanceValue)
	;

distanceValue
	:	numericValue distanceUnit
	;

distanceUnit
	:	('km'|'kilometer'|'kilometers')
	->	KILOMETER
	|	('m'|'meter'|'meters')
	->	METER
	|	('cm'|'centimeter'|'centimeters')
	->	CENTIMETER
	|	('nm'|'nautical' ('mi'|'mile'|'miles'))
	->	NAUTICAL MILE
	|	('statute')? ('mi'|'mile'|'miles')
	->	MILE
	|	('f'|'fur'|'furlong'|'furlongs')
	->	FURLONG
	|	('yd'|'yard'|'yards')
	->	YARD
	|	('ft'|'foot'|'feet')
	->	FOOT
	|	('in'|'inch'|'inches')
	->	INCH
	;

// SPEED EXPRESSIONS

speed
	:	fixedSpeed
	|	relativeSpeed
	|	throttleSpeed
	;

fixedSpeed
	:	'SetSpeed' '(' speedValue ')'
	->	^(SPEED FIXED speedValue)
	;

relativeSpeed
	:	'SetSpeedRelative' '(' '+'? speedValue ')'
	->	^(SPEED RELATIVE FASTER speedValue)
	|	'SetSpeedRelative' '(' '-' speedValue ')'
	->	^(SPEED RELATIVE SLOWER speedValue)
	|	'SetSpeedRelative' '(' '+'? percentValue ')'
	->	^(SPEED RELATIVE FASTER percentValue)
	|	'SetSpeedRelative' '(' '-' percentValue ')'
	->	^(SPEED RELATIVE SLOWER percentValue)
	;

speedValue
	:	numericValue speedUnit
	;

speedUnit
	:	'kph'
	->	KILOMETER HOUR
	|	'mph'
	->	MILE HOUR
	|	('kn'|'kt'|'kts'|'knot'|'knots')
	->	NAUTICAL MILE HOUR
	|	'fpf'
	->	FURLONG FORTNIGHT
	|	'fpm'
	->	FOOT MINUTE
	|	'fps'
	->	FOOT SECOND
	|	distanceUnit ('/'|'per') timeUnit
	->	distanceUnit timeUnit
	;

throttleSpeed
	:	'SetThrottle' '(' throttleValue ')'
	->	^(SPEED THROTTLE throttleValue)
	;

throttleValue
	:	percentValue
	;

// TIME EXPRESSIONS

time
	:	'SetTime' '(' timeValue ')'
	->	timeValue
	;

timeValue
	:	timeFormat ('am'|'a.m.')
	->	^(TIME timeFormat AM)
	|	integerValue ('am'|'a.m.')
	->	^(TIME integerValue HOUR AM)
	|	timeFormat ('pm'|'p.m.')
	->	^(TIME timeFormat PM)
	|	integerValue ('pm'|'p.m.')
	->	^(TIME integerValue HOUR PM)
	|	timeFormat
	->	^(TIME timeFormat HOUR24)
	;

timeFormat
	:	hr=integerValue ':' min=integerValue
	->	$hr HOUR $min MINUTE
	|	hr=integerValue ':' min=integerValue ':' s=numericValue
	->	$hr HOUR $min MINUTE $s SECOND
	;
	
timeUnit
	:	('y'|'yr'|'yrs'|'year'|'years')
	->	YEAR
	|	('f'|'fortnight'|'fortnights')
	->	FORTNIGHT
	|	('wk'|'wks'|'week'|'weeks')
	->	WEEK
	|	('d'|'day'|'days')
	->	DAY
	|	hour
	|	minute
	|	second
	|	('ms'|'millisecond'|'milliseconds')
	->	MILLISECOND
	;

hour
	:	('h'|'hr'|'hrs'|'hour'|'hours')
	->	HOUR
	;

minute
	:	('min'|'mins'|'minute'|'minutes')
	->	MINUTE
	;

second
	:	('s'|'sec'|'secs'|'second'|'seconds')
	->	SECOND
	;

duration
	:	'SetDuration' '(' durationValue ')'
	->	^(DURATION durationValue)
	;

durationValue
	:	numericValue timeUnit
	|	integerValue hour numericValue (minute|second)
	|	integerValue hour integerValue minute numericValue second
	|	integerValue minute numericValue second
	|	timeFormat
	;

// DIRECTION EXPRESSIONS

direction
	:	'SetBearing' '(' fixedDirection ')'
	->	^(DIRECTION FIXED fixedDirection)
	|	'SetBearingRelative' '(' relativeDirection ')'
	->	^(DIRECTION RELATIVE relativeDirection)
	;

fixedDirection
	:	cardinalDirection
	|	ordinalDirection
	|	subOrdinalDirection
	|	angularValue
	;

relativeDirection
	:	'+'? angularValue
	->	RIGHT angularValue
	|	'-' angularValue
	->	LEFT angularValue
	;

cardinalDirection
	:	northSouthDirection
	|	eastWestDirection
	;

northSouthDirection
	:	('n'|'north')
	->	NORTH
	|	('s'|'south')
	->	SOUTH
	;

eastWestDirection
	:	('e'|'east')
	->	EAST
	|	('w'|'west')
	->	WEST
	;

ordinalDirection
	:	('ne'|'northeast')
	->	NORTH EAST
	|	('se'|'southeast')
	->	SOUTH EAST
	|	('sw'|'southwest')
	->	SOUTH WEST
	|	('nw'|'northwest')
	->	NORTH WEST
	;

subOrdinalDirection
	:	('nne'|'north-northeast')
	->	NORTH NORTH EAST
	|	('ene'|'east-northeast')
	->	EAST NORTH EAST
	|	('ese'|'east-southeast')
	->	EAST SOUTH EAST
	|	('sse'|'south-southeast')
	->	SOUTH SOUTH EAST
	|	('ssw'|'south-southwest')
	->	SOUTH SOUTH WEST
	|	('wsw'|'west-southwest')
	->	WEST SOUTH WEST
	|	('wnw'|'west-northwest')
	->	WEST NORTH WEST
	|	('nnw'|'north-northwest')
	->	NORTH NORTH WEST
	;

loiterDirection
	:	'SetLoiterDirection' '(' clockDirection ')'
	->	^(DIRECTION TURN clockDirection)
	;

clockDirection
	:	('cw'|'clockwise')
	->	CLOCKWISE
	|	('ccw'|'counterclockwise')
	->	COUNTERCLOCKWISE
	;

angularValue
	:	numericValue ('deg'|'degs'|'degree'|'degrees')
	->	numericValue DEGREE
	|	integerValue 'd' numericValue '\''
	->	integerValue DEGREE numericValue MINUTE
	|	numericValue ('rad'|'rads'|'radian'|'radians')
	->	numericValue RADIAN
	;

// WAYPOINT EXPRESSIONS

waypoint
	:	geoCoordinate
	|	Identifier
	->	^(WAYPOINT Identifier)
	;

geoCoordinate
	:	'LocationAbsolute' '(' latitudeLongitude ')'
	->	^(GEOCOORDINATE latitudeLongitude)
	|	'LocationRelative' distanceCoordinate
	->	^(GEOCOORDINATE distanceCoordinate)
	;

latitudeLongitude
	:	x=latitudeLongitudeValue northSouthDirection ','? y=latitudeLongitudeValue eastWestDirection
	->	^(LATITUDE $x northSouthDirection) ^(LONGITUDE $y eastWestDirection)
	|	'+'? x=latitudeLongitudeValue ','? '+'? y=latitudeLongitudeValue
	->	^(LATITUDE $x NORTH) ^(LONGITUDE $y EAST)
	|	'-' x=latitudeLongitudeValue ','? '+'? y=latitudeLongitudeValue
	->	^(LATITUDE $x SOUTH) ^(LONGITUDE $y EAST)
	|	'+'? x=latitudeLongitudeValue ','? '-' y=latitudeLongitudeValue
	->	^(LATITUDE $x NORTH) ^(LONGITUDE $y WEST)
	|	'-' x=latitudeLongitudeValue ','? '-' y=latitudeLongitudeValue
	->	^(LATITUDE $x SOUTH) ^(LONGITUDE $y WEST)
	;

latitudeLongitudeValue
	:	numericValue
	->	numericValue DEGREE
	|	angularValue
	;

distanceCoordinate
	:	'(' '+'? x=distanceValue ',' '+'? y=distanceValue ')'
	->	^(DISTANCE $y NORTH) ^(DISTANCE $x EAST)
	|	'(' '-' x=distanceValue ',' '+'? y=distanceValue ')'
	->	^(DISTANCE $y NORTH) ^(DISTANCE $x WEST)
	|	'(' '+'? x=distanceValue ',' '-' y=distanceValue ')'
	->	^(DISTANCE $y SOUTH) ^(DISTANCE $x EAST)
	|	'(' '-' x=distanceValue ',' '-' y=distanceValue ')'
	->	^(DISTANCE $y SOUTH) ^(DISTANCE $x WEST)
	;

// NUMERIC EXPRESSIONS

numericValue
	:	integerValue
	|	FloatingPointLiteral
	;

integerValue
	:	BinaryLiteral
	|	OctalLiteral
	|	DecimalLiteral
	|	HexLiteral
	;

percentValue
	:	numericValue ('%'|'percent')
	->	numericValue PERCENT
	;

// RELATIONAL OPERATOR EXPRESSIONS
/*
relationCommand
	:	'is'? relationalOp (time|distance|pressure|speed|optimalSpeed|throttleSpeed|cardinalDirection|angle);

// RELATIONAL OPERATOR TOKENS

relationalOp
	:	('=='|'eq')
	->	EQ
	|	('!='|'ne')
	->	NE
	|	('<'|'lt')
	->	LT
	|	('>'|'gt')
	->	GT
	|	('<='|'le')
	->	LE
	|	('>='|'ge')
	->	GE
	;
*/

// LEXER

// COMMON TOKENS

To	:	'to';

At	:	'@'|'at';

FlightLevel
	:	('fl'|'flight level') ' '? Digit (Digit|Digit Digit)?;

// STRING TOKENS

Identifier
	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

StringLiteral
	:	'"' (~('"'))* '"';

// NUMERIC TOKENS

fragment
Digit	:	'0'..'9';

fragment
NonZeroDigit
	:	'1'..'9';

fragment
BinaryDigit
	:	'0'|'1';

fragment
HexDigit:	Digit|'a'..'f'|'A'..'F';

BinaryLiteral
	:	'0' ('b'|'B') BinaryDigit+;

OctalLiteral
	:	'0' ('0'..'7')+;

DecimalLiteral
	:	'0'|NonZeroDigit Digit*;

HexLiteral
	:	'0' ('x'|'X') HexDigit+;

FloatingPointLiteral
	:	Digit+ '.' Digit* Exponent?
	|	'.' Digit+ Exponent?
	|	Digit+ Exponent
	;

fragment
Exponent:	('e'|'E') ('+'|'-')? Digit+ ;

// WHITESPACE TOKENS

WS	:	(' '|'\r'|'\t'|'\u000C'|'\n')+ {$channel = HIDDEN;};

// COMMENT TOKENS

Comment	:	'/*' ( options {greedy = FALSE;} : . )* '*/' {$channel = HIDDEN;};

LineComment
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel = HIDDEN;};
