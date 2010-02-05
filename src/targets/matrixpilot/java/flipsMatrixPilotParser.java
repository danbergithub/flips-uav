// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g 2010-02-04 23:24:07

  import java.nio.ByteBuffer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsMatrixPilotParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLY", "CMD", "POS", "X", "FIX", "REL", "GEO", "Y", "Z", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Identifier", "StringLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'-'"
    };
    public static final int HexLiteral=17;
    public static final int FIX=8;
    public static final int T__28=28;
    public static final int OctalLiteral=15;
    public static final int CMD=5;
    public static final int LineComment=27;
    public static final int Exponent=24;
    public static final int REL=9;
    public static final int Digit=20;
    public static final int EOF=-1;
    public static final int DecimalLiteral=16;
    public static final int HexDigit=23;
    public static final int Y=11;
    public static final int Identifier=18;
    public static final int X=7;
    public static final int Z=12;
    public static final int StringLiteral=19;
    public static final int WS=25;
    public static final int FLY=4;
    public static final int Comment=26;
    public static final int POS=6;
    public static final int NonZeroDigit=21;
    public static final int BinaryLiteral=14;
    public static final int BinaryDigit=22;
    public static final int FloatingPointLiteral=13;
    public static final int GEO=10;

    // delegates
    // delegators


        public flipsMatrixPilotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsMatrixPilotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsMatrixPilotParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g"; }


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



    // $ANTLR start "flightPlan"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:109:1: flightPlan : ( instruction )* ;
    public final void flightPlan() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:110:2: ( ( instruction )* )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:110:4: ( instruction )*
            {
            emitByte(0xAA);
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:111:3: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FLY && LA1_0<=POS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:111:3: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_flightPlan44);
            	    instruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            emitByte(0xFF);
            reserveCharacters();
            output.flip();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "flightPlan"


    // $ANTLR start "instruction"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:117:1: instruction : ( fly | command | position );
    public final void instruction() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:118:2: ( fly | command | position )
            int alt2=3;
            switch ( input.LA(1) ) {
            case FLY:
                {
                alt2=1;
                }
                break;
            case CMD:
                {
                alt2=2;
                }
                break;
            case POS:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:118:4: fly
                    {
                    pushFollow(FOLLOW_fly_in_instruction68);
                    fly();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:119:4: command
                    {
                    pushFollow(FOLLOW_command_in_instruction73);
                    command();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:120:4: position
                    {
                    pushFollow(FOLLOW_position_in_instruction78);
                    position();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "fly"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:125:1: fly : FLY ;
    public final void fly() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:125:5: ( FLY )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:125:7: FLY
            {
            match(input,FLY,FOLLOW_FLY_in_fly90); 
            emit(1);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fly"


    // $ANTLR start "command"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:127:1: command : CMD x= integerValue ;
    public final void command() throws RecognitionException {
        int x = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:127:9: ( CMD x= integerValue )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:127:11: CMD x= integerValue
            {
            match(input,CMD,FOLLOW_CMD_in_command100); 
            pushFollow(FOLLOW_integerValue_in_command104);
            x=integerValue();

            state._fsp--;

            emitShort(2,x);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "command"


    // $ANTLR start "position"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:131:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue );
    public final void position() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:131:9: ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:131:11: POS X FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position115); 
                    match(input,X,FOLLOW_X_in_position117); 
                    match(input,FIX,FOLLOW_FIX_in_position119); 
                    pushFollow(FOLLOW_numericValue_in_position123);
                    x=numericValue();

                    state._fsp--;

                    emit(3,x);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:132:4: POS X REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position130); 
                    match(input,X,FOLLOW_X_in_position132); 
                    match(input,REL,FOLLOW_REL_in_position134); 
                    pushFollow(FOLLOW_numericValue_in_position138);
                    x=numericValue();

                    state._fsp--;

                    emit(4,x);

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:133:4: POS X GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position145); 
                    match(input,X,FOLLOW_X_in_position147); 
                    match(input,GEO,FOLLOW_GEO_in_position149); 
                    pushFollow(FOLLOW_numericValue_in_position153);
                    x=numericValue();

                    state._fsp--;

                    emit(5,x);

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:134:4: POS Y FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position160); 
                    match(input,Y,FOLLOW_Y_in_position162); 
                    match(input,FIX,FOLLOW_FIX_in_position164); 
                    pushFollow(FOLLOW_numericValue_in_position168);
                    x=numericValue();

                    state._fsp--;

                    emit(6,x);

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:135:4: POS Y REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position175); 
                    match(input,Y,FOLLOW_Y_in_position177); 
                    match(input,REL,FOLLOW_REL_in_position179); 
                    pushFollow(FOLLOW_numericValue_in_position183);
                    x=numericValue();

                    state._fsp--;

                    emit(7,x);

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:136:4: POS Y GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position190); 
                    match(input,Y,FOLLOW_Y_in_position192); 
                    match(input,GEO,FOLLOW_GEO_in_position194); 
                    pushFollow(FOLLOW_numericValue_in_position198);
                    x=numericValue();

                    state._fsp--;

                    emit(8,x);

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:137:4: POS Z FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position205); 
                    match(input,Z,FOLLOW_Z_in_position207); 
                    match(input,FIX,FOLLOW_FIX_in_position209); 
                    pushFollow(FOLLOW_numericValue_in_position213);
                    x=numericValue();

                    state._fsp--;

                    emit(9,x);

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:138:4: POS Z REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position220); 
                    match(input,Z,FOLLOW_Z_in_position222); 
                    match(input,REL,FOLLOW_REL_in_position224); 
                    pushFollow(FOLLOW_numericValue_in_position228);
                    x=numericValue();

                    state._fsp--;

                    emit(10,x);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "position"


    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:143:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        Token y=null;
        int x = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:144:2: (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral )
            int alt4=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=BinaryLiteral && LA4_2<=HexLiteral)) ) {
                    alt4=1;
                }
                else if ( (LA4_2==FloatingPointLiteral) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:144:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue249);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:146:10: y= FloatingPointLiteral
                    {
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue266); 
                    r = Double.parseDouble(y.getText());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:148:10: '-' y= FloatingPointLiteral
                    {
                    match(input,28,FOLLOW_28_in_numericValue288); 
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue292); 
                    r = -Double.parseDouble(y.getText());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end "numericValue"


    // $ANTLR start "integerValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:152:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        Token x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:153:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:153:4: x= BinaryLiteral
                    {
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue320); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:155:4: x= OctalLiteral
                    {
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue331); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:157:4: x= DecimalLiteral
                    {
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue342); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:159:4: x= HexLiteral
                    {
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue353); 
                    r = Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:161:4: '-' x= BinaryLiteral
                    {
                    match(input,28,FOLLOW_28_in_integerValue362); 
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue366); 
                    r = -Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:163:4: '-' x= OctalLiteral
                    {
                    match(input,28,FOLLOW_28_in_integerValue375); 
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue379); 
                    r = -Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:165:4: '-' x= DecimalLiteral
                    {
                    match(input,28,FOLLOW_28_in_integerValue388); 
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue392); 
                    r = -Integer.parseInt(x.getText());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsMatrixPilot.g:167:4: '-' x= HexLiteral
                    {
                    match(input,28,FOLLOW_28_in_integerValue401); 
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue405); 
                    r = -Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end "integerValue"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\6\1\7\3\10\10\uffff";
    static final String DFA3_maxS =
        "\1\6\1\14\2\12\1\11\10\uffff";
    static final String DFA3_acceptS =
        "\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2\3\uffff\1\3\1\4",
            "\1\5\1\6\1\7",
            "\1\10\1\11\1\12",
            "\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "131:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue );";
        }
    }
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\16\4\uffff\1\16\4\uffff";
    static final String DFA5_maxS =
        "\1\34\4\uffff\1\21\4\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\3\1\4\12\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "152:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_instruction_in_flightPlan44 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_fly_in_instruction68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_instruction73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_instruction78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_fly90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command100 = new BitSet(new long[]{0x000000001003C000L});
    public static final BitSet FOLLOW_integerValue_in_command104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_X_in_position117 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FIX_in_position119 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position130 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_X_in_position132 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REL_in_position134 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position145 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_X_in_position147 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_GEO_in_position149 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position160 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Y_in_position162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FIX_in_position164 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position175 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Y_in_position177 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REL_in_position179 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Y_in_position192 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_GEO_in_position194 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Z_in_position207 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FIX_in_position209 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position220 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Z_in_position222 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REL_in_position224 = new BitSet(new long[]{0x000000001003E000L});
    public static final BitSet FOLLOW_numericValue_in_position228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_numericValue288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_integerValue362 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_integerValue375 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_integerValue388 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_integerValue401 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue405 = new BitSet(new long[]{0x0000000000000002L});

}