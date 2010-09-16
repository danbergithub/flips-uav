// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsAssembly.g 2010-09-16 19:54:04

  import java.io.IOException;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "REQUIRE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "PITCH", "ROLL", "YAW", "STRAIGHT", "LEVEL", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "THROTTLE", "REVOLUTION", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "ANGLE", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "POSITIVE", "NEGATIVE", "FORWARD", "BACKWARD", "X", "Y", "Z", "REPEAT", "CONDITION", "FOREVER", "StringLiteral", "And", "Identifier", "For", "To", "At", "With", "FlightLevel", "Per", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "PlusOrMinus", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'req'", "'require'", "'requires'", "','", "'fp'", "'flightplan'", "'flightplans'", "'='", "'cmd'", "'command'", "'commands'", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'rpt'", "'repeat'", "'end'", "'x'", "'time'", "'times'", "'forever'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'lvl'", "'level'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'fps'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'ms'", "'millisecond'", "'milliseconds'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'min'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'str'", "'straight'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'fwd'", "'forward'", "'b'", "'bwd'", "'backward'", "'back'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'rpm'", "'hz'", "'hertz'", "'rev'", "'revs'", "'revolution'", "'revolutions'", "'''", "'deg'", "'degs'", "'degree'", "'degrees'", "'rad'", "'rads'", "'radian'", "'radians'", "'%'", "'percent'", "'+'", "'-'"
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
    public static final int GEOCOORDINATE=35;
    public static final int T__261=261;
    public static final int CONDITION=90;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=73;
    public static final int T__264=264;
    public static final int FOOT=57;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int REQUIRE=6;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__300=300;
    public static final int HECTOPASCAL=65;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=49;
    public static final int FASTER=24;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=96;
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
    public static final int KILOMETER=50;
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
    public static final int POSITIVE=82;
    public static final int T__137=137;
    public static final int T__316=316;
    public static final int GE=81;
    public static final int T__136=136;
    public static final int T__317=317;
    public static final int T__314=314;
    public static final int T__315=315;
    public static final int T__312=312;
    public static final int T__313=313;
    public static final int FORTNIGHT=39;
    public static final int T__279=279;
    public static final int T__288=288;
    public static final int T__289=289;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int T__282=282;
    public static final int YARD=56;
    public static final int T__283=283;
    public static final int T__280=280;
    public static final int T__141=141;
    public static final int T__322=322;
    public static final int T__321=321;
    public static final int T__142=142;
    public static final int T__281=281;
    public static final int T__320=320;
    public static final int T__140=140;
    public static final int Y=87;
    public static final int T__145=145;
    public static final int With=98;
    public static final int X=86;
    public static final int DURATION=32;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int Z=88;
    public static final int T__144=144;
    public static final int T__305=305;
    public static final int T__126=126;
    public static final int T__306=306;
    public static final int T__125=125;
    public static final int T__307=307;
    public static final int T__128=128;
    public static final int T__308=308;
    public static final int T__127=127;
    public static final int WS=114;
    public static final int T__301=301;
    public static final int T__302=302;
    public static final int T__129=129;
    public static final int STRAIGHT=20;
    public static final int T__303=303;
    public static final int T__304=304;
    public static final int LEVEL=21;
    public static final int BinaryLiteral=104;
    public static final int BinaryDigit=111;
    public static final int THROTTLE=26;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=103;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=79;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int REPEAT=89;
    public static final int T__271=271;
    public static final int METER=51;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__311=311;
    public static final int T__130=130;
    public static final int T__310=310;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=33;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int MILLISECOND=45;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int EXECUTE=12;
    public static final int T__119=119;
    public static final int T__117=117;
    public static final int T__124=124;
    public static final int PlusOrMinus=109;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int FOREVER=91;
    public static final int HexDigit=112;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=34;
    public static final int TIME=28;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int LEFT=59;
    public static final int FLIGHTLEVEL=62;
    public static final int CENTIMETER=52;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int AM=29;
    public static final int T__211=211;
    public static final int HexLiteral=107;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int T__235=235;
    public static final int At=97;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=60;
    public static final int RELATIVE=16;
    public static final int EAST=74;
    public static final int T__245=245;
    public static final int HOUR=42;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int T__242=242;
    public static final int ALTITUDE=22;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int T__228=228;
    public static final int StringLiteral=92;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int NAUTICAL=53;
    public static final int NonZeroDigit=110;
    public static final int NORTH=72;
    public static final int REVOLUTION=27;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=71;
    public static final int T__230=230;
    public static final int WEEK=40;
    public static final int LT=78;
    public static final int OctalLiteral=105;
    public static final int LATITUDE=36;
    public static final int ATMOSPHERE=69;
    public static final int Per=100;
    public static final int DAY=41;
    public static final int Identifier=94;
    public static final int COMMAND=7;
    public static final int Comment=115;
    public static final int MILLIBAR=68;
    public static final int PARAMETER=8;
    public static final int FlightLevel=99;
    public static final int INCH=58;
    public static final int NE=77;
    public static final int SECOND=44;
    public static final int CLIMB=70;
    public static final int ROLL=18;
    public static final int HOUR24=31;
    public static final int RADIAN=48;
    public static final int TURN=14;
    public static final int DEGREE=47;
    public static final int PASCAL=66;
    public static final int T__200=200;
    public static final int FLY=10;
    public static final int SLOWER=25;
    public static final int T__201=201;
    public static final int PM=30;
    public static final int FURLONG=55;
    public static final int LONGITUDE=37;
    public static final int PRESSURE=63;
    public static final int T__332=332;
    public static final int T__333=333;
    public static final int T__330=330;
    public static final int T__331=331;
    public static final int FORWARD=84;
    public static final int YEAR=38;
    public static final int MILE=54;
    public static final int Exponent=113;
    public static final int LineComment=116;
    public static final int YAW=19;
    public static final int T__329=329;
    public static final int DEFINE=5;
    public static final int T__328=328;
    public static final int T__327=327;
    public static final int T__326=326;
    public static final int T__325=325;
    public static final int T__324=324;
    public static final int T__323=323;
    public static final int T__341=341;
    public static final int WEST=75;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__292=292;
    public static final int T__197=197;
    public static final int T__291=291;
    public static final int T__196=196;
    public static final int T__290=290;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__340=340;
    public static final int T__296=296;
    public static final int T__193=193;
    public static final int T__295=295;
    public static final int T__192=192;
    public static final int T__294=294;
    public static final int T__191=191;
    public static final int T__293=293;
    public static final int T__190=190;
    public static final int SPEED=23;
    public static final int T__299=299;
    public static final int T__298=298;
    public static final int T__297=297;
    public static final int T__339=339;
    public static final int T__338=338;
    public static final int T__335=335;
    public static final int T__334=334;
    public static final int T__337=337;
    public static final int And=93;
    public static final int T__336=336;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int ANGLE=46;
    public static final int PERCENT=61;
    public static final int T__189=189;
    public static final int Heading=102;
    public static final int T__180=180;
    public static final int NEGATIVE=83;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int BACKWARD=85;
    public static final int Digit=108;
    public static final int DecimalLiteral=106;
    public static final int For=95;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int Turning=101;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=64;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=11;
    public static final int MINUTE=43;
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
      
      static String toHHMMSS(double value) {
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
      
      public static String toFT(double meters) {
        return meters + " m (" + (meters / 0.3048) + " ft) ";
      }
      
      public static String toMPH(double metersPerSecond) {
        return metersPerSecond + " m/s (" + (Math.round(metersPerSecond / 1609.344 * 3600 * 100) / 100f) + " mph) ";
      }



    // $ANTLR start "flightPlan"
    // flipsAssembly.g:82:1: flightPlan[SymbolTable symbols] : ^( FLIGHTPLAN ( require )* ( define )* ( statement )* ) ;
    public final void flightPlan(SymbolTable symbols) throws RecognitionException {

          this.symbols = symbols;

        try {
            // flipsAssembly.g:86:2: ( ^( FLIGHTPLAN ( require )* ( define )* ( statement )* ) )
            // flipsAssembly.g:86:4: ^( FLIGHTPLAN ( require )* ( define )* ( statement )* )
            {
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan69); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:86:17: ( require )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==REQUIRE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // flipsAssembly.g:86:17: require
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

                // flipsAssembly.g:86:26: ( define )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==DEFINE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // flipsAssembly.g:86:26: define
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

                // flipsAssembly.g:86:34: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=FLY && LA3_0<=EXECUTE)||LA3_0==REPEAT) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // flipsAssembly.g:86:34: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_flightPlan77);
                	    statement();

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
    // flipsAssembly.g:90:1: require : ^( REQUIRE name= StringLiteral ) ;
    public final void require() throws RecognitionException {
        CommonTree name=null;

        try {
            // flipsAssembly.g:91:2: ( ^( REQUIRE name= StringLiteral ) )
            // flipsAssembly.g:91:4: ^( REQUIRE name= StringLiteral )
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
    // flipsAssembly.g:118:1: define : ( defineFlightPlan | defineCommand | defineSensor | defineWaypoint );
    public final void define() throws RecognitionException {
        try {
            // flipsAssembly.g:119:2: ( defineFlightPlan | defineCommand | defineSensor | defineWaypoint )
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
                    // flipsAssembly.g:119:4: defineFlightPlan
                    {
                    pushFollow(FOLLOW_defineFlightPlan_in_define119);
                    defineFlightPlan();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:120:4: defineCommand
                    {
                    pushFollow(FOLLOW_defineCommand_in_define124);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:121:4: defineSensor
                    {
                    pushFollow(FOLLOW_defineSensor_in_define129);
                    defineSensor();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:122:4: defineWaypoint
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
    // flipsAssembly.g:125:1: defineFlightPlan : ^( DEFINE name= Identifier ^( FLIGHTPLAN fp= StringLiteral ) ) ;
    public final void defineFlightPlan() throws RecognitionException {
        CommonTree name=null;
        CommonTree fp=null;

        try {
            // flipsAssembly.g:126:2: ( ^( DEFINE name= Identifier ^( FLIGHTPLAN fp= StringLiteral ) ) )
            // flipsAssembly.g:126:4: ^( DEFINE name= Identifier ^( FLIGHTPLAN fp= StringLiteral ) )
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
    // flipsAssembly.g:130:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int cmd = 0;

        int par = 0;


        try {
            // flipsAssembly.g:131:2: ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsAssembly.g:131:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) )
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
                    // flipsAssembly.g:133:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) )
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
    // flipsAssembly.g:137:1: defineSensor : ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) ;
    public final void defineSensor() throws RecognitionException {
        CommonTree name=null;
        int sen = 0;


        try {
            // flipsAssembly.g:138:2: ( ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) )
            // flipsAssembly.g:138:4: ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) )
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
    // flipsAssembly.g:142:1: defineWaypoint : ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) );
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:143:2: ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // flipsAssembly.g:143:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) )
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
                    // flipsAssembly.g:145:4: ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) )
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


    // $ANTLR start "statement"
    // flipsAssembly.g:151:1: statement : ( command | repeat );
    public final void statement() throws RecognitionException {
        try {
            // flipsAssembly.g:152:2: ( command | repeat )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=FLY && LA7_0<=EXECUTE)) ) {
                alt7=1;
            }
            else if ( (LA7_0==REPEAT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // flipsAssembly.g:152:4: command
                    {
                    pushFollow(FOLLOW_command_in_statement315);
                    command();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:153:4: repeat
                    {
                    pushFollow(FOLLOW_repeat_in_statement320);
                    repeat();

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
    // $ANTLR end "statement"


    // $ANTLR start "repeat"
    // flipsAssembly.g:157:1: repeat : ^( REPEAT ^( CONDITION repeatCondition ) ^( EXECUTE ( statement )* ) ) ;
    public final void repeat() throws RecognitionException {
        try {
            // flipsAssembly.g:158:2: ( ^( REPEAT ^( CONDITION repeatCondition ) ^( EXECUTE ( statement )* ) ) )
            // flipsAssembly.g:158:4: ^( REPEAT ^( CONDITION repeatCondition ) ^( EXECUTE ( statement )* ) )
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeat333); 

            match(input, Token.DOWN, null); 
            match(input,CONDITION,FOLLOW_CONDITION_in_repeat336); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_repeatCondition_in_repeat338);
            repeatCondition();

            state._fsp--;


            match(input, Token.UP, null); 
            match(input,EXECUTE,FOLLOW_EXECUTE_in_repeat342); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:158:52: ( statement )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=FLY && LA8_0<=EXECUTE)||LA8_0==REPEAT) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // flipsAssembly.g:158:52: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_repeat344);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 
            emit("RPT END", "End Repeat");

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


    // $ANTLR start "repeatCondition"
    // flipsAssembly.g:162:1: repeatCondition : (x= integerValue | ^( TIME RELATIVE x= timeValue ) | FOREVER );
    public final void repeatCondition() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:163:2: (x= integerValue | ^( TIME RELATIVE x= timeValue ) | FOREVER )
            int alt9=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                alt9=1;
                }
                break;
            case TIME:
                {
                alt9=2;
                }
                break;
            case FOREVER:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // flipsAssembly.g:163:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_repeatCondition364);
                    x=integerValue();

                    state._fsp--;

                    emit("RPT NUM " + x, "Repeat " + x + " Times");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:165:4: ^( TIME RELATIVE x= timeValue )
                    {
                    match(input,TIME,FOLLOW_TIME_in_repeatCondition374); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_repeatCondition376); 
                    pushFollow(FOLLOW_timeValue_in_repeatCondition380);
                    x=timeValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("RPT TIM " + x, "Repeat For " + x + " s (" + toHHMMSS(x) + ") Duration");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:167:4: FOREVER
                    {
                    match(input,FOREVER,FOLLOW_FOREVER_in_repeatCondition390); 
                    emit("RPT FRV", "Repeat Forever");

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
    // $ANTLR end "repeatCondition"


    // $ANTLR start "command"
    // flipsAssembly.g:173:1: command : ( flyCommand | loiterCommand | executeCommand );
    public final void command() throws RecognitionException {
        try {
            // flipsAssembly.g:174:2: ( flyCommand | loiterCommand | executeCommand )
            int alt10=3;
            switch ( input.LA(1) ) {
            case FLY:
                {
                alt10=1;
                }
                break;
            case LOITER:
                {
                alt10=2;
                }
                break;
            case EXECUTE:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // flipsAssembly.g:174:4: flyCommand
                    {
                    pushFollow(FOLLOW_flyCommand_in_command407);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:175:4: loiterCommand
                    {
                    pushFollow(FOLLOW_loiterCommand_in_command412);
                    loiterCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:176:4: executeCommand
                    {
                    pushFollow(FOLLOW_executeCommand_in_command417);
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
    // flipsAssembly.g:181:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try {
            // flipsAssembly.g:182:2: ( ^( FLY ( flyCommandValue )* ) )
            // flipsAssembly.g:182:4: ^( FLY ( flyCommandValue )* )
            {
            match(input,FLY,FOLLOW_FLY_in_flyCommand431); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:182:10: ( flyCommandValue )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==DIRECTION||(LA11_0>=PITCH && LA11_0<=ROLL)||LA11_0==SPEED||LA11_0==THROTTLE||LA11_0==TIME||(LA11_0>=WAYPOINT && LA11_0<=GEOCOORDINATE)||LA11_0==DISTANCE) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // flipsAssembly.g:182:10: flyCommandValue
                	    {
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand433);
                	    flyCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop11;
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
    // flipsAssembly.g:186:1: flyCommandValue : ( time | direction | speed | throttle | distance | pitch | roll | duration | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try {
            // flipsAssembly.g:187:2: ( time | direction | speed | throttle | distance | pitch | roll | duration | waypoint | altitude )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // flipsAssembly.g:187:4: time
                    {
                    pushFollow(FOLLOW_time_in_flyCommandValue450);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:188:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_flyCommandValue455);
                    direction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:189:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_flyCommandValue460);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:190:4: throttle
                    {
                    pushFollow(FOLLOW_throttle_in_flyCommandValue465);
                    throttle();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsAssembly.g:191:4: distance
                    {
                    pushFollow(FOLLOW_distance_in_flyCommandValue470);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsAssembly.g:192:4: pitch
                    {
                    pushFollow(FOLLOW_pitch_in_flyCommandValue475);
                    pitch();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsAssembly.g:193:4: roll
                    {
                    pushFollow(FOLLOW_roll_in_flyCommandValue480);
                    roll();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsAssembly.g:194:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_flyCommandValue485);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // flipsAssembly.g:195:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue490);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // flipsAssembly.g:196:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_flyCommandValue495);
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
    // flipsAssembly.g:199:1: loiterCommand : ^( LOITER ( loiterCommandValue )* ) ;
    public final void loiterCommand() throws RecognitionException {
        try {
            // flipsAssembly.g:200:2: ( ^( LOITER ( loiterCommandValue )* ) )
            // flipsAssembly.g:200:4: ^( LOITER ( loiterCommandValue )* )
            {
            match(input,LOITER,FOLLOW_LOITER_in_loiterCommand507); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // flipsAssembly.g:200:13: ( loiterCommandValue )*
                loop13:
                do {
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==TURN||LA13_0==SPEED||LA13_0==THROTTLE||LA13_0==TIME||(LA13_0>=RADIUS && LA13_0<=GEOCOORDINATE)||LA13_0==DISTANCE) ) {
                        alt13=1;
                    }


                    switch (alt13) {
                	case 1 :
                	    // flipsAssembly.g:200:13: loiterCommandValue
                	    {
                	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand509);
                	    loiterCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop13;
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
    // flipsAssembly.g:204:1: loiterCommandValue : ( time | speed | throttle | turnDirection | radius | duration | waypoint | altitude );
    public final void loiterCommandValue() throws RecognitionException {
        try {
            // flipsAssembly.g:205:2: ( time | speed | throttle | turnDirection | radius | duration | waypoint | altitude )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // flipsAssembly.g:205:4: time
                    {
                    pushFollow(FOLLOW_time_in_loiterCommandValue526);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:206:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_loiterCommandValue531);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // flipsAssembly.g:207:4: throttle
                    {
                    pushFollow(FOLLOW_throttle_in_loiterCommandValue536);
                    throttle();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // flipsAssembly.g:208:4: turnDirection
                    {
                    pushFollow(FOLLOW_turnDirection_in_loiterCommandValue541);
                    turnDirection();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // flipsAssembly.g:209:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_loiterCommandValue546);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // flipsAssembly.g:210:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_loiterCommandValue551);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // flipsAssembly.g:211:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue556);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // flipsAssembly.g:212:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_loiterCommandValue561);
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
    // flipsAssembly.g:215:1: executeCommand : ^( EXECUTE x= Identifier ( executeCommandParameter )* ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:216:2: ( ^( EXECUTE x= Identifier ( executeCommandParameter )* ) )
            // flipsAssembly.g:216:4: ^( EXECUTE x= Identifier ( executeCommandParameter )* )
            {
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand573); 

            match(input, Token.DOWN, null); 
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand577); 
            // flipsAssembly.g:216:27: ( executeCommandParameter )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PARAMETER) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // flipsAssembly.g:216:27: executeCommandParameter
            	    {
            	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand579);
            	    executeCommandParameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // flipsAssembly.g:234:1: executeCommandParameter : ( ^( PARAMETER x= numericValue ) | ^( PARAMETER y= StringLiteral ) );
    public final void executeCommandParameter() throws RecognitionException {
        CommonTree y=null;
        double x = 0.0;


        try {
            // flipsAssembly.g:235:2: ( ^( PARAMETER x= numericValue ) | ^( PARAMETER y= StringLiteral ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==PARAMETER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOWN) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==StringLiteral) ) {
                        alt16=2;
                    }
                    else if ( ((LA16_2>=FloatingPointLiteral && LA16_2<=HexLiteral)) ) {
                        alt16=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // flipsAssembly.g:235:4: ^( PARAMETER x= numericValue )
                    {
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter603); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_numericValue_in_executeCommandParameter607);
                    x=numericValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("CMD PAR " + x, x + " Command Parameter");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:237:4: ^( PARAMETER y= StringLiteral )
                    {
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter618); 

                    match(input, Token.DOWN, null); 
                    y=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_executeCommandParameter622); 

                    match(input, Token.UP, null); 
                    emit("CMD PAR " + y, "\"" + y + "\"" + " Command Parameter");

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
    // flipsAssembly.g:243:1: pitch : ( ^( PITCH FIXED x= angularValue ) | ^( PITCH RELATIVE x= angularValue ) | ^( PITCH FIXED y= angularRateValue ) | ^( PITCH RELATIVE y= angularRateValue ) | ^( PITCH FIXED x= angularValue y= angularRateValue ) | ^( PITCH RELATIVE x= angularValue y= angularRateValue ) );
    public final void pitch() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:244:2: ( ^( PITCH FIXED x= angularValue ) | ^( PITCH RELATIVE x= angularValue ) | ^( PITCH FIXED y= angularRateValue ) | ^( PITCH RELATIVE y= angularRateValue ) | ^( PITCH FIXED x= angularValue y= angularRateValue ) | ^( PITCH RELATIVE x= angularValue y= angularRateValue ) )
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // flipsAssembly.g:244:4: ^( PITCH FIXED x= angularValue )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch641); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_pitch643); 
                    pushFollow(FOLLOW_angularValue_in_pitch647);
                    x=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PIT FIX " + x, x + " deg Pitch");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:246:4: ^( PITCH RELATIVE x= angularValue )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch658); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_pitch660); 
                    pushFollow(FOLLOW_angularValue_in_pitch664);
                    x=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PIT REL " + x, x + " deg Relative Pitch");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:248:4: ^( PITCH FIXED y= angularRateValue )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch675); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_pitch677); 
                    pushFollow(FOLLOW_angularRateValue_in_pitch681);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL PIT FIX " + y, y + " deg/s Pitch");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:250:4: ^( PITCH RELATIVE y= angularRateValue )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch692); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_pitch694); 
                    pushFollow(FOLLOW_angularRateValue_in_pitch698);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL PIT REL " + y, y + " deg/s Relative Pitch");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:252:4: ^( PITCH FIXED x= angularValue y= angularRateValue )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch709); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_pitch711); 
                    pushFollow(FOLLOW_angularValue_in_pitch715);
                    x=angularValue();

                    state._fsp--;

                    pushFollow(FOLLOW_angularRateValue_in_pitch719);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL PIT FIX " + y, y + " deg/s Pitch");
                    emit("POS PIT FIX " + x, x + " deg Pitch");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:255:4: ^( PITCH RELATIVE x= angularValue y= angularRateValue )
                    {
                    match(input,PITCH,FOLLOW_PITCH_in_pitch734); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_pitch736); 
                    pushFollow(FOLLOW_angularValue_in_pitch740);
                    x=angularValue();

                    state._fsp--;

                    pushFollow(FOLLOW_angularRateValue_in_pitch744);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL PIT FIX " + y, y + " deg/s Pitch");
                    emit("POS PIT REL " + x, x + " deg Relative Pitch");

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
    // flipsAssembly.g:260:1: roll : ( ^( ROLL FIXED x= angularValue ) | ^( ROLL RELATIVE x= angularValue ) | ^( ROLL FIXED y= angularRateValue ) | ^( ROLL RELATIVE y= angularRateValue ) | ^( ROLL FIXED x= angularValue y= angularRateValue ) | ^( ROLL RELATIVE x= angularValue y= angularRateValue ) );
    public final void roll() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:261:2: ( ^( ROLL FIXED x= angularValue ) | ^( ROLL RELATIVE x= angularValue ) | ^( ROLL FIXED y= angularRateValue ) | ^( ROLL RELATIVE y= angularRateValue ) | ^( ROLL FIXED x= angularValue y= angularRateValue ) | ^( ROLL RELATIVE x= angularValue y= angularRateValue ) )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // flipsAssembly.g:261:4: ^( ROLL FIXED x= angularValue )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll765); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_roll767); 
                    pushFollow(FOLLOW_angularValue_in_roll771);
                    x=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS ROL FIX " + x, x + " deg Roll");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:263:4: ^( ROLL RELATIVE x= angularValue )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll782); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_roll784); 
                    pushFollow(FOLLOW_angularValue_in_roll788);
                    x=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS ROL REL " + x, x + " deg Relative Roll");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:265:4: ^( ROLL FIXED y= angularRateValue )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll799); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_roll801); 
                    pushFollow(FOLLOW_angularRateValue_in_roll805);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL ROL FIX " + y, y + " deg/s Roll");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:267:4: ^( ROLL RELATIVE y= angularRateValue )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll816); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_roll818); 
                    pushFollow(FOLLOW_angularRateValue_in_roll822);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL ROL REL " + y, y + " deg/s Relative Roll");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:269:4: ^( ROLL FIXED x= angularValue y= angularRateValue )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll833); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_roll835); 
                    pushFollow(FOLLOW_angularValue_in_roll839);
                    x=angularValue();

                    state._fsp--;

                    pushFollow(FOLLOW_angularRateValue_in_roll843);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL ROL FIX " + y, y + " deg/s Roll");
                    emit("POS ROL FIX " + x, x + " deg Roll");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:272:4: ^( ROLL RELATIVE x= angularValue y= angularRateValue )
                    {
                    match(input,ROLL,FOLLOW_ROLL_in_roll858); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_roll860); 
                    pushFollow(FOLLOW_angularValue_in_roll864);
                    x=angularValue();

                    state._fsp--;

                    pushFollow(FOLLOW_angularRateValue_in_roll868);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL ROL FIX " + y, y + " deg/s Roll");
                    emit("POS ROL REL " + x, x + " deg Relative Roll");

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


    // $ANTLR start "yaw"
    // flipsAssembly.g:277:1: yaw : ( ^( YAW FIXED x= angularValue ) | ^( YAW RELATIVE x= angularValue ) | ^( YAW FIXED y= angularRateValue ) | ^( YAW RELATIVE y= angularRateValue ) | ^( YAW FIXED x= angularValue y= angularRateValue ) | ^( YAW RELATIVE x= angularValue y= angularRateValue ) );
    public final void yaw() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:278:2: ( ^( YAW FIXED x= angularValue ) | ^( YAW RELATIVE x= angularValue ) | ^( YAW FIXED y= angularRateValue ) | ^( YAW RELATIVE y= angularRateValue ) | ^( YAW FIXED x= angularValue y= angularRateValue ) | ^( YAW RELATIVE x= angularValue y= angularRateValue ) )
            int alt19=6;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // flipsAssembly.g:278:4: ^( YAW FIXED x= angularValue )
                    {
                    match(input,YAW,FOLLOW_YAW_in_yaw889); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_yaw891); 
                    pushFollow(FOLLOW_angularValue_in_yaw895);
                    x=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Yaw");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:280:4: ^( YAW RELATIVE x= angularValue )
                    {
                    match(input,YAW,FOLLOW_YAW_in_yaw906); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_yaw908); 
                    pushFollow(FOLLOW_angularValue_in_yaw912);
                    x=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + x, x + " deg Relative Yaw");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:282:4: ^( YAW FIXED y= angularRateValue )
                    {
                    match(input,YAW,FOLLOW_YAW_in_yaw923); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_yaw925); 
                    pushFollow(FOLLOW_angularRateValue_in_yaw929);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL YAW FIX " + y, y + " deg/s Yaw");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:284:4: ^( YAW RELATIVE y= angularRateValue )
                    {
                    match(input,YAW,FOLLOW_YAW_in_yaw940); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_yaw942); 
                    pushFollow(FOLLOW_angularRateValue_in_yaw946);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL YAW REL " + y, y + " deg/s Relative Yaw");

                    }
                    break;
                case 5 :
                    // flipsAssembly.g:286:4: ^( YAW FIXED x= angularValue y= angularRateValue )
                    {
                    match(input,YAW,FOLLOW_YAW_in_yaw957); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_yaw959); 
                    pushFollow(FOLLOW_angularValue_in_yaw963);
                    x=angularValue();

                    state._fsp--;

                    pushFollow(FOLLOW_angularRateValue_in_yaw967);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL YAW FIX " + y, y + " deg/s Yaw");
                    emit("POS YAW FIX " + x, x + " deg Yaw");

                    }
                    break;
                case 6 :
                    // flipsAssembly.g:289:4: ^( YAW RELATIVE x= angularValue y= angularRateValue )
                    {
                    match(input,YAW,FOLLOW_YAW_in_yaw982); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_yaw984); 
                    pushFollow(FOLLOW_angularValue_in_yaw988);
                    x=angularValue();

                    state._fsp--;

                    pushFollow(FOLLOW_angularRateValue_in_yaw992);
                    y=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("VEL YAW FIX " + y, y + " deg/s Yaw");
                    emit("POS YAW REL " + x, x + " deg Relative Yaw");

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
    // $ANTLR end "yaw"


    // $ANTLR start "altitude"
    // flipsAssembly.g:296:1: altitude : ( ^( DISTANCE FIXED Z x= distanceValue ) | ^( DISTANCE RELATIVE Z x= distanceValue ) | ^( DISTANCE FIXED Z y= pressureValue ) | ^( DISTANCE RELATIVE Z y= pressureValue ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:297:2: ( ^( DISTANCE FIXED Z x= distanceValue ) | ^( DISTANCE RELATIVE Z x= distanceValue ) | ^( DISTANCE FIXED Z y= pressureValue ) | ^( DISTANCE RELATIVE Z y= pressureValue ) )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // flipsAssembly.g:297:4: ^( DISTANCE FIXED Z x= distanceValue )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude1015); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude1017); 
                    match(input,Z,FOLLOW_Z_in_altitude1019); 
                    pushFollow(FOLLOW_distanceValue_in_altitude1023);
                    x=distanceValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + x, toFT(-x) + "Altitude");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:299:4: ^( DISTANCE RELATIVE Z x= distanceValue )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude1034); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude1036); 
                    match(input,Z,FOLLOW_Z_in_altitude1038); 
                    pushFollow(FOLLOW_distanceValue_in_altitude1042);
                    x=distanceValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, toFT(-x) + "Relative Altitude");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:301:4: ^( DISTANCE FIXED Z y= pressureValue )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude1053); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude1055); 
                    match(input,Z,FOLLOW_Z_in_altitude1057); 
                    pushFollow(FOLLOW_pressureValue_in_altitude1061);
                    y=pressureValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:303:4: ^( DISTANCE RELATIVE Z y= pressureValue )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude1072); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude1074); 
                    match(input,Z,FOLLOW_Z_in_altitude1076); 
                    pushFollow(FOLLOW_pressureValue_in_altitude1080);
                    y=pressureValue();

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
    // flipsAssembly.g:309:1: distance : ( ^( DISTANCE RELATIVE X x= distanceValue ) | ^( DISTANCE RELATIVE Y x= distanceValue ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:310:2: ( ^( DISTANCE RELATIVE X x= distanceValue ) | ^( DISTANCE RELATIVE Y x= distanceValue ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DISTANCE) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==DOWN) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==RELATIVE) ) {
                        int LA21_3 = input.LA(4);

                        if ( (LA21_3==X) ) {
                            alt21=1;
                        }
                        else if ( (LA21_3==Y) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // flipsAssembly.g:310:4: ^( DISTANCE RELATIVE X x= distanceValue )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance1099); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_distance1101); 
                    match(input,X,FOLLOW_X_in_distance1103); 
                    pushFollow(FOLLOW_distanceValue_in_distance1107);
                    x=distanceValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, toFT(x) + "Relative X Distance");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:312:4: ^( DISTANCE RELATIVE Y x= distanceValue )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance1118); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_distance1120); 
                    match(input,Y,FOLLOW_Y_in_distance1122); 
                    pushFollow(FOLLOW_distanceValue_in_distance1126);
                    x=distanceValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + x, toFT(x) + "Relative Y Distance");

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
    // flipsAssembly.g:316:1: radius : ^( RADIUS x= distanceValue ) ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:317:2: ( ^( RADIUS x= distanceValue ) )
            // flipsAssembly.g:317:4: ^( RADIUS x= distanceValue )
            {
            match(input,RADIUS,FOLLOW_RADIUS_in_radius1143); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_distanceValue_in_radius1147);
            x=distanceValue();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("RAD " + x, toFT(x) + "Radius");

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
    // flipsAssembly.g:323:1: speed : ( ^( SPEED FIXED x= speedValue ) | ^( SPEED RELATIVE x= speedValue ) | ^( SPEED RELATIVE x= percentValue ) );
    public final void speed() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:324:2: ( ^( SPEED FIXED x= speedValue ) | ^( SPEED RELATIVE x= speedValue ) | ^( SPEED RELATIVE x= percentValue ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SPEED) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==FIXED) ) {
                        alt22=1;
                    }
                    else if ( (LA22_2==RELATIVE) ) {
                        int LA22_4 = input.LA(4);

                        if ( ((LA22_4>=FloatingPointLiteral && LA22_4<=HexLiteral)) ) {
                            alt22=3;
                        }
                        else if ( (LA22_4==SPEED) ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // flipsAssembly.g:324:4: ^( SPEED FIXED x= speedValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed1166); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_speed1168); 
                    pushFollow(FOLLOW_speedValue_in_speed1172);
                    x=speedValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR FIX " + x, toMPH(x) + "Air Speed");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:326:4: ^( SPEED RELATIVE x= speedValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed1183); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed1185); 
                    pushFollow(FOLLOW_speedValue_in_speed1189);
                    x=speedValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + x, toMPH(x) + "Relative Air Speed");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:328:4: ^( SPEED RELATIVE x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed1200); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed1202); 
                    pushFollow(FOLLOW_percentValue_in_speed1206);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

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


    // $ANTLR start "throttle"
    // flipsAssembly.g:331:1: throttle : ( ^( THROTTLE FIXED ^( SPEED x= percentValue ) ) | ^( THROTTLE FIXED x= angularRateValue ) | ^( THROTTLE RELATIVE ^( SPEED x= percentValue ) ) | ^( THROTTLE RELATIVE x= angularRateValue ) );
    public final void throttle() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:332:2: ( ^( THROTTLE FIXED ^( SPEED x= percentValue ) ) | ^( THROTTLE FIXED x= angularRateValue ) | ^( THROTTLE RELATIVE ^( SPEED x= percentValue ) ) | ^( THROTTLE RELATIVE x= angularRateValue ) )
            int alt23=4;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // flipsAssembly.g:332:4: ^( THROTTLE FIXED ^( SPEED x= percentValue ) )
                    {
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_throttle1219); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_throttle1221); 
                    match(input,SPEED,FOLLOW_SPEED_in_throttle1224); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_percentValue_in_throttle1228);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    emit("ACT THR FIX PCT " + x, x + "% Throttle");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:334:4: ^( THROTTLE FIXED x= angularRateValue )
                    {
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_throttle1240); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_throttle1242); 
                    pushFollow(FOLLOW_angularRateValue_in_throttle1246);
                    x=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("ACT THR FIX RPM " + (x / 6d), (x / 6d) + " RPM (" + x + " deg/s) Throttle");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:336:4: ^( THROTTLE RELATIVE ^( SPEED x= percentValue ) )
                    {
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_throttle1257); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_throttle1259); 
                    match(input,SPEED,FOLLOW_SPEED_in_throttle1262); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_percentValue_in_throttle1266);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    emit("ACT THR REL PCT " + x, x + "% Throttle");

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:338:4: ^( THROTTLE RELATIVE x= angularRateValue )
                    {
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_throttle1278); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_throttle1280); 
                    pushFollow(FOLLOW_angularRateValue_in_throttle1284);
                    x=angularRateValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("ACT THR REL RPM " + (x / 6d), (x / 6d) + " RPM (" + x + " deg/s) Throttle");

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
    // $ANTLR end "throttle"


    // $ANTLR start "time"
    // flipsAssembly.g:344:1: time : ^( TIME FIXED x= timeValue ) ;
    public final void time() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:345:2: ( ^( TIME FIXED x= timeValue ) )
            // flipsAssembly.g:345:4: ^( TIME FIXED x= timeValue )
            {
            match(input,TIME,FOLLOW_TIME_in_time1303); 

            match(input, Token.DOWN, null); 
            match(input,FIXED,FOLLOW_FIXED_in_time1305); 
            pushFollow(FOLLOW_timeValue_in_time1309);
            x=timeValue();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("TIM FIX " + x, x + " s (" + toHHMMSS(x) + ") Time");

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
    // flipsAssembly.g:349:1: duration : ^( TIME RELATIVE x= timeValue ) ;
    public final void duration() throws RecognitionException {
        double x = 0.0;


        try {
            // flipsAssembly.g:350:2: ( ^( TIME RELATIVE x= timeValue ) )
            // flipsAssembly.g:350:4: ^( TIME RELATIVE x= timeValue )
            {
            match(input,TIME,FOLLOW_TIME_in_duration1326); 

            match(input, Token.DOWN, null); 
            match(input,RELATIVE,FOLLOW_RELATIVE_in_duration1328); 
            pushFollow(FOLLOW_timeValue_in_duration1332);
            x=timeValue();

            state._fsp--;


            match(input, Token.UP, null); 
            emit("TIM REL " + x, x + " s (" + toHHMMSS(x) + ") Duration");

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
    // flipsAssembly.g:356:1: direction : ( ^( DIRECTION FIXED y= angularValue ) | ^( DIRECTION FIXED turnDirection y= angularValue ) | ^( DIRECTION RELATIVE y= angularValue ) );
    public final void direction() throws RecognitionException {
        double y = 0.0;


        try {
            // flipsAssembly.g:357:2: ( ^( DIRECTION FIXED y= angularValue ) | ^( DIRECTION FIXED turnDirection y= angularValue ) | ^( DIRECTION RELATIVE y= angularValue ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==DIRECTION) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==FIXED) ) {
                        int LA24_3 = input.LA(4);

                        if ( (LA24_3==TURN) ) {
                            alt24=2;
                        }
                        else if ( (LA24_3==ANGLE) ) {
                            alt24=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA24_2==RELATIVE) ) {
                        alt24=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // flipsAssembly.g:357:4: ^( DIRECTION FIXED y= angularValue )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1351); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1353); 
                    pushFollow(FOLLOW_angularValue_in_direction1357);
                    y=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:359:4: ^( DIRECTION FIXED turnDirection y= angularValue )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1368); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction1370); 
                    pushFollow(FOLLOW_turnDirection_in_direction1372);
                    turnDirection();

                    state._fsp--;

                    pushFollow(FOLLOW_angularValue_in_direction1376);
                    y=angularValue();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:361:4: ^( DIRECTION RELATIVE y= angularValue )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1387); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1389); 
                    pushFollow(FOLLOW_angularValue_in_direction1393);
                    y=angularValue();

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
    // flipsAssembly.g:365:1: turnDirection : ( ^( TURN LEFT ) | ^( TURN RIGHT ) );
    public final void turnDirection() throws RecognitionException {
        try {
            // flipsAssembly.g:366:2: ( ^( TURN LEFT ) | ^( TURN RIGHT ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==TURN) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==LEFT) ) {
                        alt25=1;
                    }
                    else if ( (LA25_2==RIGHT) ) {
                        alt25=2;
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
                    // flipsAssembly.g:366:4: ^( TURN LEFT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1410); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_turnDirection1412); 

                    match(input, Token.UP, null); 
                    emit("DIR L", "Left Turn Direction");

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:368:4: ^( TURN RIGHT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1423); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_turnDirection1425); 

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


    // $ANTLR start "waypoint"
    // flipsAssembly.g:374:1: waypoint : ( geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;

        try {
            // flipsAssembly.g:375:2: ( geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==GEOCOORDINATE) ) {
                alt26=1;
            }
            else if ( (LA26_0==WAYPOINT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // flipsAssembly.g:375:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1443);
                    geoCoordinate();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // flipsAssembly.g:376:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint1449); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint1453); 

                    match(input, Token.UP, null); 

                    Symbol symbol = symbols.resolve(x.getText());
                    if (symbol != null && symbol instanceof LatLonWaypointSymbol) {
                      LatLonWaypointSymbol waypoint = (LatLonWaypointSymbol)symbol;
                      emit("POS   X GEO " + waypoint.getLongitude(), waypoint.getName().toUpperCase() + " / " + Math.abs(waypoint.getLongitude()) + " " + waypoint.getEastWest() + " Longitude");
                      emit("POS   Y GEO " + waypoint.getLatitude(), waypoint.getName().toUpperCase() + " / " + Math.abs(waypoint.getLatitude()) + " " + waypoint.getNorthSouth() + " Latitude");
                    }
                    else if (symbol != null && symbol instanceof DistanceWaypointSymbol) {
                      DistanceWaypointSymbol waypoint = (DistanceWaypointSymbol)symbol;
                      emit("POS   X FIX " + waypoint.getX(), waypoint.getName().toUpperCase() + " / " + toFT(Math.abs(waypoint.getX())) + waypoint.getEastWest() + " Distance");
                      emit("POS   Y FIX " + waypoint.getY(), waypoint.getName().toUpperCase() + " / " + toFT(Math.abs(waypoint.getY())) + waypoint.getNorthSouth() + " Distance");
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
    // flipsAssembly.g:396:1: geoCoordinate : ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) );
    public final void geoCoordinate() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return geo = null;

        flipsAssembly.distanceCoordinate_return dst = null;


        try {
            // flipsAssembly.g:397:2: ( ^( GEOCOORDINATE geo= latitudeLongitude ) | ^( GEOCOORDINATE dst= distanceCoordinate ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==GEOCOORDINATE) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==DOWN) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==X) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==DOWN) ) {
                            int LA27_4 = input.LA(5);

                            if ( (LA27_4==ANGLE) ) {
                                alt27=1;
                            }
                            else if ( (LA27_4==DISTANCE) ) {
                                alt27=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 4, input);

                                throw nvae;
                            }
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
                    // flipsAssembly.g:397:4: ^( GEOCOORDINATE geo= latitudeLongitude )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1469); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate1473);
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
                    // flipsAssembly.g:402:4: ^( GEOCOORDINATE dst= distanceCoordinate )
                    {
                    match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1496); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate1500);
                    dst=distanceCoordinate();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    String ns = dst.north >= 0 ? "N" : "S";
                    String ew = dst.east >= 0 ? "E" : "W";
                    emit("POS   X FIX " + dst.east, toFT(Math.abs(dst.east)) + ew + " Distance");
                    emit("POS   Y FIX " + dst.north, toFT(Math.abs(dst.north)) + ns + " Distance");

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
    // flipsAssembly.g:409:1: latitudeLongitude returns [double latitude, double longitude] : ^( X x= angularValue ) ^( Y y= angularValue ) ;
    public final flipsAssembly.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsAssembly.latitudeLongitude_return retval = new flipsAssembly.latitudeLongitude_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:410:2: ( ^( X x= angularValue ) ^( Y y= angularValue ) )
            // flipsAssembly.g:410:4: ^( X x= angularValue ) ^( Y y= angularValue )
            {
            match(input,X,FOLLOW_X_in_latitudeLongitude1533); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_angularValue_in_latitudeLongitude1537);
            x=angularValue();

            state._fsp--;


            match(input, Token.UP, null); 
            match(input,Y,FOLLOW_Y_in_latitudeLongitude1541); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_angularValue_in_latitudeLongitude1545);
            y=angularValue();

            state._fsp--;


            match(input, Token.UP, null); 
            retval.latitude = y;
            retval.longitude = x;

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

    public static class distanceCoordinate_return extends TreeRuleReturnScope {
        public double north;
        public double east;
    };

    // $ANTLR start "distanceCoordinate"
    // flipsAssembly.g:415:1: distanceCoordinate returns [double north, double east] : ^( X x= distanceValue ) ^( Y y= distanceValue ) ;
    public final flipsAssembly.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsAssembly.distanceCoordinate_return retval = new flipsAssembly.distanceCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // flipsAssembly.g:416:2: ( ^( X x= distanceValue ) ^( Y y= distanceValue ) )
            // flipsAssembly.g:416:4: ^( X x= distanceValue ) ^( Y y= distanceValue )
            {
            match(input,X,FOLLOW_X_in_distanceCoordinate1570); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1574);
            x=distanceValue();

            state._fsp--;


            match(input, Token.UP, null); 
            match(input,Y,FOLLOW_Y_in_distanceCoordinate1578); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1582);
            y=distanceValue();

            state._fsp--;


            match(input, Token.UP, null); 
            retval.north = y;
            retval.east = x;

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


    // $ANTLR start "angularValue"
    // flipsAssembly.g:421:1: angularValue returns [double r] : ^( ANGLE x= numericValue DEGREE ) ;
    public final double angularValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:422:2: ( ^( ANGLE x= numericValue DEGREE ) )
            // flipsAssembly.g:422:4: ^( ANGLE x= numericValue DEGREE )
            {
            match(input,ANGLE,FOLLOW_ANGLE_in_angularValue1607); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_angularValue1611);
            x=numericValue();

            state._fsp--;

            match(input,DEGREE,FOLLOW_DEGREE_in_angularValue1613); 

            match(input, Token.UP, null); 
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
    // $ANTLR end "angularValue"


    // $ANTLR start "angularRateValue"
    // flipsAssembly.g:426:1: angularRateValue returns [double r] : ^( SPEED x= numericValue DEGREE SECOND ) ;
    public final double angularRateValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:427:2: ( ^( SPEED x= numericValue DEGREE SECOND ) )
            // flipsAssembly.g:427:4: ^( SPEED x= numericValue DEGREE SECOND )
            {
            match(input,SPEED,FOLLOW_SPEED_in_angularRateValue1634); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_angularRateValue1638);
            x=numericValue();

            state._fsp--;

            match(input,DEGREE,FOLLOW_DEGREE_in_angularRateValue1640); 
            match(input,SECOND,FOLLOW_SECOND_in_angularRateValue1642); 

            match(input, Token.UP, null); 
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
    // $ANTLR end "angularRateValue"


    // $ANTLR start "distanceValue"
    // flipsAssembly.g:431:1: distanceValue returns [double r] : ^( DISTANCE x= numericValue METER ) ;
    public final double distanceValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:432:2: ( ^( DISTANCE x= numericValue METER ) )
            // flipsAssembly.g:432:4: ^( DISTANCE x= numericValue METER )
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_distanceValue1663); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_distanceValue1667);
            x=numericValue();

            state._fsp--;

            match(input,METER,FOLLOW_METER_in_distanceValue1669); 

            match(input, Token.UP, null); 
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
    // $ANTLR end "distanceValue"


    // $ANTLR start "pressureValue"
    // flipsAssembly.g:436:1: pressureValue returns [double r] : ^( PRESSURE x= numericValue PASCAL ) ;
    public final double pressureValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:437:2: ( ^( PRESSURE x= numericValue PASCAL ) )
            // flipsAssembly.g:437:4: ^( PRESSURE x= numericValue PASCAL )
            {
            match(input,PRESSURE,FOLLOW_PRESSURE_in_pressureValue1690); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_pressureValue1694);
            x=numericValue();

            state._fsp--;

            match(input,PASCAL,FOLLOW_PASCAL_in_pressureValue1696); 

            match(input, Token.UP, null); 
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
    // $ANTLR end "pressureValue"


    // $ANTLR start "speedValue"
    // flipsAssembly.g:441:1: speedValue returns [double r] : ^( SPEED x= numericValue METER SECOND ) ;
    public final double speedValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:442:2: ( ^( SPEED x= numericValue METER SECOND ) )
            // flipsAssembly.g:442:4: ^( SPEED x= numericValue METER SECOND )
            {
            match(input,SPEED,FOLLOW_SPEED_in_speedValue1717); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_speedValue1721);
            x=numericValue();

            state._fsp--;

            match(input,METER,FOLLOW_METER_in_speedValue1723); 
            match(input,SECOND,FOLLOW_SECOND_in_speedValue1725); 

            match(input, Token.UP, null); 
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
    // $ANTLR end "speedValue"


    // $ANTLR start "timeValue"
    // flipsAssembly.g:446:1: timeValue returns [double r] : ^( TIME x= numericValue SECOND ) ;
    public final double timeValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:447:2: ( ^( TIME x= numericValue SECOND ) )
            // flipsAssembly.g:447:4: ^( TIME x= numericValue SECOND )
            {
            match(input,TIME,FOLLOW_TIME_in_timeValue1746); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numericValue_in_timeValue1750);
            x=numericValue();

            state._fsp--;

            match(input,SECOND,FOLLOW_SECOND_in_timeValue1752); 

            match(input, Token.UP, null); 
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
    // $ANTLR end "timeValue"


    // $ANTLR start "numericValue"
    // flipsAssembly.g:452:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // flipsAssembly.g:453:2: (x= integerValue | y= FloatingPointLiteral )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=BinaryLiteral && LA28_0<=HexLiteral)) ) {
                alt28=1;
            }
            else if ( (LA28_0==FloatingPointLiteral) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // flipsAssembly.g:453:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1775);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:455:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1786); 
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
    // flipsAssembly.g:459:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // flipsAssembly.g:460:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt29=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt29=1;
                }
                break;
            case OctalLiteral:
                {
                alt29=2;
                }
                break;
            case DecimalLiteral:
                {
                alt29=3;
                }
                break;
            case HexLiteral:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // flipsAssembly.g:460:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1807); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // flipsAssembly.g:462:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1818); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // flipsAssembly.g:464:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1829); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // flipsAssembly.g:466:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1840); 
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
    // flipsAssembly.g:470:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final double percentValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // flipsAssembly.g:471:2: (x= numericValue PERCENT )
            // flipsAssembly.g:471:4: x= numericValue PERCENT
            {
            pushFollow(FOLLOW_numericValue_in_percentValue1861);
            x=numericValue();

            state._fsp--;

            match(input,PERCENT,FOLLOW_PERCENT_in_percentValue1863); 
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
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\5\1\2\1\136\1\7\1\2\1\150\4\3\2\uffff";
    static final String DFA5_maxS =
        "\1\5\1\2\1\136\1\7\1\2\1\153\4\10\2\uffff";
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
            return "130:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\5\1\2\1\136\1\43\1\2\1\126\1\2\1\56\2\uffff";
    static final String DFA6_maxS =
        "\1\5\1\2\1\136\1\43\1\2\1\126\1\2\1\61\2\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\2\uffff\1\11",
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
            return "142:1: defineWaypoint : ( ^( DEFINE name= Identifier ^( GEOCOORDINATE geo= latitudeLongitude ) ) | ^( DEFINE name= Identifier ^( GEOCOORDINATE dst= distanceCoordinate ) ) );";
        }
    }
    static final String DFA12_eotS =
        "\20\uffff";
    static final String DFA12_eofS =
        "\20\uffff";
    static final String DFA12_minS =
        "\1\15\1\2\3\uffff\1\2\3\uffff\2\17\2\uffff\1\126\2\uffff";
    static final String DFA12_maxS =
        "\1\61\1\2\3\uffff\1\2\3\uffff\2\20\2\uffff\1\130\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\11\2\uffff\1\1\1\10\1\uffff"+
        "\1\12\1\5";
    static final String DFA12_specialS =
        "\20\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\3\uffff\1\6\1\7\4\uffff\1\3\2\uffff\1\4\1\uffff\1\1\5\uffff"+
            "\2\10\15\uffff\1\5",
            "\1\11",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "",
            "\1\13\1\14",
            "\1\16\1\15",
            "",
            "",
            "\2\17\1\16",
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
            return "186:1: flyCommandValue : ( time | direction | speed | throttle | distance | pitch | roll | duration | waypoint | altitude );";
        }
    }
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\16\1\2\6\uffff\1\17\2\uffff";
    static final String DFA14_maxS =
        "\1\61\1\2\6\uffff\1\20\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\uffff\1\1\1\6";
    static final String DFA14_specialS =
        "\13\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\4\10\uffff\1\2\2\uffff\1\3\1\uffff\1\1\4\uffff\1\5\2\6\15"+
            "\uffff\1\7",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\12",
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
            return "204:1: loiterCommandValue : ( time | speed | throttle | turnDirection | radius | duration | waypoint | altitude );";
        }
    }
    static final String DFA17_eotS =
        "\35\uffff";
    static final String DFA17_eofS =
        "\35\uffff";
    static final String DFA17_minS =
        "\1\21\1\2\1\17\2\27\1\uffff\2\2\1\uffff\2\147\12\57\4\3\4\uffff";
    static final String DFA17_maxS =
        "\1\21\1\2\1\20\2\56\1\uffff\2\2\1\uffff\2\153\12\57\2\3\2\27\4\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\3\2\uffff\1\4\20\uffff\1\5\1\1\1\6\1\2";
    static final String DFA17_specialS =
        "\35\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\26\uffff\1\6",
            "\1\10\26\uffff\1\7",
            "",
            "\1\11",
            "\1\12",
            "",
            "\1\17\1\13\1\14\1\15\1\16",
            "\1\24\1\20\1\21\1\22\1\23",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\32\23\uffff\1\31",
            "\1\34\23\uffff\1\33",
            "",
            "",
            "",
            ""
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
            return "243:1: pitch : ( ^( PITCH FIXED x= angularValue ) | ^( PITCH RELATIVE x= angularValue ) | ^( PITCH FIXED y= angularRateValue ) | ^( PITCH RELATIVE y= angularRateValue ) | ^( PITCH FIXED x= angularValue y= angularRateValue ) | ^( PITCH RELATIVE x= angularValue y= angularRateValue ) );";
        }
    }
    static final String DFA18_eotS =
        "\35\uffff";
    static final String DFA18_eofS =
        "\35\uffff";
    static final String DFA18_minS =
        "\1\22\1\2\1\17\2\27\1\2\2\uffff\1\2\2\147\12\57\4\3\4\uffff";
    static final String DFA18_maxS =
        "\1\22\1\2\1\20\2\56\1\2\2\uffff\1\2\2\153\12\57\2\3\2\27\4\uffff";
    static final String DFA18_acceptS =
        "\6\uffff\1\3\1\4\21\uffff\1\5\1\1\1\6\1\2";
    static final String DFA18_specialS =
        "\35\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\6\26\uffff\1\5",
            "\1\7\26\uffff\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\17\1\13\1\14\1\15\1\16",
            "\1\24\1\20\1\21\1\22\1\23",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\32\23\uffff\1\31",
            "\1\34\23\uffff\1\33",
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
            return "260:1: roll : ( ^( ROLL FIXED x= angularValue ) | ^( ROLL RELATIVE x= angularValue ) | ^( ROLL FIXED y= angularRateValue ) | ^( ROLL RELATIVE y= angularRateValue ) | ^( ROLL FIXED x= angularValue y= angularRateValue ) | ^( ROLL RELATIVE x= angularValue y= angularRateValue ) );";
        }
    }
    static final String DFA19_eotS =
        "\35\uffff";
    static final String DFA19_eofS =
        "\35\uffff";
    static final String DFA19_minS =
        "\1\23\1\2\1\17\2\27\1\2\1\uffff\1\2\1\uffff\2\147\12\57\4\3\4\uffff";
    static final String DFA19_maxS =
        "\1\23\1\2\1\20\2\56\1\2\1\uffff\1\2\1\uffff\2\153\12\57\2\3\2\27"+
        "\4\uffff";
    static final String DFA19_acceptS =
        "\6\uffff\1\3\1\uffff\1\4\20\uffff\1\1\1\5\1\2\1\6";
    static final String DFA19_specialS =
        "\35\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\6\26\uffff\1\5",
            "\1\10\26\uffff\1\7",
            "\1\11",
            "",
            "\1\12",
            "",
            "\1\17\1\13\1\14\1\15\1\16",
            "\1\24\1\20\1\21\1\22\1\23",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31\23\uffff\1\32",
            "\1\33\23\uffff\1\34",
            "",
            "",
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
            return "277:1: yaw : ( ^( YAW FIXED x= angularValue ) | ^( YAW RELATIVE x= angularValue ) | ^( YAW FIXED y= angularRateValue ) | ^( YAW RELATIVE y= angularRateValue ) | ^( YAW FIXED x= angularValue y= angularRateValue ) | ^( YAW RELATIVE x= angularValue y= angularRateValue ) );";
        }
    }
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\13\uffff";
    static final String DFA20_minS =
        "\1\61\1\2\1\17\2\130\2\61\4\uffff";
    static final String DFA20_maxS =
        "\1\61\1\2\1\20\2\130\2\77\4\uffff";
    static final String DFA20_acceptS =
        "\7\uffff\1\1\1\3\1\2\1\4";
    static final String DFA20_specialS =
        "\13\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "\1\6",
            "\1\7\15\uffff\1\10",
            "\1\11\15\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "296:1: altitude : ( ^( DISTANCE FIXED Z x= distanceValue ) | ^( DISTANCE RELATIVE Z x= distanceValue ) | ^( DISTANCE FIXED Z y= pressureValue ) | ^( DISTANCE RELATIVE Z y= pressureValue ) );";
        }
    }
    static final String DFA23_eotS =
        "\27\uffff";
    static final String DFA23_eofS =
        "\27\uffff";
    static final String DFA23_minS =
        "\1\32\1\2\1\17\2\27\2\2\2\147\12\57\4\uffff";
    static final String DFA23_maxS =
        "\1\32\1\2\1\20\2\27\2\2\2\153\12\75\4\uffff";
    static final String DFA23_acceptS =
        "\23\uffff\1\1\1\2\1\3\1\4";
    static final String DFA23_specialS =
        "\27\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\15\1\11\1\12\1\13\1\14",
            "\1\22\1\16\1\17\1\20\1\21",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "331:1: throttle : ( ^( THROTTLE FIXED ^( SPEED x= percentValue ) ) | ^( THROTTLE FIXED x= angularRateValue ) | ^( THROTTLE RELATIVE ^( SPEED x= percentValue ) ) | ^( THROTTLE RELATIVE x= angularRateValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_FLIGHTPLAN_in_flightPlan69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_require_in_flightPlan71 = new BitSet(new long[]{0x0000000000001C68L,0x0000000002000000L});
    public static final BitSet FOLLOW_define_in_flightPlan74 = new BitSet(new long[]{0x0000000000001C28L,0x0000000002000000L});
    public static final BitSet FOLLOW_statement_in_flightPlan77 = new BitSet(new long[]{0x0000000000001C08L,0x0000000002000000L});
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
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand211 = new BitSet(new long[]{0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineSensor233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineSensor237 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SENSOR_in_defineSensor240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineSensor244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint266 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_defineWaypoint273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint289 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_defineWaypoint292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_defineWaypoint296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_command_in_statement315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_in_statement320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_repeat336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_repeatCondition_in_repeat338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXECUTE_in_repeat342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_repeat344 = new BitSet(new long[]{0x0000000000001C08L,0x0000000002000000L});
    public static final BitSet FOLLOW_integerValue_in_repeatCondition364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_repeatCondition374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_repeatCondition376 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_timeValue_in_repeatCondition380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOREVER_in_repeatCondition390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flyCommand_in_command407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand433 = new BitSet(new long[]{0x0002000C14862008L});
    public static final BitSet FOLLOW_time_in_flyCommandValue450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttle_in_flyCommandValue465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOITER_in_loiterCommand507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand509 = new BitSet(new long[]{0x0002000E14866008L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttle_in_loiterCommandValue536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnDirection_in_loiterCommandValue541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand577 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand579 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_executeCommandParameter622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_pitch643 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_pitch660 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch664 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_pitch677 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_pitch681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_pitch694 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_pitch698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_pitch711 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch715 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_pitch719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_pitch736 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch740 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_pitch744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_roll767 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_roll771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_roll784 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_roll788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_roll801 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_roll805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_roll818 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_roll822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_roll835 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_roll839 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_roll843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_roll860 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_roll864 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_roll868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YAW_in_yaw889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_yaw891 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_yaw895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YAW_in_yaw906 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_yaw908 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_yaw912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YAW_in_yaw923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_yaw925 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_yaw929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YAW_in_yaw940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_yaw942 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_yaw946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YAW_in_yaw957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_yaw959 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_yaw963 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_yaw967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YAW_in_yaw982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_yaw984 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_yaw988 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_yaw992 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Z_in_altitude1019 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_altitude1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude1034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude1036 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Z_in_altitude1038 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_altitude1042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude1053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Z_in_altitude1057 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_pressureValue_in_altitude1061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude1072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Z_in_altitude1076 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_pressureValue_in_altitude1080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance1099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_distance1101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_X_in_distance1103 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance1118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_distance1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Y_in_distance1122 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RADIUS_in_radius1143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceValue_in_radius1147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed1166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_speed1168 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_speedValue_in_speed1172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed1183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed1185 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_speedValue_in_speed1189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed1200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed1202 = new BitSet(new long[]{0x0000000000000000L,0x00000F8000000000L});
    public static final BitSet FOLLOW_percentValue_in_speed1206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_throttle1219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_throttle1221 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_throttle1224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_throttle1228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_throttle1240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_throttle1242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_throttle1246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_throttle1257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_throttle1259 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_throttle1262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_throttle1266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_throttle1278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_throttle1280 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_angularRateValue_in_throttle1284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_time1305 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_timeValue_in_time1309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_duration1326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_duration1328 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_timeValue_in_duration1332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1353 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_direction1357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_turnDirection_in_direction1372 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_direction1376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1389 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_angularValue_in_direction1393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_turnDirection1412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_turnDirection1425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint1449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate1473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate1500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_X_in_latitudeLongitude1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitude1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_latitudeLongitude1541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitude1545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_X_in_distanceCoordinate1570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1574 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_distanceCoordinate1578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_angularValue1607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1611 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_angularValue1613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_angularRateValue1634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_angularRateValue1638 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_angularRateValue1640 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SECOND_in_angularRateValue1642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distanceValue1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1667 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_METER_in_distanceValue1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRESSURE_in_pressureValue1690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PASCAL_in_pressureValue1696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speedValue1717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_speedValue1721 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_METER_in_speedValue1723 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SECOND_in_speedValue1725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_timeValue1746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_timeValue1750 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SECOND_in_timeValue1752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue1861 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue1863 = new BitSet(new long[]{0x0000000000000002L});

}