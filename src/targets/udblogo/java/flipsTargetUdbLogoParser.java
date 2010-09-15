// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsTargetUdbLogo.g 2010-09-14 22:36:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsTargetUdbLogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLY", "LTR", "CMD", "PAR", "RPT", "NUM", "TIM", "FRV", "END", "POS", "X", "FIX", "REL", "GEO", "Y", "Z", "ROL", "PIT", "YAW", "PRE", "VEL", "SPD", "AIR", "GND", "ACT", "ELE", "AIL", "RUD", "FLA", "THR", "PCT", "RPM", "TRI", "RAD", "DIR", "L", "R", "CW", "CCW", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Identifier", "StringLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'-'"
    };
    public static final int AIL=30;
    public static final int FIX=15;
    public static final int THR=33;
    public static final int FLA=32;
    public static final int OctalLiteral=45;
    public static final int SPD=25;
    public static final int AIR=26;
    public static final int LineComment=57;
    public static final int Exponent=54;
    public static final int YAW=22;
    public static final int PRE=23;
    public static final int EOF=-1;
    public static final int HexDigit=53;
    public static final int Identifier=48;
    public static final int ROL=20;
    public static final int TIM=10;
    public static final int T__58=58;
    public static final int Comment=56;
    public static final int FRV=11;
    public static final int POS=13;
    public static final int RAD=37;
    public static final int ELE=29;
    public static final int PAR=7;
    public static final int GEO=17;
    public static final int HexLiteral=47;
    public static final int ACT=28;
    public static final int GND=27;
    public static final int L=39;
    public static final int VEL=24;
    public static final int TRI=36;
    public static final int CMD=6;
    public static final int REL=16;
    public static final int PIT=21;
    public static final int R=40;
    public static final int Digit=50;
    public static final int DecimalLiteral=46;
    public static final int Y=18;
    public static final int X=14;
    public static final int NUM=9;
    public static final int CCW=42;
    public static final int Z=19;
    public static final int StringLiteral=49;
    public static final int RPT=8;
    public static final int CW=41;
    public static final int WS=55;
    public static final int FLY=4;
    public static final int RUD=31;
    public static final int LTR=5;
    public static final int DIR=38;
    public static final int NonZeroDigit=51;
    public static final int BinaryLiteral=44;
    public static final int BinaryDigit=52;
    public static final int FloatingPointLiteral=43;
    public static final int PCT=34;
    public static final int END=12;
    public static final int RPM=35;

    // delegates
    // delegators


        public flipsTargetUdbLogoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsTargetUdbLogoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsTargetUdbLogoParser.tokenNames; }
    public String getGrammarFileName() { return "flipsTargetUdbLogo.g"; }


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



    // $ANTLR start "flightPlan"
    // flipsTargetUdbLogo.g:60:1: flightPlan : ( instruction )* ;
    public final void flightPlan() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:61:2: ( ( instruction )* )
            // flipsTargetUdbLogo.g:61:4: ( instruction )*
            {
            emit("const struct logoInstructionDef instructions[] = {");
            indent++;
            // flipsTargetUdbLogo.g:63:3: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FLY && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flipsTargetUdbLogo.g:63:3: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_flightPlan42);
            	    instruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            indent--;
            emit("} ;");

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
    // flipsTargetUdbLogo.g:68:1: instruction : ( fly | loiter | command | repeat | position | velocity | speed | actuator | trim | time | radius | direction );
    public final void instruction() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:69:2: ( fly | loiter | command | repeat | position | velocity | speed | actuator | trim | time | radius | direction )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // flipsTargetUdbLogo.g:69:4: fly
                    {
                    pushFollow(FOLLOW_fly_in_instruction62);
                    fly();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:70:4: loiter
                    {
                    pushFollow(FOLLOW_loiter_in_instruction67);
                    loiter();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:71:4: command
                    {
                    pushFollow(FOLLOW_command_in_instruction72);
                    command();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:72:4: repeat
                    {
                    pushFollow(FOLLOW_repeat_in_instruction77);
                    repeat();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:73:4: position
                    {
                    pushFollow(FOLLOW_position_in_instruction82);
                    position();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:74:4: velocity
                    {
                    pushFollow(FOLLOW_velocity_in_instruction87);
                    velocity();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:75:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_instruction92);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:76:4: actuator
                    {
                    pushFollow(FOLLOW_actuator_in_instruction97);
                    actuator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:77:4: trim
                    {
                    pushFollow(FOLLOW_trim_in_instruction102);
                    trim();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:78:4: time
                    {
                    pushFollow(FOLLOW_time_in_instruction107);
                    time();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:79:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_instruction112);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:80:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_instruction117);
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
    // flipsTargetUdbLogo.g:85:1: fly : FLY ;
    public final void fly() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:85:5: ( FLY )
            // flipsTargetUdbLogo.g:85:7: FLY
            {
            match(input,FLY,FOLLOW_FLY_in_fly129); 

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
    // flipsTargetUdbLogo.g:87:1: loiter : LTR ;
    public final void loiter() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:87:8: ( LTR )
            // flipsTargetUdbLogo.g:87:10: LTR
            {
            match(input,LTR,FOLLOW_LTR_in_loiter137); 

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
    // flipsTargetUdbLogo.g:89:1: command : ( CMD x= integerValue | CMD PAR y= numericValue );
    public final void command() throws RecognitionException {
        int x = 0;

        double y = 0.0;


        try {
            // flipsTargetUdbLogo.g:89:9: ( CMD x= integerValue | CMD PAR y= numericValue )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CMD) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==PAR) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=BinaryLiteral && LA3_1<=HexLiteral)||LA3_1==58) ) {
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
                    // flipsTargetUdbLogo.g:89:11: CMD x= integerValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command145); 
                    pushFollow(FOLLOW_integerValue_in_command149);
                    x=integerValue();

                    state._fsp--;

                    emit("// CMD " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:90:4: CMD PAR y= numericValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command156); 
                    match(input,PAR,FOLLOW_PAR_in_command158); 
                    pushFollow(FOLLOW_numericValue_in_command162);
                    y=numericValue();

                    state._fsp--;

                    emit("// CMD PAR " + y);

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


    // $ANTLR start "repeat"
    // flipsTargetUdbLogo.g:93:1: repeat : ( RPT NUM x= numericValue | RPT TIM x= numericValue | RPT FRV | RPT END );
    public final void repeat() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:93:8: ( RPT NUM x= numericValue | RPT TIM x= numericValue | RPT FRV | RPT END )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RPT) ) {
                switch ( input.LA(2) ) {
                case NUM:
                    {
                    alt4=1;
                    }
                    break;
                case TIM:
                    {
                    alt4=2;
                    }
                    break;
                case FRV:
                    {
                    alt4=3;
                    }
                    break;
                case END:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // flipsTargetUdbLogo.g:93:10: RPT NUM x= numericValue
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat174); 
                    match(input,NUM,FOLLOW_NUM_in_repeat176); 
                    pushFollow(FOLLOW_numericValue_in_repeat180);
                    x=numericValue();

                    state._fsp--;

                    emit("REPEAT",x);
                    indent++;

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:94:4: RPT TIM x= numericValue
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat189); 
                    match(input,TIM,FOLLOW_TIM_in_repeat191); 
                    pushFollow(FOLLOW_numericValue_in_repeat195);
                    x=numericValue();

                    state._fsp--;

                    emit("// RPT TIM " + x);
                    indent++;

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:95:4: RPT FRV
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat204); 
                    match(input,FRV,FOLLOW_FRV_in_repeat206); 
                    emit("REPEAT_FOREVER");
                    indent++;

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:96:4: RPT END
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat215); 
                    match(input,END,FOLLOW_END_in_repeat217); 
                    indent--;
                    emit("END");

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
    // $ANTLR end "repeat"


    // $ANTLR start "position"
    // flipsTargetUdbLogo.g:101:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue | POS X FIX x= numericValue POS Y FIX y= numericValue );
    public final void position() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsTargetUdbLogo.g:101:9: ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue | POS X FIX x= numericValue POS Y FIX y= numericValue )
            int alt5=17;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsTargetUdbLogo.g:101:11: POS X FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position232); 
                    match(input,X,FOLLOW_X_in_position234); 
                    match(input,FIX,FOLLOW_FIX_in_position236); 
                    pushFollow(FOLLOW_numericValue_in_position240);
                    x=numericValue();

                    state._fsp--;

                    emit("EAST",x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:102:4: POS X REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position247); 
                    match(input,X,FOLLOW_X_in_position249); 
                    match(input,REL,FOLLOW_REL_in_position251); 
                    pushFollow(FOLLOW_numericValue_in_position255);
                    x=numericValue();

                    state._fsp--;

                    emit("FD",x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:103:4: POS X GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position262); 
                    match(input,X,FOLLOW_X_in_position264); 
                    match(input,GEO,FOLLOW_GEO_in_position266); 
                    pushFollow(FOLLOW_numericValue_in_position270);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS X GEO " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:104:4: ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue
                    {
                    if ( (input.LA(1)>=FLY && input.LA(1)<=END)||(input.LA(1)>=X && input.LA(1)<=58) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,POS,FOLLOW_POS_in_position290); 
                    match(input,Y,FOLLOW_Y_in_position292); 
                    match(input,FIX,FOLLOW_FIX_in_position294); 
                    pushFollow(FOLLOW_numericValue_in_position298);
                    x=numericValue();

                    state._fsp--;

                    emit("NORTH",x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:105:4: POS Y REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position305); 
                    match(input,Y,FOLLOW_Y_in_position307); 
                    match(input,REL,FOLLOW_REL_in_position309); 
                    pushFollow(FOLLOW_numericValue_in_position313);
                    x=numericValue();

                    state._fsp--;

                    emit("RT",x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:106:4: POS Y GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position320); 
                    match(input,Y,FOLLOW_Y_in_position322); 
                    match(input,GEO,FOLLOW_GEO_in_position324); 
                    pushFollow(FOLLOW_numericValue_in_position328);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS Y GEO " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:107:4: POS Z FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position335); 
                    match(input,Z,FOLLOW_Z_in_position337); 
                    match(input,FIX,FOLLOW_FIX_in_position339); 
                    pushFollow(FOLLOW_numericValue_in_position343);
                    x=numericValue();

                    state._fsp--;

                    emit("SET_ALT",-x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:108:4: POS Z REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position350); 
                    match(input,Z,FOLLOW_Z_in_position352); 
                    match(input,REL,FOLLOW_REL_in_position354); 
                    pushFollow(FOLLOW_numericValue_in_position358);
                    x=numericValue();

                    state._fsp--;

                    emit("ALT_DOWN",x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:109:4: POS ROL FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position365); 
                    match(input,ROL,FOLLOW_ROL_in_position367); 
                    match(input,FIX,FOLLOW_FIX_in_position369); 
                    pushFollow(FOLLOW_numericValue_in_position373);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS ROL FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:110:4: POS ROL REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position380); 
                    match(input,ROL,FOLLOW_ROL_in_position382); 
                    match(input,REL,FOLLOW_REL_in_position384); 
                    pushFollow(FOLLOW_numericValue_in_position388);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS ROL REL " + x);

                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:111:4: POS PIT FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position395); 
                    match(input,PIT,FOLLOW_PIT_in_position397); 
                    match(input,FIX,FOLLOW_FIX_in_position399); 
                    pushFollow(FOLLOW_numericValue_in_position403);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PIT FIX " + x);

                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:112:4: POS PIT REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position410); 
                    match(input,PIT,FOLLOW_PIT_in_position412); 
                    match(input,REL,FOLLOW_REL_in_position414); 
                    pushFollow(FOLLOW_numericValue_in_position418);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PIT REL " + x);

                    }
                    break;
                case 13 :
                    // flipsTargetUdbLogo.g:113:4: POS YAW FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position425); 
                    match(input,YAW,FOLLOW_YAW_in_position427); 
                    match(input,FIX,FOLLOW_FIX_in_position429); 
                    pushFollow(FOLLOW_numericValue_in_position433);
                    x=numericValue();

                    state._fsp--;

                    emit("SET_ANGLE",x);

                    }
                    break;
                case 14 :
                    // flipsTargetUdbLogo.g:114:4: POS YAW REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position440); 
                    match(input,YAW,FOLLOW_YAW_in_position442); 
                    match(input,REL,FOLLOW_REL_in_position444); 
                    pushFollow(FOLLOW_numericValue_in_position448);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS YAW REL " + x);

                    }
                    break;
                case 15 :
                    // flipsTargetUdbLogo.g:115:4: POS PRE FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position455); 
                    match(input,PRE,FOLLOW_PRE_in_position457); 
                    match(input,FIX,FOLLOW_FIX_in_position459); 
                    pushFollow(FOLLOW_numericValue_in_position463);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PRE FIX " + x);

                    }
                    break;
                case 16 :
                    // flipsTargetUdbLogo.g:116:4: POS PRE REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position470); 
                    match(input,PRE,FOLLOW_PRE_in_position472); 
                    match(input,REL,FOLLOW_REL_in_position474); 
                    pushFollow(FOLLOW_numericValue_in_position478);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PRE REL " + x);

                    }
                    break;
                case 17 :
                    // flipsTargetUdbLogo.g:117:4: POS X FIX x= numericValue POS Y FIX y= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position485); 
                    match(input,X,FOLLOW_X_in_position487); 
                    match(input,FIX,FOLLOW_FIX_in_position489); 
                    pushFollow(FOLLOW_numericValue_in_position493);
                    x=numericValue();

                    state._fsp--;

                    match(input,POS,FOLLOW_POS_in_position495); 
                    match(input,Y,FOLLOW_Y_in_position497); 
                    match(input,FIX,FOLLOW_FIX_in_position499); 
                    pushFollow(FOLLOW_numericValue_in_position503);
                    y=numericValue();

                    state._fsp--;

                    emit("SET_POS",x,y);

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
    // flipsTargetUdbLogo.g:122:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );
    public final void velocity() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:122:9: ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue )
            int alt6=14;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // flipsTargetUdbLogo.g:122:11: VEL X FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity516); 
                    match(input,X,FOLLOW_X_in_velocity518); 
                    match(input,FIX,FOLLOW_FIX_in_velocity520); 
                    pushFollow(FOLLOW_numericValue_in_velocity524);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL X FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:123:4: VEL X REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity531); 
                    match(input,X,FOLLOW_X_in_velocity533); 
                    match(input,REL,FOLLOW_REL_in_velocity535); 
                    pushFollow(FOLLOW_numericValue_in_velocity539);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL X REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:124:4: VEL Y FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity546); 
                    match(input,Y,FOLLOW_Y_in_velocity548); 
                    match(input,FIX,FOLLOW_FIX_in_velocity550); 
                    pushFollow(FOLLOW_numericValue_in_velocity554);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Y FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:125:4: VEL Y REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity561); 
                    match(input,Y,FOLLOW_Y_in_velocity563); 
                    match(input,REL,FOLLOW_REL_in_velocity565); 
                    pushFollow(FOLLOW_numericValue_in_velocity569);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Y REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:126:4: VEL Z FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity576); 
                    match(input,Z,FOLLOW_Z_in_velocity578); 
                    match(input,FIX,FOLLOW_FIX_in_velocity580); 
                    pushFollow(FOLLOW_numericValue_in_velocity584);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Z FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:127:4: VEL Z REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity591); 
                    match(input,Z,FOLLOW_Z_in_velocity593); 
                    match(input,REL,FOLLOW_REL_in_velocity595); 
                    pushFollow(FOLLOW_numericValue_in_velocity599);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Z REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:128:4: VEL ROL FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity606); 
                    match(input,ROL,FOLLOW_ROL_in_velocity608); 
                    match(input,FIX,FOLLOW_FIX_in_velocity610); 
                    pushFollow(FOLLOW_numericValue_in_velocity614);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL ROL FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:129:4: VEL ROL REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity621); 
                    match(input,ROL,FOLLOW_ROL_in_velocity623); 
                    match(input,REL,FOLLOW_REL_in_velocity625); 
                    pushFollow(FOLLOW_numericValue_in_velocity629);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL ROL REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:130:4: VEL PIT FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity636); 
                    match(input,PIT,FOLLOW_PIT_in_velocity638); 
                    match(input,FIX,FOLLOW_FIX_in_velocity640); 
                    pushFollow(FOLLOW_numericValue_in_velocity644);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PIT FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:131:4: VEL PIT REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity651); 
                    match(input,PIT,FOLLOW_PIT_in_velocity653); 
                    match(input,REL,FOLLOW_REL_in_velocity655); 
                    pushFollow(FOLLOW_numericValue_in_velocity659);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PIT REL " + x);

                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:132:4: VEL YAW FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity666); 
                    match(input,YAW,FOLLOW_YAW_in_velocity668); 
                    match(input,FIX,FOLLOW_FIX_in_velocity670); 
                    pushFollow(FOLLOW_numericValue_in_velocity674);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL YAW FIX " + x);

                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:133:4: VEL YAW REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity681); 
                    match(input,YAW,FOLLOW_YAW_in_velocity683); 
                    match(input,REL,FOLLOW_REL_in_velocity685); 
                    pushFollow(FOLLOW_numericValue_in_velocity689);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL YAW REL " + x);

                    }
                    break;
                case 13 :
                    // flipsTargetUdbLogo.g:134:4: VEL PRE FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity696); 
                    match(input,PRE,FOLLOW_PRE_in_velocity698); 
                    match(input,FIX,FOLLOW_FIX_in_velocity700); 
                    pushFollow(FOLLOW_numericValue_in_velocity704);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PRE FIX " + x);

                    }
                    break;
                case 14 :
                    // flipsTargetUdbLogo.g:135:4: VEL PRE REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity711); 
                    match(input,PRE,FOLLOW_PRE_in_velocity713); 
                    match(input,REL,FOLLOW_REL_in_velocity715); 
                    pushFollow(FOLLOW_numericValue_in_velocity719);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PRE REL " + x);

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
    // flipsTargetUdbLogo.g:140:1: speed : ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:140:7: ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SPD) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==AIR) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==FIX) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==REL) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==GND) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==FIX) ) {
                        alt7=3;
                    }
                    else if ( (LA7_3==REL) ) {
                        alt7=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // flipsTargetUdbLogo.g:140:9: SPD AIR FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed733); 
                    match(input,AIR,FOLLOW_AIR_in_speed735); 
                    match(input,FIX,FOLLOW_FIX_in_speed737); 
                    pushFollow(FOLLOW_numericValue_in_speed741);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD AIR FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:141:4: SPD AIR REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed748); 
                    match(input,AIR,FOLLOW_AIR_in_speed750); 
                    match(input,REL,FOLLOW_REL_in_speed752); 
                    pushFollow(FOLLOW_numericValue_in_speed756);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD AIR REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:142:4: SPD GND FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed763); 
                    match(input,GND,FOLLOW_GND_in_speed765); 
                    match(input,FIX,FOLLOW_FIX_in_speed767); 
                    pushFollow(FOLLOW_numericValue_in_speed771);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD GND FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:143:4: SPD GND REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed778); 
                    match(input,GND,FOLLOW_GND_in_speed780); 
                    match(input,REL,FOLLOW_REL_in_speed782); 
                    pushFollow(FOLLOW_numericValue_in_speed786);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD GND REL " + x);

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
    // flipsTargetUdbLogo.g:148:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );
    public final void actuator() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:148:9: ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // flipsTargetUdbLogo.g:148:11: ACT ELE FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator799); 
                    match(input,ELE,FOLLOW_ELE_in_actuator801); 
                    match(input,FIX,FOLLOW_FIX_in_actuator803); 
                    pushFollow(FOLLOW_numericValue_in_actuator807);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT ELE FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:149:4: ACT ELE REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator814); 
                    match(input,ELE,FOLLOW_ELE_in_actuator816); 
                    match(input,REL,FOLLOW_REL_in_actuator818); 
                    pushFollow(FOLLOW_numericValue_in_actuator822);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT ELE REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:150:4: ACT AIL FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator829); 
                    match(input,AIL,FOLLOW_AIL_in_actuator831); 
                    match(input,FIX,FOLLOW_FIX_in_actuator833); 
                    pushFollow(FOLLOW_numericValue_in_actuator837);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT AIL FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:151:4: ACT AIL REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator844); 
                    match(input,AIL,FOLLOW_AIL_in_actuator846); 
                    match(input,REL,FOLLOW_REL_in_actuator848); 
                    pushFollow(FOLLOW_numericValue_in_actuator852);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT AIL REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:152:4: ACT RUD FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator859); 
                    match(input,RUD,FOLLOW_RUD_in_actuator861); 
                    match(input,FIX,FOLLOW_FIX_in_actuator863); 
                    pushFollow(FOLLOW_numericValue_in_actuator867);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT RUD FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:153:4: ACT RUD REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator874); 
                    match(input,RUD,FOLLOW_RUD_in_actuator876); 
                    match(input,REL,FOLLOW_REL_in_actuator878); 
                    pushFollow(FOLLOW_numericValue_in_actuator882);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT RUD REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:154:4: ACT FLA FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator889); 
                    match(input,FLA,FOLLOW_FLA_in_actuator891); 
                    match(input,FIX,FOLLOW_FIX_in_actuator893); 
                    pushFollow(FOLLOW_numericValue_in_actuator897);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT FLA FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:155:4: ACT FLA REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator904); 
                    match(input,FLA,FOLLOW_FLA_in_actuator906); 
                    match(input,REL,FOLLOW_REL_in_actuator908); 
                    pushFollow(FOLLOW_numericValue_in_actuator912);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT FLA REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:156:4: ACT THR PCT x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator919); 
                    match(input,THR,FOLLOW_THR_in_actuator921); 
                    match(input,PCT,FOLLOW_PCT_in_actuator923); 
                    pushFollow(FOLLOW_numericValue_in_actuator927);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT THR PCT " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:157:4: ACT THR RPM x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator934); 
                    match(input,THR,FOLLOW_THR_in_actuator936); 
                    match(input,RPM,FOLLOW_RPM_in_actuator938); 
                    pushFollow(FOLLOW_numericValue_in_actuator942);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT THR RPM " + x);

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
    // flipsTargetUdbLogo.g:162:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );
    public final void trim() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:162:6: ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue )
            int alt9=10;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // flipsTargetUdbLogo.g:162:8: TRI ELE FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim956); 
                    match(input,ELE,FOLLOW_ELE_in_trim958); 
                    match(input,FIX,FOLLOW_FIX_in_trim960); 
                    pushFollow(FOLLOW_numericValue_in_trim964);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI ELE FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:163:4: TRI ELE REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim971); 
                    match(input,ELE,FOLLOW_ELE_in_trim973); 
                    match(input,REL,FOLLOW_REL_in_trim975); 
                    pushFollow(FOLLOW_numericValue_in_trim979);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI ELE REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:164:4: TRI AIL FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim986); 
                    match(input,AIL,FOLLOW_AIL_in_trim988); 
                    match(input,FIX,FOLLOW_FIX_in_trim990); 
                    pushFollow(FOLLOW_numericValue_in_trim994);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI AIL FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:165:4: TRI AIL REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1001); 
                    match(input,AIL,FOLLOW_AIL_in_trim1003); 
                    match(input,REL,FOLLOW_REL_in_trim1005); 
                    pushFollow(FOLLOW_numericValue_in_trim1009);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI AIL REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:166:4: TRI RUD FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1016); 
                    match(input,RUD,FOLLOW_RUD_in_trim1018); 
                    match(input,FIX,FOLLOW_FIX_in_trim1020); 
                    pushFollow(FOLLOW_numericValue_in_trim1024);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI RUD FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:167:4: TRI RUD REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1031); 
                    match(input,RUD,FOLLOW_RUD_in_trim1033); 
                    match(input,REL,FOLLOW_REL_in_trim1035); 
                    pushFollow(FOLLOW_numericValue_in_trim1039);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI RUD REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:168:4: TRI FLA FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1046); 
                    match(input,FLA,FOLLOW_FLA_in_trim1048); 
                    match(input,FIX,FOLLOW_FIX_in_trim1050); 
                    pushFollow(FOLLOW_numericValue_in_trim1054);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI FLA FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:169:4: TRI FLA REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1061); 
                    match(input,FLA,FOLLOW_FLA_in_trim1063); 
                    match(input,REL,FOLLOW_REL_in_trim1065); 
                    pushFollow(FOLLOW_numericValue_in_trim1069);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI FLA REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:170:4: TRI THR FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1076); 
                    match(input,THR,FOLLOW_THR_in_trim1078); 
                    match(input,FIX,FOLLOW_FIX_in_trim1080); 
                    pushFollow(FOLLOW_numericValue_in_trim1084);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI THR FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:171:4: TRI THR REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1091); 
                    match(input,THR,FOLLOW_THR_in_trim1093); 
                    match(input,REL,FOLLOW_REL_in_trim1095); 
                    pushFollow(FOLLOW_numericValue_in_trim1099);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI THR REL " + x);

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
    // flipsTargetUdbLogo.g:176:1: time : ( TIM FIX x= numericValue | TIM REL x= numericValue );
    public final void time() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:176:6: ( TIM FIX x= numericValue | TIM REL x= numericValue )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TIM) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==FIX) ) {
                    alt10=1;
                }
                else if ( (LA10_1==REL) ) {
                    alt10=2;
                }
                else {
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
                    // flipsTargetUdbLogo.g:176:8: TIM FIX x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1113); 
                    match(input,FIX,FOLLOW_FIX_in_time1115); 
                    pushFollow(FOLLOW_numericValue_in_time1119);
                    x=numericValue();

                    state._fsp--;

                    emit("// TIM FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:177:4: TIM REL x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1126); 
                    match(input,REL,FOLLOW_REL_in_time1128); 
                    pushFollow(FOLLOW_numericValue_in_time1132);
                    x=numericValue();

                    state._fsp--;

                    emit("// TIM REL " + x);

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
    // flipsTargetUdbLogo.g:180:1: radius : RAD x= numericValue ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:180:8: ( RAD x= numericValue )
            // flipsTargetUdbLogo.g:180:10: RAD x= numericValue
            {
            match(input,RAD,FOLLOW_RAD_in_radius1144); 
            pushFollow(FOLLOW_numericValue_in_radius1148);
            x=numericValue();

            state._fsp--;

            emit("// RAD " + x);

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
    // flipsTargetUdbLogo.g:182:1: direction : ( DIR L | DIR R | DIR CW | DIR CCW );
    public final void direction() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:183:2: ( DIR L | DIR R | DIR CW | DIR CCW )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DIR) ) {
                switch ( input.LA(2) ) {
                case L:
                    {
                    alt11=1;
                    }
                    break;
                case R:
                    {
                    alt11=2;
                    }
                    break;
                case CW:
                    {
                    alt11=3;
                    }
                    break;
                case CCW:
                    {
                    alt11=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // flipsTargetUdbLogo.g:183:4: DIR L
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1159); 
                    match(input,L,FOLLOW_L_in_direction1161); 
                    emit("// DIR L");

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:184:4: DIR R
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1168); 
                    match(input,R,FOLLOW_R_in_direction1170); 
                    emit("// DIR R");

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:185:4: DIR CW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1177); 
                    match(input,CW,FOLLOW_CW_in_direction1179); 
                    emit("// DIR CW");

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:186:4: DIR CCW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1186); 
                    match(input,CCW,FOLLOW_CCW_in_direction1188); 
                    emit("// DIR CCW");

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
    // flipsTargetUdbLogo.g:191:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        Token y=null;
        int x = 0;


        try {
            // flipsTargetUdbLogo.g:192:2: (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral )
            int alt12=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                alt12=1;
                }
                break;
            case 58:
                {
                int LA12_2 = input.LA(2);

                if ( ((LA12_2>=BinaryLiteral && LA12_2<=HexLiteral)) ) {
                    alt12=1;
                }
                else if ( (LA12_2==FloatingPointLiteral) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // flipsTargetUdbLogo.g:192:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1209);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:194:10: y= FloatingPointLiteral
                    {
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1226); 
                    r = Double.parseDouble(y.getText());

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:196:10: '-' y= FloatingPointLiteral
                    {
                    match(input,58,FOLLOW_58_in_numericValue1248); 
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1252); 
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
    // flipsTargetUdbLogo.g:200:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        Token x=null;

        try {
            // flipsTargetUdbLogo.g:201:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // flipsTargetUdbLogo.g:201:4: x= BinaryLiteral
                    {
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1280); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:203:4: x= OctalLiteral
                    {
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1291); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:205:4: x= DecimalLiteral
                    {
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1302); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:207:4: x= HexLiteral
                    {
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1313); 
                    r = Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:209:4: '-' x= BinaryLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1322); 
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1326); 
                    r = -Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:211:4: '-' x= OctalLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1335); 
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1339); 
                    r = -Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:213:4: '-' x= DecimalLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1348); 
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1352); 
                    r = -Integer.parseInt(x.getText());

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:215:4: '-' x= HexLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1361); 
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1365); 
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA2_eotS =
        "\34\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\16\1\20\31\uffff";
    static final String DFA2_minS =
        "\3\4\1\7\1\11\1\uffff\7\15\1\16\1\uffff\1\16\12\uffff\2\17";
    static final String DFA2_maxS =
        "\4\72\1\15\1\uffff\1\27\1\33\2\41\1\20\1\72\1\52\1\27\1\uffff\1"+
        "\27\12\uffff\2\21";
    static final String DFA2_acceptS =
        "\5\uffff\1\5\10\uffff\1\1\1\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\11"+
        "\1\12\1\13\1\14\2\uffff";
    static final String DFA2_specialS =
        "\34\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\1\3\1\5\1\4\1\5\1\12\15\5\1\6\1\7\2\5\1\10\7\5\1\11"+
            "\1\13\1\14\24\5",
            "\11\16\1\15\55\16",
            "\11\20\1\17\55\20",
            "\1\21\5\uffff\1\5\36\uffff\4\21\12\uffff\1\21",
            "\4\22\1\5",
            "",
            "\1\5\1\23\3\uffff\6\23",
            "\1\5\14\uffff\2\24",
            "\1\5\17\uffff\5\25",
            "\1\5\17\uffff\5\26",
            "\1\5\1\uffff\2\27",
            "\1\5\35\uffff\5\30\12\uffff\1\30",
            "\1\5\31\uffff\4\31",
            "\1\16\3\uffff\1\32\5\16",
            "",
            "\1\20\3\uffff\1\33\5\20",
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
            "\1\5\2\16",
            "\1\5\2\20"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "68:1: instruction : ( fly | loiter | command | repeat | position | velocity | speed | actuator | trim | time | radius | direction );";
        }
    }
    static final String DFA5_eotS =
        "\50\uffff";
    static final String DFA5_eofS =
        "\31\uffff\4\37\1\uffff\1\37\2\uffff\5\37\2\uffff";
    static final String DFA5_minS =
        "\1\4\1\16\1\uffff\1\17\1\20\5\17\1\53\16\uffff\4\4\1\53\1\4\1\uffff"+
        "\1\16\5\4\1\17\1\uffff";
    static final String DFA5_maxS =
        "\1\72\1\27\1\uffff\2\21\5\20\1\72\16\uffff\4\72\1\57\1\72\1\uffff"+
        "\1\27\5\72\1\21\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\4\10\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\6\uffff\1\1\7\uffff\1\21";
    static final String DFA5_specialS =
        "\50\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\2\1\1\55\2",
            "\1\3\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "\1\12\1\13\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\36\1\31\1\32\1\33\1\34\12\uffff\1\35",
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
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\1\45\1\41\1\42\1\43\1\44",
            "\11\37\1\40\55\37",
            "",
            "\1\37\3\uffff\1\46\5\37",
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\11\37\1\40\55\37",
            "\1\47\2\37",
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
            return "101:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue | POS X FIX x= numericValue POS Y FIX y= numericValue );";
        }
    }
    static final String DFA6_eotS =
        "\27\uffff";
    static final String DFA6_eofS =
        "\27\uffff";
    static final String DFA6_minS =
        "\1\30\1\16\7\17\16\uffff";
    static final String DFA6_maxS =
        "\1\30\1\27\7\20\16\uffff";
    static final String DFA6_acceptS =
        "\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA6_specialS =
        "\27\uffff}>";
    static final String[] DFA6_transitionS = {
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "122:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );";
        }
    }
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\34\1\35\4\17\1\42\12\uffff";
    static final String DFA8_maxS =
        "\1\34\1\41\4\20\1\43\12\uffff";
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
            return "148:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );";
        }
    }
    static final String DFA9_eotS =
        "\21\uffff";
    static final String DFA9_eofS =
        "\21\uffff";
    static final String DFA9_minS =
        "\1\44\1\35\5\17\12\uffff";
    static final String DFA9_maxS =
        "\1\44\1\41\5\20\12\uffff";
    static final String DFA9_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA9_specialS =
        "\21\uffff}>";
    static final String[] DFA9_transitionS = {
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "162:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );";
        }
    }
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\54\4\uffff\1\54\4\uffff";
    static final String DFA13_maxS =
        "\1\72\4\uffff\1\57\4\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "200:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_instruction_in_flightPlan42 = new BitSet(new long[]{0x07FFFFFFFFFFFFF2L});
    public static final BitSet FOLLOW_fly_in_instruction62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiter_in_instruction67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_instruction72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_in_instruction77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_instruction82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_velocity_in_instruction87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actuator_in_instruction97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_in_instruction102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_instruction107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_instruction112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_instruction117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_fly129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTR_in_loiter137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command145 = new BitSet(new long[]{0x0400F00000000000L});
    public static final BitSet FOLLOW_integerValue_in_command149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command156 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAR_in_command158 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_command162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat174 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUM_in_repeat176 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_repeat180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat189 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TIM_in_repeat191 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_repeat195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat204 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FRV_in_repeat206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat215 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_in_repeat217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position232 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_in_position234 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position236 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_in_position249 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position251 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_in_position264 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_GEO_in_position266 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_position277 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_POS_in_position290 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_Y_in_position292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position294 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position305 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_Y_in_position307 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position309 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position320 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_Y_in_position322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_GEO_in_position324 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position335 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Z_in_position337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position339 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position350 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Z_in_position352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position354 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position365 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ROL_in_position367 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position369 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position380 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ROL_in_position382 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position384 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position395 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PIT_in_position397 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position399 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position410 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PIT_in_position412 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position414 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position425 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_YAW_in_position427 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position429 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_YAW_in_position442 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position444 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position455 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PRE_in_position457 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position459 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position470 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PRE_in_position472 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_position474 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position485 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_in_position487 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position489 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_POS_in_position495 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_Y_in_position497 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_position499 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_position503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_in_velocity518 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity520 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity531 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_in_velocity533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity535 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity546 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_Y_in_velocity548 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity550 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity561 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_Y_in_velocity563 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity565 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity576 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Z_in_velocity578 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity580 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity591 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Z_in_velocity593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity595 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity606 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ROL_in_velocity608 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity610 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ROL_in_velocity623 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity625 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity636 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PIT_in_velocity638 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity640 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity651 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PIT_in_velocity653 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity655 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity666 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_YAW_in_velocity668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity670 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity681 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_YAW_in_velocity683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity685 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity696 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PRE_in_velocity698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_velocity700 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity711 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PRE_in_velocity713 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_velocity715 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed733 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AIR_in_speed735 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_speed737 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed748 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AIR_in_speed750 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_speed752 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed763 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_GND_in_speed765 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_speed767 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed778 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_GND_in_speed780 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_speed782 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator799 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ELE_in_actuator801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_actuator803 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator814 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ELE_in_actuator816 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_actuator818 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator829 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AIL_in_actuator831 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_actuator833 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator844 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AIL_in_actuator846 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_actuator848 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator859 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RUD_in_actuator861 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_actuator863 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator874 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RUD_in_actuator876 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_actuator878 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator889 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FLA_in_actuator891 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_actuator893 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator904 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FLA_in_actuator906 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_actuator908 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator919 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THR_in_actuator921 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PCT_in_actuator923 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator934 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THR_in_actuator936 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPM_in_actuator938 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim956 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ELE_in_trim958 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_trim960 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim971 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ELE_in_trim973 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_trim975 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim986 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AIL_in_trim988 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_trim990 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1001 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AIL_in_trim1003 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_trim1005 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1016 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RUD_in_trim1018 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_trim1020 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1031 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RUD_in_trim1033 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_trim1035 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1046 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FLA_in_trim1048 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_trim1050 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1061 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FLA_in_trim1063 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_trim1065 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1076 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THR_in_trim1078 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_trim1080 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1091 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THR_in_trim1093 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_trim1095 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1113 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIX_in_time1115 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1126 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_REL_in_time1128 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAD_in_radius1144 = new BitSet(new long[]{0x0400F80000000000L});
    public static final BitSet FOLLOW_numericValue_in_radius1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1159 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_L_in_direction1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1168 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_R_in_direction1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1177 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_CW_in_direction1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1186 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_CCW_in_direction1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_numericValue1248 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1322 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1335 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1348 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1361 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1365 = new BitSet(new long[]{0x0000000000000002L});

}