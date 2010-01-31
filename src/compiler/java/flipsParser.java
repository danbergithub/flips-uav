// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flips.g 2010-01-31 07:31:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class flipsParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'def'", "'define'", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'spd'", "'speed'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'¡'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
    };
    public static final int DIRECTION=11;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=13;
    public static final int T__262=262;
    public static final int T__160=160;
    public static final int T__263=263;
    public static final int GEOCOORDINATE=30;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=64;
    public static final int T__264=264;
    public static final int FOOT=44;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int HECTOPASCAL=53;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__94=94;
    public static final int DISTANCE=38;
    public static final int FASTER=19;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=74;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int MINIMUM=55;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int KILOMETER=39;
    public static final int T__255=255;
    public static final int EQ=67;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int GE=72;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int YARD=43;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=76;
    public static final int DURATION=27;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int CRUISE=57;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=91;
    public static final int T__129=129;
    public static final int OPTIMAL=21;
    public static final int BinaryLiteral=81;
    public static final int BinaryDigit=88;
    public static final int THROTTLE=22;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=80;
    public static final int T__268=268;
    public static final int GT=70;
    public static final int T__271=271;
    public static final int METER=40;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=28;
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
    public static final int EXECUTE=10;
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
    public static final int HexDigit=89;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=29;
    public static final int TIME=23;
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
    public static final int LEFT=45;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=50;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int AM=24;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=84;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=75;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=16;
    public static final int RIGHT=46;
    public static final int RELATIVE=14;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int EAST=65;
    public static final int T__100=100;
    public static final int HOUR=33;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=17;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=86;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=41;
    public static final int T__227=227;
    public static final int NonZeroDigit=87;
    public static final int NORTH=63;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=62;
    public static final int T__230=230;
    public static final int LT=69;
    public static final int OctalLiteral=82;
    public static final int LATITUDE=31;
    public static final int ATMOSPHERE=60;
    public static final int Identifier=73;
    public static final int COMMAND=6;
    public static final int Comment=92;
    public static final int MILLIBAR=59;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=48;
    public static final int FlightLevel=77;
    public static final int NE=68;
    public static final int SECOND=35;
    public static final int CLIMB=61;
    public static final int ROLL=15;
    public static final int HOUR24=26;
    public static final int RADIAN=37;
    public static final int PASCAL=54;
    public static final int DEGREE=36;
    public static final int TURN=12;
    public static final int SLOWER=20;
    public static final int T__200=200;
    public static final int FLY=8;
    public static final int T__201=201;
    public static final int PM=25;
    public static final int LONGITUDE=32;
    public static final int PRESSURE=51;
    public static final int MILE=42;
    public static final int LineComment=93;
    public static final int Exponent=90;
    public static final int DEFINE=5;
    public static final int WEST=66;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int SPEED=18;
    public static final int T__190=190;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=49;
    public static final int T__189=189;
    public static final int Heading=79;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=85;
    public static final int DecimalLiteral=83;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int Turning=78;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=52;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=47;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=9;
    public static final int MAXIMUM=56;
    public static final int MINUTE=34;
    public static final int T__169=169;
    public static final int LE=71;
    public static final int BAR=58;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "throttleValue", "geoCoordinate", "defineWaypointValue", 
        "ordinalDirection", "second", "throttleSpeed", "direction", "speedUnit", 
        "loiterCommand", "defineCommandValue", "optimalSpeed", "flyCommand", 
        "distance", "turnCommand", "relativeSpeed", "durationValue", "numericValue", 
        "time", "upDownDirection", "command", "fixedAltitude", "relativeAltitude", 
        "latitudeLongitudeValue", "timeUnit", "distanceUnit", "distanceValue", 
        "altitudeValue", "turnCommandValue", "pressureUnit", "hour", "pressureValue", 
        "subOrdinalDirection", "roll", "speedValue", "relativeDirection", 
        "duration", "flyCommandValue", "pitch", "fixedSpeed", "latitudeLongitude", 
        "altitude", "clockDirection", "integerValue", "cardinalDirection", 
        "leftRightDirection", "loiterDirection", "angularValue", "defineWaypoint", 
        "fixedDirection", "northSouthDirection", "timeFormat", "eastWestDirection", 
        "percentValue", "radius", "speed", "minute", "flightPlan", "define", 
        "executeCommand", "waypoint", "optimalUnit", "loiterCommandValue", 
        "defineCommand"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public flipsParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public flipsParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public flipsParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return flipsParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/compiler/flips.g"; }


    public static class flightPlan_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flightPlan"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:108:1: flightPlan : ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.command_return command2 = null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try { dbg.enterRule(getGrammarFileName(), "flightPlan");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:2: ( ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:4: ( define )* ( command )*
            {
            dbg.location(109,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:4: ( define )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=94 && LA1_0<=95)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:4: define
            	    {
            	    dbg.location(109,4);
            	    pushFollow(FOLLOW_define_in_flightPlan396);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(109,12);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:12: ( command )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=107 && LA2_0<=112)) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:12: command
            	    {
            	    dbg.location(109,12);
            	    pushFollow(FOLLOW_command_in_flightPlan399);
            	    command2=command();

            	    state._fsp--;

            	    stream_command.add(command2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}



            // AST REWRITE
            // elements: command, define
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:2: -> ^( FLIGHTPLAN ( define )* ( command )* )
            {
                dbg.location(110,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:5: ^( FLIGHTPLAN ( define )* ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(110,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                dbg.location(110,18);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:18: ( define )*
                while ( stream_define.hasNext() ) {
                    dbg.location(110,18);
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                dbg.location(110,26);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:26: ( command )*
                while ( stream_command.hasNext() ) {
                    dbg.location(110,26);
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(111, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flightPlan");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "flightPlan"

    public static class define_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "define"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:115:1: define : ( defineCommand | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineWaypoint_return defineWaypoint4 = null;



        try { dbg.enterRule(getGrammarFileName(), "define");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:116:2: ( defineCommand | defineWaypoint )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==94) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=96 && LA3_1<=98)) ) {
                    alt3=1;
                }
                else if ( ((LA3_1>=104 && LA3_1<=106)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA3_0==95) ) {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=96 && LA3_2<=98)) ) {
                    alt3=1;
                }
                else if ( ((LA3_2>=104 && LA3_2<=106)) ) {
                    alt3=2;
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
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:116:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(116,4);
                    pushFollow(FOLLOW_defineCommand_in_define426);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:117:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(117,4);
                    pushFollow(FOLLOW_defineWaypoint_in_define431);
                    defineWaypoint4=defineWaypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, defineWaypoint4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(118, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "define");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "define"

    public static class defineCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:120:1: defineCommand : ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
    public final flipsParser.defineCommand_return defineCommand() throws RecognitionException {
        flipsParser.defineCommand_return retval = new flipsParser.defineCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token string_literal9=null;
        flipsParser.defineCommandValue_return defineCommandValue10 = null;


        CommonTree string_literal5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try { dbg.enterRule(getGrammarFileName(), "defineCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:2: ( ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:4: ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            dbg.location(121,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:4: ( 'def' | 'define' )
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==94) ) {
                alt4=1;
            }
            else if ( (LA4_0==95) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:5: 'def'
                    {
                    dbg.location(121,5);
                    string_literal5=(Token)match(input,94,FOLLOW_94_in_defineCommand443);  
                    stream_94.add(string_literal5);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:11: 'define'
                    {
                    dbg.location(121,11);
                    string_literal6=(Token)match(input,95,FOLLOW_95_in_defineCommand445);  
                    stream_95.add(string_literal6);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(121,21);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:21: ( 'cmd' | 'command' | 'commands' )
            int alt5=3;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case 96:
                {
                alt5=1;
                }
                break;
            case 97:
                {
                alt5=2;
                }
                break;
            case 98:
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

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:22: 'cmd'
                    {
                    dbg.location(121,22);
                    string_literal7=(Token)match(input,96,FOLLOW_96_in_defineCommand449);  
                    stream_96.add(string_literal7);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:28: 'command'
                    {
                    dbg.location(121,28);
                    string_literal8=(Token)match(input,97,FOLLOW_97_in_defineCommand451);  
                    stream_97.add(string_literal8);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:38: 'commands'
                    {
                    dbg.location(121,38);
                    string_literal9=(Token)match(input,98,FOLLOW_98_in_defineCommand453);  
                    stream_98.add(string_literal9);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(121,50);
            pushFollow(FOLLOW_defineCommandValue_in_defineCommand456);
            defineCommandValue10=defineCommandValue();

            state._fsp--;

            stream_defineCommandValue.add(defineCommandValue10.getTree());


            // AST REWRITE
            // elements: defineCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:2: -> defineCommandValue
            {
                dbg.location(122,5);
                adaptor.addChild(root_0, stream_defineCommandValue.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(123, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defineCommand"

    public static class defineCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:125:1: defineCommandValue : ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier11=null;
        Token char_literal12=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token Identifier16=null;
        Token char_literal17=null;
        Token Identifier18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token string_literal24=null;
        Token Identifier25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        flipsParser.integerValue_return cmd = null;

        flipsParser.integerValue_return par = null;


        CommonTree Identifier11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree Identifier16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree Identifier18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree Identifier25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try { dbg.enterRule(getGrammarFileName(), "defineCommandValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:2: ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==Identifier) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==99) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2>=BinaryLiteral && LA12_2<=HexLiteral)) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==102) ) {
                            alt12=2;
                        }
                        else if ( (LA12_3==EOF||LA12_3==Identifier||(LA12_3>=94 && LA12_3<=95)||(LA12_3>=100 && LA12_3<=101)||(LA12_3>=107 && LA12_3<=112)) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
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

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:4: Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    {
                    dbg.location(126,4);
                    Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue472);  
                    stream_Identifier.add(Identifier11);

                    dbg.location(126,15);
                    char_literal12=(Token)match(input,99,FOLLOW_99_in_defineCommandValue474);  
                    stream_99.add(char_literal12);

                    dbg.location(126,22);
                    pushFollow(FOLLOW_integerValue_in_defineCommandValue478);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    dbg.location(126,36);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Identifier) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==99) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>=100 && LA8_0<=101)) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue
                    	    {
                    	    dbg.location(126,37);
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:37: ( 'and' | ',' ( 'and' )? )?
                    	    int alt7=3;
                    	    try { dbg.enterSubRule(7);
                    	    try { dbg.enterDecision(7);

                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==100) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==101) ) {
                    	        alt7=2;
                    	    }
                    	    } finally {dbg.exitDecision(7);}

                    	    switch (alt7) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:38: 'and'
                    	            {
                    	            dbg.location(126,38);
                    	            string_literal13=(Token)match(input,100,FOLLOW_100_in_defineCommandValue482);  
                    	            stream_100.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:44: ',' ( 'and' )?
                    	            {
                    	            dbg.location(126,44);
                    	            char_literal14=(Token)match(input,101,FOLLOW_101_in_defineCommandValue484);  
                    	            stream_101.add(char_literal14);

                    	            dbg.location(126,48);
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:48: ( 'and' )?
                    	            int alt6=2;
                    	            try { dbg.enterSubRule(6);
                    	            try { dbg.enterDecision(6);

                    	            int LA6_0 = input.LA(1);

                    	            if ( (LA6_0==100) ) {
                    	                alt6=1;
                    	            }
                    	            } finally {dbg.exitDecision(6);}

                    	            switch (alt6) {
                    	                case 1 :
                    	                    dbg.enterAlt(1);

                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:48: 'and'
                    	                    {
                    	                    dbg.location(126,48);
                    	                    string_literal15=(Token)match(input,100,FOLLOW_100_in_defineCommandValue486);  
                    	                    stream_100.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }
                    	            } finally {dbg.exitSubRule(6);}


                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(7);}

                    	    dbg.location(126,57);
                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue491);  
                    	    stream_Identifier.add(Identifier16);

                    	    dbg.location(126,68);
                    	    char_literal17=(Token)match(input,99,FOLLOW_99_in_defineCommandValue493);  
                    	    stream_99.add(char_literal17);

                    	    dbg.location(126,75);
                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue497);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}



                    // AST REWRITE
                    // elements: cmd, Identifier
                    // token labels: 
                    // rule labels: retval, cmd
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cmd=new RewriteRuleSubtreeStream(adaptor,"rule cmd",cmd!=null?cmd.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 127:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+
                    {
                        dbg.location(127,5);
                        if ( !(stream_cmd.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cmd.hasNext()||stream_Identifier.hasNext() ) {
                            dbg.location(127,5);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:5: ^( DEFINE Identifier ^( COMMAND $cmd) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            dbg.location(127,7);
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            dbg.location(127,14);
                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            dbg.location(127,25);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:25: ^( COMMAND $cmd)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            dbg.location(127,27);
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            dbg.location(127,35);
                            adaptor.addChild(root_2, stream_cmd.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_cmd.reset();
                        stream_Identifier.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    dbg.location(128,4);
                    Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue521);  
                    stream_Identifier.add(Identifier18);

                    dbg.location(128,15);
                    char_literal19=(Token)match(input,99,FOLLOW_99_in_defineCommandValue523);  
                    stream_99.add(char_literal19);

                    dbg.location(128,22);
                    pushFollow(FOLLOW_integerValue_in_defineCommandValue527);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    dbg.location(128,36);
                    char_literal20=(Token)match(input,102,FOLLOW_102_in_defineCommandValue529);  
                    stream_102.add(char_literal20);

                    dbg.location(128,43);
                    pushFollow(FOLLOW_integerValue_in_defineCommandValue533);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    dbg.location(128,57);
                    char_literal21=(Token)match(input,103,FOLLOW_103_in_defineCommandValue535);  
                    stream_103.add(char_literal21);

                    dbg.location(128,61);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Identifier) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==99) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>=100 && LA11_0<=101)) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    dbg.location(128,62);
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt10=3;
                    	    try { dbg.enterSubRule(10);
                    	    try { dbg.enterDecision(10);

                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==100) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==101) ) {
                    	        alt10=2;
                    	    }
                    	    } finally {dbg.exitDecision(10);}

                    	    switch (alt10) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:63: 'and'
                    	            {
                    	            dbg.location(128,63);
                    	            string_literal22=(Token)match(input,100,FOLLOW_100_in_defineCommandValue539);  
                    	            stream_100.add(string_literal22);


                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:69: ',' ( 'and' )?
                    	            {
                    	            dbg.location(128,69);
                    	            char_literal23=(Token)match(input,101,FOLLOW_101_in_defineCommandValue541);  
                    	            stream_101.add(char_literal23);

                    	            dbg.location(128,73);
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:73: ( 'and' )?
                    	            int alt9=2;
                    	            try { dbg.enterSubRule(9);
                    	            try { dbg.enterDecision(9);

                    	            int LA9_0 = input.LA(1);

                    	            if ( (LA9_0==100) ) {
                    	                alt9=1;
                    	            }
                    	            } finally {dbg.exitDecision(9);}

                    	            switch (alt9) {
                    	                case 1 :
                    	                    dbg.enterAlt(1);

                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:73: 'and'
                    	                    {
                    	                    dbg.location(128,73);
                    	                    string_literal24=(Token)match(input,100,FOLLOW_100_in_defineCommandValue543);  
                    	                    stream_100.add(string_literal24);


                    	                    }
                    	                    break;

                    	            }
                    	            } finally {dbg.exitSubRule(9);}


                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(10);}

                    	    dbg.location(128,82);
                    	    Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue548);  
                    	    stream_Identifier.add(Identifier25);

                    	    dbg.location(128,93);
                    	    char_literal26=(Token)match(input,99,FOLLOW_99_in_defineCommandValue550);  
                    	    stream_99.add(char_literal26);

                    	    dbg.location(128,100);
                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue554);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    dbg.location(128,114);
                    	    char_literal27=(Token)match(input,102,FOLLOW_102_in_defineCommandValue556);  
                    	    stream_102.add(char_literal27);

                    	    dbg.location(128,121);
                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue560);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    dbg.location(128,135);
                    	    char_literal28=(Token)match(input,103,FOLLOW_103_in_defineCommandValue562);  
                    	    stream_103.add(char_literal28);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(11);}



                    // AST REWRITE
                    // elements: Identifier, cmd, par
                    // token labels: 
                    // rule labels: par, retval, cmd
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_par=new RewriteRuleSubtreeStream(adaptor,"rule par",par!=null?par.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cmd=new RewriteRuleSubtreeStream(adaptor,"rule cmd",cmd!=null?cmd.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        dbg.location(129,5);
                        if ( !(stream_Identifier.hasNext()||stream_cmd.hasNext()||stream_par.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_cmd.hasNext()||stream_par.hasNext() ) {
                            dbg.location(129,5);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            dbg.location(129,7);
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            dbg.location(129,14);
                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            dbg.location(129,25);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:25: ^( COMMAND $cmd PARAMETER $par)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            dbg.location(129,27);
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            dbg.location(129,35);
                            adaptor.addChild(root_2, stream_cmd.nextTree());
                            dbg.location(129,40);
                            adaptor.addChild(root_2, (CommonTree)adaptor.create(PARAMETER, "PARAMETER"));
                            dbg.location(129,50);
                            adaptor.addChild(root_2, stream_par.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_Identifier.reset();
                        stream_cmd.reset();
                        stream_par.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(130, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineCommandValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defineCommandValue"

    public static class defineWaypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:132:1: defineWaypoint : ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
    public final flipsParser.defineWaypoint_return defineWaypoint() throws RecognitionException {
        flipsParser.defineWaypoint_return retval = new flipsParser.defineWaypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal29=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        Token string_literal33=null;
        flipsParser.defineWaypointValue_return defineWaypointValue34 = null;


        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree string_literal33_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try { dbg.enterRule(getGrammarFileName(), "defineWaypoint");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:2: ( ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:4: ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            dbg.location(133,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:4: ( 'def' | 'define' )
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==94) ) {
                alt13=1;
            }
            else if ( (LA13_0==95) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:5: 'def'
                    {
                    dbg.location(133,5);
                    string_literal29=(Token)match(input,94,FOLLOW_94_in_defineWaypoint598);  
                    stream_94.add(string_literal29);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:11: 'define'
                    {
                    dbg.location(133,11);
                    string_literal30=(Token)match(input,95,FOLLOW_95_in_defineWaypoint600);  
                    stream_95.add(string_literal30);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(133,21);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:21: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt14=3;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            switch ( input.LA(1) ) {
            case 104:
                {
                alt14=1;
                }
                break;
            case 105:
                {
                alt14=2;
                }
                break;
            case 106:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:22: 'wpt'
                    {
                    dbg.location(133,22);
                    string_literal31=(Token)match(input,104,FOLLOW_104_in_defineWaypoint604);  
                    stream_104.add(string_literal31);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:28: 'waypoint'
                    {
                    dbg.location(133,28);
                    string_literal32=(Token)match(input,105,FOLLOW_105_in_defineWaypoint606);  
                    stream_105.add(string_literal32);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:39: 'waypoints'
                    {
                    dbg.location(133,39);
                    string_literal33=(Token)match(input,106,FOLLOW_106_in_defineWaypoint608);  
                    stream_106.add(string_literal33);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(133,52);
            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint611);
            defineWaypointValue34=defineWaypointValue();

            state._fsp--;

            stream_defineWaypointValue.add(defineWaypointValue34.getTree());


            // AST REWRITE
            // elements: defineWaypointValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:2: -> defineWaypointValue
            {
                dbg.location(134,5);
                adaptor.addChild(root_0, stream_defineWaypointValue.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineWaypoint");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defineWaypoint"

    public static class defineWaypointValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypointValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:137:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
    public final flipsParser.defineWaypointValue_return defineWaypointValue() throws RecognitionException {
        flipsParser.defineWaypointValue_return retval = new flipsParser.defineWaypointValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier35=null;
        Token char_literal36=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token string_literal40=null;
        Token Identifier41=null;
        Token char_literal42=null;
        flipsParser.geoCoordinate_return geoCoordinate37 = null;

        flipsParser.geoCoordinate_return geoCoordinate43 = null;


        CommonTree Identifier35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree Identifier41_tree=null;
        CommonTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try { dbg.enterRule(getGrammarFileName(), "defineWaypointValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            dbg.location(138,4);
            Identifier35=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue627);  
            stream_Identifier.add(Identifier35);

            dbg.location(138,15);
            char_literal36=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue629);  
            stream_99.add(char_literal36);

            dbg.location(138,19);
            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue631);
            geoCoordinate37=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate37.getTree());
            dbg.location(138,33);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==Identifier) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==99) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>=100 && LA17_0<=101)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    dbg.location(138,34);
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt16=3;
            	    try { dbg.enterSubRule(16);
            	    try { dbg.enterDecision(16);

            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==100) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==101) ) {
            	        alt16=2;
            	    }
            	    } finally {dbg.exitDecision(16);}

            	    switch (alt16) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:35: 'and'
            	            {
            	            dbg.location(138,35);
            	            string_literal38=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue635);  
            	            stream_100.add(string_literal38);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:41: ',' ( 'and' )?
            	            {
            	            dbg.location(138,41);
            	            char_literal39=(Token)match(input,101,FOLLOW_101_in_defineWaypointValue637);  
            	            stream_101.add(char_literal39);

            	            dbg.location(138,45);
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:45: ( 'and' )?
            	            int alt15=2;
            	            try { dbg.enterSubRule(15);
            	            try { dbg.enterDecision(15);

            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==100) ) {
            	                alt15=1;
            	            }
            	            } finally {dbg.exitDecision(15);}

            	            switch (alt15) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:45: 'and'
            	                    {
            	                    dbg.location(138,45);
            	                    string_literal40=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue639);  
            	                    stream_100.add(string_literal40);


            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(15);}


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(16);}

            	    dbg.location(138,54);
            	    Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue644);  
            	    stream_Identifier.add(Identifier41);

            	    dbg.location(138,65);
            	    char_literal42=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue646);  
            	    stream_99.add(char_literal42);

            	    dbg.location(138,69);
            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue648);
            	    geoCoordinate43=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate43.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}



            // AST REWRITE
            // elements: geoCoordinate, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 139:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                dbg.location(139,5);
                if ( !(stream_geoCoordinate.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_geoCoordinate.hasNext()||stream_Identifier.hasNext() ) {
                    dbg.location(139,5);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:139:5: ^( DEFINE Identifier geoCoordinate )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(139,7);
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    dbg.location(139,14);
                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    dbg.location(139,25);
                    adaptor.addChild(root_1, stream_geoCoordinate.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_geoCoordinate.reset();
                stream_Identifier.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(140, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defineWaypointValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defineWaypointValue"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:144:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand44 = null;

        flipsParser.turnCommand_return turnCommand45 = null;

        flipsParser.loiterCommand_return loiterCommand46 = null;

        flipsParser.executeCommand_return executeCommand47 = null;



        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt18=4;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case 107:
            case 108:
                {
                alt18=1;
                }
                break;
            case 109:
            case 110:
                {
                alt18=2;
                }
                break;
            case 111:
            case 112:
                {
                alt18=3;
                }
                break;
            case Identifier:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(145,4);
                    pushFollow(FOLLOW_flyCommand_in_command675);
                    flyCommand44=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand44.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:146:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(146,4);
                    pushFollow(FOLLOW_turnCommand_in_command680);
                    turnCommand45=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand45.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:147:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(147,4);
                    pushFollow(FOLLOW_loiterCommand_in_command685);
                    loiterCommand46=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand46.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:148:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(148,4);
                    pushFollow(FOLLOW_executeCommand_in_command690);
                    executeCommand47=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand47.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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

        return retval;
    }
    // $ANTLR end "command"

    public static class flyCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flyCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:151:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal48=null;
        Token string_literal49=null;
        flipsParser.flyCommandValue_return flyCommandValue50 = null;


        CommonTree string_literal48_tree=null;
        CommonTree string_literal49_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try { dbg.enterRule(getGrammarFileName(), "flyCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            dbg.location(152,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:4: ( 'fly' | 'go' )
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==107) ) {
                alt19=1;
            }
            else if ( (LA19_0==108) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:5: 'fly'
                    {
                    dbg.location(152,5);
                    string_literal48=(Token)match(input,107,FOLLOW_107_in_flyCommand702);  
                    stream_107.add(string_literal48);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:11: 'go'
                    {
                    dbg.location(152,11);
                    string_literal49=(Token)match(input,108,FOLLOW_108_in_flyCommand704);  
                    stream_108.add(string_literal49);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}

            dbg.location(152,17);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:17: ( flyCommandValue )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=To && LA20_0<=With)||(LA20_0>=Turning && LA20_0<=HexLiteral)||(LA20_0>=113 && LA20_0<=114)||(LA20_0>=116 && LA20_0<=117)||(LA20_0>=119 && LA20_0<=120)||LA20_0==200||(LA20_0>=205 && LA20_0<=253)) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:17: flyCommandValue
            	    {
            	    dbg.location(152,17);
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand707);
            	    flyCommandValue50=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue50.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}



            // AST REWRITE
            // elements: flyCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:2: -> ^( FLY ( flyCommandValue )* )
            {
                dbg.location(153,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:153:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(153,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                dbg.location(153,11);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:153:11: ( flyCommandValue )*
                while ( stream_flyCommandValue.hasNext() ) {
                    dbg.location(153,11);
                    adaptor.addChild(root_1, stream_flyCommandValue.nextTree());

                }
                stream_flyCommandValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(154, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flyCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "flyCommand"

    public static class flyCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flyCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:156:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
    public final flipsParser.flyCommandValue_return flyCommandValue() throws RecognitionException {
        flipsParser.flyCommandValue_return retval = new flipsParser.flyCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To58=null;
        Token string_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        flipsParser.time_return time51 = null;

        flipsParser.direction_return direction52 = null;

        flipsParser.speed_return speed53 = null;

        flipsParser.distance_return distance54 = null;

        flipsParser.pitch_return pitch55 = null;

        flipsParser.roll_return roll56 = null;

        flipsParser.duration_return duration57 = null;

        flipsParser.waypoint_return waypoint59 = null;

        flipsParser.waypoint_return waypoint63 = null;

        flipsParser.altitude_return altitude64 = null;


        CommonTree To58_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try { dbg.enterRule(getGrammarFileName(), "flyCommandValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt24=9;
            try { dbg.enterDecision(24);

            try {
                isCyclicDecision = true;
                alt24 = dfa24.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(157,4);
                    pushFollow(FOLLOW_time_in_flyCommandValue729);
                    time51=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time51.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(158,4);
                    pushFollow(FOLLOW_direction_in_flyCommandValue734);
                    direction52=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction52.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:159:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(159,4);
                    pushFollow(FOLLOW_speed_in_flyCommandValue739);
                    speed53=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed53.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:160:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(160,4);
                    pushFollow(FOLLOW_distance_in_flyCommandValue744);
                    distance54=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance54.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:161:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(161,4);
                    pushFollow(FOLLOW_pitch_in_flyCommandValue749);
                    pitch55=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch55.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:162:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(162,4);
                    pushFollow(FOLLOW_roll_in_flyCommandValue754);
                    roll56=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll56.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:163:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(163,4);
                    pushFollow(FOLLOW_duration_in_flyCommandValue759);
                    duration57=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration57.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    dbg.location(164,4);
                    To58=(Token)match(input,To,FOLLOW_To_in_flyCommandValue764);  
                    stream_To.add(To58);

                    dbg.location(164,7);
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue766);
                    waypoint59=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint59.getTree());
                    dbg.location(164,16);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23);

                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=100 && LA23_0<=101)) ) {
                            alt23=1;
                        }


                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    dbg.location(164,17);
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt22=2;
                    	    try { dbg.enterSubRule(22);
                    	    try { dbg.enterDecision(22);

                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==100) ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0==101) ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;
                    	    }
                    	    } finally {dbg.exitDecision(22);}

                    	    switch (alt22) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:18: 'and'
                    	            {
                    	            dbg.location(164,18);
                    	            string_literal60=(Token)match(input,100,FOLLOW_100_in_flyCommandValue770);  
                    	            stream_100.add(string_literal60);


                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:24: ',' ( 'and' )?
                    	            {
                    	            dbg.location(164,24);
                    	            char_literal61=(Token)match(input,101,FOLLOW_101_in_flyCommandValue772);  
                    	            stream_101.add(char_literal61);

                    	            dbg.location(164,28);
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:28: ( 'and' )?
                    	            int alt21=2;
                    	            try { dbg.enterSubRule(21);
                    	            try { dbg.enterDecision(21);

                    	            int LA21_0 = input.LA(1);

                    	            if ( (LA21_0==100) ) {
                    	                alt21=1;
                    	            }
                    	            } finally {dbg.exitDecision(21);}

                    	            switch (alt21) {
                    	                case 1 :
                    	                    dbg.enterAlt(1);

                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:28: 'and'
                    	                    {
                    	                    dbg.location(164,28);
                    	                    string_literal62=(Token)match(input,100,FOLLOW_100_in_flyCommandValue774);  
                    	                    stream_100.add(string_literal62);


                    	                    }
                    	                    break;

                    	            }
                    	            } finally {dbg.exitSubRule(21);}


                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(22);}

                    	    dbg.location(164,36);
                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue778);
                    	    waypoint63=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(23);}



                    // AST REWRITE
                    // elements: waypoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 165:2: -> ( waypoint )+
                    {
                        dbg.location(165,5);
                        if ( !(stream_waypoint.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_waypoint.hasNext() ) {
                            dbg.location(165,5);
                            adaptor.addChild(root_0, stream_waypoint.nextTree());

                        }
                        stream_waypoint.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:166:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(166,4);
                    pushFollow(FOLLOW_altitude_in_flyCommandValue791);
                    altitude64=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude64.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(167, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "flyCommandValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "flyCommandValue"

    public static class turnCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turnCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal65=null;
        Token string_literal66=null;
        flipsParser.turnCommandValue_return turnCommandValue67 = null;


        CommonTree string_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try { dbg.enterRule(getGrammarFileName(), "turnCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            dbg.location(170,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: ( 'trn' | 'turn' )
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==109) ) {
                alt25=1;
            }
            else if ( (LA25_0==110) ) {
                alt25=2;
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

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:5: 'trn'
                    {
                    dbg.location(170,5);
                    string_literal65=(Token)match(input,109,FOLLOW_109_in_turnCommand803);  
                    stream_109.add(string_literal65);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:11: 'turn'
                    {
                    dbg.location(170,11);
                    string_literal66=(Token)match(input,110,FOLLOW_110_in_turnCommand805);  
                    stream_110.add(string_literal66);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(170,19);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:19: ( turnCommandValue )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=Turning && LA26_0<=Heading)||LA26_0==200||(LA26_0>=206 && LA26_0<=236)) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:19: turnCommandValue
            	    {
            	    dbg.location(170,19);
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand808);
            	    turnCommandValue67=turnCommandValue();

            	    state._fsp--;

            	    stream_turnCommandValue.add(turnCommandValue67.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}



            // AST REWRITE
            // elements: turnCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:2: -> ^( FLY ( turnCommandValue )* )
            {
                dbg.location(171,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(171,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                dbg.location(171,11);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:11: ( turnCommandValue )*
                while ( stream_turnCommandValue.hasNext() ) {
                    dbg.location(171,11);
                    adaptor.addChild(root_1, stream_turnCommandValue.nextTree());

                }
                stream_turnCommandValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(172, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "turnCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "turnCommand"

    public static class turnCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turnCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:174:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction68 = null;



        try { dbg.enterRule(getGrammarFileName(), "turnCommandValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:2: ( direction )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(175,4);
            pushFollow(FOLLOW_direction_in_turnCommandValue830);
            direction68=direction();

            state._fsp--;

            adaptor.addChild(root_0, direction68.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(176, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "turnCommandValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "turnCommandValue"

    public static class loiterCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal69=null;
        Token string_literal70=null;
        flipsParser.loiterCommandValue_return loiterCommandValue71 = null;


        CommonTree string_literal69_tree=null;
        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try { dbg.enterRule(getGrammarFileName(), "loiterCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            dbg.location(179,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:4: ( 'ltr' | 'loiter' )
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==111) ) {
                alt27=1;
            }
            else if ( (LA27_0==112) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:5: 'ltr'
                    {
                    dbg.location(179,5);
                    string_literal69=(Token)match(input,111,FOLLOW_111_in_loiterCommand842);  
                    stream_111.add(string_literal69);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:11: 'loiter'
                    {
                    dbg.location(179,11);
                    string_literal70=(Token)match(input,112,FOLLOW_112_in_loiterCommand844);  
                    stream_112.add(string_literal70);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(179,21);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:21: ( loiterCommandValue )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=To && LA28_0<=With)||LA28_0==Turning||(LA28_0>=FloatingPointLiteral && LA28_0<=HexLiteral)||LA28_0==123||(LA28_0>=144 && LA28_0<=145)||LA28_0==205||(LA28_0>=237 && LA28_0<=247)||(LA28_0>=254 && LA28_0<=257)) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:21: loiterCommandValue
            	    {
            	    dbg.location(179,21);
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand847);
            	    loiterCommandValue71=loiterCommandValue();

            	    state._fsp--;

            	    stream_loiterCommandValue.add(loiterCommandValue71.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}



            // AST REWRITE
            // elements: loiterCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                dbg.location(180,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(180,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                dbg.location(180,14);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:14: ( loiterCommandValue )*
                while ( stream_loiterCommandValue.hasNext() ) {
                    dbg.location(180,14);
                    adaptor.addChild(root_1, stream_loiterCommandValue.nextTree());

                }
                stream_loiterCommandValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(181, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loiterCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "loiterCommand"

    public static class loiterCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
    public final flipsParser.loiterCommandValue_return loiterCommandValue() throws RecognitionException {
        flipsParser.loiterCommandValue_return retval = new flipsParser.loiterCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At77=null;
        flipsParser.time_return time72 = null;

        flipsParser.speed_return speed73 = null;

        flipsParser.loiterDirection_return loiterDirection74 = null;

        flipsParser.radius_return radius75 = null;

        flipsParser.duration_return duration76 = null;

        flipsParser.waypoint_return waypoint78 = null;

        flipsParser.altitude_return altitude79 = null;


        CommonTree At77_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try { dbg.enterRule(getGrammarFileName(), "loiterCommandValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:184:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt29=7;
            try { dbg.enterDecision(29);

            try {
                isCyclicDecision = true;
                alt29 = dfa29.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:184:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(184,4);
                    pushFollow(FOLLOW_time_in_loiterCommandValue869);
                    time72=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time72.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:185:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(185,4);
                    pushFollow(FOLLOW_speed_in_loiterCommandValue874);
                    speed73=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed73.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:186:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(186,4);
                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue879);
                    loiterDirection74=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection74.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(187,4);
                    pushFollow(FOLLOW_radius_in_loiterCommandValue884);
                    radius75=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius75.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:188:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(188,4);
                    pushFollow(FOLLOW_duration_in_loiterCommandValue889);
                    duration76=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration76.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:189:4: At waypoint
                    {
                    dbg.location(189,4);
                    At77=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue894);  
                    stream_At.add(At77);

                    dbg.location(189,7);
                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue896);
                    waypoint78=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint78.getTree());


                    // AST REWRITE
                    // elements: waypoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:2: -> waypoint
                    {
                        dbg.location(190,5);
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(191,4);
                    pushFollow(FOLLOW_altitude_in_loiterCommandValue906);
                    altitude79=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude79.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(192, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loiterCommandValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "loiterCommandValue"

    public static class executeCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "executeCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:194:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier80=null;
        Token Identifier81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        flipsParser.numericValue_return numericValue83 = null;

        flipsParser.numericValue_return numericValue85 = null;


        CommonTree Identifier80_tree=null;
        CommonTree Identifier81_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try { dbg.enterRule(getGrammarFileName(), "executeCommand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt31=2;
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==Identifier) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==102) ) {
                    alt31=2;
                }
                else if ( (LA31_1==EOF||LA31_1==Identifier||(LA31_1>=107 && LA31_1<=112)) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:4: Identifier
                    {
                    dbg.location(195,4);
                    Identifier80=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand917);  
                    stream_Identifier.add(Identifier80);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:2: -> ^( EXECUTE Identifier )
                    {
                        dbg.location(196,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:5: ^( EXECUTE Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(196,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        dbg.location(196,15);
                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    dbg.location(197,4);
                    Identifier81=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand931);  
                    stream_Identifier.add(Identifier81);

                    dbg.location(197,15);
                    char_literal82=(Token)match(input,102,FOLLOW_102_in_executeCommand933);  
                    stream_102.add(char_literal82);

                    dbg.location(197,19);
                    pushFollow(FOLLOW_numericValue_in_executeCommand935);
                    numericValue83=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue83.getTree());
                    dbg.location(197,32);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:32: ( ',' numericValue )*
                    try { dbg.enterSubRule(30);

                    loop30:
                    do {
                        int alt30=2;
                        try { dbg.enterDecision(30);

                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==101) ) {
                            alt30=1;
                        }


                        } finally {dbg.exitDecision(30);}

                        switch (alt30) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:33: ',' numericValue
                    	    {
                    	    dbg.location(197,33);
                    	    char_literal84=(Token)match(input,101,FOLLOW_101_in_executeCommand938);  
                    	    stream_101.add(char_literal84);

                    	    dbg.location(197,37);
                    	    pushFollow(FOLLOW_numericValue_in_executeCommand940);
                    	    numericValue85=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(197,53);
                    char_literal86=(Token)match(input,103,FOLLOW_103_in_executeCommand945);  
                    stream_103.add(char_literal86);



                    // AST REWRITE
                    // elements: numericValue, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        dbg.location(198,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(198,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        dbg.location(198,15);
                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        dbg.location(198,26);
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            dbg.location(198,26);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:26: ^( PARAMETER numericValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            dbg.location(198,28);
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_2);

                            dbg.location(198,38);
                            adaptor.addChild(root_2, stream_numericValue.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_numericValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(199, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "executeCommand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "executeCommand"

    public static class pitch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pitch"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:203:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
    public final flipsParser.pitch_return pitch() throws RecognitionException {
        flipsParser.pitch_return retval = new flipsParser.pitch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal87=null;
        Token string_literal88=null;
        Token With90=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        Token string_literal94=null;
        flipsParser.angularValue_return angularValue89 = null;

        flipsParser.angularValue_return angularValue95 = null;


        CommonTree string_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree With90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal94_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try { dbg.enterRule(getGrammarFileName(), "pitch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt36=2;
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=113 && LA36_0<=114)) ) {
                alt36=1;
            }
            else if ( (LA36_0==With||(LA36_0>=116 && LA36_0<=117)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    dbg.location(204,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:4: ( 'pit' | 'pitch' )
                    int alt32=2;
                    try { dbg.enterSubRule(32);
                    try { dbg.enterDecision(32);

                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==113) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==114) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(32);}

                    switch (alt32) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:5: 'pit'
                            {
                            dbg.location(204,5);
                            string_literal87=(Token)match(input,113,FOLLOW_113_in_pitch975);  
                            stream_113.add(string_literal87);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:11: 'pitch'
                            {
                            dbg.location(204,11);
                            string_literal88=(Token)match(input,114,FOLLOW_114_in_pitch977);  
                            stream_114.add(string_literal88);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(32);}

                    dbg.location(204,20);
                    pushFollow(FOLLOW_angularValue_in_pitch980);
                    angularValue89=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue89.getTree());


                    // AST REWRITE
                    // elements: angularValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 205:2: -> ^( PITCH angularValue )
                    {
                        dbg.location(205,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:205:5: ^( PITCH angularValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(205,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PITCH, "PITCH"), root_1);

                        dbg.location(205,13);
                        adaptor.addChild(root_1, stream_angularValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    dbg.location(206,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:4: ( With 'an' )?
                    int alt33=2;
                    try { dbg.enterSubRule(33);
                    try { dbg.enterDecision(33);

                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==With) ) {
                        alt33=1;
                    }
                    } finally {dbg.exitDecision(33);}

                    switch (alt33) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:5: With 'an'
                            {
                            dbg.location(206,5);
                            With90=(Token)match(input,With,FOLLOW_With_in_pitch995);  
                            stream_With.add(With90);

                            dbg.location(206,10);
                            string_literal91=(Token)match(input,115,FOLLOW_115_in_pitch997);  
                            stream_115.add(string_literal91);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(206,17);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:17: ( 'aoa' | 'angle of attack' )
                    int alt34=2;
                    try { dbg.enterSubRule(34);
                    try { dbg.enterDecision(34);

                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==116) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==117) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(34);}

                    switch (alt34) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:18: 'aoa'
                            {
                            dbg.location(206,18);
                            string_literal92=(Token)match(input,116,FOLLOW_116_in_pitch1002);  
                            stream_116.add(string_literal92);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:24: 'angle of attack'
                            {
                            dbg.location(206,24);
                            string_literal93=(Token)match(input,117,FOLLOW_117_in_pitch1004);  
                            stream_117.add(string_literal93);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(34);}

                    dbg.location(206,43);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:43: ( 'of' )?
                    int alt35=2;
                    try { dbg.enterSubRule(35);
                    try { dbg.enterDecision(35);

                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==118) ) {
                        alt35=1;
                    }
                    } finally {dbg.exitDecision(35);}

                    switch (alt35) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:43: 'of'
                            {
                            dbg.location(206,43);
                            string_literal94=(Token)match(input,118,FOLLOW_118_in_pitch1007);  
                            stream_118.add(string_literal94);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(35);}

                    dbg.location(206,49);
                    pushFollow(FOLLOW_angularValue_in_pitch1010);
                    angularValue95=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue95.getTree());


                    // AST REWRITE
                    // elements: angularValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 207:2: -> ^( PITCH angularValue )
                    {
                        dbg.location(207,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:5: ^( PITCH angularValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(207,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PITCH, "PITCH"), root_1);

                        dbg.location(207,13);
                        adaptor.addChild(root_1, stream_angularValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(208, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pitch");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pitch"

    public static class roll_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roll"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal96=null;
        Token string_literal97=null;
        flipsParser.angularValue_return angularValue98 = null;


        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try { dbg.enterRule(getGrammarFileName(), "roll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:4: ( 'rol' | 'roll' ) angularValue
            {
            dbg.location(211,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:4: ( 'rol' | 'roll' )
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==119) ) {
                alt37=1;
            }
            else if ( (LA37_0==120) ) {
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

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:5: 'rol'
                    {
                    dbg.location(211,5);
                    string_literal96=(Token)match(input,119,FOLLOW_119_in_roll1031);  
                    stream_119.add(string_literal96);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:11: 'roll'
                    {
                    dbg.location(211,11);
                    string_literal97=(Token)match(input,120,FOLLOW_120_in_roll1033);  
                    stream_120.add(string_literal97);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}

            dbg.location(211,19);
            pushFollow(FOLLOW_angularValue_in_roll1036);
            angularValue98=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue98.getTree());


            // AST REWRITE
            // elements: angularValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 212:2: -> ^( ROLL angularValue )
            {
                dbg.location(212,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:212:5: ^( ROLL angularValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(212,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROLL, "ROLL"), root_1);

                dbg.location(212,12);
                adaptor.addChild(root_1, stream_angularValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(213, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "roll");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "roll"

    public static class altitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:217:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude99 = null;

        flipsParser.relativeAltitude_return relativeAltitude100 = null;



        try { dbg.enterRule(getGrammarFileName(), "altitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:2: ( fixedAltitude | relativeAltitude )
            int alt38=2;
            try { dbg.enterDecision(38);

            try {
                isCyclicDecision = true;
                alt38 = dfa38.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(218,4);
                    pushFollow(FOLLOW_fixedAltitude_in_altitude1058);
                    fixedAltitude99=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude99.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:219:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(219,4);
                    pushFollow(FOLLOW_relativeAltitude_in_altitude1063);
                    relativeAltitude100=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude100.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(220, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "altitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "altitude"

    public static class fixedAltitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedAltitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:222:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To102=null;
        Token At103=null;
        Token With104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token char_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        flipsParser.upDownDirection_return upDownDirection101 = null;

        flipsParser.altitudeValue_return altitudeValue112 = null;


        CommonTree To102_tree=null;
        CommonTree At103_tree=null;
        CommonTree With104_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try { dbg.enterRule(getGrammarFileName(), "fixedAltitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            dbg.location(223,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( ( upDownDirection )? To | At | With )
            int alt40=3;
            try { dbg.enterSubRule(40);
            try { dbg.enterDecision(40);

            switch ( input.LA(1) ) {
            case To:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
                {
                alt40=1;
                }
                break;
            case At:
                {
                alt40=2;
                }
                break;
            case With:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: ( upDownDirection )? To
                    {
                    dbg.location(223,5);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: ( upDownDirection )?
                    int alt39=2;
                    try { dbg.enterSubRule(39);
                    try { dbg.enterDecision(39);

                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=237 && LA39_0<=247)) ) {
                        alt39=1;
                    }
                    } finally {dbg.exitDecision(39);}

                    switch (alt39) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: upDownDirection
                            {
                            dbg.location(223,5);
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1075);
                            upDownDirection101=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection101.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(39);}

                    dbg.location(223,22);
                    To102=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1078);  
                    stream_To.add(To102);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:25: At
                    {
                    dbg.location(223,25);
                    At103=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1080);  
                    stream_At.add(At103);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:28: With
                    {
                    dbg.location(223,28);
                    With104=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1082);  
                    stream_With.add(With104);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(40);}

            dbg.location(223,34);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt47=2;
            try { dbg.enterSubRule(47);
            try { dbg.enterDecision(47);

            int LA47_0 = input.LA(1);

            if ( (LA47_0==115||(LA47_0>=121 && LA47_0<=125)) ) {
                alt47=1;
            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    dbg.location(223,35);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt45=2;
                    try { dbg.enterSubRule(45);
                    try { dbg.enterDecision(45);

                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==115||(LA45_0>=121 && LA45_0<=122)) ) {
                        alt45=1;
                    }
                    else if ( ((LA45_0>=123 && LA45_0<=125)) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(45);}

                    switch (alt45) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            dbg.location(223,36);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:36: ( 'an' )?
                            int alt41=2;
                            try { dbg.enterSubRule(41);
                            try { dbg.enterDecision(41);

                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==115) ) {
                                alt41=1;
                            }
                            } finally {dbg.exitDecision(41);}

                            switch (alt41) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:36: 'an'
                                    {
                                    dbg.location(223,36);
                                    string_literal105=(Token)match(input,115,FOLLOW_115_in_fixedAltitude1087);  
                                    stream_115.add(string_literal105);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(41);}

                            dbg.location(223,42);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:42: ( 'alt' | 'altitude' )
                            int alt42=2;
                            try { dbg.enterSubRule(42);
                            try { dbg.enterDecision(42);

                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==121) ) {
                                alt42=1;
                            }
                            else if ( (LA42_0==122) ) {
                                alt42=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(42);}

                            switch (alt42) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:43: 'alt'
                                    {
                                    dbg.location(223,43);
                                    string_literal106=(Token)match(input,121,FOLLOW_121_in_fixedAltitude1091);  
                                    stream_121.add(string_literal106);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:49: 'altitude'
                                    {
                                    dbg.location(223,49);
                                    string_literal107=(Token)match(input,122,FOLLOW_122_in_fixedAltitude1093);  
                                    stream_122.add(string_literal107);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(42);}


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            dbg.location(223,61);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:61: ( 'a' )?
                            int alt43=2;
                            try { dbg.enterSubRule(43);
                            try { dbg.enterDecision(43);

                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==123) ) {
                                alt43=1;
                            }
                            } finally {dbg.exitDecision(43);}

                            switch (alt43) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:61: 'a'
                                    {
                                    dbg.location(223,61);
                                    char_literal108=(Token)match(input,123,FOLLOW_123_in_fixedAltitude1096);  
                                    stream_123.add(char_literal108);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(43);}

                            dbg.location(223,66);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:66: ( 'pres' | 'pressure' )
                            int alt44=2;
                            try { dbg.enterSubRule(44);
                            try { dbg.enterDecision(44);

                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==124) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==125) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(44);}

                            switch (alt44) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:67: 'pres'
                                    {
                                    dbg.location(223,67);
                                    string_literal109=(Token)match(input,124,FOLLOW_124_in_fixedAltitude1100);  
                                    stream_124.add(string_literal109);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:74: 'pressure'
                                    {
                                    dbg.location(223,74);
                                    string_literal110=(Token)match(input,125,FOLLOW_125_in_fixedAltitude1102);  
                                    stream_125.add(string_literal110);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(44);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(45);}

                    dbg.location(223,87);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:87: ( 'of' )?
                    int alt46=2;
                    try { dbg.enterSubRule(46);
                    try { dbg.enterDecision(46);

                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==118) ) {
                        alt46=1;
                    }
                    } finally {dbg.exitDecision(46);}

                    switch (alt46) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:87: 'of'
                            {
                            dbg.location(223,87);
                            string_literal111=(Token)match(input,118,FOLLOW_118_in_fixedAltitude1106);  
                            stream_118.add(string_literal111);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(46);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(47);}

            dbg.location(223,95);
            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1111);
            altitudeValue112=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue112.getTree());


            // AST REWRITE
            // elements: altitudeValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 224:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                dbg.location(224,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:224:5: ^( ALTITUDE FIXED altitudeValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(224,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALTITUDE, "ALTITUDE"), root_1);

                dbg.location(224,16);
                adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                dbg.location(224,22);
                adaptor.addChild(root_1, stream_altitudeValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(225, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fixedAltitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fixedAltitude"

    public static class relativeAltitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeAltitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:227:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection113 = null;

        flipsParser.altitudeValue_return altitudeValue114 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try { dbg.enterRule(getGrammarFileName(), "relativeAltitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(227, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:228:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:228:4: upDownDirection altitudeValue
            {
            dbg.location(228,4);
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1133);
            upDownDirection113=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection113.getTree());
            dbg.location(228,20);
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1135);
            altitudeValue114=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue114.getTree());


            // AST REWRITE
            // elements: altitudeValue, upDownDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 229:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                dbg.location(229,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:229:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(229,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALTITUDE, "ALTITUDE"), root_1);

                dbg.location(229,16);
                adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                dbg.location(229,25);
                adaptor.addChild(root_1, stream_upDownDirection.nextTree());
                dbg.location(229,41);
                adaptor.addChild(root_1, stream_altitudeValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(230, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relativeAltitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relativeAltitude"

    public static class altitudeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitudeValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:232:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel117=null;
        flipsParser.distanceValue_return distanceValue115 = null;

        flipsParser.pressureValue_return pressureValue116 = null;


        CommonTree FlightLevel117_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try { dbg.enterRule(getGrammarFileName(), "altitudeValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:233:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt48=3;
            try { dbg.enterDecision(48);

            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=146 && LA48_1<=163)) ) {
                    alt48=1;
                }
                else if ( ((LA48_1>=126 && LA48_1<=143)) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA48_2 = input.LA(2);

                if ( ((LA48_2>=146 && LA48_2<=163)) ) {
                    alt48=1;
                }
                else if ( ((LA48_2>=126 && LA48_2<=143)) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case FlightLevel:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:233:4: distanceValue
                    {
                    dbg.location(233,4);
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1159);
                    distanceValue115=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue115.getTree());


                    // AST REWRITE
                    // elements: distanceValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:2: -> DISTANCE distanceValue
                    {
                        dbg.location(234,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        dbg.location(234,14);
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: pressureValue
                    {
                    dbg.location(235,4);
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1171);
                    pressureValue116=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue116.getTree());


                    // AST REWRITE
                    // elements: pressureValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:2: -> PRESSURE pressureValue
                    {
                        dbg.location(236,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        dbg.location(236,14);
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:237:4: FlightLevel
                    {
                    dbg.location(237,4);
                    FlightLevel117=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1183);  
                    stream_FlightLevel.add(FlightLevel117);



                    // AST REWRITE
                    // elements: FlightLevel
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:2: -> FLIGHTLEVEL FlightLevel
                    {
                        dbg.location(238,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FLIGHTLEVEL, "FLIGHTLEVEL"));
                        dbg.location(238,17);
                        adaptor.addChild(root_0, stream_FlightLevel.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(239, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "altitudeValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "altitudeValue"

    public static class pressureValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pressureValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue118 = null;

        flipsParser.pressureUnit_return pressureUnit119 = null;



        try { dbg.enterRule(getGrammarFileName(), "pressureValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:242:2: ( numericValue pressureUnit )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:242:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(242,4);
            pushFollow(FOLLOW_numericValue_in_pressureValue1201);
            numericValue118=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue118.getTree());
            dbg.location(242,17);
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1203);
            pressureUnit119=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit119.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(243, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pressureValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pressureValue"

    public static class pressureUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pressureUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:245:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        Token string_literal130=null;
        Token string_literal131=null;
        Token string_literal132=null;
        Token string_literal133=null;
        Token string_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token string_literal137=null;

        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree string_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree string_literal137_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try { dbg.enterRule(getGrammarFileName(), "pressureUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt55=6;
            try { dbg.enterDecision(55);

            switch ( input.LA(1) ) {
            case 126:
            case 127:
            case 128:
                {
                alt55=1;
                }
                break;
            case 129:
            case 130:
            case 131:
                {
                alt55=2;
                }
                break;
            case 132:
            case 133:
            case 134:
                {
                alt55=3;
                }
                break;
            case 135:
            case 136:
                {
                alt55=4;
                }
                break;
            case 137:
            case 138:
            case 139:
                {
                alt55=5;
                }
                break;
            case 140:
            case 141:
            case 142:
            case 143:
                {
                alt55=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    dbg.location(246,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt49=3;
                    try { dbg.enterSubRule(49);
                    try { dbg.enterDecision(49);

                    switch ( input.LA(1) ) {
                    case 126:
                        {
                        alt49=1;
                        }
                        break;
                    case 127:
                        {
                        alt49=2;
                        }
                        break;
                    case 128:
                        {
                        alt49=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(49);}

                    switch (alt49) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:5: 'kpa'
                            {
                            dbg.location(246,5);
                            string_literal120=(Token)match(input,126,FOLLOW_126_in_pressureUnit1215);  
                            stream_126.add(string_literal120);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:11: 'kilopascal'
                            {
                            dbg.location(246,11);
                            string_literal121=(Token)match(input,127,FOLLOW_127_in_pressureUnit1217);  
                            stream_127.add(string_literal121);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:24: 'kilopascals'
                            {
                            dbg.location(246,24);
                            string_literal122=(Token)match(input,128,FOLLOW_128_in_pressureUnit1219);  
                            stream_128.add(string_literal122);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(49);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 247:2: -> KILOPASCAL
                    {
                        dbg.location(247,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    dbg.location(248,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt50=3;
                    try { dbg.enterSubRule(50);
                    try { dbg.enterDecision(50);

                    switch ( input.LA(1) ) {
                    case 129:
                        {
                        alt50=1;
                        }
                        break;
                    case 130:
                        {
                        alt50=2;
                        }
                        break;
                    case 131:
                        {
                        alt50=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(50);}

                    switch (alt50) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:5: 'hpa'
                            {
                            dbg.location(248,5);
                            string_literal123=(Token)match(input,129,FOLLOW_129_in_pressureUnit1231);  
                            stream_129.add(string_literal123);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:11: 'hectopascal'
                            {
                            dbg.location(248,11);
                            string_literal124=(Token)match(input,130,FOLLOW_130_in_pressureUnit1233);  
                            stream_130.add(string_literal124);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:25: 'hectopascals'
                            {
                            dbg.location(248,25);
                            string_literal125=(Token)match(input,131,FOLLOW_131_in_pressureUnit1235);  
                            stream_131.add(string_literal125);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(50);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 249:2: -> HECTOPASCAL
                    {
                        dbg.location(249,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    dbg.location(250,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt51=3;
                    try { dbg.enterSubRule(51);
                    try { dbg.enterDecision(51);

                    switch ( input.LA(1) ) {
                    case 132:
                        {
                        alt51=1;
                        }
                        break;
                    case 133:
                        {
                        alt51=2;
                        }
                        break;
                    case 134:
                        {
                        alt51=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(51);}

                    switch (alt51) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:5: 'pa'
                            {
                            dbg.location(250,5);
                            string_literal126=(Token)match(input,132,FOLLOW_132_in_pressureUnit1247);  
                            stream_132.add(string_literal126);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:10: 'pascal'
                            {
                            dbg.location(250,10);
                            string_literal127=(Token)match(input,133,FOLLOW_133_in_pressureUnit1249);  
                            stream_133.add(string_literal127);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:19: 'pascals'
                            {
                            dbg.location(250,19);
                            string_literal128=(Token)match(input,134,FOLLOW_134_in_pressureUnit1251);  
                            stream_134.add(string_literal128);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(51);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 251:2: -> PASCAL
                    {
                        dbg.location(251,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:4: ( 'bar' | 'bars' )
                    {
                    dbg.location(252,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:4: ( 'bar' | 'bars' )
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==135) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==136) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:5: 'bar'
                            {
                            dbg.location(252,5);
                            string_literal129=(Token)match(input,135,FOLLOW_135_in_pressureUnit1263);  
                            stream_135.add(string_literal129);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:11: 'bars'
                            {
                            dbg.location(252,11);
                            string_literal130=(Token)match(input,136,FOLLOW_136_in_pressureUnit1265);  
                            stream_136.add(string_literal130);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 253:2: -> BAR
                    {
                        dbg.location(253,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    dbg.location(254,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt53=3;
                    try { dbg.enterSubRule(53);
                    try { dbg.enterDecision(53);

                    switch ( input.LA(1) ) {
                    case 137:
                        {
                        alt53=1;
                        }
                        break;
                    case 138:
                        {
                        alt53=2;
                        }
                        break;
                    case 139:
                        {
                        alt53=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(53);}

                    switch (alt53) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:5: 'mbar'
                            {
                            dbg.location(254,5);
                            string_literal131=(Token)match(input,137,FOLLOW_137_in_pressureUnit1277);  
                            stream_137.add(string_literal131);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:12: 'millibar'
                            {
                            dbg.location(254,12);
                            string_literal132=(Token)match(input,138,FOLLOW_138_in_pressureUnit1279);  
                            stream_138.add(string_literal132);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:23: 'millibars'
                            {
                            dbg.location(254,23);
                            string_literal133=(Token)match(input,139,FOLLOW_139_in_pressureUnit1281);  
                            stream_139.add(string_literal133);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(53);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 255:2: -> MILLIBAR
                    {
                        dbg.location(255,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    dbg.location(256,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt54=4;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    switch ( input.LA(1) ) {
                    case 140:
                        {
                        alt54=1;
                        }
                        break;
                    case 141:
                        {
                        alt54=2;
                        }
                        break;
                    case 142:
                        {
                        alt54=3;
                        }
                        break;
                    case 143:
                        {
                        alt54=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:5: 'atm'
                            {
                            dbg.location(256,5);
                            string_literal134=(Token)match(input,140,FOLLOW_140_in_pressureUnit1293);  
                            stream_140.add(string_literal134);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:11: 'atms'
                            {
                            dbg.location(256,11);
                            string_literal135=(Token)match(input,141,FOLLOW_141_in_pressureUnit1295);  
                            stream_141.add(string_literal135);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:18: 'atmosphere'
                            {
                            dbg.location(256,18);
                            string_literal136=(Token)match(input,142,FOLLOW_142_in_pressureUnit1297);  
                            stream_142.add(string_literal136);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:31: 'atmospheres'
                            {
                            dbg.location(256,31);
                            string_literal137=(Token)match(input,143,FOLLOW_143_in_pressureUnit1299);  
                            stream_143.add(string_literal137);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 257:2: -> ATMOSPHERE
                    {
                        dbg.location(257,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ATMOSPHERE, "ATMOSPHERE"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(258, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pressureUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pressureUnit"

    public static class radius_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "radius"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
    public final flipsParser.radius_return radius() throws RecognitionException {
        flipsParser.radius_return retval = new flipsParser.radius_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal138=null;
        Token With139=null;
        Token char_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal145=null;
        flipsParser.distanceValue_return distanceValue143 = null;

        flipsParser.distanceValue_return distanceValue144 = null;


        CommonTree string_literal138_tree=null;
        CommonTree With139_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree string_literal145_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try { dbg.enterRule(getGrammarFileName(), "radius");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            dbg.location(263,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:4: ( 'in' | With )?
            int alt56=3;
            try { dbg.enterSubRule(56);
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==144) ) {
                alt56=1;
            }
            else if ( (LA56_0==With) ) {
                alt56=2;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:5: 'in'
                    {
                    dbg.location(263,5);
                    string_literal138=(Token)match(input,144,FOLLOW_144_in_radius1319);  
                    stream_144.add(string_literal138);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:10: With
                    {
                    dbg.location(263,10);
                    With139=(Token)match(input,With,FOLLOW_With_in_radius1321);  
                    stream_With.add(With139);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(56);}

            dbg.location(263,17);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:17: ( 'a' )?
            int alt57=2;
            try { dbg.enterSubRule(57);
            try { dbg.enterDecision(57);

            int LA57_0 = input.LA(1);

            if ( (LA57_0==123) ) {
                alt57=1;
            }
            } finally {dbg.exitDecision(57);}

            switch (alt57) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:17: 'a'
                    {
                    dbg.location(263,17);
                    char_literal140=(Token)match(input,123,FOLLOW_123_in_radius1325);  
                    stream_123.add(char_literal140);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(57);}

            dbg.location(263,22);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt59=2;
            try { dbg.enterSubRule(59);
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==145) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=FloatingPointLiteral && LA59_0<=HexLiteral)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:23: 'radius' ( 'of' )? distanceValue
                    {
                    dbg.location(263,23);
                    string_literal141=(Token)match(input,145,FOLLOW_145_in_radius1329);  
                    stream_145.add(string_literal141);

                    dbg.location(263,32);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:32: ( 'of' )?
                    int alt58=2;
                    try { dbg.enterSubRule(58);
                    try { dbg.enterDecision(58);

                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==118) ) {
                        alt58=1;
                    }
                    } finally {dbg.exitDecision(58);}

                    switch (alt58) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:32: 'of'
                            {
                            dbg.location(263,32);
                            string_literal142=(Token)match(input,118,FOLLOW_118_in_radius1331);  
                            stream_118.add(string_literal142);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(58);}

                    dbg.location(263,38);
                    pushFollow(FOLLOW_distanceValue_in_radius1334);
                    distanceValue143=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue143.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:52: distanceValue 'radius'
                    {
                    dbg.location(263,52);
                    pushFollow(FOLLOW_distanceValue_in_radius1336);
                    distanceValue144=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue144.getTree());
                    dbg.location(263,66);
                    string_literal145=(Token)match(input,145,FOLLOW_145_in_radius1338);  
                    stream_145.add(string_literal145);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(59);}



            // AST REWRITE
            // elements: distanceValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 264:2: -> ^( RADIUS distanceValue )
            {
                dbg.location(264,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:5: ^( RADIUS distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(264,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RADIUS, "RADIUS"), root_1);

                dbg.location(264,14);
                adaptor.addChild(root_1, stream_distanceValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(265, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "radius");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "radius"

    public static class distance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distance"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection146 = null;

        flipsParser.distanceValue_return distanceValue147 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try { dbg.enterRule(getGrammarFileName(), "distance");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(267, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( leftRightDirection )? distanceValue
            {
            dbg.location(268,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( leftRightDirection )?
            int alt60=2;
            try { dbg.enterSubRule(60);
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=248 && LA60_0<=253)) ) {
                alt60=1;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: leftRightDirection
                    {
                    dbg.location(268,4);
                    pushFollow(FOLLOW_leftRightDirection_in_distance1359);
                    leftRightDirection146=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection146.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(60);}

            dbg.location(268,24);
            pushFollow(FOLLOW_distanceValue_in_distance1362);
            distanceValue147=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue147.getTree());


            // AST REWRITE
            // elements: distanceValue, leftRightDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 269:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                dbg.location(269,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:269:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(269,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                dbg.location(269,16);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:269:16: ( leftRightDirection )?
                if ( stream_leftRightDirection.hasNext() ) {
                    dbg.location(269,16);
                    adaptor.addChild(root_1, stream_leftRightDirection.nextTree());

                }
                stream_leftRightDirection.reset();
                dbg.location(269,36);
                adaptor.addChild(root_1, stream_distanceValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(270, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "distance");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "distance"

    public static class distanceValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:272:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue148 = null;

        flipsParser.distanceUnit_return distanceUnit149 = null;



        try { dbg.enterRule(getGrammarFileName(), "distanceValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(272, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:273:2: ( numericValue distanceUnit )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:273:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(273,4);
            pushFollow(FOLLOW_numericValue_in_distanceValue1385);
            numericValue148=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue148.getTree());
            dbg.location(273,17);
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1387);
            distanceUnit149=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit149.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(274, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "distanceValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "distanceValue"

    public static class distanceUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:276:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token char_literal153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal157=null;
        Token string_literal158=null;
        Token string_literal159=null;
        Token string_literal160=null;
        Token string_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;

        CommonTree string_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree string_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal157_tree=null;
        CommonTree string_literal158_tree=null;
        CommonTree string_literal159_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree string_literal163_tree=null;
        CommonTree string_literal164_tree=null;
        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree string_literal167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try { dbg.enterRule(getGrammarFileName(), "distanceUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt69=6;
            try { dbg.enterDecision(69);

            switch ( input.LA(1) ) {
            case 146:
            case 147:
            case 148:
                {
                alt69=1;
                }
                break;
            case 149:
            case 150:
            case 151:
                {
                alt69=2;
                }
                break;
            case 152:
            case 153:
                {
                alt69=3;
                }
                break;
            case 154:
            case 155:
            case 156:
            case 157:
                {
                alt69=4;
                }
                break;
            case 158:
            case 159:
            case 160:
                {
                alt69=5;
                }
                break;
            case 161:
            case 162:
            case 163:
                {
                alt69=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    dbg.location(277,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt61=3;
                    try { dbg.enterSubRule(61);
                    try { dbg.enterDecision(61);

                    switch ( input.LA(1) ) {
                    case 146:
                        {
                        alt61=1;
                        }
                        break;
                    case 147:
                        {
                        alt61=2;
                        }
                        break;
                    case 148:
                        {
                        alt61=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(61);}

                    switch (alt61) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:5: 'km'
                            {
                            dbg.location(277,5);
                            string_literal150=(Token)match(input,146,FOLLOW_146_in_distanceUnit1399);  
                            stream_146.add(string_literal150);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:10: 'kilometer'
                            {
                            dbg.location(277,10);
                            string_literal151=(Token)match(input,147,FOLLOW_147_in_distanceUnit1401);  
                            stream_147.add(string_literal151);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:22: 'kilometers'
                            {
                            dbg.location(277,22);
                            string_literal152=(Token)match(input,148,FOLLOW_148_in_distanceUnit1403);  
                            stream_148.add(string_literal152);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(61);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 278:2: -> KILOMETER
                    {
                        dbg.location(278,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:4: ( 'm' | 'meter' | 'meters' )
                    {
                    dbg.location(279,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:4: ( 'm' | 'meter' | 'meters' )
                    int alt62=3;
                    try { dbg.enterSubRule(62);
                    try { dbg.enterDecision(62);

                    switch ( input.LA(1) ) {
                    case 149:
                        {
                        alt62=1;
                        }
                        break;
                    case 150:
                        {
                        alt62=2;
                        }
                        break;
                    case 151:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(62);}

                    switch (alt62) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:5: 'm'
                            {
                            dbg.location(279,5);
                            char_literal153=(Token)match(input,149,FOLLOW_149_in_distanceUnit1415);  
                            stream_149.add(char_literal153);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:9: 'meter'
                            {
                            dbg.location(279,9);
                            string_literal154=(Token)match(input,150,FOLLOW_150_in_distanceUnit1417);  
                            stream_150.add(string_literal154);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:17: 'meters'
                            {
                            dbg.location(279,17);
                            string_literal155=(Token)match(input,151,FOLLOW_151_in_distanceUnit1419);  
                            stream_151.add(string_literal155);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(62);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 280:2: -> METER
                    {
                        dbg.location(280,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    dbg.location(281,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt64=2;
                    try { dbg.enterSubRule(64);
                    try { dbg.enterDecision(64);

                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==152) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==153) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(64);}

                    switch (alt64) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:5: 'nm'
                            {
                            dbg.location(281,5);
                            string_literal156=(Token)match(input,152,FOLLOW_152_in_distanceUnit1431);  
                            stream_152.add(string_literal156);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            dbg.location(281,10);
                            string_literal157=(Token)match(input,153,FOLLOW_153_in_distanceUnit1433);  
                            stream_153.add(string_literal157);

                            dbg.location(281,21);
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:21: ( 'mi' | 'mile' | 'miles' )
                            int alt63=3;
                            try { dbg.enterSubRule(63);
                            try { dbg.enterDecision(63);

                            switch ( input.LA(1) ) {
                            case 154:
                                {
                                alt63=1;
                                }
                                break;
                            case 155:
                                {
                                alt63=2;
                                }
                                break;
                            case 156:
                                {
                                alt63=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }

                            } finally {dbg.exitDecision(63);}

                            switch (alt63) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:22: 'mi'
                                    {
                                    dbg.location(281,22);
                                    string_literal158=(Token)match(input,154,FOLLOW_154_in_distanceUnit1436);  
                                    stream_154.add(string_literal158);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:27: 'mile'
                                    {
                                    dbg.location(281,27);
                                    string_literal159=(Token)match(input,155,FOLLOW_155_in_distanceUnit1438);  
                                    stream_155.add(string_literal159);


                                    }
                                    break;
                                case 3 :
                                    dbg.enterAlt(3);

                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:34: 'miles'
                                    {
                                    dbg.location(281,34);
                                    string_literal160=(Token)match(input,156,FOLLOW_156_in_distanceUnit1440);  
                                    stream_156.add(string_literal160);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(63);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(64);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 282:2: -> NAUTICAL MILE
                    {
                        dbg.location(282,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        dbg.location(282,14);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    dbg.location(283,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:4: ( 'statute' )?
                    int alt65=2;
                    try { dbg.enterSubRule(65);
                    try { dbg.enterDecision(65);

                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==157) ) {
                        alt65=1;
                    }
                    } finally {dbg.exitDecision(65);}

                    switch (alt65) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:5: 'statute'
                            {
                            dbg.location(283,5);
                            string_literal161=(Token)match(input,157,FOLLOW_157_in_distanceUnit1455);  
                            stream_157.add(string_literal161);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(65);}

                    dbg.location(283,17);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:17: ( 'mi' | 'mile' | 'miles' )
                    int alt66=3;
                    try { dbg.enterSubRule(66);
                    try { dbg.enterDecision(66);

                    switch ( input.LA(1) ) {
                    case 154:
                        {
                        alt66=1;
                        }
                        break;
                    case 155:
                        {
                        alt66=2;
                        }
                        break;
                    case 156:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(66);}

                    switch (alt66) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:18: 'mi'
                            {
                            dbg.location(283,18);
                            string_literal162=(Token)match(input,154,FOLLOW_154_in_distanceUnit1460);  
                            stream_154.add(string_literal162);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:23: 'mile'
                            {
                            dbg.location(283,23);
                            string_literal163=(Token)match(input,155,FOLLOW_155_in_distanceUnit1462);  
                            stream_155.add(string_literal163);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:30: 'miles'
                            {
                            dbg.location(283,30);
                            string_literal164=(Token)match(input,156,FOLLOW_156_in_distanceUnit1464);  
                            stream_156.add(string_literal164);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(66);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 284:2: -> MILE
                    {
                        dbg.location(284,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    dbg.location(285,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: ( 'yd' | 'yard' | 'yards' )
                    int alt67=3;
                    try { dbg.enterSubRule(67);
                    try { dbg.enterDecision(67);

                    switch ( input.LA(1) ) {
                    case 158:
                        {
                        alt67=1;
                        }
                        break;
                    case 159:
                        {
                        alt67=2;
                        }
                        break;
                    case 160:
                        {
                        alt67=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(67);}

                    switch (alt67) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:5: 'yd'
                            {
                            dbg.location(285,5);
                            string_literal165=(Token)match(input,158,FOLLOW_158_in_distanceUnit1476);  
                            stream_158.add(string_literal165);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:10: 'yard'
                            {
                            dbg.location(285,10);
                            string_literal166=(Token)match(input,159,FOLLOW_159_in_distanceUnit1478);  
                            stream_159.add(string_literal166);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:17: 'yards'
                            {
                            dbg.location(285,17);
                            string_literal167=(Token)match(input,160,FOLLOW_160_in_distanceUnit1480);  
                            stream_160.add(string_literal167);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(67);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 286:2: -> YARD
                    {
                        dbg.location(286,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    dbg.location(287,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:4: ( 'ft' | 'foot' | 'feet' )
                    int alt68=3;
                    try { dbg.enterSubRule(68);
                    try { dbg.enterDecision(68);

                    switch ( input.LA(1) ) {
                    case 161:
                        {
                        alt68=1;
                        }
                        break;
                    case 162:
                        {
                        alt68=2;
                        }
                        break;
                    case 163:
                        {
                        alt68=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(68);}

                    switch (alt68) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:5: 'ft'
                            {
                            dbg.location(287,5);
                            string_literal168=(Token)match(input,161,FOLLOW_161_in_distanceUnit1492);  
                            stream_161.add(string_literal168);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:10: 'foot'
                            {
                            dbg.location(287,10);
                            string_literal169=(Token)match(input,162,FOLLOW_162_in_distanceUnit1494);  
                            stream_162.add(string_literal169);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:17: 'feet'
                            {
                            dbg.location(287,17);
                            string_literal170=(Token)match(input,163,FOLLOW_163_in_distanceUnit1496);  
                            stream_163.add(string_literal170);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(68);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 288:2: -> FOOT
                    {
                        dbg.location(288,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(289, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "distanceUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "distanceUnit"

    public static class speed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed171 = null;

        flipsParser.relativeSpeed_return relativeSpeed172 = null;

        flipsParser.optimalSpeed_return optimalSpeed173 = null;

        flipsParser.throttleSpeed_return throttleSpeed174 = null;



        try { dbg.enterRule(getGrammarFileName(), "speed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(293, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt70=4;
            try { dbg.enterDecision(70);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==At) ) {
                switch ( input.LA(2) ) {
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                    {
                    int LA70_3 = input.LA(3);

                    if ( ((LA70_3>=270 && LA70_3<=271)) ) {
                        alt70=4;
                    }
                    else if ( ((LA70_3>=146 && LA70_3<=163)||(LA70_3>=166 && LA70_3<=172)) ) {
                        alt70=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA70_4 = input.LA(3);

                    if ( ((LA70_4>=146 && LA70_4<=163)||(LA70_4>=166 && LA70_4<=172)) ) {
                        alt70=1;
                    }
                    else if ( ((LA70_4>=270 && LA70_4<=271)) ) {
                        alt70=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 177:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                    {
                    alt70=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else if ( ((LA70_0>=FloatingPointLiteral && LA70_0<=HexLiteral)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(294,4);
                    pushFollow(FOLLOW_fixedSpeed_in_speed1515);
                    fixedSpeed171=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed171.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(295,4);
                    pushFollow(FOLLOW_relativeSpeed_in_speed1520);
                    relativeSpeed172=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed172.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:296:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(296,4);
                    pushFollow(FOLLOW_optimalSpeed_in_speed1525);
                    optimalSpeed173=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed173.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(297,4);
                    pushFollow(FOLLOW_throttleSpeed_in_speed1530);
                    throttleSpeed174=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed174.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(298, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "speed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "speed"

    public static class fixedSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:1: fixedSpeed : At speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At175=null;
        flipsParser.speedValue_return speedValue176 = null;


        CommonTree At175_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try { dbg.enterRule(getGrammarFileName(), "fixedSpeed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:301:2: ( At speedValue -> ^( SPEED FIXED speedValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:301:4: At speedValue
            {
            dbg.location(301,4);
            At175=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1541);  
            stream_At.add(At175);

            dbg.location(301,7);
            pushFollow(FOLLOW_speedValue_in_fixedSpeed1543);
            speedValue176=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue176.getTree());


            // AST REWRITE
            // elements: speedValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 302:2: -> ^( SPEED FIXED speedValue )
            {
                dbg.location(302,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:302:5: ^( SPEED FIXED speedValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(302,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                dbg.location(302,13);
                adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                dbg.location(302,19);
                adaptor.addChild(root_1, stream_speedValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(303, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fixedSpeed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fixedSpeed"

    public static class relativeSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:305:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal178=null;
        Token string_literal180=null;
        Token string_literal182=null;
        Token string_literal184=null;
        flipsParser.speedValue_return speedValue177 = null;

        flipsParser.speedValue_return speedValue179 = null;

        flipsParser.percentValue_return percentValue181 = null;

        flipsParser.percentValue_return percentValue183 = null;


        CommonTree string_literal178_tree=null;
        CommonTree string_literal180_tree=null;
        CommonTree string_literal182_tree=null;
        CommonTree string_literal184_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try { dbg.enterRule(getGrammarFileName(), "relativeSpeed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(305, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt71=4;
            try { dbg.enterDecision(71);

            try {
                isCyclicDecision = true;
                alt71 = dfa71.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:4: speedValue 'faster'
                    {
                    dbg.location(306,4);
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1565);
                    speedValue177=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue177.getTree());
                    dbg.location(306,15);
                    string_literal178=(Token)match(input,164,FOLLOW_164_in_relativeSpeed1567);  
                    stream_164.add(string_literal178);



                    // AST REWRITE
                    // elements: speedValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 307:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        dbg.location(307,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:5: ^( SPEED RELATIVE FASTER speedValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(307,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        dbg.location(307,13);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        dbg.location(307,22);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FASTER, "FASTER"));
                        dbg.location(307,29);
                        adaptor.addChild(root_1, stream_speedValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:308:4: speedValue 'slower'
                    {
                    dbg.location(308,4);
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1585);
                    speedValue179=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue179.getTree());
                    dbg.location(308,15);
                    string_literal180=(Token)match(input,165,FOLLOW_165_in_relativeSpeed1587);  
                    stream_165.add(string_literal180);



                    // AST REWRITE
                    // elements: speedValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 309:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        dbg.location(309,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:309:5: ^( SPEED RELATIVE SLOWER speedValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(309,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        dbg.location(309,13);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        dbg.location(309,22);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SLOWER, "SLOWER"));
                        dbg.location(309,29);
                        adaptor.addChild(root_1, stream_speedValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:310:4: percentValue 'faster'
                    {
                    dbg.location(310,4);
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1605);
                    percentValue181=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue181.getTree());
                    dbg.location(310,17);
                    string_literal182=(Token)match(input,164,FOLLOW_164_in_relativeSpeed1607);  
                    stream_164.add(string_literal182);



                    // AST REWRITE
                    // elements: percentValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 311:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        dbg.location(311,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:311:5: ^( SPEED RELATIVE FASTER percentValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(311,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        dbg.location(311,13);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        dbg.location(311,22);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FASTER, "FASTER"));
                        dbg.location(311,29);
                        adaptor.addChild(root_1, stream_percentValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:4: percentValue 'slower'
                    {
                    dbg.location(312,4);
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1625);
                    percentValue183=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue183.getTree());
                    dbg.location(312,17);
                    string_literal184=(Token)match(input,165,FOLLOW_165_in_relativeSpeed1627);  
                    stream_165.add(string_literal184);



                    // AST REWRITE
                    // elements: percentValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 313:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        dbg.location(313,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:5: ^( SPEED RELATIVE SLOWER percentValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(313,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        dbg.location(313,13);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        dbg.location(313,22);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SLOWER, "SLOWER"));
                        dbg.location(313,29);
                        adaptor.addChild(root_1, stream_percentValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(314, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relativeSpeed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relativeSpeed"

    public static class speedValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speedValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:316:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue185 = null;

        flipsParser.speedUnit_return speedUnit186 = null;



        try { dbg.enterRule(getGrammarFileName(), "speedValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:2: ( numericValue speedUnit )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(317,4);
            pushFollow(FOLLOW_numericValue_in_speedValue1651);
            numericValue185=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue185.getTree());
            dbg.location(317,17);
            pushFollow(FOLLOW_speedUnit_in_speedValue1653);
            speedUnit186=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit186.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(318, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "speedValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "speedValue"

    public static class speedUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speedUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:320:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal187=null;
        Token string_literal188=null;
        Token string_literal189=null;
        Token string_literal190=null;
        Token string_literal191=null;
        Token string_literal192=null;
        Token string_literal193=null;
        Token char_literal195=null;
        Token string_literal196=null;
        flipsParser.distanceUnit_return distanceUnit194 = null;

        flipsParser.timeUnit_return timeUnit197 = null;


        CommonTree string_literal187_tree=null;
        CommonTree string_literal188_tree=null;
        CommonTree string_literal189_tree=null;
        CommonTree string_literal190_tree=null;
        CommonTree string_literal191_tree=null;
        CommonTree string_literal192_tree=null;
        CommonTree string_literal193_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree string_literal196_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try { dbg.enterRule(getGrammarFileName(), "speedUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt74=4;
            try { dbg.enterDecision(74);

            switch ( input.LA(1) ) {
            case 166:
                {
                alt74=1;
                }
                break;
            case 167:
                {
                alt74=2;
                }
                break;
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
                {
                alt74=3;
                }
                break;
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:4: 'kph'
                    {
                    dbg.location(321,4);
                    string_literal187=(Token)match(input,166,FOLLOW_166_in_speedUnit1664);  
                    stream_166.add(string_literal187);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 322:2: -> KILOMETER HOUR
                    {
                        dbg.location(322,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        dbg.location(322,15);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:4: 'mph'
                    {
                    dbg.location(323,4);
                    string_literal188=(Token)match(input,167,FOLLOW_167_in_speedUnit1676);  
                    stream_167.add(string_literal188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 324:2: -> MILE HOUR
                    {
                        dbg.location(324,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        dbg.location(324,10);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    dbg.location(325,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt72=5;
                    try { dbg.enterSubRule(72);
                    try { dbg.enterDecision(72);

                    switch ( input.LA(1) ) {
                    case 168:
                        {
                        alt72=1;
                        }
                        break;
                    case 169:
                        {
                        alt72=2;
                        }
                        break;
                    case 170:
                        {
                        alt72=3;
                        }
                        break;
                    case 171:
                        {
                        alt72=4;
                        }
                        break;
                    case 172:
                        {
                        alt72=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(72);}

                    switch (alt72) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:5: 'kn'
                            {
                            dbg.location(325,5);
                            string_literal189=(Token)match(input,168,FOLLOW_168_in_speedUnit1689);  
                            stream_168.add(string_literal189);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:10: 'kt'
                            {
                            dbg.location(325,10);
                            string_literal190=(Token)match(input,169,FOLLOW_169_in_speedUnit1691);  
                            stream_169.add(string_literal190);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:15: 'kts'
                            {
                            dbg.location(325,15);
                            string_literal191=(Token)match(input,170,FOLLOW_170_in_speedUnit1693);  
                            stream_170.add(string_literal191);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:21: 'knot'
                            {
                            dbg.location(325,21);
                            string_literal192=(Token)match(input,171,FOLLOW_171_in_speedUnit1695);  
                            stream_171.add(string_literal192);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:28: 'knots'
                            {
                            dbg.location(325,28);
                            string_literal193=(Token)match(input,172,FOLLOW_172_in_speedUnit1697);  
                            stream_172.add(string_literal193);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(72);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 326:2: -> NAUTICAL MILE HOUR
                    {
                        dbg.location(326,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        dbg.location(326,14);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        dbg.location(326,19);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    dbg.location(327,4);
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit1712);
                    distanceUnit194=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit194.getTree());
                    dbg.location(327,17);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:17: ( '/' | 'per' )
                    int alt73=2;
                    try { dbg.enterSubRule(73);
                    try { dbg.enterDecision(73);

                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==173) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==174) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(73);}

                    switch (alt73) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:18: '/'
                            {
                            dbg.location(327,18);
                            char_literal195=(Token)match(input,173,FOLLOW_173_in_speedUnit1715);  
                            stream_173.add(char_literal195);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:22: 'per'
                            {
                            dbg.location(327,22);
                            string_literal196=(Token)match(input,174,FOLLOW_174_in_speedUnit1717);  
                            stream_174.add(string_literal196);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}

                    dbg.location(327,29);
                    pushFollow(FOLLOW_timeUnit_in_speedUnit1720);
                    timeUnit197=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit197.getTree());


                    // AST REWRITE
                    // elements: timeUnit, distanceUnit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:2: -> distanceUnit timeUnit
                    {
                        dbg.location(328,5);
                        adaptor.addChild(root_0, stream_distanceUnit.nextTree());
                        dbg.location(328,18);
                        adaptor.addChild(root_0, stream_timeUnit.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(329, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "speedUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "speedUnit"

    public static class optimalSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimalSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:1: optimalSpeed : At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At198=null;
        Token string_literal200=null;
        Token string_literal201=null;
        flipsParser.optimalUnit_return optimalUnit199 = null;


        CommonTree At198_tree=null;
        CommonTree string_literal200_tree=null;
        CommonTree string_literal201_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try { dbg.enterRule(getGrammarFileName(), "optimalSpeed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:2: ( At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:4: At optimalUnit ( 'spd' | 'speed' )
            {
            dbg.location(332,4);
            At198=(Token)match(input,At,FOLLOW_At_in_optimalSpeed1738);  
            stream_At.add(At198);

            dbg.location(332,7);
            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed1740);
            optimalUnit199=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit199.getTree());
            dbg.location(332,19);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:19: ( 'spd' | 'speed' )
            int alt75=2;
            try { dbg.enterSubRule(75);
            try { dbg.enterDecision(75);

            int LA75_0 = input.LA(1);

            if ( (LA75_0==175) ) {
                alt75=1;
            }
            else if ( (LA75_0==176) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:20: 'spd'
                    {
                    dbg.location(332,20);
                    string_literal200=(Token)match(input,175,FOLLOW_175_in_optimalSpeed1743);  
                    stream_175.add(string_literal200);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:26: 'speed'
                    {
                    dbg.location(332,26);
                    string_literal201=(Token)match(input,176,FOLLOW_176_in_optimalSpeed1745);  
                    stream_176.add(string_literal201);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(75);}



            // AST REWRITE
            // elements: optimalUnit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 333:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                dbg.location(333,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:333:5: ^( SPEED OPTIMAL optimalUnit )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(333,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                dbg.location(333,13);
                adaptor.addChild(root_1, (CommonTree)adaptor.create(OPTIMAL, "OPTIMAL"));
                dbg.location(333,21);
                adaptor.addChild(root_1, stream_optimalUnit.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(334, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optimalSpeed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optimalSpeed"

    public static class optimalUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimalUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:336:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal202=null;
        Token string_literal203=null;
        Token string_literal204=null;
        Token string_literal205=null;
        Token string_literal206=null;
        Token string_literal207=null;

        CommonTree string_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        CommonTree string_literal204_tree=null;
        CommonTree string_literal205_tree=null;
        CommonTree string_literal206_tree=null;
        CommonTree string_literal207_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");

        try { dbg.enterRule(getGrammarFileName(), "optimalUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt79=3;
            try { dbg.enterDecision(79);

            switch ( input.LA(1) ) {
            case 177:
            case 178:
                {
                alt79=1;
                }
                break;
            case 179:
            case 180:
                {
                alt79=2;
                }
                break;
            case 181:
            case 182:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(79);}

            switch (alt79) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'min' | 'minimum' )
                    {
                    dbg.location(337,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'min' | 'minimum' )
                    int alt76=2;
                    try { dbg.enterSubRule(76);
                    try { dbg.enterDecision(76);

                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==177) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==178) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(76);}

                    switch (alt76) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:5: 'min'
                            {
                            dbg.location(337,5);
                            string_literal202=(Token)match(input,177,FOLLOW_177_in_optimalUnit1769);  
                            stream_177.add(string_literal202);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:11: 'minimum'
                            {
                            dbg.location(337,11);
                            string_literal203=(Token)match(input,178,FOLLOW_178_in_optimalUnit1771);  
                            stream_178.add(string_literal203);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(76);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 338:2: -> MINIMUM
                    {
                        dbg.location(338,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: ( 'cru' | 'cruise' )
                    {
                    dbg.location(339,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: ( 'cru' | 'cruise' )
                    int alt77=2;
                    try { dbg.enterSubRule(77);
                    try { dbg.enterDecision(77);

                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==179) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==180) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(77);}

                    switch (alt77) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:5: 'cru'
                            {
                            dbg.location(339,5);
                            string_literal204=(Token)match(input,179,FOLLOW_179_in_optimalUnit1783);  
                            stream_179.add(string_literal204);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:11: 'cruise'
                            {
                            dbg.location(339,11);
                            string_literal205=(Token)match(input,180,FOLLOW_180_in_optimalUnit1785);  
                            stream_180.add(string_literal205);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(77);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 340:2: -> CRUISE
                    {
                        dbg.location(340,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:4: ( 'max' | 'maximum' )
                    {
                    dbg.location(341,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:4: ( 'max' | 'maximum' )
                    int alt78=2;
                    try { dbg.enterSubRule(78);
                    try { dbg.enterDecision(78);

                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==181) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==182) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(78);}

                    switch (alt78) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:5: 'max'
                            {
                            dbg.location(341,5);
                            string_literal206=(Token)match(input,181,FOLLOW_181_in_optimalUnit1797);  
                            stream_181.add(string_literal206);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:11: 'maximum'
                            {
                            dbg.location(341,11);
                            string_literal207=(Token)match(input,182,FOLLOW_182_in_optimalUnit1799);  
                            stream_182.add(string_literal207);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(78);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 342:2: -> MAXIMUM
                    {
                        dbg.location(342,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MAXIMUM, "MAXIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(343, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optimalUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "optimalUnit"

    public static class throttleSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:1: throttleSpeed : At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At208=null;
        Token string_literal210=null;
        Token string_literal211=null;
        Token string_literal212=null;
        Token string_literal213=null;
        flipsParser.throttleValue_return throttleValue209 = null;


        CommonTree At208_tree=null;
        CommonTree string_literal210_tree=null;
        CommonTree string_literal211_tree=null;
        CommonTree string_literal212_tree=null;
        CommonTree string_literal213_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try { dbg.enterRule(getGrammarFileName(), "throttleSpeed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:2: ( At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:4: At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            dbg.location(346,4);
            At208=(Token)match(input,At,FOLLOW_At_in_throttleSpeed1816);  
            stream_At.add(At208);

            dbg.location(346,7);
            pushFollow(FOLLOW_throttleValue_in_throttleSpeed1818);
            throttleValue209=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue209.getTree());
            dbg.location(346,21);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:21: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt80=4;
            try { dbg.enterSubRule(80);
            try { dbg.enterDecision(80);

            switch ( input.LA(1) ) {
            case 183:
                {
                alt80=1;
                }
                break;
            case 184:
                {
                alt80=2;
                }
                break;
            case 185:
                {
                alt80=3;
                }
                break;
            case 186:
                {
                alt80=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(80);}

            switch (alt80) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:22: 'pwr'
                    {
                    dbg.location(346,22);
                    string_literal210=(Token)match(input,183,FOLLOW_183_in_throttleSpeed1821);  
                    stream_183.add(string_literal210);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:28: 'power'
                    {
                    dbg.location(346,28);
                    string_literal211=(Token)match(input,184,FOLLOW_184_in_throttleSpeed1823);  
                    stream_184.add(string_literal211);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:36: 'thr'
                    {
                    dbg.location(346,36);
                    string_literal212=(Token)match(input,185,FOLLOW_185_in_throttleSpeed1825);  
                    stream_185.add(string_literal212);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:42: 'throttle'
                    {
                    dbg.location(346,42);
                    string_literal213=(Token)match(input,186,FOLLOW_186_in_throttleSpeed1827);  
                    stream_186.add(string_literal213);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(80);}



            // AST REWRITE
            // elements: throttleValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 347:2: -> ^( SPEED THROTTLE throttleValue )
            {
                dbg.location(347,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:347:5: ^( SPEED THROTTLE throttleValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(347,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                dbg.location(347,13);
                adaptor.addChild(root_1, (CommonTree)adaptor.create(THROTTLE, "THROTTLE"));
                dbg.location(347,22);
                adaptor.addChild(root_1, stream_throttleValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(348, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "throttleSpeed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "throttleSpeed"

    public static class throttleValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:350:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue214 = null;



        try { dbg.enterRule(getGrammarFileName(), "throttleValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:2: ( percentValue )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(351,4);
            pushFollow(FOLLOW_percentValue_in_throttleValue1850);
            percentValue214=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue214.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(352, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "throttleValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "throttleValue"

    public static class time_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:1: time : ( At timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | At integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | At timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | At integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | At timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At215=null;
        Token string_literal217=null;
        Token string_literal218=null;
        Token At219=null;
        Token string_literal221=null;
        Token string_literal222=null;
        Token At223=null;
        Token string_literal225=null;
        Token string_literal226=null;
        Token At227=null;
        Token string_literal229=null;
        Token string_literal230=null;
        Token At231=null;
        flipsParser.timeFormat_return timeFormat216 = null;

        flipsParser.integerValue_return integerValue220 = null;

        flipsParser.timeFormat_return timeFormat224 = null;

        flipsParser.integerValue_return integerValue228 = null;

        flipsParser.timeFormat_return timeFormat232 = null;


        CommonTree At215_tree=null;
        CommonTree string_literal217_tree=null;
        CommonTree string_literal218_tree=null;
        CommonTree At219_tree=null;
        CommonTree string_literal221_tree=null;
        CommonTree string_literal222_tree=null;
        CommonTree At223_tree=null;
        CommonTree string_literal225_tree=null;
        CommonTree string_literal226_tree=null;
        CommonTree At227_tree=null;
        CommonTree string_literal229_tree=null;
        CommonTree string_literal230_tree=null;
        CommonTree At231_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(356, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:6: ( At timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | At integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | At timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | At integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | At timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt85=5;
            try { dbg.enterDecision(85);

            try {
                isCyclicDecision = true;
                alt85 = dfa85.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(85);}

            switch (alt85) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:8: At timeFormat ( 'am' | 'a.m.' )
                    {
                    dbg.location(356,8);
                    At215=(Token)match(input,At,FOLLOW_At_in_time1862);  
                    stream_At.add(At215);

                    dbg.location(356,11);
                    pushFollow(FOLLOW_timeFormat_in_time1864);
                    timeFormat216=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat216.getTree());
                    dbg.location(356,22);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:22: ( 'am' | 'a.m.' )
                    int alt81=2;
                    try { dbg.enterSubRule(81);
                    try { dbg.enterDecision(81);

                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==187) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==188) ) {
                        alt81=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(81);}

                    switch (alt81) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:23: 'am'
                            {
                            dbg.location(356,23);
                            string_literal217=(Token)match(input,187,FOLLOW_187_in_time1867);  
                            stream_187.add(string_literal217);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:28: 'a.m.'
                            {
                            dbg.location(356,28);
                            string_literal218=(Token)match(input,188,FOLLOW_188_in_time1869);  
                            stream_188.add(string_literal218);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(81);}



                    // AST REWRITE
                    // elements: timeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 357:2: -> ^( TIME timeFormat AM )
                    {
                        dbg.location(357,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:357:5: ^( TIME timeFormat AM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(357,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        dbg.location(357,12);
                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        dbg.location(357,23);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(AM, "AM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:4: At integerValue ( 'am' | 'a.m.' )
                    {
                    dbg.location(358,4);
                    At219=(Token)match(input,At,FOLLOW_At_in_time1886);  
                    stream_At.add(At219);

                    dbg.location(358,7);
                    pushFollow(FOLLOW_integerValue_in_time1888);
                    integerValue220=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue220.getTree());
                    dbg.location(358,20);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:20: ( 'am' | 'a.m.' )
                    int alt82=2;
                    try { dbg.enterSubRule(82);
                    try { dbg.enterDecision(82);

                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==187) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==188) ) {
                        alt82=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(82);}

                    switch (alt82) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:21: 'am'
                            {
                            dbg.location(358,21);
                            string_literal221=(Token)match(input,187,FOLLOW_187_in_time1891);  
                            stream_187.add(string_literal221);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:26: 'a.m.'
                            {
                            dbg.location(358,26);
                            string_literal222=(Token)match(input,188,FOLLOW_188_in_time1893);  
                            stream_188.add(string_literal222);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(82);}



                    // AST REWRITE
                    // elements: integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 359:2: -> ^( TIME integerValue HOUR AM )
                    {
                        dbg.location(359,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:359:5: ^( TIME integerValue HOUR AM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(359,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        dbg.location(359,12);
                        adaptor.addChild(root_1, stream_integerValue.nextTree());
                        dbg.location(359,25);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        dbg.location(359,30);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(AM, "AM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:360:4: At timeFormat ( 'pm' | 'p.m.' )
                    {
                    dbg.location(360,4);
                    At223=(Token)match(input,At,FOLLOW_At_in_time1912);  
                    stream_At.add(At223);

                    dbg.location(360,7);
                    pushFollow(FOLLOW_timeFormat_in_time1914);
                    timeFormat224=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat224.getTree());
                    dbg.location(360,18);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:360:18: ( 'pm' | 'p.m.' )
                    int alt83=2;
                    try { dbg.enterSubRule(83);
                    try { dbg.enterDecision(83);

                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==189) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==190) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(83);}

                    switch (alt83) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:360:19: 'pm'
                            {
                            dbg.location(360,19);
                            string_literal225=(Token)match(input,189,FOLLOW_189_in_time1917);  
                            stream_189.add(string_literal225);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:360:24: 'p.m.'
                            {
                            dbg.location(360,24);
                            string_literal226=(Token)match(input,190,FOLLOW_190_in_time1919);  
                            stream_190.add(string_literal226);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(83);}



                    // AST REWRITE
                    // elements: timeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:2: -> ^( TIME timeFormat PM )
                    {
                        dbg.location(361,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:5: ^( TIME timeFormat PM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(361,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        dbg.location(361,12);
                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        dbg.location(361,23);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PM, "PM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:4: At integerValue ( 'pm' | 'p.m.' )
                    {
                    dbg.location(362,4);
                    At227=(Token)match(input,At,FOLLOW_At_in_time1936);  
                    stream_At.add(At227);

                    dbg.location(362,7);
                    pushFollow(FOLLOW_integerValue_in_time1938);
                    integerValue228=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue228.getTree());
                    dbg.location(362,20);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:20: ( 'pm' | 'p.m.' )
                    int alt84=2;
                    try { dbg.enterSubRule(84);
                    try { dbg.enterDecision(84);

                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==189) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==190) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(84);}

                    switch (alt84) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:21: 'pm'
                            {
                            dbg.location(362,21);
                            string_literal229=(Token)match(input,189,FOLLOW_189_in_time1941);  
                            stream_189.add(string_literal229);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:26: 'p.m.'
                            {
                            dbg.location(362,26);
                            string_literal230=(Token)match(input,190,FOLLOW_190_in_time1943);  
                            stream_190.add(string_literal230);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(84);}



                    // AST REWRITE
                    // elements: integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 363:2: -> ^( TIME integerValue HOUR PM )
                    {
                        dbg.location(363,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:5: ^( TIME integerValue HOUR PM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(363,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        dbg.location(363,12);
                        adaptor.addChild(root_1, stream_integerValue.nextTree());
                        dbg.location(363,25);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        dbg.location(363,30);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PM, "PM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:364:4: At timeFormat
                    {
                    dbg.location(364,4);
                    At231=(Token)match(input,At,FOLLOW_At_in_time1962);  
                    stream_At.add(At231);

                    dbg.location(364,7);
                    pushFollow(FOLLOW_timeFormat_in_time1964);
                    timeFormat232=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat232.getTree());


                    // AST REWRITE
                    // elements: timeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 365:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        dbg.location(365,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:5: ^( TIME timeFormat HOUR24 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(365,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        dbg.location(365,12);
                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        dbg.location(365,23);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR24, "HOUR24"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(366, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "time"

    public static class timeFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeFormat"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:368:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal233=null;
        Token char_literal234=null;
        Token char_literal235=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal233_tree=null;
        CommonTree char_literal234_tree=null;
        CommonTree char_literal235_tree=null;
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try { dbg.enterRule(getGrammarFileName(), "timeFormat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt86=2;
            try { dbg.enterDecision(86);

            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=BinaryLiteral && LA86_0<=HexLiteral)) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==191) ) {
                    int LA86_2 = input.LA(3);

                    if ( ((LA86_2>=BinaryLiteral && LA86_2<=HexLiteral)) ) {
                        int LA86_3 = input.LA(4);

                        if ( (LA86_3==191) ) {
                            alt86=2;
                        }
                        else if ( (LA86_3==EOF||(LA86_3>=Identifier && LA86_3<=With)||(LA86_3>=Turning && LA86_3<=HexLiteral)||(LA86_3>=107 && LA86_3<=114)||(LA86_3>=116 && LA86_3<=117)||(LA86_3>=119 && LA86_3<=120)||LA86_3==123||(LA86_3>=144 && LA86_3<=145)||(LA86_3>=187 && LA86_3<=190)||LA86_3==200||(LA86_3>=205 && LA86_3<=257)) ) {
                            alt86=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 86, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(86);}

            switch (alt86) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: hr= integerValue ':' min= integerValue
                    {
                    dbg.location(369,6);
                    pushFollow(FOLLOW_integerValue_in_timeFormat1988);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    dbg.location(369,20);
                    char_literal233=(Token)match(input,191,FOLLOW_191_in_timeFormat1990);  
                    stream_191.add(char_literal233);

                    dbg.location(369,27);
                    pushFollow(FOLLOW_integerValue_in_timeFormat1994);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());


                    // AST REWRITE
                    // elements: hr, min
                    // token labels: 
                    // rule labels: min, hr, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 370:2: -> $hr HOUR $min MINUTE
                    {
                        dbg.location(370,5);
                        adaptor.addChild(root_0, stream_hr.nextTree());
                        dbg.location(370,9);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        dbg.location(370,14);
                        adaptor.addChild(root_0, stream_min.nextTree());
                        dbg.location(370,19);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:371:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    dbg.location(371,6);
                    pushFollow(FOLLOW_integerValue_in_timeFormat2014);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    dbg.location(371,20);
                    char_literal234=(Token)match(input,191,FOLLOW_191_in_timeFormat2016);  
                    stream_191.add(char_literal234);

                    dbg.location(371,27);
                    pushFollow(FOLLOW_integerValue_in_timeFormat2020);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    dbg.location(371,41);
                    char_literal235=(Token)match(input,191,FOLLOW_191_in_timeFormat2022);  
                    stream_191.add(char_literal235);

                    dbg.location(371,46);
                    pushFollow(FOLLOW_numericValue_in_timeFormat2026);
                    s=numericValue();

                    state._fsp--;

                    stream_numericValue.add(s.getTree());


                    // AST REWRITE
                    // elements: s, min, hr
                    // token labels: 
                    // rule labels: hr, min, retval, s
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 372:2: -> $hr HOUR $min MINUTE $s SECOND
                    {
                        dbg.location(372,5);
                        adaptor.addChild(root_0, stream_hr.nextTree());
                        dbg.location(372,9);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        dbg.location(372,14);
                        adaptor.addChild(root_0, stream_min.nextTree());
                        dbg.location(372,19);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));
                        dbg.location(372,26);
                        adaptor.addChild(root_0, stream_s.nextTree());
                        dbg.location(372,29);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SECOND, "SECOND"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(373, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeFormat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeFormat"

    public static class timeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:1: timeUnit : ( hour | minute | second );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.hour_return hour236 = null;

        flipsParser.minute_return minute237 = null;

        flipsParser.second_return second238 = null;



        try { dbg.enterRule(getGrammarFileName(), "timeUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:9: ( hour | minute | second )
            int alt87=3;
            try { dbg.enterDecision(87);

            switch ( input.LA(1) ) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                {
                alt87=1;
                }
                break;
            case 177:
            case 197:
            case 198:
            case 199:
                {
                alt87=2;
                }
                break;
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(87);}

            switch (alt87) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:11: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(375,11);
                    pushFollow(FOLLOW_hour_in_timeUnit2054);
                    hour236=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour236.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(376,4);
                    pushFollow(FOLLOW_minute_in_timeUnit2059);
                    minute237=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute237.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(377,4);
                    pushFollow(FOLLOW_second_in_timeUnit2064);
                    second238=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second238.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(378, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeUnit"

    public static class hour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hour"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal239=null;
        Token string_literal240=null;
        Token string_literal241=null;
        Token string_literal242=null;
        Token string_literal243=null;

        CommonTree char_literal239_tree=null;
        CommonTree string_literal240_tree=null;
        CommonTree string_literal241_tree=null;
        CommonTree string_literal242_tree=null;
        CommonTree string_literal243_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");

        try { dbg.enterRule(getGrammarFileName(), "hour");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(380, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            dbg.location(381,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt88=5;
            try { dbg.enterSubRule(88);
            try { dbg.enterDecision(88);

            switch ( input.LA(1) ) {
            case 192:
                {
                alt88=1;
                }
                break;
            case 193:
                {
                alt88=2;
                }
                break;
            case 194:
                {
                alt88=3;
                }
                break;
            case 195:
                {
                alt88=4;
                }
                break;
            case 196:
                {
                alt88=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(88);}

            switch (alt88) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:5: 'h'
                    {
                    dbg.location(381,5);
                    char_literal239=(Token)match(input,192,FOLLOW_192_in_hour2076);  
                    stream_192.add(char_literal239);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:9: 'hr'
                    {
                    dbg.location(381,9);
                    string_literal240=(Token)match(input,193,FOLLOW_193_in_hour2078);  
                    stream_193.add(string_literal240);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:14: 'hrs'
                    {
                    dbg.location(381,14);
                    string_literal241=(Token)match(input,194,FOLLOW_194_in_hour2080);  
                    stream_194.add(string_literal241);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:20: 'hour'
                    {
                    dbg.location(381,20);
                    string_literal242=(Token)match(input,195,FOLLOW_195_in_hour2082);  
                    stream_195.add(string_literal242);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:27: 'hours'
                    {
                    dbg.location(381,27);
                    string_literal243=(Token)match(input,196,FOLLOW_196_in_hour2084);  
                    stream_196.add(string_literal243);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(88);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 382:2: -> HOUR
            {
                dbg.location(382,5);
                adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(383, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hour");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hour"

    public static class minute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minute"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal244=null;
        Token string_literal245=null;
        Token string_literal246=null;
        Token string_literal247=null;

        CommonTree string_literal244_tree=null;
        CommonTree string_literal245_tree=null;
        CommonTree string_literal246_tree=null;
        CommonTree string_literal247_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");

        try { dbg.enterRule(getGrammarFileName(), "minute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            dbg.location(386,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt89=4;
            try { dbg.enterSubRule(89);
            try { dbg.enterDecision(89);

            switch ( input.LA(1) ) {
            case 177:
                {
                alt89=1;
                }
                break;
            case 197:
                {
                alt89=2;
                }
                break;
            case 198:
                {
                alt89=3;
                }
                break;
            case 199:
                {
                alt89=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(89);}

            switch (alt89) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:5: 'min'
                    {
                    dbg.location(386,5);
                    string_literal244=(Token)match(input,177,FOLLOW_177_in_minute2102);  
                    stream_177.add(string_literal244);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:11: 'mins'
                    {
                    dbg.location(386,11);
                    string_literal245=(Token)match(input,197,FOLLOW_197_in_minute2104);  
                    stream_197.add(string_literal245);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:18: 'minute'
                    {
                    dbg.location(386,18);
                    string_literal246=(Token)match(input,198,FOLLOW_198_in_minute2106);  
                    stream_198.add(string_literal246);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:27: 'minutes'
                    {
                    dbg.location(386,27);
                    string_literal247=(Token)match(input,199,FOLLOW_199_in_minute2108);  
                    stream_199.add(string_literal247);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(89);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 387:2: -> MINUTE
            {
                dbg.location(387,5);
                adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(388, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "minute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "minute"

    public static class second_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "second"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal248=null;
        Token string_literal249=null;
        Token string_literal250=null;
        Token string_literal251=null;
        Token string_literal252=null;

        CommonTree char_literal248_tree=null;
        CommonTree string_literal249_tree=null;
        CommonTree string_literal250_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree string_literal252_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");

        try { dbg.enterRule(getGrammarFileName(), "second");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(390, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            dbg.location(391,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt90=5;
            try { dbg.enterSubRule(90);
            try { dbg.enterDecision(90);

            switch ( input.LA(1) ) {
            case 200:
                {
                alt90=1;
                }
                break;
            case 201:
                {
                alt90=2;
                }
                break;
            case 202:
                {
                alt90=3;
                }
                break;
            case 203:
                {
                alt90=4;
                }
                break;
            case 204:
                {
                alt90=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(90);}

            switch (alt90) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:5: 's'
                    {
                    dbg.location(391,5);
                    char_literal248=(Token)match(input,200,FOLLOW_200_in_second2126);  
                    stream_200.add(char_literal248);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:9: 'sec'
                    {
                    dbg.location(391,9);
                    string_literal249=(Token)match(input,201,FOLLOW_201_in_second2128);  
                    stream_201.add(string_literal249);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:15: 'secs'
                    {
                    dbg.location(391,15);
                    string_literal250=(Token)match(input,202,FOLLOW_202_in_second2130);  
                    stream_202.add(string_literal250);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:22: 'second'
                    {
                    dbg.location(391,22);
                    string_literal251=(Token)match(input,203,FOLLOW_203_in_second2132);  
                    stream_203.add(string_literal251);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:31: 'seconds'
                    {
                    dbg.location(391,31);
                    string_literal252=(Token)match(input,204,FOLLOW_204_in_second2134);  
                    stream_204.add(string_literal252);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(90);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 392:2: -> SECOND
            {
                dbg.location(392,5);
                adaptor.addChild(root_0, (CommonTree)adaptor.create(SECOND, "SECOND"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(393, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "second");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "second"

    public static class duration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "duration"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:395:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal253=null;
        flipsParser.durationValue_return durationValue254 = null;


        CommonTree string_literal253_tree=null;
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try { dbg.enterRule(getGrammarFileName(), "duration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(395, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:4: 'for' durationValue
            {
            dbg.location(396,4);
            string_literal253=(Token)match(input,205,FOLLOW_205_in_duration2151);  
            stream_205.add(string_literal253);

            dbg.location(396,10);
            pushFollow(FOLLOW_durationValue_in_duration2153);
            durationValue254=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue254.getTree());


            // AST REWRITE
            // elements: durationValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 397:2: -> ^( DURATION durationValue )
            {
                dbg.location(397,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:397:5: ^( DURATION durationValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(397,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DURATION, "DURATION"), root_1);

                dbg.location(397,16);
                adaptor.addChild(root_1, stream_durationValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(398, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "duration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "duration"

    public static class durationValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durationValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:400:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue255 = null;

        flipsParser.timeUnit_return timeUnit256 = null;

        flipsParser.integerValue_return integerValue257 = null;

        flipsParser.hour_return hour258 = null;

        flipsParser.numericValue_return numericValue259 = null;

        flipsParser.minute_return minute260 = null;

        flipsParser.second_return second261 = null;

        flipsParser.integerValue_return integerValue262 = null;

        flipsParser.hour_return hour263 = null;

        flipsParser.integerValue_return integerValue264 = null;

        flipsParser.minute_return minute265 = null;

        flipsParser.numericValue_return numericValue266 = null;

        flipsParser.second_return second267 = null;

        flipsParser.integerValue_return integerValue268 = null;

        flipsParser.minute_return minute269 = null;

        flipsParser.numericValue_return numericValue270 = null;

        flipsParser.second_return second271 = null;

        flipsParser.timeFormat_return timeFormat272 = null;



        try { dbg.enterRule(getGrammarFileName(), "durationValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(400, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:401:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt92=5;
            try { dbg.enterDecision(92);

            try {
                isCyclicDecision = true;
                alt92 = dfa92.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(92);}

            switch (alt92) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:401:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(401,4);
                    pushFollow(FOLLOW_numericValue_in_durationValue2173);
                    numericValue255=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue255.getTree());
                    dbg.location(401,17);
                    pushFollow(FOLLOW_timeUnit_in_durationValue2175);
                    timeUnit256=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit256.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(402,4);
                    pushFollow(FOLLOW_integerValue_in_durationValue2180);
                    integerValue257=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue257.getTree());
                    dbg.location(402,17);
                    pushFollow(FOLLOW_hour_in_durationValue2182);
                    hour258=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour258.getTree());
                    dbg.location(402,22);
                    pushFollow(FOLLOW_numericValue_in_durationValue2184);
                    numericValue259=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue259.getTree());
                    dbg.location(402,35);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:35: ( minute | second )
                    int alt91=2;
                    try { dbg.enterSubRule(91);
                    try { dbg.enterDecision(91);

                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==177||(LA91_0>=197 && LA91_0<=199)) ) {
                        alt91=1;
                    }
                    else if ( ((LA91_0>=200 && LA91_0<=204)) ) {
                        alt91=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(91);}

                    switch (alt91) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:36: minute
                            {
                            dbg.location(402,36);
                            pushFollow(FOLLOW_minute_in_durationValue2187);
                            minute260=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute260.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:43: second
                            {
                            dbg.location(402,43);
                            pushFollow(FOLLOW_second_in_durationValue2189);
                            second261=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second261.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(91);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(403,4);
                    pushFollow(FOLLOW_integerValue_in_durationValue2195);
                    integerValue262=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue262.getTree());
                    dbg.location(403,17);
                    pushFollow(FOLLOW_hour_in_durationValue2197);
                    hour263=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour263.getTree());
                    dbg.location(403,22);
                    pushFollow(FOLLOW_integerValue_in_durationValue2199);
                    integerValue264=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue264.getTree());
                    dbg.location(403,35);
                    pushFollow(FOLLOW_minute_in_durationValue2201);
                    minute265=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute265.getTree());
                    dbg.location(403,42);
                    pushFollow(FOLLOW_numericValue_in_durationValue2203);
                    numericValue266=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue266.getTree());
                    dbg.location(403,55);
                    pushFollow(FOLLOW_second_in_durationValue2205);
                    second267=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second267.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:404:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(404,4);
                    pushFollow(FOLLOW_integerValue_in_durationValue2210);
                    integerValue268=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue268.getTree());
                    dbg.location(404,17);
                    pushFollow(FOLLOW_minute_in_durationValue2212);
                    minute269=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute269.getTree());
                    dbg.location(404,24);
                    pushFollow(FOLLOW_numericValue_in_durationValue2214);
                    numericValue270=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue270.getTree());
                    dbg.location(404,37);
                    pushFollow(FOLLOW_second_in_durationValue2216);
                    second271=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second271.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(405,4);
                    pushFollow(FOLLOW_timeFormat_in_durationValue2221);
                    timeFormat272=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat272.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(406, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "durationValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "durationValue"

    public static class direction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "direction"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:410:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection273 = null;

        flipsParser.relativeDirection_return relativeDirection274 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try { dbg.enterRule(getGrammarFileName(), "direction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(410, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:411:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt93=2;
            try { dbg.enterDecision(93);

            switch ( input.LA(1) ) {
            case 200:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
                {
                alt93=1;
                }
                break;
            case Turning:
                {
                int LA93_2 = input.LA(2);

                if ( ((LA93_2>=FloatingPointLiteral && LA93_2<=HexLiteral)||LA93_2==200||(LA93_2>=206 && LA93_2<=236)) ) {
                    alt93=1;
                }
                else if ( ((LA93_2>=248 && LA93_2<=253)) ) {
                    alt93=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA93_3 = input.LA(2);

                if ( ((LA93_3>=248 && LA93_3<=253)) ) {
                    alt93=2;
                }
                else if ( ((LA93_3>=FloatingPointLiteral && LA93_3<=HexLiteral)||LA93_3==200||(LA93_3>=206 && LA93_3<=236)) ) {
                    alt93=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(93);}

            switch (alt93) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:411:4: fixedDirection
                    {
                    dbg.location(411,4);
                    pushFollow(FOLLOW_fixedDirection_in_direction2234);
                    fixedDirection273=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection273.getTree());


                    // AST REWRITE
                    // elements: fixedDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 412:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        dbg.location(412,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:412:5: ^( DIRECTION FIXED fixedDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(412,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                        dbg.location(412,17);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                        dbg.location(412,23);
                        adaptor.addChild(root_1, stream_fixedDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:4: relativeDirection
                    {
                    dbg.location(413,4);
                    pushFollow(FOLLOW_relativeDirection_in_direction2250);
                    relativeDirection274=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection274.getTree());


                    // AST REWRITE
                    // elements: relativeDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 414:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        dbg.location(414,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:414:5: ^( DIRECTION RELATIVE relativeDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(414,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                        dbg.location(414,17);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        dbg.location(414,26);
                        adaptor.addChild(root_1, stream_relativeDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(415, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "direction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "direction"

    public static class fixedDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:417:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning278=null;
        Token Heading279=null;
        flipsParser.cardinalDirection_return cardinalDirection275 = null;

        flipsParser.ordinalDirection_return ordinalDirection276 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection277 = null;

        flipsParser.cardinalDirection_return cardinalDirection280 = null;

        flipsParser.ordinalDirection_return ordinalDirection281 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection282 = null;

        flipsParser.angularValue_return angularValue283 = null;


        CommonTree Turning278_tree=null;
        CommonTree Heading279_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try { dbg.enterRule(getGrammarFileName(), "fixedDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(417, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt96=4;
            try { dbg.enterDecision(96);

            switch ( input.LA(1) ) {
            case 200:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
                {
                alt96=1;
                }
                break;
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
                {
                alt96=2;
                }
                break;
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
                {
                alt96=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(96);}

            switch (alt96) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:4: cardinalDirection
                    {
                    dbg.location(418,4);
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2272);
                    cardinalDirection275=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection275.getTree());


                    // AST REWRITE
                    // elements: cardinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 419:2: -> cardinalDirection
                    {
                        dbg.location(419,5);
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:420:4: ordinalDirection
                    {
                    dbg.location(420,4);
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2282);
                    ordinalDirection276=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection276.getTree());


                    // AST REWRITE
                    // elements: ordinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 421:2: -> ordinalDirection
                    {
                        dbg.location(421,5);
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:422:4: subOrdinalDirection
                    {
                    dbg.location(422,4);
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2292);
                    subOrdinalDirection277=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection277.getTree());


                    // AST REWRITE
                    // elements: subOrdinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 423:2: -> subOrdinalDirection
                    {
                        dbg.location(423,5);
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    dbg.location(424,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:4: ( Turning | Heading )
                    int alt94=2;
                    try { dbg.enterSubRule(94);
                    try { dbg.enterDecision(94);

                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==Turning) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==Heading) ) {
                        alt94=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(94);}

                    switch (alt94) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:5: Turning
                            {
                            dbg.location(424,5);
                            Turning278=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2303);  
                            stream_Turning.add(Turning278);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:13: Heading
                            {
                            dbg.location(424,13);
                            Heading279=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2305);  
                            stream_Heading.add(Heading279);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(94);}

                    dbg.location(424,22);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt95=4;
                    try { dbg.enterSubRule(95);
                    try { dbg.enterDecision(95);

                    switch ( input.LA(1) ) {
                    case 200:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                        {
                        alt95=1;
                        }
                        break;
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                        {
                        alt95=2;
                        }
                        break;
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                        {
                        alt95=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt95=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(95);}

                    switch (alt95) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:23: cardinalDirection
                            {
                            dbg.location(424,23);
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2309);
                            cardinalDirection280=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection280.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:41: ordinalDirection
                            {
                            dbg.location(424,41);
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2311);
                            ordinalDirection281=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection281.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:58: subOrdinalDirection
                            {
                            dbg.location(424,58);
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2313);
                            subOrdinalDirection282=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection282.getTree());

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:78: angularValue
                            {
                            dbg.location(424,78);
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2315);
                            angularValue283=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue283.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(95);}



                    // AST REWRITE
                    // elements: cardinalDirection, subOrdinalDirection, angularValue, ordinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 425:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        dbg.location(425,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:425:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            dbg.location(425,5);
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        dbg.location(425,24);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:425:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            dbg.location(425,24);
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        dbg.location(425,42);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:425:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            dbg.location(425,42);
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        dbg.location(425,63);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:425:63: ( angularValue )?
                        if ( stream_angularValue.hasNext() ) {
                            dbg.location(425,63);
                            adaptor.addChild(root_0, stream_angularValue.nextTree());

                        }
                        stream_angularValue.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(426, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fixedDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fixedDirection"

    public static class relativeDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:428:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning284=null;
        Token Heading285=null;
        flipsParser.leftRightDirection_return leftRightDirection286 = null;

        flipsParser.angularValue_return angularValue287 = null;


        CommonTree Turning284_tree=null;
        CommonTree Heading285_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try { dbg.enterRule(getGrammarFileName(), "relativeDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(428, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            dbg.location(429,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:4: ( Turning | Heading )
            int alt97=2;
            try { dbg.enterSubRule(97);
            try { dbg.enterDecision(97);

            int LA97_0 = input.LA(1);

            if ( (LA97_0==Turning) ) {
                alt97=1;
            }
            else if ( (LA97_0==Heading) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(97);}

            switch (alt97) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:5: Turning
                    {
                    dbg.location(429,5);
                    Turning284=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2343);  
                    stream_Turning.add(Turning284);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:13: Heading
                    {
                    dbg.location(429,13);
                    Heading285=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2345);  
                    stream_Heading.add(Heading285);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(97);}

            dbg.location(429,22);
            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2348);
            leftRightDirection286=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection286.getTree());
            dbg.location(429,41);
            pushFollow(FOLLOW_angularValue_in_relativeDirection2350);
            angularValue287=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue287.getTree());


            // AST REWRITE
            // elements: leftRightDirection, angularValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 430:2: -> leftRightDirection angularValue
            {
                dbg.location(430,5);
                adaptor.addChild(root_0, stream_leftRightDirection.nextTree());
                dbg.location(430,24);
                adaptor.addChild(root_0, stream_angularValue.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(431, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relativeDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relativeDirection"

    public static class cardinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cardinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:433:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection288 = null;

        flipsParser.eastWestDirection_return eastWestDirection289 = null;



        try { dbg.enterRule(getGrammarFileName(), "cardinalDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:2: ( northSouthDirection | eastWestDirection )
            int alt98=2;
            try { dbg.enterDecision(98);

            int LA98_0 = input.LA(1);

            if ( (LA98_0==200||(LA98_0>=206 && LA98_0<=208)) ) {
                alt98=1;
            }
            else if ( ((LA98_0>=209 && LA98_0<=212)) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(98);}

            switch (alt98) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(434,4);
                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2368);
                    northSouthDirection288=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection288.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(435,4);
                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2373);
                    eastWestDirection289=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection289.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(436, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cardinalDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cardinalDirection"

    public static class northSouthDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "northSouthDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:438:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal290=null;
        Token string_literal291=null;
        Token char_literal292=null;
        Token string_literal293=null;

        CommonTree char_literal290_tree=null;
        CommonTree string_literal291_tree=null;
        CommonTree char_literal292_tree=null;
        CommonTree string_literal293_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");

        try { dbg.enterRule(getGrammarFileName(), "northSouthDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(438, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt101=2;
            try { dbg.enterDecision(101);

            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=206 && LA101_0<=207)) ) {
                alt101=1;
            }
            else if ( (LA101_0==200||LA101_0==208) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(101);}

            switch (alt101) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:4: ( 'n' | 'north' )
                    {
                    dbg.location(439,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:4: ( 'n' | 'north' )
                    int alt99=2;
                    try { dbg.enterSubRule(99);
                    try { dbg.enterDecision(99);

                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==206) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==207) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(99);}

                    switch (alt99) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:5: 'n'
                            {
                            dbg.location(439,5);
                            char_literal290=(Token)match(input,206,FOLLOW_206_in_northSouthDirection2385);  
                            stream_206.add(char_literal290);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:9: 'north'
                            {
                            dbg.location(439,9);
                            string_literal291=(Token)match(input,207,FOLLOW_207_in_northSouthDirection2387);  
                            stream_207.add(string_literal291);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(99);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 440:2: -> NORTH
                    {
                        dbg.location(440,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:4: ( 's' | 'south' )
                    {
                    dbg.location(441,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:4: ( 's' | 'south' )
                    int alt100=2;
                    try { dbg.enterSubRule(100);
                    try { dbg.enterDecision(100);

                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==200) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==208) ) {
                        alt100=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(100);}

                    switch (alt100) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:5: 's'
                            {
                            dbg.location(441,5);
                            char_literal292=(Token)match(input,200,FOLLOW_200_in_northSouthDirection2399);  
                            stream_200.add(char_literal292);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:9: 'south'
                            {
                            dbg.location(441,9);
                            string_literal293=(Token)match(input,208,FOLLOW_208_in_northSouthDirection2401);  
                            stream_208.add(string_literal293);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(100);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 442:2: -> SOUTH
                    {
                        dbg.location(442,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(443, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "northSouthDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "northSouthDirection"

    public static class eastWestDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eastWestDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:445:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal294=null;
        Token string_literal295=null;
        Token char_literal296=null;
        Token string_literal297=null;

        CommonTree char_literal294_tree=null;
        CommonTree string_literal295_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree string_literal297_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");

        try { dbg.enterRule(getGrammarFileName(), "eastWestDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(445, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt104=2;
            try { dbg.enterDecision(104);

            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=209 && LA104_0<=210)) ) {
                alt104=1;
            }
            else if ( ((LA104_0>=211 && LA104_0<=212)) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(104);}

            switch (alt104) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( 'e' | 'east' )
                    {
                    dbg.location(446,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( 'e' | 'east' )
                    int alt102=2;
                    try { dbg.enterSubRule(102);
                    try { dbg.enterDecision(102);

                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==209) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==210) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(102);}

                    switch (alt102) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:5: 'e'
                            {
                            dbg.location(446,5);
                            char_literal294=(Token)match(input,209,FOLLOW_209_in_eastWestDirection2419);  
                            stream_209.add(char_literal294);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:9: 'east'
                            {
                            dbg.location(446,9);
                            string_literal295=(Token)match(input,210,FOLLOW_210_in_eastWestDirection2421);  
                            stream_210.add(string_literal295);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(102);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 447:2: -> EAST
                    {
                        dbg.location(447,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:448:4: ( 'w' | 'west' )
                    {
                    dbg.location(448,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:448:4: ( 'w' | 'west' )
                    int alt103=2;
                    try { dbg.enterSubRule(103);
                    try { dbg.enterDecision(103);

                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==211) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==212) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(103);}

                    switch (alt103) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:448:5: 'w'
                            {
                            dbg.location(448,5);
                            char_literal296=(Token)match(input,211,FOLLOW_211_in_eastWestDirection2433);  
                            stream_211.add(char_literal296);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:448:9: 'west'
                            {
                            dbg.location(448,9);
                            string_literal297=(Token)match(input,212,FOLLOW_212_in_eastWestDirection2435);  
                            stream_212.add(string_literal297);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(103);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 449:2: -> WEST
                    {
                        dbg.location(449,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(450, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eastWestDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "eastWestDirection"

    public static class ordinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:452:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal298=null;
        Token string_literal299=null;
        Token string_literal300=null;
        Token string_literal301=null;
        Token string_literal302=null;
        Token string_literal303=null;
        Token string_literal304=null;
        Token string_literal305=null;

        CommonTree string_literal298_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree string_literal301_tree=null;
        CommonTree string_literal302_tree=null;
        CommonTree string_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        CommonTree string_literal305_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");

        try { dbg.enterRule(getGrammarFileName(), "ordinalDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(452, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt109=4;
            try { dbg.enterDecision(109);

            switch ( input.LA(1) ) {
            case 213:
            case 214:
                {
                alt109=1;
                }
                break;
            case 215:
            case 216:
                {
                alt109=2;
                }
                break;
            case 217:
            case 218:
                {
                alt109=3;
                }
                break;
            case 219:
            case 220:
                {
                alt109=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(109);}

            switch (alt109) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:4: ( 'ne' | 'northeast' )
                    {
                    dbg.location(453,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:4: ( 'ne' | 'northeast' )
                    int alt105=2;
                    try { dbg.enterSubRule(105);
                    try { dbg.enterDecision(105);

                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==213) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==214) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(105);}

                    switch (alt105) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:5: 'ne'
                            {
                            dbg.location(453,5);
                            string_literal298=(Token)match(input,213,FOLLOW_213_in_ordinalDirection2453);  
                            stream_213.add(string_literal298);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:10: 'northeast'
                            {
                            dbg.location(453,10);
                            string_literal299=(Token)match(input,214,FOLLOW_214_in_ordinalDirection2455);  
                            stream_214.add(string_literal299);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(105);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:2: -> NORTH EAST
                    {
                        dbg.location(454,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(454,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:455:4: ( 'se' | 'southeast' )
                    {
                    dbg.location(455,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:455:4: ( 'se' | 'southeast' )
                    int alt106=2;
                    try { dbg.enterSubRule(106);
                    try { dbg.enterDecision(106);

                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==215) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==216) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(106);}

                    switch (alt106) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:455:5: 'se'
                            {
                            dbg.location(455,5);
                            string_literal300=(Token)match(input,215,FOLLOW_215_in_ordinalDirection2469);  
                            stream_215.add(string_literal300);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:455:10: 'southeast'
                            {
                            dbg.location(455,10);
                            string_literal301=(Token)match(input,216,FOLLOW_216_in_ordinalDirection2471);  
                            stream_216.add(string_literal301);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(106);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 456:2: -> SOUTH EAST
                    {
                        dbg.location(456,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(456,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:457:4: ( 'sw' | 'southwest' )
                    {
                    dbg.location(457,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:457:4: ( 'sw' | 'southwest' )
                    int alt107=2;
                    try { dbg.enterSubRule(107);
                    try { dbg.enterDecision(107);

                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==217) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==218) ) {
                        alt107=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(107);}

                    switch (alt107) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:457:5: 'sw'
                            {
                            dbg.location(457,5);
                            string_literal302=(Token)match(input,217,FOLLOW_217_in_ordinalDirection2485);  
                            stream_217.add(string_literal302);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:457:10: 'southwest'
                            {
                            dbg.location(457,10);
                            string_literal303=(Token)match(input,218,FOLLOW_218_in_ordinalDirection2487);  
                            stream_218.add(string_literal303);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(107);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 458:2: -> SOUTH WEST
                    {
                        dbg.location(458,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(458,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:459:4: ( 'nw' | 'northwest' )
                    {
                    dbg.location(459,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:459:4: ( 'nw' | 'northwest' )
                    int alt108=2;
                    try { dbg.enterSubRule(108);
                    try { dbg.enterDecision(108);

                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==219) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==220) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(108);}

                    switch (alt108) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:459:5: 'nw'
                            {
                            dbg.location(459,5);
                            string_literal304=(Token)match(input,219,FOLLOW_219_in_ordinalDirection2501);  
                            stream_219.add(string_literal304);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:459:10: 'northwest'
                            {
                            dbg.location(459,10);
                            string_literal305=(Token)match(input,220,FOLLOW_220_in_ordinalDirection2503);  
                            stream_220.add(string_literal305);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(108);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 460:2: -> NORTH WEST
                    {
                        dbg.location(460,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(460,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(461, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ordinalDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ordinalDirection"

    public static class subOrdinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subOrdinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token string_literal310=null;
        Token string_literal311=null;
        Token string_literal312=null;
        Token string_literal313=null;
        Token string_literal314=null;
        Token string_literal315=null;
        Token string_literal316=null;
        Token string_literal317=null;
        Token string_literal318=null;
        Token string_literal319=null;
        Token string_literal320=null;
        Token string_literal321=null;

        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        CommonTree string_literal313_tree=null;
        CommonTree string_literal314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        CommonTree string_literal319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree string_literal321_tree=null;
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");

        try { dbg.enterRule(getGrammarFileName(), "subOrdinalDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt118=8;
            try { dbg.enterDecision(118);

            switch ( input.LA(1) ) {
            case 221:
            case 222:
                {
                alt118=1;
                }
                break;
            case 223:
            case 224:
                {
                alt118=2;
                }
                break;
            case 225:
            case 226:
                {
                alt118=3;
                }
                break;
            case 227:
            case 228:
                {
                alt118=4;
                }
                break;
            case 229:
            case 230:
                {
                alt118=5;
                }
                break;
            case 231:
            case 232:
                {
                alt118=6;
                }
                break;
            case 233:
            case 234:
                {
                alt118=7;
                }
                break;
            case 235:
            case 236:
                {
                alt118=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(118);}

            switch (alt118) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:4: ( 'nne' | 'north-northeast' )
                    {
                    dbg.location(464,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:4: ( 'nne' | 'north-northeast' )
                    int alt110=2;
                    try { dbg.enterSubRule(110);
                    try { dbg.enterDecision(110);

                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==221) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==222) ) {
                        alt110=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(110);}

                    switch (alt110) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:5: 'nne'
                            {
                            dbg.location(464,5);
                            string_literal306=(Token)match(input,221,FOLLOW_221_in_subOrdinalDirection2523);  
                            stream_221.add(string_literal306);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:11: 'north-northeast'
                            {
                            dbg.location(464,11);
                            string_literal307=(Token)match(input,222,FOLLOW_222_in_subOrdinalDirection2525);  
                            stream_222.add(string_literal307);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(110);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 465:2: -> NORTH NORTH EAST
                    {
                        dbg.location(465,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(465,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(465,17);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:466:4: ( 'ene' | 'east-northeast' )
                    {
                    dbg.location(466,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:466:4: ( 'ene' | 'east-northeast' )
                    int alt111=2;
                    try { dbg.enterSubRule(111);
                    try { dbg.enterDecision(111);

                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==223) ) {
                        alt111=1;
                    }
                    else if ( (LA111_0==224) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(111);}

                    switch (alt111) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:466:5: 'ene'
                            {
                            dbg.location(466,5);
                            string_literal308=(Token)match(input,223,FOLLOW_223_in_subOrdinalDirection2541);  
                            stream_223.add(string_literal308);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:466:11: 'east-northeast'
                            {
                            dbg.location(466,11);
                            string_literal309=(Token)match(input,224,FOLLOW_224_in_subOrdinalDirection2543);  
                            stream_224.add(string_literal309);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(111);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 467:2: -> EAST NORTH EAST
                    {
                        dbg.location(467,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        dbg.location(467,10);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(467,16);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:468:4: ( 'ese' | 'east-southeast' )
                    {
                    dbg.location(468,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:468:4: ( 'ese' | 'east-southeast' )
                    int alt112=2;
                    try { dbg.enterSubRule(112);
                    try { dbg.enterDecision(112);

                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==225) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==226) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(112);}

                    switch (alt112) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:468:5: 'ese'
                            {
                            dbg.location(468,5);
                            string_literal310=(Token)match(input,225,FOLLOW_225_in_subOrdinalDirection2559);  
                            stream_225.add(string_literal310);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:468:11: 'east-southeast'
                            {
                            dbg.location(468,11);
                            string_literal311=(Token)match(input,226,FOLLOW_226_in_subOrdinalDirection2561);  
                            stream_226.add(string_literal311);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(112);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 469:2: -> EAST SOUTH EAST
                    {
                        dbg.location(469,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        dbg.location(469,10);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(469,16);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:4: ( 'sse' | 'south-southeast' )
                    {
                    dbg.location(470,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:4: ( 'sse' | 'south-southeast' )
                    int alt113=2;
                    try { dbg.enterSubRule(113);
                    try { dbg.enterDecision(113);

                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==227) ) {
                        alt113=1;
                    }
                    else if ( (LA113_0==228) ) {
                        alt113=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(113);}

                    switch (alt113) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:5: 'sse'
                            {
                            dbg.location(470,5);
                            string_literal312=(Token)match(input,227,FOLLOW_227_in_subOrdinalDirection2577);  
                            stream_227.add(string_literal312);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:11: 'south-southeast'
                            {
                            dbg.location(470,11);
                            string_literal313=(Token)match(input,228,FOLLOW_228_in_subOrdinalDirection2579);  
                            stream_228.add(string_literal313);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(113);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 471:2: -> SOUTH SOUTH EAST
                    {
                        dbg.location(471,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(471,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(471,17);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:4: ( 'ssw' | 'south-southwest' )
                    {
                    dbg.location(472,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:4: ( 'ssw' | 'south-southwest' )
                    int alt114=2;
                    try { dbg.enterSubRule(114);
                    try { dbg.enterDecision(114);

                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==229) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==230) ) {
                        alt114=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(114);}

                    switch (alt114) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:5: 'ssw'
                            {
                            dbg.location(472,5);
                            string_literal314=(Token)match(input,229,FOLLOW_229_in_subOrdinalDirection2595);  
                            stream_229.add(string_literal314);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:11: 'south-southwest'
                            {
                            dbg.location(472,11);
                            string_literal315=(Token)match(input,230,FOLLOW_230_in_subOrdinalDirection2597);  
                            stream_230.add(string_literal315);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(114);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 473:2: -> SOUTH SOUTH WEST
                    {
                        dbg.location(473,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(473,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(473,17);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:4: ( 'wsw' | 'west-southwest' )
                    {
                    dbg.location(474,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:4: ( 'wsw' | 'west-southwest' )
                    int alt115=2;
                    try { dbg.enterSubRule(115);
                    try { dbg.enterDecision(115);

                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==231) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==232) ) {
                        alt115=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(115);}

                    switch (alt115) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:5: 'wsw'
                            {
                            dbg.location(474,5);
                            string_literal316=(Token)match(input,231,FOLLOW_231_in_subOrdinalDirection2613);  
                            stream_231.add(string_literal316);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:11: 'west-southwest'
                            {
                            dbg.location(474,11);
                            string_literal317=(Token)match(input,232,FOLLOW_232_in_subOrdinalDirection2615);  
                            stream_232.add(string_literal317);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(115);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 475:2: -> WEST SOUTH WEST
                    {
                        dbg.location(475,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        dbg.location(475,10);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        dbg.location(475,16);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:4: ( 'wnw' | 'west-northwest' )
                    {
                    dbg.location(476,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:4: ( 'wnw' | 'west-northwest' )
                    int alt116=2;
                    try { dbg.enterSubRule(116);
                    try { dbg.enterDecision(116);

                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==233) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==234) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(116);}

                    switch (alt116) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:5: 'wnw'
                            {
                            dbg.location(476,5);
                            string_literal318=(Token)match(input,233,FOLLOW_233_in_subOrdinalDirection2631);  
                            stream_233.add(string_literal318);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:11: 'west-northwest'
                            {
                            dbg.location(476,11);
                            string_literal319=(Token)match(input,234,FOLLOW_234_in_subOrdinalDirection2633);  
                            stream_234.add(string_literal319);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(116);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 477:2: -> WEST NORTH WEST
                    {
                        dbg.location(477,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        dbg.location(477,10);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(477,16);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:4: ( 'nnw' | 'north-northwest' )
                    {
                    dbg.location(478,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:4: ( 'nnw' | 'north-northwest' )
                    int alt117=2;
                    try { dbg.enterSubRule(117);
                    try { dbg.enterDecision(117);

                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==235) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==236) ) {
                        alt117=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(117);}

                    switch (alt117) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:5: 'nnw'
                            {
                            dbg.location(478,5);
                            string_literal320=(Token)match(input,235,FOLLOW_235_in_subOrdinalDirection2649);  
                            stream_235.add(string_literal320);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:11: 'north-northwest'
                            {
                            dbg.location(478,11);
                            string_literal321=(Token)match(input,236,FOLLOW_236_in_subOrdinalDirection2651);  
                            stream_236.add(string_literal321);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(117);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 479:2: -> NORTH NORTH WEST
                    {
                        dbg.location(479,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(479,11);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        dbg.location(479,17);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(480, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "subOrdinalDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "subOrdinalDirection"

    public static class loiterDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:482:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning322=null;
        flipsParser.clockDirection_return clockDirection323 = null;


        CommonTree Turning322_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try { dbg.enterRule(getGrammarFileName(), "loiterDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(482, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( Turning )? clockDirection
            {
            dbg.location(483,4);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( Turning )?
            int alt119=2;
            try { dbg.enterSubRule(119);
            try { dbg.enterDecision(119);

            int LA119_0 = input.LA(1);

            if ( (LA119_0==Turning) ) {
                alt119=1;
            }
            } finally {dbg.exitDecision(119);}

            switch (alt119) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: Turning
                    {
                    dbg.location(483,4);
                    Turning322=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection2672);  
                    stream_Turning.add(Turning322);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(119);}

            dbg.location(483,13);
            pushFollow(FOLLOW_clockDirection_in_loiterDirection2675);
            clockDirection323=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection323.getTree());


            // AST REWRITE
            // elements: clockDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 484:2: -> ^( DIRECTION TURN clockDirection )
            {
                dbg.location(484,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:484:5: ^( DIRECTION TURN clockDirection )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(484,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                dbg.location(484,17);
                adaptor.addChild(root_1, (CommonTree)adaptor.create(TURN, "TURN"));
                dbg.location(484,22);
                adaptor.addChild(root_1, stream_clockDirection.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(485, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loiterDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "loiterDirection"

    public static class upDownDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "upDownDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal324=null;
        Token string_literal325=null;
        Token char_literal326=null;
        Token string_literal327=null;
        Token string_literal328=null;
        Token string_literal329=null;
        Token string_literal330=null;
        Token char_literal331=null;
        Token string_literal332=null;
        Token string_literal333=null;
        Token string_literal334=null;

        CommonTree char_literal324_tree=null;
        CommonTree string_literal325_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree string_literal327_tree=null;
        CommonTree string_literal328_tree=null;
        CommonTree string_literal329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree char_literal331_tree=null;
        CommonTree string_literal332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree string_literal334_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try { dbg.enterRule(getGrammarFileName(), "upDownDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(487, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt122=2;
            try { dbg.enterDecision(122);

            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=237 && LA122_0<=243)) ) {
                alt122=1;
            }
            else if ( ((LA122_0>=244 && LA122_0<=247)) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(122);}

            switch (alt122) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    dbg.location(488,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt120=7;
                    try { dbg.enterSubRule(120);
                    try { dbg.enterDecision(120);

                    switch ( input.LA(1) ) {
                    case 237:
                        {
                        alt120=1;
                        }
                        break;
                    case 238:
                        {
                        alt120=2;
                        }
                        break;
                    case 239:
                        {
                        alt120=3;
                        }
                        break;
                    case 240:
                        {
                        alt120=4;
                        }
                        break;
                    case 241:
                        {
                        alt120=5;
                        }
                        break;
                    case 242:
                        {
                        alt120=6;
                        }
                        break;
                    case 243:
                        {
                        alt120=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 120, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(120);}

                    switch (alt120) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:5: 'u'
                            {
                            dbg.location(488,5);
                            char_literal324=(Token)match(input,237,FOLLOW_237_in_upDownDirection2698);  
                            stream_237.add(char_literal324);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:9: 'up'
                            {
                            dbg.location(488,9);
                            string_literal325=(Token)match(input,238,FOLLOW_238_in_upDownDirection2700);  
                            stream_238.add(string_literal325);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:14: 'c'
                            {
                            dbg.location(488,14);
                            char_literal326=(Token)match(input,239,FOLLOW_239_in_upDownDirection2702);  
                            stream_239.add(char_literal326);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:18: 'climb'
                            {
                            dbg.location(488,18);
                            string_literal327=(Token)match(input,240,FOLLOW_240_in_upDownDirection2704);  
                            stream_240.add(string_literal327);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:26: 'climbing'
                            {
                            dbg.location(488,26);
                            string_literal328=(Token)match(input,241,FOLLOW_241_in_upDownDirection2706);  
                            stream_241.add(string_literal328);


                            }
                            break;
                        case 6 :
                            dbg.enterAlt(6);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:37: 'ascend'
                            {
                            dbg.location(488,37);
                            string_literal329=(Token)match(input,242,FOLLOW_242_in_upDownDirection2708);  
                            stream_242.add(string_literal329);


                            }
                            break;
                        case 7 :
                            dbg.enterAlt(7);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:46: 'ascending'
                            {
                            dbg.location(488,46);
                            string_literal330=(Token)match(input,243,FOLLOW_243_in_upDownDirection2710);  
                            stream_243.add(string_literal330);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(120);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 489:2: -> CLIMB
                    {
                        dbg.location(489,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    dbg.location(490,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt121=4;
                    try { dbg.enterSubRule(121);
                    try { dbg.enterDecision(121);

                    switch ( input.LA(1) ) {
                    case 244:
                        {
                        alt121=1;
                        }
                        break;
                    case 245:
                        {
                        alt121=2;
                        }
                        break;
                    case 246:
                        {
                        alt121=3;
                        }
                        break;
                    case 247:
                        {
                        alt121=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(121);}

                    switch (alt121) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:5: 'd'
                            {
                            dbg.location(490,5);
                            char_literal331=(Token)match(input,244,FOLLOW_244_in_upDownDirection2722);  
                            stream_244.add(char_literal331);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:9: 'down'
                            {
                            dbg.location(490,9);
                            string_literal332=(Token)match(input,245,FOLLOW_245_in_upDownDirection2724);  
                            stream_245.add(string_literal332);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:16: 'descend'
                            {
                            dbg.location(490,16);
                            string_literal333=(Token)match(input,246,FOLLOW_246_in_upDownDirection2726);  
                            stream_246.add(string_literal333);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:26: 'descending'
                            {
                            dbg.location(490,26);
                            string_literal334=(Token)match(input,247,FOLLOW_247_in_upDownDirection2728);  
                            stream_247.add(string_literal334);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(121);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 491:2: -> DESCEND
                    {
                        dbg.location(491,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DESCEND, "DESCEND"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(492, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "upDownDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "upDownDirection"

    public static class leftRightDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftRightDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:494:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal335=null;
        Token string_literal336=null;
        Token string_literal337=null;
        Token char_literal338=null;
        Token string_literal339=null;
        Token string_literal340=null;

        CommonTree char_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree char_literal338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");

        try { dbg.enterRule(getGrammarFileName(), "leftRightDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(494, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt125=2;
            try { dbg.enterDecision(125);

            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=248 && LA125_0<=250)) ) {
                alt125=1;
            }
            else if ( ((LA125_0>=251 && LA125_0<=253)) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(125);}

            switch (alt125) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'l' | 'left' | 'port' )
                    {
                    dbg.location(495,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'l' | 'left' | 'port' )
                    int alt123=3;
                    try { dbg.enterSubRule(123);
                    try { dbg.enterDecision(123);

                    switch ( input.LA(1) ) {
                    case 248:
                        {
                        alt123=1;
                        }
                        break;
                    case 249:
                        {
                        alt123=2;
                        }
                        break;
                    case 250:
                        {
                        alt123=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(123);}

                    switch (alt123) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:5: 'l'
                            {
                            dbg.location(495,5);
                            char_literal335=(Token)match(input,248,FOLLOW_248_in_leftRightDirection2746);  
                            stream_248.add(char_literal335);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:9: 'left'
                            {
                            dbg.location(495,9);
                            string_literal336=(Token)match(input,249,FOLLOW_249_in_leftRightDirection2748);  
                            stream_249.add(string_literal336);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:16: 'port'
                            {
                            dbg.location(495,16);
                            string_literal337=(Token)match(input,250,FOLLOW_250_in_leftRightDirection2750);  
                            stream_250.add(string_literal337);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(123);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 496:2: -> LEFT
                    {
                        dbg.location(496,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:4: ( 'r' | 'right' | 'starboard' )
                    {
                    dbg.location(497,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:4: ( 'r' | 'right' | 'starboard' )
                    int alt124=3;
                    try { dbg.enterSubRule(124);
                    try { dbg.enterDecision(124);

                    switch ( input.LA(1) ) {
                    case 251:
                        {
                        alt124=1;
                        }
                        break;
                    case 252:
                        {
                        alt124=2;
                        }
                        break;
                    case 253:
                        {
                        alt124=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(124);}

                    switch (alt124) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:5: 'r'
                            {
                            dbg.location(497,5);
                            char_literal338=(Token)match(input,251,FOLLOW_251_in_leftRightDirection2762);  
                            stream_251.add(char_literal338);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:9: 'right'
                            {
                            dbg.location(497,9);
                            string_literal339=(Token)match(input,252,FOLLOW_252_in_leftRightDirection2764);  
                            stream_252.add(string_literal339);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:17: 'starboard'
                            {
                            dbg.location(497,17);
                            string_literal340=(Token)match(input,253,FOLLOW_253_in_leftRightDirection2766);  
                            stream_253.add(string_literal340);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(124);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 498:2: -> RIGHT
                    {
                        dbg.location(498,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(RIGHT, "RIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(499, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "leftRightDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "leftRightDirection"

    public static class clockDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clockDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:501:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal341=null;
        Token string_literal342=null;
        Token string_literal343=null;
        Token string_literal344=null;

        CommonTree string_literal341_tree=null;
        CommonTree string_literal342_tree=null;
        CommonTree string_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try { dbg.enterRule(getGrammarFileName(), "clockDirection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(501, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt128=2;
            try { dbg.enterDecision(128);

            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=254 && LA128_0<=255)) ) {
                alt128=1;
            }
            else if ( ((LA128_0>=256 && LA128_0<=257)) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(128);}

            switch (alt128) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:4: ( 'cw' | 'clockwise' )
                    {
                    dbg.location(502,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:4: ( 'cw' | 'clockwise' )
                    int alt126=2;
                    try { dbg.enterSubRule(126);
                    try { dbg.enterDecision(126);

                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==254) ) {
                        alt126=1;
                    }
                    else if ( (LA126_0==255) ) {
                        alt126=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(126);}

                    switch (alt126) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:5: 'cw'
                            {
                            dbg.location(502,5);
                            string_literal341=(Token)match(input,254,FOLLOW_254_in_clockDirection2784);  
                            stream_254.add(string_literal341);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:10: 'clockwise'
                            {
                            dbg.location(502,10);
                            string_literal342=(Token)match(input,255,FOLLOW_255_in_clockDirection2786);  
                            stream_255.add(string_literal342);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(126);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 503:2: -> CLOCKWISE
                    {
                        dbg.location(503,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:4: ( 'ccw' | 'counterclockwise' )
                    {
                    dbg.location(504,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:4: ( 'ccw' | 'counterclockwise' )
                    int alt127=2;
                    try { dbg.enterSubRule(127);
                    try { dbg.enterDecision(127);

                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==256) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==257) ) {
                        alt127=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(127);}

                    switch (alt127) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:5: 'ccw'
                            {
                            dbg.location(504,5);
                            string_literal343=(Token)match(input,256,FOLLOW_256_in_clockDirection2798);  
                            stream_256.add(string_literal343);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:11: 'counterclockwise'
                            {
                            dbg.location(504,11);
                            string_literal344=(Token)match(input,257,FOLLOW_257_in_clockDirection2800);  
                            stream_257.add(string_literal344);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(127);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 505:2: -> COUNTERCLOCKWISE
                    {
                        dbg.location(505,5);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(COUNTERCLOCKWISE, "COUNTERCLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(506, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "clockDirection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "clockDirection"

    public static class angularValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "angularValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:508:1: angularValue : ( numericValue ( '¡' | 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue ( '¡' | 'd' )? numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal346=null;
        Token string_literal347=null;
        Token string_literal348=null;
        Token string_literal349=null;
        Token string_literal350=null;
        Token char_literal352=null;
        Token char_literal353=null;
        Token char_literal355=null;
        Token string_literal357=null;
        Token string_literal358=null;
        Token string_literal359=null;
        Token string_literal360=null;
        flipsParser.numericValue_return numericValue345 = null;

        flipsParser.integerValue_return integerValue351 = null;

        flipsParser.numericValue_return numericValue354 = null;

        flipsParser.numericValue_return numericValue356 = null;


        CommonTree char_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        CommonTree string_literal348_tree=null;
        CommonTree string_literal349_tree=null;
        CommonTree string_literal350_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree char_literal353_tree=null;
        CommonTree char_literal355_tree=null;
        CommonTree string_literal357_tree=null;
        CommonTree string_literal358_tree=null;
        CommonTree string_literal359_tree=null;
        CommonTree string_literal360_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try { dbg.enterRule(getGrammarFileName(), "angularValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(508, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:2: ( numericValue ( '¡' | 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue ( '¡' | 'd' )? numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt132=3;
            try { dbg.enterDecision(132);

            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=BinaryLiteral && LA132_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 258:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case Identifier:
                    case To:
                    case At:
                    case With:
                    case Turning:
                    case Heading:
                    case 94:
                    case 95:
                    case 100:
                    case 101:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 116:
                    case 117:
                    case 119:
                    case 120:
                    case 123:
                    case 144:
                    case 145:
                    case 200:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                    case 238:
                    case 239:
                    case 240:
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                    case 245:
                    case 246:
                    case 247:
                    case 248:
                    case 249:
                    case 250:
                    case 251:
                    case 252:
                    case 253:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                    case 268:
                    case 269:
                        {
                        alt132=1;
                        }
                        break;
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA132_7 = input.LA(4);

                        if ( (LA132_7==EOF||(LA132_7>=Identifier && LA132_7<=With)||(LA132_7>=Turning && LA132_7<=HexLiteral)||(LA132_7>=94 && LA132_7<=95)||(LA132_7>=100 && LA132_7<=101)||(LA132_7>=107 && LA132_7<=114)||(LA132_7>=116 && LA132_7<=117)||(LA132_7>=119 && LA132_7<=120)||LA132_7==123||(LA132_7>=144 && LA132_7<=163)||(LA132_7>=166 && LA132_7<=172)||LA132_7==200||(LA132_7>=205 && LA132_7<=262)||(LA132_7>=264 && LA132_7<=267)||(LA132_7>=270 && LA132_7<=271)) ) {
                            alt132=1;
                        }
                        else if ( (LA132_7==263) ) {
                            alt132=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 132, 7, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA132_8 = input.LA(4);

                        if ( (LA132_8==EOF||(LA132_8>=Identifier && LA132_8<=With)||(LA132_8>=Turning && LA132_8<=HexLiteral)||(LA132_8>=94 && LA132_8<=95)||(LA132_8>=100 && LA132_8<=101)||(LA132_8>=107 && LA132_8<=114)||(LA132_8>=116 && LA132_8<=117)||(LA132_8>=119 && LA132_8<=120)||LA132_8==123||(LA132_8>=144 && LA132_8<=163)||(LA132_8>=166 && LA132_8<=172)||LA132_8==200||(LA132_8>=205 && LA132_8<=262)||(LA132_8>=264 && LA132_8<=267)||(LA132_8>=270 && LA132_8<=271)) ) {
                            alt132=1;
                        }
                        else if ( (LA132_8==263) ) {
                            alt132=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 132, 8, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    }
                    break;
                case 259:
                case 260:
                case 261:
                case 262:
                    {
                    alt132=1;
                    }
                    break;
                case 264:
                case 265:
                case 266:
                case 267:
                    {
                    alt132=3;
                    }
                    break;
                case FloatingPointLiteral:
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                case 244:
                    {
                    alt132=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else if ( (LA132_0==FloatingPointLiteral) ) {
                int LA132_2 = input.LA(2);

                if ( ((LA132_2>=258 && LA132_2<=262)) ) {
                    alt132=1;
                }
                else if ( ((LA132_2>=264 && LA132_2<=267)) ) {
                    alt132=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(132);}

            switch (alt132) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:4: numericValue ( '¡' | 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    dbg.location(509,4);
                    pushFollow(FOLLOW_numericValue_in_angularValue2817);
                    numericValue345=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue345.getTree());
                    dbg.location(509,17);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:17: ( '¡' | 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt129=5;
                    try { dbg.enterSubRule(129);
                    try { dbg.enterDecision(129);

                    switch ( input.LA(1) ) {
                    case 258:
                        {
                        alt129=1;
                        }
                        break;
                    case 259:
                        {
                        alt129=2;
                        }
                        break;
                    case 260:
                        {
                        alt129=3;
                        }
                        break;
                    case 261:
                        {
                        alt129=4;
                        }
                        break;
                    case 262:
                        {
                        alt129=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(129);}

                    switch (alt129) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:18: '¡'
                            {
                            dbg.location(509,18);
                            char_literal346=(Token)match(input,258,FOLLOW_258_in_angularValue2820);  
                            stream_258.add(char_literal346);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:22: 'deg'
                            {
                            dbg.location(509,22);
                            string_literal347=(Token)match(input,259,FOLLOW_259_in_angularValue2822);  
                            stream_259.add(string_literal347);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:28: 'degs'
                            {
                            dbg.location(509,28);
                            string_literal348=(Token)match(input,260,FOLLOW_260_in_angularValue2824);  
                            stream_260.add(string_literal348);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:35: 'degree'
                            {
                            dbg.location(509,35);
                            string_literal349=(Token)match(input,261,FOLLOW_261_in_angularValue2826);  
                            stream_261.add(string_literal349);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:44: 'degrees'
                            {
                            dbg.location(509,44);
                            string_literal350=(Token)match(input,262,FOLLOW_262_in_angularValue2828);  
                            stream_262.add(string_literal350);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(129);}



                    // AST REWRITE
                    // elements: numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 510:2: -> numericValue DEGREE
                    {
                        dbg.location(510,5);
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        dbg.location(510,18);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:511:4: integerValue ( '¡' | 'd' )? numericValue '\\''
                    {
                    dbg.location(511,4);
                    pushFollow(FOLLOW_integerValue_in_angularValue2841);
                    integerValue351=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue351.getTree());
                    dbg.location(511,17);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:511:17: ( '¡' | 'd' )?
                    int alt130=3;
                    try { dbg.enterSubRule(130);
                    try { dbg.enterDecision(130);

                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==258) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==244) ) {
                        alt130=2;
                    }
                    } finally {dbg.exitDecision(130);}

                    switch (alt130) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:511:18: '¡'
                            {
                            dbg.location(511,18);
                            char_literal352=(Token)match(input,258,FOLLOW_258_in_angularValue2844);  
                            stream_258.add(char_literal352);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:511:22: 'd'
                            {
                            dbg.location(511,22);
                            char_literal353=(Token)match(input,244,FOLLOW_244_in_angularValue2846);  
                            stream_244.add(char_literal353);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(130);}

                    dbg.location(511,28);
                    pushFollow(FOLLOW_numericValue_in_angularValue2850);
                    numericValue354=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue354.getTree());
                    dbg.location(511,41);
                    char_literal355=(Token)match(input,263,FOLLOW_263_in_angularValue2852);  
                    stream_263.add(char_literal355);



                    // AST REWRITE
                    // elements: integerValue, numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 512:2: -> integerValue DEGREE numericValue MINUTE
                    {
                        dbg.location(512,5);
                        adaptor.addChild(root_0, stream_integerValue.nextTree());
                        dbg.location(512,18);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        dbg.location(512,25);
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        dbg.location(512,38);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    dbg.location(513,4);
                    pushFollow(FOLLOW_numericValue_in_angularValue2868);
                    numericValue356=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue356.getTree());
                    dbg.location(513,17);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt131=4;
                    try { dbg.enterSubRule(131);
                    try { dbg.enterDecision(131);

                    switch ( input.LA(1) ) {
                    case 264:
                        {
                        alt131=1;
                        }
                        break;
                    case 265:
                        {
                        alt131=2;
                        }
                        break;
                    case 266:
                        {
                        alt131=3;
                        }
                        break;
                    case 267:
                        {
                        alt131=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(131);}

                    switch (alt131) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:18: 'rad'
                            {
                            dbg.location(513,18);
                            string_literal357=(Token)match(input,264,FOLLOW_264_in_angularValue2871);  
                            stream_264.add(string_literal357);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:24: 'rads'
                            {
                            dbg.location(513,24);
                            string_literal358=(Token)match(input,265,FOLLOW_265_in_angularValue2873);  
                            stream_265.add(string_literal358);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:31: 'radian'
                            {
                            dbg.location(513,31);
                            string_literal359=(Token)match(input,266,FOLLOW_266_in_angularValue2875);  
                            stream_266.add(string_literal359);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:40: 'radians'
                            {
                            dbg.location(513,40);
                            string_literal360=(Token)match(input,267,FOLLOW_267_in_angularValue2877);  
                            stream_267.add(string_literal360);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(131);}



                    // AST REWRITE
                    // elements: numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 514:2: -> numericValue RADIAN
                    {
                        dbg.location(514,5);
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        dbg.location(514,18);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(RADIAN, "RADIAN"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(515, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "angularValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "angularValue"

    public static class waypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "waypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:1: waypoint : ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier362=null;
        flipsParser.geoCoordinate_return geoCoordinate361 = null;


        CommonTree Identifier362_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try { dbg.enterRule(getGrammarFileName(), "waypoint");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(519, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:520:2: ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt133=2;
            try { dbg.enterDecision(133);

            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=FloatingPointLiteral && LA133_0<=HexLiteral)||(LA133_0>=268 && LA133_0<=269)) ) {
                alt133=1;
            }
            else if ( (LA133_0==Identifier) ) {
                alt133=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(133);}

            switch (alt133) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:520:4: geoCoordinate
                    {
                    dbg.location(520,4);
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint2898);
                    geoCoordinate361=geoCoordinate();

                    state._fsp--;

                    stream_geoCoordinate.add(geoCoordinate361.getTree());


                    // AST REWRITE
                    // elements: geoCoordinate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 521:2: -> geoCoordinate
                    {
                        dbg.location(521,5);
                        adaptor.addChild(root_0, stream_geoCoordinate.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:522:4: Identifier
                    {
                    dbg.location(522,4);
                    Identifier362=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint2908);  
                    stream_Identifier.add(Identifier362);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 523:2: -> ^( WAYPOINT Identifier )
                    {
                        dbg.location(523,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:523:5: ^( WAYPOINT Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(523,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WAYPOINT, "WAYPOINT"), root_1);

                        dbg.location(523,16);
                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(524, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "waypoint");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "waypoint"

    public static class geoCoordinate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "geoCoordinate"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:1: geoCoordinate : latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) ;
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude363 = null;


        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try { dbg.enterRule(getGrammarFileName(), "geoCoordinate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(526, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:4: latitudeLongitude
            {
            dbg.location(527,4);
            pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate2928);
            latitudeLongitude363=latitudeLongitude();

            state._fsp--;

            stream_latitudeLongitude.add(latitudeLongitude363.getTree());


            // AST REWRITE
            // elements: latitudeLongitude
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 528:2: -> ^( GEOCOORDINATE latitudeLongitude )
            {
                dbg.location(528,5);
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:528:5: ^( GEOCOORDINATE latitudeLongitude )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(528,7);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

                dbg.location(528,21);
                adaptor.addChild(root_1, stream_latitudeLongitude.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(529, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "geoCoordinate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "geoCoordinate"

    public static class latitudeLongitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:531:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal365=null;
        Token char_literal367=null;
        Token char_literal368=null;
        Token char_literal369=null;
        Token char_literal370=null;
        Token char_literal371=null;
        Token char_literal372=null;
        Token char_literal373=null;
        Token char_literal374=null;
        Token char_literal375=null;
        Token char_literal376=null;
        Token char_literal377=null;
        Token char_literal378=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection364 = null;

        flipsParser.eastWestDirection_return eastWestDirection366 = null;


        CommonTree char_literal365_tree=null;
        CommonTree char_literal367_tree=null;
        CommonTree char_literal368_tree=null;
        CommonTree char_literal369_tree=null;
        CommonTree char_literal370_tree=null;
        CommonTree char_literal371_tree=null;
        CommonTree char_literal372_tree=null;
        CommonTree char_literal373_tree=null;
        CommonTree char_literal374_tree=null;
        CommonTree char_literal375_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree char_literal377_tree=null;
        CommonTree char_literal378_tree=null;
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try { dbg.enterRule(getGrammarFileName(), "latitudeLongitude");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(531, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt143=5;
            try { dbg.enterDecision(143);

            try {
                isCyclicDecision = true;
                alt143 = dfa143.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(143);}

            switch (alt143) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    dbg.location(532,5);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2950);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    dbg.location(532,29);
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude2952);
                    northSouthDirection364=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection364.getTree());
                    dbg.location(532,49);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:49: ( ',' )?
                    int alt134=2;
                    try { dbg.enterSubRule(134);
                    try { dbg.enterDecision(134);

                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==101) ) {
                        alt134=1;
                    }
                    } finally {dbg.exitDecision(134);}

                    switch (alt134) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:49: ','
                            {
                            dbg.location(532,49);
                            char_literal365=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude2954);  
                            stream_101.add(char_literal365);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(134);}

                    dbg.location(532,55);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2959);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    dbg.location(532,79);
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude2961);
                    eastWestDirection366=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection366.getTree());


                    // AST REWRITE
                    // elements: eastWestDirection, x, northSouthDirection, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 533:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        dbg.location(533,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:533:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(533,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        dbg.location(533,16);
                        adaptor.addChild(root_1, stream_x.nextTree());
                        dbg.location(533,19);
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(533,40);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:533:40: ^( LONGITUDE $y eastWestDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(533,42);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        dbg.location(533,52);
                        adaptor.addChild(root_1, stream_y.nextTree());
                        dbg.location(533,55);
                        adaptor.addChild(root_1, stream_eastWestDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    dbg.location(534,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:4: ( '+' )?
                    int alt135=2;
                    try { dbg.enterSubRule(135);
                    try { dbg.enterDecision(135);

                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==268) ) {
                        alt135=1;
                    }
                    } finally {dbg.exitDecision(135);}

                    switch (alt135) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:4: '+'
                            {
                            dbg.location(534,4);
                            char_literal367=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude2987);  
                            stream_268.add(char_literal367);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(135);}

                    dbg.location(534,10);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2992);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    dbg.location(534,34);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:34: ( ',' )?
                    int alt136=2;
                    try { dbg.enterSubRule(136);
                    try { dbg.enterDecision(136);

                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==101) ) {
                        alt136=1;
                    }
                    } finally {dbg.exitDecision(136);}

                    switch (alt136) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:34: ','
                            {
                            dbg.location(534,34);
                            char_literal368=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude2994);  
                            stream_101.add(char_literal368);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(136);}

                    dbg.location(534,39);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:39: ( '+' )?
                    int alt137=2;
                    try { dbg.enterSubRule(137);
                    try { dbg.enterDecision(137);

                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==268) ) {
                        alt137=1;
                    }
                    } finally {dbg.exitDecision(137);}

                    switch (alt137) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:534:39: '+'
                            {
                            dbg.location(534,39);
                            char_literal369=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude2997);  
                            stream_268.add(char_literal369);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(137);}

                    dbg.location(534,45);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3002);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 535:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        dbg.location(535,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:535:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(535,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        dbg.location(535,16);
                        adaptor.addChild(root_1, stream_x.nextTree());
                        dbg.location(535,19);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(535,26);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:535:26: ^( LONGITUDE $y EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(535,28);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        dbg.location(535,38);
                        adaptor.addChild(root_1, stream_y.nextTree());
                        dbg.location(535,41);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    dbg.location(536,4);
                    char_literal370=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3028);  
                    stream_269.add(char_literal370);

                    dbg.location(536,9);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3032);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    dbg.location(536,33);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:33: ( ',' )?
                    int alt138=2;
                    try { dbg.enterSubRule(138);
                    try { dbg.enterDecision(138);

                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==101) ) {
                        alt138=1;
                    }
                    } finally {dbg.exitDecision(138);}

                    switch (alt138) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:33: ','
                            {
                            dbg.location(536,33);
                            char_literal371=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude3034);  
                            stream_101.add(char_literal371);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(138);}

                    dbg.location(536,38);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:38: ( '+' )?
                    int alt139=2;
                    try { dbg.enterSubRule(139);
                    try { dbg.enterDecision(139);

                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==268) ) {
                        alt139=1;
                    }
                    } finally {dbg.exitDecision(139);}

                    switch (alt139) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:38: '+'
                            {
                            dbg.location(536,38);
                            char_literal372=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude3037);  
                            stream_268.add(char_literal372);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(139);}

                    dbg.location(536,44);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3042);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 537:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        dbg.location(537,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(537,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        dbg.location(537,16);
                        adaptor.addChild(root_1, stream_x.nextTree());
                        dbg.location(537,19);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(537,26);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:26: ^( LONGITUDE $y EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(537,28);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        dbg.location(537,38);
                        adaptor.addChild(root_1, stream_y.nextTree());
                        dbg.location(537,41);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    dbg.location(538,4);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:4: ( '+' )?
                    int alt140=2;
                    try { dbg.enterSubRule(140);
                    try { dbg.enterDecision(140);

                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==268) ) {
                        alt140=1;
                    }
                    } finally {dbg.exitDecision(140);}

                    switch (alt140) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:4: '+'
                            {
                            dbg.location(538,4);
                            char_literal373=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude3068);  
                            stream_268.add(char_literal373);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(140);}

                    dbg.location(538,10);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3073);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    dbg.location(538,34);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:34: ( ',' )?
                    int alt141=2;
                    try { dbg.enterSubRule(141);
                    try { dbg.enterDecision(141);

                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==101) ) {
                        alt141=1;
                    }
                    } finally {dbg.exitDecision(141);}

                    switch (alt141) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:34: ','
                            {
                            dbg.location(538,34);
                            char_literal374=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude3075);  
                            stream_101.add(char_literal374);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(141);}

                    dbg.location(538,39);
                    char_literal375=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3078);  
                    stream_269.add(char_literal375);

                    dbg.location(538,44);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3082);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 539:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        dbg.location(539,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(539,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        dbg.location(539,16);
                        adaptor.addChild(root_1, stream_x.nextTree());
                        dbg.location(539,19);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(539,26);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:26: ^( LONGITUDE $y WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(539,28);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        dbg.location(539,38);
                        adaptor.addChild(root_1, stream_y.nextTree());
                        dbg.location(539,41);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    dbg.location(540,4);
                    char_literal376=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3108);  
                    stream_269.add(char_literal376);

                    dbg.location(540,9);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3112);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    dbg.location(540,33);
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:33: ( ',' )?
                    int alt142=2;
                    try { dbg.enterSubRule(142);
                    try { dbg.enterDecision(142);

                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==101) ) {
                        alt142=1;
                    }
                    } finally {dbg.exitDecision(142);}

                    switch (alt142) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:33: ','
                            {
                            dbg.location(540,33);
                            char_literal377=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude3114);  
                            stream_101.add(char_literal377);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(142);}

                    dbg.location(540,38);
                    char_literal378=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3117);  
                    stream_269.add(char_literal378);

                    dbg.location(540,43);
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3121);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 541:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        dbg.location(541,5);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(541,7);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        dbg.location(541,16);
                        adaptor.addChild(root_1, stream_x.nextTree());
                        dbg.location(541,19);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(541,26);
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:26: ^( LONGITUDE $y WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(541,28);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        dbg.location(541,38);
                        adaptor.addChild(root_1, stream_y.nextTree());
                        dbg.location(541,41);
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(542, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "latitudeLongitude");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "latitudeLongitude"

    public static class latitudeLongitudeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitudeValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue379 = null;

        flipsParser.angularValue_return angularValue380 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try { dbg.enterRule(getGrammarFileName(), "latitudeLongitudeValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(544, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt144=2;
            try { dbg.enterDecision(144);

            try {
                isCyclicDecision = true;
                alt144 = dfa144.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(144);}

            switch (alt144) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:4: numericValue
                    {
                    dbg.location(545,4);
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3153);
                    numericValue379=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue379.getTree());


                    // AST REWRITE
                    // elements: numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 546:2: -> numericValue DEGREE
                    {
                        dbg.location(546,5);
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        dbg.location(546,18);
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:547:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(547,4);
                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3165);
                    angularValue380=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue380.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(548, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "latitudeLongitudeValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "latitudeLongitudeValue"

    public static class numericValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral382=null;
        flipsParser.integerValue_return integerValue381 = null;


        CommonTree FloatingPointLiteral382_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "numericValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(552, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:2: ( integerValue | FloatingPointLiteral )
            int alt145=2;
            try { dbg.enterDecision(145);

            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=BinaryLiteral && LA145_0<=HexLiteral)) ) {
                alt145=1;
            }
            else if ( (LA145_0==FloatingPointLiteral) ) {
                alt145=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(145);}

            switch (alt145) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(553,4);
                    pushFollow(FOLLOW_integerValue_in_numericValue3178);
                    integerValue381=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue381.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(554,4);
                    FloatingPointLiteral382=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3183); 
                    FloatingPointLiteral382_tree = (CommonTree)adaptor.create(FloatingPointLiteral382);
                    adaptor.addChild(root_0, FloatingPointLiteral382_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(555, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numericValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "numericValue"

    public static class integerValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set383=null;

        CommonTree set383_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(557, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(558,2);
            set383=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set383));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(562, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integerValue"

    public static class percentValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "percentValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:564:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal385=null;
        Token string_literal386=null;
        flipsParser.numericValue_return numericValue384 = null;


        CommonTree char_literal385_tree=null;
        CommonTree string_literal386_tree=null;
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try { dbg.enterRule(getGrammarFileName(), "percentValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(564, 1);

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:565:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            dbg.enterAlt(1);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:565:4: numericValue ( '%' | 'percent' )
            {
            dbg.location(565,4);
            pushFollow(FOLLOW_numericValue_in_percentValue3220);
            numericValue384=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue384.getTree());
            dbg.location(565,17);
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:565:17: ( '%' | 'percent' )
            int alt146=2;
            try { dbg.enterSubRule(146);
            try { dbg.enterDecision(146);

            int LA146_0 = input.LA(1);

            if ( (LA146_0==270) ) {
                alt146=1;
            }
            else if ( (LA146_0==271) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(146);}

            switch (alt146) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:565:18: '%'
                    {
                    dbg.location(565,18);
                    char_literal385=(Token)match(input,270,FOLLOW_270_in_percentValue3223);  
                    stream_270.add(char_literal385);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:565:22: 'percent'
                    {
                    dbg.location(565,22);
                    string_literal386=(Token)match(input,271,FOLLOW_271_in_percentValue3225);  
                    stream_271.add(string_literal386);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(146);}



            // AST REWRITE
            // elements: numericValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 566:2: -> numericValue PERCENT
            {
                dbg.location(566,5);
                adaptor.addChild(root_0, stream_numericValue.nextTree());
                dbg.location(566,18);
                adaptor.addChild(root_0, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(567, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "percentValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "percentValue"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA143 dfa143 = new DFA143(this);
    protected DFA144 dfa144 = new DFA144(this);
    static final String DFA24_eotS =
        "\76\uffff";
    static final String DFA24_eofS =
        "\17\uffff\7\5\2\uffff\11\5\4\uffff\7\13\2\uffff\11\13\1\uffff\3"+
        "\5\3\13";
    static final String DFA24_minS =
        "\1\112\1\115\1\uffff\2\u0092\2\uffff\1\115\2\uffff\1\111\1\uffff"+
        "\1\176\1\uffff\1\176\7\111\2\u009a\11\111\1\164\2\120\1\uffff\7"+
        "\111\2\u009a\11\111\1\uffff\6\111";
    static final String DFA24_maxS =
        "\1\u00fd\1\u00b6\1\uffff\2\u010f\2\uffff\1\175\2\uffff\1\u010d\1"+
        "\uffff\1\u010f\1\uffff\1\u010f\7\u00fd\2\u009c\11\u00fd\1\172\2"+
        "\u010d\1\uffff\7\u00fd\2\u009c\11\u00fd\1\uffff\6\u00fd";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\1\uffff"+
        "\1\3\26\uffff\1\10\22\uffff\1\1\6\uffff";
    static final String DFA24_specialS =
        "\76\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\12\1\1\1\7\1\uffff\2\2\1\4\4\3\34\uffff\2\6\1\uffff\2\6\1"+
            "\uffff\2\10\117\uffff\1\2\4\uffff\1\11\37\2\13\13\6\5",
            "\1\13\2\uffff\1\16\4\14\36\uffff\1\13\5\uffff\5\13\63\uffff"+
            "\6\15",
            "",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\15\141\uffff\2\15",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\15\141\uffff\2\15",
            "",
            "",
            "\1\13\2\uffff\5\13\36\uffff\1\41\5\uffff\5\13",
            "",
            "",
            "\1\44\3\uffff\1\13\2\uffff\1\43\4\42\36\uffff\1\13\5\uffff"+
            "\5\13\u008e\uffff\2\44",
            "",
            "\22\13\2\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56"+
            "\1\57\1\60\1\55\1\61\1\62\1\63\1\64\1\65\1\66\2\uffff\7\15\16"+
            "\uffff\5\67\116\uffff\2\15",
            "",
            "\22\13\2\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56"+
            "\1\57\1\60\1\55\1\61\1\62\1\63\1\64\1\65\1\66\2\uffff\7\15\141"+
            "\uffff\2\15",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\1\70\1\71\1\72",
            "\1\30\1\31\1\32",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\2\6\3\uffff\2\13",
            "\5\44\20\uffff\1\44\30\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\43\uffff\1\44\15\uffff\5\44\1\uffff\6\44",
            "\5\44\20\uffff\1\44\30\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\61\uffff\5\44\1\uffff\6\44",
            "",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\1\73\1\74\1\75",
            "\1\56\1\57\1\60",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\15\31\uffff\1\5\4\uffff\61\5",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\15\31\uffff\1\13\4\uffff\61\13"
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
            return "156:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA29_eotS =
        "\151\uffff";
    static final String DFA29_eofS =
        "\43\uffff\7\10\2\uffff\11\10\3\uffff\7\10\2\uffff\14\10\1\5\3\10"+
        "\2\uffff\7\10\2\uffff\11\10\1\5\3\10";
    static final String DFA29_minS =
        "\1\112\1\111\2\u0092\2\uffff\1\115\2\uffff\2\120\2\uffff\7\u0091"+
        "\2\u009a\11\u0091\1\120\2\176\1\uffff\7\111\2\u009a\11\111\3\u0091"+
        "\7\111\2\u009a\20\111\2\u0092\7\111\2\u009a\15\111";
    static final String DFA29_maxS =
        "\1\u0101\1\u010d\2\u010f\2\uffff\1\u0091\2\uffff\2\u010f\2\uffff"+
        "\7\u00ae\2\u009c\11\u00ae\1\u0091\2\u00a3\1\uffff\7\u0101\2\u009c"+
        "\11\u0101\3\u00ae\7\u0101\2\u009c\20\u0101\2\u010f\7\u0101\2\u009c"+
        "\15\u0101";
    static final String DFA29_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\2\1\6\25\uffff\1\1\106"+
        "\uffff";
    static final String DFA29_specialS =
        "\151\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\10\1\1\1\6\1\uffff\1\4\1\uffff\1\3\4\2\46\uffff\1\5\24\uffff"+
            "\2\5\73\uffff\1\7\37\uffff\13\10\6\uffff\4\4",
            "\1\14\3\uffff\1\10\2\uffff\1\12\4\11\36\uffff\1\10\5\uffff"+
            "\5\10\63\uffff\6\13\125\uffff\2\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\13\141\uffff\2\13",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\13\141\uffff\2\13",
            "",
            "",
            "\1\10\2\uffff\1\41\4\40\36\uffff\1\10\5\uffff\2\10\1\37\2\10"+
            "\23\uffff\1\5",
            "",
            "",
            "\5\14\20\uffff\1\14\30\uffff\22\10\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\13\16\uffff\5\42\10\uffff\1\14\5\uffff"+
            "\3\14\43\uffff\1\14\15\uffff\5\14\1\uffff\6\14\2\13",
            "\5\14\20\uffff\1\14\30\uffff\22\10\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\13\33\uffff\1\14\5\uffff\3\14\61\uffff"+
            "\5\14\1\uffff\6\14\2\13",
            "",
            "",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\65\1\66\1\67",
            "\1\26\1\27\1\30",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\5\5\47\uffff\2\10\23\uffff\1\5",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\112\1\113\1\114",
            "\1\54\1\55\1\56",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\116\1\117\1\120",
            "\1\101\1\102\1\103",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\26\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\141\uffff\2\5",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\141\uffff\2\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\1\146\1\147\1\150",
            "\1\134\1\135\1\136",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\26\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10"
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
            return "183:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\14\112\2\uffff";
    static final String DFA38_maxS =
        "\1\u00f7\13\124\2\uffff";
    static final String DFA38_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\3\14\u00a0\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "",
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
            return "217:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA71_eotS =
        "\65\uffff";
    static final String DFA71_eofS =
        "\65\uffff";
    static final String DFA71_minS =
        "\1\120\2\u0092\7\u00a4\7\u00ad\2\u009a\11\u00ad\2\u00a4\2\uffff"+
        "\2\u00b1\3\u00ad\2\uffff\16\u00a4";
    static final String DFA71_maxS =
        "\1\124\2\u010f\7\u00a5\7\u00ae\2\u009c\11\u00ae\2\u00a5\2\uffff"+
        "\2\u00cc\3\u00ae\2\uffff\16\u00a5";
    static final String DFA71_acceptS =
        "\36\uffff\1\2\1\1\5\uffff\1\4\1\3\16\uffff";
    static final String DFA71_specialS =
        "\65\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\4\1",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\22"+
            "\1\26\1\27\1\30\1\31\1\32\1\33\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\141\uffff\1\34\1\35",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\22"+
            "\1\26\1\27\1\30\1\31\1\32\1\33\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\141\uffff\1\34\1\35",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\42\1\43\1\44",
            "\1\23\1\24\1\25",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\46\1\45",
            "\1\46\1\45",
            "",
            "",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "",
            "",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\37\1\36"
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "305:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA85_eotS =
        "\15\uffff";
    static final String DFA85_eofS =
        "\6\uffff\1\10\4\uffff\2\10";
    static final String DFA85_minS =
        "\1\113\1\121\1\u00bb\1\121\2\uffff\1\111\2\uffff\1\120\1\uffff\2"+
        "\111";
    static final String DFA85_maxS =
        "\1\113\1\124\1\u00bf\1\124\2\uffff\1\u0101\2\uffff\1\124\1\uffff"+
        "\2\u0101";
    static final String DFA85_acceptS =
        "\4\uffff\1\2\1\4\1\uffff\1\1\1\5\1\uffff\1\3\2\uffff";
    static final String DFA85_specialS =
        "\15\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\1",
            "\4\2",
            "\2\4\2\5\1\3",
            "\4\6",
            "",
            "",
            "\4\10\1\uffff\7\10\26\uffff\10\10\1\uffff\2\10\1\uffff\2\10"+
            "\2\uffff\1\10\24\uffff\2\10\51\uffff\2\7\2\12\1\11\10\uffff"+
            "\1\10\4\uffff\65\10",
            "",
            "",
            "\1\14\4\13",
            "",
            "\4\10\1\uffff\7\10\26\uffff\10\10\1\uffff\2\10\1\uffff\2\10"+
            "\2\uffff\1\10\24\uffff\2\10\51\uffff\2\7\2\12\11\uffff\1\10"+
            "\4\uffff\65\10",
            "\4\10\1\uffff\7\10\26\uffff\10\10\1\uffff\2\10\1\uffff\2\10"+
            "\2\uffff\1\10\24\uffff\2\10\51\uffff\2\7\2\12\11\uffff\1\10"+
            "\4\uffff\65\10"
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "356:1: time : ( At timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | At integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | At timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | At integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | At timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA92_eotS =
        "\32\uffff";
    static final String DFA92_eofS =
        "\3\uffff\5\2\1\uffff\4\2\4\uffff\4\25\5\uffff";
    static final String DFA92_minS =
        "\1\120\1\u00b1\1\uffff\5\111\1\uffff\4\111\4\u0092\4\111\2\uffff"+
        "\2\u0092\1\uffff";
    static final String DFA92_maxS =
        "\1\124\1\u00cc\1\uffff\5\u0101\1\uffff\4\u0101\4\u010f\4\u0101\2"+
        "\uffff\2\u010f\1\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\1\5\uffff\1\5\14\uffff\1\2\1\4\2\uffff\1\3";
    static final String DFA92_specialS =
        "\32\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\2\4\1",
            "\1\11\15\uffff\1\10\1\3\1\4\1\5\1\6\1\7\1\12\1\13\1\14\5\2",
            "",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\22\2\2\uffff\7\2\4\uffff\1\21\23\uffff\1\22\1\23\1\24\5\25"+
            "\101\uffff\2\2",
            "\22\2\2\uffff\7\2\4\uffff\1\25\23\uffff\10\25\101\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\101\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\101\uffff\2\2",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "",
            "",
            "\22\25\2\uffff\7\25\33\uffff\5\31\101\uffff\2\25",
            "\22\25\2\uffff\7\25\33\uffff\5\31\101\uffff\2\25",
            ""
    };

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "400:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA143_eotS =
        "\100\uffff";
    static final String DFA143_eofS =
        "\17\uffff\2\22\22\uffff\2\22\7\uffff\2\63\22\uffff";
    static final String DFA143_minS =
        "\17\120\2\111\1\120\3\uffff\5\120\2\u0107\7\120\2\111\7\120\2\111"+
        "\5\120\1\uffff\4\120\1\uffff\1\120\2\u0107\1\120\2\u0107\1\120";
    static final String DFA143_maxS =
        "\3\u010d\2\124\11\u010d\1\124\2\u010b\1\u010d\3\uffff\5\u010d\2"+
        "\u0107\6\u010d\1\124\2\u010b\6\u010d\1\124\2\u010b\5\u010d\1\uffff"+
        "\4\u010d\1\uffff\1\u010d\2\u0107\1\u010d\2\u0107\1\u010d";
    static final String DFA143_acceptS =
        "\22\uffff\1\2\1\4\1\1\36\uffff\1\3\4\uffff\1\5\7\uffff";
    static final String DFA143_specialS =
        "\100\uffff}>";
    static final String[] DFA143_transitionS = {
            "\1\2\4\1\u00b7\uffff\1\3\1\4",
            "\1\20\4\17\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\43\uffff"+
            "\1\16\15\uffff\1\11\1\12\1\13\1\14\1\15\1\uffff\1\5\1\6\1\7"+
            "\1\10\1\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\61\uffff\1"+
            "\25\1\12\1\13\1\14\1\15\1\uffff\1\5\1\6\1\7\1\10\1\22\1\23",
            "\1\27\4\26",
            "\1\31\4\30",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\1\20\4\17\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff"+
            "\1\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\1\33\4\32",
            "\4\22\1\uffff\7\22\11\uffff\2\22\4\uffff\2\22\5\uffff\10\22"+
            "\1\uffff\2\22\1\uffff\2\22\2\uffff\1\22\24\uffff\2\22\66\uffff"+
            "\1\22\4\uffff\72\22\1\34\4\22",
            "\4\22\1\uffff\7\22\11\uffff\2\22\4\uffff\2\22\5\uffff\10\22"+
            "\1\uffff\2\22\1\uffff\2\22\2\uffff\1\22\24\uffff\2\22\66\uffff"+
            "\1\22\4\uffff\72\22\1\34\4\22",
            "\5\22\u00b7\uffff\1\22\1\23",
            "",
            "",
            "",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\1\44\4\43\20\uffff\1\21\u008e\uffff\1\42\15\uffff\1\35\1\36"+
            "\1\37\1\40\1\41\1\uffff\1\45\1\46\1\47\1\50\1\22\1\23",
            "\5\22\20\uffff\1\21\u009c\uffff\1\51\1\36\1\37\1\40\1\41\1"+
            "\uffff\1\45\1\46\1\47\1\50\1\22\1\23",
            "\1\55\4\54\20\uffff\1\62\u008e\uffff\1\53\15\uffff\1\52\1\64"+
            "\1\65\1\66\1\67\1\uffff\1\56\1\57\1\60\1\61\1\63\1\70",
            "\5\63\20\uffff\1\62\u009c\uffff\1\71\1\64\1\65\1\66\1\67\1"+
            "\uffff\1\56\1\57\1\60\1\61\1\63\1\70",
            "\1\34",
            "\1\34",
            "\5\22\20\uffff\1\21\142\uffff\1\24\5\uffff\3\24\73\uffff\1"+
            "\22\1\23",
            "\1\44\4\43\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\1\73\4\72",
            "\4\22\1\uffff\7\22\11\uffff\2\22\4\uffff\2\22\5\uffff\10\22"+
            "\1\uffff\2\22\1\uffff\2\22\2\uffff\1\22\24\uffff\2\22\66\uffff"+
            "\1\22\4\uffff\72\22\1\74\4\22",
            "\4\22\1\uffff\7\22\11\uffff\2\22\4\uffff\2\22\5\uffff\10\22"+
            "\1\uffff\2\22\1\uffff\2\22\2\uffff\1\22\24\uffff\2\22\66\uffff"+
            "\1\22\4\uffff\72\22\1\74\4\22",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\1\55\4\54\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\1\76\4\75",
            "\4\63\1\uffff\7\63\11\uffff\2\63\4\uffff\2\63\5\uffff\10\63"+
            "\1\uffff\2\63\1\uffff\2\63\2\uffff\1\63\24\uffff\2\63\66\uffff"+
            "\1\63\4\uffff\72\63\1\77\4\63",
            "\4\63\1\uffff\7\63\11\uffff\2\63\4\uffff\2\63\5\uffff\10\63"+
            "\1\uffff\2\63\1\uffff\2\63\2\uffff\1\63\24\uffff\2\63\66\uffff"+
            "\1\63\4\uffff\72\63\1\77\4\63",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\u00b7\uffff\1\63\1\70",
            "",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70",
            "\1\74",
            "\1\74",
            "\5\22\20\uffff\1\21\u00a6\uffff\1\22\1\23",
            "\1\77",
            "\1\77",
            "\5\63\20\uffff\1\62\u00a6\uffff\1\63\1\70"
    };

    static final short[] DFA143_eot = DFA.unpackEncodedString(DFA143_eotS);
    static final short[] DFA143_eof = DFA.unpackEncodedString(DFA143_eofS);
    static final char[] DFA143_min = DFA.unpackEncodedStringToUnsignedChars(DFA143_minS);
    static final char[] DFA143_max = DFA.unpackEncodedStringToUnsignedChars(DFA143_maxS);
    static final short[] DFA143_accept = DFA.unpackEncodedString(DFA143_acceptS);
    static final short[] DFA143_special = DFA.unpackEncodedString(DFA143_specialS);
    static final short[][] DFA143_transition;

    static {
        int numStates = DFA143_transitionS.length;
        DFA143_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA143_transition[i] = DFA.unpackEncodedString(DFA143_transitionS[i]);
        }
    }

    class DFA143 extends DFA {

        public DFA143(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 143;
            this.eot = DFA143_eot;
            this.eof = DFA143_eof;
            this.min = DFA143_min;
            this.max = DFA143_max;
            this.accept = DFA143_accept;
            this.special = DFA143_special;
            this.transition = DFA143_transition;
        }
        public String getDescription() {
            return "531:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA144_eotS =
        "\12\uffff";
    static final String DFA144_eofS =
        "\1\uffff\2\7\2\uffff\2\7\3\uffff";
    static final String DFA144_minS =
        "\1\120\2\111\1\uffff\1\112\2\111\1\uffff\2\176";
    static final String DFA144_maxS =
        "\1\124\2\u010d\1\uffff\1\124\2\u010f\1\uffff\2\u0107";
    static final String DFA144_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\2\uffff";
    static final String DFA144_specialS =
        "\12\uffff}>";
    static final String[] DFA144_transitionS = {
            "\1\2\4\1",
            "\4\7\1\uffff\2\7\1\6\4\5\11\uffff\2\7\4\uffff\2\7\5\uffff\10"+
            "\7\1\uffff\2\7\1\uffff\2\7\2\uffff\1\7\24\uffff\2\7\66\uffff"+
            "\1\7\4\uffff\47\7\1\4\15\7\5\3\1\uffff\4\3\2\7",
            "\4\7\1\uffff\7\7\11\uffff\2\7\4\uffff\2\7\5\uffff\10\7\1\uffff"+
            "\2\7\1\uffff\2\7\2\uffff\1\7\24\uffff\2\7\66\uffff\1\7\4\uffff"+
            "\65\7\5\3\1\uffff\4\3\2\7",
            "",
            "\1\7\2\uffff\1\7\2\uffff\1\11\4\10",
            "\4\7\1\uffff\7\7\11\uffff\2\7\4\uffff\2\7\5\uffff\10\7\1\uffff"+
            "\2\7\1\uffff\2\7\2\uffff\1\7\24\uffff\24\7\2\uffff\7\7\33\uffff"+
            "\1\7\4\uffff\72\7\1\3\4\7\2\uffff\2\7",
            "\4\7\1\uffff\7\7\11\uffff\2\7\4\uffff\2\7\5\uffff\10\7\1\uffff"+
            "\2\7\1\uffff\2\7\2\uffff\1\7\24\uffff\24\7\2\uffff\7\7\33\uffff"+
            "\1\7\4\uffff\72\7\1\3\4\7\2\uffff\2\7",
            "",
            "\22\7\2\uffff\22\7\143\uffff\1\3",
            "\22\7\2\uffff\22\7\143\uffff\1\3"
    };

    static final short[] DFA144_eot = DFA.unpackEncodedString(DFA144_eotS);
    static final short[] DFA144_eof = DFA.unpackEncodedString(DFA144_eofS);
    static final char[] DFA144_min = DFA.unpackEncodedStringToUnsignedChars(DFA144_minS);
    static final char[] DFA144_max = DFA.unpackEncodedStringToUnsignedChars(DFA144_maxS);
    static final short[] DFA144_accept = DFA.unpackEncodedString(DFA144_acceptS);
    static final short[] DFA144_special = DFA.unpackEncodedString(DFA144_specialS);
    static final short[][] DFA144_transition;

    static {
        int numStates = DFA144_transitionS.length;
        DFA144_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA144_transition[i] = DFA.unpackEncodedString(DFA144_transitionS[i]);
        }
    }

    class DFA144 extends DFA {

        public DFA144(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 144;
            this.eot = DFA144_eot;
            this.eof = DFA144_eof;
            this.min = DFA144_min;
            this.max = DFA144_max;
            this.accept = DFA144_accept;
            this.special = DFA144_special;
            this.transition = DFA144_transition;
        }
        public String getDescription() {
            return "544:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan396 = new BitSet(new long[]{0x0000000000000002L,0x0001F800C0000200L});
    public static final BitSet FOLLOW_command_in_flightPlan399 = new BitSet(new long[]{0x0000000000000002L,0x0001F80000000200L});
    public static final BitSet FOLLOW_defineCommand_in_define426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_defineCommand443 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_95_in_defineCommand445 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_96_in_defineCommand449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_97_in_defineCommand451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_98_in_defineCommand453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue472 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue474 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue478 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101_in_defineCommandValue484 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue491 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue493 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue497 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue521 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue523 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue527 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue529 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue533 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue535 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101_in_defineCommandValue541 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue548 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue550 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue554 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue556 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue560 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue562 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_94_in_defineWaypoint598 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_95_in_defineWaypoint600 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_defineWaypoint604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_105_in_defineWaypoint606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_106_in_defineWaypoint608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue627 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue629 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue631 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101_in_defineWaypointValue637 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue644 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue646 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue648 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_flyCommand_in_command675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_flyCommand702 = new BitSet(new long[]{0x0000000000000002L,0x01B60000001FDC00L,0x0000000000000000L,0x3FFFFFFFFFFFE100L});
    public static final BitSet FOLLOW_108_in_flyCommand704 = new BitSet(new long[]{0x0000000000000002L,0x01B60000001FDC00L,0x0000000000000000L,0x3FFFFFFFFFFFE100L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand707 = new BitSet(new long[]{0x0000000000000002L,0x01B60000001FDC00L,0x0000000000000000L,0x3FFFFFFFFFFFE100L});
    public static final BitSet FOLLOW_time_in_flyCommandValue729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue764 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue766 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue770 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_101_in_flyCommandValue772 = new BitSet(new long[]{0x0000000000000000L,0x00000010001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue774 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue778 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_turnCommand803 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_110_in_turnCommand805 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand808 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_loiterCommand842 = new BitSet(new long[]{0x0000000000000002L,0x09B60000001FDC00L,0x0000000000030000L,0xFFFFFFFFFFFFE100L,0x0000000000000003L});
    public static final BitSet FOLLOW_112_in_loiterCommand844 = new BitSet(new long[]{0x0000000000000002L,0x09B60000001FDC00L,0x0000000000030000L,0xFFFFFFFFFFFFE100L,0x0000000000000003L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand847 = new BitSet(new long[]{0x0000000000000002L,0x09B60000001FDC00L,0x0000000000030000L,0xFFFFFFFFFFFFE100L,0x0000000000000003L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue894 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand931 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_executeCommand933 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand935 = new BitSet(new long[]{0x0000000000000000L,0x000000A000000000L});
    public static final BitSet FOLLOW_101_in_executeCommand938 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand940 = new BitSet(new long[]{0x0000000000000000L,0x000000A000000000L});
    public static final BitSet FOLLOW_103_in_executeCommand945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_pitch975 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_114_in_pitch977 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch995 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_pitch997 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_116_in_pitch1002 = new BitSet(new long[]{0x0000000000000000L,0x00400000001F0000L});
    public static final BitSet FOLLOW_117_in_pitch1004 = new BitSet(new long[]{0x0000000000000000L,0x00400000001F0000L});
    public static final BitSet FOLLOW_118_in_pitch1007 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_roll1031 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_120_in_roll1033 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_roll1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1078 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1080 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1082 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_115_in_fixedAltitude1087 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_fixedAltitude1091 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_122_in_fixedAltitude1093 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_123_in_fixedAltitude1096 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_124_in_fixedAltitude1100 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_125_in_fixedAltitude1102 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_118_in_fixedAltitude1106 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1133 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1201 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_pressureUnit1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_pressureUnit1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pressureUnit1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_pressureUnit1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_pressureUnit1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_pressureUnit1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_pressureUnit1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pressureUnit1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_pressureUnit1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_pressureUnit1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_pressureUnit1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pressureUnit1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_pressureUnit1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_pressureUnit1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_pressureUnit1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_pressureUnit1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_pressureUnit1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_pressureUnit1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_radius1319 = new BitSet(new long[]{0x0000000000000000L,0x08000000001F0000L,0x0000000000020000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_With_in_radius1321 = new BitSet(new long[]{0x0000000000000000L,0x08000000001F0000L,0x0000000000020000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_123_in_radius1325 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000020000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_145_in_radius1329 = new BitSet(new long[]{0x0000000000000000L,0x00400000001F0000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_118_in_radius1331 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_radius1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1359 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000FFFFC0000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_distanceUnit1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_distanceUnit1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_distanceUnit1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_distanceUnit1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_distanceUnit1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_distanceUnit1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_distanceUnit1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_distanceUnit1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_154_in_distanceUnit1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_distanceUnit1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_154_in_distanceUnit1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_distanceUnit1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_distanceUnit1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_distanceUnit1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_distanceUnit1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_distanceUnit1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_distanceUnit1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_distanceUnit1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1541 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_relativeSpeed1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_relativeSpeed1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_relativeSpeed1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_relativeSpeed1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001FCFFFFC0000L});
    public static final BitSet FOLLOW_speedUnit_in_speedValue1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_speedUnit1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_speedUnit1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_speedUnit1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_speedUnit1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_speedUnit1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_speedUnit1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_speedUnit1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_173_in_speedUnit1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_174_in_speedUnit1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007E000000000000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_175_in_optimalSpeed1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_optimalSpeed1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_optimalUnit1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_optimalUnit1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_optimalUnit1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_optimalUnit1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_optimalUnit1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_optimalUnit1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed1816 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_183_in_throttleSpeed1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_throttleSpeed1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_throttleSpeed1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_throttleSpeed1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1862 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_timeFormat_in_time1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_187_in_time1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_time1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1886 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_time1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_187_in_time1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_time1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1912 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_timeFormat_in_time1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_time1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_time1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1936 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_time1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_time1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_time1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1962 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_timeFormat_in_time1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_timeFormat1990 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_timeFormat2016 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_timeFormat2022 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_hour2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_hour2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_hour2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_hour2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_hour2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_minute2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_minute2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_minute2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_minute2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_second2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_second2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_second2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_second2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_second2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_duration2151 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_durationValue_in_duration2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_hour_in_durationValue2182 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_minute_in_durationValue2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_hour_in_durationValue2197 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_minute_in_durationValue2201 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_second_in_durationValue2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_minute_in_durationValue2212 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_second_in_durationValue2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2303 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2305 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2348 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_northSouthDirection2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_northSouthDirection2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_northSouthDirection2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_northSouthDirection2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_eastWestDirection2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_eastWestDirection2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_eastWestDirection2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_eastWestDirection2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ordinalDirection2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_ordinalDirection2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ordinalDirection2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ordinalDirection2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_ordinalDirection2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_ordinalDirection2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_ordinalDirection2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_ordinalDirection2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_subOrdinalDirection2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_subOrdinalDirection2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_subOrdinalDirection2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_subOrdinalDirection2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_subOrdinalDirection2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_subOrdinalDirection2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_subOrdinalDirection2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_subOrdinalDirection2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_subOrdinalDirection2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_subOrdinalDirection2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_subOrdinalDirection2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_subOrdinalDirection2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_subOrdinalDirection2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_subOrdinalDirection2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_subOrdinalDirection2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_subOrdinalDirection2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection2672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_upDownDirection2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_upDownDirection2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_upDownDirection2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_upDownDirection2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_upDownDirection2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_upDownDirection2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_upDownDirection2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_upDownDirection2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_upDownDirection2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_upDownDirection2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_upDownDirection2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_leftRightDirection2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_leftRightDirection2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_leftRightDirection2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_leftRightDirection2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_leftRightDirection2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_leftRightDirection2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_clockDirection2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_clockDirection2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_clockDirection2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_clockDirection2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_258_in_angularValue2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_angularValue2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_angularValue2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_angularValue2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_angularValue2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue2841 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_258_in_angularValue2844 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_244_in_angularValue2846 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_263_in_angularValue2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_264_in_angularValue2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_angularValue2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_angularValue2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_angularValue2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude2952 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F0000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude2954 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000001FC100L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude2987 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2992 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude2994 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude2997 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3028 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3032 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude3034 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude3037 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude3068 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3073 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3078 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3108 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3112 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3117 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_270_in_percentValue3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_percentValue3225 = new BitSet(new long[]{0x0000000000000002L});

}