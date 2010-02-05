// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g 2010-02-04 23:24:00

  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "EXECUTE", "FIXED", "RELATIVE", "ALTITUDE", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "MINUTE", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "FLIGHTLEVEL", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "Identifier", "To", "At", "With", "FlightLevel", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'an'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'of'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'n'", "'north'", "'s'", "'south'", "'e'", "'east'", "'w'", "'west'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'"
    };
    public static final int OctalLiteral=43;
    public static final int LATITUDE=15;
    public static final int FIXED=10;
    public static final int GEOCOORDINATE=14;
    public static final int SOUTH=33;
    public static final int FOOT=26;
    public static final int EOF=-1;
    public static final int Identifier=36;
    public static final int COMMAND=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int DISTANCE=20;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int To=37;
    public static final int Comment=53;
    public static final int PARAMETER=7;
    public static final int FlightLevel=40;
    public static final int KILOMETER=21;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int CLIMB=30;
    public static final int YARD=25;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RADIAN=19;
    public static final int T__89=89;
    public static final int DEGREE=18;
    public static final int T__88=88;
    public static final int With=39;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=52;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int FLY=8;
    public static final int T__70=70;
    public static final int BinaryLiteral=42;
    public static final int BinaryDigit=49;
    public static final int FloatingPointLiteral=41;
    public static final int METER=22;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int LONGITUDE=16;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int EXECUTE=9;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int MILE=24;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int LineComment=54;
    public static final int Exponent=51;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int DEFINE=5;
    public static final int HexDigit=50;
    public static final int T__55=55;
    public static final int WEST=35;
    public static final int WAYPOINT=13;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int LEFT=27;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int FLIGHTLEVEL=29;
    public static final int HexLiteral=45;
    public static final int At=38;
    public static final int RIGHT=28;
    public static final int RELATIVE=11;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int EAST=34;
    public static final int Digit=46;
    public static final int DecimalLiteral=44;
    public static final int ALTITUDE=12;
    public static final int StringLiteral=47;
    public static final int FLIGHTPLAN=4;
    public static final int NAUTICAL=23;
    public static final int NonZeroDigit=48;
    public static final int NORTH=32;
    public static final int MINUTE=17;
    public static final int DESCEND=31;

    // delegates
    // delegators


        public flipsAssembly(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsAssembly(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsAssembly.tokenNames; }
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g"; }


      HashMap<String,Integer> commands = new HashMap<String,Integer>();
      HashMap<String,Double[]> waypoints = new HashMap<String,Double[]>();
      public StringBuilder output = new StringBuilder();

      public void addCommand(String name, Integer value) {
        commands.put(name, value);
      }

      public Integer getCommand(String name) {
        if (commands.containsKey(name)) {
          return commands.get(name);
        }
        return null;
      }
      
      public void addWaypoint(String name, Double north, Double east, Double type) {
        Double[] coordinate = new Double[3];
        coordinate[0] = north;
        coordinate[1] = east;
        coordinate[2] = type;
        waypoints.put(name, coordinate);
      }
        
      public Double[] getWaypoint(String name) {
        if (waypoints.containsKey(name)) {
          return waypoints.get(name);
        }
        return null;
      }

      public void emit(String instruction) {
        output.append(instruction + "\n");
      }

      public void emit(String instruction, String comment) {
        instruction = padRight(instruction, 25) + "// " + comment;
        output.append(instruction + "\n");
      }
      
      public static String padRight(String string, int count) {
        return String.format("%1$-" + count + "s", string);
      }
      
      static String sToHHMMSS(double value) {
        int hours = (int)value / 3600;
        int remainder = (int)value % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;
        int decimal = (int)Math.round((value - (int)value) * 1000f);
        
        return hours + ":" +
               (minutes < 10 ? "0" : "") + minutes + ":" +
               (seconds < 10 ? "0" : "") + seconds +
               (decimal != 0 ? "." + decimal : "");
      }
      
      public static String mToft(double meters) {
        return meters + " m (" + (meters / 0.3048) + " ft) ";
      }



    // $ANTLR start "flightPlan"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:1: flightPlan : ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final void flightPlan() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:105:2: ( ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:105:4: ^( FLIGHTPLAN ( define )* ( command )* )
            {
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:105:17: ( define )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DEFINE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:105:17: define
                	    {
                	    pushFollow(FOLLOW_define_in_flightPlan65);
                	    define();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:105:25: ( command )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=FLY && LA2_0<=EXECUTE)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:105:25: command
                	    {
                	    pushFollow(FOLLOW_command_in_flightPlan68);
                	    command();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

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


    // $ANTLR start "define"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:109:1: define : ( defineCommand | defineWaypoint );
    public final void define() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:110:2: ( defineCommand | defineWaypoint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DEFINE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==Identifier) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==COMMAND) ) {
                            alt3=1;
                        }
                        else if ( (LA3_3==GEOCOORDINATE) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:110:4: defineCommand
                    {
                    pushFollow(FOLLOW_defineCommand_in_define81);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:111:4: defineWaypoint
                    {
                    pushFollow(FOLLOW_defineWaypoint_in_define86);
                    defineWaypoint();

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
    // $ANTLR end "define"


    // $ANTLR start "defineCommand"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:114:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int cmd = 0;

        int par = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:115:2: ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:115:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand98); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand102); 
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand105); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand109);
                    cmd=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    addCommand(name.getText(),cmd);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:117:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand121); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand125); 
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand128); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand132);
                    cmd=integerValue();

                    state._fsp--;

                    match(input,PARAMETER,FOLLOW_PARAMETER_in_defineCommand134); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand138);
                    par=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    addCommand(name.getText(),cmd);

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
    // $ANTLR end "defineCommand"


    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:121:1: defineWaypoint : ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) );
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:122:2: ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEFINE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==Identifier) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==GEOCOORDINATE) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==DOWN) ) {
                                int LA5_5 = input.LA(6);

                                if ( (LA5_5==LATITUDE) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_5==DISTANCE) ) {
                                    alt5=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:122:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint156); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint160); 
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_defineWaypoint163); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_defineWaypoint167);
                    geo=latitudeLongitude();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    addWaypoint(name.getText(),geo.latitude,geo.longitude,0d);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:124:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint179); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint183); 
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_defineWaypoint186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_defineWaypoint190);
                    dst=distanceCoordinate();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    addWaypoint(name.getText(),dst.north,dst.east,1d);

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
    // $ANTLR end "defineWaypoint"


    // $ANTLR start "command"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:130:1: command : ( flyCommand | executeCommand );
    public final void command() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:131:2: ( flyCommand | executeCommand )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==FLY) ) {
                alt6=1;
            }
            else if ( (LA6_0==EXECUTE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:131:4: flyCommand
                    {
                    pushFollow(FOLLOW_flyCommand_in_command209);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:132:4: executeCommand
                    {
                    pushFollow(FOLLOW_executeCommand_in_command214);
                    executeCommand();

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


    // $ANTLR start "flyCommand"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:137:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:138:2: ( ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:138:4: ^( FLY ( flyCommandValue )* )
            {
            match(input,FLY,FOLLOW_FLY_in_flyCommand228); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:138:10: ( flyCommandValue )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=ALTITUDE && LA7_0<=GEOCOORDINATE)||LA7_0==DISTANCE) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:138:10: flyCommandValue
                	    {
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand230);
                	    flyCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            emit("FLY", "Execute");

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
    // $ANTLR end "flyCommand"


    // $ANTLR start "flyCommandValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:142:1: flyCommandValue : ( distance | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:143:2: ( distance | waypoint | altitude )
            int alt8=3;
            switch ( input.LA(1) ) {
            case DISTANCE:
                {
                alt8=1;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt8=2;
                }
                break;
            case ALTITUDE:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:143:4: distance
                    {
                    pushFollow(FOLLOW_distance_in_flyCommandValue247);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:144:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue252);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:145:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_flyCommandValue257);
                    altitude();

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
    // $ANTLR end "flyCommandValue"


    // $ANTLR start "executeCommand"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:148:1: executeCommand : ^( EXECUTE x= Identifier ( executeCommandParameter )* ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:149:2: ( ^( EXECUTE x= Identifier ( executeCommandParameter )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:149:4: ^( EXECUTE x= Identifier ( executeCommandParameter )* )
            {
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand269); 

            match(input, Token.DOWN, null); 
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand273); 
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:149:27: ( executeCommandParameter )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==PARAMETER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:149:27: executeCommandParameter
            	    {
            	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand275);
            	    executeCommandParameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input, Token.UP, null); 

            Integer value = getCommand(x.getText());
            if (value != null) {
              String runValue = value.toString();
              emit("CMD " + runValue, x.getText().toUpperCase() + " / Command #" + runValue);
            }
            else {
              emit("$INCLUDE " + x.getText() + ".uav", "Include Source File '" + x.getText() + ".uav'");
            }
            	

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
    // $ANTLR end "executeCommand"


    // $ANTLR start "executeCommandParameter"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:162:1: executeCommandParameter : ^( PARAMETER x= numericValue ) ;
    public final void executeCommandParameter() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:163:2: ( ^( PARAMETER x= numericValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:163:4: ^( PARAMETER x= numericValue )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter292); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_executeCommandParameter296);
            x=numericValue();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("CMD PAR " + x, x + " Command Parameter");

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
    // $ANTLR end "executeCommandParameter"


    // $ANTLR start "altitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:169:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:170:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ALTITUDE) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==FIXED) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==DISTANCE) ) {
                            alt10=1;
                        }
                        else if ( (LA10_3==FLIGHTLEVEL) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_2==RELATIVE) ) {
                        int LA10_4 = input.LA(4);

                        if ( (LA10_4==CLIMB) ) {
                            alt10=3;
                        }
                        else if ( (LA10_4==DESCEND) ) {
                            alt10=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:170:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude315); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude317); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude319); 
                    pushFollow(FOLLOW_convertDistance_in_altitude323);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:172:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude334); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude336); 
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude340);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:174:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude351); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude353); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude355); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude357); 
                    pushFollow(FOLLOW_convertDistance_in_altitude361);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:176:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude372); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude374); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude376); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude378); 
                    pushFollow(FOLLOW_convertDistance_in_altitude382);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

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
    // $ANTLR end "altitude"


    // $ANTLR start "distance"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:182:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:183:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DISTANCE) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt11=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt11=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }

                }
                else {
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:183:4: ^( DISTANCE x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance401); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distance405);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:185:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance416); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_distance418); 
                    pushFollow(FOLLOW_convertDistance_in_distance422);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:187:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance433); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance435); 
                    pushFollow(FOLLOW_convertDistance_in_distance439);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + x, mToft(x) + "Relative Right Distance");

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
    // $ANTLR end "distance"


    // $ANTLR start "waypoint"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:193:1: waypoint : ( geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:194:2: ( geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GEOCOORDINATE) ) {
                alt12=1;
            }
            else if ( (LA12_0==WAYPOINT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:194:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint457);
                    geoCoordinate();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:195:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint463); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint467); 

                    match(input, Token.UP, null); 

                    Double[] coordinate = getWaypoint(x.getText());
                    if (coordinate != null) {
                      String ns = coordinate[0] >= 0 ? "N" : "S";
                      String ew = coordinate[1] >= 0 ? "E" : "W";
                      if (coordinate[2] == 0) {
                        emit("POS   X GEO " + coordinate[1], x.getText().toUpperCase() + " / " + Math.abs(coordinate[1]) + " " + ew + " Longitude");
                        emit("POS   Y GEO " + coordinate[0], x.getText().toUpperCase() + " / " + Math.abs(coordinate[0]) + " " + ns + " Latitude");
                      }
                      if (coordinate[2] == 1) {
                        emit("POS   X FIX " + coordinate[1], x.getText().toUpperCase() + " / " + mToft(Math.abs(coordinate[1])) + ew + " Distance");
                        emit("POS   Y FIX " + coordinate[0], x.getText().toUpperCase() + " / " + mToft(Math.abs(coordinate[0])) + ns + " Distance");  
                      }
                    }
                    else {
                      emit("POS   X FIX " + x.getText(), x.getText().toUpperCase() + " Waypoint");
                      emit("POS   Y FIX " + x.getText(), x.getText().toUpperCase() + " Waypoint");
                    }
                    	

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
    // $ANTLR end "waypoint"


    // $ANTLR start "geoCoordinate"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:217:1: geoCoordinate : ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) );
    public final void geoCoordinate() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:218:2: ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==GEOCOORDINATE) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==LATITUDE) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==DISTANCE) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:218:4: ^( GEOCOORDINATE geo= latitudeLongitude )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate483); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate487);
                    geo=latitudeLongitude();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    String ns = geo.latitude >= 0 ? "N" : "S";
                    String ew = geo.longitude >= 0 ? "E" : "W";
                    emit("POS   X GEO " + geo.longitude, Math.abs(geo.longitude) + " " + ew + " Longitude");
                    emit("POS   Y GEO " + geo.latitude, Math.abs(geo.latitude) + " " + ns + " Latitude");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:223:4: ^( GEOCOORDINATE dst= distanceCoordinate )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate510); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate514);
                    dst=distanceCoordinate();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    String ns = dst.north >= 0 ? "N" : "S";
                    String ew = dst.east >= 0 ? "E" : "W";
                    emit("POS   X FIX " + dst.east, mToft(Math.abs(dst.east)) + ew + " Distance");
                    emit("POS   Y FIX " + dst.north, mToft(Math.abs(dst.north)) + ns + " Distance");

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
    // $ANTLR end "geoCoordinate"

    public static class latitudeLongitude_return extends TreeRuleReturnScope {
        public double latitude;
        public double longitude;
    };

    // $ANTLR start "latitudeLongitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:230:1: latitudeLongitude returns [double latitude, double longitude] : x= latitude y= longitude ;
    public final flipsAssembly.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return retval = new flipsAssembly.latitudeLongitude_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:231:2: (x= latitude y= longitude )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:231:4: x= latitude y= longitude
            {
            pushFollow(FOLLOW_latitude_in_latitudeLongitude548);
            x=latitude();

            state._fsp--;

            pushFollow(FOLLOW_longitude_in_latitudeLongitude552);
            y=longitude();

            state._fsp--;

            retval.latitude = x;
            retval.longitude = y;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "latitudeLongitude"


    // $ANTLR start "latitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:236:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:237:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:237:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude576); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude580);
                    x=convertAngle();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_latitude582); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:239:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude593); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude597);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude599); 

                    match(input, Token.UP, null); 
                    r = -x;

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
    // $ANTLR end "latitude"


    // $ANTLR start "longitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:243:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:244:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:244:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude620); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude624);
                    x=convertAngle();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_longitude626); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:246:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude637); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude641);
                    x=convertAngle();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_longitude643); 

                    match(input, Token.UP, null); 
                    r = -x;

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
    // $ANTLR end "longitude"

    public static class distanceCoordinate_return extends TreeRuleReturnScope {
        public double north;
        public double east;
    };

    // $ANTLR start "distanceCoordinate"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:250:1: distanceCoordinate returns [double north, double east] : x= distanceNorth y= distanceEast ;
    public final flipsAssembly.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsAssembly.distanceCoordinate_return retval = new flipsAssembly.distanceCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:251:2: (x= distanceNorth y= distanceEast )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:251:4: x= distanceNorth y= distanceEast
            {
            pushFollow(FOLLOW_distanceNorth_in_distanceCoordinate665);
            x=distanceNorth();

            state._fsp--;

            pushFollow(FOLLOW_distanceEast_in_distanceCoordinate669);
            y=distanceEast();

            state._fsp--;

            retval.north = x;
            retval.east = y;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "distanceCoordinate"


    // $ANTLR start "distanceNorth"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:256:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );
    public final double distanceNorth() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:257:2: ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:257:4: ^( DISTANCE x= convertDistance NORTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth693); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth697);
                    x=convertDistance();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_distanceNorth699); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:259:4: ^( DISTANCE x= convertDistance SOUTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth710); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth714);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_distanceNorth716); 

                    match(input, Token.UP, null); 
                    r = -x;

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
    // $ANTLR end "distanceNorth"


    // $ANTLR start "distanceEast"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:263:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );
    public final double distanceEast() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:264:2: ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:264:4: ^( DISTANCE x= convertDistance EAST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast737); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast741);
                    x=convertDistance();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_distanceEast743); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:266:4: ^( DISTANCE x= convertDistance WEST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast754); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast758);
                    x=convertDistance();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_distanceEast760); 

                    match(input, Token.UP, null); 
                    r = -x;

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
    // $ANTLR end "distanceEast"


    // $ANTLR start "convertDistance"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:273:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:274:2: (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:274:4: x= numericValue KILOMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance785);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistance787); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:276:4: x= numericValue METER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance798);
                    x=numericValue();

                    state._fsp--;

                    match(input,METER,FOLLOW_METER_in_convertDistance800); 
                    r = x;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:278:4: x= numericValue NAUTICAL MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance811);
                    x=numericValue();

                    state._fsp--;

                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistance813); 
                    match(input,MILE,FOLLOW_MILE_in_convertDistance815); 
                    r = x * 1852d;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:280:4: x= numericValue MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance826);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILE,FOLLOW_MILE_in_convertDistance828); 
                    r = x * 1609.344d;

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:282:4: x= numericValue YARD
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance839);
                    x=numericValue();

                    state._fsp--;

                    match(input,YARD,FOLLOW_YARD_in_convertDistance841); 
                    r = x * 0.9144d;

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:284:4: x= numericValue FOOT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance852);
                    x=numericValue();

                    state._fsp--;

                    match(input,FOOT,FOLLOW_FOOT_in_convertDistance854); 
                    r = x * 0.3048d;

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
    // $ANTLR end "convertDistance"


    // $ANTLR start "convertFlightLevel"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:289:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:290:2: ( FLIGHTLEVEL x= FlightLevel )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:290:4: FLIGHTLEVEL x= FlightLevel
            {
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel874); 
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel878); 
            String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");
            r = Double.parseDouble(y) * 100d * 0.3048d;

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
    // $ANTLR end "convertFlightLevel"


    // $ANTLR start "convertAngle"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:296:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double minNum = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:297:2: (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | x= numericValue RADIAN )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:297:4: x= numericValue DEGREE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle904);
                    x=numericValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle906); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:299:4: deg= integerValue DEGREE minNum= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle917);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle919); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle923);
                    minNum=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle925); 
                    r = deg + minNum/60d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:301:4: x= numericValue RADIAN
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle936);
                    x=numericValue();

                    state._fsp--;

                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle938); 
                    r = x * 180d / Math.PI;

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
    // $ANTLR end "convertAngle"


    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:306:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:307:2: (x= integerValue | y= FloatingPointLiteral )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=BinaryLiteral && LA20_0<=HexLiteral)) ) {
                alt20=1;
            }
            else if ( (LA20_0==FloatingPointLiteral) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:307:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue960);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:309:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue971); 
                    r = Double.parseDouble(y.getText());

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:313:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:314:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt21=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt21=1;
                }
                break;
            case OctalLiteral:
                {
                alt21=2;
                }
                break;
            case DecimalLiteral:
                {
                alt21=3;
                }
                break;
            case HexLiteral:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:314:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue992); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:316:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1003); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:318:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1014); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:320:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1025); 
                    r = Integer.parseInt(x.getText().substring(2),16);

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
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\5\1\2\1\44\1\6\1\2\1\52\4\3\2\uffff";
    static final String DFA4_maxS =
        "\1\5\1\2\1\44\1\6\1\2\1\55\4\7\2\uffff";
    static final String DFA4_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10\1\11",
            "\1\13\3\uffff\1\12",
            "\1\13\3\uffff\1\12",
            "\1\13\3\uffff\1\12",
            "\1\13\3\uffff\1\12",
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
            return "114:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
    }
    static final String DFA14_eotS =
        "\23\uffff";
    static final String DFA14_eofS =
        "\23\uffff";
    static final String DFA14_minS =
        "\1\17\1\2\1\51\5\22\3\40\2\uffff\5\21\1\40";
    static final String DFA14_maxS =
        "\1\17\1\2\1\55\5\23\1\41\1\55\1\41\2\uffff\5\21\1\41";
    static final String DFA14_acceptS =
        "\13\uffff\1\2\1\1\6\uffff";
    static final String DFA14_specialS =
        "\23\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\12\1\10",
            "\1\14\1\13",
            "\1\14\1\13\7\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\14\1\13",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\14\1\13"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "236:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
    }
    static final String DFA15_eotS =
        "\23\uffff";
    static final String DFA15_eofS =
        "\23\uffff";
    static final String DFA15_minS =
        "\1\20\1\2\1\51\5\22\3\42\2\uffff\5\21\1\42";
    static final String DFA15_maxS =
        "\1\20\1\2\1\55\5\23\1\43\1\55\1\43\2\uffff\5\21\1\43";
    static final String DFA15_acceptS =
        "\13\uffff\1\2\1\1\6\uffff";
    static final String DFA15_specialS =
        "\23\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\12\1\10",
            "\1\14\1\13",
            "\1\14\1\13\5\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\14\1\13",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\14\1\13"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "243:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
    }
    static final String DFA16_eotS =
        "\21\uffff";
    static final String DFA16_eofS =
        "\21\uffff";
    static final String DFA16_minS =
        "\1\24\1\2\1\51\5\25\1\40\1\30\4\40\2\uffff\1\40";
    static final String DFA16_maxS =
        "\1\24\1\2\1\55\5\32\1\41\1\30\4\41\2\uffff\1\41";
    static final String DFA16_acceptS =
        "\16\uffff\1\2\1\1\1\uffff";
    static final String DFA16_specialS =
        "\21\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\12\1\14\1\11\1\15\1\10\1\13",
            "\1\12\1\14\1\11\1\15\1\10\1\13",
            "\1\12\1\14\1\11\1\15\1\10\1\13",
            "\1\12\1\14\1\11\1\15\1\10\1\13",
            "\1\12\1\14\1\11\1\15\1\10\1\13",
            "\1\17\1\16",
            "\1\20",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "",
            "",
            "\1\17\1\16"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "256:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );";
        }
    }
    static final String DFA17_eotS =
        "\21\uffff";
    static final String DFA17_eofS =
        "\21\uffff";
    static final String DFA17_minS =
        "\1\24\1\2\1\51\5\25\2\42\1\30\3\42\2\uffff\1\42";
    static final String DFA17_maxS =
        "\1\24\1\2\1\55\5\32\2\43\1\30\3\43\2\uffff\1\43";
    static final String DFA17_acceptS =
        "\16\uffff\1\2\1\1\1\uffff";
    static final String DFA17_specialS =
        "\21\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\14\1\12\1\15\1\10\1\13",
            "\1\11\1\14\1\12\1\15\1\10\1\13",
            "\1\11\1\14\1\12\1\15\1\10\1\13",
            "\1\11\1\14\1\12\1\15\1\10\1\13",
            "\1\11\1\14\1\12\1\15\1\10\1\13",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\20",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "",
            "",
            "\1\17\1\16"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "263:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );";
        }
    }
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\14\uffff";
    static final String DFA18_minS =
        "\1\51\5\25\6\uffff";
    static final String DFA18_maxS =
        "\1\55\5\32\6\uffff";
    static final String DFA18_acceptS =
        "\6\uffff\1\6\1\2\1\4\1\3\1\5\1\1";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\13\1\7\1\11\1\10\1\12\1\6",
            "\1\13\1\7\1\11\1\10\1\12\1\6",
            "\1\13\1\7\1\11\1\10\1\12\1\6",
            "\1\13\1\7\1\11\1\10\1\12\1\6",
            "\1\13\1\7\1\11\1\10\1\12\1\6",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "273:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );";
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\51\5\22\1\uffff\1\40\2\uffff";
    static final String DFA19_maxS =
        "\1\55\5\23\1\uffff\1\55\2\uffff";
    static final String DFA19_acceptS =
        "\6\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\10\1\6",
            "",
            "\4\10\5\uffff\5\11",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "296:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | x= numericValue RADIAN );";
        }
    }
 

    public static final BitSet FOLLOW_FLIGHTPLAN_in_flightPlan63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_define_in_flightPlan65 = new BitSet(new long[]{0x0000000000000328L});
    public static final BitSet FOLLOW_command_in_flightPlan68 = new BitSet(new long[]{0x0000000000000308L});
    public static final BitSet FOLLOW_defineCommand_in_define81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand125 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand132 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand134 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint160 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_defineWaypoint167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_defineWaypoint190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand230 = new BitSet(new long[]{0x0000000000107008L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand273 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand275 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude317 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude319 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude336 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude353 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude355 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude357 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude374 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude376 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude378 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance418 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance435 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_latitude_in_latitudeLongitude548 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_longitude_in_latitudeLongitude552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude580 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NORTH_in_latitude582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude597 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SOUTH_in_latitude599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude624 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EAST_in_longitude626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude641 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_WEST_in_longitude643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_distanceNorth_in_distanceCoordinate665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_distanceEast_in_distanceCoordinate669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth697 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NORTH_in_distanceNorth699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth714 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SOUTH_in_distanceNorth716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast741 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EAST_in_distanceEast743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast758 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_WEST_in_distanceEast760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance785 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistance787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance798 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_METER_in_convertDistance800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance811 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistance813 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance826 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance839 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_YARD_in_convertDistance841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance852 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_FOOT_in_convertDistance854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel874 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle904 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle917 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle919 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle923 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle936 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1025 = new BitSet(new long[]{0x0000000000000002L});

}