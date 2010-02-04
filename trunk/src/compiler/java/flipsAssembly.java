// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g 2010-02-03 21:05:01

  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class flipsAssembly extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'def'", "'define'", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'spd'", "'speed'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'u00B0'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
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
    public static final int SOUTH=65;
    public static final int T__264=264;
    public static final int FOOT=45;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int HECTOPASCAL=54;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=39;
    public static final int FASTER=20;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=75;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int MINIMUM=56;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int KILOMETER=40;
    public static final int T__256=256;
    public static final int EQ=68;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
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
    public static final int SENSOR=8;
    public static final int T__137=137;
    public static final int GE=73;
    public static final int T__136=136;
    public static final int YARD=44;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int DURATION=28;
    public static final int With=77;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int CRUISE=58;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=92;
    public static final int T__129=129;
    public static final int OPTIMAL=22;
    public static final int BinaryLiteral=82;
    public static final int THROTTLE=23;
    public static final int BinaryDigit=89;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=81;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int GT=71;
    public static final int T__271=271;
    public static final int METER=41;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
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
    public static final int HexDigit=90;
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
    public static final int LEFT=46;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=51;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int AM=25;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=85;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=76;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=47;
    public static final int RELATIVE=15;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int EAST=66;
    public static final int T__100=100;
    public static final int HOUR=34;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=18;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=87;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int NAUTICAL=42;
    public static final int NonZeroDigit=88;
    public static final int NORTH=64;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=63;
    public static final int T__230=230;
    public static final int LT=70;
    public static final int OctalLiteral=83;
    public static final int LATITUDE=32;
    public static final int ATMOSPHERE=61;
    public static final int Identifier=74;
    public static final int COMMAND=6;
    public static final int Comment=93;
    public static final int MILLIBAR=60;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=49;
    public static final int FlightLevel=78;
    public static final int NE=69;
    public static final int SECOND=36;
    public static final int CLIMB=62;
    public static final int ROLL=16;
    public static final int HOUR24=27;
    public static final int RADIAN=38;
    public static final int TURN=13;
    public static final int DEGREE=37;
    public static final int PASCAL=55;
    public static final int T__200=200;
    public static final int FLY=9;
    public static final int SLOWER=21;
    public static final int T__201=201;
    public static final int PM=26;
    public static final int LONGITUDE=33;
    public static final int PRESSURE=52;
    public static final int MILE=43;
    public static final int Exponent=91;
    public static final int LineComment=94;
    public static final int DEFINE=5;
    public static final int WEST=67;
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
    public static final int PERCENT=50;
    public static final int T__189=189;
    public static final int Heading=80;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=86;
    public static final int DecimalLiteral=84;
    public static final int T__175=175;
    public static final int FLIGHTPLAN=4;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int Turning=79;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=53;
    public static final int T__176=176;
    public static final int CLOCKWISE=48;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MAXIMUM=57;
    public static final int MINUTE=35;
    public static final int T__169=169;
    public static final int BAR=59;
    public static final int LE=72;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "convertCardinalDirection", "pitch", "distance", 
        "numericValue", "geoCoordinate", "radius", "duration", "defineCommand", 
        "define", "percentValue", "speed", "convertSpeed", "latitude", "loiterDirection", 
        "flyCommand", "integerValue", "loiterCommand", "convertThrottle", 
        "command", "direction", "convertPressure", "roll", "convertSubOrdinalDirection", 
        "flightPlan", "executeCommand", "convertFlightLevel", "waypoint", 
        "turnDirection", "time", "convertOrdinalDirection", "convertDistance", 
        "flyCommandValue", "convertAngle", "executeCommandParameter", "altitude", 
        "loiterCommandValue", "defineSensor", "longitude", "convertDirection", 
        "defineWaypoint", "convertTime"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public flipsAssembly(TreeNodeStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public flipsAssembly(TreeNodeStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, input.getTreeAdaptor());
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public flipsAssembly(TreeNodeStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return flipsAssembly.tokenNames; }
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g"; }


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:115:1: flightPlan : ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final void flightPlan() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "flightPlan");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:116:2: ( ^( FLIGHTPLAN ( define )* ( command )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:116:4: ^( FLIGHTPLAN ( define )* ( command )* )
            {
            dbg.location(116,4);
            dbg.location(116,6);
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(116,17);
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:116:17: ( define )*
                try { dbg.enterSubRule(1);

                loop1:
                do {
                    int alt1=2;
                    try { dbg.enterDecision(1);

                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DEFINE) ) {
                        alt1=1;
                    }


                    } finally {dbg.exitDecision(1);}

                    switch (alt1) {
                	case 1 :
                	    dbg.enterAlt(1);

                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:116:17: define
                	    {
                	    dbg.location(116,17);
                	    pushFollow(FOLLOW_define_in_flightPlan65);
                	    define();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);
                } finally {dbg.exitSubRule(1);}

                dbg.location(116,25);
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:116:25: ( command )*
                try { dbg.enterSubRule(2);

                loop2:
                do {
                    int alt2=2;
                    try { dbg.enterDecision(2);

                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=FLY && LA2_0<=EXECUTE)) ) {
                        alt2=1;
                    }


                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                	case 1 :
                	    dbg.enterAlt(1);

                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:116:25: command
                	    {
                	    dbg.location(116,25);
                	    pushFollow(FOLLOW_command_in_flightPlan68);
                	    command();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);
                } finally {dbg.exitSubRule(2);}


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
        dbg.location(116, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flightPlan");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "flightPlan"


    // $ANTLR start "define"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:120:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final void define() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "define");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:121:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            try { dbg.enterDecision(3);

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

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:121:4: defineCommand
                    {
                    dbg.location(121,4);
                    pushFollow(FOLLOW_defineCommand_in_define81);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:122:4: defineSensor
                    {
                    dbg.location(122,4);
                    pushFollow(FOLLOW_defineSensor_in_define86);
                    defineSensor();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:123:4: defineWaypoint
                    {
                    dbg.location(123,4);
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
        dbg.location(124, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "define");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "define"


    // $ANTLR start "defineCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:126:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int cmd = 0;

        int par = 0;


        try { dbg.enterRule(getGrammarFileName(), "defineCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:127:2: ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) )
            int alt4=2;
            try { dbg.enterDecision(4);

            try {
                isCyclicDecision = true;
                alt4 = dfa4.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:127:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) )
                    {
                    dbg.location(127,4);
                    dbg.location(127,6);
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand103); 

                    match(input, Token.DOWN, null); 
                    dbg.location(127,17);
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand107); 
                    dbg.location(127,29);
                    dbg.location(127,31);
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand110); 

                    match(input, Token.DOWN, null); 
                    dbg.location(127,42);
                    pushFollow(FOLLOW_integerValue_in_defineCommand114);
                    cmd=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(128,3);
                    addCommand(name.getText(),cmd);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:129:4: ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) )
                    {
                    dbg.location(129,4);
                    dbg.location(129,6);
                    match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand126); 

                    match(input, Token.DOWN, null); 
                    dbg.location(129,17);
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand130); 
                    dbg.location(129,29);
                    dbg.location(129,31);
                    match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand133); 

                    match(input, Token.DOWN, null); 
                    dbg.location(129,42);
                    pushFollow(FOLLOW_integerValue_in_defineCommand137);
                    cmd=integerValue();

                    state._fsp--;

                    dbg.location(129,56);
                    match(input,PARAMETER,FOLLOW_PARAMETER_in_defineCommand139); 
                    dbg.location(129,69);
                    pushFollow(FOLLOW_integerValue_in_defineCommand143);
                    par=integerValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(130,3);
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
        dbg.location(131, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "defineCommand"


    // $ANTLR start "defineSensor"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:133:1: defineSensor : ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) ;
    public final void defineSensor() throws RecognitionException {
        CommonTree name=null;
        int sen = 0;


        try { dbg.enterRule(getGrammarFileName(), "defineSensor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:134:2: ( ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:134:4: ^( DEFINE name= Identifier ^( SENSOR sen= integerValue ) )
            {
            dbg.location(134,4);
            dbg.location(134,6);
            match(input,DEFINE,FOLLOW_DEFINE_in_defineSensor161); 

            match(input, Token.DOWN, null); 
            dbg.location(134,17);
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineSensor165); 
            dbg.location(134,29);
            dbg.location(134,31);
            match(input,SENSOR,FOLLOW_SENSOR_in_defineSensor168); 

            match(input, Token.DOWN, null); 
            dbg.location(134,41);
            pushFollow(FOLLOW_integerValue_in_defineSensor172);
            sen=integerValue();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            dbg.location(135,3);
            addSensor(name.getText(),sen);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(136, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineSensor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "defineSensor"


    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:138:1: defineWaypoint : ^( DEFINE name= Identifier geo= geoCoordinate ) ;
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.geoCoordinate_return geo = null;


        try { dbg.enterRule(getGrammarFileName(), "defineWaypoint");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:139:2: ( ^( DEFINE name= Identifier geo= geoCoordinate ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:139:4: ^( DEFINE name= Identifier geo= geoCoordinate )
            {
            dbg.location(139,4);
            dbg.location(139,6);
            match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint190); 

            match(input, Token.DOWN, null); 
            dbg.location(139,17);
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint194); 
            dbg.location(139,32);
            pushFollow(FOLLOW_geoCoordinate_in_defineWaypoint198);
            geo=geoCoordinate();

            state._fsp--;


            match(input, Token.UP, null); 
            dbg.location(140,3);
            addWaypoint(name.getText(),geo.latitude,geo.longitude);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(141, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineWaypoint");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "defineWaypoint"


    // $ANTLR start "command"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:145:1: command : ( flyCommand | loiterCommand | executeCommand );
    public final void command() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:146:2: ( flyCommand | loiterCommand | executeCommand )
            int alt5=3;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case FLY:
                {
                alt5=1;
                }
                break;
            case LOITER:
                {
                alt5=2;
                }
                break;
            case EXECUTE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:146:4: flyCommand
                    {
                    dbg.location(146,4);
                    pushFollow(FOLLOW_flyCommand_in_command216);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:147:4: loiterCommand
                    {
                    dbg.location(147,4);
                    pushFollow(FOLLOW_loiterCommand_in_command221);
                    loiterCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:148:4: executeCommand
                    {
                    dbg.location(148,4);
                    pushFollow(FOLLOW_executeCommand_in_command226);
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
        dbg.location(149, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "command"


    // $ANTLR start "flyCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:153:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "flyCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:154:2: ( ^( FLY ( flyCommandValue )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:154:4: ^( FLY ( flyCommandValue )* )
            {
            dbg.location(154,4);
            dbg.location(154,6);
            match(input,FLY,FOLLOW_FLY_in_flyCommand240); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(154,10);
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:154:10: ( flyCommandValue )*
                try { dbg.enterSubRule(6);

                loop6:
                do {
                    int alt6=2;
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==DIRECTION||(LA6_0>=ROLL && LA6_0<=SPEED)||LA6_0==TIME||LA6_0==DURATION||(LA6_0>=WAYPOINT && LA6_0<=GEOCOORDINATE)||LA6_0==DISTANCE) ) {
                        alt6=1;
                    }


                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                	case 1 :
                	    dbg.enterAlt(1);

                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:154:10: flyCommandValue
                	    {
                	    dbg.location(154,10);
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand242);
                	    flyCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);
                } finally {dbg.exitSubRule(6);}


                match(input, Token.UP, null); 
            }
            dbg.location(155,3);
            emit("FLY", "Execute");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(156, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flyCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "flyCommand"


    // $ANTLR start "flyCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:158:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "flyCommandValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:159:2: ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude )
            int alt7=9;
            try { dbg.enterDecision(7);

            switch ( input.LA(1) ) {
            case TIME:
                {
                alt7=1;
                }
                break;
            case DIRECTION:
                {
                alt7=2;
                }
                break;
            case SPEED:
                {
                alt7=3;
                }
                break;
            case DISTANCE:
                {
                alt7=4;
                }
                break;
            case PITCH:
                {
                alt7=5;
                }
                break;
            case ROLL:
                {
                alt7=6;
                }
                break;
            case DURATION:
                {
                alt7=7;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt7=8;
                }
                break;
            case ALTITUDE:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:159:4: time
                    {
                    dbg.location(159,4);
                    pushFollow(FOLLOW_time_in_flyCommandValue259);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:160:4: direction
                    {
                    dbg.location(160,4);
                    pushFollow(FOLLOW_direction_in_flyCommandValue264);
                    direction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:161:4: speed
                    {
                    dbg.location(161,4);
                    pushFollow(FOLLOW_speed_in_flyCommandValue269);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:162:4: distance
                    {
                    dbg.location(162,4);
                    pushFollow(FOLLOW_distance_in_flyCommandValue274);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:163:4: pitch
                    {
                    dbg.location(163,4);
                    pushFollow(FOLLOW_pitch_in_flyCommandValue279);
                    pitch();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:164:4: roll
                    {
                    dbg.location(164,4);
                    pushFollow(FOLLOW_roll_in_flyCommandValue284);
                    roll();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:165:4: duration
                    {
                    dbg.location(165,4);
                    pushFollow(FOLLOW_duration_in_flyCommandValue289);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:166:4: waypoint
                    {
                    dbg.location(166,4);
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue294);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:167:4: altitude
                    {
                    dbg.location(167,4);
                    pushFollow(FOLLOW_altitude_in_flyCommandValue299);
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
        dbg.location(168, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flyCommandValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "flyCommandValue"


    // $ANTLR start "loiterCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:170:1: loiterCommand : ^( LOITER ( loiterCommandValue )* ) ;
    public final void loiterCommand() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "loiterCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:171:2: ( ^( LOITER ( loiterCommandValue )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:171:4: ^( LOITER ( loiterCommandValue )* )
            {
            dbg.location(171,4);
            dbg.location(171,6);
            match(input,LOITER,FOLLOW_LOITER_in_loiterCommand311); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(171,13);
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:171:13: ( loiterCommandValue )*
                try { dbg.enterSubRule(8);

                loop8:
                do {
                    int alt8=2;
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DIRECTION||(LA8_0>=ALTITUDE && LA8_0<=SPEED)||LA8_0==TIME||(LA8_0>=DURATION && LA8_0<=GEOCOORDINATE)) ) {
                        alt8=1;
                    }


                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                	case 1 :
                	    dbg.enterAlt(1);

                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:171:13: loiterCommandValue
                	    {
                	    dbg.location(171,13);
                	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand313);
                	    loiterCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);
                } finally {dbg.exitSubRule(8);}


                match(input, Token.UP, null); 
            }
            dbg.location(172,3);
            emit("LTR", "Execute Loiter");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(173, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loiterCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "loiterCommand"


    // $ANTLR start "loiterCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:175:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | waypoint | altitude );
    public final void loiterCommandValue() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "loiterCommandValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:176:2: ( time | speed | loiterDirection | radius | duration | waypoint | altitude )
            int alt9=7;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case TIME:
                {
                alt9=1;
                }
                break;
            case SPEED:
                {
                alt9=2;
                }
                break;
            case DIRECTION:
                {
                alt9=3;
                }
                break;
            case RADIUS:
                {
                alt9=4;
                }
                break;
            case DURATION:
                {
                alt9=5;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt9=6;
                }
                break;
            case ALTITUDE:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:176:4: time
                    {
                    dbg.location(176,4);
                    pushFollow(FOLLOW_time_in_loiterCommandValue330);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:177:4: speed
                    {
                    dbg.location(177,4);
                    pushFollow(FOLLOW_speed_in_loiterCommandValue335);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:178:4: loiterDirection
                    {
                    dbg.location(178,4);
                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue340);
                    loiterDirection();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:179:4: radius
                    {
                    dbg.location(179,4);
                    pushFollow(FOLLOW_radius_in_loiterCommandValue345);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:180:4: duration
                    {
                    dbg.location(180,4);
                    pushFollow(FOLLOW_duration_in_loiterCommandValue350);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:181:4: waypoint
                    {
                    dbg.location(181,4);
                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue355);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:182:4: altitude
                    {
                    dbg.location(182,4);
                    pushFollow(FOLLOW_altitude_in_loiterCommandValue360);
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
        dbg.location(183, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loiterCommandValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "loiterCommandValue"


    // $ANTLR start "executeCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:185:1: executeCommand : ^( EXECUTE x= Identifier ( executeCommandParameter )* ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try { dbg.enterRule(getGrammarFileName(), "executeCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:186:2: ( ^( EXECUTE x= Identifier ( executeCommandParameter )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:186:4: ^( EXECUTE x= Identifier ( executeCommandParameter )* )
            {
            dbg.location(186,4);
            dbg.location(186,6);
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand372); 

            match(input, Token.DOWN, null); 
            dbg.location(186,15);
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand376); 
            dbg.location(186,27);
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:186:27: ( executeCommandParameter )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==PARAMETER) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:186:27: executeCommandParameter
            	    {
            	    dbg.location(186,27);
            	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand378);
            	    executeCommandParameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            match(input, Token.UP, null); 
            dbg.location(187,2);

            Integer value = getCommand(x.getText());
            if (value != null) {
              String runValue = value.toString();
              emit("CMD " + runValue, x.getText().toUpperCase() + " / Command #" + runValue);
            }
            else {
              emit("$INCLUDE " + x.getText() + ".uav", "Include The File '" + x.getText() + ".uav'");
            }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(197, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "executeCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "executeCommand"


    // $ANTLR start "executeCommandParameter"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:199:1: executeCommandParameter : ^( PARAMETER x= numericValue ) ;
    public final void executeCommandParameter() throws RecognitionException {
        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "executeCommandParameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:200:2: ( ^( PARAMETER x= numericValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:200:4: ^( PARAMETER x= numericValue )
            {
            dbg.location(200,4);
            dbg.location(200,6);
            match(input,PARAMETER,FOLLOW_PARAMETER_in_executeCommandParameter395); 

            match(input, Token.DOWN, null); 
            dbg.location(200,17);
            pushFollow(FOLLOW_numericValue_in_executeCommandParameter399);
            x=numericValue();

            state._fsp--;


            match(input, Token.UP, null); 
            dbg.location(201,3);
            emit("CMD PAR " + x, x + " Command Parameter");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(202, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "executeCommandParameter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "executeCommandParameter"


    // $ANTLR start "pitch"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:206:1: pitch : ^( PITCH x= convertAngle ) ;
    public final void pitch() throws RecognitionException {
        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "pitch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:207:2: ( ^( PITCH x= convertAngle ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:207:4: ^( PITCH x= convertAngle )
            {
            dbg.location(207,4);
            dbg.location(207,6);
            match(input,PITCH,FOLLOW_PITCH_in_pitch418); 

            match(input, Token.DOWN, null); 
            dbg.location(207,13);
            pushFollow(FOLLOW_convertAngle_in_pitch422);
            x=convertAngle();

            state._fsp--;


            match(input, Token.UP, null); 
            dbg.location(208,3);
            emit("POS PIT FIX " + x, x + " deg Pitch");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(209, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pitch");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pitch"


    // $ANTLR start "roll"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:211:1: roll : ^( ROLL x= convertAngle ) ;
    public final void roll() throws RecognitionException {
        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "roll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:212:2: ( ^( ROLL x= convertAngle ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:212:4: ^( ROLL x= convertAngle )
            {
            dbg.location(212,4);
            dbg.location(212,6);
            match(input,ROLL,FOLLOW_ROLL_in_roll439); 

            match(input, Token.DOWN, null); 
            dbg.location(212,12);
            pushFollow(FOLLOW_convertAngle_in_roll443);
            x=convertAngle();

            state._fsp--;


            match(input, Token.UP, null); 
            dbg.location(213,3);
            emit("POS ROL FIX " + x, x + " deg Roll");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(214, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "roll");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "roll"


    // $ANTLR start "altitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:218:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "altitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(218, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:219:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) )
            int alt11=7;
            try { dbg.enterDecision(11);

            try {
                isCyclicDecision = true;
                alt11 = dfa11.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:219:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    dbg.location(219,4);
                    dbg.location(219,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude462); 

                    match(input, Token.DOWN, null); 
                    dbg.location(219,15);
                    match(input,FIXED,FOLLOW_FIXED_in_altitude464); 
                    dbg.location(219,21);
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude466); 
                    dbg.location(219,31);
                    pushFollow(FOLLOW_convertDistance_in_altitude470);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(220,3);
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:221:4: ^( ALTITUDE FIXED PRESSURE y= convertPressure )
                    {
                    dbg.location(221,4);
                    dbg.location(221,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude481); 

                    match(input, Token.DOWN, null); 
                    dbg.location(221,15);
                    match(input,FIXED,FOLLOW_FIXED_in_altitude483); 
                    dbg.location(221,21);
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude485); 
                    dbg.location(221,31);
                    pushFollow(FOLLOW_convertPressure_in_altitude489);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(222,3);
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:223:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    dbg.location(223,4);
                    dbg.location(223,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude500); 

                    match(input, Token.DOWN, null); 
                    dbg.location(223,15);
                    match(input,FIXED,FOLLOW_FIXED_in_altitude502); 
                    dbg.location(223,22);
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude506);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(224,3);
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:225:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    dbg.location(225,4);
                    dbg.location(225,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude517); 

                    match(input, Token.DOWN, null); 
                    dbg.location(225,15);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude519); 
                    dbg.location(225,24);
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude521); 
                    dbg.location(225,30);
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude523); 
                    dbg.location(225,40);
                    pushFollow(FOLLOW_convertDistance_in_altitude527);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(226,3);
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:227:4: ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure )
                    {
                    dbg.location(227,4);
                    dbg.location(227,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude538); 

                    match(input, Token.DOWN, null); 
                    dbg.location(227,15);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude540); 
                    dbg.location(227,24);
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude542); 
                    dbg.location(227,30);
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude544); 
                    dbg.location(227,40);
                    pushFollow(FOLLOW_convertPressure_in_altitude548);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(228,3);
                    emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:229:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    dbg.location(229,4);
                    dbg.location(229,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude559); 

                    match(input, Token.DOWN, null); 
                    dbg.location(229,15);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude561); 
                    dbg.location(229,24);
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude563); 
                    dbg.location(229,32);
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude565); 
                    dbg.location(229,42);
                    pushFollow(FOLLOW_convertDistance_in_altitude569);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(230,3);
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:231:4: ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure )
                    {
                    dbg.location(231,4);
                    dbg.location(231,6);
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude580); 

                    match(input, Token.DOWN, null); 
                    dbg.location(231,15);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude582); 
                    dbg.location(231,24);
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude584); 
                    dbg.location(231,32);
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude586); 
                    dbg.location(231,42);
                    pushFollow(FOLLOW_convertPressure_in_altitude590);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(232,3);
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
        dbg.location(233, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "altitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "altitude"


    // $ANTLR start "distance"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:237:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "distance");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:238:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt12=3;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==DISTANCE) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt12=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt12=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:238:4: ^( DISTANCE x= convertDistance )
                    {
                    dbg.location(238,4);
                    dbg.location(238,6);
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance609); 

                    match(input, Token.DOWN, null); 
                    dbg.location(238,16);
                    pushFollow(FOLLOW_convertDistance_in_distance613);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(239,3);
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:240:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    dbg.location(240,4);
                    dbg.location(240,6);
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance624); 

                    match(input, Token.DOWN, null); 
                    dbg.location(240,15);
                    match(input,LEFT,FOLLOW_LEFT_in_distance626); 
                    dbg.location(240,21);
                    pushFollow(FOLLOW_convertDistance_in_distance630);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(241,3);
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:242:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    dbg.location(242,4);
                    dbg.location(242,6);
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance641); 

                    match(input, Token.DOWN, null); 
                    dbg.location(242,15);
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance643); 
                    dbg.location(242,22);
                    pushFollow(FOLLOW_convertDistance_in_distance647);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(243,3);
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
        dbg.location(244, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "distance");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "distance"


    // $ANTLR start "radius"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:246:1: radius : ^( RADIUS x= convertDistance ) ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "radius");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:247:2: ( ^( RADIUS x= convertDistance ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:247:4: ^( RADIUS x= convertDistance )
            {
            dbg.location(247,4);
            dbg.location(247,6);
            match(input,RADIUS,FOLLOW_RADIUS_in_radius664); 

            match(input, Token.DOWN, null); 
            dbg.location(247,14);
            pushFollow(FOLLOW_convertDistance_in_radius668);
            x=convertDistance();

            state._fsp--;


            match(input, Token.UP, null); 
            dbg.location(248,3);
            emit("RAD " + x, mToft(x) + "Radius");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(249, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "radius");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "radius"


    // $ANTLR start "speed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:253:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) );
    public final void speed() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "speed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:254:2: ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) )
            int alt13=9;
            try { dbg.enterDecision(13);

            try {
                isCyclicDecision = true;
                alt13 = dfa13.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:254:4: ^( SPEED FIXED x= convertSpeed )
                    {
                    dbg.location(254,4);
                    dbg.location(254,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed687); 

                    match(input, Token.DOWN, null); 
                    dbg.location(254,12);
                    match(input,FIXED,FOLLOW_FIXED_in_speed689); 
                    dbg.location(254,19);
                    pushFollow(FOLLOW_convertSpeed_in_speed693);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(255,3);
                    emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:256:4: ^( SPEED RELATIVE FASTER x= convertSpeed )
                    {
                    dbg.location(256,4);
                    dbg.location(256,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed704); 

                    match(input, Token.DOWN, null); 
                    dbg.location(256,12);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed706); 
                    dbg.location(256,21);
                    match(input,FASTER,FOLLOW_FASTER_in_speed708); 
                    dbg.location(256,29);
                    pushFollow(FOLLOW_convertSpeed_in_speed712);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(257,3);
                    emit("SPD AIR REL " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:258:4: ^( SPEED RELATIVE SLOWER x= convertSpeed )
                    {
                    dbg.location(258,4);
                    dbg.location(258,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed723); 

                    match(input, Token.DOWN, null); 
                    dbg.location(258,12);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed725); 
                    dbg.location(258,21);
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed727); 
                    dbg.location(258,29);
                    pushFollow(FOLLOW_convertSpeed_in_speed731);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(259,3);
                    emit("SPD AIR REL " + -x, -x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:260:4: ^( SPEED RELATIVE FASTER x= percentValue )
                    {
                    dbg.location(260,4);
                    dbg.location(260,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed742); 

                    match(input, Token.DOWN, null); 
                    dbg.location(260,12);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed744); 
                    dbg.location(260,21);
                    match(input,FASTER,FOLLOW_FASTER_in_speed746); 
                    dbg.location(260,29);
                    pushFollow(FOLLOW_percentValue_in_speed750);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:4: ^( SPEED RELATIVE SLOWER x= percentValue )
                    {
                    dbg.location(261,4);
                    dbg.location(261,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed757); 

                    match(input, Token.DOWN, null); 
                    dbg.location(261,12);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed759); 
                    dbg.location(261,21);
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed761); 
                    dbg.location(261,29);
                    pushFollow(FOLLOW_percentValue_in_speed765);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:262:4: ^( SPEED OPTIMAL MINIMUM )
                    {
                    dbg.location(262,4);
                    dbg.location(262,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed772); 

                    match(input, Token.DOWN, null); 
                    dbg.location(262,12);
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed774); 
                    dbg.location(262,20);
                    match(input,MINIMUM,FOLLOW_MINIMUM_in_speed776); 

                    match(input, Token.UP, null); 
                    dbg.location(263,3);
                    emit("SPD AIR OPT MIN", "Minimum Air Speed");

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:264:4: ^( SPEED OPTIMAL CRUISE )
                    {
                    dbg.location(264,4);
                    dbg.location(264,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed787); 

                    match(input, Token.DOWN, null); 
                    dbg.location(264,12);
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed789); 
                    dbg.location(264,20);
                    match(input,CRUISE,FOLLOW_CRUISE_in_speed791); 

                    match(input, Token.UP, null); 
                    dbg.location(265,3);
                    emit("SPD AIR OPT CRU", "Cruise Air Speed");

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:266:4: ^( SPEED OPTIMAL MAXIMUM )
                    {
                    dbg.location(266,4);
                    dbg.location(266,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed802); 

                    match(input, Token.DOWN, null); 
                    dbg.location(266,12);
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed804); 
                    dbg.location(266,20);
                    match(input,MAXIMUM,FOLLOW_MAXIMUM_in_speed806); 

                    match(input, Token.UP, null); 
                    dbg.location(267,3);
                    emit("SPD AIR OPT MAX", "Maximum Air Speed");

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:268:4: ^( SPEED THROTTLE y= convertThrottle )
                    {
                    dbg.location(268,4);
                    dbg.location(268,6);
                    match(input,SPEED,FOLLOW_SPEED_in_speed817); 

                    match(input, Token.DOWN, null); 
                    dbg.location(268,12);
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_speed819); 
                    dbg.location(268,22);
                    pushFollow(FOLLOW_convertThrottle_in_speed823);
                    y=convertThrottle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(269,3);
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
        dbg.location(270, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "speed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "speed"


    // $ANTLR start "time"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:274:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );
    public final void time() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:275:2: ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) )
            int alt20=3;
            try { dbg.enterDecision(20);

            try {
                isCyclicDecision = true;
                alt20 = dfa20.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:275:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM )
                    {
                    dbg.location(275,4);
                    dbg.location(275,6);
                    match(input,TIME,FOLLOW_TIME_in_time842); 

                    match(input, Token.DOWN, null); 
                    dbg.location(275,12);
                    pushFollow(FOLLOW_convertTime_in_time846);
                    x=convertTime();

                    state._fsp--;

                    dbg.location(275,25);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:275:25: (y= convertTime (z= convertTime )? )?
                    int alt15=2;
                    try { dbg.enterSubRule(15);
                    try { dbg.enterDecision(15);

                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=FloatingPointLiteral && LA15_0<=HexLiteral)) ) {
                        alt15=1;
                    }
                    } finally {dbg.exitDecision(15);}

                    switch (alt15) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:275:26: y= convertTime (z= convertTime )?
                            {
                            dbg.location(275,27);
                            pushFollow(FOLLOW_convertTime_in_time851);
                            y=convertTime();

                            state._fsp--;

                            dbg.location(275,40);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:275:40: (z= convertTime )?
                            int alt14=2;
                            try { dbg.enterSubRule(14);
                            try { dbg.enterDecision(14);

                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0>=FloatingPointLiteral && LA14_0<=HexLiteral)) ) {
                                alt14=1;
                            }
                            } finally {dbg.exitDecision(14);}

                            switch (alt14) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:275:41: z= convertTime
                                    {
                                    dbg.location(275,42);
                                    pushFollow(FOLLOW_convertTime_in_time856);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(14);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(275,59);
                    match(input,AM,FOLLOW_AM_in_time862); 

                    match(input, Token.UP, null); 
                    dbg.location(276,3);
                    x = (x == 43200d) ? 0d : x;
                    dbg.location(277,3);
                    emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:278:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM )
                    {
                    dbg.location(278,4);
                    dbg.location(278,6);
                    match(input,TIME,FOLLOW_TIME_in_time877); 

                    match(input, Token.DOWN, null); 
                    dbg.location(278,12);
                    pushFollow(FOLLOW_convertTime_in_time881);
                    x=convertTime();

                    state._fsp--;

                    dbg.location(278,25);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:278:25: (y= convertTime (z= convertTime )? )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17);

                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=FloatingPointLiteral && LA17_0<=HexLiteral)) ) {
                        alt17=1;
                    }
                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:278:26: y= convertTime (z= convertTime )?
                            {
                            dbg.location(278,27);
                            pushFollow(FOLLOW_convertTime_in_time886);
                            y=convertTime();

                            state._fsp--;

                            dbg.location(278,40);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:278:40: (z= convertTime )?
                            int alt16=2;
                            try { dbg.enterSubRule(16);
                            try { dbg.enterDecision(16);

                            int LA16_0 = input.LA(1);

                            if ( ((LA16_0>=FloatingPointLiteral && LA16_0<=HexLiteral)) ) {
                                alt16=1;
                            }
                            } finally {dbg.exitDecision(16);}

                            switch (alt16) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:278:41: z= convertTime
                                    {
                                    dbg.location(278,42);
                                    pushFollow(FOLLOW_convertTime_in_time891);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(16);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(278,59);
                    match(input,PM,FOLLOW_PM_in_time897); 

                    match(input, Token.UP, null); 
                    dbg.location(279,3);
                    x = (x == 43200d) ? 0d : x;
                    dbg.location(280,3);
                    emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:281:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 )
                    {
                    dbg.location(281,4);
                    dbg.location(281,6);
                    match(input,TIME,FOLLOW_TIME_in_time912); 

                    match(input, Token.DOWN, null); 
                    dbg.location(281,12);
                    pushFollow(FOLLOW_convertTime_in_time916);
                    x=convertTime();

                    state._fsp--;

                    dbg.location(281,25);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:281:25: (y= convertTime (z= convertTime )? )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19);

                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=FloatingPointLiteral && LA19_0<=HexLiteral)) ) {
                        alt19=1;
                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:281:26: y= convertTime (z= convertTime )?
                            {
                            dbg.location(281,27);
                            pushFollow(FOLLOW_convertTime_in_time921);
                            y=convertTime();

                            state._fsp--;

                            dbg.location(281,40);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:281:40: (z= convertTime )?
                            int alt18=2;
                            try { dbg.enterSubRule(18);
                            try { dbg.enterDecision(18);

                            int LA18_0 = input.LA(1);

                            if ( ((LA18_0>=FloatingPointLiteral && LA18_0<=HexLiteral)) ) {
                                alt18=1;
                            }
                            } finally {dbg.exitDecision(18);}

                            switch (alt18) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:281:41: z= convertTime
                                    {
                                    dbg.location(281,42);
                                    pushFollow(FOLLOW_convertTime_in_time926);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(18);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(281,59);
                    match(input,HOUR24,FOLLOW_HOUR24_in_time932); 

                    match(input, Token.UP, null); 
                    dbg.location(282,3);
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
        dbg.location(283, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "duration"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:285:1: duration : ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) ;
    public final void duration() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "duration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:286:2: ( ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:286:4: ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? )
            {
            dbg.location(286,4);
            dbg.location(286,6);
            match(input,DURATION,FOLLOW_DURATION_in_duration949); 

            match(input, Token.DOWN, null); 
            dbg.location(286,16);
            pushFollow(FOLLOW_convertTime_in_duration953);
            x=convertTime();

            state._fsp--;

            dbg.location(286,29);
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:286:29: (y= convertTime (z= convertTime )? )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=FloatingPointLiteral && LA22_0<=HexLiteral)) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:286:30: y= convertTime (z= convertTime )?
                    {
                    dbg.location(286,31);
                    pushFollow(FOLLOW_convertTime_in_duration958);
                    y=convertTime();

                    state._fsp--;

                    dbg.location(286,44);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:286:44: (z= convertTime )?
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=FloatingPointLiteral && LA21_0<=HexLiteral)) ) {
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:286:45: z= convertTime
                            {
                            dbg.location(286,46);
                            pushFollow(FOLLOW_convertTime_in_duration963);
                            z=convertTime();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}


            match(input, Token.UP, null); 
            dbg.location(287,3);
            emit("TIM REL " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + ") Duration");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(288, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "duration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "duration"


    // $ANTLR start "direction"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:292:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );
    public final void direction() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "direction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:293:2: ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) )
            int alt23=6;
            try { dbg.enterDecision(23);

            try {
                isCyclicDecision = true;
                alt23 = dfa23.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:293:4: ^( DIRECTION FIXED x= convertCardinalDirection )
                    {
                    dbg.location(293,4);
                    dbg.location(293,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction986); 

                    match(input, Token.DOWN, null); 
                    dbg.location(293,16);
                    match(input,FIXED,FOLLOW_FIXED_in_direction988); 
                    dbg.location(293,23);
                    pushFollow(FOLLOW_convertCardinalDirection_in_direction992);
                    x=convertCardinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(294,3);
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:295:4: ^( DIRECTION FIXED x= convertOrdinalDirection )
                    {
                    dbg.location(295,4);
                    dbg.location(295,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1003); 

                    match(input, Token.DOWN, null); 
                    dbg.location(295,16);
                    match(input,FIXED,FOLLOW_FIXED_in_direction1005); 
                    dbg.location(295,23);
                    pushFollow(FOLLOW_convertOrdinalDirection_in_direction1009);
                    x=convertOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(296,3);
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:297:4: ^( DIRECTION FIXED x= convertSubOrdinalDirection )
                    {
                    dbg.location(297,4);
                    dbg.location(297,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1020); 

                    match(input, Token.DOWN, null); 
                    dbg.location(297,16);
                    match(input,FIXED,FOLLOW_FIXED_in_direction1022); 
                    dbg.location(297,23);
                    pushFollow(FOLLOW_convertSubOrdinalDirection_in_direction1026);
                    x=convertSubOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(298,3);
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:299:4: ^( DIRECTION FIXED y= convertAngle )
                    {
                    dbg.location(299,4);
                    dbg.location(299,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1037); 

                    match(input, Token.DOWN, null); 
                    dbg.location(299,16);
                    match(input,FIXED,FOLLOW_FIXED_in_direction1039); 
                    dbg.location(299,23);
                    pushFollow(FOLLOW_convertAngle_in_direction1043);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(300,3);
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:301:4: ^( DIRECTION RELATIVE LEFT y= convertAngle )
                    {
                    dbg.location(301,4);
                    dbg.location(301,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1054); 

                    match(input, Token.DOWN, null); 
                    dbg.location(301,16);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1056); 
                    dbg.location(301,25);
                    match(input,LEFT,FOLLOW_LEFT_in_direction1058); 
                    dbg.location(301,31);
                    pushFollow(FOLLOW_convertAngle_in_direction1062);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(302,3);
                    emit("POS YAW REL " + -y, -y + " deg Yaw");

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:303:4: ^( DIRECTION RELATIVE RIGHT y= convertAngle )
                    {
                    dbg.location(303,4);
                    dbg.location(303,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction1073); 

                    match(input, Token.DOWN, null); 
                    dbg.location(303,16);
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction1075); 
                    dbg.location(303,25);
                    match(input,RIGHT,FOLLOW_RIGHT_in_direction1077); 
                    dbg.location(303,32);
                    pushFollow(FOLLOW_convertAngle_in_direction1081);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(304,3);
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
        dbg.location(305, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "direction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "direction"


    // $ANTLR start "turnDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:307:1: turnDirection : ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) );
    public final void turnDirection() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "turnDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:308:2: ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) )
            int alt24=2;
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==DIRECTION) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==TURN) ) {
                        int LA24_3 = input.LA(4);

                        if ( (LA24_3==LEFT) ) {
                            alt24=1;
                        }
                        else if ( (LA24_3==RIGHT) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:308:4: ^( DIRECTION TURN LEFT )
                    {
                    dbg.location(308,4);
                    dbg.location(308,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1098); 

                    match(input, Token.DOWN, null); 
                    dbg.location(308,16);
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1100); 
                    dbg.location(308,21);
                    match(input,LEFT,FOLLOW_LEFT_in_turnDirection1102); 

                    match(input, Token.UP, null); 
                    dbg.location(309,3);
                    emit("DIR L", "Left Turn Direction");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:310:4: ^( DIRECTION TURN RIGHT )
                    {
                    dbg.location(310,4);
                    dbg.location(310,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1113); 

                    match(input, Token.DOWN, null); 
                    dbg.location(310,16);
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1115); 
                    dbg.location(310,21);
                    match(input,RIGHT,FOLLOW_RIGHT_in_turnDirection1117); 

                    match(input, Token.UP, null); 
                    dbg.location(311,3);
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
        dbg.location(312, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "turnDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "turnDirection"


    // $ANTLR start "loiterDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:314:1: loiterDirection : ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) );
    public final void loiterDirection() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "loiterDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:315:2: ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) )
            int alt25=2;
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==DIRECTION) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==TURN) ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==CLOCKWISE) ) {
                            alt25=1;
                        }
                        else if ( (LA25_3==COUNTERCLOCKWISE) ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:315:4: ^( DIRECTION TURN CLOCKWISE )
                    {
                    dbg.location(315,4);
                    dbg.location(315,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1134); 

                    match(input, Token.DOWN, null); 
                    dbg.location(315,16);
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1136); 
                    dbg.location(315,21);
                    match(input,CLOCKWISE,FOLLOW_CLOCKWISE_in_loiterDirection1138); 

                    match(input, Token.UP, null); 
                    dbg.location(316,3);
                    emit("DIR CW", "Clockwise Loiter Direction");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:317:4: ^( DIRECTION TURN COUNTERCLOCKWISE )
                    {
                    dbg.location(317,4);
                    dbg.location(317,6);
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1149); 

                    match(input, Token.DOWN, null); 
                    dbg.location(317,16);
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1151); 
                    dbg.location(317,21);
                    match(input,COUNTERCLOCKWISE,FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1153); 

                    match(input, Token.UP, null); 
                    dbg.location(318,3);
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
        dbg.location(319, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loiterDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "loiterDirection"


    // $ANTLR start "waypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:323:1: waypoint : (geo= geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;
        flipsAssembly.geoCoordinate_return geo = null;


        try { dbg.enterRule(getGrammarFileName(), "waypoint");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(323, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:324:2: (geo= geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt26=2;
            try { dbg.enterDecision(26);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:324:4: geo= geoCoordinate
                    {
                    dbg.location(324,7);
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1173);
                    geo=geoCoordinate();

                    state._fsp--;

                    dbg.location(325,3);
                    String ns = geo.latitude >= 0 ? "N" : "S";
                    dbg.location(326,3);
                    String ew = geo.longitude >= 0 ? "E" : "W";
                    dbg.location(327,3);
                    emit("POS   X FIX " + geo.longitude, Math.abs(geo.longitude) + " " + ew + " Longitude");
                    dbg.location(328,3);
                    emit("POS   Y FIX " + geo.latitude, Math.abs(geo.latitude) + " " + ns + " Latitude");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:329:4: ^( WAYPOINT x= Identifier )
                    {
                    dbg.location(329,4);
                    dbg.location(329,6);
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint1195); 

                    match(input, Token.DOWN, null); 
                    dbg.location(329,16);
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint1199); 

                    match(input, Token.UP, null); 
                    dbg.location(330,2);

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
        dbg.location(343, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "waypoint");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "waypoint"

    public static class geoCoordinate_return extends TreeRuleReturnScope {
        public double latitude;
        public double longitude;
    };

    // $ANTLR start "geoCoordinate"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:345:1: geoCoordinate returns [double latitude, double longitude] : ^( GEOCOORDINATE x= latitude y= longitude ) ;
    public final flipsAssembly.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsAssembly.geoCoordinate_return retval = new flipsAssembly.geoCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "geoCoordinate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:346:2: ( ^( GEOCOORDINATE x= latitude y= longitude ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:346:4: ^( GEOCOORDINATE x= latitude y= longitude )
            {
            dbg.location(346,4);
            dbg.location(346,6);
            match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1219); 

            match(input, Token.DOWN, null); 
            dbg.location(346,21);
            pushFollow(FOLLOW_latitude_in_geoCoordinate1223);
            x=latitude();

            state._fsp--;

            dbg.location(346,32);
            pushFollow(FOLLOW_longitude_in_geoCoordinate1227);
            y=longitude();

            state._fsp--;


            match(input, Token.UP, null); 
            dbg.location(347,3);
            retval.latitude = x;
            dbg.location(348,3);
            retval.longitude = y;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(349, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "geoCoordinate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "geoCoordinate"


    // $ANTLR start "latitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:351:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "latitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:352:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt27=2;
            try { dbg.enterDecision(27);

            try {
                isCyclicDecision = true;
                alt27 = dfa27.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:352:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    dbg.location(352,4);
                    dbg.location(352,6);
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1252); 

                    match(input, Token.DOWN, null); 
                    dbg.location(352,16);
                    pushFollow(FOLLOW_convertAngle_in_latitude1256);
                    x=convertAngle();

                    state._fsp--;

                    dbg.location(352,30);
                    match(input,NORTH,FOLLOW_NORTH_in_latitude1258); 

                    match(input, Token.UP, null); 
                    dbg.location(353,3);
                    r = x;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:354:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    dbg.location(354,4);
                    dbg.location(354,6);
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1269); 

                    match(input, Token.DOWN, null); 
                    dbg.location(354,16);
                    pushFollow(FOLLOW_convertAngle_in_latitude1273);
                    x=convertAngle();

                    state._fsp--;

                    dbg.location(354,30);
                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude1275); 

                    match(input, Token.UP, null); 
                    dbg.location(355,3);
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
        dbg.location(356, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "latitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "latitude"


    // $ANTLR start "longitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:358:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "longitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:359:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt28=2;
            try { dbg.enterDecision(28);

            try {
                isCyclicDecision = true;
                alt28 = dfa28.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:359:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    dbg.location(359,4);
                    dbg.location(359,6);
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1296); 

                    match(input, Token.DOWN, null); 
                    dbg.location(359,17);
                    pushFollow(FOLLOW_convertAngle_in_longitude1300);
                    x=convertAngle();

                    state._fsp--;

                    dbg.location(359,31);
                    match(input,EAST,FOLLOW_EAST_in_longitude1302); 

                    match(input, Token.UP, null); 
                    dbg.location(360,3);
                    r = x;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:361:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    dbg.location(361,4);
                    dbg.location(361,6);
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1313); 

                    match(input, Token.DOWN, null); 
                    dbg.location(361,17);
                    pushFollow(FOLLOW_convertAngle_in_longitude1317);
                    x=convertAngle();

                    state._fsp--;

                    dbg.location(361,31);
                    match(input,WEST,FOLLOW_WEST_in_longitude1319); 

                    match(input, Token.UP, null); 
                    dbg.location(362,3);
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
        dbg.location(363, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "longitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "longitude"


    // $ANTLR start "convertTime"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:368:1: convertTime returns [double r] : (x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND );
    public final double convertTime() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "convertTime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:369:2: (x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND )
            int alt29=3;
            try { dbg.enterDecision(29);

            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                switch ( input.LA(2) ) {
                case SECOND:
                    {
                    alt29=3;
                    }
                    break;
                case MINUTE:
                    {
                    alt29=2;
                    }
                    break;
                case HOUR:
                    {
                    alt29=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case OctalLiteral:
                {
                switch ( input.LA(2) ) {
                case MINUTE:
                    {
                    alt29=2;
                    }
                    break;
                case HOUR:
                    {
                    alt29=1;
                    }
                    break;
                case SECOND:
                    {
                    alt29=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case DecimalLiteral:
                {
                switch ( input.LA(2) ) {
                case MINUTE:
                    {
                    alt29=2;
                    }
                    break;
                case HOUR:
                    {
                    alt29=1;
                    }
                    break;
                case SECOND:
                    {
                    alt29=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case HexLiteral:
                {
                switch ( input.LA(2) ) {
                case HOUR:
                    {
                    alt29=1;
                    }
                    break;
                case SECOND:
                    {
                    alt29=3;
                    }
                    break;
                case MINUTE:
                    {
                    alt29=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case FloatingPointLiteral:
                {
                switch ( input.LA(2) ) {
                case MINUTE:
                    {
                    alt29=2;
                    }
                    break;
                case SECOND:
                    {
                    alt29=3;
                    }
                    break;
                case HOUR:
                    {
                    alt29=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:369:4: x= numericValue HOUR
                    {
                    dbg.location(369,5);
                    pushFollow(FOLLOW_numericValue_in_convertTime1344);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(369,19);
                    match(input,HOUR,FOLLOW_HOUR_in_convertTime1346); 
                    dbg.location(370,3);
                    r = x * 3600d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:371:4: x= numericValue MINUTE
                    {
                    dbg.location(371,5);
                    pushFollow(FOLLOW_numericValue_in_convertTime1357);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(371,19);
                    match(input,MINUTE,FOLLOW_MINUTE_in_convertTime1359); 
                    dbg.location(372,3);
                    r = x * 60d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:373:4: x= numericValue SECOND
                    {
                    dbg.location(373,5);
                    pushFollow(FOLLOW_numericValue_in_convertTime1370);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(373,19);
                    match(input,SECOND,FOLLOW_SECOND_in_convertTime1372); 
                    dbg.location(374,3);
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
        dbg.location(375, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertTime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertTime"


    // $ANTLR start "convertDistance"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:378:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "convertDistance");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:379:2: (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT )
            int alt30=6;
            try { dbg.enterDecision(30);

            try {
                isCyclicDecision = true;
                alt30 = dfa30.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:379:4: x= numericValue KILOMETER
                    {
                    dbg.location(379,5);
                    pushFollow(FOLLOW_numericValue_in_convertDistance1394);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(379,19);
                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistance1396); 
                    dbg.location(380,3);
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:381:4: x= numericValue METER
                    {
                    dbg.location(381,5);
                    pushFollow(FOLLOW_numericValue_in_convertDistance1407);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(381,19);
                    match(input,METER,FOLLOW_METER_in_convertDistance1409); 
                    dbg.location(382,3);
                    r = x;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:383:4: x= numericValue NAUTICAL MILE
                    {
                    dbg.location(383,5);
                    pushFollow(FOLLOW_numericValue_in_convertDistance1420);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(383,19);
                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistance1422); 
                    dbg.location(383,28);
                    match(input,MILE,FOLLOW_MILE_in_convertDistance1424); 
                    dbg.location(384,3);
                    r = x * 1852d;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:385:4: x= numericValue MILE
                    {
                    dbg.location(385,5);
                    pushFollow(FOLLOW_numericValue_in_convertDistance1435);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(385,19);
                    match(input,MILE,FOLLOW_MILE_in_convertDistance1437); 
                    dbg.location(386,3);
                    r = x * 1609.344d;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:387:4: x= numericValue YARD
                    {
                    dbg.location(387,5);
                    pushFollow(FOLLOW_numericValue_in_convertDistance1448);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(387,19);
                    match(input,YARD,FOLLOW_YARD_in_convertDistance1450); 
                    dbg.location(388,3);
                    r = x * 0.9144d;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:389:4: x= numericValue FOOT
                    {
                    dbg.location(389,5);
                    pushFollow(FOLLOW_numericValue_in_convertDistance1461);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(389,19);
                    match(input,FOOT,FOLLOW_FOOT_in_convertDistance1463); 
                    dbg.location(390,3);
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
        dbg.location(391, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertDistance");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertDistance"


    // $ANTLR start "convertFlightLevel"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:394:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try { dbg.enterRule(getGrammarFileName(), "convertFlightLevel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(394, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:395:2: ( FLIGHTLEVEL x= FlightLevel )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:395:4: FLIGHTLEVEL x= FlightLevel
            {
            dbg.location(395,4);
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1483); 
            dbg.location(395,17);
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel1487); 
            dbg.location(396,3);
            String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");
            dbg.location(397,3);
            r = Double.parseDouble(y) * 100d * 0.3048d;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(398, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertFlightLevel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertFlightLevel"


    // $ANTLR start "convertPressure"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:401:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );
    public final double convertPressure() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "convertPressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(401, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:402:2: (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE )
            int alt31=6;
            try { dbg.enterDecision(31);

            try {
                isCyclicDecision = true;
                alt31 = dfa31.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:402:4: x= numericValue KILOPASCAL
                    {
                    dbg.location(402,5);
                    pushFollow(FOLLOW_numericValue_in_convertPressure1513);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(402,19);
                    match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressure1515); 
                    dbg.location(403,3);
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:404:4: x= numericValue HECTOPASCAL
                    {
                    dbg.location(404,5);
                    pushFollow(FOLLOW_numericValue_in_convertPressure1526);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(404,19);
                    match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressure1528); 
                    dbg.location(405,3);
                    r = x * 100d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:406:4: x= numericValue PASCAL
                    {
                    dbg.location(406,5);
                    pushFollow(FOLLOW_numericValue_in_convertPressure1539);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(406,19);
                    match(input,PASCAL,FOLLOW_PASCAL_in_convertPressure1541); 
                    dbg.location(407,3);
                    r = x;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:408:4: x= numericValue BAR
                    {
                    dbg.location(408,5);
                    pushFollow(FOLLOW_numericValue_in_convertPressure1552);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(408,19);
                    match(input,BAR,FOLLOW_BAR_in_convertPressure1554); 
                    dbg.location(409,3);
                    r = x * 100000d;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:410:4: x= numericValue MILLIBAR
                    {
                    dbg.location(410,5);
                    pushFollow(FOLLOW_numericValue_in_convertPressure1565);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(410,19);
                    match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressure1567); 
                    dbg.location(411,3);
                    r = x * 100d;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:412:4: x= numericValue ATMOSPHERE
                    {
                    dbg.location(412,5);
                    pushFollow(FOLLOW_numericValue_in_convertPressure1578);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(412,19);
                    match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressure1580); 
                    dbg.location(413,3);
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
        dbg.location(414, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertPressure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertPressure"


    // $ANTLR start "convertSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:417:1: convertSpeed returns [double r] : (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND );
    public final double convertSpeed() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "convertSpeed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(417, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:418:2: (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND )
            int alt32=3;
            try { dbg.enterDecision(32);

            try {
                isCyclicDecision = true;
                alt32 = dfa32.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:418:4: x= convertDistance HOUR
                    {
                    dbg.location(418,5);
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1602);
                    x=convertDistance();

                    state._fsp--;

                    dbg.location(418,22);
                    match(input,HOUR,FOLLOW_HOUR_in_convertSpeed1604); 
                    dbg.location(419,3);
                    r = x / 3600d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:420:4: x= convertDistance MINUTE
                    {
                    dbg.location(420,5);
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1615);
                    x=convertDistance();

                    state._fsp--;

                    dbg.location(420,22);
                    match(input,MINUTE,FOLLOW_MINUTE_in_convertSpeed1617); 
                    dbg.location(421,3);
                    r = x / 60d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:422:4: x= convertDistance SECOND
                    {
                    dbg.location(422,5);
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1628);
                    x=convertDistance();

                    state._fsp--;

                    dbg.location(422,22);
                    match(input,SECOND,FOLLOW_SECOND_in_convertSpeed1630); 
                    dbg.location(423,3);
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
        dbg.location(424, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertSpeed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertSpeed"


    // $ANTLR start "convertThrottle"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:427:1: convertThrottle returns [double r] : x= percentValue ;
    public final double convertThrottle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "convertThrottle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(427, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:428:2: (x= percentValue )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:428:4: x= percentValue
            {
            dbg.location(428,5);
            pushFollow(FOLLOW_percentValue_in_convertThrottle1652);
            x=percentValue();

            state._fsp--;

            dbg.location(429,3);
            r = x;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(430, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertThrottle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertThrottle"


    // $ANTLR start "convertAngle"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:433:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE min= numericValue MINUTE | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double min = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "convertAngle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:434:2: (x= numericValue DEGREE | deg= integerValue DEGREE min= numericValue MINUTE | x= numericValue RADIAN )
            int alt33=3;
            try { dbg.enterDecision(33);

            try {
                isCyclicDecision = true;
                alt33 = dfa33.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:434:4: x= numericValue DEGREE
                    {
                    dbg.location(434,5);
                    pushFollow(FOLLOW_numericValue_in_convertAngle1674);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(434,19);
                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1676); 
                    dbg.location(435,3);
                    r = x;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:436:4: deg= integerValue DEGREE min= numericValue MINUTE
                    {
                    dbg.location(436,7);
                    pushFollow(FOLLOW_integerValue_in_convertAngle1687);
                    deg=integerValue();

                    state._fsp--;

                    dbg.location(436,21);
                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1689); 
                    dbg.location(436,31);
                    pushFollow(FOLLOW_numericValue_in_convertAngle1693);
                    min=numericValue();

                    state._fsp--;

                    dbg.location(436,45);
                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1695); 
                    dbg.location(437,3);
                    r = deg + min/60d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:438:4: x= numericValue RADIAN
                    {
                    dbg.location(438,5);
                    pushFollow(FOLLOW_numericValue_in_convertAngle1706);
                    x=numericValue();

                    state._fsp--;

                    dbg.location(438,19);
                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle1708); 
                    dbg.location(439,3);
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
        dbg.location(440, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertAngle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertAngle"


    // $ANTLR start "convertCardinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:443:1: convertCardinalDirection returns [double r] : ( NORTH | EAST | SOUTH | WEST );
    public final double convertCardinalDirection() throws RecognitionException {
        double r = 0.0;

        try { dbg.enterRule(getGrammarFileName(), "convertCardinalDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(443, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:444:2: ( NORTH | EAST | SOUTH | WEST )
            int alt34=4;
            try { dbg.enterDecision(34);

            switch ( input.LA(1) ) {
            case NORTH:
                {
                alt34=1;
                }
                break;
            case EAST:
                {
                alt34=2;
                }
                break;
            case SOUTH:
                {
                alt34=3;
                }
                break;
            case WEST:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:444:4: NORTH
                    {
                    dbg.location(444,4);
                    match(input,NORTH,FOLLOW_NORTH_in_convertCardinalDirection1728); 
                    dbg.location(445,3);
                    r = 0d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:446:4: EAST
                    {
                    dbg.location(446,4);
                    match(input,EAST,FOLLOW_EAST_in_convertCardinalDirection1737); 
                    dbg.location(447,3);
                    r = 90d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:448:4: SOUTH
                    {
                    dbg.location(448,4);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertCardinalDirection1746); 
                    dbg.location(449,3);
                    r = 180d;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:450:4: WEST
                    {
                    dbg.location(450,4);
                    match(input,WEST,FOLLOW_WEST_in_convertCardinalDirection1755); 
                    dbg.location(451,3);
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
        dbg.location(452, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertCardinalDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertCardinalDirection"


    // $ANTLR start "convertOrdinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:455:1: convertOrdinalDirection returns [double r] : ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST );
    public final double convertOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try { dbg.enterRule(getGrammarFileName(), "convertOrdinalDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(455, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:456:2: ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST )
            int alt35=4;
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==NORTH) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==EAST) ) {
                    alt35=1;
                }
                else if ( (LA35_1==WEST) ) {
                    alt35=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA35_0==SOUTH) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==EAST) ) {
                    alt35=2;
                }
                else if ( (LA35_2==WEST) ) {
                    alt35=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:456:4: NORTH EAST
                    {
                    dbg.location(456,4);
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection1775); 
                    dbg.location(456,10);
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection1777); 
                    dbg.location(457,3);
                    r = 45d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:458:4: SOUTH EAST
                    {
                    dbg.location(458,4);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection1786); 
                    dbg.location(458,10);
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection1788); 
                    dbg.location(459,3);
                    r = 135d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:460:4: SOUTH WEST
                    {
                    dbg.location(460,4);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection1797); 
                    dbg.location(460,10);
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection1799); 
                    dbg.location(461,3);
                    r = 225d;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:462:4: NORTH WEST
                    {
                    dbg.location(462,4);
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection1808); 
                    dbg.location(462,10);
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection1810); 
                    dbg.location(463,3);
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
        dbg.location(464, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertOrdinalDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertOrdinalDirection"


    // $ANTLR start "convertSubOrdinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:467:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );
    public final double convertSubOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try { dbg.enterRule(getGrammarFileName(), "convertSubOrdinalDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(467, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:468:2: ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST )
            int alt36=8;
            try { dbg.enterDecision(36);

            try {
                isCyclicDecision = true;
                alt36 = dfa36.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:468:4: NORTH NORTH EAST
                    {
                    dbg.location(468,4);
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1830); 
                    dbg.location(468,10);
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1832); 
                    dbg.location(468,16);
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1834); 
                    dbg.location(469,3);
                    r = 22.5d;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:470:4: EAST NORTH EAST
                    {
                    dbg.location(470,4);
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1843); 
                    dbg.location(470,9);
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1845); 
                    dbg.location(470,15);
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1847); 
                    dbg.location(471,3);
                    r = 67.5d;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:472:4: EAST SOUTH EAST
                    {
                    dbg.location(472,4);
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1856); 
                    dbg.location(472,9);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1858); 
                    dbg.location(472,15);
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1860); 
                    dbg.location(473,3);
                    r = 112.5d;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:474:4: SOUTH SOUTH EAST
                    {
                    dbg.location(474,4);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1869); 
                    dbg.location(474,10);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1871); 
                    dbg.location(474,16);
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1873); 
                    dbg.location(475,3);
                    r = 157.5d;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:476:4: SOUTH SOUTH WEST
                    {
                    dbg.location(476,4);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1882); 
                    dbg.location(476,10);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1884); 
                    dbg.location(476,16);
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1886); 
                    dbg.location(477,3);
                    r = 202.5d;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:478:4: WEST SOUTH WEST
                    {
                    dbg.location(478,4);
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1895); 
                    dbg.location(478,9);
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1897); 
                    dbg.location(478,15);
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1899); 
                    dbg.location(479,3);
                    r = 247.5d;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:480:4: WEST NORTH WEST
                    {
                    dbg.location(480,4);
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1908); 
                    dbg.location(480,9);
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1910); 
                    dbg.location(480,15);
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1912); 
                    dbg.location(481,3);
                    r = 292.5d;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:482:4: NORTH NORTH WEST
                    {
                    dbg.location(482,4);
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1921); 
                    dbg.location(482,10);
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1923); 
                    dbg.location(482,16);
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1925); 
                    dbg.location(483,3);
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
        dbg.location(484, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertSubOrdinalDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "convertSubOrdinalDirection"


    // $ANTLR start "convertDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:486:1: convertDirection[double r] : ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) );
    public final void convertDirection(double r) throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "convertDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(486, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:487:2: ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:
            {
            dbg.location(487,2);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=COUNTERCLOCKWISE)||(input.LA(1)>=CLIMB && input.LA(1)<=DESCEND) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(489, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "convertDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "convertDirection"


    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:492:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try { dbg.enterRule(getGrammarFileName(), "numericValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(492, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:493:2: (x= integerValue | y= FloatingPointLiteral )
            int alt37=2;
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=BinaryLiteral && LA37_0<=HexLiteral)) ) {
                alt37=1;
            }
            else if ( (LA37_0==FloatingPointLiteral) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:493:4: x= integerValue
                    {
                    dbg.location(493,5);
                    pushFollow(FOLLOW_integerValue_in_numericValue1976);
                    x=integerValue();

                    state._fsp--;

                    dbg.location(494,3);
                    r = (double) x;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:495:4: y= FloatingPointLiteral
                    {
                    dbg.location(495,5);
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1987); 
                    dbg.location(496,3);
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
        dbg.location(497, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numericValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "numericValue"


    // $ANTLR start "integerValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:499:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try { dbg.enterRule(getGrammarFileName(), "integerValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(499, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:500:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt38=4;
            try { dbg.enterDecision(38);

            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt38=1;
                }
                break;
            case OctalLiteral:
                {
                alt38=2;
                }
                break;
            case DecimalLiteral:
                {
                alt38=3;
                }
                break;
            case HexLiteral:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:500:4: x= BinaryLiteral
                    {
                    dbg.location(500,5);
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue2008); 
                    dbg.location(501,3);
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:502:4: x= OctalLiteral
                    {
                    dbg.location(502,5);
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue2019); 
                    dbg.location(503,3);
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:504:4: x= DecimalLiteral
                    {
                    dbg.location(504,5);
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue2030); 
                    dbg.location(505,3);
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:506:4: x= HexLiteral
                    {
                    dbg.location(506,5);
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue2041); 
                    dbg.location(507,3);
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
        dbg.location(508, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "integerValue"


    // $ANTLR start "percentValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:510:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final double percentValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try { dbg.enterRule(getGrammarFileName(), "percentValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(510, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:511:2: (x= numericValue PERCENT )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:511:4: x= numericValue PERCENT
            {
            dbg.location(511,5);
            pushFollow(FOLLOW_numericValue_in_percentValue2062);
            x=numericValue();

            state._fsp--;

            dbg.location(511,19);
            match(input,PERCENT,FOLLOW_PERCENT_in_percentValue2064); 
            dbg.location(512,3);
            r = x;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(513, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "percentValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return r;
    }
    // $ANTLR end "percentValue"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\5\1\2\1\112\1\6\1\2\1\122\4\3\2\uffff";
    static final String DFA4_maxS =
        "\1\5\1\2\1\112\1\6\1\2\1\125\4\7\2\uffff";
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
            return "126:1: defineCommand : ( ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue ) ) | ^( DEFINE name= Identifier ^( COMMAND cmd= integerValue PARAMETER par= integerValue ) ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA11_eotS =
        "\16\uffff";
    static final String DFA11_eofS =
        "\16\uffff";
    static final String DFA11_minS =
        "\1\22\1\2\1\16\1\47\1\76\3\uffff\2\47\4\uffff";
    static final String DFA11_maxS =
        "\1\22\1\2\1\17\1\64\1\77\3\uffff\2\64\4\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7";
    static final String DFA11_specialS =
        "\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\13\uffff\1\7\1\6",
            "\1\10\1\11",
            "",
            "",
            "",
            "\1\12\14\uffff\1\13",
            "\1\14\14\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "218:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA13_eotS =
        "\32\uffff";
    static final String DFA13_eofS =
        "\32\uffff";
    static final String DFA13_minS =
        "\1\23\1\2\1\16\1\uffff\1\24\1\70\1\uffff\2\121\3\uffff\12\50\4\uffff";
    static final String DFA13_maxS =
        "\1\23\1\2\1\27\1\uffff\1\25\1\72\1\uffff\2\125\3\uffff\12\62\4\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\1\2\uffff\1\11\2\uffff\1\6\1\7\1\10\12\uffff\1\2\1\4"+
        "\1\5\1\3";
    static final String DFA13_specialS =
        "\32\uffff}>";
    static final String[] DFA13_transitionS = {
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
            "\6\26\4\uffff\1\27",
            "\6\26\4\uffff\1\27",
            "\6\26\4\uffff\1\27",
            "\6\26\4\uffff\1\27",
            "\6\26\4\uffff\1\27",
            "\6\31\4\uffff\1\30",
            "\6\31\4\uffff\1\30",
            "\6\31\4\uffff\1\30",
            "\6\31\4\uffff\1\30",
            "\6\31\4\uffff\1\30",
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
            return "253:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA20_eotS =
        "\36\uffff";
    static final String DFA20_eofS =
        "\36\uffff";
    static final String DFA20_minS =
        "\1\30\1\2\1\121\5\42\3\31\5\42\3\uffff\3\31\5\42\3\31";
    static final String DFA20_maxS =
        "\1\30\1\2\1\125\5\44\3\125\5\44\3\uffff\3\125\5\44\3\33";
    static final String DFA20_acceptS =
        "\20\uffff\1\1\1\3\1\2\13\uffff";
    static final String DFA20_specialS =
        "\36\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\12\1\11",
            "\1\10\1\12\1\11",
            "\1\10\1\12\1\11",
            "\1\10\1\12\1\11",
            "\1\10\1\12\1\11",
            "\1\20\1\22\1\21\65\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\20\1\22\1\21\65\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\20\1\22\1\21\65\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\23\1\24\1\25",
            "\1\23\1\24\1\25",
            "\1\23\1\24\1\25",
            "\1\23\1\24\1\25",
            "\1\23\1\24\1\25",
            "",
            "",
            "",
            "\1\20\1\22\1\21\65\uffff\1\32\1\26\1\27\1\30\1\31",
            "\1\20\1\22\1\21\65\uffff\1\32\1\26\1\27\1\30\1\31",
            "\1\20\1\22\1\21\65\uffff\1\32\1\26\1\27\1\30\1\31",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\20\1\22\1\21",
            "\1\20\1\22\1\21",
            "\1\20\1\22\1\21"
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
            return "274:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\1\14\1\2\1\16\1\100\1\56\4\3\6\uffff";
    static final String DFA23_maxS =
        "\1\14\1\2\1\17\1\125\1\57\1\103\1\101\1\103\1\101\6\uffff";
    static final String DFA23_acceptS =
        "\11\uffff\1\4\1\5\1\6\1\3\1\2\1\1";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\1\7\1\6\1\10\15\uffff\5\11",
            "\1\12\1\13",
            "\1\16\74\uffff\1\14\1\uffff\2\15",
            "\1\16\74\uffff\2\14",
            "\1\16\75\uffff\1\14\2\15",
            "\1\16\74\uffff\2\14",
            "",
            "",
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
            return "292:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA27_eotS =
        "\23\uffff";
    static final String DFA27_eofS =
        "\23\uffff";
    static final String DFA27_minS =
        "\1\40\1\2\1\121\5\45\3\100\5\43\2\uffff\1\100";
    static final String DFA27_maxS =
        "\1\40\1\2\1\125\5\46\1\125\2\101\5\43\2\uffff\1\101";
    static final String DFA27_acceptS =
        "\20\uffff\1\2\1\1\1\uffff";
    static final String DFA27_specialS =
        "\23\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\21\1\20\17\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\21\1\20",
            "\1\21\1\20",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "",
            "",
            "\1\21\1\20"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "351:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA28_eotS =
        "\23\uffff";
    static final String DFA28_eofS =
        "\23\uffff";
    static final String DFA28_minS =
        "\1\41\1\2\1\121\5\45\3\102\2\uffff\5\43\1\102";
    static final String DFA28_maxS =
        "\1\41\1\2\1\125\5\46\1\125\2\103\2\uffff\5\43\1\103";
    static final String DFA28_acceptS =
        "\13\uffff\1\2\1\1\6\uffff";
    static final String DFA28_specialS =
        "\23\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\14\1\13\15\uffff\1\21\1\15\1\16\1\17\1\20",
            "\1\14\1\13",
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
            return "358:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA30_eotS =
        "\14\uffff";
    static final String DFA30_eofS =
        "\14\uffff";
    static final String DFA30_minS =
        "\1\121\5\50\6\uffff";
    static final String DFA30_maxS =
        "\1\125\5\55\6\uffff";
    static final String DFA30_acceptS =
        "\6\uffff\1\6\1\2\1\4\1\5\1\1\1\3";
    static final String DFA30_specialS =
        "\14\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\12\1\7\1\13\1\10\1\11\1\6",
            "\1\12\1\7\1\13\1\10\1\11\1\6",
            "\1\12\1\7\1\13\1\10\1\11\1\6",
            "\1\12\1\7\1\13\1\10\1\11\1\6",
            "\1\12\1\7\1\13\1\10\1\11\1\6",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "378:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\121\5\65\6\uffff";
    static final String DFA31_maxS =
        "\1\125\5\75\6\uffff";
    static final String DFA31_acceptS =
        "\6\uffff\1\2\1\6\1\4\1\1\1\5\1\3";
    static final String DFA31_specialS =
        "\14\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\11\1\6\1\13\3\uffff\1\10\1\12\1\7",
            "\1\11\1\6\1\13\3\uffff\1\10\1\12\1\7",
            "\1\11\1\6\1\13\3\uffff\1\10\1\12\1\7",
            "\1\11\1\6\1\13\3\uffff\1\10\1\12\1\7",
            "\1\11\1\6\1\13\3\uffff\1\10\1\12\1\7",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "401:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA32_eotS =
        "\20\uffff";
    static final String DFA32_eofS =
        "\20\uffff";
    static final String DFA32_minS =
        "\1\121\5\50\4\42\1\53\1\42\3\uffff\1\42";
    static final String DFA32_maxS =
        "\1\125\5\55\4\44\1\53\1\44\3\uffff\1\44";
    static final String DFA32_acceptS =
        "\14\uffff\1\3\1\1\1\2\1\uffff";
    static final String DFA32_specialS =
        "\20\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\11\1\13\1\12\1\10\1\7\1\6",
            "\1\11\1\13\1\12\1\10\1\7\1\6",
            "\1\11\1\13\1\12\1\10\1\7\1\6",
            "\1\11\1\13\1\12\1\10\1\7\1\6",
            "\1\11\1\13\1\12\1\10\1\7\1\6",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\15\1\16\1\14",
            "\1\17",
            "\1\15\1\16\1\14",
            "",
            "",
            "",
            "\1\15\1\16\1\14"
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
            return "417:1: convertSpeed returns [double r] : (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA33_eotS =
        "\12\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\1\121\5\45\1\uffff\1\3\2\uffff";
    static final String DFA33_maxS =
        "\1\125\5\46\1\uffff\1\125\2\uffff";
    static final String DFA33_acceptS =
        "\6\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\12\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\10\1\6",
            "",
            "\1\10\74\uffff\4\10\15\uffff\5\11",
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
            return "433:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE min= numericValue MINUTE | x= numericValue RADIAN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA36_eotS =
        "\17\uffff";
    static final String DFA36_eofS =
        "\17\uffff";
    static final String DFA36_minS =
        "\3\100\1\101\1\100\1\102\2\uffff\1\102\6\uffff";
    static final String DFA36_maxS =
        "\1\103\1\100\3\101\1\103\2\uffff\1\103\6\uffff";
    static final String DFA36_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\6\1\7\1\1\1\10\1\4\1\5";
    static final String DFA36_specialS =
        "\17\uffff}>";
    static final String[] DFA36_transitionS = {
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
            return "467:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
    public static final BitSet FOLLOW_PARAMETER_in_defineCommand139 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineSensor161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineSensor165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SENSOR_in_defineSensor168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineSensor172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint194 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypoint198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand242 = new BitSet(new long[]{0x00000080D10F1008L});
    public static final BitSet FOLLOW_time_in_flyCommandValue259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOITER_in_loiterCommand311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand313 = new BitSet(new long[]{0x00000080F10F1008L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand376 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand378 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_PARAMETER_in_executeCommandParameter395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_pitch422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_roll443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude464 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude466 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude483 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude485 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude502 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude519 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude521 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude523 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude540 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude542 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude544 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude561 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude563 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude565 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude582 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude584 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude586 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance626 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertDistance_in_distance630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance643 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertDistance_in_distance647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RADIUS_in_radius664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_radius668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_speed689 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed706 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FASTER_in_speed708 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed725 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SLOWER_in_speed727 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FASTER_in_speed746 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_percentValue_in_speed750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed759 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SLOWER_in_speed761 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_percentValue_in_speed765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed774 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_MINIMUM_in_speed776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed789 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_CRUISE_in_speed791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed804 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_MAXIMUM_in_speed806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THROTTLE_in_speed819 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertThrottle_in_speed823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time846 = new BitSet(new long[]{0x0000000002000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_time851 = new BitSet(new long[]{0x0000000002000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_time856 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AM_in_time862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time881 = new BitSet(new long[]{0x0000000004000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_time886 = new BitSet(new long[]{0x0000000004000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_time891 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PM_in_time897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time916 = new BitSet(new long[]{0x0000000008000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_time921 = new BitSet(new long[]{0x0000000008000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_time926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_HOUR24_in_time932 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DURATION_in_duration949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_duration953 = new BitSet(new long[]{0x0000000000000008L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_duration958 = new BitSet(new long[]{0x0000000000000008L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertTime_in_duration963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction988 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_convertCardinalDirection_in_direction992 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_convertOrdinalDirection_in_direction1009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1022 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_convertSubOrdinalDirection_in_direction1026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction1039 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1056 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LEFT_in_direction1058 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction1073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction1075 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RIGHT_in_direction1077 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_convertAngle_in_direction1081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1100 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LEFT_in_turnDirection1102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1115 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RIGHT_in_turnDirection1117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1136 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOCKWISE_in_loiterDirection1138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1151 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint1195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitude_in_geoCoordinate1223 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_longitude_in_geoCoordinate1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NORTH_in_latitude1258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_latitude1275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_longitude1302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_longitude1319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1344 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_HOUR_in_convertTime1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1357 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1370 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertTime1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1394 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistance1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1407 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_METER_in_convertDistance1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1420 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistance1422 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1435 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1448 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_YARD_in_convertDistance1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1461 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_FOOT_in_convertDistance1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1513 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressure1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1526 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressure1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1539 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressure1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1552 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BAR_in_convertPressure1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1565 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressure1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1578 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressure1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1602 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_HOUR_in_convertSpeed1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1615 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertSpeed1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1628 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertSpeed1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_convertThrottle1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1674 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1687 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1689 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1693 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1706 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertCardinalDirection1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertCardinalDirection1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertCardinalDirection1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertCardinalDirection1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection1797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_convertDirection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue2062 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue2064 = new BitSet(new long[]{0x0000000000000002L});

}