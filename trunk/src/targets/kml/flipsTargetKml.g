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

grammar flipsTargetKml;

options {
  language = Java;
}

@header {

}

@members {
  public StringBuilder output = new StringBuilder();
  public boolean HasWaypoint = false;
  public double Latitude = 0d;
  public double Longitude = 0d;
  public double Altitude = 0d;
  
  public void setLatitude(double latitude) {
    Latitude = latitude;
    HasWaypoint = true;
  }
  
  public void setLongitude(double longitude) {
    Longitude = longitude;
    HasWaypoint = true;
  }
    
  public void setFixedAltitude(double altitude) {
    Altitude = -altitude; // Inverse aerospace coordinates
    HasWaypoint = true;
  }
  
  public void setRelativeAltitude(double altitude) {
    Altitude = Altitude + -altitude; // Inverse aerospace coordinates
    HasWaypoint = true;
  }
  
  public void processCoordinate() {
    if (HasWaypoint) {
      output.append("        " + Longitude + "," + Latitude + "," + Altitude + "\n");
      HasWaypoint = false;
    }
  }
}

flightPlan
	:	{output.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");}
		{output.append("<kml xmlns=\"http://www.opengis.net/kml/2.2\" xmlns:gx=\"http://www.google.com/kml/ext/2.2\" xmlns:kml=\"http://www.opengis.net/kml/2.2\" xmlns:atom=\"http://www.w3.org/2005/Atom\">\n");}
		{output.append("<Document>\n");}
		{output.append("  <Style id=\"flightPath\">\n");}
		{output.append("    <LineStyle>\n");}
		{output.append("      <width>3</width>\n");}
		{output.append("    </LineStyle>\n");}
		{output.append("    <PolyStyle>\n");}
		{output.append("      <color>bf000000</color>\n");}
		{output.append("    </PolyStyle>\n");}
		{output.append("  </Style>\n");}
		{output.append("  <Placemark>\n");}
		{output.append("    <name>FLIPS Flight Plan</name>\n");}
		{output.append("    <styleUrl>#flightPath</styleUrl>\n");}
		{output.append("    <LineString>\n");}
		{output.append("      <extrude>1</extrude>\n");}
		{output.append("      <tessellate>1</tessellate>\n");}
		{output.append("      <altitudeMode>absolute</altitudeMode>\n");}
		{output.append("      <coordinates>\n");}
		instruction*
		{output.append("      </coordinates>\n");}
		{output.append("    </LineString>\n");}
		{output.append("  </Placemark>\n");}
		{output.append("</Document>\n");}
		{output.append("</kml>");}
	;

instruction
	:	fly {processCoordinate();}
	|	loiter
	|	command
	|	position
	|	velocity
	|	speed
	|	actuator
	|	trim
	|	time
	|	radius
	|	direction
	;

// GENERAL INSTRUCTIONS

fly	:	FLY;

loiter	:	LTR;

command	:	CMD x=integerValue
	|	CMD PAR y=numericValue
	;

// POSITION INSTRUCTIONS

position:	POS X FIX x=numericValue
	|	POS X REL x=numericValue
	|	POS X GEO x=numericValue {setLongitude(x);}
	|	POS Y FIX x=numericValue
	|	POS Y REL x=numericValue
	|	POS Y GEO x=numericValue {setLatitude(x);}
	|	POS Z FIX x=numericValue {setFixedAltitude(x);}
	|	POS Z REL x=numericValue {setRelativeAltitude(x);}
	|	POS ROL FIX x=numericValue
	|	POS ROL REL x=numericValue
	|	POS PIT FIX x=numericValue
	|	POS PIT REL x=numericValue
	|	POS YAW FIX x=numericValue
	|	POS YAW REL x=numericValue
	|	POS PRE FIX x=numericValue
	|	POS PRE REL x=numericValue
	;

// VELOCITY INSTRUCTIONS

velocity:	VEL X FIX x=numericValue
	|	VEL X REL x=numericValue
	|	VEL Y FIX x=numericValue
	|	VEL Y REL x=numericValue
	|	VEL Z FIX x=numericValue
	|	VEL Z REL x=numericValue
	|	VEL ROL FIX x=numericValue
	|	VEL ROL REL x=numericValue
	|	VEL PIT FIX x=numericValue
	|	VEL PIT REL x=numericValue
	|	VEL YAW FIX x=numericValue
	|	VEL YAW REL x=numericValue
	|	VEL PRE FIX x=numericValue
	|	VEL PRE REL x=numericValue
	;

// SPEED INSTRUCTIONS

speed	:	SPD AIR FIX x=numericValue
	|	SPD AIR REL x=numericValue
	|	SPD GND FIX x=numericValue
	|	SPD GND REL x=numericValue
	;

// ACTUATOR INSTRUCTIONS

actuator:	ACT ELE FIX x=numericValue
	|	ACT ELE REL x=numericValue
	|	ACT AIL FIX x=numericValue
	|	ACT AIL REL x=numericValue
	|	ACT RUD FIX x=numericValue
	|	ACT RUD REL x=numericValue
	|	ACT FLA FIX x=numericValue
	|	ACT FLA REL x=numericValue
	|	ACT THR FIX x=numericValue
	|	ACT THR REL x=numericValue
	;

// TRIM INSTRUCTIONS

trim	:	TRI ELE FIX x=numericValue
	|	TRI ELE REL x=numericValue
	|	TRI AIL FIX x=numericValue
	|	TRI AIL REL x=numericValue
	|	TRI RUD FIX x=numericValue
	|	TRI RUD REL x=numericValue
	|	TRI FLA FIX x=numericValue
	|	TRI FLA REL x=numericValue
	|	TRI THR FIX x=numericValue
	|	TRI THR REL x=numericValue
	;

// TIME INSTRUCTIONS

time	:	TIM FIX x=numericValue
	|	TIM REL x=numericValue
	;

radius	:	RAD x=numericValue;

direction
	:	DIR L
	|	DIR R
	|	DIR CW
	|	DIR CCW
	;

// NUMERIC EXPRESSIONS

numericValue returns [double r]
	:	x=integerValue
		{r = (double) x;}
	|       y=FloatingPointLiteral
	        {r = Double.parseDouble(y.getText());}
	|       '-' y=FloatingPointLiteral
	        {r = -Double.parseDouble(y.getText());}
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
	|	'-' x=BinaryLiteral
		{r = -Integer.parseInt(x.getText().substring(2),2);}
	|	'-' x=OctalLiteral
		{r = -Integer.parseInt(x.getText().substring(1),8);}
	|	'-' x=DecimalLiteral
		{r = -Integer.parseInt(x.getText());}
	|	'-' x=HexLiteral
		{r = -Integer.parseInt(x.getText().substring(2),16);}
	;

// LEXER

// INSTRUCTION TOKENS

FLY	:	'fly'|'FLY';
LTR	:	'ltr'|'LTR';

FIX	:	'fix'|'FIX';
REL	:	'rel'|'REL';

POS	:	'pos'|'POS';
X	:	'x'|'X';
Y	:	'y'|'Y';
Z	:	'z'|'Z';
GEO	:	'geo'|'GEO';
ROL	:	'rol'|'ROL';
PIT	:	'pit'|'PIT';
YAW	:	'yaw'|'YAW';
PRE	:	'pre'|'PRE';

VEL	:	'vel'|'VEL';

SPD	:	'spd'|'SPD';
AIR	:	'air'|'AIR';
GND	:	'gnd'|'GND';

ACT	:	'act'|'ACT';
ELE	:	'ele'|'ELE';
AIL	:	'ail'|'AIL';
RUD	:	'rud'|'RUD';
FLA	:	'fla'|'FLA';
THR	:	'thr'|'THR';

TRI	:	'tri'|'TRI';

CMD	:	'cmd'|'CMD';
PAR	:	'par'|'PAR';

TIM	:	'tim'|'TIM';

RAD	:	'rad'|'RAD';
DIR	:	'dir'|'DIR';
L	:	'l'|'L';
R	:	'r'|'R';
CW	:	'cw'|'CW';
CCW	:	'ccw'|'CCW';

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
