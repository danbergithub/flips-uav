// $ANTLR 3.2 Sep 23, 2009 12:02:23 flips.g 2010-06-05 19:39:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "StringLiteral", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'repeat'", "'wait'", "'time'", "'times'", "'continuously'", "'forever'", "'until'", "'while'", "'the'", "'tim'", "'is'", "'dir'", "'direction'", "'spd'", "'speed'", "'dst'", "'distance'", "'pit'", "'pitch'", "'rol'", "'roll'", "'alt'", "'altitude'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'fps'", "'/'", "'per'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'ms'", "'millisecond'", "'milliseconds'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'min'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
    };
    public static final int DIRECTION=12;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=14;
    public static final int T__262=262;
    public static final int T__160=160;
    public static final int T__263=263;
    public static final int GEOCOORDINATE=30;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=69;
    public static final int T__264=264;
    public static final int FOOT=51;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__300=300;
    public static final int T__163=163;
    public static final int HECTOPASCAL=61;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=43;
    public static final int FASTER=20;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=79;
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
    public static final int KILOMETER=44;
    public static final int T__255=255;
    public static final int EQ=72;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int SENSOR=8;
    public static final int T__138=138;
    public static final int GE=77;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__314=314;
    public static final int T__312=312;
    public static final int T__313=313;
    public static final int FORTNIGHT=34;
    public static final int T__279=279;
    public static final int T__288=288;
    public static final int T__289=289;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int YARD=50;
    public static final int T__282=282;
    public static final int T__283=283;
    public static final int T__141=141;
    public static final int T__280=280;
    public static final int T__142=142;
    public static final int T__281=281;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=82;
    public static final int DURATION=27;
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
    public static final int WS=96;
    public static final int T__301=301;
    public static final int T__302=302;
    public static final int T__129=129;
    public static final int T__303=303;
    public static final int T__304=304;
    public static final int BinaryLiteral=87;
    public static final int BinaryDigit=93;
    public static final int THROTTLE=22;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=86;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=75;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int T__271=271;
    public static final int METER=45;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__311=311;
    public static final int T__130=130;
    public static final int T__310=310;
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
    public static final int MILLISECOND=40;
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
    public static final int HexDigit=94;
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
    public static final int AM=24;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=90;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=80;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=54;
    public static final int RELATIVE=15;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int EAST=70;
    public static final int T__100=100;
    public static final int HOUR=37;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=18;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=81;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=47;
    public static final int T__227=227;
    public static final int NonZeroDigit=92;
    public static final int NORTH=68;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=67;
    public static final int T__230=230;
    public static final int WEEK=35;
    public static final int LT=74;
    public static final int OctalLiteral=88;
    public static final int LATITUDE=31;
    public static final int ATMOSPHERE=65;
    public static final int DAY=36;
    public static final int Identifier=78;
    public static final int COMMAND=6;
    public static final int Comment=97;
    public static final int MILLIBAR=64;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=56;
    public static final int FlightLevel=83;
    public static final int INCH=52;
    public static final int NE=73;
    public static final int SECOND=39;
    public static final int CLIMB=66;
    public static final int ROLL=16;
    public static final int HOUR24=26;
    public static final int RADIAN=42;
    public static final int PASCAL=62;
    public static final int DEGREE=41;
    public static final int TURN=13;
    public static final int SLOWER=21;
    public static final int FLY=9;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int PM=25;
    public static final int FURLONG=49;
    public static final int LONGITUDE=32;
    public static final int PRESSURE=59;
    public static final int YEAR=33;
    public static final int MILE=48;
    public static final int LineComment=98;
    public static final int Exponent=95;
    public static final int DEFINE=5;
    public static final int WEST=71;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__292=292;
    public static final int T__197=197;
    public static final int T__291=291;
    public static final int T__196=196;
    public static final int T__290=290;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__296=296;
    public static final int T__193=193;
    public static final int T__295=295;
    public static final int T__192=192;
    public static final int T__294=294;
    public static final int T__191=191;
    public static final int SPEED=19;
    public static final int T__293=293;
    public static final int T__190=190;
    public static final int T__299=299;
    public static final int T__298=298;
    public static final int T__297=297;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=57;
    public static final int T__189=189;
    public static final int Heading=85;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=91;
    public static final int DecimalLiteral=89;
    public static final int T__175=175;
    public static final int FLIGHTPLAN=4;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int Turning=84;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=60;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=55;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MINUTE=38;
    public static final int T__169=169;
    public static final int LE=76;
    public static final int BAR=63;

    // delegates
    // delegators


        public flipsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return flipsParser.tokenNames; }
    public String getGrammarFileName() { return "flips.g"; }


    public static class flightPlan_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flightPlan"
    // flips.g:113:1: flightPlan : ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.statement_return statement2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        try {
            // flips.g:114:2: ( ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) )
            // flips.g:114:4: ( define )* ( statement )*
            {
            // flips.g:114:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=99 && LA1_0<=101)||(LA1_0>=107 && LA1_0<=112)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flips.g:114:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan421);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // flips.g:114:12: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=113 && LA2_0<=114)||(LA2_0>=136 && LA2_0<=141)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // flips.g:114:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_flightPlan424);
            	    statement2=statement();

            	    state._fsp--;

            	    stream_statement.add(statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: define, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:2: -> ^( FLIGHTPLAN ( define )* ( statement )* )
            {
                // flips.g:115:5: ^( FLIGHTPLAN ( define )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // flips.g:115:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // flips.g:115:26: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
        return retval;
    }
    // $ANTLR end "flightPlan"

    public static class define_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "define"
    // flips.g:120:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineSensor_return defineSensor4 = null;

        flipsParser.defineWaypoint_return defineWaypoint5 = null;



        try {
            // flips.g:121:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 99:
            case 100:
            case 101:
                {
                alt3=1;
                }
                break;
            case 107:
            case 108:
            case 109:
                {
                alt3=2;
                }
                break;
            case 110:
            case 111:
            case 112:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // flips.g:121:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define451);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:122:4: defineSensor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineSensor_in_define456);
                    defineSensor4=defineSensor();

                    state._fsp--;

                    adaptor.addChild(root_0, defineSensor4.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:123:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define461);
                    defineWaypoint5=defineWaypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, defineWaypoint5.getTree());

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
        return retval;
    }
    // $ANTLR end "define"

    public static class defineCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineCommand"
    // flips.g:126:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
    public final flipsParser.defineCommand_return defineCommand() throws RecognitionException {
        flipsParser.defineCommand_return retval = new flipsParser.defineCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        flipsParser.defineCommandValue_return defineCommandValue9 = null;


        CommonTree string_literal6_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // flips.g:127:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // flips.g:127:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // flips.g:127:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt4=1;
                }
                break;
            case 100:
                {
                alt4=2;
                }
                break;
            case 101:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // flips.g:127:5: 'cmd'
                    {
                    string_literal6=(Token)match(input,99,FOLLOW_99_in_defineCommand473);  
                    stream_99.add(string_literal6);


                    }
                    break;
                case 2 :
                    // flips.g:127:11: 'command'
                    {
                    string_literal7=(Token)match(input,100,FOLLOW_100_in_defineCommand475);  
                    stream_100.add(string_literal7);


                    }
                    break;
                case 3 :
                    // flips.g:127:21: 'commands'
                    {
                    string_literal8=(Token)match(input,101,FOLLOW_101_in_defineCommand477);  
                    stream_101.add(string_literal8);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand480);
            defineCommandValue9=defineCommandValue();

            state._fsp--;

            stream_defineCommandValue.add(defineCommandValue9.getTree());


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
            // 128:2: -> defineCommandValue
            {
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
        return retval;
    }
    // $ANTLR end "defineCommand"

    public static class defineCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineCommandValue"
    // flips.g:131:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier10=null;
        Token char_literal11=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token Identifier16=null;
        Token char_literal17=null;
        Token Identifier19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Token string_literal25=null;
        Token Identifier26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        flipsParser.integerValue_return cmd = null;

        flipsParser.integerValue_return par = null;

        flipsParser.integerValue_return integerValue12 = null;

        flipsParser.integerValue_return integerValue18 = null;


        CommonTree Identifier10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree Identifier16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree Identifier19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree string_literal25_tree=null;
        CommonTree Identifier26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flips.g:132:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==102) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==105) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=99 && LA11_3<=101)||(LA11_3>=103 && LA11_3<=104)||(LA11_3>=107 && LA11_3<=114)||(LA11_3>=136 && LA11_3<=141)) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
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
                    // flips.g:132:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue496);  
                    stream_Identifier.add(Identifier10);

                    char_literal11=(Token)match(input,102,FOLLOW_102_in_defineCommandValue498);  
                    stream_102.add(char_literal11);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue500);
                    integerValue12=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue12.getTree());
                    // flips.g:132:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==102) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=103 && LA7_0<=104)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // flips.g:132:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // flips.g:132:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==103) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==104) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // flips.g:132:34: 'and'
                    	            {
                    	            string_literal13=(Token)match(input,103,FOLLOW_103_in_defineCommandValue504);  
                    	            stream_103.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:132:40: ',' ( 'and' )?
                    	            {
                    	            char_literal14=(Token)match(input,104,FOLLOW_104_in_defineCommandValue506);  
                    	            stream_104.add(char_literal14);

                    	            // flips.g:132:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==103) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // flips.g:132:44: 'and'
                    	                    {
                    	                    string_literal15=(Token)match(input,103,FOLLOW_103_in_defineCommandValue508);  
                    	                    stream_103.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue513);  
                    	    stream_Identifier.add(Identifier16);

                    	    char_literal17=(Token)match(input,102,FOLLOW_102_in_defineCommandValue515);  
                    	    stream_102.add(char_literal17);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue517);
                    	    integerValue18=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(integerValue18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: Identifier, integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 133:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_integerValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_integerValue.hasNext() ) {
                            // flips.g:133:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // flips.g:133:25: ^( COMMAND integerValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_integerValue.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_Identifier.reset();
                        stream_integerValue.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:134:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue540);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,102,FOLLOW_102_in_defineCommandValue542);  
                    stream_102.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue546);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal21=(Token)match(input,105,FOLLOW_105_in_defineCommandValue548);  
                    stream_105.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue552);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,106,FOLLOW_106_in_defineCommandValue554);  
                    stream_106.add(char_literal22);

                    // flips.g:134:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==102) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=103 && LA10_0<=104)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // flips.g:134:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // flips.g:134:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==103) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==104) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // flips.g:134:63: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,103,FOLLOW_103_in_defineCommandValue558);  
                    	            stream_103.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:134:69: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,104,FOLLOW_104_in_defineCommandValue560);  
                    	            stream_104.add(char_literal24);

                    	            // flips.g:134:73: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==103) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // flips.g:134:73: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,103,FOLLOW_103_in_defineCommandValue562);  
                    	                    stream_103.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue567);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,102,FOLLOW_102_in_defineCommandValue569);  
                    	    stream_102.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue573);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal28=(Token)match(input,105,FOLLOW_105_in_defineCommandValue575);  
                    	    stream_105.add(char_literal28);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue579);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal29=(Token)match(input,106,FOLLOW_106_in_defineCommandValue581);  
                    	    stream_106.add(char_literal29);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: cmd, par, Identifier
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
                    // 135:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        if ( !(stream_cmd.hasNext()||stream_par.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cmd.hasNext()||stream_par.hasNext()||stream_Identifier.hasNext() ) {
                            // flips.g:135:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // flips.g:135:25: ^( COMMAND $cmd PARAMETER $par)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_cmd.nextTree());
                            adaptor.addChild(root_2, (CommonTree)adaptor.create(PARAMETER, "PARAMETER"));
                            adaptor.addChild(root_2, stream_par.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_cmd.reset();
                        stream_par.reset();
                        stream_Identifier.reset();

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
        return retval;
    }
    // $ANTLR end "defineCommandValue"

    public static class defineSensor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineSensor"
    // flips.g:138:1: defineSensor : ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue ;
    public final flipsParser.defineSensor_return defineSensor() throws RecognitionException {
        flipsParser.defineSensor_return retval = new flipsParser.defineSensor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        flipsParser.defineSensorValue_return defineSensorValue33 = null;


        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_defineSensorValue=new RewriteRuleSubtreeStream(adaptor,"rule defineSensorValue");
        try {
            // flips.g:139:2: ( ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue )
            // flips.g:139:4: ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue
            {
            // flips.g:139:4: ( 'sen' | 'sensor' | 'sensors' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt12=1;
                }
                break;
            case 108:
                {
                alt12=2;
                }
                break;
            case 109:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // flips.g:139:5: 'sen'
                    {
                    string_literal30=(Token)match(input,107,FOLLOW_107_in_defineSensor617);  
                    stream_107.add(string_literal30);


                    }
                    break;
                case 2 :
                    // flips.g:139:11: 'sensor'
                    {
                    string_literal31=(Token)match(input,108,FOLLOW_108_in_defineSensor619);  
                    stream_108.add(string_literal31);


                    }
                    break;
                case 3 :
                    // flips.g:139:20: 'sensors'
                    {
                    string_literal32=(Token)match(input,109,FOLLOW_109_in_defineSensor621);  
                    stream_109.add(string_literal32);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor624);
            defineSensorValue33=defineSensorValue();

            state._fsp--;

            stream_defineSensorValue.add(defineSensorValue33.getTree());


            // AST REWRITE
            // elements: defineSensorValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:2: -> defineSensorValue
            {
                adaptor.addChild(root_0, stream_defineSensorValue.nextTree());

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
        return retval;
    }
    // $ANTLR end "defineSensor"

    public static class defineSensorValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineSensorValue"
    // flips.g:143:1: defineSensorValue : Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ ;
    public final flipsParser.defineSensorValue_return defineSensorValue() throws RecognitionException {
        flipsParser.defineSensorValue_return retval = new flipsParser.defineSensorValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier34=null;
        Token char_literal35=null;
        Token string_literal36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token Identifier39=null;
        Token char_literal40=null;
        flipsParser.integerValue_return sen = null;


        CommonTree Identifier34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree string_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree Identifier39_tree=null;
        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flips.g:144:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // flips.g:144:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue640);  
            stream_Identifier.add(Identifier34);

            char_literal35=(Token)match(input,102,FOLLOW_102_in_defineSensorValue642);  
            stream_102.add(char_literal35);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue646);
            sen=integerValue();

            state._fsp--;

            stream_integerValue.add(sen.getTree());
            // flips.g:144:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==102) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=103 && LA15_0<=104)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // flips.g:144:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue
            	    {
            	    // flips.g:144:37: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==103) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==104) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // flips.g:144:38: 'and'
            	            {
            	            string_literal36=(Token)match(input,103,FOLLOW_103_in_defineSensorValue650);  
            	            stream_103.add(string_literal36);


            	            }
            	            break;
            	        case 2 :
            	            // flips.g:144:44: ',' ( 'and' )?
            	            {
            	            char_literal37=(Token)match(input,104,FOLLOW_104_in_defineSensorValue652);  
            	            stream_104.add(char_literal37);

            	            // flips.g:144:48: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==103) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // flips.g:144:48: 'and'
            	                    {
            	                    string_literal38=(Token)match(input,103,FOLLOW_103_in_defineSensorValue654);  
            	                    stream_103.add(string_literal38);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue659);  
            	    stream_Identifier.add(Identifier39);

            	    char_literal40=(Token)match(input,102,FOLLOW_102_in_defineSensorValue661);  
            	    stream_102.add(char_literal40);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue665);
            	    sen=integerValue();

            	    state._fsp--;

            	    stream_integerValue.add(sen.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: sen, Identifier
            // token labels: 
            // rule labels: retval, sen
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sen=new RewriteRuleSubtreeStream(adaptor,"rule sen",sen!=null?sen.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:2: -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+
            {
                if ( !(stream_sen.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sen.hasNext()||stream_Identifier.hasNext() ) {
                    // flips.g:145:5: ^( DEFINE Identifier ^( SENSOR $sen) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    // flips.g:145:25: ^( SENSOR $sen)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SENSOR, "SENSOR"), root_2);

                    adaptor.addChild(root_2, stream_sen.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_sen.reset();
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
        return retval;
    }
    // $ANTLR end "defineSensorValue"

    public static class defineWaypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypoint"
    // flips.g:148:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
    public final flipsParser.defineWaypoint_return defineWaypoint() throws RecognitionException {
        flipsParser.defineWaypoint_return retval = new flipsParser.defineWaypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        flipsParser.defineWaypointValue_return defineWaypointValue44 = null;


        CommonTree string_literal41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // flips.g:149:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // flips.g:149:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // flips.g:149:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt16=1;
                }
                break;
            case 111:
                {
                alt16=2;
                }
                break;
            case 112:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // flips.g:149:5: 'wpt'
                    {
                    string_literal41=(Token)match(input,110,FOLLOW_110_in_defineWaypoint696);  
                    stream_110.add(string_literal41);


                    }
                    break;
                case 2 :
                    // flips.g:149:11: 'waypoint'
                    {
                    string_literal42=(Token)match(input,111,FOLLOW_111_in_defineWaypoint698);  
                    stream_111.add(string_literal42);


                    }
                    break;
                case 3 :
                    // flips.g:149:22: 'waypoints'
                    {
                    string_literal43=(Token)match(input,112,FOLLOW_112_in_defineWaypoint700);  
                    stream_112.add(string_literal43);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint703);
            defineWaypointValue44=defineWaypointValue();

            state._fsp--;

            stream_defineWaypointValue.add(defineWaypointValue44.getTree());


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
            // 150:2: -> defineWaypointValue
            {
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
        return retval;
    }
    // $ANTLR end "defineWaypoint"

    public static class defineWaypointValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypointValue"
    // flips.g:153:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
    public final flipsParser.defineWaypointValue_return defineWaypointValue() throws RecognitionException {
        flipsParser.defineWaypointValue_return retval = new flipsParser.defineWaypointValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier45=null;
        Token char_literal46=null;
        Token string_literal48=null;
        Token char_literal49=null;
        Token string_literal50=null;
        Token Identifier51=null;
        Token char_literal52=null;
        flipsParser.geoCoordinate_return geoCoordinate47 = null;

        flipsParser.geoCoordinate_return geoCoordinate53 = null;


        CommonTree Identifier45_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree Identifier51_tree=null;
        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // flips.g:154:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // flips.g:154:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier45=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue719);  
            stream_Identifier.add(Identifier45);

            char_literal46=(Token)match(input,102,FOLLOW_102_in_defineWaypointValue721);  
            stream_102.add(char_literal46);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue723);
            geoCoordinate47=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate47.getTree());
            // flips.g:154:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Identifier) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==102) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>=103 && LA19_0<=104)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // flips.g:154:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // flips.g:154:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt18=3;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==103) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==104) ) {
            	        alt18=2;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // flips.g:154:35: 'and'
            	            {
            	            string_literal48=(Token)match(input,103,FOLLOW_103_in_defineWaypointValue727);  
            	            stream_103.add(string_literal48);


            	            }
            	            break;
            	        case 2 :
            	            // flips.g:154:41: ',' ( 'and' )?
            	            {
            	            char_literal49=(Token)match(input,104,FOLLOW_104_in_defineWaypointValue729);  
            	            stream_104.add(char_literal49);

            	            // flips.g:154:45: ( 'and' )?
            	            int alt17=2;
            	            int LA17_0 = input.LA(1);

            	            if ( (LA17_0==103) ) {
            	                alt17=1;
            	            }
            	            switch (alt17) {
            	                case 1 :
            	                    // flips.g:154:45: 'and'
            	                    {
            	                    string_literal50=(Token)match(input,103,FOLLOW_103_in_defineWaypointValue731);  
            	                    stream_103.add(string_literal50);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue736);  
            	    stream_Identifier.add(Identifier51);

            	    char_literal52=(Token)match(input,102,FOLLOW_102_in_defineWaypointValue738);  
            	    stream_102.add(char_literal52);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue740);
            	    geoCoordinate53=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate53.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



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
            // 155:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_geoCoordinate.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_geoCoordinate.hasNext()||stream_Identifier.hasNext() ) {
                    // flips.g:155:5: ^( DEFINE Identifier geoCoordinate )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
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
        return retval;
    }
    // $ANTLR end "defineWaypointValue"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // flips.g:160:1: statement : ( command | 'repeat' ( statement )* repeat | 'wait' condition );
    public final flipsParser.statement_return statement() throws RecognitionException {
        flipsParser.statement_return retval = new flipsParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal55=null;
        Token string_literal58=null;
        flipsParser.command_return command54 = null;

        flipsParser.statement_return statement56 = null;

        flipsParser.repeat_return repeat57 = null;

        flipsParser.condition_return condition59 = null;


        CommonTree string_literal55_tree=null;
        CommonTree string_literal58_tree=null;

        try {
            // flips.g:161:2: ( command | 'repeat' ( statement )* repeat | 'wait' condition )
            int alt21=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
                {
                alt21=1;
                }
                break;
            case 113:
                {
                alt21=2;
                }
                break;
            case 114:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // flips.g:161:4: command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_command_in_statement767);
                    command54=command();

                    state._fsp--;

                    adaptor.addChild(root_0, command54.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:162:4: 'repeat' ( statement )* repeat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal55=(Token)match(input,113,FOLLOW_113_in_statement772); 
                    string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    // flips.g:162:13: ( statement )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Identifier||(LA20_0>=113 && LA20_0<=114)||(LA20_0>=136 && LA20_0<=141)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // flips.g:162:13: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement774);
                    	    statement56=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_repeat_in_statement777);
                    repeat57=repeat();

                    state._fsp--;

                    adaptor.addChild(root_0, repeat57.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:163:4: 'wait' condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal58=(Token)match(input,114,FOLLOW_114_in_statement782); 
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);

                    pushFollow(FOLLOW_condition_in_statement784);
                    condition59=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition59.getTree());

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
        return retval;
    }
    // $ANTLR end "statement"

    public static class repeat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeat"
    // flips.g:166:1: repeat : ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition );
    public final flipsParser.repeat_return repeat() throws RecognitionException {
        flipsParser.repeat_return retval = new flipsParser.repeat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set61=null;
        Token string_literal62=null;
        Token string_literal64=null;
        flipsParser.integerValue_return integerValue60 = null;

        flipsParser.duration_return duration63 = null;

        flipsParser.condition_return condition65 = null;


        CommonTree set61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree string_literal64_tree=null;

        try {
            // flips.g:167:2: ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition )
            int alt22=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                alt22=1;
                }
                break;
            case 117:
                {
                alt22=2;
                }
                break;
            case 118:
                {
                alt22=3;
                }
                break;
            case 119:
            case 120:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // flips.g:167:4: integerValue ( 'time' | 'times' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_repeat795);
                    integerValue60=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue60.getTree());
                    set61=(Token)input.LT(1);
                    if ( (input.LA(1)>=115 && input.LA(1)<=116) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set61));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // flips.g:168:4: 'continuously' duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal62=(Token)match(input,117,FOLLOW_117_in_repeat806); 
                    string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);

                    pushFollow(FOLLOW_duration_in_repeat808);
                    duration63=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration63.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:169:4: 'forever'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal64=(Token)match(input,118,FOLLOW_118_in_repeat813); 
                    string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
                    adaptor.addChild(root_0, string_literal64_tree);


                    }
                    break;
                case 4 :
                    // flips.g:170:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_repeat818);
                    condition65=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition65.getTree());

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
        return retval;
    }
    // $ANTLR end "repeat"

    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // flips.g:173:1: condition : ( 'until' conditionValue | 'while' conditionValue );
    public final flipsParser.condition_return condition() throws RecognitionException {
        flipsParser.condition_return retval = new flipsParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal66=null;
        Token string_literal68=null;
        flipsParser.conditionValue_return conditionValue67 = null;

        flipsParser.conditionValue_return conditionValue69 = null;


        CommonTree string_literal66_tree=null;
        CommonTree string_literal68_tree=null;

        try {
            // flips.g:174:2: ( 'until' conditionValue | 'while' conditionValue )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==119) ) {
                alt23=1;
            }
            else if ( (LA23_0==120) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // flips.g:174:4: 'until' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal66=(Token)match(input,119,FOLLOW_119_in_condition829); 
                    string_literal66_tree = (CommonTree)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition831);
                    conditionValue67=conditionValue();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionValue67.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:175:4: 'while' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal68=(Token)match(input,120,FOLLOW_120_in_condition836); 
                    string_literal68_tree = (CommonTree)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition838);
                    conditionValue69=conditionValue();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionValue69.getTree());

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
        return retval;
    }
    // $ANTLR end "condition"

    public static class conditionValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionValue"
    // flips.g:178:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );
    public final flipsParser.conditionValue_return conditionValue() throws RecognitionException {
        flipsParser.conditionValue_return retval = new flipsParser.conditionValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        Token set71=null;
        Token set72=null;
        Token string_literal74=null;
        Token set75=null;
        Token set76=null;
        Token string_literal78=null;
        Token set79=null;
        Token set80=null;
        Token string_literal82=null;
        Token set83=null;
        Token set84=null;
        Token string_literal86=null;
        Token set87=null;
        Token set88=null;
        Token string_literal90=null;
        Token set91=null;
        Token set92=null;
        Token string_literal94=null;
        Token set95=null;
        Token set96=null;
        Token string_literal98=null;
        Token set99=null;
        Token set100=null;
        Token Identifier102=null;
        Token set103=null;
        flipsParser.timeValue_return timeValue73 = null;

        flipsParser.fixedDirection_return fixedDirection77 = null;

        flipsParser.speedValue_return speedValue81 = null;

        flipsParser.distanceValue_return distanceValue85 = null;

        flipsParser.angularValue_return angularValue89 = null;

        flipsParser.angularValue_return angularValue93 = null;

        flipsParser.waypoint_return waypoint97 = null;

        flipsParser.altitudeValue_return altitudeValue101 = null;

        flipsParser.numericValue_return numericValue104 = null;


        CommonTree string_literal70_tree=null;
        CommonTree set71_tree=null;
        CommonTree set72_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree set75_tree=null;
        CommonTree set76_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree set79_tree=null;
        CommonTree set80_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree set83_tree=null;
        CommonTree set84_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree set87_tree=null;
        CommonTree set88_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree set91_tree=null;
        CommonTree set92_tree=null;
        CommonTree string_literal94_tree=null;
        CommonTree set95_tree=null;
        CommonTree set96_tree=null;
        CommonTree string_literal98_tree=null;
        CommonTree set99_tree=null;
        CommonTree set100_tree=null;
        CommonTree Identifier102_tree=null;
        CommonTree set103_tree=null;

        try {
            // flips.g:179:2: ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue )
            int alt38=9;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // flips.g:179:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:179:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==115||(LA25_0>=121 && LA25_0<=122)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // flips.g:179:5: ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' )
                            {
                            // flips.g:179:5: ( 'the' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==121) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // flips.g:179:5: 'the'
                                    {
                                    string_literal70=(Token)match(input,121,FOLLOW_121_in_conditionValue850); 
                                    string_literal70_tree = (CommonTree)adaptor.create(string_literal70);
                                    adaptor.addChild(root_0, string_literal70_tree);


                                    }
                                    break;

                            }

                            set71=(Token)input.LT(1);
                            if ( input.LA(1)==115||input.LA(1)==122 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set71));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set72=(Token)input.LT(1);
                            if ( input.LA(1)==102||input.LA(1)==123 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set72));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeValue_in_conditionValue867);
                    timeValue73=timeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, timeValue73.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:180:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:180:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==121||(LA27_0>=124 && LA27_0<=125)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // flips.g:180:5: ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' )
                            {
                            // flips.g:180:5: ( 'the' )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==121) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // flips.g:180:5: 'the'
                                    {
                                    string_literal74=(Token)match(input,121,FOLLOW_121_in_conditionValue873); 
                                    string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
                                    adaptor.addChild(root_0, string_literal74_tree);


                                    }
                                    break;

                            }

                            set75=(Token)input.LT(1);
                            if ( (input.LA(1)>=124 && input.LA(1)<=125) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set75));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set76=(Token)input.LT(1);
                            if ( input.LA(1)==102||input.LA(1)==123 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set76));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_fixedDirection_in_conditionValue890);
                    fixedDirection77=fixedDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedDirection77.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:181:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:181:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==121||(LA29_0>=126 && LA29_0<=127)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // flips.g:181:5: ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' )
                            {
                            // flips.g:181:5: ( 'the' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==121) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // flips.g:181:5: 'the'
                                    {
                                    string_literal78=(Token)match(input,121,FOLLOW_121_in_conditionValue896); 
                                    string_literal78_tree = (CommonTree)adaptor.create(string_literal78);
                                    adaptor.addChild(root_0, string_literal78_tree);


                                    }
                                    break;

                            }

                            set79=(Token)input.LT(1);
                            if ( (input.LA(1)>=126 && input.LA(1)<=127) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set79));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set80=(Token)input.LT(1);
                            if ( input.LA(1)==102||input.LA(1)==123 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set80));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_speedValue_in_conditionValue913);
                    speedValue81=speedValue();

                    state._fsp--;

                    adaptor.addChild(root_0, speedValue81.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:182:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:182:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) )
                    // flips.g:182:5: ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' )
                    {
                    // flips.g:182:5: ( 'the' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==121) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // flips.g:182:5: 'the'
                            {
                            string_literal82=(Token)match(input,121,FOLLOW_121_in_conditionValue919); 
                            string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
                            adaptor.addChild(root_0, string_literal82_tree);


                            }
                            break;

                    }

                    set83=(Token)input.LT(1);
                    if ( (input.LA(1)>=128 && input.LA(1)<=129) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set83));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set84=(Token)input.LT(1);
                    if ( input.LA(1)==102||input.LA(1)==123 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set84));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_distanceValue_in_conditionValue935);
                    distanceValue85=distanceValue();

                    state._fsp--;

                    adaptor.addChild(root_0, distanceValue85.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:183:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:183:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) )
                    // flips.g:183:5: ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' )
                    {
                    // flips.g:183:5: ( 'the' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==121) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // flips.g:183:5: 'the'
                            {
                            string_literal86=(Token)match(input,121,FOLLOW_121_in_conditionValue941); 
                            string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                            adaptor.addChild(root_0, string_literal86_tree);


                            }
                            break;

                    }

                    set87=(Token)input.LT(1);
                    if ( (input.LA(1)>=130 && input.LA(1)<=131) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set87));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set88=(Token)input.LT(1);
                    if ( input.LA(1)==102||input.LA(1)==123 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue957);
                    angularValue89=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue89.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:184:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:184:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) )
                    // flips.g:184:5: ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' )
                    {
                    // flips.g:184:5: ( 'the' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==121) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // flips.g:184:5: 'the'
                            {
                            string_literal90=(Token)match(input,121,FOLLOW_121_in_conditionValue963); 
                            string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                            adaptor.addChild(root_0, string_literal90_tree);


                            }
                            break;

                    }

                    set91=(Token)input.LT(1);
                    if ( (input.LA(1)>=132 && input.LA(1)<=133) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set92=(Token)input.LT(1);
                    if ( input.LA(1)==102||input.LA(1)==123 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue979);
                    angularValue93=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue93.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:185:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:185:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=110 && LA34_0<=111)||LA34_0==121) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // flips.g:185:5: ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' )
                            {
                            // flips.g:185:5: ( 'the' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==121) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // flips.g:185:5: 'the'
                                    {
                                    string_literal94=(Token)match(input,121,FOLLOW_121_in_conditionValue985); 
                                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                                    adaptor.addChild(root_0, string_literal94_tree);


                                    }
                                    break;

                            }

                            set95=(Token)input.LT(1);
                            if ( (input.LA(1)>=110 && input.LA(1)<=111) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set95));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set96=(Token)input.LT(1);
                            if ( input.LA(1)==102||input.LA(1)==123 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set96));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_waypoint_in_conditionValue1002);
                    waypoint97=waypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, waypoint97.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:186:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:186:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==121||(LA36_0>=134 && LA36_0<=135)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // flips.g:186:5: ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' )
                            {
                            // flips.g:186:5: ( 'the' )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==121) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // flips.g:186:5: 'the'
                                    {
                                    string_literal98=(Token)match(input,121,FOLLOW_121_in_conditionValue1008); 
                                    string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
                                    adaptor.addChild(root_0, string_literal98_tree);


                                    }
                                    break;

                            }

                            set99=(Token)input.LT(1);
                            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set99));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set100=(Token)input.LT(1);
                            if ( input.LA(1)==102||input.LA(1)==123 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set100));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_altitudeValue_in_conditionValue1025);
                    altitudeValue101=altitudeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, altitudeValue101.getTree());

                    }
                    break;
                case 9 :
                    // flips.g:187:4: Identifier ( '=' | 'is' )? numericValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditionValue1030); 
                    Identifier102_tree = (CommonTree)adaptor.create(Identifier102);
                    adaptor.addChild(root_0, Identifier102_tree);

                    // flips.g:187:15: ( '=' | 'is' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==102||LA37_0==123) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // flips.g:
                            {
                            set103=(Token)input.LT(1);
                            if ( input.LA(1)==102||input.LA(1)==123 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set103));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numericValue_in_conditionValue1039);
                    numericValue104=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue104.getTree());

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
        return retval;
    }
    // $ANTLR end "conditionValue"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // flips.g:192:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand105 = null;

        flipsParser.turnCommand_return turnCommand106 = null;

        flipsParser.loiterCommand_return loiterCommand107 = null;

        flipsParser.executeCommand_return executeCommand108 = null;



        try {
            // flips.g:193:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 136:
            case 137:
                {
                alt39=1;
                }
                break;
            case 138:
            case 139:
                {
                alt39=2;
                }
                break;
            case 140:
            case 141:
                {
                alt39=3;
                }
                break;
            case Identifier:
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
                    // flips.g:193:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command1052);
                    flyCommand105=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand105.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:194:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command1057);
                    turnCommand106=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand106.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:195:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command1062);
                    loiterCommand107=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand107.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:196:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command1067);
                    executeCommand108=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand108.getTree());

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
        return retval;
    }
    // $ANTLR end "command"

    public static class flyCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flyCommand"
    // flips.g:199:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        flipsParser.flyCommandValue_return flyCommandValue111 = null;


        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // flips.g:200:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // flips.g:200:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // flips.g:200:4: ( 'fly' | 'go' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==136) ) {
                alt40=1;
            }
            else if ( (LA40_0==137) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // flips.g:200:5: 'fly'
                    {
                    string_literal109=(Token)match(input,136,FOLLOW_136_in_flyCommand1079);  
                    stream_136.add(string_literal109);


                    }
                    break;
                case 2 :
                    // flips.g:200:11: 'go'
                    {
                    string_literal110=(Token)match(input,137,FOLLOW_137_in_flyCommand1081);  
                    stream_137.add(string_literal110);


                    }
                    break;

            }

            // flips.g:200:17: ( flyCommandValue )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=BinaryLiteral && LA41_0<=HexLiteral)) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==167||(LA41_2>=169 && LA41_2<=195)||(LA41_2>=198 && LA41_2<=207)||(LA41_2>=313 && LA41_2<=314)) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>=To && LA41_0<=At)||LA41_0==With||(LA41_0>=Turning && LA41_0<=FloatingPointLiteral)||(LA41_0>=130 && LA41_0<=133)||(LA41_0>=143 && LA41_0<=144)||LA41_0==230||LA41_0==245||(LA41_0>=250 && LA41_0<=297)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // flips.g:200:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand1084);
            	    flyCommandValue111=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue111.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);



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
            // 201:2: -> ^( FLY ( flyCommandValue )* )
            {
                // flips.g:201:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // flips.g:201:11: ( flyCommandValue )*
                while ( stream_flyCommandValue.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "flyCommand"

    public static class flyCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flyCommandValue"
    // flips.g:204:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
    public final flipsParser.flyCommandValue_return flyCommandValue() throws RecognitionException {
        flipsParser.flyCommandValue_return retval = new flipsParser.flyCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To119=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token string_literal123=null;
        flipsParser.time_return time112 = null;

        flipsParser.direction_return direction113 = null;

        flipsParser.speed_return speed114 = null;

        flipsParser.distance_return distance115 = null;

        flipsParser.pitch_return pitch116 = null;

        flipsParser.roll_return roll117 = null;

        flipsParser.duration_return duration118 = null;

        flipsParser.waypoint_return waypoint120 = null;

        flipsParser.waypoint_return waypoint124 = null;

        flipsParser.altitude_return altitude125 = null;


        CommonTree To119_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // flips.g:205:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt45=9;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // flips.g:205:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue1106);
                    time112=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time112.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:206:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue1111);
                    direction113=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction113.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:207:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue1116);
                    speed114=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed114.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:208:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue1121);
                    distance115=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance115.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:209:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue1126);
                    pitch116=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch116.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:210:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue1131);
                    roll117=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll117.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:211:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue1136);
                    duration118=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration118.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:212:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To119=(Token)match(input,To,FOLLOW_To_in_flyCommandValue1141);  
                    stream_To.add(To119);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue1143);
                    waypoint120=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint120.getTree());
                    // flips.g:212:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=103 && LA44_0<=104)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // flips.g:212:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // flips.g:212:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==103) ) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==104) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // flips.g:212:18: 'and'
                    	            {
                    	            string_literal121=(Token)match(input,103,FOLLOW_103_in_flyCommandValue1147);  
                    	            stream_103.add(string_literal121);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:212:24: ',' ( 'and' )?
                    	            {
                    	            char_literal122=(Token)match(input,104,FOLLOW_104_in_flyCommandValue1149);  
                    	            stream_104.add(char_literal122);

                    	            // flips.g:212:28: ( 'and' )?
                    	            int alt42=2;
                    	            int LA42_0 = input.LA(1);

                    	            if ( (LA42_0==103) ) {
                    	                alt42=1;
                    	            }
                    	            switch (alt42) {
                    	                case 1 :
                    	                    // flips.g:212:28: 'and'
                    	                    {
                    	                    string_literal123=(Token)match(input,103,FOLLOW_103_in_flyCommandValue1151);  
                    	                    stream_103.add(string_literal123);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue1155);
                    	    waypoint124=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);



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
                    // 213:2: -> ( waypoint )+
                    {
                        if ( !(stream_waypoint.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_waypoint.hasNext() ) {
                            adaptor.addChild(root_0, stream_waypoint.nextTree());

                        }
                        stream_waypoint.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // flips.g:214:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue1168);
                    altitude125=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude125.getTree());

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
        return retval;
    }
    // $ANTLR end "flyCommandValue"

    public static class turnCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turnCommand"
    // flips.g:217:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal126=null;
        Token string_literal127=null;
        flipsParser.turnCommandValue_return turnCommandValue128 = null;


        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // flips.g:218:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // flips.g:218:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // flips.g:218:4: ( 'trn' | 'turn' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==138) ) {
                alt46=1;
            }
            else if ( (LA46_0==139) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // flips.g:218:5: 'trn'
                    {
                    string_literal126=(Token)match(input,138,FOLLOW_138_in_turnCommand1180);  
                    stream_138.add(string_literal126);


                    }
                    break;
                case 2 :
                    // flips.g:218:11: 'turn'
                    {
                    string_literal127=(Token)match(input,139,FOLLOW_139_in_turnCommand1182);  
                    stream_139.add(string_literal127);


                    }
                    break;

            }

            // flips.g:218:19: ( turnCommandValue )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=Turning && LA47_0<=Heading)||LA47_0==245||(LA47_0>=251 && LA47_0<=281)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // flips.g:218:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand1185);
            	    turnCommandValue128=turnCommandValue();

            	    state._fsp--;

            	    stream_turnCommandValue.add(turnCommandValue128.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);



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
            // 219:2: -> ^( FLY ( turnCommandValue )* )
            {
                // flips.g:219:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // flips.g:219:11: ( turnCommandValue )*
                while ( stream_turnCommandValue.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "turnCommand"

    public static class turnCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turnCommandValue"
    // flips.g:222:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction129 = null;



        try {
            // flips.g:223:2: ( direction )
            // flips.g:223:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue1207);
            direction129=direction();

            state._fsp--;

            adaptor.addChild(root_0, direction129.getTree());

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
        return retval;
    }
    // $ANTLR end "turnCommandValue"

    public static class loiterCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterCommand"
    // flips.g:226:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        flipsParser.loiterCommandValue_return loiterCommandValue132 = null;


        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // flips.g:227:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // flips.g:227:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // flips.g:227:4: ( 'ltr' | 'loiter' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==140) ) {
                alt48=1;
            }
            else if ( (LA48_0==141) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // flips.g:227:5: 'ltr'
                    {
                    string_literal130=(Token)match(input,140,FOLLOW_140_in_loiterCommand1219);  
                    stream_140.add(string_literal130);


                    }
                    break;
                case 2 :
                    // flips.g:227:11: 'loiter'
                    {
                    string_literal131=(Token)match(input,141,FOLLOW_141_in_loiterCommand1221);  
                    stream_141.add(string_literal131);


                    }
                    break;

            }

            // flips.g:227:21: ( loiterCommandValue )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=BinaryLiteral && LA49_0<=HexLiteral)) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==167||(LA49_2>=169 && LA49_2<=195)||(LA49_2>=198 && LA49_2<=207)||(LA49_2>=313 && LA49_2<=314)) ) {
                        alt49=1;
                    }


                }
                else if ( ((LA49_0>=To && LA49_0<=At)||LA49_0==With||LA49_0==Turning||LA49_0==FloatingPointLiteral||LA49_0==146||(LA49_0>=167 && LA49_0<=168)||LA49_0==230||LA49_0==250||(LA49_0>=282 && LA49_0<=291)||(LA49_0>=298 && LA49_0<=301)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // flips.g:227:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand1224);
            	    loiterCommandValue132=loiterCommandValue();

            	    state._fsp--;

            	    stream_loiterCommandValue.add(loiterCommandValue132.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);



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
            // 228:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // flips.g:228:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // flips.g:228:14: ( loiterCommandValue )*
                while ( stream_loiterCommandValue.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "loiterCommand"

    public static class loiterCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterCommandValue"
    // flips.g:231:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
    public final flipsParser.loiterCommandValue_return loiterCommandValue() throws RecognitionException {
        flipsParser.loiterCommandValue_return retval = new flipsParser.loiterCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At138=null;
        flipsParser.time_return time133 = null;

        flipsParser.speed_return speed134 = null;

        flipsParser.loiterDirection_return loiterDirection135 = null;

        flipsParser.radius_return radius136 = null;

        flipsParser.duration_return duration137 = null;

        flipsParser.waypoint_return waypoint139 = null;

        flipsParser.altitude_return altitude140 = null;


        CommonTree At138_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // flips.g:232:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt50=7;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // flips.g:232:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue1246);
                    time133=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time133.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:233:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue1251);
                    speed134=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed134.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:234:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue1256);
                    loiterDirection135=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection135.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:235:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue1261);
                    radius136=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius136.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:236:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue1266);
                    duration137=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration137.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:237:4: At waypoint
                    {
                    At138=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue1271);  
                    stream_At.add(At138);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue1273);
                    waypoint139=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint139.getTree());


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
                    // 238:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:239:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue1283);
                    altitude140=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude140.getTree());

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
        return retval;
    }
    // $ANTLR end "loiterCommandValue"

    public static class executeCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "executeCommand"
    // flips.g:242:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' executeCommandParameter ( ',' executeCommandParameter )* ')' -> ^( EXECUTE Identifier ( executeCommandParameter )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier141=null;
        Token Identifier142=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token char_literal147=null;
        flipsParser.executeCommandParameter_return executeCommandParameter144 = null;

        flipsParser.executeCommandParameter_return executeCommandParameter146 = null;


        CommonTree Identifier141_tree=null;
        CommonTree Identifier142_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_executeCommandParameter=new RewriteRuleSubtreeStream(adaptor,"rule executeCommandParameter");
        try {
            // flips.g:243:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' executeCommandParameter ( ',' executeCommandParameter )* ')' -> ^( EXECUTE Identifier ( executeCommandParameter )+ ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Identifier) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==105) ) {
                    alt52=2;
                }
                else if ( (LA52_1==EOF||LA52_1==Identifier||(LA52_1>=BinaryLiteral && LA52_1<=HexLiteral)||(LA52_1>=113 && LA52_1<=114)||(LA52_1>=117 && LA52_1<=120)||(LA52_1>=136 && LA52_1<=141)) ) {
                    alt52=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // flips.g:243:4: Identifier
                    {
                    Identifier141=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1294);  
                    stream_Identifier.add(Identifier141);



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
                    // 244:2: -> ^( EXECUTE Identifier )
                    {
                        // flips.g:244:5: ^( EXECUTE Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:245:4: Identifier '(' executeCommandParameter ( ',' executeCommandParameter )* ')'
                    {
                    Identifier142=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1308);  
                    stream_Identifier.add(Identifier142);

                    char_literal143=(Token)match(input,105,FOLLOW_105_in_executeCommand1310);  
                    stream_105.add(char_literal143);

                    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand1312);
                    executeCommandParameter144=executeCommandParameter();

                    state._fsp--;

                    stream_executeCommandParameter.add(executeCommandParameter144.getTree());
                    // flips.g:245:43: ( ',' executeCommandParameter )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==104) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // flips.g:245:44: ',' executeCommandParameter
                    	    {
                    	    char_literal145=(Token)match(input,104,FOLLOW_104_in_executeCommand1315);  
                    	    stream_104.add(char_literal145);

                    	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand1317);
                    	    executeCommandParameter146=executeCommandParameter();

                    	    state._fsp--;

                    	    stream_executeCommandParameter.add(executeCommandParameter146.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    char_literal147=(Token)match(input,106,FOLLOW_106_in_executeCommand1322);  
                    stream_106.add(char_literal147);



                    // AST REWRITE
                    // elements: executeCommandParameter, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 246:2: -> ^( EXECUTE Identifier ( executeCommandParameter )+ )
                    {
                        // flips.g:246:5: ^( EXECUTE Identifier ( executeCommandParameter )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_executeCommandParameter.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_executeCommandParameter.hasNext() ) {
                            adaptor.addChild(root_1, stream_executeCommandParameter.nextTree());

                        }
                        stream_executeCommandParameter.reset();

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
        return retval;
    }
    // $ANTLR end "executeCommand"

    public static class executeCommandParameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "executeCommandParameter"
    // flips.g:249:1: executeCommandParameter : ( numericValue -> ^( PARAMETER numericValue ) | StringLiteral -> ^( PARAMETER StringLiteral ) );
    public final flipsParser.executeCommandParameter_return executeCommandParameter() throws RecognitionException {
        flipsParser.executeCommandParameter_return retval = new flipsParser.executeCommandParameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral149=null;
        flipsParser.numericValue_return numericValue148 = null;


        CommonTree StringLiteral149_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:250:2: ( numericValue -> ^( PARAMETER numericValue ) | StringLiteral -> ^( PARAMETER StringLiteral ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=FloatingPointLiteral && LA53_0<=HexLiteral)) ) {
                alt53=1;
            }
            else if ( (LA53_0==StringLiteral) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // flips.g:250:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_executeCommandParameter1345);
                    numericValue148=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue148.getTree());


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
                    // 251:2: -> ^( PARAMETER numericValue )
                    {
                        // flips.g:251:5: ^( PARAMETER numericValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_1);

                        adaptor.addChild(root_1, stream_numericValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:252:4: StringLiteral
                    {
                    StringLiteral149=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_executeCommandParameter1359);  
                    stream_StringLiteral.add(StringLiteral149);



                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 253:2: -> ^( PARAMETER StringLiteral )
                    {
                        // flips.g:253:5: ^( PARAMETER StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.nextNode());

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
        return retval;
    }
    // $ANTLR end "executeCommandParameter"

    public static class pitch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pitch"
    // flips.g:258:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
    public final flipsParser.pitch_return pitch() throws RecognitionException {
        flipsParser.pitch_return retval = new flipsParser.pitch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal150=null;
        Token string_literal151=null;
        Token With153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal157=null;
        flipsParser.angularValue_return angularValue152 = null;

        flipsParser.angularValue_return angularValue158 = null;


        CommonTree string_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree With153_tree=null;
        CommonTree string_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal157_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // flips.g:259:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=130 && LA58_0<=131)) ) {
                alt58=1;
            }
            else if ( (LA58_0==With||(LA58_0>=143 && LA58_0<=144)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // flips.g:259:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // flips.g:259:4: ( 'pit' | 'pitch' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==130) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==131) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // flips.g:259:5: 'pit'
                            {
                            string_literal150=(Token)match(input,130,FOLLOW_130_in_pitch1382);  
                            stream_130.add(string_literal150);


                            }
                            break;
                        case 2 :
                            // flips.g:259:11: 'pitch'
                            {
                            string_literal151=(Token)match(input,131,FOLLOW_131_in_pitch1384);  
                            stream_131.add(string_literal151);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1387);
                    angularValue152=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue152.getTree());


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
                    // 260:2: -> ^( PITCH angularValue )
                    {
                        // flips.g:260:5: ^( PITCH angularValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PITCH, "PITCH"), root_1);

                        adaptor.addChild(root_1, stream_angularValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:261:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // flips.g:261:4: ( With 'an' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==With) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // flips.g:261:5: With 'an'
                            {
                            With153=(Token)match(input,With,FOLLOW_With_in_pitch1402);  
                            stream_With.add(With153);

                            string_literal154=(Token)match(input,142,FOLLOW_142_in_pitch1404);  
                            stream_142.add(string_literal154);


                            }
                            break;

                    }

                    // flips.g:261:17: ( 'aoa' | 'angle of attack' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==143) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==144) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // flips.g:261:18: 'aoa'
                            {
                            string_literal155=(Token)match(input,143,FOLLOW_143_in_pitch1409);  
                            stream_143.add(string_literal155);


                            }
                            break;
                        case 2 :
                            // flips.g:261:24: 'angle of attack'
                            {
                            string_literal156=(Token)match(input,144,FOLLOW_144_in_pitch1411);  
                            stream_144.add(string_literal156);


                            }
                            break;

                    }

                    // flips.g:261:43: ( 'of' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==145) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // flips.g:261:43: 'of'
                            {
                            string_literal157=(Token)match(input,145,FOLLOW_145_in_pitch1414);  
                            stream_145.add(string_literal157);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1417);
                    angularValue158=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue158.getTree());


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
                    // 262:2: -> ^( PITCH angularValue )
                    {
                        // flips.g:262:5: ^( PITCH angularValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PITCH, "PITCH"), root_1);

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
        return retval;
    }
    // $ANTLR end "pitch"

    public static class roll_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roll"
    // flips.g:265:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal159=null;
        Token string_literal160=null;
        flipsParser.angularValue_return angularValue161 = null;


        CommonTree string_literal159_tree=null;
        CommonTree string_literal160_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // flips.g:266:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // flips.g:266:4: ( 'rol' | 'roll' ) angularValue
            {
            // flips.g:266:4: ( 'rol' | 'roll' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==132) ) {
                alt59=1;
            }
            else if ( (LA59_0==133) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // flips.g:266:5: 'rol'
                    {
                    string_literal159=(Token)match(input,132,FOLLOW_132_in_roll1438);  
                    stream_132.add(string_literal159);


                    }
                    break;
                case 2 :
                    // flips.g:266:11: 'roll'
                    {
                    string_literal160=(Token)match(input,133,FOLLOW_133_in_roll1440);  
                    stream_133.add(string_literal160);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1443);
            angularValue161=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue161.getTree());


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
            // 267:2: -> ^( ROLL angularValue )
            {
                // flips.g:267:5: ^( ROLL angularValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROLL, "ROLL"), root_1);

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
        return retval;
    }
    // $ANTLR end "roll"

    public static class altitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitude"
    // flips.g:272:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude162 = null;

        flipsParser.relativeAltitude_return relativeAltitude163 = null;



        try {
            // flips.g:273:2: ( fixedAltitude | relativeAltitude )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // flips.g:273:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1465);
                    fixedAltitude162=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude162.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:274:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1470);
                    relativeAltitude163=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude163.getTree());

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
        return retval;
    }
    // $ANTLR end "altitude"

    public static class fixedAltitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedAltitude"
    // flips.g:277:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To165=null;
        Token At166=null;
        Token With167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        Token char_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        flipsParser.upDownDirection_return upDownDirection164 = null;

        flipsParser.altitudeValue_return altitudeValue175 = null;


        CommonTree To165_tree=null;
        CommonTree At166_tree=null;
        CommonTree With167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        CommonTree char_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree string_literal173_tree=null;
        CommonTree string_literal174_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // flips.g:278:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // flips.g:278:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // flips.g:278:4: ( ( upDownDirection )? To | At | With )
            int alt62=3;
            switch ( input.LA(1) ) {
            case To:
            case 230:
            case 282:
            case 283:
            case 284:
            case 285:
            case 286:
            case 287:
            case 288:
            case 289:
            case 290:
            case 291:
                {
                alt62=1;
                }
                break;
            case At:
                {
                alt62=2;
                }
                break;
            case With:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // flips.g:278:5: ( upDownDirection )? To
                    {
                    // flips.g:278:5: ( upDownDirection )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==230||(LA61_0>=282 && LA61_0<=291)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // flips.g:278:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1482);
                            upDownDirection164=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection164.getTree());

                            }
                            break;

                    }

                    To165=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1485);  
                    stream_To.add(To165);


                    }
                    break;
                case 2 :
                    // flips.g:278:25: At
                    {
                    At166=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1487);  
                    stream_At.add(At166);


                    }
                    break;
                case 3 :
                    // flips.g:278:28: With
                    {
                    With167=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1489);  
                    stream_With.add(With167);


                    }
                    break;

            }

            // flips.g:278:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=134 && LA69_0<=135)||LA69_0==142||(LA69_0>=146 && LA69_0<=148)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // flips.g:278:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // flips.g:278:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=134 && LA67_0<=135)||LA67_0==142) ) {
                        alt67=1;
                    }
                    else if ( ((LA67_0>=146 && LA67_0<=148)) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // flips.g:278:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // flips.g:278:36: ( 'an' )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==142) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // flips.g:278:36: 'an'
                                    {
                                    string_literal168=(Token)match(input,142,FOLLOW_142_in_fixedAltitude1494);  
                                    stream_142.add(string_literal168);


                                    }
                                    break;

                            }

                            // flips.g:278:42: ( 'alt' | 'altitude' )
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==134) ) {
                                alt64=1;
                            }
                            else if ( (LA64_0==135) ) {
                                alt64=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 0, input);

                                throw nvae;
                            }
                            switch (alt64) {
                                case 1 :
                                    // flips.g:278:43: 'alt'
                                    {
                                    string_literal169=(Token)match(input,134,FOLLOW_134_in_fixedAltitude1498);  
                                    stream_134.add(string_literal169);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:278:49: 'altitude'
                                    {
                                    string_literal170=(Token)match(input,135,FOLLOW_135_in_fixedAltitude1500);  
                                    stream_135.add(string_literal170);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // flips.g:278:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // flips.g:278:61: ( 'a' )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==146) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // flips.g:278:61: 'a'
                                    {
                                    char_literal171=(Token)match(input,146,FOLLOW_146_in_fixedAltitude1503);  
                                    stream_146.add(char_literal171);


                                    }
                                    break;

                            }

                            // flips.g:278:66: ( 'pres' | 'pressure' )
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==147) ) {
                                alt66=1;
                            }
                            else if ( (LA66_0==148) ) {
                                alt66=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 66, 0, input);

                                throw nvae;
                            }
                            switch (alt66) {
                                case 1 :
                                    // flips.g:278:67: 'pres'
                                    {
                                    string_literal172=(Token)match(input,147,FOLLOW_147_in_fixedAltitude1507);  
                                    stream_147.add(string_literal172);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:278:74: 'pressure'
                                    {
                                    string_literal173=(Token)match(input,148,FOLLOW_148_in_fixedAltitude1509);  
                                    stream_148.add(string_literal173);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // flips.g:278:87: ( 'of' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==145) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // flips.g:278:87: 'of'
                            {
                            string_literal174=(Token)match(input,145,FOLLOW_145_in_fixedAltitude1513);  
                            stream_145.add(string_literal174);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1518);
            altitudeValue175=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue175.getTree());


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
            // 279:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // flips.g:279:5: ^( ALTITUDE FIXED altitudeValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALTITUDE, "ALTITUDE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
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
        return retval;
    }
    // $ANTLR end "fixedAltitude"

    public static class relativeAltitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeAltitude"
    // flips.g:282:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection176 = null;

        flipsParser.altitudeValue_return altitudeValue177 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // flips.g:283:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // flips.g:283:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1540);
            upDownDirection176=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection176.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1542);
            altitudeValue177=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue177.getTree());


            // AST REWRITE
            // elements: upDownDirection, altitudeValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 284:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // flips.g:284:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALTITUDE, "ALTITUDE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                adaptor.addChild(root_1, stream_upDownDirection.nextTree());
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
        return retval;
    }
    // $ANTLR end "relativeAltitude"

    public static class altitudeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitudeValue"
    // flips.g:287:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel180=null;
        flipsParser.distanceValue_return distanceValue178 = null;

        flipsParser.pressureValue_return pressureValue179 = null;


        CommonTree FlightLevel180_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:288:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt70=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==167||(LA70_1>=169 && LA70_1<=195)) ) {
                    alt70=1;
                }
                else if ( ((LA70_1>=149 && LA70_1<=166)) ) {
                    alt70=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA70_2 = input.LA(2);

                if ( ((LA70_2>=149 && LA70_2<=166)) ) {
                    alt70=2;
                }
                else if ( (LA70_2==167||(LA70_2>=169 && LA70_2<=195)) ) {
                    alt70=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;
                }
                }
                break;
            case FlightLevel:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // flips.g:288:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1566);
                    distanceValue178=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue178.getTree());


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
                    // 289:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:290:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1578);
                    pressureValue179=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue179.getTree());


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
                    // 291:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:292:4: FlightLevel
                    {
                    FlightLevel180=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1590);  
                    stream_FlightLevel.add(FlightLevel180);



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
                    // 293:2: -> FLIGHTLEVEL FlightLevel
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FLIGHTLEVEL, "FLIGHTLEVEL"));
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
        return retval;
    }
    // $ANTLR end "altitudeValue"

    public static class pressureValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pressureValue"
    // flips.g:296:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue181 = null;

        flipsParser.pressureUnit_return pressureUnit182 = null;



        try {
            // flips.g:297:2: ( numericValue pressureUnit )
            // flips.g:297:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1608);
            numericValue181=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue181.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1610);
            pressureUnit182=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit182.getTree());

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
        return retval;
    }
    // $ANTLR end "pressureValue"

    public static class pressureUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pressureUnit"
    // flips.g:300:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal183=null;
        Token string_literal184=null;
        Token string_literal185=null;
        Token string_literal186=null;
        Token string_literal187=null;
        Token string_literal188=null;
        Token string_literal189=null;
        Token string_literal190=null;
        Token string_literal191=null;
        Token string_literal192=null;
        Token string_literal193=null;
        Token string_literal194=null;
        Token string_literal195=null;
        Token string_literal196=null;
        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;

        CommonTree string_literal183_tree=null;
        CommonTree string_literal184_tree=null;
        CommonTree string_literal185_tree=null;
        CommonTree string_literal186_tree=null;
        CommonTree string_literal187_tree=null;
        CommonTree string_literal188_tree=null;
        CommonTree string_literal189_tree=null;
        CommonTree string_literal190_tree=null;
        CommonTree string_literal191_tree=null;
        CommonTree string_literal192_tree=null;
        CommonTree string_literal193_tree=null;
        CommonTree string_literal194_tree=null;
        CommonTree string_literal195_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree string_literal197_tree=null;
        CommonTree string_literal198_tree=null;
        CommonTree string_literal199_tree=null;
        CommonTree string_literal200_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // flips.g:301:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 149:
            case 150:
            case 151:
                {
                alt77=1;
                }
                break;
            case 152:
            case 153:
            case 154:
                {
                alt77=2;
                }
                break;
            case 155:
            case 156:
            case 157:
                {
                alt77=3;
                }
                break;
            case 158:
            case 159:
                {
                alt77=4;
                }
                break;
            case 160:
            case 161:
            case 162:
                {
                alt77=5;
                }
                break;
            case 163:
            case 164:
            case 165:
            case 166:
                {
                alt77=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // flips.g:301:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // flips.g:301:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 149:
                        {
                        alt71=1;
                        }
                        break;
                    case 150:
                        {
                        alt71=2;
                        }
                        break;
                    case 151:
                        {
                        alt71=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }

                    switch (alt71) {
                        case 1 :
                            // flips.g:301:5: 'kpa'
                            {
                            string_literal183=(Token)match(input,149,FOLLOW_149_in_pressureUnit1622);  
                            stream_149.add(string_literal183);


                            }
                            break;
                        case 2 :
                            // flips.g:301:11: 'kilopascal'
                            {
                            string_literal184=(Token)match(input,150,FOLLOW_150_in_pressureUnit1624);  
                            stream_150.add(string_literal184);


                            }
                            break;
                        case 3 :
                            // flips.g:301:24: 'kilopascals'
                            {
                            string_literal185=(Token)match(input,151,FOLLOW_151_in_pressureUnit1626);  
                            stream_151.add(string_literal185);


                            }
                            break;

                    }



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
                    // 302:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:303:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // flips.g:303:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case 152:
                        {
                        alt72=1;
                        }
                        break;
                    case 153:
                        {
                        alt72=2;
                        }
                        break;
                    case 154:
                        {
                        alt72=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // flips.g:303:5: 'hpa'
                            {
                            string_literal186=(Token)match(input,152,FOLLOW_152_in_pressureUnit1638);  
                            stream_152.add(string_literal186);


                            }
                            break;
                        case 2 :
                            // flips.g:303:11: 'hectopascal'
                            {
                            string_literal187=(Token)match(input,153,FOLLOW_153_in_pressureUnit1640);  
                            stream_153.add(string_literal187);


                            }
                            break;
                        case 3 :
                            // flips.g:303:25: 'hectopascals'
                            {
                            string_literal188=(Token)match(input,154,FOLLOW_154_in_pressureUnit1642);  
                            stream_154.add(string_literal188);


                            }
                            break;

                    }



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
                    // 304:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:305:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // flips.g:305:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt73=3;
                    switch ( input.LA(1) ) {
                    case 155:
                        {
                        alt73=1;
                        }
                        break;
                    case 156:
                        {
                        alt73=2;
                        }
                        break;
                    case 157:
                        {
                        alt73=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // flips.g:305:5: 'pa'
                            {
                            string_literal189=(Token)match(input,155,FOLLOW_155_in_pressureUnit1654);  
                            stream_155.add(string_literal189);


                            }
                            break;
                        case 2 :
                            // flips.g:305:10: 'pascal'
                            {
                            string_literal190=(Token)match(input,156,FOLLOW_156_in_pressureUnit1656);  
                            stream_156.add(string_literal190);


                            }
                            break;
                        case 3 :
                            // flips.g:305:19: 'pascals'
                            {
                            string_literal191=(Token)match(input,157,FOLLOW_157_in_pressureUnit1658);  
                            stream_157.add(string_literal191);


                            }
                            break;

                    }



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
                    // 306:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:307:4: ( 'bar' | 'bars' )
                    {
                    // flips.g:307:4: ( 'bar' | 'bars' )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==158) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==159) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // flips.g:307:5: 'bar'
                            {
                            string_literal192=(Token)match(input,158,FOLLOW_158_in_pressureUnit1670);  
                            stream_158.add(string_literal192);


                            }
                            break;
                        case 2 :
                            // flips.g:307:11: 'bars'
                            {
                            string_literal193=(Token)match(input,159,FOLLOW_159_in_pressureUnit1672);  
                            stream_159.add(string_literal193);


                            }
                            break;

                    }



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
                    // 308:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:309:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // flips.g:309:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt75=3;
                    switch ( input.LA(1) ) {
                    case 160:
                        {
                        alt75=1;
                        }
                        break;
                    case 161:
                        {
                        alt75=2;
                        }
                        break;
                    case 162:
                        {
                        alt75=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }

                    switch (alt75) {
                        case 1 :
                            // flips.g:309:5: 'mbar'
                            {
                            string_literal194=(Token)match(input,160,FOLLOW_160_in_pressureUnit1684);  
                            stream_160.add(string_literal194);


                            }
                            break;
                        case 2 :
                            // flips.g:309:12: 'millibar'
                            {
                            string_literal195=(Token)match(input,161,FOLLOW_161_in_pressureUnit1686);  
                            stream_161.add(string_literal195);


                            }
                            break;
                        case 3 :
                            // flips.g:309:23: 'millibars'
                            {
                            string_literal196=(Token)match(input,162,FOLLOW_162_in_pressureUnit1688);  
                            stream_162.add(string_literal196);


                            }
                            break;

                    }



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
                    // 310:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:311:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // flips.g:311:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt76=4;
                    switch ( input.LA(1) ) {
                    case 163:
                        {
                        alt76=1;
                        }
                        break;
                    case 164:
                        {
                        alt76=2;
                        }
                        break;
                    case 165:
                        {
                        alt76=3;
                        }
                        break;
                    case 166:
                        {
                        alt76=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // flips.g:311:5: 'atm'
                            {
                            string_literal197=(Token)match(input,163,FOLLOW_163_in_pressureUnit1700);  
                            stream_163.add(string_literal197);


                            }
                            break;
                        case 2 :
                            // flips.g:311:11: 'atms'
                            {
                            string_literal198=(Token)match(input,164,FOLLOW_164_in_pressureUnit1702);  
                            stream_164.add(string_literal198);


                            }
                            break;
                        case 3 :
                            // flips.g:311:18: 'atmosphere'
                            {
                            string_literal199=(Token)match(input,165,FOLLOW_165_in_pressureUnit1704);  
                            stream_165.add(string_literal199);


                            }
                            break;
                        case 4 :
                            // flips.g:311:31: 'atmospheres'
                            {
                            string_literal200=(Token)match(input,166,FOLLOW_166_in_pressureUnit1706);  
                            stream_166.add(string_literal200);


                            }
                            break;

                    }



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
                    // 312:2: -> ATMOSPHERE
                    {
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
        return retval;
    }
    // $ANTLR end "pressureUnit"

    public static class radius_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "radius"
    // flips.g:317:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
    public final flipsParser.radius_return radius() throws RecognitionException {
        flipsParser.radius_return retval = new flipsParser.radius_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal201=null;
        Token With202=null;
        Token char_literal203=null;
        Token string_literal204=null;
        Token string_literal205=null;
        Token string_literal208=null;
        flipsParser.distanceValue_return distanceValue206 = null;

        flipsParser.distanceValue_return distanceValue207 = null;


        CommonTree string_literal201_tree=null;
        CommonTree With202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree string_literal204_tree=null;
        CommonTree string_literal205_tree=null;
        CommonTree string_literal208_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:318:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // flips.g:318:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // flips.g:318:4: ( 'in' | With )?
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==167) ) {
                alt78=1;
            }
            else if ( (LA78_0==With) ) {
                alt78=2;
            }
            switch (alt78) {
                case 1 :
                    // flips.g:318:5: 'in'
                    {
                    string_literal201=(Token)match(input,167,FOLLOW_167_in_radius1726);  
                    stream_167.add(string_literal201);


                    }
                    break;
                case 2 :
                    // flips.g:318:10: With
                    {
                    With202=(Token)match(input,With,FOLLOW_With_in_radius1728);  
                    stream_With.add(With202);


                    }
                    break;

            }

            // flips.g:318:17: ( 'a' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==146) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // flips.g:318:17: 'a'
                    {
                    char_literal203=(Token)match(input,146,FOLLOW_146_in_radius1732);  
                    stream_146.add(char_literal203);


                    }
                    break;

            }

            // flips.g:318:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==168) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=FloatingPointLiteral && LA81_0<=HexLiteral)) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // flips.g:318:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal204=(Token)match(input,168,FOLLOW_168_in_radius1736);  
                    stream_168.add(string_literal204);

                    // flips.g:318:32: ( 'of' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==145) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // flips.g:318:32: 'of'
                            {
                            string_literal205=(Token)match(input,145,FOLLOW_145_in_radius1738);  
                            stream_145.add(string_literal205);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1741);
                    distanceValue206=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue206.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:318:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1743);
                    distanceValue207=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue207.getTree());
                    string_literal208=(Token)match(input,168,FOLLOW_168_in_radius1745);  
                    stream_168.add(string_literal208);


                    }
                    break;

            }



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
            // 319:2: -> ^( RADIUS distanceValue )
            {
                // flips.g:319:5: ^( RADIUS distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RADIUS, "RADIUS"), root_1);

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
        return retval;
    }
    // $ANTLR end "radius"

    public static class distance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distance"
    // flips.g:322:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection209 = null;

        flipsParser.distanceValue_return distanceValue210 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:323:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // flips.g:323:4: ( leftRightDirection )? distanceValue
            {
            // flips.g:323:4: ( leftRightDirection )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=292 && LA82_0<=297)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // flips.g:323:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1766);
                    leftRightDirection209=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection209.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1769);
            distanceValue210=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue210.getTree());


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
            // 324:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // flips.g:324:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // flips.g:324:16: ( leftRightDirection )?
                if ( stream_leftRightDirection.hasNext() ) {
                    adaptor.addChild(root_1, stream_leftRightDirection.nextTree());

                }
                stream_leftRightDirection.reset();
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
        return retval;
    }
    // $ANTLR end "distance"

    public static class distanceValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceValue"
    // flips.g:327:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue211 = null;

        flipsParser.distanceUnit_return distanceUnit212 = null;



        try {
            // flips.g:328:2: ( numericValue distanceUnit )
            // flips.g:328:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1792);
            numericValue211=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue211.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1794);
            distanceUnit212=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit212.getTree());

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
        return retval;
    }
    // $ANTLR end "distanceValue"

    public static class distanceUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceUnit"
    // flips.g:331:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'cm' | 'centimeter' | 'centimeters' ) -> CENTIMETER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'f' | 'fur' | 'furlong' | 'furlongs' ) -> FURLONG | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT | ( 'in' | 'inch' | 'inches' ) -> INCH );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal213=null;
        Token string_literal214=null;
        Token string_literal215=null;
        Token char_literal216=null;
        Token string_literal217=null;
        Token string_literal218=null;
        Token string_literal219=null;
        Token string_literal220=null;
        Token string_literal221=null;
        Token string_literal222=null;
        Token string_literal223=null;
        Token string_literal224=null;
        Token string_literal225=null;
        Token string_literal226=null;
        Token string_literal227=null;
        Token string_literal228=null;
        Token string_literal229=null;
        Token string_literal230=null;
        Token char_literal231=null;
        Token string_literal232=null;
        Token string_literal233=null;
        Token string_literal234=null;
        Token string_literal235=null;
        Token string_literal236=null;
        Token string_literal237=null;
        Token string_literal238=null;
        Token string_literal239=null;
        Token string_literal240=null;
        Token string_literal241=null;
        Token string_literal242=null;
        Token string_literal243=null;

        CommonTree string_literal213_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree string_literal215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree string_literal217_tree=null;
        CommonTree string_literal218_tree=null;
        CommonTree string_literal219_tree=null;
        CommonTree string_literal220_tree=null;
        CommonTree string_literal221_tree=null;
        CommonTree string_literal222_tree=null;
        CommonTree string_literal223_tree=null;
        CommonTree string_literal224_tree=null;
        CommonTree string_literal225_tree=null;
        CommonTree string_literal226_tree=null;
        CommonTree string_literal227_tree=null;
        CommonTree string_literal228_tree=null;
        CommonTree string_literal229_tree=null;
        CommonTree string_literal230_tree=null;
        CommonTree char_literal231_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree string_literal233_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree string_literal236_tree=null;
        CommonTree string_literal237_tree=null;
        CommonTree string_literal238_tree=null;
        CommonTree string_literal239_tree=null;
        CommonTree string_literal240_tree=null;
        CommonTree string_literal241_tree=null;
        CommonTree string_literal242_tree=null;
        CommonTree string_literal243_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");

        try {
            // flips.g:332:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'cm' | 'centimeter' | 'centimeters' ) -> CENTIMETER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'f' | 'fur' | 'furlong' | 'furlongs' ) -> FURLONG | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT | ( 'in' | 'inch' | 'inches' ) -> INCH )
            int alt94=9;
            switch ( input.LA(1) ) {
            case 169:
            case 170:
            case 171:
                {
                alt94=1;
                }
                break;
            case 172:
            case 173:
            case 174:
                {
                alt94=2;
                }
                break;
            case 175:
            case 176:
            case 177:
                {
                alt94=3;
                }
                break;
            case 178:
            case 179:
                {
                alt94=4;
                }
                break;
            case 180:
            case 181:
            case 182:
            case 183:
                {
                alt94=5;
                }
                break;
            case 184:
            case 185:
            case 186:
            case 187:
                {
                alt94=6;
                }
                break;
            case 188:
            case 189:
            case 190:
                {
                alt94=7;
                }
                break;
            case 191:
            case 192:
            case 193:
                {
                alt94=8;
                }
                break;
            case 167:
            case 194:
            case 195:
                {
                alt94=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // flips.g:332:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // flips.g:332:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case 169:
                        {
                        alt83=1;
                        }
                        break;
                    case 170:
                        {
                        alt83=2;
                        }
                        break;
                    case 171:
                        {
                        alt83=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // flips.g:332:5: 'km'
                            {
                            string_literal213=(Token)match(input,169,FOLLOW_169_in_distanceUnit1806);  
                            stream_169.add(string_literal213);


                            }
                            break;
                        case 2 :
                            // flips.g:332:10: 'kilometer'
                            {
                            string_literal214=(Token)match(input,170,FOLLOW_170_in_distanceUnit1808);  
                            stream_170.add(string_literal214);


                            }
                            break;
                        case 3 :
                            // flips.g:332:22: 'kilometers'
                            {
                            string_literal215=(Token)match(input,171,FOLLOW_171_in_distanceUnit1810);  
                            stream_171.add(string_literal215);


                            }
                            break;

                    }



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
                    // 333:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:334:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // flips.g:334:4: ( 'm' | 'meter' | 'meters' )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case 172:
                        {
                        alt84=1;
                        }
                        break;
                    case 173:
                        {
                        alt84=2;
                        }
                        break;
                    case 174:
                        {
                        alt84=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }

                    switch (alt84) {
                        case 1 :
                            // flips.g:334:5: 'm'
                            {
                            char_literal216=(Token)match(input,172,FOLLOW_172_in_distanceUnit1822);  
                            stream_172.add(char_literal216);


                            }
                            break;
                        case 2 :
                            // flips.g:334:9: 'meter'
                            {
                            string_literal217=(Token)match(input,173,FOLLOW_173_in_distanceUnit1824);  
                            stream_173.add(string_literal217);


                            }
                            break;
                        case 3 :
                            // flips.g:334:17: 'meters'
                            {
                            string_literal218=(Token)match(input,174,FOLLOW_174_in_distanceUnit1826);  
                            stream_174.add(string_literal218);


                            }
                            break;

                    }



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
                    // 335:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:336:4: ( 'cm' | 'centimeter' | 'centimeters' )
                    {
                    // flips.g:336:4: ( 'cm' | 'centimeter' | 'centimeters' )
                    int alt85=3;
                    switch ( input.LA(1) ) {
                    case 175:
                        {
                        alt85=1;
                        }
                        break;
                    case 176:
                        {
                        alt85=2;
                        }
                        break;
                    case 177:
                        {
                        alt85=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }

                    switch (alt85) {
                        case 1 :
                            // flips.g:336:5: 'cm'
                            {
                            string_literal219=(Token)match(input,175,FOLLOW_175_in_distanceUnit1838);  
                            stream_175.add(string_literal219);


                            }
                            break;
                        case 2 :
                            // flips.g:336:10: 'centimeter'
                            {
                            string_literal220=(Token)match(input,176,FOLLOW_176_in_distanceUnit1840);  
                            stream_176.add(string_literal220);


                            }
                            break;
                        case 3 :
                            // flips.g:336:23: 'centimeters'
                            {
                            string_literal221=(Token)match(input,177,FOLLOW_177_in_distanceUnit1842);  
                            stream_177.add(string_literal221);


                            }
                            break;

                    }



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
                    // 337:2: -> CENTIMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CENTIMETER, "CENTIMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:338:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // flips.g:338:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==178) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==179) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // flips.g:338:5: 'nm'
                            {
                            string_literal222=(Token)match(input,178,FOLLOW_178_in_distanceUnit1854);  
                            stream_178.add(string_literal222);


                            }
                            break;
                        case 2 :
                            // flips.g:338:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal223=(Token)match(input,179,FOLLOW_179_in_distanceUnit1856);  
                            stream_179.add(string_literal223);

                            // flips.g:338:21: ( 'mi' | 'mile' | 'miles' )
                            int alt86=3;
                            switch ( input.LA(1) ) {
                            case 180:
                                {
                                alt86=1;
                                }
                                break;
                            case 181:
                                {
                                alt86=2;
                                }
                                break;
                            case 182:
                                {
                                alt86=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 86, 0, input);

                                throw nvae;
                            }

                            switch (alt86) {
                                case 1 :
                                    // flips.g:338:22: 'mi'
                                    {
                                    string_literal224=(Token)match(input,180,FOLLOW_180_in_distanceUnit1859);  
                                    stream_180.add(string_literal224);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:338:27: 'mile'
                                    {
                                    string_literal225=(Token)match(input,181,FOLLOW_181_in_distanceUnit1861);  
                                    stream_181.add(string_literal225);


                                    }
                                    break;
                                case 3 :
                                    // flips.g:338:34: 'miles'
                                    {
                                    string_literal226=(Token)match(input,182,FOLLOW_182_in_distanceUnit1863);  
                                    stream_182.add(string_literal226);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



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
                    // 339:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:340:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // flips.g:340:4: ( 'statute' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==183) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // flips.g:340:5: 'statute'
                            {
                            string_literal227=(Token)match(input,183,FOLLOW_183_in_distanceUnit1878);  
                            stream_183.add(string_literal227);


                            }
                            break;

                    }

                    // flips.g:340:17: ( 'mi' | 'mile' | 'miles' )
                    int alt89=3;
                    switch ( input.LA(1) ) {
                    case 180:
                        {
                        alt89=1;
                        }
                        break;
                    case 181:
                        {
                        alt89=2;
                        }
                        break;
                    case 182:
                        {
                        alt89=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }

                    switch (alt89) {
                        case 1 :
                            // flips.g:340:18: 'mi'
                            {
                            string_literal228=(Token)match(input,180,FOLLOW_180_in_distanceUnit1883);  
                            stream_180.add(string_literal228);


                            }
                            break;
                        case 2 :
                            // flips.g:340:23: 'mile'
                            {
                            string_literal229=(Token)match(input,181,FOLLOW_181_in_distanceUnit1885);  
                            stream_181.add(string_literal229);


                            }
                            break;
                        case 3 :
                            // flips.g:340:30: 'miles'
                            {
                            string_literal230=(Token)match(input,182,FOLLOW_182_in_distanceUnit1887);  
                            stream_182.add(string_literal230);


                            }
                            break;

                    }



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
                    // 341:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:342:4: ( 'f' | 'fur' | 'furlong' | 'furlongs' )
                    {
                    // flips.g:342:4: ( 'f' | 'fur' | 'furlong' | 'furlongs' )
                    int alt90=4;
                    switch ( input.LA(1) ) {
                    case 184:
                        {
                        alt90=1;
                        }
                        break;
                    case 185:
                        {
                        alt90=2;
                        }
                        break;
                    case 186:
                        {
                        alt90=3;
                        }
                        break;
                    case 187:
                        {
                        alt90=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }

                    switch (alt90) {
                        case 1 :
                            // flips.g:342:5: 'f'
                            {
                            char_literal231=(Token)match(input,184,FOLLOW_184_in_distanceUnit1899);  
                            stream_184.add(char_literal231);


                            }
                            break;
                        case 2 :
                            // flips.g:342:9: 'fur'
                            {
                            string_literal232=(Token)match(input,185,FOLLOW_185_in_distanceUnit1901);  
                            stream_185.add(string_literal232);


                            }
                            break;
                        case 3 :
                            // flips.g:342:15: 'furlong'
                            {
                            string_literal233=(Token)match(input,186,FOLLOW_186_in_distanceUnit1903);  
                            stream_186.add(string_literal233);


                            }
                            break;
                        case 4 :
                            // flips.g:342:25: 'furlongs'
                            {
                            string_literal234=(Token)match(input,187,FOLLOW_187_in_distanceUnit1905);  
                            stream_187.add(string_literal234);


                            }
                            break;

                    }



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
                    // 343:2: -> FURLONG
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FURLONG, "FURLONG"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:344:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // flips.g:344:4: ( 'yd' | 'yard' | 'yards' )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case 188:
                        {
                        alt91=1;
                        }
                        break;
                    case 189:
                        {
                        alt91=2;
                        }
                        break;
                    case 190:
                        {
                        alt91=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }

                    switch (alt91) {
                        case 1 :
                            // flips.g:344:5: 'yd'
                            {
                            string_literal235=(Token)match(input,188,FOLLOW_188_in_distanceUnit1917);  
                            stream_188.add(string_literal235);


                            }
                            break;
                        case 2 :
                            // flips.g:344:10: 'yard'
                            {
                            string_literal236=(Token)match(input,189,FOLLOW_189_in_distanceUnit1919);  
                            stream_189.add(string_literal236);


                            }
                            break;
                        case 3 :
                            // flips.g:344:17: 'yards'
                            {
                            string_literal237=(Token)match(input,190,FOLLOW_190_in_distanceUnit1921);  
                            stream_190.add(string_literal237);


                            }
                            break;

                    }



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
                    // 345:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // flips.g:346:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // flips.g:346:4: ( 'ft' | 'foot' | 'feet' )
                    int alt92=3;
                    switch ( input.LA(1) ) {
                    case 191:
                        {
                        alt92=1;
                        }
                        break;
                    case 192:
                        {
                        alt92=2;
                        }
                        break;
                    case 193:
                        {
                        alt92=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }

                    switch (alt92) {
                        case 1 :
                            // flips.g:346:5: 'ft'
                            {
                            string_literal238=(Token)match(input,191,FOLLOW_191_in_distanceUnit1933);  
                            stream_191.add(string_literal238);


                            }
                            break;
                        case 2 :
                            // flips.g:346:10: 'foot'
                            {
                            string_literal239=(Token)match(input,192,FOLLOW_192_in_distanceUnit1935);  
                            stream_192.add(string_literal239);


                            }
                            break;
                        case 3 :
                            // flips.g:346:17: 'feet'
                            {
                            string_literal240=(Token)match(input,193,FOLLOW_193_in_distanceUnit1937);  
                            stream_193.add(string_literal240);


                            }
                            break;

                    }



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
                    // 347:2: -> FOOT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // flips.g:348:4: ( 'in' | 'inch' | 'inches' )
                    {
                    // flips.g:348:4: ( 'in' | 'inch' | 'inches' )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case 167:
                        {
                        alt93=1;
                        }
                        break;
                    case 194:
                        {
                        alt93=2;
                        }
                        break;
                    case 195:
                        {
                        alt93=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }

                    switch (alt93) {
                        case 1 :
                            // flips.g:348:5: 'in'
                            {
                            string_literal241=(Token)match(input,167,FOLLOW_167_in_distanceUnit1949);  
                            stream_167.add(string_literal241);


                            }
                            break;
                        case 2 :
                            // flips.g:348:10: 'inch'
                            {
                            string_literal242=(Token)match(input,194,FOLLOW_194_in_distanceUnit1951);  
                            stream_194.add(string_literal242);


                            }
                            break;
                        case 3 :
                            // flips.g:348:17: 'inches'
                            {
                            string_literal243=(Token)match(input,195,FOLLOW_195_in_distanceUnit1953);  
                            stream_195.add(string_literal243);


                            }
                            break;

                    }



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
                    // 349:2: -> INCH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INCH, "INCH"));

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
        return retval;
    }
    // $ANTLR end "distanceUnit"

    public static class speed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speed"
    // flips.g:354:1: speed : ( fixedSpeed | relativeSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed244 = null;

        flipsParser.relativeSpeed_return relativeSpeed245 = null;

        flipsParser.throttleSpeed_return throttleSpeed246 = null;



        try {
            // flips.g:355:2: ( fixedSpeed | relativeSpeed | throttleSpeed )
            int alt95=3;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // flips.g:355:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1972);
                    fixedSpeed244=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed244.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:356:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1977);
                    relativeSpeed245=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed245.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:357:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1982);
                    throttleSpeed246=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed246.getTree());

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
        return retval;
    }
    // $ANTLR end "speed"

    public static class fixedSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedSpeed"
    // flips.g:360:1: fixedSpeed : ( At )? speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At247=null;
        flipsParser.speedValue_return speedValue248 = null;


        CommonTree At247_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // flips.g:361:2: ( ( At )? speedValue -> ^( SPEED FIXED speedValue ) )
            // flips.g:361:4: ( At )? speedValue
            {
            // flips.g:361:4: ( At )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==At) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // flips.g:361:4: At
                    {
                    At247=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1993);  
                    stream_At.add(At247);


                    }
                    break;

            }

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1996);
            speedValue248=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue248.getTree());


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
            // 362:2: -> ^( SPEED FIXED speedValue )
            {
                // flips.g:362:5: ^( SPEED FIXED speedValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
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
        return retval;
    }
    // $ANTLR end "fixedSpeed"

    public static class relativeSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeSpeed"
    // flips.g:365:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal250=null;
        Token string_literal252=null;
        Token string_literal254=null;
        Token string_literal256=null;
        flipsParser.speedValue_return speedValue249 = null;

        flipsParser.speedValue_return speedValue251 = null;

        flipsParser.percentValue_return percentValue253 = null;

        flipsParser.percentValue_return percentValue255 = null;


        CommonTree string_literal250_tree=null;
        CommonTree string_literal252_tree=null;
        CommonTree string_literal254_tree=null;
        CommonTree string_literal256_tree=null;
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // flips.g:366:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt97=4;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // flips.g:366:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed2018);
                    speedValue249=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue249.getTree());
                    string_literal250=(Token)match(input,196,FOLLOW_196_in_relativeSpeed2020);  
                    stream_196.add(string_literal250);



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
                    // 367:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // flips.g:367:5: ^( SPEED RELATIVE FASTER speedValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FASTER, "FASTER"));
                        adaptor.addChild(root_1, stream_speedValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:368:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed2038);
                    speedValue251=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue251.getTree());
                    string_literal252=(Token)match(input,197,FOLLOW_197_in_relativeSpeed2040);  
                    stream_197.add(string_literal252);



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
                    // 369:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // flips.g:369:5: ^( SPEED RELATIVE SLOWER speedValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SLOWER, "SLOWER"));
                        adaptor.addChild(root_1, stream_speedValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:370:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed2058);
                    percentValue253=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue253.getTree());
                    string_literal254=(Token)match(input,196,FOLLOW_196_in_relativeSpeed2060);  
                    stream_196.add(string_literal254);



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
                    // 371:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // flips.g:371:5: ^( SPEED RELATIVE FASTER percentValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FASTER, "FASTER"));
                        adaptor.addChild(root_1, stream_percentValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:372:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed2078);
                    percentValue255=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue255.getTree());
                    string_literal256=(Token)match(input,197,FOLLOW_197_in_relativeSpeed2080);  
                    stream_197.add(string_literal256);



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
                    // 373:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // flips.g:373:5: ^( SPEED RELATIVE SLOWER percentValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SLOWER, "SLOWER"));
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
        return retval;
    }
    // $ANTLR end "relativeSpeed"

    public static class speedValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speedValue"
    // flips.g:376:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue257 = null;

        flipsParser.speedUnit_return speedUnit258 = null;



        try {
            // flips.g:377:2: ( numericValue speedUnit )
            // flips.g:377:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue2104);
            numericValue257=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue257.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue2106);
            speedUnit258=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit258.getTree());

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
        return retval;
    }
    // $ANTLR end "speedValue"

    public static class speedUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speedUnit"
    // flips.g:380:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | 'fpf' -> FURLONG FORTNIGHT | 'fpm' -> FOOT MINUTE | 'fps' -> FOOT SECOND | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal259=null;
        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal262=null;
        Token string_literal263=null;
        Token string_literal264=null;
        Token string_literal265=null;
        Token string_literal266=null;
        Token string_literal267=null;
        Token string_literal268=null;
        Token char_literal270=null;
        Token string_literal271=null;
        flipsParser.distanceUnit_return distanceUnit269 = null;

        flipsParser.timeUnit_return timeUnit272 = null;


        CommonTree string_literal259_tree=null;
        CommonTree string_literal260_tree=null;
        CommonTree string_literal261_tree=null;
        CommonTree string_literal262_tree=null;
        CommonTree string_literal263_tree=null;
        CommonTree string_literal264_tree=null;
        CommonTree string_literal265_tree=null;
        CommonTree string_literal266_tree=null;
        CommonTree string_literal267_tree=null;
        CommonTree string_literal268_tree=null;
        CommonTree char_literal270_tree=null;
        CommonTree string_literal271_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // flips.g:381:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | 'fpf' -> FURLONG FORTNIGHT | 'fpm' -> FOOT MINUTE | 'fps' -> FOOT SECOND | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt100=7;
            switch ( input.LA(1) ) {
            case 198:
                {
                alt100=1;
                }
                break;
            case 199:
                {
                alt100=2;
                }
                break;
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
                {
                alt100=3;
                }
                break;
            case 205:
                {
                alt100=4;
                }
                break;
            case 206:
                {
                alt100=5;
                }
                break;
            case 207:
                {
                alt100=6;
                }
                break;
            case 167:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
                {
                alt100=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // flips.g:381:4: 'kph'
                    {
                    string_literal259=(Token)match(input,198,FOLLOW_198_in_speedUnit2117);  
                    stream_198.add(string_literal259);



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
                    // 382:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:383:4: 'mph'
                    {
                    string_literal260=(Token)match(input,199,FOLLOW_199_in_speedUnit2129);  
                    stream_199.add(string_literal260);



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
                    // 384:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:385:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // flips.g:385:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt98=5;
                    switch ( input.LA(1) ) {
                    case 200:
                        {
                        alt98=1;
                        }
                        break;
                    case 201:
                        {
                        alt98=2;
                        }
                        break;
                    case 202:
                        {
                        alt98=3;
                        }
                        break;
                    case 203:
                        {
                        alt98=4;
                        }
                        break;
                    case 204:
                        {
                        alt98=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }

                    switch (alt98) {
                        case 1 :
                            // flips.g:385:5: 'kn'
                            {
                            string_literal261=(Token)match(input,200,FOLLOW_200_in_speedUnit2142);  
                            stream_200.add(string_literal261);


                            }
                            break;
                        case 2 :
                            // flips.g:385:10: 'kt'
                            {
                            string_literal262=(Token)match(input,201,FOLLOW_201_in_speedUnit2144);  
                            stream_201.add(string_literal262);


                            }
                            break;
                        case 3 :
                            // flips.g:385:15: 'kts'
                            {
                            string_literal263=(Token)match(input,202,FOLLOW_202_in_speedUnit2146);  
                            stream_202.add(string_literal263);


                            }
                            break;
                        case 4 :
                            // flips.g:385:21: 'knot'
                            {
                            string_literal264=(Token)match(input,203,FOLLOW_203_in_speedUnit2148);  
                            stream_203.add(string_literal264);


                            }
                            break;
                        case 5 :
                            // flips.g:385:28: 'knots'
                            {
                            string_literal265=(Token)match(input,204,FOLLOW_204_in_speedUnit2150);  
                            stream_204.add(string_literal265);


                            }
                            break;

                    }



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
                    // 386:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:387:4: 'fpf'
                    {
                    string_literal266=(Token)match(input,205,FOLLOW_205_in_speedUnit2165);  
                    stream_205.add(string_literal266);



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
                    // 388:2: -> FURLONG FORTNIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FURLONG, "FURLONG"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FORTNIGHT, "FORTNIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:389:4: 'fpm'
                    {
                    string_literal267=(Token)match(input,206,FOLLOW_206_in_speedUnit2177);  
                    stream_206.add(string_literal267);



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
                    // 390:2: -> FOOT MINUTE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:391:4: 'fps'
                    {
                    string_literal268=(Token)match(input,207,FOLLOW_207_in_speedUnit2189);  
                    stream_207.add(string_literal268);



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
                    // 392:2: -> FOOT SECOND
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SECOND, "SECOND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:393:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit2201);
                    distanceUnit269=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit269.getTree());
                    // flips.g:393:17: ( '/' | 'per' )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==208) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==209) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // flips.g:393:18: '/'
                            {
                            char_literal270=(Token)match(input,208,FOLLOW_208_in_speedUnit2204);  
                            stream_208.add(char_literal270);


                            }
                            break;
                        case 2 :
                            // flips.g:393:22: 'per'
                            {
                            string_literal271=(Token)match(input,209,FOLLOW_209_in_speedUnit2206);  
                            stream_209.add(string_literal271);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit2209);
                    timeUnit272=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit272.getTree());


                    // AST REWRITE
                    // elements: distanceUnit, timeUnit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 394:2: -> distanceUnit timeUnit
                    {
                        adaptor.addChild(root_0, stream_distanceUnit.nextTree());
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
        return retval;
    }
    // $ANTLR end "speedUnit"

    public static class throttleSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleSpeed"
    // flips.g:397:1: throttleSpeed : ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At273=null;
        Token string_literal275=null;
        Token string_literal276=null;
        Token string_literal277=null;
        Token string_literal278=null;
        flipsParser.throttleValue_return throttleValue274 = null;


        CommonTree At273_tree=null;
        CommonTree string_literal275_tree=null;
        CommonTree string_literal276_tree=null;
        CommonTree string_literal277_tree=null;
        CommonTree string_literal278_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // flips.g:398:2: ( ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // flips.g:398:4: ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            // flips.g:398:4: ( At )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==At) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // flips.g:398:4: At
                    {
                    At273=(Token)match(input,At,FOLLOW_At_in_throttleSpeed2227);  
                    stream_At.add(At273);


                    }
                    break;

            }

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed2230);
            throttleValue274=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue274.getTree());
            // flips.g:398:22: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt102=4;
            switch ( input.LA(1) ) {
            case 210:
                {
                alt102=1;
                }
                break;
            case 211:
                {
                alt102=2;
                }
                break;
            case 212:
                {
                alt102=3;
                }
                break;
            case 213:
                {
                alt102=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // flips.g:398:23: 'pwr'
                    {
                    string_literal275=(Token)match(input,210,FOLLOW_210_in_throttleSpeed2233);  
                    stream_210.add(string_literal275);


                    }
                    break;
                case 2 :
                    // flips.g:398:29: 'power'
                    {
                    string_literal276=(Token)match(input,211,FOLLOW_211_in_throttleSpeed2235);  
                    stream_211.add(string_literal276);


                    }
                    break;
                case 3 :
                    // flips.g:398:37: 'thr'
                    {
                    string_literal277=(Token)match(input,212,FOLLOW_212_in_throttleSpeed2237);  
                    stream_212.add(string_literal277);


                    }
                    break;
                case 4 :
                    // flips.g:398:43: 'throttle'
                    {
                    string_literal278=(Token)match(input,213,FOLLOW_213_in_throttleSpeed2239);  
                    stream_213.add(string_literal278);


                    }
                    break;

            }



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
            // 399:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // flips.g:399:5: ^( SPEED THROTTLE throttleValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(THROTTLE, "THROTTLE"));
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
        return retval;
    }
    // $ANTLR end "throttleSpeed"

    public static class throttleValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleValue"
    // flips.g:402:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue279 = null;



        try {
            // flips.g:403:2: ( percentValue )
            // flips.g:403:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue2262);
            percentValue279=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue279.getTree());

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
        return retval;
    }
    // $ANTLR end "throttleValue"

    public static class time_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // flips.g:408:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At280=null;
        flipsParser.timeValue_return timeValue281 = null;


        CommonTree At280_tree=null;

        try {
            // flips.g:409:2: ( At timeValue )
            // flips.g:409:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At280=(Token)match(input,At,FOLLOW_At_in_time2275); 
            At280_tree = (CommonTree)adaptor.create(At280);
            adaptor.addChild(root_0, At280_tree);

            pushFollow(FOLLOW_timeValue_in_time2277);
            timeValue281=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue281.getTree());

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
        return retval;
    }
    // $ANTLR end "time"

    public static class timeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeValue"
    // flips.g:412:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal283=null;
        Token string_literal284=null;
        Token string_literal286=null;
        Token string_literal287=null;
        Token string_literal289=null;
        Token string_literal290=null;
        Token string_literal292=null;
        Token string_literal293=null;
        flipsParser.timeFormat_return timeFormat282 = null;

        flipsParser.integerValue_return integerValue285 = null;

        flipsParser.timeFormat_return timeFormat288 = null;

        flipsParser.integerValue_return integerValue291 = null;

        flipsParser.timeFormat_return timeFormat294 = null;


        CommonTree string_literal283_tree=null;
        CommonTree string_literal284_tree=null;
        CommonTree string_literal286_tree=null;
        CommonTree string_literal287_tree=null;
        CommonTree string_literal289_tree=null;
        CommonTree string_literal290_tree=null;
        CommonTree string_literal292_tree=null;
        CommonTree string_literal293_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // flips.g:413:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt107=5;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // flips.g:413:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2288);
                    timeFormat282=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat282.getTree());
                    // flips.g:413:15: ( 'am' | 'a.m.' )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==214) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==215) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // flips.g:413:16: 'am'
                            {
                            string_literal283=(Token)match(input,214,FOLLOW_214_in_timeValue2291);  
                            stream_214.add(string_literal283);


                            }
                            break;
                        case 2 :
                            // flips.g:413:21: 'a.m.'
                            {
                            string_literal284=(Token)match(input,215,FOLLOW_215_in_timeValue2293);  
                            stream_215.add(string_literal284);


                            }
                            break;

                    }



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
                    // 414:2: -> ^( TIME timeFormat AM )
                    {
                        // flips.g:414:5: ^( TIME timeFormat AM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(AM, "AM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:415:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2310);
                    integerValue285=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue285.getTree());
                    // flips.g:415:17: ( 'am' | 'a.m.' )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==214) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==215) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // flips.g:415:18: 'am'
                            {
                            string_literal286=(Token)match(input,214,FOLLOW_214_in_timeValue2313);  
                            stream_214.add(string_literal286);


                            }
                            break;
                        case 2 :
                            // flips.g:415:23: 'a.m.'
                            {
                            string_literal287=(Token)match(input,215,FOLLOW_215_in_timeValue2315);  
                            stream_215.add(string_literal287);


                            }
                            break;

                    }



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
                    // 416:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // flips.g:416:5: ^( TIME integerValue HOUR AM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_integerValue.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(AM, "AM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:417:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2334);
                    timeFormat288=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat288.getTree());
                    // flips.g:417:15: ( 'pm' | 'p.m.' )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==216) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==217) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // flips.g:417:16: 'pm'
                            {
                            string_literal289=(Token)match(input,216,FOLLOW_216_in_timeValue2337);  
                            stream_216.add(string_literal289);


                            }
                            break;
                        case 2 :
                            // flips.g:417:21: 'p.m.'
                            {
                            string_literal290=(Token)match(input,217,FOLLOW_217_in_timeValue2339);  
                            stream_217.add(string_literal290);


                            }
                            break;

                    }



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
                    // 418:2: -> ^( TIME timeFormat PM )
                    {
                        // flips.g:418:5: ^( TIME timeFormat PM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PM, "PM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:419:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2356);
                    integerValue291=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue291.getTree());
                    // flips.g:419:17: ( 'pm' | 'p.m.' )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==216) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==217) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // flips.g:419:18: 'pm'
                            {
                            string_literal292=(Token)match(input,216,FOLLOW_216_in_timeValue2359);  
                            stream_216.add(string_literal292);


                            }
                            break;
                        case 2 :
                            // flips.g:419:23: 'p.m.'
                            {
                            string_literal293=(Token)match(input,217,FOLLOW_217_in_timeValue2361);  
                            stream_217.add(string_literal293);


                            }
                            break;

                    }



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
                    // 420:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // flips.g:420:5: ^( TIME integerValue HOUR PM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_integerValue.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PM, "PM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:421:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2380);
                    timeFormat294=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat294.getTree());


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
                    // 422:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // flips.g:422:5: ^( TIME timeFormat HOUR24 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
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
        return retval;
    }
    // $ANTLR end "timeValue"

    public static class timeFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeFormat"
    // flips.g:425:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal295=null;
        Token char_literal296=null;
        Token char_literal297=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal295_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree char_literal297_tree=null;
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:426:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( ((LA108_0>=BinaryLiteral && LA108_0<=HexLiteral)) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==218) ) {
                    int LA108_2 = input.LA(3);

                    if ( ((LA108_2>=BinaryLiteral && LA108_2<=HexLiteral)) ) {
                        int LA108_3 = input.LA(4);

                        if ( (LA108_3==EOF||(LA108_3>=Identifier && LA108_3<=At)||LA108_3==With||(LA108_3>=Turning && LA108_3<=HexLiteral)||(LA108_3>=113 && LA108_3<=114)||(LA108_3>=117 && LA108_3<=120)||(LA108_3>=130 && LA108_3<=133)||(LA108_3>=136 && LA108_3<=141)||(LA108_3>=143 && LA108_3<=144)||LA108_3==146||(LA108_3>=167 && LA108_3<=168)||(LA108_3>=214 && LA108_3<=217)||LA108_3==230||LA108_3==245||(LA108_3>=250 && LA108_3<=301)) ) {
                            alt108=1;
                        }
                        else if ( (LA108_3==218) ) {
                            alt108=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 108, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // flips.g:426:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2404);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal295=(Token)match(input,218,FOLLOW_218_in_timeFormat2406);  
                    stream_218.add(char_literal295);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2410);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());


                    // AST REWRITE
                    // elements: min, hr
                    // token labels: 
                    // rule labels: hr, min, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 427:2: -> $hr HOUR $min MINUTE
                    {
                        adaptor.addChild(root_0, stream_hr.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_0, stream_min.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:428:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2430);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal296=(Token)match(input,218,FOLLOW_218_in_timeFormat2432);  
                    stream_218.add(char_literal296);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2436);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal297=(Token)match(input,218,FOLLOW_218_in_timeFormat2438);  
                    stream_218.add(char_literal297);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2442);
                    s=numericValue();

                    state._fsp--;

                    stream_numericValue.add(s.getTree());


                    // AST REWRITE
                    // elements: min, hr, s
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
                    // 429:2: -> $hr HOUR $min MINUTE $s SECOND
                    {
                        adaptor.addChild(root_0, stream_hr.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_0, stream_min.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));
                        adaptor.addChild(root_0, stream_s.nextTree());
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
        return retval;
    }
    // $ANTLR end "timeFormat"

    public static class timeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeUnit"
    // flips.g:432:1: timeUnit : ( ( 'y' | 'yr' | 'yrs' | 'year' | 'years' ) -> YEAR | ( 'f' | 'fortnight' | 'fortnights' ) -> FORTNIGHT | ( 'wk' | 'wks' | 'week' | 'weeks' ) -> WEEK | ( 'd' | 'day' | 'days' ) -> DAY | hour | minute | second | ( 'ms' | 'millisecond' | 'milliseconds' ) -> MILLISECOND );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal298=null;
        Token string_literal299=null;
        Token string_literal300=null;
        Token string_literal301=null;
        Token string_literal302=null;
        Token char_literal303=null;
        Token string_literal304=null;
        Token string_literal305=null;
        Token string_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token char_literal310=null;
        Token string_literal311=null;
        Token string_literal312=null;
        Token string_literal316=null;
        Token string_literal317=null;
        Token string_literal318=null;
        flipsParser.hour_return hour313 = null;

        flipsParser.minute_return minute314 = null;

        flipsParser.second_return second315 = null;


        CommonTree char_literal298_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree string_literal301_tree=null;
        CommonTree string_literal302_tree=null;
        CommonTree char_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");

        try {
            // flips.g:433:2: ( ( 'y' | 'yr' | 'yrs' | 'year' | 'years' ) -> YEAR | ( 'f' | 'fortnight' | 'fortnights' ) -> FORTNIGHT | ( 'wk' | 'wks' | 'week' | 'weeks' ) -> WEEK | ( 'd' | 'day' | 'days' ) -> DAY | hour | minute | second | ( 'ms' | 'millisecond' | 'milliseconds' ) -> MILLISECOND )
            int alt114=8;
            switch ( input.LA(1) ) {
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
                {
                alt114=1;
                }
                break;
            case 184:
            case 224:
            case 225:
                {
                alt114=2;
                }
                break;
            case 226:
            case 227:
            case 228:
            case 229:
                {
                alt114=3;
                }
                break;
            case 230:
            case 231:
            case 232:
                {
                alt114=4;
                }
                break;
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
                {
                alt114=5;
                }
                break;
            case 241:
            case 242:
            case 243:
            case 244:
                {
                alt114=6;
                }
                break;
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
                {
                alt114=7;
                }
                break;
            case 233:
            case 234:
            case 235:
                {
                alt114=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // flips.g:433:4: ( 'y' | 'yr' | 'yrs' | 'year' | 'years' )
                    {
                    // flips.g:433:4: ( 'y' | 'yr' | 'yrs' | 'year' | 'years' )
                    int alt109=5;
                    switch ( input.LA(1) ) {
                    case 219:
                        {
                        alt109=1;
                        }
                        break;
                    case 220:
                        {
                        alt109=2;
                        }
                        break;
                    case 221:
                        {
                        alt109=3;
                        }
                        break;
                    case 222:
                        {
                        alt109=4;
                        }
                        break;
                    case 223:
                        {
                        alt109=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }

                    switch (alt109) {
                        case 1 :
                            // flips.g:433:5: 'y'
                            {
                            char_literal298=(Token)match(input,219,FOLLOW_219_in_timeUnit2473);  
                            stream_219.add(char_literal298);


                            }
                            break;
                        case 2 :
                            // flips.g:433:9: 'yr'
                            {
                            string_literal299=(Token)match(input,220,FOLLOW_220_in_timeUnit2475);  
                            stream_220.add(string_literal299);


                            }
                            break;
                        case 3 :
                            // flips.g:433:14: 'yrs'
                            {
                            string_literal300=(Token)match(input,221,FOLLOW_221_in_timeUnit2477);  
                            stream_221.add(string_literal300);


                            }
                            break;
                        case 4 :
                            // flips.g:433:20: 'year'
                            {
                            string_literal301=(Token)match(input,222,FOLLOW_222_in_timeUnit2479);  
                            stream_222.add(string_literal301);


                            }
                            break;
                        case 5 :
                            // flips.g:433:27: 'years'
                            {
                            string_literal302=(Token)match(input,223,FOLLOW_223_in_timeUnit2481);  
                            stream_223.add(string_literal302);


                            }
                            break;

                    }



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
                    // 434:2: -> YEAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YEAR, "YEAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:435:4: ( 'f' | 'fortnight' | 'fortnights' )
                    {
                    // flips.g:435:4: ( 'f' | 'fortnight' | 'fortnights' )
                    int alt110=3;
                    switch ( input.LA(1) ) {
                    case 184:
                        {
                        alt110=1;
                        }
                        break;
                    case 224:
                        {
                        alt110=2;
                        }
                        break;
                    case 225:
                        {
                        alt110=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }

                    switch (alt110) {
                        case 1 :
                            // flips.g:435:5: 'f'
                            {
                            char_literal303=(Token)match(input,184,FOLLOW_184_in_timeUnit2493);  
                            stream_184.add(char_literal303);


                            }
                            break;
                        case 2 :
                            // flips.g:435:9: 'fortnight'
                            {
                            string_literal304=(Token)match(input,224,FOLLOW_224_in_timeUnit2495);  
                            stream_224.add(string_literal304);


                            }
                            break;
                        case 3 :
                            // flips.g:435:21: 'fortnights'
                            {
                            string_literal305=(Token)match(input,225,FOLLOW_225_in_timeUnit2497);  
                            stream_225.add(string_literal305);


                            }
                            break;

                    }



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
                    // 436:2: -> FORTNIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FORTNIGHT, "FORTNIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:437:4: ( 'wk' | 'wks' | 'week' | 'weeks' )
                    {
                    // flips.g:437:4: ( 'wk' | 'wks' | 'week' | 'weeks' )
                    int alt111=4;
                    switch ( input.LA(1) ) {
                    case 226:
                        {
                        alt111=1;
                        }
                        break;
                    case 227:
                        {
                        alt111=2;
                        }
                        break;
                    case 228:
                        {
                        alt111=3;
                        }
                        break;
                    case 229:
                        {
                        alt111=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }

                    switch (alt111) {
                        case 1 :
                            // flips.g:437:5: 'wk'
                            {
                            string_literal306=(Token)match(input,226,FOLLOW_226_in_timeUnit2509);  
                            stream_226.add(string_literal306);


                            }
                            break;
                        case 2 :
                            // flips.g:437:10: 'wks'
                            {
                            string_literal307=(Token)match(input,227,FOLLOW_227_in_timeUnit2511);  
                            stream_227.add(string_literal307);


                            }
                            break;
                        case 3 :
                            // flips.g:437:16: 'week'
                            {
                            string_literal308=(Token)match(input,228,FOLLOW_228_in_timeUnit2513);  
                            stream_228.add(string_literal308);


                            }
                            break;
                        case 4 :
                            // flips.g:437:23: 'weeks'
                            {
                            string_literal309=(Token)match(input,229,FOLLOW_229_in_timeUnit2515);  
                            stream_229.add(string_literal309);


                            }
                            break;

                    }



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
                    // 438:2: -> WEEK
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEEK, "WEEK"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:439:4: ( 'd' | 'day' | 'days' )
                    {
                    // flips.g:439:4: ( 'd' | 'day' | 'days' )
                    int alt112=3;
                    switch ( input.LA(1) ) {
                    case 230:
                        {
                        alt112=1;
                        }
                        break;
                    case 231:
                        {
                        alt112=2;
                        }
                        break;
                    case 232:
                        {
                        alt112=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }

                    switch (alt112) {
                        case 1 :
                            // flips.g:439:5: 'd'
                            {
                            char_literal310=(Token)match(input,230,FOLLOW_230_in_timeUnit2527);  
                            stream_230.add(char_literal310);


                            }
                            break;
                        case 2 :
                            // flips.g:439:9: 'day'
                            {
                            string_literal311=(Token)match(input,231,FOLLOW_231_in_timeUnit2529);  
                            stream_231.add(string_literal311);


                            }
                            break;
                        case 3 :
                            // flips.g:439:15: 'days'
                            {
                            string_literal312=(Token)match(input,232,FOLLOW_232_in_timeUnit2531);  
                            stream_232.add(string_literal312);


                            }
                            break;

                    }



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
                    // 440:2: -> DAY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DAY, "DAY"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:441:4: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2542);
                    hour313=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour313.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:442:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2547);
                    minute314=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute314.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:443:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2552);
                    second315=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second315.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:444:4: ( 'ms' | 'millisecond' | 'milliseconds' )
                    {
                    // flips.g:444:4: ( 'ms' | 'millisecond' | 'milliseconds' )
                    int alt113=3;
                    switch ( input.LA(1) ) {
                    case 233:
                        {
                        alt113=1;
                        }
                        break;
                    case 234:
                        {
                        alt113=2;
                        }
                        break;
                    case 235:
                        {
                        alt113=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }

                    switch (alt113) {
                        case 1 :
                            // flips.g:444:5: 'ms'
                            {
                            string_literal316=(Token)match(input,233,FOLLOW_233_in_timeUnit2558);  
                            stream_233.add(string_literal316);


                            }
                            break;
                        case 2 :
                            // flips.g:444:10: 'millisecond'
                            {
                            string_literal317=(Token)match(input,234,FOLLOW_234_in_timeUnit2560);  
                            stream_234.add(string_literal317);


                            }
                            break;
                        case 3 :
                            // flips.g:444:24: 'milliseconds'
                            {
                            string_literal318=(Token)match(input,235,FOLLOW_235_in_timeUnit2562);  
                            stream_235.add(string_literal318);


                            }
                            break;

                    }



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
                    // 445:2: -> MILLISECOND
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLISECOND, "MILLISECOND"));

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
        return retval;
    }
    // $ANTLR end "timeUnit"

    public static class hour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hour"
    // flips.g:448:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal319=null;
        Token string_literal320=null;
        Token string_literal321=null;
        Token string_literal322=null;
        Token string_literal323=null;

        CommonTree char_literal319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree string_literal321_tree=null;
        CommonTree string_literal322_tree=null;
        CommonTree string_literal323_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try {
            // flips.g:449:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // flips.g:449:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // flips.g:449:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 236:
                {
                alt115=1;
                }
                break;
            case 237:
                {
                alt115=2;
                }
                break;
            case 238:
                {
                alt115=3;
                }
                break;
            case 239:
                {
                alt115=4;
                }
                break;
            case 240:
                {
                alt115=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // flips.g:449:5: 'h'
                    {
                    char_literal319=(Token)match(input,236,FOLLOW_236_in_hour2580);  
                    stream_236.add(char_literal319);


                    }
                    break;
                case 2 :
                    // flips.g:449:9: 'hr'
                    {
                    string_literal320=(Token)match(input,237,FOLLOW_237_in_hour2582);  
                    stream_237.add(string_literal320);


                    }
                    break;
                case 3 :
                    // flips.g:449:14: 'hrs'
                    {
                    string_literal321=(Token)match(input,238,FOLLOW_238_in_hour2584);  
                    stream_238.add(string_literal321);


                    }
                    break;
                case 4 :
                    // flips.g:449:20: 'hour'
                    {
                    string_literal322=(Token)match(input,239,FOLLOW_239_in_hour2586);  
                    stream_239.add(string_literal322);


                    }
                    break;
                case 5 :
                    // flips.g:449:27: 'hours'
                    {
                    string_literal323=(Token)match(input,240,FOLLOW_240_in_hour2588);  
                    stream_240.add(string_literal323);


                    }
                    break;

            }



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
            // 450:2: -> HOUR
            {
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
        return retval;
    }
    // $ANTLR end "hour"

    public static class minute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minute"
    // flips.g:453:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal324=null;
        Token string_literal325=null;
        Token string_literal326=null;
        Token string_literal327=null;

        CommonTree string_literal324_tree=null;
        CommonTree string_literal325_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree string_literal327_tree=null;
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");

        try {
            // flips.g:454:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // flips.g:454:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // flips.g:454:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt116=4;
            switch ( input.LA(1) ) {
            case 241:
                {
                alt116=1;
                }
                break;
            case 242:
                {
                alt116=2;
                }
                break;
            case 243:
                {
                alt116=3;
                }
                break;
            case 244:
                {
                alt116=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // flips.g:454:5: 'min'
                    {
                    string_literal324=(Token)match(input,241,FOLLOW_241_in_minute2606);  
                    stream_241.add(string_literal324);


                    }
                    break;
                case 2 :
                    // flips.g:454:11: 'mins'
                    {
                    string_literal325=(Token)match(input,242,FOLLOW_242_in_minute2608);  
                    stream_242.add(string_literal325);


                    }
                    break;
                case 3 :
                    // flips.g:454:18: 'minute'
                    {
                    string_literal326=(Token)match(input,243,FOLLOW_243_in_minute2610);  
                    stream_243.add(string_literal326);


                    }
                    break;
                case 4 :
                    // flips.g:454:27: 'minutes'
                    {
                    string_literal327=(Token)match(input,244,FOLLOW_244_in_minute2612);  
                    stream_244.add(string_literal327);


                    }
                    break;

            }



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
            // 455:2: -> MINUTE
            {
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
        return retval;
    }
    // $ANTLR end "minute"

    public static class second_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "second"
    // flips.g:458:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal328=null;
        Token string_literal329=null;
        Token string_literal330=null;
        Token string_literal331=null;
        Token string_literal332=null;

        CommonTree char_literal328_tree=null;
        CommonTree string_literal329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree string_literal331_tree=null;
        CommonTree string_literal332_tree=null;
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");

        try {
            // flips.g:459:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // flips.g:459:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // flips.g:459:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt117=5;
            switch ( input.LA(1) ) {
            case 245:
                {
                alt117=1;
                }
                break;
            case 246:
                {
                alt117=2;
                }
                break;
            case 247:
                {
                alt117=3;
                }
                break;
            case 248:
                {
                alt117=4;
                }
                break;
            case 249:
                {
                alt117=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // flips.g:459:5: 's'
                    {
                    char_literal328=(Token)match(input,245,FOLLOW_245_in_second2630);  
                    stream_245.add(char_literal328);


                    }
                    break;
                case 2 :
                    // flips.g:459:9: 'sec'
                    {
                    string_literal329=(Token)match(input,246,FOLLOW_246_in_second2632);  
                    stream_246.add(string_literal329);


                    }
                    break;
                case 3 :
                    // flips.g:459:15: 'secs'
                    {
                    string_literal330=(Token)match(input,247,FOLLOW_247_in_second2634);  
                    stream_247.add(string_literal330);


                    }
                    break;
                case 4 :
                    // flips.g:459:22: 'second'
                    {
                    string_literal331=(Token)match(input,248,FOLLOW_248_in_second2636);  
                    stream_248.add(string_literal331);


                    }
                    break;
                case 5 :
                    // flips.g:459:31: 'seconds'
                    {
                    string_literal332=(Token)match(input,249,FOLLOW_249_in_second2638);  
                    stream_249.add(string_literal332);


                    }
                    break;

            }



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
            // 460:2: -> SECOND
            {
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
        return retval;
    }
    // $ANTLR end "second"

    public static class duration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "duration"
    // flips.g:463:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal333=null;
        flipsParser.durationValue_return durationValue334 = null;


        CommonTree string_literal333_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // flips.g:464:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // flips.g:464:4: 'for' durationValue
            {
            string_literal333=(Token)match(input,250,FOLLOW_250_in_duration2655);  
            stream_250.add(string_literal333);

            pushFollow(FOLLOW_durationValue_in_duration2657);
            durationValue334=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue334.getTree());


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
            // 465:2: -> ^( DURATION durationValue )
            {
                // flips.g:465:5: ^( DURATION durationValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DURATION, "DURATION"), root_1);

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
        return retval;
    }
    // $ANTLR end "duration"

    public static class durationValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durationValue"
    // flips.g:468:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue335 = null;

        flipsParser.timeUnit_return timeUnit336 = null;

        flipsParser.integerValue_return integerValue337 = null;

        flipsParser.hour_return hour338 = null;

        flipsParser.numericValue_return numericValue339 = null;

        flipsParser.minute_return minute340 = null;

        flipsParser.second_return second341 = null;

        flipsParser.integerValue_return integerValue342 = null;

        flipsParser.hour_return hour343 = null;

        flipsParser.integerValue_return integerValue344 = null;

        flipsParser.minute_return minute345 = null;

        flipsParser.numericValue_return numericValue346 = null;

        flipsParser.second_return second347 = null;

        flipsParser.integerValue_return integerValue348 = null;

        flipsParser.minute_return minute349 = null;

        flipsParser.numericValue_return numericValue350 = null;

        flipsParser.second_return second351 = null;

        flipsParser.timeFormat_return timeFormat352 = null;



        try {
            // flips.g:469:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt119=5;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // flips.g:469:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2677);
                    numericValue335=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue335.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2679);
                    timeUnit336=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit336.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:470:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2684);
                    integerValue337=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue337.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2686);
                    hour338=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour338.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2688);
                    numericValue339=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue339.getTree());
                    // flips.g:470:35: ( minute | second )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( ((LA118_0>=241 && LA118_0<=244)) ) {
                        alt118=1;
                    }
                    else if ( ((LA118_0>=245 && LA118_0<=249)) ) {
                        alt118=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // flips.g:470:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2691);
                            minute340=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute340.getTree());

                            }
                            break;
                        case 2 :
                            // flips.g:470:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2693);
                            second341=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second341.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // flips.g:471:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2699);
                    integerValue342=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue342.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2701);
                    hour343=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour343.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2703);
                    integerValue344=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue344.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2705);
                    minute345=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute345.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2707);
                    numericValue346=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue346.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2709);
                    second347=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second347.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:472:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2714);
                    integerValue348=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue348.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2716);
                    minute349=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute349.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2718);
                    numericValue350=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue350.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2720);
                    second351=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second351.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:473:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2725);
                    timeFormat352=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat352.getTree());

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
        return retval;
    }
    // $ANTLR end "durationValue"

    public static class direction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "direction"
    // flips.g:478:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection353 = null;

        flipsParser.relativeDirection_return relativeDirection354 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // flips.g:479:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt120=2;
            switch ( input.LA(1) ) {
            case 245:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
            case 266:
            case 267:
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 274:
            case 275:
            case 276:
            case 277:
            case 278:
            case 279:
            case 280:
            case 281:
                {
                alt120=1;
                }
                break;
            case Turning:
                {
                int LA120_2 = input.LA(2);

                if ( ((LA120_2>=292 && LA120_2<=297)) ) {
                    alt120=2;
                }
                else if ( ((LA120_2>=FloatingPointLiteral && LA120_2<=HexLiteral)||LA120_2==245||(LA120_2>=251 && LA120_2<=281)) ) {
                    alt120=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA120_3 = input.LA(2);

                if ( ((LA120_3>=FloatingPointLiteral && LA120_3<=HexLiteral)||LA120_3==245||(LA120_3>=251 && LA120_3<=281)) ) {
                    alt120=1;
                }
                else if ( ((LA120_3>=292 && LA120_3<=297)) ) {
                    alt120=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // flips.g:479:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2738);
                    fixedDirection353=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection353.getTree());


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
                    // 480:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // flips.g:480:5: ^( DIRECTION FIXED fixedDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                        adaptor.addChild(root_1, stream_fixedDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:481:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2754);
                    relativeDirection354=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection354.getTree());


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
                    // 482:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // flips.g:482:5: ^( DIRECTION RELATIVE relativeDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
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
        return retval;
    }
    // $ANTLR end "direction"

    public static class fixedDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedDirection"
    // flips.g:485:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning358=null;
        Token Heading359=null;
        flipsParser.cardinalDirection_return cardinalDirection355 = null;

        flipsParser.ordinalDirection_return ordinalDirection356 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection357 = null;

        flipsParser.cardinalDirection_return cardinalDirection360 = null;

        flipsParser.ordinalDirection_return ordinalDirection361 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection362 = null;

        flipsParser.angularValue_return angularValue363 = null;


        CommonTree Turning358_tree=null;
        CommonTree Heading359_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // flips.g:486:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt123=4;
            switch ( input.LA(1) ) {
            case 245:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
            case 256:
            case 257:
                {
                alt123=1;
                }
                break;
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
                {
                alt123=2;
                }
                break;
            case 266:
            case 267:
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 274:
            case 275:
            case 276:
            case 277:
            case 278:
            case 279:
            case 280:
            case 281:
                {
                alt123=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt123=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // flips.g:486:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2776);
                    cardinalDirection355=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection355.getTree());


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
                    // 487:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:488:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2786);
                    ordinalDirection356=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection356.getTree());


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
                    // 489:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:490:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2796);
                    subOrdinalDirection357=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection357.getTree());


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
                    // 491:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:492:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // flips.g:492:4: ( Turning | Heading )
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==Turning) ) {
                        alt121=1;
                    }
                    else if ( (LA121_0==Heading) ) {
                        alt121=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }
                    switch (alt121) {
                        case 1 :
                            // flips.g:492:5: Turning
                            {
                            Turning358=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2807);  
                            stream_Turning.add(Turning358);


                            }
                            break;
                        case 2 :
                            // flips.g:492:13: Heading
                            {
                            Heading359=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2809);  
                            stream_Heading.add(Heading359);


                            }
                            break;

                    }

                    // flips.g:492:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt122=4;
                    switch ( input.LA(1) ) {
                    case 245:
                    case 251:
                    case 252:
                    case 253:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                        {
                        alt122=1;
                        }
                        break;
                    case 258:
                    case 259:
                    case 260:
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                        {
                        alt122=2;
                        }
                        break;
                    case 266:
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                    case 272:
                    case 273:
                    case 274:
                    case 275:
                    case 276:
                    case 277:
                    case 278:
                    case 279:
                    case 280:
                    case 281:
                        {
                        alt122=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt122=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }

                    switch (alt122) {
                        case 1 :
                            // flips.g:492:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2813);
                            cardinalDirection360=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection360.getTree());

                            }
                            break;
                        case 2 :
                            // flips.g:492:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2815);
                            ordinalDirection361=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection361.getTree());

                            }
                            break;
                        case 3 :
                            // flips.g:492:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2817);
                            subOrdinalDirection362=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection362.getTree());

                            }
                            break;
                        case 4 :
                            // flips.g:492:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2819);
                            angularValue363=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue363.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: angularValue, subOrdinalDirection, cardinalDirection, ordinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 493:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // flips.g:493:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // flips.g:493:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // flips.g:493:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // flips.g:493:63: ( angularValue )?
                        if ( stream_angularValue.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "fixedDirection"

    public static class relativeDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeDirection"
    // flips.g:496:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning364=null;
        Token Heading365=null;
        flipsParser.leftRightDirection_return leftRightDirection366 = null;

        flipsParser.angularValue_return angularValue367 = null;


        CommonTree Turning364_tree=null;
        CommonTree Heading365_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // flips.g:497:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // flips.g:497:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // flips.g:497:4: ( Turning | Heading )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==Turning) ) {
                alt124=1;
            }
            else if ( (LA124_0==Heading) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // flips.g:497:5: Turning
                    {
                    Turning364=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2847);  
                    stream_Turning.add(Turning364);


                    }
                    break;
                case 2 :
                    // flips.g:497:13: Heading
                    {
                    Heading365=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2849);  
                    stream_Heading.add(Heading365);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2852);
            leftRightDirection366=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection366.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2854);
            angularValue367=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue367.getTree());


            // AST REWRITE
            // elements: angularValue, leftRightDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 498:2: -> leftRightDirection angularValue
            {
                adaptor.addChild(root_0, stream_leftRightDirection.nextTree());
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
        return retval;
    }
    // $ANTLR end "relativeDirection"

    public static class cardinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cardinalDirection"
    // flips.g:501:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection368 = null;

        flipsParser.eastWestDirection_return eastWestDirection369 = null;



        try {
            // flips.g:502:2: ( northSouthDirection | eastWestDirection )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==245||(LA125_0>=251 && LA125_0<=253)) ) {
                alt125=1;
            }
            else if ( ((LA125_0>=254 && LA125_0<=257)) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // flips.g:502:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2872);
                    northSouthDirection368=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection368.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:503:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2877);
                    eastWestDirection369=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection369.getTree());

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
        return retval;
    }
    // $ANTLR end "cardinalDirection"

    public static class northSouthDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "northSouthDirection"
    // flips.g:506:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal370=null;
        Token string_literal371=null;
        Token char_literal372=null;
        Token string_literal373=null;

        CommonTree char_literal370_tree=null;
        CommonTree string_literal371_tree=null;
        CommonTree char_literal372_tree=null;
        CommonTree string_literal373_tree=null;
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");

        try {
            // flips.g:507:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=251 && LA128_0<=252)) ) {
                alt128=1;
            }
            else if ( (LA128_0==245||LA128_0==253) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // flips.g:507:4: ( 'n' | 'north' )
                    {
                    // flips.g:507:4: ( 'n' | 'north' )
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==251) ) {
                        alt126=1;
                    }
                    else if ( (LA126_0==252) ) {
                        alt126=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }
                    switch (alt126) {
                        case 1 :
                            // flips.g:507:5: 'n'
                            {
                            char_literal370=(Token)match(input,251,FOLLOW_251_in_northSouthDirection2889);  
                            stream_251.add(char_literal370);


                            }
                            break;
                        case 2 :
                            // flips.g:507:9: 'north'
                            {
                            string_literal371=(Token)match(input,252,FOLLOW_252_in_northSouthDirection2891);  
                            stream_252.add(string_literal371);


                            }
                            break;

                    }



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
                    // 508:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:509:4: ( 's' | 'south' )
                    {
                    // flips.g:509:4: ( 's' | 'south' )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==245) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==253) ) {
                        alt127=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // flips.g:509:5: 's'
                            {
                            char_literal372=(Token)match(input,245,FOLLOW_245_in_northSouthDirection2903);  
                            stream_245.add(char_literal372);


                            }
                            break;
                        case 2 :
                            // flips.g:509:9: 'south'
                            {
                            string_literal373=(Token)match(input,253,FOLLOW_253_in_northSouthDirection2905);  
                            stream_253.add(string_literal373);


                            }
                            break;

                    }



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
                    // 510:2: -> SOUTH
                    {
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
        return retval;
    }
    // $ANTLR end "northSouthDirection"

    public static class eastWestDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eastWestDirection"
    // flips.g:513:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal374=null;
        Token string_literal375=null;
        Token char_literal376=null;
        Token string_literal377=null;

        CommonTree char_literal374_tree=null;
        CommonTree string_literal375_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree string_literal377_tree=null;
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // flips.g:514:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=254 && LA131_0<=255)) ) {
                alt131=1;
            }
            else if ( ((LA131_0>=256 && LA131_0<=257)) ) {
                alt131=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // flips.g:514:4: ( 'e' | 'east' )
                    {
                    // flips.g:514:4: ( 'e' | 'east' )
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==254) ) {
                        alt129=1;
                    }
                    else if ( (LA129_0==255) ) {
                        alt129=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // flips.g:514:5: 'e'
                            {
                            char_literal374=(Token)match(input,254,FOLLOW_254_in_eastWestDirection2923);  
                            stream_254.add(char_literal374);


                            }
                            break;
                        case 2 :
                            // flips.g:514:9: 'east'
                            {
                            string_literal375=(Token)match(input,255,FOLLOW_255_in_eastWestDirection2925);  
                            stream_255.add(string_literal375);


                            }
                            break;

                    }



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
                    // 515:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:516:4: ( 'w' | 'west' )
                    {
                    // flips.g:516:4: ( 'w' | 'west' )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==256) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==257) ) {
                        alt130=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }
                    switch (alt130) {
                        case 1 :
                            // flips.g:516:5: 'w'
                            {
                            char_literal376=(Token)match(input,256,FOLLOW_256_in_eastWestDirection2937);  
                            stream_256.add(char_literal376);


                            }
                            break;
                        case 2 :
                            // flips.g:516:9: 'west'
                            {
                            string_literal377=(Token)match(input,257,FOLLOW_257_in_eastWestDirection2939);  
                            stream_257.add(string_literal377);


                            }
                            break;

                    }



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
                    // 517:2: -> WEST
                    {
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
        return retval;
    }
    // $ANTLR end "eastWestDirection"

    public static class ordinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordinalDirection"
    // flips.g:520:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal378=null;
        Token string_literal379=null;
        Token string_literal380=null;
        Token string_literal381=null;
        Token string_literal382=null;
        Token string_literal383=null;
        Token string_literal384=null;
        Token string_literal385=null;

        CommonTree string_literal378_tree=null;
        CommonTree string_literal379_tree=null;
        CommonTree string_literal380_tree=null;
        CommonTree string_literal381_tree=null;
        CommonTree string_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        CommonTree string_literal384_tree=null;
        CommonTree string_literal385_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");

        try {
            // flips.g:521:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt136=4;
            switch ( input.LA(1) ) {
            case 258:
            case 259:
                {
                alt136=1;
                }
                break;
            case 260:
            case 261:
                {
                alt136=2;
                }
                break;
            case 262:
            case 263:
                {
                alt136=3;
                }
                break;
            case 264:
            case 265:
                {
                alt136=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // flips.g:521:4: ( 'ne' | 'northeast' )
                    {
                    // flips.g:521:4: ( 'ne' | 'northeast' )
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==258) ) {
                        alt132=1;
                    }
                    else if ( (LA132_0==259) ) {
                        alt132=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 0, input);

                        throw nvae;
                    }
                    switch (alt132) {
                        case 1 :
                            // flips.g:521:5: 'ne'
                            {
                            string_literal378=(Token)match(input,258,FOLLOW_258_in_ordinalDirection2957);  
                            stream_258.add(string_literal378);


                            }
                            break;
                        case 2 :
                            // flips.g:521:10: 'northeast'
                            {
                            string_literal379=(Token)match(input,259,FOLLOW_259_in_ordinalDirection2959);  
                            stream_259.add(string_literal379);


                            }
                            break;

                    }



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
                    // 522:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:523:4: ( 'se' | 'southeast' )
                    {
                    // flips.g:523:4: ( 'se' | 'southeast' )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==260) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==261) ) {
                        alt133=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // flips.g:523:5: 'se'
                            {
                            string_literal380=(Token)match(input,260,FOLLOW_260_in_ordinalDirection2973);  
                            stream_260.add(string_literal380);


                            }
                            break;
                        case 2 :
                            // flips.g:523:10: 'southeast'
                            {
                            string_literal381=(Token)match(input,261,FOLLOW_261_in_ordinalDirection2975);  
                            stream_261.add(string_literal381);


                            }
                            break;

                    }



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
                    // 524:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:525:4: ( 'sw' | 'southwest' )
                    {
                    // flips.g:525:4: ( 'sw' | 'southwest' )
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==262) ) {
                        alt134=1;
                    }
                    else if ( (LA134_0==263) ) {
                        alt134=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 134, 0, input);

                        throw nvae;
                    }
                    switch (alt134) {
                        case 1 :
                            // flips.g:525:5: 'sw'
                            {
                            string_literal382=(Token)match(input,262,FOLLOW_262_in_ordinalDirection2989);  
                            stream_262.add(string_literal382);


                            }
                            break;
                        case 2 :
                            // flips.g:525:10: 'southwest'
                            {
                            string_literal383=(Token)match(input,263,FOLLOW_263_in_ordinalDirection2991);  
                            stream_263.add(string_literal383);


                            }
                            break;

                    }



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
                    // 526:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:527:4: ( 'nw' | 'northwest' )
                    {
                    // flips.g:527:4: ( 'nw' | 'northwest' )
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==264) ) {
                        alt135=1;
                    }
                    else if ( (LA135_0==265) ) {
                        alt135=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }
                    switch (alt135) {
                        case 1 :
                            // flips.g:527:5: 'nw'
                            {
                            string_literal384=(Token)match(input,264,FOLLOW_264_in_ordinalDirection3005);  
                            stream_264.add(string_literal384);


                            }
                            break;
                        case 2 :
                            // flips.g:527:10: 'northwest'
                            {
                            string_literal385=(Token)match(input,265,FOLLOW_265_in_ordinalDirection3007);  
                            stream_265.add(string_literal385);


                            }
                            break;

                    }



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
                    // 528:2: -> NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
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
        return retval;
    }
    // $ANTLR end "ordinalDirection"

    public static class subOrdinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subOrdinalDirection"
    // flips.g:531:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal386=null;
        Token string_literal387=null;
        Token string_literal388=null;
        Token string_literal389=null;
        Token string_literal390=null;
        Token string_literal391=null;
        Token string_literal392=null;
        Token string_literal393=null;
        Token string_literal394=null;
        Token string_literal395=null;
        Token string_literal396=null;
        Token string_literal397=null;
        Token string_literal398=null;
        Token string_literal399=null;
        Token string_literal400=null;
        Token string_literal401=null;

        CommonTree string_literal386_tree=null;
        CommonTree string_literal387_tree=null;
        CommonTree string_literal388_tree=null;
        CommonTree string_literal389_tree=null;
        CommonTree string_literal390_tree=null;
        CommonTree string_literal391_tree=null;
        CommonTree string_literal392_tree=null;
        CommonTree string_literal393_tree=null;
        CommonTree string_literal394_tree=null;
        CommonTree string_literal395_tree=null;
        CommonTree string_literal396_tree=null;
        CommonTree string_literal397_tree=null;
        CommonTree string_literal398_tree=null;
        CommonTree string_literal399_tree=null;
        CommonTree string_literal400_tree=null;
        CommonTree string_literal401_tree=null;
        RewriteRuleTokenStream stream_281=new RewriteRuleTokenStream(adaptor,"token 281");
        RewriteRuleTokenStream stream_280=new RewriteRuleTokenStream(adaptor,"token 280");
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleTokenStream stream_274=new RewriteRuleTokenStream(adaptor,"token 274");
        RewriteRuleTokenStream stream_273=new RewriteRuleTokenStream(adaptor,"token 273");
        RewriteRuleTokenStream stream_275=new RewriteRuleTokenStream(adaptor,"token 275");
        RewriteRuleTokenStream stream_276=new RewriteRuleTokenStream(adaptor,"token 276");
        RewriteRuleTokenStream stream_277=new RewriteRuleTokenStream(adaptor,"token 277");
        RewriteRuleTokenStream stream_278=new RewriteRuleTokenStream(adaptor,"token 278");
        RewriteRuleTokenStream stream_279=new RewriteRuleTokenStream(adaptor,"token 279");
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");

        try {
            // flips.g:532:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt145=8;
            switch ( input.LA(1) ) {
            case 266:
            case 267:
                {
                alt145=1;
                }
                break;
            case 268:
            case 269:
                {
                alt145=2;
                }
                break;
            case 270:
            case 271:
                {
                alt145=3;
                }
                break;
            case 272:
            case 273:
                {
                alt145=4;
                }
                break;
            case 274:
            case 275:
                {
                alt145=5;
                }
                break;
            case 276:
            case 277:
                {
                alt145=6;
                }
                break;
            case 278:
            case 279:
                {
                alt145=7;
                }
                break;
            case 280:
            case 281:
                {
                alt145=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // flips.g:532:4: ( 'nne' | 'north-northeast' )
                    {
                    // flips.g:532:4: ( 'nne' | 'north-northeast' )
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==266) ) {
                        alt137=1;
                    }
                    else if ( (LA137_0==267) ) {
                        alt137=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;
                    }
                    switch (alt137) {
                        case 1 :
                            // flips.g:532:5: 'nne'
                            {
                            string_literal386=(Token)match(input,266,FOLLOW_266_in_subOrdinalDirection3027);  
                            stream_266.add(string_literal386);


                            }
                            break;
                        case 2 :
                            // flips.g:532:11: 'north-northeast'
                            {
                            string_literal387=(Token)match(input,267,FOLLOW_267_in_subOrdinalDirection3029);  
                            stream_267.add(string_literal387);


                            }
                            break;

                    }



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
                    // 533:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:534:4: ( 'ene' | 'east-northeast' )
                    {
                    // flips.g:534:4: ( 'ene' | 'east-northeast' )
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==268) ) {
                        alt138=1;
                    }
                    else if ( (LA138_0==269) ) {
                        alt138=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;
                    }
                    switch (alt138) {
                        case 1 :
                            // flips.g:534:5: 'ene'
                            {
                            string_literal388=(Token)match(input,268,FOLLOW_268_in_subOrdinalDirection3045);  
                            stream_268.add(string_literal388);


                            }
                            break;
                        case 2 :
                            // flips.g:534:11: 'east-northeast'
                            {
                            string_literal389=(Token)match(input,269,FOLLOW_269_in_subOrdinalDirection3047);  
                            stream_269.add(string_literal389);


                            }
                            break;

                    }



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
                    // 535:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:536:4: ( 'ese' | 'east-southeast' )
                    {
                    // flips.g:536:4: ( 'ese' | 'east-southeast' )
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==270) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==271) ) {
                        alt139=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }
                    switch (alt139) {
                        case 1 :
                            // flips.g:536:5: 'ese'
                            {
                            string_literal390=(Token)match(input,270,FOLLOW_270_in_subOrdinalDirection3063);  
                            stream_270.add(string_literal390);


                            }
                            break;
                        case 2 :
                            // flips.g:536:11: 'east-southeast'
                            {
                            string_literal391=(Token)match(input,271,FOLLOW_271_in_subOrdinalDirection3065);  
                            stream_271.add(string_literal391);


                            }
                            break;

                    }



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
                    // 537:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:538:4: ( 'sse' | 'south-southeast' )
                    {
                    // flips.g:538:4: ( 'sse' | 'south-southeast' )
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==272) ) {
                        alt140=1;
                    }
                    else if ( (LA140_0==273) ) {
                        alt140=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;
                    }
                    switch (alt140) {
                        case 1 :
                            // flips.g:538:5: 'sse'
                            {
                            string_literal392=(Token)match(input,272,FOLLOW_272_in_subOrdinalDirection3081);  
                            stream_272.add(string_literal392);


                            }
                            break;
                        case 2 :
                            // flips.g:538:11: 'south-southeast'
                            {
                            string_literal393=(Token)match(input,273,FOLLOW_273_in_subOrdinalDirection3083);  
                            stream_273.add(string_literal393);


                            }
                            break;

                    }



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
                    // 539:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:540:4: ( 'ssw' | 'south-southwest' )
                    {
                    // flips.g:540:4: ( 'ssw' | 'south-southwest' )
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==274) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==275) ) {
                        alt141=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }
                    switch (alt141) {
                        case 1 :
                            // flips.g:540:5: 'ssw'
                            {
                            string_literal394=(Token)match(input,274,FOLLOW_274_in_subOrdinalDirection3099);  
                            stream_274.add(string_literal394);


                            }
                            break;
                        case 2 :
                            // flips.g:540:11: 'south-southwest'
                            {
                            string_literal395=(Token)match(input,275,FOLLOW_275_in_subOrdinalDirection3101);  
                            stream_275.add(string_literal395);


                            }
                            break;

                    }



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
                    // 541:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:542:4: ( 'wsw' | 'west-southwest' )
                    {
                    // flips.g:542:4: ( 'wsw' | 'west-southwest' )
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==276) ) {
                        alt142=1;
                    }
                    else if ( (LA142_0==277) ) {
                        alt142=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;
                    }
                    switch (alt142) {
                        case 1 :
                            // flips.g:542:5: 'wsw'
                            {
                            string_literal396=(Token)match(input,276,FOLLOW_276_in_subOrdinalDirection3117);  
                            stream_276.add(string_literal396);


                            }
                            break;
                        case 2 :
                            // flips.g:542:11: 'west-southwest'
                            {
                            string_literal397=(Token)match(input,277,FOLLOW_277_in_subOrdinalDirection3119);  
                            stream_277.add(string_literal397);


                            }
                            break;

                    }



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
                    // 543:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:544:4: ( 'wnw' | 'west-northwest' )
                    {
                    // flips.g:544:4: ( 'wnw' | 'west-northwest' )
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==278) ) {
                        alt143=1;
                    }
                    else if ( (LA143_0==279) ) {
                        alt143=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 143, 0, input);

                        throw nvae;
                    }
                    switch (alt143) {
                        case 1 :
                            // flips.g:544:5: 'wnw'
                            {
                            string_literal398=(Token)match(input,278,FOLLOW_278_in_subOrdinalDirection3135);  
                            stream_278.add(string_literal398);


                            }
                            break;
                        case 2 :
                            // flips.g:544:11: 'west-northwest'
                            {
                            string_literal399=(Token)match(input,279,FOLLOW_279_in_subOrdinalDirection3137);  
                            stream_279.add(string_literal399);


                            }
                            break;

                    }



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
                    // 545:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // flips.g:546:4: ( 'nnw' | 'north-northwest' )
                    {
                    // flips.g:546:4: ( 'nnw' | 'north-northwest' )
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==280) ) {
                        alt144=1;
                    }
                    else if ( (LA144_0==281) ) {
                        alt144=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 0, input);

                        throw nvae;
                    }
                    switch (alt144) {
                        case 1 :
                            // flips.g:546:5: 'nnw'
                            {
                            string_literal400=(Token)match(input,280,FOLLOW_280_in_subOrdinalDirection3153);  
                            stream_280.add(string_literal400);


                            }
                            break;
                        case 2 :
                            // flips.g:546:11: 'north-northwest'
                            {
                            string_literal401=(Token)match(input,281,FOLLOW_281_in_subOrdinalDirection3155);  
                            stream_281.add(string_literal401);


                            }
                            break;

                    }



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
                    // 547:2: -> NORTH NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
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
        return retval;
    }
    // $ANTLR end "subOrdinalDirection"

    public static class loiterDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterDirection"
    // flips.g:550:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning402=null;
        flipsParser.clockDirection_return clockDirection403 = null;


        CommonTree Turning402_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // flips.g:551:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // flips.g:551:4: ( Turning )? clockDirection
            {
            // flips.g:551:4: ( Turning )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==Turning) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // flips.g:551:4: Turning
                    {
                    Turning402=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection3176);  
                    stream_Turning.add(Turning402);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection3179);
            clockDirection403=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection403.getTree());


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
            // 552:2: -> ^( DIRECTION TURN clockDirection )
            {
                // flips.g:552:5: ^( DIRECTION TURN clockDirection )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(TURN, "TURN"));
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
        return retval;
    }
    // $ANTLR end "loiterDirection"

    public static class upDownDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "upDownDirection"
    // flips.g:555:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal404=null;
        Token string_literal405=null;
        Token char_literal406=null;
        Token string_literal407=null;
        Token string_literal408=null;
        Token string_literal409=null;
        Token string_literal410=null;
        Token char_literal411=null;
        Token string_literal412=null;
        Token string_literal413=null;
        Token string_literal414=null;

        CommonTree char_literal404_tree=null;
        CommonTree string_literal405_tree=null;
        CommonTree char_literal406_tree=null;
        CommonTree string_literal407_tree=null;
        CommonTree string_literal408_tree=null;
        CommonTree string_literal409_tree=null;
        CommonTree string_literal410_tree=null;
        CommonTree char_literal411_tree=null;
        CommonTree string_literal412_tree=null;
        CommonTree string_literal413_tree=null;
        CommonTree string_literal414_tree=null;
        RewriteRuleTokenStream stream_288=new RewriteRuleTokenStream(adaptor,"token 288");
        RewriteRuleTokenStream stream_289=new RewriteRuleTokenStream(adaptor,"token 289");
        RewriteRuleTokenStream stream_286=new RewriteRuleTokenStream(adaptor,"token 286");
        RewriteRuleTokenStream stream_287=new RewriteRuleTokenStream(adaptor,"token 287");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_290=new RewriteRuleTokenStream(adaptor,"token 290");
        RewriteRuleTokenStream stream_285=new RewriteRuleTokenStream(adaptor,"token 285");
        RewriteRuleTokenStream stream_284=new RewriteRuleTokenStream(adaptor,"token 284");
        RewriteRuleTokenStream stream_283=new RewriteRuleTokenStream(adaptor,"token 283");
        RewriteRuleTokenStream stream_291=new RewriteRuleTokenStream(adaptor,"token 291");
        RewriteRuleTokenStream stream_282=new RewriteRuleTokenStream(adaptor,"token 282");

        try {
            // flips.g:556:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=282 && LA149_0<=288)) ) {
                alt149=1;
            }
            else if ( (LA149_0==230||(LA149_0>=289 && LA149_0<=291)) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // flips.g:556:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // flips.g:556:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt147=7;
                    switch ( input.LA(1) ) {
                    case 282:
                        {
                        alt147=1;
                        }
                        break;
                    case 283:
                        {
                        alt147=2;
                        }
                        break;
                    case 284:
                        {
                        alt147=3;
                        }
                        break;
                    case 285:
                        {
                        alt147=4;
                        }
                        break;
                    case 286:
                        {
                        alt147=5;
                        }
                        break;
                    case 287:
                        {
                        alt147=6;
                        }
                        break;
                    case 288:
                        {
                        alt147=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 147, 0, input);

                        throw nvae;
                    }

                    switch (alt147) {
                        case 1 :
                            // flips.g:556:5: 'u'
                            {
                            char_literal404=(Token)match(input,282,FOLLOW_282_in_upDownDirection3202);  
                            stream_282.add(char_literal404);


                            }
                            break;
                        case 2 :
                            // flips.g:556:9: 'up'
                            {
                            string_literal405=(Token)match(input,283,FOLLOW_283_in_upDownDirection3204);  
                            stream_283.add(string_literal405);


                            }
                            break;
                        case 3 :
                            // flips.g:556:14: 'c'
                            {
                            char_literal406=(Token)match(input,284,FOLLOW_284_in_upDownDirection3206);  
                            stream_284.add(char_literal406);


                            }
                            break;
                        case 4 :
                            // flips.g:556:18: 'climb'
                            {
                            string_literal407=(Token)match(input,285,FOLLOW_285_in_upDownDirection3208);  
                            stream_285.add(string_literal407);


                            }
                            break;
                        case 5 :
                            // flips.g:556:26: 'climbing'
                            {
                            string_literal408=(Token)match(input,286,FOLLOW_286_in_upDownDirection3210);  
                            stream_286.add(string_literal408);


                            }
                            break;
                        case 6 :
                            // flips.g:556:37: 'ascend'
                            {
                            string_literal409=(Token)match(input,287,FOLLOW_287_in_upDownDirection3212);  
                            stream_287.add(string_literal409);


                            }
                            break;
                        case 7 :
                            // flips.g:556:46: 'ascending'
                            {
                            string_literal410=(Token)match(input,288,FOLLOW_288_in_upDownDirection3214);  
                            stream_288.add(string_literal410);


                            }
                            break;

                    }



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
                    // 557:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:558:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // flips.g:558:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt148=4;
                    switch ( input.LA(1) ) {
                    case 230:
                        {
                        alt148=1;
                        }
                        break;
                    case 289:
                        {
                        alt148=2;
                        }
                        break;
                    case 290:
                        {
                        alt148=3;
                        }
                        break;
                    case 291:
                        {
                        alt148=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;
                    }

                    switch (alt148) {
                        case 1 :
                            // flips.g:558:5: 'd'
                            {
                            char_literal411=(Token)match(input,230,FOLLOW_230_in_upDownDirection3226);  
                            stream_230.add(char_literal411);


                            }
                            break;
                        case 2 :
                            // flips.g:558:9: 'down'
                            {
                            string_literal412=(Token)match(input,289,FOLLOW_289_in_upDownDirection3228);  
                            stream_289.add(string_literal412);


                            }
                            break;
                        case 3 :
                            // flips.g:558:16: 'descend'
                            {
                            string_literal413=(Token)match(input,290,FOLLOW_290_in_upDownDirection3230);  
                            stream_290.add(string_literal413);


                            }
                            break;
                        case 4 :
                            // flips.g:558:26: 'descending'
                            {
                            string_literal414=(Token)match(input,291,FOLLOW_291_in_upDownDirection3232);  
                            stream_291.add(string_literal414);


                            }
                            break;

                    }



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
                    // 559:2: -> DESCEND
                    {
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
        return retval;
    }
    // $ANTLR end "upDownDirection"

    public static class leftRightDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftRightDirection"
    // flips.g:562:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal415=null;
        Token string_literal416=null;
        Token string_literal417=null;
        Token char_literal418=null;
        Token string_literal419=null;
        Token string_literal420=null;

        CommonTree char_literal415_tree=null;
        CommonTree string_literal416_tree=null;
        CommonTree string_literal417_tree=null;
        CommonTree char_literal418_tree=null;
        CommonTree string_literal419_tree=null;
        CommonTree string_literal420_tree=null;
        RewriteRuleTokenStream stream_297=new RewriteRuleTokenStream(adaptor,"token 297");
        RewriteRuleTokenStream stream_294=new RewriteRuleTokenStream(adaptor,"token 294");
        RewriteRuleTokenStream stream_293=new RewriteRuleTokenStream(adaptor,"token 293");
        RewriteRuleTokenStream stream_296=new RewriteRuleTokenStream(adaptor,"token 296");
        RewriteRuleTokenStream stream_295=new RewriteRuleTokenStream(adaptor,"token 295");
        RewriteRuleTokenStream stream_292=new RewriteRuleTokenStream(adaptor,"token 292");

        try {
            // flips.g:563:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=292 && LA152_0<=294)) ) {
                alt152=1;
            }
            else if ( ((LA152_0>=295 && LA152_0<=297)) ) {
                alt152=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // flips.g:563:4: ( 'l' | 'left' | 'port' )
                    {
                    // flips.g:563:4: ( 'l' | 'left' | 'port' )
                    int alt150=3;
                    switch ( input.LA(1) ) {
                    case 292:
                        {
                        alt150=1;
                        }
                        break;
                    case 293:
                        {
                        alt150=2;
                        }
                        break;
                    case 294:
                        {
                        alt150=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 150, 0, input);

                        throw nvae;
                    }

                    switch (alt150) {
                        case 1 :
                            // flips.g:563:5: 'l'
                            {
                            char_literal415=(Token)match(input,292,FOLLOW_292_in_leftRightDirection3250);  
                            stream_292.add(char_literal415);


                            }
                            break;
                        case 2 :
                            // flips.g:563:9: 'left'
                            {
                            string_literal416=(Token)match(input,293,FOLLOW_293_in_leftRightDirection3252);  
                            stream_293.add(string_literal416);


                            }
                            break;
                        case 3 :
                            // flips.g:563:16: 'port'
                            {
                            string_literal417=(Token)match(input,294,FOLLOW_294_in_leftRightDirection3254);  
                            stream_294.add(string_literal417);


                            }
                            break;

                    }



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
                    // 564:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:565:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // flips.g:565:4: ( 'r' | 'right' | 'starboard' )
                    int alt151=3;
                    switch ( input.LA(1) ) {
                    case 295:
                        {
                        alt151=1;
                        }
                        break;
                    case 296:
                        {
                        alt151=2;
                        }
                        break;
                    case 297:
                        {
                        alt151=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 151, 0, input);

                        throw nvae;
                    }

                    switch (alt151) {
                        case 1 :
                            // flips.g:565:5: 'r'
                            {
                            char_literal418=(Token)match(input,295,FOLLOW_295_in_leftRightDirection3266);  
                            stream_295.add(char_literal418);


                            }
                            break;
                        case 2 :
                            // flips.g:565:9: 'right'
                            {
                            string_literal419=(Token)match(input,296,FOLLOW_296_in_leftRightDirection3268);  
                            stream_296.add(string_literal419);


                            }
                            break;
                        case 3 :
                            // flips.g:565:17: 'starboard'
                            {
                            string_literal420=(Token)match(input,297,FOLLOW_297_in_leftRightDirection3270);  
                            stream_297.add(string_literal420);


                            }
                            break;

                    }



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
                    // 566:2: -> RIGHT
                    {
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
        return retval;
    }
    // $ANTLR end "leftRightDirection"

    public static class clockDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clockDirection"
    // flips.g:569:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal421=null;
        Token string_literal422=null;
        Token string_literal423=null;
        Token string_literal424=null;

        CommonTree string_literal421_tree=null;
        CommonTree string_literal422_tree=null;
        CommonTree string_literal423_tree=null;
        CommonTree string_literal424_tree=null;
        RewriteRuleTokenStream stream_300=new RewriteRuleTokenStream(adaptor,"token 300");
        RewriteRuleTokenStream stream_301=new RewriteRuleTokenStream(adaptor,"token 301");
        RewriteRuleTokenStream stream_298=new RewriteRuleTokenStream(adaptor,"token 298");
        RewriteRuleTokenStream stream_299=new RewriteRuleTokenStream(adaptor,"token 299");

        try {
            // flips.g:570:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( ((LA155_0>=298 && LA155_0<=299)) ) {
                alt155=1;
            }
            else if ( ((LA155_0>=300 && LA155_0<=301)) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // flips.g:570:4: ( 'cw' | 'clockwise' )
                    {
                    // flips.g:570:4: ( 'cw' | 'clockwise' )
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==298) ) {
                        alt153=1;
                    }
                    else if ( (LA153_0==299) ) {
                        alt153=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 153, 0, input);

                        throw nvae;
                    }
                    switch (alt153) {
                        case 1 :
                            // flips.g:570:5: 'cw'
                            {
                            string_literal421=(Token)match(input,298,FOLLOW_298_in_clockDirection3288);  
                            stream_298.add(string_literal421);


                            }
                            break;
                        case 2 :
                            // flips.g:570:10: 'clockwise'
                            {
                            string_literal422=(Token)match(input,299,FOLLOW_299_in_clockDirection3290);  
                            stream_299.add(string_literal422);


                            }
                            break;

                    }



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
                    // 571:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:572:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // flips.g:572:4: ( 'ccw' | 'counterclockwise' )
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==300) ) {
                        alt154=1;
                    }
                    else if ( (LA154_0==301) ) {
                        alt154=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 154, 0, input);

                        throw nvae;
                    }
                    switch (alt154) {
                        case 1 :
                            // flips.g:572:5: 'ccw'
                            {
                            string_literal423=(Token)match(input,300,FOLLOW_300_in_clockDirection3302);  
                            stream_300.add(string_literal423);


                            }
                            break;
                        case 2 :
                            // flips.g:572:11: 'counterclockwise'
                            {
                            string_literal424=(Token)match(input,301,FOLLOW_301_in_clockDirection3304);  
                            stream_301.add(string_literal424);


                            }
                            break;

                    }



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
                    // 573:2: -> COUNTERCLOCKWISE
                    {
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
        return retval;
    }
    // $ANTLR end "clockDirection"

    public static class angularValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "angularValue"
    // flips.g:576:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal426=null;
        Token string_literal427=null;
        Token string_literal428=null;
        Token string_literal429=null;
        Token char_literal431=null;
        Token char_literal433=null;
        Token string_literal435=null;
        Token string_literal436=null;
        Token string_literal437=null;
        Token string_literal438=null;
        flipsParser.numericValue_return numericValue425 = null;

        flipsParser.integerValue_return integerValue430 = null;

        flipsParser.numericValue_return numericValue432 = null;

        flipsParser.numericValue_return numericValue434 = null;


        CommonTree string_literal426_tree=null;
        CommonTree string_literal427_tree=null;
        CommonTree string_literal428_tree=null;
        CommonTree string_literal429_tree=null;
        CommonTree char_literal431_tree=null;
        CommonTree char_literal433_tree=null;
        CommonTree string_literal435_tree=null;
        CommonTree string_literal436_tree=null;
        CommonTree string_literal437_tree=null;
        CommonTree string_literal438_tree=null;
        RewriteRuleTokenStream stream_302=new RewriteRuleTokenStream(adaptor,"token 302");
        RewriteRuleTokenStream stream_304=new RewriteRuleTokenStream(adaptor,"token 304");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_303=new RewriteRuleTokenStream(adaptor,"token 303");
        RewriteRuleTokenStream stream_306=new RewriteRuleTokenStream(adaptor,"token 306");
        RewriteRuleTokenStream stream_305=new RewriteRuleTokenStream(adaptor,"token 305");
        RewriteRuleTokenStream stream_308=new RewriteRuleTokenStream(adaptor,"token 308");
        RewriteRuleTokenStream stream_307=new RewriteRuleTokenStream(adaptor,"token 307");
        RewriteRuleTokenStream stream_310=new RewriteRuleTokenStream(adaptor,"token 310");
        RewriteRuleTokenStream stream_309=new RewriteRuleTokenStream(adaptor,"token 309");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:577:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt158=3;
            int LA158_0 = input.LA(1);

            if ( ((LA158_0>=BinaryLiteral && LA158_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 302:
                case 303:
                case 304:
                case 305:
                    {
                    alt158=1;
                    }
                    break;
                case 230:
                    {
                    alt158=2;
                    }
                    break;
                case 307:
                case 308:
                case 309:
                case 310:
                    {
                    alt158=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 158, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA158_0==FloatingPointLiteral) ) {
                int LA158_2 = input.LA(2);

                if ( ((LA158_2>=302 && LA158_2<=305)) ) {
                    alt158=1;
                }
                else if ( ((LA158_2>=307 && LA158_2<=310)) ) {
                    alt158=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 158, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // flips.g:577:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3321);
                    numericValue425=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue425.getTree());
                    // flips.g:577:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt156=4;
                    switch ( input.LA(1) ) {
                    case 302:
                        {
                        alt156=1;
                        }
                        break;
                    case 303:
                        {
                        alt156=2;
                        }
                        break;
                    case 304:
                        {
                        alt156=3;
                        }
                        break;
                    case 305:
                        {
                        alt156=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 156, 0, input);

                        throw nvae;
                    }

                    switch (alt156) {
                        case 1 :
                            // flips.g:577:18: 'deg'
                            {
                            string_literal426=(Token)match(input,302,FOLLOW_302_in_angularValue3324);  
                            stream_302.add(string_literal426);


                            }
                            break;
                        case 2 :
                            // flips.g:577:24: 'degs'
                            {
                            string_literal427=(Token)match(input,303,FOLLOW_303_in_angularValue3326);  
                            stream_303.add(string_literal427);


                            }
                            break;
                        case 3 :
                            // flips.g:577:31: 'degree'
                            {
                            string_literal428=(Token)match(input,304,FOLLOW_304_in_angularValue3328);  
                            stream_304.add(string_literal428);


                            }
                            break;
                        case 4 :
                            // flips.g:577:40: 'degrees'
                            {
                            string_literal429=(Token)match(input,305,FOLLOW_305_in_angularValue3330);  
                            stream_305.add(string_literal429);


                            }
                            break;

                    }



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
                    // 578:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:579:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue3343);
                    integerValue430=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue430.getTree());
                    char_literal431=(Token)match(input,230,FOLLOW_230_in_angularValue3345);  
                    stream_230.add(char_literal431);

                    pushFollow(FOLLOW_numericValue_in_angularValue3347);
                    numericValue432=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue432.getTree());
                    char_literal433=(Token)match(input,306,FOLLOW_306_in_angularValue3349);  
                    stream_306.add(char_literal433);



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
                    // 580:2: -> integerValue DEGREE numericValue MINUTE
                    {
                        adaptor.addChild(root_0, stream_integerValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:581:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3365);
                    numericValue434=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue434.getTree());
                    // flips.g:581:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt157=4;
                    switch ( input.LA(1) ) {
                    case 307:
                        {
                        alt157=1;
                        }
                        break;
                    case 308:
                        {
                        alt157=2;
                        }
                        break;
                    case 309:
                        {
                        alt157=3;
                        }
                        break;
                    case 310:
                        {
                        alt157=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }

                    switch (alt157) {
                        case 1 :
                            // flips.g:581:18: 'rad'
                            {
                            string_literal435=(Token)match(input,307,FOLLOW_307_in_angularValue3368);  
                            stream_307.add(string_literal435);


                            }
                            break;
                        case 2 :
                            // flips.g:581:24: 'rads'
                            {
                            string_literal436=(Token)match(input,308,FOLLOW_308_in_angularValue3370);  
                            stream_308.add(string_literal436);


                            }
                            break;
                        case 3 :
                            // flips.g:581:31: 'radian'
                            {
                            string_literal437=(Token)match(input,309,FOLLOW_309_in_angularValue3372);  
                            stream_309.add(string_literal437);


                            }
                            break;
                        case 4 :
                            // flips.g:581:40: 'radians'
                            {
                            string_literal438=(Token)match(input,310,FOLLOW_310_in_angularValue3374);  
                            stream_310.add(string_literal438);


                            }
                            break;

                    }



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
                    // 582:2: -> numericValue RADIAN
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
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
        return retval;
    }
    // $ANTLR end "angularValue"

    public static class waypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "waypoint"
    // flips.g:587:1: waypoint : ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier440=null;
        flipsParser.geoCoordinate_return geoCoordinate439 = null;


        CommonTree Identifier440_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // flips.g:588:2: ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( ((LA159_0>=FloatingPointLiteral && LA159_0<=HexLiteral)||LA159_0==105||(LA159_0>=311 && LA159_0<=312)) ) {
                alt159=1;
            }
            else if ( (LA159_0==Identifier) ) {
                alt159=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // flips.g:588:4: geoCoordinate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_geoCoordinate_in_waypoint3395);
                    geoCoordinate439=geoCoordinate();

                    state._fsp--;

                    adaptor.addChild(root_0, geoCoordinate439.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:589:4: Identifier
                    {
                    Identifier440=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint3400);  
                    stream_Identifier.add(Identifier440);



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
                    // 590:2: -> ^( WAYPOINT Identifier )
                    {
                        // flips.g:590:5: ^( WAYPOINT Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WAYPOINT, "WAYPOINT"), root_1);

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
        return retval;
    }
    // $ANTLR end "waypoint"

    public static class geoCoordinate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "geoCoordinate"
    // flips.g:593:1: geoCoordinate : ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) );
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude441 = null;

        flipsParser.distanceCoordinate_return distanceCoordinate442 = null;


        RewriteRuleSubtreeStream stream_distanceCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule distanceCoordinate");
        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // flips.g:594:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( ((LA160_0>=FloatingPointLiteral && LA160_0<=HexLiteral)||(LA160_0>=311 && LA160_0<=312)) ) {
                alt160=1;
            }
            else if ( (LA160_0==105) ) {
                alt160=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // flips.g:594:4: latitudeLongitude
                    {
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate3420);
                    latitudeLongitude441=latitudeLongitude();

                    state._fsp--;

                    stream_latitudeLongitude.add(latitudeLongitude441.getTree());


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
                    // 595:2: -> ^( GEOCOORDINATE latitudeLongitude )
                    {
                        // flips.g:595:5: ^( GEOCOORDINATE latitudeLongitude )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

                        adaptor.addChild(root_1, stream_latitudeLongitude.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:596:4: distanceCoordinate
                    {
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate3434);
                    distanceCoordinate442=distanceCoordinate();

                    state._fsp--;

                    stream_distanceCoordinate.add(distanceCoordinate442.getTree());


                    // AST REWRITE
                    // elements: distanceCoordinate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 597:2: -> ^( GEOCOORDINATE distanceCoordinate )
                    {
                        // flips.g:597:5: ^( GEOCOORDINATE distanceCoordinate )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

                        adaptor.addChild(root_1, stream_distanceCoordinate.nextTree());

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
        return retval;
    }
    // $ANTLR end "geoCoordinate"

    public static class latitudeLongitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitude"
    // flips.g:600:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal444=null;
        Token char_literal446=null;
        Token char_literal447=null;
        Token char_literal448=null;
        Token char_literal449=null;
        Token char_literal450=null;
        Token char_literal451=null;
        Token char_literal452=null;
        Token char_literal453=null;
        Token char_literal454=null;
        Token char_literal455=null;
        Token char_literal456=null;
        Token char_literal457=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection443 = null;

        flipsParser.eastWestDirection_return eastWestDirection445 = null;


        CommonTree char_literal444_tree=null;
        CommonTree char_literal446_tree=null;
        CommonTree char_literal447_tree=null;
        CommonTree char_literal448_tree=null;
        CommonTree char_literal449_tree=null;
        CommonTree char_literal450_tree=null;
        CommonTree char_literal451_tree=null;
        CommonTree char_literal452_tree=null;
        CommonTree char_literal453_tree=null;
        CommonTree char_literal454_tree=null;
        CommonTree char_literal455_tree=null;
        CommonTree char_literal456_tree=null;
        CommonTree char_literal457_tree=null;
        RewriteRuleTokenStream stream_312=new RewriteRuleTokenStream(adaptor,"token 312");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_311=new RewriteRuleTokenStream(adaptor,"token 311");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // flips.g:601:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt170=5;
            alt170 = dfa170.predict(input);
            switch (alt170) {
                case 1 :
                    // flips.g:601:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3456);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3458);
                    northSouthDirection443=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection443.getTree());
                    // flips.g:601:49: ( ',' )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==104) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // flips.g:601:49: ','
                            {
                            char_literal444=(Token)match(input,104,FOLLOW_104_in_latitudeLongitude3460);  
                            stream_104.add(char_literal444);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3465);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3467);
                    eastWestDirection445=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection445.getTree());


                    // AST REWRITE
                    // elements: x, y, eastWestDirection, northSouthDirection
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
                    // 602:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // flips.g:602:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:602:40: ^( LONGITUDE $y eastWestDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_eastWestDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:603:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // flips.g:603:4: ( '+' )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==311) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // flips.g:603:4: '+'
                            {
                            char_literal446=(Token)match(input,311,FOLLOW_311_in_latitudeLongitude3493);  
                            stream_311.add(char_literal446);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3498);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:603:34: ( ',' )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==104) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // flips.g:603:34: ','
                            {
                            char_literal447=(Token)match(input,104,FOLLOW_104_in_latitudeLongitude3500);  
                            stream_104.add(char_literal447);


                            }
                            break;

                    }

                    // flips.g:603:39: ( '+' )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==311) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // flips.g:603:39: '+'
                            {
                            char_literal448=(Token)match(input,311,FOLLOW_311_in_latitudeLongitude3503);  
                            stream_311.add(char_literal448);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3508);
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
                    // 604:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // flips.g:604:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:604:26: ^( LONGITUDE $y EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:605:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal449=(Token)match(input,312,FOLLOW_312_in_latitudeLongitude3534);  
                    stream_312.add(char_literal449);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3538);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:605:33: ( ',' )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==104) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // flips.g:605:33: ','
                            {
                            char_literal450=(Token)match(input,104,FOLLOW_104_in_latitudeLongitude3540);  
                            stream_104.add(char_literal450);


                            }
                            break;

                    }

                    // flips.g:605:38: ( '+' )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==311) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // flips.g:605:38: '+'
                            {
                            char_literal451=(Token)match(input,311,FOLLOW_311_in_latitudeLongitude3543);  
                            stream_311.add(char_literal451);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3548);
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
                    // 606:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // flips.g:606:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:606:26: ^( LONGITUDE $y EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:607:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // flips.g:607:4: ( '+' )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==311) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // flips.g:607:4: '+'
                            {
                            char_literal452=(Token)match(input,311,FOLLOW_311_in_latitudeLongitude3574);  
                            stream_311.add(char_literal452);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3579);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:607:34: ( ',' )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==104) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // flips.g:607:34: ','
                            {
                            char_literal453=(Token)match(input,104,FOLLOW_104_in_latitudeLongitude3581);  
                            stream_104.add(char_literal453);


                            }
                            break;

                    }

                    char_literal454=(Token)match(input,312,FOLLOW_312_in_latitudeLongitude3584);  
                    stream_312.add(char_literal454);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3588);
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
                    // 608:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // flips.g:608:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:608:26: ^( LONGITUDE $y WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:609:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal455=(Token)match(input,312,FOLLOW_312_in_latitudeLongitude3614);  
                    stream_312.add(char_literal455);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3618);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:609:33: ( ',' )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==104) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // flips.g:609:33: ','
                            {
                            char_literal456=(Token)match(input,104,FOLLOW_104_in_latitudeLongitude3620);  
                            stream_104.add(char_literal456);


                            }
                            break;

                    }

                    char_literal457=(Token)match(input,312,FOLLOW_312_in_latitudeLongitude3623);  
                    stream_312.add(char_literal457);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3627);
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
                    // 610:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // flips.g:610:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:610:26: ^( LONGITUDE $y WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
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
        return retval;
    }
    // $ANTLR end "latitudeLongitude"

    public static class latitudeLongitudeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitudeValue"
    // flips.g:613:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue458 = null;

        flipsParser.angularValue_return angularValue459 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:614:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( ((LA171_0>=BinaryLiteral && LA171_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case Identifier:
                case To:
                case At:
                case With:
                case Turning:
                case Heading:
                case FloatingPointLiteral:
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                case 99:
                case 100:
                case 101:
                case 103:
                case 104:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 117:
                case 118:
                case 119:
                case 120:
                case 130:
                case 131:
                case 132:
                case 133:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 143:
                case 144:
                case 146:
                case 167:
                case 168:
                case 245:
                case 250:
                case 251:
                case 252:
                case 253:
                case 254:
                case 255:
                case 256:
                case 257:
                case 258:
                case 259:
                case 260:
                case 261:
                case 262:
                case 263:
                case 264:
                case 265:
                case 266:
                case 267:
                case 268:
                case 269:
                case 270:
                case 271:
                case 272:
                case 273:
                case 274:
                case 275:
                case 276:
                case 277:
                case 278:
                case 279:
                case 280:
                case 281:
                case 282:
                case 283:
                case 284:
                case 285:
                case 286:
                case 287:
                case 288:
                case 289:
                case 290:
                case 291:
                case 292:
                case 293:
                case 294:
                case 295:
                case 296:
                case 297:
                case 298:
                case 299:
                case 300:
                case 301:
                case 311:
                case 312:
                    {
                    alt171=1;
                    }
                    break;
                case 230:
                    {
                    switch ( input.LA(3) ) {
                    case To:
                    case FlightLevel:
                        {
                        alt171=1;
                        }
                        break;
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA171_6 = input.LA(4);

                        if ( ((LA171_6>=149 && LA171_6<=167)||(LA171_6>=169 && LA171_6<=195)) ) {
                            alt171=1;
                        }
                        else if ( (LA171_6==306) ) {
                            alt171=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 171, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA171_7 = input.LA(4);

                        if ( ((LA171_7>=149 && LA171_7<=167)||(LA171_7>=169 && LA171_7<=195)) ) {
                            alt171=1;
                        }
                        else if ( (LA171_7==306) ) {
                            alt171=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 171, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 171, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 302:
                case 303:
                case 304:
                case 305:
                case 307:
                case 308:
                case 309:
                case 310:
                    {
                    alt171=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 171, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA171_0==FloatingPointLiteral) ) {
                int LA171_2 = input.LA(2);

                if ( ((LA171_2>=302 && LA171_2<=305)||(LA171_2>=307 && LA171_2<=310)) ) {
                    alt171=2;
                }
                else if ( (LA171_2==EOF||(LA171_2>=Identifier && LA171_2<=At)||LA171_2==With||(LA171_2>=Turning && LA171_2<=HexLiteral)||(LA171_2>=99 && LA171_2<=101)||(LA171_2>=103 && LA171_2<=104)||(LA171_2>=107 && LA171_2<=114)||(LA171_2>=117 && LA171_2<=120)||(LA171_2>=130 && LA171_2<=133)||(LA171_2>=136 && LA171_2<=141)||(LA171_2>=143 && LA171_2<=144)||LA171_2==146||(LA171_2>=167 && LA171_2<=168)||LA171_2==230||LA171_2==245||(LA171_2>=250 && LA171_2<=301)||(LA171_2>=311 && LA171_2<=312)) ) {
                    alt171=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 171, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }
            switch (alt171) {
                case 1 :
                    // flips.g:614:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3659);
                    numericValue458=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue458.getTree());


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
                    // 615:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:616:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3671);
                    angularValue459=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue459.getTree());

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
        return retval;
    }
    // $ANTLR end "latitudeLongitudeValue"

    public static class distanceCoordinate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceCoordinate"
    // flips.g:619:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );
    public final flipsParser.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsParser.distanceCoordinate_return retval = new flipsParser.distanceCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal460=null;
        Token char_literal461=null;
        Token char_literal462=null;
        Token char_literal463=null;
        Token char_literal464=null;
        Token char_literal465=null;
        Token char_literal466=null;
        Token char_literal467=null;
        Token char_literal468=null;
        Token char_literal469=null;
        Token char_literal470=null;
        Token char_literal471=null;
        Token char_literal472=null;
        Token char_literal473=null;
        Token char_literal474=null;
        Token char_literal475=null;
        Token char_literal476=null;
        Token char_literal477=null;
        Token char_literal478=null;
        Token char_literal479=null;
        flipsParser.distanceValue_return x = null;

        flipsParser.distanceValue_return y = null;


        CommonTree char_literal460_tree=null;
        CommonTree char_literal461_tree=null;
        CommonTree char_literal462_tree=null;
        CommonTree char_literal463_tree=null;
        CommonTree char_literal464_tree=null;
        CommonTree char_literal465_tree=null;
        CommonTree char_literal466_tree=null;
        CommonTree char_literal467_tree=null;
        CommonTree char_literal468_tree=null;
        CommonTree char_literal469_tree=null;
        CommonTree char_literal470_tree=null;
        CommonTree char_literal471_tree=null;
        CommonTree char_literal472_tree=null;
        CommonTree char_literal473_tree=null;
        CommonTree char_literal474_tree=null;
        CommonTree char_literal475_tree=null;
        CommonTree char_literal476_tree=null;
        CommonTree char_literal477_tree=null;
        CommonTree char_literal478_tree=null;
        CommonTree char_literal479_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_312=new RewriteRuleTokenStream(adaptor,"token 312");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_311=new RewriteRuleTokenStream(adaptor,"token 311");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:620:2: ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) )
            int alt176=4;
            alt176 = dfa176.predict(input);
            switch (alt176) {
                case 1 :
                    // flips.g:620:4: '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal460=(Token)match(input,105,FOLLOW_105_in_distanceCoordinate3682);  
                    stream_105.add(char_literal460);

                    // flips.g:620:8: ( '+' )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==311) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // flips.g:620:8: '+'
                            {
                            char_literal461=(Token)match(input,311,FOLLOW_311_in_distanceCoordinate3684);  
                            stream_311.add(char_literal461);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3689);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal462=(Token)match(input,104,FOLLOW_104_in_distanceCoordinate3691);  
                    stream_104.add(char_literal462);

                    // flips.g:620:33: ( '+' )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==311) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // flips.g:620:33: '+'
                            {
                            char_literal463=(Token)match(input,311,FOLLOW_311_in_distanceCoordinate3693);  
                            stream_311.add(char_literal463);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3698);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal464=(Token)match(input,106,FOLLOW_106_in_distanceCoordinate3700);  
                    stream_106.add(char_literal464);



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
                    // 621:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST )
                    {
                        // flips.g:621:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:621:26: ^( DISTANCE $x EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:622:4: '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal465=(Token)match(input,105,FOLLOW_105_in_distanceCoordinate3726);  
                    stream_105.add(char_literal465);

                    char_literal466=(Token)match(input,312,FOLLOW_312_in_distanceCoordinate3728);  
                    stream_312.add(char_literal466);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3732);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal467=(Token)match(input,104,FOLLOW_104_in_distanceCoordinate3734);  
                    stream_104.add(char_literal467);

                    // flips.g:622:32: ( '+' )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==311) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // flips.g:622:32: '+'
                            {
                            char_literal468=(Token)match(input,311,FOLLOW_311_in_distanceCoordinate3736);  
                            stream_311.add(char_literal468);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3741);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal469=(Token)match(input,106,FOLLOW_106_in_distanceCoordinate3743);  
                    stream_106.add(char_literal469);



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
                    // 623:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST )
                    {
                        // flips.g:623:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:623:26: ^( DISTANCE $x WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:624:4: '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal470=(Token)match(input,105,FOLLOW_105_in_distanceCoordinate3769);  
                    stream_105.add(char_literal470);

                    // flips.g:624:8: ( '+' )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==311) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // flips.g:624:8: '+'
                            {
                            char_literal471=(Token)match(input,311,FOLLOW_311_in_distanceCoordinate3771);  
                            stream_311.add(char_literal471);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3776);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal472=(Token)match(input,104,FOLLOW_104_in_distanceCoordinate3778);  
                    stream_104.add(char_literal472);

                    char_literal473=(Token)match(input,312,FOLLOW_312_in_distanceCoordinate3780);  
                    stream_312.add(char_literal473);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3784);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal474=(Token)match(input,106,FOLLOW_106_in_distanceCoordinate3786);  
                    stream_106.add(char_literal474);



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
                    // 625:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST )
                    {
                        // flips.g:625:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:625:26: ^( DISTANCE $x EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:626:4: '(' '-' x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal475=(Token)match(input,105,FOLLOW_105_in_distanceCoordinate3812);  
                    stream_105.add(char_literal475);

                    char_literal476=(Token)match(input,312,FOLLOW_312_in_distanceCoordinate3814);  
                    stream_312.add(char_literal476);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3818);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal477=(Token)match(input,104,FOLLOW_104_in_distanceCoordinate3820);  
                    stream_104.add(char_literal477);

                    char_literal478=(Token)match(input,312,FOLLOW_312_in_distanceCoordinate3822);  
                    stream_312.add(char_literal478);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3826);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal479=(Token)match(input,106,FOLLOW_106_in_distanceCoordinate3828);  
                    stream_106.add(char_literal479);



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
                    // 627:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST )
                    {
                        // flips.g:627:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:627:26: ^( DISTANCE $x WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
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
        return retval;
    }
    // $ANTLR end "distanceCoordinate"

    public static class numericValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValue"
    // flips.g:632:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral481=null;
        flipsParser.integerValue_return integerValue480 = null;


        CommonTree FloatingPointLiteral481_tree=null;

        try {
            // flips.g:633:2: ( integerValue | FloatingPointLiteral )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( ((LA177_0>=BinaryLiteral && LA177_0<=HexLiteral)) ) {
                alt177=1;
            }
            else if ( (LA177_0==FloatingPointLiteral) ) {
                alt177=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // flips.g:633:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3862);
                    integerValue480=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue480.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:634:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral481=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3867); 
                    FloatingPointLiteral481_tree = (CommonTree)adaptor.create(FloatingPointLiteral481);
                    adaptor.addChild(root_0, FloatingPointLiteral481_tree);


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
        return retval;
    }
    // $ANTLR end "numericValue"

    public static class integerValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerValue"
    // flips.g:637:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set482=null;

        CommonTree set482_tree=null;

        try {
            // flips.g:638:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set482=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set482));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "integerValue"

    public static class percentValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "percentValue"
    // flips.g:644:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal484=null;
        Token string_literal485=null;
        flipsParser.numericValue_return numericValue483 = null;


        CommonTree char_literal484_tree=null;
        CommonTree string_literal485_tree=null;
        RewriteRuleTokenStream stream_314=new RewriteRuleTokenStream(adaptor,"token 314");
        RewriteRuleTokenStream stream_313=new RewriteRuleTokenStream(adaptor,"token 313");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:645:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // flips.g:645:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3904);
            numericValue483=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue483.getTree());
            // flips.g:645:17: ( '%' | 'percent' )
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==313) ) {
                alt178=1;
            }
            else if ( (LA178_0==314) ) {
                alt178=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;
            }
            switch (alt178) {
                case 1 :
                    // flips.g:645:18: '%'
                    {
                    char_literal484=(Token)match(input,313,FOLLOW_313_in_percentValue3907);  
                    stream_313.add(char_literal484);


                    }
                    break;
                case 2 :
                    // flips.g:645:22: 'percent'
                    {
                    string_literal485=(Token)match(input,314,FOLLOW_314_in_percentValue3909);  
                    stream_314.add(string_literal485);


                    }
                    break;

            }



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
            // 646:2: -> numericValue PERCENT
            {
                adaptor.addChild(root_0, stream_numericValue.nextTree());
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
        return retval;
    }
    // $ANTLR end "percentValue"

    // Delegated rules


    protected DFA38 dfa38 = new DFA38(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA170 dfa170 = new DFA170(this);
    protected DFA176 dfa176 = new DFA176(this);
    static final String DFA38_eotS =
        "\56\uffff";
    static final String DFA38_eofS =
        "\13\uffff\1\12\1\uffff\12\14\2\uffff\20\14\1\uffff\1\51\3\14";
    static final String DFA38_minS =
        "\1\116\1\156\1\uffff\1\126\2\uffff\1\126\4\uffff\1\116\1\uffff\12"+
        "\116\2\u00b4\20\116\1\uffff\4\116";
    static final String DFA38_maxS =
        "\1\u0138\1\u0087\1\uffff\1\u0138\2\uffff\1\u0138\4\uffff\1\u008d"+
        "\1\uffff\12\u00d1\2\u00b6\20\u00d1\1\uffff\1\u008d\3\u00d1";
    static final String DFA38_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10"+
        "\34\uffff\1\11\4\uffff";
    static final String DFA38_specialS =
        "\56\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\13\4\uffff\1\14\2\4\1\6\4\3\16\uffff\1\12\4\uffff\2\12\3"+
            "\uffff\1\2\5\uffff\1\1\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11\2\14"+
            "\155\uffff\1\4\5\uffff\37\4\35\uffff\2\12",
            "\2\12\3\uffff\1\2\6\uffff\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11"+
            "\2\14",
            "",
            "\5\12\15\uffff\1\12\54\uffff\22\14\1\46\1\uffff\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1"+
            "\30\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1"+
            "\50\2\uffff\12\5\6\uffff\5\2\13\uffff\1\12\16\uffff\1\12\5\uffff"+
            "\3\12\60\uffff\4\12\1\uffff\6\12",
            "",
            "",
            "\5\12\15\uffff\1\12\54\uffff\22\14\1\46\1\uffff\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1"+
            "\30\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1"+
            "\50\2\uffff\12\5\45\uffff\1\12\5\uffff\3\12\60\uffff\4\12\1"+
            "\uffff\6\12",
            "",
            "",
            "",
            "",
            "\1\12\7\uffff\1\51\4\52\13\uffff\1\51\12\uffff\2\12\2\uffff"+
            "\4\12\2\uffff\1\51\14\uffff\6\12",
            "",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\53\1\54\1\55",
            "\1\31\1\32\1\33",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "",
            "\1\51\10\uffff\4\51\26\uffff\2\51\2\12\4\51\17\uffff\6\51",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5",
            "\1\14\10\uffff\4\14\26\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\102\uffff\2\5"
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
            return "178:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );";
        }
    }
    static final String DFA45_eotS =
        "\122\uffff";
    static final String DFA45_eofS =
        "\17\uffff\12\5\2\uffff\20\5\5\uffff\12\13\2\uffff\20\13\3\5\3\13";
    static final String DFA45_minS =
        "\1\117\1\123\1\uffff\2\u00a7\2\uffff\1\123\2\uffff\1\116\1\uffff"+
        "\2\u0095\1\uffff\12\116\2\u00b4\20\116\1\u0086\2\126\2\uffff\12"+
        "\116\2\u00b4\26\116";
    static final String DFA45_maxS =
        "\1\u0129\1\u0094\1\uffff\2\u013a\2\uffff\1\u0094\2\uffff\1\u0138"+
        "\1\uffff\2\u013a\1\uffff\12\u0129\2\u00b6\20\u0129\1\u0090\2\u0138"+
        "\2\uffff\12\u0129\2\u00b6\26\u0129";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\2\uffff"+
        "\1\3\37\uffff\1\10\1\1\42\uffff";
    static final String DFA45_specialS =
        "\122\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\12\1\1\1\uffff\1\7\1\uffff\2\2\1\4\4\3\47\uffff\2\6\2\10"+
            "\11\uffff\2\6\125\uffff\1\13\16\uffff\1\2\4\uffff\1\11\37\2"+
            "\12\13\6\5",
            "\1\13\2\uffff\1\15\4\14\53\uffff\2\13\6\uffff\1\13\3\uffff"+
            "\3\13",
            "",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\12\16\151\uffff\2\16",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\12\16\151\uffff\2\16",
            "",
            "",
            "\1\13\2\uffff\5\13\53\uffff\2\13\6\uffff\1\53\3\uffff\3\13",
            "",
            "",
            "\1\56\4\uffff\1\13\2\uffff\1\55\4\54\16\uffff\1\56\34\uffff"+
            "\2\13\6\uffff\1\13\3\uffff\3\13\u00a2\uffff\2\56",
            "",
            "\22\13\1\111\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71\1\72\1\74\1\75\1\76\1\73\1\77\1\100\1\101\1\102\1"+
            "\103\1\104\1\105\1\106\1\107\1\110\1\112\1\113\2\uffff\12\16"+
            "\6\uffff\5\57\136\uffff\2\16",
            "\22\13\1\111\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71\1\72\1\74\1\75\1\76\1\73\1\77\1\100\1\101\1\102\1"+
            "\103\1\104\1\105\1\106\1\107\1\110\1\112\1\113\2\uffff\12\16"+
            "\151\uffff\2\16",
            "",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\1\114\1\115\1\116",
            "\1\33\1\34\1\35",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\2\13\7\uffff\2\6",
            "\5\56\15\uffff\1\56\54\uffff\23\13\1\uffff\33\13\42\uffff\1"+
            "\56\16\uffff\1\56\5\uffff\3\56\60\uffff\4\56\1\uffff\6\56",
            "\5\56\15\uffff\1\56\54\uffff\23\13\1\uffff\33\13\61\uffff\1"+
            "\56\5\uffff\3\56\60\uffff\4\56\1\uffff\6\56",
            "",
            "",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\1\117\1\120\1\121",
            "\1\74\1\75\1\76",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\5\1\uffff\1\5\1\uffff\7\5\26\uffff\2\5\2\uffff\4\5\11\uffff"+
            "\4\5\2\uffff\6\5\1\uffff\2\5\77\uffff\2\16\24\uffff\1\5\16\uffff"+
            "\1\5\4\uffff\60\5",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13",
            "\3\13\1\uffff\1\13\1\uffff\7\13\26\uffff\2\13\2\uffff\4\13"+
            "\11\uffff\4\13\2\uffff\6\13\1\uffff\2\13\77\uffff\2\16\24\uffff"+
            "\1\13\16\uffff\1\13\4\uffff\60\13"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "204:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA50_eotS =
        "\u0091\uffff";
    static final String DFA50_eofS =
        "\55\uffff\12\10\2\uffff\20\10\3\uffff\12\10\2\uffff\23\10\1\5\3"+
        "\10\2\uffff\12\10\2\uffff\20\10\1\5\3\10";
    static final String DFA50_minS =
        "\1\117\1\116\2\u00a7\2\uffff\1\123\2\uffff\2\126\2\uffff\12\u00a8"+
        "\2\u00b4\20\u00a8\1\126\2\u0095\1\uffff\12\116\2\u00b4\20\116\3"+
        "\u00a8\12\116\2\u00b4\27\116\1\163\1\u00a7\12\116\2\u00b4\24\116";
    static final String DFA50_maxS =
        "\1\u012d\1\u0138\2\u013a\2\uffff\1\u00a8\2\uffff\2\u013a\2\uffff"+
        "\12\u00d1\2\u00b6\20\u00d1\1\u00a8\2\u00c3\1\uffff\12\u012d\2\u00b6"+
        "\20\u012d\3\u00d1\12\u012d\2\u00b6\27\u012d\2\u013a\12\u012d\2\u00b6"+
        "\24\u012d";
    static final String DFA50_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\1\2\37\uffff\1\1\144"+
        "\uffff";
    static final String DFA50_specialS =
        "\u0091\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\10\1\1\1\uffff\1\6\1\uffff\1\4\1\uffff\1\3\4\2\67\uffff\1"+
            "\5\24\uffff\2\5\75\uffff\1\10\23\uffff\1\7\37\uffff\12\10\6"+
            "\uffff\4\4",
            "\1\13\4\uffff\1\10\2\uffff\1\12\4\11\16\uffff\1\13\34\uffff"+
            "\2\10\6\uffff\1\10\3\uffff\3\10\u00a2\uffff\2\13",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\12\14\151\uffff\2\14",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\12\14\151\uffff\2\14",
            "",
            "",
            "\1\10\2\uffff\1\53\4\52\53\uffff\2\10\6\uffff\1\10\3\uffff"+
            "\1\51\2\10\23\uffff\1\5",
            "",
            "",
            "\5\13\15\uffff\1\13\54\uffff\22\10\1\106\1\uffff\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73"+
            "\1\70\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\107\1\110\2\uffff\12\14\6\uffff\5\54\13\uffff\1\13\16\uffff"+
            "\1\13\5\uffff\3\13\60\uffff\4\13\1\uffff\6\13\2\14",
            "\5\13\15\uffff\1\13\54\uffff\22\10\1\106\1\uffff\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73"+
            "\1\70\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\107\1\110\2\uffff\12\14\45\uffff\1\13\5\uffff\3\13\60\uffff"+
            "\4\13\1\uffff\6\13\2\14",
            "",
            "",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\111\1\112\1\113",
            "\1\31\1\32\1\33",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\5\5\70\uffff\2\10\23\uffff\1\5",
            "\22\10\1\145\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\130\1\131\1\132\1\127\1\133\1"+
            "\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\146\1"+
            "\147",
            "\22\10\1\145\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\130\1\131\1\132\1\127\1\133\1"+
            "\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\146\1"+
            "\147",
            "",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\1\150\1\151\1\152",
            "\1\71\1\72\1\73",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\1\5\47\uffff\2\14",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\1\154\1\155\1\156",
            "\1\130\1\131\1\132",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\2\10\47\uffff"+
            "\2\14\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\160\4\157\26\uffff\2"+
            "\5\2\uffff\4\5\17\uffff\6\5\3\uffff\1\10\1\5\24\uffff\2\5\75"+
            "\uffff\1\5\23\uffff\1\5\37\uffff\12\5\6\uffff\4\5",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\153"+
            "\75\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff\4\10",
            "\2\5\62\uffff\1\u008a\1\uffff\1\161\1\162\1\163\1\164\1\165"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\174"+
            "\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087"+
            "\1\u0088\1\u0089\1\u008b\1\u008c\2\uffff\12\5\151\uffff\2\5",
            "\1\u008a\1\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167"+
            "\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\174\1\u0080\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089"+
            "\1\u008b\1\u008c\2\uffff\12\5\151\uffff\2\5",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\1\u008e\1\u008f\1\u0090",
            "\1\175\1\176\1\177",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\160\4\157\26\uffff\2"+
            "\5\2\uffff\4\5\17\uffff\6\5\3\uffff\1\10\1\5\24\uffff\2\5\75"+
            "\uffff\1\5\23\uffff\1\5\37\uffff\12\5\6\uffff\4\5",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10",
            "\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\26\uffff\2\10"+
            "\2\uffff\4\10\17\uffff\6\10\4\uffff\1\10\24\uffff\1\10\1\u008d"+
            "\47\uffff\2\5\24\uffff\1\10\23\uffff\1\10\37\uffff\12\10\6\uffff"+
            "\4\10"
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "231:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA60_eotS =
        "\16\uffff";
    static final String DFA60_eofS =
        "\16\uffff";
    static final String DFA60_minS =
        "\14\117\2\uffff";
    static final String DFA60_maxS =
        "\1\u0123\13\132\2\uffff";
    static final String DFA60_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA60_specialS =
        "\16\uffff}>";
    static final String[] DFA60_transitionS = {
            "\2\14\1\uffff\1\14\u0093\uffff\1\10\63\uffff\1\1\1\2\1\3\1\4"+
            "\1\5\1\6\1\7\1\11\1\12\1\13",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "\1\14\3\uffff\1\15\2\uffff\5\15",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "272:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA95_eotS =
        "\126\uffff";
    static final String DFA95_eofS =
        "\6\uffff\12\56\46\uffff\40\56";
    static final String DFA95_minS =
        "\1\120\1\126\4\u00a7\12\116\12\u00d0\2\u00b4\20\u00d0\2\u00c4\3"+
        "\uffff\2\u00b8\3\u00d0\40\116";
    static final String DFA95_maxS =
        "\2\132\4\u013a\12\u012d\12\u00d1\2\u00b6\20\u00d1\2\u00d5\3\uffff"+
        "\2\u00f9\3\u00d1\40\u012d";
    static final String DFA95_acceptS =
        "\56\uffff\1\1\1\3\1\2\45\uffff";
    static final String DFA95_specialS =
        "\126\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\5\uffff\1\3\4\2",
            "\1\5\4\4",
            "\1\51\1\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\34\1\35\1\36\1\33\1\37\1\40\1\41\1\42\1\43\1\44"+
            "\1\45\1\46\1\47\1\50\1\52\1\53\2\uffff\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\1\14\1\15\1\16\1\17\151\uffff\1\54\1\55",
            "\1\51\1\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\34\1\35\1\36\1\33\1\37\1\40\1\41\1\42\1\43\1\44"+
            "\1\45\1\46\1\47\1\50\1\52\1\53\2\uffff\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\1\14\1\15\1\16\1\17\151\uffff\1\54\1\55",
            "\1\56\1\uffff\33\56\2\uffff\12\56\151\uffff\2\57",
            "\1\56\1\uffff\33\56\2\uffff\12\56\151\uffff\2\57",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\63\1\64\1\65",
            "\1\34\1\35\1\36",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\2\60\14\uffff\4\57",
            "\2\60\14\uffff\4\57",
            "",
            "",
            "",
            "\1\73\42\uffff\1\66\1\67\1\70\1\71\1\72\1\74\1\75\1\76\1\77"+
            "\1\100\1\101\1\102\1\103\1\104\1\123\1\124\1\125\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120"+
            "\1\121\1\122",
            "\1\73\42\uffff\1\66\1\67\1\70\1\71\1\72\1\74\1\75\1\76\1\77"+
            "\1\100\1\101\1\102\1\103\1\104\1\123\1\124\1\125\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120"+
            "\1\121\1\122",
            "\1\61\1\62",
            "\1\61\1\62",
            "\1\61\1\62",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56",
            "\3\56\1\uffff\1\56\1\uffff\7\56\26\uffff\2\56\2\uffff\4\56"+
            "\11\uffff\4\56\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff"+
            "\2\56\33\uffff\2\60\40\uffff\1\56\16\uffff\1\56\4\uffff\64\56"
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "354:1: speed : ( fixedSpeed | relativeSpeed | throttleSpeed );";
        }
    }
    static final String DFA97_eotS =
        "\124\uffff";
    static final String DFA97_eofS =
        "\124\uffff";
    static final String DFA97_minS =
        "\1\126\2\u00a7\12\u00c4\12\u00d0\2\u00b4\20\u00d0\2\u00c4\2\uffff"+
        "\2\u00b8\3\u00d0\2\uffff\40\u00c4";
    static final String DFA97_maxS =
        "\1\132\2\u013a\12\u00c5\12\u00d1\2\u00b6\20\u00d1\2\u00c5\2\uffff"+
        "\2\u00f9\3\u00d1\2\uffff\40\u00c5";
    static final String DFA97_acceptS =
        "\53\uffff\1\2\1\1\5\uffff\1\4\1\3\40\uffff";
    static final String DFA97_specialS =
        "\124\uffff}>";
    static final String[] DFA97_transitionS = {
            "\1\2\4\1",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\1\13\1\14\151\uffff\1\51\1\52",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\1\13\1\14\151\uffff\1\51\1\52",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\57\1\60\1\61",
            "\1\31\1\32\1\33",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\63\1\62",
            "\1\63\1\62",
            "",
            "",
            "\1\71\42\uffff\1\64\1\65\1\66\1\67\1\70\1\72\1\73\1\74\1\75"+
            "\1\76\1\77\1\100\1\101\1\102\1\121\1\122\1\123\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1"+
            "\117\1\120",
            "\1\71\42\uffff\1\64\1\65\1\66\1\67\1\70\1\72\1\73\1\74\1\75"+
            "\1\76\1\77\1\100\1\101\1\102\1\121\1\122\1\123\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1"+
            "\117\1\120",
            "\1\55\1\56",
            "\1\55\1\56",
            "\1\55\1\56",
            "",
            "",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53",
            "\1\54\1\53"
    };

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "365:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA107_eotS =
        "\14\uffff";
    static final String DFA107_eofS =
        "\5\uffff\1\7\4\uffff\2\7";
    static final String DFA107_minS =
        "\1\127\1\u00d6\1\uffff\1\127\1\uffff\1\116\2\uffff\1\126\1\uffff"+
        "\2\116";
    static final String DFA107_maxS =
        "\1\132\1\u00da\1\uffff\1\132\1\uffff\1\u012d\2\uffff\1\132\1\uffff"+
        "\2\u012d";
    static final String DFA107_acceptS =
        "\2\uffff\1\4\1\uffff\1\2\1\uffff\1\3\1\5\1\uffff\1\1\2\uffff";
    static final String DFA107_specialS =
        "\14\uffff}>";
    static final String[] DFA107_transitionS = {
            "\4\1",
            "\2\4\2\2\1\3",
            "",
            "\4\5",
            "",
            "\3\7\1\uffff\1\7\1\uffff\7\7\26\uffff\2\7\2\uffff\4\7\11\uffff"+
            "\4\7\2\uffff\6\7\1\uffff\2\7\1\uffff\1\7\24\uffff\2\7\55\uffff"+
            "\2\11\2\6\1\10\13\uffff\1\7\16\uffff\1\7\4\uffff\64\7",
            "",
            "",
            "\1\13\4\12",
            "",
            "\3\7\1\uffff\1\7\1\uffff\7\7\26\uffff\2\7\2\uffff\4\7\11\uffff"+
            "\4\7\2\uffff\6\7\1\uffff\2\7\1\uffff\1\7\24\uffff\2\7\55\uffff"+
            "\2\11\2\6\14\uffff\1\7\16\uffff\1\7\4\uffff\64\7",
            "\3\7\1\uffff\1\7\1\uffff\7\7\26\uffff\2\7\2\uffff\4\7\11\uffff"+
            "\4\7\2\uffff\6\7\1\uffff\2\7\1\uffff\1\7\24\uffff\2\7\55\uffff"+
            "\2\11\2\6\14\uffff\1\7\16\uffff\1\7\4\uffff\64\7"
    };

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "412:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA119_eotS =
        "\32\uffff";
    static final String DFA119_eofS =
        "\3\uffff\5\2\1\uffff\4\2\4\uffff\4\25\5\uffff";
    static final String DFA119_minS =
        "\1\126\1\u00b8\1\uffff\5\116\1\uffff\4\116\1\163\1\u00a7\1\163\1"+
        "\u00a7\4\116\2\uffff\1\163\1\u00a7\1\uffff";
    static final String DFA119_maxS =
        "\1\132\1\u00f9\1\uffff\5\u012d\1\uffff\4\u012d\4\u013a\4\u012d\2"+
        "\uffff\2\u013a\1\uffff";
    static final String DFA119_acceptS =
        "\2\uffff\1\1\5\uffff\1\5\14\uffff\1\2\1\4\2\uffff\1\3";
    static final String DFA119_specialS =
        "\32\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\2\4\1",
            "\1\2\41\uffff\1\10\21\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\13"+
            "\1\14\5\2",
            "",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\75\uffff\1\2\16\uffff\1\2\4\uffff\64\2",
            "\2\2\62\uffff\1\2\1\uffff\33\2\2\uffff\12\2\41\uffff\1\21\1"+
            "\22\1\23\1\24\5\25\77\uffff\2\2",
            "\1\2\1\uffff\33\2\2\uffff\12\2\41\uffff\11\25\77\uffff\2\2",
            "\2\2\62\uffff\1\2\1\uffff\33\2\2\uffff\12\2\45\uffff\5\26\77"+
            "\uffff\2\2",
            "\1\2\1\uffff\33\2\2\uffff\12\2\45\uffff\5\26\77\uffff\2\2",
            "\3\25\1\uffff\1\25\1\uffff\2\25\1\30\4\27\26\uffff\2\25\2\uffff"+
            "\4\25\11\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24"+
            "\uffff\2\25\75\uffff\1\25\16\uffff\1\25\4\uffff\64\25",
            "\3\25\1\uffff\1\25\1\uffff\2\25\1\30\4\27\26\uffff\2\25\2\uffff"+
            "\4\25\11\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24"+
            "\uffff\2\25\75\uffff\1\25\16\uffff\1\25\4\uffff\64\25",
            "\3\25\1\uffff\1\25\1\uffff\2\25\1\30\4\27\26\uffff\2\25\2\uffff"+
            "\4\25\11\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24"+
            "\uffff\2\25\75\uffff\1\25\16\uffff\1\25\4\uffff\64\25",
            "\3\25\1\uffff\1\25\1\uffff\2\25\1\30\4\27\26\uffff\2\25\2\uffff"+
            "\4\25\11\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24"+
            "\uffff\2\25\75\uffff\1\25\16\uffff\1\25\4\uffff\64\25",
            "",
            "",
            "\2\25\62\uffff\1\25\1\uffff\33\25\2\uffff\12\25\45\uffff\5"+
            "\31\77\uffff\2\25",
            "\1\25\1\uffff\33\25\2\uffff\12\25\45\uffff\5\31\77\uffff\2"+
            "\25",
            ""
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "468:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA170_eotS =
        "\64\uffff";
    static final String DFA170_eofS =
        "\64\uffff";
    static final String DFA170_minS =
        "\17\126\3\uffff\4\126\2\u0132\13\126\1\uffff\10\126\1\uffff\1\126"+
        "\4\u0132\2\126";
    static final String DFA170_maxS =
        "\3\u0138\2\132\10\u0138\1\132\1\u0138\3\uffff\4\u0138\2\u0132\4"+
        "\u0138\1\132\4\u0138\1\132\1\u0138\1\uffff\10\u0138\1\uffff\1\u0138"+
        "\4\u0132\2\u0138";
    static final String DFA170_acceptS =
        "\17\uffff\1\2\1\1\1\4\21\uffff\1\3\10\uffff\1\5\7\uffff";
    static final String DFA170_specialS =
        "\64\uffff}>";
    static final String[] DFA170_transitionS = {
            "\1\2\4\1\u00dc\uffff\1\3\1\4",
            "\5\17\15\uffff\1\16\175\uffff\1\15\16\uffff\1\20\5\uffff\3"+
            "\20\60\uffff\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13\1\14\1"+
            "\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\60\uffff"+
            "\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13\1\14\1\17\1\21",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\1\27\4\26",
            "\5\17\u00dc\uffff\1\17\1\21",
            "",
            "",
            "",
            "\5\17\15\uffff\1\16\175\uffff\1\34\107\uffff\1\30\1\31\1\32"+
            "\1\33\1\uffff\1\35\1\36\1\37\1\40\1\17\1\21",
            "\5\17\15\uffff\1\16\u00c5\uffff\1\30\1\31\1\32\1\33\1\uffff"+
            "\1\35\1\36\1\37\1\40\1\17\1\21",
            "\5\43\15\uffff\1\42\175\uffff\1\41\107\uffff\1\44\1\45\1\46"+
            "\1\47\1\uffff\1\50\1\51\1\52\1\53\1\43\1\54",
            "\5\43\15\uffff\1\42\u00c5\uffff\1\44\1\45\1\46\1\47\1\uffff"+
            "\1\50\1\51\1\52\1\53\1\43\1\54",
            "\1\55",
            "\1\55",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\1\57\4\56",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\1\61\4\60",
            "\5\43\u00dc\uffff\1\43\1\54",
            "",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54",
            "",
            "\5\17\15\uffff\1\16\u008c\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\17\1\21",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\17\15\uffff\1\16\u00ce\uffff\1\17\1\21",
            "\5\43\15\uffff\1\42\u00ce\uffff\1\43\1\54"
    };

    static final short[] DFA170_eot = DFA.unpackEncodedString(DFA170_eotS);
    static final short[] DFA170_eof = DFA.unpackEncodedString(DFA170_eofS);
    static final char[] DFA170_min = DFA.unpackEncodedStringToUnsignedChars(DFA170_minS);
    static final char[] DFA170_max = DFA.unpackEncodedStringToUnsignedChars(DFA170_maxS);
    static final short[] DFA170_accept = DFA.unpackEncodedString(DFA170_acceptS);
    static final short[] DFA170_special = DFA.unpackEncodedString(DFA170_specialS);
    static final short[][] DFA170_transition;

    static {
        int numStates = DFA170_transitionS.length;
        DFA170_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA170_transition[i] = DFA.unpackEncodedString(DFA170_transitionS[i]);
        }
    }

    class DFA170 extends DFA {

        public DFA170(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 170;
            this.eot = DFA170_eot;
            this.eof = DFA170_eof;
            this.min = DFA170_min;
            this.max = DFA170_max;
            this.accept = DFA170_accept;
            this.special = DFA170_special;
            this.transition = DFA170_transition;
        }
        public String getDescription() {
            return "600:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA176_eotS =
        "\114\uffff";
    static final String DFA176_eofS =
        "\114\uffff";
    static final String DFA176_minS =
        "\1\151\3\126\4\u00a7\12\150\2\u00b4\32\150\2\u00b4\20\150\1\126"+
        "\3\150\1\126\3\150\4\uffff";
    static final String DFA176_maxS =
        "\1\151\1\u0138\2\132\4\u00c3\12\150\2\u00b6\32\150\2\u00b6\20\150"+
        "\1\u0138\3\150\1\u0138\3\150\4\uffff";
    static final String DFA176_acceptS =
        "\110\uffff\1\3\1\1\1\4\1\2";
    static final String DFA176_specialS =
        "\114\uffff}>";
    static final String[] DFA176_transitionS = {
            "\1\1",
            "\1\5\4\4\u00dc\uffff\1\3\1\2",
            "\1\7\4\6",
            "\1\5\4\4",
            "\1\41\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\24\1\25\1\26\1\23\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\1\36\1\37\1\40\1\42\1\43",
            "\1\41\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\24\1\25\1\26\1\23\1\27\1\30\1\31\1\32\1\33\1\34"+
            "\1\35\1\36\1\37\1\40\1\42\1\43",
            "\1\75\1\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\60\1\61\1\62\1\57\1\63\1\64\1\65\1\66\1\67\1\70"+
            "\1\71\1\72\1\73\1\74\1\76\1\77",
            "\1\75\1\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\60\1\61\1\62\1\57\1\63\1\64\1\65\1\66\1\67\1\70"+
            "\1\71\1\72\1\73\1\74\1\76\1\77",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\101\1\102\1\103",
            "\1\24\1\25\1\26",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\105\1\106\1\107",
            "\1\60\1\61\1\62",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\5\111\u00dc\uffff\1\111\1\110",
            "\1\100",
            "\1\100",
            "\1\100",
            "\5\113\u00dc\uffff\1\113\1\112",
            "\1\104",
            "\1\104",
            "\1\104",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA176_eot = DFA.unpackEncodedString(DFA176_eotS);
    static final short[] DFA176_eof = DFA.unpackEncodedString(DFA176_eofS);
    static final char[] DFA176_min = DFA.unpackEncodedStringToUnsignedChars(DFA176_minS);
    static final char[] DFA176_max = DFA.unpackEncodedStringToUnsignedChars(DFA176_maxS);
    static final short[] DFA176_accept = DFA.unpackEncodedString(DFA176_acceptS);
    static final short[] DFA176_special = DFA.unpackEncodedString(DFA176_specialS);
    static final short[][] DFA176_transition;

    static {
        int numStates = DFA176_transitionS.length;
        DFA176_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA176_transition[i] = DFA.unpackEncodedString(DFA176_transitionS[i]);
        }
    }

    class DFA176 extends DFA {

        public DFA176(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 176;
            this.eot = DFA176_eot;
            this.eof = DFA176_eof;
            this.min = DFA176_min;
            this.max = DFA176_max;
            this.accept = DFA176_accept;
            this.special = DFA176_special;
            this.transition = DFA176_transition;
        }
        public String getDescription() {
            return "619:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan421 = new BitSet(new long[]{0x0000000000000002L,0x0007F83800004000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_statement_in_flightPlan424 = new BitSet(new long[]{0x0000000000000002L,0x0006000000004000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_defineCommand_in_define451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_defineCommand473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_100_in_defineCommand475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_101_in_defineCommand477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue496 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue498 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue500 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_104_in_defineCommandValue506 = new BitSet(new long[]{0x0000000000000000L,0x0000008000004000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue513 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue515 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue517 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue540 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue542 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue546 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineCommandValue548 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue552 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue554 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_104_in_defineCommandValue560 = new BitSet(new long[]{0x0000000000000000L,0x0000008000004000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue567 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue569 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue573 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineCommandValue575 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue579 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue581 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_107_in_defineSensor617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_108_in_defineSensor619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_109_in_defineSensor621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue640 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineSensorValue642 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue646 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_103_in_defineSensorValue650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_104_in_defineSensorValue652 = new BitSet(new long[]{0x0000000000000000L,0x0000008000004000L});
    public static final BitSet FOLLOW_103_in_defineSensorValue654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue659 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineSensorValue661 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue665 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_110_in_defineWaypoint696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_111_in_defineWaypoint698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_112_in_defineWaypoint700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue719 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineWaypointValue721 = new BitSet(new long[]{0x0000000000000000L,0x0000020007C00000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue723 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_103_in_defineWaypointValue727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_104_in_defineWaypointValue729 = new BitSet(new long[]{0x0000000000000000L,0x0000008000004000L});
    public static final BitSet FOLLOW_103_in_defineWaypointValue731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue736 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineWaypointValue738 = new BitSet(new long[]{0x0000000000000000L,0x0000020007C00000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue740 = new BitSet(new long[]{0x0000000000000002L,0x0000018000004000L});
    public static final BitSet FOLLOW_command_in_statement767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_statement772 = new BitSet(new long[]{0x0000000000000000L,0x01E6000007804000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_statement_in_statement774 = new BitSet(new long[]{0x0000000000000000L,0x01E6000007804000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_repeat_in_statement777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_statement782 = new BitSet(new long[]{0x0000000000000000L,0x01E6000007804000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_condition_in_statement784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_repeat795 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_repeat797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_repeat806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_duration_in_repeat808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_repeat813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_repeat818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_condition829 = new BitSet(new long[]{0x0000000000000000L,0xF608C20007F84000L,0x00000000000000FFL,0xF820000000000000L,0x0180000003FFFFFFL});
    public static final BitSet FOLLOW_conditionValue_in_condition831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_condition836 = new BitSet(new long[]{0x0000000000000000L,0xF608C20007F84000L,0x00000000000000FFL,0xF820000000000000L,0x0180000003FFFFFFL});
    public static final BitSet FOLLOW_conditionValue_in_condition838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue850 = new BitSet(new long[]{0x0000000000000000L,0x0408000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue853 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue859 = new BitSet(new long[]{0x0000000000000000L,0x0608000007800000L});
    public static final BitSet FOLLOW_timeValue_in_conditionValue867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue873 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue876 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue882 = new BitSet(new long[]{0x0000000000000000L,0x3200000000300000L,0x0000000000000000L,0xF820000000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_fixedDirection_in_conditionValue890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue896 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue899 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue905 = new BitSet(new long[]{0x0000000000000000L,0xC200000007C00000L});
    public static final BitSet FOLLOW_speedValue_in_conditionValue913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_conditionValue922 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue928 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_conditionValue935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_conditionValue944 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue950 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_conditionValue966 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue972 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue985 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue988 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue994 = new BitSet(new long[]{0x0000000000000000L,0x0200C20007C04000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_waypoint_in_conditionValue1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_conditionValue1008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_conditionValue1011 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1017 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_altitudeValue_in_conditionValue1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_conditionValue1030 = new BitSet(new long[]{0x0000000000000000L,0x0800004007C00000L});
    public static final BitSet FOLLOW_set_in_conditionValue1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_numericValue_in_conditionValue1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flyCommand_in_command1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_flyCommand1079 = new BitSet(new long[]{0x0000000000000002L,0xF200000007F58000L,0x000000000001803CL,0xFC20004000000000L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_137_in_flyCommand1081 = new BitSet(new long[]{0x0000000000000002L,0xF200000007F58000L,0x000000000001803CL,0xFC20004000000000L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand1084 = new BitSet(new long[]{0x0000000000000002L,0xF200000007F58000L,0x000000000001803CL,0xFC20004000000000L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_time_in_flyCommandValue1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue1141 = new BitSet(new long[]{0x0000000000000000L,0x0200C20007C04000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1143 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_103_in_flyCommandValue1147 = new BitSet(new long[]{0x0000000000000000L,0x0200C20007C04000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_104_in_flyCommandValue1149 = new BitSet(new long[]{0x0000000000000000L,0x0200C28007C04000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_103_in_flyCommandValue1151 = new BitSet(new long[]{0x0000000000000000L,0x0200C20007C04000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1155 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_turnCommand1180 = new BitSet(new long[]{0x0000000000000002L,0x3200000000300000L,0x0000000000000000L,0xF820000000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_139_in_turnCommand1182 = new BitSet(new long[]{0x0000000000000002L,0x3200000000300000L,0x0000000000000000L,0xF820000000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand1185 = new BitSet(new long[]{0x0000000000000002L,0x3200000000300000L,0x0000000000000000L,0xF820000000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_direction_in_turnCommandValue1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_loiterCommand1219 = new BitSet(new long[]{0x0000000000000002L,0xF200000007F58000L,0x000001800005803CL,0xFC20004000000000L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_141_in_loiterCommand1221 = new BitSet(new long[]{0x0000000000000002L,0xF200000007F58000L,0x000001800005803CL,0xFC20004000000000L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand1224 = new BitSet(new long[]{0x0000000000000002L,0xF200000007F58000L,0x000001800005803CL,0xFC20004000000000L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_time_in_loiterCommandValue1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue1271 = new BitSet(new long[]{0x0000000000000000L,0x0200C20007C04000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1308 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_executeCommand1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C20000L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand1312 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_104_in_executeCommand1315 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C20000L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand1317 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_106_in_executeCommand1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_executeCommandParameter1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_pitch1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_131_in_pitch1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_pitch1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_143_in_pitch1409 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000020000L});
    public static final BitSet FOLLOW_144_in_pitch1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_pitch1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_roll1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_133_in_roll1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_angularValue_in_roll1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1485 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000001C40C0L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1487 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000001C40C0L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1489 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000001C40C0L});
    public static final BitSet FOLLOW_142_in_fixedAltitude1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_fixedAltitude1498 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000200C0L});
    public static final BitSet FOLLOW_135_in_fixedAltitude1500 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000200C0L});
    public static final BitSet FOLLOW_146_in_fixedAltitude1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_147_in_fixedAltitude1507 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000200C0L});
    public static final BitSet FOLLOW_148_in_fixedAltitude1509 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000200C0L});
    public static final BitSet FOLLOW_145_in_fixedAltitude1513 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1540 = new BitSet(new long[]{0x0000000000000000L,0x0200000007C80000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000007FFFE00000L});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_pressureUnit1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_pressureUnit1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pressureUnit1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pressureUnit1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pressureUnit1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pressureUnit1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_pressureUnit1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_pressureUnit1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_pressureUnit1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pressureUnit1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_pressureUnit1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_pressureUnit1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pressureUnit1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pressureUnit1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pressureUnit1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_pressureUnit1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_pressureUnit1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_pressureUnit1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_radius1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000010000040000L});
    public static final BitSet FOLLOW_With_in_radius1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000010000040000L});
    public static final BitSet FOLLOW_146_in_radius1732 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_radius1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_radius1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_radius1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFFFFE8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_distanceUnit1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_distanceUnit1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_distanceUnit1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_distanceUnit1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_distanceUnit1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_distanceUnit1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_distanceUnit1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_distanceUnit1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_distanceUnit1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_distanceUnit1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_distanceUnit1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_180_in_distanceUnit1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_distanceUnit1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_distanceUnit1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_distanceUnit1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_180_in_distanceUnit1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_distanceUnit1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_distanceUnit1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_distanceUnit1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_distanceUnit1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_distanceUnit1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_distanceUnit1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_distanceUnit1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_distanceUnit1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_distanceUnit1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_distanceUnit1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_distanceUnit1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_distanceUnit1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_distanceUnit1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_distanceUnit1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_distanceUnit1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1993 = new BitSet(new long[]{0x0000000000000000L,0xC200000007C00000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_relativeSpeed2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_197_in_relativeSpeed2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_relativeSpeed2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed2078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_197_in_relativeSpeed2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFFFFE8000000000L,0x000000000000FFCFL});
    public static final BitSet FOLLOW_speedUnit_in_speedValue2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_speedUnit2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_speedUnit2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_speedUnit2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_speedUnit2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_speedUnit2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_speedUnit2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_speedUnit2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_speedUnit2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_speedUnit2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_speedUnit2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit2201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_208_in_speedUnit2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L,0x03FFFFFFF8000000L});
    public static final BitSet FOLLOW_209_in_speedUnit2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L,0x03FFFFFFF8000000L});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed2227 = new BitSet(new long[]{0x0000000000000000L,0xC200000007C10000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_210_in_throttleSpeed2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_throttleSpeed2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_throttleSpeed2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_throttleSpeed2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time2275 = new BitSet(new long[]{0x0000000000000000L,0x0608000007800000L});
    public static final BitSet FOLLOW_timeValue_in_time2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_214_in_timeValue2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_timeValue2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_214_in_timeValue2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_timeValue2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_216_in_timeValue2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_timeValue2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_216_in_timeValue2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_timeValue2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_218_in_timeFormat2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_218_in_timeFormat2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_218_in_timeFormat2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_timeUnit2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_timeUnit2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_timeUnit2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_timeUnit2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_timeUnit2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_timeUnit2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_timeUnit2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_timeUnit2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_timeUnit2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_timeUnit2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_timeUnit2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_timeUnit2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_timeUnit2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_timeUnit2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_timeUnit2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_timeUnit2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_timeUnit2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_timeUnit2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_hour2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_hour2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_hour2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_hour2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_hour2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_minute2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_minute2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_minute2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_minute2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_second2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_second2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_second2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_second2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_second2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_duration2655 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_durationValue_in_duration2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L,0x03FFFFFFF8000000L});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001F00000000000L});
    public static final BitSet FOLLOW_hour_in_durationValue2686 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x03FE000000000000L});
    public static final BitSet FOLLOW_minute_in_durationValue2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001F00000000000L});
    public static final BitSet FOLLOW_hour_in_durationValue2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x001E000000000000L});
    public static final BitSet FOLLOW_minute_in_durationValue2705 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x03E0000000000000L});
    public static final BitSet FOLLOW_second_in_durationValue2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x001E000000000000L});
    public static final BitSet FOLLOW_minute_in_durationValue2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x03E0000000000000L});
    public static final BitSet FOLLOW_second_in_durationValue2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0xF820000000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0xF820000000000000L,0x0000000003FFFFFFL});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2852 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_northSouthDirection2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_northSouthDirection2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_northSouthDirection2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_northSouthDirection2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_eastWestDirection2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_eastWestDirection2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_eastWestDirection2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_eastWestDirection2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_ordinalDirection2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_ordinalDirection2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_ordinalDirection2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_ordinalDirection2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_ordinalDirection2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_ordinalDirection2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_264_in_ordinalDirection3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_ordinalDirection3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_subOrdinalDirection3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_subOrdinalDirection3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_subOrdinalDirection3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_subOrdinalDirection3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_subOrdinalDirection3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_subOrdinalDirection3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_subOrdinalDirection3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_273_in_subOrdinalDirection3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_274_in_subOrdinalDirection3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_275_in_subOrdinalDirection3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_276_in_subOrdinalDirection3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_277_in_subOrdinalDirection3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_278_in_subOrdinalDirection3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_279_in_subOrdinalDirection3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_280_in_subOrdinalDirection3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_subOrdinalDirection3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection3176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_282_in_upDownDirection3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_283_in_upDownDirection3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_284_in_upDownDirection3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_285_in_upDownDirection3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_286_in_upDownDirection3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_287_in_upDownDirection3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_288_in_upDownDirection3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_upDownDirection3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_289_in_upDownDirection3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_290_in_upDownDirection3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_291_in_upDownDirection3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_292_in_leftRightDirection3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_293_in_leftRightDirection3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_294_in_leftRightDirection3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_295_in_leftRightDirection3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_296_in_leftRightDirection3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_297_in_leftRightDirection3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_298_in_clockDirection3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_299_in_clockDirection3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_300_in_clockDirection3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_301_in_clockDirection3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0003C00000000000L});
    public static final BitSet FOLLOW_302_in_angularValue3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_303_in_angularValue3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_304_in_angularValue3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_305_in_angularValue3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_230_in_angularValue3345 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_306_in_angularValue3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_307_in_angularValue3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_308_in_angularValue3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_309_in_angularValue3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_310_in_angularValue3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3820000000000000L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3458 = new BitSet(new long[]{0x0000000000000000L,0x0000010007C00000L});
    public static final BitSet FOLLOW_104_in_latitudeLongitude3460 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xF820000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_311_in_latitudeLongitude3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3498 = new BitSet(new long[]{0x0000000000000000L,0x0000010007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_104_in_latitudeLongitude3500 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_311_in_latitudeLongitude3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_312_in_latitudeLongitude3534 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3538 = new BitSet(new long[]{0x0000000000000000L,0x0000010007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_104_in_latitudeLongitude3540 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_311_in_latitudeLongitude3543 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_311_in_latitudeLongitude3574 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3579 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_104_in_latitudeLongitude3581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_latitudeLongitude3584 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_312_in_latitudeLongitude3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3618 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_104_in_latitudeLongitude3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_latitudeLongitude3623 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_distanceCoordinate3682 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_311_in_distanceCoordinate3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3689 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_distanceCoordinate3691 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_311_in_distanceCoordinate3693 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3698 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_distanceCoordinate3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_distanceCoordinate3726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_distanceCoordinate3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3732 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_distanceCoordinate3734 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_311_in_distanceCoordinate3736 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3741 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_distanceCoordinate3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_distanceCoordinate3769 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_311_in_distanceCoordinate3771 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3776 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_distanceCoordinate3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_distanceCoordinate3780 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3784 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_distanceCoordinate3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_distanceCoordinate3812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_distanceCoordinate3814 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3818 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_distanceCoordinate3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_distanceCoordinate3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3826 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_distanceCoordinate3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_313_in_percentValue3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_314_in_percentValue3909 = new BitSet(new long[]{0x0000000000000002L});

}