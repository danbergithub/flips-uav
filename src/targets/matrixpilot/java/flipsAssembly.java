// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g 2010-02-04 15:10:21

  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "EXECUTE", "FIXED", "RELATIVE", "ALTITUDE", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "MINUTE", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "Identifier", "To", "At", "With", "FlightLevel", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'an'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'of'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'n'", "'north'", "'s'", "'south'", "'e'", "'east'", "'w'", "'west'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'"
    };
    public static final int OctalLiteral=50;
    public static final int FIXED=10;
    public static final int LATITUDE=15;
    public static final int ATMOSPHERE=36;
    public static final int GEOCOORDINATE=14;
    public static final int SOUTH=40;
    public static final int FOOT=26;
    public static final int EOF=-1;
    public static final int Identifier=43;
    public static final int HECTOPASCAL=32;
    public static final int COMMAND=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int DISTANCE=20;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int To=44;
    public static final int Comment=60;
    public static final int MILLIBAR=35;
    public static final int PARAMETER=7;
    public static final int FlightLevel=47;
    public static final int KILOMETER=21;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int CLIMB=37;
    public static final int YARD=25;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int RADIAN=19;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int PASCAL=33;
    public static final int DEGREE=18;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int With=46;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=59;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__129=129;
    public static final int FLY=8;
    public static final int T__70=70;
    public static final int BinaryLiteral=49;
    public static final int BinaryDigit=56;
    public static final int FloatingPointLiteral=48;
    public static final int METER=22;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int LONGITUDE=16;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int PRESSURE=30;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__135=135;
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
    public static final int T__115=115;
    public static final int MILE=24;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int Exponent=58;
    public static final int LineComment=61;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int DEFINE=5;
    public static final int HexDigit=57;
    public static final int WEST=42;
    public static final int WAYPOINT=13;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int LEFT=27;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int FLIGHTLEVEL=29;
    public static final int HexLiteral=52;
    public static final int At=45;
    public static final int RIGHT=28;
    public static final int T__102=102;
    public static final int RELATIVE=11;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int EAST=41;
    public static final int Digit=53;
    public static final int DecimalLiteral=51;
    public static final int ALTITUDE=12;
    public static final int StringLiteral=54;
    public static final int FLIGHTPLAN=4;
    public static final int KILOPASCAL=31;
    public static final int NAUTICAL=23;
    public static final int NonZeroDigit=55;
    public static final int NORTH=39;
    public static final int MINUTE=17;
    public static final int BAR=34;
    public static final int DESCEND=38;

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
      
      public void addWaypoint(String name, Double latitude, Double longitude) {
        Double[] coordinate = new Double[2];
        coordinate[0] = latitude;
        coordinate[1] = longitude;
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:103:1: flightPlan : ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final void flightPlan() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:2: ( ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:4: ^( FLIGHTPLAN ( define )* ( command )* )
            {
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:17: ( define )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DEFINE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:17: define
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

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:25: ( command )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=FLY && LA2_0<=EXECUTE)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:104:25: command
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:108:1: define : ( defineCommand | defineWaypoint );
    public final void define() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:109:2: ( defineCommand | defineWaypoint )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:109:4: defineCommand
                    {
                    pushFollow(FOLLOW_defineCommand_in_define81);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:110:4: defineWaypoint
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:113:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int cmd = 0;

        int par = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:114:2: ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:114:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:116:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) )
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:120:1: defineWaypoint : ^( DEFINE name= Identifier geo= geoCoordinate ) ;
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.geoCoordinate_return geo = null;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:121:2: ( ^( DEFINE name= Identifier geo= geoCoordinate ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:121:4: ^( DEFINE name= Identifier geo= geoCoordinate )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint156); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint160); 
            pushFollow(FOLLOW_geoCoordinate_in_defineWaypoint164);
            geo=geoCoordinate();

            state._fsp--;


            match(input, Token.UP, null); 
            addWaypoint(name.getText(),geo.latitude,geo.longitude);

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:127:1: command : ( flyCommand | executeCommand );
    public final void command() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:128:2: ( flyCommand | executeCommand )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FLY) ) {
                alt5=1;
            }
            else if ( (LA5_0==EXECUTE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:128:4: flyCommand
                    {
                    pushFollow(FOLLOW_flyCommand_in_command182);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:129:4: executeCommand
                    {
                    pushFollow(FOLLOW_executeCommand_in_command187);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:134:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:135:2: ( ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:135:4: ^( FLY ( flyCommandValue )* )
            {
            match(input,FLY,FOLLOW_FLY_in_flyCommand201); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:135:10: ( flyCommandValue )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=ALTITUDE && LA6_0<=GEOCOORDINATE)||LA6_0==DISTANCE) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:135:10: flyCommandValue
                	    {
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand203);
                	    flyCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:139:1: flyCommandValue : ( distance | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:140:2: ( distance | waypoint | altitude )
            int alt7=3;
            switch ( input.LA(1) ) {
            case DISTANCE:
                {
                alt7=1;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt7=2;
                }
                break;
            case ALTITUDE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:140:4: distance
                    {
                    pushFollow(FOLLOW_distance_in_flyCommandValue220);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:141:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue225);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:142:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_flyCommandValue230);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:145:1: executeCommand : ^( EXECUTE x= Identifier ( executeCommandParameter )* ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:146:2: ( ^( EXECUTE x= Identifier ( executeCommandParameter )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:146:4: ^( EXECUTE x= Identifier ( executeCommandParameter )* )
            {
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand242); 

            match(input, Token.DOWN, null); 
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand246); 
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:146:27: ( executeCommandParameter )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PARAMETER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:146:27: executeCommandParameter
            	    {
            	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand248);
            	    executeCommandParameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:159:1: executeCommandParameter : ^( PARAMETER x= numericValue ) ;
    public final void executeCommandParameter() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:160:2: ( ^( PARAMETER x= numericValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:160:4: ^( PARAMETER x= numericValue )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter265); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_executeCommandParameter269);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:166:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:167:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:167:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude288); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude290); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude292); 
                    pushFollow(FOLLOW_convertDistance_in_altitude296);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:169:4: ^( ALTITUDE FIXED PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude307); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude309); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude311); 
                    pushFollow(FOLLOW_convertPressure_in_altitude315);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:171:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude326); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude328); 
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude332);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:173:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude343); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude345); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude347); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude349); 
                    pushFollow(FOLLOW_convertDistance_in_altitude353);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:175:4: ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude364); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude366); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude368); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude370); 
                    pushFollow(FOLLOW_convertPressure_in_altitude374);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:177:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude385); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude387); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude389); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude391); 
                    pushFollow(FOLLOW_convertDistance_in_altitude395);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:179:4: ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude406); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude408); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude410); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude412); 
                    pushFollow(FOLLOW_convertPressure_in_altitude416);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE REL " + y, y + " kPa Relative Pressure Altitude");

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:185:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:186:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DISTANCE) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt10=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt10=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt10=1;
                        }
                        break;
                    default:
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:186:4: ^( DISTANCE x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance435); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distance439);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:188:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance450); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_distance452); 
                    pushFollow(FOLLOW_convertDistance_in_distance456);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:190:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance467); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance469); 
                    pushFollow(FOLLOW_convertDistance_in_distance473);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:196:1: waypoint : (geo= geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;
        flipsAssembly.geoCoordinate_return geo = null;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:197:2: (geo= geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==GEOCOORDINATE) ) {
                alt11=1;
            }
            else if ( (LA11_0==WAYPOINT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:197:4: geo= geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint493);
                    geo=geoCoordinate();

                    state._fsp--;

                    String ns = geo.latitude >= 0 ? "N" : "S";
                    String ew = geo.longitude >= 0 ? "E" : "W";
                    emit("POS   X FIX " + geo.longitude, Math.abs(geo.longitude) + " " + ew + " Longitude");
                    emit("POS   Y FIX " + geo.latitude, Math.abs(geo.latitude) + " " + ns + " Latitude");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:202:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint515); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint519); 

                    match(input, Token.UP, null); 

                    Double[] coordinate = getWaypoint(x.getText());
                    if (coordinate != null) {
                      String ns = coordinate[0] >= 0 ? "N" : "S";
                      String ew = coordinate[1] >= 0 ? "E" : "W";
                      emit("POS   X FIX " + coordinate[1], x.getText().toUpperCase() + " / " + Math.abs(coordinate[1]) + " " + ew + " Longitude");
                      emit("POS   Y FIX " + coordinate[0], x.getText().toUpperCase() + " / " + Math.abs(coordinate[0]) + " " + ns + " Latitude");
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

    public static class geoCoordinate_return extends TreeRuleReturnScope {
        public double latitude;
        public double longitude;
    };

    // $ANTLR start "geoCoordinate"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:218:1: geoCoordinate returns [double latitude, double longitude] : ^( GEOCOORDINATE x= latitude y= longitude ) ;
    public final flipsAssembly.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsAssembly.geoCoordinate_return retval = new flipsAssembly.geoCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:219:2: ( ^( GEOCOORDINATE x= latitude y= longitude ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:219:4: ^( GEOCOORDINATE x= latitude y= longitude )
            {
            match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate539); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_latitude_in_geoCoordinate543);
            x=latitude();

            state._fsp--;

            pushFollow(FOLLOW_longitude_in_geoCoordinate547);
            y=longitude();

            state._fsp--;


            match(input, Token.UP, null); 
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
    // $ANTLR end "geoCoordinate"


    // $ANTLR start "latitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:224:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:225:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:225:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude572); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude576);
                    x=convertAngle();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_latitude578); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:227:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude589); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude593);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude595); 

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:231:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:232:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:232:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude616); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude620);
                    x=convertAngle();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_longitude622); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:234:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude633); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude637);
                    x=convertAngle();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_longitude639); 

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


    // $ANTLR start "convertDistance"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:241:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:242:2: (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:242:4: x= numericValue KILOMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance664);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistance666); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:244:4: x= numericValue METER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance677);
                    x=numericValue();

                    state._fsp--;

                    match(input,METER,FOLLOW_METER_in_convertDistance679); 
                    r = x;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:246:4: x= numericValue NAUTICAL MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance690);
                    x=numericValue();

                    state._fsp--;

                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistance692); 
                    match(input,MILE,FOLLOW_MILE_in_convertDistance694); 
                    r = x * 1852d;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:248:4: x= numericValue MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance705);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILE,FOLLOW_MILE_in_convertDistance707); 
                    r = x * 1609.344d;

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:250:4: x= numericValue YARD
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance718);
                    x=numericValue();

                    state._fsp--;

                    match(input,YARD,FOLLOW_YARD_in_convertDistance720); 
                    r = x * 0.9144d;

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:252:4: x= numericValue FOOT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance731);
                    x=numericValue();

                    state._fsp--;

                    match(input,FOOT,FOLLOW_FOOT_in_convertDistance733); 
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:257:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:258:2: ( FLIGHTLEVEL x= FlightLevel )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:258:4: FLIGHTLEVEL x= FlightLevel
            {
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel753); 
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel757); 
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


    // $ANTLR start "convertPressure"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:264:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );
    public final double convertPressure() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:265:2: (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:265:4: x= numericValue KILOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure783);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressure785); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:267:4: x= numericValue HECTOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure796);
                    x=numericValue();

                    state._fsp--;

                    match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressure798); 
                    r = x * 100d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:269:4: x= numericValue PASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure809);
                    x=numericValue();

                    state._fsp--;

                    match(input,PASCAL,FOLLOW_PASCAL_in_convertPressure811); 
                    r = x;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:271:4: x= numericValue BAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure822);
                    x=numericValue();

                    state._fsp--;

                    match(input,BAR,FOLLOW_BAR_in_convertPressure824); 
                    r = x * 100000d;

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:273:4: x= numericValue MILLIBAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure835);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressure837); 
                    r = x * 100d;

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:275:4: x= numericValue ATMOSPHERE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure848);
                    x=numericValue();

                    state._fsp--;

                    match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressure850); 
                    r = x * 101325d;

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
    // $ANTLR end "convertPressure"


    // $ANTLR start "convertAngle"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:280:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double minNum = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:281:2: (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | x= numericValue RADIAN )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:281:4: x= numericValue DEGREE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle872);
                    x=numericValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle874); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:283:4: deg= integerValue DEGREE minNum= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle885);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle887); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle891);
                    minNum=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle893); 
                    r = deg + minNum/60d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:285:4: x= numericValue RADIAN
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle904);
                    x=numericValue();

                    state._fsp--;

                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle906); 
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:290:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:291:2: (x= integerValue | y= FloatingPointLiteral )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=BinaryLiteral && LA17_0<=HexLiteral)) ) {
                alt17=1;
            }
            else if ( (LA17_0==FloatingPointLiteral) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:291:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue928);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:293:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue939); 
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:297:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:298:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt18=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt18=1;
                }
                break;
            case OctalLiteral:
                {
                alt18=2;
                }
                break;
            case DecimalLiteral:
                {
                alt18=3;
                }
                break;
            case HexLiteral:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:298:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue960); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:300:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue971); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:302:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue982); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flipsAssembly.g:304:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue993); 
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
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\5\1\2\1\53\1\6\1\2\1\61\4\3\2\uffff";
    static final String DFA4_maxS =
        "\1\5\1\2\1\53\1\6\1\2\1\64\4\7\2\uffff";
    static final String DFA4_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10\1\11",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
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
            return "113:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\16\uffff";
    static final String DFA9_eofS =
        "\16\uffff";
    static final String DFA9_minS =
        "\1\14\1\2\1\12\1\24\1\45\3\uffff\2\24\4\uffff";
    static final String DFA9_maxS =
        "\1\14\1\2\1\13\1\36\1\46\3\uffff\2\36\4\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7";
    static final String DFA9_specialS =
        "\16\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\10\uffff\1\7\1\6",
            "\1\10\1\11",
            "",
            "",
            "",
            "\1\12\11\uffff\1\13",
            "\1\14\11\uffff\1\15",
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
            return "166:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );";
        }
    }
    static final String DFA12_eotS =
        "\23\uffff";
    static final String DFA12_eofS =
        "\23\uffff";
    static final String DFA12_minS =
        "\1\17\1\2\1\60\5\22\3\47\5\21\2\uffff\1\47";
    static final String DFA12_maxS =
        "\1\17\1\2\1\64\5\23\1\64\2\50\5\21\2\uffff\1\50";
    static final String DFA12_acceptS =
        "\20\uffff\1\1\1\2\1\uffff";
    static final String DFA12_specialS =
        "\23\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\20\1\21\7\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "",
            "",
            "\1\20\1\21"
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
            return "224:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
    }
    static final String DFA13_eotS =
        "\23\uffff";
    static final String DFA13_eofS =
        "\23\uffff";
    static final String DFA13_minS =
        "\1\20\1\2\1\60\5\22\3\51\2\uffff\5\21\1\51";
    static final String DFA13_maxS =
        "\1\20\1\2\1\64\5\23\1\52\1\64\1\52\2\uffff\5\21\1\52";
    static final String DFA13_acceptS =
        "\13\uffff\1\1\1\2\6\uffff";
    static final String DFA13_specialS =
        "\23\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\12\1\10",
            "\1\13\1\14",
            "\1\13\1\14\5\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\13\1\14",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\13\1\14"
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
            return "231:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
    }
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\60\5\25\6\uffff";
    static final String DFA14_maxS =
        "\1\64\5\32\6\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\3\1\5\1\1\1\6\1\2\1\4";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\10\1\12\1\6\1\13\1\7\1\11",
            "\1\10\1\12\1\6\1\13\1\7\1\11",
            "\1\10\1\12\1\6\1\13\1\7\1\11",
            "\1\10\1\12\1\6\1\13\1\7\1\11",
            "\1\10\1\12\1\6\1\13\1\7\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "241:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );";
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\60\5\37\6\uffff";
    static final String DFA15_maxS =
        "\1\64\5\44\6\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\1\1\3\1\5\1\2\1\4\1\6";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\11\1\7\1\12\1\10\1\13",
            "\1\6\1\11\1\7\1\12\1\10\1\13",
            "\1\6\1\11\1\7\1\12\1\10\1\13",
            "\1\6\1\11\1\7\1\12\1\10\1\13",
            "\1\6\1\11\1\7\1\12\1\10\1\13",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "264:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );";
        }
    }
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\60\5\22\1\47\3\uffff";
    static final String DFA16_maxS =
        "\1\64\5\23\1\64\3\uffff";
    static final String DFA16_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\10\1\7",
            "\4\10\5\uffff\5\11",
            "",
            "",
            ""
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
            return "280:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | x= numericValue RADIAN );";
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
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand134 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint160 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypoint164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand203 = new BitSet(new long[]{0x0000000000107008L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand246 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand248 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude290 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude292 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude309 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude311 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude328 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude345 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude347 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude349 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude366 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude368 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude370 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude387 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude389 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude391 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude408 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude410 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude412 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance452 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance469 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitude_in_geoCoordinate543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_longitude_in_geoCoordinate547 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude576 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NORTH_in_latitude578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude593 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SOUTH_in_latitude595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude620 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EAST_in_longitude622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude637 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WEST_in_longitude639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance664 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistance666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance677 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_METER_in_convertDistance679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance690 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistance692 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance705 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance718 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_YARD_in_convertDistance720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance731 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_FOOT_in_convertDistance733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel753 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure783 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressure785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure796 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressure798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure809 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressure811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure822 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_BAR_in_convertPressure824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure835 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressure837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure848 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressure850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle872 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle885 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle887 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle891 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle904 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue993 = new BitSet(new long[]{0x0000000000000002L});

}