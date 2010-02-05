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

grammar flipsMatrixPilot;

options {
  language = Java;
}

@header {
  import java.nio.ByteBuffer;
}

@members {
      public ByteBuffer output = ByteBuffer.allocate(4096);
      public StringBuilder waypoints = new StringBuilder();
      public Double xState = 0d;
      public Double yState = 0d;
      public Double zState = 0d;
      public Integer cmdState;

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
		{waypoints.append("const struct waypointDef waypoints[] = {\n");}
		instruction*
		{emitByte(0xFF);}
		{waypoints.append("                                       } ;\n");}
		{reserveCharacters();}
		{output.flip();}
	;

instruction
	:	fly
	|	command
	|	position
	;

// GENERAL INSTRUCTIONS

fly	:	FLY {emit(1);}
		{waypoints.append("                                         ");}
		{waypoints.append("{ { " + xState.longValue() + ", " + yState.longValue() + ", " + zState.intValue() + " }");}
		{waypoints.append(" , " + cmdState.intValue() + " } ,\n");}
	;

command	:	CMD x=integerValue {emitShort(2,x);} {cmdState = x;};

// POSITION INSTRUCTIONS

position:	POS X FIX x=numericValue {emit(3,x);} {xState = x;}
	|	POS X REL x=numericValue {emit(4,x);} {xState = x;}
	|	POS X GEO x=numericValue {emit(5,x);} {xState = x * 10e7;}
	|	POS Y FIX x=numericValue {emit(6,x);} {yState = x;}
	|	POS Y REL x=numericValue {emit(7,x);} {yState = x;}
	|	POS Y GEO x=numericValue {emit(8,x);} {yState = x * 10e7;}
	|	POS Z FIX x=numericValue {emit(9,x);} {zState = -x;}
	|	POS Z REL x=numericValue {emit(10,x);} {zState = -x;}
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

FIX	:	'fix'|'FIX';
REL	:	'rel'|'REL';

POS	:	'pos'|'POS';
X	:	'x'|'X';
Y	:	'y'|'Y';
Z	:	'z'|'Z';
GEO	:	'geo'|'GEO';

CMD	:	'cmd'|'CMD';

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
