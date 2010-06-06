// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsTargetKml.g 2010-06-06 02:29:07




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsTargetKmlParser extends Parser {
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


        public flipsTargetKmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsTargetKmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsTargetKmlParser.tokenNames; }
    public String getGrammarFileName() { return "flipsTargetKml.g"; }


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



    // $ANTLR start "flightPlan"
    // flipsTargetKml.g:73:1: flightPlan : ( instruction )* ;
    public final void flightPlan() throws RecognitionException {
        try {
            // flipsTargetKml.g:74:2: ( ( instruction )* )
            // flipsTargetKml.g:74:4: ( instruction )*
            {
            output.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            output.append("<kml xmlns=\"http://www.opengis.net/kml/2.2\" xmlns:gx=\"http://www.google.com/kml/ext/2.2\" xmlns:kml=\"http://www.opengis.net/kml/2.2\" xmlns:atom=\"http://www.w3.org/2005/Atom\">\n");
            output.append("<Document>\n");
            output.append("  <Style id=\"flightPath\">\n");
            output.append("    <LineStyle>\n");
            output.append("      <width>3</width>\n");
            output.append("    </LineStyle>\n");
            output.append("    <PolyStyle>\n");
            output.append("      <color>bf000000</color>\n");
            output.append("    </PolyStyle>\n");
            output.append("  </Style>\n");
            output.append("  <Placemark>\n");
            output.append("    <name>FLIPS Flight Plan</name>\n");
            output.append("    <styleUrl>#flightPath</styleUrl>\n");
            output.append("    <LineString>\n");
            output.append("      <extrude>1</extrude>\n");
            output.append("      <tessellate>1</tessellate>\n");
            output.append("      <altitudeMode>absolute</altitudeMode>\n");
            output.append("      <coordinates>\n");
            // flipsTargetKml.g:93:3: ( instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FLY && LA1_0<=CMD)||LA1_0==POS||(LA1_0>=VEL && LA1_0<=SPD)||LA1_0==ACT||(LA1_0>=TRI && LA1_0<=DIR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flipsTargetKml.g:93:3: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_flightPlan116);
            	    instruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            output.append("      </coordinates>\n");
            output.append("    </LineString>\n");
            output.append("  </Placemark>\n");
            output.append("</Document>\n");
            output.append("</kml>");

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
    // flipsTargetKml.g:101:1: instruction : ( fly | loiter | command | position | velocity | speed | actuator | trim | time | radius | direction );
    public final void instruction() throws RecognitionException {
        try {
            // flipsTargetKml.g:102:2: ( fly | loiter | command | position | velocity | speed | actuator | trim | time | radius | direction )
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
                    // flipsTargetKml.g:102:4: fly
                    {
                    pushFollow(FOLLOW_fly_in_instruction148);
                    fly();

                    state._fsp--;

                    processCoordinate();

                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:103:4: loiter
                    {
                    pushFollow(FOLLOW_loiter_in_instruction155);
                    loiter();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:104:4: command
                    {
                    pushFollow(FOLLOW_command_in_instruction160);
                    command();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:105:4: position
                    {
                    pushFollow(FOLLOW_position_in_instruction165);
                    position();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetKml.g:106:4: velocity
                    {
                    pushFollow(FOLLOW_velocity_in_instruction170);
                    velocity();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetKml.g:107:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_instruction175);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetKml.g:108:4: actuator
                    {
                    pushFollow(FOLLOW_actuator_in_instruction180);
                    actuator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetKml.g:109:4: trim
                    {
                    pushFollow(FOLLOW_trim_in_instruction185);
                    trim();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetKml.g:110:4: time
                    {
                    pushFollow(FOLLOW_time_in_instruction190);
                    time();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetKml.g:111:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_instruction195);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetKml.g:112:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_instruction200);
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
    // flipsTargetKml.g:117:1: fly : FLY ;
    public final void fly() throws RecognitionException {
        try {
            // flipsTargetKml.g:117:5: ( FLY )
            // flipsTargetKml.g:117:7: FLY
            {
            match(input,FLY,FOLLOW_FLY_in_fly212); 

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
    // flipsTargetKml.g:119:1: loiter : LTR ;
    public final void loiter() throws RecognitionException {
        try {
            // flipsTargetKml.g:119:8: ( LTR )
            // flipsTargetKml.g:119:10: LTR
            {
            match(input,LTR,FOLLOW_LTR_in_loiter220); 

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
    // flipsTargetKml.g:121:1: command : ( CMD x= integerValue | CMD PAR y= numericValue );
    public final void command() throws RecognitionException {
        int x = 0;

        double y = 0.0;


        try {
            // flipsTargetKml.g:121:9: ( CMD x= integerValue | CMD PAR y= numericValue )
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
                    // flipsTargetKml.g:121:11: CMD x= integerValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command228); 
                    pushFollow(FOLLOW_integerValue_in_command232);
                    x=integerValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:122:4: CMD PAR y= numericValue
                    {
                    match(input,CMD,FOLLOW_CMD_in_command237); 
                    match(input,PAR,FOLLOW_PAR_in_command239); 
                    pushFollow(FOLLOW_numericValue_in_command243);
                    y=numericValue();

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
    // $ANTLR end "command"


    // $ANTLR start "position"
    // flipsTargetKml.g:127:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue );
    public final void position() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:127:9: ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue )
            int alt4=16;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // flipsTargetKml.g:127:11: POS X FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position254); 
                    match(input,X,FOLLOW_X_in_position256); 
                    match(input,FIX,FOLLOW_FIX_in_position258); 
                    pushFollow(FOLLOW_numericValue_in_position262);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:128:4: POS X REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position267); 
                    match(input,X,FOLLOW_X_in_position269); 
                    match(input,REL,FOLLOW_REL_in_position271); 
                    pushFollow(FOLLOW_numericValue_in_position275);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:129:4: POS X GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position280); 
                    match(input,X,FOLLOW_X_in_position282); 
                    match(input,GEO,FOLLOW_GEO_in_position284); 
                    pushFollow(FOLLOW_numericValue_in_position288);
                    x=numericValue();

                    state._fsp--;

                    setLongitude(x);

                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:130:4: POS Y FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position295); 
                    match(input,Y,FOLLOW_Y_in_position297); 
                    match(input,FIX,FOLLOW_FIX_in_position299); 
                    pushFollow(FOLLOW_numericValue_in_position303);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetKml.g:131:4: POS Y REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position308); 
                    match(input,Y,FOLLOW_Y_in_position310); 
                    match(input,REL,FOLLOW_REL_in_position312); 
                    pushFollow(FOLLOW_numericValue_in_position316);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetKml.g:132:4: POS Y GEO x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position321); 
                    match(input,Y,FOLLOW_Y_in_position323); 
                    match(input,GEO,FOLLOW_GEO_in_position325); 
                    pushFollow(FOLLOW_numericValue_in_position329);
                    x=numericValue();

                    state._fsp--;

                    setLatitude(x);

                    }
                    break;
                case 7 :
                    // flipsTargetKml.g:133:4: POS Z FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position336); 
                    match(input,Z,FOLLOW_Z_in_position338); 
                    match(input,FIX,FOLLOW_FIX_in_position340); 
                    pushFollow(FOLLOW_numericValue_in_position344);
                    x=numericValue();

                    state._fsp--;

                    setFixedAltitude(x);

                    }
                    break;
                case 8 :
                    // flipsTargetKml.g:134:4: POS Z REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position351); 
                    match(input,Z,FOLLOW_Z_in_position353); 
                    match(input,REL,FOLLOW_REL_in_position355); 
                    pushFollow(FOLLOW_numericValue_in_position359);
                    x=numericValue();

                    state._fsp--;

                    setRelativeAltitude(x);

                    }
                    break;
                case 9 :
                    // flipsTargetKml.g:135:4: POS ROL FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position366); 
                    match(input,ROL,FOLLOW_ROL_in_position368); 
                    match(input,FIX,FOLLOW_FIX_in_position370); 
                    pushFollow(FOLLOW_numericValue_in_position374);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetKml.g:136:4: POS ROL REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position379); 
                    match(input,ROL,FOLLOW_ROL_in_position381); 
                    match(input,REL,FOLLOW_REL_in_position383); 
                    pushFollow(FOLLOW_numericValue_in_position387);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetKml.g:137:4: POS PIT FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position392); 
                    match(input,PIT,FOLLOW_PIT_in_position394); 
                    match(input,FIX,FOLLOW_FIX_in_position396); 
                    pushFollow(FOLLOW_numericValue_in_position400);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // flipsTargetKml.g:138:4: POS PIT REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position405); 
                    match(input,PIT,FOLLOW_PIT_in_position407); 
                    match(input,REL,FOLLOW_REL_in_position409); 
                    pushFollow(FOLLOW_numericValue_in_position413);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // flipsTargetKml.g:139:4: POS YAW FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position418); 
                    match(input,YAW,FOLLOW_YAW_in_position420); 
                    match(input,FIX,FOLLOW_FIX_in_position422); 
                    pushFollow(FOLLOW_numericValue_in_position426);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // flipsTargetKml.g:140:4: POS YAW REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position431); 
                    match(input,YAW,FOLLOW_YAW_in_position433); 
                    match(input,REL,FOLLOW_REL_in_position435); 
                    pushFollow(FOLLOW_numericValue_in_position439);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // flipsTargetKml.g:141:4: POS PRE FIX x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position444); 
                    match(input,PRE,FOLLOW_PRE_in_position446); 
                    match(input,FIX,FOLLOW_FIX_in_position448); 
                    pushFollow(FOLLOW_numericValue_in_position452);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // flipsTargetKml.g:142:4: POS PRE REL x= numericValue
                    {
                    match(input,POS,FOLLOW_POS_in_position457); 
                    match(input,PRE,FOLLOW_PRE_in_position459); 
                    match(input,REL,FOLLOW_REL_in_position461); 
                    pushFollow(FOLLOW_numericValue_in_position465);
                    x=numericValue();

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
    // $ANTLR end "position"


    // $ANTLR start "velocity"
    // flipsTargetKml.g:147:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );
    public final void velocity() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:147:9: ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue )
            int alt5=14;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsTargetKml.g:147:11: VEL X FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity476); 
                    match(input,X,FOLLOW_X_in_velocity478); 
                    match(input,FIX,FOLLOW_FIX_in_velocity480); 
                    pushFollow(FOLLOW_numericValue_in_velocity484);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:148:4: VEL X REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity489); 
                    match(input,X,FOLLOW_X_in_velocity491); 
                    match(input,REL,FOLLOW_REL_in_velocity493); 
                    pushFollow(FOLLOW_numericValue_in_velocity497);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:149:4: VEL Y FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity502); 
                    match(input,Y,FOLLOW_Y_in_velocity504); 
                    match(input,FIX,FOLLOW_FIX_in_velocity506); 
                    pushFollow(FOLLOW_numericValue_in_velocity510);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:150:4: VEL Y REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity515); 
                    match(input,Y,FOLLOW_Y_in_velocity517); 
                    match(input,REL,FOLLOW_REL_in_velocity519); 
                    pushFollow(FOLLOW_numericValue_in_velocity523);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetKml.g:151:4: VEL Z FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity528); 
                    match(input,Z,FOLLOW_Z_in_velocity530); 
                    match(input,FIX,FOLLOW_FIX_in_velocity532); 
                    pushFollow(FOLLOW_numericValue_in_velocity536);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetKml.g:152:4: VEL Z REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity541); 
                    match(input,Z,FOLLOW_Z_in_velocity543); 
                    match(input,REL,FOLLOW_REL_in_velocity545); 
                    pushFollow(FOLLOW_numericValue_in_velocity549);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetKml.g:153:4: VEL ROL FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity554); 
                    match(input,ROL,FOLLOW_ROL_in_velocity556); 
                    match(input,FIX,FOLLOW_FIX_in_velocity558); 
                    pushFollow(FOLLOW_numericValue_in_velocity562);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetKml.g:154:4: VEL ROL REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity567); 
                    match(input,ROL,FOLLOW_ROL_in_velocity569); 
                    match(input,REL,FOLLOW_REL_in_velocity571); 
                    pushFollow(FOLLOW_numericValue_in_velocity575);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetKml.g:155:4: VEL PIT FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity580); 
                    match(input,PIT,FOLLOW_PIT_in_velocity582); 
                    match(input,FIX,FOLLOW_FIX_in_velocity584); 
                    pushFollow(FOLLOW_numericValue_in_velocity588);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetKml.g:156:4: VEL PIT REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity593); 
                    match(input,PIT,FOLLOW_PIT_in_velocity595); 
                    match(input,REL,FOLLOW_REL_in_velocity597); 
                    pushFollow(FOLLOW_numericValue_in_velocity601);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // flipsTargetKml.g:157:4: VEL YAW FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity606); 
                    match(input,YAW,FOLLOW_YAW_in_velocity608); 
                    match(input,FIX,FOLLOW_FIX_in_velocity610); 
                    pushFollow(FOLLOW_numericValue_in_velocity614);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // flipsTargetKml.g:158:4: VEL YAW REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity619); 
                    match(input,YAW,FOLLOW_YAW_in_velocity621); 
                    match(input,REL,FOLLOW_REL_in_velocity623); 
                    pushFollow(FOLLOW_numericValue_in_velocity627);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // flipsTargetKml.g:159:4: VEL PRE FIX x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity632); 
                    match(input,PRE,FOLLOW_PRE_in_velocity634); 
                    match(input,FIX,FOLLOW_FIX_in_velocity636); 
                    pushFollow(FOLLOW_numericValue_in_velocity640);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // flipsTargetKml.g:160:4: VEL PRE REL x= numericValue
                    {
                    match(input,VEL,FOLLOW_VEL_in_velocity645); 
                    match(input,PRE,FOLLOW_PRE_in_velocity647); 
                    match(input,REL,FOLLOW_REL_in_velocity649); 
                    pushFollow(FOLLOW_numericValue_in_velocity653);
                    x=numericValue();

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
    // $ANTLR end "velocity"


    // $ANTLR start "speed"
    // flipsTargetKml.g:165:1: speed : ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:165:7: ( SPD AIR FIX x= numericValue | SPD AIR REL x= numericValue | SPD GND FIX x= numericValue | SPD GND REL x= numericValue )
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
                    // flipsTargetKml.g:165:9: SPD AIR FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed665); 
                    match(input,AIR,FOLLOW_AIR_in_speed667); 
                    match(input,FIX,FOLLOW_FIX_in_speed669); 
                    pushFollow(FOLLOW_numericValue_in_speed673);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:166:4: SPD AIR REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed678); 
                    match(input,AIR,FOLLOW_AIR_in_speed680); 
                    match(input,REL,FOLLOW_REL_in_speed682); 
                    pushFollow(FOLLOW_numericValue_in_speed686);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:167:4: SPD GND FIX x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed691); 
                    match(input,GND,FOLLOW_GND_in_speed693); 
                    match(input,FIX,FOLLOW_FIX_in_speed695); 
                    pushFollow(FOLLOW_numericValue_in_speed699);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:168:4: SPD GND REL x= numericValue
                    {
                    match(input,SPD,FOLLOW_SPD_in_speed704); 
                    match(input,GND,FOLLOW_GND_in_speed706); 
                    match(input,REL,FOLLOW_REL_in_speed708); 
                    pushFollow(FOLLOW_numericValue_in_speed712);
                    x=numericValue();

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
    // $ANTLR end "speed"


    // $ANTLR start "actuator"
    // flipsTargetKml.g:173:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );
    public final void actuator() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:173:9: ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // flipsTargetKml.g:173:11: ACT ELE FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator723); 
                    match(input,ELE,FOLLOW_ELE_in_actuator725); 
                    match(input,FIX,FOLLOW_FIX_in_actuator727); 
                    pushFollow(FOLLOW_numericValue_in_actuator731);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:174:4: ACT ELE REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator736); 
                    match(input,ELE,FOLLOW_ELE_in_actuator738); 
                    match(input,REL,FOLLOW_REL_in_actuator740); 
                    pushFollow(FOLLOW_numericValue_in_actuator744);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:175:4: ACT AIL FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator749); 
                    match(input,AIL,FOLLOW_AIL_in_actuator751); 
                    match(input,FIX,FOLLOW_FIX_in_actuator753); 
                    pushFollow(FOLLOW_numericValue_in_actuator757);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:176:4: ACT AIL REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator762); 
                    match(input,AIL,FOLLOW_AIL_in_actuator764); 
                    match(input,REL,FOLLOW_REL_in_actuator766); 
                    pushFollow(FOLLOW_numericValue_in_actuator770);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetKml.g:177:4: ACT RUD FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator775); 
                    match(input,RUD,FOLLOW_RUD_in_actuator777); 
                    match(input,FIX,FOLLOW_FIX_in_actuator779); 
                    pushFollow(FOLLOW_numericValue_in_actuator783);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetKml.g:178:4: ACT RUD REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator788); 
                    match(input,RUD,FOLLOW_RUD_in_actuator790); 
                    match(input,REL,FOLLOW_REL_in_actuator792); 
                    pushFollow(FOLLOW_numericValue_in_actuator796);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetKml.g:179:4: ACT FLA FIX x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator801); 
                    match(input,FLA,FOLLOW_FLA_in_actuator803); 
                    match(input,FIX,FOLLOW_FIX_in_actuator805); 
                    pushFollow(FOLLOW_numericValue_in_actuator809);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetKml.g:180:4: ACT FLA REL x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator814); 
                    match(input,FLA,FOLLOW_FLA_in_actuator816); 
                    match(input,REL,FOLLOW_REL_in_actuator818); 
                    pushFollow(FOLLOW_numericValue_in_actuator822);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetKml.g:181:4: ACT THR PCT x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator827); 
                    match(input,THR,FOLLOW_THR_in_actuator829); 
                    match(input,PCT,FOLLOW_PCT_in_actuator831); 
                    pushFollow(FOLLOW_numericValue_in_actuator835);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetKml.g:182:4: ACT THR RPM x= numericValue
                    {
                    match(input,ACT,FOLLOW_ACT_in_actuator840); 
                    match(input,THR,FOLLOW_THR_in_actuator842); 
                    match(input,RPM,FOLLOW_RPM_in_actuator844); 
                    pushFollow(FOLLOW_numericValue_in_actuator848);
                    x=numericValue();

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
    // $ANTLR end "actuator"


    // $ANTLR start "trim"
    // flipsTargetKml.g:187:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );
    public final void trim() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:187:6: ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // flipsTargetKml.g:187:8: TRI ELE FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim860); 
                    match(input,ELE,FOLLOW_ELE_in_trim862); 
                    match(input,FIX,FOLLOW_FIX_in_trim864); 
                    pushFollow(FOLLOW_numericValue_in_trim868);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:188:4: TRI ELE REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim873); 
                    match(input,ELE,FOLLOW_ELE_in_trim875); 
                    match(input,REL,FOLLOW_REL_in_trim877); 
                    pushFollow(FOLLOW_numericValue_in_trim881);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:189:4: TRI AIL FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim886); 
                    match(input,AIL,FOLLOW_AIL_in_trim888); 
                    match(input,FIX,FOLLOW_FIX_in_trim890); 
                    pushFollow(FOLLOW_numericValue_in_trim894);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:190:4: TRI AIL REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim899); 
                    match(input,AIL,FOLLOW_AIL_in_trim901); 
                    match(input,REL,FOLLOW_REL_in_trim903); 
                    pushFollow(FOLLOW_numericValue_in_trim907);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsTargetKml.g:191:4: TRI RUD FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim912); 
                    match(input,RUD,FOLLOW_RUD_in_trim914); 
                    match(input,FIX,FOLLOW_FIX_in_trim916); 
                    pushFollow(FOLLOW_numericValue_in_trim920);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsTargetKml.g:192:4: TRI RUD REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim925); 
                    match(input,RUD,FOLLOW_RUD_in_trim927); 
                    match(input,REL,FOLLOW_REL_in_trim929); 
                    pushFollow(FOLLOW_numericValue_in_trim933);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsTargetKml.g:193:4: TRI FLA FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim938); 
                    match(input,FLA,FOLLOW_FLA_in_trim940); 
                    match(input,FIX,FOLLOW_FIX_in_trim942); 
                    pushFollow(FOLLOW_numericValue_in_trim946);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsTargetKml.g:194:4: TRI FLA REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim951); 
                    match(input,FLA,FOLLOW_FLA_in_trim953); 
                    match(input,REL,FOLLOW_REL_in_trim955); 
                    pushFollow(FOLLOW_numericValue_in_trim959);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsTargetKml.g:195:4: TRI THR FIX x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim964); 
                    match(input,THR,FOLLOW_THR_in_trim966); 
                    match(input,FIX,FOLLOW_FIX_in_trim968); 
                    pushFollow(FOLLOW_numericValue_in_trim972);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsTargetKml.g:196:4: TRI THR REL x= numericValue
                    {
                    match(input,TRI,FOLLOW_TRI_in_trim977); 
                    match(input,THR,FOLLOW_THR_in_trim979); 
                    match(input,REL,FOLLOW_REL_in_trim981); 
                    pushFollow(FOLLOW_numericValue_in_trim985);
                    x=numericValue();

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
    // $ANTLR end "trim"


    // $ANTLR start "time"
    // flipsTargetKml.g:201:1: time : ( TIM FIX x= numericValue | TIM REL x= numericValue );
    public final void time() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:201:6: ( TIM FIX x= numericValue | TIM REL x= numericValue )
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
                    // flipsTargetKml.g:201:8: TIM FIX x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time997); 
                    match(input,FIX,FOLLOW_FIX_in_time999); 
                    pushFollow(FOLLOW_numericValue_in_time1003);
                    x=numericValue();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:202:4: TIM REL x= numericValue
                    {
                    match(input,TIM,FOLLOW_TIM_in_time1008); 
                    match(input,REL,FOLLOW_REL_in_time1010); 
                    pushFollow(FOLLOW_numericValue_in_time1014);
                    x=numericValue();

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
    // $ANTLR end "time"


    // $ANTLR start "radius"
    // flipsTargetKml.g:205:1: radius : RAD x= numericValue ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsTargetKml.g:205:8: ( RAD x= numericValue )
            // flipsTargetKml.g:205:10: RAD x= numericValue
            {
            match(input,RAD,FOLLOW_RAD_in_radius1024); 
            pushFollow(FOLLOW_numericValue_in_radius1028);
            x=numericValue();

            state._fsp--;


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
    // flipsTargetKml.g:207:1: direction : ( DIR L | DIR R | DIR CW | DIR CCW );
    public final void direction() throws RecognitionException {
        try {
            // flipsTargetKml.g:208:2: ( DIR L | DIR R | DIR CW | DIR CCW )
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
                    // flipsTargetKml.g:208:4: DIR L
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1037); 
                    match(input,L,FOLLOW_L_in_direction1039); 

                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:209:4: DIR R
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1044); 
                    match(input,R,FOLLOW_R_in_direction1046); 

                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:210:4: DIR CW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1051); 
                    match(input,CW,FOLLOW_CW_in_direction1053); 

                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:211:4: DIR CCW
                    {
                    match(input,DIR,FOLLOW_DIR_in_direction1058); 
                    match(input,CCW,FOLLOW_CCW_in_direction1060); 

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
    // flipsTargetKml.g:216:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        Token y=null;
        int x = 0;


        try {
            // flipsTargetKml.g:217:2: (x= integerValue | y= FloatingPointLiteral | '-' y= FloatingPointLiteral )
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
                    // flipsTargetKml.g:217:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1079);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:219:10: y= FloatingPointLiteral
                    {
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1096); 
                    r = Double.parseDouble(y.getText());

                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:221:10: '-' y= FloatingPointLiteral
                    {
                    match(input,54,FOLLOW_54_in_numericValue1118); 
                    y=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1122); 
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
    // flipsTargetKml.g:225:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        Token x=null;

        try {
            // flipsTargetKml.g:226:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // flipsTargetKml.g:226:4: x= BinaryLiteral
                    {
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1150); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsTargetKml.g:228:4: x= OctalLiteral
                    {
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1161); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsTargetKml.g:230:4: x= DecimalLiteral
                    {
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1172); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsTargetKml.g:232:4: x= HexLiteral
                    {
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1183); 
                    r = Integer.parseInt(x.getText().substring(2),16);

                    }
                    break;
                case 5 :
                    // flipsTargetKml.g:234:4: '-' x= BinaryLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1192); 
                    x=(Token)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1196); 
                    r = -Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 6 :
                    // flipsTargetKml.g:236:4: '-' x= OctalLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1205); 
                    x=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1209); 
                    r = -Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 7 :
                    // flipsTargetKml.g:238:4: '-' x= DecimalLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1218); 
                    x=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1222); 
                    r = -Integer.parseInt(x.getText());

                    }
                    break;
                case 8 :
                    // flipsTargetKml.g:240:4: '-' x= HexLiteral
                    {
                    match(input,54,FOLLOW_54_in_integerValue1231); 
                    x=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1235); 
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
            return "127:1: position : ( POS X FIX x= numericValue | POS X REL x= numericValue | POS X GEO x= numericValue | POS Y FIX x= numericValue | POS Y REL x= numericValue | POS Y GEO x= numericValue | POS Z FIX x= numericValue | POS Z REL x= numericValue | POS ROL FIX x= numericValue | POS ROL REL x= numericValue | POS PIT FIX x= numericValue | POS PIT REL x= numericValue | POS YAW FIX x= numericValue | POS YAW REL x= numericValue | POS PRE FIX x= numericValue | POS PRE REL x= numericValue );";
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
            return "147:1: velocity : ( VEL X FIX x= numericValue | VEL X REL x= numericValue | VEL Y FIX x= numericValue | VEL Y REL x= numericValue | VEL Z FIX x= numericValue | VEL Z REL x= numericValue | VEL ROL FIX x= numericValue | VEL ROL REL x= numericValue | VEL PIT FIX x= numericValue | VEL PIT REL x= numericValue | VEL YAW FIX x= numericValue | VEL YAW REL x= numericValue | VEL PRE FIX x= numericValue | VEL PRE REL x= numericValue );";
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
            return "173:1: actuator : ( ACT ELE FIX x= numericValue | ACT ELE REL x= numericValue | ACT AIL FIX x= numericValue | ACT AIL REL x= numericValue | ACT RUD FIX x= numericValue | ACT RUD REL x= numericValue | ACT FLA FIX x= numericValue | ACT FLA REL x= numericValue | ACT THR PCT x= numericValue | ACT THR RPM x= numericValue );";
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
            return "187:1: trim : ( TRI ELE FIX x= numericValue | TRI ELE REL x= numericValue | TRI AIL FIX x= numericValue | TRI AIL REL x= numericValue | TRI RUD FIX x= numericValue | TRI RUD REL x= numericValue | TRI FLA FIX x= numericValue | TRI FLA REL x= numericValue | TRI THR FIX x= numericValue | TRI THR REL x= numericValue );";
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
            return "225:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral | '-' x= BinaryLiteral | '-' x= OctalLiteral | '-' x= DecimalLiteral | '-' x= HexLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_instruction_in_flightPlan116 = new BitSet(new long[]{0x0000000780980172L});
    public static final BitSet FOLLOW_fly_in_instruction148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiter_in_instruction155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_instruction160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_instruction165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_velocity_in_instruction170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actuator_in_instruction180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_in_instruction185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_instruction190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_instruction195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_instruction200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_fly212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTR_in_loiter220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command228 = new BitSet(new long[]{0x00400F0000000000L});
    public static final BitSet FOLLOW_integerValue_in_command232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMD_in_command237 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAR_in_command239 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_command243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position258 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position267 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position269 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position271 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position280 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_position282 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GEO_in_position284 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position295 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position297 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position299 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position310 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position312 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position321 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_position323 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GEO_in_position325 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position336 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_position338 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position340 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position351 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_position353 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position355 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position366 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_position368 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position370 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position379 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_position381 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position383 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_position394 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position396 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position405 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_position407 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position409 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_position420 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position422 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position431 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_position433 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position435 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_position446 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_position448 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_position457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_position459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_position461 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_position465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity476 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_velocity478 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity480 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity489 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_X_in_velocity491 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity493 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity502 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_velocity504 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity506 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity515 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Y_in_velocity517 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity519 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity528 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_velocity530 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity532 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Z_in_velocity543 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity545 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_velocity556 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity558 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity567 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ROL_in_velocity569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity571 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity580 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_velocity582 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity584 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PIT_in_velocity595 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity597 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity606 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_velocity608 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity610 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity619 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_YAW_in_velocity621 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity623 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity632 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_velocity634 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_velocity636 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEL_in_velocity645 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PRE_in_velocity647 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_velocity649 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_velocity653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed665 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AIR_in_speed667 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_speed669 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed678 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AIR_in_speed680 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_speed682 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed691 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_GND_in_speed693 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_speed695 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPD_in_speed704 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_GND_in_speed706 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_speed708 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_speed712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator723 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_actuator725 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator727 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator736 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_actuator738 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator740 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator749 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_actuator751 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator753 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator762 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_actuator764 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator766 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator775 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_actuator777 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator779 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator788 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_actuator790 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator792 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_actuator803 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_actuator805 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator814 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_actuator816 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_actuator818 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator827 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_actuator829 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PCT_in_actuator831 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACT_in_actuator840 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_actuator842 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPM_in_actuator844 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_actuator848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim860 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_trim862 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim864 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim873 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ELE_in_trim875 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim877 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim886 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_trim888 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim890 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim899 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AIL_in_trim901 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim903 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim912 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_trim914 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim916 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim925 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RUD_in_trim927 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim929 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim938 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_trim940 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim942 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim951 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLA_in_trim953 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim955 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim964 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_trim966 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_trim968 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRI_in_trim977 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THR_in_trim979 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_trim981 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_trim985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time997 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIX_in_time999 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIM_in_time1008 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_REL_in_time1010 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_time1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAD_in_radius1024 = new BitSet(new long[]{0x00400F8000000000L});
    public static final BitSet FOLLOW_numericValue_in_radius1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1037 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_L_in_direction1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1044 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_R_in_direction1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1051 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_CW_in_direction1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIR_in_direction1058 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_CCW_in_direction1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_numericValue1118 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1192 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1205 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1218 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_integerValue1231 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1235 = new BitSet(new long[]{0x0000000000000002L});

}