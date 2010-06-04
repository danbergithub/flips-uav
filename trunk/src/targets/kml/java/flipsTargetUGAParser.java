// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsTargetUGA.g 2010-06-03 02:07:44

  import java.nio.ByteBuffer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsTargetUGAParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLY", "LTR", "CMD", "PAR", "POS", "X", "FIX", "REL", "GEO", "Y", "Z", "ROL", "PIT", "YAW", "PRE", "VEL", "SPD", "AIR", "GND", "ACT", "ELE", "AIL", "RUD", "FLA", "THR", "TRI", "TIM", "RAD", "DIR", "L", "R", "CW", "CCW", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Identifier", "StringLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'-'"
    };
    public static final int AIL=25;
    public static final int FIX=10;
    public static final int THR=28;
    public static final int FLA=27;
    public static final int SPD=20;
    public static final int OctalLiteral=39;
    public static final int AIR=21;
    public static final int LineComment=51;
    public static final int Exponent=48;
    public static final int YAW=17;
    public static final int PRE=18;
    public static final int EOF=-1;
    public static final int HexDigit=47;
    public static final int ROL=15;
    public static final int Identifier=42;
    public static final int TIM=30;
    public static final int T__52=52;
    public static final int Comment=50;
    public static final int POS=8;
    public static final int RAD=31;
    public static final int ELE=24;
    public static final int PAR=7;
    public static final int GEO=12;
    public static final int HexLiteral=41;
    public static final int ACT=23;
    public static final int GND=22;
    public static final int L=33;
    public static final int VEL=19;
    public static final int TRI=29;
    public static final int CMD=6;
    public static final int PIT=16;
    public static final int REL=11;
    public static final int R=34;
    public static final int Digit=44;
    public static final int DecimalLiteral=40;
    public static final int Y=13;
    public static final int X=9;
    public static final int CCW=36;
    public static final int Z=14;
    public static final int StringLiteral=43;
    public static final int CW=35;
    public static final int WS=49;
    public static final int FLY=4;
    public static final int RUD=26;
    public static final int LTR=5;
    public static final int DIR=32;
    public static final int NonZeroDigit=45;
    public static final int BinaryLiteral=38;
    public static final int BinaryDigit=46;
    public static final int FloatingPointLiteral=37;

    // delegates
    // delegators


        public flipsTargetUGAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsTargetUGAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsTargetUGAParser.tokenNames; }
    public String getGrammarFileName() { return "flipsTargetUGA.g"; }


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
    // flipsTargetUGA.g:109:1: flightPlan : ( instruction )* ;
    public final void flightPlan() throws RecognitionException {
        try {
            // flipsTargetUGA.g:110:2: ( ( instruction )* )
            // flipsTargetUGA.g:110:4: ( instruction )*
            {
            emitByte(0xAA);
            // flipsTargetUGA.g:111:3: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FLY && LA1_0<=CMD)||LA1_0==POS||(LA1_0>=VEL && LA1_0<=SPD)||LA1_0==ACT||(LA1_0>=TRI && LA1_0<=DIR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flipsTargetUGA.g:111:3: instruction
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
    // flipsTargetUGA.g:117:1: instruction : ( fly | loiter | command | position | velocity | speed | actuator | trim | time | radius | direction );
    public final void instruction() throws RecognitionException {
        try {
            // flipsTargetUGA.g:118:2: ( fly | loiter | command | position | velocity | speed | actuator | trim | time | radius | direction )
            int alt2=11;
            switch ( input.LA(1) ) {
            case FLY:
                {
                alt2=1;
                }
                break;
            case LTR:
                {
                alt2=2;
                }
                break;
            case CMD:
                {
                alt2=3;
                }
                break;
            case POS:
                {
                alt2=4;
                }
                break;
            case VEL:
                {
                alt2=5;
                }
                break;
            case SPD:
                {
                alt2=6;
                }
                break;
            case ACT:
                {
                alt2=7;
                }
                break;
            case TRI:
                {
                alt2=8;
                }
                break;
            case TIM:
                {
                alt2=9;
                }
                break;
            case RAD:
                {
                alt2=10;
                }
                break;
            case DIR:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // flipsTargetUGA.g:118:4: fly
                    {
                    pushFollow(FOLLOW_fly_in_instruction68);
                    fly();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:119:4: loiter
                    {
                    pushFollow(FOLLOW_loiter_in_instruction73);
                    loiter();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:120:4: command
                    {
                    pushFollow(FOLLOW_command_in_instruction78);
                    command();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:121:4: position
                    {
                    pushFollow(FOLLOW_position_in_instruction83);
                    position();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetUGA.g:122:4: velocity
                    {
                    pushFollow(FOLLOW_velocity_in_instruction88);
                    velocity();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetUGA.g:123:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_instruction93);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetUGA.g:124:4: actuator
                    {
                    pushFollow(FOLLOW_actuator_in_instruction98);
                    actuator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetUGA.g:125:4: trim
                    {
                    pushFollow(FOLLOW_trim_in_instruction103);
                    trim();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetUGA.g:126:4: time
                    {
                    pushFollow(FOLLOW_time_in_instruction108);
                    time();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetUGA.g:127:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_instruction113);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetUGA.g:128:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_instruction118);
                    direction();

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
    // flipsTargetUGA.g:133:1: fly : FLY ;
    public final void fly() throws RecognitionException {
        try {
            // flipsTargetUGA.g:133:5: ( FLY )
            // flipsTargetUGA.g:133:7: FLY
            {
            match(input,FLY,FOLLOW_FLY_in_fly130); 
            emit(90);

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


    // $ANTLR start "loiter"
    // flipsTargetUGA.g:135:1: loiter : LTR ;
    public final void loiter() throws RecognitionException {
        try {
            // flipsTargetUGA.g:135:8: ( LTR )
            // flipsTargetUGA.g:135:10: LTR
            {
            match(input,LTR,FOLLOW_LTR_in_loiter140); 
            emit(91);

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
    // $ANTLR end "loiter"


    // $ANTLR start "command"
    // flipsTargetUGA.g:137:1: command : ( CMD x= integerValue | CMD PAR y= numericValue );
    public final void command() throws RecognitionException {
        int x = 0;

        double y = 0.0;


        try {
            // flipsTargetUGA.g:137:9: ( CMD x= integerValue | CMD PAR y= numericValue )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CMD) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==PAR) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=BinaryLiteral && LA3_1<=HexLiteral)||LA3_1==52) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // flipsTargetUGA.g:137:11: CMD x= integerValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command150); 
                    pushFollow(FOLLOW_integerValue_in_command154);
                    x=integerValue();

                    state._fsp--;

                    emitShort(92,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:138:4: CMD PAR y= numericValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command161); 
                    match(input,PAR,FOLLOW_PAR_in_command163); 
                    pushFollow(FOLLOW_numericValue_in_command167);
                    y=numericValue();

                    state._fsp--;

                    emit(95,y);

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
    // $ANTLR end "command"


    // $ANTLR start "position"
    // flipsTargetUGA.g:143:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue );
    public final void position() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:143:9: ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue )
            int alt4=16;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // flipsTargetUGA.g:143:11: POS X FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position180); 
                    match(input,X,FOLLOW_X_in_position182); 
                    match(input,FIX,FOLLOW_FIX_in_position184); 
                    pushFollow(FOLLOW_numericValue_in_position188);
                    x=numericValue();

                    state._fsp--;

                    emit(1,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:144:4: POS X REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position195); 
                    match(input,X,FOLLOW_X_in_position197); 
                    match(input,REL,FOLLOW_REL_in_position199); 
                    pushFollow(FOLLOW_numericValue_in_position203);
                    x=numericValue();

                    state._fsp--;

                    emit(2,x);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:145:4: POS X GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position210); 
                    match(input,X,FOLLOW_X_in_position212); 
                    match(input,GEO,FOLLOW_GEO_in_position214); 
                    pushFollow(FOLLOW_numericValue_in_position218);
                    x=numericValue();

                    state._fsp--;

                    emit(93,x);

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:146:4: POS Y FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position225); 
                    match(input,Y,FOLLOW_Y_in_position227); 
                    match(input,FIX,FOLLOW_FIX_in_position229); 
                    pushFollow(FOLLOW_numericValue_in_position233);
                    x=numericValue();

                    state._fsp--;

                    emit(3,x);

                    }
                    break;
                case 5 :
                    // flipsTargetUGA.g:147:4: POS Y REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position240); 
                    match(input,Y,FOLLOW_Y_in_position242); 
                    match(input,REL,FOLLOW_REL_in_position244); 
                    pushFollow(FOLLOW_numericValue_in_position248);
                    x=numericValue();

                    state._fsp--;

                    emit(4,x);

                    }
                    break;
                case 6 :
                    // flipsTargetUGA.g:148:4: POS Y GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position255); 
                    match(input,Y,FOLLOW_Y_in_position257); 
                    match(input,GEO,FOLLOW_GEO_in_position259); 
                    pushFollow(FOLLOW_numericValue_in_position263);
                    x=numericValue();

                    state._fsp--;

                    emit(94,x);

                    }
                    break;
                case 7 :
                    // flipsTargetUGA.g:149:4: POS Z FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position270); 
                    match(input,Z,FOLLOW_Z_in_position272); 
                    match(input,FIX,FOLLOW_FIX_in_position274); 
                    pushFollow(FOLLOW_numericValue_in_position278);
                    x=numericValue();

                    state._fsp--;

                    emit(5,x);

                    }
                    break;
                case 8 :
                    // flipsTargetUGA.g:150:4: POS Z REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position285); 
                    match(input,Z,FOLLOW_Z_in_position287); 
                    match(input,REL,FOLLOW_REL_in_position289); 
                    pushFollow(FOLLOW_numericValue_in_position293);
                    x=numericValue();

                    state._fsp--;

                    emit(6,x);

                    }
                    break;
                case 9 :
                    // flipsTargetUGA.g:151:4: POS ROL FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position300); 
                    match(input,ROL,FOLLOW_ROL_in_position302); 
                    match(input,FIX,FOLLOW_FIX_in_position304); 
                    pushFollow(FOLLOW_numericValue_in_position308);
                    x=numericValue();

                    state._fsp--;

                    emit(7,x);

                    }
                    break;
                case 10 :
                    // flipsTargetUGA.g:152:4: POS ROL REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position315); 
                    match(input,ROL,FOLLOW_ROL_in_position317); 
                    match(input,REL,FOLLOW_REL_in_position319); 
                    pushFollow(FOLLOW_numericValue_in_position323);
                    x=numericValue();

                    state._fsp--;

                    emit(8,x);

                    }
                    break;
                case 11 :
                    // flipsTargetUGA.g:153:4: POS PIT FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position330); 
                    match(input,PIT,FOLLOW_PIT_in_position332); 
                    match(input,FIX,FOLLOW_FIX_in_position334); 
                    pushFollow(FOLLOW_numericValue_in_position338);
                    x=numericValue();

                    state._fsp--;

                    emit(9,x);

                    }
                    break;
                case 12 :
                    // flipsTargetUGA.g:154:4: POS PIT REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position345); 
                    match(input,PIT,FOLLOW_PIT_in_position347); 
                    match(input,REL,FOLLOW_REL_in_position349); 
                    pushFollow(FOLLOW_numericValue_in_position353);
                    x=numericValue();

                    state._fsp--;

                    emit(10,x);

                    }
                    break;
                case 13 :
                    // flipsTargetUGA.g:155:4: POS YAW FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position360); 
                    match(input,YAW,FOLLOW_YAW_in_position362); 
                    match(input,FIX,FOLLOW_FIX_in_position364); 
                    pushFollow(FOLLOW_numericValue_in_position368);
                    x=numericValue();

                    state._fsp--;

                    emit(11,x);

                    }
                    break;
                case 14 :
                    // flipsTargetUGA.g:156:4: POS YAW REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position375); 
                    match(input,YAW,FOLLOW_YAW_in_position377); 
                    match(input,REL,FOLLOW_REL_in_position379); 
                    pushFollow(FOLLOW_numericValue_in_position383);
                    x=numericValue();

                    state._fsp--;

                    emit(12,x);

                    }
                    break;
                case 15 :
                    // flipsTargetUGA.g:157:4: POS PRE FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position390); 
                    match(input,PRE,FOLLOW_PRE_in_position392); 
                    match(input,FIX,FOLLOW_FIX_in_position394); 
                    pushFollow(FOLLOW_numericValue_in_position398);
                    x=numericValue();

                    state._fsp--;

                    emit(13,x);

                    }
                    break;
                case 16 :
                    // flipsTargetUGA.g:158:4: POS PRE REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position405); 
                    match(input,PRE,FOLLOW_PRE_in_position407); 
                    match(input,REL,FOLLOW_REL_in_position409); 
                    pushFollow(FOLLOW_numericValue_in_position413);
                    x=numericValue();

                    state._fsp--;

                    emit(14,x);

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


    // $ANTLR start "velocity"
    // flipsTargetUGA.g:163:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );
    public final void velocity() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:163:9: ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue )
            int alt5=14;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsTargetUGA.g:163:11: VEL X FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity426); 
                    match(input,X,FOLLOW_X_in_velocity428); 
                    match(input,FIX,FOLLOW_FIX_in_velocity430); 
                    pushFollow(FOLLOW_numericValue_in_velocity434);
                    x=numericValue();

                    state._fsp--;

                    emit(15,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:164:4: VEL X REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity441); 
                    match(input,X,FOLLOW_X_in_velocity443); 
                    match(input,REL,FOLLOW_REL_in_velocity445); 
                    pushFollow(FOLLOW_numericValue_in_velocity449);
                    x=numericValue();

                    state._fsp--;

                    emit(16,x);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:165:4: VEL Y FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity456); 
                    match(input,Y,FOLLOW_Y_in_velocity458); 
                    match(input,FIX,FOLLOW_FIX_in_velocity460); 
                    pushFollow(FOLLOW_numericValue_in_velocity464);
                    x=numericValue();

                    state._fsp--;

                    emit(20,x);

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:166:4: VEL Y REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity471); 
                    match(input,Y,FOLLOW_Y_in_velocity473); 
                    match(input,REL,FOLLOW_REL_in_velocity475); 
                    pushFollow(FOLLOW_numericValue_in_velocity479);
                    x=numericValue();

                    state._fsp--;

                    emit(21,x);

                    }
                    break;
                case 5 :
                    // flipsTargetUGA.g:167:4: VEL Z FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity486); 
                    match(input,Z,FOLLOW_Z_in_velocity488); 
                    match(input,FIX,FOLLOW_FIX_in_velocity490); 
                    pushFollow(FOLLOW_numericValue_in_velocity494);
                    x=numericValue();

                    state._fsp--;

                    emit(25,x);

                    }
                    break;
                case 6 :
                    // flipsTargetUGA.g:168:4: VEL Z REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity501); 
                    match(input,Z,FOLLOW_Z_in_velocity503); 
                    match(input,REL,FOLLOW_REL_in_velocity505); 
                    pushFollow(FOLLOW_numericValue_in_velocity509);
                    x=numericValue();

                    state._fsp--;

                    emit(26,x);

                    }
                    break;
                case 7 :
                    // flipsTargetUGA.g:169:4: VEL ROL FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity516); 
                    match(input,ROL,FOLLOW_ROL_in_velocity518); 
                    match(input,FIX,FOLLOW_FIX_in_velocity520); 
                    pushFollow(FOLLOW_numericValue_in_velocity524);
                    x=numericValue();

                    state._fsp--;

                    emit(30,x);

                    }
                    break;
                case 8 :
                    // flipsTargetUGA.g:170:4: VEL ROL REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity531); 
                    match(input,ROL,FOLLOW_ROL_in_velocity533); 
                    match(input,REL,FOLLOW_REL_in_velocity535); 
                    pushFollow(FOLLOW_numericValue_in_velocity539);
                    x=numericValue();

                    state._fsp--;

                    emit(31,x);

                    }
                    break;
                case 9 :
                    // flipsTargetUGA.g:171:4: VEL PIT FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity546); 
                    match(input,PIT,FOLLOW_PIT_in_velocity548); 
                    match(input,FIX,FOLLOW_FIX_in_velocity550); 
                    pushFollow(FOLLOW_numericValue_in_velocity554);
                    x=numericValue();

                    state._fsp--;

                    emit(35,x);

                    }
                    break;
                case 10 :
                    // flipsTargetUGA.g:172:4: VEL PIT REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity561); 
                    match(input,PIT,FOLLOW_PIT_in_velocity563); 
                    match(input,REL,FOLLOW_REL_in_velocity565); 
                    pushFollow(FOLLOW_numericValue_in_velocity569);
                    x=numericValue();

                    state._fsp--;

                    emit(36,x);

                    }
                    break;
                case 11 :
                    // flipsTargetUGA.g:173:4: VEL YAW FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity576); 
                    match(input,YAW,FOLLOW_YAW_in_velocity578); 
                    match(input,FIX,FOLLOW_FIX_in_velocity580); 
                    pushFollow(FOLLOW_numericValue_in_velocity584);
                    x=numericValue();

                    state._fsp--;

                    emit(40,x);

                    }
                    break;
                case 12 :
                    // flipsTargetUGA.g:174:4: VEL YAW REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity591); 
                    match(input,YAW,FOLLOW_YAW_in_velocity593); 
                    match(input,REL,FOLLOW_REL_in_velocity595); 
                    pushFollow(FOLLOW_numericValue_in_velocity599);
                    x=numericValue();

                    state._fsp--;

                    emit(41,x);

                    }
                    break;
                case 13 :
                    // flipsTargetUGA.g:175:4: VEL PRE FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity606); 
                    match(input,PRE,FOLLOW_PRE_in_velocity608); 
                    match(input,FIX,FOLLOW_FIX_in_velocity610); 
                    pushFollow(FOLLOW_numericValue_in_velocity614);
                    x=numericValue();

                    state._fsp--;

                    emit(45,x);

                    }
                    break;
                case 14 :
                    // flipsTargetUGA.g:176:4: VEL PRE REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity621); 
                    match(input,PRE,FOLLOW_PRE_in_velocity623); 
                    match(input,REL,FOLLOW_REL_in_velocity625); 
                    pushFollow(FOLLOW_numericValue_in_velocity629);
                    x=numericValue();

                    state._fsp--;

                    emit(46,x);

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
    // $ANTLR end "velocity"


    // $ANTLR start "speed"
    // flipsTargetUGA.g:181:1: speed : ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:181:7: ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SPD) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==AIR) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==FIX) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==REL) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==GND) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==FIX) ) {
                        alt6=3;
                    }
                    else if ( (LA6_3==REL) ) {
                        alt6=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // flipsTargetUGA.g:181:9: SPD AIR FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed643); 
                    match(input,AIR,FOLLOW_AIR_in_speed645); 
                    match(input,FIX,FOLLOW_FIX_in_speed647); 
                    pushFollow(FOLLOW_numericValue_in_speed651);
                    x=numericValue();

                    state._fsp--;

                    emit(47,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:182:4: SPD AIR REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed658); 
                    match(input,AIR,FOLLOW_AIR_in_speed660); 
                    match(input,REL,FOLLOW_REL_in_speed662); 
                    pushFollow(FOLLOW_numericValue_in_speed666);
                    x=numericValue();

                    state._fsp--;

                    emit(48,x);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:183:4: SPD GND FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed673); 
                    match(input,GND,FOLLOW_GND_in_speed675); 
                    match(input,FIX,FOLLOW_FIX_in_speed677); 
                    pushFollow(FOLLOW_numericValue_in_speed681);
                    x=numericValue();

                    state._fsp--;

                    emit(52,x);

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:184:4: SPD GND REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed688); 
                    match(input,GND,FOLLOW_GND_in_speed690); 
                    match(input,REL,FOLLOW_REL_in_speed692); 
                    pushFollow(FOLLOW_numericValue_in_speed696);
                    x=numericValue();

                    state._fsp--;

                    emit(53,x);

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
    // $ANTLR end "speed"


    // $ANTLR start "actuator"
    // flipsTargetUGA.g:189:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR FIX x= numericValue | ACT THR REL x= numericValue );
    public final void actuator() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:189:9: ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR FIX x= numericValue | ACT THR REL x= numericValue )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // flipsTargetUGA.g:189:11: ACT ELE FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator709); 
                    match(input,ELE,FOLLOW_ELE_in_actuator711); 
                    match(input,FIX,FOLLOW_FIX_in_actuator713); 
                    pushFollow(FOLLOW_numericValue_in_actuator717);
                    x=numericValue();

                    state._fsp--;

                    emit(57,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:190:4: ACT ELE REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator724); 
                    match(input,ELE,FOLLOW_ELE_in_actuator726); 
                    match(input,REL,FOLLOW_REL_in_actuator728); 
                    pushFollow(FOLLOW_numericValue_in_actuator732);
                    x=numericValue();

                    state._fsp--;

                    emit(58,x);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:191:4: ACT AIL FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator739); 
                    match(input,AIL,FOLLOW_AIL_in_actuator741); 
                    match(input,FIX,FOLLOW_FIX_in_actuator743); 
                    pushFollow(FOLLOW_numericValue_in_actuator747);
                    x=numericValue();

                    state._fsp--;

                    emit(60,x);

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:192:4: ACT AIL REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator754); 
                    match(input,AIL,FOLLOW_AIL_in_actuator756); 
                    match(input,REL,FOLLOW_REL_in_actuator758); 
                    pushFollow(FOLLOW_numericValue_in_actuator762);
                    x=numericValue();

                    state._fsp--;

                    emit(61,x);

                    }
                    break;
                case 5 :
                    // flipsTargetUGA.g:193:4: ACT RUD FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator769); 
                    match(input,RUD,FOLLOW_RUD_in_actuator771); 
                    match(input,FIX,FOLLOW_FIX_in_actuator773); 
                    pushFollow(FOLLOW_numericValue_in_actuator777);
                    x=numericValue();

                    state._fsp--;

                    emit(63,x);

                    }
                    break;
                case 6 :
                    // flipsTargetUGA.g:194:4: ACT RUD REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator784); 
                    match(input,RUD,FOLLOW_RUD_in_actuator786); 
                    match(input,REL,FOLLOW_REL_in_actuator788); 
                    pushFollow(FOLLOW_numericValue_in_actuator792);
                    x=numericValue();

                    state._fsp--;

                    emit(64,x);

                    }
                    break;
                case 7 :
                    // flipsTargetUGA.g:195:4: ACT FLA FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator799); 
                    match(input,FLA,FOLLOW_FLA_in_actuator801); 
                    match(input,FIX,FOLLOW_FIX_in_actuator803); 
                    pushFollow(FOLLOW_numericValue_in_actuator807);
                    x=numericValue();

                    state._fsp--;

                    emit(66,x);

                    }
                    break;
                case 8 :
                    // flipsTargetUGA.g:196:4: ACT FLA REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator814); 
                    match(input,FLA,FOLLOW_FLA_in_actuator816); 
                    match(input,REL,FOLLOW_REL_in_actuator818); 
                    pushFollow(FOLLOW_numericValue_in_actuator822);
                    x=numericValue();

                    state._fsp--;

                    emit(67,x);

                    }
                    break;
                case 9 :
                    // flipsTargetUGA.g:197:4: ACT THR FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator829); 
                    match(input,THR,FOLLOW_THR_in_actuator831); 
                    match(input,FIX,FOLLOW_FIX_in_actuator833); 
                    pushFollow(FOLLOW_numericValue_in_actuator837);
                    x=numericValue();

                    state._fsp--;

                    emit(69,x);

                    }
                    break;
                case 10 :
                    // flipsTargetUGA.g:198:4: ACT THR REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator844); 
                    match(input,THR,FOLLOW_THR_in_actuator846); 
                    match(input,REL,FOLLOW_REL_in_actuator848); 
                    pushFollow(FOLLOW_numericValue_in_actuator852);
                    x=numericValue();

                    state._fsp--;

                    emit(70,x);

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
    // $ANTLR end "actuator"


    // $ANTLR start "trim"
    // flipsTargetUGA.g:203:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );
    public final void trim() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:203:6: ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // flipsTargetUGA.g:203:8: TRI ELE FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim866); 
                    match(input,ELE,FOLLOW_ELE_in_trim868); 
                    match(input,FIX,FOLLOW_FIX_in_trim870); 
                    pushFollow(FOLLOW_numericValue_in_trim874);
                    x=numericValue();

                    state._fsp--;

                    emit(72,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:204:4: TRI ELE REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim881); 
                    match(input,ELE,FOLLOW_ELE_in_trim883); 
                    match(input,REL,FOLLOW_REL_in_trim885); 
                    pushFollow(FOLLOW_numericValue_in_trim889);
                    x=numericValue();

                    state._fsp--;

                    emit(73,x);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:205:4: TRI AIL FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim896); 
                    match(input,AIL,FOLLOW_AIL_in_trim898); 
                    match(input,FIX,FOLLOW_FIX_in_trim900); 
                    pushFollow(FOLLOW_numericValue_in_trim904);
                    x=numericValue();

                    state._fsp--;

                    emit(74,x);

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:206:4: TRI AIL REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim911); 
                    match(input,AIL,FOLLOW_AIL_in_trim913); 
                    match(input,REL,FOLLOW_REL_in_trim915); 
                    pushFollow(FOLLOW_numericValue_in_trim919);
                    x=numericValue();

                    state._fsp--;

                    emit(75,x);

                    }
                    break;
                case 5 :
                    // flipsTargetUGA.g:207:4: TRI RUD FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim926); 
                    match(input,RUD,FOLLOW_RUD_in_trim928); 
                    match(input,FIX,FOLLOW_FIX_in_trim930); 
                    pushFollow(FOLLOW_numericValue_in_trim934);
                    x=numericValue();

                    state._fsp--;

                    emit(76,x);

                    }
                    break;
                case 6 :
                    // flipsTargetUGA.g:208:4: TRI RUD REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim941); 
                    match(input,RUD,FOLLOW_RUD_in_trim943); 
                    match(input,REL,FOLLOW_REL_in_trim945); 
                    pushFollow(FOLLOW_numericValue_in_trim949);
                    x=numericValue();

                    state._fsp--;

                    emit(77,x);

                    }
                    break;
                case 7 :
                    // flipsTargetUGA.g:209:4: TRI FLA FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim956); 
                    match(input,FLA,FOLLOW_FLA_in_trim958); 
                    match(input,FIX,FOLLOW_FIX_in_trim960); 
                    pushFollow(FOLLOW_numericValue_in_trim964);
                    x=numericValue();

                    state._fsp--;

                    emit(78,x);

                    }
                    break;
                case 8 :
                    // flipsTargetUGA.g:210:4: TRI FLA REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim971); 
                    match(input,FLA,FOLLOW_FLA_in_trim973); 
                    match(input,REL,FOLLOW_REL_in_trim975); 
                    pushFollow(FOLLOW_numericValue_in_trim979);
                    x=numericValue();

                    state._fsp--;

                    emit(79,x);

                    }
                    break;
                case 9 :
                    // flipsTargetUGA.g:211:4: TRI THR FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim986); 
                    match(input,THR,FOLLOW_THR_in_trim988); 
                    match(input,FIX,FOLLOW_FIX_in_trim990); 
                    pushFollow(FOLLOW_numericValue_in_trim994);
                    x=numericValue();

                    state._fsp--;

                    emit(80,x);

                    }
                    break;
                case 10 :
                    // flipsTargetUGA.g:212:4: TRI THR REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1001); 
                    match(input,THR,FOLLOW_THR_in_trim1003); 
                    match(input,REL,FOLLOW_REL_in_trim1005); 
                    pushFollow(FOLLOW_numericValue_in_trim1009);
                    x=numericValue();

                    state._fsp--;

                    emit(81,x);

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
    // $ANTLR end "trim"


    // $ANTLR start "time"
    // flipsTargetUGA.g:217:1: time : ( TIM FIX x= numericValue | TIM REL x= numericValue );
    public final void time() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:217:6: ( TIM FIX x= numericValue | TIM REL x= numericValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TIM) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==FIX) ) {
                    alt9=1;
                }
                else if ( (LA9_1==REL) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // flipsTargetUGA.g:217:8: TIM FIX x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1023); 
                    match(input,FIX,FOLLOW_FIX_in_time1025); 
                    pushFollow(FOLLOW_numericValue_in_time1029);
                    x=numericValue();

                    state._fsp--;

                    emit(82,x);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:218:4: TIM REL x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1036); 
                    match(input,REL,FOLLOW_REL_in_time1038); 
                    pushFollow(FOLLOW_numericValue_in_time1042);
                    x=numericValue();

                    state._fsp--;

                    emit(83,x);

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
    // $ANTLR end "time"


    // $ANTLR start "radius"
    // flipsTargetUGA.g:221:1: radius : RAD x= numericValue ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUGA.g:221:8: ( RAD x= numericValue )
            // flipsTargetUGA.g:221:10: RAD x= numericValue
            {
            match(input,RAD,FOLLOW_RAD_in_radius1054); 
            pushFollow(FOLLOW_numericValue_in_radius1058);
            x=numericValue();

            state._fsp--;

            emit(84,x);

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
    // $ANTLR end "radius"


    // $ANTLR start "direction"
    // flipsTargetUGA.g:223:1: direction : ( DIR L | DIR R | DIR CW | DIR CCW );
    public final void direction() throws RecognitionException {
        try {
            // flipsTargetUGA.g:224:2: ( DIR L | DIR R | DIR CW | DIR CCW )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DIR) ) {
                switch ( input.LA(2) ) {
                case L:
                    {
                    alt10=1;
                    }
                    break;
                case R:
                    {
                    alt10=2;
                    }
                    break;
                case CW:
                    {
                    alt10=3;
                    }
                    break;
                case CCW:
                    {
                    alt10=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // flipsTargetUGA.g:224:4: DIR L
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1069); 
                    match(input,L,FOLLOW_L_in_direction1071); 
                    emit(85);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:225:4: DIR R
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1078); 
                    match(input,R,FOLLOW_R_in_direction1080); 
                    emit(86);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:226:4: DIR CW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1087); 
                    match(input,CW,FOLLOW_CW_in_direction1089); 
                    emit(87);

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:227:4: DIR CCW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1096); 
                    match(input,CCW,FOLLOW_CCW_in_direction1098); 
                    emit(88);

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
    // $ANTLR end "direction"


    // $ANTLR start "numericValue"
    // flipsTargetUGA.g:232:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        Token y=null;
        int x = 0;


        try {
            // flipsTargetUGA.g:233:2: (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral )
            int alt11=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                    alt11=1;
                }
                else if ( (LA11_2==FloatingPointLiteral) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // flipsTargetUGA.g:233:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1119);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:235:10: y= FloatingPointLiteral
                    {
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1136); 
                    r = Double.parseDouble(y.getText());

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:237:10: '-' y= FloatingPointLiteral
                    {
                    match(input,52,FOLLOW_52_in_numericValue1158); 
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1162); 
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
    // flipsTargetUGA.g:241:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        Token x=null;

        try {
            // flipsTargetUGA.g:242:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // flipsTargetUGA.g:242:4: x= BinaryLiteral
                    {
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1190); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:244:4: x= OctalLiteral
                    {
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1201); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:246:4: x= DecimalLiteral
                    {
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1212); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsTargetUGA.g:248:4: x= HexLiteral
                    {
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1223); 
                    r = Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;
                case 5 :
                    // flipsTargetUGA.g:250:4: '-' x= BinaryLiteral
                    {
                    match(input,52,FOLLOW_52_in_integerValue1232); 
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1236); 
                    r = -Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 6 :
                    // flipsTargetUGA.g:252:4: '-' x= OctalLiteral
                    {
                    match(input,52,FOLLOW_52_in_integerValue1245); 
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1249); 
                    r = -Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 7 :
                    // flipsTargetUGA.g:254:4: '-' x= DecimalLiteral
                    {
                    match(input,52,FOLLOW_52_in_integerValue1258); 
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1262); 
                    r = -Integer.parseInt(x.getText());

                    }
                    break;
                case 8 :
                    // flipsTargetUGA.g:256:4: '-' x= HexLiteral
                    {
                    match(input,52,FOLLOW_52_in_integerValue1271); 
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1275); 
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA4_eotS =
        "\31\uffff";
    static final String DFA4_eofS =
        "\31\uffff";
    static final String DFA4_minS =
        "\1\10\1\11\7\12\20\uffff";
    static final String DFA4_maxS =
        "\1\10\1\22\2\14\5\13\20\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20";
    static final String DFA4_specialS =
        "\31\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11\1\12\1\13",
            "\1\14\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "143:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue );";
        }
    }
    static final String DFA5_eotS =
        "\27\uffff";
    static final String DFA5_eofS =
        "\27\uffff";
    static final String DFA5_minS =
        "\1\23\1\11\7\12\16\uffff";
    static final String DFA5_maxS =
        "\1\23\1\22\7\13\16\uffff";
    static final String DFA5_acceptS =
        "\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA5_specialS =
        "\27\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "163:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );";
        }
    }
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\21\uffff";
    static final String DFA7_minS =
        "\1\27\1\30\5\12\12\uffff";
    static final String DFA7_maxS =
        "\1\27\1\34\5\13\12\uffff";
    static final String DFA7_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "189:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR FIX x= numericValue | ACT THR REL x= numericValue );";
        }
    }
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\35\1\30\5\12\12\uffff";
    static final String DFA8_maxS =
        "\1\35\1\34\5\13\12\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA8_specialS =
        "\21\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "203:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\46\4\uffff\1\46\4\uffff";
    static final String DFA12_maxS =
        "\1\64\4\uffff\1\51\4\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "241:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_instruction_in_flightPlan44 = new BitSet(new long[]{0x00000001E0980172L});
    public static final BitSet FOLLOW_fly_in_instruction68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiter_in_instruction73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_instruction78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_instruction83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_velocity_in_instruction88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actuator_in_instruction98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_in_instruction103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_instruction108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_instruction113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_instruction118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_fly130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTR_in_loiter140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command150 = new BitSet(new long[]{0x001003C000000000L});
    public static final BitSet FOLLOW_integerValue_in_command154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command161 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAR_in_command163 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_command167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position180 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position184 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position195 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position197 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position199 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GEO_in_position214 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position227 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position229 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position242 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position244 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position255 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GEO_in_position259 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position270 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_position272 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position274 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_position287 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position289 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position300 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_position302 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position304 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_position317 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position319 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_position332 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position334 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position345 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_position347 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position349 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position360 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_position362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position364 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position375 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_position377 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position379 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position390 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_position392 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position394 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position405 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_position407 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position409 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_position413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity426 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_velocity428 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity430 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity441 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_velocity443 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity445 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_velocity458 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity460 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity471 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_velocity473 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity475 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity486 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_velocity488 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity490 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity501 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_velocity503 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity505 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity516 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_velocity518 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity520 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity531 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_velocity533 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity535 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_velocity548 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity550 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_velocity563 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity565 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity576 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_velocity578 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity580 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity591 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_velocity593 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity595 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_velocity608 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity610 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_velocity623 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity625 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AIR_in_speed645 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_speed647 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed658 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AIR_in_speed660 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_speed662 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed673 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_GND_in_speed675 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_speed677 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed688 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_GND_in_speed690 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_speed692 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator709 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_actuator711 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator713 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator724 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_actuator726 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator728 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator739 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_actuator741 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator743 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator754 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_actuator756 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator758 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator769 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_actuator771 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator773 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator784 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_actuator786 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator788 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator799 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_actuator801 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator803 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator814 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_actuator816 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator818 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator829 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_actuator831 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator833 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator844 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_actuator846 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator848 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim866 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_trim868 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim870 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim881 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_trim883 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim885 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim896 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_trim898 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim900 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim911 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_trim913 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim915 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_trim928 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim930 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim941 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_trim943 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim945 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim956 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_trim958 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim960 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim971 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_trim973 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim975 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim986 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_trim988 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim990 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1001 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_trim1003 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim1005 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1023 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_time1025 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1036 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_time1038 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAD_in_radius1054 = new BitSet(new long[]{0x001003E000000000L});
    public static final BitSet FOLLOW_numericValue_in_radius1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1069 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_L_in_direction1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1078 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_R_in_direction1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1087 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CW_in_direction1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1096 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_CCW_in_direction1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_numericValue1158 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_integerValue1232 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_integerValue1245 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_integerValue1258 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_integerValue1271 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1275 = new BitSet(new long[]{0x0000000000000002L});

}