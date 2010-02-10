// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsAssembly.g 2010-02-10 14:23:28

  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "FlightLevel", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "To", "At", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'('", "')'", "'='", "'Command'", "';'", "','", "'Sensor'", "'Fly'", "'FlyForTime'", "'FlyToDestination'", "'SetDestination'", "'Loiter'", "'LoiterForTime'", "'SetPitch'", "'SetRoll'", "'SetAltitude'", "'SetAltitudeRelative'", "'+'", "'-'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'SetRadius'", "'SetDistance'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'in'", "'inch'", "'inches'", "'SetSpeed'", "'SetSpeedRelative'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'/'", "'per'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'SetThrottle'", "'SetTime'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'SetDuration'", "'SetBearing'", "'SetBearingRelative'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'SetLoiterDirection'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'LocationAbsolute'", "'LocationRelative'", "'%'", "'percent'"
    };
    public static final int DIRECTION=12;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=14;
    public static final int T__262=262;
    public static final int T__263=263;
    public static final int T__160=160;
    public static final int T__260=260;
    public static final int GEOCOORDINATE=31;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=72;
    public static final int T__264=264;
    public static final int FOOT=51;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int HECTOPASCAL=61;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=43;
    public static final int FASTER=20;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=88;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int MINIMUM=63;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int KILOMETER=44;
    public static final int T__256=256;
    public static final int EQ=75;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int SENSOR=8;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int GE=80;
    public static final int T__136=136;
    public static final int FORTNIGHT=35;
    public static final int YARD=50;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int DURATION=28;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int CRUISE=65;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=96;
    public static final int T__129=129;
    public static final int OPTIMAL=22;
    public static final int BinaryLiteral=84;
    public static final int T__269=269;
    public static final int THROTTLE=23;
    public static final int BinaryDigit=93;
    public static final int T__268=268;
    public static final int FloatingPointLiteral=83;
    public static final int GT=78;
    public static final int METER=45;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=29;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int EXECUTE=11;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int HexDigit=94;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=30;
    public static final int TIME=24;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int LEFT=53;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=58;
    public static final int T__112=112;
    public static final int CENTIMETER=46;
    public static final int T__210=210;
    public static final int AM=25;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=87;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=89;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=54;
    public static final int T__102=102;
    public static final int RELATIVE=15;
    public static final int T__101=101;
    public static final int EAST=73;
    public static final int T__100=100;
    public static final int HOUR=38;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=18;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=91;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=47;
    public static final int T__227=227;
    public static final int NonZeroDigit=92;
    public static final int NORTH=71;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=70;
    public static final int T__230=230;
    public static final int WEEK=36;
    public static final int LT=77;
    public static final int OctalLiteral=85;
    public static final int LATITUDE=32;
    public static final int ATMOSPHERE=68;
    public static final int DAY=37;
    public static final int Identifier=81;
    public static final int COMMAND=6;
    public static final int Comment=97;
    public static final int MILLIBAR=67;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=56;
    public static final int FlightLevel=82;
    public static final int INCH=52;
    public static final int NE=76;
    public static final int SECOND=40;
    public static final int CLIMB=69;
    public static final int ROLL=16;
    public static final int HOUR24=27;
    public static final int RADIAN=42;
    public static final int TURN=13;
    public static final int DEGREE=41;
    public static final int PASCAL=62;
    public static final int FLY=9;
    public static final int T__200=200;
    public static final int SLOWER=21;
    public static final int T__201=201;
    public static final int PM=26;
    public static final int FURLONG=49;
    public static final int LONGITUDE=33;
    public static final int PRESSURE=59;
    public static final int YEAR=34;
    public static final int MILE=48;
    public static final int Exponent=95;
    public static final int LineComment=98;
    public static final int DEFINE=5;
    public static final int WEST=74;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int SPEED=19;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=57;
    public static final int T__189=189;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=90;
    public static final int DecimalLiteral=86;
    public static final int T__175=175;
    public static final int FLIGHTPLAN=4;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=60;
    public static final int T__176=176;
    public static final int CLOCKWISE=55;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MAXIMUM=64;
    public static final int MINUTE=39;
    public static final int T__169=169;
    public static final int BAR=66;
    public static final int LE=79;

    // delegates
    // delegators


        public flipsAssembly(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsAssembly(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsAssembly.tokenNames; }
    public String getGrammarFileName() { return "flipsAssembly.g"; }


      HashMap<String,Integer> commands = new HashMap<String,Integer>();
      HashMap<String,Integer> sensors = new HashMap<String,Integer>();
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
      
      public void addSensor(String name, Integer value) {
        sensors.put(name, value);
      }
      
      public Integer getSensor(String name) {
        if (sensors.containsKey(name)) {
          return sensors.get(name);
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
    // flipsAssembly.g:116:1: flightPlan : ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final void flightPlan() throws RecognitionException {
        try {
            // flipsAssembly.g:117:2: ( ^( FLIGHTPLAN ( define )* ( command )* ) )
            // flipsAssembly.g:117:4: ^( FLIGHTPLAN ( define )* ( command )* )
            {
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:117:17: ( define )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DEFINE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // flipsAssembly.g:117:17: define
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

                // flipsAssembly.g:117:25: ( command )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=FLY && LA2_0<=EXECUTE)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // flipsAssembly.g:117:25: command
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
    // flipsAssembly.g:121:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final void define() throws RecognitionException {
        try {
            // flipsAssembly.g:122:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DEFINE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==Identifier) ) {
                        switch ( input.LA(4) ) {
                        case COMMAND:
                            {
                            alt3=1;
                            }
                            break;
                        case SENSOR:
                            {
                            alt3=2;
                            }
                            break;
                        case GEOCOORDINATE:
                            {
                            alt3=3;
                            }
                            break;
                        default:
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
                    // flipsAssembly.g:122:4: defineCommand
                    {
                    pushFollow(FOLLOW_defineCommand_in_define81);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:123:4: defineSensor
                    {
                    pushFollow(FOLLOW_defineSensor_in_define86);
                    defineSensor();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:124:4: defineWaypoint
                    {
                    pushFollow(FOLLOW_defineWaypoint_in_define91);
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
    // flipsAssembly.g:127:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int cmd = 0;

        int par = 0;


        try {
            // flipsAssembly.g:128:2: ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // flipsAssembly.g:128:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand103); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand107); 
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand110); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand114);
                    cmd=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    addCommand(name.getText(),cmd);

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:130:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand126); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand130); 
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand133); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand137);
                    cmd=integerValue();

                    state._fsp--;

                    match(input,PARAMETER,FOLLOW_PARAMETER_in_defineCommand139); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand143);
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


    // $ANTLR start "defineSensor"
    // flipsAssembly.g:134:1: defineSensor : ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) ;
    public final void defineSensor() throws RecognitionException {
        CommonTree name=null;
        int sen = 0;


        try {
            // flipsAssembly.g:135:2: ( ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) )
            // flipsAssembly.g:135:4: ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_defineSensor161); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineSensor165); 
            match(input,SENSOR,FOLLOW_SENSOR_in_defineSensor168); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_integerValue_in_defineSensor172);
            sen=integerValue();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            addSensor(name.getText(),sen);

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
    // $ANTLR end "defineSensor"


    // $ANTLR start "defineWaypoint"
    // flipsAssembly.g:139:1: defineWaypoint : ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) );
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:140:2: ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) )
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

                                if ( (LA5_5==DISTANCE) ) {
                                    alt5=2;
                                }
                                else if ( (LA5_5==LATITUDE) ) {
                                    alt5=1;
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
                    // flipsAssembly.g:140:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint190); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint194); 
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_defineWaypoint197); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_defineWaypoint201);
                    geo=latitudeLongitude();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    addWaypoint(name.getText(),geo.latitude,geo.longitude,0d);

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:142:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint213); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint217); 
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_defineWaypoint220); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_defineWaypoint224);
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
    // flipsAssembly.g:148:1: command : ( flyCommand | loiterCommand | executeCommand );
    public final void command() throws RecognitionException {
        try {
            // flipsAssembly.g:149:2: ( flyCommand | loiterCommand | executeCommand )
            int alt6=3;
            switch ( input.LA(1) ) {
            case FLY:
                {
                alt6=1;
                }
                break;
            case LOITER:
                {
                alt6=2;
                }
                break;
            case EXECUTE:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // flipsAssembly.g:149:4: flyCommand
                    {
                    pushFollow(FOLLOW_flyCommand_in_command243);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:150:4: loiterCommand
                    {
                    pushFollow(FOLLOW_loiterCommand_in_command248);
                    loiterCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:151:4: executeCommand
                    {
                    pushFollow(FOLLOW_executeCommand_in_command253);
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
    // flipsAssembly.g:156:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try {
            // flipsAssembly.g:157:2: ( ^( FLY ( flyCommandValue )* ) )
            // flipsAssembly.g:157:4: ^( FLY ( flyCommandValue )* )
            {
            match(input,FLY,FOLLOW_FLY_in_flyCommand267); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:157:10: ( flyCommandValue )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==DIRECTION||(LA7_0>=ROLL && LA7_0<=SPEED)||LA7_0==TIME||LA7_0==DURATION||(LA7_0>=WAYPOINT && LA7_0<=GEOCOORDINATE)||LA7_0==DISTANCE) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // flipsAssembly.g:157:10: flyCommandValue
                	    {
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand269);
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
    // flipsAssembly.g:161:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try {
            // flipsAssembly.g:162:2: ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude )
            int alt8=9;
            switch ( input.LA(1) ) {
            case TIME:
                {
                alt8=1;
                }
                break;
            case DIRECTION:
                {
                alt8=2;
                }
                break;
            case SPEED:
                {
                alt8=3;
                }
                break;
            case DISTANCE:
                {
                alt8=4;
                }
                break;
            case PITCH:
                {
                alt8=5;
                }
                break;
            case ROLL:
                {
                alt8=6;
                }
                break;
            case DURATION:
                {
                alt8=7;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt8=8;
                }
                break;
            case ALTITUDE:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // flipsAssembly.g:162:4: time
                    {
                    pushFollow(FOLLOW_time_in_flyCommandValue286);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:163:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_flyCommandValue291);
                    direction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:164:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_flyCommandValue296);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:165:4: distance
                    {
                    pushFollow(FOLLOW_distance_in_flyCommandValue301);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsAssembly.g:166:4: pitch
                    {
                    pushFollow(FOLLOW_pitch_in_flyCommandValue306);
                    pitch();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsAssembly.g:167:4: roll
                    {
                    pushFollow(FOLLOW_roll_in_flyCommandValue311);
                    roll();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsAssembly.g:168:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_flyCommandValue316);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsAssembly.g:169:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue321);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsAssembly.g:170:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_flyCommandValue326);
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


    // $ANTLR start "loiterCommand"
    // flipsAssembly.g:173:1: loiterCommand : ^( LOITER ( loiterCommandValue )* ) ;
    public final void loiterCommand() throws RecognitionException {
        try {
            // flipsAssembly.g:174:2: ( ^( LOITER ( loiterCommandValue )* ) )
            // flipsAssembly.g:174:4: ^( LOITER ( loiterCommandValue )* )
            {
            match(input,LOITER,FOLLOW_LOITER_in_loiterCommand338); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:174:13: ( loiterCommandValue )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==DIRECTION||(LA9_0>=ALTITUDE && LA9_0<=SPEED)||LA9_0==TIME||(LA9_0>=DURATION && LA9_0<=GEOCOORDINATE)) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // flipsAssembly.g:174:13: loiterCommandValue
                	    {
                	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand340);
                	    loiterCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            emit("LTR", "Execute Loiter");

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
    // $ANTLR end "loiterCommand"


    // $ANTLR start "loiterCommandValue"
    // flipsAssembly.g:178:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | waypoint | altitude );
    public final void loiterCommandValue() throws RecognitionException {
        try {
            // flipsAssembly.g:179:2: ( time | speed | loiterDirection | radius | duration | waypoint | altitude )
            int alt10=7;
            switch ( input.LA(1) ) {
            case TIME:
                {
                alt10=1;
                }
                break;
            case SPEED:
                {
                alt10=2;
                }
                break;
            case DIRECTION:
                {
                alt10=3;
                }
                break;
            case RADIUS:
                {
                alt10=4;
                }
                break;
            case DURATION:
                {
                alt10=5;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt10=6;
                }
                break;
            case ALTITUDE:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // flipsAssembly.g:179:4: time
                    {
                    pushFollow(FOLLOW_time_in_loiterCommandValue357);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:180:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_loiterCommandValue362);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:181:4: loiterDirection
                    {
                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue367);
                    loiterDirection();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:182:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_loiterCommandValue372);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsAssembly.g:183:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_loiterCommandValue377);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsAssembly.g:184:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue382);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsAssembly.g:185:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_loiterCommandValue387);
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
    // $ANTLR end "loiterCommandValue"


    // $ANTLR start "executeCommand"
    // flipsAssembly.g:188:1: executeCommand : ^( EXECUTE x= Identifier ( executeCommandParameter )* ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:189:2: ( ^( EXECUTE x= Identifier ( executeCommandParameter )* ) )
            // flipsAssembly.g:189:4: ^( EXECUTE x= Identifier ( executeCommandParameter )* )
            {
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand399); 

            match(input, Token.DOWN, null); 
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand403); 
            // flipsAssembly.g:189:27: ( executeCommandParameter )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PARAMETER) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // flipsAssembly.g:189:27: executeCommandParameter
            	    {
            	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand405);
            	    executeCommandParameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // flipsAssembly.g:202:1: executeCommandParameter : ^( PARAMETER x= numericValue ) ;
    public final void executeCommandParameter() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:203:2: ( ^( PARAMETER x= numericValue ) )
            // flipsAssembly.g:203:4: ^( PARAMETER x= numericValue )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter422); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_executeCommandParameter426);
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


    // $ANTLR start "pitch"
    // flipsAssembly.g:209:1: pitch : ^( PITCH x= convertAngle ) ;
    public final void pitch() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:210:2: ( ^( PITCH x= convertAngle ) )
            // flipsAssembly.g:210:4: ^( PITCH x= convertAngle )
            {
            match(input,PITCH,FOLLOW_PITCH_in_pitch445); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertAngle_in_pitch449);
            x=convertAngle();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("POS PIT FIX " + x, x + " deg Pitch");

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
    // $ANTLR end "pitch"


    // $ANTLR start "roll"
    // flipsAssembly.g:214:1: roll : ^( ROLL x= convertAngle ) ;
    public final void roll() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:215:2: ( ^( ROLL x= convertAngle ) )
            // flipsAssembly.g:215:4: ^( ROLL x= convertAngle )
            {
            match(input,ROLL,FOLLOW_ROLL_in_roll466); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertAngle_in_roll470);
            x=convertAngle();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("POS ROL FIX " + x, x + " deg Roll");

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
    // $ANTLR end "roll"


    // $ANTLR start "altitude"
    // flipsAssembly.g:221:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:222:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) )
            int alt12=7;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // flipsAssembly.g:222:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude489); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude491); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude493); 
                    pushFollow(FOLLOW_convertDistance_in_altitude497);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:224:4: ^( ALTITUDE FIXED PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude508); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude510); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude512); 
                    pushFollow(FOLLOW_convertPressure_in_altitude516);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:226:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude527); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude529); 
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude533);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:228:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude544); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude546); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude548); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude550); 
                    pushFollow(FOLLOW_convertDistance_in_altitude554);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:230:4: ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude565); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude567); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude569); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude571); 
                    pushFollow(FOLLOW_convertPressure_in_altitude575);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:232:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude586); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude588); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude590); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude592); 
                    pushFollow(FOLLOW_convertDistance_in_altitude596);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:234:4: ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude607); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude609); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude611); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude613); 
                    pushFollow(FOLLOW_convertPressure_in_altitude617);
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
    // flipsAssembly.g:240:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:241:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DISTANCE) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt13=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt13=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt13=1;
                        }
                        break;
                    default:
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
                    // flipsAssembly.g:241:4: ^( DISTANCE x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance636); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distance640);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:243:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance651); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_distance653); 
                    pushFollow(FOLLOW_convertDistance_in_distance657);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:245:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance668); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance670); 
                    pushFollow(FOLLOW_convertDistance_in_distance674);
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


    // $ANTLR start "radius"
    // flipsAssembly.g:249:1: radius : ^( RADIUS x= convertDistance ) ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:250:2: ( ^( RADIUS x= convertDistance ) )
            // flipsAssembly.g:250:4: ^( RADIUS x= convertDistance )
            {
            match(input,RADIUS,FOLLOW_RADIUS_in_radius691); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertDistance_in_radius695);
            x=convertDistance();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("RAD " + x, mToft(x) + "Radius");

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


    // $ANTLR start "speed"
    // flipsAssembly.g:256:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) );
    public final void speed() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:257:2: ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) )
            int alt14=9;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // flipsAssembly.g:257:4: ^( SPEED FIXED x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed714); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_speed716); 
                    pushFollow(FOLLOW_convertSpeed_in_speed720);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:259:4: ^( SPEED RELATIVE FASTER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed731); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed733); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed735); 
                    pushFollow(FOLLOW_convertSpeed_in_speed739);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:261:4: ^( SPEED RELATIVE SLOWER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed750); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed752); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed754); 
                    pushFollow(FOLLOW_convertSpeed_in_speed758);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + -x, -x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:263:4: ^( SPEED RELATIVE FASTER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed769); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed771); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed773); 
                    pushFollow(FOLLOW_percentValue_in_speed777);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:264:4: ^( SPEED RELATIVE SLOWER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed784); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed786); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed788); 
                    pushFollow(FOLLOW_percentValue_in_speed792);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:265:4: ^( SPEED OPTIMAL MINIMUM )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed799); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed801); 
                    match(input,MINIMUM,FOLLOW_MINIMUM_in_speed803); 

                    match(input, Token.UP, null); 
                    emit("SPD AIR OPT MIN", "Minimum Air Speed");

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:267:4: ^( SPEED OPTIMAL CRUISE )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed814); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed816); 
                    match(input,CRUISE,FOLLOW_CRUISE_in_speed818); 

                    match(input, Token.UP, null); 
                    emit("SPD AIR OPT CRU", "Cruise Air Speed");

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:269:4: ^( SPEED OPTIMAL MAXIMUM )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed829); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed831); 
                    match(input,MAXIMUM,FOLLOW_MAXIMUM_in_speed833); 

                    match(input, Token.UP, null); 
                    emit("SPD AIR OPT MAX", "Maximum Air Speed");

                    }
                    break;
                case 9 :
                    // flipsAssembly.g:271:4: ^( SPEED THROTTLE y= convertThrottle )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed844); 

                    match(input, Token.DOWN, null); 
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_speed846); 
                    pushFollow(FOLLOW_convertThrottle_in_speed850);
                    y=convertThrottle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("ACT THR FIX " + y, y + "% Throttle");

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


    // $ANTLR start "time"
    // flipsAssembly.g:277:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );
    public final void time() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:278:2: ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // flipsAssembly.g:278:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time869); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time873);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:278:25: (y= convertTime (z= convertTime )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=FloatingPointLiteral && LA16_0<=HexLiteral)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // flipsAssembly.g:278:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time878);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:278:40: (z= convertTime )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( ((LA15_0>=FloatingPointLiteral && LA15_0<=HexLiteral)) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // flipsAssembly.g:278:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time883);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,AM,FOLLOW_AM_in_time889); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:281:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time904); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time908);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:281:25: (y= convertTime (z= convertTime )? )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=FloatingPointLiteral && LA18_0<=HexLiteral)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // flipsAssembly.g:281:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time913);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:281:40: (z= convertTime )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( ((LA17_0>=FloatingPointLiteral && LA17_0<=HexLiteral)) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // flipsAssembly.g:281:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time918);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,PM,FOLLOW_PM_in_time924); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:284:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time939); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time943);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:284:25: (y= convertTime (z= convertTime )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=FloatingPointLiteral && LA20_0<=HexLiteral)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // flipsAssembly.g:284:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time948);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:284:40: (z= convertTime )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( ((LA19_0>=FloatingPointLiteral && LA19_0<=HexLiteral)) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // flipsAssembly.g:284:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time953);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,HOUR24,FOLLOW_HOUR24_in_time959); 

                    match(input, Token.UP, null); 
                    emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Time");

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


    // $ANTLR start "duration"
    // flipsAssembly.g:288:1: duration : ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) ;
    public final void duration() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:289:2: ( ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) )
            // flipsAssembly.g:289:4: ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? )
            {
            match(input,DURATION,FOLLOW_DURATION_in_duration976); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertTime_in_duration980);
            x=convertTime();

            state._fsp--;

            // flipsAssembly.g:289:29: (y= convertTime (z= convertTime )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=FloatingPointLiteral && LA23_0<=HexLiteral)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // flipsAssembly.g:289:30: y= convertTime (z= convertTime )?
                    {
                    pushFollow(FOLLOW_convertTime_in_duration985);
                    y=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:289:44: (z= convertTime )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=FloatingPointLiteral && LA22_0<=HexLiteral)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // flipsAssembly.g:289:45: z= convertTime
                            {
                            pushFollow(FOLLOW_convertTime_in_duration990);
                            z=convertTime();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 
            emit("TIM REL " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Duration");

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
    // $ANTLR end "duration"


    // $ANTLR start "direction"
    // flipsAssembly.g:295:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );
    public final void direction() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:296:2: ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) )
            int alt24=6;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // flipsAssembly.g:296:4: ^( DIRECTION FIXED x= convertCardinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1013); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1015); 
                    pushFollow(FOLLOW_convertCardinalDirection_in_direction1019);
                    x=convertCardinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:298:4: ^( DIRECTION FIXED x= convertOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1030); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1032); 
                    pushFollow(FOLLOW_convertOrdinalDirection_in_direction1036);
                    x=convertOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:300:4: ^( DIRECTION FIXED x= convertSubOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1047); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1049); 
                    pushFollow(FOLLOW_convertSubOrdinalDirection_in_direction1053);
                    x=convertSubOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:302:4: ^( DIRECTION FIXED y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1064); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1066); 
                    pushFollow(FOLLOW_convertAngle_in_direction1070);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:304:4: ^( DIRECTION RELATIVE LEFT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1081); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1083); 
                    match(input,LEFT,FOLLOW_LEFT_in_direction1085); 
                    pushFollow(FOLLOW_convertAngle_in_direction1089);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + -y, -y + " deg Yaw");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:306:4: ^( DIRECTION RELATIVE RIGHT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1100); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1102); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_direction1104); 
                    pushFollow(FOLLOW_convertAngle_in_direction1108);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + y, y + " deg Yaw");

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


    // $ANTLR start "turnDirection"
    // flipsAssembly.g:310:1: turnDirection : ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) );
    public final void turnDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:311:2: ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DIRECTION) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==TURN) ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==LEFT) ) {
                            alt25=1;
                        }
                        else if ( (LA25_3==RIGHT) ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // flipsAssembly.g:311:4: ^( DIRECTION TURN LEFT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1125); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1127); 
                    match(input,LEFT,FOLLOW_LEFT_in_turnDirection1129); 

                    match(input, Token.UP, null); 
                    emit("DIR L", "Left Turn Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:313:4: ^( DIRECTION TURN RIGHT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1140); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1142); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_turnDirection1144); 

                    match(input, Token.UP, null); 
                    emit("DIR R", "Right Turn Direction");

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
    // $ANTLR end "turnDirection"


    // $ANTLR start "loiterDirection"
    // flipsAssembly.g:317:1: loiterDirection : ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) );
    public final void loiterDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:318:2: ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DIRECTION) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==DOWN) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==TURN) ) {
                        int LA26_3 = input.LA(4);

                        if ( (LA26_3==CLOCKWISE) ) {
                            alt26=1;
                        }
                        else if ( (LA26_3==COUNTERCLOCKWISE) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // flipsAssembly.g:318:4: ^( DIRECTION TURN CLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1161); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1163); 
                    match(input,CLOCKWISE,FOLLOW_CLOCKWISE_in_loiterDirection1165); 

                    match(input, Token.UP, null); 
                    emit("DIR CW", "Clockwise Loiter Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:320:4: ^( DIRECTION TURN COUNTERCLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1176); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1178); 
                    match(input,COUNTERCLOCKWISE,FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1180); 

                    match(input, Token.UP, null); 
                    emit("DIR CCW", "Counterclockwise Loiter Direction");

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
    // $ANTLR end "loiterDirection"


    // $ANTLR start "waypoint"
    // flipsAssembly.g:326:1: waypoint : ( geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:327:2: ( geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==GEOCOORDINATE) ) {
                alt27=1;
            }
            else if ( (LA27_0==WAYPOINT) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // flipsAssembly.g:327:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1198);
                    geoCoordinate();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:328:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint1204); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint1208); 

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
    // flipsAssembly.g:350:1: geoCoordinate : ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) );
    public final void geoCoordinate() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:351:2: ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==GEOCOORDINATE) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==DOWN) ) {
                    int LA28_2 = input.LA(3);

                    if ( (LA28_2==LATITUDE) ) {
                        alt28=1;
                    }
                    else if ( (LA28_2==DISTANCE) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // flipsAssembly.g:351:4: ^( GEOCOORDINATE geo= latitudeLongitude )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1224); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate1228);
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
                    // flipsAssembly.g:356:4: ^( GEOCOORDINATE dst= distanceCoordinate )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1251); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate1255);
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
    // flipsAssembly.g:363:1: latitudeLongitude returns [double latitude, double longitude] : x= latitude y= longitude ;
    public final flipsAssembly.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return retval = new flipsAssembly.latitudeLongitude_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:364:2: (x= latitude y= longitude )
            // flipsAssembly.g:364:4: x= latitude y= longitude
            {
            pushFollow(FOLLOW_latitude_in_latitudeLongitude1289);
            x=latitude();

            state._fsp--;

            pushFollow(FOLLOW_longitude_in_latitudeLongitude1293);
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
    // flipsAssembly.g:369:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:370:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // flipsAssembly.g:370:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1317); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1321);
                    x=convertAngle();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_latitude1323); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:372:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1334); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1338);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude1340); 

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
    // flipsAssembly.g:376:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:377:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // flipsAssembly.g:377:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1365);
                    x=convertAngle();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_longitude1367); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:379:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1378); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1382);
                    x=convertAngle();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_longitude1384); 

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
    // flipsAssembly.g:383:1: distanceCoordinate returns [double north, double east] : x= distanceNorth y= distanceEast ;
    public final flipsAssembly.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsAssembly.distanceCoordinate_return retval = new flipsAssembly.distanceCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:384:2: (x= distanceNorth y= distanceEast )
            // flipsAssembly.g:384:4: x= distanceNorth y= distanceEast
            {
            pushFollow(FOLLOW_distanceNorth_in_distanceCoordinate1406);
            x=distanceNorth();

            state._fsp--;

            pushFollow(FOLLOW_distanceEast_in_distanceCoordinate1410);
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
    // flipsAssembly.g:389:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );
    public final double distanceNorth() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:390:2: ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // flipsAssembly.g:390:4: ^( DISTANCE x= convertDistance NORTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth1434); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth1438);
                    x=convertDistance();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_distanceNorth1440); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:392:4: ^( DISTANCE x= convertDistance SOUTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth1451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth1455);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_distanceNorth1457); 

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
    // flipsAssembly.g:396:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );
    public final double distanceEast() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:397:2: ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // flipsAssembly.g:397:4: ^( DISTANCE x= convertDistance EAST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast1478); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast1482);
                    x=convertDistance();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_distanceEast1484); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:399:4: ^( DISTANCE x= convertDistance WEST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast1495); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast1499);
                    x=convertDistance();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_distanceEast1501); 

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


    // $ANTLR start "convertTime"
    // flipsAssembly.g:406:1: convertTime returns [double r] : (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND );
    public final double convertTime() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:407:2: (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // flipsAssembly.g:407:4: x= numericValue YEAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1526);
                    x=numericValue();

                    state._fsp--;

                    match(input,YEAR,FOLLOW_YEAR_in_convertTime1528); 
                    r = x * 31557600d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:409:4: x= numericValue FORTNIGHT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1539);
                    x=numericValue();

                    state._fsp--;

                    match(input,FORTNIGHT,FOLLOW_FORTNIGHT_in_convertTime1541); 
                    r = x * 1209600d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:411:4: x= numericValue WEEK
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1552);
                    x=numericValue();

                    state._fsp--;

                    match(input,WEEK,FOLLOW_WEEK_in_convertTime1554); 
                    r = x * 604800d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:413:4: x= numericValue DAY
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1565);
                    x=numericValue();

                    state._fsp--;

                    match(input,DAY,FOLLOW_DAY_in_convertTime1567); 
                    r = x * 86400d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:415:4: x= numericValue HOUR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1578);
                    x=numericValue();

                    state._fsp--;

                    match(input,HOUR,FOLLOW_HOUR_in_convertTime1580); 
                    r = x * 3600d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:417:4: x= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1591);
                    x=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertTime1593); 
                    r = x * 60d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:419:4: x= numericValue SECOND
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1604);
                    x=numericValue();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertTime1606); 
                    r = x;

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
    // $ANTLR end "convertTime"


    // $ANTLR start "convertDistance"
    // flipsAssembly.g:424:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue CENTIMETER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue FURLONG | x= numericValue YARD | x= numericValue FOOT | x= numericValue INCH );
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:425:2: (x= numericValue KILOMETER | x= numericValue METER | x= numericValue CENTIMETER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue FURLONG | x= numericValue YARD | x= numericValue FOOT | x= numericValue INCH )
            int alt34=9;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // flipsAssembly.g:425:4: x= numericValue KILOMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1628);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistance1630); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:427:4: x= numericValue METER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1641);
                    x=numericValue();

                    state._fsp--;

                    match(input,METER,FOLLOW_METER_in_convertDistance1643); 
                    r = x;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:429:4: x= numericValue CENTIMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1654);
                    x=numericValue();

                    state._fsp--;

                    match(input,CENTIMETER,FOLLOW_CENTIMETER_in_convertDistance1656); 
                    r = x * 0.01d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:431:4: x= numericValue NAUTICAL MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1667);
                    x=numericValue();

                    state._fsp--;

                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistance1669); 
                    match(input,MILE,FOLLOW_MILE_in_convertDistance1671); 
                    r = x * 1852d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:433:4: x= numericValue MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1682);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILE,FOLLOW_MILE_in_convertDistance1684); 
                    r = x * 1609.344d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:435:4: x= numericValue FURLONG
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1695);
                    x=numericValue();

                    state._fsp--;

                    match(input,FURLONG,FOLLOW_FURLONG_in_convertDistance1697); 
                    r = x * 201.168d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:437:4: x= numericValue YARD
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1708);
                    x=numericValue();

                    state._fsp--;

                    match(input,YARD,FOLLOW_YARD_in_convertDistance1710); 
                    r = x * 0.9144d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:439:4: x= numericValue FOOT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1721);
                    x=numericValue();

                    state._fsp--;

                    match(input,FOOT,FOLLOW_FOOT_in_convertDistance1723); 
                    r = x * 0.3048d;

                    }
                    break;
                case 9 :
                    // flipsAssembly.g:441:4: x= numericValue INCH
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1734);
                    x=numericValue();

                    state._fsp--;

                    match(input,INCH,FOLLOW_INCH_in_convertDistance1736); 
                    r = x * 0.0254d;

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
    // flipsAssembly.g:446:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:447:2: ( FLIGHTLEVEL x= FlightLevel )
            // flipsAssembly.g:447:4: FLIGHTLEVEL x= FlightLevel
            {
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1756); 
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel1760); 
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
    // flipsAssembly.g:453:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );
    public final double convertPressure() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:454:2: (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE )
            int alt35=6;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // flipsAssembly.g:454:4: x= numericValue KILOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1786);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressure1788); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:456:4: x= numericValue HECTOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1799);
                    x=numericValue();

                    state._fsp--;

                    match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressure1801); 
                    r = x * 100d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:458:4: x= numericValue PASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1812);
                    x=numericValue();

                    state._fsp--;

                    match(input,PASCAL,FOLLOW_PASCAL_in_convertPressure1814); 
                    r = x;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:460:4: x= numericValue BAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1825);
                    x=numericValue();

                    state._fsp--;

                    match(input,BAR,FOLLOW_BAR_in_convertPressure1827); 
                    r = x * 100000d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:462:4: x= numericValue MILLIBAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1838);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressure1840); 
                    r = x * 100d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:464:4: x= numericValue ATMOSPHERE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1851);
                    x=numericValue();

                    state._fsp--;

                    match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressure1853); 
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


    // $ANTLR start "convertSpeed"
    // flipsAssembly.g:469:1: convertSpeed returns [double r] : (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND );
    public final double convertSpeed() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:470:2: (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // flipsAssembly.g:470:4: x= convertDistance HOUR
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1875);
                    x=convertDistance();

                    state._fsp--;

                    match(input,HOUR,FOLLOW_HOUR_in_convertSpeed1877); 
                    r = x / 3600d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:472:4: x= convertDistance MINUTE
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1888);
                    x=convertDistance();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertSpeed1890); 
                    r = x / 60d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:474:4: x= convertDistance SECOND
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1901);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertSpeed1903); 
                    r = x;

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
    // $ANTLR end "convertSpeed"


    // $ANTLR start "convertThrottle"
    // flipsAssembly.g:479:1: convertThrottle returns [double r] : x= percentValue ;
    public final double convertThrottle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:480:2: (x= percentValue )
            // flipsAssembly.g:480:4: x= percentValue
            {
            pushFollow(FOLLOW_percentValue_in_convertThrottle1925);
            x=percentValue();

            state._fsp--;

            r = x;

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
    // $ANTLR end "convertThrottle"


    // $ANTLR start "convertAngle"
    // flipsAssembly.g:485:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double minNum = 0.0;

        int minInt = 0;

        double sec = 0.0;


        try {
            // flipsAssembly.g:486:2: (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // flipsAssembly.g:486:4: x= numericValue DEGREE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle1947);
                    x=numericValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1949); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:488:4: deg= integerValue DEGREE minNum= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle1960);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1962); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle1966);
                    minNum=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1968); 
                    r = deg + minNum/60d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:490:4: deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle1979);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1981); 
                    pushFollow(FOLLOW_integerValue_in_convertAngle1985);
                    minInt=integerValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1987); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle1991);
                    sec=numericValue();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertAngle1993); 
                    r = deg + minInt/60d + sec/3600d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:492:4: x= numericValue RADIAN
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle2004);
                    x=numericValue();

                    state._fsp--;

                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle2006); 
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


    // $ANTLR start "convertCardinalDirection"
    // flipsAssembly.g:497:1: convertCardinalDirection returns [double r] : ( NORTH | EAST | SOUTH | WEST );
    public final double convertCardinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:498:2: ( NORTH | EAST | SOUTH | WEST )
            int alt38=4;
            switch ( input.LA(1) ) {
            case NORTH:
                {
                alt38=1;
                }
                break;
            case EAST:
                {
                alt38=2;
                }
                break;
            case SOUTH:
                {
                alt38=3;
                }
                break;
            case WEST:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // flipsAssembly.g:498:4: NORTH
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertCardinalDirection2026); 
                    r = 0d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:500:4: EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertCardinalDirection2035); 
                    r = 90d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:502:4: SOUTH
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertCardinalDirection2044); 
                    r = 180d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:504:4: WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertCardinalDirection2053); 
                    r = 270d;

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
    // $ANTLR end "convertCardinalDirection"


    // $ANTLR start "convertOrdinalDirection"
    // flipsAssembly.g:509:1: convertOrdinalDirection returns [double r] : ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST );
    public final double convertOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:510:2: ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST )
            int alt39=4;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NORTH) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EAST) ) {
                    alt39=1;
                }
                else if ( (LA39_1==WEST) ) {
                    alt39=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==SOUTH) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==EAST) ) {
                    alt39=2;
                }
                else if ( (LA39_2==WEST) ) {
                    alt39=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // flipsAssembly.g:510:4: NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2073); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2075); 
                    r = 45d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:512:4: SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2084); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2086); 
                    r = 135d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:514:4: SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2095); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2097); 
                    r = 225d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:516:4: NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2106); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2108); 
                    r = 315d;

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
    // $ANTLR end "convertOrdinalDirection"


    // $ANTLR start "convertSubOrdinalDirection"
    // flipsAssembly.g:521:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );
    public final double convertSubOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:522:2: ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST )
            int alt40=8;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // flipsAssembly.g:522:4: NORTH NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2128); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2130); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2132); 
                    r = 22.5d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:524:4: EAST NORTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2141); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2143); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2145); 
                    r = 67.5d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:526:4: EAST SOUTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2154); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2156); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2158); 
                    r = 112.5d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:528:4: SOUTH SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2167); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2169); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2171); 
                    r = 157.5d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:530:4: SOUTH SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2180); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2182); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2184); 
                    r = 202.5d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:532:4: WEST SOUTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2193); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2195); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2197); 
                    r = 247.5d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:534:4: WEST NORTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2206); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2208); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2210); 
                    r = 292.5d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:536:4: NORTH NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2219); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2221); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2223); 
                    r = 337.5d;

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
    // $ANTLR end "convertSubOrdinalDirection"


    // $ANTLR start "convertDirection"
    // flipsAssembly.g:540:1: convertDirection[double r] : ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) );
    public final void convertDirection(double r) throws RecognitionException {
        try {
            // flipsAssembly.g:541:2: ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) )
            // flipsAssembly.g:
            {
            if ( (input.LA(1)>=LEFT && input.LA(1)<=COUNTERCLOCKWISE)||(input.LA(1)>=CLIMB && input.LA(1)<=DESCEND) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "convertDirection"


    // $ANTLR start "numericValue"
    // flipsAssembly.g:546:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // flipsAssembly.g:547:2: (x= integerValue | y= FloatingPointLiteral )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=BinaryLiteral && LA41_0<=HexLiteral)) ) {
                alt41=1;
            }
            else if ( (LA41_0==FloatingPointLiteral) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // flipsAssembly.g:547:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue2274);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:549:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue2285); 
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
    // flipsAssembly.g:553:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:554:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt42=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt42=1;
                }
                break;
            case OctalLiteral:
                {
                alt42=2;
                }
                break;
            case DecimalLiteral:
                {
                alt42=3;
                }
                break;
            case HexLiteral:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // flipsAssembly.g:554:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue2306); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:556:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue2317); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:558:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue2328); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:560:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue2339); 
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


    // $ANTLR start "percentValue"
    // flipsAssembly.g:564:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final double percentValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:565:2: (x= numericValue PERCENT )
            // flipsAssembly.g:565:4: x= numericValue PERCENT
            {
            pushFollow(FOLLOW_numericValue_in_percentValue2360);
            x=numericValue();

            state._fsp--;

            match(input,PERCENT,FOLLOW_PERCENT_in_percentValue2362); 
            r = x;

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
    // $ANTLR end "percentValue"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\5\1\2\1\121\1\6\1\2\1\124\4\3\2\uffff";
    static final String DFA4_maxS =
        "\1\5\1\2\1\121\1\6\1\2\1\127\4\7\2\uffff";
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
            return "127:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
    }
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\22\1\2\1\16\1\53\1\105\3\uffff\2\53\4\uffff";
    static final String DFA12_maxS =
        "\1\22\1\2\1\17\1\73\1\106\3\uffff\2\73\4\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\16\uffff\1\7\1\6",
            "\1\10\1\11",
            "",
            "",
            "",
            "\1\12\17\uffff\1\13",
            "\1\14\17\uffff\1\15",
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
            return "221:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );";
        }
    }
    static final String DFA14_eotS =
        "\32\uffff";
    static final String DFA14_eofS =
        "\32\uffff";
    static final String DFA14_minS =
        "\1\23\1\2\1\16\1\uffff\1\24\1\77\1\uffff\2\123\3\uffff\12\54\4\uffff";
    static final String DFA14_maxS =
        "\1\23\1\2\1\27\1\uffff\1\25\1\101\1\uffff\2\127\3\uffff\12\71\4"+
        "\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\2\uffff\1\11\2\uffff\1\6\1\7\1\10\12\uffff\1\2\1\4"+
        "\1\3\1\5";
    static final String DFA14_specialS =
        "\32\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\6\uffff\1\5\1\6",
            "",
            "\1\7\1\10",
            "\1\11\1\13\1\12",
            "",
            "\1\20\1\14\1\15\1\16\1\17",
            "\1\25\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "\11\26\4\uffff\1\27",
            "\11\26\4\uffff\1\27",
            "\11\26\4\uffff\1\27",
            "\11\26\4\uffff\1\27",
            "\11\26\4\uffff\1\27",
            "\11\30\4\uffff\1\31",
            "\11\30\4\uffff\1\31",
            "\11\30\4\uffff\1\31",
            "\11\30\4\uffff\1\31",
            "\11\30\4\uffff\1\31",
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
            return "256:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) );";
        }
    }
    static final String DFA21_eotS =
        "\52\uffff";
    static final String DFA21_eofS =
        "\52\uffff";
    static final String DFA21_minS =
        "\1\30\1\2\1\123\5\42\7\31\5\42\3\uffff\7\31\5\42\7\31";
    static final String DFA21_maxS =
        "\1\30\1\2\1\127\5\50\7\127\5\50\3\uffff\7\127\5\50\7\33";
    static final String DFA21_acceptS =
        "\24\uffff\1\1\1\2\1\3\23\uffff";
    static final String DFA21_specialS =
        "\52\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\16\1\14\1\12\1\10\1\11\1\15\1\13",
            "\1\16\1\14\1\12\1\10\1\11\1\15\1\13",
            "\1\16\1\14\1\12\1\10\1\11\1\15\1\13",
            "\1\16\1\14\1\12\1\10\1\11\1\15\1\13",
            "\1\16\1\14\1\12\1\10\1\11\1\15\1\13",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\24\1\25\1\26\67\uffff\1\23\1\17\1\20\1\21\1\22",
            "\1\34\1\33\1\30\1\31\1\35\1\32\1\27",
            "\1\34\1\33\1\30\1\31\1\35\1\32\1\27",
            "\1\34\1\33\1\30\1\31\1\35\1\32\1\27",
            "\1\34\1\33\1\30\1\31\1\35\1\32\1\27",
            "\1\34\1\33\1\30\1\31\1\35\1\32\1\27",
            "",
            "",
            "",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\24\1\25\1\26\67\uffff\1\42\1\36\1\37\1\40\1\41",
            "\1\50\1\46\1\43\1\45\1\51\1\47\1\44",
            "\1\50\1\46\1\43\1\45\1\51\1\47\1\44",
            "\1\50\1\46\1\43\1\45\1\51\1\47\1\44",
            "\1\50\1\46\1\43\1\45\1\51\1\47\1\44",
            "\1\50\1\46\1\43\1\45\1\51\1\47\1\44",
            "\1\24\1\25\1\26",
            "\1\24\1\25\1\26",
            "\1\24\1\25\1\26",
            "\1\24\1\25\1\26",
            "\1\24\1\25\1\26",
            "\1\24\1\25\1\26",
            "\1\24\1\25\1\26"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "277:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );";
        }
    }
    static final String DFA24_eotS =
        "\17\uffff";
    static final String DFA24_eofS =
        "\17\uffff";
    static final String DFA24_minS =
        "\1\14\1\2\1\16\1\107\1\65\4\3\6\uffff";
    static final String DFA24_maxS =
        "\1\14\1\2\1\17\1\127\1\66\1\112\1\110\1\112\1\110\6\uffff";
    static final String DFA24_acceptS =
        "\11\uffff\1\4\1\5\1\6\1\2\1\3\1\1";
    static final String DFA24_specialS =
        "\17\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\1\7\1\6\1\10\10\uffff\5\11",
            "\1\12\1\13",
            "\1\16\103\uffff\1\15\1\uffff\2\14",
            "\1\16\103\uffff\2\15",
            "\1\16\104\uffff\1\15\2\14",
            "\1\16\103\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "295:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );";
        }
    }
    static final String DFA29_eotS =
        "\32\uffff";
    static final String DFA29_eofS =
        "\32\uffff";
    static final String DFA29_minS =
        "\1\40\1\2\1\123\5\51\3\107\5\47\2\uffff\2\107\5\50\1\107";
    static final String DFA29_maxS =
        "\1\40\1\2\1\127\5\52\1\127\2\110\5\47\2\uffff\1\127\1\110\5\50\1"+
        "\110";
    static final String DFA29_acceptS =
        "\20\uffff\1\2\1\1\10\uffff";
    static final String DFA29_specialS =
        "\32\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\21\1\20\12\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\21\1\20",
            "\1\21\1\20",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "",
            "",
            "\1\21\1\20\12\uffff\1\30\1\24\1\25\1\26\1\27",
            "\1\21\1\20",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\21\1\20"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "369:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
    }
    static final String DFA30_eotS =
        "\32\uffff";
    static final String DFA30_eofS =
        "\32\uffff";
    static final String DFA30_minS =
        "\1\41\1\2\1\123\5\51\3\111\2\uffff\5\47\2\111\5\50\1\111";
    static final String DFA30_maxS =
        "\1\41\1\2\1\127\5\52\1\127\2\112\2\uffff\5\47\1\127\1\112\5\50\1"+
        "\112";
    static final String DFA30_acceptS =
        "\13\uffff\1\1\1\2\15\uffff";
    static final String DFA30_specialS =
        "\32\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\13\1\14\10\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\13\1\14",
            "\1\13\1\14",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\13\1\14\10\uffff\1\30\1\24\1\25\1\26\1\27",
            "\1\13\1\14",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\13\1\14"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "376:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
    }
    static final String DFA31_eotS =
        "\24\uffff";
    static final String DFA31_eofS =
        "\24\uffff";
    static final String DFA31_minS =
        "\1\53\1\2\1\123\5\54\1\107\1\60\7\107\2\uffff\1\107";
    static final String DFA31_maxS =
        "\1\53\1\2\1\127\5\64\1\110\1\60\7\110\2\uffff\1\110";
    static final String DFA31_acceptS =
        "\21\uffff\1\1\1\2\1\uffff";
    static final String DFA31_specialS =
        "\24\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\15\1\20\1\16\1\11\1\14\1\10\1\13\1\17\1\12",
            "\1\15\1\20\1\16\1\11\1\14\1\10\1\13\1\17\1\12",
            "\1\15\1\20\1\16\1\11\1\14\1\10\1\13\1\17\1\12",
            "\1\15\1\20\1\16\1\11\1\14\1\10\1\13\1\17\1\12",
            "\1\15\1\20\1\16\1\11\1\14\1\10\1\13\1\17\1\12",
            "\1\21\1\22",
            "\1\23",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "",
            "",
            "\1\21\1\22"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "389:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );";
        }
    }
    static final String DFA32_eotS =
        "\24\uffff";
    static final String DFA32_eofS =
        "\24\uffff";
    static final String DFA32_minS =
        "\1\53\1\2\1\123\5\54\7\111\1\60\1\111\2\uffff\1\111";
    static final String DFA32_maxS =
        "\1\53\1\2\1\127\5\64\7\112\1\60\1\112\2\uffff\1\112";
    static final String DFA32_acceptS =
        "\21\uffff\1\1\1\2\1\uffff";
    static final String DFA32_specialS =
        "\24\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\15\1\10\1\13\1\17\1\14\1\20\1\11\1\16\1\12",
            "\1\15\1\10\1\13\1\17\1\14\1\20\1\11\1\16\1\12",
            "\1\15\1\10\1\13\1\17\1\14\1\20\1\11\1\16\1\12",
            "\1\15\1\10\1\13\1\17\1\14\1\20\1\11\1\16\1\12",
            "\1\15\1\10\1\13\1\17\1\14\1\20\1\11\1\16\1\12",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\23",
            "\1\21\1\22",
            "",
            "",
            "\1\21\1\22"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "396:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );";
        }
    }
    static final String DFA33_eotS =
        "\15\uffff";
    static final String DFA33_eofS =
        "\15\uffff";
    static final String DFA33_minS =
        "\1\123\5\42\7\uffff";
    static final String DFA33_maxS =
        "\1\127\5\50\7\uffff";
    static final String DFA33_acceptS =
        "\6\uffff\1\1\1\3\1\5\1\7\1\2\1\4\1\6";
    static final String DFA33_specialS =
        "\15\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\12\1\7\1\13\1\10\1\14\1\11",
            "\1\6\1\12\1\7\1\13\1\10\1\14\1\11",
            "\1\6\1\12\1\7\1\13\1\10\1\14\1\11",
            "\1\6\1\12\1\7\1\13\1\10\1\14\1\11",
            "\1\6\1\12\1\7\1\13\1\10\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "406:1: convertTime returns [double r] : (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND );";
        }
    }
    static final String DFA34_eotS =
        "\17\uffff";
    static final String DFA34_eofS =
        "\17\uffff";
    static final String DFA34_minS =
        "\1\123\5\54\11\uffff";
    static final String DFA34_maxS =
        "\1\127\5\64\11\uffff";
    static final String DFA34_acceptS =
        "\6\uffff\1\10\1\6\1\4\1\2\1\5\1\1\1\11\1\7\1\3";
    static final String DFA34_specialS =
        "\17\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\13\1\11\1\16\1\10\1\12\1\7\1\15\1\6\1\14",
            "\1\13\1\11\1\16\1\10\1\12\1\7\1\15\1\6\1\14",
            "\1\13\1\11\1\16\1\10\1\12\1\7\1\15\1\6\1\14",
            "\1\13\1\11\1\16\1\10\1\12\1\7\1\15\1\6\1\14",
            "\1\13\1\11\1\16\1\10\1\12\1\7\1\15\1\6\1\14",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "424:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue CENTIMETER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue FURLONG | x= numericValue YARD | x= numericValue FOOT | x= numericValue INCH );";
        }
    }
    static final String DFA35_eotS =
        "\14\uffff";
    static final String DFA35_eofS =
        "\14\uffff";
    static final String DFA35_minS =
        "\1\123\5\74\6\uffff";
    static final String DFA35_maxS =
        "\1\127\5\104\6\uffff";
    static final String DFA35_acceptS =
        "\6\uffff\1\5\1\1\1\3\1\4\1\6\1\2";
    static final String DFA35_specialS =
        "\14\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\7\1\13\1\10\3\uffff\1\11\1\6\1\12",
            "\1\7\1\13\1\10\3\uffff\1\11\1\6\1\12",
            "\1\7\1\13\1\10\3\uffff\1\11\1\6\1\12",
            "\1\7\1\13\1\10\3\uffff\1\11\1\6\1\12",
            "\1\7\1\13\1\10\3\uffff\1\11\1\6\1\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "453:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );";
        }
    }
    static final String DFA36_eotS =
        "\23\uffff";
    static final String DFA36_eofS =
        "\23\uffff";
    static final String DFA36_minS =
        "\1\123\5\54\6\46\1\60\2\46\3\uffff\1\46";
    static final String DFA36_maxS =
        "\1\127\5\64\6\50\1\60\2\50\3\uffff\1\50";
    static final String DFA36_acceptS =
        "\17\uffff\1\2\1\3\1\1\1\uffff";
    static final String DFA36_specialS =
        "\23\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\10\1\16\1\15\1\14\1\13\1\12\1\11\1\7\1\6",
            "\1\10\1\16\1\15\1\14\1\13\1\12\1\11\1\7\1\6",
            "\1\10\1\16\1\15\1\14\1\13\1\12\1\11\1\7\1\6",
            "\1\10\1\16\1\15\1\14\1\13\1\12\1\11\1\7\1\6",
            "\1\10\1\16\1\15\1\14\1\13\1\12\1\11\1\7\1\6",
            "\1\21\1\17\1\20",
            "\1\21\1\17\1\20",
            "\1\21\1\17\1\20",
            "\1\21\1\17\1\20",
            "\1\21\1\17\1\20",
            "\1\21\1\17\1\20",
            "\1\22",
            "\1\21\1\17\1\20",
            "\1\21\1\17\1\20",
            "",
            "",
            "",
            "\1\21\1\17\1\20"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "469:1: convertSpeed returns [double r] : (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND );";
        }
    }
    static final String DFA37_eotS =
        "\20\uffff";
    static final String DFA37_eofS =
        "\20\uffff";
    static final String DFA37_minS =
        "\1\123\5\51\1\3\2\uffff\4\47\1\uffff\1\3\1\uffff";
    static final String DFA37_maxS =
        "\1\127\5\52\1\127\2\uffff\4\47\1\uffff\1\127\1\uffff";
    static final String DFA37_acceptS =
        "\7\uffff\1\4\1\1\4\uffff\1\2\1\uffff\1\3";
    static final String DFA37_specialS =
        "\20\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\10\1\7",
            "\1\10\103\uffff\4\10\10\uffff\1\15\1\11\1\12\1\13\1\14",
            "",
            "",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "",
            "\1\15\103\uffff\4\15\10\uffff\5\17",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "485:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN );";
        }
    }
    static final String DFA40_eotS =
        "\17\uffff";
    static final String DFA40_eofS =
        "\17\uffff";
    static final String DFA40_minS =
        "\3\107\1\110\1\107\1\111\2\uffff\1\111\6\uffff";
    static final String DFA40_maxS =
        "\1\112\1\107\3\110\1\112\2\uffff\1\112\6\uffff";
    static final String DFA40_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\6\1\7\1\1\1\10\1\4\1\5";
    static final String DFA40_specialS =
        "\17\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\1\3\1\2\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\12\1\11",
            "\1\13\1\14",
            "",
            "",
            "\1\15\1\16",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "521:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );";
        }
    }
 

    public static final BitSet FOLLOW_FLIGHTPLAN_in_flightPlan63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_define_in_flightPlan65 = new BitSet(new long[]{0x0000000000000E28L});
    public static final BitSet FOLLOW_command_in_flightPlan68 = new BitSet(new long[]{0x0000000000000E08L});
    public static final BitSet FOLLOW_defineCommand_in_define81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand130 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand137 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineSensor161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineSensor165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SENSOR_in_defineSensor168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineSensor172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint194 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_defineWaypoint201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint217 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_defineWaypoint224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand269 = new BitSet(new long[]{0x00000800D10F1008L});
    public static final BitSet FOLLOW_time_in_flyCommandValue286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOITER_in_loiterCommand338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand340 = new BitSet(new long[]{0x00000800F10F1008L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand403 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand405 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_pitch449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_roll470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude491 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude510 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude529 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLIMB_in_altitude548 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLIMB_in_altitude569 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DESCEND_in_altitude590 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DESCEND_in_altitude611 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertDistance_in_distance657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertDistance_in_distance674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RADIUS_in_radius691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_radius695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_speed716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FASTER_in_speed735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed752 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SLOWER_in_speed754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed771 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FASTER_in_speed773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_percentValue_in_speed777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed786 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SLOWER_in_speed788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_percentValue_in_speed792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed801 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_MINIMUM_in_speed803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_CRUISE_in_speed818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_MAXIMUM_in_speed833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THROTTLE_in_speed846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertThrottle_in_speed850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time873 = new BitSet(new long[]{0x0000000002000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_time878 = new BitSet(new long[]{0x0000000002000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_time883 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AM_in_time889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time908 = new BitSet(new long[]{0x0000000004000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_time913 = new BitSet(new long[]{0x0000000004000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_time918 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PM_in_time924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time943 = new BitSet(new long[]{0x0000000008000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_time948 = new BitSet(new long[]{0x0000000008000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_time953 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_HOUR24_in_time959 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DURATION_in_duration976 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_duration980 = new BitSet(new long[]{0x0000000000000008L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_duration985 = new BitSet(new long[]{0x0000000000000008L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertTime_in_duration990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_convertCardinalDirection_in_direction1019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_convertOrdinalDirection_in_direction1036 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_convertSubOrdinalDirection_in_direction1053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1083 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_in_direction1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1102 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_direction1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1127 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_in_turnDirection1129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1142 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_turnDirection1144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1163 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_CLOCKWISE_in_loiterDirection1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1178 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate1228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate1255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_latitude_in_latitudeLongitude1289 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_longitude_in_latitudeLongitude1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_latitude1323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_latitude1340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_longitude1367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_longitude1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_distanceNorth_in_distanceCoordinate1406 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_distanceEast_in_distanceCoordinate1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth1434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_distanceNorth1440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth1451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_distanceNorth1457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast1478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_distanceEast1484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast1495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast1499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_distanceEast1501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1526 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_YEAR_in_convertTime1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1539 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FORTNIGHT_in_convertTime1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1552 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WEEK_in_convertTime1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1565 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_DAY_in_convertTime1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1578 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_HOUR_in_convertTime1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1591 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1604 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertTime1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1628 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistance1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1641 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_METER_in_convertDistance1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1654 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_CENTIMETER_in_convertDistance1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1667 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistance1669 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1682 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1695 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FURLONG_in_convertDistance1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1708 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_YARD_in_convertDistance1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1721 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_FOOT_in_convertDistance1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1734 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_INCH_in_convertDistance1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1786 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressure1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1799 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressure1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1812 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressure1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BAR_in_convertPressure1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressure1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressure1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1875 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_HOUR_in_convertSpeed1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1888 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertSpeed1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1901 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertSpeed1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_convertThrottle1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1947 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1960 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1966 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1979 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1991 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertAngle1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2004 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertCardinalDirection2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertCardinalDirection2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertCardinalDirection2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertCardinalDirection2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_convertDirection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue2360 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue2362 = new BitSet(new long[]{0x0000000000000002L});

}