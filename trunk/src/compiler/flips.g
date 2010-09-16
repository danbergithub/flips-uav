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
  REQUIRE;
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
  PITCH;
  ROLL;
  YAW;
  STRAIGHT;
  LEVEL;
  ALTITUDE;
  SPEED;
  FASTER;
  SLOWER;
  THROTTLE;
  REVOLUTION;
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
  ANGLE;
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
  POSITIVE;
  NEGATIVE;
  FORWARD;
  BACKWARD;
  X;
  Y;
  Z;
  REPEAT;
  CONDITION;
  FOREVER;
}

flightPlan
	:	require* define* statement*
	->	^(FLIGHTPLAN require* define* statement*)
	;

// REQUIRES

require
	:	('req'|'require'|'requires') requireValue
	->	requireValue
	;

requireValue
	:	StringLiteral ((And|',' And?)? StringLiteral)*
	->	^(REQUIRE StringLiteral)+
	;

// DEFINITIONS

define
	:	defineFlightPlan
	|	defineCommand
	|	defineSensor
	|	defineWaypoint
	;

defineFlightPlan
	:	('fp'|'flightplan'|'flightplans') defineFlightPlanValue
	->	defineFlightPlanValue
	;

defineFlightPlanValue
	:	Identifier '=' fp=StringLiteral ((And|',' And?)? Identifier '=' fp=StringLiteral)*
	->	^(DEFINE Identifier ^(FLIGHTPLAN $fp))+
	;

defineCommand
	:	('cmd'|'command'|'commands') defineCommandValue
	->	defineCommandValue
	;

defineCommandValue
	:	Identifier '=' integerValuePositive ((And|',' And?)? Identifier '=' integerValuePositive)*
	->	^(DEFINE Identifier ^(COMMAND integerValuePositive))+
	|	Identifier '=' cmd=integerValuePositive '(' par=integerValuePositive ')' ((And|',' And?)? Identifier '=' cmd=integerValuePositive '(' par=integerValuePositive ')')*
	->	^(DEFINE Identifier ^(COMMAND $cmd PARAMETER $par))+
	;

defineSensor
	:	('sen'|'sensor'|'sensors') defineSensorValue
	->	defineSensorValue
	;

defineSensorValue
	:	Identifier '=' sen=integerValuePositive ((And|',' And?)? Identifier '=' sen=integerValuePositive)*
	->	^(DEFINE Identifier ^(SENSOR $sen))+
	;

defineWaypoint
	:	('wpt'|'waypoint'|'waypoints') defineWaypointValue
	->	defineWaypointValue
	;

defineWaypointValue
	:	Identifier '=' geoCoordinate ((And|',' And?)? Identifier '=' geoCoordinate)*
	->	^(DEFINE Identifier geoCoordinate)+
	;

// STATEMENTS

statement
	:	command
	|	repeat
//	|	'wait' condition
	;

repeat
	:	('rpt'|'repeat') statement* 'end'
	->	^(REPEAT ^(CONDITION FOREVER) ^(EXECUTE statement*))
	|	('rpt'|'repeat') repeatCondition statement* 'end'
	->	^(REPEAT ^(CONDITION repeatCondition) ^(EXECUTE statement*))
	;

repeatCondition
	:	integerValuePositive ('x'|'time'|'times')?
	->	integerValuePositive
	|	For relativeTime
	->	^(TIME RELATIVE relativeTime)
	|	'forever'
	->	FOREVER
//	|	condition
	;
/*
condition
	:	'until' conditionValue
	|	'while' conditionValue
	;

conditionValue
	:	('the'? ('tim'|'time') ('='|'is'))? timeValue
	|	('the'? ('dir'|'direction') ('='|'is'))? fixedDirection
	|	('the'? ('spd'|'speed') ('='|'is'))? speedValue
	|	('the'? ('dst'|'distance') ('='|'is')) distanceValue
	|	('the'? ('pit'|'pitch') ('='|'is')) angularValue
	|	('the'? ('rol'|'roll') ('='|'is')) angularValue
	|	('the'? ('wpt'|'waypoint') ('='|'is'))? waypoint
	|	('the'? ('alt'|'altitude') ('='|'is'))? (distanceValue|flightLevelValue|pressureValue)
	|	('the'? ('pre'|'pressure') ('='|'is'))? pressureValue
	|	Identifier ('='|'is')? numericValue
	;
*/

// COMMANDS

command
	:	flyCommand
	|	turnCommand
	|	loiterCommand
	|	executeCommand
	;

flyCommand
	:	('fly'|'go') (flyCommandValue|(And|',' And?) flyCommandValue)*
	->	^(FLY flyCommandValue*)
	;

flyCommandValue
	:	time
	|	direction
	|	speed
	|	throttle
	|	distance
	|	pitch
	|	roll
	|	To waypoint ((And|',' And?) waypoint)*
	->	waypoint+
	|	altitude
	;

turnCommand
	:	('trn'|'turn') turnCommandValue*
	->	^(FLY turnCommandValue*)
	;

turnCommandValue
	:	direction
	;

loiterCommand
	:	('ltr'|'loiter') (loiterCommandValue|(And|',' And?) loiterCommandValue)*
	->	^(LOITER loiterCommandValue*)
	;

loiterCommandValue
	:	time
	|	speed
	|	throttle
	|	loiterDirection
	|	radius
	|	At waypoint
	->	waypoint
	|	altitude
	;

executeCommand
	:	Identifier
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

attitude
	:	pitch
	|	roll
	|	yaw
	;

pitch
	:	('pit'|'pitch') To angularValueWithRate
	->	^(PITCH FIXED angularValueWithRate)
	|	('pit'|'pitch') angularValueWithRate
	->	^(PITCH RELATIVE angularValueWithRate)
	|	(With 'an')? ('aoa'|'angle of attack') 'of'? angularValueWithRate
	->	^(PITCH FIXED angularValueWithRate)
	;

roll
	:	('rol'|'roll') To angularValueWithRate
	->	^(ROLL FIXED angularValueWithRate)
	|	('rol'|'roll') angularValueWithRate
	->	^(ROLL RELATIVE angularValueWithRate)
	|	('lvl'|'level')
	->	^(ROLL LEVEL)
	;

yaw
	:	direction
	|	direction At angularRateValue
	->	direction angularRateValue
	|	At? angularRateValue To direction
	->	direction angularRateValue
	;

// ALTITUDE EXPRESSIONS

altitude
	:	fixedAltitude
	->	^(DISTANCE FIXED Z fixedAltitude)
	|	relativeAltitude
	->	^(DISTANCE RELATIVE Z relativeAltitude)
	;

fixedAltitude
	:	(upDownDirection? To|At|With) ('an'? ('alt'|'altitude') 'of'?)? distanceValue
	->	distanceValue
	|	(upDownDirection? To|At|With) ('an'? ('alt'|'altitude') 'of'?)? flightLevelValue
	->	flightLevelValue
	|	(upDownDirection? To|At|With) (('an'? ('alt'|'altitude')|'a'? ('pres'|'pressure')) 'of'?)? pressureValue
	->	pressureValue
	;

relativeAltitude
	:	upDownDirection distanceValue
	|	upDownDirection pressureValue
	;

pressureValue
	:	numericValue pressureUnit
	->	^(PRESSURE numericValue pressureUnit)
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

flightLevelValue
	:	FlightLevel
	->	^(FLIGHTLEVEL FlightLevel)
	;

// DISTANCE EXPRESSIONS

radius
	:	('in'|With)? 'a'? ('radius' 'of'? distanceValue|distanceValue 'radius')
	->	^(RADIUS distanceValue)
	;

distance
	:	forwardBackwardDirection? distanceValue
	->	^(DISTANCE RELATIVE X forwardBackwardDirection? distanceValue)
	|	leftRightDirection distanceValue
	->	^(DISTANCE RELATIVE Y leftRightDirection distanceValue)
	;

distanceValue
	:	numericValue distanceUnit
	->	^(DISTANCE numericValue distanceUnit)
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
	;

fixedSpeed
	:	At? speedValue
	->	^(SPEED FIXED speedValue)
	;

relativeSpeed
	:	speedValue fasterSlowerSpeed
	->	^(SPEED RELATIVE fasterSlowerSpeed speedValue)
	|	percentValue fasterSlowerSpeed
	->	^(SPEED RELATIVE fasterSlowerSpeed ^(SPEED percentValue))
	;

fasterSlowerSpeed
	:	'faster'
	->	FASTER
	|	'slower'
	->	SLOWER
	;

speedValue
	:	numericValue speedUnit
	->	^(SPEED numericValue speedUnit)
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
	|	distanceUnit Per timeUnit
	->	distanceUnit timeUnit
	;

// THROTTLE EXPRESSIONS

throttle
	:	fixedThrottle
	|	relativeThrottle
	;

fixedThrottle
	:	At? throttleValue ('pwr'|'power'|'thr'|'throttle')
	->	^(THROTTLE FIXED throttleValue)
	;

relativeThrottle
	:	throttleValue fasterSlowerSpeed ('pwr'|'power'|'thr'|'throttle')
	->	^(THROTTLE RELATIVE fasterSlowerSpeed throttleValue)
	;

throttleValue
	:	percentValue
	->	^(SPEED percentValue)
	|	angularRateValue
	;

// TIME EXPRESSIONS

time
	:	At fixedTime
	->	^(TIME FIXED fixedTime)
	|	For relativeTime
	->	^(TIME RELATIVE relativeTime)
	;

fixedTime
	:	timeFormat ('am'|'a.m.')
	->	^(TIME timeFormat AM)
	|	hr=integerValuePositive ('am'|'a.m.')
	->	^(TIME ^(HOUR $hr) AM)
	|	timeFormat ('pm'|'p.m.')
	->	^(TIME timeFormat PM)
	|	hr=integerValuePositive ('pm'|'p.m.')
	->	^(TIME ^(HOUR $hr) PM)
	|	timeFormat
	->	^(TIME timeFormat HOUR24)
	;

relativeTime
	:	numericValuePositive timeUnit
	->	^(TIME numericValuePositive timeUnit)
	|	hr=integerValuePositive hour minn=numericValuePositive minute
	->	^(TIME ^(HOUR $hr) ^(MINUTE $minn))
	|	hr=integerValuePositive hour s=numericValuePositive second
	->	^(TIME ^(HOUR $hr) ^(SECOND $s))
	|	hr=integerValuePositive hour min=integerValuePositive minute s=numericValuePositive second
	->	^(TIME ^(HOUR $hr) ^(MINUTE $min) ^(SECOND $s))
	|	min=integerValuePositive minute s=numericValuePositive second
	->	^(TIME ^(MINUTE $min) ^(SECOND $s))
	|	timeFormat
	->	^(TIME timeFormat)
	;

timeFormat
	:	hr=integerValuePositive ':' min=integerValuePositive
	->	^(HOUR $hr) ^(MINUTE $min)
	|	hr=integerValuePositive ':' min=integerValuePositive ':' s=numericValuePositive
	->	^(HOUR $hr) ^(MINUTE $min) ^(SECOND $s)
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

// DIRECTION EXPRESSIONS

direction
	:	fixedDirection
	->	^(DIRECTION FIXED fixedDirection)
	|	leftRightDirection To fixedDirection
	->	^(DIRECTION FIXED ^(TURN leftRightDirection) fixedDirection)
	|	clockDirection To fixedDirection
	->	^(DIRECTION FIXED ^(TURN clockDirection) fixedDirection)
	|	relativeDirection
	->	^(DIRECTION RELATIVE relativeDirection)
	;

fixedDirection
	:	cardinalDirection
	->	^(DIRECTION cardinalDirection)
	|	ordinalDirection
	->	^(DIRECTION ordinalDirection)
	|	subOrdinalDirection
	->	^(DIRECTION subOrdinalDirection)
	|	(Turning|Heading) fixedDirectionTurn
	->	fixedDirectionTurn
	;

fixedDirectionTurn
	:	cardinalDirection
	->	^(DIRECTION cardinalDirection)
	|	ordinalDirection
	->	^(DIRECTION ordinalDirection)
	|	subOrdinalDirection
	->	^(DIRECTION subOrdinalDirection)
	|	angularValue
	;

relativeDirection
	:	(Turning|Heading)? leftRightDirection angularValue
	->	leftRightDirection angularValue
	|	('str'|'straight')
	->	STRAIGHT
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
	:	Turning? clockDirection
	->	^(TURN clockDirection)
	;

upDownDirection
	:	('u'|'up'|'c'|'climb'|'climbing'|'ascend'|'ascending')
	->	CLIMB
	|	('d'|'down'|'descend'|'descending')
	->	DESCEND
	;

forwardBackwardDirection
	:	('f'|'fwd'|'forward')
	->	FORWARD
	|	('b'|'bwd'|'backward'|'back')
	->	BACKWARD
	;

leftRightDirection
	:	('l'|'left'|'port')
	->	LEFT
	|	('r'|'right'|'starboard')
	->	RIGHT
	;

clockDirection
	:	('cw'|'clockwise')
	->	RIGHT
	|	('ccw'|'counterclockwise')
	->	LEFT
	;

// ANGULAR EXPRESSIONS

angularValueWithRate
	:	angularValue
	|	angularValue At angularRateValue
	->	angularValue angularRateValue
	|	At? angularRateValue
	->	angularRateValue
	|	At? angularRateValue To angularValue
	->	angularValue angularRateValue
	;

angularRateValue
	:	numericValue angularRateUnit
	->	^(SPEED numericValue angularRateUnit)
	|	angularValue Per timeUnit
	->	^(SPEED angularValue timeUnit)
	;

angularRateUnit
	:	'rpm'
	->	REVOLUTION MINUTE
	|	('hz'|'hertz')
	->	REVOLUTION SECOND
	|	('rev'|'revs'|'revolution'|'revolutions') Per timeUnit
	->	REVOLUTION timeUnit
	;

angularValue
	:	numericValue angularUnit
	->	^(ANGLE numericValue angularUnit)
	|	integerValue 'd' numericValuePositive '\''
	->	^(ANGLE integerValue DEGREE numericValuePositive MINUTE)
	;

angularUnit
	:	('deg'|'degs'|'degree'|'degrees')
	->	DEGREE
	|	('rad'|'rads'|'radian'|'radians')
	->	RADIAN
	;

// WAYPOINT EXPRESSIONS

waypoint
	:	geoCoordinate
	|	Identifier
	->	^(WAYPOINT Identifier)
	;

geoCoordinate
	:	latitudeLongitude
	->	^(GEOCOORDINATE latitudeLongitude)
	|	distanceCoordinate
	->	^(GEOCOORDINATE distanceCoordinate)
	;

latitudeLongitude
	:	y1=angularValue ','? x1=angularValue
	->	^(X $x1) ^(Y $y1)
	|	y2=numericValue ','? x2=numericValue
	->	^(X ^(ANGLE $x2 DEGREE)) ^(Y ^(ANGLE $y2 DEGREE))
	|	y3=latitude ','? x3=longitude
	->	^(X $x3) ^(Y $y3)
	;

latitude
	:	x=numericValuePositive ns=latitudeNorthSouth
	->	^(ANGLE $ns $x DEGREE)
	|	x=numericValuePositive xu=angularUnit ns=latitudeNorthSouth
	->	^(ANGLE $ns $x $xu)
	|	deg=integerValuePositive 'd' min=numericValuePositive '\'' ns=latitudeNorthSouth
	->	^(ANGLE $ns $deg DEGREE $min MINUTE)
	;

latitudeNorthSouth
	:	('n'|'north')
	->	POSITIVE
	|	('s'|'south')
	->	NEGATIVE
	;

longitude
	:	x=numericValuePositive ew=longitudeEastWest
	->	^(ANGLE $ew $x DEGREE)
	|	x=numericValuePositive xu=angularUnit ew=longitudeEastWest
	->	^(ANGLE $ew $x $xu)
	|	deg=integerValuePositive 'd' min=numericValuePositive '\'' ew=longitudeEastWest
	->	^(ANGLE $ew $deg DEGREE $min MINUTE)
	;

longitudeEastWest
	:	('e'|'east')
	->	POSITIVE
	|	('w'|'west')
	->	NEGATIVE
	;

distanceCoordinate
	:	'(' x=distanceValue ',' y=distanceValue ')'
	->	^(X $x) ^(Y $y)
	;

// PERCENT EXPRESSIONS

percentValue
	:	numericValue ('%'|'percent')
	->	numericValue PERCENT
	;

// NUMERIC EXPRESSIONS

numericValue
	:	'+'? integerValuePositive
	->	POSITIVE integerValuePositive
	|	'+'? FloatingPointLiteral
	->	POSITIVE FloatingPointLiteral
	|	'-' integerValuePositive
	->	NEGATIVE integerValuePositive
	|	'-' FloatingPointLiteral
	->	NEGATIVE FloatingPointLiteral
	;

numericValuePositive
	:	integerValuePositive
	|	FloatingPointLiteral
	;

integerValue
	:	'+'? integerValuePositive
	->	POSITIVE integerValuePositive
	|	'-' integerValuePositive
	->	NEGATIVE integerValuePositive
	;

integerValuePositive
	:	BinaryLiteral
	|	OctalLiteral
	|	DecimalLiteral
	|	HexLiteral
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

And	:	'&'|'and';

To	:	'to';

At	:	'@'|'at';

For	:	'for';

Per	:	'/'|'per';

With	:	'w/'|'with';

Turning	:	'trn'|'turning';

Heading	:	'hdg'|'heading';

FlightLevel
	:	('fl'|'flight level') ' '? Digit (Digit|Digit Digit)?;

PlusOrMinus
	:	'+/-';

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
