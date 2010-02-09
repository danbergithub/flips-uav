// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flips.g 2010-02-09 00:50:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'repeat'", "'wait'", "'time'", "'times'", "'continuously'", "'forever'", "'until'", "'while'", "'the'", "'tim'", "'is'", "'dir'", "'direction'", "'spd'", "'speed'", "'dst'", "'distance'", "'pit'", "'pitch'", "'rol'", "'roll'", "'alt'", "'altitude'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
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
    public static final int SOUTH=65;
    public static final int T__264=264;
    public static final int FOOT=45;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
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
    public static final int KILOMETER=40;
    public static final int T__255=255;
    public static final int EQ=68;
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
    public static final int SENSOR=8;
    public static final int T__138=138;
    public static final int GE=73;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__279=279;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int YARD=44;
    public static final int T__282=282;
    public static final int T__283=283;
    public static final int T__280=280;
    public static final int T__141=141;
    public static final int T__281=281;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=77;
    public static final int DURATION=28;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int CRUISE=58;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=92;
    public static final int T__129=129;
    public static final int OPTIMAL=22;
    public static final int BinaryLiteral=82;
    public static final int BinaryDigit=89;
    public static final int THROTTLE=23;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=81;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=71;
    public static final int T__277=277;
    public static final int T__278=278;
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
    public static final int NAUTICAL=42;
    public static final int T__227=227;
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
    public static final int PASCAL=55;
    public static final int DEGREE=37;
    public static final int TURN=13;
    public static final int SLOWER=21;
    public static final int FLY=9;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int PM=26;
    public static final int LONGITUDE=33;
    public static final int PRESSURE=52;
    public static final int MILE=43;
    public static final int LineComment=94;
    public static final int Exponent=91;
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
    public static final int SPEED=19;
    public static final int T__190=190;
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
    public static final int Turning=79;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=53;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=48;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MAXIMUM=57;
    public static final int MINUTE=35;
    public static final int T__169=169;
    public static final int LE=72;
    public static final int BAR=59;

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
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/compiler/flips.g"; }


    public static class flightPlan_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flightPlan"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:1: flightPlan : ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.statement_return statement2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:2: ( ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: ( define )* ( statement )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=95 && LA1_0<=97)||(LA1_0>=103 && LA1_0<=108)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan401);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:12: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=109 && LA2_0<=110)||(LA2_0>=132 && LA2_0<=137)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_flightPlan404);
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
            // 111:2: -> ^( FLIGHTPLAN ( define )* ( statement )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:5: ^( FLIGHTPLAN ( define )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:26: ( statement )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:116:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineSensor_return defineSensor4 = null;

        flipsParser.defineWaypoint_return defineWaypoint5 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:117:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 95:
            case 96:
            case 97:
                {
                alt3=1;
                }
                break;
            case 103:
            case 104:
            case 105:
                {
                alt3=2;
                }
                break;
            case 106:
            case 107:
            case 108:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:117:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define431);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:118:4: defineSensor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineSensor_in_define436);
                    defineSensor4=defineSensor();

                    state._fsp--;

                    adaptor.addChild(root_0, defineSensor4.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:119:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define441);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:122:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
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
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt4=1;
                }
                break;
            case 96:
                {
                alt4=2;
                }
                break;
            case 97:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:5: 'cmd'
                    {
                    string_literal6=(Token)match(input,95,FOLLOW_95_in_defineCommand453);  
                    stream_95.add(string_literal6);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:11: 'command'
                    {
                    string_literal7=(Token)match(input,96,FOLLOW_96_in_defineCommand455);  
                    stream_96.add(string_literal7);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:21: 'commands'
                    {
                    string_literal8=(Token)match(input,97,FOLLOW_97_in_defineCommand457);  
                    stream_97.add(string_literal8);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand460);
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
            // 124:2: -> defineCommandValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
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
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==98) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==101) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=95 && LA11_3<=97)||(LA11_3>=99 && LA11_3<=100)||(LA11_3>=103 && LA11_3<=110)||(LA11_3>=132 && LA11_3<=137)) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue476);  
                    stream_Identifier.add(Identifier10);

                    char_literal11=(Token)match(input,98,FOLLOW_98_in_defineCommandValue478);  
                    stream_98.add(char_literal11);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue480);
                    integerValue12=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue12.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==98) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=99 && LA7_0<=100)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==99) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==100) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:34: 'and'
                    	            {
                    	            string_literal13=(Token)match(input,99,FOLLOW_99_in_defineCommandValue484);  
                    	            stream_99.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:40: ',' ( 'and' )?
                    	            {
                    	            char_literal14=(Token)match(input,100,FOLLOW_100_in_defineCommandValue486);  
                    	            stream_100.add(char_literal14);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==99) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:44: 'and'
                    	                    {
                    	                    string_literal15=(Token)match(input,99,FOLLOW_99_in_defineCommandValue488);  
                    	                    stream_99.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue493);  
                    	    stream_Identifier.add(Identifier16);

                    	    char_literal17=(Token)match(input,98,FOLLOW_98_in_defineCommandValue495);  
                    	    stream_98.add(char_literal17);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue497);
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
                    // elements: integerValue, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_integerValue.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_integerValue.hasNext()||stream_Identifier.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:25: ^( COMMAND integerValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_integerValue.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_integerValue.reset();
                        stream_Identifier.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue520);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,98,FOLLOW_98_in_defineCommandValue522);  
                    stream_98.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue526);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal21=(Token)match(input,101,FOLLOW_101_in_defineCommandValue528);  
                    stream_101.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue532);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,102,FOLLOW_102_in_defineCommandValue534);  
                    stream_102.add(char_literal22);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==98) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=99 && LA10_0<=100)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==99) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==100) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:63: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,99,FOLLOW_99_in_defineCommandValue538);  
                    	            stream_99.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:69: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,100,FOLLOW_100_in_defineCommandValue540);  
                    	            stream_100.add(char_literal24);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:73: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==99) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:73: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,99,FOLLOW_99_in_defineCommandValue542);  
                    	                    stream_99.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue547);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,98,FOLLOW_98_in_defineCommandValue549);  
                    	    stream_98.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue553);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal28=(Token)match(input,101,FOLLOW_101_in_defineCommandValue555);  
                    	    stream_101.add(char_literal28);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue559);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal29=(Token)match(input,102,FOLLOW_102_in_defineCommandValue561);  
                    	    stream_102.add(char_literal29);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: Identifier, par, cmd
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
                    // 131:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_par.hasNext()||stream_cmd.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_par.hasNext()||stream_cmd.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:131:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:131:25: ^( COMMAND $cmd PARAMETER $par)
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
                        stream_par.reset();
                        stream_cmd.reset();

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:134:1: defineSensor : ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_defineSensorValue=new RewriteRuleSubtreeStream(adaptor,"rule defineSensorValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:2: ( ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:4: ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:4: ( 'sen' | 'sensor' | 'sensors' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt12=1;
                }
                break;
            case 104:
                {
                alt12=2;
                }
                break;
            case 105:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:5: 'sen'
                    {
                    string_literal30=(Token)match(input,103,FOLLOW_103_in_defineSensor597);  
                    stream_103.add(string_literal30);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:11: 'sensor'
                    {
                    string_literal31=(Token)match(input,104,FOLLOW_104_in_defineSensor599);  
                    stream_104.add(string_literal31);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:20: 'sensors'
                    {
                    string_literal32=(Token)match(input,105,FOLLOW_105_in_defineSensor601);  
                    stream_105.add(string_literal32);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor604);
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
            // 136:2: -> defineSensorValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:139:1: defineSensorValue : Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ ;
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
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue620);  
            stream_Identifier.add(Identifier34);

            char_literal35=(Token)match(input,98,FOLLOW_98_in_defineSensorValue622);  
            stream_98.add(char_literal35);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue626);
            sen=integerValue();

            state._fsp--;

            stream_integerValue.add(sen.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==98) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=99 && LA15_0<=100)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:37: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==99) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==100) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:38: 'and'
            	            {
            	            string_literal36=(Token)match(input,99,FOLLOW_99_in_defineSensorValue630);  
            	            stream_99.add(string_literal36);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:44: ',' ( 'and' )?
            	            {
            	            char_literal37=(Token)match(input,100,FOLLOW_100_in_defineSensorValue632);  
            	            stream_100.add(char_literal37);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:48: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==99) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:48: 'and'
            	                    {
            	                    string_literal38=(Token)match(input,99,FOLLOW_99_in_defineSensorValue634);  
            	                    stream_99.add(string_literal38);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue639);  
            	    stream_Identifier.add(Identifier39);

            	    char_literal40=(Token)match(input,98,FOLLOW_98_in_defineSensorValue641);  
            	    stream_98.add(char_literal40);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue645);
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
            // 141:2: -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+
            {
                if ( !(stream_sen.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sen.hasNext()||stream_Identifier.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:141:5: ^( DEFINE Identifier ^( SENSOR $sen) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:141:25: ^( SENSOR $sen)
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:144:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt16=1;
                }
                break;
            case 107:
                {
                alt16=2;
                }
                break;
            case 108:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:5: 'wpt'
                    {
                    string_literal41=(Token)match(input,106,FOLLOW_106_in_defineWaypoint676);  
                    stream_106.add(string_literal41);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:11: 'waypoint'
                    {
                    string_literal42=(Token)match(input,107,FOLLOW_107_in_defineWaypoint678);  
                    stream_107.add(string_literal42);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:22: 'waypoints'
                    {
                    string_literal43=(Token)match(input,108,FOLLOW_108_in_defineWaypoint680);  
                    stream_108.add(string_literal43);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint683);
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
            // 146:2: -> defineWaypointValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:149:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
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
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier45=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue699);  
            stream_Identifier.add(Identifier45);

            char_literal46=(Token)match(input,98,FOLLOW_98_in_defineWaypointValue701);  
            stream_98.add(char_literal46);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue703);
            geoCoordinate47=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate47.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Identifier) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==98) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>=99 && LA19_0<=100)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt18=3;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==99) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==100) ) {
            	        alt18=2;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:35: 'and'
            	            {
            	            string_literal48=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue707);  
            	            stream_99.add(string_literal48);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:41: ',' ( 'and' )?
            	            {
            	            char_literal49=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue709);  
            	            stream_100.add(char_literal49);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:45: ( 'and' )?
            	            int alt17=2;
            	            int LA17_0 = input.LA(1);

            	            if ( (LA17_0==99) ) {
            	                alt17=1;
            	            }
            	            switch (alt17) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:45: 'and'
            	                    {
            	                    string_literal50=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue711);  
            	                    stream_99.add(string_literal50);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue716);  
            	    stream_Identifier.add(Identifier51);

            	    char_literal52=(Token)match(input,98,FOLLOW_98_in_defineWaypointValue718);  
            	    stream_98.add(char_literal52);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue720);
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
            // 151:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_geoCoordinate.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_geoCoordinate.hasNext()||stream_Identifier.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:151:5: ^( DEFINE Identifier geoCoordinate )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:156:1: statement : ( command | 'repeat' ( statement )* repeat | 'wait' condition );
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
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:2: ( command | 'repeat' ( statement )* repeat | 'wait' condition )
            int alt21=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                {
                alt21=1;
                }
                break;
            case 109:
                {
                alt21=2;
                }
                break;
            case 110:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:4: command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_command_in_statement747);
                    command54=command();

                    state._fsp--;

                    adaptor.addChild(root_0, command54.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:4: 'repeat' ( statement )* repeat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal55=(Token)match(input,109,FOLLOW_109_in_statement752); 
                    string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:13: ( statement )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Identifier||(LA20_0>=109 && LA20_0<=110)||(LA20_0>=132 && LA20_0<=137)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:13: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement754);
                    	    statement56=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_repeat_in_statement757);
                    repeat57=repeat();

                    state._fsp--;

                    adaptor.addChild(root_0, repeat57.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:159:4: 'wait' condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal58=(Token)match(input,110,FOLLOW_110_in_statement762); 
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);

                    pushFollow(FOLLOW_condition_in_statement764);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:162:1: repeat : ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition );
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
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:163:2: ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition )
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
            case 113:
                {
                alt22=2;
                }
                break;
            case 114:
                {
                alt22=3;
                }
                break;
            case 115:
            case 116:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:163:4: integerValue ( 'time' | 'times' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_repeat775);
                    integerValue60=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue60.getTree());
                    set61=(Token)input.LT(1);
                    if ( (input.LA(1)>=111 && input.LA(1)<=112) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: 'continuously' duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal62=(Token)match(input,113,FOLLOW_113_in_repeat786); 
                    string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);

                    pushFollow(FOLLOW_duration_in_repeat788);
                    duration63=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration63.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:165:4: 'forever'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal64=(Token)match(input,114,FOLLOW_114_in_repeat793); 
                    string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
                    adaptor.addChild(root_0, string_literal64_tree);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:166:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_repeat798);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:1: condition : ( 'until' conditionValue | 'while' conditionValue );
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
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:2: ( 'until' conditionValue | 'while' conditionValue )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==115) ) {
                alt23=1;
            }
            else if ( (LA23_0==116) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: 'until' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal66=(Token)match(input,115,FOLLOW_115_in_condition809); 
                    string_literal66_tree = (CommonTree)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition811);
                    conditionValue67=conditionValue();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionValue67.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:4: 'while' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal68=(Token)match(input,116,FOLLOW_116_in_condition816); 
                    string_literal68_tree = (CommonTree)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition818);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:174:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );
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
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:2: ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue )
            int alt38=9;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==111||(LA25_0>=117 && LA25_0<=118)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:5: ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:5: ( 'the' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==117) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:5: 'the'
                                    {
                                    string_literal70=(Token)match(input,117,FOLLOW_117_in_conditionValue830); 
                                    string_literal70_tree = (CommonTree)adaptor.create(string_literal70);
                                    adaptor.addChild(root_0, string_literal70_tree);


                                    }
                                    break;

                            }

                            set71=(Token)input.LT(1);
                            if ( input.LA(1)==111||input.LA(1)==118 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set71));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set72=(Token)input.LT(1);
                            if ( input.LA(1)==98||input.LA(1)==119 ) {
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

                    pushFollow(FOLLOW_timeValue_in_conditionValue847);
                    timeValue73=timeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, timeValue73.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==117||(LA27_0>=120 && LA27_0<=121)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:5: ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:5: ( 'the' )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==117) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:5: 'the'
                                    {
                                    string_literal74=(Token)match(input,117,FOLLOW_117_in_conditionValue853); 
                                    string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
                                    adaptor.addChild(root_0, string_literal74_tree);


                                    }
                                    break;

                            }

                            set75=(Token)input.LT(1);
                            if ( (input.LA(1)>=120 && input.LA(1)<=121) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set75));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set76=(Token)input.LT(1);
                            if ( input.LA(1)==98||input.LA(1)==119 ) {
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

                    pushFollow(FOLLOW_fixedDirection_in_conditionValue870);
                    fixedDirection77=fixedDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedDirection77.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:177:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:177:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==117||(LA29_0>=122 && LA29_0<=123)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:177:5: ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:177:5: ( 'the' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==117) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:177:5: 'the'
                                    {
                                    string_literal78=(Token)match(input,117,FOLLOW_117_in_conditionValue876); 
                                    string_literal78_tree = (CommonTree)adaptor.create(string_literal78);
                                    adaptor.addChild(root_0, string_literal78_tree);


                                    }
                                    break;

                            }

                            set79=(Token)input.LT(1);
                            if ( (input.LA(1)>=122 && input.LA(1)<=123) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set79));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set80=(Token)input.LT(1);
                            if ( input.LA(1)==98||input.LA(1)==119 ) {
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

                    pushFollow(FOLLOW_speedValue_in_conditionValue893);
                    speedValue81=speedValue();

                    state._fsp--;

                    adaptor.addChild(root_0, speedValue81.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) )
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:5: ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:5: ( 'the' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==117) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:5: 'the'
                            {
                            string_literal82=(Token)match(input,117,FOLLOW_117_in_conditionValue899); 
                            string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
                            adaptor.addChild(root_0, string_literal82_tree);


                            }
                            break;

                    }

                    set83=(Token)input.LT(1);
                    if ( (input.LA(1)>=124 && input.LA(1)<=125) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set83));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set84=(Token)input.LT(1);
                    if ( input.LA(1)==98||input.LA(1)==119 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set84));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_distanceValue_in_conditionValue915);
                    distanceValue85=distanceValue();

                    state._fsp--;

                    adaptor.addChild(root_0, distanceValue85.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) )
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:5: ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:5: ( 'the' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==117) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:5: 'the'
                            {
                            string_literal86=(Token)match(input,117,FOLLOW_117_in_conditionValue921); 
                            string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                            adaptor.addChild(root_0, string_literal86_tree);


                            }
                            break;

                    }

                    set87=(Token)input.LT(1);
                    if ( (input.LA(1)>=126 && input.LA(1)<=127) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set87));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set88=(Token)input.LT(1);
                    if ( input.LA(1)==98||input.LA(1)==119 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue937);
                    angularValue89=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue89.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) )
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:5: ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:5: ( 'the' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==117) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:5: 'the'
                            {
                            string_literal90=(Token)match(input,117,FOLLOW_117_in_conditionValue943); 
                            string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                            adaptor.addChild(root_0, string_literal90_tree);


                            }
                            break;

                    }

                    set91=(Token)input.LT(1);
                    if ( (input.LA(1)>=128 && input.LA(1)<=129) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set92=(Token)input.LT(1);
                    if ( input.LA(1)==98||input.LA(1)==119 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue959);
                    angularValue93=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue93.getTree());

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=106 && LA34_0<=107)||LA34_0==117) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:5: ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:5: ( 'the' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==117) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:5: 'the'
                                    {
                                    string_literal94=(Token)match(input,117,FOLLOW_117_in_conditionValue965); 
                                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                                    adaptor.addChild(root_0, string_literal94_tree);


                                    }
                                    break;

                            }

                            set95=(Token)input.LT(1);
                            if ( (input.LA(1)>=106 && input.LA(1)<=107) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set95));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set96=(Token)input.LT(1);
                            if ( input.LA(1)==98||input.LA(1)==119 ) {
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

                    pushFollow(FOLLOW_waypoint_in_conditionValue982);
                    waypoint97=waypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, waypoint97.getTree());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==117||(LA36_0>=130 && LA36_0<=131)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:5: ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:5: ( 'the' )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==117) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:5: 'the'
                                    {
                                    string_literal98=(Token)match(input,117,FOLLOW_117_in_conditionValue988); 
                                    string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
                                    adaptor.addChild(root_0, string_literal98_tree);


                                    }
                                    break;

                            }

                            set99=(Token)input.LT(1);
                            if ( (input.LA(1)>=130 && input.LA(1)<=131) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set99));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set100=(Token)input.LT(1);
                            if ( input.LA(1)==98||input.LA(1)==119 ) {
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

                    pushFollow(FOLLOW_altitudeValue_in_conditionValue1005);
                    altitudeValue101=altitudeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, altitudeValue101.getTree());

                    }
                    break;
                case 9 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:4: Identifier ( '=' | 'is' )? numericValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditionValue1010); 
                    Identifier102_tree = (CommonTree)adaptor.create(Identifier102);
                    adaptor.addChild(root_0, Identifier102_tree);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:15: ( '=' | 'is' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==98||LA37_0==119) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
                            {
                            set103=(Token)input.LT(1);
                            if ( input.LA(1)==98||input.LA(1)==119 ) {
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

                    pushFollow(FOLLOW_numericValue_in_conditionValue1019);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:188:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand105 = null;

        flipsParser.turnCommand_return turnCommand106 = null;

        flipsParser.loiterCommand_return loiterCommand107 = null;

        flipsParser.executeCommand_return executeCommand108 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:189:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 132:
            case 133:
                {
                alt39=1;
                }
                break;
            case 134:
            case 135:
                {
                alt39=2;
                }
                break;
            case 136:
            case 137:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:189:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command1032);
                    flyCommand105=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand105.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:190:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command1037);
                    turnCommand106=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand106.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command1042);
                    loiterCommand107=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand107.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:192:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command1047);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        flipsParser.flyCommandValue_return flyCommandValue111 = null;


        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:4: ( 'fly' | 'go' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==132) ) {
                alt40=1;
            }
            else if ( (LA40_0==133) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:5: 'fly'
                    {
                    string_literal109=(Token)match(input,132,FOLLOW_132_in_flyCommand1059);  
                    stream_132.add(string_literal109);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:11: 'go'
                    {
                    string_literal110=(Token)match(input,133,FOLLOW_133_in_flyCommand1061);  
                    stream_133.add(string_literal110);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:17: ( flyCommandValue )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=BinaryLiteral && LA41_0<=HexLiteral)) ) {
                    int LA41_2 = input.LA(2);

                    if ( ((LA41_2>=165 && LA41_2<=182)||(LA41_2>=185 && LA41_2<=191)||(LA41_2>=286 && LA41_2<=287)) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>=To && LA41_0<=With)||(LA41_0>=Turning && LA41_0<=FloatingPointLiteral)||(LA41_0>=126 && LA41_0<=129)||(LA41_0>=139 && LA41_0<=140)||(LA41_0>=194 && LA41_0<=199)||LA41_0==217||(LA41_0>=222 && LA41_0<=270)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand1064);
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
            // 197:2: -> ^( FLY ( flyCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:11: ( flyCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:200:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
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
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:201:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt45=9;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:201:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue1086);
                    time112=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time112.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:202:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue1091);
                    direction113=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction113.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:203:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue1096);
                    speed114=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed114.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue1101);
                    distance115=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance115.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:205:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue1106);
                    pitch116=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch116.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue1111);
                    roll117=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll117.getTree());

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue1116);
                    duration118=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration118.getTree());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To119=(Token)match(input,To,FOLLOW_To_in_flyCommandValue1121);  
                    stream_To.add(To119);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue1123);
                    waypoint120=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint120.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=99 && LA44_0<=100)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==99) ) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==100) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:18: 'and'
                    	            {
                    	            string_literal121=(Token)match(input,99,FOLLOW_99_in_flyCommandValue1127);  
                    	            stream_99.add(string_literal121);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:24: ',' ( 'and' )?
                    	            {
                    	            char_literal122=(Token)match(input,100,FOLLOW_100_in_flyCommandValue1129);  
                    	            stream_100.add(char_literal122);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:28: ( 'and' )?
                    	            int alt42=2;
                    	            int LA42_0 = input.LA(1);

                    	            if ( (LA42_0==99) ) {
                    	                alt42=1;
                    	            }
                    	            switch (alt42) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:28: 'and'
                    	                    {
                    	                    string_literal123=(Token)match(input,99,FOLLOW_99_in_flyCommandValue1131);  
                    	                    stream_99.add(string_literal123);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue1135);
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
                    // 209:2: -> ( waypoint )+
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue1148);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:213:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal126=null;
        Token string_literal127=null;
        flipsParser.turnCommandValue_return turnCommandValue128 = null;


        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:4: ( 'trn' | 'turn' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==134) ) {
                alt46=1;
            }
            else if ( (LA46_0==135) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:5: 'trn'
                    {
                    string_literal126=(Token)match(input,134,FOLLOW_134_in_turnCommand1160);  
                    stream_134.add(string_literal126);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:11: 'turn'
                    {
                    string_literal127=(Token)match(input,135,FOLLOW_135_in_turnCommand1162);  
                    stream_135.add(string_literal127);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:19: ( turnCommandValue )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=Turning && LA47_0<=Heading)||LA47_0==217||(LA47_0>=223 && LA47_0<=253)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:214:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand1165);
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
            // 215:2: -> ^( FLY ( turnCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:215:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:215:11: ( turnCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction129 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:219:2: ( direction )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:219:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue1187);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:222:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        flipsParser.loiterCommandValue_return loiterCommandValue132 = null;


        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( 'ltr' | 'loiter' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==136) ) {
                alt48=1;
            }
            else if ( (LA48_0==137) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: 'ltr'
                    {
                    string_literal130=(Token)match(input,136,FOLLOW_136_in_loiterCommand1199);  
                    stream_136.add(string_literal130);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:11: 'loiter'
                    {
                    string_literal131=(Token)match(input,137,FOLLOW_137_in_loiterCommand1201);  
                    stream_137.add(string_literal131);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:21: ( loiterCommandValue )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=BinaryLiteral && LA49_0<=HexLiteral)) ) {
                    int LA49_2 = input.LA(2);

                    if ( ((LA49_2>=165 && LA49_2<=182)||(LA49_2>=185 && LA49_2<=191)||(LA49_2>=286 && LA49_2<=287)) ) {
                        alt49=1;
                    }


                }
                else if ( ((LA49_0>=To && LA49_0<=With)||LA49_0==Turning||LA49_0==FloatingPointLiteral||LA49_0==142||(LA49_0>=163 && LA49_0<=164)||(LA49_0>=194 && LA49_0<=199)||LA49_0==222||(LA49_0>=254 && LA49_0<=264)||(LA49_0>=271 && LA49_0<=274)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand1204);
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
            // 224:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:224:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:224:14: ( loiterCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:227:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
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
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:228:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt50=7;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:228:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue1226);
                    time133=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time133.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:229:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue1231);
                    speed134=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed134.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue1236);
                    loiterDirection135=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection135.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:231:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue1241);
                    radius136=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius136.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:232:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue1246);
                    duration137=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration137.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:233:4: At waypoint
                    {
                    At138=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue1251);  
                    stream_At.add(At138);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue1253);
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
                    // 234:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue1263);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:238:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier141=null;
        Token Identifier142=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token char_literal147=null;
        flipsParser.numericValue_return numericValue144 = null;

        flipsParser.numericValue_return numericValue146 = null;


        CommonTree Identifier141_tree=null;
        CommonTree Identifier142_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:239:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Identifier) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==101) ) {
                    alt52=2;
                }
                else if ( (LA52_1==EOF||LA52_1==Identifier||(LA52_1>=BinaryLiteral && LA52_1<=HexLiteral)||(LA52_1>=109 && LA52_1<=110)||(LA52_1>=113 && LA52_1<=116)||(LA52_1>=132 && LA52_1<=137)) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:239:4: Identifier
                    {
                    Identifier141=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1274);  
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
                    // 240:2: -> ^( EXECUTE Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:5: ^( EXECUTE Identifier )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier142=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1288);  
                    stream_Identifier.add(Identifier142);

                    char_literal143=(Token)match(input,101,FOLLOW_101_in_executeCommand1290);  
                    stream_101.add(char_literal143);

                    pushFollow(FOLLOW_numericValue_in_executeCommand1292);
                    numericValue144=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue144.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:32: ( ',' numericValue )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==100) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:33: ',' numericValue
                    	    {
                    	    char_literal145=(Token)match(input,100,FOLLOW_100_in_executeCommand1295);  
                    	    stream_100.add(char_literal145);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand1297);
                    	    numericValue146=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue146.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    char_literal147=(Token)match(input,102,FOLLOW_102_in_executeCommand1302);  
                    stream_102.add(char_literal147);



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
                    // 242:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:242:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:242:26: ^( PARAMETER numericValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_2);

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
        return retval;
    }
    // $ANTLR end "executeCommand"

    public static class pitch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pitch"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:247:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
    public final flipsParser.pitch_return pitch() throws RecognitionException {
        flipsParser.pitch_return retval = new flipsParser.pitch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal148=null;
        Token string_literal149=null;
        Token With151=null;
        Token string_literal152=null;
        Token string_literal153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        flipsParser.angularValue_return angularValue150 = null;

        flipsParser.angularValue_return angularValue156 = null;


        CommonTree string_literal148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree With151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree string_literal153_tree=null;
        CommonTree string_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=126 && LA57_0<=127)) ) {
                alt57=1;
            }
            else if ( (LA57_0==With||(LA57_0>=139 && LA57_0<=140)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:4: ( 'pit' | 'pitch' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==126) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==127) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:5: 'pit'
                            {
                            string_literal148=(Token)match(input,126,FOLLOW_126_in_pitch1332);  
                            stream_126.add(string_literal148);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:11: 'pitch'
                            {
                            string_literal149=(Token)match(input,127,FOLLOW_127_in_pitch1334);  
                            stream_127.add(string_literal149);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1337);
                    angularValue150=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue150.getTree());


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
                    // 249:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:249:5: ^( PITCH angularValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:4: ( With 'an' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==With) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:5: With 'an'
                            {
                            With151=(Token)match(input,With,FOLLOW_With_in_pitch1352);  
                            stream_With.add(With151);

                            string_literal152=(Token)match(input,138,FOLLOW_138_in_pitch1354);  
                            stream_138.add(string_literal152);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:17: ( 'aoa' | 'angle of attack' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==139) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==140) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:18: 'aoa'
                            {
                            string_literal153=(Token)match(input,139,FOLLOW_139_in_pitch1359);  
                            stream_139.add(string_literal153);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:24: 'angle of attack'
                            {
                            string_literal154=(Token)match(input,140,FOLLOW_140_in_pitch1361);  
                            stream_140.add(string_literal154);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:43: ( 'of' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==141) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:43: 'of'
                            {
                            string_literal155=(Token)match(input,141,FOLLOW_141_in_pitch1364);  
                            stream_141.add(string_literal155);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1367);
                    angularValue156=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue156.getTree());


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
                    // 251:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:251:5: ^( PITCH angularValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal157=null;
        Token string_literal158=null;
        flipsParser.angularValue_return angularValue159 = null;


        CommonTree string_literal157_tree=null;
        CommonTree string_literal158_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:255:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:255:4: ( 'rol' | 'roll' ) angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:255:4: ( 'rol' | 'roll' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==128) ) {
                alt58=1;
            }
            else if ( (LA58_0==129) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:255:5: 'rol'
                    {
                    string_literal157=(Token)match(input,128,FOLLOW_128_in_roll1388);  
                    stream_128.add(string_literal157);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:255:11: 'roll'
                    {
                    string_literal158=(Token)match(input,129,FOLLOW_129_in_roll1390);  
                    stream_129.add(string_literal158);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1393);
            angularValue159=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue159.getTree());


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
            // 256:2: -> ^( ROLL angularValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:5: ^( ROLL angularValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:261:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude160 = null;

        flipsParser.relativeAltitude_return relativeAltitude161 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:2: ( fixedAltitude | relativeAltitude )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1415);
                    fixedAltitude160=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude160.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1420);
                    relativeAltitude161=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude161.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To163=null;
        Token At164=null;
        Token With165=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        Token char_literal169=null;
        Token string_literal170=null;
        Token string_literal171=null;
        Token string_literal172=null;
        flipsParser.upDownDirection_return upDownDirection162 = null;

        flipsParser.altitudeValue_return altitudeValue173 = null;


        CommonTree To163_tree=null;
        CommonTree At164_tree=null;
        CommonTree With165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree string_literal167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        CommonTree string_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:4: ( ( upDownDirection )? To | At | With )
            int alt61=3;
            switch ( input.LA(1) ) {
            case To:
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
                {
                alt61=1;
                }
                break;
            case At:
                {
                alt61=2;
                }
                break;
            case With:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:5: ( upDownDirection )? To
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:5: ( upDownDirection )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=254 && LA60_0<=264)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1432);
                            upDownDirection162=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection162.getTree());

                            }
                            break;

                    }

                    To163=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1435);  
                    stream_To.add(To163);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:25: At
                    {
                    At164=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1437);  
                    stream_At.add(At164);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:28: With
                    {
                    With165=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1439);  
                    stream_With.add(With165);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=130 && LA68_0<=131)||LA68_0==138||(LA68_0>=142 && LA68_0<=144)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=130 && LA66_0<=131)||LA66_0==138) ) {
                        alt66=1;
                    }
                    else if ( ((LA66_0>=142 && LA66_0<=144)) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:36: ( 'an' )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==138) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:36: 'an'
                                    {
                                    string_literal166=(Token)match(input,138,FOLLOW_138_in_fixedAltitude1444);  
                                    stream_138.add(string_literal166);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:42: ( 'alt' | 'altitude' )
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==130) ) {
                                alt63=1;
                            }
                            else if ( (LA63_0==131) ) {
                                alt63=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                throw nvae;
                            }
                            switch (alt63) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:43: 'alt'
                                    {
                                    string_literal167=(Token)match(input,130,FOLLOW_130_in_fixedAltitude1448);  
                                    stream_130.add(string_literal167);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:49: 'altitude'
                                    {
                                    string_literal168=(Token)match(input,131,FOLLOW_131_in_fixedAltitude1450);  
                                    stream_131.add(string_literal168);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:61: ( 'a' )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==142) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:61: 'a'
                                    {
                                    char_literal169=(Token)match(input,142,FOLLOW_142_in_fixedAltitude1453);  
                                    stream_142.add(char_literal169);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:66: ( 'pres' | 'pressure' )
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==143) ) {
                                alt65=1;
                            }
                            else if ( (LA65_0==144) ) {
                                alt65=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 0, input);

                                throw nvae;
                            }
                            switch (alt65) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:67: 'pres'
                                    {
                                    string_literal170=(Token)match(input,143,FOLLOW_143_in_fixedAltitude1457);  
                                    stream_143.add(string_literal170);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:74: 'pressure'
                                    {
                                    string_literal171=(Token)match(input,144,FOLLOW_144_in_fixedAltitude1459);  
                                    stream_144.add(string_literal171);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:87: ( 'of' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==141) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:87: 'of'
                            {
                            string_literal172=(Token)match(input,141,FOLLOW_141_in_fixedAltitude1463);  
                            stream_141.add(string_literal172);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1468);
            altitudeValue173=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue173.getTree());


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
            // 268:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:5: ^( ALTITUDE FIXED altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:271:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection174 = null;

        flipsParser.altitudeValue_return altitudeValue175 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:272:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:272:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1490);
            upDownDirection174=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection174.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1492);
            altitudeValue175=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue175.getTree());


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
            // 273:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:273:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:276:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel178=null;
        flipsParser.distanceValue_return distanceValue176 = null;

        flipsParser.pressureValue_return pressureValue177 = null;


        CommonTree FlightLevel178_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt69=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA69_1 = input.LA(2);

                if ( ((LA69_1>=165 && LA69_1<=182)) ) {
                    alt69=1;
                }
                else if ( ((LA69_1>=145 && LA69_1<=162)) ) {
                    alt69=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA69_2 = input.LA(2);

                if ( ((LA69_2>=145 && LA69_2<=162)) ) {
                    alt69=2;
                }
                else if ( ((LA69_2>=165 && LA69_2<=182)) ) {
                    alt69=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }
                }
                break;
            case FlightLevel:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1516);
                    distanceValue176=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue176.getTree());


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
                    // 278:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1528);
                    pressureValue177=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue177.getTree());


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
                    // 280:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:4: FlightLevel
                    {
                    FlightLevel178=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1540);  
                    stream_FlightLevel.add(FlightLevel178);



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
                    // 282:2: -> FLIGHTLEVEL FlightLevel
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue179 = null;

        flipsParser.pressureUnit_return pressureUnit180 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:286:2: ( numericValue pressureUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:286:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1558);
            numericValue179=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue179.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1560);
            pressureUnit180=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit180.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal181=null;
        Token string_literal182=null;
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

        CommonTree string_literal181_tree=null;
        CommonTree string_literal182_tree=null;
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
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
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
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:290:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 145:
            case 146:
            case 147:
                {
                alt76=1;
                }
                break;
            case 148:
            case 149:
            case 150:
                {
                alt76=2;
                }
                break;
            case 151:
            case 152:
            case 153:
                {
                alt76=3;
                }
                break;
            case 154:
            case 155:
                {
                alt76=4;
                }
                break;
            case 156:
            case 157:
            case 158:
                {
                alt76=5;
                }
                break;
            case 159:
            case 160:
            case 161:
            case 162:
                {
                alt76=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:290:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:290:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt70=3;
                    switch ( input.LA(1) ) {
                    case 145:
                        {
                        alt70=1;
                        }
                        break;
                    case 146:
                        {
                        alt70=2;
                        }
                        break;
                    case 147:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:290:5: 'kpa'
                            {
                            string_literal181=(Token)match(input,145,FOLLOW_145_in_pressureUnit1572);  
                            stream_145.add(string_literal181);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:290:11: 'kilopascal'
                            {
                            string_literal182=(Token)match(input,146,FOLLOW_146_in_pressureUnit1574);  
                            stream_146.add(string_literal182);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:290:24: 'kilopascals'
                            {
                            string_literal183=(Token)match(input,147,FOLLOW_147_in_pressureUnit1576);  
                            stream_147.add(string_literal183);


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
                    // 291:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:292:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:292:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 148:
                        {
                        alt71=1;
                        }
                        break;
                    case 149:
                        {
                        alt71=2;
                        }
                        break;
                    case 150:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:292:5: 'hpa'
                            {
                            string_literal184=(Token)match(input,148,FOLLOW_148_in_pressureUnit1588);  
                            stream_148.add(string_literal184);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:292:11: 'hectopascal'
                            {
                            string_literal185=(Token)match(input,149,FOLLOW_149_in_pressureUnit1590);  
                            stream_149.add(string_literal185);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:292:25: 'hectopascals'
                            {
                            string_literal186=(Token)match(input,150,FOLLOW_150_in_pressureUnit1592);  
                            stream_150.add(string_literal186);


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
                    // 293:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case 151:
                        {
                        alt72=1;
                        }
                        break;
                    case 152:
                        {
                        alt72=2;
                        }
                        break;
                    case 153:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:5: 'pa'
                            {
                            string_literal187=(Token)match(input,151,FOLLOW_151_in_pressureUnit1604);  
                            stream_151.add(string_literal187);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:10: 'pascal'
                            {
                            string_literal188=(Token)match(input,152,FOLLOW_152_in_pressureUnit1606);  
                            stream_152.add(string_literal188);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:19: 'pascals'
                            {
                            string_literal189=(Token)match(input,153,FOLLOW_153_in_pressureUnit1608);  
                            stream_153.add(string_literal189);


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
                    // 295:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:296:4: ( 'bar' | 'bars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:296:4: ( 'bar' | 'bars' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==154) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==155) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:296:5: 'bar'
                            {
                            string_literal190=(Token)match(input,154,FOLLOW_154_in_pressureUnit1620);  
                            stream_154.add(string_literal190);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:296:11: 'bars'
                            {
                            string_literal191=(Token)match(input,155,FOLLOW_155_in_pressureUnit1622);  
                            stream_155.add(string_literal191);


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
                    // 297:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:298:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:298:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt74=3;
                    switch ( input.LA(1) ) {
                    case 156:
                        {
                        alt74=1;
                        }
                        break;
                    case 157:
                        {
                        alt74=2;
                        }
                        break;
                    case 158:
                        {
                        alt74=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:298:5: 'mbar'
                            {
                            string_literal192=(Token)match(input,156,FOLLOW_156_in_pressureUnit1634);  
                            stream_156.add(string_literal192);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:298:12: 'millibar'
                            {
                            string_literal193=(Token)match(input,157,FOLLOW_157_in_pressureUnit1636);  
                            stream_157.add(string_literal193);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:298:23: 'millibars'
                            {
                            string_literal194=(Token)match(input,158,FOLLOW_158_in_pressureUnit1638);  
                            stream_158.add(string_literal194);


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
                    // 299:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt75=4;
                    switch ( input.LA(1) ) {
                    case 159:
                        {
                        alt75=1;
                        }
                        break;
                    case 160:
                        {
                        alt75=2;
                        }
                        break;
                    case 161:
                        {
                        alt75=3;
                        }
                        break;
                    case 162:
                        {
                        alt75=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }

                    switch (alt75) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:5: 'atm'
                            {
                            string_literal195=(Token)match(input,159,FOLLOW_159_in_pressureUnit1650);  
                            stream_159.add(string_literal195);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:11: 'atms'
                            {
                            string_literal196=(Token)match(input,160,FOLLOW_160_in_pressureUnit1652);  
                            stream_160.add(string_literal196);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:18: 'atmosphere'
                            {
                            string_literal197=(Token)match(input,161,FOLLOW_161_in_pressureUnit1654);  
                            stream_161.add(string_literal197);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:31: 'atmospheres'
                            {
                            string_literal198=(Token)match(input,162,FOLLOW_162_in_pressureUnit1656);  
                            stream_162.add(string_literal198);


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
                    // 301:2: -> ATMOSPHERE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
    public final flipsParser.radius_return radius() throws RecognitionException {
        flipsParser.radius_return retval = new flipsParser.radius_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal199=null;
        Token With200=null;
        Token char_literal201=null;
        Token string_literal202=null;
        Token string_literal203=null;
        Token string_literal206=null;
        flipsParser.distanceValue_return distanceValue204 = null;

        flipsParser.distanceValue_return distanceValue205 = null;


        CommonTree string_literal199_tree=null;
        CommonTree With200_tree=null;
        CommonTree char_literal201_tree=null;
        CommonTree string_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        CommonTree string_literal206_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:4: ( 'in' | With )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==163) ) {
                alt77=1;
            }
            else if ( (LA77_0==With) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:5: 'in'
                    {
                    string_literal199=(Token)match(input,163,FOLLOW_163_in_radius1676);  
                    stream_163.add(string_literal199);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:10: With
                    {
                    With200=(Token)match(input,With,FOLLOW_With_in_radius1678);  
                    stream_With.add(With200);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:17: ( 'a' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==142) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:17: 'a'
                    {
                    char_literal201=(Token)match(input,142,FOLLOW_142_in_radius1682);  
                    stream_142.add(char_literal201);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==164) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=FloatingPointLiteral && LA80_0<=HexLiteral)) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal202=(Token)match(input,164,FOLLOW_164_in_radius1686);  
                    stream_164.add(string_literal202);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:32: ( 'of' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==141) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:32: 'of'
                            {
                            string_literal203=(Token)match(input,141,FOLLOW_141_in_radius1688);  
                            stream_141.add(string_literal203);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1691);
                    distanceValue204=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue204.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1693);
                    distanceValue205=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue205.getTree());
                    string_literal206=(Token)match(input,164,FOLLOW_164_in_radius1695);  
                    stream_164.add(string_literal206);


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
            // 308:2: -> ^( RADIUS distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:308:5: ^( RADIUS distanceValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:311:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection207 = null;

        flipsParser.distanceValue_return distanceValue208 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:4: ( leftRightDirection )? distanceValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:4: ( leftRightDirection )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=265 && LA81_0<=270)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1716);
                    leftRightDirection207=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection207.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1719);
            distanceValue208=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue208.getTree());


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
            // 313:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:16: ( leftRightDirection )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:316:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue209 = null;

        flipsParser.distanceUnit_return distanceUnit210 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1742);
            numericValue209=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue209.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1744);
            distanceUnit210=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit210.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:320:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal211=null;
        Token string_literal212=null;
        Token string_literal213=null;
        Token char_literal214=null;
        Token string_literal215=null;
        Token string_literal216=null;
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
        Token string_literal231=null;

        CommonTree string_literal211_tree=null;
        CommonTree string_literal212_tree=null;
        CommonTree string_literal213_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree string_literal215_tree=null;
        CommonTree string_literal216_tree=null;
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
        CommonTree string_literal231_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt90=6;
            switch ( input.LA(1) ) {
            case 165:
            case 166:
            case 167:
                {
                alt90=1;
                }
                break;
            case 168:
            case 169:
            case 170:
                {
                alt90=2;
                }
                break;
            case 171:
            case 172:
                {
                alt90=3;
                }
                break;
            case 173:
            case 174:
            case 175:
            case 176:
                {
                alt90=4;
                }
                break;
            case 177:
            case 178:
            case 179:
                {
                alt90=5;
                }
                break;
            case 180:
            case 181:
            case 182:
                {
                alt90=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt82=3;
                    switch ( input.LA(1) ) {
                    case 165:
                        {
                        alt82=1;
                        }
                        break;
                    case 166:
                        {
                        alt82=2;
                        }
                        break;
                    case 167:
                        {
                        alt82=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }

                    switch (alt82) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:5: 'km'
                            {
                            string_literal211=(Token)match(input,165,FOLLOW_165_in_distanceUnit1756);  
                            stream_165.add(string_literal211);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:10: 'kilometer'
                            {
                            string_literal212=(Token)match(input,166,FOLLOW_166_in_distanceUnit1758);  
                            stream_166.add(string_literal212);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:22: 'kilometers'
                            {
                            string_literal213=(Token)match(input,167,FOLLOW_167_in_distanceUnit1760);  
                            stream_167.add(string_literal213);


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
                    // 322:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:4: ( 'm' | 'meter' | 'meters' )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case 168:
                        {
                        alt83=1;
                        }
                        break;
                    case 169:
                        {
                        alt83=2;
                        }
                        break;
                    case 170:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:5: 'm'
                            {
                            char_literal214=(Token)match(input,168,FOLLOW_168_in_distanceUnit1772);  
                            stream_168.add(char_literal214);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:9: 'meter'
                            {
                            string_literal215=(Token)match(input,169,FOLLOW_169_in_distanceUnit1774);  
                            stream_169.add(string_literal215);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:17: 'meters'
                            {
                            string_literal216=(Token)match(input,170,FOLLOW_170_in_distanceUnit1776);  
                            stream_170.add(string_literal216);


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
                    // 324:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==171) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==172) ) {
                        alt85=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:5: 'nm'
                            {
                            string_literal217=(Token)match(input,171,FOLLOW_171_in_distanceUnit1788);  
                            stream_171.add(string_literal217);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal218=(Token)match(input,172,FOLLOW_172_in_distanceUnit1790);  
                            stream_172.add(string_literal218);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:21: ( 'mi' | 'mile' | 'miles' )
                            int alt84=3;
                            switch ( input.LA(1) ) {
                            case 173:
                                {
                                alt84=1;
                                }
                                break;
                            case 174:
                                {
                                alt84=2;
                                }
                                break;
                            case 175:
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
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:22: 'mi'
                                    {
                                    string_literal219=(Token)match(input,173,FOLLOW_173_in_distanceUnit1793);  
                                    stream_173.add(string_literal219);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:27: 'mile'
                                    {
                                    string_literal220=(Token)match(input,174,FOLLOW_174_in_distanceUnit1795);  
                                    stream_174.add(string_literal220);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:34: 'miles'
                                    {
                                    string_literal221=(Token)match(input,175,FOLLOW_175_in_distanceUnit1797);  
                                    stream_175.add(string_literal221);


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
                    // 326:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:4: ( 'statute' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==176) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:5: 'statute'
                            {
                            string_literal222=(Token)match(input,176,FOLLOW_176_in_distanceUnit1812);  
                            stream_176.add(string_literal222);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:17: ( 'mi' | 'mile' | 'miles' )
                    int alt87=3;
                    switch ( input.LA(1) ) {
                    case 173:
                        {
                        alt87=1;
                        }
                        break;
                    case 174:
                        {
                        alt87=2;
                        }
                        break;
                    case 175:
                        {
                        alt87=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }

                    switch (alt87) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:18: 'mi'
                            {
                            string_literal223=(Token)match(input,173,FOLLOW_173_in_distanceUnit1817);  
                            stream_173.add(string_literal223);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:23: 'mile'
                            {
                            string_literal224=(Token)match(input,174,FOLLOW_174_in_distanceUnit1819);  
                            stream_174.add(string_literal224);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:30: 'miles'
                            {
                            string_literal225=(Token)match(input,175,FOLLOW_175_in_distanceUnit1821);  
                            stream_175.add(string_literal225);


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
                    // 328:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:4: ( 'yd' | 'yard' | 'yards' )
                    int alt88=3;
                    switch ( input.LA(1) ) {
                    case 177:
                        {
                        alt88=1;
                        }
                        break;
                    case 178:
                        {
                        alt88=2;
                        }
                        break;
                    case 179:
                        {
                        alt88=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }

                    switch (alt88) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:5: 'yd'
                            {
                            string_literal226=(Token)match(input,177,FOLLOW_177_in_distanceUnit1833);  
                            stream_177.add(string_literal226);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:10: 'yard'
                            {
                            string_literal227=(Token)match(input,178,FOLLOW_178_in_distanceUnit1835);  
                            stream_178.add(string_literal227);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:17: 'yards'
                            {
                            string_literal228=(Token)match(input,179,FOLLOW_179_in_distanceUnit1837);  
                            stream_179.add(string_literal228);


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
                    // 330:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:4: ( 'ft' | 'foot' | 'feet' )
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:5: 'ft'
                            {
                            string_literal229=(Token)match(input,180,FOLLOW_180_in_distanceUnit1849);  
                            stream_180.add(string_literal229);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:10: 'foot'
                            {
                            string_literal230=(Token)match(input,181,FOLLOW_181_in_distanceUnit1851);  
                            stream_181.add(string_literal230);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:17: 'feet'
                            {
                            string_literal231=(Token)match(input,182,FOLLOW_182_in_distanceUnit1853);  
                            stream_182.add(string_literal231);


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
                    // 332:2: -> FOOT
                    {
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
        return retval;
    }
    // $ANTLR end "distanceUnit"

    public static class speed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed232 = null;

        flipsParser.relativeSpeed_return relativeSpeed233 = null;

        flipsParser.optimalSpeed_return optimalSpeed234 = null;

        flipsParser.throttleSpeed_return throttleSpeed235 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:338:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt91=4;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:338:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1872);
                    fixedSpeed232=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed232.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1877);
                    relativeSpeed233=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed233.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:340:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed1882);
                    optimalSpeed234=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed234.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1887);
                    throttleSpeed235=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed235.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:1: fixedSpeed : ( At )? speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At236=null;
        flipsParser.speedValue_return speedValue237 = null;


        CommonTree At236_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:2: ( ( At )? speedValue -> ^( SPEED FIXED speedValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:4: ( At )? speedValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:4: ( At )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==At) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:4: At
                    {
                    At236=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1898);  
                    stream_At.add(At236);


                    }
                    break;

            }

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1901);
            speedValue237=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue237.getTree());


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
            // 346:2: -> ^( SPEED FIXED speedValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:5: ^( SPEED FIXED speedValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal239=null;
        Token string_literal241=null;
        Token string_literal243=null;
        Token string_literal245=null;
        flipsParser.speedValue_return speedValue238 = null;

        flipsParser.speedValue_return speedValue240 = null;

        flipsParser.percentValue_return percentValue242 = null;

        flipsParser.percentValue_return percentValue244 = null;


        CommonTree string_literal239_tree=null;
        CommonTree string_literal241_tree=null;
        CommonTree string_literal243_tree=null;
        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:350:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt93=4;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:350:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1923);
                    speedValue238=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue238.getTree());
                    string_literal239=(Token)match(input,183,FOLLOW_183_in_relativeSpeed1925);  
                    stream_183.add(string_literal239);



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
                    // 351:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:5: ^( SPEED RELATIVE FASTER speedValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:352:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1943);
                    speedValue240=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue240.getTree());
                    string_literal241=(Token)match(input,184,FOLLOW_184_in_relativeSpeed1945);  
                    stream_184.add(string_literal241);



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
                    // 353:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:5: ^( SPEED RELATIVE SLOWER speedValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:354:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1963);
                    percentValue242=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue242.getTree());
                    string_literal243=(Token)match(input,183,FOLLOW_183_in_relativeSpeed1965);  
                    stream_183.add(string_literal243);



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
                    // 355:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:355:5: ^( SPEED RELATIVE FASTER percentValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1983);
                    percentValue244=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue244.getTree());
                    string_literal245=(Token)match(input,184,FOLLOW_184_in_relativeSpeed1985);  
                    stream_184.add(string_literal245);



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
                    // 357:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:357:5: ^( SPEED RELATIVE SLOWER percentValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:360:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue246 = null;

        flipsParser.speedUnit_return speedUnit247 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:2: ( numericValue speedUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue2009);
            numericValue246=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue246.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue2011);
            speedUnit247=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit247.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:364:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal248=null;
        Token string_literal249=null;
        Token string_literal250=null;
        Token string_literal251=null;
        Token string_literal252=null;
        Token string_literal253=null;
        Token string_literal254=null;
        Token char_literal256=null;
        Token string_literal257=null;
        flipsParser.distanceUnit_return distanceUnit255 = null;

        flipsParser.timeUnit_return timeUnit258 = null;


        CommonTree string_literal248_tree=null;
        CommonTree string_literal249_tree=null;
        CommonTree string_literal250_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree string_literal252_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree string_literal254_tree=null;
        CommonTree char_literal256_tree=null;
        CommonTree string_literal257_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 185:
                {
                alt96=1;
                }
                break;
            case 186:
                {
                alt96=2;
                }
                break;
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
                {
                alt96=3;
                }
                break;
            case 165:
            case 166:
            case 167:
            case 168:
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
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:4: 'kph'
                    {
                    string_literal248=(Token)match(input,185,FOLLOW_185_in_speedUnit2022);  
                    stream_185.add(string_literal248);



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
                    // 366:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:367:4: 'mph'
                    {
                    string_literal249=(Token)match(input,186,FOLLOW_186_in_speedUnit2034);  
                    stream_186.add(string_literal249);



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
                    // 368:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt94=5;
                    switch ( input.LA(1) ) {
                    case 187:
                        {
                        alt94=1;
                        }
                        break;
                    case 188:
                        {
                        alt94=2;
                        }
                        break;
                    case 189:
                        {
                        alt94=3;
                        }
                        break;
                    case 190:
                        {
                        alt94=4;
                        }
                        break;
                    case 191:
                        {
                        alt94=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }

                    switch (alt94) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:5: 'kn'
                            {
                            string_literal250=(Token)match(input,187,FOLLOW_187_in_speedUnit2047);  
                            stream_187.add(string_literal250);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:10: 'kt'
                            {
                            string_literal251=(Token)match(input,188,FOLLOW_188_in_speedUnit2049);  
                            stream_188.add(string_literal251);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:15: 'kts'
                            {
                            string_literal252=(Token)match(input,189,FOLLOW_189_in_speedUnit2051);  
                            stream_189.add(string_literal252);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:21: 'knot'
                            {
                            string_literal253=(Token)match(input,190,FOLLOW_190_in_speedUnit2053);  
                            stream_190.add(string_literal253);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:28: 'knots'
                            {
                            string_literal254=(Token)match(input,191,FOLLOW_191_in_speedUnit2055);  
                            stream_191.add(string_literal254);


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
                    // 370:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:371:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit2070);
                    distanceUnit255=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit255.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:371:17: ( '/' | 'per' )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==192) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==193) ) {
                        alt95=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:371:18: '/'
                            {
                            char_literal256=(Token)match(input,192,FOLLOW_192_in_speedUnit2073);  
                            stream_192.add(char_literal256);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:371:22: 'per'
                            {
                            string_literal257=(Token)match(input,193,FOLLOW_193_in_speedUnit2075);  
                            stream_193.add(string_literal257);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit2078);
                    timeUnit258=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit258.getTree());


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
                    // 372:2: -> distanceUnit timeUnit
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:1: optimalSpeed : ( At )? optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At259=null;
        Token string_literal261=null;
        Token string_literal262=null;
        flipsParser.optimalUnit_return optimalUnit260 = null;


        CommonTree At259_tree=null;
        CommonTree string_literal261_tree=null;
        CommonTree string_literal262_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:2: ( ( At )? optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:4: ( At )? optimalUnit ( 'spd' | 'speed' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:4: ( At )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==At) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:4: At
                    {
                    At259=(Token)match(input,At,FOLLOW_At_in_optimalSpeed2096);  
                    stream_At.add(At259);


                    }
                    break;

            }

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed2099);
            optimalUnit260=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit260.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:20: ( 'spd' | 'speed' )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==122) ) {
                alt98=1;
            }
            else if ( (LA98_0==123) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:21: 'spd'
                    {
                    string_literal261=(Token)match(input,122,FOLLOW_122_in_optimalSpeed2102);  
                    stream_122.add(string_literal261);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:27: 'speed'
                    {
                    string_literal262=(Token)match(input,123,FOLLOW_123_in_optimalSpeed2104);  
                    stream_123.add(string_literal262);


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
            // 377:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:5: ^( SPEED OPTIMAL optimalUnit )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal263=null;
        Token string_literal264=null;
        Token string_literal265=null;
        Token string_literal266=null;
        Token string_literal267=null;
        Token string_literal268=null;

        CommonTree string_literal263_tree=null;
        CommonTree string_literal264_tree=null;
        CommonTree string_literal265_tree=null;
        CommonTree string_literal266_tree=null;
        CommonTree string_literal267_tree=null;
        CommonTree string_literal268_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 194:
            case 195:
                {
                alt102=1;
                }
                break;
            case 196:
            case 197:
                {
                alt102=2;
                }
                break;
            case 198:
            case 199:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: ( 'min' | 'minimum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: ( 'min' | 'minimum' )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==194) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==195) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:5: 'min'
                            {
                            string_literal263=(Token)match(input,194,FOLLOW_194_in_optimalUnit2128);  
                            stream_194.add(string_literal263);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:11: 'minimum'
                            {
                            string_literal264=(Token)match(input,195,FOLLOW_195_in_optimalUnit2130);  
                            stream_195.add(string_literal264);


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
                    // 382:2: -> MINIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:383:4: ( 'cru' | 'cruise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:383:4: ( 'cru' | 'cruise' )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==196) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==197) ) {
                        alt100=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:383:5: 'cru'
                            {
                            string_literal265=(Token)match(input,196,FOLLOW_196_in_optimalUnit2142);  
                            stream_196.add(string_literal265);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:383:11: 'cruise'
                            {
                            string_literal266=(Token)match(input,197,FOLLOW_197_in_optimalUnit2144);  
                            stream_197.add(string_literal266);


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
                    // 384:2: -> CRUISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:4: ( 'max' | 'maximum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:4: ( 'max' | 'maximum' )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==198) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==199) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;
                    }
                    switch (alt101) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:5: 'max'
                            {
                            string_literal267=(Token)match(input,198,FOLLOW_198_in_optimalUnit2156);  
                            stream_198.add(string_literal267);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:11: 'maximum'
                            {
                            string_literal268=(Token)match(input,199,FOLLOW_199_in_optimalUnit2158);  
                            stream_199.add(string_literal268);


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
                    // 386:2: -> MAXIMUM
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:389:1: throttleSpeed : ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At269=null;
        Token string_literal271=null;
        Token string_literal272=null;
        Token string_literal273=null;
        Token string_literal274=null;
        flipsParser.throttleValue_return throttleValue270 = null;


        CommonTree At269_tree=null;
        CommonTree string_literal271_tree=null;
        CommonTree string_literal272_tree=null;
        CommonTree string_literal273_tree=null;
        CommonTree string_literal274_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:2: ( ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:4: ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:4: ( At )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==At) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:4: At
                    {
                    At269=(Token)match(input,At,FOLLOW_At_in_throttleSpeed2175);  
                    stream_At.add(At269);


                    }
                    break;

            }

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed2178);
            throttleValue270=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue270.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:22: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt104=4;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt104=1;
                }
                break;
            case 201:
                {
                alt104=2;
                }
                break;
            case 202:
                {
                alt104=3;
                }
                break;
            case 203:
                {
                alt104=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:23: 'pwr'
                    {
                    string_literal271=(Token)match(input,200,FOLLOW_200_in_throttleSpeed2181);  
                    stream_200.add(string_literal271);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:29: 'power'
                    {
                    string_literal272=(Token)match(input,201,FOLLOW_201_in_throttleSpeed2183);  
                    stream_201.add(string_literal272);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:37: 'thr'
                    {
                    string_literal273=(Token)match(input,202,FOLLOW_202_in_throttleSpeed2185);  
                    stream_202.add(string_literal273);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:43: 'throttle'
                    {
                    string_literal274=(Token)match(input,203,FOLLOW_203_in_throttleSpeed2187);  
                    stream_203.add(string_literal274);


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
            // 391:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:5: ^( SPEED THROTTLE throttleValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:394:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue275 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:395:2: ( percentValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:395:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue2210);
            percentValue275=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue275.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:400:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At276=null;
        flipsParser.timeValue_return timeValue277 = null;


        CommonTree At276_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:401:2: ( At timeValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:401:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At276=(Token)match(input,At,FOLLOW_At_in_time2223); 
            At276_tree = (CommonTree)adaptor.create(At276);
            adaptor.addChild(root_0, At276_tree);

            pushFollow(FOLLOW_timeValue_in_time2225);
            timeValue277=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue277.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:404:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal279=null;
        Token string_literal280=null;
        Token string_literal282=null;
        Token string_literal283=null;
        Token string_literal285=null;
        Token string_literal286=null;
        Token string_literal288=null;
        Token string_literal289=null;
        flipsParser.timeFormat_return timeFormat278 = null;

        flipsParser.integerValue_return integerValue281 = null;

        flipsParser.timeFormat_return timeFormat284 = null;

        flipsParser.integerValue_return integerValue287 = null;

        flipsParser.timeFormat_return timeFormat290 = null;


        CommonTree string_literal279_tree=null;
        CommonTree string_literal280_tree=null;
        CommonTree string_literal282_tree=null;
        CommonTree string_literal283_tree=null;
        CommonTree string_literal285_tree=null;
        CommonTree string_literal286_tree=null;
        CommonTree string_literal288_tree=null;
        CommonTree string_literal289_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt109=5;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2236);
                    timeFormat278=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat278.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:15: ( 'am' | 'a.m.' )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==204) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==205) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:16: 'am'
                            {
                            string_literal279=(Token)match(input,204,FOLLOW_204_in_timeValue2239);  
                            stream_204.add(string_literal279);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:21: 'a.m.'
                            {
                            string_literal280=(Token)match(input,205,FOLLOW_205_in_timeValue2241);  
                            stream_205.add(string_literal280);


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
                    // 406:2: -> ^( TIME timeFormat AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:406:5: ^( TIME timeFormat AM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2258);
                    integerValue281=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue281.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:17: ( 'am' | 'a.m.' )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==204) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==205) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:18: 'am'
                            {
                            string_literal282=(Token)match(input,204,FOLLOW_204_in_timeValue2261);  
                            stream_204.add(string_literal282);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:23: 'a.m.'
                            {
                            string_literal283=(Token)match(input,205,FOLLOW_205_in_timeValue2263);  
                            stream_205.add(string_literal283);


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
                    // 408:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:5: ^( TIME integerValue HOUR AM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:409:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2282);
                    timeFormat284=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat284.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:409:15: ( 'pm' | 'p.m.' )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==206) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==207) ) {
                        alt107=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:409:16: 'pm'
                            {
                            string_literal285=(Token)match(input,206,FOLLOW_206_in_timeValue2285);  
                            stream_206.add(string_literal285);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:409:21: 'p.m.'
                            {
                            string_literal286=(Token)match(input,207,FOLLOW_207_in_timeValue2287);  
                            stream_207.add(string_literal286);


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
                    // 410:2: -> ^( TIME timeFormat PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:410:5: ^( TIME timeFormat PM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:411:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2304);
                    integerValue287=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue287.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:411:17: ( 'pm' | 'p.m.' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==206) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==207) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:411:18: 'pm'
                            {
                            string_literal288=(Token)match(input,206,FOLLOW_206_in_timeValue2307);  
                            stream_206.add(string_literal288);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:411:23: 'p.m.'
                            {
                            string_literal289=(Token)match(input,207,FOLLOW_207_in_timeValue2309);  
                            stream_207.add(string_literal289);


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
                    // 412:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:412:5: ^( TIME integerValue HOUR PM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2328);
                    timeFormat290=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat290.getTree());


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
                    // 414:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:414:5: ^( TIME timeFormat HOUR24 )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:417:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal291=null;
        Token char_literal292=null;
        Token char_literal293=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal291_tree=null;
        CommonTree char_literal292_tree=null;
        CommonTree char_literal293_tree=null;
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=BinaryLiteral && LA110_0<=HexLiteral)) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==208) ) {
                    int LA110_2 = input.LA(3);

                    if ( ((LA110_2>=BinaryLiteral && LA110_2<=HexLiteral)) ) {
                        int LA110_3 = input.LA(4);

                        if ( (LA110_3==208) ) {
                            alt110=2;
                        }
                        else if ( (LA110_3==EOF||(LA110_3>=Identifier && LA110_3<=With)||(LA110_3>=Turning && LA110_3<=HexLiteral)||(LA110_3>=109 && LA110_3<=110)||(LA110_3>=113 && LA110_3<=116)||(LA110_3>=126 && LA110_3<=129)||(LA110_3>=132 && LA110_3<=137)||(LA110_3>=139 && LA110_3<=140)||LA110_3==142||(LA110_3>=163 && LA110_3<=164)||(LA110_3>=194 && LA110_3<=199)||(LA110_3>=204 && LA110_3<=207)||LA110_3==217||(LA110_3>=222 && LA110_3<=274)) ) {
                            alt110=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2352);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal291=(Token)match(input,208,FOLLOW_208_in_timeFormat2354);  
                    stream_208.add(char_literal291);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2358);
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
                    // 419:2: -> $hr HOUR $min MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:420:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2378);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal292=(Token)match(input,208,FOLLOW_208_in_timeFormat2380);  
                    stream_208.add(char_literal292);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2384);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal293=(Token)match(input,208,FOLLOW_208_in_timeFormat2386);  
                    stream_208.add(char_literal293);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2390);
                    s=numericValue();

                    state._fsp--;

                    stream_numericValue.add(s.getTree());


                    // AST REWRITE
                    // elements: hr, min, s
                    // token labels: 
                    // rule labels: min, hr, retval, s
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 421:2: -> $hr HOUR $min MINUTE $s SECOND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:1: timeUnit : ( hour | minute | second );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.hour_return hour294 = null;

        flipsParser.minute_return minute295 = null;

        flipsParser.second_return second296 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:9: ( hour | minute | second )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
                {
                alt111=1;
                }
                break;
            case 194:
            case 214:
            case 215:
            case 216:
                {
                alt111=2;
                }
                break;
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
                {
                alt111=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:424:11: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2418);
                    hour294=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour294.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:425:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2423);
                    minute295=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute295.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:426:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2428);
                    second296=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second296.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal297=null;
        Token string_literal298=null;
        Token string_literal299=null;
        Token string_literal300=null;
        Token string_literal301=null;

        CommonTree char_literal297_tree=null;
        CommonTree string_literal298_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree string_literal301_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt112=5;
            switch ( input.LA(1) ) {
            case 209:
                {
                alt112=1;
                }
                break;
            case 210:
                {
                alt112=2;
                }
                break;
            case 211:
                {
                alt112=3;
                }
                break;
            case 212:
                {
                alt112=4;
                }
                break;
            case 213:
                {
                alt112=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:5: 'h'
                    {
                    char_literal297=(Token)match(input,209,FOLLOW_209_in_hour2440);  
                    stream_209.add(char_literal297);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:9: 'hr'
                    {
                    string_literal298=(Token)match(input,210,FOLLOW_210_in_hour2442);  
                    stream_210.add(string_literal298);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:14: 'hrs'
                    {
                    string_literal299=(Token)match(input,211,FOLLOW_211_in_hour2444);  
                    stream_211.add(string_literal299);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:20: 'hour'
                    {
                    string_literal300=(Token)match(input,212,FOLLOW_212_in_hour2446);  
                    stream_212.add(string_literal300);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:27: 'hours'
                    {
                    string_literal301=(Token)match(input,213,FOLLOW_213_in_hour2448);  
                    stream_213.add(string_literal301);


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
            // 431:2: -> HOUR
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal302=null;
        Token string_literal303=null;
        Token string_literal304=null;
        Token string_literal305=null;

        CommonTree string_literal302_tree=null;
        CommonTree string_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        CommonTree string_literal305_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 194:
                {
                alt113=1;
                }
                break;
            case 214:
                {
                alt113=2;
                }
                break;
            case 215:
                {
                alt113=3;
                }
                break;
            case 216:
                {
                alt113=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:5: 'min'
                    {
                    string_literal302=(Token)match(input,194,FOLLOW_194_in_minute2466);  
                    stream_194.add(string_literal302);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:11: 'mins'
                    {
                    string_literal303=(Token)match(input,214,FOLLOW_214_in_minute2468);  
                    stream_214.add(string_literal303);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:18: 'minute'
                    {
                    string_literal304=(Token)match(input,215,FOLLOW_215_in_minute2470);  
                    stream_215.add(string_literal304);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:27: 'minutes'
                    {
                    string_literal305=(Token)match(input,216,FOLLOW_216_in_minute2472);  
                    stream_216.add(string_literal305);


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
            // 436:2: -> MINUTE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token string_literal310=null;

        CommonTree char_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt114=5;
            switch ( input.LA(1) ) {
            case 217:
                {
                alt114=1;
                }
                break;
            case 218:
                {
                alt114=2;
                }
                break;
            case 219:
                {
                alt114=3;
                }
                break;
            case 220:
                {
                alt114=4;
                }
                break;
            case 221:
                {
                alt114=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:5: 's'
                    {
                    char_literal306=(Token)match(input,217,FOLLOW_217_in_second2490);  
                    stream_217.add(char_literal306);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:9: 'sec'
                    {
                    string_literal307=(Token)match(input,218,FOLLOW_218_in_second2492);  
                    stream_218.add(string_literal307);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:15: 'secs'
                    {
                    string_literal308=(Token)match(input,219,FOLLOW_219_in_second2494);  
                    stream_219.add(string_literal308);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:22: 'second'
                    {
                    string_literal309=(Token)match(input,220,FOLLOW_220_in_second2496);  
                    stream_220.add(string_literal309);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:31: 'seconds'
                    {
                    string_literal310=(Token)match(input,221,FOLLOW_221_in_second2498);  
                    stream_221.add(string_literal310);


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
            // 441:2: -> SECOND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:444:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal311=null;
        flipsParser.durationValue_return durationValue312 = null;


        CommonTree string_literal311_tree=null;
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:445:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:445:4: 'for' durationValue
            {
            string_literal311=(Token)match(input,222,FOLLOW_222_in_duration2515);  
            stream_222.add(string_literal311);

            pushFollow(FOLLOW_durationValue_in_duration2517);
            durationValue312=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue312.getTree());


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
            // 446:2: -> ^( DURATION durationValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:5: ^( DURATION durationValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:449:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue313 = null;

        flipsParser.timeUnit_return timeUnit314 = null;

        flipsParser.integerValue_return integerValue315 = null;

        flipsParser.hour_return hour316 = null;

        flipsParser.numericValue_return numericValue317 = null;

        flipsParser.minute_return minute318 = null;

        flipsParser.second_return second319 = null;

        flipsParser.integerValue_return integerValue320 = null;

        flipsParser.hour_return hour321 = null;

        flipsParser.integerValue_return integerValue322 = null;

        flipsParser.minute_return minute323 = null;

        flipsParser.numericValue_return numericValue324 = null;

        flipsParser.second_return second325 = null;

        flipsParser.integerValue_return integerValue326 = null;

        flipsParser.minute_return minute327 = null;

        flipsParser.numericValue_return numericValue328 = null;

        flipsParser.second_return second329 = null;

        flipsParser.timeFormat_return timeFormat330 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:450:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt116=5;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:450:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2537);
                    numericValue313=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue313.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2539);
                    timeUnit314=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit314.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2544);
                    integerValue315=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue315.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2546);
                    hour316=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour316.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2548);
                    numericValue317=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue317.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:35: ( minute | second )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==194||(LA115_0>=214 && LA115_0<=216)) ) {
                        alt115=1;
                    }
                    else if ( ((LA115_0>=217 && LA115_0<=221)) ) {
                        alt115=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2551);
                            minute318=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute318.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2553);
                            second319=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second319.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:452:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2559);
                    integerValue320=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue320.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2561);
                    hour321=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour321.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2563);
                    integerValue322=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue322.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2565);
                    minute323=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute323.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2567);
                    numericValue324=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue324.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2569);
                    second325=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second325.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2574);
                    integerValue326=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue326.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2576);
                    minute327=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute327.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2578);
                    numericValue328=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue328.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2580);
                    second329=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second329.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:454:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2585);
                    timeFormat330=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat330.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:459:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection331 = null;

        flipsParser.relativeDirection_return relativeDirection332 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:460:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt117=2;
            switch ( input.LA(1) ) {
            case 217:
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
                {
                alt117=1;
                }
                break;
            case Turning:
                {
                int LA117_2 = input.LA(2);

                if ( ((LA117_2>=FloatingPointLiteral && LA117_2<=HexLiteral)||LA117_2==217||(LA117_2>=223 && LA117_2<=253)) ) {
                    alt117=1;
                }
                else if ( ((LA117_2>=265 && LA117_2<=270)) ) {
                    alt117=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA117_3 = input.LA(2);

                if ( ((LA117_3>=FloatingPointLiteral && LA117_3<=HexLiteral)||LA117_3==217||(LA117_3>=223 && LA117_3<=253)) ) {
                    alt117=1;
                }
                else if ( ((LA117_3>=265 && LA117_3<=270)) ) {
                    alt117=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:460:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2598);
                    fixedDirection331=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection331.getTree());


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
                    // 461:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:461:5: ^( DIRECTION FIXED fixedDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2614);
                    relativeDirection332=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection332.getTree());


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
                    // 463:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:5: ^( DIRECTION RELATIVE relativeDirection )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:466:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning336=null;
        Token Heading337=null;
        flipsParser.cardinalDirection_return cardinalDirection333 = null;

        flipsParser.ordinalDirection_return ordinalDirection334 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection335 = null;

        flipsParser.cardinalDirection_return cardinalDirection338 = null;

        flipsParser.ordinalDirection_return ordinalDirection339 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection340 = null;

        flipsParser.angularValue_return angularValue341 = null;


        CommonTree Turning336_tree=null;
        CommonTree Heading337_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:467:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 217:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
                {
                alt120=1;
                }
                break;
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
                {
                alt120=2;
                }
                break;
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
                {
                alt120=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt120=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:467:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2636);
                    cardinalDirection333=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection333.getTree());


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
                    // 468:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2646);
                    ordinalDirection334=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection334.getTree());


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
                    // 470:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:471:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2656);
                    subOrdinalDirection335=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection335.getTree());


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
                    // 472:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:4: ( Turning | Heading )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==Turning) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==Heading) ) {
                        alt118=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:5: Turning
                            {
                            Turning336=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2667);  
                            stream_Turning.add(Turning336);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:13: Heading
                            {
                            Heading337=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2669);  
                            stream_Heading.add(Heading337);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt119=4;
                    switch ( input.LA(1) ) {
                    case 217:
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                        {
                        alt119=1;
                        }
                        break;
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                        {
                        alt119=2;
                        }
                        break;
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
                        {
                        alt119=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt119=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 0, input);

                        throw nvae;
                    }

                    switch (alt119) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2673);
                            cardinalDirection338=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection338.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2675);
                            ordinalDirection339=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection339.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2677);
                            subOrdinalDirection340=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection340.getTree());

                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2679);
                            angularValue341=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue341.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: angularValue, cardinalDirection, subOrdinalDirection, ordinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 474:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:63: ( angularValue )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:477:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning342=null;
        Token Heading343=null;
        flipsParser.leftRightDirection_return leftRightDirection344 = null;

        flipsParser.angularValue_return angularValue345 = null;


        CommonTree Turning342_tree=null;
        CommonTree Heading343_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:4: ( Turning | Heading )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:5: Turning
                    {
                    Turning342=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2707);  
                    stream_Turning.add(Turning342);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:478:13: Heading
                    {
                    Heading343=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2709);  
                    stream_Heading.add(Heading343);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2712);
            leftRightDirection344=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection344.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2714);
            angularValue345=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue345.getTree());


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
            // 479:2: -> leftRightDirection angularValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:482:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection346 = null;

        flipsParser.eastWestDirection_return eastWestDirection347 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:2: ( northSouthDirection | eastWestDirection )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==217||(LA122_0>=223 && LA122_0<=225)) ) {
                alt122=1;
            }
            else if ( ((LA122_0>=226 && LA122_0<=229)) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2732);
                    northSouthDirection346=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection346.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:484:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2737);
                    eastWestDirection347=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection347.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal348=null;
        Token string_literal349=null;
        Token char_literal350=null;
        Token string_literal351=null;

        CommonTree char_literal348_tree=null;
        CommonTree string_literal349_tree=null;
        CommonTree char_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=223 && LA125_0<=224)) ) {
                alt125=1;
            }
            else if ( (LA125_0==217||LA125_0==225) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: ( 'n' | 'north' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: ( 'n' | 'north' )
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==223) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==224) ) {
                        alt123=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }
                    switch (alt123) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:5: 'n'
                            {
                            char_literal348=(Token)match(input,223,FOLLOW_223_in_northSouthDirection2749);  
                            stream_223.add(char_literal348);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:9: 'north'
                            {
                            string_literal349=(Token)match(input,224,FOLLOW_224_in_northSouthDirection2751);  
                            stream_224.add(string_literal349);


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
                    // 489:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:4: ( 's' | 'south' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:4: ( 's' | 'south' )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==217) ) {
                        alt124=1;
                    }
                    else if ( (LA124_0==225) ) {
                        alt124=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }
                    switch (alt124) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:5: 's'
                            {
                            char_literal350=(Token)match(input,217,FOLLOW_217_in_northSouthDirection2763);  
                            stream_217.add(char_literal350);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:490:9: 'south'
                            {
                            string_literal351=(Token)match(input,225,FOLLOW_225_in_northSouthDirection2765);  
                            stream_225.add(string_literal351);


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
                    // 491:2: -> SOUTH
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:494:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal352=null;
        Token string_literal353=null;
        Token char_literal354=null;
        Token string_literal355=null;

        CommonTree char_literal352_tree=null;
        CommonTree string_literal353_tree=null;
        CommonTree char_literal354_tree=null;
        CommonTree string_literal355_tree=null;
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=226 && LA128_0<=227)) ) {
                alt128=1;
            }
            else if ( ((LA128_0>=228 && LA128_0<=229)) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'e' | 'east' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'e' | 'east' )
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==226) ) {
                        alt126=1;
                    }
                    else if ( (LA126_0==227) ) {
                        alt126=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }
                    switch (alt126) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:5: 'e'
                            {
                            char_literal352=(Token)match(input,226,FOLLOW_226_in_eastWestDirection2783);  
                            stream_226.add(char_literal352);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:9: 'east'
                            {
                            string_literal353=(Token)match(input,227,FOLLOW_227_in_eastWestDirection2785);  
                            stream_227.add(string_literal353);


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
                    // 496:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:4: ( 'w' | 'west' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:4: ( 'w' | 'west' )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==228) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==229) ) {
                        alt127=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:5: 'w'
                            {
                            char_literal354=(Token)match(input,228,FOLLOW_228_in_eastWestDirection2797);  
                            stream_228.add(char_literal354);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:497:9: 'west'
                            {
                            string_literal355=(Token)match(input,229,FOLLOW_229_in_eastWestDirection2799);  
                            stream_229.add(string_literal355);


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
                    // 498:2: -> WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:501:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal356=null;
        Token string_literal357=null;
        Token string_literal358=null;
        Token string_literal359=null;
        Token string_literal360=null;
        Token string_literal361=null;
        Token string_literal362=null;
        Token string_literal363=null;

        CommonTree string_literal356_tree=null;
        CommonTree string_literal357_tree=null;
        CommonTree string_literal358_tree=null;
        CommonTree string_literal359_tree=null;
        CommonTree string_literal360_tree=null;
        CommonTree string_literal361_tree=null;
        CommonTree string_literal362_tree=null;
        CommonTree string_literal363_tree=null;
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt133=4;
            switch ( input.LA(1) ) {
            case 230:
            case 231:
                {
                alt133=1;
                }
                break;
            case 232:
            case 233:
                {
                alt133=2;
                }
                break;
            case 234:
            case 235:
                {
                alt133=3;
                }
                break;
            case 236:
            case 237:
                {
                alt133=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:4: ( 'ne' | 'northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:4: ( 'ne' | 'northeast' )
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==230) ) {
                        alt129=1;
                    }
                    else if ( (LA129_0==231) ) {
                        alt129=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:5: 'ne'
                            {
                            string_literal356=(Token)match(input,230,FOLLOW_230_in_ordinalDirection2817);  
                            stream_230.add(string_literal356);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:10: 'northeast'
                            {
                            string_literal357=(Token)match(input,231,FOLLOW_231_in_ordinalDirection2819);  
                            stream_231.add(string_literal357);


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
                    // 503:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:4: ( 'se' | 'southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:4: ( 'se' | 'southeast' )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==232) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==233) ) {
                        alt130=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }
                    switch (alt130) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:5: 'se'
                            {
                            string_literal358=(Token)match(input,232,FOLLOW_232_in_ordinalDirection2833);  
                            stream_232.add(string_literal358);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:10: 'southeast'
                            {
                            string_literal359=(Token)match(input,233,FOLLOW_233_in_ordinalDirection2835);  
                            stream_233.add(string_literal359);


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
                    // 505:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:506:4: ( 'sw' | 'southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:506:4: ( 'sw' | 'southwest' )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==234) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==235) ) {
                        alt131=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:506:5: 'sw'
                            {
                            string_literal360=(Token)match(input,234,FOLLOW_234_in_ordinalDirection2849);  
                            stream_234.add(string_literal360);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:506:10: 'southwest'
                            {
                            string_literal361=(Token)match(input,235,FOLLOW_235_in_ordinalDirection2851);  
                            stream_235.add(string_literal361);


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
                    // 507:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:508:4: ( 'nw' | 'northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:508:4: ( 'nw' | 'northwest' )
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==236) ) {
                        alt132=1;
                    }
                    else if ( (LA132_0==237) ) {
                        alt132=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 0, input);

                        throw nvae;
                    }
                    switch (alt132) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:508:5: 'nw'
                            {
                            string_literal362=(Token)match(input,236,FOLLOW_236_in_ordinalDirection2865);  
                            stream_236.add(string_literal362);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:508:10: 'northwest'
                            {
                            string_literal363=(Token)match(input,237,FOLLOW_237_in_ordinalDirection2867);  
                            stream_237.add(string_literal363);


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
                    // 509:2: -> NORTH WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal364=null;
        Token string_literal365=null;
        Token string_literal366=null;
        Token string_literal367=null;
        Token string_literal368=null;
        Token string_literal369=null;
        Token string_literal370=null;
        Token string_literal371=null;
        Token string_literal372=null;
        Token string_literal373=null;
        Token string_literal374=null;
        Token string_literal375=null;
        Token string_literal376=null;
        Token string_literal377=null;
        Token string_literal378=null;
        Token string_literal379=null;

        CommonTree string_literal364_tree=null;
        CommonTree string_literal365_tree=null;
        CommonTree string_literal366_tree=null;
        CommonTree string_literal367_tree=null;
        CommonTree string_literal368_tree=null;
        CommonTree string_literal369_tree=null;
        CommonTree string_literal370_tree=null;
        CommonTree string_literal371_tree=null;
        CommonTree string_literal372_tree=null;
        CommonTree string_literal373_tree=null;
        CommonTree string_literal374_tree=null;
        CommonTree string_literal375_tree=null;
        CommonTree string_literal376_tree=null;
        CommonTree string_literal377_tree=null;
        CommonTree string_literal378_tree=null;
        CommonTree string_literal379_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt142=8;
            switch ( input.LA(1) ) {
            case 238:
            case 239:
                {
                alt142=1;
                }
                break;
            case 240:
            case 241:
                {
                alt142=2;
                }
                break;
            case 242:
            case 243:
                {
                alt142=3;
                }
                break;
            case 244:
            case 245:
                {
                alt142=4;
                }
                break;
            case 246:
            case 247:
                {
                alt142=5;
                }
                break;
            case 248:
            case 249:
                {
                alt142=6;
                }
                break;
            case 250:
            case 251:
                {
                alt142=7;
                }
                break;
            case 252:
            case 253:
                {
                alt142=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:4: ( 'nne' | 'north-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:4: ( 'nne' | 'north-northeast' )
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==238) ) {
                        alt134=1;
                    }
                    else if ( (LA134_0==239) ) {
                        alt134=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 134, 0, input);

                        throw nvae;
                    }
                    switch (alt134) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:5: 'nne'
                            {
                            string_literal364=(Token)match(input,238,FOLLOW_238_in_subOrdinalDirection2887);  
                            stream_238.add(string_literal364);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:11: 'north-northeast'
                            {
                            string_literal365=(Token)match(input,239,FOLLOW_239_in_subOrdinalDirection2889);  
                            stream_239.add(string_literal365);


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
                    // 514:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:515:4: ( 'ene' | 'east-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:515:4: ( 'ene' | 'east-northeast' )
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==240) ) {
                        alt135=1;
                    }
                    else if ( (LA135_0==241) ) {
                        alt135=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:515:5: 'ene'
                            {
                            string_literal366=(Token)match(input,240,FOLLOW_240_in_subOrdinalDirection2905);  
                            stream_240.add(string_literal366);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:515:11: 'east-northeast'
                            {
                            string_literal367=(Token)match(input,241,FOLLOW_241_in_subOrdinalDirection2907);  
                            stream_241.add(string_literal367);


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
                    // 516:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:517:4: ( 'ese' | 'east-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:517:4: ( 'ese' | 'east-southeast' )
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==242) ) {
                        alt136=1;
                    }
                    else if ( (LA136_0==243) ) {
                        alt136=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 136, 0, input);

                        throw nvae;
                    }
                    switch (alt136) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:517:5: 'ese'
                            {
                            string_literal368=(Token)match(input,242,FOLLOW_242_in_subOrdinalDirection2923);  
                            stream_242.add(string_literal368);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:517:11: 'east-southeast'
                            {
                            string_literal369=(Token)match(input,243,FOLLOW_243_in_subOrdinalDirection2925);  
                            stream_243.add(string_literal369);


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
                    // 518:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:4: ( 'sse' | 'south-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:4: ( 'sse' | 'south-southeast' )
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==244) ) {
                        alt137=1;
                    }
                    else if ( (LA137_0==245) ) {
                        alt137=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;
                    }
                    switch (alt137) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:5: 'sse'
                            {
                            string_literal370=(Token)match(input,244,FOLLOW_244_in_subOrdinalDirection2941);  
                            stream_244.add(string_literal370);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:11: 'south-southeast'
                            {
                            string_literal371=(Token)match(input,245,FOLLOW_245_in_subOrdinalDirection2943);  
                            stream_245.add(string_literal371);


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
                    // 520:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:4: ( 'ssw' | 'south-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:4: ( 'ssw' | 'south-southwest' )
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==246) ) {
                        alt138=1;
                    }
                    else if ( (LA138_0==247) ) {
                        alt138=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:5: 'ssw'
                            {
                            string_literal372=(Token)match(input,246,FOLLOW_246_in_subOrdinalDirection2959);  
                            stream_246.add(string_literal372);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:11: 'south-southwest'
                            {
                            string_literal373=(Token)match(input,247,FOLLOW_247_in_subOrdinalDirection2961);  
                            stream_247.add(string_literal373);


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
                    // 522:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:523:4: ( 'wsw' | 'west-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:523:4: ( 'wsw' | 'west-southwest' )
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==248) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==249) ) {
                        alt139=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }
                    switch (alt139) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:523:5: 'wsw'
                            {
                            string_literal374=(Token)match(input,248,FOLLOW_248_in_subOrdinalDirection2977);  
                            stream_248.add(string_literal374);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:523:11: 'west-southwest'
                            {
                            string_literal375=(Token)match(input,249,FOLLOW_249_in_subOrdinalDirection2979);  
                            stream_249.add(string_literal375);


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
                    // 524:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:4: ( 'wnw' | 'west-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:4: ( 'wnw' | 'west-northwest' )
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==250) ) {
                        alt140=1;
                    }
                    else if ( (LA140_0==251) ) {
                        alt140=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;
                    }
                    switch (alt140) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:5: 'wnw'
                            {
                            string_literal376=(Token)match(input,250,FOLLOW_250_in_subOrdinalDirection2995);  
                            stream_250.add(string_literal376);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:11: 'west-northwest'
                            {
                            string_literal377=(Token)match(input,251,FOLLOW_251_in_subOrdinalDirection2997);  
                            stream_251.add(string_literal377);


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
                    // 526:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:4: ( 'nnw' | 'north-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:4: ( 'nnw' | 'north-northwest' )
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==252) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==253) ) {
                        alt141=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }
                    switch (alt141) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:5: 'nnw'
                            {
                            string_literal378=(Token)match(input,252,FOLLOW_252_in_subOrdinalDirection3013);  
                            stream_252.add(string_literal378);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:11: 'north-northwest'
                            {
                            string_literal379=(Token)match(input,253,FOLLOW_253_in_subOrdinalDirection3015);  
                            stream_253.add(string_literal379);


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
                    // 528:2: -> NORTH NORTH WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:531:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning380=null;
        flipsParser.clockDirection_return clockDirection381 = null;


        CommonTree Turning380_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:4: ( Turning )? clockDirection
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:4: ( Turning )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==Turning) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:4: Turning
                    {
                    Turning380=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection3036);  
                    stream_Turning.add(Turning380);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection3039);
            clockDirection381=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection381.getTree());


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
            // 533:2: -> ^( DIRECTION TURN clockDirection )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:533:5: ^( DIRECTION TURN clockDirection )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal382=null;
        Token string_literal383=null;
        Token char_literal384=null;
        Token string_literal385=null;
        Token string_literal386=null;
        Token string_literal387=null;
        Token string_literal388=null;
        Token char_literal389=null;
        Token string_literal390=null;
        Token string_literal391=null;
        Token string_literal392=null;

        CommonTree char_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        CommonTree char_literal384_tree=null;
        CommonTree string_literal385_tree=null;
        CommonTree string_literal386_tree=null;
        CommonTree string_literal387_tree=null;
        CommonTree string_literal388_tree=null;
        CommonTree char_literal389_tree=null;
        CommonTree string_literal390_tree=null;
        CommonTree string_literal391_tree=null;
        CommonTree string_literal392_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=254 && LA146_0<=260)) ) {
                alt146=1;
            }
            else if ( ((LA146_0>=261 && LA146_0<=264)) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt144=7;
                    switch ( input.LA(1) ) {
                    case 254:
                        {
                        alt144=1;
                        }
                        break;
                    case 255:
                        {
                        alt144=2;
                        }
                        break;
                    case 256:
                        {
                        alt144=3;
                        }
                        break;
                    case 257:
                        {
                        alt144=4;
                        }
                        break;
                    case 258:
                        {
                        alt144=5;
                        }
                        break;
                    case 259:
                        {
                        alt144=6;
                        }
                        break;
                    case 260:
                        {
                        alt144=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 0, input);

                        throw nvae;
                    }

                    switch (alt144) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:5: 'u'
                            {
                            char_literal382=(Token)match(input,254,FOLLOW_254_in_upDownDirection3062);  
                            stream_254.add(char_literal382);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:9: 'up'
                            {
                            string_literal383=(Token)match(input,255,FOLLOW_255_in_upDownDirection3064);  
                            stream_255.add(string_literal383);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:14: 'c'
                            {
                            char_literal384=(Token)match(input,256,FOLLOW_256_in_upDownDirection3066);  
                            stream_256.add(char_literal384);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:18: 'climb'
                            {
                            string_literal385=(Token)match(input,257,FOLLOW_257_in_upDownDirection3068);  
                            stream_257.add(string_literal385);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:26: 'climbing'
                            {
                            string_literal386=(Token)match(input,258,FOLLOW_258_in_upDownDirection3070);  
                            stream_258.add(string_literal386);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:37: 'ascend'
                            {
                            string_literal387=(Token)match(input,259,FOLLOW_259_in_upDownDirection3072);  
                            stream_259.add(string_literal387);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:46: 'ascending'
                            {
                            string_literal388=(Token)match(input,260,FOLLOW_260_in_upDownDirection3074);  
                            stream_260.add(string_literal388);


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
                    // 538:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt145=4;
                    switch ( input.LA(1) ) {
                    case 261:
                        {
                        alt145=1;
                        }
                        break;
                    case 262:
                        {
                        alt145=2;
                        }
                        break;
                    case 263:
                        {
                        alt145=3;
                        }
                        break;
                    case 264:
                        {
                        alt145=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 0, input);

                        throw nvae;
                    }

                    switch (alt145) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:5: 'd'
                            {
                            char_literal389=(Token)match(input,261,FOLLOW_261_in_upDownDirection3086);  
                            stream_261.add(char_literal389);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:9: 'down'
                            {
                            string_literal390=(Token)match(input,262,FOLLOW_262_in_upDownDirection3088);  
                            stream_262.add(string_literal390);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:16: 'descend'
                            {
                            string_literal391=(Token)match(input,263,FOLLOW_263_in_upDownDirection3090);  
                            stream_263.add(string_literal391);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:26: 'descending'
                            {
                            string_literal392=(Token)match(input,264,FOLLOW_264_in_upDownDirection3092);  
                            stream_264.add(string_literal392);


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
                    // 540:2: -> DESCEND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal393=null;
        Token string_literal394=null;
        Token string_literal395=null;
        Token char_literal396=null;
        Token string_literal397=null;
        Token string_literal398=null;

        CommonTree char_literal393_tree=null;
        CommonTree string_literal394_tree=null;
        CommonTree string_literal395_tree=null;
        CommonTree char_literal396_tree=null;
        CommonTree string_literal397_tree=null;
        CommonTree string_literal398_tree=null;
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=265 && LA149_0<=267)) ) {
                alt149=1;
            }
            else if ( ((LA149_0>=268 && LA149_0<=270)) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:4: ( 'l' | 'left' | 'port' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:4: ( 'l' | 'left' | 'port' )
                    int alt147=3;
                    switch ( input.LA(1) ) {
                    case 265:
                        {
                        alt147=1;
                        }
                        break;
                    case 266:
                        {
                        alt147=2;
                        }
                        break;
                    case 267:
                        {
                        alt147=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 147, 0, input);

                        throw nvae;
                    }

                    switch (alt147) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:5: 'l'
                            {
                            char_literal393=(Token)match(input,265,FOLLOW_265_in_leftRightDirection3110);  
                            stream_265.add(char_literal393);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:9: 'left'
                            {
                            string_literal394=(Token)match(input,266,FOLLOW_266_in_leftRightDirection3112);  
                            stream_266.add(string_literal394);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:16: 'port'
                            {
                            string_literal395=(Token)match(input,267,FOLLOW_267_in_leftRightDirection3114);  
                            stream_267.add(string_literal395);


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
                    // 545:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:4: ( 'r' | 'right' | 'starboard' )
                    int alt148=3;
                    switch ( input.LA(1) ) {
                    case 268:
                        {
                        alt148=1;
                        }
                        break;
                    case 269:
                        {
                        alt148=2;
                        }
                        break;
                    case 270:
                        {
                        alt148=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;
                    }

                    switch (alt148) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:5: 'r'
                            {
                            char_literal396=(Token)match(input,268,FOLLOW_268_in_leftRightDirection3126);  
                            stream_268.add(char_literal396);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:9: 'right'
                            {
                            string_literal397=(Token)match(input,269,FOLLOW_269_in_leftRightDirection3128);  
                            stream_269.add(string_literal397);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:17: 'starboard'
                            {
                            string_literal398=(Token)match(input,270,FOLLOW_270_in_leftRightDirection3130);  
                            stream_270.add(string_literal398);


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
                    // 547:2: -> RIGHT
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal399=null;
        Token string_literal400=null;
        Token string_literal401=null;
        Token string_literal402=null;

        CommonTree string_literal399_tree=null;
        CommonTree string_literal400_tree=null;
        CommonTree string_literal401_tree=null;
        CommonTree string_literal402_tree=null;
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleTokenStream stream_274=new RewriteRuleTokenStream(adaptor,"token 274");
        RewriteRuleTokenStream stream_273=new RewriteRuleTokenStream(adaptor,"token 273");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=271 && LA152_0<=272)) ) {
                alt152=1;
            }
            else if ( ((LA152_0>=273 && LA152_0<=274)) ) {
                alt152=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: ( 'cw' | 'clockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: ( 'cw' | 'clockwise' )
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==271) ) {
                        alt150=1;
                    }
                    else if ( (LA150_0==272) ) {
                        alt150=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 150, 0, input);

                        throw nvae;
                    }
                    switch (alt150) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:5: 'cw'
                            {
                            string_literal399=(Token)match(input,271,FOLLOW_271_in_clockDirection3148);  
                            stream_271.add(string_literal399);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:10: 'clockwise'
                            {
                            string_literal400=(Token)match(input,272,FOLLOW_272_in_clockDirection3150);  
                            stream_272.add(string_literal400);


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
                    // 552:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:4: ( 'ccw' | 'counterclockwise' )
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==273) ) {
                        alt151=1;
                    }
                    else if ( (LA151_0==274) ) {
                        alt151=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 151, 0, input);

                        throw nvae;
                    }
                    switch (alt151) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:5: 'ccw'
                            {
                            string_literal401=(Token)match(input,273,FOLLOW_273_in_clockDirection3162);  
                            stream_273.add(string_literal401);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:11: 'counterclockwise'
                            {
                            string_literal402=(Token)match(input,274,FOLLOW_274_in_clockDirection3164);  
                            stream_274.add(string_literal402);


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
                    // 554:2: -> COUNTERCLOCKWISE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal404=null;
        Token string_literal405=null;
        Token string_literal406=null;
        Token string_literal407=null;
        Token char_literal409=null;
        Token char_literal411=null;
        Token string_literal413=null;
        Token string_literal414=null;
        Token string_literal415=null;
        Token string_literal416=null;
        flipsParser.numericValue_return numericValue403 = null;

        flipsParser.integerValue_return integerValue408 = null;

        flipsParser.numericValue_return numericValue410 = null;

        flipsParser.numericValue_return numericValue412 = null;


        CommonTree string_literal404_tree=null;
        CommonTree string_literal405_tree=null;
        CommonTree string_literal406_tree=null;
        CommonTree string_literal407_tree=null;
        CommonTree char_literal409_tree=null;
        CommonTree char_literal411_tree=null;
        CommonTree string_literal413_tree=null;
        CommonTree string_literal414_tree=null;
        CommonTree string_literal415_tree=null;
        CommonTree string_literal416_tree=null;
        RewriteRuleTokenStream stream_275=new RewriteRuleTokenStream(adaptor,"token 275");
        RewriteRuleTokenStream stream_276=new RewriteRuleTokenStream(adaptor,"token 276");
        RewriteRuleTokenStream stream_277=new RewriteRuleTokenStream(adaptor,"token 277");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_278=new RewriteRuleTokenStream(adaptor,"token 278");
        RewriteRuleTokenStream stream_279=new RewriteRuleTokenStream(adaptor,"token 279");
        RewriteRuleTokenStream stream_281=new RewriteRuleTokenStream(adaptor,"token 281");
        RewriteRuleTokenStream stream_280=new RewriteRuleTokenStream(adaptor,"token 280");
        RewriteRuleTokenStream stream_283=new RewriteRuleTokenStream(adaptor,"token 283");
        RewriteRuleTokenStream stream_282=new RewriteRuleTokenStream(adaptor,"token 282");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt155=3;
            int LA155_0 = input.LA(1);

            if ( ((LA155_0>=BinaryLiteral && LA155_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 261:
                    {
                    alt155=2;
                    }
                    break;
                case 275:
                case 276:
                case 277:
                case 278:
                    {
                    alt155=1;
                    }
                    break;
                case 280:
                case 281:
                case 282:
                case 283:
                    {
                    alt155=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 155, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA155_0==FloatingPointLiteral) ) {
                int LA155_2 = input.LA(2);

                if ( ((LA155_2>=275 && LA155_2<=278)) ) {
                    alt155=1;
                }
                else if ( ((LA155_2>=280 && LA155_2<=283)) ) {
                    alt155=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 155, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3181);
                    numericValue403=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue403.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt153=4;
                    switch ( input.LA(1) ) {
                    case 275:
                        {
                        alt153=1;
                        }
                        break;
                    case 276:
                        {
                        alt153=2;
                        }
                        break;
                    case 277:
                        {
                        alt153=3;
                        }
                        break;
                    case 278:
                        {
                        alt153=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 153, 0, input);

                        throw nvae;
                    }

                    switch (alt153) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:18: 'deg'
                            {
                            string_literal404=(Token)match(input,275,FOLLOW_275_in_angularValue3184);  
                            stream_275.add(string_literal404);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:24: 'degs'
                            {
                            string_literal405=(Token)match(input,276,FOLLOW_276_in_angularValue3186);  
                            stream_276.add(string_literal405);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:31: 'degree'
                            {
                            string_literal406=(Token)match(input,277,FOLLOW_277_in_angularValue3188);  
                            stream_277.add(string_literal406);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:40: 'degrees'
                            {
                            string_literal407=(Token)match(input,278,FOLLOW_278_in_angularValue3190);  
                            stream_278.add(string_literal407);


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
                    // 559:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:560:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue3203);
                    integerValue408=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue408.getTree());
                    char_literal409=(Token)match(input,261,FOLLOW_261_in_angularValue3205);  
                    stream_261.add(char_literal409);

                    pushFollow(FOLLOW_numericValue_in_angularValue3207);
                    numericValue410=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue410.getTree());
                    char_literal411=(Token)match(input,279,FOLLOW_279_in_angularValue3209);  
                    stream_279.add(char_literal411);



                    // AST REWRITE
                    // elements: numericValue, integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 561:2: -> integerValue DEGREE numericValue MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3225);
                    numericValue412=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue412.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt154=4;
                    switch ( input.LA(1) ) {
                    case 280:
                        {
                        alt154=1;
                        }
                        break;
                    case 281:
                        {
                        alt154=2;
                        }
                        break;
                    case 282:
                        {
                        alt154=3;
                        }
                        break;
                    case 283:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:18: 'rad'
                            {
                            string_literal413=(Token)match(input,280,FOLLOW_280_in_angularValue3228);  
                            stream_280.add(string_literal413);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:24: 'rads'
                            {
                            string_literal414=(Token)match(input,281,FOLLOW_281_in_angularValue3230);  
                            stream_281.add(string_literal414);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:31: 'radian'
                            {
                            string_literal415=(Token)match(input,282,FOLLOW_282_in_angularValue3232);  
                            stream_282.add(string_literal415);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:40: 'radians'
                            {
                            string_literal416=(Token)match(input,283,FOLLOW_283_in_angularValue3234);  
                            stream_283.add(string_literal416);


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
                    // 563:2: -> numericValue RADIAN
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:568:1: waypoint : ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier418=null;
        flipsParser.geoCoordinate_return geoCoordinate417 = null;


        CommonTree Identifier418_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:2: ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( ((LA156_0>=FloatingPointLiteral && LA156_0<=HexLiteral)||LA156_0==101||(LA156_0>=284 && LA156_0<=285)) ) {
                alt156=1;
            }
            else if ( (LA156_0==Identifier) ) {
                alt156=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:4: geoCoordinate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_geoCoordinate_in_waypoint3255);
                    geoCoordinate417=geoCoordinate();

                    state._fsp--;

                    adaptor.addChild(root_0, geoCoordinate417.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:4: Identifier
                    {
                    Identifier418=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint3260);  
                    stream_Identifier.add(Identifier418);



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
                    // 571:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:571:5: ^( WAYPOINT Identifier )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:574:1: geoCoordinate : ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) );
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude419 = null;

        flipsParser.distanceCoordinate_return distanceCoordinate420 = null;


        RewriteRuleSubtreeStream stream_distanceCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule distanceCoordinate");
        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:575:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( ((LA157_0>=FloatingPointLiteral && LA157_0<=HexLiteral)||(LA157_0>=284 && LA157_0<=285)) ) {
                alt157=1;
            }
            else if ( (LA157_0==101) ) {
                alt157=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:575:4: latitudeLongitude
                    {
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate3280);
                    latitudeLongitude419=latitudeLongitude();

                    state._fsp--;

                    stream_latitudeLongitude.add(latitudeLongitude419.getTree());


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
                    // 576:2: -> ^( GEOCOORDINATE latitudeLongitude )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:576:5: ^( GEOCOORDINATE latitudeLongitude )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:577:4: distanceCoordinate
                    {
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate3294);
                    distanceCoordinate420=distanceCoordinate();

                    state._fsp--;

                    stream_distanceCoordinate.add(distanceCoordinate420.getTree());


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
                    // 578:2: -> ^( GEOCOORDINATE distanceCoordinate )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:578:5: ^( GEOCOORDINATE distanceCoordinate )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:581:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal422=null;
        Token char_literal424=null;
        Token char_literal425=null;
        Token char_literal426=null;
        Token char_literal427=null;
        Token char_literal428=null;
        Token char_literal429=null;
        Token char_literal430=null;
        Token char_literal431=null;
        Token char_literal432=null;
        Token char_literal433=null;
        Token char_literal434=null;
        Token char_literal435=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection421 = null;

        flipsParser.eastWestDirection_return eastWestDirection423 = null;


        CommonTree char_literal422_tree=null;
        CommonTree char_literal424_tree=null;
        CommonTree char_literal425_tree=null;
        CommonTree char_literal426_tree=null;
        CommonTree char_literal427_tree=null;
        CommonTree char_literal428_tree=null;
        CommonTree char_literal429_tree=null;
        CommonTree char_literal430_tree=null;
        CommonTree char_literal431_tree=null;
        CommonTree char_literal432_tree=null;
        CommonTree char_literal433_tree=null;
        CommonTree char_literal434_tree=null;
        CommonTree char_literal435_tree=null;
        RewriteRuleTokenStream stream_285=new RewriteRuleTokenStream(adaptor,"token 285");
        RewriteRuleTokenStream stream_284=new RewriteRuleTokenStream(adaptor,"token 284");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt167=5;
            alt167 = dfa167.predict(input);
            switch (alt167) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3316);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3318);
                    northSouthDirection421=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection421.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:49: ( ',' )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==100) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:49: ','
                            {
                            char_literal422=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3320);  
                            stream_100.add(char_literal422);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3325);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3327);
                    eastWestDirection423=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection423.getTree());


                    // AST REWRITE
                    // elements: northSouthDirection, y, x, eastWestDirection
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
                    // 583:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:583:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:583:40: ^( LONGITUDE $y eastWestDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:4: ( '+' )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==284) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:4: '+'
                            {
                            char_literal424=(Token)match(input,284,FOLLOW_284_in_latitudeLongitude3353);  
                            stream_284.add(char_literal424);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3358);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:34: ( ',' )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==100) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:34: ','
                            {
                            char_literal425=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3360);  
                            stream_100.add(char_literal425);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:39: ( '+' )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==284) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:584:39: '+'
                            {
                            char_literal426=(Token)match(input,284,FOLLOW_284_in_latitudeLongitude3363);  
                            stream_284.add(char_literal426);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3368);
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
                    // 585:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:585:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:585:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:586:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal427=(Token)match(input,285,FOLLOW_285_in_latitudeLongitude3394);  
                    stream_285.add(char_literal427);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3398);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:586:33: ( ',' )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==100) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:586:33: ','
                            {
                            char_literal428=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3400);  
                            stream_100.add(char_literal428);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:586:38: ( '+' )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==284) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:586:38: '+'
                            {
                            char_literal429=(Token)match(input,284,FOLLOW_284_in_latitudeLongitude3403);  
                            stream_284.add(char_literal429);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3408);
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
                    // 587:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:587:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:587:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:588:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:588:4: ( '+' )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==284) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:588:4: '+'
                            {
                            char_literal430=(Token)match(input,284,FOLLOW_284_in_latitudeLongitude3434);  
                            stream_284.add(char_literal430);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3439);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:588:34: ( ',' )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==100) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:588:34: ','
                            {
                            char_literal431=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3441);  
                            stream_100.add(char_literal431);


                            }
                            break;

                    }

                    char_literal432=(Token)match(input,285,FOLLOW_285_in_latitudeLongitude3444);  
                    stream_285.add(char_literal432);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3448);
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
                    // 589:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:589:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:589:26: ^( LONGITUDE $y WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:590:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal433=(Token)match(input,285,FOLLOW_285_in_latitudeLongitude3474);  
                    stream_285.add(char_literal433);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3478);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:590:33: ( ',' )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==100) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:590:33: ','
                            {
                            char_literal434=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3480);  
                            stream_100.add(char_literal434);


                            }
                            break;

                    }

                    char_literal435=(Token)match(input,285,FOLLOW_285_in_latitudeLongitude3483);  
                    stream_285.add(char_literal435);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3487);
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
                    // 591:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:591:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:591:26: ^( LONGITUDE $y WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:594:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue436 = null;

        flipsParser.angularValue_return angularValue437 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:595:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( ((LA168_0>=BinaryLiteral && LA168_0<=HexLiteral)) ) {
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
                case 95:
                case 96:
                case 97:
                case 99:
                case 100:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 113:
                case 114:
                case 115:
                case 116:
                case 126:
                case 127:
                case 128:
                case 129:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 139:
                case 140:
                case 142:
                case 163:
                case 164:
                case 194:
                case 195:
                case 196:
                case 197:
                case 198:
                case 199:
                case 217:
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
                case 258:
                case 259:
                case 260:
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
                case 284:
                case 285:
                    {
                    alt168=1;
                    }
                    break;
                case 261:
                    {
                    switch ( input.LA(3) ) {
                    case To:
                    case FlightLevel:
                        {
                        alt168=1;
                        }
                        break;
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA168_6 = input.LA(4);

                        if ( ((LA168_6>=145 && LA168_6<=162)||(LA168_6>=165 && LA168_6<=182)) ) {
                            alt168=1;
                        }
                        else if ( (LA168_6==279) ) {
                            alt168=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 168, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA168_7 = input.LA(4);

                        if ( ((LA168_7>=145 && LA168_7<=162)||(LA168_7>=165 && LA168_7<=182)) ) {
                            alt168=1;
                        }
                        else if ( (LA168_7==279) ) {
                            alt168=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 168, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 168, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 275:
                case 276:
                case 277:
                case 278:
                case 280:
                case 281:
                case 282:
                case 283:
                    {
                    alt168=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 168, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA168_0==FloatingPointLiteral) ) {
                int LA168_2 = input.LA(2);

                if ( ((LA168_2>=275 && LA168_2<=278)||(LA168_2>=280 && LA168_2<=283)) ) {
                    alt168=2;
                }
                else if ( (LA168_2==EOF||(LA168_2>=Identifier && LA168_2<=With)||(LA168_2>=Turning && LA168_2<=HexLiteral)||(LA168_2>=95 && LA168_2<=97)||(LA168_2>=99 && LA168_2<=100)||(LA168_2>=103 && LA168_2<=110)||(LA168_2>=113 && LA168_2<=116)||(LA168_2>=126 && LA168_2<=129)||(LA168_2>=132 && LA168_2<=137)||(LA168_2>=139 && LA168_2<=140)||LA168_2==142||(LA168_2>=163 && LA168_2<=164)||(LA168_2>=194 && LA168_2<=199)||LA168_2==217||(LA168_2>=222 && LA168_2<=274)||(LA168_2>=284 && LA168_2<=285)) ) {
                    alt168=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 168, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;
            }
            switch (alt168) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:595:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3519);
                    numericValue436=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue436.getTree());


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
                    // 596:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:597:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3531);
                    angularValue437=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue437.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:600:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );
    public final flipsParser.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsParser.distanceCoordinate_return retval = new flipsParser.distanceCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal438=null;
        Token char_literal439=null;
        Token char_literal440=null;
        Token char_literal441=null;
        Token char_literal442=null;
        Token char_literal443=null;
        Token char_literal444=null;
        Token char_literal445=null;
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
        flipsParser.distanceValue_return x = null;

        flipsParser.distanceValue_return y = null;


        CommonTree char_literal438_tree=null;
        CommonTree char_literal439_tree=null;
        CommonTree char_literal440_tree=null;
        CommonTree char_literal441_tree=null;
        CommonTree char_literal442_tree=null;
        CommonTree char_literal443_tree=null;
        CommonTree char_literal444_tree=null;
        CommonTree char_literal445_tree=null;
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
        RewriteRuleTokenStream stream_285=new RewriteRuleTokenStream(adaptor,"token 285");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_284=new RewriteRuleTokenStream(adaptor,"token 284");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:601:2: ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) )
            int alt173=4;
            alt173 = dfa173.predict(input);
            switch (alt173) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:601:4: '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal438=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3542);  
                    stream_101.add(char_literal438);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:601:8: ( '+' )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==284) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:601:8: '+'
                            {
                            char_literal439=(Token)match(input,284,FOLLOW_284_in_distanceCoordinate3544);  
                            stream_284.add(char_literal439);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3549);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal440=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3551);  
                    stream_100.add(char_literal440);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:601:33: ( '+' )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==284) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:601:33: '+'
                            {
                            char_literal441=(Token)match(input,284,FOLLOW_284_in_distanceCoordinate3553);  
                            stream_284.add(char_literal441);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3558);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal442=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3560);  
                    stream_102.add(char_literal442);



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
                    // 602:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:602:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:602:26: ^( DISTANCE $x EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:603:4: '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal443=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3586);  
                    stream_101.add(char_literal443);

                    char_literal444=(Token)match(input,285,FOLLOW_285_in_distanceCoordinate3588);  
                    stream_285.add(char_literal444);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3592);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal445=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3594);  
                    stream_100.add(char_literal445);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:603:32: ( '+' )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==284) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:603:32: '+'
                            {
                            char_literal446=(Token)match(input,284,FOLLOW_284_in_distanceCoordinate3596);  
                            stream_284.add(char_literal446);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3601);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal447=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3603);  
                    stream_102.add(char_literal447);



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
                    // 604:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:604:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:604:26: ^( DISTANCE $x WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:605:4: '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal448=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3629);  
                    stream_101.add(char_literal448);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:605:8: ( '+' )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==284) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:605:8: '+'
                            {
                            char_literal449=(Token)match(input,284,FOLLOW_284_in_distanceCoordinate3631);  
                            stream_284.add(char_literal449);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3636);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal450=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3638);  
                    stream_100.add(char_literal450);

                    char_literal451=(Token)match(input,285,FOLLOW_285_in_distanceCoordinate3640);  
                    stream_285.add(char_literal451);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3644);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal452=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3646);  
                    stream_102.add(char_literal452);



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
                    // 606:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:606:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:606:26: ^( DISTANCE $x EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:607:4: '(' '-' x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal453=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3672);  
                    stream_101.add(char_literal453);

                    char_literal454=(Token)match(input,285,FOLLOW_285_in_distanceCoordinate3674);  
                    stream_285.add(char_literal454);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3678);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal455=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3680);  
                    stream_100.add(char_literal455);

                    char_literal456=(Token)match(input,285,FOLLOW_285_in_distanceCoordinate3682);  
                    stream_285.add(char_literal456);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3686);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal457=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3688);  
                    stream_102.add(char_literal457);



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
                    // 608:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:608:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:608:26: ^( DISTANCE $x WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:613:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral459=null;
        flipsParser.integerValue_return integerValue458 = null;


        CommonTree FloatingPointLiteral459_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:614:2: ( integerValue | FloatingPointLiteral )
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( ((LA174_0>=BinaryLiteral && LA174_0<=HexLiteral)) ) {
                alt174=1;
            }
            else if ( (LA174_0==FloatingPointLiteral) ) {
                alt174=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }
            switch (alt174) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:614:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3722);
                    integerValue458=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue458.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:615:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral459=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3727); 
                    FloatingPointLiteral459_tree = (CommonTree)adaptor.create(FloatingPointLiteral459);
                    adaptor.addChild(root_0, FloatingPointLiteral459_tree);


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:618:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set460=null;

        CommonTree set460_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:619:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set460=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set460));
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:625:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal462=null;
        Token string_literal463=null;
        flipsParser.numericValue_return numericValue461 = null;


        CommonTree char_literal462_tree=null;
        CommonTree string_literal463_tree=null;
        RewriteRuleTokenStream stream_286=new RewriteRuleTokenStream(adaptor,"token 286");
        RewriteRuleTokenStream stream_287=new RewriteRuleTokenStream(adaptor,"token 287");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:626:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:626:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3764);
            numericValue461=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue461.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:626:17: ( '%' | 'percent' )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==286) ) {
                alt175=1;
            }
            else if ( (LA175_0==287) ) {
                alt175=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:626:18: '%'
                    {
                    char_literal462=(Token)match(input,286,FOLLOW_286_in_percentValue3767);  
                    stream_286.add(char_literal462);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:626:22: 'percent'
                    {
                    string_literal463=(Token)match(input,287,FOLLOW_287_in_percentValue3769);  
                    stream_287.add(string_literal463);


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
            // 627:2: -> numericValue PERCENT
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA167 dfa167 = new DFA167(this);
    protected DFA173 dfa173 = new DFA173(this);
    static final String DFA38_eotS =
        "\44\uffff";
    static final String DFA38_eofS =
        "\13\uffff\1\12\1\uffff\7\14\2\uffff\11\14\1\uffff\1\37\3\14";
    static final String DFA38_minS =
        "\1\112\1\152\1\uffff\1\121\2\uffff\1\121\4\uffff\1\112\1\uffff\7"+
        "\112\2\u00ad\11\112\1\uffff\4\112";
    static final String DFA38_maxS =
        "\1\u011d\1\u0083\1\uffff\1\u011d\2\uffff\1\u011d\4\uffff\1\u0089"+
        "\1\uffff\7\u00c1\2\u00af\11\u00c1\1\uffff\1\u0089\3\u00c1";
    static final String DFA38_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10"+
        "\22\uffff\1\11\4\uffff";
    static final String DFA38_specialS =
        "\44\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\13\3\uffff\1\14\2\4\1\6\4\3\17\uffff\1\12\4\uffff\2\12\3"+
            "\uffff\1\2\5\uffff\1\1\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11\2\14"+
            "\125\uffff\1\4\5\uffff\37\4\36\uffff\2\12",
            "\2\12\3\uffff\1\2\6\uffff\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11"+
            "\2\14",
            "",
            "\5\12\16\uffff\1\12\54\uffff\22\14\2\uffff\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25\1\31\1\32\1\33\1"+
            "\34\1\35\1\36\2\uffff\7\5\14\uffff\5\2\10\uffff\1\12\5\uffff"+
            "\3\12\43\uffff\1\12\15\uffff\4\12\1\uffff\6\12",
            "",
            "",
            "\5\12\16\uffff\1\12\54\uffff\22\14\2\uffff\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25\1\31\1\32\1\33\1"+
            "\34\1\35\1\36\2\uffff\7\5\31\uffff\1\12\5\uffff\3\12\61\uffff"+
            "\4\12\1\uffff\6\12",
            "",
            "",
            "",
            "",
            "\1\12\6\uffff\1\37\4\40\14\uffff\1\37\12\uffff\2\12\2\uffff"+
            "\4\12\2\uffff\1\37\14\uffff\6\12",
            "",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\41\1\42\1\43",
            "\1\26\1\27\1\30",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "",
            "\1\37\7\uffff\4\37\27\uffff\2\37\2\12\4\37\17\uffff\6\37",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\66\uffff\2\5"
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
            return "174:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );";
        }
    }
    static final String DFA45_eotS =
        "\76\uffff";
    static final String DFA45_eofS =
        "\17\uffff\7\6\2\uffff\11\6\5\uffff\7\14\2\uffff\11\14\3\6\3\14";
    static final String DFA45_minS =
        "\1\113\1\116\1\uffff\2\u00a5\3\uffff\1\116\2\uffff\1\112\1\uffff"+
        "\2\u0091\7\112\2\u00ad\11\112\1\u0082\2\121\2\uffff\7\112\2\u00ad"+
        "\17\112";
    static final String DFA45_maxS =
        "\1\u010e\1\u00c7\1\uffff\2\u011f\3\uffff\1\u0090\2\uffff\1\u011d"+
        "\1\uffff\2\u011f\7\u010e\2\u00af\11\u010e\1\u008c\2\u011d\2\uffff"+
        "\7\u010e\2\u00af\17\u010e";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\27"+
        "\uffff\1\10\1\1\30\uffff";
    static final String DFA45_specialS =
        "\76\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\13\1\1\1\10\1\uffff\2\2\1\4\4\3\50\uffff\2\7\2\11\11\uffff"+
            "\2\7\65\uffff\6\5\21\uffff\1\2\4\uffff\1\12\37\2\13\14\6\6",
            "\1\14\2\uffff\1\16\4\15\54\uffff\2\14\6\uffff\1\14\3\uffff"+
            "\3\14\61\uffff\6\5",
            "",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\5\136\uffff\2\5",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\5\136\uffff\2\5",
            "",
            "",
            "",
            "\1\14\2\uffff\5\14\54\uffff\2\14\6\uffff\1\41\3\uffff\3\14",
            "",
            "",
            "\1\44\3\uffff\1\14\2\uffff\1\43\4\42\17\uffff\1\44\34\uffff"+
            "\2\14\6\uffff\1\14\3\uffff\3\14\u008b\uffff\2\44",
            "",
            "\22\14\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\57"+
            "\1\60\1\61\1\56\1\62\1\63\1\64\1\65\1\66\1\67\2\uffff\7\5\14"+
            "\uffff\5\45\115\uffff\2\5",
            "\22\14\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\57"+
            "\1\60\1\61\1\56\1\62\1\63\1\64\1\65\1\66\1\67\2\uffff\7\5\136"+
            "\uffff\2\5",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\1\70\1\71\1\72",
            "\1\30\1\31\1\32",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\2\14\7\uffff\2\7",
            "\5\44\16\uffff\1\44\54\uffff\22\14\2\uffff\22\14\42\uffff\1"+
            "\44\5\uffff\3\44\43\uffff\1\44\15\uffff\4\44\1\uffff\6\44",
            "\5\44\16\uffff\1\44\54\uffff\22\14\2\uffff\22\14\42\uffff\1"+
            "\44\5\uffff\3\44\61\uffff\4\44\1\uffff\6\44",
            "",
            "",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\1\73\1\74\1\75",
            "\1\57\1\60\1\61",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\63\uffff\2\5\6\6\21\uffff\1\6\4\uffff\61\6",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\63\uffff\2\5\6\14\21\uffff\1\14\4"+
            "\uffff\61\14"
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
            return "200:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA50_eotS =
        "\151\uffff";
    static final String DFA50_eofS =
        "\43\uffff\7\11\2\uffff\11\11\3\uffff\7\11\2\uffff\14\11\1\6\3\11"+
        "\2\uffff\7\11\2\uffff\11\11\1\6\3\11";
    static final String DFA50_minS =
        "\1\113\1\112\2\u00a5\3\uffff\1\116\2\uffff\2\121\1\uffff\7\u00a4"+
        "\2\u00ad\11\u00a4\1\121\2\u0091\1\uffff\7\112\2\u00ad\11\112\3\u00a4"+
        "\7\112\2\u00ad\20\112\1\157\1\u00a5\7\112\2\u00ad\15\112";
    static final String DFA50_maxS =
        "\1\u0112\1\u011d\2\u011f\3\uffff\1\u00a4\2\uffff\2\u011f\1\uffff"+
        "\7\u00c1\2\u00af\11\u00c1\1\u00a4\2\u00b6\1\uffff\7\u0112\2\u00af"+
        "\11\u0112\3\u00c1\7\u0112\2\u00af\20\u0112\2\u011f\7\u0112\2\u00af"+
        "\15\u0112";
    static final String DFA50_acceptS =
        "\4\uffff\1\2\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\25\uffff\1\1\106"+
        "\uffff";
    static final String DFA50_specialS =
        "\151\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\11\1\1\1\7\1\uffff\1\5\1\uffff\1\3\4\2\70\uffff\1\6\24\uffff"+
            "\2\6\35\uffff\6\4\26\uffff\1\10\37\uffff\13\11\6\uffff\4\5",
            "\1\14\3\uffff\1\11\2\uffff\1\13\4\12\17\uffff\1\14\34\uffff"+
            "\2\11\6\uffff\1\11\3\uffff\3\11\61\uffff\6\4\124\uffff\2\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\4\136\uffff\2\4",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\4\136\uffff\2\4",
            "",
            "",
            "",
            "\1\11\2\uffff\1\41\4\40\54\uffff\2\11\6\uffff\1\11\3\uffff"+
            "\1\37\2\11\23\uffff\1\6",
            "",
            "",
            "\5\14\16\uffff\1\14\54\uffff\22\11\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\4\14\uffff\5\42\10\uffff\1\14\5\uffff"+
            "\3\14\43\uffff\1\14\15\uffff\4\14\1\uffff\6\14\2\4",
            "\5\14\16\uffff\1\14\54\uffff\22\11\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\4\31\uffff\1\14\5\uffff\3\14\61\uffff"+
            "\4\14\1\uffff\6\14\2\4",
            "",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\65\1\66\1\67",
            "\1\26\1\27\1\30",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\5\6\71\uffff\2\11\23\uffff\1\6",
            "\22\11\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\22\11\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\1\112\1\113\1\114",
            "\1\54\1\55\1\56",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\1\6\33\uffff\2\4",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\1\116\1\117\1\120",
            "\1\101\1\102\1\103",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\33\uffff\2\4\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\6\1\uffff\1\6\1\uffff\1\122\4\121\27\uffff\2\6\2\uffff\4"+
            "\6\17\uffff\6\6\3\uffff\1\11\1\6\24\uffff\2\6\35\uffff\6\6\26"+
            "\uffff\1\6\37\uffff\13\6\6\uffff\4\6",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\115\35\uffff\6\11"+
            "\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\2\6\64\uffff\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132"+
            "\1\134\1\135\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144"+
            "\2\uffff\7\6\136\uffff\2\6",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\6"+
            "\136\uffff\2\6",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\1\146\1\147\1\150",
            "\1\134\1\135\1\136",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\6\1\uffff\1\6\1\uffff\1\122\4\121\27\uffff\2\6\2\uffff\4"+
            "\6\17\uffff\6\6\3\uffff\1\11\1\6\24\uffff\2\6\35\uffff\6\6\26"+
            "\uffff\1\6\37\uffff\13\6\6\uffff\4\6",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\145\33\uffff\2\6"+
            "\6\11\26\uffff\1\11\37\uffff\13\11\6\uffff\4\11"
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
            return "227:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA59_eotS =
        "\16\uffff";
    static final String DFA59_eofS =
        "\16\uffff";
    static final String DFA59_minS =
        "\14\113\2\uffff";
    static final String DFA59_maxS =
        "\1\u0108\13\125\2\uffff";
    static final String DFA59_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA59_specialS =
        "\16\uffff}>";
    static final String[] DFA59_transitionS = {
            "\3\14\u00b0\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
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

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "261:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA91_eotS =
        "\70\uffff";
    static final String DFA91_eofS =
        "\7\uffff\7\42\34\uffff\16\42";
    static final String DFA91_minS =
        "\1\114\1\121\2\u00a5\1\uffff\2\u00a5\7\112\7\u00c0\2\u00ad\11\u00c0"+
        "\2\u00b7\3\uffff\2\u00c2\3\u00c0\16\112";
    static final String DFA91_maxS =
        "\2\u00c7\2\u011f\1\uffff\2\u011f\7\u0112\7\u00c1\2\u00af\11\u00c1"+
        "\2\u00cb\3\uffff\2\u00dd\3\u00c1\16\u0112";
    static final String DFA91_acceptS =
        "\4\uffff\1\3\35\uffff\1\1\1\4\1\2\23\uffff";
    static final String DFA91_specialS =
        "\70\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\1\4\uffff\1\3\4\2\154\uffff\6\4",
            "\1\6\4\5\154\uffff\6\4",
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\1\31\1\26"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\136\uffff\1\40\1\41",
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\1\31\1\26"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\136\uffff\1\40\1\41",
            "",
            "\22\42\2\uffff\7\42\136\uffff\2\43",
            "\22\42\2\uffff\7\42\136\uffff\2\43",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\47\1\50\1\51",
            "\1\27\1\30\1\31",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\2\44\17\uffff\4\43",
            "\2\44\17\uffff\4\43",
            "",
            "",
            "",
            "\1\57\16\uffff\1\52\1\53\1\54\1\55\1\56\1\60\1\61\1\62\1\63"+
            "\1\64\1\65\1\66\1\67",
            "\1\57\16\uffff\1\52\1\53\1\54\1\55\1\56\1\60\1\61\1\62\1\63"+
            "\1\64\1\65\1\66\1\67",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\45\1\46",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42",
            "\4\42\1\uffff\7\42\27\uffff\2\42\2\uffff\4\42\11\uffff\4\42"+
            "\2\uffff\6\42\1\uffff\2\42\1\uffff\1\42\24\uffff\2\42\22\uffff"+
            "\2\44\11\uffff\6\42\21\uffff\1\42\4\uffff\65\42"
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "337:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );";
        }
    }
    static final String DFA93_eotS =
        "\65\uffff";
    static final String DFA93_eofS =
        "\65\uffff";
    static final String DFA93_minS =
        "\1\121\2\u00a5\11\u00b7\7\u00c0\2\u00ad\11\u00c0\4\uffff\2\u00c2"+
        "\3\u00c0\16\u00b7";
    static final String DFA93_maxS =
        "\1\125\2\u011f\11\u00b8\7\u00c1\2\u00af\11\u00c1\4\uffff\2\u00dd"+
        "\3\u00c1\16\u00b8";
    static final String DFA93_acceptS =
        "\36\uffff\1\4\1\3\1\1\1\2\23\uffff";
    static final String DFA93_specialS =
        "\65\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\2\4\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\136\uffff\1\3\1\4",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\136\uffff\1\3\1\4",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\44\1\45\1\46",
            "\1\25\1\26\1\27",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "",
            "",
            "",
            "",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41"
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "349:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA109_eotS =
        "\14\uffff";
    static final String DFA109_eofS =
        "\5\uffff\1\11\4\uffff\2\11";
    static final String DFA109_minS =
        "\1\122\1\u00cc\1\122\2\uffff\1\112\1\121\3\uffff\2\112";
    static final String DFA109_maxS =
        "\1\125\1\u00d0\1\125\2\uffff\1\u0112\1\125\3\uffff\2\u0112";
    static final String DFA109_acceptS =
        "\3\uffff\1\2\1\4\2\uffff\1\3\1\1\1\5\2\uffff";
    static final String DFA109_specialS =
        "\14\uffff}>";
    static final String[] DFA109_transitionS = {
            "\4\1",
            "\2\3\2\4\1\2",
            "\4\5",
            "",
            "",
            "\4\11\1\uffff\7\11\27\uffff\2\11\2\uffff\4\11\11\uffff\4\11"+
            "\2\uffff\6\11\1\uffff\2\11\1\uffff\1\11\24\uffff\2\11\35\uffff"+
            "\6\11\4\uffff\2\10\2\7\1\6\10\uffff\1\11\4\uffff\65\11",
            "\1\13\4\12",
            "",
            "",
            "",
            "\4\11\1\uffff\7\11\27\uffff\2\11\2\uffff\4\11\11\uffff\4\11"+
            "\2\uffff\6\11\1\uffff\2\11\1\uffff\1\11\24\uffff\2\11\35\uffff"+
            "\6\11\4\uffff\2\10\2\7\11\uffff\1\11\4\uffff\65\11",
            "\4\11\1\uffff\7\11\27\uffff\2\11\2\uffff\4\11\11\uffff\4\11"+
            "\2\uffff\6\11\1\uffff\2\11\1\uffff\1\11\24\uffff\2\11\35\uffff"+
            "\6\11\4\uffff\2\10\2\7\11\uffff\1\11\4\uffff\65\11"
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "404:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA116_eotS =
        "\32\uffff";
    static final String DFA116_eofS =
        "\4\uffff\11\2\4\uffff\4\25\5\uffff";
    static final String DFA116_minS =
        "\1\121\1\u00c2\2\uffff\11\112\1\157\1\u00a5\1\157\1\u00a5\4\112"+
        "\2\uffff\1\157\1\u00a5\1\uffff";
    static final String DFA116_maxS =
        "\1\125\1\u00dd\2\uffff\11\u0112\4\u011f\4\u0112\2\uffff\2\u011f"+
        "\1\uffff";
    static final String DFA116_acceptS =
        "\2\uffff\1\1\1\5\21\uffff\1\2\1\4\2\uffff\1\3";
    static final String DFA116_specialS =
        "\32\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\2\4\1",
            "\1\11\15\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\5\2",
            "",
            "",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\35\uffff"+
            "\6\2\21\uffff\1\2\4\uffff\65\2",
            "\2\2\64\uffff\22\2\2\uffff\7\2\2\uffff\1\21\23\uffff\1\22\1"+
            "\23\1\24\5\25\100\uffff\2\2",
            "\22\2\2\uffff\7\2\2\uffff\1\25\23\uffff\10\25\100\uffff\2\2",
            "\2\2\64\uffff\22\2\2\uffff\7\2\31\uffff\5\26\100\uffff\2\2",
            "\22\2\2\uffff\7\2\31\uffff\5\26\100\uffff\2\2",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\2\25\2\uffff\4\25\11"+
            "\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24\uffff"+
            "\2\25\35\uffff\6\25\21\uffff\1\25\4\uffff\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\2\25\2\uffff\4\25\11"+
            "\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24\uffff"+
            "\2\25\35\uffff\6\25\21\uffff\1\25\4\uffff\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\2\25\2\uffff\4\25\11"+
            "\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24\uffff"+
            "\2\25\35\uffff\6\25\21\uffff\1\25\4\uffff\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\2\25\2\uffff\4\25\11"+
            "\uffff\4\25\2\uffff\6\25\1\uffff\2\25\1\uffff\1\25\24\uffff"+
            "\2\25\35\uffff\6\25\21\uffff\1\25\4\uffff\65\25",
            "",
            "",
            "\2\25\64\uffff\22\25\2\uffff\7\25\31\uffff\5\31\100\uffff\2"+
            "\25",
            "\22\25\2\uffff\7\25\31\uffff\5\31\100\uffff\2\25",
            ""
    };

    static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static final short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "449:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA167_eotS =
        "\64\uffff";
    static final String DFA167_eofS =
        "\64\uffff";
    static final String DFA167_minS =
        "\11\121\1\uffff\6\121\2\uffff\4\121\2\u0117\23\121\2\uffff\1\121"+
        "\4\u0117\2\121";
    static final String DFA167_maxS =
        "\3\u011d\2\125\4\u011d\1\uffff\1\125\5\u011d\2\uffff\4\u011d\2\u0117"+
        "\4\u011d\1\125\10\u011d\1\125\5\u011d\2\uffff\1\u011d\4\u0117\2"+
        "\u011d";
    static final String DFA167_acceptS =
        "\11\uffff\1\1\6\uffff\1\2\1\4\31\uffff\1\5\1\3\7\uffff";
    static final String DFA167_specialS =
        "\64\uffff}>";
    static final String[] DFA167_transitionS = {
            "\1\2\4\1\u00c6\uffff\1\3\1\4",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\43\uffff\1"+
            "\12\15\uffff\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\61\uffff\1"+
            "\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16\1\20\1\21",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "",
            "\1\27\4\26",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\5\20\u00c6\uffff\1\20\1\21",
            "",
            "",
            "\5\20\16\uffff\1\17\u00a0\uffff\1\34\15\uffff\1\30\1\31\1\32"+
            "\1\33\1\uffff\1\35\1\36\1\37\1\40\1\20\1\21",
            "\5\20\16\uffff\1\17\u00ae\uffff\1\30\1\31\1\32\1\33\1\uffff"+
            "\1\35\1\36\1\37\1\40\1\20\1\21",
            "\5\54\16\uffff\1\52\u00a0\uffff\1\45\15\uffff\1\41\1\42\1\43"+
            "\1\44\1\uffff\1\46\1\47\1\50\1\51\1\54\1\53",
            "\5\54\16\uffff\1\52\u00ae\uffff\1\41\1\42\1\43\1\44\1\uffff"+
            "\1\46\1\47\1\50\1\51\1\54\1\53",
            "\1\55",
            "\1\55",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\1\57\4\56",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\1\61\4\60",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53",
            "\5\54\u00c6\uffff\1\54\1\53",
            "",
            "",
            "\5\20\16\uffff\1\17\164\uffff\1\11\5\uffff\3\11\72\uffff\1"+
            "\20\1\21",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\20\16\uffff\1\17\u00b7\uffff\1\20\1\21",
            "\5\54\16\uffff\1\52\u00b7\uffff\1\54\1\53"
    };

    static final short[] DFA167_eot = DFA.unpackEncodedString(DFA167_eotS);
    static final short[] DFA167_eof = DFA.unpackEncodedString(DFA167_eofS);
    static final char[] DFA167_min = DFA.unpackEncodedStringToUnsignedChars(DFA167_minS);
    static final char[] DFA167_max = DFA.unpackEncodedStringToUnsignedChars(DFA167_maxS);
    static final short[] DFA167_accept = DFA.unpackEncodedString(DFA167_acceptS);
    static final short[] DFA167_special = DFA.unpackEncodedString(DFA167_specialS);
    static final short[][] DFA167_transition;

    static {
        int numStates = DFA167_transitionS.length;
        DFA167_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA167_transition[i] = DFA.unpackEncodedString(DFA167_transitionS[i]);
        }
    }

    class DFA167 extends DFA {

        public DFA167(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 167;
            this.eot = DFA167_eot;
            this.eof = DFA167_eof;
            this.min = DFA167_min;
            this.max = DFA167_max;
            this.accept = DFA167_accept;
            this.special = DFA167_special;
            this.transition = DFA167_transition;
        }
        public String getDescription() {
            return "581:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA173_eotS =
        "\70\uffff";
    static final String DFA173_eofS =
        "\70\uffff";
    static final String DFA173_minS =
        "\1\145\3\121\4\u00a5\7\144\2\u00ad\20\144\2\u00ad\11\144\1\121\3"+
        "\144\1\121\3\144\4\uffff";
    static final String DFA173_maxS =
        "\1\145\1\u011d\2\125\4\u00b6\7\144\2\u00af\20\144\2\u00af\11\144"+
        "\1\u011d\3\144\1\u011d\3\144\4\uffff";
    static final String DFA173_acceptS =
        "\64\uffff\1\3\1\1\1\4\1\2";
    static final String DFA173_specialS =
        "\70\uffff}>";
    static final String[] DFA173_transitionS = {
            "\1\1",
            "\1\5\4\4\u00c6\uffff\1\3\1\2",
            "\1\7\4\6",
            "\1\5\4\4",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\20"+
            "\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\20"+
            "\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\44\1\45\1\42"+
            "\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\44\1\45\1\42"+
            "\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\55\1\56\1\57",
            "\1\21\1\22\1\23",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\61\1\62\1\63",
            "\1\43\1\44\1\45",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\5\65\u00c6\uffff\1\65\1\64",
            "\1\54",
            "\1\54",
            "\1\54",
            "\5\67\u00c6\uffff\1\67\1\66",
            "\1\60",
            "\1\60",
            "\1\60",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA173_eot = DFA.unpackEncodedString(DFA173_eotS);
    static final short[] DFA173_eof = DFA.unpackEncodedString(DFA173_eofS);
    static final char[] DFA173_min = DFA.unpackEncodedStringToUnsignedChars(DFA173_minS);
    static final char[] DFA173_max = DFA.unpackEncodedStringToUnsignedChars(DFA173_maxS);
    static final short[] DFA173_accept = DFA.unpackEncodedString(DFA173_acceptS);
    static final short[] DFA173_special = DFA.unpackEncodedString(DFA173_specialS);
    static final short[][] DFA173_transition;

    static {
        int numStates = DFA173_transitionS.length;
        DFA173_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA173_transition[i] = DFA.unpackEncodedString(DFA173_transitionS[i]);
        }
    }

    class DFA173 extends DFA {

        public DFA173(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 173;
            this.eot = DFA173_eot;
            this.eof = DFA173_eof;
            this.min = DFA173_min;
            this.max = DFA173_max;
            this.accept = DFA173_accept;
            this.special = DFA173_special;
            this.transition = DFA173_transition;
        }
        public String getDescription() {
            return "600:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan401 = new BitSet(new long[]{0x0000000000000002L,0x00007F8380000400L,0x00000000000003F0L});
    public static final BitSet FOLLOW_statement_in_flightPlan404 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000400L,0x00000000000003F0L});
    public static final BitSet FOLLOW_defineCommand_in_define431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_defineCommand453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_96_in_defineCommand455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_97_in_defineCommand457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue476 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue478 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue480 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineCommandValue486 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue493 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue495 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue497 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue520 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue522 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue526 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defineCommandValue528 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue532 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue534 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineCommandValue540 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue547 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue549 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue553 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defineCommandValue555 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue559 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue561 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_103_in_defineSensor597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_104_in_defineSensor599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_105_in_defineSensor601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue620 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineSensorValue622 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue626 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineSensorValue630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineSensorValue632 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineSensorValue634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue639 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineSensorValue641 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue645 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_106_in_defineWaypoint676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_107_in_defineWaypoint678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_108_in_defineWaypoint680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue699 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineWaypointValue701 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue703 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue709 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue716 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineWaypointValue718 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue720 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_command_in_statement747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_statement752 = new BitSet(new long[]{0x0000000000000000L,0x001E6000003C0400L,0x00000000000003F0L});
    public static final BitSet FOLLOW_statement_in_statement754 = new BitSet(new long[]{0x0000000000000000L,0x001E6000003C0400L,0x00000000000003F0L});
    public static final BitSet FOLLOW_repeat_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_statement762 = new BitSet(new long[]{0x0000000000000000L,0x001E6000003C0400L,0x00000000000003F0L});
    public static final BitSet FOLLOW_condition_in_statement764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_repeat775 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_set_in_repeat777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_repeat786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_duration_in_repeat788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_repeat793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_repeat798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_condition809 = new BitSet(new long[]{0x0000000000000000L,0xFF608C20003FC400L,0x000000000000000FL,0x3FFFFFFF82000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_conditionValue_in_condition811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_condition816 = new BitSet(new long[]{0x0000000000000000L,0xFF608C20003FC400L,0x000000000000000FL,0x3FFFFFFF82000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_conditionValue_in_condition818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue830 = new BitSet(new long[]{0x0000000000000000L,0x0040800000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue833 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue839 = new BitSet(new long[]{0x0000000000000000L,0x00608000003C0000L});
    public static final BitSet FOLLOW_timeValue_in_conditionValue847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue853 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue856 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue862 = new BitSet(new long[]{0x0000000000000000L,0x0320000000018000L,0x0000000000000000L,0x3FFFFFFF82000000L});
    public static final BitSet FOLLOW_fixedDirection_in_conditionValue870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue876 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue879 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue885 = new BitSet(new long[]{0x0000000000000000L,0x0C200000003E0000L});
    public static final BitSet FOLLOW_speedValue_in_conditionValue893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue899 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue902 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue908 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_conditionValue915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue921 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue924 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue930 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_conditionValue946 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue952 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue965 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue968 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue974 = new BitSet(new long[]{0x0000000000000000L,0x00200C20003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_waypoint_in_conditionValue982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_conditionValue988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_conditionValue991 = new BitSet(new long[]{0x0000000000000000L,0x0080000400000000L});
    public static final BitSet FOLLOW_set_in_conditionValue997 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000000CL});
    public static final BitSet FOLLOW_altitudeValue_in_conditionValue1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_conditionValue1010 = new BitSet(new long[]{0x0000000000000000L,0x00800004003E0000L});
    public static final BitSet FOLLOW_set_in_conditionValue1012 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_conditionValue1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flyCommand_in_command1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_flyCommand1059 = new BitSet(new long[]{0x0000000000000002L,0xCF200000003FB800L,0x0000000000001803L,0xFFFFFFFFC20000FCL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_133_in_flyCommand1061 = new BitSet(new long[]{0x0000000000000002L,0xCF200000003FB800L,0x0000000000001803L,0xFFFFFFFFC20000FCL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand1064 = new BitSet(new long[]{0x0000000000000002L,0xCF200000003FB800L,0x0000000000001803L,0xFFFFFFFFC20000FCL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_time_in_flyCommandValue1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue1121 = new BitSet(new long[]{0x0000000000000000L,0x00200C20003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1123 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_99_in_flyCommandValue1127 = new BitSet(new long[]{0x0000000000000000L,0x00200C20003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue1129 = new BitSet(new long[]{0x0000000000000000L,0x00200C28003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_99_in_flyCommandValue1131 = new BitSet(new long[]{0x0000000000000000L,0x00200C20003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1135 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_turnCommand1160 = new BitSet(new long[]{0x0000000000000002L,0x0320000000018000L,0x0000000000000000L,0x3FFFFFFF82000000L});
    public static final BitSet FOLLOW_135_in_turnCommand1162 = new BitSet(new long[]{0x0000000000000002L,0x0320000000018000L,0x0000000000000000L,0x3FFFFFFF82000000L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand1165 = new BitSet(new long[]{0x0000000000000002L,0x0320000000018000L,0x0000000000000000L,0x3FFFFFFF82000000L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_loiterCommand1199 = new BitSet(new long[]{0x0000000000000002L,0xCF200000003FB800L,0x0000001800005803L,0xFFFFFFFFC20000FCL,0x000000000007FFFFL});
    public static final BitSet FOLLOW_137_in_loiterCommand1201 = new BitSet(new long[]{0x0000000000000002L,0xCF200000003FB800L,0x0000001800005803L,0xFFFFFFFFC20000FCL,0x000000000007FFFFL});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand1204 = new BitSet(new long[]{0x0000000000000002L,0xCF200000003FB800L,0x0000001800005803L,0xFFFFFFFFC20000FCL,0x000000000007FFFFL});
    public static final BitSet FOLLOW_time_in_loiterCommandValue1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue1251 = new BitSet(new long[]{0x0000000000000000L,0x00200C20003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1288 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_executeCommand1290 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1292 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_100_in_executeCommand1295 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1297 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_102_in_executeCommand1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_pitch1332 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_127_in_pitch1334 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_pitch1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_139_in_pitch1359 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000002000L});
    public static final BitSet FOLLOW_140_in_pitch1361 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_pitch1364 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_roll1388 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_129_in_roll1390 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_roll1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1435 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000001C40CL});
    public static final BitSet FOLLOW_At_in_fixedAltitude1437 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000001C40CL});
    public static final BitSet FOLLOW_With_in_fixedAltitude1439 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000001C40CL});
    public static final BitSet FOLLOW_138_in_fixedAltitude1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_130_in_fixedAltitude1448 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000200CL});
    public static final BitSet FOLLOW_131_in_fixedAltitude1450 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000200CL});
    public static final BitSet FOLLOW_142_in_fixedAltitude1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_143_in_fixedAltitude1457 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000200CL});
    public static final BitSet FOLLOW_144_in_fixedAltitude1459 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000200CL});
    public static final BitSet FOLLOW_141_in_fixedAltitude1463 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000000CL});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1490 = new BitSet(new long[]{0x0000000000000000L,0x00200000003E4000L,0x000000000000000CL});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000007FFFE0000L});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_pressureUnit1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_pressureUnit1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_pressureUnit1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_pressureUnit1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_pressureUnit1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_pressureUnit1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pressureUnit1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pressureUnit1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pressureUnit1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pressureUnit1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_pressureUnit1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_pressureUnit1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_pressureUnit1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pressureUnit1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_pressureUnit1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_pressureUnit1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pressureUnit1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pressureUnit1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_radius1676 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000001000004000L});
    public static final BitSet FOLLOW_With_in_radius1678 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000001000004000L});
    public static final BitSet FOLLOW_142_in_radius1682 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_radius1686 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_radius1688 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_radius1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1716 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007FFFE000000000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_distanceUnit1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_distanceUnit1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_distanceUnit1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_distanceUnit1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_distanceUnit1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_distanceUnit1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_distanceUnit1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_distanceUnit1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_173_in_distanceUnit1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_distanceUnit1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_distanceUnit1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_distanceUnit1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_173_in_distanceUnit1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_distanceUnit1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_distanceUnit1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_distanceUnit1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_distanceUnit1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_distanceUnit1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_distanceUnit1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_distanceUnit1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_distanceUnit1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1898 = new BitSet(new long[]{0x0000000000000000L,0x0C200000003E0000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_relativeSpeed1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_184_in_relativeSpeed1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_relativeSpeed1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_184_in_relativeSpeed1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFE7FFFE000000000L});
    public static final BitSet FOLLOW_speedUnit_in_speedValue2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_speedUnit2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_speedUnit2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_speedUnit2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_speedUnit2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_speedUnit2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_speedUnit2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_speedUnit2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_192_in_speedUnit2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000003FFE0004L});
    public static final BitSet FOLLOW_193_in_speedUnit2075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000003FFE0004L});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed2099 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_optimalSpeed2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_optimalSpeed2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_optimalUnit2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_optimalUnit2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_optimalUnit2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_optimalUnit2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_optimalUnit2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_optimalUnit2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed2175 = new BitSet(new long[]{0x0000000000000000L,0x0C200000003E1000L,0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_200_in_throttleSpeed2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_throttleSpeed2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_throttleSpeed2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_throttleSpeed2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time2223 = new BitSet(new long[]{0x0000000000000000L,0x00608000003C0000L});
    public static final BitSet FOLLOW_timeValue_in_time2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_204_in_timeValue2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_timeValue2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_204_in_timeValue2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_timeValue2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_206_in_timeValue2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_timeValue2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_206_in_timeValue2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_timeValue2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_208_in_timeFormat2354 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_208_in_timeFormat2380 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_208_in_timeFormat2386 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_hour2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_hour2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_hour2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_hour2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_hour2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_minute2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_minute2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_minute2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_minute2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_second2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_second2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_second2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_second2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_second2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_duration2515 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_durationValue_in_duration2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000003FFE0004L});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_hour_in_durationValue2546 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000003FFE0004L});
    public static final BitSet FOLLOW_minute_in_durationValue2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_hour_in_durationValue2561 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001C00004L});
    public static final BitSet FOLLOW_minute_in_durationValue2565 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000003FFE0004L});
    public static final BitSet FOLLOW_second_in_durationValue2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001C00004L});
    public static final BitSet FOLLOW_minute_in_durationValue2576 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000003FFE0004L});
    public static final BitSet FOLLOW_second_in_durationValue2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2667 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x3FFFFFFF82000000L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2669 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x3FFFFFFF82000000L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2712 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_northSouthDirection2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_northSouthDirection2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_northSouthDirection2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_northSouthDirection2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_eastWestDirection2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_eastWestDirection2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_eastWestDirection2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_eastWestDirection2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_ordinalDirection2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_ordinalDirection2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_ordinalDirection2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_ordinalDirection2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_ordinalDirection2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_ordinalDirection2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_ordinalDirection2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_ordinalDirection2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_subOrdinalDirection2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_subOrdinalDirection2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_subOrdinalDirection2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_subOrdinalDirection2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_subOrdinalDirection2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_subOrdinalDirection2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_subOrdinalDirection2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_subOrdinalDirection2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_subOrdinalDirection2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_subOrdinalDirection2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_subOrdinalDirection2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_subOrdinalDirection2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_subOrdinalDirection2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_subOrdinalDirection2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_subOrdinalDirection3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_subOrdinalDirection3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection3036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_upDownDirection3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_upDownDirection3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_upDownDirection3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_upDownDirection3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_upDownDirection3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_upDownDirection3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_upDownDirection3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_upDownDirection3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_upDownDirection3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_upDownDirection3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_264_in_upDownDirection3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_leftRightDirection3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_leftRightDirection3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_leftRightDirection3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_leftRightDirection3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_leftRightDirection3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_leftRightDirection3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_clockDirection3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_clockDirection3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_273_in_clockDirection3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_274_in_clockDirection3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_275_in_angularValue3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_276_in_angularValue3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_277_in_angularValue3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_278_in_angularValue3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue3203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_261_in_angularValue3205 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_279_in_angularValue3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_280_in_angularValue3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_angularValue3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_282_in_angularValue3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_283_in_angularValue3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000382000000L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3318 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3320 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000003F82000000L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_284_in_latitudeLongitude3353 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3358 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3360 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_284_in_latitudeLongitude3363 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_285_in_latitudeLongitude3394 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3398 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3400 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_284_in_latitudeLongitude3403 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_284_in_latitudeLongitude3434 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3439 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_285_in_latitudeLongitude3444 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_285_in_latitudeLongitude3474 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3478 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_285_in_latitudeLongitude3483 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3542 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_284_in_distanceCoordinate3544 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3549 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3551 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_284_in_distanceCoordinate3553 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3558 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_285_in_distanceCoordinate3588 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3592 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3594 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_284_in_distanceCoordinate3596 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3601 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3629 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_284_in_distanceCoordinate3631 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3636 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_285_in_distanceCoordinate3640 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3644 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_285_in_distanceCoordinate3674 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3678 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_285_in_distanceCoordinate3682 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3686 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_286_in_percentValue3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_287_in_percentValue3769 = new BitSet(new long[]{0x0000000000000002L});

}