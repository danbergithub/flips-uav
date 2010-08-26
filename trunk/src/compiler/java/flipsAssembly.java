// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsAssembly.g 2010-08-26 19:33:00

  import java.io.IOException;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "REQUIRE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "STRAIGHT", "LEVEL", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "THROTTLE", "REVOLUTION", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "StringLiteral", "And", "Identifier", "To", "At", "With", "FlightLevel", "Per", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'req'", "'require'", "'requires'", "','", "'fp'", "'flightplan'", "'flightplans'", "'='", "'cmd'", "'command'", "'commands'", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'repeat'", "'wait'", "'time'", "'times'", "'continuously'", "'forever'", "'until'", "'while'", "'the'", "'tim'", "'is'", "'dir'", "'direction'", "'spd'", "'speed'", "'dst'", "'distance'", "'pit'", "'pitch'", "'rol'", "'roll'", "'alt'", "'altitude'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'lvl'", "'level'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'fps'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'ms'", "'millisecond'", "'milliseconds'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'min'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'str'", "'straight'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'rpm'", "'hz'", "'hertz'", "'rev'", "'revs'", "'revolution'", "'revolutions'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
    };
    public static final int DIRECTION=13;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=15;
    public static final int T__262=262;
    public static final int T__263=263;
    public static final int T__160=160;
    public static final int T__260=260;
    public static final int GEOCOORDINATE=34;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=73;
    public static final int T__264=264;
    public static final int FOOT=55;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int REQUIRE=6;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__300=300;
    public static final int T__163=163;
    public static final int HECTOPASCAL=65;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=47;
    public static final int FASTER=23;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=85;
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
    public static final int KILOMETER=48;
    public static final int T__256=256;
    public static final int EQ=76;
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
    public static final int SENSOR=9;
    public static final int T__137=137;
    public static final int T__316=316;
    public static final int GE=81;
    public static final int T__136=136;
    public static final int T__317=317;
    public static final int T__314=314;
    public static final int T__315=315;
    public static final int T__312=312;
    public static final int T__313=313;
    public static final int FORTNIGHT=38;
    public static final int T__279=279;
    public static final int T__288=288;
    public static final int T__289=289;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int T__282=282;
    public static final int YARD=54;
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
    public static final int With=87;
    public static final int DURATION=31;
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
    public static final int WS=102;
    public static final int T__301=301;
    public static final int T__302=302;
    public static final int T__129=129;
    public static final int STRAIGHT=19;
    public static final int T__303=303;
    public static final int T__304=304;
    public static final int LEVEL=20;
    public static final int BinaryLiteral=93;
    public static final int BinaryDigit=99;
    public static final int THROTTLE=25;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=92;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=79;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int T__271=271;
    public static final int METER=49;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__311=311;
    public static final int T__130=130;
    public static final int T__310=310;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=32;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int MILLISECOND=44;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int EXECUTE=12;
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
    public static final int HexDigit=100;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=33;
    public static final int TIME=27;
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
    public static final int LEFT=57;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int FLIGHTLEVEL=62;
    public static final int CENTIMETER=50;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int AM=28;
    public static final int T__211=211;
    public static final int HexLiteral=96;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int T__235=235;
    public static final int At=86;
    public static final int T__236=236;
    public static final int PITCH=18;
    public static final int RIGHT=58;
    public static final int RELATIVE=16;
    public static final int EAST=74;
    public static final int T__245=245;
    public static final int HOUR=41;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int T__242=242;
    public static final int ALTITUDE=21;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int T__228=228;
    public static final int StringLiteral=82;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int NAUTICAL=51;
    public static final int NonZeroDigit=98;
    public static final int NORTH=72;
    public static final int REVOLUTION=26;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=71;
    public static final int T__230=230;
    public static final int WEEK=39;
    public static final int LT=78;
    public static final int OctalLiteral=94;
    public static final int LATITUDE=35;
    public static final int ATMOSPHERE=69;
    public static final int Per=89;
    public static final int DAY=40;
    public static final int Identifier=84;
    public static final int COMMAND=7;
    public static final int Comment=103;
    public static final int MILLIBAR=68;
    public static final int PARAMETER=8;
    public static final int COUNTERCLOCKWISE=60;
    public static final int FlightLevel=88;
    public static final int INCH=56;
    public static final int NE=77;
    public static final int SECOND=43;
    public static final int CLIMB=70;
    public static final int ROLL=17;
    public static final int HOUR24=30;
    public static final int RADIAN=46;
    public static final int TURN=14;
    public static final int DEGREE=45;
    public static final int PASCAL=66;
    public static final int T__200=200;
    public static final int FLY=10;
    public static final int SLOWER=24;
    public static final int T__201=201;
    public static final int PM=29;
    public static final int FURLONG=53;
    public static final int LONGITUDE=36;
    public static final int PRESSURE=63;
    public static final int T__332=332;
    public static final int T__333=333;
    public static final int T__330=330;
    public static final int T__331=331;
    public static final int YEAR=37;
    public static final int MILE=52;
    public static final int Exponent=101;
    public static final int LineComment=104;
    public static final int T__329=329;
    public static final int DEFINE=5;
    public static final int T__328=328;
    public static final int T__327=327;
    public static final int T__326=326;
    public static final int T__325=325;
    public static final int T__324=324;
    public static final int T__323=323;
    public static final int WEST=75;
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
    public static final int SPEED=22;
    public static final int T__299=299;
    public static final int T__298=298;
    public static final int T__297=297;
    public static final int T__334=334;
    public static final int And=83;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=61;
    public static final int T__189=189;
    public static final int Heading=91;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=97;
    public static final int DecimalLiteral=95;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int Turning=90;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=64;
    public static final int T__176=176;
    public static final int CLOCKWISE=59;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=11;
    public static final int MINUTE=42;
    public static final int T__169=169;
    public static final int BAR=67;
    public static final int LE=80;

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


      SymbolTable symbols;
      public StringBuilder output = new StringBuilder();
      
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
    // flipsAssembly.g:78:1: flightPlan[SymbolTable symbols] : ^( FLIGHTPLAN ( require )* ( define )* ( command )* ) ;
    public final void flightPlan(SymbolTable symbols) throws RecognitionException {

          this.symbols = symbols;

        try {
            // flipsAssembly.g:82:2: ( ^( FLIGHTPLAN ( require )* ( define )* ( command )* ) )
            // flipsAssembly.g:82:4: ^( FLIGHTPLAN ( require )* ( define )* ( command )* )
            {
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan69); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:82:17: ( require )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==REQUIRE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // flipsAssembly.g:82:17: require
                	    {
                	    pushFollow(FOLLOW_require_in_flightPlan71);
                	    require();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // flipsAssembly.g:82:26: ( define )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==DEFINE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // flipsAssembly.g:82:26: define
                	    {
                	    pushFollow(FOLLOW_define_in_flightPlan74);
                	    define();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);

                // flipsAssembly.g:82:34: ( command )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=FLY && LA3_0<=EXECUTE)) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // flipsAssembly.g:82:34: command
                	    {
                	    pushFollow(FOLLOW_command_in_flightPlan77);
                	    command();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
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


    // $ANTLR start "require"
    // flipsAssembly.g:86:1: require : ^( REQUIRE name= StringLiteral ) ;
    public final void require() throws RecognitionException {
        CommonTree name=null;

        try {
            // flipsAssembly.g:87:2: ( ^( REQUIRE name= StringLiteral ) )
            // flipsAssembly.g:87:4: ^( REQUIRE name= StringLiteral )
            {
            match(input,REQUIRE,FOLLOW_REQUIRE_in_require91); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_require95); 

            match(input, Token.UP, null); 

            // Read file
            CharStream input = new ANTLRFileStream(name.getText().replace("\"",""));

            // Lexer
            flipsLexer lexer = new flipsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parser and AST Construction
            flipsParser parser = new flipsParser(tokens);
            flipsParser.flightPlan_return root = parser.flightPlan();
            CommonTree tree = root.tree;
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

            // Semantic Check and Unit Conversion
            flipsAssembly walker = new flipsAssembly(nodes);
            walker.flightPlan(symbols);
            	

            }

        }
        catch (IOException ex) {

            		// The file could not be found. Alert the user.
            		System.out.println(ex.toString());
            	
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "require"


    // $ANTLR start "define"
    // flipsAssembly.g:114:1: define : ( defineFlightPlan | defineCommand | defineSensor | defineWaypoint );
    public final void define() throws RecognitionException {
        try {
            // flipsAssembly.g:115:2: ( defineFlightPlan | defineCommand | defineSensor | defineWaypoint )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DEFINE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==DOWN) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==Identifier) ) {
                        switch ( input.LA(4) ) {
                        case FLIGHTPLAN:
                            {
                            alt4=1;
                            }
                            break;
                        case COMMAND:
                            {
                            alt4=2;
                            }
                            break;
                        case SENSOR:
                            {
                            alt4=3;
                            }
                            break;
                        case GEOCOORDINATE:
                            {
                            alt4=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
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
                    // flipsAssembly.g:115:4: defineFlightPlan
                    {
                    pushFollow(FOLLOW_defineFlightPlan_in_define119);
                    defineFlightPlan();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:116:4: defineCommand
                    {
                    pushFollow(FOLLOW_defineCommand_in_define124);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:117:4: defineSensor
                    {
                    pushFollow(FOLLOW_defineSensor_in_define129);
                    defineSensor();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:118:4: defineWaypoint
                    {
                    pushFollow(FOLLOW_defineWaypoint_in_define134);
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


    // $ANTLR start "defineFlightPlan"
    // flipsAssembly.g:121:1: defineFlightPlan : ^( DEFINE name= Identifier ^( FLIGHTPLAN fp= StringLiteral ) ) ;
    public final void defineFlightPlan() throws RecognitionException {
        CommonTree name=null;
        CommonTree fp=null;

        try {
            // flipsAssembly.g:122:2: ( ^( DEFINE name= Identifier ^( FLIGHTPLAN fp= StringLiteral ) ) )
            // flipsAssembly.g:122:4: ^( DEFINE name= Identifier ^( FLIGHTPLAN fp= StringLiteral ) )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_defineFlightPlan146); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineFlightPlan150); 
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_defineFlightPlan153); 

            match(input, Token.DOWN, null); 
            fp=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_defineFlightPlan157); 

            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            symbols.define(new FlightPlanSymbol(name.getText(),fp.getText()));

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
    // $ANTLR end "defineFlightPlan"


    // $ANTLR start "defineCommand"
    // flipsAssembly.g:126:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int cmd = 0;

        int par = 0;


        try {
            // flipsAssembly.g:127:2: ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsAssembly.g:127:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand175); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand179); 
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand186);
                    cmd=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    symbols.define(new CommandSymbol(name.getText(),cmd));

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:129:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand198); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand202); 
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand209);
                    cmd=integerValue();

                    state._fsp--;

                    match(input,PARAMETER,FOLLOW_PARAMETER_in_defineCommand211); 
                    pushFollow(FOLLOW_integerValue_in_defineCommand215);
                    par=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    symbols.define(new CommandSymbol(name.getText(),cmd,par));

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
    // flipsAssembly.g:133:1: defineSensor : ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) ;
    public final void defineSensor() throws RecognitionException {
        CommonTree name=null;
        int sen = 0;


        try {
            // flipsAssembly.g:134:2: ( ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) )
            // flipsAssembly.g:134:4: ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_defineSensor233); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineSensor237); 
            match(input,SENSOR,FOLLOW_SENSOR_in_defineSensor240); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_integerValue_in_defineSensor244);
            sen=integerValue();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            symbols.define(new SensorSymbol(name.getText(),sen));

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
    // flipsAssembly.g:138:1: defineWaypoint : ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) );
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:139:2: ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DEFINE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==Identifier) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==GEOCOORDINATE) ) {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4==DOWN) ) {
                                int LA6_5 = input.LA(6);

                                if ( (LA6_5==DISTANCE) ) {
                                    alt6=2;
                                }
                                else if ( (LA6_5==LATITUDE) ) {
                                    alt6=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

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
                    // flipsAssembly.g:139:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint262); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint266); 
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_defineWaypoint269); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_defineWaypoint273);
                    geo=latitudeLongitude();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    symbols.define(new LatLonWaypointSymbol(name.getText(),geo.latitude,geo.longitude));

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:141:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) )
                    {
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint285); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint289); 
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_defineWaypoint292); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_defineWaypoint296);
                    dst=distanceCoordinate();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    symbols.define(new DistanceWaypointSymbol(name.getText(),dst.east,dst.north));

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
    // flipsAssembly.g:147:1: command : ( flyCommand | loiterCommand | executeCommand );
    public final void command() throws RecognitionException {
        try {
            // flipsAssembly.g:148:2: ( flyCommand | loiterCommand | executeCommand )
            int alt7=3;
            switch ( input.LA(1) ) {
            case FLY:
                {
                alt7=1;
                }
                break;
            case LOITER:
                {
                alt7=2;
                }
                break;
            case EXECUTE:
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
                    // flipsAssembly.g:148:4: flyCommand
                    {
                    pushFollow(FOLLOW_flyCommand_in_command315);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:149:4: loiterCommand
                    {
                    pushFollow(FOLLOW_loiterCommand_in_command320);
                    loiterCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:150:4: executeCommand
                    {
                    pushFollow(FOLLOW_executeCommand_in_command325);
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
    // flipsAssembly.g:155:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try {
            // flipsAssembly.g:156:2: ( ^( FLY ( flyCommandValue )* ) )
            // flipsAssembly.g:156:4: ^( FLY ( flyCommandValue )* )
            {
            match(input,FLY,FOLLOW_FLY_in_flyCommand339); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:156:10: ( flyCommandValue )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DIRECTION||(LA8_0>=ROLL && LA8_0<=PITCH)||(LA8_0>=ALTITUDE && LA8_0<=SPEED)||LA8_0==TIME||LA8_0==DURATION||(LA8_0>=WAYPOINT && LA8_0<=GEOCOORDINATE)||LA8_0==DISTANCE) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // flipsAssembly.g:156:10: flyCommandValue
                	    {
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand341);
                	    flyCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop8;
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
    // flipsAssembly.g:160:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try {
            // flipsAssembly.g:161:2: ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude )
            int alt9=9;
            switch ( input.LA(1) ) {
            case TIME:
                {
                alt9=1;
                }
                break;
            case DIRECTION:
                {
                alt9=2;
                }
                break;
            case SPEED:
                {
                alt9=3;
                }
                break;
            case DISTANCE:
                {
                alt9=4;
                }
                break;
            case PITCH:
                {
                alt9=5;
                }
                break;
            case ROLL:
                {
                alt9=6;
                }
                break;
            case DURATION:
                {
                alt9=7;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt9=8;
                }
                break;
            case ALTITUDE:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // flipsAssembly.g:161:4: time
                    {
                    pushFollow(FOLLOW_time_in_flyCommandValue358);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:162:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_flyCommandValue363);
                    direction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:163:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_flyCommandValue368);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:164:4: distance
                    {
                    pushFollow(FOLLOW_distance_in_flyCommandValue373);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsAssembly.g:165:4: pitch
                    {
                    pushFollow(FOLLOW_pitch_in_flyCommandValue378);
                    pitch();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsAssembly.g:166:4: roll
                    {
                    pushFollow(FOLLOW_roll_in_flyCommandValue383);
                    roll();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsAssembly.g:167:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_flyCommandValue388);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsAssembly.g:168:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue393);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsAssembly.g:169:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_flyCommandValue398);
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
    // flipsAssembly.g:172:1: loiterCommand : ^( LOITER ( loiterCommandValue )* ) ;
    public final void loiterCommand() throws RecognitionException {
        try {
            // flipsAssembly.g:173:2: ( ^( LOITER ( loiterCommandValue )* ) )
            // flipsAssembly.g:173:4: ^( LOITER ( loiterCommandValue )* )
            {
            match(input,LOITER,FOLLOW_LOITER_in_loiterCommand410); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:173:13: ( loiterCommandValue )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==DIRECTION||(LA10_0>=ALTITUDE && LA10_0<=SPEED)||LA10_0==TIME||(LA10_0>=DURATION && LA10_0<=GEOCOORDINATE)) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // flipsAssembly.g:173:13: loiterCommandValue
                	    {
                	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand412);
                	    loiterCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop10;
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
    // flipsAssembly.g:177:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | waypoint | altitude );
    public final void loiterCommandValue() throws RecognitionException {
        try {
            // flipsAssembly.g:178:2: ( time | speed | loiterDirection | radius | duration | waypoint | altitude )
            int alt11=7;
            switch ( input.LA(1) ) {
            case TIME:
                {
                alt11=1;
                }
                break;
            case SPEED:
                {
                alt11=2;
                }
                break;
            case DIRECTION:
                {
                alt11=3;
                }
                break;
            case RADIUS:
                {
                alt11=4;
                }
                break;
            case DURATION:
                {
                alt11=5;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt11=6;
                }
                break;
            case ALTITUDE:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // flipsAssembly.g:178:4: time
                    {
                    pushFollow(FOLLOW_time_in_loiterCommandValue429);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:179:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_loiterCommandValue434);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:180:4: loiterDirection
                    {
                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue439);
                    loiterDirection();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:181:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_loiterCommandValue444);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsAssembly.g:182:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_loiterCommandValue449);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsAssembly.g:183:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue454);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsAssembly.g:184:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_loiterCommandValue459);
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
    // flipsAssembly.g:187:1: executeCommand : ^( EXECUTE x= Identifier ( executeCommandParameter )* ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:188:2: ( ^( EXECUTE x= Identifier ( executeCommandParameter )* ) )
            // flipsAssembly.g:188:4: ^( EXECUTE x= Identifier ( executeCommandParameter )* )
            {
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand471); 

            match(input, Token.DOWN, null); 
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand475); 
            // flipsAssembly.g:188:27: ( executeCommandParameter )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==PARAMETER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // flipsAssembly.g:188:27: executeCommandParameter
            	    {
            	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand477);
            	    executeCommandParameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input, Token.UP, null); 

            Symbol symbol = symbols.resolve(x.getText());
            if (symbol != null && symbol instanceof CommandSymbol) {
              CommandSymbol command = (CommandSymbol)symbol;
              emit("CMD " + command.getValue(), command.getName().toUpperCase() + " / Command #" + command.getValue());
            }
            else if (symbol != null && symbol instanceof FlightPlanSymbol) {
              FlightPlanSymbol flightPlan = (FlightPlanSymbol)symbol;
              emit(flightPlan.compile());
            }
            	

            }

        }
        catch (IOException ex) {

            		// The file could not be found. Alert the user.
            		System.out.println(ex.toString());
            	
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "executeCommand"


    // $ANTLR start "executeCommandParameter"
    // flipsAssembly.g:206:1: executeCommandParameter : ( ^( PARAMETER x= numericValue ) | ^( PARAMETER y= StringLiteral ) );
    public final void executeCommandParameter() throws RecognitionException {
        CommonTree y=null;
        double x = 0.0;


        try {
            // flipsAssembly.g:207:2: ( ^( PARAMETER x= numericValue ) | ^( PARAMETER y= StringLiteral ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PARAMETER) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==StringLiteral) ) {
                        alt13=2;
                    }
                    else if ( ((LA13_2>=FloatingPointLiteral && LA13_2<=HexLiteral)) ) {
                        alt13=1;
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
                    // flipsAssembly.g:207:4: ^( PARAMETER x= numericValue )
                    {
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter501); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_numericValue_in_executeCommandParameter505);
                    x=numericValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("CMD PAR " + x, "Command Parameter");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:209:4: ^( PARAMETER y= StringLiteral )
                    {
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter516); 

                    match(input, Token.DOWN, null); 
                    y=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_executeCommandParameter520); 

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
    // flipsAssembly.g:215:1: pitch : ( ^( PITCH x= convertAngle ) | ^( PITCH y= convertAngularRate ) | ^( PITCH x= convertAngle ^( SPEED y= convertAngularRate ) ) );
    public final void pitch() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:216:2: ( ^( PITCH x= convertAngle ) | ^( PITCH y= convertAngularRate ) | ^( PITCH x= convertAngle ^( SPEED y= convertAngularRate ) ) )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // flipsAssembly.g:216:4: ^( PITCH x= convertAngle )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch539); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_pitch543);
                    x=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PIT FIX " + x, x + " deg Pitch");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:218:4: ^( PITCH y= convertAngularRate )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch554); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngularRate_in_pitch558);
                    y=convertAngularRate();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL PIT FIX " + y, y + " deg/s Pitch");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:220:4: ^( PITCH x= convertAngle ^( SPEED y= convertAngularRate ) )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch569); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_pitch573);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SPEED,FOLLOW_SPEED_in_pitch576); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngularRate_in_pitch580);
                    y=convertAngularRate();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    emit("POS PIT FIX " + x, x + " deg Pitch");
                    emit("VEL PIT FIX " + y, y + " deg/s Pitch");

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
    // $ANTLR end "pitch"


    // $ANTLR start "roll"
    // flipsAssembly.g:225:1: roll : ( ^( ROLL x= convertAngle ) | ^( ROLL y= convertAngularRate ) | ^( ROLL x= convertAngle ^( SPEED y= convertAngularRate ) ) | ^( ROLL LEVEL ) );
    public final void roll() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:226:2: ( ^( ROLL x= convertAngle ) | ^( ROLL y= convertAngularRate ) | ^( ROLL x= convertAngle ^( SPEED y= convertAngularRate ) ) | ^( ROLL LEVEL ) )
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // flipsAssembly.g:226:4: ^( ROLL x= convertAngle )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll602); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_roll606);
                    x=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS ROL FIX " + x, x + " deg Roll");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:228:4: ^( ROLL y= convertAngularRate )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll617); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngularRate_in_roll621);
                    y=convertAngularRate();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL ROL FIX " + y, y + " deg/s Roll");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:230:4: ^( ROLL x= convertAngle ^( SPEED y= convertAngularRate ) )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll632); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_roll636);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SPEED,FOLLOW_SPEED_in_roll639); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngularRate_in_roll643);
                    y=convertAngularRate();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    emit("POS ROL FIX " + x, x + " deg Roll");
                    emit("VEL ROL FIX " + y, y + " deg/s Roll");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:233:4: ^( ROLL LEVEL )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll659); 

                    match(input, Token.DOWN, null); 
                    match(input,LEVEL,FOLLOW_LEVEL_in_roll661); 

                    match(input, Token.UP, null); 
                    emit("POS ROL FIX 0", "0 deg/s Roll");

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
    // $ANTLR end "roll"


    // $ANTLR start "altitude"
    // flipsAssembly.g:239:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:240:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) )
            int alt16=7;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // flipsAssembly.g:240:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude680); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude682); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude684); 
                    pushFollow(FOLLOW_convertDistance_in_altitude688);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:242:4: ^( ALTITUDE FIXED PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude699); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude701); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude703); 
                    pushFollow(FOLLOW_convertPressure_in_altitude707);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:244:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude718); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude720); 
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude724);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:246:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude735); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude737); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude739); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude741); 
                    pushFollow(FOLLOW_convertDistance_in_altitude745);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:248:4: ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude756); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude758); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude760); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude762); 
                    pushFollow(FOLLOW_convertPressure_in_altitude766);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:250:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude777); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude779); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude781); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude783); 
                    pushFollow(FOLLOW_convertDistance_in_altitude787);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:252:4: ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude798); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude800); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude802); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude804); 
                    pushFollow(FOLLOW_convertPressure_in_altitude808);
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
    // flipsAssembly.g:258:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:259:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DISTANCE) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt17=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt17=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt17=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // flipsAssembly.g:259:4: ^( DISTANCE x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance827); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distance831);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:261:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance842); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_distance844); 
                    pushFollow(FOLLOW_convertDistance_in_distance848);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:263:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance859); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance861); 
                    pushFollow(FOLLOW_convertDistance_in_distance865);
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
    // flipsAssembly.g:267:1: radius : ^( RADIUS x= convertDistance ) ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:268:2: ( ^( RADIUS x= convertDistance ) )
            // flipsAssembly.g:268:4: ^( RADIUS x= convertDistance )
            {
            match(input,RADIUS,FOLLOW_RADIUS_in_radius882); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertDistance_in_radius886);
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
    // flipsAssembly.g:274:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED THROTTLE x= percentValue ) | ^( SPEED THROTTLE x= convertAngularRate ) );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:275:2: ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED THROTTLE x= percentValue ) | ^( SPEED THROTTLE x= convertAngularRate ) )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // flipsAssembly.g:275:4: ^( SPEED FIXED x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed905); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_speed907); 
                    pushFollow(FOLLOW_convertSpeed_in_speed911);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:277:4: ^( SPEED RELATIVE FASTER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed922); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed924); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed926); 
                    pushFollow(FOLLOW_convertSpeed_in_speed930);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:279:4: ^( SPEED RELATIVE SLOWER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed941); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed943); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed945); 
                    pushFollow(FOLLOW_convertSpeed_in_speed949);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + -x, -x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:281:4: ^( SPEED RELATIVE FASTER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed960); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed962); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed964); 
                    pushFollow(FOLLOW_percentValue_in_speed968);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:282:4: ^( SPEED RELATIVE SLOWER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed975); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed977); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed979); 
                    pushFollow(FOLLOW_percentValue_in_speed983);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:283:4: ^( SPEED THROTTLE x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed990); 

                    match(input, Token.DOWN, null); 
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_speed992); 
                    pushFollow(FOLLOW_percentValue_in_speed996);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("ACT THR PCT " + x, x + "% Throttle");

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:285:4: ^( SPEED THROTTLE x= convertAngularRate )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed1007); 

                    match(input, Token.DOWN, null); 
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_speed1009); 
                    pushFollow(FOLLOW_convertAngularRate_in_speed1013);
                    x=convertAngularRate();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("ACT THR RPM " + (x / 6d), (x / 6d) + " RPM (" + x + " deg/s) Throttle");

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
    // flipsAssembly.g:291:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );
    public final void time() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:292:2: ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // flipsAssembly.g:292:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time1032); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time1036);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:292:25: (y= convertTime (z= convertTime )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=FloatingPointLiteral && LA20_0<=HexLiteral)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // flipsAssembly.g:292:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time1041);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:292:40: (z= convertTime )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( ((LA19_0>=FloatingPointLiteral && LA19_0<=HexLiteral)) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // flipsAssembly.g:292:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time1046);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,AM,FOLLOW_AM_in_time1052); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:295:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time1067); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time1071);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:295:25: (y= convertTime (z= convertTime )? )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=FloatingPointLiteral && LA22_0<=HexLiteral)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // flipsAssembly.g:295:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time1076);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:295:40: (z= convertTime )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( ((LA21_0>=FloatingPointLiteral && LA21_0<=HexLiteral)) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // flipsAssembly.g:295:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time1081);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,PM,FOLLOW_PM_in_time1087); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:298:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time1102); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time1106);
                    x=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:298:25: (y= convertTime (z= convertTime )? )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=FloatingPointLiteral && LA24_0<=HexLiteral)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // flipsAssembly.g:298:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time1111);
                            y=convertTime();

                            state._fsp--;

                            // flipsAssembly.g:298:40: (z= convertTime )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( ((LA23_0>=FloatingPointLiteral && LA23_0<=HexLiteral)) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // flipsAssembly.g:298:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time1116);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,HOUR24,FOLLOW_HOUR24_in_time1122); 

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
    // flipsAssembly.g:302:1: duration : ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) ;
    public final void duration() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:303:2: ( ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) )
            // flipsAssembly.g:303:4: ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? )
            {
            match(input,DURATION,FOLLOW_DURATION_in_duration1139); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertTime_in_duration1143);
            x=convertTime();

            state._fsp--;

            // flipsAssembly.g:303:29: (y= convertTime (z= convertTime )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=FloatingPointLiteral && LA27_0<=HexLiteral)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // flipsAssembly.g:303:30: y= convertTime (z= convertTime )?
                    {
                    pushFollow(FOLLOW_convertTime_in_duration1148);
                    y=convertTime();

                    state._fsp--;

                    // flipsAssembly.g:303:44: (z= convertTime )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=FloatingPointLiteral && LA26_0<=HexLiteral)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // flipsAssembly.g:303:45: z= convertTime
                            {
                            pushFollow(FOLLOW_convertTime_in_duration1153);
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
    // flipsAssembly.g:309:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) | ^( DIRECTION RELATIVE STRAIGHT ) );
    public final void direction() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:310:2: ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) | ^( DIRECTION RELATIVE STRAIGHT ) )
            int alt28=7;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // flipsAssembly.g:310:4: ^( DIRECTION FIXED x= convertCardinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1176); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1178); 
                    pushFollow(FOLLOW_convertCardinalDirection_in_direction1182);
                    x=convertCardinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:312:4: ^( DIRECTION FIXED x= convertOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1193); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1195); 
                    pushFollow(FOLLOW_convertOrdinalDirection_in_direction1199);
                    x=convertOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:314:4: ^( DIRECTION FIXED x= convertSubOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1210); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1212); 
                    pushFollow(FOLLOW_convertSubOrdinalDirection_in_direction1216);
                    x=convertSubOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:316:4: ^( DIRECTION FIXED y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1227); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1229); 
                    pushFollow(FOLLOW_convertAngle_in_direction1233);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:318:4: ^( DIRECTION RELATIVE LEFT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1244); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1246); 
                    match(input,LEFT,FOLLOW_LEFT_in_direction1248); 
                    pushFollow(FOLLOW_convertAngle_in_direction1252);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + -y, -y + " deg Yaw");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:320:4: ^( DIRECTION RELATIVE RIGHT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1263); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1265); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_direction1267); 
                    pushFollow(FOLLOW_convertAngle_in_direction1271);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + y, y + " deg Yaw");

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:322:4: ^( DIRECTION RELATIVE STRAIGHT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1282); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1284); 
                    match(input,STRAIGHT,FOLLOW_STRAIGHT_in_direction1286); 

                    match(input, Token.UP, null); 
                    emit("POS YAW REL 0", "0 deg Yaw");

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
    // flipsAssembly.g:326:1: turnDirection : ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) );
    public final void turnDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:327:2: ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DIRECTION) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==DOWN) ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==TURN) ) {
                        int LA29_3 = input.LA(4);

                        if ( (LA29_3==LEFT) ) {
                            alt29=1;
                        }
                        else if ( (LA29_3==RIGHT) ) {
                            alt29=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 3, input);

                            throw nvae;
                        }
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
                    // flipsAssembly.g:327:4: ^( DIRECTION TURN LEFT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1303); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1305); 
                    match(input,LEFT,FOLLOW_LEFT_in_turnDirection1307); 

                    match(input, Token.UP, null); 
                    emit("DIR L", "Left Turn Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:329:4: ^( DIRECTION TURN RIGHT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1318); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1320); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_turnDirection1322); 

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
    // flipsAssembly.g:333:1: loiterDirection : ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) );
    public final void loiterDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:334:2: ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DIRECTION) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==DOWN) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==TURN) ) {
                        int LA30_3 = input.LA(4);

                        if ( (LA30_3==CLOCKWISE) ) {
                            alt30=1;
                        }
                        else if ( (LA30_3==COUNTERCLOCKWISE) ) {
                            alt30=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // flipsAssembly.g:334:4: ^( DIRECTION TURN CLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1339); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1341); 
                    match(input,CLOCKWISE,FOLLOW_CLOCKWISE_in_loiterDirection1343); 

                    match(input, Token.UP, null); 
                    emit("DIR CW", "Clockwise Loiter Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:336:4: ^( DIRECTION TURN COUNTERCLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1354); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1356); 
                    match(input,COUNTERCLOCKWISE,FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1358); 

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
    // flipsAssembly.g:342:1: waypoint : ( geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:343:2: ( geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==GEOCOORDINATE) ) {
                alt31=1;
            }
            else if ( (LA31_0==WAYPOINT) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // flipsAssembly.g:343:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1376);
                    geoCoordinate();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:344:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint1382); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint1386); 

                    match(input, Token.UP, null); 

                    Symbol symbol = symbols.resolve(x.getText());
                    if (symbol != null && symbol instanceof LatLonWaypointSymbol) {
                      LatLonWaypointSymbol waypoint = (LatLonWaypointSymbol)symbol;
                      emit("POS   X GEO " + waypoint.getLongitude(), waypoint.getName().toUpperCase() + " / " + Math.abs(waypoint.getLongitude()) + " " + waypoint.getEastWest() + " Longitude");
                      emit("POS   Y GEO " + waypoint.getLatitude(), waypoint.getName().toUpperCase() + " / " + Math.abs(waypoint.getLatitude()) + " " + waypoint.getNorthSouth() + " Latitude");
                    }
                    else if (symbol != null && symbol instanceof DistanceWaypointSymbol) {
                      DistanceWaypointSymbol waypoint = (DistanceWaypointSymbol)symbol;
                      emit("POS   X FIX " + waypoint.getX(), waypoint.getName().toUpperCase() + " / " + mToft(Math.abs(waypoint.getX())) + waypoint.getEastWest() + " Distance");
                      emit("POS   Y FIX " + waypoint.getY(), waypoint.getName().toUpperCase() + " / " + mToft(Math.abs(waypoint.getY())) + waypoint.getNorthSouth() + " Distance");
                    }
                    else {
                      emit("POS   X FIX " + symbol.getName(), symbol.getName().toUpperCase() + " Waypoint");
                      emit("POS   Y FIX " + symbol.getName(), symbol.getName().toUpperCase() + " Waypoint");
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
    // flipsAssembly.g:364:1: geoCoordinate : ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) );
    public final void geoCoordinate() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:365:2: ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==GEOCOORDINATE) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==DOWN) ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==DISTANCE) ) {
                        alt32=2;
                    }
                    else if ( (LA32_2==LATITUDE) ) {
                        alt32=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // flipsAssembly.g:365:4: ^( GEOCOORDINATE geo= latitudeLongitude )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1402); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate1406);
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
                    // flipsAssembly.g:370:4: ^( GEOCOORDINATE dst= distanceCoordinate )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1429); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate1433);
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
    // flipsAssembly.g:377:1: latitudeLongitude returns [double latitude, double longitude] : x= latitude y= longitude ;
    public final flipsAssembly.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return retval = new flipsAssembly.latitudeLongitude_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:378:2: (x= latitude y= longitude )
            // flipsAssembly.g:378:4: x= latitude y= longitude
            {
            pushFollow(FOLLOW_latitude_in_latitudeLongitude1467);
            x=latitude();

            state._fsp--;

            pushFollow(FOLLOW_longitude_in_latitudeLongitude1471);
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
    // flipsAssembly.g:383:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:384:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // flipsAssembly.g:384:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1495); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1499);
                    x=convertAngle();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_latitude1501); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:386:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1512); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1516);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude1518); 

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
    // flipsAssembly.g:390:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:391:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // flipsAssembly.g:391:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1539); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1543);
                    x=convertAngle();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_longitude1545); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:393:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1556); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1560);
                    x=convertAngle();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_longitude1562); 

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
    // flipsAssembly.g:397:1: distanceCoordinate returns [double north, double east] : x= distanceNorth y= distanceEast ;
    public final flipsAssembly.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsAssembly.distanceCoordinate_return retval = new flipsAssembly.distanceCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:398:2: (x= distanceNorth y= distanceEast )
            // flipsAssembly.g:398:4: x= distanceNorth y= distanceEast
            {
            pushFollow(FOLLOW_distanceNorth_in_distanceCoordinate1584);
            x=distanceNorth();

            state._fsp--;

            pushFollow(FOLLOW_distanceEast_in_distanceCoordinate1588);
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
    // flipsAssembly.g:403:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );
    public final double distanceNorth() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:404:2: ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // flipsAssembly.g:404:4: ^( DISTANCE x= convertDistance NORTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth1612); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth1616);
                    x=convertDistance();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_distanceNorth1618); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:406:4: ^( DISTANCE x= convertDistance SOUTH )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceNorth1629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceNorth1633);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_distanceNorth1635); 

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
    // flipsAssembly.g:410:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );
    public final double distanceEast() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:411:2: ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // flipsAssembly.g:411:4: ^( DISTANCE x= convertDistance EAST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast1656); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast1660);
                    x=convertDistance();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_distanceEast1662); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:413:4: ^( DISTANCE x= convertDistance WEST )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceEast1673); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distanceEast1677);
                    x=convertDistance();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_distanceEast1679); 

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
    // flipsAssembly.g:420:1: convertTime returns [double r] : x= numericValue y= convertTimeUnit ;
    public final double convertTime() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:421:2: (x= numericValue y= convertTimeUnit )
            // flipsAssembly.g:421:4: x= numericValue y= convertTimeUnit
            {
            pushFollow(FOLLOW_numericValue_in_convertTime1704);
            x=numericValue();

            state._fsp--;

            pushFollow(FOLLOW_convertTimeUnit_in_convertTime1708);
            y=convertTimeUnit();

            state._fsp--;

            r = x * y;

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


    // $ANTLR start "convertTimeUnit"
    // flipsAssembly.g:426:1: convertTimeUnit returns [double r] : ( YEAR | FORTNIGHT | WEEK | DAY | HOUR | MINUTE | SECOND | MILLISECOND );
    public final double convertTimeUnit() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:427:2: ( YEAR | FORTNIGHT | WEEK | DAY | HOUR | MINUTE | SECOND | MILLISECOND )
            int alt37=8;
            switch ( input.LA(1) ) {
            case YEAR:
                {
                alt37=1;
                }
                break;
            case FORTNIGHT:
                {
                alt37=2;
                }
                break;
            case WEEK:
                {
                alt37=3;
                }
                break;
            case DAY:
                {
                alt37=4;
                }
                break;
            case HOUR:
                {
                alt37=5;
                }
                break;
            case MINUTE:
                {
                alt37=6;
                }
                break;
            case SECOND:
                {
                alt37=7;
                }
                break;
            case MILLISECOND:
                {
                alt37=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // flipsAssembly.g:427:4: YEAR
                    {
                    match(input,YEAR,FOLLOW_YEAR_in_convertTimeUnit1728); 
                    r = 31557600d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:429:4: FORTNIGHT
                    {
                    match(input,FORTNIGHT,FOLLOW_FORTNIGHT_in_convertTimeUnit1737); 
                    r = 1209600d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:431:4: WEEK
                    {
                    match(input,WEEK,FOLLOW_WEEK_in_convertTimeUnit1746); 
                    r = 604800d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:433:4: DAY
                    {
                    match(input,DAY,FOLLOW_DAY_in_convertTimeUnit1755); 
                    r = 86400d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:435:4: HOUR
                    {
                    match(input,HOUR,FOLLOW_HOUR_in_convertTimeUnit1764); 
                    r = 3600d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:437:4: MINUTE
                    {
                    match(input,MINUTE,FOLLOW_MINUTE_in_convertTimeUnit1773); 
                    r = 60d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:439:4: SECOND
                    {
                    match(input,SECOND,FOLLOW_SECOND_in_convertTimeUnit1782); 
                    r = 1d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:441:4: MILLISECOND
                    {
                    match(input,MILLISECOND,FOLLOW_MILLISECOND_in_convertTimeUnit1791); 
                    r = 0.001d;

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
    // $ANTLR end "convertTimeUnit"


    // $ANTLR start "convertDistance"
    // flipsAssembly.g:446:1: convertDistance returns [double r] : x= numericValue y= convertDistanceUnit ;
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:447:2: (x= numericValue y= convertDistanceUnit )
            // flipsAssembly.g:447:4: x= numericValue y= convertDistanceUnit
            {
            pushFollow(FOLLOW_numericValue_in_convertDistance1813);
            x=numericValue();

            state._fsp--;

            pushFollow(FOLLOW_convertDistanceUnit_in_convertDistance1817);
            y=convertDistanceUnit();

            state._fsp--;

            r = x * y;

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


    // $ANTLR start "convertDistanceUnit"
    // flipsAssembly.g:452:1: convertDistanceUnit returns [double r] : ( KILOMETER | METER | CENTIMETER | NAUTICAL MILE | MILE | FURLONG | YARD | FOOT | INCH );
    public final double convertDistanceUnit() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:453:2: ( KILOMETER | METER | CENTIMETER | NAUTICAL MILE | MILE | FURLONG | YARD | FOOT | INCH )
            int alt38=9;
            switch ( input.LA(1) ) {
            case KILOMETER:
                {
                alt38=1;
                }
                break;
            case METER:
                {
                alt38=2;
                }
                break;
            case CENTIMETER:
                {
                alt38=3;
                }
                break;
            case NAUTICAL:
                {
                alt38=4;
                }
                break;
            case MILE:
                {
                alt38=5;
                }
                break;
            case FURLONG:
                {
                alt38=6;
                }
                break;
            case YARD:
                {
                alt38=7;
                }
                break;
            case FOOT:
                {
                alt38=8;
                }
                break;
            case INCH:
                {
                alt38=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // flipsAssembly.g:453:4: KILOMETER
                    {
                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistanceUnit1837); 
                    r = 1000d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:455:4: METER
                    {
                    match(input,METER,FOLLOW_METER_in_convertDistanceUnit1846); 
                    r = 1d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:457:4: CENTIMETER
                    {
                    match(input,CENTIMETER,FOLLOW_CENTIMETER_in_convertDistanceUnit1855); 
                    r = 0.01d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:459:4: NAUTICAL MILE
                    {
                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistanceUnit1864); 
                    match(input,MILE,FOLLOW_MILE_in_convertDistanceUnit1866); 
                    r = 1852d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:461:4: MILE
                    {
                    match(input,MILE,FOLLOW_MILE_in_convertDistanceUnit1875); 
                    r = 1609.344d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:463:4: FURLONG
                    {
                    match(input,FURLONG,FOLLOW_FURLONG_in_convertDistanceUnit1884); 
                    r = 201.168d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:465:4: YARD
                    {
                    match(input,YARD,FOLLOW_YARD_in_convertDistanceUnit1893); 
                    r = 0.9144d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:467:4: FOOT
                    {
                    match(input,FOOT,FOLLOW_FOOT_in_convertDistanceUnit1902); 
                    r = 0.3048d;

                    }
                    break;
                case 9 :
                    // flipsAssembly.g:469:4: INCH
                    {
                    match(input,INCH,FOLLOW_INCH_in_convertDistanceUnit1911); 
                    r = 0.0254d;

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
    // $ANTLR end "convertDistanceUnit"


    // $ANTLR start "convertFlightLevel"
    // flipsAssembly.g:474:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:475:2: ( FLIGHTLEVEL x= FlightLevel )
            // flipsAssembly.g:475:4: FLIGHTLEVEL x= FlightLevel
            {
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1931); 
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel1935); 
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
    // flipsAssembly.g:481:1: convertPressure returns [double r] : x= numericValue y= convertPressureUnit ;
    public final double convertPressure() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:482:2: (x= numericValue y= convertPressureUnit )
            // flipsAssembly.g:482:4: x= numericValue y= convertPressureUnit
            {
            pushFollow(FOLLOW_numericValue_in_convertPressure1961);
            x=numericValue();

            state._fsp--;

            pushFollow(FOLLOW_convertPressureUnit_in_convertPressure1965);
            y=convertPressureUnit();

            state._fsp--;

            r = x * y;

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


    // $ANTLR start "convertPressureUnit"
    // flipsAssembly.g:487:1: convertPressureUnit returns [double r] : ( KILOPASCAL | HECTOPASCAL | PASCAL | BAR | MILLIBAR | ATMOSPHERE );
    public final double convertPressureUnit() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:488:2: ( KILOPASCAL | HECTOPASCAL | PASCAL | BAR | MILLIBAR | ATMOSPHERE )
            int alt39=6;
            switch ( input.LA(1) ) {
            case KILOPASCAL:
                {
                alt39=1;
                }
                break;
            case HECTOPASCAL:
                {
                alt39=2;
                }
                break;
            case PASCAL:
                {
                alt39=3;
                }
                break;
            case BAR:
                {
                alt39=4;
                }
                break;
            case MILLIBAR:
                {
                alt39=5;
                }
                break;
            case ATMOSPHERE:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // flipsAssembly.g:488:4: KILOPASCAL
                    {
                    match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressureUnit1985); 
                    r = 1000d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:490:4: HECTOPASCAL
                    {
                    match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressureUnit1994); 
                    r = 100d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:492:4: PASCAL
                    {
                    match(input,PASCAL,FOLLOW_PASCAL_in_convertPressureUnit2003); 
                    r = 1d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:494:4: BAR
                    {
                    match(input,BAR,FOLLOW_BAR_in_convertPressureUnit2012); 
                    r = 100000d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:496:4: MILLIBAR
                    {
                    match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressureUnit2021); 
                    r = 100d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:498:4: ATMOSPHERE
                    {
                    match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressureUnit2030); 
                    r = 101325d;

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
    // $ANTLR end "convertPressureUnit"


    // $ANTLR start "convertSpeed"
    // flipsAssembly.g:503:1: convertSpeed returns [double r] : x= convertDistance y= convertTimeUnit ;
    public final double convertSpeed() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:504:2: (x= convertDistance y= convertTimeUnit )
            // flipsAssembly.g:504:4: x= convertDistance y= convertTimeUnit
            {
            pushFollow(FOLLOW_convertDistance_in_convertSpeed2052);
            x=convertDistance();

            state._fsp--;

            pushFollow(FOLLOW_convertTimeUnit_in_convertSpeed2056);
            y=convertTimeUnit();

            state._fsp--;

            r = x / y;

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


    // $ANTLR start "convertAngle"
    // flipsAssembly.g:509:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double minNum = 0.0;

        int minInt = 0;

        double sec = 0.0;


        try {
            // flipsAssembly.g:510:2: (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN )
            int alt40=4;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // flipsAssembly.g:510:4: x= numericValue DEGREE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle2078);
                    x=numericValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle2080); 
                    r = x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:512:4: deg= integerValue DEGREE minNum= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle2091);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle2093); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle2097);
                    minNum=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle2099); 
                    r = deg + minNum/60d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:514:4: deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle2110);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle2112); 
                    pushFollow(FOLLOW_integerValue_in_convertAngle2116);
                    minInt=integerValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle2118); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle2122);
                    sec=numericValue();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertAngle2124); 
                    r = deg + minInt/60d + sec/3600d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:516:4: x= numericValue RADIAN
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle2135);
                    x=numericValue();

                    state._fsp--;

                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle2137); 
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


    // $ANTLR start "convertAngularRate"
    // flipsAssembly.g:521:1: convertAngularRate returns [double r] : (x= convertAngle y= convertTimeUnit | z= numericValue REVOLUTION y= convertTimeUnit );
    public final double convertAngularRate() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // flipsAssembly.g:522:2: (x= convertAngle y= convertTimeUnit | z= numericValue REVOLUTION y= convertTimeUnit )
            int alt41=2;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                int LA41_1 = input.LA(2);

                if ( ((LA41_1>=DEGREE && LA41_1<=RADIAN)) ) {
                    alt41=1;
                }
                else if ( (LA41_1==REVOLUTION) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case OctalLiteral:
                {
                int LA41_2 = input.LA(2);

                if ( ((LA41_2>=DEGREE && LA41_2<=RADIAN)) ) {
                    alt41=1;
                }
                else if ( (LA41_2==REVOLUTION) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case DecimalLiteral:
                {
                int LA41_3 = input.LA(2);

                if ( ((LA41_3>=DEGREE && LA41_3<=RADIAN)) ) {
                    alt41=1;
                }
                else if ( (LA41_3==REVOLUTION) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            case HexLiteral:
                {
                int LA41_4 = input.LA(2);

                if ( ((LA41_4>=DEGREE && LA41_4<=RADIAN)) ) {
                    alt41=1;
                }
                else if ( (LA41_4==REVOLUTION) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA41_5 = input.LA(2);

                if ( ((LA41_5>=DEGREE && LA41_5<=RADIAN)) ) {
                    alt41=1;
                }
                else if ( (LA41_5==REVOLUTION) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // flipsAssembly.g:522:4: x= convertAngle y= convertTimeUnit
                    {
                    pushFollow(FOLLOW_convertAngle_in_convertAngularRate2159);
                    x=convertAngle();

                    state._fsp--;

                    pushFollow(FOLLOW_convertTimeUnit_in_convertAngularRate2163);
                    y=convertTimeUnit();

                    state._fsp--;

                    r = x / y;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:524:4: z= numericValue REVOLUTION y= convertTimeUnit
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngularRate2174);
                    z=numericValue();

                    state._fsp--;

                    match(input,REVOLUTION,FOLLOW_REVOLUTION_in_convertAngularRate2176); 
                    pushFollow(FOLLOW_convertTimeUnit_in_convertAngularRate2180);
                    y=convertTimeUnit();

                    state._fsp--;

                    r = z / y * 360d;

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
    // $ANTLR end "convertAngularRate"


    // $ANTLR start "convertCardinalDirection"
    // flipsAssembly.g:529:1: convertCardinalDirection returns [double r] : ( NORTH | EAST | SOUTH | WEST );
    public final double convertCardinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:530:2: ( NORTH | EAST | SOUTH | WEST )
            int alt42=4;
            switch ( input.LA(1) ) {
            case NORTH:
                {
                alt42=1;
                }
                break;
            case EAST:
                {
                alt42=2;
                }
                break;
            case SOUTH:
                {
                alt42=3;
                }
                break;
            case WEST:
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
                    // flipsAssembly.g:530:4: NORTH
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertCardinalDirection2200); 
                    r = 0d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:532:4: EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertCardinalDirection2209); 
                    r = 90d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:534:4: SOUTH
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertCardinalDirection2218); 
                    r = 180d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:536:4: WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertCardinalDirection2227); 
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
    // flipsAssembly.g:541:1: convertOrdinalDirection returns [double r] : ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST );
    public final double convertOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:542:2: ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST )
            int alt43=4;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==NORTH) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==EAST) ) {
                    alt43=1;
                }
                else if ( (LA43_1==WEST) ) {
                    alt43=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==SOUTH) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==EAST) ) {
                    alt43=2;
                }
                else if ( (LA43_2==WEST) ) {
                    alt43=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // flipsAssembly.g:542:4: NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2247); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2249); 
                    r = 45d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:544:4: SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2258); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2260); 
                    r = 135d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:546:4: SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2269); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2271); 
                    r = 225d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:548:4: NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2280); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2282); 
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
    // flipsAssembly.g:553:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );
    public final double convertSubOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // flipsAssembly.g:554:2: ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST )
            int alt44=8;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // flipsAssembly.g:554:4: NORTH NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2302); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2304); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2306); 
                    r = 22.5d;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:556:4: EAST NORTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2315); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2317); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2319); 
                    r = 67.5d;

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:558:4: EAST SOUTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2328); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2330); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2332); 
                    r = 112.5d;

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:560:4: SOUTH SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2341); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2343); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2345); 
                    r = 157.5d;

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:562:4: SOUTH SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2354); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2356); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2358); 
                    r = 202.5d;

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:564:4: WEST SOUTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2367); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2369); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2371); 
                    r = 247.5d;

                    }
                    break;
                case 7 :
                    // flipsAssembly.g:566:4: WEST NORTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2380); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2382); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2384); 
                    r = 292.5d;

                    }
                    break;
                case 8 :
                    // flipsAssembly.g:568:4: NORTH NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2393); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2395); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2397); 
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
    // flipsAssembly.g:572:1: convertDirection[double r] : ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) );
    public final void convertDirection(double r) throws RecognitionException {
        try {
            // flipsAssembly.g:573:2: ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) )
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
    // flipsAssembly.g:578:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // flipsAssembly.g:579:2: (x= integerValue | y= FloatingPointLiteral )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=BinaryLiteral && LA45_0<=HexLiteral)) ) {
                alt45=1;
            }
            else if ( (LA45_0==FloatingPointLiteral) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // flipsAssembly.g:579:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue2448);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:581:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue2459); 
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
    // flipsAssembly.g:585:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:586:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt46=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt46=1;
                }
                break;
            case OctalLiteral:
                {
                alt46=2;
                }
                break;
            case DecimalLiteral:
                {
                alt46=3;
                }
                break;
            case HexLiteral:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // flipsAssembly.g:586:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue2480); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:588:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue2491); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:590:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue2502); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:592:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue2513); 
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
    // flipsAssembly.g:596:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final double percentValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:597:2: (x= numericValue PERCENT )
            // flipsAssembly.g:597:4: x= numericValue PERCENT
            {
            pushFollow(FOLLOW_numericValue_in_percentValue2534);
            x=numericValue();

            state._fsp--;

            match(input,PERCENT,FOLLOW_PERCENT_in_percentValue2536); 
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\5\1\2\1\124\1\7\1\2\1\135\4\3\2\uffff";
    static final String DFA5_maxS =
        "\1\5\1\2\1\124\1\7\1\2\1\140\4\10\2\uffff";
    static final String DFA5_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10\1\11",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
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
            return "126:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
    }
    static final String DFA14_eotS =
        "\33\uffff";
    static final String DFA14_eofS =
        "\33\uffff";
    static final String DFA14_minS =
        "\1\22\1\2\1\134\5\32\2\3\1\uffff\1\3\4\52\1\uffff\1\52\1\uffff\2"+
        "\3\5\53\1\3";
    static final String DFA14_maxS =
        "\1\22\1\2\1\140\5\56\1\140\1\54\1\uffff\1\54\4\52\1\uffff\1\52\1"+
        "\uffff\1\140\1\54\5\53\1\54";
    static final String DFA14_acceptS =
        "\12\uffff\1\2\5\uffff\1\1\1\uffff\1\3\10\uffff";
    static final String DFA14_specialS =
        "\33\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\12\22\uffff\1\10\1\11",
            "\1\12\22\uffff\1\10\1\11",
            "\1\12\22\uffff\1\10\1\11",
            "\1\12\22\uffff\1\10\1\11",
            "\1\12\22\uffff\1\13\1\11",
            "\1\20\22\uffff\1\22\16\uffff\10\12\57\uffff\1\21\1\14\1\15"+
            "\1\16\1\17",
            "\1\20\22\uffff\1\22\16\uffff\10\12",
            "",
            "\1\20\22\uffff\1\22\16\uffff\10\12",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "",
            "\1\24",
            "",
            "\1\20\22\uffff\1\22\16\uffff\10\12\57\uffff\1\31\1\25\1\26"+
            "\1\27\1\30",
            "\1\20\22\uffff\1\22\16\uffff\10\12",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\20\22\uffff\1\22\16\uffff\10\12"
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
            return "215:1: pitch : ( ^( PITCH x= convertAngle ) | ^( PITCH y= convertAngularRate ) | ^( PITCH x= convertAngle ^( SPEED y= convertAngularRate ) ) );";
        }
    }
    static final String DFA15_eotS =
        "\34\uffff";
    static final String DFA15_eofS =
        "\34\uffff";
    static final String DFA15_minS =
        "\1\21\1\2\1\24\1\uffff\5\32\2\3\1\uffff\1\3\5\52\2\uffff\2\3\5\53"+
        "\1\3";
    static final String DFA15_maxS =
        "\1\21\1\2\1\140\1\uffff\5\56\1\140\1\54\1\uffff\1\54\5\52\2\uffff"+
        "\1\140\1\54\5\53\1\54";
    static final String DFA15_acceptS =
        "\3\uffff\1\4\7\uffff\1\2\6\uffff\1\1\1\3\10\uffff";
    static final String DFA15_specialS =
        "\34\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\107\uffff\1\10\1\4\1\5\1\6\1\7",
            "",
            "\1\13\22\uffff\1\11\1\12",
            "\1\13\22\uffff\1\11\1\12",
            "\1\13\22\uffff\1\11\1\12",
            "\1\13\22\uffff\1\11\1\12",
            "\1\13\22\uffff\1\14\1\12",
            "\1\22\22\uffff\1\23\16\uffff\10\13\57\uffff\1\21\1\15\1\16"+
            "\1\17\1\20",
            "\1\22\22\uffff\1\23\16\uffff\10\13",
            "",
            "\1\22\22\uffff\1\23\16\uffff\10\13",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\22\22\uffff\1\23\16\uffff\10\13\57\uffff\1\32\1\26\1\27"+
            "\1\30\1\31",
            "\1\22\22\uffff\1\23\16\uffff\10\13",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\22\22\uffff\1\23\16\uffff\10\13"
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
            return "225:1: roll : ( ^( ROLL x= convertAngle ) | ^( ROLL y= convertAngularRate ) | ^( ROLL x= convertAngle ^( SPEED y= convertAngularRate ) ) | ^( ROLL LEVEL ) );";
        }
    }
    static final String DFA16_eotS =
        "\16\uffff";
    static final String DFA16_eofS =
        "\16\uffff";
    static final String DFA16_minS =
        "\1\25\1\2\1\17\1\57\1\106\3\uffff\2\57\4\uffff";
    static final String DFA16_maxS =
        "\1\25\1\2\1\20\1\77\1\107\3\uffff\2\77\4\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7";
    static final String DFA16_specialS =
        "\16\uffff}>";
    static final String[] DFA16_transitionS = {
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
            return "239:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );";
        }
    }
    static final String DFA18_eotS =
        "\35\uffff";
    static final String DFA18_eofS =
        "\35\uffff";
    static final String DFA18_minS =
        "\1\26\1\2\1\17\1\uffff\1\27\3\134\5\32\12\60\6\uffff";
    static final String DFA18_maxS =
        "\1\26\1\2\1\31\1\uffff\1\30\3\140\17\75\6\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\1\23\uffff\1\7\1\6\1\4\1\2\1\5\1\3";
    static final String DFA18_specialS =
        "\35\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\10\uffff\1\5",
            "",
            "\1\6\1\7",
            "\1\14\1\10\1\11\1\12\1\13",
            "\1\21\1\15\1\16\1\17\1\20",
            "\1\26\1\22\1\23\1\24\1\25",
            "\1\27\22\uffff\2\27\16\uffff\1\30",
            "\1\27\22\uffff\2\27\16\uffff\1\30",
            "\1\27\22\uffff\2\27\16\uffff\1\30",
            "\1\27\22\uffff\2\27\16\uffff\1\30",
            "\1\27\22\uffff\2\27\16\uffff\1\30",
            "\11\32\4\uffff\1\31",
            "\11\32\4\uffff\1\31",
            "\11\32\4\uffff\1\31",
            "\11\32\4\uffff\1\31",
            "\11\32\4\uffff\1\31",
            "\11\34\4\uffff\1\33",
            "\11\34\4\uffff\1\33",
            "\11\34\4\uffff\1\33",
            "\11\34\4\uffff\1\33",
            "\11\34\4\uffff\1\33",
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
            return "274:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED THROTTLE x= percentValue ) | ^( SPEED THROTTLE x= convertAngularRate ) );";
        }
    }
    static final String DFA25_eotS =
        "\55\uffff";
    static final String DFA25_eofS =
        "\55\uffff";
    static final String DFA25_minS =
        "\1\33\1\2\1\134\5\45\10\34\5\45\3\uffff\10\34\5\45\10\34";
    static final String DFA25_maxS =
        "\1\33\1\2\1\140\5\54\10\140\5\54\3\uffff\10\140\5\54\10\36";
    static final String DFA25_acceptS =
        "\25\uffff\1\1\1\2\1\3\25\uffff";
    static final String DFA25_specialS =
        "\55\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\25\1\26\1\27\75\uffff\1\24\1\20\1\21\1\22\1\23",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "",
            "",
            "",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\25\1\26\1\27\75\uffff\1\44\1\40\1\41\1\42\1\43",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27",
            "\1\25\1\26\1\27"
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
            return "291:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );";
        }
    }
    static final String DFA28_eotS =
        "\20\uffff";
    static final String DFA28_eofS =
        "\20\uffff";
    static final String DFA28_minS =
        "\1\15\1\2\1\17\1\110\1\23\4\3\7\uffff";
    static final String DFA28_maxS =
        "\1\15\1\2\1\20\1\140\1\72\2\113\2\111\7\uffff";
    static final String DFA28_acceptS =
        "\11\uffff\1\4\1\5\1\6\1\7\1\2\1\3\1\1";
    static final String DFA28_specialS =
        "\20\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\1\6\1\7\1\10\20\uffff\5\11",
            "\1\14\45\uffff\1\12\1\13",
            "\1\17\104\uffff\1\16\1\uffff\2\15",
            "\1\17\105\uffff\1\16\2\15",
            "\1\17\104\uffff\2\16",
            "\1\17\104\uffff\2\16",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "309:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) | ^( DIRECTION RELATIVE STRAIGHT ) );";
        }
    }
    static final String DFA33_eotS =
        "\32\uffff";
    static final String DFA33_eofS =
        "\32\uffff";
    static final String DFA33_minS =
        "\1\43\1\2\1\134\5\55\3\110\2\uffff\5\52\2\110\5\53\1\110";
    static final String DFA33_maxS =
        "\1\43\1\2\1\140\5\56\1\111\1\140\1\111\2\uffff\5\52\1\140\1\111"+
        "\5\53\1\111";
    static final String DFA33_acceptS =
        "\13\uffff\1\2\1\1\15\uffff";
    static final String DFA33_specialS =
        "\32\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\12\1\10",
            "\1\14\1\13",
            "\1\14\1\13\22\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\14\1\13",
            "",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\14\1\13\22\uffff\1\30\1\24\1\25\1\26\1\27",
            "\1\14\1\13",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\14\1\13"
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
            return "383:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
    }
    static final String DFA34_eotS =
        "\32\uffff";
    static final String DFA34_eofS =
        "\32\uffff";
    static final String DFA34_minS =
        "\1\44\1\2\1\134\5\55\3\112\1\uffff\5\52\1\uffff\2\112\5\53\1\112";
    static final String DFA34_maxS =
        "\1\44\1\2\1\140\5\56\1\140\2\113\1\uffff\5\52\1\uffff\1\140\1\113"+
        "\5\53\1\113";
    static final String DFA34_acceptS =
        "\13\uffff\1\2\5\uffff\1\1\10\uffff";
    static final String DFA34_specialS =
        "\32\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\21\1\13\20\uffff\1\20\1\14\1\15\1\16\1\17",
            "\1\21\1\13",
            "\1\21\1\13",
            "",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "",
            "\1\21\1\13\20\uffff\1\30\1\24\1\25\1\26\1\27",
            "\1\21\1\13",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\21\1\13"
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
            return "390:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
    }
    static final String DFA35_eotS =
        "\24\uffff";
    static final String DFA35_eofS =
        "\24\uffff";
    static final String DFA35_minS =
        "\1\57\1\2\1\134\5\60\3\110\1\64\5\110\2\uffff\1\110";
    static final String DFA35_maxS =
        "\1\57\1\2\1\140\5\70\3\111\1\64\5\111\2\uffff\1\111";
    static final String DFA35_acceptS =
        "\21\uffff\1\2\1\1\1\uffff";
    static final String DFA35_specialS =
        "\24\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\23",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "",
            "",
            "\1\22\1\21"
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
            return "403:1: distanceNorth returns [double r] : ( ^( DISTANCE x= convertDistance NORTH ) | ^( DISTANCE x= convertDistance SOUTH ) );";
        }
    }
    static final String DFA36_eotS =
        "\24\uffff";
    static final String DFA36_eofS =
        "\24\uffff";
    static final String DFA36_minS =
        "\1\57\1\2\1\134\5\60\3\112\1\64\5\112\2\uffff\1\112";
    static final String DFA36_maxS =
        "\1\57\1\2\1\140\5\70\3\113\1\64\5\113\2\uffff\1\113";
    static final String DFA36_acceptS =
        "\21\uffff\1\1\1\2\1\uffff";
    static final String DFA36_specialS =
        "\24\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
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
            return "410:1: distanceEast returns [double r] : ( ^( DISTANCE x= convertDistance EAST ) | ^( DISTANCE x= convertDistance WEST ) );";
        }
    }
    static final String DFA40_eotS =
        "\20\uffff";
    static final String DFA40_eofS =
        "\20\uffff";
    static final String DFA40_minS =
        "\1\134\5\55\1\3\2\uffff\4\52\1\uffff\1\3\1\uffff";
    static final String DFA40_maxS =
        "\1\140\5\56\1\140\2\uffff\4\52\1\uffff\1\140\1\uffff";
    static final String DFA40_acceptS =
        "\7\uffff\1\4\1\1\4\uffff\1\2\1\uffff\1\3";
    static final String DFA40_specialS =
        "\20\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\10\1\7",
            "\1\10\22\uffff\1\10\16\uffff\10\10\33\uffff\4\10\20\uffff\1"+
            "\15\1\11\1\12\1\13\1\14",
            "",
            "",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "",
            "\1\15\22\uffff\1\15\16\uffff\10\15\33\uffff\4\15\20\uffff\5"+
            "\17",
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
            return "509:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE minNum= numericValue MINUTE | deg= integerValue DEGREE minInt= integerValue MINUTE sec= numericValue SECOND | x= numericValue RADIAN );";
        }
    }
    static final String DFA44_eotS =
        "\17\uffff";
    static final String DFA44_eofS =
        "\17\uffff";
    static final String DFA44_minS =
        "\3\110\1\111\1\110\1\112\2\uffff\1\112\6\uffff";
    static final String DFA44_maxS =
        "\1\113\1\110\3\111\1\113\2\uffff\1\113\6\uffff";
    static final String DFA44_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\6\1\7\1\1\1\10\1\4\1\5";
    static final String DFA44_specialS =
        "\17\uffff}>";
    static final String[] DFA44_transitionS = {
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "553:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );";
        }
    }
 

    public static final BitSet FOLLOW_FLIGHTPLAN_in_flightPlan69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_require_in_flightPlan71 = new BitSet(new long[]{0x0000000000001C68L});
    public static final BitSet FOLLOW_define_in_flightPlan74 = new BitSet(new long[]{0x0000000000001C28L});
    public static final BitSet FOLLOW_command_in_flightPlan77 = new BitSet(new long[]{0x0000000000001C08L});
    public static final BitSet FOLLOW_REQUIRE_in_require91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_require95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_defineFlightPlan_in_define119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineCommand_in_define124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_defineFlightPlan146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineFlightPlan150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_FLIGHTPLAN_in_defineFlightPlan153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_defineFlightPlan157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand179 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand202 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand209 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand211 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineSensor233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineSensor237 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SENSOR_in_defineSensor240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineSensor244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint266 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_defineWaypoint273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint289 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_defineWaypoint296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand341 = new BitSet(new long[]{0x0000800688662008L});
    public static final BitSet FOLLOW_time_in_flyCommandValue358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOITER_in_loiterCommand410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand412 = new BitSet(new long[]{0x0000800788662008L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand475 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand477 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_executeCommandParameter520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_pitch543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngularRate_in_pitch558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_pitch573 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SPEED_in_pitch576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngularRate_in_pitch580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_roll606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngularRate_in_roll621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_roll636 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SPEED_in_roll639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngularRate_in_roll643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEVEL_in_roll661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude682 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude684 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude701 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude703 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude720 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CLIMB_in_altitude739 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude741 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CLIMB_in_altitude760 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude762 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DESCEND_in_altitude781 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude783 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude787 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DESCEND_in_altitude802 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude804 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance844 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance861 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertDistance_in_distance865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RADIUS_in_radius882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_radius886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_speed907 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed924 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_FASTER_in_speed926 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed943 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SLOWER_in_speed945 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed962 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_FASTER_in_speed964 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_percentValue_in_speed968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed977 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SLOWER_in_speed979 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_percentValue_in_speed983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THROTTLE_in_speed992 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_percentValue_in_speed996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed1007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THROTTLE_in_speed1009 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertAngularRate_in_speed1013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time1036 = new BitSet(new long[]{0x0000000010000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_time1041 = new BitSet(new long[]{0x0000000010000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_time1046 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_AM_in_time1052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time1067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time1071 = new BitSet(new long[]{0x0000000020000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_time1076 = new BitSet(new long[]{0x0000000020000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_time1081 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PM_in_time1087 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time1106 = new BitSet(new long[]{0x0000000040000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_time1111 = new BitSet(new long[]{0x0000000040000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_time1116 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HOUR24_in_time1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DURATION_in_duration1139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_duration1143 = new BitSet(new long[]{0x0000000000000008L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_duration1148 = new BitSet(new long[]{0x0000000000000008L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertTime_in_duration1153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_convertCardinalDirection_in_direction1182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_convertOrdinalDirection_in_direction1199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_convertSubOrdinalDirection_in_direction1216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1229 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1246 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LEFT_in_direction1248 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1265 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_direction1267 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STRAIGHT_in_direction1286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1305 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LEFT_in_turnDirection1307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1320 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_turnDirection1322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1341 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CLOCKWISE_in_loiterDirection1343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1356 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint1382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate1406 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate1433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_latitude_in_latitudeLongitude1467 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_longitude_in_latitudeLongitude1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NORTH_in_latitude1501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SOUTH_in_latitude1518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_longitude1545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_longitude1562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_distanceNorth_in_distanceCoordinate1584 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_distanceEast_in_distanceCoordinate1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NORTH_in_distanceNorth1618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceNorth1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceNorth1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SOUTH_in_distanceNorth1635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_distanceEast1662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceEast1673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distanceEast1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_distanceEast1679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1704 = new BitSet(new long[]{0x00001FE000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertTime1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_convertTimeUnit1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORTNIGHT_in_convertTimeUnit1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_convertTimeUnit1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_convertTimeUnit1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_convertTimeUnit1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUTE_in_convertTimeUnit1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_convertTimeUnit1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILLISECOND_in_convertTimeUnit1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1813 = new BitSet(new long[]{0x01FF000000000000L});
    public static final BitSet FOLLOW_convertDistanceUnit_in_convertDistance1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistanceUnit1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METER_in_convertDistanceUnit1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CENTIMETER_in_convertDistanceUnit1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistanceUnit1864 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistanceUnit1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILE_in_convertDistanceUnit1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FURLONG_in_convertDistanceUnit1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YARD_in_convertDistanceUnit1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOOT_in_convertDistanceUnit1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCH_in_convertDistanceUnit1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1961 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_convertPressureUnit_in_convertPressure1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressureUnit1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressureUnit1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressureUnit2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_convertPressureUnit2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressureUnit2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressureUnit2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed2052 = new BitSet(new long[]{0x00001FE000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertSpeed2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2078 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle2091 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle2093 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2097 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle2110 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle2112 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle2116 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle2118 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2122 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertAngle2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle2135 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertAngle_in_convertAngularRate2159 = new BitSet(new long[]{0x00001FE000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertAngularRate2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngularRate2174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_REVOLUTION_in_convertAngularRate2176 = new BitSet(new long[]{0x00001FE000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertAngularRate2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertCardinalDirection2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertCardinalDirection2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertCardinalDirection2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertCardinalDirection2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_convertDirection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue2534 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue2536 = new BitSet(new long[]{0x0000000000000002L});

}