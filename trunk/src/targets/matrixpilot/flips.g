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
  FLY;
  EXECUTE;
  FIXED;
  RELATIVE;
  ALTITUDE;
  WAYPOINT;
  GEOCOORDINATE;
  LATITUDE;
  LONGITUDE;
  MINUTE;
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
}

flightPlan
	:	define* command*
	->	^(FLIGHTPLAN define* command*)
	;

// DEFINITIONS

define
	:	defineCommand
	|	defineWaypoint
	;

defineCommand
	:	('cmd'|'command'|'commands') defineCommandValue
	->	defineCommandValue
	;

defineCommandValue
	:	Identifier '=' integerValue (('and'|',' 'and'?)? Identifier '=' integerValue)*
	->	^(DEFINE Identifier ^(COMMAND integerValue))+
	|	Identifier '=' integerValue '(' par=integerValue ')' (('and'|',' 'and'?)? Identifier '=' integerValue '(' par=integerValue ')')*
	->	^(DEFINE Identifier ^(COMMAND integerValue PARAMETER $par))+
	;

defineWaypoint
	:	('wpt'|'waypoint'|'waypoints') defineWaypointValue
	->	defineWaypointValue
	;

defineWaypointValue
	:	Identifier '=' geoCoordinate (('and'|',' 'and'?)? Identifier '=' geoCoordinate)*
	->	^(DEFINE Identifier geoCoordinate)+
	;

// COMMANDS

command
	:	flyCommand
	|	executeCommand
	;

flyCommand
	:	('fly'|'go') flyCommandValue*
	->	^(FLY flyCommandValue*)
	;

flyCommandValue
	:	distance
	|	To waypoint (('and'|',' 'and'?) waypoint)*
	->	waypoint+
	|	altitude
	;

executeCommand
	:	Identifier
	->	^(EXECUTE Identifier)
	|	Identifier '(' numericValue (',' numericValue)*  ')'
	->	^(EXECUTE Identifier ^(PARAMETER numericValue)+)
	;

// ALTITUDE EXPRESSIONS

altitude
	:	fixedAltitude
	|	relativeAltitude
	;

fixedAltitude
	:	(upDownDirection? To|At|With) (('an'? ('alt'|'altitude')|'a'? ('pres'|'pressure')) 'of'?)? altitudeValue
	->	^(ALTITUDE FIXED altitudeValue)
	;

relativeAltitude
	:	upDownDirection altitudeValue
	->	^(ALTITUDE RELATIVE upDownDirection altitudeValue)
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

distance
	:	leftRightDirection? distanceValue
	->	^(DISTANCE leftRightDirection? distanceValue)
	;

distanceValue
	:	numericValue distanceUnit
	;

distanceUnit
	:	('km'|'kilometer'|'kilometers')
	->	KILOMETER
	|	('m'|'meter'|'meters')
	->	METER
	|	('nm'|'nautical' ('mi'|'mile'|'miles'))
	->	NAUTICAL MILE
	|	('statute')? ('mi'|'mile'|'miles')
	->	MILE
	|	('yd'|'yard'|'yards')
	->	YARD
	|	('ft'|'foot'|'feet')
	->	FOOT
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

upDownDirection
	:	('u'|'up'|'c'|'climb'|'climbing'|'ascend'|'ascending')
	->	CLIMB
	|	('d'|'down'|'descend'|'descending')
	->	DESCEND
	;

leftRightDirection
	:	('l'|'left'|'port')
	->	LEFT
	|	('r'|'right'|'starboard')
	->	RIGHT
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
	->	geoCoordinate
	|	Identifier
	->	^(WAYPOINT Identifier)
	;

geoCoordinate
	:	latitudeLongitude
	->	^(GEOCOORDINATE latitudeLongitude)
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
	:	integerValue
	|	FloatingPointLiteral
	;

integerValue
	:	BinaryLiteral
	|	OctalLiteral
	|	DecimalLiteral
	|	HexLiteral
	;

// LEXER

// COMMON TOKENS

To	:	'to';

At	:	'@'|'at';

With	:	'w/'|'with';

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
