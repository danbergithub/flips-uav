// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsTargetUdbLogo.g 2010-09-13 18:30:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsTargetUdbLogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLY", "LTR", "CMD", "PAR", "POS", "X", "FIX", "REL", "GEO", "Y", "Z", "ROL", "PIT", "YAW", "PRE", "VEL", "SPD", "AIR", "GND", "ACT", "ELE", "AIL", "RUD", "FLA", "THR", "PCT", "RPM", "TRI", "TIM", "RAD", "DIR", "L", "R", "CW", "CCW", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Identifier", "StringLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'-'"
    };
    public static final int AIL=25;
    public static final int FIX=10;
    public static final int THR=28;
    public static final int FLA=27;
    public static final int SPD=20;
    public static final int OctalLiteral=41;
    public static final int AIR=21;
    public static final int LineComment=53;
    public static final int Exponent=50;
    public static final int YAW=17;
    public static final int PRE=18;
    public static final int EOF=-1;
    public static final int HexDigit=49;
    public static final int Identifier=44;
    public static final int ROL=15;
    public static final int TIM=32;
    public static final int T__54=54;
    public static final int Comment=52;
    public static final int POS=8;
    public static final int RAD=33;
    public static final int ELE=24;
    public static final int PAR=7;
    public static final int GEO=12;
    public static final int HexLiteral=43;
    public static final int ACT=23;
    public static final int GND=22;
    public static final int L=35;
    public static final int VEL=19;
    public static final int TRI=31;
    public static final int CMD=6;
    public static final int PIT=16;
    public static final int REL=11;
    public static final int R=36;
    public static final int Digit=46;
    public static final int DecimalLiteral=42;
    public static final int Y=13;
    public static final int X=9;
    public static final int CCW=38;
    public static final int Z=14;
    public static final int StringLiteral=45;
    public static final int CW=37;
    public static final int WS=51;
    public static final int FLY=4;
    public static final int RUD=26;
    public static final int LTR=5;
    public static final int DIR=34;
    public static final int NonZeroDigit=47;
    public static final int BinaryLiteral=40;
    public static final int BinaryDigit=48;
    public static final int FloatingPointLiteral=39;
    public static final int PCT=29;
    public static final int RPM=30;

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

      public void emitNoTab(String instruction) {
        output.append(instruction + "\n");
      }
      
      public void emit(String instruction) {
        output.append("\t" + instruction + "\n");
      }

      public void emit(String instruction, double value) {
        output.append("\t" + instruction + "(" + value + ")" + "\n");
      }

      public void emit(String instruction, double value0, double value1) {
        output.append("\t" + instruction + "(" + value0 + "," + value1 + ")" + "\n");
      }



    // $ANTLR start "flightPlan"
    // flipsTargetUdbLogo.g:54:1: flightPlan : ( instruction )* ;
    public final void flightPlan() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:55:2: ( ( instruction )* )
            // flipsTargetUdbLogo.g:55:4: ( instruction )*
            {
            emitNoTab("const struct logoInstructionDef instructions[] = {\n");
            // flipsTargetUdbLogo.g:56:3: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FLY && LA1_0<=CMD)||LA1_0==POS||(LA1_0>=VEL && LA1_0<=SPD)||LA1_0==ACT||(LA1_0>=TRI && LA1_0<=DIR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flipsTargetUdbLogo.g:56:3: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_flightPlan38);
            	    instruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            emitNoTab("} ;");

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
    // flipsTargetUdbLogo.g:60:1: instruction : ( fly | loiter | command | position | velocity | speed | actuator | trim | time | radius | direction );
    public final void instruction() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:61:2: ( fly | loiter | command | position | velocity | speed | actuator | trim | time | radius | direction )
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
                    // flipsTargetUdbLogo.g:61:4: fly
                    {
                    pushFollow(FOLLOW_fly_in_instruction54);
                    fly();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:62:4: loiter
                    {
                    pushFollow(FOLLOW_loiter_in_instruction59);
                    loiter();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:63:4: command
                    {
                    pushFollow(FOLLOW_command_in_instruction64);
                    command();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:64:4: position
                    {
                    pushFollow(FOLLOW_position_in_instruction69);
                    position();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:65:4: velocity
                    {
                    pushFollow(FOLLOW_velocity_in_instruction74);
                    velocity();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:66:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_instruction79);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:67:4: actuator
                    {
                    pushFollow(FOLLOW_actuator_in_instruction84);
                    actuator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:68:4: trim
                    {
                    pushFollow(FOLLOW_trim_in_instruction89);
                    trim();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:69:4: time
                    {
                    pushFollow(FOLLOW_time_in_instruction94);
                    time();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:70:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_instruction99);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:71:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_instruction104);
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
    // flipsTargetUdbLogo.g:76:1: fly : FLY ;
    public final void fly() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:76:5: ( FLY )
            // flipsTargetUdbLogo.g:76:7: FLY
            {
            match(input,FLY,FOLLOW_FLY_in_fly116); 
            emit("");

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
    // flipsTargetUdbLogo.g:78:1: loiter : LTR ;
    public final void loiter() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:78:8: ( LTR )
            // flipsTargetUdbLogo.g:78:10: LTR
            {
            match(input,LTR,FOLLOW_LTR_in_loiter126); 
            emit("");

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
    // flipsTargetUdbLogo.g:80:1: command : ( CMD x= integerValue | CMD PAR y= numericValue );
    public final void command() throws RecognitionException {
        int x = 0;

        double y = 0.0;


        try {
            // flipsTargetUdbLogo.g:80:9: ( CMD x= integerValue | CMD PAR y= numericValue )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CMD) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==PAR) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=BinaryLiteral && LA3_1<=HexLiteral)||LA3_1==54) ) {
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
                    // flipsTargetUdbLogo.g:80:11: CMD x= integerValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command136); 
                    pushFollow(FOLLOW_integerValue_in_command140);
                    x=integerValue();

                    state._fsp--;

                    emit("// CMD " + x + "\n");

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:81:4: CMD PAR y= numericValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command147); 
                    match(input,PAR,FOLLOW_PAR_in_command149); 
                    pushFollow(FOLLOW_numericValue_in_command153);
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


    // $ANTLR start "position"
    // flipsTargetUdbLogo.g:86:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue );
    public final void position() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:86:9: ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue )
            int alt4=16;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // flipsTargetUdbLogo.g:86:11: POS X FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position166); 
                    match(input,X,FOLLOW_X_in_position168); 
                    match(input,FIX,FOLLOW_FIX_in_position170); 
                    pushFollow(FOLLOW_numericValue_in_position174);
                    x=numericValue();

                    state._fsp--;

                    emit("EAST",x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:87:4: POS X REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position181); 
                    match(input,X,FOLLOW_X_in_position183); 
                    match(input,REL,FOLLOW_REL_in_position185); 
                    pushFollow(FOLLOW_numericValue_in_position189);
                    x=numericValue();

                    state._fsp--;

                    emit("FD",x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:88:4: POS X GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position196); 
                    match(input,X,FOLLOW_X_in_position198); 
                    match(input,GEO,FOLLOW_GEO_in_position200); 
                    pushFollow(FOLLOW_numericValue_in_position204);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS X GEO " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:89:4: POS Y FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position211); 
                    match(input,Y,FOLLOW_Y_in_position213); 
                    match(input,FIX,FOLLOW_FIX_in_position215); 
                    pushFollow(FOLLOW_numericValue_in_position219);
                    x=numericValue();

                    state._fsp--;

                    emit("NORTH",x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:90:4: POS Y REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position226); 
                    match(input,Y,FOLLOW_Y_in_position228); 
                    match(input,REL,FOLLOW_REL_in_position230); 
                    pushFollow(FOLLOW_numericValue_in_position234);
                    x=numericValue();

                    state._fsp--;

                    emit("RT",x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:91:4: POS Y GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position241); 
                    match(input,Y,FOLLOW_Y_in_position243); 
                    match(input,GEO,FOLLOW_GEO_in_position245); 
                    pushFollow(FOLLOW_numericValue_in_position249);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS Y GEO " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:92:4: POS Z FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position256); 
                    match(input,Z,FOLLOW_Z_in_position258); 
                    match(input,FIX,FOLLOW_FIX_in_position260); 
                    pushFollow(FOLLOW_numericValue_in_position264);
                    x=numericValue();

                    state._fsp--;

                    emit("SET_ALT",-x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:93:4: POS Z REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position271); 
                    match(input,Z,FOLLOW_Z_in_position273); 
                    match(input,REL,FOLLOW_REL_in_position275); 
                    pushFollow(FOLLOW_numericValue_in_position279);
                    x=numericValue();

                    state._fsp--;

                    emit("ALT_DOWN",x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:94:4: POS ROL FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position286); 
                    match(input,ROL,FOLLOW_ROL_in_position288); 
                    match(input,FIX,FOLLOW_FIX_in_position290); 
                    pushFollow(FOLLOW_numericValue_in_position294);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS ROL FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:95:4: POS ROL REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position301); 
                    match(input,ROL,FOLLOW_ROL_in_position303); 
                    match(input,REL,FOLLOW_REL_in_position305); 
                    pushFollow(FOLLOW_numericValue_in_position309);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS ROL REL " + x);

                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:96:4: POS PIT FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position316); 
                    match(input,PIT,FOLLOW_PIT_in_position318); 
                    match(input,FIX,FOLLOW_FIX_in_position320); 
                    pushFollow(FOLLOW_numericValue_in_position324);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PIT FIX " + x);

                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:97:4: POS PIT REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position331); 
                    match(input,PIT,FOLLOW_PIT_in_position333); 
                    match(input,REL,FOLLOW_REL_in_position335); 
                    pushFollow(FOLLOW_numericValue_in_position339);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PIT REL " + x);

                    }
                    break;
                case 13 :
                    // flipsTargetUdbLogo.g:98:4: POS YAW FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position346); 
                    match(input,YAW,FOLLOW_YAW_in_position348); 
                    match(input,FIX,FOLLOW_FIX_in_position350); 
                    pushFollow(FOLLOW_numericValue_in_position354);
                    x=numericValue();

                    state._fsp--;

                    emit("SET_ANGLE",x);

                    }
                    break;
                case 14 :
                    // flipsTargetUdbLogo.g:99:4: POS YAW REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position361); 
                    match(input,YAW,FOLLOW_YAW_in_position363); 
                    match(input,REL,FOLLOW_REL_in_position365); 
                    pushFollow(FOLLOW_numericValue_in_position369);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS YAW REL " + x);

                    }
                    break;
                case 15 :
                    // flipsTargetUdbLogo.g:100:4: POS PRE FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position376); 
                    match(input,PRE,FOLLOW_PRE_in_position378); 
                    match(input,FIX,FOLLOW_FIX_in_position380); 
                    pushFollow(FOLLOW_numericValue_in_position384);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PRE FIX " + x);

                    }
                    break;
                case 16 :
                    // flipsTargetUdbLogo.g:101:4: POS PRE REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position391); 
                    match(input,PRE,FOLLOW_PRE_in_position393); 
                    match(input,REL,FOLLOW_REL_in_position395); 
                    pushFollow(FOLLOW_numericValue_in_position399);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PRE REL " + x);

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
    // flipsTargetUdbLogo.g:106:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );
    public final void velocity() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:106:9: ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue )
            int alt5=14;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsTargetUdbLogo.g:106:11: VEL X FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity412); 
                    match(input,X,FOLLOW_X_in_velocity414); 
                    match(input,FIX,FOLLOW_FIX_in_velocity416); 
                    pushFollow(FOLLOW_numericValue_in_velocity420);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL X FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:107:4: VEL X REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity427); 
                    match(input,X,FOLLOW_X_in_velocity429); 
                    match(input,REL,FOLLOW_REL_in_velocity431); 
                    pushFollow(FOLLOW_numericValue_in_velocity435);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL X REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:108:4: VEL Y FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity442); 
                    match(input,Y,FOLLOW_Y_in_velocity444); 
                    match(input,FIX,FOLLOW_FIX_in_velocity446); 
                    pushFollow(FOLLOW_numericValue_in_velocity450);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Y FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:109:4: VEL Y REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity457); 
                    match(input,Y,FOLLOW_Y_in_velocity459); 
                    match(input,REL,FOLLOW_REL_in_velocity461); 
                    pushFollow(FOLLOW_numericValue_in_velocity465);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Y REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:110:4: VEL Z FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity472); 
                    match(input,Z,FOLLOW_Z_in_velocity474); 
                    match(input,FIX,FOLLOW_FIX_in_velocity476); 
                    pushFollow(FOLLOW_numericValue_in_velocity480);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Z FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:111:4: VEL Z REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity487); 
                    match(input,Z,FOLLOW_Z_in_velocity489); 
                    match(input,REL,FOLLOW_REL_in_velocity491); 
                    pushFollow(FOLLOW_numericValue_in_velocity495);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Z REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:112:4: VEL ROL FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity502); 
                    match(input,ROL,FOLLOW_ROL_in_velocity504); 
                    match(input,FIX,FOLLOW_FIX_in_velocity506); 
                    pushFollow(FOLLOW_numericValue_in_velocity510);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL ROL FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:113:4: VEL ROL REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity517); 
                    match(input,ROL,FOLLOW_ROL_in_velocity519); 
                    match(input,REL,FOLLOW_REL_in_velocity521); 
                    pushFollow(FOLLOW_numericValue_in_velocity525);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL ROL REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:114:4: VEL PIT FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity532); 
                    match(input,PIT,FOLLOW_PIT_in_velocity534); 
                    match(input,FIX,FOLLOW_FIX_in_velocity536); 
                    pushFollow(FOLLOW_numericValue_in_velocity540);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PIT FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:115:4: VEL PIT REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity547); 
                    match(input,PIT,FOLLOW_PIT_in_velocity549); 
                    match(input,REL,FOLLOW_REL_in_velocity551); 
                    pushFollow(FOLLOW_numericValue_in_velocity555);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PIT REL " + x);

                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:116:4: VEL YAW FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity562); 
                    match(input,YAW,FOLLOW_YAW_in_velocity564); 
                    match(input,FIX,FOLLOW_FIX_in_velocity566); 
                    pushFollow(FOLLOW_numericValue_in_velocity570);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL YAW FIX " + x);

                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:117:4: VEL YAW REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity577); 
                    match(input,YAW,FOLLOW_YAW_in_velocity579); 
                    match(input,REL,FOLLOW_REL_in_velocity581); 
                    pushFollow(FOLLOW_numericValue_in_velocity585);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL YAW REL " + x);

                    }
                    break;
                case 13 :
                    // flipsTargetUdbLogo.g:118:4: VEL PRE FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity592); 
                    match(input,PRE,FOLLOW_PRE_in_velocity594); 
                    match(input,FIX,FOLLOW_FIX_in_velocity596); 
                    pushFollow(FOLLOW_numericValue_in_velocity600);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PRE FIX " + x);

                    }
                    break;
                case 14 :
                    // flipsTargetUdbLogo.g:119:4: VEL PRE REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity607); 
                    match(input,PRE,FOLLOW_PRE_in_velocity609); 
                    match(input,REL,FOLLOW_REL_in_velocity611); 
                    pushFollow(FOLLOW_numericValue_in_velocity615);
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
    // flipsTargetUdbLogo.g:124:1: speed : ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:124:7: ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue )
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
                    // flipsTargetUdbLogo.g:124:9: SPD AIR FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed629); 
                    match(input,AIR,FOLLOW_AIR_in_speed631); 
                    match(input,FIX,FOLLOW_FIX_in_speed633); 
                    pushFollow(FOLLOW_numericValue_in_speed637);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD AIR FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:125:4: SPD AIR REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed644); 
                    match(input,AIR,FOLLOW_AIR_in_speed646); 
                    match(input,REL,FOLLOW_REL_in_speed648); 
                    pushFollow(FOLLOW_numericValue_in_speed652);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD AIR REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:126:4: SPD GND FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed659); 
                    match(input,GND,FOLLOW_GND_in_speed661); 
                    match(input,FIX,FOLLOW_FIX_in_speed663); 
                    pushFollow(FOLLOW_numericValue_in_speed667);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD GND FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:127:4: SPD GND REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed674); 
                    match(input,GND,FOLLOW_GND_in_speed676); 
                    match(input,REL,FOLLOW_REL_in_speed678); 
                    pushFollow(FOLLOW_numericValue_in_speed682);
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
    // flipsTargetUdbLogo.g:132:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );
    public final void actuator() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:132:9: ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // flipsTargetUdbLogo.g:132:11: ACT ELE FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator695); 
                    match(input,ELE,FOLLOW_ELE_in_actuator697); 
                    match(input,FIX,FOLLOW_FIX_in_actuator699); 
                    pushFollow(FOLLOW_numericValue_in_actuator703);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT ELE FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:133:4: ACT ELE REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator710); 
                    match(input,ELE,FOLLOW_ELE_in_actuator712); 
                    match(input,REL,FOLLOW_REL_in_actuator714); 
                    pushFollow(FOLLOW_numericValue_in_actuator718);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT ELE REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:134:4: ACT AIL FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator725); 
                    match(input,AIL,FOLLOW_AIL_in_actuator727); 
                    match(input,FIX,FOLLOW_FIX_in_actuator729); 
                    pushFollow(FOLLOW_numericValue_in_actuator733);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT AIL FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:135:4: ACT AIL REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator740); 
                    match(input,AIL,FOLLOW_AIL_in_actuator742); 
                    match(input,REL,FOLLOW_REL_in_actuator744); 
                    pushFollow(FOLLOW_numericValue_in_actuator748);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT AIL REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:136:4: ACT RUD FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator755); 
                    match(input,RUD,FOLLOW_RUD_in_actuator757); 
                    match(input,FIX,FOLLOW_FIX_in_actuator759); 
                    pushFollow(FOLLOW_numericValue_in_actuator763);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT RUD FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:137:4: ACT RUD REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator770); 
                    match(input,RUD,FOLLOW_RUD_in_actuator772); 
                    match(input,REL,FOLLOW_REL_in_actuator774); 
                    pushFollow(FOLLOW_numericValue_in_actuator778);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT RUD REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:138:4: ACT FLA FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator785); 
                    match(input,FLA,FOLLOW_FLA_in_actuator787); 
                    match(input,FIX,FOLLOW_FIX_in_actuator789); 
                    pushFollow(FOLLOW_numericValue_in_actuator793);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT FLA FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:139:4: ACT FLA REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator800); 
                    match(input,FLA,FOLLOW_FLA_in_actuator802); 
                    match(input,REL,FOLLOW_REL_in_actuator804); 
                    pushFollow(FOLLOW_numericValue_in_actuator808);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT FLA REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:140:4: ACT THR PCT x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator815); 
                    match(input,THR,FOLLOW_THR_in_actuator817); 
                    match(input,PCT,FOLLOW_PCT_in_actuator819); 
                    pushFollow(FOLLOW_numericValue_in_actuator823);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT THR PCT " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:141:4: ACT THR RPM x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator830); 
                    match(input,THR,FOLLOW_THR_in_actuator832); 
                    match(input,RPM,FOLLOW_RPM_in_actuator834); 
                    pushFollow(FOLLOW_numericValue_in_actuator838);
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
    // flipsTargetUdbLogo.g:146:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );
    public final void trim() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:146:6: ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // flipsTargetUdbLogo.g:146:8: TRI ELE FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim852); 
                    match(input,ELE,FOLLOW_ELE_in_trim854); 
                    match(input,FIX,FOLLOW_FIX_in_trim856); 
                    pushFollow(FOLLOW_numericValue_in_trim860);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI ELE FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:147:4: TRI ELE REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim867); 
                    match(input,ELE,FOLLOW_ELE_in_trim869); 
                    match(input,REL,FOLLOW_REL_in_trim871); 
                    pushFollow(FOLLOW_numericValue_in_trim875);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI ELE REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:148:4: TRI AIL FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim882); 
                    match(input,AIL,FOLLOW_AIL_in_trim884); 
                    match(input,FIX,FOLLOW_FIX_in_trim886); 
                    pushFollow(FOLLOW_numericValue_in_trim890);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI AIL FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:149:4: TRI AIL REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim897); 
                    match(input,AIL,FOLLOW_AIL_in_trim899); 
                    match(input,REL,FOLLOW_REL_in_trim901); 
                    pushFollow(FOLLOW_numericValue_in_trim905);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI AIL REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:150:4: TRI RUD FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim912); 
                    match(input,RUD,FOLLOW_RUD_in_trim914); 
                    match(input,FIX,FOLLOW_FIX_in_trim916); 
                    pushFollow(FOLLOW_numericValue_in_trim920);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI RUD FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:151:4: TRI RUD REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim927); 
                    match(input,RUD,FOLLOW_RUD_in_trim929); 
                    match(input,REL,FOLLOW_REL_in_trim931); 
                    pushFollow(FOLLOW_numericValue_in_trim935);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI RUD REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:152:4: TRI FLA FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim942); 
                    match(input,FLA,FOLLOW_FLA_in_trim944); 
                    match(input,FIX,FOLLOW_FIX_in_trim946); 
                    pushFollow(FOLLOW_numericValue_in_trim950);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI FLA FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:153:4: TRI FLA REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim957); 
                    match(input,FLA,FOLLOW_FLA_in_trim959); 
                    match(input,REL,FOLLOW_REL_in_trim961); 
                    pushFollow(FOLLOW_numericValue_in_trim965);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI FLA REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:154:4: TRI THR FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim972); 
                    match(input,THR,FOLLOW_THR_in_trim974); 
                    match(input,FIX,FOLLOW_FIX_in_trim976); 
                    pushFollow(FOLLOW_numericValue_in_trim980);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI THR FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:155:4: TRI THR REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim987); 
                    match(input,THR,FOLLOW_THR_in_trim989); 
                    match(input,REL,FOLLOW_REL_in_trim991); 
                    pushFollow(FOLLOW_numericValue_in_trim995);
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
    // flipsTargetUdbLogo.g:160:1: time : ( TIM FIX x= numericValue | TIM REL x= numericValue );
    public final void time() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:160:6: ( TIM FIX x= numericValue | TIM REL x= numericValue )
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
                    // flipsTargetUdbLogo.g:160:8: TIM FIX x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1009); 
                    match(input,FIX,FOLLOW_FIX_in_time1011); 
                    pushFollow(FOLLOW_numericValue_in_time1015);
                    x=numericValue();

                    state._fsp--;

                    emit("// TIM FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:161:4: TIM REL x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1022); 
                    match(input,REL,FOLLOW_REL_in_time1024); 
                    pushFollow(FOLLOW_numericValue_in_time1028);
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
    // flipsTargetUdbLogo.g:164:1: radius : RAD x= numericValue ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:164:8: ( RAD x= numericValue )
            // flipsTargetUdbLogo.g:164:10: RAD x= numericValue
            {
            match(input,RAD,FOLLOW_RAD_in_radius1040); 
            pushFollow(FOLLOW_numericValue_in_radius1044);
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
    // flipsTargetUdbLogo.g:166:1: direction : ( DIR L | DIR R | DIR CW | DIR CCW );
    public final void direction() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:167:2: ( DIR L | DIR R | DIR CW | DIR CCW )
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
                    // flipsTargetUdbLogo.g:167:4: DIR L
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1055); 
                    match(input,L,FOLLOW_L_in_direction1057); 
                    emit("// DIR L");

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:168:4: DIR R
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1064); 
                    match(input,R,FOLLOW_R_in_direction1066); 
                    emit("// DIR R");

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:169:4: DIR CW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1073); 
                    match(input,CW,FOLLOW_CW_in_direction1075); 
                    emit("// DIR CW");

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:170:4: DIR CCW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1082); 
                    match(input,CCW,FOLLOW_CCW_in_direction1084); 
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
    // flipsTargetUdbLogo.g:175:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        Token y=null;
        int x = 0;


        try {
            // flipsTargetUdbLogo.g:176:2: (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral )
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
            case 54:
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
                    // flipsTargetUdbLogo.g:176:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1105);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:178:10: y= FloatingPointLiteral
                    {
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1122); 
                    r = Double.parseDouble(y.getText());

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:180:10: '-' y= FloatingPointLiteral
                    {
                    match(input,54,FOLLOW_54_in_numericValue1144); 
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1148); 
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
    // flipsTargetUdbLogo.g:184:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        Token x=null;

        try {
            // flipsTargetUdbLogo.g:185:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // flipsTargetUdbLogo.g:185:4: x= BinaryLiteral
                    {
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1176); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:187:4: x= OctalLiteral
                    {
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1187); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:189:4: x= DecimalLiteral
                    {
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1198); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:191:4: x= HexLiteral
                    {
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1209); 
                    r = Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:193:4: '-' x= BinaryLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1218); 
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1222); 
                    r = -Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:195:4: '-' x= OctalLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1231); 
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1235); 
                    r = -Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:197:4: '-' x= DecimalLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1244); 
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1248); 
                    r = -Integer.parseInt(x.getText());

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:199:4: '-' x= HexLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1257); 
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1261); 
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
            return "86:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue );";
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
            return "106:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );";
        }
    }
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\21\uffff";
    static final String DFA7_minS =
        "\1\27\1\30\4\12\1\35\12\uffff";
    static final String DFA7_maxS =
        "\1\27\1\34\4\13\1\36\12\uffff";
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
            return "132:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );";
        }
    }
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\37\1\30\5\12\12\uffff";
    static final String DFA8_maxS =
        "\1\37\1\34\5\13\12\uffff";
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
            return "146:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\50\4\uffff\1\50\4\uffff";
    static final String DFA12_maxS =
        "\1\66\4\uffff\1\53\4\uffff";
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
            return "184:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_instruction_in_flightPlan38 = new BitSet(new long[]{0x0000000780980172L});
    public static final BitSet FOLLOW_fly_in_instruction54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiter_in_instruction59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_instruction64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_instruction69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_velocity_in_instruction74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actuator_in_instruction84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_in_instruction89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_instruction94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_instruction99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_instruction104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_fly116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTR_in_loiter126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command136 = new BitSet(new long[]{0x00400F0000000000L});
    public static final BitSet FOLLOW_integerValue_in_command140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAR_in_command149 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_command153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position166 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position168 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position170 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position183 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position185 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position196 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position198 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GEO_in_position200 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position213 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position215 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position228 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position230 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position243 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GEO_in_position245 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_position258 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position260 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position271 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_position273 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position275 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_position288 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position290 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_position303 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position305 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position316 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_position318 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position320 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position331 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_position333 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position335 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position346 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_position348 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position350 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position361 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_position363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position365 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position376 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_position378 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position380 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_position393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position395 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity412 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_velocity414 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity416 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity427 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_velocity429 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity431 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity442 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_velocity444 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity446 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_velocity459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity461 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity472 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_velocity474 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity476 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity487 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_velocity489 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity491 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_velocity504 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity506 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity517 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_velocity519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity521 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity532 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_velocity534 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity536 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity547 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_velocity549 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity551 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity562 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_velocity564 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity566 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity577 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_velocity579 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity581 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_velocity594 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity596 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_velocity609 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity611 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed629 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AIR_in_speed631 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_speed633 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed644 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AIR_in_speed646 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_speed648 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed659 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_GND_in_speed661 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_speed663 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed674 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_GND_in_speed676 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_speed678 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator695 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_actuator697 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator699 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator710 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_actuator712 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator714 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator725 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_actuator727 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator729 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator740 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_actuator742 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator744 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator755 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_actuator757 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator759 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator770 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_actuator772 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator774 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator785 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_actuator787 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator789 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator800 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_actuator802 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator804 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator815 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_actuator817 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PCT_in_actuator819 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator830 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_actuator832 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPM_in_actuator834 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim852 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_trim854 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim856 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim867 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_trim869 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim871 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim882 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_trim884 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim886 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim897 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_trim899 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim901 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim912 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_trim914 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim916 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim927 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_trim929 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim931 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim942 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_trim944 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim946 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim957 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_trim959 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim961 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim972 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_trim974 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim976 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim987 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_trim989 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim991 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1009 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_time1011 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1022 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_time1024 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAD_in_radius1040 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_radius1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1055 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_L_in_direction1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1064 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_R_in_direction1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1073 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_CW_in_direction1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1082 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_CCW_in_direction1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_numericValue1144 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1218 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1231 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1244 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1257 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1261 = new BitSet(new long[]{0x0000000000000002L});

}