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

grammar flipsTargetUdbLogo;

options {
  language = Java;
}

@members {
  public StringBuilder output = new StringBuilder();
  public int indent = 0;

  public void emitIndent() {
    for (int i = 0; i < indent; i++) {
      output.append("\t");
    }
  }

  public void emit(String instruction) {
    emitIndent();
    output.append(instruction + "\n");
  }

  public void emit(String instruction, double value) {
    emitIndent();
    output.append(instruction + "(" + value + ")" + "\n");
  }

  public void emit(String instruction, double value0, double value1) {
    emitIndent();
    output.append(instruction + "(" + value0 + "," + value1 + ")" + "\n");
  }
}

flightPlan
	:	{emit("const struct logoInstructionDef instructions[] = {");}
		{indent++;}
		instruction*
		{indent--;}
		{emit("} ;");}
	;

instruction
	:	fly
	|	loiter
	|	command
	|	repeat
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

command	:	CMD x=integerValue {emit("// CMD " + x);}
	|	CMD PAR y=numericValue {emit("// CMD PAR " + y);}
	;

repeat	:	RPT NUM	x=numericValue {emit("REPEAT",x);} {indent++;}
	|	RPT TIM x=numericValue {emit("// RPT TIM " + x);} {indent++;}
	|	RPT FRV {emit("REPEAT_FOREVER");} {indent++;}
	|	RPT END {indent--;} {emit("END");}
	;

// POSITION INSTRUCTIONS

position:	POS X FIX x=numericValue {emit("EAST",x);}
	|	POS X REL x=numericValue {emit("FD",x);}
	|	POS X GEO x=numericValue {emit("// POS X GEO " + x);}
	|	~(POS X FIX x=numericValue) POS Y FIX x=numericValue {emit("NORTH",x);}
	|	POS Y REL x=numericValue {emit("RT",x);}
	|	POS Y GEO x=numericValue {emit("// POS Y GEO " + x);}
	|	POS Z FIX x=numericValue {emit("SET_ALT",-x);}
	|	POS Z REL x=numericValue {emit("ALT_DOWN",x);}
	|	POS ROL FIX x=numericValue {emit("// POS ROL FIX " + x);}
	|	POS ROL REL x=numericValue {emit("// POS ROL REL " + x);}
	|	POS PIT FIX x=numericValue {emit("// POS PIT FIX " + x);}
	|	POS PIT REL x=numericValue {emit("// POS PIT REL " + x);}
	|	POS YAW FIX x=numericValue {emit("SET_ANGLE",x);}
	|	POS YAW REL x=numericValue {emit("// POS YAW REL " + x);}
	|	POS PRE FIX x=numericValue {emit("// POS PRE FIX " + x);}
	|	POS PRE REL x=numericValue {emit("// POS PRE REL " + x);}
	|	POS X FIX x=numericValue POS Y FIX y=numericValue {emit("SET_POS",x,y);}
	;

// VELOCITY INSTRUCTIONS

velocity:	VEL X FIX x=numericValue {emit("// VEL X FIX " + x);}
	|	VEL X REL x=numericValue {emit("// VEL X REL " + x);}
	|	VEL Y FIX x=numericValue {emit("// VEL Y FIX " + x);}
	|	VEL Y REL x=numericValue {emit("// VEL Y REL " + x);}
	|	VEL Z FIX x=numericValue {emit("// VEL Z FIX " + x);}
	|	VEL Z REL x=numericValue {emit("// VEL Z REL " + x);}
	|	VEL ROL FIX x=numericValue {emit("// VEL ROL FIX " + x);}
	|	VEL ROL REL x=numericValue {emit("// VEL ROL REL " + x);}
	|	VEL PIT FIX x=numericValue {emit("// VEL PIT FIX " + x);}
	|	VEL PIT REL x=numericValue {emit("// VEL PIT REL " + x);}
	|	VEL YAW FIX x=numericValue {emit("// VEL YAW FIX " + x);}
	|	VEL YAW REL x=numericValue {emit("// VEL YAW REL " + x);}
	|	VEL PRE FIX x=numericValue {emit("// VEL PRE FIX " + x);}
	|	VEL PRE REL x=numericValue {emit("// VEL PRE REL " + x);}
	;

// SPEED INSTRUCTIONS

speed	:	SPD AIR FIX x=numericValue {emit("// SPD AIR FIX " + x);}
	|	SPD AIR REL x=numericValue {emit("// SPD AIR REL " + x);}
	|	SPD GND FIX x=numericValue {emit("// SPD GND FIX " + x);}
	|	SPD GND REL x=numericValue {emit("// SPD GND REL " + x);}
	;

// ACTUATOR INSTRUCTIONS

actuator:	ACT ELE FIX x=numericValue {emit("// ACT ELE FIX " + x);}
	|	ACT ELE REL x=numericValue {emit("// ACT ELE REL " + x);}
	|	ACT AIL FIX x=numericValue {emit("// ACT AIL FIX " + x);}
	|	ACT AIL REL x=numericValue {emit("// ACT AIL REL " + x);}
	|	ACT RUD FIX x=numericValue {emit("// ACT RUD FIX " + x);}
	|	ACT RUD REL x=numericValue {emit("// ACT RUD REL " + x);}
	|	ACT FLA FIX x=numericValue {emit("// ACT FLA FIX " + x);}
	|	ACT FLA REL x=numericValue {emit("// ACT FLA REL " + x);}
	|	ACT THR PCT x=numericValue {emit("// ACT THR PCT " + x);}
	|	ACT THR RPM x=numericValue {emit("// ACT THR RPM " + x);}
	;

// TRIM INSTRUCTIONS

trim	:	TRI ELE FIX x=numericValue {emit("// TRI ELE FIX " + x);}
	|	TRI ELE REL x=numericValue {emit("// TRI ELE REL " + x);}
	|	TRI AIL FIX x=numericValue {emit("// TRI AIL FIX " + x);}
	|	TRI AIL REL x=numericValue {emit("// TRI AIL REL " + x);}
	|	TRI RUD FIX x=numericValue {emit("// TRI RUD FIX " + x);}
	|	TRI RUD REL x=numericValue {emit("// TRI RUD REL " + x);}
	|	TRI FLA FIX x=numericValue {emit("// TRI FLA FIX " + x);}
	|	TRI FLA REL x=numericValue {emit("// TRI FLA REL " + x);}
	|	TRI THR FIX x=numericValue {emit("// TRI THR FIX " + x);}
	|	TRI THR REL x=numericValue {emit("// TRI THR REL " + x);}
	;

// TIME INSTRUCTIONS

time	:	TIM FIX x=numericValue {emit("// TIM FIX " + x);}
	|	TIM REL x=numericValue {emit("// TIM REL " + x);}
	;

radius	:	RAD x=numericValue {emit("// RAD " + x);};

direction
	:	DIR L {emit("// DIR L");}
	|	DIR R {emit("// DIR R");}
	|	DIR CW {emit("// DIR CW");}
	|	DIR CCW {emit("// DIR CCW");}
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

PCT	:	'pct'|'PCT';
RPM	:	'rpm'|'RPM';

TRI	:	'tri'|'TRI';

CMD	:	'cmd'|'CMD';
PAR	:	'par'|'PAR';

RPT	:	'rpt'|'RPT';
NUM	:	'num'|'NUM';
FRV	:	'frv'|'FRV';
END	:	'end'|'END';

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
