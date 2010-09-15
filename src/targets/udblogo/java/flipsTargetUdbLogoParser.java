// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsTargetUdbLogo.g 2010-09-15 00:04:04

  import java.util.Queue;
  import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsTargetUdbLogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLY", "LTR", "CMD", "PAR", "StringLiteral", "RPT", "NUM", "TIM", "FRV", "END", "POS", "X", "FIX", "REL", "GEO", "Y", "Z", "ROL", "PIT", "YAW", "PRE", "VEL", "SPD", "AIR", "GND", "ACT", "ELE", "AIL", "RUD", "FLA", "THR", "PCT", "RPM", "TRI", "RAD", "DIR", "L", "R", "CW", "CCW", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Identifier", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'-'"
    };
    public static final int AIL=31;
    public static final int FIX=16;
    public static final int THR=34;
    public static final int FLA=33;
    public static final int OctalLiteral=46;
    public static final int SPD=26;
    public static final int AIR=27;
    public static final int LineComment=57;
    public static final int Exponent=54;
    public static final int YAW=23;
    public static final int PRE=24;
    public static final int EOF=-1;
    public static final int HexDigit=53;
    public static final int Identifier=49;
    public static final int ROL=21;
    public static final int TIM=11;
    public static final int T__58=58;
    public static final int Comment=56;
    public static final int FRV=12;
    public static final int POS=14;
    public static final int RAD=38;
    public static final int ELE=30;
    public static final int PAR=7;
    public static final int GEO=18;
    public static final int HexLiteral=48;
    public static final int ACT=29;
    public static final int GND=28;
    public static final int L=40;
    public static final int VEL=25;
    public static final int TRI=37;
    public static final int CMD=6;
    public static final int REL=17;
    public static final int PIT=22;
    public static final int R=41;
    public static final int Digit=50;
    public static final int DecimalLiteral=47;
    public static final int Y=19;
    public static final int X=15;
    public static final int NUM=10;
    public static final int CCW=43;
    public static final int Z=20;
    public static final int StringLiteral=8;
    public static final int RPT=9;
    public static final int CW=42;
    public static final int WS=55;
    public static final int FLY=4;
    public static final int RUD=32;
    public static final int LTR=5;
    public static final int DIR=39;
    public static final int NonZeroDigit=51;
    public static final int BinaryLiteral=45;
    public static final int BinaryDigit=52;
    public static final int FloatingPointLiteral=44;
    public static final int PCT=35;
    public static final int END=13;
    public static final int RPM=36;

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
      public Queue<String> commandParameters = new LinkedList<String>();

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
        output.append(instruction + "(" + (int)value + ")" + "\n"); // LOGO requires an int
      }

      public void emit(String instruction, double value0, double value1) {
        emitIndent();
        output.append(instruction + "(" + (int)value0 + "," + (int)value1 + ")" + "\n"); // LOGO requires an int
      }



    // $ANTLR start "flightPlan"
    // flipsTargetUdbLogo.g:66:1: flightPlan : ( instruction )* ;
    public final void flightPlan() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:67:2: ( ( instruction )* )
            // flipsTargetUdbLogo.g:67:4: ( instruction )*
            {
            emit("const struct logoInstructionDef instructions[] = {");
            indent++;
            // flipsTargetUdbLogo.g:69:3: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FLY && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flipsTargetUdbLogo.g:69:3: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_flightPlan48);
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
    // flipsTargetUdbLogo.g:74:1: instruction : ( fly | loiter | command | repeat | position | velocity | speed | actuator | trim | time | radius | direction );
    public final void instruction() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:75:2: ( fly | loiter | command | repeat | position | velocity | speed | actuator | trim | time | radius | direction )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // flipsTargetUdbLogo.g:75:4: fly
                    {
                    pushFollow(FOLLOW_fly_in_instruction68);
                    fly();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:76:4: loiter
                    {
                    pushFollow(FOLLOW_loiter_in_instruction73);
                    loiter();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:77:4: command
                    {
                    pushFollow(FOLLOW_command_in_instruction78);
                    command();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:78:4: repeat
                    {
                    pushFollow(FOLLOW_repeat_in_instruction83);
                    repeat();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:79:4: position
                    {
                    pushFollow(FOLLOW_position_in_instruction88);
                    position();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:80:4: velocity
                    {
                    pushFollow(FOLLOW_velocity_in_instruction93);
                    velocity();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:81:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_instruction98);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:82:4: actuator
                    {
                    pushFollow(FOLLOW_actuator_in_instruction103);
                    actuator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:83:4: trim
                    {
                    pushFollow(FOLLOW_trim_in_instruction108);
                    trim();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:84:4: time
                    {
                    pushFollow(FOLLOW_time_in_instruction113);
                    time();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:85:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_instruction118);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:86:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_instruction123);
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
    // flipsTargetUdbLogo.g:91:1: fly : FLY ;
    public final void fly() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:91:5: ( FLY )
            // flipsTargetUdbLogo.g:91:7: FLY
            {
            match(input,FLY,FOLLOW_FLY_in_fly135); 

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
    // flipsTargetUdbLogo.g:93:1: loiter : LTR ;
    public final void loiter() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:93:8: ( LTR )
            // flipsTargetUdbLogo.g:93:10: LTR
            {
            match(input,LTR,FOLLOW_LTR_in_loiter143); 

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
    // flipsTargetUdbLogo.g:95:1: command : ( CMD x= integerValue | CMD PAR y= numericValue | CMD PAR z= StringLiteral );
    public final void command() throws RecognitionException {
        Token z=null;
        int x = 0;

        double y = 0.0;


        try {
            // flipsTargetUdbLogo.g:95:9: ( CMD x= integerValue | CMD PAR y= numericValue | CMD PAR z= StringLiteral )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CMD) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==PAR) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==StringLiteral) ) {
                        alt3=3;
                    }
                    else if ( ((LA3_2>=FloatingPointLiteral && LA3_2<=HexLiteral)||LA3_2==58) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
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
                    // flipsTargetUdbLogo.g:95:11: CMD x= integerValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command151); 
                    pushFollow(FOLLOW_integerValue_in_command155);
                    x=integerValue();

                    state._fsp--;


                    String command = "";

                    // Get the command
                    switch(x) {
                      case 1:
                        command = "FLAG_ON(F_CROSS_TRACK)";
                        break;
                        
                      case 2: // FLAG_OFF
                        command = "FLAG_OFF(F_CROSS_TRACK)";
                        break;
                      
                      case 3:
                        command = "SET_ANGLE";
                        break;
                    }

                    // Get all parameters
                    String parameters = "";
                    if (commandParameters.size() > 0) {
                      for (int i = 0; i < commandParameters.size(); i++) {
                        String parameter = (String)commandParameters.poll();
                        parameters += parameter + ",";
                      }
                      parameters = "(" + parameters.substring(0,parameters.lastIndexOf(',')) + ")";
                    }

                    emit(command + parameters);
                    	

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:126:4: CMD PAR y= numericValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command163); 
                    match(input,PAR,FOLLOW_PAR_in_command165); 
                    pushFollow(FOLLOW_numericValue_in_command169);
                    y=numericValue();

                    state._fsp--;

                    commandParameters.add(String.valueOf((int)y));

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:127:4: CMD PAR z= StringLiteral
                    {
                    match(input,CMD,FOLLOW_CMD_in_command177); 
                    match(input,PAR,FOLLOW_PAR_in_command179); 
                    z=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_command183); 
                    commandParameters.add(z.getText());

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
    // flipsTargetUdbLogo.g:130:1: repeat : ( RPT NUM x= numericValue | RPT TIM x= numericValue | RPT FRV | RPT END );
    public final void repeat() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:130:8: ( RPT NUM x= numericValue | RPT TIM x= numericValue | RPT FRV | RPT END )
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
                    // flipsTargetUdbLogo.g:130:10: RPT NUM x= numericValue
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat195); 
                    match(input,NUM,FOLLOW_NUM_in_repeat197); 
                    pushFollow(FOLLOW_numericValue_in_repeat201);
                    x=numericValue();

                    state._fsp--;

                    emit("REPEAT",x);
                    indent++;

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:131:4: RPT TIM x= numericValue
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat210); 
                    match(input,TIM,FOLLOW_TIM_in_repeat212); 
                    pushFollow(FOLLOW_numericValue_in_repeat216);
                    x=numericValue();

                    state._fsp--;

                    emit("// RPT TIM " + x);
                    indent++;

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:132:4: RPT FRV
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat225); 
                    match(input,FRV,FOLLOW_FRV_in_repeat227); 
                    emit("REPEAT_FOREVER");
                    indent++;

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:133:4: RPT END
                    {
                    match(input,RPT,FOLLOW_RPT_in_repeat236); 
                    match(input,END,FOLLOW_END_in_repeat238); 
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
    // flipsTargetUdbLogo.g:138:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue | POS X FIX x= numericValue POS Y FIX y= numericValue );
    public final void position() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsTargetUdbLogo.g:138:9: ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue | POS X FIX x= numericValue POS Y FIX y= numericValue )
            int alt5=17;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsTargetUdbLogo.g:138:11: POS X FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position253); 
                    match(input,X,FOLLOW_X_in_position255); 
                    match(input,FIX,FOLLOW_FIX_in_position257); 
                    pushFollow(FOLLOW_numericValue_in_position261);
                    x=numericValue();

                    state._fsp--;

                    emit("EAST",x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:139:4: POS X REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position268); 
                    match(input,X,FOLLOW_X_in_position270); 
                    match(input,REL,FOLLOW_REL_in_position272); 
                    pushFollow(FOLLOW_numericValue_in_position276);
                    x=numericValue();

                    state._fsp--;

                    emit("FD",x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:140:4: POS X GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position283); 
                    match(input,X,FOLLOW_X_in_position285); 
                    match(input,GEO,FOLLOW_GEO_in_position287); 
                    pushFollow(FOLLOW_numericValue_in_position291);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS X GEO " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:141:4: ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue
                    {
                    if ( (input.LA(1)>=FLY && input.LA(1)<=END)||(input.LA(1)>=X && input.LA(1)<=58) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,POS,FOLLOW_POS_in_position311); 
                    match(input,Y,FOLLOW_Y_in_position313); 
                    match(input,FIX,FOLLOW_FIX_in_position315); 
                    pushFollow(FOLLOW_numericValue_in_position319);
                    x=numericValue();

                    state._fsp--;

                    emit("NORTH",x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:142:4: POS Y REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position326); 
                    match(input,Y,FOLLOW_Y_in_position328); 
                    match(input,REL,FOLLOW_REL_in_position330); 
                    pushFollow(FOLLOW_numericValue_in_position334);
                    x=numericValue();

                    state._fsp--;

                    emit("RT",x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:143:4: POS Y GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position341); 
                    match(input,Y,FOLLOW_Y_in_position343); 
                    match(input,GEO,FOLLOW_GEO_in_position345); 
                    pushFollow(FOLLOW_numericValue_in_position349);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS Y GEO " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:144:4: POS Z FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position356); 
                    match(input,Z,FOLLOW_Z_in_position358); 
                    match(input,FIX,FOLLOW_FIX_in_position360); 
                    pushFollow(FOLLOW_numericValue_in_position364);
                    x=numericValue();

                    state._fsp--;

                    emit("SET_ALT",-x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:145:4: POS Z REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position371); 
                    match(input,Z,FOLLOW_Z_in_position373); 
                    match(input,REL,FOLLOW_REL_in_position375); 
                    pushFollow(FOLLOW_numericValue_in_position379);
                    x=numericValue();

                    state._fsp--;

                    emit("ALT_DOWN",x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:146:4: POS ROL FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position386); 
                    match(input,ROL,FOLLOW_ROL_in_position388); 
                    match(input,FIX,FOLLOW_FIX_in_position390); 
                    pushFollow(FOLLOW_numericValue_in_position394);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS ROL FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:147:4: POS ROL REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position401); 
                    match(input,ROL,FOLLOW_ROL_in_position403); 
                    match(input,REL,FOLLOW_REL_in_position405); 
                    pushFollow(FOLLOW_numericValue_in_position409);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS ROL REL " + x);

                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:148:4: POS PIT FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position416); 
                    match(input,PIT,FOLLOW_PIT_in_position418); 
                    match(input,FIX,FOLLOW_FIX_in_position420); 
                    pushFollow(FOLLOW_numericValue_in_position424);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PIT FIX " + x);

                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:149:4: POS PIT REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position431); 
                    match(input,PIT,FOLLOW_PIT_in_position433); 
                    match(input,REL,FOLLOW_REL_in_position435); 
                    pushFollow(FOLLOW_numericValue_in_position439);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PIT REL " + x);

                    }
                    break;
                case 13 :
                    // flipsTargetUdbLogo.g:150:4: POS YAW FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position446); 
                    match(input,YAW,FOLLOW_YAW_in_position448); 
                    match(input,FIX,FOLLOW_FIX_in_position450); 
                    pushFollow(FOLLOW_numericValue_in_position454);
                    x=numericValue();

                    state._fsp--;

                    emit("SET_ANGLE",x);

                    }
                    break;
                case 14 :
                    // flipsTargetUdbLogo.g:151:4: POS YAW REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position461); 
                    match(input,YAW,FOLLOW_YAW_in_position463); 
                    match(input,REL,FOLLOW_REL_in_position465); 
                    pushFollow(FOLLOW_numericValue_in_position469);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS YAW REL " + x);

                    }
                    break;
                case 15 :
                    // flipsTargetUdbLogo.g:152:4: POS PRE FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position476); 
                    match(input,PRE,FOLLOW_PRE_in_position478); 
                    match(input,FIX,FOLLOW_FIX_in_position480); 
                    pushFollow(FOLLOW_numericValue_in_position484);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PRE FIX " + x);

                    }
                    break;
                case 16 :
                    // flipsTargetUdbLogo.g:153:4: POS PRE REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position491); 
                    match(input,PRE,FOLLOW_PRE_in_position493); 
                    match(input,REL,FOLLOW_REL_in_position495); 
                    pushFollow(FOLLOW_numericValue_in_position499);
                    x=numericValue();

                    state._fsp--;

                    emit("// POS PRE REL " + x);

                    }
                    break;
                case 17 :
                    // flipsTargetUdbLogo.g:154:4: POS X FIX x= numericValue POS Y FIX y= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position506); 
                    match(input,X,FOLLOW_X_in_position508); 
                    match(input,FIX,FOLLOW_FIX_in_position510); 
                    pushFollow(FOLLOW_numericValue_in_position514);
                    x=numericValue();

                    state._fsp--;

                    match(input,POS,FOLLOW_POS_in_position516); 
                    match(input,Y,FOLLOW_Y_in_position518); 
                    match(input,FIX,FOLLOW_FIX_in_position520); 
                    pushFollow(FOLLOW_numericValue_in_position524);
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
    // flipsTargetUdbLogo.g:159:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );
    public final void velocity() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:159:9: ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue )
            int alt6=14;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // flipsTargetUdbLogo.g:159:11: VEL X FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity537); 
                    match(input,X,FOLLOW_X_in_velocity539); 
                    match(input,FIX,FOLLOW_FIX_in_velocity541); 
                    pushFollow(FOLLOW_numericValue_in_velocity545);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL X FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:160:4: VEL X REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity552); 
                    match(input,X,FOLLOW_X_in_velocity554); 
                    match(input,REL,FOLLOW_REL_in_velocity556); 
                    pushFollow(FOLLOW_numericValue_in_velocity560);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL X REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:161:4: VEL Y FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity567); 
                    match(input,Y,FOLLOW_Y_in_velocity569); 
                    match(input,FIX,FOLLOW_FIX_in_velocity571); 
                    pushFollow(FOLLOW_numericValue_in_velocity575);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Y FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:162:4: VEL Y REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity582); 
                    match(input,Y,FOLLOW_Y_in_velocity584); 
                    match(input,REL,FOLLOW_REL_in_velocity586); 
                    pushFollow(FOLLOW_numericValue_in_velocity590);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Y REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:163:4: VEL Z FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity597); 
                    match(input,Z,FOLLOW_Z_in_velocity599); 
                    match(input,FIX,FOLLOW_FIX_in_velocity601); 
                    pushFollow(FOLLOW_numericValue_in_velocity605);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Z FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:164:4: VEL Z REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity612); 
                    match(input,Z,FOLLOW_Z_in_velocity614); 
                    match(input,REL,FOLLOW_REL_in_velocity616); 
                    pushFollow(FOLLOW_numericValue_in_velocity620);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL Z REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:165:4: VEL ROL FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity627); 
                    match(input,ROL,FOLLOW_ROL_in_velocity629); 
                    match(input,FIX,FOLLOW_FIX_in_velocity631); 
                    pushFollow(FOLLOW_numericValue_in_velocity635);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL ROL FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:166:4: VEL ROL REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity642); 
                    match(input,ROL,FOLLOW_ROL_in_velocity644); 
                    match(input,REL,FOLLOW_REL_in_velocity646); 
                    pushFollow(FOLLOW_numericValue_in_velocity650);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL ROL REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:167:4: VEL PIT FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity657); 
                    match(input,PIT,FOLLOW_PIT_in_velocity659); 
                    match(input,FIX,FOLLOW_FIX_in_velocity661); 
                    pushFollow(FOLLOW_numericValue_in_velocity665);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PIT FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:168:4: VEL PIT REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity672); 
                    match(input,PIT,FOLLOW_PIT_in_velocity674); 
                    match(input,REL,FOLLOW_REL_in_velocity676); 
                    pushFollow(FOLLOW_numericValue_in_velocity680);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PIT REL " + x);

                    }
                    break;
                case 11 :
                    // flipsTargetUdbLogo.g:169:4: VEL YAW FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity687); 
                    match(input,YAW,FOLLOW_YAW_in_velocity689); 
                    match(input,FIX,FOLLOW_FIX_in_velocity691); 
                    pushFollow(FOLLOW_numericValue_in_velocity695);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL YAW FIX " + x);

                    }
                    break;
                case 12 :
                    // flipsTargetUdbLogo.g:170:4: VEL YAW REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity702); 
                    match(input,YAW,FOLLOW_YAW_in_velocity704); 
                    match(input,REL,FOLLOW_REL_in_velocity706); 
                    pushFollow(FOLLOW_numericValue_in_velocity710);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL YAW REL " + x);

                    }
                    break;
                case 13 :
                    // flipsTargetUdbLogo.g:171:4: VEL PRE FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity717); 
                    match(input,PRE,FOLLOW_PRE_in_velocity719); 
                    match(input,FIX,FOLLOW_FIX_in_velocity721); 
                    pushFollow(FOLLOW_numericValue_in_velocity725);
                    x=numericValue();

                    state._fsp--;

                    emit("// VEL PRE FIX " + x);

                    }
                    break;
                case 14 :
                    // flipsTargetUdbLogo.g:172:4: VEL PRE REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity732); 
                    match(input,PRE,FOLLOW_PRE_in_velocity734); 
                    match(input,REL,FOLLOW_REL_in_velocity736); 
                    pushFollow(FOLLOW_numericValue_in_velocity740);
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
    // flipsTargetUdbLogo.g:177:1: speed : ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:177:7: ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue )
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
                    // flipsTargetUdbLogo.g:177:9: SPD AIR FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed754); 
                    match(input,AIR,FOLLOW_AIR_in_speed756); 
                    match(input,FIX,FOLLOW_FIX_in_speed758); 
                    pushFollow(FOLLOW_numericValue_in_speed762);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD AIR FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:178:4: SPD AIR REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed769); 
                    match(input,AIR,FOLLOW_AIR_in_speed771); 
                    match(input,REL,FOLLOW_REL_in_speed773); 
                    pushFollow(FOLLOW_numericValue_in_speed777);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD AIR REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:179:4: SPD GND FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed784); 
                    match(input,GND,FOLLOW_GND_in_speed786); 
                    match(input,FIX,FOLLOW_FIX_in_speed788); 
                    pushFollow(FOLLOW_numericValue_in_speed792);
                    x=numericValue();

                    state._fsp--;

                    emit("// SPD GND FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:180:4: SPD GND REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed799); 
                    match(input,GND,FOLLOW_GND_in_speed801); 
                    match(input,REL,FOLLOW_REL_in_speed803); 
                    pushFollow(FOLLOW_numericValue_in_speed807);
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
    // flipsTargetUdbLogo.g:185:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );
    public final void actuator() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:185:9: ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // flipsTargetUdbLogo.g:185:11: ACT ELE FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator820); 
                    match(input,ELE,FOLLOW_ELE_in_actuator822); 
                    match(input,FIX,FOLLOW_FIX_in_actuator824); 
                    pushFollow(FOLLOW_numericValue_in_actuator828);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT ELE FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:186:4: ACT ELE REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator835); 
                    match(input,ELE,FOLLOW_ELE_in_actuator837); 
                    match(input,REL,FOLLOW_REL_in_actuator839); 
                    pushFollow(FOLLOW_numericValue_in_actuator843);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT ELE REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:187:4: ACT AIL FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator850); 
                    match(input,AIL,FOLLOW_AIL_in_actuator852); 
                    match(input,FIX,FOLLOW_FIX_in_actuator854); 
                    pushFollow(FOLLOW_numericValue_in_actuator858);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT AIL FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:188:4: ACT AIL REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator865); 
                    match(input,AIL,FOLLOW_AIL_in_actuator867); 
                    match(input,REL,FOLLOW_REL_in_actuator869); 
                    pushFollow(FOLLOW_numericValue_in_actuator873);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT AIL REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:189:4: ACT RUD FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator880); 
                    match(input,RUD,FOLLOW_RUD_in_actuator882); 
                    match(input,FIX,FOLLOW_FIX_in_actuator884); 
                    pushFollow(FOLLOW_numericValue_in_actuator888);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT RUD FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:190:4: ACT RUD REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator895); 
                    match(input,RUD,FOLLOW_RUD_in_actuator897); 
                    match(input,REL,FOLLOW_REL_in_actuator899); 
                    pushFollow(FOLLOW_numericValue_in_actuator903);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT RUD REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:191:4: ACT FLA FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator910); 
                    match(input,FLA,FOLLOW_FLA_in_actuator912); 
                    match(input,FIX,FOLLOW_FIX_in_actuator914); 
                    pushFollow(FOLLOW_numericValue_in_actuator918);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT FLA FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:192:4: ACT FLA REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator925); 
                    match(input,FLA,FOLLOW_FLA_in_actuator927); 
                    match(input,REL,FOLLOW_REL_in_actuator929); 
                    pushFollow(FOLLOW_numericValue_in_actuator933);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT FLA REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:193:4: ACT THR PCT x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator940); 
                    match(input,THR,FOLLOW_THR_in_actuator942); 
                    match(input,PCT,FOLLOW_PCT_in_actuator944); 
                    pushFollow(FOLLOW_numericValue_in_actuator948);
                    x=numericValue();

                    state._fsp--;

                    emit("// ACT THR PCT " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:194:4: ACT THR RPM x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator955); 
                    match(input,THR,FOLLOW_THR_in_actuator957); 
                    match(input,RPM,FOLLOW_RPM_in_actuator959); 
                    pushFollow(FOLLOW_numericValue_in_actuator963);
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
    // flipsTargetUdbLogo.g:199:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );
    public final void trim() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:199:6: ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue )
            int alt9=10;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // flipsTargetUdbLogo.g:199:8: TRI ELE FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim977); 
                    match(input,ELE,FOLLOW_ELE_in_trim979); 
                    match(input,FIX,FOLLOW_FIX_in_trim981); 
                    pushFollow(FOLLOW_numericValue_in_trim985);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI ELE FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:200:4: TRI ELE REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim992); 
                    match(input,ELE,FOLLOW_ELE_in_trim994); 
                    match(input,REL,FOLLOW_REL_in_trim996); 
                    pushFollow(FOLLOW_numericValue_in_trim1000);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI ELE REL " + x);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:201:4: TRI AIL FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1007); 
                    match(input,AIL,FOLLOW_AIL_in_trim1009); 
                    match(input,FIX,FOLLOW_FIX_in_trim1011); 
                    pushFollow(FOLLOW_numericValue_in_trim1015);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI AIL FIX " + x);

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:202:4: TRI AIL REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1022); 
                    match(input,AIL,FOLLOW_AIL_in_trim1024); 
                    match(input,REL,FOLLOW_REL_in_trim1026); 
                    pushFollow(FOLLOW_numericValue_in_trim1030);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI AIL REL " + x);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:203:4: TRI RUD FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1037); 
                    match(input,RUD,FOLLOW_RUD_in_trim1039); 
                    match(input,FIX,FOLLOW_FIX_in_trim1041); 
                    pushFollow(FOLLOW_numericValue_in_trim1045);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI RUD FIX " + x);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:204:4: TRI RUD REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1052); 
                    match(input,RUD,FOLLOW_RUD_in_trim1054); 
                    match(input,REL,FOLLOW_REL_in_trim1056); 
                    pushFollow(FOLLOW_numericValue_in_trim1060);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI RUD REL " + x);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:205:4: TRI FLA FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1067); 
                    match(input,FLA,FOLLOW_FLA_in_trim1069); 
                    match(input,FIX,FOLLOW_FIX_in_trim1071); 
                    pushFollow(FOLLOW_numericValue_in_trim1075);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI FLA FIX " + x);

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:206:4: TRI FLA REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1082); 
                    match(input,FLA,FOLLOW_FLA_in_trim1084); 
                    match(input,REL,FOLLOW_REL_in_trim1086); 
                    pushFollow(FOLLOW_numericValue_in_trim1090);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI FLA REL " + x);

                    }
                    break;
                case 9 :
                    // flipsTargetUdbLogo.g:207:4: TRI THR FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1097); 
                    match(input,THR,FOLLOW_THR_in_trim1099); 
                    match(input,FIX,FOLLOW_FIX_in_trim1101); 
                    pushFollow(FOLLOW_numericValue_in_trim1105);
                    x=numericValue();

                    state._fsp--;

                    emit("// TRI THR FIX " + x);

                    }
                    break;
                case 10 :
                    // flipsTargetUdbLogo.g:208:4: TRI THR REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim1112); 
                    match(input,THR,FOLLOW_THR_in_trim1114); 
                    match(input,REL,FOLLOW_REL_in_trim1116); 
                    pushFollow(FOLLOW_numericValue_in_trim1120);
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
    // flipsTargetUdbLogo.g:213:1: time : ( TIM FIX x= numericValue | TIM REL x= numericValue );
    public final void time() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:213:6: ( TIM FIX x= numericValue | TIM REL x= numericValue )
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
                    // flipsTargetUdbLogo.g:213:8: TIM FIX x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1134); 
                    match(input,FIX,FOLLOW_FIX_in_time1136); 
                    pushFollow(FOLLOW_numericValue_in_time1140);
                    x=numericValue();

                    state._fsp--;

                    emit("// TIM FIX " + x);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:214:4: TIM REL x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1147); 
                    match(input,REL,FOLLOW_REL_in_time1149); 
                    pushFollow(FOLLOW_numericValue_in_time1153);
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
    // flipsTargetUdbLogo.g:217:1: radius : RAD x= numericValue ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetUdbLogo.g:217:8: ( RAD x= numericValue )
            // flipsTargetUdbLogo.g:217:10: RAD x= numericValue
            {
            match(input,RAD,FOLLOW_RAD_in_radius1165); 
            pushFollow(FOLLOW_numericValue_in_radius1169);
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
    // flipsTargetUdbLogo.g:219:1: direction : ( DIR L | DIR R | DIR CW | DIR CCW );
    public final void direction() throws RecognitionException {
        try {
            // flipsTargetUdbLogo.g:220:2: ( DIR L | DIR R | DIR CW | DIR CCW )
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
                    // flipsTargetUdbLogo.g:220:4: DIR L
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1180); 
                    match(input,L,FOLLOW_L_in_direction1182); 
                    emit("// DIR L");

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:221:4: DIR R
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1189); 
                    match(input,R,FOLLOW_R_in_direction1191); 
                    emit("// DIR R");

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:222:4: DIR CW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1198); 
                    match(input,CW,FOLLOW_CW_in_direction1200); 
                    emit("// DIR CW");

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:223:4: DIR CCW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1207); 
                    match(input,CCW,FOLLOW_CCW_in_direction1209); 
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
    // flipsTargetUdbLogo.g:228:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        Token y=null;
        int x = 0;


        try {
            // flipsTargetUdbLogo.g:229:2: (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral )
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
                    // flipsTargetUdbLogo.g:229:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1230);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:231:10: y= FloatingPointLiteral
                    {
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1247); 
                    r = Double.parseDouble(y.getText());

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:233:10: '-' y= FloatingPointLiteral
                    {
                    match(input,58,FOLLOW_58_in_numericValue1269); 
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1273); 
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
    // flipsTargetUdbLogo.g:237:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        Token x=null;

        try {
            // flipsTargetUdbLogo.g:238:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // flipsTargetUdbLogo.g:238:4: x= BinaryLiteral
                    {
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1301); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsTargetUdbLogo.g:240:4: x= OctalLiteral
                    {
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1312); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsTargetUdbLogo.g:242:4: x= DecimalLiteral
                    {
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1323); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsTargetUdbLogo.g:244:4: x= HexLiteral
                    {
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1334); 
                    r = Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;
                case 5 :
                    // flipsTargetUdbLogo.g:246:4: '-' x= BinaryLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1343); 
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1347); 
                    r = -Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 6 :
                    // flipsTargetUdbLogo.g:248:4: '-' x= OctalLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1356); 
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1360); 
                    r = -Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 7 :
                    // flipsTargetUdbLogo.g:250:4: '-' x= DecimalLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1369); 
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1373); 
                    r = -Integer.parseInt(x.getText());

                    }
                    break;
                case 8 :
                    // flipsTargetUdbLogo.g:252:4: '-' x= HexLiteral
                    {
                    match(input,58,FOLLOW_58_in_integerValue1382); 
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1386); 
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
        "\3\4\1\7\1\12\1\uffff\7\16\1\17\1\uffff\1\17\12\uffff\2\20";
    static final String DFA2_maxS =
        "\4\72\1\16\1\uffff\1\30\1\34\2\42\1\21\1\72\1\53\1\30\1\uffff\1"+
        "\30\12\uffff\2\22";
    static final String DFA2_acceptS =
        "\5\uffff\1\5\10\uffff\1\1\1\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\11"+
        "\1\12\1\13\1\14\2\uffff";
    static final String DFA2_specialS =
        "\34\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\1\3\2\5\1\4\1\5\1\12\15\5\1\6\1\7\2\5\1\10\7\5\1\11"+
            "\1\13\1\14\23\5",
            "\12\16\1\15\54\16",
            "\12\20\1\17\54\20",
            "\1\21\6\uffff\1\5\36\uffff\4\21\11\uffff\1\21",
            "\4\22\1\5",
            "",
            "\1\5\1\23\3\uffff\6\23",
            "\1\5\14\uffff\2\24",
            "\1\5\17\uffff\5\25",
            "\1\5\17\uffff\5\26",
            "\1\5\1\uffff\2\27",
            "\1\5\35\uffff\5\30\11\uffff\1\30",
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
            return "74:1: instruction : ( fly | loiter | command | repeat | position | velocity | speed | actuator | trim | time | radius | direction );";
        }
    }
    static final String DFA5_eotS =
        "\50\uffff";
    static final String DFA5_eofS =
        "\31\uffff\4\40\1\uffff\1\40\2\uffff\5\40\2\uffff";
    static final String DFA5_minS =
        "\1\4\1\17\1\uffff\1\20\1\21\5\20\1\54\16\uffff\4\4\1\54\1\4\1\17"+
        "\1\uffff\5\4\1\20\1\uffff";
    static final String DFA5_maxS =
        "\1\72\1\30\1\uffff\2\22\5\21\1\72\16\uffff\4\72\1\60\1\72\1\30\1"+
        "\uffff\5\72\1\22\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\4\10\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\7\uffff\1\1\6\uffff\1\21";
    static final String DFA5_specialS =
        "\50\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\2\1\1\54\2",
            "\1\3\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "\1\12\1\13\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\36\1\31\1\32\1\33\1\34\11\uffff\1\35",
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
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\1\45\1\41\1\42\1\43\1\44",
            "\12\40\1\37\54\40",
            "\1\40\3\uffff\1\46\5\40",
            "",
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\12\40\1\37\54\40",
            "\1\47\2\40",
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
            return "138:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | ~ ( POS X FIX x= numericValue ) POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue | POS X FIX x= numericValue POS Y FIX y= numericValue );";
        }
    }
    static final String DFA6_eotS =
        "\27\uffff";
    static final String DFA6_eofS =
        "\27\uffff";
    static final String DFA6_minS =
        "\1\31\1\17\7\20\16\uffff";
    static final String DFA6_maxS =
        "\1\31\1\30\7\21\16\uffff";
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
            return "159:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );";
        }
    }
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\35\1\36\4\20\1\43\12\uffff";
    static final String DFA8_maxS =
        "\1\35\1\42\4\21\1\44\12\uffff";
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
            return "185:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );";
        }
    }
    static final String DFA9_eotS =
        "\21\uffff";
    static final String DFA9_eofS =
        "\21\uffff";
    static final String DFA9_minS =
        "\1\45\1\36\5\20\12\uffff";
    static final String DFA9_maxS =
        "\1\45\1\42\5\21\12\uffff";
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
            return "199:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );";
        }
    }
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\55\4\uffff\1\55\4\uffff";
    static final String DFA13_maxS =
        "\1\72\4\uffff\1\60\4\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\1\3\1\4\11\uffff\1\5",
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
            return "237:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_instruction_in_flightPlan48 = new BitSet(new long[]{0x07FFFFFFFFFFFFF2L});
    public static final BitSet FOLLOW_fly_in_instruction68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiter_in_instruction73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_instruction78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_in_instruction83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_instruction88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_velocity_in_instruction93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actuator_in_instruction103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_in_instruction108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_instruction113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_instruction118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_instruction123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_fly135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTR_in_loiter143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command151 = new BitSet(new long[]{0x0401E00000000000L});
    public static final BitSet FOLLOW_integerValue_in_command155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAR_in_command165 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_command169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAR_in_command179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_StringLiteral_in_command183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat195 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NUM_in_repeat197 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_repeat201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat210 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TIM_in_repeat212 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_repeat216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat225 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_FRV_in_repeat227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPT_in_repeat236 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_END_in_repeat238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position253 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_X_in_position255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position257 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position268 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_X_in_position270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position272 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_X_in_position285 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_GEO_in_position287 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_position298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_POS_in_position311 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Y_in_position313 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position315 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Y_in_position328 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position330 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position341 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Y_in_position343 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_GEO_in_position345 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position356 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Z_in_position358 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position360 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position371 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Z_in_position373 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position375 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position386 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ROL_in_position388 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position390 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position401 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ROL_in_position403 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position405 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position416 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PIT_in_position418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position420 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position431 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PIT_in_position433 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position435 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position446 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_YAW_in_position448 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position450 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position461 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_YAW_in_position463 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position465 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position476 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PRE_in_position478 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position480 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PRE_in_position493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_position495 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position506 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_X_in_position508 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position510 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position514 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_POS_in_position516 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Y_in_position518 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_position520 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_position524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity537 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_X_in_velocity539 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity541 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity552 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_X_in_velocity554 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity556 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity567 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Y_in_velocity569 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity571 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Y_in_velocity584 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity586 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Z_in_velocity599 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity601 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity612 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Z_in_velocity614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity616 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ROL_in_velocity629 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity631 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity642 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ROL_in_velocity644 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity646 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity657 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PIT_in_velocity659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity661 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity672 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PIT_in_velocity674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity676 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity687 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_YAW_in_velocity689 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity691 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity702 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_YAW_in_velocity704 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity706 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity717 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PRE_in_velocity719 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_velocity721 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity732 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PRE_in_velocity734 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_velocity736 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed754 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AIR_in_speed756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_speed758 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed769 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AIR_in_speed771 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_speed773 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed784 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_GND_in_speed786 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_speed788 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed799 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_GND_in_speed801 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_speed803 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator820 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ELE_in_actuator822 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_actuator824 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator835 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ELE_in_actuator837 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_actuator839 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator850 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_AIL_in_actuator852 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_actuator854 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator865 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_AIL_in_actuator867 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_actuator869 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator880 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RUD_in_actuator882 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_actuator884 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator895 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RUD_in_actuator897 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_actuator899 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator910 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FLA_in_actuator912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_actuator914 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator925 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FLA_in_actuator927 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_actuator929 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator940 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THR_in_actuator942 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_PCT_in_actuator944 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator955 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THR_in_actuator957 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPM_in_actuator959 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim977 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ELE_in_trim979 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_trim981 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim992 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ELE_in_trim994 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_trim996 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1007 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_AIL_in_trim1009 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_trim1011 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1022 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_AIL_in_trim1024 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_trim1026 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1037 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RUD_in_trim1039 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_trim1041 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1052 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RUD_in_trim1054 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_trim1056 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1067 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FLA_in_trim1069 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_trim1071 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1082 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FLA_in_trim1084 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_trim1086 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1097 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THR_in_trim1099 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_trim1101 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim1112 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THR_in_trim1114 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_trim1116 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1134 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FIX_in_time1136 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1147 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REL_in_time1149 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAD_in_radius1165 = new BitSet(new long[]{0x0401F00000000000L});
    public static final BitSet FOLLOW_numericValue_in_radius1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1180 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_L_in_direction1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1189 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_R_in_direction1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1198 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_CW_in_direction1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1207 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_CCW_in_direction1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_numericValue1269 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1343 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1356 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1369 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_integerValue1382 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1386 = new BitSet(new long[]{0x0000000000000002L});

}