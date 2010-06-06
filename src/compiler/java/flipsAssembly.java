// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsAssembly.g 2010-06-06 00:35:05

  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "STRAIGHT", "LEVEL", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "THROTTLE", "REVOLUTION", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "StringLiteral", "With", "FlightLevel", "Per", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'repeat'", "'wait'", "'time'", "'times'", "'continuously'", "'forever'", "'until'", "'while'", "'the'", "'tim'", "'is'", "'dir'", "'direction'", "'spd'", "'speed'", "'dst'", "'distance'", "'pit'", "'pitch'", "'rol'", "'roll'", "'alt'", "'altitude'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'lvl'", "'level'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'fps'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'ms'", "'millisecond'", "'milliseconds'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'min'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'str'", "'straight'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'rpm'", "'hz'", "'hertz'", "'rev'", "'revs'", "'revolution'", "'revolutions'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
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
    public static final int GEOCOORDINATE=33;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=72;
    public static final int T__264=264;
    public static final int FOOT=54;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__300=300;
    public static final int T__163=163;
    public static final int HECTOPASCAL=64;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=46;
    public static final int FASTER=22;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=82;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int KILOMETER=47;
    public static final int T__256=256;
    public static final int EQ=75;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__318=318;
    public static final int T__138=138;
    public static final int T__319=319;
    public static final int SENSOR=8;
    public static final int T__137=137;
    public static final int T__316=316;
    public static final int GE=80;
    public static final int T__136=136;
    public static final int T__317=317;
    public static final int T__314=314;
    public static final int T__315=315;
    public static final int T__312=312;
    public static final int T__313=313;
    public static final int FORTNIGHT=37;
    public static final int T__279=279;
    public static final int T__288=288;
    public static final int T__289=289;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int T__282=282;
    public static final int YARD=53;
    public static final int T__283=283;
    public static final int T__280=280;
    public static final int T__141=141;
    public static final int T__322=322;
    public static final int T__281=281;
    public static final int T__142=142;
    public static final int T__321=321;
    public static final int T__320=320;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=85;
    public static final int DURATION=30;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__305=305;
    public static final int T__126=126;
    public static final int T__306=306;
    public static final int T__125=125;
    public static final int T__307=307;
    public static final int T__128=128;
    public static final int T__308=308;
    public static final int T__127=127;
    public static final int WS=100;
    public static final int T__301=301;
    public static final int T__302=302;
    public static final int T__129=129;
    public static final int STRAIGHT=18;
    public static final int T__303=303;
    public static final int T__304=304;
    public static final int LEVEL=19;
    public static final int BinaryLiteral=91;
    public static final int BinaryDigit=97;
    public static final int THROTTLE=24;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=90;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=78;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int T__271=271;
    public static final int METER=48;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__311=311;
    public static final int T__130=130;
    public static final int T__310=310;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=31;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int MILLISECOND=43;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int EXECUTE=11;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int HexDigit=98;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=32;
    public static final int TIME=26;
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
    public static final int LEFT=56;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int FLIGHTLEVEL=61;
    public static final int CENTIMETER=49;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int AM=27;
    public static final int T__211=211;
    public static final int HexLiteral=94;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int T__235=235;
    public static final int At=83;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=57;
    public static final int RELATIVE=15;
    public static final int EAST=73;
    public static final int T__245=245;
    public static final int HOUR=40;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int T__242=242;
    public static final int ALTITUDE=20;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int T__228=228;
    public static final int StringLiteral=84;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int NAUTICAL=50;
    public static final int NonZeroDigit=96;
    public static final int NORTH=71;
    public static final int REVOLUTION=25;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=70;
    public static final int T__230=230;
    public static final int WEEK=38;
    public static final int LT=77;
    public static final int OctalLiteral=92;
    public static final int LATITUDE=34;
    public static final int ATMOSPHERE=68;
    public static final int Per=87;
    public static final int DAY=39;
    public static final int Identifier=81;
    public static final int COMMAND=6;
    public static final int Comment=101;
    public static final int MILLIBAR=67;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=59;
    public static final int FlightLevel=86;
    public static final int INCH=55;
    public static final int NE=76;
    public static final int SECOND=42;
    public static final int CLIMB=69;
    public static final int ROLL=16;
    public static final int HOUR24=29;
    public static final int RADIAN=45;
    public static final int TURN=13;
    public static final int DEGREE=44;
    public static final int PASCAL=65;
    public static final int T__200=200;
    public static final int FLY=9;
    public static final int SLOWER=23;
    public static final int T__201=201;
    public static final int PM=28;
    public static final int FURLONG=52;
    public static final int LONGITUDE=35;
    public static final int PRESSURE=62;
    public static final int YEAR=36;
    public static final int MILE=51;
    public static final int Exponent=99;
    public static final int LineComment=102;
    public static final int DEFINE=5;
    public static final int T__327=327;
    public static final int T__326=326;
    public static final int T__325=325;
    public static final int T__324=324;
    public static final int T__323=323;
    public static final int WEST=74;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__292=292;
    public static final int T__196=196;
    public static final int T__291=291;
    public static final int T__195=195;
    public static final int T__290=290;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__296=296;
    public static final int T__192=192;
    public static final int T__295=295;
    public static final int T__191=191;
    public static final int T__294=294;
    public static final int T__190=190;
    public static final int T__293=293;
    public static final int SPEED=21;
    public static final int T__299=299;
    public static final int T__298=298;
    public static final int T__297=297;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=60;
    public static final int T__189=189;
    public static final int Heading=89;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=95;
    public static final int DecimalLiteral=93;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int Turning=88;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=63;
    public static final int T__176=176;
    public static final int CLOCKWISE=58;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MINUTE=41;
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

                    if ( (LA7_0==DIRECTION||(LA7_0>=ROLL && LA7_0<=PITCH)||(LA7_0>=ALTITUDE && LA7_0<=SPEED)||LA7_0==TIME||LA7_0==DURATION||(LA7_0>=WAYPOINT && LA7_0<=GEOCOORDINATE)||LA7_0==DISTANCE) ) {
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
    // flipsAssembly.g:202:1: executeCommandParameter : ( ^( PARAMETER x= numericValue ) | ^( PARAMETER y= StringLiteral ) );
    public final void executeCommandParameter() throws RecognitionException {
        CommonTree y=null;
        double x = 0.0;


        try {
            // flipsAssembly.g:203:2: ( ^( PARAMETER x= numericValue ) | ^( PARAMETER y= StringLiteral ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PARAMETER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DOWN) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==StringLiteral) ) {
                        alt12=2;
                    }
                    else if ( ((LA12_2>=FloatingPointLiteral && LA12_2<=HexLiteral)) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // flipsAssembly.g:203:4: ^( PARAMETER x= numericValue )
                    {
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter422); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_numericValue_in_executeCommandParameter426);
                    x=numericValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("CMD PAR " + x, "Command Parameter");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:205:4: ^( PARAMETER y= StringLiteral )
                    {
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter437); 

                    match(input, Token.DOWN, null); 
                    y=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_executeCommandParameter441); 

                    match(input, Token.UP, null); 
                    emit("CMD PAR " + y, "Command Parameter");

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
    // $ANTLR end "executeCommandParameter"


    // $ANTLR start "pitch"
    // flipsAssembly.g:211:1: pitch : ^( PITCH x= convertAngle ) ;
    public final void pitch() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:212:2: ( ^( PITCH x= convertAngle ) )
            // flipsAssembly.g:212:4: ^( PITCH x= convertAngle )
            {
            match(input,PITCH,FOLLOW_PITCH_in_pitch460); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertAngle_in_pitch464);
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
    // flipsAssembly.g:216:1: roll : ^( ROLL x= convertAngle ) ;
    public final void roll() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:217:2: ( ^( ROLL x= convertAngle ) )
            // flipsAssembly.g:217:4: ^( ROLL x= convertAngle )
            {
            match(input,ROLL,FOLLOW_ROLL_in_roll481); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertAngle_in_roll485);
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
    // flipsAssembly.g:223:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:224:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // flipsAssembly.g:224:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude504); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude506); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude508); 
                    pushFollow(FOLLOW_convertDistance_in_altitude512);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:226:4: ^( ALTITUDE FIXED PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude523); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude525); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude527); 
                    pushFollow(FOLLOW_convertPressure_in_altitude531);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:228:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude542); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude544); 
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude548);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:230:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude559); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude561); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude563); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude565); 
                    pushFollow(FOLLOW_convertDistance_in_altitude569);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:232:4: ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude580); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude582); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude584); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude586); 
                    pushFollow(FOLLOW_convertPressure_in_altitude590);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:234:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude601); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude603); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude605); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude607); 
                    pushFollow(FOLLOW_convertDistance_in_altitude611);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:236:4: ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude622); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude624); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude626); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude628); 
                    pushFollow(FOLLOW_convertPressure_in_altitude632);
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
    // flipsAssembly.g:242:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:243:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DISTANCE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt14=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt14=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt14=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // flipsAssembly.g:243:4: ^( DISTANCE x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance651); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distance655);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:245:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance666); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_distance668); 
                    pushFollow(FOLLOW_convertDistance_in_distance672);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:247:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance683); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance685); 
                    pushFollow(FOLLOW_convertDistance_in_distance689);
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
    // flipsAssembly.g:251:1: radius : ^( RADIUS x= convertDistance ) ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:252:2: ( ^( RADIUS x= convertDistance ) )
            // flipsAssembly.g:252:4: ^( RADIUS x= convertDistance )
            {
            match(input,RADIUS,FOLLOW_RADIUS_in_radius706); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertDistance_in_radius710);
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
    // flipsAssembly.g:258:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED THROTTLE y= convertThrottle ) );
    public final void speed() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:259:2: ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED THROTTLE y= convertThrottle ) )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // flipsAssembly.g:259:4: ^( SPEED FIXED x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed729); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_speed731); 
                    pushFollow(FOLLOW_convertSpeed_in_speed735);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:261:4: ^( SPEED RELATIVE FASTER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed746); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed748); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed750); 
                    pushFollow(FOLLOW_convertSpeed_in_speed754);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:263:4: ^( SPEED RELATIVE SLOWER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed765); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed767); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed769); 
                    pushFollow(FOLLOW_convertSpeed_in_speed773);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + -x, -x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:265:4: ^( SPEED RELATIVE FASTER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed784); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed786); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed788); 
                    pushFollow(FOLLOW_percentValue_in_speed792);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:266:4: ^( SPEED RELATIVE SLOWER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed799); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed801); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed803); 
                    pushFollow(FOLLOW_percentValue_in_speed807);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:267:4: ^( SPEED THROTTLE y= convertThrottle )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed814); 

                    match(input, Token.DOWN, null); 
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_speed816); 
                    pushFollow(FOLLOW_convertThrottle_in_speed820);
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
    // flipsAssembly.g:273:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );
    public final void time() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:274:2: ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // flipsAssembly.g:274:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time839); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time843);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:274:25: (y= convertTime (z= convertTime )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=FloatingPointLiteral && LA17_0<=HexLiteral)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // flipsAssembly.g:274:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time848);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:274:40: (z= convertTime )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( ((LA16_0>=FloatingPointLiteral && LA16_0<=HexLiteral)) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // flipsAssembly.g:274:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time853);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,AM,FOLLOW_AM_in_time859); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:277:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time874); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time878);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:277:25: (y= convertTime (z= convertTime )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=FloatingPointLiteral && LA19_0<=HexLiteral)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // flipsAssembly.g:277:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time883);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:277:40: (z= convertTime )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( ((LA18_0>=FloatingPointLiteral && LA18_0<=HexLiteral)) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // flipsAssembly.g:277:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time888);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,PM,FOLLOW_PM_in_time894); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:280:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time909); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time913);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:280:25: (y= convertTime (z= convertTime )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=FloatingPointLiteral && LA21_0<=HexLiteral)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // flipsAssembly.g:280:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time918);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:280:40: (z= convertTime )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=FloatingPointLiteral && LA20_0<=HexLiteral)) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // flipsAssembly.g:280:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time923);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,HOUR24,FOLLOW_HOUR24_in_time929); 

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
    // flipsAssembly.g:284:1: duration : ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) ;
    public final void duration() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:285:2: ( ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) )
            // flipsAssembly.g:285:4: ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? )
            {
            match(input,DURATION,FOLLOW_DURATION_in_duration946); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertTime_in_duration950);
            x=convertTime();

            state._fsp--;

            // flipsAssembly.g:285:29: (y= convertTime (z= convertTime )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=FloatingPointLiteral && LA24_0<=HexLiteral)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // flipsAssembly.g:285:30: y= convertTime (z= convertTime )?
                    {
                    pushFollow(FOLLOW_convertTime_in_duration955);
                    y=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:285:44: (z= convertTime )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=FloatingPointLiteral && LA23_0<=HexLiteral)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // flipsAssembly.g:285:45: z= convertTime
                            {
                            pushFollow(FOLLOW_convertTime_in_duration960);
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
    // flipsAssembly.g:291:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );
    public final void direction() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:292:2: ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) )
            int alt25=6;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // flipsAssembly.g:292:4: ^( DIRECTION FIXED x= convertCardinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction983); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction985); 
                    pushFollow(FOLLOW_convertCardinalDirection_in_direction989);
                    x=convertCardinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:294:4: ^( DIRECTION FIXED x= convertOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1000); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1002); 
                    pushFollow(FOLLOW_convertOrdinalDirection_in_direction1006);
                    x=convertOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:296:4: ^( DIRECTION FIXED x= convertSubOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1017); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1019); 
                    pushFollow(FOLLOW_convertSubOrdinalDirection_in_direction1023);
                    x=convertSubOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:298:4: ^( DIRECTION FIXED y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1034); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1036); 
                    pushFollow(FOLLOW_convertAngle_in_direction1040);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:300:4: ^( DIRECTION RELATIVE LEFT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1051); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1053); 
                    match(input,LEFT,FOLLOW_LEFT_in_direction1055); 
                    pushFollow(FOLLOW_convertAngle_in_direction1059);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + -y, -y + " deg Yaw");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:302:4: ^( DIRECTION RELATIVE RIGHT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1070); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1072); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_direction1074); 
                    pushFollow(FOLLOW_convertAngle_in_direction1078);
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
    // flipsAssembly.g:306:1: turnDirection : ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) );
    public final void turnDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:307:2: ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DIRECTION) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==DOWN) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==TURN) ) {
                        int LA26_3 = input.LA(4);

                        if ( (LA26_3==LEFT) ) {
                            alt26=1;
                        }
                        else if ( (LA26_3==RIGHT) ) {
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
                    // flipsAssembly.g:307:4: ^( DIRECTION TURN LEFT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1095); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1097); 
                    match(input,LEFT,FOLLOW_LEFT_in_turnDirection1099); 

                    match(input, Token.UP, null); 
                    emit("DIR L", "Left Turn Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:309:4: ^( DIRECTION TURN RIGHT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1110); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1112); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_turnDirection1114); 

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
    // flipsAssembly.g:313:1: loiterDirection : ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) );
    public final void loiterDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:314:2: ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DIRECTION) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==DOWN) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==TURN) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==CLOCKWISE) ) {
                            alt27=1;
                        }
                        else if ( (LA27_3==COUNTERCLOCKWISE) ) {
                            alt27=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // flipsAssembly.g:314:4: ^( DIRECTION TURN CLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1131); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1133); 
                    match(input,CLOCKWISE,FOLLOW_CLOCKWISE_in_loiterDirection1135); 

                    match(input, Token.UP, null); 
                    emit("DIR CW", "Clockwise Loiter Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:316:4: ^( DIRECTION TURN COUNTERCLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1146); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1148); 
                    match(input,COUNTERCLOCKWISE,FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1150); 

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
    // flipsAssembly.g:322:1: waypoint : ( geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:323:2: ( geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==GEOCOORDINATE) ) {
                alt28=1;
            }
            else if ( (LA28_0==WAYPOINT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // flipsAssembly.g:323:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1168);
                    geoCoordinate();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:324:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint1174); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint1178); 

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
    // flipsAssembly.g:346:1: geoCoordinate : ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) );
    public final void geoCoordinate() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:347:2: ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==GEOCOORDINATE) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==DOWN) ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==DISTANCE) ) {
                        alt29=2;
                    }
                    else if ( (LA29_2==LATITUDE) ) {
                        alt29=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // flipsAssembly.g:347:4: ^( GEOCOORDINATE geo= latitudeLongitude )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1194); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate1198);
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
                    // flipsAssembly.g:352:4: ^( GEOCOORDINATE dst= distanceCoordinate )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1221); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate1225);
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
    // flipsAssembly.g:359:1: latitudeLongitude returns [double latitude, double longitude] : x= latitude y= longitude ;
    public final flipsAssembly.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return retval = new flipsAssembly.latitudeLongitude_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:360:2: (x= latitude y= longitude )
            // flipsAssembly.g:360:4: x= latitude y= longitude
            {
            pushFollow(FOLLOW_latitude_in_latitudeLongitude1259);
            x=latitude();

            state._fsp--;

            pushFollow(FOLLOW_longitude_in_latitudeLongitude1263);
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
    // flipsAssembly.g:365:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:366:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // flipsAssembly.g:366:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1287); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1291);
                    x=convertAngle();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_latitude1293); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:368:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1308);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude1310); 

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
    // flipsAssembly.g:372:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:373:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // flipsAssembly.g:373:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1331); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1335);
                    x=convertAngle();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_longitude1337); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:375:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1348); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1352);
                    x=convertAngle();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_longitude1354); 

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
    // flipsAssembly.g:379:1: distanceCoordinate returns [double north, double east] : x= distanceNorth y= distanceEast ;
    public final flipsAssembly.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsAssembly.distanceCoordinate_return retval = new flipsAssembly.distanceCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:380:2: (x= distanceNorth y= distanceEast )
            // flipsAssembly.g:380:4: x= distanceNorth y= distanceEast
            {
            pushFollow(FOLLOW_distanceNorth_in_distanceCoordinate1376);
            x=distanceNorth();

            state._fsp--;

            pushFollow(FOLLOW_distanceEast_in_distanceCoordinate1380);
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
    // flipsAssembly.g:385:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );
    public final double distanceNorth() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:386:2: ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // flipsAssembly.g:386:4: ^( DISTANCE x= convertDistance NORTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth1404); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth1408);
                    x=convertDistance();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_distanceNorth1410); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:388:4: ^( DISTANCE x= convertDistance SOUTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth1421); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth1425);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_distanceNorth1427); 

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
    // flipsAssembly.g:392:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );
    public final double distanceEast() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:393:2: ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // flipsAssembly.g:393:4: ^( DISTANCE x= convertDistance EAST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast1448); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast1452);
                    x=convertDistance();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_distanceEast1454); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:395:4: ^( DISTANCE x= convertDistance WEST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast1465); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast1469);
                    x=convertDistance();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_distanceEast1471); 

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
    // flipsAssembly.g:402:1: convertTime returns [double r] : (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND | x= numericValue MILLISECOND );
    public final double convertTime() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:403:2: (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND | x= numericValue MILLISECOND )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // flipsAssembly.g:403:4: x= numericValue YEAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1496);
                    x=numericValue();

                    state._fsp--;

                    match(input,YEAR,FOLLOW_YEAR_in_convertTime1498); 
                    r = x * 31557600d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:405:4: x= numericValue FORTNIGHT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1509);
                    x=numericValue();

                    state._fsp--;

                    match(input,FORTNIGHT,FOLLOW_FORTNIGHT_in_convertTime1511); 
                    r = x * 1209600d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:407:4: x= numericValue WEEK
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1522);
                    x=numericValue();

                    state._fsp--;

                    match(input,WEEK,FOLLOW_WEEK_in_convertTime1524); 
                    r = x * 604800d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:409:4: x= numericValue DAY
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1535);
                    x=numericValue();

                    state._fsp--;

                    match(input,DAY,FOLLOW_DAY_in_convertTime1537); 
                    r = x * 86400d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:411:4: x= numericValue HOUR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1548);
                    x=numericValue();

                    state._fsp--;

                    match(input,HOUR,FOLLOW_HOUR_in_convertTime1550); 
                    r = x * 3600d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:413:4: x= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1561);
                    x=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertTime1563); 
                    r = x * 60d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:415:4: x= numericValue SECOND
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1574);
                    x=numericValue();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertTime1576); 
                    r = x;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:417:4: x= numericValue MILLISECOND
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1587);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILLISECOND,FOLLOW_MILLISECOND_in_convertTime1589); 
                    r = x * 0.001d;

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
    // flipsAssembly.g:422:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue CENTIMETER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue FURLONG | x= numericValue YARD | x= numericValue FOOT | x= numericValue INCH );
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:423:2: (x= numericValue KILOMETER | x= numericValue METER | x= numericValue CENTIMETER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue FURLONG | x= numericValue YARD | x= numericValue FOOT | x= numericValue INCH )
            int alt35=9;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // flipsAssembly.g:423:4: x= numericValue KILOMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1611);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistance1613); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:425:4: x= numericValue METER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1624);
                    x=numericValue();

                    state._fsp--;

                    match(input,METER,FOLLOW_METER_in_convertDistance1626); 
                    r = x;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:427:4: x= numericValue CENTIMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1637);
                    x=numericValue();

                    state._fsp--;

                    match(input,CENTIMETER,FOLLOW_CENTIMETER_in_convertDistance1639); 
                    r = x * 0.01d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:429:4: x= numericValue NAUTICAL MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1650);
                    x=numericValue();

                    state._fsp--;

                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistance1652); 
                    match(input,MILE,FOLLOW_MILE_in_convertDistance1654); 
                    r = x * 1852d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:431:4: x= numericValue MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1665);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILE,FOLLOW_MILE_in_convertDistance1667); 
                    r = x * 1609.344d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:433:4: x= numericValue FURLONG
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1678);
                    x=numericValue();

                    state._fsp--;

                    match(input,FURLONG,FOLLOW_FURLONG_in_convertDistance1680); 
                    r = x * 201.168d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:435:4: x= numericValue YARD
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1691);
                    x=numericValue();

                    state._fsp--;

                    match(input,YARD,FOLLOW_YARD_in_convertDistance1693); 
                    r = x * 0.9144d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:437:4: x= numericValue FOOT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1704);
                    x=numericValue();

                    state._fsp--;

                    match(input,FOOT,FOLLOW_FOOT_in_convertDistance1706); 
                    r = x * 0.3048d;

                    }
                    break;
                case 9 :
                    // flipsAssembly.g:439:4: x= numericValue INCH
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1717);
                    x=numericValue();

                    state._fsp--;

                    match(input,INCH,FOLLOW_INCH_in_convertDistance1719); 
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
    // flipsAssembly.g:444:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:445:2: ( FLIGHTLEVEL x= FlightLevel )
            // flipsAssembly.g:445:4: FLIGHTLEVEL x= FlightLevel
            {
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1739); 
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel1743); 
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
    // flipsAssembly.g:451:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );
    public final double convertPressure() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:452:2: (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE )
            int alt36=6;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // flipsAssembly.g:452:4: x= numericValue KILOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1769);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressure1771); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:454:4: x= numericValue HECTOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1782);
                    x=numericValue();

                    state._fsp--;

                    match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressure1784); 
                    r = x * 100d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:456:4: x= numericValue PASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1795);
                    x=numericValue();

                    state._fsp--;

                    match(input,PASCAL,FOLLOW_PASCAL_in_convertPressure1797); 
                    r = x;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:458:4: x= numericValue BAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1808);
                    x=numericValue();

                    state._fsp--;

                    match(input,BAR,FOLLOW_BAR_in_convertPressure1810); 
                    r = x * 100000d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:460:4: x= numericValue MILLIBAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1821);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressure1823); 
                    r = x * 100d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:462:4: x= numericValue ATMOSPHERE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1834);
                    x=numericValue();

                    state._fsp--;

                    match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressure1836); 
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
    // flipsAssembly.g:467:1: convertSpeed returns [double r] : (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND | x= convertDistance MILLISECOND );
    public final double convertSpeed() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:468:2: (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND | x= convertDistance MILLISECOND )
            int alt37=8;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // flipsAssembly.g:468:4: x= numericValue YEAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertSpeed1858);
                    x=numericValue();

                    state._fsp--;

                    match(input,YEAR,FOLLOW_YEAR_in_convertSpeed1860); 
                    r = x / 31557600d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:470:4: x= numericValue FORTNIGHT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertSpeed1871);
                    x=numericValue();

                    state._fsp--;

                    match(input,FORTNIGHT,FOLLOW_FORTNIGHT_in_convertSpeed1873); 
                    r = x / 1209600d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:472:4: x= numericValue WEEK
                    {
                    pushFollow(FOLLOW_numericValue_in_convertSpeed1884);
                    x=numericValue();

                    state._fsp--;

                    match(input,WEEK,FOLLOW_WEEK_in_convertSpeed1886); 
                    r = x / 604800d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:474:4: x= numericValue DAY
                    {
                    pushFollow(FOLLOW_numericValue_in_convertSpeed1897);
                    x=numericValue();

                    state._fsp--;

                    match(input,DAY,FOLLOW_DAY_in_convertSpeed1899); 
                    r = x / 86400d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:476:4: x= convertDistance HOUR
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1910);
                    x=convertDistance();

                    state._fsp--;

                    match(input,HOUR,FOLLOW_HOUR_in_convertSpeed1912); 
                    r = x / 3600d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:478:4: x= convertDistance MINUTE
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1923);
                    x=convertDistance();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertSpeed1925); 
                    r = x / 60d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:480:4: x= convertDistance SECOND
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1936);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertSpeed1938); 
                    r = x;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:482:4: x= convertDistance MILLISECOND
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1949);
                    x=convertDistance();

                    state._fsp--;

                    match(input,MILLISECOND,FOLLOW_MILLISECOND_in_convertSpeed1951); 
                    r = x / 0.001d;

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
    // flipsAssembly.g:487:1: convertThrottle returns [double r] : x= percentValue ;
    public final double convertThrottle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:488:2: (x= percentValue )
            // flipsAssembly.g:488:4: x= percentValue
            {
            pushFollow(FOLLOW_percentValue_in_convertThrottle1973);
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
    // flipsAssembly.g:493:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double minNum = 0.0;

        int minInt = 0;

        double sec = 0.0;


        try {
            // flipsAssembly.g:494:2: (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN )
            int alt38=4;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // flipsAssembly.g:494:4: x= numericValue DEGREE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle1995);
                    x=numericValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1997); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:496:4: deg= integerValue DEGREE minNum= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle2008);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle2010); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle2014);
                    minNum=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle2016); 
                    r = deg + minNum/60d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:498:4: deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle2027);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle2029); 
                    pushFollow(FOLLOW_integerValue_in_convertAngle2033);
                    minInt=integerValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle2035); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle2039);
                    sec=numericValue();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertAngle2041); 
                    r = deg + minInt/60d + sec/3600d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:500:4: x= numericValue RADIAN
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle2052);
                    x=numericValue();

                    state._fsp--;

                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle2054); 
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
    // flipsAssembly.g:505:1: convertCardinalDirection returns [double r] : ( NORTH | EAST | SOUTH | WEST );
    public final double convertCardinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:506:2: ( NORTH | EAST | SOUTH | WEST )
            int alt39=4;
            switch ( input.LA(1) ) {
            case NORTH:
                {
                alt39=1;
                }
                break;
            case EAST:
                {
                alt39=2;
                }
                break;
            case SOUTH:
                {
                alt39=3;
                }
                break;
            case WEST:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // flipsAssembly.g:506:4: NORTH
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertCardinalDirection2074); 
                    r = 0d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:508:4: EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertCardinalDirection2083); 
                    r = 90d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:510:4: SOUTH
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertCardinalDirection2092); 
                    r = 180d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:512:4: WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertCardinalDirection2101); 
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
    // flipsAssembly.g:517:1: convertOrdinalDirection returns [double r] : ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST );
    public final double convertOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:518:2: ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST )
            int alt40=4;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==NORTH) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==EAST) ) {
                    alt40=1;
                }
                else if ( (LA40_1==WEST) ) {
                    alt40=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==SOUTH) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==EAST) ) {
                    alt40=2;
                }
                else if ( (LA40_2==WEST) ) {
                    alt40=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // flipsAssembly.g:518:4: NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2121); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2123); 
                    r = 45d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:520:4: SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2132); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2134); 
                    r = 135d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:522:4: SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2143); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2145); 
                    r = 225d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:524:4: NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2154); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2156); 
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
    // flipsAssembly.g:529:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );
    public final double convertSubOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:530:2: ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST )
            int alt41=8;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // flipsAssembly.g:530:4: NORTH NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2176); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2178); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2180); 
                    r = 22.5d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:532:4: EAST NORTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2189); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2191); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2193); 
                    r = 67.5d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:534:4: EAST SOUTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2202); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2204); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2206); 
                    r = 112.5d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:536:4: SOUTH SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2215); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2217); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2219); 
                    r = 157.5d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:538:4: SOUTH SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2228); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2230); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2232); 
                    r = 202.5d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:540:4: WEST SOUTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2241); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2243); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2245); 
                    r = 247.5d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:542:4: WEST NORTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2254); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2256); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2258); 
                    r = 292.5d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:544:4: NORTH NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2267); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2269); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2271); 
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
    // flipsAssembly.g:548:1: convertDirection[double r] : ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) );
    public final void convertDirection(double r) throws RecognitionException {
        try {
            // flipsAssembly.g:549:2: ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) )
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
    // flipsAssembly.g:554:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // flipsAssembly.g:555:2: (x= integerValue | y= FloatingPointLiteral )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=BinaryLiteral && LA42_0<=HexLiteral)) ) {
                alt42=1;
            }
            else if ( (LA42_0==FloatingPointLiteral) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // flipsAssembly.g:555:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue2322);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:557:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue2333); 
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
    // flipsAssembly.g:561:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:562:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt43=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt43=1;
                }
                break;
            case OctalLiteral:
                {
                alt43=2;
                }
                break;
            case DecimalLiteral:
                {
                alt43=3;
                }
                break;
            case HexLiteral:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // flipsAssembly.g:562:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue2354); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:564:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue2365); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:566:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue2376); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:568:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue2387); 
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
    // flipsAssembly.g:572:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final double percentValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:573:2: (x= numericValue PERCENT )
            // flipsAssembly.g:573:4: x= numericValue PERCENT
            {
            pushFollow(FOLLOW_numericValue_in_percentValue2408);
            x=numericValue();

            state._fsp--;

            match(input,PERCENT,FOLLOW_PERCENT_in_percentValue2410); 
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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\5\1\2\1\121\1\6\1\2\1\133\4\3\2\uffff";
    static final String DFA4_maxS =
        "\1\5\1\2\1\121\1\6\1\2\1\136\4\7\2\uffff";
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
            return "127:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
    }
    static final String DFA13_eotS =
        "\16\uffff";
    static final String DFA13_eofS =
        "\16\uffff";
    static final String DFA13_minS =
        "\1\24\1\2\1\16\1\56\1\105\3\uffff\2\56\4\uffff";
    static final String DFA13_maxS =
        "\1\24\1\2\1\17\1\76\1\106\3\uffff\2\76\4\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7";
    static final String DFA13_specialS =
        "\16\uffff}>";
    static final String[] DFA13_transitionS = {
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
            return "223:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );";
        }
    }
    static final String DFA15_eotS =
        "\26\uffff";
    static final String DFA15_eofS =
        "\26\uffff";
    static final String DFA15_minS =
        "\1\25\1\2\1\16\1\uffff\1\26\1\uffff\2\132\12\44\4\uffff";
    static final String DFA15_maxS =
        "\1\25\1\2\1\30\1\uffff\1\27\1\uffff\2\136\12\74\4\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\1\1\uffff\1\6\14\uffff\1\2\1\4\1\3\1\5";
    static final String DFA15_specialS =
        "\26\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\10\uffff\1\5",
            "",
            "\1\6\1\7",
            "",
            "\1\14\1\10\1\11\1\12\1\13",
            "\1\21\1\15\1\16\1\17\1\20",
            "\4\22\7\uffff\11\22\4\uffff\1\23",
            "\4\22\7\uffff\11\22\4\uffff\1\23",
            "\4\22\7\uffff\11\22\4\uffff\1\23",
            "\4\22\7\uffff\11\22\4\uffff\1\23",
            "\4\22\7\uffff\11\22\4\uffff\1\23",
            "\4\24\7\uffff\11\24\4\uffff\1\25",
            "\4\24\7\uffff\11\24\4\uffff\1\25",
            "\4\24\7\uffff\11\24\4\uffff\1\25",
            "\4\24\7\uffff\11\24\4\uffff\1\25",
            "\4\24\7\uffff\11\24\4\uffff\1\25",
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
            return "258:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED THROTTLE y= convertThrottle ) );";
        }
    }
    static final String DFA22_eotS =
        "\55\uffff";
    static final String DFA22_eofS =
        "\55\uffff";
    static final String DFA22_minS =
        "\1\32\1\2\1\132\5\44\10\33\5\44\3\uffff\10\33\5\44\10\33";
    static final String DFA22_maxS =
        "\1\32\1\2\1\136\5\53\10\136\5\53\3\uffff\10\136\5\53\10\35";
    static final String DFA22_acceptS =
        "\25\uffff\1\3\1\1\1\2\25\uffff";
    static final String DFA22_specialS =
        "\55\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\13\1\16\1\15\1\12\1\11\1\17\1\14",
            "\1\10\1\13\1\16\1\15\1\12\1\11\1\17\1\14",
            "\1\10\1\13\1\16\1\15\1\12\1\11\1\17\1\14",
            "\1\10\1\13\1\16\1\15\1\12\1\11\1\17\1\14",
            "\1\10\1\13\1\16\1\15\1\12\1\11\1\17\1\14",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\26\1\27\1\25\74\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\30\1\37\1\35\1\33\1\31\1\32\1\36\1\34",
            "\1\30\1\37\1\35\1\33\1\31\1\32\1\36\1\34",
            "\1\30\1\37\1\35\1\33\1\31\1\32\1\36\1\34",
            "\1\30\1\37\1\35\1\33\1\31\1\32\1\36\1\34",
            "\1\30\1\37\1\35\1\33\1\31\1\32\1\36\1\34",
            "",
            "",
            "",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\26\1\27\1\25\74\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\47\1\53\1\51\1\46\1\45\1\54\1\52\1\50",
            "\1\47\1\53\1\51\1\46\1\45\1\54\1\52\1\50",
            "\1\47\1\53\1\51\1\46\1\45\1\54\1\52\1\50",
            "\1\47\1\53\1\51\1\46\1\45\1\54\1\52\1\50",
            "\1\47\1\53\1\51\1\46\1\45\1\54\1\52\1\50",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25",
            "\1\26\1\27\1\25"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "273:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );";
        }
    }
    static final String DFA25_eotS =
        "\17\uffff";
    static final String DFA25_eofS =
        "\17\uffff";
    static final String DFA25_minS =
        "\1\14\1\2\1\16\1\107\1\70\4\3\6\uffff";
    static final String DFA25_maxS =
        "\1\14\1\2\1\17\1\136\1\71\1\112\1\110\1\112\1\110\6\uffff";
    static final String DFA25_acceptS =
        "\11\uffff\1\4\1\5\1\6\1\3\1\2\1\1";
    static final String DFA25_specialS =
        "\17\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\1\7\1\6\1\10\17\uffff\5\11",
            "\1\12\1\13",
            "\1\16\103\uffff\1\14\1\uffff\2\15",
            "\1\16\103\uffff\2\14",
            "\1\16\104\uffff\1\14\2\15",
            "\1\16\103\uffff\2\14",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "291:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );";
        }
    }
    static final String DFA30_eotS =
        "\32\uffff";
    static final String DFA30_eofS =
        "\32\uffff";
    static final String DFA30_minS =
        "\1\42\1\2\1\132\5\54\3\107\2\uffff\5\51\2\107\5\52\1\107";
    static final String DFA30_maxS =
        "\1\42\1\2\1\136\5\55\1\110\1\136\1\110\2\uffff\5\51\1\136\1\110"+
        "\5\52\1\110";
    static final String DFA30_acceptS =
        "\13\uffff\1\2\1\1\15\uffff";
    static final String DFA30_specialS =
        "\32\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\12\1\10",
            "\1\14\1\13",
            "\1\14\1\13\21\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\14\1\13",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\14\1\13\21\uffff\1\30\1\24\1\25\1\26\1\27",
            "\1\14\1\13",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\14\1\13"
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
            return "365:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
    }
    static final String DFA31_eotS =
        "\32\uffff";
    static final String DFA31_eofS =
        "\32\uffff";
    static final String DFA31_minS =
        "\1\43\1\2\1\132\5\54\3\111\2\uffff\5\51\2\111\5\52\1\111";
    static final String DFA31_maxS =
        "\1\43\1\2\1\136\5\55\1\112\1\136\1\112\2\uffff\5\51\1\136\1\112"+
        "\5\52\1\112";
    static final String DFA31_acceptS =
        "\13\uffff\1\1\1\2\15\uffff";
    static final String DFA31_specialS =
        "\32\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\12\1\10",
            "\1\13\1\14",
            "\1\13\1\14\17\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\13\1\14",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\13\1\14\17\uffff\1\30\1\24\1\25\1\26\1\27",
            "\1\13\1\14",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\13\1\14"
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
            return "372:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
    }
    static final String DFA32_eotS =
        "\24\uffff";
    static final String DFA32_eofS =
        "\24\uffff";
    static final String DFA32_minS =
        "\1\56\1\2\1\132\5\57\4\107\1\63\4\107\2\uffff\1\107";
    static final String DFA32_maxS =
        "\1\56\1\2\1\136\5\67\4\110\1\63\4\110\2\uffff\1\110";
    static final String DFA32_acceptS =
        "\21\uffff\1\2\1\1\1\uffff";
    static final String DFA32_specialS =
        "\24\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\17\1\12\1\20\1\14\1\16\1\13\1\11\1\15\1\10",
            "\1\17\1\12\1\20\1\14\1\16\1\13\1\11\1\15\1\10",
            "\1\17\1\12\1\20\1\14\1\16\1\13\1\11\1\15\1\10",
            "\1\17\1\12\1\20\1\14\1\16\1\13\1\11\1\15\1\10",
            "\1\17\1\12\1\20\1\14\1\16\1\13\1\11\1\15\1\10",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\23",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "",
            "",
            "\1\22\1\21"
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
            return "385:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );";
        }
    }
    static final String DFA33_eotS =
        "\24\uffff";
    static final String DFA33_eofS =
        "\24\uffff";
    static final String DFA33_minS =
        "\1\56\1\2\1\132\5\57\3\111\1\63\5\111\2\uffff\1\111";
    static final String DFA33_maxS =
        "\1\56\1\2\1\136\5\67\3\112\1\63\5\112\2\uffff\1\112";
    static final String DFA33_acceptS =
        "\21\uffff\1\1\1\2\1\uffff";
    static final String DFA33_specialS =
        "\24\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\16\1\11\1\20\1\13\1\10\1\14\1\17\1\12\1\15",
            "\1\16\1\11\1\20\1\13\1\10\1\14\1\17\1\12\1\15",
            "\1\16\1\11\1\20\1\13\1\10\1\14\1\17\1\12\1\15",
            "\1\16\1\11\1\20\1\13\1\10\1\14\1\17\1\12\1\15",
            "\1\16\1\11\1\20\1\13\1\10\1\14\1\17\1\12\1\15",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\23",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "",
            "",
            "\1\21\1\22"
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
            return "392:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );";
        }
    }
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\16\uffff";
    static final String DFA34_minS =
        "\1\132\5\44\10\uffff";
    static final String DFA34_maxS =
        "\1\136\5\53\10\uffff";
    static final String DFA34_acceptS =
        "\6\uffff\1\1\1\5\1\3\1\7\1\2\1\6\1\4\1\10";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\12\1\10\1\14\1\7\1\13\1\11\1\15",
            "\1\6\1\12\1\10\1\14\1\7\1\13\1\11\1\15",
            "\1\6\1\12\1\10\1\14\1\7\1\13\1\11\1\15",
            "\1\6\1\12\1\10\1\14\1\7\1\13\1\11\1\15",
            "\1\6\1\12\1\10\1\14\1\7\1\13\1\11\1\15",
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
            return "402:1: convertTime returns [double r] : (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND | x= numericValue MILLISECOND );";
        }
    }
    static final String DFA35_eotS =
        "\17\uffff";
    static final String DFA35_eofS =
        "\17\uffff";
    static final String DFA35_minS =
        "\1\132\5\57\11\uffff";
    static final String DFA35_maxS =
        "\1\136\5\67\11\uffff";
    static final String DFA35_acceptS =
        "\6\uffff\1\10\1\5\1\1\1\3\1\11\1\7\1\6\1\2\1\4";
    static final String DFA35_specialS =
        "\17\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\10\1\15\1\11\1\16\1\7\1\14\1\13\1\6\1\12",
            "\1\10\1\15\1\11\1\16\1\7\1\14\1\13\1\6\1\12",
            "\1\10\1\15\1\11\1\16\1\7\1\14\1\13\1\6\1\12",
            "\1\10\1\15\1\11\1\16\1\7\1\14\1\13\1\6\1\12",
            "\1\10\1\15\1\11\1\16\1\7\1\14\1\13\1\6\1\12",
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
            return "422:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue CENTIMETER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue FURLONG | x= numericValue YARD | x= numericValue FOOT | x= numericValue INCH );";
        }
    }
    static final String DFA36_eotS =
        "\14\uffff";
    static final String DFA36_eofS =
        "\14\uffff";
    static final String DFA36_minS =
        "\1\132\5\77\6\uffff";
    static final String DFA36_maxS =
        "\1\136\5\104\6\uffff";
    static final String DFA36_acceptS =
        "\6\uffff\1\6\1\4\1\2\1\5\1\3\1\1";
    static final String DFA36_specialS =
        "\14\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\13\1\10\1\12\1\7\1\11\1\6",
            "\1\13\1\10\1\12\1\7\1\11\1\6",
            "\1\13\1\10\1\12\1\7\1\11\1\6",
            "\1\13\1\10\1\12\1\7\1\11\1\6",
            "\1\13\1\10\1\12\1\7\1\11\1\6",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "451:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );";
        }
    }
    static final String DFA37_eotS =
        "\30\uffff";
    static final String DFA37_eofS =
        "\30\uffff";
    static final String DFA37_minS =
        "\1\132\5\44\1\uffff\1\50\1\63\3\50\1\uffff\4\50\6\uffff\1\50";
    static final String DFA37_maxS =
        "\1\136\5\67\1\uffff\1\53\1\63\3\53\1\uffff\4\53\6\uffff\1\53";
    static final String DFA37_acceptS =
        "\6\uffff\1\4\5\uffff\1\3\4\uffff\1\2\1\1\1\7\1\5\1\10\1\6\1\uffff";
    static final String DFA37_specialS =
        "\30\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\22\1\21\1\14\1\6\7\uffff\1\13\1\12\1\11\1\10\1\20\1\15\1"+
            "\17\1\16\1\7",
            "\1\22\1\21\1\14\1\6\7\uffff\1\13\1\12\1\11\1\10\1\20\1\15\1"+
            "\17\1\16\1\7",
            "\1\22\1\21\1\14\1\6\7\uffff\1\13\1\12\1\11\1\10\1\20\1\15\1"+
            "\17\1\16\1\7",
            "\1\22\1\21\1\14\1\6\7\uffff\1\13\1\12\1\11\1\10\1\20\1\15\1"+
            "\17\1\16\1\7",
            "\1\22\1\21\1\14\1\6\7\uffff\1\13\1\12\1\11\1\10\1\20\1\15\1"+
            "\17\1\16\1\7",
            "",
            "\1\24\1\26\1\23\1\25",
            "\1\27",
            "\1\24\1\26\1\23\1\25",
            "\1\24\1\26\1\23\1\25",
            "\1\24\1\26\1\23\1\25",
            "",
            "\1\24\1\26\1\23\1\25",
            "\1\24\1\26\1\23\1\25",
            "\1\24\1\26\1\23\1\25",
            "\1\24\1\26\1\23\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\26\1\23\1\25"
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
            return "467:1: convertSpeed returns [double r] : (x= numericValue YEAR | x= numericValue FORTNIGHT | x= numericValue WEEK | x= numericValue DAY | x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND | x= convertDistance MILLISECOND );";
        }
    }
    static final String DFA38_eotS =
        "\20\uffff";
    static final String DFA38_eofS =
        "\20\uffff";
    static final String DFA38_minS =
        "\1\132\5\54\1\uffff\1\3\1\uffff\4\51\1\uffff\1\3\1\uffff";
    static final String DFA38_maxS =
        "\1\136\5\55\1\uffff\1\136\1\uffff\4\51\1\uffff\1\136\1\uffff";
    static final String DFA38_acceptS =
        "\6\uffff\1\4\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3";
    static final String DFA38_specialS =
        "\20\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\10\1\6",
            "",
            "\1\10\103\uffff\4\10\17\uffff\1\15\1\11\1\12\1\13\1\14",
            "",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "",
            "\1\15\103\uffff\4\15\17\uffff\5\17",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "493:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN );";
        }
    }
    static final String DFA41_eotS =
        "\17\uffff";
    static final String DFA41_eofS =
        "\17\uffff";
    static final String DFA41_minS =
        "\3\107\1\110\1\107\1\111\2\uffff\1\111\6\uffff";
    static final String DFA41_maxS =
        "\1\112\1\107\3\110\1\112\2\uffff\1\112\6\uffff";
    static final String DFA41_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\6\1\7\1\1\1\10\1\4\1\5";
    static final String DFA41_specialS =
        "\17\uffff}>";
    static final String[] DFA41_transitionS = {
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "529:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );";
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
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand139 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineSensor161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineSensor165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SENSOR_in_defineSensor168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineSensor172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint194 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_defineWaypoint201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint217 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_defineWaypoint224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand269 = new BitSet(new long[]{0x0000400344331008L});
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
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand340 = new BitSet(new long[]{0x00004003C4331008L});
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
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_executeCommandParameter441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_pitch464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_roll485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude506 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude508 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude525 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude527 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude544 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLIMB_in_altitude563 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude565 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLIMB_in_altitude584 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude586 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DESCEND_in_altitude605 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude607 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DESCEND_in_altitude626 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude628 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude632 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance668 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance685 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RADIUS_in_radius706 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_radius710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_speed731 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed748 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FASTER_in_speed750 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed767 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SLOWER_in_speed769 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed786 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FASTER_in_speed788 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_percentValue_in_speed792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed801 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SLOWER_in_speed803 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_percentValue_in_speed807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THROTTLE_in_speed816 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertThrottle_in_speed820 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time843 = new BitSet(new long[]{0x0000000008000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_time848 = new BitSet(new long[]{0x0000000008000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_time853 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AM_in_time859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time878 = new BitSet(new long[]{0x0000000010000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_time883 = new BitSet(new long[]{0x0000000010000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_time888 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_PM_in_time894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time913 = new BitSet(new long[]{0x0000000020000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_time918 = new BitSet(new long[]{0x0000000020000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_time923 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_HOUR24_in_time929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DURATION_in_duration946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_duration950 = new BitSet(new long[]{0x0000000000000008L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_duration955 = new BitSet(new long[]{0x0000000000000008L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertTime_in_duration960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_convertCardinalDirection_in_direction989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_convertOrdinalDirection_in_direction1006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1017 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_convertSubOrdinalDirection_in_direction1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1036 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1053 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_in_direction1055 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1072 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_direction1074 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1097 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_in_turnDirection1099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1112 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_turnDirection1114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1133 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_CLOCKWISE_in_loiterDirection1135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1148 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint1174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate1198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate1225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_latitude_in_latitudeLongitude1259 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_longitude_in_latitudeLongitude1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_latitude1293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_latitude1310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_longitude1337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_longitude1354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_distanceNorth_in_distanceCoordinate1376 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_distanceEast_in_distanceCoordinate1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth1404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_distanceNorth1410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth1421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_distanceNorth1427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast1448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_distanceEast1454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast1465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_distanceEast1471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1496 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_YEAR_in_convertTime1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1509 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FORTNIGHT_in_convertTime1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1522 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_WEEK_in_convertTime1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1535 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DAY_in_convertTime1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1548 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_HOUR_in_convertTime1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1561 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1574 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertTime1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1587 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MILLISECOND_in_convertTime1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1611 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistance1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1624 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_METER_in_convertDistance1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1637 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CENTIMETER_in_convertDistance1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1650 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistance1652 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1665 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1678 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_FURLONG_in_convertDistance1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1691 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_YARD_in_convertDistance1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1704 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_FOOT_in_convertDistance1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1717 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INCH_in_convertDistance1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1769 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressure1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressure1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressure1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BAR_in_convertPressure1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressure1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressure1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertSpeed1858 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_YEAR_in_convertSpeed1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertSpeed1871 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FORTNIGHT_in_convertSpeed1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertSpeed1884 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_WEEK_in_convertSpeed1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertSpeed1897 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DAY_in_convertSpeed1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1910 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_HOUR_in_convertSpeed1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1923 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertSpeed1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1936 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertSpeed1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1949 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MILLISECOND_in_convertSpeed1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_convertThrottle1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1995 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle2008 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle2010 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2014 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle2027 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle2033 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle2035 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2039 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertAngle2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2052 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertCardinalDirection2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertCardinalDirection2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertCardinalDirection2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertCardinalDirection2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_convertDirection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue2408 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue2410 = new BitSet(new long[]{0x0000000000000002L});

}