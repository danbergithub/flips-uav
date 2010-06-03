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

grammar flipsTargetUGA;

options {
  language = Java;
}

@header {
  import java.nio.ByteBuffer;
}

@members {
      public ByteBuffer output = ByteBuffer.allocate(4096);

      public void emitByte(int value) {
        output.put((byte)value);
        System.out.println(value + " = " + Integer.toHexString(value).toUpperCase());
      }

      public void emitShort(int value) {
        output.putShort((short)value);
        System.out.println(value + " = " + Integer.toHexString(value).toUpperCase());
      }

      public void emitShort(int instruction, int value) {
        output.put((byte)instruction);
        output.putShort((short)value);
        System.out.println(value + " = " + Integer.toHexString(value).toUpperCase());
      }

      public void emitInt(int value) {
        output.putInt(value);
        System.out.println(value + " = " + Integer.toHexString(value).toUpperCase());
      }

      public void emit(int instruction) {
        emitByte(instruction);
      }

      public void emit(int instruction, double value) {
        output.put((byte)instruction);
        output.putFloat((float)value);
        System.out.print(Integer.toString(instruction) + " " + value);
        System.out.print(" = " + Integer.toHexString(instruction).toUpperCase() + " ");
        //long data = Double.doubleToRawLongBits(value);
        //System.out.print(Integer.toHexString((int)((data >> 56) & 0xFF)).toUpperCase() + " ");
        //System.out.print(Integer.toHexString((int)((data >> 48) & 0xFF)).toUpperCase() + " ");
        //System.out.print(Integer.toHexString((int)((data >> 40) & 0xFF)).toUpperCase() + " ");
        //System.out.print(Integer.toHexString((int)((data >> 32) & 0xFF)).toUpperCase() + " ");
        int data = Float.floatToRawIntBits((float)value);
        System.out.print(Integer.toHexString((int)((data >> 24) & 0xFF)).toUpperCase() + " ");
        System.out.print(Integer.toHexString((int)((data >> 16) & 0xFF)).toUpperCase() + " ");
        System.out.print(Integer.toHexString((int)((data >> 8) & 0xFF)).toUpperCase() + " ");
        System.out.print(Integer.toHexString((int)((data >> 0) & 0xFF)).toUpperCase());
        System.out.println();
      }
      
      public void reserveCharacters() {
        ByteBuffer buffer = ByteBuffer.allocate(4096);
        buffer.put(output.get(0));
        for (int i = 1; i < output.position() - 1; i++) {
            if (output.get(i) == (byte)0xAA) {
                buffer.put((byte)0xCC);
                buffer.put((byte)0x00);
            }
            else if (output.get(i) == (byte)0xCC) {
                buffer.put((byte)0xCC);
                buffer.put((byte)0x01);
            }
            else if (output.get(i) == (byte)0xFF) {
                buffer.put((byte)0xCC);
                buffer.put((byte)0x02);
            }
            else {
                buffer.put(output.get(i));
            }
        }
        buffer.put(output.get(output.position() - 1));
        output = buffer;
    }
}

flightPlan
	:	{emitByte(0xAA);}
		instruction*
		{emitByte(0xFF);}
		{reserveCharacters();}
		{output.flip();}
	;

instruction
	:	fly
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

fly	:	FLY {emit(90);};

loiter	:	LTR {emit(91);};

command	:	CMD x=integerValue {emitShort(92,x);}
	|	CMD PAR y=numericValue {emit(95,y);}
	;

// POSITION INSTRUCTIONS

position:	POS X FIX x=numericValue {emit(1,x);}
	|	POS X REL x=numericValue {emit(2,x);}
	|	POS X GEO x=numericValue {emit(93,x);}
	|	POS Y FIX x=numericValue {emit(3,x);}
	|	POS Y REL x=numericValue {emit(4,x);}
	|	POS Y GEO x=numericValue {emit(94,x);}
	|	POS Z FIX x=numericValue {emit(5,x);}
	|	POS Z REL x=numericValue {emit(6,x);}
	|	POS ROL FIX x=numericValue {emit(7,x);}
	|	POS ROL REL x=numericValue {emit(8,x);}
	|	POS PIT FIX x=numericValue {emit(9,x);}
	|	POS PIT REL x=numericValue {emit(10,x);}
	|	POS YAW FIX x=numericValue {emit(11,x);}
	|	POS YAW REL x=numericValue {emit(12,x);}
	|	POS PRE FIX x=numericValue {emit(13,x);}
	|	POS PRE REL x=numericValue {emit(14,x);}
	;

// VELOCITY INSTRUCTIONS

velocity:	VEL X FIX x=numericValue {emit(15,x);}
	|	VEL X REL x=numericValue {emit(16,x);}
	|	VEL Y FIX x=numericValue {emit(20,x);}
	|	VEL Y REL x=numericValue {emit(21,x);}
	|	VEL Z FIX x=numericValue {emit(25,x);}
	|	VEL Z REL x=numericValue {emit(26,x);}
	|	VEL ROL FIX x=numericValue {emit(30,x);}
	|	VEL ROL REL x=numericValue {emit(31,x);}
	|	VEL PIT FIX x=numericValue {emit(35,x);}
	|	VEL PIT REL x=numericValue {emit(36,x);}
	|	VEL YAW FIX x=numericValue {emit(40,x);}
	|	VEL YAW REL x=numericValue {emit(41,x);}
	|	VEL PRE FIX x=numericValue {emit(45,x);}
	|	VEL PRE REL x=numericValue {emit(46,x);}
	;

// SPEED INSTRUCTIONS

speed	:	SPD AIR FIX x=numericValue {emit(47,x);}
	|	SPD AIR REL x=numericValue {emit(48,x);}
	|	SPD GND FIX x=numericValue {emit(52,x);}
	|	SPD GND REL x=numericValue {emit(53,x);}
	;

// ACTUATOR INSTRUCTIONS

actuator:	ACT ELE FIX x=numericValue {emit(57,x);}
	|	ACT ELE REL x=numericValue {emit(58,x);}
	|	ACT AIL FIX x=numericValue {emit(60,x);}
	|	ACT AIL REL x=numericValue {emit(61,x);}
	|	ACT RUD FIX x=numericValue {emit(63,x);}
	|	ACT RUD REL x=numericValue {emit(64,x);}
	|	ACT FLA FIX x=numericValue {emit(66,x);}
	|	ACT FLA REL x=numericValue {emit(67,x);}
	|	ACT THR FIX x=numericValue {emit(69,x);}
	|	ACT THR REL x=numericValue {emit(70,x);}
	;

// TRIM INSTRUCTIONS

trim	:	TRI ELE FIX x=numericValue {emit(72,x);}
	|	TRI ELE REL x=numericValue {emit(73,x);}
	|	TRI AIL FIX x=numericValue {emit(74,x);}
	|	TRI AIL REL x=numericValue {emit(75,x);}
	|	TRI RUD FIX x=numericValue {emit(76,x);}
	|	TRI RUD REL x=numericValue {emit(77,x);}
	|	TRI FLA FIX x=numericValue {emit(78,x);}
	|	TRI FLA REL x=numericValue {emit(79,x);}
	|	TRI THR FIX x=numericValue {emit(80,x);}
	|	TRI THR REL x=numericValue {emit(81,x);}
	;

// TIME INSTRUCTIONS

time	:	TIM FIX x=numericValue {emit(82,x);}
	|	TIM REL x=numericValue {emit(83,x);}
	;

radius	:	RAD x=numericValue {emit(84,x);};

direction
	:	DIR L {emit(85);}
	|	DIR R {emit(86);}
	|	DIR CW {emit(87);}
	|	DIR CCW {emit(88);}
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
