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
  TAKEOFF;
  FLY;
  LOITER;
  LAND;
  ACTION;
  DIRECTION;
  TURN;
  FIXED;
  RELATIVE;
  ROLL;
  PITCH;
  ALTITUDE;
  SPEED;
  OPTIMAL;
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
  HOUR;
  MINUTE;
  SECOND;
  DEGREE;
  RADIAN;
  DISTANCE;
  KILOMETER;
  METER;
  NAUTICAL;
  MILE;
  YARD;
  FOOT;
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
  MINIMUM;
  MAXIMUM;
  CRUISE;
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
	:	defineCommands flightCommands
	->      ^(FLIGHTPLAN defineCommands? flightCommands?)
	;

defineCommands
	:	(defineWaypointCommand|defineActionCommand)*
	->	defineWaypointCommand* defineActionCommand*
	;

defineWaypointCommand
	:	Define Waypoint defineWaypointParameters
	->	defineWaypointParameters
	;

defineWaypointParameters
	:	Identifier '=' geoCoordinate (('and'|',')* Identifier '=' geoCoordinate)*
	->	^(DEFINE Identifier geoCoordinate)+
	;

defineActionCommand
	:	Define Action defineActionParameters
	->	defineActionParameters
	;

defineActionParameters
	:	Identifier '=' integerValue (('and'|',')* Identifier '=' integerValue)*
	->	^(DEFINE Identifier ^(ACTION integerValue))+
	;

flightCommands
	:	(preFlightCommand conjunction*)* (inFlightCommand conjunction*)* (postFlightCommand conjunction*)*;

preFlightCommand
	:	takeoffCommand;

inFlightCommand
	:	flyCommand
	|	turnCommand
	|       loiterCommand
	|	actionCommand
	;

postFlightCommand
	:	landCommand;

conjunction
	:	('then'|'next'|'and'|'finally'|'continue'|'while'|'before'|','|'.')
	->      // No AST output.
	;

takeoffCommand
	:	('tof'|'takeoff') takeoffParameters
	->      ^(TAKEOFF takeoffParameters)
	;

takeoffParameters
	:	(time|speedCommand|altitudeCommand)*
	->      time* speedCommand* altitudeCommand*
	;

flyCommand
        :	('fly'|'flying'|'go'|'going'|'rtn'|'return'|'returning') flyParameters
        ->      ^(FLY flyParameters)
	;

flyParameters
	:	(time|direction|speedCommand|distance|pitchCommand|rollCommand|duration|waypoint|altitudeCommand)*
	->      time* direction* speedCommand* distance* pitchCommand* rollCommand* duration* waypoint* altitudeCommand*
	;

turnCommand
	:	('tn'|'turn'|'hd'|'head') turnParameters
	->	^(FLY turnParameters)
	;

turnParameters
	:	direction
	->	direction*
	;

loiterCommand
	:	('ltr'|'loiter'|'loitering') loiterParameters
	->      ^(LOITER loiterParameters)
	;

loiterParameters
	:	(time|speedCommand|loiterDirection|radius|duration|waypoint|altitudeCommand)*
	->      time* speedCommand* loiterDirection* radius* duration* waypoint* altitudeCommand*
	;

landCommand
	:	('lnd'|'land'|'landing') landParameters
	->      ^(LAND landParameters)
	;

landParameters
	:	(time|speedCommand)*
	->      time* speedCommand*
	;

actionCommand
	:	Action actionParameters
	->	actionParameters
	;

actionParameters
	:	Identifier (('and'|',')* Identifier)*
	->	^(ACTION Identifier)+
	;

// ATTITUDE EXPRESSIONS

pitchCommand
	:	('pit'|'pitch'|'pitching') angularValue
	->      ^(PITCH angularValue)
	|	(With 'an')? ('aoa'|'angle of attack') 'of'? angularValue
	->	^(PITCH angularValue)
	;

rollCommand
	:	('rol'|'roll'|'rolling') angularValue
	->      ^(ROLL angularValue)
	;

// ALTITUDE EXPRESSIONS

altitudeCommand
	:	(fixedAltitude|relativeAltitude)
	->      ^(ALTITUDE fixedAltitude? relativeAltitude?)
	;

altitudeDirection
	:	('u'|'up'|'c'|'climb'|'climbing'|'ascend'|'ascending')
	->      CLIMB
	|       ('d'|'down'|'descend'|'descending')
	->      DESCEND
	;

fixedAltitude
	:	(altitudeDirection? 'to'|At|With) (('an'? ('alt'|'altitude')|'a'? ('pres'|'pressure')) 'of'?)? altitude
	->      FIXED altitude
	;

relativeAltitude
	:	altitudeDirection altitude
	->      RELATIVE altitudeDirection altitude
	;

altitude:	distanceValue
        ->      DISTANCE distanceValue
	|       pressureValue
	->      PRESSURE pressureValue
	|	FlightLevel
	->	FLIGHTLEVEL FlightLevel
	;

pressureValue:	numericValue pressureUnit;

pressureUnit
	:	('kpa'|'kilopascal'|'kilopascals')
	->      KILOPASCAL
	|       ('hpa'|'hectopascal'|'hectopascals')
	->      HECTOPASCAL
	|       ('pa'|'pascal'|'pascals')
	->      PASCAL
	|       ('bar'|'bars')
	->      BAR
	|       ('mbar'|'millibar'|'millibars')
	->      MILLIBAR
	|       ('atm'|'atms'|'atmosphere'|'atmospheres')
	->      ATMOSPHERE
	;

// DISTANCE EXPRESSIONS

radius	:	('in'|With)? 'a'? ('radius' 'of'? distanceValue|distanceValue 'radius')
	->      ^(RADIUS distanceValue)
	;

distance:	leftRightDirection? distanceValue
	->      ^(DISTANCE leftRightDirection? distanceValue)
	;

distanceValue
	:	numericValue distanceUnit
	;

distanceUnit
	:	('km'|'kilometer'|'kilometers')
	->      KILOMETER
	|       ('m'|'meter'|'meters')
	->      METER
	|	('nm'|'nautical' ('mi'|'mile'|'miles'))
	->	NAUTICAL MILE
	|       ('statute')? ('mi'|'mile'|'miles')
	->      MILE
	|       ('yd'|'yard'|'yards')
	->      YARD
	|       ('ft'|'foot'|'feet')
	->      FOOT
	;

// SPEED EXPRESSIONS

speedCommand
	:	(speed|optimalSpeed|throttleSpeed)
	->      ^(SPEED speed? optimalSpeed? throttleSpeed?)
	;

speed	:	At? numericValue speedUnit
        ->      FIXED numericValue speedUnit
        ;

speedUnit
	:	'kph'
	->      KILOMETER HOUR
	|       'mph'
	->      MILE HOUR
	|	('kn'|'kt'|'kts'|'knot'|'knots')
	->	NAUTICAL MILE HOUR
	|       distanceUnit ('/'|'per') timeUnit
	->      distanceUnit timeUnit
	;

optimalSpeed
	:	At? optimalUnit ('spd'|'speed')
	->      OPTIMAL optimalUnit
	;

optimalUnit
	:	('min'|'minimum')
	->      MINIMUM
	|       ('cru'|'cruise')
	->      CRUISE
	|       ('max'|'maximum')
	->      MAXIMUM
	;

throttleSpeed
	:	(At|With)? throttleValue ('pwr'|'power'|'throttle')
	->      THROTTLE throttleValue
	;

throttleValue
	:	('no'|'zero'|'half'|'full')
	|	percentValue
	;

// TIME EXPRESSIONS

time	:	At timeFormat ('am'|'a.m.')
	->	^(TIME timeFormat AM)
	|	At integerValue ('am'|'a.m.')
	->	^(TIME integerValue HOUR AM)
	|	At timeFormat ('pm'|'p.m.')
	->	^(TIME timeFormat PM)
	|	At integerValue ('pm'|'p.m.')
	->	^(TIME integerValue HOUR PM)
	|	At timeFormat
	->	^(TIME timeFormat HOUR24)
	;

timeFormat
	:	hr=integerValue ':' min=integerValue
	->	$hr HOUR $min MINUTE
	|	hr=integerValue ':' min=integerValue ':' s=numericValue
	->	$hr HOUR $min MINUTE $s SECOND
	;
	
timeUnit:	hour|minute|second;

hour	:	('h'|'hr'|'hrs'|'hour'|'hours')
        ->      HOUR
        ;

minute	:	('min'|'mins'|'minute'|'minutes')
        ->      MINUTE
        ;

second	:	('s'|'sec'|'secs'|'second'|'seconds')
        ->      SECOND
        ;

duration:	'for' durationValue
	->      ^(DURATION durationValue)
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
	:	fixedDirection
	->      ^(DIRECTION FIXED fixedDirection)
	|       relativeDirection
	->      ^(DIRECTION RELATIVE relativeDirection)
	;

fixedDirection
	:	cardinalDirection
	->      cardinalDirection
	|	ordinalDirection
	->	ordinalDirection
	|	subOrdinalDirection
	->	subOrdinalDirection
	|       (Turning|Heading) (cardinalDirection|ordinalDirection|subOrdinalDirection|angularValue)
	->      cardinalDirection? ordinalDirection? subOrdinalDirection? angularValue?
	;

relativeDirection
	:       (Turning|Heading) leftRightDirection angularValue
	->      leftRightDirection angularValue
	;

cardinalDirection
	:	northSouthDirection
	|	eastWestDirection
	;

northSouthDirection
	:	('n'|'north')
	->      NORTH
	|       ('s'|'south')
	->      SOUTH
	;

eastWestDirection
	:	('e'|'east')
	->     	EAST
	|       ('w'|'west')
	->      WEST
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
	->      ^(DIRECTION TURN clockDirection)
	;

leftRightDirection
	:	('l'|'left'|'port')
	->      LEFT
	|       ('r'|'right'|'starboard')
	->      RIGHT
	;

clockDirection
	:	('cw'|'clockwise')
	->      CLOCKWISE
	|       ('ccw'|'counterclockwise')
	->      COUNTERCLOCKWISE
	;

angularValue
	:	numericValue ('¡'|'deg'|'degs'|'degree'|'degrees')
	->	numericValue DEGREE
	|	integerValue ('¡'|'d')? numericValue '\''
	->	integerValue DEGREE numericValue MINUTE
	|	numericValue ('rad'|'rads'|'radian'|'radians')
	->	numericValue RADIAN
	;

// WAYPOINT EXPRESSIONS

waypoint:	('and'|',')* (At|'to')? ('the'? Waypoint)? waypointValue
	->      waypointValue+
	;

waypointValue
	:	geoCoordinate
        ->      geoCoordinate
        |	Identifier
        ->	^(WAYPOINT Identifier)
        ;

geoCoordinate
	:	latitudeLongitude
        ->      ^(GEOCOORDINATE latitudeLongitude)
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

// NUMERIC EXPRESSIONS

numericValue
	:	integerValue|FloatingPointLiteral;

integerValue
	:	BinaryLiteral|OctalLiteral|DecimalLiteral|HexLiteral;

percentValue
	:	numericValue ('%'|'percent')
	->	numericValue PERCENT
	;

// RELATIONAL OPERATOR EXPRESSIONS
/*
relationCommand
	:       'is'? relationalOp (time|distance|pressure|speed|optimalSpeed|throttleSpeed|cardinalDirection|angle);

// RELATIONAL OPERATOR TOKENS

relationalOp
	:	('=='|'eq')
        ->      EQ
        |	('!='|'ne')
        ->	NE
        |       ('<'|'lt')
        ->      LT
        |       ('>'|'gt')
        ->      GT
        |       ('<='|'le')
        ->      LE
        |       ('>='|'ge')
        ->      GE
        ;
*/

// LEXER

// COMMON TOKENS

At	:	'@'|'at';

With	:	'w/'|'with';

Define	:	'def'|'define';

Waypoint:	'wpt'|'waypoint'|'waypoints';

Action	:	'act'|'action';

Turning	:	'trn'|'turning';

Heading	:	'hdg'|'heading';

FlightLevel
	:	('fl'|'flight level') ' '? Digit (Digit|Digit Digit)?;

// STRING TOKENS

Identifier
	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

StringLiteral
	:  '"' (~('"'))* '"';

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
        |       '.' Digit+ Exponent?
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
