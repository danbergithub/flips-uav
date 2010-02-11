// $ANTLR 3.2 Sep 23, 2009 12:02:23 flips.g 2010-02-10 21:50:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "StringLiteral", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'repeat'", "'wait'", "'time'", "'times'", "'continuously'", "'forever'", "'until'", "'while'", "'the'", "'tim'", "'is'", "'dir'", "'direction'", "'spd'", "'speed'", "'dst'", "'distance'", "'pit'", "'pitch'", "'rol'", "'roll'", "'alt'", "'altitude'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'fps'", "'/'", "'per'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'ms'", "'millisecond'", "'milliseconds'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
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
    public static final int GEOCOORDINATE=31;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=73;
    public static final int T__264=264;
    public static final int FOOT=52;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__300=300;
    public static final int T__163=163;
    public static final int HECTOPASCAL=62;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=44;
    public static final int FASTER=20;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=83;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int MINIMUM=64;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int KILOMETER=45;
    public static final int T__255=255;
    public static final int EQ=76;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__318=318;
    public static final int T__139=139;
    public static final int SENSOR=8;
    public static final int T__319=319;
    public static final int T__138=138;
    public static final int GE=81;
    public static final int T__316=316;
    public static final int T__137=137;
    public static final int T__317=317;
    public static final int T__136=136;
    public static final int T__314=314;
    public static final int T__315=315;
    public static final int T__312=312;
    public static final int T__313=313;
    public static final int FORTNIGHT=35;
    public static final int T__279=279;
    public static final int T__288=288;
    public static final int T__289=289;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int YARD=51;
    public static final int T__282=282;
    public static final int T__283=283;
    public static final int T__322=322;
    public static final int T__141=141;
    public static final int T__280=280;
    public static final int T__321=321;
    public static final int T__142=142;
    public static final int T__281=281;
    public static final int T__320=320;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=86;
    public static final int DURATION=28;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__305=305;
    public static final int T__126=126;
    public static final int CRUISE=66;
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
    public static final int T__303=303;
    public static final int OPTIMAL=22;
    public static final int T__304=304;
    public static final int BinaryLiteral=91;
    public static final int BinaryDigit=97;
    public static final int THROTTLE=23;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=90;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=79;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int T__271=271;
    public static final int METER=46;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__311=311;
    public static final int T__130=130;
    public static final int T__310=310;
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
    public static final int MILLISECOND=41;
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
    public static final int LEFT=54;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=59;
    public static final int T__112=112;
    public static final int CENTIMETER=47;
    public static final int T__210=210;
    public static final int AM=25;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=94;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=84;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=55;
    public static final int RELATIVE=15;
    public static final int EAST=74;
    public static final int HOUR=38;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=18;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=85;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=48;
    public static final int T__227=227;
    public static final int NonZeroDigit=96;
    public static final int NORTH=72;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=71;
    public static final int T__230=230;
    public static final int WEEK=36;
    public static final int LT=78;
    public static final int OctalLiteral=92;
    public static final int LATITUDE=32;
    public static final int ATMOSPHERE=69;
    public static final int DAY=37;
    public static final int Identifier=82;
    public static final int COMMAND=6;
    public static final int Comment=101;
    public static final int MILLIBAR=68;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=57;
    public static final int FlightLevel=87;
    public static final int INCH=53;
    public static final int NE=77;
    public static final int SECOND=40;
    public static final int CLIMB=70;
    public static final int ROLL=16;
    public static final int HOUR24=27;
    public static final int RADIAN=43;
    public static final int PASCAL=63;
    public static final int DEGREE=42;
    public static final int TURN=13;
    public static final int SLOWER=21;
    public static final int FLY=9;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int PM=26;
    public static final int FURLONG=50;
    public static final int LONGITUDE=33;
    public static final int PRESSURE=60;
    public static final int YEAR=34;
    public static final int MILE=49;
    public static final int LineComment=102;
    public static final int Exponent=99;
    public static final int DEFINE=5;
    public static final int T__323=323;
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
    public static final int PERCENT=58;
    public static final int T__189=189;
    public static final int Heading=89;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=95;
    public static final int DecimalLiteral=93;
    public static final int T__175=175;
    public static final int FLIGHTPLAN=4;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int Turning=88;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=61;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=56;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MAXIMUM=65;
    public static final int MINUTE=39;
    public static final int T__169=169;
    public static final int LE=80;
    public static final int BAR=67;

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
    // flips.g:117:1: flightPlan : ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.statement_return statement2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        try {
            // flips.g:118:2: ( ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) )
            // flips.g:118:4: ( define )* ( statement )*
            {
            // flips.g:118:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=103 && LA1_0<=105)||(LA1_0>=111 && LA1_0<=116)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flips.g:118:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan441);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // flips.g:118:12: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=117 && LA2_0<=118)||(LA2_0>=140 && LA2_0<=145)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // flips.g:118:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_flightPlan444);
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
            // 119:2: -> ^( FLIGHTPLAN ( define )* ( statement )* )
            {
                // flips.g:119:5: ^( FLIGHTPLAN ( define )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // flips.g:119:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // flips.g:119:26: ( statement )*
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
    // flips.g:124:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineSensor_return defineSensor4 = null;

        flipsParser.defineWaypoint_return defineWaypoint5 = null;



        try {
            // flips.g:125:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 103:
            case 104:
            case 105:
                {
                alt3=1;
                }
                break;
            case 111:
            case 112:
            case 113:
                {
                alt3=2;
                }
                break;
            case 114:
            case 115:
            case 116:
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
                    // flips.g:125:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define471);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:126:4: defineSensor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineSensor_in_define476);
                    defineSensor4=defineSensor();

                    state._fsp--;

                    adaptor.addChild(root_0, defineSensor4.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:127:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define481);
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
    // flips.g:130:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // flips.g:131:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // flips.g:131:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // flips.g:131:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt4=1;
                }
                break;
            case 104:
                {
                alt4=2;
                }
                break;
            case 105:
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
                    // flips.g:131:5: 'cmd'
                    {
                    string_literal6=(Token)match(input,103,FOLLOW_103_in_defineCommand493);  
                    stream_103.add(string_literal6);


                    }
                    break;
                case 2 :
                    // flips.g:131:11: 'command'
                    {
                    string_literal7=(Token)match(input,104,FOLLOW_104_in_defineCommand495);  
                    stream_104.add(string_literal7);


                    }
                    break;
                case 3 :
                    // flips.g:131:21: 'commands'
                    {
                    string_literal8=(Token)match(input,105,FOLLOW_105_in_defineCommand497);  
                    stream_105.add(string_literal8);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand500);
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
            // 132:2: -> defineCommandValue
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
    // flips.g:135:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
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
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flips.g:136:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==106) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=103 && LA11_3<=105)||(LA11_3>=107 && LA11_3<=108)||(LA11_3>=111 && LA11_3<=118)||(LA11_3>=140 && LA11_3<=145)) ) {
                            alt11=1;
                        }
                        else if ( (LA11_3==109) ) {
                            alt11=2;
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
                    // flips.g:136:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue516);  
                    stream_Identifier.add(Identifier10);

                    char_literal11=(Token)match(input,106,FOLLOW_106_in_defineCommandValue518);  
                    stream_106.add(char_literal11);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue520);
                    integerValue12=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue12.getTree());
                    // flips.g:136:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==106) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=107 && LA7_0<=108)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // flips.g:136:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // flips.g:136:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==107) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==108) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // flips.g:136:34: 'and'
                    	            {
                    	            string_literal13=(Token)match(input,107,FOLLOW_107_in_defineCommandValue524);  
                    	            stream_107.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:136:40: ',' ( 'and' )?
                    	            {
                    	            char_literal14=(Token)match(input,108,FOLLOW_108_in_defineCommandValue526);  
                    	            stream_108.add(char_literal14);

                    	            // flips.g:136:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==107) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // flips.g:136:44: 'and'
                    	                    {
                    	                    string_literal15=(Token)match(input,107,FOLLOW_107_in_defineCommandValue528);  
                    	                    stream_107.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue533);  
                    	    stream_Identifier.add(Identifier16);

                    	    char_literal17=(Token)match(input,106,FOLLOW_106_in_defineCommandValue535);  
                    	    stream_106.add(char_literal17);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue537);
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
                    // 137:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_integerValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_integerValue.hasNext() ) {
                            // flips.g:137:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // flips.g:137:25: ^( COMMAND integerValue )
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
                    // flips.g:138:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue560);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,106,FOLLOW_106_in_defineCommandValue562);  
                    stream_106.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue566);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal21=(Token)match(input,109,FOLLOW_109_in_defineCommandValue568);  
                    stream_109.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue572);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,110,FOLLOW_110_in_defineCommandValue574);  
                    stream_110.add(char_literal22);

                    // flips.g:138:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==106) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=107 && LA10_0<=108)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // flips.g:138:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // flips.g:138:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==107) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==108) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // flips.g:138:63: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,107,FOLLOW_107_in_defineCommandValue578);  
                    	            stream_107.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:138:69: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,108,FOLLOW_108_in_defineCommandValue580);  
                    	            stream_108.add(char_literal24);

                    	            // flips.g:138:73: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==107) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // flips.g:138:73: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,107,FOLLOW_107_in_defineCommandValue582);  
                    	                    stream_107.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue587);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,106,FOLLOW_106_in_defineCommandValue589);  
                    	    stream_106.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue593);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal28=(Token)match(input,109,FOLLOW_109_in_defineCommandValue595);  
                    	    stream_109.add(char_literal28);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue599);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal29=(Token)match(input,110,FOLLOW_110_in_defineCommandValue601);  
                    	    stream_110.add(char_literal29);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



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
                    // 139:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_cmd.hasNext()||stream_par.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_cmd.hasNext()||stream_par.hasNext() ) {
                            // flips.g:139:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // flips.g:139:25: ^( COMMAND $cmd PARAMETER $par)
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
        return retval;
    }
    // $ANTLR end "defineCommandValue"

    public static class defineSensor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineSensor"
    // flips.g:142:1: defineSensor : ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue ;
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
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_defineSensorValue=new RewriteRuleSubtreeStream(adaptor,"rule defineSensorValue");
        try {
            // flips.g:143:2: ( ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue )
            // flips.g:143:4: ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue
            {
            // flips.g:143:4: ( 'sen' | 'sensor' | 'sensors' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt12=1;
                }
                break;
            case 112:
                {
                alt12=2;
                }
                break;
            case 113:
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
                    // flips.g:143:5: 'sen'
                    {
                    string_literal30=(Token)match(input,111,FOLLOW_111_in_defineSensor637);  
                    stream_111.add(string_literal30);


                    }
                    break;
                case 2 :
                    // flips.g:143:11: 'sensor'
                    {
                    string_literal31=(Token)match(input,112,FOLLOW_112_in_defineSensor639);  
                    stream_112.add(string_literal31);


                    }
                    break;
                case 3 :
                    // flips.g:143:20: 'sensors'
                    {
                    string_literal32=(Token)match(input,113,FOLLOW_113_in_defineSensor641);  
                    stream_113.add(string_literal32);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor644);
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
            // 144:2: -> defineSensorValue
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
    // flips.g:147:1: defineSensorValue : Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ ;
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flips.g:148:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // flips.g:148:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue660);  
            stream_Identifier.add(Identifier34);

            char_literal35=(Token)match(input,106,FOLLOW_106_in_defineSensorValue662);  
            stream_106.add(char_literal35);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue666);
            sen=integerValue();

            state._fsp--;

            stream_integerValue.add(sen.getTree());
            // flips.g:148:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==106) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=107 && LA15_0<=108)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // flips.g:148:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue
            	    {
            	    // flips.g:148:37: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==107) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==108) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // flips.g:148:38: 'and'
            	            {
            	            string_literal36=(Token)match(input,107,FOLLOW_107_in_defineSensorValue670);  
            	            stream_107.add(string_literal36);


            	            }
            	            break;
            	        case 2 :
            	            // flips.g:148:44: ',' ( 'and' )?
            	            {
            	            char_literal37=(Token)match(input,108,FOLLOW_108_in_defineSensorValue672);  
            	            stream_108.add(char_literal37);

            	            // flips.g:148:48: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==107) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // flips.g:148:48: 'and'
            	                    {
            	                    string_literal38=(Token)match(input,107,FOLLOW_107_in_defineSensorValue674);  
            	                    stream_107.add(string_literal38);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue679);  
            	    stream_Identifier.add(Identifier39);

            	    char_literal40=(Token)match(input,106,FOLLOW_106_in_defineSensorValue681);  
            	    stream_106.add(char_literal40);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue685);
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
            // elements: Identifier, sen
            // token labels: 
            // rule labels: retval, sen
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sen=new RewriteRuleSubtreeStream(adaptor,"rule sen",sen!=null?sen.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 149:2: -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_sen.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_sen.hasNext() ) {
                    // flips.g:149:5: ^( DEFINE Identifier ^( SENSOR $sen) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    // flips.g:149:25: ^( SENSOR $sen)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SENSOR, "SENSOR"), root_2);

                    adaptor.addChild(root_2, stream_sen.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_Identifier.reset();
                stream_sen.reset();

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
    // flips.g:152:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
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
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // flips.g:153:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // flips.g:153:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // flips.g:153:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt16=1;
                }
                break;
            case 115:
                {
                alt16=2;
                }
                break;
            case 116:
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
                    // flips.g:153:5: 'wpt'
                    {
                    string_literal41=(Token)match(input,114,FOLLOW_114_in_defineWaypoint716);  
                    stream_114.add(string_literal41);


                    }
                    break;
                case 2 :
                    // flips.g:153:11: 'waypoint'
                    {
                    string_literal42=(Token)match(input,115,FOLLOW_115_in_defineWaypoint718);  
                    stream_115.add(string_literal42);


                    }
                    break;
                case 3 :
                    // flips.g:153:22: 'waypoints'
                    {
                    string_literal43=(Token)match(input,116,FOLLOW_116_in_defineWaypoint720);  
                    stream_116.add(string_literal43);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint723);
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
            // 154:2: -> defineWaypointValue
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
    // flips.g:157:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // flips.g:158:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // flips.g:158:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier45=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue739);  
            stream_Identifier.add(Identifier45);

            char_literal46=(Token)match(input,106,FOLLOW_106_in_defineWaypointValue741);  
            stream_106.add(char_literal46);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue743);
            geoCoordinate47=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate47.getTree());
            // flips.g:158:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Identifier) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==106) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>=107 && LA19_0<=108)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // flips.g:158:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // flips.g:158:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt18=3;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==107) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==108) ) {
            	        alt18=2;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // flips.g:158:35: 'and'
            	            {
            	            string_literal48=(Token)match(input,107,FOLLOW_107_in_defineWaypointValue747);  
            	            stream_107.add(string_literal48);


            	            }
            	            break;
            	        case 2 :
            	            // flips.g:158:41: ',' ( 'and' )?
            	            {
            	            char_literal49=(Token)match(input,108,FOLLOW_108_in_defineWaypointValue749);  
            	            stream_108.add(char_literal49);

            	            // flips.g:158:45: ( 'and' )?
            	            int alt17=2;
            	            int LA17_0 = input.LA(1);

            	            if ( (LA17_0==107) ) {
            	                alt17=1;
            	            }
            	            switch (alt17) {
            	                case 1 :
            	                    // flips.g:158:45: 'and'
            	                    {
            	                    string_literal50=(Token)match(input,107,FOLLOW_107_in_defineWaypointValue751);  
            	                    stream_107.add(string_literal50);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue756);  
            	    stream_Identifier.add(Identifier51);

            	    char_literal52=(Token)match(input,106,FOLLOW_106_in_defineWaypointValue758);  
            	    stream_106.add(char_literal52);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue760);
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
            // elements: Identifier, geoCoordinate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 159:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_geoCoordinate.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_geoCoordinate.hasNext() ) {
                    // flips.g:159:5: ^( DEFINE Identifier geoCoordinate )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    adaptor.addChild(root_1, stream_geoCoordinate.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_Identifier.reset();
                stream_geoCoordinate.reset();

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
    // flips.g:164:1: statement : ( command | 'repeat' ( statement )* repeat | 'wait' condition );
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
            // flips.g:165:2: ( command | 'repeat' ( statement )* repeat | 'wait' condition )
            int alt21=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
                {
                alt21=1;
                }
                break;
            case 117:
                {
                alt21=2;
                }
                break;
            case 118:
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
                    // flips.g:165:4: command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_command_in_statement787);
                    command54=command();

                    state._fsp--;

                    adaptor.addChild(root_0, command54.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:166:4: 'repeat' ( statement )* repeat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal55=(Token)match(input,117,FOLLOW_117_in_statement792); 
                    string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    // flips.g:166:13: ( statement )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Identifier||(LA20_0>=117 && LA20_0<=118)||(LA20_0>=140 && LA20_0<=145)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // flips.g:166:13: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement794);
                    	    statement56=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_repeat_in_statement797);
                    repeat57=repeat();

                    state._fsp--;

                    adaptor.addChild(root_0, repeat57.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:167:4: 'wait' condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal58=(Token)match(input,118,FOLLOW_118_in_statement802); 
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);

                    pushFollow(FOLLOW_condition_in_statement804);
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
    // flips.g:170:1: repeat : ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition );
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
            // flips.g:171:2: ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition )
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
            case 121:
                {
                alt22=2;
                }
                break;
            case 122:
                {
                alt22=3;
                }
                break;
            case 123:
            case 124:
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
                    // flips.g:171:4: integerValue ( 'time' | 'times' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_repeat815);
                    integerValue60=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue60.getTree());
                    set61=(Token)input.LT(1);
                    if ( (input.LA(1)>=119 && input.LA(1)<=120) ) {
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
                    // flips.g:172:4: 'continuously' duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal62=(Token)match(input,121,FOLLOW_121_in_repeat826); 
                    string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);

                    pushFollow(FOLLOW_duration_in_repeat828);
                    duration63=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration63.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:173:4: 'forever'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal64=(Token)match(input,122,FOLLOW_122_in_repeat833); 
                    string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
                    adaptor.addChild(root_0, string_literal64_tree);


                    }
                    break;
                case 4 :
                    // flips.g:174:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_repeat838);
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
    // flips.g:177:1: condition : ( 'until' conditionValue | 'while' conditionValue );
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
            // flips.g:178:2: ( 'until' conditionValue | 'while' conditionValue )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==123) ) {
                alt23=1;
            }
            else if ( (LA23_0==124) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // flips.g:178:4: 'until' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal66=(Token)match(input,123,FOLLOW_123_in_condition849); 
                    string_literal66_tree = (CommonTree)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition851);
                    conditionValue67=conditionValue();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionValue67.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:179:4: 'while' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal68=(Token)match(input,124,FOLLOW_124_in_condition856); 
                    string_literal68_tree = (CommonTree)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition858);
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
    // flips.g:182:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );
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
            // flips.g:183:2: ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue )
            int alt38=9;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // flips.g:183:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:183:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==119||(LA25_0>=125 && LA25_0<=126)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // flips.g:183:5: ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' )
                            {
                            // flips.g:183:5: ( 'the' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==125) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // flips.g:183:5: 'the'
                                    {
                                    string_literal70=(Token)match(input,125,FOLLOW_125_in_conditionValue870); 
                                    string_literal70_tree = (CommonTree)adaptor.create(string_literal70);
                                    adaptor.addChild(root_0, string_literal70_tree);


                                    }
                                    break;

                            }

                            set71=(Token)input.LT(1);
                            if ( input.LA(1)==119||input.LA(1)==126 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set71));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set72=(Token)input.LT(1);
                            if ( input.LA(1)==106||input.LA(1)==127 ) {
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

                    pushFollow(FOLLOW_timeValue_in_conditionValue887);
                    timeValue73=timeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, timeValue73.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:184:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:184:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==125||(LA27_0>=128 && LA27_0<=129)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // flips.g:184:5: ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' )
                            {
                            // flips.g:184:5: ( 'the' )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==125) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // flips.g:184:5: 'the'
                                    {
                                    string_literal74=(Token)match(input,125,FOLLOW_125_in_conditionValue893); 
                                    string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
                                    adaptor.addChild(root_0, string_literal74_tree);


                                    }
                                    break;

                            }

                            set75=(Token)input.LT(1);
                            if ( (input.LA(1)>=128 && input.LA(1)<=129) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set75));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set76=(Token)input.LT(1);
                            if ( input.LA(1)==106||input.LA(1)==127 ) {
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

                    pushFollow(FOLLOW_fixedDirection_in_conditionValue910);
                    fixedDirection77=fixedDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedDirection77.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:185:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:185:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==125||(LA29_0>=130 && LA29_0<=131)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // flips.g:185:5: ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' )
                            {
                            // flips.g:185:5: ( 'the' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==125) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // flips.g:185:5: 'the'
                                    {
                                    string_literal78=(Token)match(input,125,FOLLOW_125_in_conditionValue916); 
                                    string_literal78_tree = (CommonTree)adaptor.create(string_literal78);
                                    adaptor.addChild(root_0, string_literal78_tree);


                                    }
                                    break;

                            }

                            set79=(Token)input.LT(1);
                            if ( (input.LA(1)>=130 && input.LA(1)<=131) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set79));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set80=(Token)input.LT(1);
                            if ( input.LA(1)==106||input.LA(1)==127 ) {
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

                    pushFollow(FOLLOW_speedValue_in_conditionValue933);
                    speedValue81=speedValue();

                    state._fsp--;

                    adaptor.addChild(root_0, speedValue81.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:186:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:186:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) )
                    // flips.g:186:5: ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' )
                    {
                    // flips.g:186:5: ( 'the' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==125) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // flips.g:186:5: 'the'
                            {
                            string_literal82=(Token)match(input,125,FOLLOW_125_in_conditionValue939); 
                            string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
                            adaptor.addChild(root_0, string_literal82_tree);


                            }
                            break;

                    }

                    set83=(Token)input.LT(1);
                    if ( (input.LA(1)>=132 && input.LA(1)<=133) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set83));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set84=(Token)input.LT(1);
                    if ( input.LA(1)==106||input.LA(1)==127 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set84));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_distanceValue_in_conditionValue955);
                    distanceValue85=distanceValue();

                    state._fsp--;

                    adaptor.addChild(root_0, distanceValue85.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:187:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:187:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) )
                    // flips.g:187:5: ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' )
                    {
                    // flips.g:187:5: ( 'the' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==125) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // flips.g:187:5: 'the'
                            {
                            string_literal86=(Token)match(input,125,FOLLOW_125_in_conditionValue961); 
                            string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                            adaptor.addChild(root_0, string_literal86_tree);


                            }
                            break;

                    }

                    set87=(Token)input.LT(1);
                    if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set87));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set88=(Token)input.LT(1);
                    if ( input.LA(1)==106||input.LA(1)==127 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue977);
                    angularValue89=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue89.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:188:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:188:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) )
                    // flips.g:188:5: ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' )
                    {
                    // flips.g:188:5: ( 'the' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==125) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // flips.g:188:5: 'the'
                            {
                            string_literal90=(Token)match(input,125,FOLLOW_125_in_conditionValue983); 
                            string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                            adaptor.addChild(root_0, string_literal90_tree);


                            }
                            break;

                    }

                    set91=(Token)input.LT(1);
                    if ( (input.LA(1)>=136 && input.LA(1)<=137) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set92=(Token)input.LT(1);
                    if ( input.LA(1)==106||input.LA(1)==127 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue999);
                    angularValue93=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue93.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:189:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:189:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=114 && LA34_0<=115)||LA34_0==125) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // flips.g:189:5: ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' )
                            {
                            // flips.g:189:5: ( 'the' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==125) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // flips.g:189:5: 'the'
                                    {
                                    string_literal94=(Token)match(input,125,FOLLOW_125_in_conditionValue1005); 
                                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                                    adaptor.addChild(root_0, string_literal94_tree);


                                    }
                                    break;

                            }

                            set95=(Token)input.LT(1);
                            if ( (input.LA(1)>=114 && input.LA(1)<=115) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set95));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set96=(Token)input.LT(1);
                            if ( input.LA(1)==106||input.LA(1)==127 ) {
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

                    pushFollow(FOLLOW_waypoint_in_conditionValue1022);
                    waypoint97=waypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, waypoint97.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:190:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:190:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==125||(LA36_0>=138 && LA36_0<=139)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // flips.g:190:5: ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' )
                            {
                            // flips.g:190:5: ( 'the' )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==125) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // flips.g:190:5: 'the'
                                    {
                                    string_literal98=(Token)match(input,125,FOLLOW_125_in_conditionValue1028); 
                                    string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
                                    adaptor.addChild(root_0, string_literal98_tree);


                                    }
                                    break;

                            }

                            set99=(Token)input.LT(1);
                            if ( (input.LA(1)>=138 && input.LA(1)<=139) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set99));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set100=(Token)input.LT(1);
                            if ( input.LA(1)==106||input.LA(1)==127 ) {
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

                    pushFollow(FOLLOW_altitudeValue_in_conditionValue1045);
                    altitudeValue101=altitudeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, altitudeValue101.getTree());

                    }
                    break;
                case 9 :
                    // flips.g:191:4: Identifier ( '=' | 'is' )? numericValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditionValue1050); 
                    Identifier102_tree = (CommonTree)adaptor.create(Identifier102);
                    adaptor.addChild(root_0, Identifier102_tree);

                    // flips.g:191:15: ( '=' | 'is' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==106||LA37_0==127) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // flips.g:
                            {
                            set103=(Token)input.LT(1);
                            if ( input.LA(1)==106||input.LA(1)==127 ) {
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

                    pushFollow(FOLLOW_numericValue_in_conditionValue1059);
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
    // flips.g:196:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand105 = null;

        flipsParser.turnCommand_return turnCommand106 = null;

        flipsParser.loiterCommand_return loiterCommand107 = null;

        flipsParser.executeCommand_return executeCommand108 = null;



        try {
            // flips.g:197:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 140:
            case 141:
                {
                alt39=1;
                }
                break;
            case 142:
            case 143:
                {
                alt39=2;
                }
                break;
            case 144:
            case 145:
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
                    // flips.g:197:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command1072);
                    flyCommand105=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand105.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:198:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command1077);
                    turnCommand106=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand106.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:199:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command1082);
                    loiterCommand107=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand107.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:200:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command1087);
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
    // flips.g:203:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        flipsParser.flyCommandValue_return flyCommandValue111 = null;


        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // flips.g:204:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // flips.g:204:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // flips.g:204:4: ( 'fly' | 'go' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==140) ) {
                alt40=1;
            }
            else if ( (LA40_0==141) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // flips.g:204:5: 'fly'
                    {
                    string_literal109=(Token)match(input,140,FOLLOW_140_in_flyCommand1099);  
                    stream_140.add(string_literal109);


                    }
                    break;
                case 2 :
                    // flips.g:204:11: 'go'
                    {
                    string_literal110=(Token)match(input,141,FOLLOW_141_in_flyCommand1101);  
                    stream_141.add(string_literal110);


                    }
                    break;

            }

            // flips.g:204:17: ( flyCommandValue )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=BinaryLiteral && LA41_0<=HexLiteral)) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==171||(LA41_2>=173 && LA41_2<=199)||(LA41_2>=202 && LA41_2<=211)||(LA41_2>=322 && LA41_2<=323)) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>=To && LA41_0<=At)||LA41_0==With||(LA41_0>=Turning && LA41_0<=FloatingPointLiteral)||(LA41_0>=134 && LA41_0<=137)||(LA41_0>=147 && LA41_0<=148)||(LA41_0>=214 && LA41_0<=219)||LA41_0==240||LA41_0==254||(LA41_0>=259 && LA41_0<=306)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // flips.g:204:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand1104);
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
            // 205:2: -> ^( FLY ( flyCommandValue )* )
            {
                // flips.g:205:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // flips.g:205:11: ( flyCommandValue )*
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
    // flips.g:208:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // flips.g:209:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt45=9;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // flips.g:209:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue1126);
                    time112=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time112.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:210:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue1131);
                    direction113=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction113.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:211:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue1136);
                    speed114=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed114.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:212:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue1141);
                    distance115=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance115.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:213:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue1146);
                    pitch116=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch116.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:214:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue1151);
                    roll117=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll117.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:215:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue1156);
                    duration118=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration118.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:216:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To119=(Token)match(input,To,FOLLOW_To_in_flyCommandValue1161);  
                    stream_To.add(To119);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue1163);
                    waypoint120=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint120.getTree());
                    // flips.g:216:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=107 && LA44_0<=108)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // flips.g:216:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // flips.g:216:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==107) ) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==108) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // flips.g:216:18: 'and'
                    	            {
                    	            string_literal121=(Token)match(input,107,FOLLOW_107_in_flyCommandValue1167);  
                    	            stream_107.add(string_literal121);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:216:24: ',' ( 'and' )?
                    	            {
                    	            char_literal122=(Token)match(input,108,FOLLOW_108_in_flyCommandValue1169);  
                    	            stream_108.add(char_literal122);

                    	            // flips.g:216:28: ( 'and' )?
                    	            int alt42=2;
                    	            int LA42_0 = input.LA(1);

                    	            if ( (LA42_0==107) ) {
                    	                alt42=1;
                    	            }
                    	            switch (alt42) {
                    	                case 1 :
                    	                    // flips.g:216:28: 'and'
                    	                    {
                    	                    string_literal123=(Token)match(input,107,FOLLOW_107_in_flyCommandValue1171);  
                    	                    stream_107.add(string_literal123);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue1175);
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
                    // 217:2: -> ( waypoint )+
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
                    // flips.g:218:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue1188);
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
    // flips.g:221:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal126=null;
        Token string_literal127=null;
        flipsParser.turnCommandValue_return turnCommandValue128 = null;


        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // flips.g:222:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // flips.g:222:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // flips.g:222:4: ( 'trn' | 'turn' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==142) ) {
                alt46=1;
            }
            else if ( (LA46_0==143) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // flips.g:222:5: 'trn'
                    {
                    string_literal126=(Token)match(input,142,FOLLOW_142_in_turnCommand1200);  
                    stream_142.add(string_literal126);


                    }
                    break;
                case 2 :
                    // flips.g:222:11: 'turn'
                    {
                    string_literal127=(Token)match(input,143,FOLLOW_143_in_turnCommand1202);  
                    stream_143.add(string_literal127);


                    }
                    break;

            }

            // flips.g:222:19: ( turnCommandValue )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=Turning && LA47_0<=Heading)||LA47_0==254||(LA47_0>=260 && LA47_0<=290)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // flips.g:222:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand1205);
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
            // 223:2: -> ^( FLY ( turnCommandValue )* )
            {
                // flips.g:223:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // flips.g:223:11: ( turnCommandValue )*
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
    // flips.g:226:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction129 = null;



        try {
            // flips.g:227:2: ( direction )
            // flips.g:227:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue1227);
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
    // flips.g:230:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        flipsParser.loiterCommandValue_return loiterCommandValue132 = null;


        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // flips.g:231:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // flips.g:231:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // flips.g:231:4: ( 'ltr' | 'loiter' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==144) ) {
                alt48=1;
            }
            else if ( (LA48_0==145) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // flips.g:231:5: 'ltr'
                    {
                    string_literal130=(Token)match(input,144,FOLLOW_144_in_loiterCommand1239);  
                    stream_144.add(string_literal130);


                    }
                    break;
                case 2 :
                    // flips.g:231:11: 'loiter'
                    {
                    string_literal131=(Token)match(input,145,FOLLOW_145_in_loiterCommand1241);  
                    stream_145.add(string_literal131);


                    }
                    break;

            }

            // flips.g:231:21: ( loiterCommandValue )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=BinaryLiteral && LA49_0<=HexLiteral)) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==171||(LA49_2>=173 && LA49_2<=199)||(LA49_2>=202 && LA49_2<=211)||(LA49_2>=322 && LA49_2<=323)) ) {
                        alt49=1;
                    }


                }
                else if ( ((LA49_0>=To && LA49_0<=At)||LA49_0==With||LA49_0==Turning||LA49_0==FloatingPointLiteral||LA49_0==150||(LA49_0>=171 && LA49_0<=172)||(LA49_0>=214 && LA49_0<=219)||LA49_0==240||LA49_0==259||(LA49_0>=291 && LA49_0<=300)||(LA49_0>=307 && LA49_0<=310)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // flips.g:231:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand1244);
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
            // 232:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // flips.g:232:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // flips.g:232:14: ( loiterCommandValue )*
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
    // flips.g:235:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
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
            // flips.g:236:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt50=7;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // flips.g:236:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue1266);
                    time133=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time133.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:237:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue1271);
                    speed134=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed134.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:238:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue1276);
                    loiterDirection135=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection135.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:239:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue1281);
                    radius136=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius136.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:240:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue1286);
                    duration137=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration137.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:241:4: At waypoint
                    {
                    At138=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue1291);  
                    stream_At.add(At138);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue1293);
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
                    // 242:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:243:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue1303);
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
    // flips.g:246:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' executeCommandParameter ( ',' executeCommandParameter )* ')' -> ^( EXECUTE Identifier ( executeCommandParameter )+ ) );
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
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_executeCommandParameter=new RewriteRuleSubtreeStream(adaptor,"rule executeCommandParameter");
        try {
            // flips.g:247:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' executeCommandParameter ( ',' executeCommandParameter )* ')' -> ^( EXECUTE Identifier ( executeCommandParameter )+ ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Identifier) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==109) ) {
                    alt52=2;
                }
                else if ( (LA52_1==EOF||LA52_1==Identifier||(LA52_1>=BinaryLiteral && LA52_1<=HexLiteral)||(LA52_1>=117 && LA52_1<=118)||(LA52_1>=121 && LA52_1<=124)||(LA52_1>=140 && LA52_1<=145)) ) {
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
                    // flips.g:247:4: Identifier
                    {
                    Identifier141=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1314);  
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
                    // 248:2: -> ^( EXECUTE Identifier )
                    {
                        // flips.g:248:5: ^( EXECUTE Identifier )
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
                    // flips.g:249:4: Identifier '(' executeCommandParameter ( ',' executeCommandParameter )* ')'
                    {
                    Identifier142=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1328);  
                    stream_Identifier.add(Identifier142);

                    char_literal143=(Token)match(input,109,FOLLOW_109_in_executeCommand1330);  
                    stream_109.add(char_literal143);

                    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand1332);
                    executeCommandParameter144=executeCommandParameter();

                    state._fsp--;

                    stream_executeCommandParameter.add(executeCommandParameter144.getTree());
                    // flips.g:249:43: ( ',' executeCommandParameter )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==108) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // flips.g:249:44: ',' executeCommandParameter
                    	    {
                    	    char_literal145=(Token)match(input,108,FOLLOW_108_in_executeCommand1335);  
                    	    stream_108.add(char_literal145);

                    	    pushFollow(FOLLOW_executeCommandParameter_in_executeCommand1337);
                    	    executeCommandParameter146=executeCommandParameter();

                    	    state._fsp--;

                    	    stream_executeCommandParameter.add(executeCommandParameter146.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    char_literal147=(Token)match(input,110,FOLLOW_110_in_executeCommand1342);  
                    stream_110.add(char_literal147);



                    // AST REWRITE
                    // elements: Identifier, executeCommandParameter
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 250:2: -> ^( EXECUTE Identifier ( executeCommandParameter )+ )
                    {
                        // flips.g:250:5: ^( EXECUTE Identifier ( executeCommandParameter )+ )
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
    // flips.g:253:1: executeCommandParameter : ( numericValue -> ^( PARAMETER numericValue ) | StringLiteral -> ^( PARAMETER StringLiteral ) );
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
            // flips.g:254:2: ( numericValue -> ^( PARAMETER numericValue ) | StringLiteral -> ^( PARAMETER StringLiteral ) )
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
                    // flips.g:254:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_executeCommandParameter1365);
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
                    // 255:2: -> ^( PARAMETER numericValue )
                    {
                        // flips.g:255:5: ^( PARAMETER numericValue )
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
                    // flips.g:256:4: StringLiteral
                    {
                    StringLiteral149=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_executeCommandParameter1379);  
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
                    // 257:2: -> ^( PARAMETER StringLiteral )
                    {
                        // flips.g:257:5: ^( PARAMETER StringLiteral )
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
    // flips.g:262:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
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
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // flips.g:263:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=134 && LA58_0<=135)) ) {
                alt58=1;
            }
            else if ( (LA58_0==With||(LA58_0>=147 && LA58_0<=148)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // flips.g:263:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // flips.g:263:4: ( 'pit' | 'pitch' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==134) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==135) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // flips.g:263:5: 'pit'
                            {
                            string_literal150=(Token)match(input,134,FOLLOW_134_in_pitch1402);  
                            stream_134.add(string_literal150);


                            }
                            break;
                        case 2 :
                            // flips.g:263:11: 'pitch'
                            {
                            string_literal151=(Token)match(input,135,FOLLOW_135_in_pitch1404);  
                            stream_135.add(string_literal151);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1407);
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
                    // 264:2: -> ^( PITCH angularValue )
                    {
                        // flips.g:264:5: ^( PITCH angularValue )
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
                    // flips.g:265:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // flips.g:265:4: ( With 'an' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==With) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // flips.g:265:5: With 'an'
                            {
                            With153=(Token)match(input,With,FOLLOW_With_in_pitch1422);  
                            stream_With.add(With153);

                            string_literal154=(Token)match(input,146,FOLLOW_146_in_pitch1424);  
                            stream_146.add(string_literal154);


                            }
                            break;

                    }

                    // flips.g:265:17: ( 'aoa' | 'angle of attack' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==147) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==148) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // flips.g:265:18: 'aoa'
                            {
                            string_literal155=(Token)match(input,147,FOLLOW_147_in_pitch1429);  
                            stream_147.add(string_literal155);


                            }
                            break;
                        case 2 :
                            // flips.g:265:24: 'angle of attack'
                            {
                            string_literal156=(Token)match(input,148,FOLLOW_148_in_pitch1431);  
                            stream_148.add(string_literal156);


                            }
                            break;

                    }

                    // flips.g:265:43: ( 'of' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==149) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // flips.g:265:43: 'of'
                            {
                            string_literal157=(Token)match(input,149,FOLLOW_149_in_pitch1434);  
                            stream_149.add(string_literal157);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1437);
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
                    // 266:2: -> ^( PITCH angularValue )
                    {
                        // flips.g:266:5: ^( PITCH angularValue )
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
    // flips.g:269:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal159=null;
        Token string_literal160=null;
        flipsParser.angularValue_return angularValue161 = null;


        CommonTree string_literal159_tree=null;
        CommonTree string_literal160_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // flips.g:270:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // flips.g:270:4: ( 'rol' | 'roll' ) angularValue
            {
            // flips.g:270:4: ( 'rol' | 'roll' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==136) ) {
                alt59=1;
            }
            else if ( (LA59_0==137) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // flips.g:270:5: 'rol'
                    {
                    string_literal159=(Token)match(input,136,FOLLOW_136_in_roll1458);  
                    stream_136.add(string_literal159);


                    }
                    break;
                case 2 :
                    // flips.g:270:11: 'roll'
                    {
                    string_literal160=(Token)match(input,137,FOLLOW_137_in_roll1460);  
                    stream_137.add(string_literal160);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1463);
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
            // 271:2: -> ^( ROLL angularValue )
            {
                // flips.g:271:5: ^( ROLL angularValue )
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
    // flips.g:276:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude162 = null;

        flipsParser.relativeAltitude_return relativeAltitude163 = null;



        try {
            // flips.g:277:2: ( fixedAltitude | relativeAltitude )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // flips.g:277:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1485);
                    fixedAltitude162=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude162.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:278:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1490);
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
    // flips.g:281:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
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
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // flips.g:282:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // flips.g:282:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // flips.g:282:4: ( ( upDownDirection )? To | At | With )
            int alt62=3;
            switch ( input.LA(1) ) {
            case To:
            case 240:
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
                    // flips.g:282:5: ( upDownDirection )? To
                    {
                    // flips.g:282:5: ( upDownDirection )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==240||(LA61_0>=291 && LA61_0<=300)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // flips.g:282:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1502);
                            upDownDirection164=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection164.getTree());

                            }
                            break;

                    }

                    To165=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1505);  
                    stream_To.add(To165);


                    }
                    break;
                case 2 :
                    // flips.g:282:25: At
                    {
                    At166=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1507);  
                    stream_At.add(At166);


                    }
                    break;
                case 3 :
                    // flips.g:282:28: With
                    {
                    With167=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1509);  
                    stream_With.add(With167);


                    }
                    break;

            }

            // flips.g:282:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=138 && LA69_0<=139)||LA69_0==146||(LA69_0>=150 && LA69_0<=152)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // flips.g:282:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // flips.g:282:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=138 && LA67_0<=139)||LA67_0==146) ) {
                        alt67=1;
                    }
                    else if ( ((LA67_0>=150 && LA67_0<=152)) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // flips.g:282:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // flips.g:282:36: ( 'an' )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==146) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // flips.g:282:36: 'an'
                                    {
                                    string_literal168=(Token)match(input,146,FOLLOW_146_in_fixedAltitude1514);  
                                    stream_146.add(string_literal168);


                                    }
                                    break;

                            }

                            // flips.g:282:42: ( 'alt' | 'altitude' )
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==138) ) {
                                alt64=1;
                            }
                            else if ( (LA64_0==139) ) {
                                alt64=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 0, input);

                                throw nvae;
                            }
                            switch (alt64) {
                                case 1 :
                                    // flips.g:282:43: 'alt'
                                    {
                                    string_literal169=(Token)match(input,138,FOLLOW_138_in_fixedAltitude1518);  
                                    stream_138.add(string_literal169);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:282:49: 'altitude'
                                    {
                                    string_literal170=(Token)match(input,139,FOLLOW_139_in_fixedAltitude1520);  
                                    stream_139.add(string_literal170);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // flips.g:282:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // flips.g:282:61: ( 'a' )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==150) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // flips.g:282:61: 'a'
                                    {
                                    char_literal171=(Token)match(input,150,FOLLOW_150_in_fixedAltitude1523);  
                                    stream_150.add(char_literal171);


                                    }
                                    break;

                            }

                            // flips.g:282:66: ( 'pres' | 'pressure' )
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==151) ) {
                                alt66=1;
                            }
                            else if ( (LA66_0==152) ) {
                                alt66=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 66, 0, input);

                                throw nvae;
                            }
                            switch (alt66) {
                                case 1 :
                                    // flips.g:282:67: 'pres'
                                    {
                                    string_literal172=(Token)match(input,151,FOLLOW_151_in_fixedAltitude1527);  
                                    stream_151.add(string_literal172);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:282:74: 'pressure'
                                    {
                                    string_literal173=(Token)match(input,152,FOLLOW_152_in_fixedAltitude1529);  
                                    stream_152.add(string_literal173);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // flips.g:282:87: ( 'of' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==149) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // flips.g:282:87: 'of'
                            {
                            string_literal174=(Token)match(input,149,FOLLOW_149_in_fixedAltitude1533);  
                            stream_149.add(string_literal174);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1538);
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
            // 283:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // flips.g:283:5: ^( ALTITUDE FIXED altitudeValue )
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
    // flips.g:286:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection176 = null;

        flipsParser.altitudeValue_return altitudeValue177 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // flips.g:287:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // flips.g:287:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1560);
            upDownDirection176=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection176.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1562);
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
            // 288:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // flips.g:288:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // flips.g:291:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
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
            // flips.g:292:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt70=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==171||(LA70_1>=173 && LA70_1<=199)) ) {
                    alt70=1;
                }
                else if ( ((LA70_1>=153 && LA70_1<=170)) ) {
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

                if ( ((LA70_2>=153 && LA70_2<=170)) ) {
                    alt70=2;
                }
                else if ( (LA70_2==171||(LA70_2>=173 && LA70_2<=199)) ) {
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
                    // flips.g:292:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1586);
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
                    // 293:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:294:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1598);
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
                    // 295:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:296:4: FlightLevel
                    {
                    FlightLevel180=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1610);  
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
                    // 297:2: -> FLIGHTLEVEL FlightLevel
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
    // flips.g:300:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue181 = null;

        flipsParser.pressureUnit_return pressureUnit182 = null;



        try {
            // flips.g:301:2: ( numericValue pressureUnit )
            // flips.g:301:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1628);
            numericValue181=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue181.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1630);
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
    // flips.g:304:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
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
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // flips.g:305:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 153:
            case 154:
            case 155:
                {
                alt77=1;
                }
                break;
            case 156:
            case 157:
            case 158:
                {
                alt77=2;
                }
                break;
            case 159:
            case 160:
            case 161:
                {
                alt77=3;
                }
                break;
            case 162:
            case 163:
                {
                alt77=4;
                }
                break;
            case 164:
            case 165:
            case 166:
                {
                alt77=5;
                }
                break;
            case 167:
            case 168:
            case 169:
            case 170:
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
                    // flips.g:305:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // flips.g:305:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 153:
                        {
                        alt71=1;
                        }
                        break;
                    case 154:
                        {
                        alt71=2;
                        }
                        break;
                    case 155:
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
                            // flips.g:305:5: 'kpa'
                            {
                            string_literal183=(Token)match(input,153,FOLLOW_153_in_pressureUnit1642);  
                            stream_153.add(string_literal183);


                            }
                            break;
                        case 2 :
                            // flips.g:305:11: 'kilopascal'
                            {
                            string_literal184=(Token)match(input,154,FOLLOW_154_in_pressureUnit1644);  
                            stream_154.add(string_literal184);


                            }
                            break;
                        case 3 :
                            // flips.g:305:24: 'kilopascals'
                            {
                            string_literal185=(Token)match(input,155,FOLLOW_155_in_pressureUnit1646);  
                            stream_155.add(string_literal185);


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
                    // 306:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:307:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // flips.g:307:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case 156:
                        {
                        alt72=1;
                        }
                        break;
                    case 157:
                        {
                        alt72=2;
                        }
                        break;
                    case 158:
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
                            // flips.g:307:5: 'hpa'
                            {
                            string_literal186=(Token)match(input,156,FOLLOW_156_in_pressureUnit1658);  
                            stream_156.add(string_literal186);


                            }
                            break;
                        case 2 :
                            // flips.g:307:11: 'hectopascal'
                            {
                            string_literal187=(Token)match(input,157,FOLLOW_157_in_pressureUnit1660);  
                            stream_157.add(string_literal187);


                            }
                            break;
                        case 3 :
                            // flips.g:307:25: 'hectopascals'
                            {
                            string_literal188=(Token)match(input,158,FOLLOW_158_in_pressureUnit1662);  
                            stream_158.add(string_literal188);


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
                    // 308:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:309:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // flips.g:309:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt73=3;
                    switch ( input.LA(1) ) {
                    case 159:
                        {
                        alt73=1;
                        }
                        break;
                    case 160:
                        {
                        alt73=2;
                        }
                        break;
                    case 161:
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
                            // flips.g:309:5: 'pa'
                            {
                            string_literal189=(Token)match(input,159,FOLLOW_159_in_pressureUnit1674);  
                            stream_159.add(string_literal189);


                            }
                            break;
                        case 2 :
                            // flips.g:309:10: 'pascal'
                            {
                            string_literal190=(Token)match(input,160,FOLLOW_160_in_pressureUnit1676);  
                            stream_160.add(string_literal190);


                            }
                            break;
                        case 3 :
                            // flips.g:309:19: 'pascals'
                            {
                            string_literal191=(Token)match(input,161,FOLLOW_161_in_pressureUnit1678);  
                            stream_161.add(string_literal191);


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
                    // 310:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:311:4: ( 'bar' | 'bars' )
                    {
                    // flips.g:311:4: ( 'bar' | 'bars' )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==162) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==163) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // flips.g:311:5: 'bar'
                            {
                            string_literal192=(Token)match(input,162,FOLLOW_162_in_pressureUnit1690);  
                            stream_162.add(string_literal192);


                            }
                            break;
                        case 2 :
                            // flips.g:311:11: 'bars'
                            {
                            string_literal193=(Token)match(input,163,FOLLOW_163_in_pressureUnit1692);  
                            stream_163.add(string_literal193);


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
                    // 312:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:313:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // flips.g:313:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt75=3;
                    switch ( input.LA(1) ) {
                    case 164:
                        {
                        alt75=1;
                        }
                        break;
                    case 165:
                        {
                        alt75=2;
                        }
                        break;
                    case 166:
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
                            // flips.g:313:5: 'mbar'
                            {
                            string_literal194=(Token)match(input,164,FOLLOW_164_in_pressureUnit1704);  
                            stream_164.add(string_literal194);


                            }
                            break;
                        case 2 :
                            // flips.g:313:12: 'millibar'
                            {
                            string_literal195=(Token)match(input,165,FOLLOW_165_in_pressureUnit1706);  
                            stream_165.add(string_literal195);


                            }
                            break;
                        case 3 :
                            // flips.g:313:23: 'millibars'
                            {
                            string_literal196=(Token)match(input,166,FOLLOW_166_in_pressureUnit1708);  
                            stream_166.add(string_literal196);


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
                    // 314:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:315:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // flips.g:315:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt76=4;
                    switch ( input.LA(1) ) {
                    case 167:
                        {
                        alt76=1;
                        }
                        break;
                    case 168:
                        {
                        alt76=2;
                        }
                        break;
                    case 169:
                        {
                        alt76=3;
                        }
                        break;
                    case 170:
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
                            // flips.g:315:5: 'atm'
                            {
                            string_literal197=(Token)match(input,167,FOLLOW_167_in_pressureUnit1720);  
                            stream_167.add(string_literal197);


                            }
                            break;
                        case 2 :
                            // flips.g:315:11: 'atms'
                            {
                            string_literal198=(Token)match(input,168,FOLLOW_168_in_pressureUnit1722);  
                            stream_168.add(string_literal198);


                            }
                            break;
                        case 3 :
                            // flips.g:315:18: 'atmosphere'
                            {
                            string_literal199=(Token)match(input,169,FOLLOW_169_in_pressureUnit1724);  
                            stream_169.add(string_literal199);


                            }
                            break;
                        case 4 :
                            // flips.g:315:31: 'atmospheres'
                            {
                            string_literal200=(Token)match(input,170,FOLLOW_170_in_pressureUnit1726);  
                            stream_170.add(string_literal200);


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
                    // 316:2: -> ATMOSPHERE
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
    // flips.g:321:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
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
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:322:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // flips.g:322:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // flips.g:322:4: ( 'in' | With )?
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==171) ) {
                alt78=1;
            }
            else if ( (LA78_0==With) ) {
                alt78=2;
            }
            switch (alt78) {
                case 1 :
                    // flips.g:322:5: 'in'
                    {
                    string_literal201=(Token)match(input,171,FOLLOW_171_in_radius1746);  
                    stream_171.add(string_literal201);


                    }
                    break;
                case 2 :
                    // flips.g:322:10: With
                    {
                    With202=(Token)match(input,With,FOLLOW_With_in_radius1748);  
                    stream_With.add(With202);


                    }
                    break;

            }

            // flips.g:322:17: ( 'a' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==150) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // flips.g:322:17: 'a'
                    {
                    char_literal203=(Token)match(input,150,FOLLOW_150_in_radius1752);  
                    stream_150.add(char_literal203);


                    }
                    break;

            }

            // flips.g:322:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==172) ) {
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
                    // flips.g:322:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal204=(Token)match(input,172,FOLLOW_172_in_radius1756);  
                    stream_172.add(string_literal204);

                    // flips.g:322:32: ( 'of' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==149) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // flips.g:322:32: 'of'
                            {
                            string_literal205=(Token)match(input,149,FOLLOW_149_in_radius1758);  
                            stream_149.add(string_literal205);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1761);
                    distanceValue206=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue206.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:322:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1763);
                    distanceValue207=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue207.getTree());
                    string_literal208=(Token)match(input,172,FOLLOW_172_in_radius1765);  
                    stream_172.add(string_literal208);


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
            // 323:2: -> ^( RADIUS distanceValue )
            {
                // flips.g:323:5: ^( RADIUS distanceValue )
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
    // flips.g:326:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection209 = null;

        flipsParser.distanceValue_return distanceValue210 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:327:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // flips.g:327:4: ( leftRightDirection )? distanceValue
            {
            // flips.g:327:4: ( leftRightDirection )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=301 && LA82_0<=306)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // flips.g:327:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1786);
                    leftRightDirection209=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection209.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1789);
            distanceValue210=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue210.getTree());


            // AST REWRITE
            // elements: leftRightDirection, distanceValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 328:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // flips.g:328:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // flips.g:328:16: ( leftRightDirection )?
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
    // flips.g:331:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue211 = null;

        flipsParser.distanceUnit_return distanceUnit212 = null;



        try {
            // flips.g:332:2: ( numericValue distanceUnit )
            // flips.g:332:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1812);
            numericValue211=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue211.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1814);
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
    // flips.g:335:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'cm' | 'centimeter' | 'centimeters' ) -> CENTIMETER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'f' | 'fur' | 'furlong' | 'furlongs' ) -> FURLONG | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT | ( 'in' | 'inch' | 'inches' ) -> INCH );
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
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");

        try {
            // flips.g:336:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'cm' | 'centimeter' | 'centimeters' ) -> CENTIMETER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'f' | 'fur' | 'furlong' | 'furlongs' ) -> FURLONG | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT | ( 'in' | 'inch' | 'inches' ) -> INCH )
            int alt94=9;
            switch ( input.LA(1) ) {
            case 173:
            case 174:
            case 175:
                {
                alt94=1;
                }
                break;
            case 176:
            case 177:
            case 178:
                {
                alt94=2;
                }
                break;
            case 179:
            case 180:
            case 181:
                {
                alt94=3;
                }
                break;
            case 182:
            case 183:
                {
                alt94=4;
                }
                break;
            case 184:
            case 185:
            case 186:
            case 187:
                {
                alt94=5;
                }
                break;
            case 188:
            case 189:
            case 190:
            case 191:
                {
                alt94=6;
                }
                break;
            case 192:
            case 193:
            case 194:
                {
                alt94=7;
                }
                break;
            case 195:
            case 196:
            case 197:
                {
                alt94=8;
                }
                break;
            case 171:
            case 198:
            case 199:
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
                    // flips.g:336:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // flips.g:336:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case 173:
                        {
                        alt83=1;
                        }
                        break;
                    case 174:
                        {
                        alt83=2;
                        }
                        break;
                    case 175:
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
                            // flips.g:336:5: 'km'
                            {
                            string_literal213=(Token)match(input,173,FOLLOW_173_in_distanceUnit1826);  
                            stream_173.add(string_literal213);


                            }
                            break;
                        case 2 :
                            // flips.g:336:10: 'kilometer'
                            {
                            string_literal214=(Token)match(input,174,FOLLOW_174_in_distanceUnit1828);  
                            stream_174.add(string_literal214);


                            }
                            break;
                        case 3 :
                            // flips.g:336:22: 'kilometers'
                            {
                            string_literal215=(Token)match(input,175,FOLLOW_175_in_distanceUnit1830);  
                            stream_175.add(string_literal215);


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
                    // 337:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:338:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // flips.g:338:4: ( 'm' | 'meter' | 'meters' )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case 176:
                        {
                        alt84=1;
                        }
                        break;
                    case 177:
                        {
                        alt84=2;
                        }
                        break;
                    case 178:
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
                            // flips.g:338:5: 'm'
                            {
                            char_literal216=(Token)match(input,176,FOLLOW_176_in_distanceUnit1842);  
                            stream_176.add(char_literal216);


                            }
                            break;
                        case 2 :
                            // flips.g:338:9: 'meter'
                            {
                            string_literal217=(Token)match(input,177,FOLLOW_177_in_distanceUnit1844);  
                            stream_177.add(string_literal217);


                            }
                            break;
                        case 3 :
                            // flips.g:338:17: 'meters'
                            {
                            string_literal218=(Token)match(input,178,FOLLOW_178_in_distanceUnit1846);  
                            stream_178.add(string_literal218);


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
                    // 339:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:340:4: ( 'cm' | 'centimeter' | 'centimeters' )
                    {
                    // flips.g:340:4: ( 'cm' | 'centimeter' | 'centimeters' )
                    int alt85=3;
                    switch ( input.LA(1) ) {
                    case 179:
                        {
                        alt85=1;
                        }
                        break;
                    case 180:
                        {
                        alt85=2;
                        }
                        break;
                    case 181:
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
                            // flips.g:340:5: 'cm'
                            {
                            string_literal219=(Token)match(input,179,FOLLOW_179_in_distanceUnit1858);  
                            stream_179.add(string_literal219);


                            }
                            break;
                        case 2 :
                            // flips.g:340:10: 'centimeter'
                            {
                            string_literal220=(Token)match(input,180,FOLLOW_180_in_distanceUnit1860);  
                            stream_180.add(string_literal220);


                            }
                            break;
                        case 3 :
                            // flips.g:340:23: 'centimeters'
                            {
                            string_literal221=(Token)match(input,181,FOLLOW_181_in_distanceUnit1862);  
                            stream_181.add(string_literal221);


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
                    // 341:2: -> CENTIMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CENTIMETER, "CENTIMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:342:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // flips.g:342:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==182) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==183) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // flips.g:342:5: 'nm'
                            {
                            string_literal222=(Token)match(input,182,FOLLOW_182_in_distanceUnit1874);  
                            stream_182.add(string_literal222);


                            }
                            break;
                        case 2 :
                            // flips.g:342:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal223=(Token)match(input,183,FOLLOW_183_in_distanceUnit1876);  
                            stream_183.add(string_literal223);

                            // flips.g:342:21: ( 'mi' | 'mile' | 'miles' )
                            int alt86=3;
                            switch ( input.LA(1) ) {
                            case 184:
                                {
                                alt86=1;
                                }
                                break;
                            case 185:
                                {
                                alt86=2;
                                }
                                break;
                            case 186:
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
                                    // flips.g:342:22: 'mi'
                                    {
                                    string_literal224=(Token)match(input,184,FOLLOW_184_in_distanceUnit1879);  
                                    stream_184.add(string_literal224);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:342:27: 'mile'
                                    {
                                    string_literal225=(Token)match(input,185,FOLLOW_185_in_distanceUnit1881);  
                                    stream_185.add(string_literal225);


                                    }
                                    break;
                                case 3 :
                                    // flips.g:342:34: 'miles'
                                    {
                                    string_literal226=(Token)match(input,186,FOLLOW_186_in_distanceUnit1883);  
                                    stream_186.add(string_literal226);


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
                    // 343:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:344:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // flips.g:344:4: ( 'statute' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==187) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // flips.g:344:5: 'statute'
                            {
                            string_literal227=(Token)match(input,187,FOLLOW_187_in_distanceUnit1898);  
                            stream_187.add(string_literal227);


                            }
                            break;

                    }

                    // flips.g:344:17: ( 'mi' | 'mile' | 'miles' )
                    int alt89=3;
                    switch ( input.LA(1) ) {
                    case 184:
                        {
                        alt89=1;
                        }
                        break;
                    case 185:
                        {
                        alt89=2;
                        }
                        break;
                    case 186:
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
                            // flips.g:344:18: 'mi'
                            {
                            string_literal228=(Token)match(input,184,FOLLOW_184_in_distanceUnit1903);  
                            stream_184.add(string_literal228);


                            }
                            break;
                        case 2 :
                            // flips.g:344:23: 'mile'
                            {
                            string_literal229=(Token)match(input,185,FOLLOW_185_in_distanceUnit1905);  
                            stream_185.add(string_literal229);


                            }
                            break;
                        case 3 :
                            // flips.g:344:30: 'miles'
                            {
                            string_literal230=(Token)match(input,186,FOLLOW_186_in_distanceUnit1907);  
                            stream_186.add(string_literal230);


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
                    // 345:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:346:4: ( 'f' | 'fur' | 'furlong' | 'furlongs' )
                    {
                    // flips.g:346:4: ( 'f' | 'fur' | 'furlong' | 'furlongs' )
                    int alt90=4;
                    switch ( input.LA(1) ) {
                    case 188:
                        {
                        alt90=1;
                        }
                        break;
                    case 189:
                        {
                        alt90=2;
                        }
                        break;
                    case 190:
                        {
                        alt90=3;
                        }
                        break;
                    case 191:
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
                            // flips.g:346:5: 'f'
                            {
                            char_literal231=(Token)match(input,188,FOLLOW_188_in_distanceUnit1919);  
                            stream_188.add(char_literal231);


                            }
                            break;
                        case 2 :
                            // flips.g:346:9: 'fur'
                            {
                            string_literal232=(Token)match(input,189,FOLLOW_189_in_distanceUnit1921);  
                            stream_189.add(string_literal232);


                            }
                            break;
                        case 3 :
                            // flips.g:346:15: 'furlong'
                            {
                            string_literal233=(Token)match(input,190,FOLLOW_190_in_distanceUnit1923);  
                            stream_190.add(string_literal233);


                            }
                            break;
                        case 4 :
                            // flips.g:346:25: 'furlongs'
                            {
                            string_literal234=(Token)match(input,191,FOLLOW_191_in_distanceUnit1925);  
                            stream_191.add(string_literal234);


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
                    // 347:2: -> FURLONG
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FURLONG, "FURLONG"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:348:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // flips.g:348:4: ( 'yd' | 'yard' | 'yards' )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case 192:
                        {
                        alt91=1;
                        }
                        break;
                    case 193:
                        {
                        alt91=2;
                        }
                        break;
                    case 194:
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
                            // flips.g:348:5: 'yd'
                            {
                            string_literal235=(Token)match(input,192,FOLLOW_192_in_distanceUnit1937);  
                            stream_192.add(string_literal235);


                            }
                            break;
                        case 2 :
                            // flips.g:348:10: 'yard'
                            {
                            string_literal236=(Token)match(input,193,FOLLOW_193_in_distanceUnit1939);  
                            stream_193.add(string_literal236);


                            }
                            break;
                        case 3 :
                            // flips.g:348:17: 'yards'
                            {
                            string_literal237=(Token)match(input,194,FOLLOW_194_in_distanceUnit1941);  
                            stream_194.add(string_literal237);


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
                    // 349:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // flips.g:350:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // flips.g:350:4: ( 'ft' | 'foot' | 'feet' )
                    int alt92=3;
                    switch ( input.LA(1) ) {
                    case 195:
                        {
                        alt92=1;
                        }
                        break;
                    case 196:
                        {
                        alt92=2;
                        }
                        break;
                    case 197:
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
                            // flips.g:350:5: 'ft'
                            {
                            string_literal238=(Token)match(input,195,FOLLOW_195_in_distanceUnit1953);  
                            stream_195.add(string_literal238);


                            }
                            break;
                        case 2 :
                            // flips.g:350:10: 'foot'
                            {
                            string_literal239=(Token)match(input,196,FOLLOW_196_in_distanceUnit1955);  
                            stream_196.add(string_literal239);


                            }
                            break;
                        case 3 :
                            // flips.g:350:17: 'feet'
                            {
                            string_literal240=(Token)match(input,197,FOLLOW_197_in_distanceUnit1957);  
                            stream_197.add(string_literal240);


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
                    // 351:2: -> FOOT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // flips.g:352:4: ( 'in' | 'inch' | 'inches' )
                    {
                    // flips.g:352:4: ( 'in' | 'inch' | 'inches' )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case 171:
                        {
                        alt93=1;
                        }
                        break;
                    case 198:
                        {
                        alt93=2;
                        }
                        break;
                    case 199:
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
                            // flips.g:352:5: 'in'
                            {
                            string_literal241=(Token)match(input,171,FOLLOW_171_in_distanceUnit1969);  
                            stream_171.add(string_literal241);


                            }
                            break;
                        case 2 :
                            // flips.g:352:10: 'inch'
                            {
                            string_literal242=(Token)match(input,198,FOLLOW_198_in_distanceUnit1971);  
                            stream_198.add(string_literal242);


                            }
                            break;
                        case 3 :
                            // flips.g:352:17: 'inches'
                            {
                            string_literal243=(Token)match(input,199,FOLLOW_199_in_distanceUnit1973);  
                            stream_199.add(string_literal243);


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
                    // 353:2: -> INCH
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
    // flips.g:358:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed244 = null;

        flipsParser.relativeSpeed_return relativeSpeed245 = null;

        flipsParser.optimalSpeed_return optimalSpeed246 = null;

        flipsParser.throttleSpeed_return throttleSpeed247 = null;



        try {
            // flips.g:359:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt95=4;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // flips.g:359:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1992);
                    fixedSpeed244=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed244.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:360:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1997);
                    relativeSpeed245=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed245.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:361:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed2002);
                    optimalSpeed246=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed246.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:362:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed2007);
                    throttleSpeed247=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed247.getTree());

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
    // flips.g:365:1: fixedSpeed : ( At )? speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At248=null;
        flipsParser.speedValue_return speedValue249 = null;


        CommonTree At248_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // flips.g:366:2: ( ( At )? speedValue -> ^( SPEED FIXED speedValue ) )
            // flips.g:366:4: ( At )? speedValue
            {
            // flips.g:366:4: ( At )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==At) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // flips.g:366:4: At
                    {
                    At248=(Token)match(input,At,FOLLOW_At_in_fixedSpeed2018);  
                    stream_At.add(At248);


                    }
                    break;

            }

            pushFollow(FOLLOW_speedValue_in_fixedSpeed2021);
            speedValue249=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue249.getTree());


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
            // 367:2: -> ^( SPEED FIXED speedValue )
            {
                // flips.g:367:5: ^( SPEED FIXED speedValue )
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
    // flips.g:370:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal251=null;
        Token string_literal253=null;
        Token string_literal255=null;
        Token string_literal257=null;
        flipsParser.speedValue_return speedValue250 = null;

        flipsParser.speedValue_return speedValue252 = null;

        flipsParser.percentValue_return percentValue254 = null;

        flipsParser.percentValue_return percentValue256 = null;


        CommonTree string_literal251_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree string_literal255_tree=null;
        CommonTree string_literal257_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // flips.g:371:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt97=4;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // flips.g:371:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed2043);
                    speedValue250=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue250.getTree());
                    string_literal251=(Token)match(input,200,FOLLOW_200_in_relativeSpeed2045);  
                    stream_200.add(string_literal251);



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
                    // 372:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // flips.g:372:5: ^( SPEED RELATIVE FASTER speedValue )
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
                    // flips.g:373:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed2063);
                    speedValue252=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue252.getTree());
                    string_literal253=(Token)match(input,201,FOLLOW_201_in_relativeSpeed2065);  
                    stream_201.add(string_literal253);



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
                    // 374:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // flips.g:374:5: ^( SPEED RELATIVE SLOWER speedValue )
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
                    // flips.g:375:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed2083);
                    percentValue254=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue254.getTree());
                    string_literal255=(Token)match(input,200,FOLLOW_200_in_relativeSpeed2085);  
                    stream_200.add(string_literal255);



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
                    // 376:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // flips.g:376:5: ^( SPEED RELATIVE FASTER percentValue )
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
                    // flips.g:377:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed2103);
                    percentValue256=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue256.getTree());
                    string_literal257=(Token)match(input,201,FOLLOW_201_in_relativeSpeed2105);  
                    stream_201.add(string_literal257);



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
                    // 378:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // flips.g:378:5: ^( SPEED RELATIVE SLOWER percentValue )
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
    // flips.g:381:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue258 = null;

        flipsParser.speedUnit_return speedUnit259 = null;



        try {
            // flips.g:382:2: ( numericValue speedUnit )
            // flips.g:382:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue2129);
            numericValue258=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue258.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue2131);
            speedUnit259=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit259.getTree());

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
    // flips.g:385:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | 'fpf' -> FURLONG FORTNIGHT | 'fpm' -> FOOT MINUTE | 'fps' -> FOOT SECOND | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal262=null;
        Token string_literal263=null;
        Token string_literal264=null;
        Token string_literal265=null;
        Token string_literal266=null;
        Token string_literal267=null;
        Token string_literal268=null;
        Token string_literal269=null;
        Token char_literal271=null;
        Token string_literal272=null;
        flipsParser.distanceUnit_return distanceUnit270 = null;

        flipsParser.timeUnit_return timeUnit273 = null;


        CommonTree string_literal260_tree=null;
        CommonTree string_literal261_tree=null;
        CommonTree string_literal262_tree=null;
        CommonTree string_literal263_tree=null;
        CommonTree string_literal264_tree=null;
        CommonTree string_literal265_tree=null;
        CommonTree string_literal266_tree=null;
        CommonTree string_literal267_tree=null;
        CommonTree string_literal268_tree=null;
        CommonTree string_literal269_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree string_literal272_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // flips.g:386:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | 'fpf' -> FURLONG FORTNIGHT | 'fpm' -> FOOT MINUTE | 'fps' -> FOOT SECOND | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt100=7;
            switch ( input.LA(1) ) {
            case 202:
                {
                alt100=1;
                }
                break;
            case 203:
                {
                alt100=2;
                }
                break;
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
                {
                alt100=3;
                }
                break;
            case 209:
                {
                alt100=4;
                }
                break;
            case 210:
                {
                alt100=5;
                }
                break;
            case 211:
                {
                alt100=6;
                }
                break;
            case 171:
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
            case 196:
            case 197:
            case 198:
            case 199:
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
                    // flips.g:386:4: 'kph'
                    {
                    string_literal260=(Token)match(input,202,FOLLOW_202_in_speedUnit2142);  
                    stream_202.add(string_literal260);



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
                    // 387:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:388:4: 'mph'
                    {
                    string_literal261=(Token)match(input,203,FOLLOW_203_in_speedUnit2154);  
                    stream_203.add(string_literal261);



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
                    // 389:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:390:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // flips.g:390:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt98=5;
                    switch ( input.LA(1) ) {
                    case 204:
                        {
                        alt98=1;
                        }
                        break;
                    case 205:
                        {
                        alt98=2;
                        }
                        break;
                    case 206:
                        {
                        alt98=3;
                        }
                        break;
                    case 207:
                        {
                        alt98=4;
                        }
                        break;
                    case 208:
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
                            // flips.g:390:5: 'kn'
                            {
                            string_literal262=(Token)match(input,204,FOLLOW_204_in_speedUnit2167);  
                            stream_204.add(string_literal262);


                            }
                            break;
                        case 2 :
                            // flips.g:390:10: 'kt'
                            {
                            string_literal263=(Token)match(input,205,FOLLOW_205_in_speedUnit2169);  
                            stream_205.add(string_literal263);


                            }
                            break;
                        case 3 :
                            // flips.g:390:15: 'kts'
                            {
                            string_literal264=(Token)match(input,206,FOLLOW_206_in_speedUnit2171);  
                            stream_206.add(string_literal264);


                            }
                            break;
                        case 4 :
                            // flips.g:390:21: 'knot'
                            {
                            string_literal265=(Token)match(input,207,FOLLOW_207_in_speedUnit2173);  
                            stream_207.add(string_literal265);


                            }
                            break;
                        case 5 :
                            // flips.g:390:28: 'knots'
                            {
                            string_literal266=(Token)match(input,208,FOLLOW_208_in_speedUnit2175);  
                            stream_208.add(string_literal266);


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
                    // 391:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:392:4: 'fpf'
                    {
                    string_literal267=(Token)match(input,209,FOLLOW_209_in_speedUnit2190);  
                    stream_209.add(string_literal267);



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
                    // 393:2: -> FURLONG FORTNIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FURLONG, "FURLONG"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FORTNIGHT, "FORTNIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:394:4: 'fpm'
                    {
                    string_literal268=(Token)match(input,210,FOLLOW_210_in_speedUnit2202);  
                    stream_210.add(string_literal268);



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
                    // 395:2: -> FOOT MINUTE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:396:4: 'fps'
                    {
                    string_literal269=(Token)match(input,211,FOLLOW_211_in_speedUnit2214);  
                    stream_211.add(string_literal269);



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
                    // 397:2: -> FOOT SECOND
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SECOND, "SECOND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:398:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit2226);
                    distanceUnit270=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit270.getTree());
                    // flips.g:398:17: ( '/' | 'per' )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==212) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==213) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // flips.g:398:18: '/'
                            {
                            char_literal271=(Token)match(input,212,FOLLOW_212_in_speedUnit2229);  
                            stream_212.add(char_literal271);


                            }
                            break;
                        case 2 :
                            // flips.g:398:22: 'per'
                            {
                            string_literal272=(Token)match(input,213,FOLLOW_213_in_speedUnit2231);  
                            stream_213.add(string_literal272);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit2234);
                    timeUnit273=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit273.getTree());


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
                    // 399:2: -> distanceUnit timeUnit
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

    public static class optimalSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimalSpeed"
    // flips.g:402:1: optimalSpeed : ( At )? optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At274=null;
        Token string_literal276=null;
        Token string_literal277=null;
        flipsParser.optimalUnit_return optimalUnit275 = null;


        CommonTree At274_tree=null;
        CommonTree string_literal276_tree=null;
        CommonTree string_literal277_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // flips.g:403:2: ( ( At )? optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // flips.g:403:4: ( At )? optimalUnit ( 'spd' | 'speed' )
            {
            // flips.g:403:4: ( At )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==At) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // flips.g:403:4: At
                    {
                    At274=(Token)match(input,At,FOLLOW_At_in_optimalSpeed2252);  
                    stream_At.add(At274);


                    }
                    break;

            }

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed2255);
            optimalUnit275=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit275.getTree());
            // flips.g:403:20: ( 'spd' | 'speed' )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==130) ) {
                alt102=1;
            }
            else if ( (LA102_0==131) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // flips.g:403:21: 'spd'
                    {
                    string_literal276=(Token)match(input,130,FOLLOW_130_in_optimalSpeed2258);  
                    stream_130.add(string_literal276);


                    }
                    break;
                case 2 :
                    // flips.g:403:27: 'speed'
                    {
                    string_literal277=(Token)match(input,131,FOLLOW_131_in_optimalSpeed2260);  
                    stream_131.add(string_literal277);


                    }
                    break;

            }



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
            // 404:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                // flips.g:404:5: ^( SPEED OPTIMAL optimalUnit )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(OPTIMAL, "OPTIMAL"));
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
        return retval;
    }
    // $ANTLR end "optimalSpeed"

    public static class optimalUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimalUnit"
    // flips.g:407:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal278=null;
        Token string_literal279=null;
        Token string_literal280=null;
        Token string_literal281=null;
        Token string_literal282=null;
        Token string_literal283=null;

        CommonTree string_literal278_tree=null;
        CommonTree string_literal279_tree=null;
        CommonTree string_literal280_tree=null;
        CommonTree string_literal281_tree=null;
        CommonTree string_literal282_tree=null;
        CommonTree string_literal283_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");

        try {
            // flips.g:408:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 214:
            case 215:
                {
                alt106=1;
                }
                break;
            case 216:
            case 217:
                {
                alt106=2;
                }
                break;
            case 218:
            case 219:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // flips.g:408:4: ( 'min' | 'minimum' )
                    {
                    // flips.g:408:4: ( 'min' | 'minimum' )
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
                            // flips.g:408:5: 'min'
                            {
                            string_literal278=(Token)match(input,214,FOLLOW_214_in_optimalUnit2284);  
                            stream_214.add(string_literal278);


                            }
                            break;
                        case 2 :
                            // flips.g:408:11: 'minimum'
                            {
                            string_literal279=(Token)match(input,215,FOLLOW_215_in_optimalUnit2286);  
                            stream_215.add(string_literal279);


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
                    // 409:2: -> MINIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:410:4: ( 'cru' | 'cruise' )
                    {
                    // flips.g:410:4: ( 'cru' | 'cruise' )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==216) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==217) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // flips.g:410:5: 'cru'
                            {
                            string_literal280=(Token)match(input,216,FOLLOW_216_in_optimalUnit2298);  
                            stream_216.add(string_literal280);


                            }
                            break;
                        case 2 :
                            // flips.g:410:11: 'cruise'
                            {
                            string_literal281=(Token)match(input,217,FOLLOW_217_in_optimalUnit2300);  
                            stream_217.add(string_literal281);


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
                    // 411:2: -> CRUISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:412:4: ( 'max' | 'maximum' )
                    {
                    // flips.g:412:4: ( 'max' | 'maximum' )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==218) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==219) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // flips.g:412:5: 'max'
                            {
                            string_literal282=(Token)match(input,218,FOLLOW_218_in_optimalUnit2312);  
                            stream_218.add(string_literal282);


                            }
                            break;
                        case 2 :
                            // flips.g:412:11: 'maximum'
                            {
                            string_literal283=(Token)match(input,219,FOLLOW_219_in_optimalUnit2314);  
                            stream_219.add(string_literal283);


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
                    // 413:2: -> MAXIMUM
                    {
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
        return retval;
    }
    // $ANTLR end "optimalUnit"

    public static class throttleSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleSpeed"
    // flips.g:416:1: throttleSpeed : ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At284=null;
        Token string_literal286=null;
        Token string_literal287=null;
        Token string_literal288=null;
        Token string_literal289=null;
        flipsParser.throttleValue_return throttleValue285 = null;


        CommonTree At284_tree=null;
        CommonTree string_literal286_tree=null;
        CommonTree string_literal287_tree=null;
        CommonTree string_literal288_tree=null;
        CommonTree string_literal289_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // flips.g:417:2: ( ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // flips.g:417:4: ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            // flips.g:417:4: ( At )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==At) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // flips.g:417:4: At
                    {
                    At284=(Token)match(input,At,FOLLOW_At_in_throttleSpeed2331);  
                    stream_At.add(At284);


                    }
                    break;

            }

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed2334);
            throttleValue285=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue285.getTree());
            // flips.g:417:22: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt108=4;
            switch ( input.LA(1) ) {
            case 220:
                {
                alt108=1;
                }
                break;
            case 221:
                {
                alt108=2;
                }
                break;
            case 222:
                {
                alt108=3;
                }
                break;
            case 223:
                {
                alt108=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // flips.g:417:23: 'pwr'
                    {
                    string_literal286=(Token)match(input,220,FOLLOW_220_in_throttleSpeed2337);  
                    stream_220.add(string_literal286);


                    }
                    break;
                case 2 :
                    // flips.g:417:29: 'power'
                    {
                    string_literal287=(Token)match(input,221,FOLLOW_221_in_throttleSpeed2339);  
                    stream_221.add(string_literal287);


                    }
                    break;
                case 3 :
                    // flips.g:417:37: 'thr'
                    {
                    string_literal288=(Token)match(input,222,FOLLOW_222_in_throttleSpeed2341);  
                    stream_222.add(string_literal288);


                    }
                    break;
                case 4 :
                    // flips.g:417:43: 'throttle'
                    {
                    string_literal289=(Token)match(input,223,FOLLOW_223_in_throttleSpeed2343);  
                    stream_223.add(string_literal289);


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
            // 418:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // flips.g:418:5: ^( SPEED THROTTLE throttleValue )
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
    // flips.g:421:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue290 = null;



        try {
            // flips.g:422:2: ( percentValue )
            // flips.g:422:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue2366);
            percentValue290=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue290.getTree());

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
    // flips.g:427:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At291=null;
        flipsParser.timeValue_return timeValue292 = null;


        CommonTree At291_tree=null;

        try {
            // flips.g:428:2: ( At timeValue )
            // flips.g:428:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At291=(Token)match(input,At,FOLLOW_At_in_time2379); 
            At291_tree = (CommonTree)adaptor.create(At291);
            adaptor.addChild(root_0, At291_tree);

            pushFollow(FOLLOW_timeValue_in_time2381);
            timeValue292=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue292.getTree());

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
    // flips.g:431:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal294=null;
        Token string_literal295=null;
        Token string_literal297=null;
        Token string_literal298=null;
        Token string_literal300=null;
        Token string_literal301=null;
        Token string_literal303=null;
        Token string_literal304=null;
        flipsParser.timeFormat_return timeFormat293 = null;

        flipsParser.integerValue_return integerValue296 = null;

        flipsParser.timeFormat_return timeFormat299 = null;

        flipsParser.integerValue_return integerValue302 = null;

        flipsParser.timeFormat_return timeFormat305 = null;


        CommonTree string_literal294_tree=null;
        CommonTree string_literal295_tree=null;
        CommonTree string_literal297_tree=null;
        CommonTree string_literal298_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree string_literal301_tree=null;
        CommonTree string_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // flips.g:432:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt113=5;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // flips.g:432:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2392);
                    timeFormat293=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat293.getTree());
                    // flips.g:432:15: ( 'am' | 'a.m.' )
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==224) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==225) ) {
                        alt109=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }
                    switch (alt109) {
                        case 1 :
                            // flips.g:432:16: 'am'
                            {
                            string_literal294=(Token)match(input,224,FOLLOW_224_in_timeValue2395);  
                            stream_224.add(string_literal294);


                            }
                            break;
                        case 2 :
                            // flips.g:432:21: 'a.m.'
                            {
                            string_literal295=(Token)match(input,225,FOLLOW_225_in_timeValue2397);  
                            stream_225.add(string_literal295);


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
                    // 433:2: -> ^( TIME timeFormat AM )
                    {
                        // flips.g:433:5: ^( TIME timeFormat AM )
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
                    // flips.g:434:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2414);
                    integerValue296=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue296.getTree());
                    // flips.g:434:17: ( 'am' | 'a.m.' )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==224) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==225) ) {
                        alt110=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // flips.g:434:18: 'am'
                            {
                            string_literal297=(Token)match(input,224,FOLLOW_224_in_timeValue2417);  
                            stream_224.add(string_literal297);


                            }
                            break;
                        case 2 :
                            // flips.g:434:23: 'a.m.'
                            {
                            string_literal298=(Token)match(input,225,FOLLOW_225_in_timeValue2419);  
                            stream_225.add(string_literal298);


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
                    // 435:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // flips.g:435:5: ^( TIME integerValue HOUR AM )
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
                    // flips.g:436:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2438);
                    timeFormat299=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat299.getTree());
                    // flips.g:436:15: ( 'pm' | 'p.m.' )
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==226) ) {
                        alt111=1;
                    }
                    else if ( (LA111_0==227) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // flips.g:436:16: 'pm'
                            {
                            string_literal300=(Token)match(input,226,FOLLOW_226_in_timeValue2441);  
                            stream_226.add(string_literal300);


                            }
                            break;
                        case 2 :
                            // flips.g:436:21: 'p.m.'
                            {
                            string_literal301=(Token)match(input,227,FOLLOW_227_in_timeValue2443);  
                            stream_227.add(string_literal301);


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
                    // 437:2: -> ^( TIME timeFormat PM )
                    {
                        // flips.g:437:5: ^( TIME timeFormat PM )
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
                    // flips.g:438:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2460);
                    integerValue302=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue302.getTree());
                    // flips.g:438:17: ( 'pm' | 'p.m.' )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==226) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==227) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // flips.g:438:18: 'pm'
                            {
                            string_literal303=(Token)match(input,226,FOLLOW_226_in_timeValue2463);  
                            stream_226.add(string_literal303);


                            }
                            break;
                        case 2 :
                            // flips.g:438:23: 'p.m.'
                            {
                            string_literal304=(Token)match(input,227,FOLLOW_227_in_timeValue2465);  
                            stream_227.add(string_literal304);


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
                    // 439:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // flips.g:439:5: ^( TIME integerValue HOUR PM )
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
                    // flips.g:440:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2484);
                    timeFormat305=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat305.getTree());


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
                    // 441:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // flips.g:441:5: ^( TIME timeFormat HOUR24 )
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
    // flips.g:444:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal306=null;
        Token char_literal307=null;
        Token char_literal308=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal306_tree=null;
        CommonTree char_literal307_tree=null;
        CommonTree char_literal308_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:445:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=BinaryLiteral && LA114_0<=HexLiteral)) ) {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==228) ) {
                    int LA114_2 = input.LA(3);

                    if ( ((LA114_2>=BinaryLiteral && LA114_2<=HexLiteral)) ) {
                        int LA114_3 = input.LA(4);

                        if ( (LA114_3==EOF||(LA114_3>=Identifier && LA114_3<=At)||LA114_3==With||(LA114_3>=Turning && LA114_3<=HexLiteral)||(LA114_3>=117 && LA114_3<=118)||(LA114_3>=121 && LA114_3<=124)||(LA114_3>=134 && LA114_3<=137)||(LA114_3>=140 && LA114_3<=145)||(LA114_3>=147 && LA114_3<=148)||LA114_3==150||(LA114_3>=171 && LA114_3<=172)||(LA114_3>=214 && LA114_3<=219)||(LA114_3>=224 && LA114_3<=227)||LA114_3==240||LA114_3==254||(LA114_3>=259 && LA114_3<=310)) ) {
                            alt114=1;
                        }
                        else if ( (LA114_3==228) ) {
                            alt114=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 114, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // flips.g:445:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2508);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal306=(Token)match(input,228,FOLLOW_228_in_timeFormat2510);  
                    stream_228.add(char_literal306);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2514);
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
                    // 446:2: -> $hr HOUR $min MINUTE
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
                    // flips.g:447:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2534);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal307=(Token)match(input,228,FOLLOW_228_in_timeFormat2536);  
                    stream_228.add(char_literal307);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2540);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal308=(Token)match(input,228,FOLLOW_228_in_timeFormat2542);  
                    stream_228.add(char_literal308);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2546);
                    s=numericValue();

                    state._fsp--;

                    stream_numericValue.add(s.getTree());


                    // AST REWRITE
                    // elements: min, s, hr
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
                    // 448:2: -> $hr HOUR $min MINUTE $s SECOND
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
    // flips.g:451:1: timeUnit : ( ( 'y' | 'yr' | 'yrs' | 'year' | 'years' ) -> YEAR | ( 'f' | 'fortnight' | 'fortnights' ) -> FORTNIGHT | ( 'wk' | 'wks' | 'week' | 'weeks' ) -> WEEK | ( 'd' | 'day' | 'days' ) -> DAY | hour | minute | second | ( 'ms' | 'millisecond' | 'milliseconds' ) -> MILLISECOND );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal309=null;
        Token string_literal310=null;
        Token string_literal311=null;
        Token string_literal312=null;
        Token string_literal313=null;
        Token char_literal314=null;
        Token string_literal315=null;
        Token string_literal316=null;
        Token string_literal317=null;
        Token string_literal318=null;
        Token string_literal319=null;
        Token string_literal320=null;
        Token char_literal321=null;
        Token string_literal322=null;
        Token string_literal323=null;
        Token string_literal327=null;
        Token string_literal328=null;
        Token string_literal329=null;
        flipsParser.hour_return hour324 = null;

        flipsParser.minute_return minute325 = null;

        flipsParser.second_return second326 = null;


        CommonTree char_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        CommonTree string_literal313_tree=null;
        CommonTree char_literal314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        CommonTree string_literal319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree char_literal321_tree=null;
        CommonTree string_literal322_tree=null;
        CommonTree string_literal323_tree=null;
        CommonTree string_literal327_tree=null;
        CommonTree string_literal328_tree=null;
        CommonTree string_literal329_tree=null;
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try {
            // flips.g:452:2: ( ( 'y' | 'yr' | 'yrs' | 'year' | 'years' ) -> YEAR | ( 'f' | 'fortnight' | 'fortnights' ) -> FORTNIGHT | ( 'wk' | 'wks' | 'week' | 'weeks' ) -> WEEK | ( 'd' | 'day' | 'days' ) -> DAY | hour | minute | second | ( 'ms' | 'millisecond' | 'milliseconds' ) -> MILLISECOND )
            int alt120=8;
            switch ( input.LA(1) ) {
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
                {
                alt120=1;
                }
                break;
            case 188:
            case 234:
            case 235:
                {
                alt120=2;
                }
                break;
            case 236:
            case 237:
            case 238:
            case 239:
                {
                alt120=3;
                }
                break;
            case 240:
            case 241:
            case 242:
                {
                alt120=4;
                }
                break;
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
                {
                alt120=5;
                }
                break;
            case 214:
            case 251:
            case 252:
            case 253:
                {
                alt120=6;
                }
                break;
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
                {
                alt120=7;
                }
                break;
            case 243:
            case 244:
            case 245:
                {
                alt120=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // flips.g:452:4: ( 'y' | 'yr' | 'yrs' | 'year' | 'years' )
                    {
                    // flips.g:452:4: ( 'y' | 'yr' | 'yrs' | 'year' | 'years' )
                    int alt115=5;
                    switch ( input.LA(1) ) {
                    case 229:
                        {
                        alt115=1;
                        }
                        break;
                    case 230:
                        {
                        alt115=2;
                        }
                        break;
                    case 231:
                        {
                        alt115=3;
                        }
                        break;
                    case 232:
                        {
                        alt115=4;
                        }
                        break;
                    case 233:
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
                            // flips.g:452:5: 'y'
                            {
                            char_literal309=(Token)match(input,229,FOLLOW_229_in_timeUnit2577);  
                            stream_229.add(char_literal309);


                            }
                            break;
                        case 2 :
                            // flips.g:452:9: 'yr'
                            {
                            string_literal310=(Token)match(input,230,FOLLOW_230_in_timeUnit2579);  
                            stream_230.add(string_literal310);


                            }
                            break;
                        case 3 :
                            // flips.g:452:14: 'yrs'
                            {
                            string_literal311=(Token)match(input,231,FOLLOW_231_in_timeUnit2581);  
                            stream_231.add(string_literal311);


                            }
                            break;
                        case 4 :
                            // flips.g:452:20: 'year'
                            {
                            string_literal312=(Token)match(input,232,FOLLOW_232_in_timeUnit2583);  
                            stream_232.add(string_literal312);


                            }
                            break;
                        case 5 :
                            // flips.g:452:27: 'years'
                            {
                            string_literal313=(Token)match(input,233,FOLLOW_233_in_timeUnit2585);  
                            stream_233.add(string_literal313);


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
                    // 453:2: -> YEAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YEAR, "YEAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:454:4: ( 'f' | 'fortnight' | 'fortnights' )
                    {
                    // flips.g:454:4: ( 'f' | 'fortnight' | 'fortnights' )
                    int alt116=3;
                    switch ( input.LA(1) ) {
                    case 188:
                        {
                        alt116=1;
                        }
                        break;
                    case 234:
                        {
                        alt116=2;
                        }
                        break;
                    case 235:
                        {
                        alt116=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }

                    switch (alt116) {
                        case 1 :
                            // flips.g:454:5: 'f'
                            {
                            char_literal314=(Token)match(input,188,FOLLOW_188_in_timeUnit2597);  
                            stream_188.add(char_literal314);


                            }
                            break;
                        case 2 :
                            // flips.g:454:9: 'fortnight'
                            {
                            string_literal315=(Token)match(input,234,FOLLOW_234_in_timeUnit2599);  
                            stream_234.add(string_literal315);


                            }
                            break;
                        case 3 :
                            // flips.g:454:21: 'fortnights'
                            {
                            string_literal316=(Token)match(input,235,FOLLOW_235_in_timeUnit2601);  
                            stream_235.add(string_literal316);


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
                    // 455:2: -> FORTNIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FORTNIGHT, "FORTNIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:456:4: ( 'wk' | 'wks' | 'week' | 'weeks' )
                    {
                    // flips.g:456:4: ( 'wk' | 'wks' | 'week' | 'weeks' )
                    int alt117=4;
                    switch ( input.LA(1) ) {
                    case 236:
                        {
                        alt117=1;
                        }
                        break;
                    case 237:
                        {
                        alt117=2;
                        }
                        break;
                    case 238:
                        {
                        alt117=3;
                        }
                        break;
                    case 239:
                        {
                        alt117=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }

                    switch (alt117) {
                        case 1 :
                            // flips.g:456:5: 'wk'
                            {
                            string_literal317=(Token)match(input,236,FOLLOW_236_in_timeUnit2613);  
                            stream_236.add(string_literal317);


                            }
                            break;
                        case 2 :
                            // flips.g:456:10: 'wks'
                            {
                            string_literal318=(Token)match(input,237,FOLLOW_237_in_timeUnit2615);  
                            stream_237.add(string_literal318);


                            }
                            break;
                        case 3 :
                            // flips.g:456:16: 'week'
                            {
                            string_literal319=(Token)match(input,238,FOLLOW_238_in_timeUnit2617);  
                            stream_238.add(string_literal319);


                            }
                            break;
                        case 4 :
                            // flips.g:456:23: 'weeks'
                            {
                            string_literal320=(Token)match(input,239,FOLLOW_239_in_timeUnit2619);  
                            stream_239.add(string_literal320);


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
                    // 457:2: -> WEEK
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEEK, "WEEK"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:458:4: ( 'd' | 'day' | 'days' )
                    {
                    // flips.g:458:4: ( 'd' | 'day' | 'days' )
                    int alt118=3;
                    switch ( input.LA(1) ) {
                    case 240:
                        {
                        alt118=1;
                        }
                        break;
                    case 241:
                        {
                        alt118=2;
                        }
                        break;
                    case 242:
                        {
                        alt118=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }

                    switch (alt118) {
                        case 1 :
                            // flips.g:458:5: 'd'
                            {
                            char_literal321=(Token)match(input,240,FOLLOW_240_in_timeUnit2631);  
                            stream_240.add(char_literal321);


                            }
                            break;
                        case 2 :
                            // flips.g:458:9: 'day'
                            {
                            string_literal322=(Token)match(input,241,FOLLOW_241_in_timeUnit2633);  
                            stream_241.add(string_literal322);


                            }
                            break;
                        case 3 :
                            // flips.g:458:15: 'days'
                            {
                            string_literal323=(Token)match(input,242,FOLLOW_242_in_timeUnit2635);  
                            stream_242.add(string_literal323);


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
                    // 459:2: -> DAY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DAY, "DAY"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:460:4: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2646);
                    hour324=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour324.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:461:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2651);
                    minute325=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute325.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:462:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2656);
                    second326=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second326.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:463:4: ( 'ms' | 'millisecond' | 'milliseconds' )
                    {
                    // flips.g:463:4: ( 'ms' | 'millisecond' | 'milliseconds' )
                    int alt119=3;
                    switch ( input.LA(1) ) {
                    case 243:
                        {
                        alt119=1;
                        }
                        break;
                    case 244:
                        {
                        alt119=2;
                        }
                        break;
                    case 245:
                        {
                        alt119=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 0, input);

                        throw nvae;
                    }

                    switch (alt119) {
                        case 1 :
                            // flips.g:463:5: 'ms'
                            {
                            string_literal327=(Token)match(input,243,FOLLOW_243_in_timeUnit2662);  
                            stream_243.add(string_literal327);


                            }
                            break;
                        case 2 :
                            // flips.g:463:10: 'millisecond'
                            {
                            string_literal328=(Token)match(input,244,FOLLOW_244_in_timeUnit2664);  
                            stream_244.add(string_literal328);


                            }
                            break;
                        case 3 :
                            // flips.g:463:24: 'milliseconds'
                            {
                            string_literal329=(Token)match(input,245,FOLLOW_245_in_timeUnit2666);  
                            stream_245.add(string_literal329);


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
                    // 464:2: -> MILLISECOND
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
    // flips.g:467:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal330=null;
        Token string_literal331=null;
        Token string_literal332=null;
        Token string_literal333=null;
        Token string_literal334=null;

        CommonTree char_literal330_tree=null;
        CommonTree string_literal331_tree=null;
        CommonTree string_literal332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree string_literal334_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");

        try {
            // flips.g:468:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // flips.g:468:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // flips.g:468:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt121=5;
            switch ( input.LA(1) ) {
            case 246:
                {
                alt121=1;
                }
                break;
            case 247:
                {
                alt121=2;
                }
                break;
            case 248:
                {
                alt121=3;
                }
                break;
            case 249:
                {
                alt121=4;
                }
                break;
            case 250:
                {
                alt121=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // flips.g:468:5: 'h'
                    {
                    char_literal330=(Token)match(input,246,FOLLOW_246_in_hour2684);  
                    stream_246.add(char_literal330);


                    }
                    break;
                case 2 :
                    // flips.g:468:9: 'hr'
                    {
                    string_literal331=(Token)match(input,247,FOLLOW_247_in_hour2686);  
                    stream_247.add(string_literal331);


                    }
                    break;
                case 3 :
                    // flips.g:468:14: 'hrs'
                    {
                    string_literal332=(Token)match(input,248,FOLLOW_248_in_hour2688);  
                    stream_248.add(string_literal332);


                    }
                    break;
                case 4 :
                    // flips.g:468:20: 'hour'
                    {
                    string_literal333=(Token)match(input,249,FOLLOW_249_in_hour2690);  
                    stream_249.add(string_literal333);


                    }
                    break;
                case 5 :
                    // flips.g:468:27: 'hours'
                    {
                    string_literal334=(Token)match(input,250,FOLLOW_250_in_hour2692);  
                    stream_250.add(string_literal334);


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
            // 469:2: -> HOUR
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
    // flips.g:472:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal335=null;
        Token string_literal336=null;
        Token string_literal337=null;
        Token string_literal338=null;

        CommonTree string_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree string_literal338_tree=null;
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");

        try {
            // flips.g:473:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // flips.g:473:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // flips.g:473:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt122=4;
            switch ( input.LA(1) ) {
            case 214:
                {
                alt122=1;
                }
                break;
            case 251:
                {
                alt122=2;
                }
                break;
            case 252:
                {
                alt122=3;
                }
                break;
            case 253:
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
                    // flips.g:473:5: 'min'
                    {
                    string_literal335=(Token)match(input,214,FOLLOW_214_in_minute2710);  
                    stream_214.add(string_literal335);


                    }
                    break;
                case 2 :
                    // flips.g:473:11: 'mins'
                    {
                    string_literal336=(Token)match(input,251,FOLLOW_251_in_minute2712);  
                    stream_251.add(string_literal336);


                    }
                    break;
                case 3 :
                    // flips.g:473:18: 'minute'
                    {
                    string_literal337=(Token)match(input,252,FOLLOW_252_in_minute2714);  
                    stream_252.add(string_literal337);


                    }
                    break;
                case 4 :
                    // flips.g:473:27: 'minutes'
                    {
                    string_literal338=(Token)match(input,253,FOLLOW_253_in_minute2716);  
                    stream_253.add(string_literal338);


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
            // 474:2: -> MINUTE
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
    // flips.g:477:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal339=null;
        Token string_literal340=null;
        Token string_literal341=null;
        Token string_literal342=null;
        Token string_literal343=null;

        CommonTree char_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree string_literal341_tree=null;
        CommonTree string_literal342_tree=null;
        CommonTree string_literal343_tree=null;
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // flips.g:478:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // flips.g:478:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // flips.g:478:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt123=5;
            switch ( input.LA(1) ) {
            case 254:
                {
                alt123=1;
                }
                break;
            case 255:
                {
                alt123=2;
                }
                break;
            case 256:
                {
                alt123=3;
                }
                break;
            case 257:
                {
                alt123=4;
                }
                break;
            case 258:
                {
                alt123=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // flips.g:478:5: 's'
                    {
                    char_literal339=(Token)match(input,254,FOLLOW_254_in_second2734);  
                    stream_254.add(char_literal339);


                    }
                    break;
                case 2 :
                    // flips.g:478:9: 'sec'
                    {
                    string_literal340=(Token)match(input,255,FOLLOW_255_in_second2736);  
                    stream_255.add(string_literal340);


                    }
                    break;
                case 3 :
                    // flips.g:478:15: 'secs'
                    {
                    string_literal341=(Token)match(input,256,FOLLOW_256_in_second2738);  
                    stream_256.add(string_literal341);


                    }
                    break;
                case 4 :
                    // flips.g:478:22: 'second'
                    {
                    string_literal342=(Token)match(input,257,FOLLOW_257_in_second2740);  
                    stream_257.add(string_literal342);


                    }
                    break;
                case 5 :
                    // flips.g:478:31: 'seconds'
                    {
                    string_literal343=(Token)match(input,258,FOLLOW_258_in_second2742);  
                    stream_258.add(string_literal343);


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
            // 479:2: -> SECOND
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
    // flips.g:482:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal344=null;
        flipsParser.durationValue_return durationValue345 = null;


        CommonTree string_literal344_tree=null;
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // flips.g:483:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // flips.g:483:4: 'for' durationValue
            {
            string_literal344=(Token)match(input,259,FOLLOW_259_in_duration2759);  
            stream_259.add(string_literal344);

            pushFollow(FOLLOW_durationValue_in_duration2761);
            durationValue345=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue345.getTree());


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
            // 484:2: -> ^( DURATION durationValue )
            {
                // flips.g:484:5: ^( DURATION durationValue )
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
    // flips.g:487:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue346 = null;

        flipsParser.timeUnit_return timeUnit347 = null;

        flipsParser.integerValue_return integerValue348 = null;

        flipsParser.hour_return hour349 = null;

        flipsParser.numericValue_return numericValue350 = null;

        flipsParser.minute_return minute351 = null;

        flipsParser.second_return second352 = null;

        flipsParser.integerValue_return integerValue353 = null;

        flipsParser.hour_return hour354 = null;

        flipsParser.integerValue_return integerValue355 = null;

        flipsParser.minute_return minute356 = null;

        flipsParser.numericValue_return numericValue357 = null;

        flipsParser.second_return second358 = null;

        flipsParser.integerValue_return integerValue359 = null;

        flipsParser.minute_return minute360 = null;

        flipsParser.numericValue_return numericValue361 = null;

        flipsParser.second_return second362 = null;

        flipsParser.timeFormat_return timeFormat363 = null;



        try {
            // flips.g:488:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt125=5;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // flips.g:488:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2781);
                    numericValue346=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue346.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2783);
                    timeUnit347=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit347.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:489:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2788);
                    integerValue348=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue348.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2790);
                    hour349=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour349.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2792);
                    numericValue350=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue350.getTree());
                    // flips.g:489:35: ( minute | second )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==214||(LA124_0>=251 && LA124_0<=253)) ) {
                        alt124=1;
                    }
                    else if ( ((LA124_0>=254 && LA124_0<=258)) ) {
                        alt124=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }
                    switch (alt124) {
                        case 1 :
                            // flips.g:489:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2795);
                            minute351=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute351.getTree());

                            }
                            break;
                        case 2 :
                            // flips.g:489:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2797);
                            second352=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second352.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // flips.g:490:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2803);
                    integerValue353=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue353.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2805);
                    hour354=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour354.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2807);
                    integerValue355=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue355.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2809);
                    minute356=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute356.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2811);
                    numericValue357=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue357.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2813);
                    second358=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second358.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:491:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2818);
                    integerValue359=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue359.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2820);
                    minute360=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute360.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2822);
                    numericValue361=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue361.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2824);
                    second362=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second362.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:492:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2829);
                    timeFormat363=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat363.getTree());

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
    // flips.g:497:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection364 = null;

        flipsParser.relativeDirection_return relativeDirection365 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // flips.g:498:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt126=2;
            switch ( input.LA(1) ) {
            case 254:
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
                {
                alt126=1;
                }
                break;
            case Turning:
                {
                int LA126_2 = input.LA(2);

                if ( ((LA126_2>=301 && LA126_2<=306)) ) {
                    alt126=2;
                }
                else if ( ((LA126_2>=FloatingPointLiteral && LA126_2<=HexLiteral)||LA126_2==254||(LA126_2>=260 && LA126_2<=290)) ) {
                    alt126=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA126_3 = input.LA(2);

                if ( ((LA126_3>=FloatingPointLiteral && LA126_3<=HexLiteral)||LA126_3==254||(LA126_3>=260 && LA126_3<=290)) ) {
                    alt126=1;
                }
                else if ( ((LA126_3>=301 && LA126_3<=306)) ) {
                    alt126=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // flips.g:498:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2842);
                    fixedDirection364=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection364.getTree());


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
                    // 499:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // flips.g:499:5: ^( DIRECTION FIXED fixedDirection )
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
                    // flips.g:500:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2858);
                    relativeDirection365=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection365.getTree());


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
                    // 501:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // flips.g:501:5: ^( DIRECTION RELATIVE relativeDirection )
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
    // flips.g:504:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning369=null;
        Token Heading370=null;
        flipsParser.cardinalDirection_return cardinalDirection366 = null;

        flipsParser.ordinalDirection_return ordinalDirection367 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection368 = null;

        flipsParser.cardinalDirection_return cardinalDirection371 = null;

        flipsParser.ordinalDirection_return ordinalDirection372 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection373 = null;

        flipsParser.angularValue_return angularValue374 = null;


        CommonTree Turning369_tree=null;
        CommonTree Heading370_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // flips.g:505:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt129=4;
            switch ( input.LA(1) ) {
            case 254:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
            case 266:
                {
                alt129=1;
                }
                break;
            case 267:
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 274:
                {
                alt129=2;
                }
                break;
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
                {
                alt129=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // flips.g:505:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2880);
                    cardinalDirection366=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection366.getTree());


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
                    // 506:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:507:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2890);
                    ordinalDirection367=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection367.getTree());


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
                    // 508:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:509:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2900);
                    subOrdinalDirection368=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection368.getTree());


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
                    // 510:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:511:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // flips.g:511:4: ( Turning | Heading )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==Turning) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==Heading) ) {
                        alt127=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // flips.g:511:5: Turning
                            {
                            Turning369=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2911);  
                            stream_Turning.add(Turning369);


                            }
                            break;
                        case 2 :
                            // flips.g:511:13: Heading
                            {
                            Heading370=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2913);  
                            stream_Heading.add(Heading370);


                            }
                            break;

                    }

                    // flips.g:511:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt128=4;
                    switch ( input.LA(1) ) {
                    case 254:
                    case 260:
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                        {
                        alt128=1;
                        }
                        break;
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                    case 272:
                    case 273:
                    case 274:
                        {
                        alt128=2;
                        }
                        break;
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
                        {
                        alt128=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt128=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;
                    }

                    switch (alt128) {
                        case 1 :
                            // flips.g:511:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2917);
                            cardinalDirection371=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection371.getTree());

                            }
                            break;
                        case 2 :
                            // flips.g:511:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2919);
                            ordinalDirection372=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection372.getTree());

                            }
                            break;
                        case 3 :
                            // flips.g:511:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2921);
                            subOrdinalDirection373=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection373.getTree());

                            }
                            break;
                        case 4 :
                            // flips.g:511:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2923);
                            angularValue374=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue374.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: angularValue, ordinalDirection, cardinalDirection, subOrdinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 512:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // flips.g:512:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // flips.g:512:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // flips.g:512:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // flips.g:512:63: ( angularValue )?
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
    // flips.g:515:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning375=null;
        Token Heading376=null;
        flipsParser.leftRightDirection_return leftRightDirection377 = null;

        flipsParser.angularValue_return angularValue378 = null;


        CommonTree Turning375_tree=null;
        CommonTree Heading376_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // flips.g:516:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // flips.g:516:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // flips.g:516:4: ( Turning | Heading )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==Turning) ) {
                alt130=1;
            }
            else if ( (LA130_0==Heading) ) {
                alt130=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // flips.g:516:5: Turning
                    {
                    Turning375=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2951);  
                    stream_Turning.add(Turning375);


                    }
                    break;
                case 2 :
                    // flips.g:516:13: Heading
                    {
                    Heading376=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2953);  
                    stream_Heading.add(Heading376);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2956);
            leftRightDirection377=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection377.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2958);
            angularValue378=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue378.getTree());


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
            // 517:2: -> leftRightDirection angularValue
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
    // flips.g:520:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection379 = null;

        flipsParser.eastWestDirection_return eastWestDirection380 = null;



        try {
            // flips.g:521:2: ( northSouthDirection | eastWestDirection )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==254||(LA131_0>=260 && LA131_0<=262)) ) {
                alt131=1;
            }
            else if ( ((LA131_0>=263 && LA131_0<=266)) ) {
                alt131=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // flips.g:521:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2976);
                    northSouthDirection379=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection379.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:522:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2981);
                    eastWestDirection380=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection380.getTree());

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
    // flips.g:525:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal381=null;
        Token string_literal382=null;
        Token char_literal383=null;
        Token string_literal384=null;

        CommonTree char_literal381_tree=null;
        CommonTree string_literal382_tree=null;
        CommonTree char_literal383_tree=null;
        CommonTree string_literal384_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");

        try {
            // flips.g:526:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=260 && LA134_0<=261)) ) {
                alt134=1;
            }
            else if ( (LA134_0==254||LA134_0==262) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // flips.g:526:4: ( 'n' | 'north' )
                    {
                    // flips.g:526:4: ( 'n' | 'north' )
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==260) ) {
                        alt132=1;
                    }
                    else if ( (LA132_0==261) ) {
                        alt132=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 0, input);

                        throw nvae;
                    }
                    switch (alt132) {
                        case 1 :
                            // flips.g:526:5: 'n'
                            {
                            char_literal381=(Token)match(input,260,FOLLOW_260_in_northSouthDirection2993);  
                            stream_260.add(char_literal381);


                            }
                            break;
                        case 2 :
                            // flips.g:526:9: 'north'
                            {
                            string_literal382=(Token)match(input,261,FOLLOW_261_in_northSouthDirection2995);  
                            stream_261.add(string_literal382);


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
                    // 527:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:528:4: ( 's' | 'south' )
                    {
                    // flips.g:528:4: ( 's' | 'south' )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==254) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==262) ) {
                        alt133=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // flips.g:528:5: 's'
                            {
                            char_literal383=(Token)match(input,254,FOLLOW_254_in_northSouthDirection3007);  
                            stream_254.add(char_literal383);


                            }
                            break;
                        case 2 :
                            // flips.g:528:9: 'south'
                            {
                            string_literal384=(Token)match(input,262,FOLLOW_262_in_northSouthDirection3009);  
                            stream_262.add(string_literal384);


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
                    // 529:2: -> SOUTH
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
    // flips.g:532:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal385=null;
        Token string_literal386=null;
        Token char_literal387=null;
        Token string_literal388=null;

        CommonTree char_literal385_tree=null;
        CommonTree string_literal386_tree=null;
        CommonTree char_literal387_tree=null;
        CommonTree string_literal388_tree=null;
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");

        try {
            // flips.g:533:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=263 && LA137_0<=264)) ) {
                alt137=1;
            }
            else if ( ((LA137_0>=265 && LA137_0<=266)) ) {
                alt137=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // flips.g:533:4: ( 'e' | 'east' )
                    {
                    // flips.g:533:4: ( 'e' | 'east' )
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==263) ) {
                        alt135=1;
                    }
                    else if ( (LA135_0==264) ) {
                        alt135=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }
                    switch (alt135) {
                        case 1 :
                            // flips.g:533:5: 'e'
                            {
                            char_literal385=(Token)match(input,263,FOLLOW_263_in_eastWestDirection3027);  
                            stream_263.add(char_literal385);


                            }
                            break;
                        case 2 :
                            // flips.g:533:9: 'east'
                            {
                            string_literal386=(Token)match(input,264,FOLLOW_264_in_eastWestDirection3029);  
                            stream_264.add(string_literal386);


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
                    // 534:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:535:4: ( 'w' | 'west' )
                    {
                    // flips.g:535:4: ( 'w' | 'west' )
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==265) ) {
                        alt136=1;
                    }
                    else if ( (LA136_0==266) ) {
                        alt136=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 136, 0, input);

                        throw nvae;
                    }
                    switch (alt136) {
                        case 1 :
                            // flips.g:535:5: 'w'
                            {
                            char_literal387=(Token)match(input,265,FOLLOW_265_in_eastWestDirection3041);  
                            stream_265.add(char_literal387);


                            }
                            break;
                        case 2 :
                            // flips.g:535:9: 'west'
                            {
                            string_literal388=(Token)match(input,266,FOLLOW_266_in_eastWestDirection3043);  
                            stream_266.add(string_literal388);


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
                    // 536:2: -> WEST
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
    // flips.g:539:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal389=null;
        Token string_literal390=null;
        Token string_literal391=null;
        Token string_literal392=null;
        Token string_literal393=null;
        Token string_literal394=null;
        Token string_literal395=null;
        Token string_literal396=null;

        CommonTree string_literal389_tree=null;
        CommonTree string_literal390_tree=null;
        CommonTree string_literal391_tree=null;
        CommonTree string_literal392_tree=null;
        CommonTree string_literal393_tree=null;
        CommonTree string_literal394_tree=null;
        CommonTree string_literal395_tree=null;
        CommonTree string_literal396_tree=null;
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleTokenStream stream_274=new RewriteRuleTokenStream(adaptor,"token 274");
        RewriteRuleTokenStream stream_273=new RewriteRuleTokenStream(adaptor,"token 273");

        try {
            // flips.g:540:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt142=4;
            switch ( input.LA(1) ) {
            case 267:
            case 268:
                {
                alt142=1;
                }
                break;
            case 269:
            case 270:
                {
                alt142=2;
                }
                break;
            case 271:
            case 272:
                {
                alt142=3;
                }
                break;
            case 273:
            case 274:
                {
                alt142=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // flips.g:540:4: ( 'ne' | 'northeast' )
                    {
                    // flips.g:540:4: ( 'ne' | 'northeast' )
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==267) ) {
                        alt138=1;
                    }
                    else if ( (LA138_0==268) ) {
                        alt138=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;
                    }
                    switch (alt138) {
                        case 1 :
                            // flips.g:540:5: 'ne'
                            {
                            string_literal389=(Token)match(input,267,FOLLOW_267_in_ordinalDirection3061);  
                            stream_267.add(string_literal389);


                            }
                            break;
                        case 2 :
                            // flips.g:540:10: 'northeast'
                            {
                            string_literal390=(Token)match(input,268,FOLLOW_268_in_ordinalDirection3063);  
                            stream_268.add(string_literal390);


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
                    // 541:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:542:4: ( 'se' | 'southeast' )
                    {
                    // flips.g:542:4: ( 'se' | 'southeast' )
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==269) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==270) ) {
                        alt139=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }
                    switch (alt139) {
                        case 1 :
                            // flips.g:542:5: 'se'
                            {
                            string_literal391=(Token)match(input,269,FOLLOW_269_in_ordinalDirection3077);  
                            stream_269.add(string_literal391);


                            }
                            break;
                        case 2 :
                            // flips.g:542:10: 'southeast'
                            {
                            string_literal392=(Token)match(input,270,FOLLOW_270_in_ordinalDirection3079);  
                            stream_270.add(string_literal392);


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
                    // 543:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:544:4: ( 'sw' | 'southwest' )
                    {
                    // flips.g:544:4: ( 'sw' | 'southwest' )
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==271) ) {
                        alt140=1;
                    }
                    else if ( (LA140_0==272) ) {
                        alt140=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;
                    }
                    switch (alt140) {
                        case 1 :
                            // flips.g:544:5: 'sw'
                            {
                            string_literal393=(Token)match(input,271,FOLLOW_271_in_ordinalDirection3093);  
                            stream_271.add(string_literal393);


                            }
                            break;
                        case 2 :
                            // flips.g:544:10: 'southwest'
                            {
                            string_literal394=(Token)match(input,272,FOLLOW_272_in_ordinalDirection3095);  
                            stream_272.add(string_literal394);


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
                    // 545:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:546:4: ( 'nw' | 'northwest' )
                    {
                    // flips.g:546:4: ( 'nw' | 'northwest' )
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==273) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==274) ) {
                        alt141=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }
                    switch (alt141) {
                        case 1 :
                            // flips.g:546:5: 'nw'
                            {
                            string_literal395=(Token)match(input,273,FOLLOW_273_in_ordinalDirection3109);  
                            stream_273.add(string_literal395);


                            }
                            break;
                        case 2 :
                            // flips.g:546:10: 'northwest'
                            {
                            string_literal396=(Token)match(input,274,FOLLOW_274_in_ordinalDirection3111);  
                            stream_274.add(string_literal396);


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
                    // 547:2: -> NORTH WEST
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
    // flips.g:550:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal397=null;
        Token string_literal398=null;
        Token string_literal399=null;
        Token string_literal400=null;
        Token string_literal401=null;
        Token string_literal402=null;
        Token string_literal403=null;
        Token string_literal404=null;
        Token string_literal405=null;
        Token string_literal406=null;
        Token string_literal407=null;
        Token string_literal408=null;
        Token string_literal409=null;
        Token string_literal410=null;
        Token string_literal411=null;
        Token string_literal412=null;

        CommonTree string_literal397_tree=null;
        CommonTree string_literal398_tree=null;
        CommonTree string_literal399_tree=null;
        CommonTree string_literal400_tree=null;
        CommonTree string_literal401_tree=null;
        CommonTree string_literal402_tree=null;
        CommonTree string_literal403_tree=null;
        CommonTree string_literal404_tree=null;
        CommonTree string_literal405_tree=null;
        CommonTree string_literal406_tree=null;
        CommonTree string_literal407_tree=null;
        CommonTree string_literal408_tree=null;
        CommonTree string_literal409_tree=null;
        CommonTree string_literal410_tree=null;
        CommonTree string_literal411_tree=null;
        CommonTree string_literal412_tree=null;
        RewriteRuleTokenStream stream_281=new RewriteRuleTokenStream(adaptor,"token 281");
        RewriteRuleTokenStream stream_280=new RewriteRuleTokenStream(adaptor,"token 280");
        RewriteRuleTokenStream stream_290=new RewriteRuleTokenStream(adaptor,"token 290");
        RewriteRuleTokenStream stream_285=new RewriteRuleTokenStream(adaptor,"token 285");
        RewriteRuleTokenStream stream_284=new RewriteRuleTokenStream(adaptor,"token 284");
        RewriteRuleTokenStream stream_283=new RewriteRuleTokenStream(adaptor,"token 283");
        RewriteRuleTokenStream stream_282=new RewriteRuleTokenStream(adaptor,"token 282");
        RewriteRuleTokenStream stream_275=new RewriteRuleTokenStream(adaptor,"token 275");
        RewriteRuleTokenStream stream_288=new RewriteRuleTokenStream(adaptor,"token 288");
        RewriteRuleTokenStream stream_289=new RewriteRuleTokenStream(adaptor,"token 289");
        RewriteRuleTokenStream stream_276=new RewriteRuleTokenStream(adaptor,"token 276");
        RewriteRuleTokenStream stream_277=new RewriteRuleTokenStream(adaptor,"token 277");
        RewriteRuleTokenStream stream_286=new RewriteRuleTokenStream(adaptor,"token 286");
        RewriteRuleTokenStream stream_287=new RewriteRuleTokenStream(adaptor,"token 287");
        RewriteRuleTokenStream stream_278=new RewriteRuleTokenStream(adaptor,"token 278");
        RewriteRuleTokenStream stream_279=new RewriteRuleTokenStream(adaptor,"token 279");

        try {
            // flips.g:551:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt151=8;
            switch ( input.LA(1) ) {
            case 275:
            case 276:
                {
                alt151=1;
                }
                break;
            case 277:
            case 278:
                {
                alt151=2;
                }
                break;
            case 279:
            case 280:
                {
                alt151=3;
                }
                break;
            case 281:
            case 282:
                {
                alt151=4;
                }
                break;
            case 283:
            case 284:
                {
                alt151=5;
                }
                break;
            case 285:
            case 286:
                {
                alt151=6;
                }
                break;
            case 287:
            case 288:
                {
                alt151=7;
                }
                break;
            case 289:
            case 290:
                {
                alt151=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // flips.g:551:4: ( 'nne' | 'north-northeast' )
                    {
                    // flips.g:551:4: ( 'nne' | 'north-northeast' )
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==275) ) {
                        alt143=1;
                    }
                    else if ( (LA143_0==276) ) {
                        alt143=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 143, 0, input);

                        throw nvae;
                    }
                    switch (alt143) {
                        case 1 :
                            // flips.g:551:5: 'nne'
                            {
                            string_literal397=(Token)match(input,275,FOLLOW_275_in_subOrdinalDirection3131);  
                            stream_275.add(string_literal397);


                            }
                            break;
                        case 2 :
                            // flips.g:551:11: 'north-northeast'
                            {
                            string_literal398=(Token)match(input,276,FOLLOW_276_in_subOrdinalDirection3133);  
                            stream_276.add(string_literal398);


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
                    // 552:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:553:4: ( 'ene' | 'east-northeast' )
                    {
                    // flips.g:553:4: ( 'ene' | 'east-northeast' )
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==277) ) {
                        alt144=1;
                    }
                    else if ( (LA144_0==278) ) {
                        alt144=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 0, input);

                        throw nvae;
                    }
                    switch (alt144) {
                        case 1 :
                            // flips.g:553:5: 'ene'
                            {
                            string_literal399=(Token)match(input,277,FOLLOW_277_in_subOrdinalDirection3149);  
                            stream_277.add(string_literal399);


                            }
                            break;
                        case 2 :
                            // flips.g:553:11: 'east-northeast'
                            {
                            string_literal400=(Token)match(input,278,FOLLOW_278_in_subOrdinalDirection3151);  
                            stream_278.add(string_literal400);


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
                    // 554:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:555:4: ( 'ese' | 'east-southeast' )
                    {
                    // flips.g:555:4: ( 'ese' | 'east-southeast' )
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==279) ) {
                        alt145=1;
                    }
                    else if ( (LA145_0==280) ) {
                        alt145=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 0, input);

                        throw nvae;
                    }
                    switch (alt145) {
                        case 1 :
                            // flips.g:555:5: 'ese'
                            {
                            string_literal401=(Token)match(input,279,FOLLOW_279_in_subOrdinalDirection3167);  
                            stream_279.add(string_literal401);


                            }
                            break;
                        case 2 :
                            // flips.g:555:11: 'east-southeast'
                            {
                            string_literal402=(Token)match(input,280,FOLLOW_280_in_subOrdinalDirection3169);  
                            stream_280.add(string_literal402);


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
                    // 556:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:557:4: ( 'sse' | 'south-southeast' )
                    {
                    // flips.g:557:4: ( 'sse' | 'south-southeast' )
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==281) ) {
                        alt146=1;
                    }
                    else if ( (LA146_0==282) ) {
                        alt146=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 146, 0, input);

                        throw nvae;
                    }
                    switch (alt146) {
                        case 1 :
                            // flips.g:557:5: 'sse'
                            {
                            string_literal403=(Token)match(input,281,FOLLOW_281_in_subOrdinalDirection3185);  
                            stream_281.add(string_literal403);


                            }
                            break;
                        case 2 :
                            // flips.g:557:11: 'south-southeast'
                            {
                            string_literal404=(Token)match(input,282,FOLLOW_282_in_subOrdinalDirection3187);  
                            stream_282.add(string_literal404);


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
                    // 558:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:559:4: ( 'ssw' | 'south-southwest' )
                    {
                    // flips.g:559:4: ( 'ssw' | 'south-southwest' )
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==283) ) {
                        alt147=1;
                    }
                    else if ( (LA147_0==284) ) {
                        alt147=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 147, 0, input);

                        throw nvae;
                    }
                    switch (alt147) {
                        case 1 :
                            // flips.g:559:5: 'ssw'
                            {
                            string_literal405=(Token)match(input,283,FOLLOW_283_in_subOrdinalDirection3203);  
                            stream_283.add(string_literal405);


                            }
                            break;
                        case 2 :
                            // flips.g:559:11: 'south-southwest'
                            {
                            string_literal406=(Token)match(input,284,FOLLOW_284_in_subOrdinalDirection3205);  
                            stream_284.add(string_literal406);


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
                    // 560:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:561:4: ( 'wsw' | 'west-southwest' )
                    {
                    // flips.g:561:4: ( 'wsw' | 'west-southwest' )
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==285) ) {
                        alt148=1;
                    }
                    else if ( (LA148_0==286) ) {
                        alt148=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;
                    }
                    switch (alt148) {
                        case 1 :
                            // flips.g:561:5: 'wsw'
                            {
                            string_literal407=(Token)match(input,285,FOLLOW_285_in_subOrdinalDirection3221);  
                            stream_285.add(string_literal407);


                            }
                            break;
                        case 2 :
                            // flips.g:561:11: 'west-southwest'
                            {
                            string_literal408=(Token)match(input,286,FOLLOW_286_in_subOrdinalDirection3223);  
                            stream_286.add(string_literal408);


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
                    // 562:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:563:4: ( 'wnw' | 'west-northwest' )
                    {
                    // flips.g:563:4: ( 'wnw' | 'west-northwest' )
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==287) ) {
                        alt149=1;
                    }
                    else if ( (LA149_0==288) ) {
                        alt149=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 149, 0, input);

                        throw nvae;
                    }
                    switch (alt149) {
                        case 1 :
                            // flips.g:563:5: 'wnw'
                            {
                            string_literal409=(Token)match(input,287,FOLLOW_287_in_subOrdinalDirection3239);  
                            stream_287.add(string_literal409);


                            }
                            break;
                        case 2 :
                            // flips.g:563:11: 'west-northwest'
                            {
                            string_literal410=(Token)match(input,288,FOLLOW_288_in_subOrdinalDirection3241);  
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
                    // 564:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // flips.g:565:4: ( 'nnw' | 'north-northwest' )
                    {
                    // flips.g:565:4: ( 'nnw' | 'north-northwest' )
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==289) ) {
                        alt150=1;
                    }
                    else if ( (LA150_0==290) ) {
                        alt150=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 150, 0, input);

                        throw nvae;
                    }
                    switch (alt150) {
                        case 1 :
                            // flips.g:565:5: 'nnw'
                            {
                            string_literal411=(Token)match(input,289,FOLLOW_289_in_subOrdinalDirection3257);  
                            stream_289.add(string_literal411);


                            }
                            break;
                        case 2 :
                            // flips.g:565:11: 'north-northwest'
                            {
                            string_literal412=(Token)match(input,290,FOLLOW_290_in_subOrdinalDirection3259);  
                            stream_290.add(string_literal412);


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
                    // 566:2: -> NORTH NORTH WEST
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
    // flips.g:569:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning413=null;
        flipsParser.clockDirection_return clockDirection414 = null;


        CommonTree Turning413_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // flips.g:570:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // flips.g:570:4: ( Turning )? clockDirection
            {
            // flips.g:570:4: ( Turning )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==Turning) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // flips.g:570:4: Turning
                    {
                    Turning413=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection3280);  
                    stream_Turning.add(Turning413);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection3283);
            clockDirection414=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection414.getTree());


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
            // 571:2: -> ^( DIRECTION TURN clockDirection )
            {
                // flips.g:571:5: ^( DIRECTION TURN clockDirection )
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
    // flips.g:574:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal415=null;
        Token string_literal416=null;
        Token char_literal417=null;
        Token string_literal418=null;
        Token string_literal419=null;
        Token string_literal420=null;
        Token string_literal421=null;
        Token char_literal422=null;
        Token string_literal423=null;
        Token string_literal424=null;
        Token string_literal425=null;

        CommonTree char_literal415_tree=null;
        CommonTree string_literal416_tree=null;
        CommonTree char_literal417_tree=null;
        CommonTree string_literal418_tree=null;
        CommonTree string_literal419_tree=null;
        CommonTree string_literal420_tree=null;
        CommonTree string_literal421_tree=null;
        CommonTree char_literal422_tree=null;
        CommonTree string_literal423_tree=null;
        CommonTree string_literal424_tree=null;
        CommonTree string_literal425_tree=null;
        RewriteRuleTokenStream stream_300=new RewriteRuleTokenStream(adaptor,"token 300");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_297=new RewriteRuleTokenStream(adaptor,"token 297");
        RewriteRuleTokenStream stream_298=new RewriteRuleTokenStream(adaptor,"token 298");
        RewriteRuleTokenStream stream_299=new RewriteRuleTokenStream(adaptor,"token 299");
        RewriteRuleTokenStream stream_294=new RewriteRuleTokenStream(adaptor,"token 294");
        RewriteRuleTokenStream stream_293=new RewriteRuleTokenStream(adaptor,"token 293");
        RewriteRuleTokenStream stream_296=new RewriteRuleTokenStream(adaptor,"token 296");
        RewriteRuleTokenStream stream_295=new RewriteRuleTokenStream(adaptor,"token 295");
        RewriteRuleTokenStream stream_292=new RewriteRuleTokenStream(adaptor,"token 292");
        RewriteRuleTokenStream stream_291=new RewriteRuleTokenStream(adaptor,"token 291");

        try {
            // flips.g:575:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( ((LA155_0>=291 && LA155_0<=297)) ) {
                alt155=1;
            }
            else if ( (LA155_0==240||(LA155_0>=298 && LA155_0<=300)) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // flips.g:575:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // flips.g:575:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt153=7;
                    switch ( input.LA(1) ) {
                    case 291:
                        {
                        alt153=1;
                        }
                        break;
                    case 292:
                        {
                        alt153=2;
                        }
                        break;
                    case 293:
                        {
                        alt153=3;
                        }
                        break;
                    case 294:
                        {
                        alt153=4;
                        }
                        break;
                    case 295:
                        {
                        alt153=5;
                        }
                        break;
                    case 296:
                        {
                        alt153=6;
                        }
                        break;
                    case 297:
                        {
                        alt153=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 153, 0, input);

                        throw nvae;
                    }

                    switch (alt153) {
                        case 1 :
                            // flips.g:575:5: 'u'
                            {
                            char_literal415=(Token)match(input,291,FOLLOW_291_in_upDownDirection3306);  
                            stream_291.add(char_literal415);


                            }
                            break;
                        case 2 :
                            // flips.g:575:9: 'up'
                            {
                            string_literal416=(Token)match(input,292,FOLLOW_292_in_upDownDirection3308);  
                            stream_292.add(string_literal416);


                            }
                            break;
                        case 3 :
                            // flips.g:575:14: 'c'
                            {
                            char_literal417=(Token)match(input,293,FOLLOW_293_in_upDownDirection3310);  
                            stream_293.add(char_literal417);


                            }
                            break;
                        case 4 :
                            // flips.g:575:18: 'climb'
                            {
                            string_literal418=(Token)match(input,294,FOLLOW_294_in_upDownDirection3312);  
                            stream_294.add(string_literal418);


                            }
                            break;
                        case 5 :
                            // flips.g:575:26: 'climbing'
                            {
                            string_literal419=(Token)match(input,295,FOLLOW_295_in_upDownDirection3314);  
                            stream_295.add(string_literal419);


                            }
                            break;
                        case 6 :
                            // flips.g:575:37: 'ascend'
                            {
                            string_literal420=(Token)match(input,296,FOLLOW_296_in_upDownDirection3316);  
                            stream_296.add(string_literal420);


                            }
                            break;
                        case 7 :
                            // flips.g:575:46: 'ascending'
                            {
                            string_literal421=(Token)match(input,297,FOLLOW_297_in_upDownDirection3318);  
                            stream_297.add(string_literal421);


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
                    // 576:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:577:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // flips.g:577:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt154=4;
                    switch ( input.LA(1) ) {
                    case 240:
                        {
                        alt154=1;
                        }
                        break;
                    case 298:
                        {
                        alt154=2;
                        }
                        break;
                    case 299:
                        {
                        alt154=3;
                        }
                        break;
                    case 300:
                        {
                        alt154=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 154, 0, input);

                        throw nvae;
                    }

                    switch (alt154) {
                        case 1 :
                            // flips.g:577:5: 'd'
                            {
                            char_literal422=(Token)match(input,240,FOLLOW_240_in_upDownDirection3330);  
                            stream_240.add(char_literal422);


                            }
                            break;
                        case 2 :
                            // flips.g:577:9: 'down'
                            {
                            string_literal423=(Token)match(input,298,FOLLOW_298_in_upDownDirection3332);  
                            stream_298.add(string_literal423);


                            }
                            break;
                        case 3 :
                            // flips.g:577:16: 'descend'
                            {
                            string_literal424=(Token)match(input,299,FOLLOW_299_in_upDownDirection3334);  
                            stream_299.add(string_literal424);


                            }
                            break;
                        case 4 :
                            // flips.g:577:26: 'descending'
                            {
                            string_literal425=(Token)match(input,300,FOLLOW_300_in_upDownDirection3336);  
                            stream_300.add(string_literal425);


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
                    // 578:2: -> DESCEND
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
    // flips.g:581:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal426=null;
        Token string_literal427=null;
        Token string_literal428=null;
        Token char_literal429=null;
        Token string_literal430=null;
        Token string_literal431=null;

        CommonTree char_literal426_tree=null;
        CommonTree string_literal427_tree=null;
        CommonTree string_literal428_tree=null;
        CommonTree char_literal429_tree=null;
        CommonTree string_literal430_tree=null;
        CommonTree string_literal431_tree=null;
        RewriteRuleTokenStream stream_302=new RewriteRuleTokenStream(adaptor,"token 302");
        RewriteRuleTokenStream stream_301=new RewriteRuleTokenStream(adaptor,"token 301");
        RewriteRuleTokenStream stream_304=new RewriteRuleTokenStream(adaptor,"token 304");
        RewriteRuleTokenStream stream_303=new RewriteRuleTokenStream(adaptor,"token 303");
        RewriteRuleTokenStream stream_306=new RewriteRuleTokenStream(adaptor,"token 306");
        RewriteRuleTokenStream stream_305=new RewriteRuleTokenStream(adaptor,"token 305");

        try {
            // flips.g:582:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( ((LA158_0>=301 && LA158_0<=303)) ) {
                alt158=1;
            }
            else if ( ((LA158_0>=304 && LA158_0<=306)) ) {
                alt158=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // flips.g:582:4: ( 'l' | 'left' | 'port' )
                    {
                    // flips.g:582:4: ( 'l' | 'left' | 'port' )
                    int alt156=3;
                    switch ( input.LA(1) ) {
                    case 301:
                        {
                        alt156=1;
                        }
                        break;
                    case 302:
                        {
                        alt156=2;
                        }
                        break;
                    case 303:
                        {
                        alt156=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 156, 0, input);

                        throw nvae;
                    }

                    switch (alt156) {
                        case 1 :
                            // flips.g:582:5: 'l'
                            {
                            char_literal426=(Token)match(input,301,FOLLOW_301_in_leftRightDirection3354);  
                            stream_301.add(char_literal426);


                            }
                            break;
                        case 2 :
                            // flips.g:582:9: 'left'
                            {
                            string_literal427=(Token)match(input,302,FOLLOW_302_in_leftRightDirection3356);  
                            stream_302.add(string_literal427);


                            }
                            break;
                        case 3 :
                            // flips.g:582:16: 'port'
                            {
                            string_literal428=(Token)match(input,303,FOLLOW_303_in_leftRightDirection3358);  
                            stream_303.add(string_literal428);


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
                    // 583:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:584:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // flips.g:584:4: ( 'r' | 'right' | 'starboard' )
                    int alt157=3;
                    switch ( input.LA(1) ) {
                    case 304:
                        {
                        alt157=1;
                        }
                        break;
                    case 305:
                        {
                        alt157=2;
                        }
                        break;
                    case 306:
                        {
                        alt157=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }

                    switch (alt157) {
                        case 1 :
                            // flips.g:584:5: 'r'
                            {
                            char_literal429=(Token)match(input,304,FOLLOW_304_in_leftRightDirection3370);  
                            stream_304.add(char_literal429);


                            }
                            break;
                        case 2 :
                            // flips.g:584:9: 'right'
                            {
                            string_literal430=(Token)match(input,305,FOLLOW_305_in_leftRightDirection3372);  
                            stream_305.add(string_literal430);


                            }
                            break;
                        case 3 :
                            // flips.g:584:17: 'starboard'
                            {
                            string_literal431=(Token)match(input,306,FOLLOW_306_in_leftRightDirection3374);  
                            stream_306.add(string_literal431);


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
                    // 585:2: -> RIGHT
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
    // flips.g:588:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal432=null;
        Token string_literal433=null;
        Token string_literal434=null;
        Token string_literal435=null;

        CommonTree string_literal432_tree=null;
        CommonTree string_literal433_tree=null;
        CommonTree string_literal434_tree=null;
        CommonTree string_literal435_tree=null;
        RewriteRuleTokenStream stream_308=new RewriteRuleTokenStream(adaptor,"token 308");
        RewriteRuleTokenStream stream_307=new RewriteRuleTokenStream(adaptor,"token 307");
        RewriteRuleTokenStream stream_310=new RewriteRuleTokenStream(adaptor,"token 310");
        RewriteRuleTokenStream stream_309=new RewriteRuleTokenStream(adaptor,"token 309");

        try {
            // flips.g:589:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( ((LA161_0>=307 && LA161_0<=308)) ) {
                alt161=1;
            }
            else if ( ((LA161_0>=309 && LA161_0<=310)) ) {
                alt161=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // flips.g:589:4: ( 'cw' | 'clockwise' )
                    {
                    // flips.g:589:4: ( 'cw' | 'clockwise' )
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==307) ) {
                        alt159=1;
                    }
                    else if ( (LA159_0==308) ) {
                        alt159=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 159, 0, input);

                        throw nvae;
                    }
                    switch (alt159) {
                        case 1 :
                            // flips.g:589:5: 'cw'
                            {
                            string_literal432=(Token)match(input,307,FOLLOW_307_in_clockDirection3392);  
                            stream_307.add(string_literal432);


                            }
                            break;
                        case 2 :
                            // flips.g:589:10: 'clockwise'
                            {
                            string_literal433=(Token)match(input,308,FOLLOW_308_in_clockDirection3394);  
                            stream_308.add(string_literal433);


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
                    // 590:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:591:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // flips.g:591:4: ( 'ccw' | 'counterclockwise' )
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==309) ) {
                        alt160=1;
                    }
                    else if ( (LA160_0==310) ) {
                        alt160=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 160, 0, input);

                        throw nvae;
                    }
                    switch (alt160) {
                        case 1 :
                            // flips.g:591:5: 'ccw'
                            {
                            string_literal434=(Token)match(input,309,FOLLOW_309_in_clockDirection3406);  
                            stream_309.add(string_literal434);


                            }
                            break;
                        case 2 :
                            // flips.g:591:11: 'counterclockwise'
                            {
                            string_literal435=(Token)match(input,310,FOLLOW_310_in_clockDirection3408);  
                            stream_310.add(string_literal435);


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
                    // 592:2: -> COUNTERCLOCKWISE
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
    // flips.g:595:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal437=null;
        Token string_literal438=null;
        Token string_literal439=null;
        Token string_literal440=null;
        Token char_literal442=null;
        Token char_literal444=null;
        Token string_literal446=null;
        Token string_literal447=null;
        Token string_literal448=null;
        Token string_literal449=null;
        flipsParser.numericValue_return numericValue436 = null;

        flipsParser.integerValue_return integerValue441 = null;

        flipsParser.numericValue_return numericValue443 = null;

        flipsParser.numericValue_return numericValue445 = null;


        CommonTree string_literal437_tree=null;
        CommonTree string_literal438_tree=null;
        CommonTree string_literal439_tree=null;
        CommonTree string_literal440_tree=null;
        CommonTree char_literal442_tree=null;
        CommonTree char_literal444_tree=null;
        CommonTree string_literal446_tree=null;
        CommonTree string_literal447_tree=null;
        CommonTree string_literal448_tree=null;
        CommonTree string_literal449_tree=null;
        RewriteRuleTokenStream stream_318=new RewriteRuleTokenStream(adaptor,"token 318");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_319=new RewriteRuleTokenStream(adaptor,"token 319");
        RewriteRuleTokenStream stream_316=new RewriteRuleTokenStream(adaptor,"token 316");
        RewriteRuleTokenStream stream_317=new RewriteRuleTokenStream(adaptor,"token 317");
        RewriteRuleTokenStream stream_314=new RewriteRuleTokenStream(adaptor,"token 314");
        RewriteRuleTokenStream stream_315=new RewriteRuleTokenStream(adaptor,"token 315");
        RewriteRuleTokenStream stream_312=new RewriteRuleTokenStream(adaptor,"token 312");
        RewriteRuleTokenStream stream_313=new RewriteRuleTokenStream(adaptor,"token 313");
        RewriteRuleTokenStream stream_311=new RewriteRuleTokenStream(adaptor,"token 311");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:596:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt164=3;
            int LA164_0 = input.LA(1);

            if ( ((LA164_0>=BinaryLiteral && LA164_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 316:
                case 317:
                case 318:
                case 319:
                    {
                    alt164=3;
                    }
                    break;
                case 240:
                    {
                    alt164=2;
                    }
                    break;
                case 311:
                case 312:
                case 313:
                case 314:
                    {
                    alt164=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 164, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA164_0==FloatingPointLiteral) ) {
                int LA164_2 = input.LA(2);

                if ( ((LA164_2>=316 && LA164_2<=319)) ) {
                    alt164=3;
                }
                else if ( ((LA164_2>=311 && LA164_2<=314)) ) {
                    alt164=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 164, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // flips.g:596:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3425);
                    numericValue436=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue436.getTree());
                    // flips.g:596:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt162=4;
                    switch ( input.LA(1) ) {
                    case 311:
                        {
                        alt162=1;
                        }
                        break;
                    case 312:
                        {
                        alt162=2;
                        }
                        break;
                    case 313:
                        {
                        alt162=3;
                        }
                        break;
                    case 314:
                        {
                        alt162=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 162, 0, input);

                        throw nvae;
                    }

                    switch (alt162) {
                        case 1 :
                            // flips.g:596:18: 'deg'
                            {
                            string_literal437=(Token)match(input,311,FOLLOW_311_in_angularValue3428);  
                            stream_311.add(string_literal437);


                            }
                            break;
                        case 2 :
                            // flips.g:596:24: 'degs'
                            {
                            string_literal438=(Token)match(input,312,FOLLOW_312_in_angularValue3430);  
                            stream_312.add(string_literal438);


                            }
                            break;
                        case 3 :
                            // flips.g:596:31: 'degree'
                            {
                            string_literal439=(Token)match(input,313,FOLLOW_313_in_angularValue3432);  
                            stream_313.add(string_literal439);


                            }
                            break;
                        case 4 :
                            // flips.g:596:40: 'degrees'
                            {
                            string_literal440=(Token)match(input,314,FOLLOW_314_in_angularValue3434);  
                            stream_314.add(string_literal440);


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
                    // 597:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:598:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue3447);
                    integerValue441=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue441.getTree());
                    char_literal442=(Token)match(input,240,FOLLOW_240_in_angularValue3449);  
                    stream_240.add(char_literal442);

                    pushFollow(FOLLOW_numericValue_in_angularValue3451);
                    numericValue443=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue443.getTree());
                    char_literal444=(Token)match(input,315,FOLLOW_315_in_angularValue3453);  
                    stream_315.add(char_literal444);



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
                    // 599:2: -> integerValue DEGREE numericValue MINUTE
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
                    // flips.g:600:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3469);
                    numericValue445=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue445.getTree());
                    // flips.g:600:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt163=4;
                    switch ( input.LA(1) ) {
                    case 316:
                        {
                        alt163=1;
                        }
                        break;
                    case 317:
                        {
                        alt163=2;
                        }
                        break;
                    case 318:
                        {
                        alt163=3;
                        }
                        break;
                    case 319:
                        {
                        alt163=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 163, 0, input);

                        throw nvae;
                    }

                    switch (alt163) {
                        case 1 :
                            // flips.g:600:18: 'rad'
                            {
                            string_literal446=(Token)match(input,316,FOLLOW_316_in_angularValue3472);  
                            stream_316.add(string_literal446);


                            }
                            break;
                        case 2 :
                            // flips.g:600:24: 'rads'
                            {
                            string_literal447=(Token)match(input,317,FOLLOW_317_in_angularValue3474);  
                            stream_317.add(string_literal447);


                            }
                            break;
                        case 3 :
                            // flips.g:600:31: 'radian'
                            {
                            string_literal448=(Token)match(input,318,FOLLOW_318_in_angularValue3476);  
                            stream_318.add(string_literal448);


                            }
                            break;
                        case 4 :
                            // flips.g:600:40: 'radians'
                            {
                            string_literal449=(Token)match(input,319,FOLLOW_319_in_angularValue3478);  
                            stream_319.add(string_literal449);


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
                    // 601:2: -> numericValue RADIAN
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
    // flips.g:606:1: waypoint : ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier451=null;
        flipsParser.geoCoordinate_return geoCoordinate450 = null;


        CommonTree Identifier451_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // flips.g:607:2: ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( ((LA165_0>=FloatingPointLiteral && LA165_0<=HexLiteral)||LA165_0==109||(LA165_0>=320 && LA165_0<=321)) ) {
                alt165=1;
            }
            else if ( (LA165_0==Identifier) ) {
                alt165=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // flips.g:607:4: geoCoordinate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_geoCoordinate_in_waypoint3499);
                    geoCoordinate450=geoCoordinate();

                    state._fsp--;

                    adaptor.addChild(root_0, geoCoordinate450.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:608:4: Identifier
                    {
                    Identifier451=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint3504);  
                    stream_Identifier.add(Identifier451);



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
                    // 609:2: -> ^( WAYPOINT Identifier )
                    {
                        // flips.g:609:5: ^( WAYPOINT Identifier )
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
    // flips.g:612:1: geoCoordinate : ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) );
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude452 = null;

        flipsParser.distanceCoordinate_return distanceCoordinate453 = null;


        RewriteRuleSubtreeStream stream_distanceCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule distanceCoordinate");
        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // flips.g:613:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( ((LA166_0>=FloatingPointLiteral && LA166_0<=HexLiteral)||(LA166_0>=320 && LA166_0<=321)) ) {
                alt166=1;
            }
            else if ( (LA166_0==109) ) {
                alt166=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // flips.g:613:4: latitudeLongitude
                    {
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate3524);
                    latitudeLongitude452=latitudeLongitude();

                    state._fsp--;

                    stream_latitudeLongitude.add(latitudeLongitude452.getTree());


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
                    // 614:2: -> ^( GEOCOORDINATE latitudeLongitude )
                    {
                        // flips.g:614:5: ^( GEOCOORDINATE latitudeLongitude )
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
                    // flips.g:615:4: distanceCoordinate
                    {
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate3538);
                    distanceCoordinate453=distanceCoordinate();

                    state._fsp--;

                    stream_distanceCoordinate.add(distanceCoordinate453.getTree());


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
                    // 616:2: -> ^( GEOCOORDINATE distanceCoordinate )
                    {
                        // flips.g:616:5: ^( GEOCOORDINATE distanceCoordinate )
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
    // flips.g:619:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal455=null;
        Token char_literal457=null;
        Token char_literal458=null;
        Token char_literal459=null;
        Token char_literal460=null;
        Token char_literal461=null;
        Token char_literal462=null;
        Token char_literal463=null;
        Token char_literal464=null;
        Token char_literal465=null;
        Token char_literal466=null;
        Token char_literal467=null;
        Token char_literal468=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection454 = null;

        flipsParser.eastWestDirection_return eastWestDirection456 = null;


        CommonTree char_literal455_tree=null;
        CommonTree char_literal457_tree=null;
        CommonTree char_literal458_tree=null;
        CommonTree char_literal459_tree=null;
        CommonTree char_literal460_tree=null;
        CommonTree char_literal461_tree=null;
        CommonTree char_literal462_tree=null;
        CommonTree char_literal463_tree=null;
        CommonTree char_literal464_tree=null;
        CommonTree char_literal465_tree=null;
        CommonTree char_literal466_tree=null;
        CommonTree char_literal467_tree=null;
        CommonTree char_literal468_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_320=new RewriteRuleTokenStream(adaptor,"token 320");
        RewriteRuleTokenStream stream_321=new RewriteRuleTokenStream(adaptor,"token 321");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // flips.g:620:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt176=5;
            alt176 = dfa176.predict(input);
            switch (alt176) {
                case 1 :
                    // flips.g:620:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3560);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3562);
                    northSouthDirection454=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection454.getTree());
                    // flips.g:620:49: ( ',' )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==108) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // flips.g:620:49: ','
                            {
                            char_literal455=(Token)match(input,108,FOLLOW_108_in_latitudeLongitude3564);  
                            stream_108.add(char_literal455);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3569);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3571);
                    eastWestDirection456=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection456.getTree());


                    // AST REWRITE
                    // elements: y, x, eastWestDirection, northSouthDirection
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
                    // 621:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // flips.g:621:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:621:40: ^( LONGITUDE $y eastWestDirection )
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
                    // flips.g:622:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // flips.g:622:4: ( '+' )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==320) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // flips.g:622:4: '+'
                            {
                            char_literal457=(Token)match(input,320,FOLLOW_320_in_latitudeLongitude3597);  
                            stream_320.add(char_literal457);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3602);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:622:34: ( ',' )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==108) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // flips.g:622:34: ','
                            {
                            char_literal458=(Token)match(input,108,FOLLOW_108_in_latitudeLongitude3604);  
                            stream_108.add(char_literal458);


                            }
                            break;

                    }

                    // flips.g:622:39: ( '+' )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==320) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // flips.g:622:39: '+'
                            {
                            char_literal459=(Token)match(input,320,FOLLOW_320_in_latitudeLongitude3607);  
                            stream_320.add(char_literal459);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3612);
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
                    // 623:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // flips.g:623:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:623:26: ^( LONGITUDE $y EAST )
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
                    // flips.g:624:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal460=(Token)match(input,321,FOLLOW_321_in_latitudeLongitude3638);  
                    stream_321.add(char_literal460);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3642);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:624:33: ( ',' )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==108) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // flips.g:624:33: ','
                            {
                            char_literal461=(Token)match(input,108,FOLLOW_108_in_latitudeLongitude3644);  
                            stream_108.add(char_literal461);


                            }
                            break;

                    }

                    // flips.g:624:38: ( '+' )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==320) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // flips.g:624:38: '+'
                            {
                            char_literal462=(Token)match(input,320,FOLLOW_320_in_latitudeLongitude3647);  
                            stream_320.add(char_literal462);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3652);
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
                    // 625:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // flips.g:625:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:625:26: ^( LONGITUDE $y EAST )
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
                    // flips.g:626:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // flips.g:626:4: ( '+' )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==320) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // flips.g:626:4: '+'
                            {
                            char_literal463=(Token)match(input,320,FOLLOW_320_in_latitudeLongitude3678);  
                            stream_320.add(char_literal463);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3683);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:626:34: ( ',' )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==108) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // flips.g:626:34: ','
                            {
                            char_literal464=(Token)match(input,108,FOLLOW_108_in_latitudeLongitude3685);  
                            stream_108.add(char_literal464);


                            }
                            break;

                    }

                    char_literal465=(Token)match(input,321,FOLLOW_321_in_latitudeLongitude3688);  
                    stream_321.add(char_literal465);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3692);
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
                    // 627:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // flips.g:627:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:627:26: ^( LONGITUDE $y WEST )
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
                    // flips.g:628:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal466=(Token)match(input,321,FOLLOW_321_in_latitudeLongitude3718);  
                    stream_321.add(char_literal466);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3722);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:628:33: ( ',' )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==108) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // flips.g:628:33: ','
                            {
                            char_literal467=(Token)match(input,108,FOLLOW_108_in_latitudeLongitude3724);  
                            stream_108.add(char_literal467);


                            }
                            break;

                    }

                    char_literal468=(Token)match(input,321,FOLLOW_321_in_latitudeLongitude3727);  
                    stream_321.add(char_literal468);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3731);
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
                    // 629:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // flips.g:629:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:629:26: ^( LONGITUDE $y WEST )
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
    // flips.g:632:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue469 = null;

        flipsParser.angularValue_return angularValue470 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:633:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( ((LA177_0>=BinaryLiteral && LA177_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 311:
                case 312:
                case 313:
                case 314:
                case 316:
                case 317:
                case 318:
                case 319:
                    {
                    alt177=2;
                    }
                    break;
                case 240:
                    {
                    switch ( input.LA(3) ) {
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA177_6 = input.LA(4);

                        if ( ((LA177_6>=153 && LA177_6<=171)||(LA177_6>=173 && LA177_6<=199)) ) {
                            alt177=1;
                        }
                        else if ( (LA177_6==315) ) {
                            alt177=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 177, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA177_7 = input.LA(4);

                        if ( ((LA177_7>=153 && LA177_7<=171)||(LA177_7>=173 && LA177_7<=199)) ) {
                            alt177=1;
                        }
                        else if ( (LA177_7==315) ) {
                            alt177=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 177, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case To:
                    case FlightLevel:
                        {
                        alt177=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 177, 4, input);

                        throw nvae;
                    }

                    }
                    break;
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
                case 103:
                case 104:
                case 105:
                case 107:
                case 108:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 121:
                case 122:
                case 123:
                case 124:
                case 134:
                case 135:
                case 136:
                case 137:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 147:
                case 148:
                case 150:
                case 171:
                case 172:
                case 214:
                case 215:
                case 216:
                case 217:
                case 218:
                case 219:
                case 254:
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
                case 302:
                case 303:
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 320:
                case 321:
                    {
                    alt177=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 177, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA177_0==FloatingPointLiteral) ) {
                int LA177_2 = input.LA(2);

                if ( ((LA177_2>=311 && LA177_2<=314)||(LA177_2>=316 && LA177_2<=319)) ) {
                    alt177=2;
                }
                else if ( (LA177_2==EOF||(LA177_2>=Identifier && LA177_2<=At)||LA177_2==With||(LA177_2>=Turning && LA177_2<=HexLiteral)||(LA177_2>=103 && LA177_2<=105)||(LA177_2>=107 && LA177_2<=108)||(LA177_2>=111 && LA177_2<=118)||(LA177_2>=121 && LA177_2<=124)||(LA177_2>=134 && LA177_2<=137)||(LA177_2>=140 && LA177_2<=145)||(LA177_2>=147 && LA177_2<=148)||LA177_2==150||(LA177_2>=171 && LA177_2<=172)||(LA177_2>=214 && LA177_2<=219)||LA177_2==240||LA177_2==254||(LA177_2>=259 && LA177_2<=310)||(LA177_2>=320 && LA177_2<=321)) ) {
                    alt177=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 177, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // flips.g:633:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3763);
                    numericValue469=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue469.getTree());


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
                    // 634:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:635:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3775);
                    angularValue470=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue470.getTree());

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
    // flips.g:638:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );
    public final flipsParser.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsParser.distanceCoordinate_return retval = new flipsParser.distanceCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal471=null;
        Token char_literal472=null;
        Token char_literal473=null;
        Token char_literal474=null;
        Token char_literal475=null;
        Token char_literal476=null;
        Token char_literal477=null;
        Token char_literal478=null;
        Token char_literal479=null;
        Token char_literal480=null;
        Token char_literal481=null;
        Token char_literal482=null;
        Token char_literal483=null;
        Token char_literal484=null;
        Token char_literal485=null;
        Token char_literal486=null;
        Token char_literal487=null;
        Token char_literal488=null;
        Token char_literal489=null;
        Token char_literal490=null;
        flipsParser.distanceValue_return x = null;

        flipsParser.distanceValue_return y = null;


        CommonTree char_literal471_tree=null;
        CommonTree char_literal472_tree=null;
        CommonTree char_literal473_tree=null;
        CommonTree char_literal474_tree=null;
        CommonTree char_literal475_tree=null;
        CommonTree char_literal476_tree=null;
        CommonTree char_literal477_tree=null;
        CommonTree char_literal478_tree=null;
        CommonTree char_literal479_tree=null;
        CommonTree char_literal480_tree=null;
        CommonTree char_literal481_tree=null;
        CommonTree char_literal482_tree=null;
        CommonTree char_literal483_tree=null;
        CommonTree char_literal484_tree=null;
        CommonTree char_literal485_tree=null;
        CommonTree char_literal486_tree=null;
        CommonTree char_literal487_tree=null;
        CommonTree char_literal488_tree=null;
        CommonTree char_literal489_tree=null;
        CommonTree char_literal490_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_320=new RewriteRuleTokenStream(adaptor,"token 320");
        RewriteRuleTokenStream stream_321=new RewriteRuleTokenStream(adaptor,"token 321");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:639:2: ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) )
            int alt182=4;
            alt182 = dfa182.predict(input);
            switch (alt182) {
                case 1 :
                    // flips.g:639:4: '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal471=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3786);  
                    stream_109.add(char_literal471);

                    // flips.g:639:8: ( '+' )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==320) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // flips.g:639:8: '+'
                            {
                            char_literal472=(Token)match(input,320,FOLLOW_320_in_distanceCoordinate3788);  
                            stream_320.add(char_literal472);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3793);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal473=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3795);  
                    stream_108.add(char_literal473);

                    // flips.g:639:33: ( '+' )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==320) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // flips.g:639:33: '+'
                            {
                            char_literal474=(Token)match(input,320,FOLLOW_320_in_distanceCoordinate3797);  
                            stream_320.add(char_literal474);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3802);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal475=(Token)match(input,110,FOLLOW_110_in_distanceCoordinate3804);  
                    stream_110.add(char_literal475);



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
                    // 640:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST )
                    {
                        // flips.g:640:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:640:26: ^( DISTANCE $x EAST )
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
                    // flips.g:641:4: '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal476=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3830);  
                    stream_109.add(char_literal476);

                    char_literal477=(Token)match(input,321,FOLLOW_321_in_distanceCoordinate3832);  
                    stream_321.add(char_literal477);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3836);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal478=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3838);  
                    stream_108.add(char_literal478);

                    // flips.g:641:32: ( '+' )?
                    int alt180=2;
                    int LA180_0 = input.LA(1);

                    if ( (LA180_0==320) ) {
                        alt180=1;
                    }
                    switch (alt180) {
                        case 1 :
                            // flips.g:641:32: '+'
                            {
                            char_literal479=(Token)match(input,320,FOLLOW_320_in_distanceCoordinate3840);  
                            stream_320.add(char_literal479);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3845);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal480=(Token)match(input,110,FOLLOW_110_in_distanceCoordinate3847);  
                    stream_110.add(char_literal480);



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
                    // 642:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST )
                    {
                        // flips.g:642:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:642:26: ^( DISTANCE $x WEST )
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
                    // flips.g:643:4: '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal481=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3873);  
                    stream_109.add(char_literal481);

                    // flips.g:643:8: ( '+' )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==320) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // flips.g:643:8: '+'
                            {
                            char_literal482=(Token)match(input,320,FOLLOW_320_in_distanceCoordinate3875);  
                            stream_320.add(char_literal482);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3880);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal483=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3882);  
                    stream_108.add(char_literal483);

                    char_literal484=(Token)match(input,321,FOLLOW_321_in_distanceCoordinate3884);  
                    stream_321.add(char_literal484);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3888);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal485=(Token)match(input,110,FOLLOW_110_in_distanceCoordinate3890);  
                    stream_110.add(char_literal485);



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
                    // 644:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST )
                    {
                        // flips.g:644:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:644:26: ^( DISTANCE $x EAST )
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
                    // flips.g:645:4: '(' '-' x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal486=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3916);  
                    stream_109.add(char_literal486);

                    char_literal487=(Token)match(input,321,FOLLOW_321_in_distanceCoordinate3918);  
                    stream_321.add(char_literal487);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3922);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal488=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3924);  
                    stream_108.add(char_literal488);

                    char_literal489=(Token)match(input,321,FOLLOW_321_in_distanceCoordinate3926);  
                    stream_321.add(char_literal489);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3930);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal490=(Token)match(input,110,FOLLOW_110_in_distanceCoordinate3932);  
                    stream_110.add(char_literal490);



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
                    // 646:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST )
                    {
                        // flips.g:646:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:646:26: ^( DISTANCE $x WEST )
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
    // flips.g:651:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral492=null;
        flipsParser.integerValue_return integerValue491 = null;


        CommonTree FloatingPointLiteral492_tree=null;

        try {
            // flips.g:652:2: ( integerValue | FloatingPointLiteral )
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( ((LA183_0>=BinaryLiteral && LA183_0<=HexLiteral)) ) {
                alt183=1;
            }
            else if ( (LA183_0==FloatingPointLiteral) ) {
                alt183=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }
            switch (alt183) {
                case 1 :
                    // flips.g:652:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3966);
                    integerValue491=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue491.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:653:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral492=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3971); 
                    FloatingPointLiteral492_tree = (CommonTree)adaptor.create(FloatingPointLiteral492);
                    adaptor.addChild(root_0, FloatingPointLiteral492_tree);


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
    // flips.g:656:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set493=null;

        CommonTree set493_tree=null;

        try {
            // flips.g:657:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set493=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set493));
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
    // flips.g:663:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal495=null;
        Token string_literal496=null;
        flipsParser.numericValue_return numericValue494 = null;


        CommonTree char_literal495_tree=null;
        CommonTree string_literal496_tree=null;
        RewriteRuleTokenStream stream_323=new RewriteRuleTokenStream(adaptor,"token 323");
        RewriteRuleTokenStream stream_322=new RewriteRuleTokenStream(adaptor,"token 322");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:664:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // flips.g:664:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue4008);
            numericValue494=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue494.getTree());
            // flips.g:664:17: ( '%' | 'percent' )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==322) ) {
                alt184=1;
            }
            else if ( (LA184_0==323) ) {
                alt184=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;
            }
            switch (alt184) {
                case 1 :
                    // flips.g:664:18: '%'
                    {
                    char_literal495=(Token)match(input,322,FOLLOW_322_in_percentValue4011);  
                    stream_322.add(char_literal495);


                    }
                    break;
                case 2 :
                    // flips.g:664:22: 'percent'
                    {
                    string_literal496=(Token)match(input,323,FOLLOW_323_in_percentValue4013);  
                    stream_323.add(string_literal496);


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
            // 665:2: -> numericValue PERCENT
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
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA176 dfa176 = new DFA176(this);
    protected DFA182 dfa182 = new DFA182(this);
    static final String DFA38_eotS =
        "\56\uffff";
    static final String DFA38_eofS =
        "\13\uffff\1\12\1\uffff\12\14\2\uffff\20\14\1\uffff\1\51\3\14";
    static final String DFA38_minS =
        "\1\122\1\162\1\uffff\1\132\2\uffff\1\132\4\uffff\1\122\1\uffff\12"+
        "\122\2\u00b8\20\122\1\uffff\4\122";
    static final String DFA38_maxS =
        "\1\u0141\1\u008b\1\uffff\1\u0141\2\uffff\1\u0141\4\uffff\1\u0091"+
        "\1\uffff\12\u00d5\2\u00ba\20\u00d5\1\uffff\1\u0091\3\u00d5";
    static final String DFA38_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10"+
        "\34\uffff\1\11\4\uffff";
    static final String DFA38_specialS =
        "\56\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\13\4\uffff\1\14\2\4\1\6\4\3\16\uffff\1\12\4\uffff\2\12\3"+
            "\uffff\1\2\5\uffff\1\1\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11\2\14"+
            "\162\uffff\1\4\5\uffff\37\4\35\uffff\2\12",
            "\2\12\3\uffff\1\2\6\uffff\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11"+
            "\2\14",
            "",
            "\5\12\15\uffff\1\12\54\uffff\22\14\1\46\1\uffff\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1"+
            "\30\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1"+
            "\50\2\uffff\12\5\14\uffff\5\2\13\uffff\1\12\15\uffff\1\12\5"+
            "\uffff\3\12\60\uffff\4\12\1\uffff\6\12",
            "",
            "",
            "\5\12\15\uffff\1\12\54\uffff\22\14\1\46\1\uffff\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1"+
            "\30\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1"+
            "\50\2\uffff\12\5\52\uffff\1\12\5\uffff\3\12\60\uffff\4\12\1"+
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
            return "182:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );";
        }
    }
    static final String DFA45_eotS =
        "\122\uffff";
    static final String DFA45_eofS =
        "\17\uffff\12\6\2\uffff\20\6\5\uffff\12\14\2\uffff\20\14\3\6\3\14";
    static final String DFA45_minS =
        "\1\123\1\127\1\uffff\2\u00ab\3\uffff\1\127\2\uffff\1\122\1\uffff"+
        "\2\u0099\12\122\2\u00b8\20\122\1\u008a\2\132\2\uffff\12\122\2\u00b8"+
        "\26\122";
    static final String DFA45_maxS =
        "\1\u0132\1\u00db\1\uffff\2\u0143\3\uffff\1\u0098\2\uffff\1\u0141"+
        "\1\uffff\2\u0143\12\u0132\2\u00ba\20\u0132\1\u0094\2\u0141\2\uffff"+
        "\12\u0132\2\u00ba\26\u0132";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\41"+
        "\uffff\1\10\1\1\42\uffff";
    static final String DFA45_specialS =
        "\122\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\13\1\1\1\uffff\1\10\1\uffff\2\2\1\4\4\3\47\uffff\2\7\2\11"+
            "\11\uffff\2\7\101\uffff\6\5\24\uffff\1\14\15\uffff\1\2\4\uffff"+
            "\1\12\37\2\12\14\6\6",
            "\1\14\2\uffff\1\16\4\15\53\uffff\2\14\6\uffff\1\14\3\uffff"+
            "\3\14\75\uffff\6\5",
            "",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\12\5\156\uffff\2\5",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\12\5\156\uffff\2\5",
            "",
            "",
            "",
            "\1\14\2\uffff\5\14\53\uffff\2\14\6\uffff\1\53\3\uffff\3\14",
            "",
            "",
            "\1\56\4\uffff\1\14\2\uffff\1\55\4\54\16\uffff\1\56\34\uffff"+
            "\2\14\6\uffff\1\14\3\uffff\3\14\u00a7\uffff\2\56",
            "",
            "\22\14\1\111\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71\1\72\1\74\1\75\1\76\1\73\1\77\1\100\1\101\1\102\1"+
            "\103\1\104\1\105\1\106\1\107\1\110\1\112\1\113\2\uffff\12\5"+
            "\14\uffff\5\57\135\uffff\2\5",
            "\22\14\1\111\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71\1\72\1\74\1\75\1\76\1\73\1\77\1\100\1\101\1\102\1"+
            "\103\1\104\1\105\1\106\1\107\1\110\1\112\1\113\2\uffff\12\5"+
            "\156\uffff\2\5",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\1\114\1\115\1\116",
            "\1\33\1\34\1\35",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\2\14\7\uffff\2\7",
            "\5\56\15\uffff\1\56\54\uffff\23\14\1\uffff\33\14\50\uffff\1"+
            "\56\15\uffff\1\56\5\uffff\3\56\60\uffff\4\56\1\uffff\6\56",
            "\5\56\15\uffff\1\56\54\uffff\23\14\1\uffff\33\14\66\uffff\1"+
            "\56\5\uffff\3\56\60\uffff\4\56\1\uffff\6\56",
            "",
            "",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\1\117\1\120\1\121",
            "\1\74\1\75\1\76",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\6\1\uffff\1\6\1\uffff\7\6\26\uffff\2\6\2\uffff\4\6\11\uffff"+
            "\4\6\2\uffff\6\6\1\uffff\2\6\77\uffff\2\5\6\6\24\uffff\1\6\15"+
            "\uffff\1\6\4\uffff\60\6",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14",
            "\3\14\1\uffff\1\14\1\uffff\7\14\26\uffff\2\14\2\uffff\4\14"+
            "\11\uffff\4\14\2\uffff\6\14\1\uffff\2\14\77\uffff\2\5\6\14\24"+
            "\uffff\1\14\15\uffff\1\14\4\uffff\60\14"
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
            return "208:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA50_eotS =
        "\u0091\uffff";
    static final String DFA50_eofS =
        "\55\uffff\12\11\2\uffff\20\11\3\uffff\12\11\2\uffff\23\11\1\6\3"+
        "\11\2\uffff\12\11\2\uffff\20\11\1\6\3\11";
    static final String DFA50_minS =
        "\1\123\1\122\2\u00ab\3\uffff\1\127\2\uffff\2\132\1\uffff\12\u00ac"+
        "\2\u00b8\20\u00ac\1\132\2\u0099\1\uffff\12\122\2\u00b8\20\122\3"+
        "\u00ac\12\122\2\u00b8\27\122\1\167\1\u00ab\12\122\2\u00b8\24\122";
    static final String DFA50_maxS =
        "\1\u0136\1\u0141\2\u0143\3\uffff\1\u00ac\2\uffff\2\u0143\1\uffff"+
        "\12\u00d5\2\u00ba\20\u00d5\1\u00ac\2\u00c7\1\uffff\12\u0136\2\u00ba"+
        "\20\u0136\3\u00d5\12\u0136\2\u00ba\27\u0136\2\u0143\12\u0136\2\u00ba"+
        "\24\u0136";
    static final String DFA50_acceptS =
        "\4\uffff\1\2\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\37\uffff\1\1\144"+
        "\uffff";
    static final String DFA50_specialS =
        "\u0091\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\11\1\1\1\uffff\1\7\1\uffff\1\5\1\uffff\1\3\4\2\67\uffff\1"+
            "\6\24\uffff\2\6\51\uffff\6\4\24\uffff\1\11\22\uffff\1\10\37"+
            "\uffff\12\11\6\uffff\4\5",
            "\1\14\4\uffff\1\11\2\uffff\1\13\4\12\16\uffff\1\14\34\uffff"+
            "\2\11\6\uffff\1\11\3\uffff\3\11\75\uffff\6\4\144\uffff\2\14",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\12\4\156\uffff\2\4",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\12\4\156\uffff\2\4",
            "",
            "",
            "",
            "\1\11\2\uffff\1\53\4\52\53\uffff\2\11\6\uffff\1\11\3\uffff"+
            "\1\51\2\11\23\uffff\1\6",
            "",
            "",
            "\5\14\15\uffff\1\14\54\uffff\22\11\1\106\1\uffff\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73"+
            "\1\70\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\107\1\110\2\uffff\12\4\14\uffff\5\54\13\uffff\1\14\15\uffff"+
            "\1\14\5\uffff\3\14\60\uffff\4\14\1\uffff\6\14\2\4",
            "\5\14\15\uffff\1\14\54\uffff\22\11\1\106\1\uffff\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73"+
            "\1\70\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\107\1\110\2\uffff\12\4\52\uffff\1\14\5\uffff\3\14\60\uffff"+
            "\4\14\1\uffff\6\14\2\4",
            "",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\111\1\112\1\113",
            "\1\31\1\32\1\33",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\5\6\70\uffff\2\11\23\uffff\1\6",
            "\22\11\1\145\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\130\1\131\1\132\1\127\1\133\1"+
            "\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\146\1"+
            "\147",
            "\22\11\1\145\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\130\1\131\1\132\1\127\1\133\1"+
            "\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\146\1"+
            "\147",
            "",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\1\150\1\151\1\152",
            "\1\71\1\72\1\73",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\1\6\47\uffff\2\4",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\1\154\1\155\1\156",
            "\1\130\1\131\1\132",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\47\uffff"+
            "\2\4\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6\uffff"+
            "\4\11",
            "\3\6\1\uffff\1\6\1\uffff\1\6\1\uffff\1\160\4\157\26\uffff\2"+
            "\6\2\uffff\4\6\17\uffff\6\6\3\uffff\1\11\1\6\24\uffff\2\6\51"+
            "\uffff\6\6\24\uffff\1\6\22\uffff\1\6\37\uffff\12\6\6\uffff\4"+
            "\6",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153"+
            "\51\uffff\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11\6"+
            "\uffff\4\11",
            "\2\6\62\uffff\1\u008a\1\uffff\1\161\1\162\1\163\1\164\1\165"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\174"+
            "\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087"+
            "\1\u0088\1\u0089\1\u008b\1\u008c\2\uffff\12\6\156\uffff\2\6",
            "\1\u008a\1\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167"+
            "\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\174\1\u0080\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089"+
            "\1\u008b\1\u008c\2\uffff\12\6\156\uffff\2\6",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\1\u008e\1\u008f\1\u0090",
            "\1\175\1\176\1\177",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\6\1\uffff\1\6\1\uffff\1\6\1\uffff\1\160\4\157\26\uffff\2"+
            "\6\2\uffff\4\6\17\uffff\6\6\3\uffff\1\11\1\6\24\uffff\2\6\51"+
            "\uffff\6\6\24\uffff\1\6\22\uffff\1\6\37\uffff\12\6\6\uffff\4"+
            "\6",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11",
            "\3\11\1\uffff\1\11\1\uffff\1\11\1\uffff\5\11\26\uffff\2\11"+
            "\2\uffff\4\11\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d"+
            "\47\uffff\2\6\6\11\24\uffff\1\11\22\uffff\1\11\37\uffff\12\11"+
            "\6\uffff\4\11"
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
            return "235:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA60_eotS =
        "\16\uffff";
    static final String DFA60_eofS =
        "\16\uffff";
    static final String DFA60_minS =
        "\14\123\2\uffff";
    static final String DFA60_maxS =
        "\1\u012c\13\136\2\uffff";
    static final String DFA60_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA60_specialS =
        "\16\uffff}>";
    static final String[] DFA60_transitionS = {
            "\2\14\1\uffff\1\14\u0099\uffff\1\10\62\uffff\1\1\1\2\1\3\1\4"+
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
            return "276:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA95_eotS =
        "\127\uffff";
    static final String DFA95_eofS =
        "\11\uffff\12\60\44\uffff\40\60";
    static final String DFA95_minS =
        "\1\124\1\132\2\u00ab\1\uffff\2\u00ab\2\u00c8\12\122\12\u00d4\2\u00b8"+
        "\20\u00d4\3\uffff\2\u00bc\3\u00d4\40\122";
    static final String DFA95_maxS =
        "\2\u00db\2\u0143\1\uffff\2\u0143\2\u00df\12\u0136\12\u00d5\2\u00ba"+
        "\20\u00d5\3\uffff\2\u0102\3\u00d5\40\u0136";
    static final String DFA95_acceptS =
        "\4\uffff\1\3\52\uffff\1\4\1\1\1\2\45\uffff";
    static final String DFA95_specialS =
        "\127\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\5\uffff\1\3\4\2\167\uffff\6\4",
            "\1\6\4\5\167\uffff\6\4",
            "\1\54\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\35\1\37\1\40\1\41\1\36\1\42\1\43\1\44\1\45\1\46\1\47"+
            "\1\50\1\51\1\52\1\53\1\55\1\56\2\uffff\1\11\1\12\1\13\1\14\1"+
            "\15\1\16\1\17\1\20\1\21\1\22\156\uffff\1\7\1\10",
            "\1\54\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\35\1\37\1\40\1\41\1\36\1\42\1\43\1\44\1\45\1\46\1\47"+
            "\1\50\1\51\1\52\1\53\1\55\1\56\2\uffff\1\11\1\12\1\13\1\14\1"+
            "\15\1\16\1\17\1\20\1\21\1\22\156\uffff\1\7\1\10",
            "",
            "\1\60\1\uffff\33\60\2\uffff\12\60\156\uffff\2\57",
            "\1\60\1\uffff\33\60\2\uffff\12\60\156\uffff\2\57",
            "\2\61\22\uffff\4\57",
            "\2\61\22\uffff\4\57",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\64\1\65\1\66",
            "\1\37\1\40\1\41",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "",
            "",
            "",
            "\1\74\31\uffff\1\113\16\uffff\1\67\1\70\1\71\1\72\1\73\1\75"+
            "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\124\1\125\1"+
            "\126\1\106\1\107\1\110\1\111\1\112\1\114\1\115\1\116\1\117\1"+
            "\120\1\121\1\122\1\123",
            "\1\74\31\uffff\1\113\16\uffff\1\67\1\70\1\71\1\72\1\73\1\75"+
            "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\124\1\125\1"+
            "\126\1\106\1\107\1\110\1\111\1\112\1\114\1\115\1\116\1\117\1"+
            "\120\1\121\1\122\1\123",
            "\1\62\1\63",
            "\1\62\1\63",
            "\1\62\1\63",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60",
            "\3\60\1\uffff\1\60\1\uffff\7\60\26\uffff\2\60\2\uffff\4\60"+
            "\11\uffff\4\60\2\uffff\6\60\1\uffff\2\60\1\uffff\1\60\24\uffff"+
            "\2\60\33\uffff\2\61\14\uffff\6\60\24\uffff\1\60\15\uffff\1\60"+
            "\4\uffff\64\60"
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
            return "358:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );";
        }
    }
    static final String DFA97_eotS =
        "\124\uffff";
    static final String DFA97_eofS =
        "\124\uffff";
    static final String DFA97_minS =
        "\1\132\2\u00ab\14\u00c8\12\u00d4\2\u00b8\20\u00d4\4\uffff\2\u00bc"+
        "\3\u00d4\40\u00c8";
    static final String DFA97_maxS =
        "\1\136\2\u0143\14\u00c9\12\u00d5\2\u00ba\20\u00d5\4\uffff\2\u0102"+
        "\3\u00d5\40\u00c9";
    static final String DFA97_acceptS =
        "\53\uffff\1\3\1\4\1\1\1\2\45\uffff";
    static final String DFA97_specialS =
        "\124\uffff}>";
    static final String[] DFA97_transitionS = {
            "\1\2\4\1",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\156\uffff\1\3\1\4",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\156\uffff\1\3\1\4",
            "\1\53\1\54",
            "\1\53\1\54",
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
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\61\1\62\1\63",
            "\1\33\1\34\1\35",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
            "",
            "",
            "",
            "",
            "\1\71\31\uffff\1\110\16\uffff\1\64\1\65\1\66\1\67\1\70\1\72"+
            "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\121\1\122\1\123"+
            "\1\103\1\104\1\105\1\106\1\107\1\111\1\112\1\113\1\114\1\115"+
            "\1\116\1\117\1\120",
            "\1\71\31\uffff\1\110\16\uffff\1\64\1\65\1\66\1\67\1\70\1\72"+
            "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\121\1\122\1\123"+
            "\1\103\1\104\1\105\1\106\1\107\1\111\1\112\1\113\1\114\1\115"+
            "\1\116\1\117\1\120",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\57\1\60",
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
            "\1\55\1\56"
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
            return "370:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA113_eotS =
        "\14\uffff";
    static final String DFA113_eofS =
        "\5\uffff\1\11\4\uffff\2\11";
    static final String DFA113_minS =
        "\1\133\1\u00e0\1\133\2\uffff\1\122\1\uffff\1\132\2\uffff\2\122";
    static final String DFA113_maxS =
        "\1\136\1\u00e4\1\136\2\uffff\1\u0136\1\uffff\1\136\2\uffff\2\u0136";
    static final String DFA113_acceptS =
        "\3\uffff\1\2\1\4\1\uffff\1\1\1\uffff\1\3\1\5\2\uffff";
    static final String DFA113_specialS =
        "\14\uffff}>";
    static final String[] DFA113_transitionS = {
            "\4\1",
            "\2\3\2\4\1\2",
            "\4\5",
            "",
            "",
            "\3\11\1\uffff\1\11\1\uffff\7\11\26\uffff\2\11\2\uffff\4\11"+
            "\11\uffff\4\11\2\uffff\6\11\1\uffff\2\11\1\uffff\1\11\24\uffff"+
            "\2\11\51\uffff\6\11\4\uffff\2\6\2\10\1\7\13\uffff\1\11\15\uffff"+
            "\1\11\4\uffff\64\11",
            "",
            "\1\13\4\12",
            "",
            "",
            "\3\11\1\uffff\1\11\1\uffff\7\11\26\uffff\2\11\2\uffff\4\11"+
            "\11\uffff\4\11\2\uffff\6\11\1\uffff\2\11\1\uffff\1\11\24\uffff"+
            "\2\11\51\uffff\6\11\4\uffff\2\6\2\10\14\uffff\1\11\15\uffff"+
            "\1\11\4\uffff\64\11",
            "\3\11\1\uffff\1\11\1\uffff\7\11\26\uffff\2\11\2\uffff\4\11"+
            "\11\uffff\4\11\2\uffff\6\11\1\uffff\2\11\1\uffff\1\11\24\uffff"+
            "\2\11\51\uffff\6\11\4\uffff\2\6\2\10\14\uffff\1\11\15\uffff"+
            "\1\11\4\uffff\64\11"
    };

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "431:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA125_eotS =
        "\32\uffff";
    static final String DFA125_eofS =
        "\3\uffff\4\2\1\uffff\5\2\5\uffff\4\26\4\uffff";
    static final String DFA125_minS =
        "\1\132\1\u00bc\1\uffff\4\122\1\uffff\5\122\1\167\1\u00ab\1\167\1"+
        "\u00ab\1\uffff\4\122\1\uffff\1\167\1\u00ab\1\uffff";
    static final String DFA125_maxS =
        "\1\136\1\u0102\1\uffff\4\u0136\1\uffff\5\u0136\4\u0143\1\uffff\4"+
        "\u0136\1\uffff\2\u0143\1\uffff";
    static final String DFA125_acceptS =
        "\2\uffff\1\1\4\uffff\1\5\11\uffff\1\4\4\uffff\1\2\2\uffff\1\3";
    static final String DFA125_specialS =
        "\32\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\2\4\1",
            "\1\2\31\uffff\1\3\15\uffff\1\7\21\2\1\10\1\11\1\12\1\13\1\14"+
            "\1\4\1\5\1\6\5\2",
            "",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\16\4\15\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\20\4\17\26\uffff\2\2\2\uffff"+
            "\4\2\11\uffff\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff"+
            "\2\2\51\uffff\6\2\24\uffff\1\2\15\uffff\1\2\4\uffff\64\2",
            "\2\2\62\uffff\1\2\1\uffff\33\2\2\uffff\12\2\52\uffff\5\21\77"+
            "\uffff\2\2",
            "\1\2\1\uffff\33\2\2\uffff\12\2\52\uffff\5\21\77\uffff\2\2",
            "\2\2\62\uffff\1\2\1\uffff\33\2\2\uffff\12\2\2\uffff\1\22\44"+
            "\uffff\1\23\1\24\1\25\5\26\77\uffff\2\2",
            "\1\2\1\uffff\33\2\2\uffff\12\2\2\uffff\1\26\44\uffff\10\26"+
            "\77\uffff\2\2",
            "",
            "\3\26\1\uffff\1\26\1\uffff\2\26\1\30\4\27\26\uffff\2\26\2\uffff"+
            "\4\26\11\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24"+
            "\uffff\2\26\51\uffff\6\26\24\uffff\1\26\15\uffff\1\26\4\uffff"+
            "\64\26",
            "\3\26\1\uffff\1\26\1\uffff\2\26\1\30\4\27\26\uffff\2\26\2\uffff"+
            "\4\26\11\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24"+
            "\uffff\2\26\51\uffff\6\26\24\uffff\1\26\15\uffff\1\26\4\uffff"+
            "\64\26",
            "\3\26\1\uffff\1\26\1\uffff\2\26\1\30\4\27\26\uffff\2\26\2\uffff"+
            "\4\26\11\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24"+
            "\uffff\2\26\51\uffff\6\26\24\uffff\1\26\15\uffff\1\26\4\uffff"+
            "\64\26",
            "\3\26\1\uffff\1\26\1\uffff\2\26\1\30\4\27\26\uffff\2\26\2\uffff"+
            "\4\26\11\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24"+
            "\uffff\2\26\51\uffff\6\26\24\uffff\1\26\15\uffff\1\26\4\uffff"+
            "\64\26",
            "",
            "\2\26\62\uffff\1\26\1\uffff\33\26\2\uffff\12\26\52\uffff\5"+
            "\31\77\uffff\2\26",
            "\1\26\1\uffff\33\26\2\uffff\12\26\52\uffff\5\31\77\uffff\2"+
            "\26",
            ""
    };

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "487:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA176_eotS =
        "\64\uffff";
    static final String DFA176_eofS =
        "\64\uffff";
    static final String DFA176_minS =
        "\12\132\1\uffff\5\132\2\uffff\4\132\2\u013b\12\132\1\uffff\11\132"+
        "\1\uffff\1\132\4\u013b\2\132";
    static final String DFA176_maxS =
        "\3\u0141\2\136\5\u0141\1\uffff\4\u0141\1\136\2\uffff\4\u0141\2\u013b"+
        "\10\u0141\1\136\1\u0141\1\uffff\1\136\10\u0141\1\uffff\1\u0141\4"+
        "\u013b\2\u0141";
    static final String DFA176_acceptS =
        "\12\uffff\1\4\5\uffff\1\1\1\2\20\uffff\1\5\11\uffff\1\3\7\uffff";
    static final String DFA176_specialS =
        "\64\uffff}>";
    static final String[] DFA176_transitionS = {
            "\1\2\4\1\u00e1\uffff\1\3\1\4",
            "\5\21\15\uffff\1\11\u0083\uffff\1\17\15\uffff\1\20\5\uffff"+
            "\3\20\60\uffff\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\60\uffff"+
            "\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16\1\21\1\12",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\u00e1\uffff\1\21\1\12",
            "",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\1\27\4\26",
            "",
            "",
            "\5\21\15\uffff\1\11\u0083\uffff\1\40\106\uffff\1\34\1\35\1"+
            "\36\1\37\1\uffff\1\30\1\31\1\32\1\33\1\21\1\12",
            "\5\21\15\uffff\1\11\u00ca\uffff\1\34\1\35\1\36\1\37\1\uffff"+
            "\1\30\1\31\1\32\1\33\1\21\1\12",
            "\5\54\15\uffff\1\41\u0083\uffff\1\43\106\uffff\1\44\1\45\1"+
            "\46\1\47\1\uffff\1\50\1\51\1\52\1\53\1\54\1\42",
            "\5\54\15\uffff\1\41\u00ca\uffff\1\44\1\45\1\46\1\47\1\uffff"+
            "\1\50\1\51\1\52\1\53\1\54\1\42",
            "\1\55",
            "\1\55",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\1\57\4\56",
            "\5\54\u00e1\uffff\1\54\1\42",
            "",
            "\1\61\4\60",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42",
            "",
            "\5\21\15\uffff\1\11\u0091\uffff\1\20\5\uffff\3\20\71\uffff"+
            "\1\21\1\12",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\21\15\uffff\1\11\u00d3\uffff\1\21\1\12",
            "\5\54\15\uffff\1\41\u00d3\uffff\1\54\1\42"
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
            return "619:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA182_eotS =
        "\114\uffff";
    static final String DFA182_eofS =
        "\114\uffff";
    static final String DFA182_minS =
        "\1\155\3\132\4\u00ab\12\154\2\u00b8\32\154\2\u00b8\20\154\1\132"+
        "\3\154\1\132\3\154\4\uffff";
    static final String DFA182_maxS =
        "\1\155\1\u0141\2\136\4\u00c7\12\154\2\u00ba\32\154\2\u00ba\20\154"+
        "\1\u0141\3\154\1\u0141\3\154\4\uffff";
    static final String DFA182_acceptS =
        "\110\uffff\1\3\1\1\1\4\1\2";
    static final String DFA182_specialS =
        "\114\uffff}>";
    static final String[] DFA182_transitionS = {
            "\1\1",
            "\1\5\4\4\u00e1\uffff\1\3\1\2",
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
            "\5\111\u00e1\uffff\1\111\1\110",
            "\1\100",
            "\1\100",
            "\1\100",
            "\5\113\u00e1\uffff\1\113\1\112",
            "\1\104",
            "\1\104",
            "\1\104",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA182_eot = DFA.unpackEncodedString(DFA182_eotS);
    static final short[] DFA182_eof = DFA.unpackEncodedString(DFA182_eofS);
    static final char[] DFA182_min = DFA.unpackEncodedStringToUnsignedChars(DFA182_minS);
    static final char[] DFA182_max = DFA.unpackEncodedStringToUnsignedChars(DFA182_maxS);
    static final short[] DFA182_accept = DFA.unpackEncodedString(DFA182_acceptS);
    static final short[] DFA182_special = DFA.unpackEncodedString(DFA182_specialS);
    static final short[][] DFA182_transition;

    static {
        int numStates = DFA182_transitionS.length;
        DFA182_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA182_transition[i] = DFA.unpackEncodedString(DFA182_transitionS[i]);
        }
    }

    class DFA182 extends DFA {

        public DFA182(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 182;
            this.eot = DFA182_eot;
            this.eof = DFA182_eof;
            this.min = DFA182_min;
            this.max = DFA182_max;
            this.accept = DFA182_accept;
            this.special = DFA182_special;
            this.transition = DFA182_transition;
        }
        public String getDescription() {
            return "638:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan441 = new BitSet(new long[]{0x0000000000000002L,0x007F838000040000L,0x000000000003F000L});
    public static final BitSet FOLLOW_statement_in_flightPlan444 = new BitSet(new long[]{0x0000000000000002L,0x0060000000040000L,0x000000000003F000L});
    public static final BitSet FOLLOW_defineCommand_in_define471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_defineCommand493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_104_in_defineCommand495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_105_in_defineCommand497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue516 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue518 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue520 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_107_in_defineCommandValue524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_108_in_defineCommandValue526 = new BitSet(new long[]{0x0000000000000000L,0x0000080000040000L});
    public static final BitSet FOLLOW_107_in_defineCommandValue528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue533 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue535 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue537 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue560 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue562 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue566 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_defineCommandValue568 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue572 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_defineCommandValue574 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_107_in_defineCommandValue578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_108_in_defineCommandValue580 = new BitSet(new long[]{0x0000000000000000L,0x0000080000040000L});
    public static final BitSet FOLLOW_107_in_defineCommandValue582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue587 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue589 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue593 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_defineCommandValue595 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue599 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_defineCommandValue601 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_111_in_defineSensor637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_112_in_defineSensor639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_113_in_defineSensor641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue660 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineSensorValue662 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue666 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_107_in_defineSensorValue670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_108_in_defineSensorValue672 = new BitSet(new long[]{0x0000000000000000L,0x0000080000040000L});
    public static final BitSet FOLLOW_107_in_defineSensorValue674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue679 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineSensorValue681 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue685 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_114_in_defineWaypoint716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_115_in_defineWaypoint718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_116_in_defineWaypoint720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue739 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineWaypointValue741 = new BitSet(new long[]{0x0000000000000000L,0x000020007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue743 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_107_in_defineWaypointValue747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_108_in_defineWaypointValue749 = new BitSet(new long[]{0x0000000000000000L,0x0000080000040000L});
    public static final BitSet FOLLOW_107_in_defineWaypointValue751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue756 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defineWaypointValue758 = new BitSet(new long[]{0x0000000000000000L,0x000020007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue760 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_command_in_statement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_statement792 = new BitSet(new long[]{0x0000000000000000L,0x1E60000078040000L,0x000000000003F000L});
    public static final BitSet FOLLOW_statement_in_statement794 = new BitSet(new long[]{0x0000000000000000L,0x1E60000078040000L,0x000000000003F000L});
    public static final BitSet FOLLOW_repeat_in_statement797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_statement802 = new BitSet(new long[]{0x0000000000000000L,0x1E60000078040000L,0x000000000003F000L});
    public static final BitSet FOLLOW_condition_in_statement804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_repeat815 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_set_in_repeat817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_repeat826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_duration_in_repeat828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_repeat833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_repeat838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_condition849 = new BitSet(new long[]{0x0000000000000000L,0x608C20007F840000L,0x0000000000000FFFL,0x4000000000000000L,0x00000007FFFFFFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_conditionValue_in_condition851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_condition856 = new BitSet(new long[]{0x0000000000000000L,0x608C20007F840000L,0x0000000000000FFFL,0x4000000000000000L,0x00000007FFFFFFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_conditionValue_in_condition858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue870 = new BitSet(new long[]{0x0000000000000000L,0x4080000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue873 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue879 = new BitSet(new long[]{0x0000000000000000L,0x6080000078000000L});
    public static final BitSet FOLLOW_timeValue_in_conditionValue887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_conditionValue896 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue902 = new BitSet(new long[]{0x0000000000000000L,0x2000000003000000L,0x0000000000000003L,0x4000000000000000L,0x00000007FFFFFFF0L});
    public static final BitSet FOLLOW_fixedDirection_in_conditionValue910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_conditionValue919 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue925 = new BitSet(new long[]{0x0000000000000000L,0x200000007C000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_speedValue_in_conditionValue933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_conditionValue942 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue948 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_conditionValue955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_conditionValue964 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue970 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_set_in_conditionValue986 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue992 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue1005 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1008 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1014 = new BitSet(new long[]{0x0000000000000000L,0x200C20007C040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_waypoint_in_conditionValue1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_conditionValue1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_conditionValue1031 = new BitSet(new long[]{0x0000000000000000L,0x8000040000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1037 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_altitudeValue_in_conditionValue1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_conditionValue1050 = new BitSet(new long[]{0x0000000000000000L,0x800004007C000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1052 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_conditionValue1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flyCommand_in_command1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_flyCommand1099 = new BitSet(new long[]{0x0000000000000002L,0x200000007F580000L,0x00000000001803CFL,0x400100000FC00000L,0x0007FFFFFFFFFFF8L});
    public static final BitSet FOLLOW_141_in_flyCommand1101 = new BitSet(new long[]{0x0000000000000002L,0x200000007F580000L,0x00000000001803CFL,0x400100000FC00000L,0x0007FFFFFFFFFFF8L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand1104 = new BitSet(new long[]{0x0000000000000002L,0x200000007F580000L,0x00000000001803CFL,0x400100000FC00000L,0x0007FFFFFFFFFFF8L});
    public static final BitSet FOLLOW_time_in_flyCommandValue1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue1161 = new BitSet(new long[]{0x0000000000000000L,0x200C20007C040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1163 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_107_in_flyCommandValue1167 = new BitSet(new long[]{0x0000000000000000L,0x200C20007C040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_108_in_flyCommandValue1169 = new BitSet(new long[]{0x0000000000000000L,0x200C28007C040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_107_in_flyCommandValue1171 = new BitSet(new long[]{0x0000000000000000L,0x200C20007C040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1175 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_turnCommand1200 = new BitSet(new long[]{0x0000000000000002L,0x2000000003000000L,0x0000000000000003L,0x4000000000000000L,0x00000007FFFFFFF0L});
    public static final BitSet FOLLOW_143_in_turnCommand1202 = new BitSet(new long[]{0x0000000000000002L,0x2000000003000000L,0x0000000000000003L,0x4000000000000000L,0x00000007FFFFFFF0L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand1205 = new BitSet(new long[]{0x0000000000000002L,0x2000000003000000L,0x0000000000000003L,0x4000000000000000L,0x00000007FFFFFFF0L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_loiterCommand1239 = new BitSet(new long[]{0x0000000000000002L,0x200000007F580000L,0x00001800005803CFL,0x400100000FC00000L,0x007FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_145_in_loiterCommand1241 = new BitSet(new long[]{0x0000000000000002L,0x200000007F580000L,0x00001800005803CFL,0x400100000FC00000L,0x007FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand1244 = new BitSet(new long[]{0x0000000000000002L,0x200000007F580000L,0x00001800005803CFL,0x400100000FC00000L,0x007FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue1291 = new BitSet(new long[]{0x0000000000000000L,0x200C20007C040000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1328 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_executeCommand1330 = new BitSet(new long[]{0x0000000000000000L,0x000000007C200000L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand1332 = new BitSet(new long[]{0x0000000000000000L,0x0000500000000000L});
    public static final BitSet FOLLOW_108_in_executeCommand1335 = new BitSet(new long[]{0x0000000000000000L,0x000000007C200000L});
    public static final BitSet FOLLOW_executeCommandParameter_in_executeCommand1337 = new BitSet(new long[]{0x0000000000000000L,0x0000500000000000L});
    public static final BitSet FOLLOW_110_in_executeCommand1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_executeCommandParameter1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_executeCommandParameter1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_pitch1402 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_135_in_pitch1404 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_pitch1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_147_in_pitch1429 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_148_in_pitch1431 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_pitch1434 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_roll1458 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_137_in_roll1460 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_angularValue_in_roll1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1505 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000001C40C00L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1507 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000001C40C00L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1509 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000001C40C00L});
    public static final BitSet FOLLOW_146_in_fixedAltitude1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_fixedAltitude1518 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000200C00L});
    public static final BitSet FOLLOW_139_in_fixedAltitude1520 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000200C00L});
    public static final BitSet FOLLOW_150_in_fixedAltitude1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_151_in_fixedAltitude1527 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000200C00L});
    public static final BitSet FOLLOW_152_in_fixedAltitude1529 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000200C00L});
    public static final BitSet FOLLOW_149_in_fixedAltitude1533 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1560 = new BitSet(new long[]{0x0000000000000000L,0x200000007C800000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000007FFFE000000L});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pressureUnit1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pressureUnit1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_pressureUnit1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_pressureUnit1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_pressureUnit1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pressureUnit1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_pressureUnit1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_pressureUnit1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pressureUnit1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pressureUnit1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pressureUnit1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_pressureUnit1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_pressureUnit1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_pressureUnit1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_pressureUnit1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_pressureUnit1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_pressureUnit1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pressureUnit1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_radius1746 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000100000400000L});
    public static final BitSet FOLLOW_With_in_radius1748 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000100000400000L});
    public static final BitSet FOLLOW_150_in_radius1752 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_172_in_radius1756 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_radius1758 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_172_in_radius1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1786 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFFFE80000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_distanceUnit1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_distanceUnit1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_distanceUnit1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_distanceUnit1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_distanceUnit1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_distanceUnit1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_distanceUnit1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_distanceUnit1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_distanceUnit1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_distanceUnit1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_distanceUnit1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_184_in_distanceUnit1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_distanceUnit1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_distanceUnit1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_distanceUnit1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_184_in_distanceUnit1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_distanceUnit1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_distanceUnit1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_distanceUnit1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_distanceUnit1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_distanceUnit1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_distanceUnit1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_distanceUnit1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_distanceUnit1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_distanceUnit1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_distanceUnit1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_distanceUnit1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_distanceUnit1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_distanceUnit1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_distanceUnit1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_distanceUnit1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed2018 = new BitSet(new long[]{0x0000000000000000L,0x200000007C000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_relativeSpeed2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_relativeSpeed2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_relativeSpeed2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_relativeSpeed2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFFFE80000000000L,0x00000000000FFCFFL});
    public static final BitSet FOLLOW_speedUnit_in_speedValue2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_speedUnit2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_speedUnit2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_speedUnit2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_speedUnit2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_speedUnit2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_speedUnit2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_speedUnit2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_speedUnit2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_speedUnit2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_speedUnit2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_212_in_speedUnit2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0xFFFFFFE000400000L,0x0000000000000007L});
    public static final BitSet FOLLOW_213_in_speedUnit2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0xFFFFFFE000400000L,0x0000000000000007L});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x000000000FC00000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed2255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_130_in_optimalSpeed2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_optimalSpeed2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_optimalUnit2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_optimalUnit2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_optimalUnit2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_optimalUnit2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_optimalUnit2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_optimalUnit2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed2331 = new BitSet(new long[]{0x0000000000000000L,0x200000007C100000L,0x000000000000000CL,0x000000000FC00000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000F0000000L});
    public static final BitSet FOLLOW_220_in_throttleSpeed2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_throttleSpeed2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_throttleSpeed2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_throttleSpeed2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time2379 = new BitSet(new long[]{0x0000000000000000L,0x6080000078000000L});
    public static final BitSet FOLLOW_timeValue_in_time2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_224_in_timeValue2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_timeValue2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_224_in_timeValue2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_timeValue2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_226_in_timeValue2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_timeValue2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_226_in_timeValue2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_timeValue2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_timeFormat2510 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_timeFormat2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_timeFormat2542 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_timeUnit2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_timeUnit2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_timeUnit2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_timeUnit2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_timeUnit2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_timeUnit2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_timeUnit2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_timeUnit2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_timeUnit2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_timeUnit2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_timeUnit2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_timeUnit2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_timeUnit2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_timeUnit2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_timeUnit2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_timeUnit2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_timeUnit2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_timeUnit2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_hour2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_hour2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_hour2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_hour2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_hour2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_minute2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_minute2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_minute2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_minute2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_second2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_second2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_second2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_second2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_second2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_duration2759 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_durationValue_in_duration2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0xFFFFFFE000400000L,0x0000000000000007L});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x07C0000000000000L});
    public static final BitSet FOLLOW_hour_in_durationValue2790 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xF800000000400000L,0x0000000000000007L});
    public static final BitSet FOLLOW_minute_in_durationValue2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x07C0000000000000L});
    public static final BitSet FOLLOW_hour_in_durationValue2805 = new BitSet(new long[]{0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3800000000400000L});
    public static final BitSet FOLLOW_minute_in_durationValue2809 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_second_in_durationValue2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3800000000400000L});
    public static final BitSet FOLLOW_minute_in_durationValue2820 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_second_in_durationValue2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2911 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x4000000000000000L,0x00000007FFFFFFF0L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2913 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x4000000000000000L,0x00000007FFFFFFF0L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0007E00000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0007E00000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2956 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_northSouthDirection2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_northSouthDirection2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_northSouthDirection3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_northSouthDirection3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_eastWestDirection3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_264_in_eastWestDirection3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_eastWestDirection3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_eastWestDirection3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_ordinalDirection3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_ordinalDirection3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_ordinalDirection3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_ordinalDirection3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_ordinalDirection3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_ordinalDirection3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_273_in_ordinalDirection3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_274_in_ordinalDirection3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_275_in_subOrdinalDirection3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_276_in_subOrdinalDirection3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_277_in_subOrdinalDirection3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_278_in_subOrdinalDirection3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_279_in_subOrdinalDirection3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_280_in_subOrdinalDirection3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_subOrdinalDirection3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_282_in_subOrdinalDirection3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_283_in_subOrdinalDirection3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_284_in_subOrdinalDirection3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_285_in_subOrdinalDirection3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_286_in_subOrdinalDirection3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_287_in_subOrdinalDirection3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_288_in_subOrdinalDirection3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_289_in_subOrdinalDirection3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_290_in_subOrdinalDirection3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection3280 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_291_in_upDownDirection3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_292_in_upDownDirection3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_293_in_upDownDirection3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_294_in_upDownDirection3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_295_in_upDownDirection3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_296_in_upDownDirection3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_297_in_upDownDirection3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_upDownDirection3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_298_in_upDownDirection3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_299_in_upDownDirection3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_300_in_upDownDirection3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_301_in_leftRightDirection3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_302_in_leftRightDirection3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_303_in_leftRightDirection3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_304_in_leftRightDirection3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_305_in_leftRightDirection3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_306_in_leftRightDirection3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_307_in_clockDirection3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_308_in_clockDirection3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_309_in_clockDirection3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_310_in_clockDirection3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_311_in_angularValue3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_312_in_angularValue3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_313_in_angularValue3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_314_in_angularValue3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue3447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_240_in_angularValue3449 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_angularValue3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xF000000000000000L});
    public static final BitSet FOLLOW_316_in_angularValue3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_317_in_angularValue3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_318_in_angularValue3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_319_in_angularValue3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3562 = new BitSet(new long[]{0x0000000000000000L,0x000010007C000000L});
    public static final BitSet FOLLOW_108_in_latitudeLongitude3564 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_320_in_latitudeLongitude3597 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3602 = new BitSet(new long[]{0x0000000000000000L,0x000010007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_108_in_latitudeLongitude3604 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_320_in_latitudeLongitude3607 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_latitudeLongitude3638 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3642 = new BitSet(new long[]{0x0000000000000000L,0x000010007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_108_in_latitudeLongitude3644 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_320_in_latitudeLongitude3647 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_320_in_latitudeLongitude3678 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3683 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_latitudeLongitude3685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_latitudeLongitude3688 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_latitudeLongitude3718 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3722 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_latitudeLongitude3724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_latitudeLongitude3727 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3786 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_320_in_distanceCoordinate3788 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3793 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3795 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_320_in_distanceCoordinate3797 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3802 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_distanceCoordinate3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_distanceCoordinate3832 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3836 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3838 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_320_in_distanceCoordinate3840 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3845 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_distanceCoordinate3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3873 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_320_in_distanceCoordinate3875 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3880 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_distanceCoordinate3884 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3888 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_distanceCoordinate3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_distanceCoordinate3918 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3922 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_321_in_distanceCoordinate3926 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3930 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_distanceCoordinate3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue4008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_322_in_percentValue4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_323_in_percentValue4013 = new BitSet(new long[]{0x0000000000000002L});

}