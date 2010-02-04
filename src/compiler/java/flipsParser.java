// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flips.g 2010-02-03 22:52:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'def'", "'define'", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'spd'", "'speed'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
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
    public static final int YARD=44;
    public static final int T__141=141;
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
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:1: flightPlan : ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.command_return command2 = null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:2: ( ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: ( define )* ( command )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=95 && LA1_0<=96)) ) {
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

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:12: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=111 && LA2_0<=116)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:12: command
            	    {
            	    pushFollow(FOLLOW_command_in_flightPlan404);
            	    command2=command();

            	    state._fsp--;

            	    stream_command.add(command2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: define, command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:2: -> ^( FLIGHTPLAN ( define )* ( command )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:5: ^( FLIGHTPLAN ( define )* ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:26: ( command )*
                while ( stream_command.hasNext() ) {
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
            int LA3_0 = input.LA(1);

            if ( (LA3_0==95) ) {
                switch ( input.LA(2) ) {
                case 108:
                case 109:
                case 110:
                    {
                    alt3=3;
                    }
                    break;
                case 105:
                case 106:
                case 107:
                    {
                    alt3=2;
                    }
                    break;
                case 97:
                case 98:
                case 99:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==96) ) {
                switch ( input.LA(2) ) {
                case 97:
                case 98:
                case 99:
                    {
                    alt3=1;
                    }
                    break;
                case 108:
                case 109:
                case 110:
                    {
                    alt3=3;
                    }
                    break;
                case 105:
                case 106:
                case 107:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:122:1: defineCommand : ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
    public final flipsParser.defineCommand_return defineCommand() throws RecognitionException {
        flipsParser.defineCommand_return retval = new flipsParser.defineCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        flipsParser.defineCommandValue_return defineCommandValue11 = null;


        CommonTree string_literal6_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        CommonTree string_literal10_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:2: ( ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:4: ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:4: ( 'def' | 'define' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==95) ) {
                alt4=1;
            }
            else if ( (LA4_0==96) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:5: 'def'
                    {
                    string_literal6=(Token)match(input,95,FOLLOW_95_in_defineCommand453);  
                    stream_95.add(string_literal6);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:11: 'define'
                    {
                    string_literal7=(Token)match(input,96,FOLLOW_96_in_defineCommand455);  
                    stream_96.add(string_literal7);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:21: ( 'cmd' | 'command' | 'commands' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt5=1;
                }
                break;
            case 98:
                {
                alt5=2;
                }
                break;
            case 99:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:22: 'cmd'
                    {
                    string_literal8=(Token)match(input,97,FOLLOW_97_in_defineCommand459);  
                    stream_97.add(string_literal8);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:28: 'command'
                    {
                    string_literal9=(Token)match(input,98,FOLLOW_98_in_defineCommand461);  
                    stream_98.add(string_literal9);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:38: 'commands'
                    {
                    string_literal10=(Token)match(input,99,FOLLOW_99_in_defineCommand463);  
                    stream_99.add(string_literal10);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand466);
            defineCommandValue11=defineCommandValue();

            state._fsp--;

            stream_defineCommandValue.add(defineCommandValue11.getTree());


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:1: defineCommandValue : ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier12=null;
        Token char_literal13=null;
        Token string_literal14=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token Identifier17=null;
        Token char_literal18=null;
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


        CommonTree Identifier12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree string_literal16_tree=null;
        CommonTree Identifier17_tree=null;
        CommonTree char_literal18_tree=null;
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
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:2: ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Identifier) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==100) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2>=BinaryLiteral && LA12_2<=HexLiteral)) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==EOF||LA12_3==Identifier||(LA12_3>=95 && LA12_3<=96)||(LA12_3>=101 && LA12_3<=102)||(LA12_3>=111 && LA12_3<=116)) ) {
                            alt12=1;
                        }
                        else if ( (LA12_3==103) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;
                        }
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:4: Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    {
                    Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue482);  
                    stream_Identifier.add(Identifier12);

                    char_literal13=(Token)match(input,100,FOLLOW_100_in_defineCommandValue484);  
                    stream_100.add(char_literal13);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue488);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Identifier) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==100) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>=101 && LA8_0<=102)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:37: ( 'and' | ',' ( 'and' )? )?
                    	    int alt7=3;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==101) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==102) ) {
                    	        alt7=2;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:38: 'and'
                    	            {
                    	            string_literal14=(Token)match(input,101,FOLLOW_101_in_defineCommandValue492);  
                    	            stream_101.add(string_literal14);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:44: ',' ( 'and' )?
                    	            {
                    	            char_literal15=(Token)match(input,102,FOLLOW_102_in_defineCommandValue494);  
                    	            stream_102.add(char_literal15);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:48: ( 'and' )?
                    	            int alt6=2;
                    	            int LA6_0 = input.LA(1);

                    	            if ( (LA6_0==101) ) {
                    	                alt6=1;
                    	            }
                    	            switch (alt6) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:48: 'and'
                    	                    {
                    	                    string_literal16=(Token)match(input,101,FOLLOW_101_in_defineCommandValue496);  
                    	                    stream_101.add(string_literal16);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue501);  
                    	    stream_Identifier.add(Identifier17);

                    	    char_literal18=(Token)match(input,100,FOLLOW_100_in_defineCommandValue503);  
                    	    stream_100.add(char_literal18);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue507);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);



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
                    // 129:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+
                    {
                        if ( !(stream_cmd.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cmd.hasNext()||stream_Identifier.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:5: ^( DEFINE Identifier ^( COMMAND $cmd) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:25: ^( COMMAND $cmd)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue531);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,100,FOLLOW_100_in_defineCommandValue533);  
                    stream_100.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue537);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal21=(Token)match(input,103,FOLLOW_103_in_defineCommandValue539);  
                    stream_103.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue543);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,104,FOLLOW_104_in_defineCommandValue545);  
                    stream_104.add(char_literal22);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Identifier) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==100) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>=101 && LA11_0<=102)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt10=3;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==101) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==102) ) {
                    	        alt10=2;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:63: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,101,FOLLOW_101_in_defineCommandValue549);  
                    	            stream_101.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:69: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,102,FOLLOW_102_in_defineCommandValue551);  
                    	            stream_102.add(char_literal24);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:73: ( 'and' )?
                    	            int alt9=2;
                    	            int LA9_0 = input.LA(1);

                    	            if ( (LA9_0==101) ) {
                    	                alt9=1;
                    	            }
                    	            switch (alt9) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:73: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,101,FOLLOW_101_in_defineCommandValue553);  
                    	                    stream_101.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue558);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,100,FOLLOW_100_in_defineCommandValue560);  
                    	    stream_100.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue564);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal28=(Token)match(input,103,FOLLOW_103_in_defineCommandValue566);  
                    	    stream_103.add(char_literal28);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue570);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal29=(Token)match(input,104,FOLLOW_104_in_defineCommandValue572);  
                    	    stream_104.add(char_literal29);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:134:1: defineSensor : ( 'def' | 'define' ) ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue ;
    public final flipsParser.defineSensor_return defineSensor() throws RecognitionException {
        flipsParser.defineSensor_return retval = new flipsParser.defineSensor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        Token string_literal33=null;
        Token string_literal34=null;
        flipsParser.defineSensorValue_return defineSensorValue35 = null;


        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree string_literal33_tree=null;
        CommonTree string_literal34_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_defineSensorValue=new RewriteRuleSubtreeStream(adaptor,"rule defineSensorValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:2: ( ( 'def' | 'define' ) ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:4: ( 'def' | 'define' ) ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:4: ( 'def' | 'define' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==95) ) {
                alt13=1;
            }
            else if ( (LA13_0==96) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:5: 'def'
                    {
                    string_literal30=(Token)match(input,95,FOLLOW_95_in_defineSensor608);  
                    stream_95.add(string_literal30);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:11: 'define'
                    {
                    string_literal31=(Token)match(input,96,FOLLOW_96_in_defineSensor610);  
                    stream_96.add(string_literal31);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:21: ( 'sen' | 'sensor' | 'sensors' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt14=1;
                }
                break;
            case 106:
                {
                alt14=2;
                }
                break;
            case 107:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:22: 'sen'
                    {
                    string_literal32=(Token)match(input,105,FOLLOW_105_in_defineSensor614);  
                    stream_105.add(string_literal32);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:28: 'sensor'
                    {
                    string_literal33=(Token)match(input,106,FOLLOW_106_in_defineSensor616);  
                    stream_106.add(string_literal33);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:37: 'sensors'
                    {
                    string_literal34=(Token)match(input,107,FOLLOW_107_in_defineSensor618);  
                    stream_107.add(string_literal34);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor621);
            defineSensorValue35=defineSensorValue();

            state._fsp--;

            stream_defineSensorValue.add(defineSensorValue35.getTree());


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

        Token Identifier36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token string_literal40=null;
        Token Identifier41=null;
        Token char_literal42=null;
        flipsParser.integerValue_return sen = null;


        CommonTree Identifier36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree Identifier41_tree=null;
        CommonTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier36=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue637);  
            stream_Identifier.add(Identifier36);

            char_literal37=(Token)match(input,100,FOLLOW_100_in_defineSensorValue639);  
            stream_100.add(char_literal37);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue643);
            sen=integerValue();

            state._fsp--;

            stream_integerValue.add(sen.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Identifier) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==100) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>=101 && LA17_0<=102)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:37: ( 'and' | ',' ( 'and' )? )?
            	    int alt16=3;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==101) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==102) ) {
            	        alt16=2;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:38: 'and'
            	            {
            	            string_literal38=(Token)match(input,101,FOLLOW_101_in_defineSensorValue647);  
            	            stream_101.add(string_literal38);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:44: ',' ( 'and' )?
            	            {
            	            char_literal39=(Token)match(input,102,FOLLOW_102_in_defineSensorValue649);  
            	            stream_102.add(char_literal39);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:48: ( 'and' )?
            	            int alt15=2;
            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==101) ) {
            	                alt15=1;
            	            }
            	            switch (alt15) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:48: 'and'
            	                    {
            	                    string_literal40=(Token)match(input,101,FOLLOW_101_in_defineSensorValue651);  
            	                    stream_101.add(string_literal40);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue656);  
            	    stream_Identifier.add(Identifier41);

            	    char_literal42=(Token)match(input,100,FOLLOW_100_in_defineSensorValue658);  
            	    stream_100.add(char_literal42);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue662);
            	    sen=integerValue();

            	    state._fsp--;

            	    stream_integerValue.add(sen.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:144:1: defineWaypoint : ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
    public final flipsParser.defineWaypoint_return defineWaypoint() throws RecognitionException {
        flipsParser.defineWaypoint_return retval = new flipsParser.defineWaypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        Token string_literal44=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        flipsParser.defineWaypointValue_return defineWaypointValue48 = null;


        CommonTree string_literal43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:2: ( ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: ( 'def' | 'define' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==95) ) {
                alt18=1;
            }
            else if ( (LA18_0==96) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:5: 'def'
                    {
                    string_literal43=(Token)match(input,95,FOLLOW_95_in_defineWaypoint693);  
                    stream_95.add(string_literal43);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:11: 'define'
                    {
                    string_literal44=(Token)match(input,96,FOLLOW_96_in_defineWaypoint695);  
                    stream_96.add(string_literal44);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:21: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt19=1;
                }
                break;
            case 109:
                {
                alt19=2;
                }
                break;
            case 110:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:22: 'wpt'
                    {
                    string_literal45=(Token)match(input,108,FOLLOW_108_in_defineWaypoint699);  
                    stream_108.add(string_literal45);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:28: 'waypoint'
                    {
                    string_literal46=(Token)match(input,109,FOLLOW_109_in_defineWaypoint701);  
                    stream_109.add(string_literal46);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:39: 'waypoints'
                    {
                    string_literal47=(Token)match(input,110,FOLLOW_110_in_defineWaypoint703);  
                    stream_110.add(string_literal47);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint706);
            defineWaypointValue48=defineWaypointValue();

            state._fsp--;

            stream_defineWaypointValue.add(defineWaypointValue48.getTree());


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

        Token Identifier49=null;
        Token char_literal50=null;
        Token string_literal52=null;
        Token char_literal53=null;
        Token string_literal54=null;
        Token Identifier55=null;
        Token char_literal56=null;
        flipsParser.geoCoordinate_return geoCoordinate51 = null;

        flipsParser.geoCoordinate_return geoCoordinate57 = null;


        CommonTree Identifier49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree Identifier55_tree=null;
        CommonTree char_literal56_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue722);  
            stream_Identifier.add(Identifier49);

            char_literal50=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue724);  
            stream_100.add(char_literal50);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue726);
            geoCoordinate51=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate51.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Identifier) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==100) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>=101 && LA22_0<=102)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt21=3;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==101) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==102) ) {
            	        alt21=2;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:35: 'and'
            	            {
            	            string_literal52=(Token)match(input,101,FOLLOW_101_in_defineWaypointValue730);  
            	            stream_101.add(string_literal52);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:41: ',' ( 'and' )?
            	            {
            	            char_literal53=(Token)match(input,102,FOLLOW_102_in_defineWaypointValue732);  
            	            stream_102.add(char_literal53);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:45: ( 'and' )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( (LA20_0==101) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:45: 'and'
            	                    {
            	                    string_literal54=(Token)match(input,101,FOLLOW_101_in_defineWaypointValue734);  
            	                    stream_101.add(string_literal54);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier55=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue739);  
            	    stream_Identifier.add(Identifier55);

            	    char_literal56=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue741);  
            	    stream_100.add(char_literal56);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue743);
            	    geoCoordinate57=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate57.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // 151:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_geoCoordinate.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_geoCoordinate.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:151:5: ^( DEFINE Identifier geoCoordinate )
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

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:156:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand58 = null;

        flipsParser.turnCommand_return turnCommand59 = null;

        flipsParser.loiterCommand_return loiterCommand60 = null;

        flipsParser.executeCommand_return executeCommand61 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 111:
            case 112:
                {
                alt23=1;
                }
                break;
            case 113:
            case 114:
                {
                alt23=2;
                }
                break;
            case 115:
            case 116:
                {
                alt23=3;
                }
                break;
            case Identifier:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command770);
                    flyCommand58=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand58.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command775);
                    turnCommand59=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand59.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:159:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command780);
                    loiterCommand60=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand60.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:160:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command785);
                    executeCommand61=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand61.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:163:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal62=null;
        Token string_literal63=null;
        flipsParser.flyCommandValue_return flyCommandValue64 = null;


        CommonTree string_literal62_tree=null;
        CommonTree string_literal63_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: ( 'fly' | 'go' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==111) ) {
                alt24=1;
            }
            else if ( (LA24_0==112) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:5: 'fly'
                    {
                    string_literal62=(Token)match(input,111,FOLLOW_111_in_flyCommand797);  
                    stream_111.add(string_literal62);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:11: 'go'
                    {
                    string_literal63=(Token)match(input,112,FOLLOW_112_in_flyCommand799);  
                    stream_112.add(string_literal63);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: ( flyCommandValue )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=To && LA25_0<=With)||(LA25_0>=Turning && LA25_0<=HexLiteral)||(LA25_0>=117 && LA25_0<=118)||(LA25_0>=120 && LA25_0<=121)||(LA25_0>=123 && LA25_0<=124)||LA25_0==204||(LA25_0>=209 && LA25_0<=257)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand802);
            	    flyCommandValue64=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue64.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
            // 165:2: -> ^( FLY ( flyCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:165:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:165:11: ( flyCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:168:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
    public final flipsParser.flyCommandValue_return flyCommandValue() throws RecognitionException {
        flipsParser.flyCommandValue_return retval = new flipsParser.flyCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To72=null;
        Token string_literal74=null;
        Token char_literal75=null;
        Token string_literal76=null;
        flipsParser.time_return time65 = null;

        flipsParser.direction_return direction66 = null;

        flipsParser.speed_return speed67 = null;

        flipsParser.distance_return distance68 = null;

        flipsParser.pitch_return pitch69 = null;

        flipsParser.roll_return roll70 = null;

        flipsParser.duration_return duration71 = null;

        flipsParser.waypoint_return waypoint73 = null;

        flipsParser.waypoint_return waypoint77 = null;

        flipsParser.altitude_return altitude78 = null;


        CommonTree To72_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt29=9;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue824);
                    time65=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time65.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue829);
                    direction66=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction66.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue834);
                    speed67=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed67.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:172:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue839);
                    distance68=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance68.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:173:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue844);
                    pitch69=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch69.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:174:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue849);
                    roll70=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll70.getTree());

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue854);
                    duration71=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration71.getTree());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To72=(Token)match(input,To,FOLLOW_To_in_flyCommandValue859);  
                    stream_To.add(To72);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue861);
                    waypoint73=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint73.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=101 && LA28_0<=102)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==101) ) {
                    	        alt27=1;
                    	    }
                    	    else if ( (LA27_0==102) ) {
                    	        alt27=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 27, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:18: 'and'
                    	            {
                    	            string_literal74=(Token)match(input,101,FOLLOW_101_in_flyCommandValue865);  
                    	            stream_101.add(string_literal74);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:24: ',' ( 'and' )?
                    	            {
                    	            char_literal75=(Token)match(input,102,FOLLOW_102_in_flyCommandValue867);  
                    	            stream_102.add(char_literal75);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:28: ( 'and' )?
                    	            int alt26=2;
                    	            int LA26_0 = input.LA(1);

                    	            if ( (LA26_0==101) ) {
                    	                alt26=1;
                    	            }
                    	            switch (alt26) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:28: 'and'
                    	                    {
                    	                    string_literal76=(Token)match(input,101,FOLLOW_101_in_flyCommandValue869);  
                    	                    stream_101.add(string_literal76);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue873);
                    	    waypoint77=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
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
                    // 177:2: -> ( waypoint )+
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue886);
                    altitude78=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude78.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal79=null;
        Token string_literal80=null;
        flipsParser.turnCommandValue_return turnCommandValue81 = null;


        CommonTree string_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:4: ( 'trn' | 'turn' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==113) ) {
                alt30=1;
            }
            else if ( (LA30_0==114) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:5: 'trn'
                    {
                    string_literal79=(Token)match(input,113,FOLLOW_113_in_turnCommand898);  
                    stream_113.add(string_literal79);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:11: 'turn'
                    {
                    string_literal80=(Token)match(input,114,FOLLOW_114_in_turnCommand900);  
                    stream_114.add(string_literal80);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:19: ( turnCommandValue )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=Turning && LA31_0<=Heading)||LA31_0==204||(LA31_0>=210 && LA31_0<=240)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand903);
            	    turnCommandValue81=turnCommandValue();

            	    state._fsp--;

            	    stream_turnCommandValue.add(turnCommandValue81.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 183:2: -> ^( FLY ( turnCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:11: ( turnCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:186:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction82 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:2: ( direction )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue925);
            direction82=direction();

            state._fsp--;

            adaptor.addChild(root_0, direction82.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:190:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal83=null;
        Token string_literal84=null;
        flipsParser.loiterCommandValue_return loiterCommandValue85 = null;


        CommonTree string_literal83_tree=null;
        CommonTree string_literal84_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: ( 'ltr' | 'loiter' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==115) ) {
                alt32=1;
            }
            else if ( (LA32_0==116) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:5: 'ltr'
                    {
                    string_literal83=(Token)match(input,115,FOLLOW_115_in_loiterCommand937);  
                    stream_115.add(string_literal83);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:11: 'loiter'
                    {
                    string_literal84=(Token)match(input,116,FOLLOW_116_in_loiterCommand939);  
                    stream_116.add(string_literal84);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:21: ( loiterCommandValue )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=To && LA33_0<=With)||LA33_0==Turning||(LA33_0>=FloatingPointLiteral && LA33_0<=HexLiteral)||LA33_0==127||(LA33_0>=148 && LA33_0<=149)||LA33_0==209||(LA33_0>=241 && LA33_0<=251)||(LA33_0>=258 && LA33_0<=261)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand942);
            	    loiterCommandValue85=loiterCommandValue();

            	    state._fsp--;

            	    stream_loiterCommandValue.add(loiterCommandValue85.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 192:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:192:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:192:14: ( loiterCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
    public final flipsParser.loiterCommandValue_return loiterCommandValue() throws RecognitionException {
        flipsParser.loiterCommandValue_return retval = new flipsParser.loiterCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At91=null;
        flipsParser.time_return time86 = null;

        flipsParser.speed_return speed87 = null;

        flipsParser.loiterDirection_return loiterDirection88 = null;

        flipsParser.radius_return radius89 = null;

        flipsParser.duration_return duration90 = null;

        flipsParser.waypoint_return waypoint92 = null;

        flipsParser.altitude_return altitude93 = null;


        CommonTree At91_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt34=7;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue964);
                    time86=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time86.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue969);
                    speed87=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed87.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue974);
                    loiterDirection88=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection88.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:199:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue979);
                    radius89=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius89.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:200:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue984);
                    duration90=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration90.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:201:4: At waypoint
                    {
                    At91=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue989);  
                    stream_At.add(At91);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue991);
                    waypoint92=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint92.getTree());


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
                    // 202:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:203:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue1001);
                    altitude93=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude93.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier94=null;
        Token Identifier95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal100=null;
        flipsParser.numericValue_return numericValue97 = null;

        flipsParser.numericValue_return numericValue99 = null;


        CommonTree Identifier94_tree=null;
        CommonTree Identifier95_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==103) ) {
                    alt36=2;
                }
                else if ( (LA36_1==EOF||LA36_1==Identifier||(LA36_1>=111 && LA36_1<=116)) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:4: Identifier
                    {
                    Identifier94=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1012);  
                    stream_Identifier.add(Identifier94);



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
                    // 208:2: -> ^( EXECUTE Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:5: ^( EXECUTE Identifier )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:209:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier95=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1026);  
                    stream_Identifier.add(Identifier95);

                    char_literal96=(Token)match(input,103,FOLLOW_103_in_executeCommand1028);  
                    stream_103.add(char_literal96);

                    pushFollow(FOLLOW_numericValue_in_executeCommand1030);
                    numericValue97=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue97.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:209:32: ( ',' numericValue )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==102) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:209:33: ',' numericValue
                    	    {
                    	    char_literal98=(Token)match(input,102,FOLLOW_102_in_executeCommand1033);  
                    	    stream_102.add(char_literal98);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand1035);
                    	    numericValue99=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue99.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    char_literal100=(Token)match(input,104,FOLLOW_104_in_executeCommand1040);  
                    stream_104.add(char_literal100);



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
                    // 210:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:26: ^( PARAMETER numericValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:215:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
    public final flipsParser.pitch_return pitch() throws RecognitionException {
        flipsParser.pitch_return retval = new flipsParser.pitch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Token string_literal102=null;
        Token With104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        flipsParser.angularValue_return angularValue103 = null;

        flipsParser.angularValue_return angularValue109 = null;


        CommonTree string_literal101_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree With104_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree string_literal108_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=117 && LA41_0<=118)) ) {
                alt41=1;
            }
            else if ( (LA41_0==With||(LA41_0>=120 && LA41_0<=121)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:4: ( 'pit' | 'pitch' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==117) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==118) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:5: 'pit'
                            {
                            string_literal101=(Token)match(input,117,FOLLOW_117_in_pitch1070);  
                            stream_117.add(string_literal101);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:11: 'pitch'
                            {
                            string_literal102=(Token)match(input,118,FOLLOW_118_in_pitch1072);  
                            stream_118.add(string_literal102);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1075);
                    angularValue103=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue103.getTree());


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
                    // 217:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:217:5: ^( PITCH angularValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:4: ( With 'an' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==With) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:5: With 'an'
                            {
                            With104=(Token)match(input,With,FOLLOW_With_in_pitch1090);  
                            stream_With.add(With104);

                            string_literal105=(Token)match(input,119,FOLLOW_119_in_pitch1092);  
                            stream_119.add(string_literal105);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:17: ( 'aoa' | 'angle of attack' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==120) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==121) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:18: 'aoa'
                            {
                            string_literal106=(Token)match(input,120,FOLLOW_120_in_pitch1097);  
                            stream_120.add(string_literal106);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:24: 'angle of attack'
                            {
                            string_literal107=(Token)match(input,121,FOLLOW_121_in_pitch1099);  
                            stream_121.add(string_literal107);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:43: ( 'of' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==122) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:43: 'of'
                            {
                            string_literal108=(Token)match(input,122,FOLLOW_122_in_pitch1102);  
                            stream_122.add(string_literal108);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1105);
                    angularValue109=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue109.getTree());


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
                    // 219:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:219:5: ^( PITCH angularValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:222:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal110=null;
        Token string_literal111=null;
        flipsParser.angularValue_return angularValue112 = null;


        CommonTree string_literal110_tree=null;
        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( 'rol' | 'roll' ) angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( 'rol' | 'roll' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==123) ) {
                alt42=1;
            }
            else if ( (LA42_0==124) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: 'rol'
                    {
                    string_literal110=(Token)match(input,123,FOLLOW_123_in_roll1126);  
                    stream_123.add(string_literal110);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:11: 'roll'
                    {
                    string_literal111=(Token)match(input,124,FOLLOW_124_in_roll1128);  
                    stream_124.add(string_literal111);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1131);
            angularValue112=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue112.getTree());


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
            // 224:2: -> ^( ROLL angularValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:224:5: ^( ROLL angularValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:229:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude113 = null;

        flipsParser.relativeAltitude_return relativeAltitude114 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:2: ( fixedAltitude | relativeAltitude )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1153);
                    fixedAltitude113=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude113.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:231:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1158);
                    relativeAltitude114=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude114.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:234:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To116=null;
        Token At117=null;
        Token With118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        flipsParser.upDownDirection_return upDownDirection115 = null;

        flipsParser.altitudeValue_return altitudeValue126 = null;


        CommonTree To116_tree=null;
        CommonTree At117_tree=null;
        CommonTree With118_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: ( ( upDownDirection )? To | At | With )
            int alt45=3;
            switch ( input.LA(1) ) {
            case To:
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
                {
                alt45=1;
                }
                break;
            case At:
                {
                alt45=2;
                }
                break;
            case With:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:5: ( upDownDirection )? To
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:5: ( upDownDirection )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=241 && LA44_0<=251)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1170);
                            upDownDirection115=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection115.getTree());

                            }
                            break;

                    }

                    To116=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1173);  
                    stream_To.add(To116);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:25: At
                    {
                    At117=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1175);  
                    stream_At.add(At117);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:28: With
                    {
                    With118=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1177);  
                    stream_With.add(With118);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==119||(LA52_0>=125 && LA52_0<=129)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==119||(LA50_0>=125 && LA50_0<=126)) ) {
                        alt50=1;
                    }
                    else if ( ((LA50_0>=127 && LA50_0<=129)) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:36: ( 'an' )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==119) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:36: 'an'
                                    {
                                    string_literal119=(Token)match(input,119,FOLLOW_119_in_fixedAltitude1182);  
                                    stream_119.add(string_literal119);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:42: ( 'alt' | 'altitude' )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==125) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==126) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:43: 'alt'
                                    {
                                    string_literal120=(Token)match(input,125,FOLLOW_125_in_fixedAltitude1186);  
                                    stream_125.add(string_literal120);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:49: 'altitude'
                                    {
                                    string_literal121=(Token)match(input,126,FOLLOW_126_in_fixedAltitude1188);  
                                    stream_126.add(string_literal121);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:61: ( 'a' )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==127) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:61: 'a'
                                    {
                                    char_literal122=(Token)match(input,127,FOLLOW_127_in_fixedAltitude1191);  
                                    stream_127.add(char_literal122);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:66: ( 'pres' | 'pressure' )
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==128) ) {
                                alt49=1;
                            }
                            else if ( (LA49_0==129) ) {
                                alt49=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 0, input);

                                throw nvae;
                            }
                            switch (alt49) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:67: 'pres'
                                    {
                                    string_literal123=(Token)match(input,128,FOLLOW_128_in_fixedAltitude1195);  
                                    stream_128.add(string_literal123);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:74: 'pressure'
                                    {
                                    string_literal124=(Token)match(input,129,FOLLOW_129_in_fixedAltitude1197);  
                                    stream_129.add(string_literal124);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:87: ( 'of' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==122) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:87: 'of'
                            {
                            string_literal125=(Token)match(input,122,FOLLOW_122_in_fixedAltitude1201);  
                            stream_122.add(string_literal125);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1206);
            altitudeValue126=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue126.getTree());


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
            // 236:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:236:5: ^( ALTITUDE FIXED altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:239:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection127 = null;

        flipsParser.altitudeValue_return altitudeValue128 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1228);
            upDownDirection127=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection127.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1230);
            altitudeValue128=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue128.getTree());


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
            // 241:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:244:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel131=null;
        flipsParser.distanceValue_return distanceValue129 = null;

        flipsParser.pressureValue_return pressureValue130 = null;


        CommonTree FlightLevel131_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:245:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt53=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA53_1 = input.LA(2);

                if ( ((LA53_1>=130 && LA53_1<=147)) ) {
                    alt53=2;
                }
                else if ( ((LA53_1>=150 && LA53_1<=167)) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA53_2 = input.LA(2);

                if ( ((LA53_2>=130 && LA53_2<=147)) ) {
                    alt53=2;
                }
                else if ( ((LA53_2>=150 && LA53_2<=167)) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
                }
                break;
            case FlightLevel:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:245:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1254);
                    distanceValue129=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue129.getTree());


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
                    // 246:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:247:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1266);
                    pressureValue130=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue130.getTree());


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
                    // 248:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:249:4: FlightLevel
                    {
                    FlightLevel131=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1278);  
                    stream_FlightLevel.add(FlightLevel131);



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
                    // 250:2: -> FLIGHTLEVEL FlightLevel
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:253:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue132 = null;

        flipsParser.pressureUnit_return pressureUnit133 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:2: ( numericValue pressureUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1296);
            numericValue132=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue132.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1298);
            pressureUnit133=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit133.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:257:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token string_literal144=null;
        Token string_literal145=null;
        Token string_literal146=null;
        Token string_literal147=null;
        Token string_literal148=null;
        Token string_literal149=null;
        Token string_literal150=null;
        Token string_literal151=null;

        CommonTree string_literal134_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree string_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree string_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree string_literal147_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 130:
            case 131:
            case 132:
                {
                alt60=1;
                }
                break;
            case 133:
            case 134:
            case 135:
                {
                alt60=2;
                }
                break;
            case 136:
            case 137:
            case 138:
                {
                alt60=3;
                }
                break;
            case 139:
            case 140:
                {
                alt60=4;
                }
                break;
            case 141:
            case 142:
            case 143:
                {
                alt60=5;
                }
                break;
            case 144:
            case 145:
            case 146:
            case 147:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt54=3;
                    switch ( input.LA(1) ) {
                    case 130:
                        {
                        alt54=1;
                        }
                        break;
                    case 131:
                        {
                        alt54=2;
                        }
                        break;
                    case 132:
                        {
                        alt54=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:5: 'kpa'
                            {
                            string_literal134=(Token)match(input,130,FOLLOW_130_in_pressureUnit1310);  
                            stream_130.add(string_literal134);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:11: 'kilopascal'
                            {
                            string_literal135=(Token)match(input,131,FOLLOW_131_in_pressureUnit1312);  
                            stream_131.add(string_literal135);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:24: 'kilopascals'
                            {
                            string_literal136=(Token)match(input,132,FOLLOW_132_in_pressureUnit1314);  
                            stream_132.add(string_literal136);


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
                    // 259:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt55=3;
                    switch ( input.LA(1) ) {
                    case 133:
                        {
                        alt55=1;
                        }
                        break;
                    case 134:
                        {
                        alt55=2;
                        }
                        break;
                    case 135:
                        {
                        alt55=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:5: 'hpa'
                            {
                            string_literal137=(Token)match(input,133,FOLLOW_133_in_pressureUnit1326);  
                            stream_133.add(string_literal137);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:11: 'hectopascal'
                            {
                            string_literal138=(Token)match(input,134,FOLLOW_134_in_pressureUnit1328);  
                            stream_134.add(string_literal138);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:25: 'hectopascals'
                            {
                            string_literal139=(Token)match(input,135,FOLLOW_135_in_pressureUnit1330);  
                            stream_135.add(string_literal139);


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
                    // 261:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt56=3;
                    switch ( input.LA(1) ) {
                    case 136:
                        {
                        alt56=1;
                        }
                        break;
                    case 137:
                        {
                        alt56=2;
                        }
                        break;
                    case 138:
                        {
                        alt56=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:5: 'pa'
                            {
                            string_literal140=(Token)match(input,136,FOLLOW_136_in_pressureUnit1342);  
                            stream_136.add(string_literal140);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:10: 'pascal'
                            {
                            string_literal141=(Token)match(input,137,FOLLOW_137_in_pressureUnit1344);  
                            stream_137.add(string_literal141);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:19: 'pascals'
                            {
                            string_literal142=(Token)match(input,138,FOLLOW_138_in_pressureUnit1346);  
                            stream_138.add(string_literal142);


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
                    // 263:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:4: ( 'bar' | 'bars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:4: ( 'bar' | 'bars' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==139) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==140) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:5: 'bar'
                            {
                            string_literal143=(Token)match(input,139,FOLLOW_139_in_pressureUnit1358);  
                            stream_139.add(string_literal143);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:11: 'bars'
                            {
                            string_literal144=(Token)match(input,140,FOLLOW_140_in_pressureUnit1360);  
                            stream_140.add(string_literal144);


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
                    // 265:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt58=3;
                    switch ( input.LA(1) ) {
                    case 141:
                        {
                        alt58=1;
                        }
                        break;
                    case 142:
                        {
                        alt58=2;
                        }
                        break;
                    case 143:
                        {
                        alt58=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:5: 'mbar'
                            {
                            string_literal145=(Token)match(input,141,FOLLOW_141_in_pressureUnit1372);  
                            stream_141.add(string_literal145);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:12: 'millibar'
                            {
                            string_literal146=(Token)match(input,142,FOLLOW_142_in_pressureUnit1374);  
                            stream_142.add(string_literal146);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:23: 'millibars'
                            {
                            string_literal147=(Token)match(input,143,FOLLOW_143_in_pressureUnit1376);  
                            stream_143.add(string_literal147);


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
                    // 267:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt59=4;
                    switch ( input.LA(1) ) {
                    case 144:
                        {
                        alt59=1;
                        }
                        break;
                    case 145:
                        {
                        alt59=2;
                        }
                        break;
                    case 146:
                        {
                        alt59=3;
                        }
                        break;
                    case 147:
                        {
                        alt59=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:5: 'atm'
                            {
                            string_literal148=(Token)match(input,144,FOLLOW_144_in_pressureUnit1388);  
                            stream_144.add(string_literal148);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:11: 'atms'
                            {
                            string_literal149=(Token)match(input,145,FOLLOW_145_in_pressureUnit1390);  
                            stream_145.add(string_literal149);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:18: 'atmosphere'
                            {
                            string_literal150=(Token)match(input,146,FOLLOW_146_in_pressureUnit1392);  
                            stream_146.add(string_literal150);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:31: 'atmospheres'
                            {
                            string_literal151=(Token)match(input,147,FOLLOW_147_in_pressureUnit1394);  
                            stream_147.add(string_literal151);


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
                    // 269:2: -> ATMOSPHERE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:274:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
    public final flipsParser.radius_return radius() throws RecognitionException {
        flipsParser.radius_return retval = new flipsParser.radius_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal152=null;
        Token With153=null;
        Token char_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal159=null;
        flipsParser.distanceValue_return distanceValue157 = null;

        flipsParser.distanceValue_return distanceValue158 = null;


        CommonTree string_literal152_tree=null;
        CommonTree With153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal159_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:4: ( 'in' | With )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==148) ) {
                alt61=1;
            }
            else if ( (LA61_0==With) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:5: 'in'
                    {
                    string_literal152=(Token)match(input,148,FOLLOW_148_in_radius1414);  
                    stream_148.add(string_literal152);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:10: With
                    {
                    With153=(Token)match(input,With,FOLLOW_With_in_radius1416);  
                    stream_With.add(With153);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:17: ( 'a' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==127) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:17: 'a'
                    {
                    char_literal154=(Token)match(input,127,FOLLOW_127_in_radius1420);  
                    stream_127.add(char_literal154);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==149) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=FloatingPointLiteral && LA64_0<=HexLiteral)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal155=(Token)match(input,149,FOLLOW_149_in_radius1424);  
                    stream_149.add(string_literal155);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:32: ( 'of' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==122) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:32: 'of'
                            {
                            string_literal156=(Token)match(input,122,FOLLOW_122_in_radius1426);  
                            stream_122.add(string_literal156);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1429);
                    distanceValue157=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue157.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1431);
                    distanceValue158=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue158.getTree());
                    string_literal159=(Token)match(input,149,FOLLOW_149_in_radius1433);  
                    stream_149.add(string_literal159);


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
            // 276:2: -> ^( RADIUS distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:276:5: ^( RADIUS distanceValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection160 = null;

        flipsParser.distanceValue_return distanceValue161 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:4: ( leftRightDirection )? distanceValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:4: ( leftRightDirection )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=252 && LA65_0<=257)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1454);
                    leftRightDirection160=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection160.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1457);
            distanceValue161=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue161.getTree());


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
            // 281:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:16: ( leftRightDirection )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:284:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue162 = null;

        flipsParser.distanceUnit_return distanceUnit163 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1480);
            numericValue162=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue162.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1482);
            distanceUnit163=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit163.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:288:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        Token char_literal167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        Token string_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        Token string_literal175=null;
        Token string_literal176=null;
        Token string_literal177=null;
        Token string_literal178=null;
        Token string_literal179=null;
        Token string_literal180=null;
        Token string_literal181=null;
        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal184=null;

        CommonTree string_literal164_tree=null;
        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        CommonTree string_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree string_literal173_tree=null;
        CommonTree string_literal174_tree=null;
        CommonTree string_literal175_tree=null;
        CommonTree string_literal176_tree=null;
        CommonTree string_literal177_tree=null;
        CommonTree string_literal178_tree=null;
        CommonTree string_literal179_tree=null;
        CommonTree string_literal180_tree=null;
        CommonTree string_literal181_tree=null;
        CommonTree string_literal182_tree=null;
        CommonTree string_literal183_tree=null;
        CommonTree string_literal184_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 150:
            case 151:
            case 152:
                {
                alt74=1;
                }
                break;
            case 153:
            case 154:
            case 155:
                {
                alt74=2;
                }
                break;
            case 156:
            case 157:
                {
                alt74=3;
                }
                break;
            case 158:
            case 159:
            case 160:
            case 161:
                {
                alt74=4;
                }
                break;
            case 162:
            case 163:
            case 164:
                {
                alt74=5;
                }
                break;
            case 165:
            case 166:
            case 167:
                {
                alt74=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case 150:
                        {
                        alt66=1;
                        }
                        break;
                    case 151:
                        {
                        alt66=2;
                        }
                        break;
                    case 152:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:5: 'km'
                            {
                            string_literal164=(Token)match(input,150,FOLLOW_150_in_distanceUnit1494);  
                            stream_150.add(string_literal164);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:10: 'kilometer'
                            {
                            string_literal165=(Token)match(input,151,FOLLOW_151_in_distanceUnit1496);  
                            stream_151.add(string_literal165);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:22: 'kilometers'
                            {
                            string_literal166=(Token)match(input,152,FOLLOW_152_in_distanceUnit1498);  
                            stream_152.add(string_literal166);


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
                    // 290:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:4: ( 'm' | 'meter' | 'meters' )
                    int alt67=3;
                    switch ( input.LA(1) ) {
                    case 153:
                        {
                        alt67=1;
                        }
                        break;
                    case 154:
                        {
                        alt67=2;
                        }
                        break;
                    case 155:
                        {
                        alt67=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:5: 'm'
                            {
                            char_literal167=(Token)match(input,153,FOLLOW_153_in_distanceUnit1510);  
                            stream_153.add(char_literal167);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:9: 'meter'
                            {
                            string_literal168=(Token)match(input,154,FOLLOW_154_in_distanceUnit1512);  
                            stream_154.add(string_literal168);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:17: 'meters'
                            {
                            string_literal169=(Token)match(input,155,FOLLOW_155_in_distanceUnit1514);  
                            stream_155.add(string_literal169);


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
                    // 292:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==156) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==157) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:5: 'nm'
                            {
                            string_literal170=(Token)match(input,156,FOLLOW_156_in_distanceUnit1526);  
                            stream_156.add(string_literal170);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal171=(Token)match(input,157,FOLLOW_157_in_distanceUnit1528);  
                            stream_157.add(string_literal171);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:21: ( 'mi' | 'mile' | 'miles' )
                            int alt68=3;
                            switch ( input.LA(1) ) {
                            case 158:
                                {
                                alt68=1;
                                }
                                break;
                            case 159:
                                {
                                alt68=2;
                                }
                                break;
                            case 160:
                                {
                                alt68=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 68, 0, input);

                                throw nvae;
                            }

                            switch (alt68) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:22: 'mi'
                                    {
                                    string_literal172=(Token)match(input,158,FOLLOW_158_in_distanceUnit1531);  
                                    stream_158.add(string_literal172);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:27: 'mile'
                                    {
                                    string_literal173=(Token)match(input,159,FOLLOW_159_in_distanceUnit1533);  
                                    stream_159.add(string_literal173);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:34: 'miles'
                                    {
                                    string_literal174=(Token)match(input,160,FOLLOW_160_in_distanceUnit1535);  
                                    stream_160.add(string_literal174);


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
                    // 294:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:4: ( 'statute' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==161) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:5: 'statute'
                            {
                            string_literal175=(Token)match(input,161,FOLLOW_161_in_distanceUnit1550);  
                            stream_161.add(string_literal175);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:17: ( 'mi' | 'mile' | 'miles' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 158:
                        {
                        alt71=1;
                        }
                        break;
                    case 159:
                        {
                        alt71=2;
                        }
                        break;
                    case 160:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:18: 'mi'
                            {
                            string_literal176=(Token)match(input,158,FOLLOW_158_in_distanceUnit1555);  
                            stream_158.add(string_literal176);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:23: 'mile'
                            {
                            string_literal177=(Token)match(input,159,FOLLOW_159_in_distanceUnit1557);  
                            stream_159.add(string_literal177);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:30: 'miles'
                            {
                            string_literal178=(Token)match(input,160,FOLLOW_160_in_distanceUnit1559);  
                            stream_160.add(string_literal178);


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
                    // 296:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:4: ( 'yd' | 'yard' | 'yards' )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case 162:
                        {
                        alt72=1;
                        }
                        break;
                    case 163:
                        {
                        alt72=2;
                        }
                        break;
                    case 164:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:5: 'yd'
                            {
                            string_literal179=(Token)match(input,162,FOLLOW_162_in_distanceUnit1571);  
                            stream_162.add(string_literal179);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:10: 'yard'
                            {
                            string_literal180=(Token)match(input,163,FOLLOW_163_in_distanceUnit1573);  
                            stream_163.add(string_literal180);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:17: 'yards'
                            {
                            string_literal181=(Token)match(input,164,FOLLOW_164_in_distanceUnit1575);  
                            stream_164.add(string_literal181);


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
                    // 298:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:4: ( 'ft' | 'foot' | 'feet' )
                    int alt73=3;
                    switch ( input.LA(1) ) {
                    case 165:
                        {
                        alt73=1;
                        }
                        break;
                    case 166:
                        {
                        alt73=2;
                        }
                        break;
                    case 167:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:5: 'ft'
                            {
                            string_literal182=(Token)match(input,165,FOLLOW_165_in_distanceUnit1587);  
                            stream_165.add(string_literal182);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:10: 'foot'
                            {
                            string_literal183=(Token)match(input,166,FOLLOW_166_in_distanceUnit1589);  
                            stream_166.add(string_literal183);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:17: 'feet'
                            {
                            string_literal184=(Token)match(input,167,FOLLOW_167_in_distanceUnit1591);  
                            stream_167.add(string_literal184);


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
                    // 300:2: -> FOOT
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:305:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed185 = null;

        flipsParser.relativeSpeed_return relativeSpeed186 = null;

        flipsParser.optimalSpeed_return optimalSpeed187 = null;

        flipsParser.throttleSpeed_return throttleSpeed188 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt75=4;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==At) ) {
                switch ( input.LA(2) ) {
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                    {
                    int LA75_3 = input.LA(3);

                    if ( ((LA75_3>=150 && LA75_3<=167)||(LA75_3>=170 && LA75_3<=176)) ) {
                        alt75=1;
                    }
                    else if ( ((LA75_3>=273 && LA75_3<=274)) ) {
                        alt75=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA75_4 = input.LA(3);

                    if ( ((LA75_4>=150 && LA75_4<=167)||(LA75_4>=170 && LA75_4<=176)) ) {
                        alt75=1;
                    }
                    else if ( ((LA75_4>=273 && LA75_4<=274)) ) {
                        alt75=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                    {
                    alt75=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA75_0>=FloatingPointLiteral && LA75_0<=HexLiteral)) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1610);
                    fixedSpeed185=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed185.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1615);
                    relativeSpeed186=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed186.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:308:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed1620);
                    optimalSpeed187=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed187.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:309:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1625);
                    throttleSpeed188=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed188.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:1: fixedSpeed : At speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At189=null;
        flipsParser.speedValue_return speedValue190 = null;


        CommonTree At189_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:2: ( At speedValue -> ^( SPEED FIXED speedValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:4: At speedValue
            {
            At189=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1636);  
            stream_At.add(At189);

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1638);
            speedValue190=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue190.getTree());


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
            // 314:2: -> ^( SPEED FIXED speedValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:314:5: ^( SPEED FIXED speedValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal192=null;
        Token string_literal194=null;
        Token string_literal196=null;
        Token string_literal198=null;
        flipsParser.speedValue_return speedValue191 = null;

        flipsParser.speedValue_return speedValue193 = null;

        flipsParser.percentValue_return percentValue195 = null;

        flipsParser.percentValue_return percentValue197 = null;


        CommonTree string_literal192_tree=null;
        CommonTree string_literal194_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree string_literal198_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:318:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt76=4;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:318:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1660);
                    speedValue191=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue191.getTree());
                    string_literal192=(Token)match(input,168,FOLLOW_168_in_relativeSpeed1662);  
                    stream_168.add(string_literal192);



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
                    // 319:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:319:5: ^( SPEED RELATIVE FASTER speedValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:320:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1680);
                    speedValue193=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue193.getTree());
                    string_literal194=(Token)match(input,169,FOLLOW_169_in_relativeSpeed1682);  
                    stream_169.add(string_literal194);



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
                    // 321:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:5: ^( SPEED RELATIVE SLOWER speedValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:322:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1700);
                    percentValue195=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue195.getTree());
                    string_literal196=(Token)match(input,168,FOLLOW_168_in_relativeSpeed1702);  
                    stream_168.add(string_literal196);



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
                    // 323:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:5: ^( SPEED RELATIVE FASTER percentValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:324:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1720);
                    percentValue197=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue197.getTree());
                    string_literal198=(Token)match(input,169,FOLLOW_169_in_relativeSpeed1722);  
                    stream_169.add(string_literal198);



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
                    // 325:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:5: ^( SPEED RELATIVE SLOWER percentValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:328:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue199 = null;

        flipsParser.speedUnit_return speedUnit200 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:2: ( numericValue speedUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue1746);
            numericValue199=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue199.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue1748);
            speedUnit200=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit200.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal201=null;
        Token string_literal202=null;
        Token string_literal203=null;
        Token string_literal204=null;
        Token string_literal205=null;
        Token string_literal206=null;
        Token string_literal207=null;
        Token char_literal209=null;
        Token string_literal210=null;
        flipsParser.distanceUnit_return distanceUnit208 = null;

        flipsParser.timeUnit_return timeUnit211 = null;


        CommonTree string_literal201_tree=null;
        CommonTree string_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        CommonTree string_literal204_tree=null;
        CommonTree string_literal205_tree=null;
        CommonTree string_literal206_tree=null;
        CommonTree string_literal207_tree=null;
        CommonTree char_literal209_tree=null;
        CommonTree string_literal210_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:333:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 170:
                {
                alt79=1;
                }
                break;
            case 171:
                {
                alt79=2;
                }
                break;
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
                {
                alt79=3;
                }
                break;
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
            case 164:
            case 165:
            case 166:
            case 167:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:333:4: 'kph'
                    {
                    string_literal201=(Token)match(input,170,FOLLOW_170_in_speedUnit1759);  
                    stream_170.add(string_literal201);



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
                    // 334:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:335:4: 'mph'
                    {
                    string_literal202=(Token)match(input,171,FOLLOW_171_in_speedUnit1771);  
                    stream_171.add(string_literal202);



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
                    // 336:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt77=5;
                    switch ( input.LA(1) ) {
                    case 172:
                        {
                        alt77=1;
                        }
                        break;
                    case 173:
                        {
                        alt77=2;
                        }
                        break;
                    case 174:
                        {
                        alt77=3;
                        }
                        break;
                    case 175:
                        {
                        alt77=4;
                        }
                        break;
                    case 176:
                        {
                        alt77=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:5: 'kn'
                            {
                            string_literal203=(Token)match(input,172,FOLLOW_172_in_speedUnit1784);  
                            stream_172.add(string_literal203);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:10: 'kt'
                            {
                            string_literal204=(Token)match(input,173,FOLLOW_173_in_speedUnit1786);  
                            stream_173.add(string_literal204);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:15: 'kts'
                            {
                            string_literal205=(Token)match(input,174,FOLLOW_174_in_speedUnit1788);  
                            stream_174.add(string_literal205);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:21: 'knot'
                            {
                            string_literal206=(Token)match(input,175,FOLLOW_175_in_speedUnit1790);  
                            stream_175.add(string_literal206);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:28: 'knots'
                            {
                            string_literal207=(Token)match(input,176,FOLLOW_176_in_speedUnit1792);  
                            stream_176.add(string_literal207);


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
                    // 338:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit1807);
                    distanceUnit208=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit208.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:17: ( '/' | 'per' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==177) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==178) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:18: '/'
                            {
                            char_literal209=(Token)match(input,177,FOLLOW_177_in_speedUnit1810);  
                            stream_177.add(char_literal209);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:22: 'per'
                            {
                            string_literal210=(Token)match(input,178,FOLLOW_178_in_speedUnit1812);  
                            stream_178.add(string_literal210);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit1815);
                    timeUnit211=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit211.getTree());


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
                    // 340:2: -> distanceUnit timeUnit
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:343:1: optimalSpeed : At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At212=null;
        Token string_literal214=null;
        Token string_literal215=null;
        flipsParser.optimalUnit_return optimalUnit213 = null;


        CommonTree At212_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree string_literal215_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:2: ( At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:4: At optimalUnit ( 'spd' | 'speed' )
            {
            At212=(Token)match(input,At,FOLLOW_At_in_optimalSpeed1833);  
            stream_At.add(At212);

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed1835);
            optimalUnit213=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit213.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:19: ( 'spd' | 'speed' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==179) ) {
                alt80=1;
            }
            else if ( (LA80_0==180) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:20: 'spd'
                    {
                    string_literal214=(Token)match(input,179,FOLLOW_179_in_optimalSpeed1838);  
                    stream_179.add(string_literal214);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:26: 'speed'
                    {
                    string_literal215=(Token)match(input,180,FOLLOW_180_in_optimalSpeed1840);  
                    stream_180.add(string_literal215);


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
            // 345:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:5: ^( SPEED OPTIMAL optimalUnit )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:348:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal216=null;
        Token string_literal217=null;
        Token string_literal218=null;
        Token string_literal219=null;
        Token string_literal220=null;
        Token string_literal221=null;

        CommonTree string_literal216_tree=null;
        CommonTree string_literal217_tree=null;
        CommonTree string_literal218_tree=null;
        CommonTree string_literal219_tree=null;
        CommonTree string_literal220_tree=null;
        CommonTree string_literal221_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 181:
            case 182:
                {
                alt84=1;
                }
                break;
            case 183:
            case 184:
                {
                alt84=2;
                }
                break;
            case 185:
            case 186:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:4: ( 'min' | 'minimum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:4: ( 'min' | 'minimum' )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==181) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==182) ) {
                        alt81=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:5: 'min'
                            {
                            string_literal216=(Token)match(input,181,FOLLOW_181_in_optimalUnit1864);  
                            stream_181.add(string_literal216);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:11: 'minimum'
                            {
                            string_literal217=(Token)match(input,182,FOLLOW_182_in_optimalUnit1866);  
                            stream_182.add(string_literal217);


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
                    // 350:2: -> MINIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:4: ( 'cru' | 'cruise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:4: ( 'cru' | 'cruise' )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==183) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==184) ) {
                        alt82=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:5: 'cru'
                            {
                            string_literal218=(Token)match(input,183,FOLLOW_183_in_optimalUnit1878);  
                            stream_183.add(string_literal218);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:11: 'cruise'
                            {
                            string_literal219=(Token)match(input,184,FOLLOW_184_in_optimalUnit1880);  
                            stream_184.add(string_literal219);


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
                    // 352:2: -> CRUISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:4: ( 'max' | 'maximum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:4: ( 'max' | 'maximum' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==185) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==186) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:5: 'max'
                            {
                            string_literal220=(Token)match(input,185,FOLLOW_185_in_optimalUnit1892);  
                            stream_185.add(string_literal220);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:11: 'maximum'
                            {
                            string_literal221=(Token)match(input,186,FOLLOW_186_in_optimalUnit1894);  
                            stream_186.add(string_literal221);


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
                    // 354:2: -> MAXIMUM
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:357:1: throttleSpeed : At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At222=null;
        Token string_literal224=null;
        Token string_literal225=null;
        Token string_literal226=null;
        Token string_literal227=null;
        flipsParser.throttleValue_return throttleValue223 = null;


        CommonTree At222_tree=null;
        CommonTree string_literal224_tree=null;
        CommonTree string_literal225_tree=null;
        CommonTree string_literal226_tree=null;
        CommonTree string_literal227_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:2: ( At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:4: At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            At222=(Token)match(input,At,FOLLOW_At_in_throttleSpeed1911);  
            stream_At.add(At222);

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed1913);
            throttleValue223=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue223.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:21: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 187:
                {
                alt85=1;
                }
                break;
            case 188:
                {
                alt85=2;
                }
                break;
            case 189:
                {
                alt85=3;
                }
                break;
            case 190:
                {
                alt85=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:22: 'pwr'
                    {
                    string_literal224=(Token)match(input,187,FOLLOW_187_in_throttleSpeed1916);  
                    stream_187.add(string_literal224);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:28: 'power'
                    {
                    string_literal225=(Token)match(input,188,FOLLOW_188_in_throttleSpeed1918);  
                    stream_188.add(string_literal225);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:36: 'thr'
                    {
                    string_literal226=(Token)match(input,189,FOLLOW_189_in_throttleSpeed1920);  
                    stream_189.add(string_literal226);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:42: 'throttle'
                    {
                    string_literal227=(Token)match(input,190,FOLLOW_190_in_throttleSpeed1922);  
                    stream_190.add(string_literal227);


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
            // 359:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:359:5: ^( SPEED THROTTLE throttleValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue228 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:2: ( percentValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue1945);
            percentValue228=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue228.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:368:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At229=null;
        flipsParser.timeValue_return timeValue230 = null;


        CommonTree At229_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:2: ( At timeValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At229=(Token)match(input,At,FOLLOW_At_in_time1958); 
            At229_tree = (CommonTree)adaptor.create(At229);
            adaptor.addChild(root_0, At229_tree);

            pushFollow(FOLLOW_timeValue_in_time1960);
            timeValue230=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue230.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:372:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal232=null;
        Token string_literal233=null;
        Token string_literal235=null;
        Token string_literal236=null;
        Token string_literal238=null;
        Token string_literal239=null;
        Token string_literal241=null;
        Token string_literal242=null;
        flipsParser.timeFormat_return timeFormat231 = null;

        flipsParser.integerValue_return integerValue234 = null;

        flipsParser.timeFormat_return timeFormat237 = null;

        flipsParser.integerValue_return integerValue240 = null;

        flipsParser.timeFormat_return timeFormat243 = null;


        CommonTree string_literal232_tree=null;
        CommonTree string_literal233_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree string_literal236_tree=null;
        CommonTree string_literal238_tree=null;
        CommonTree string_literal239_tree=null;
        CommonTree string_literal241_tree=null;
        CommonTree string_literal242_tree=null;
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt90=5;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue1971);
                    timeFormat231=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat231.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:15: ( 'am' | 'a.m.' )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==191) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==192) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:16: 'am'
                            {
                            string_literal232=(Token)match(input,191,FOLLOW_191_in_timeValue1974);  
                            stream_191.add(string_literal232);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:21: 'a.m.'
                            {
                            string_literal233=(Token)match(input,192,FOLLOW_192_in_timeValue1976);  
                            stream_192.add(string_literal233);


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
                    // 374:2: -> ^( TIME timeFormat AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:374:5: ^( TIME timeFormat AM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue1993);
                    integerValue234=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue234.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:17: ( 'am' | 'a.m.' )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==191) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==192) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:18: 'am'
                            {
                            string_literal235=(Token)match(input,191,FOLLOW_191_in_timeValue1996);  
                            stream_191.add(string_literal235);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:23: 'a.m.'
                            {
                            string_literal236=(Token)match(input,192,FOLLOW_192_in_timeValue1998);  
                            stream_192.add(string_literal236);


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
                    // 376:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:5: ^( TIME integerValue HOUR AM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2017);
                    timeFormat237=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat237.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:15: ( 'pm' | 'p.m.' )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==193) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==194) ) {
                        alt88=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:16: 'pm'
                            {
                            string_literal238=(Token)match(input,193,FOLLOW_193_in_timeValue2020);  
                            stream_193.add(string_literal238);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:21: 'p.m.'
                            {
                            string_literal239=(Token)match(input,194,FOLLOW_194_in_timeValue2022);  
                            stream_194.add(string_literal239);


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
                    // 378:2: -> ^( TIME timeFormat PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:378:5: ^( TIME timeFormat PM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2039);
                    integerValue240=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue240.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:17: ( 'pm' | 'p.m.' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==193) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==194) ) {
                        alt89=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:18: 'pm'
                            {
                            string_literal241=(Token)match(input,193,FOLLOW_193_in_timeValue2042);  
                            stream_193.add(string_literal241);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:23: 'p.m.'
                            {
                            string_literal242=(Token)match(input,194,FOLLOW_194_in_timeValue2044);  
                            stream_194.add(string_literal242);


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
                    // 380:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:5: ^( TIME integerValue HOUR PM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2063);
                    timeFormat243=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat243.getTree());


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
                    // 382:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:382:5: ^( TIME timeFormat HOUR24 )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal244=null;
        Token char_literal245=null;
        Token char_literal246=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal244_tree=null;
        CommonTree char_literal245_tree=null;
        CommonTree char_literal246_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=BinaryLiteral && LA91_0<=HexLiteral)) ) {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==195) ) {
                    int LA91_2 = input.LA(3);

                    if ( ((LA91_2>=BinaryLiteral && LA91_2<=HexLiteral)) ) {
                        int LA91_3 = input.LA(4);

                        if ( (LA91_3==195) ) {
                            alt91=2;
                        }
                        else if ( (LA91_3==EOF||(LA91_3>=Identifier && LA91_3<=With)||(LA91_3>=Turning && LA91_3<=HexLiteral)||(LA91_3>=111 && LA91_3<=118)||(LA91_3>=120 && LA91_3<=121)||(LA91_3>=123 && LA91_3<=124)||LA91_3==127||(LA91_3>=148 && LA91_3<=149)||(LA91_3>=191 && LA91_3<=194)||LA91_3==204||(LA91_3>=209 && LA91_3<=261)) ) {
                            alt91=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 91, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2087);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal244=(Token)match(input,195,FOLLOW_195_in_timeFormat2089);  
                    stream_195.add(char_literal244);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2093);
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
                    // 387:2: -> $hr HOUR $min MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:388:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2113);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal245=(Token)match(input,195,FOLLOW_195_in_timeFormat2115);  
                    stream_195.add(char_literal245);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2119);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal246=(Token)match(input,195,FOLLOW_195_in_timeFormat2121);  
                    stream_195.add(char_literal246);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2125);
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
                    // 389:2: -> $hr HOUR $min MINUTE $s SECOND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:392:1: timeUnit : ( hour | minute | second );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.hour_return hour247 = null;

        flipsParser.minute_return minute248 = null;

        flipsParser.second_return second249 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:392:9: ( hour | minute | second )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
                {
                alt92=1;
                }
                break;
            case 181:
            case 201:
            case 202:
            case 203:
                {
                alt92=2;
                }
                break;
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:392:11: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2153);
                    hour247=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour247.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:393:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2158);
                    minute248=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute248.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:394:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2163);
                    second249=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second249.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:397:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal250=null;
        Token string_literal251=null;
        Token string_literal252=null;
        Token string_literal253=null;
        Token string_literal254=null;

        CommonTree char_literal250_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree string_literal252_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree string_literal254_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt93=5;
            switch ( input.LA(1) ) {
            case 196:
                {
                alt93=1;
                }
                break;
            case 197:
                {
                alt93=2;
                }
                break;
            case 198:
                {
                alt93=3;
                }
                break;
            case 199:
                {
                alt93=4;
                }
                break;
            case 200:
                {
                alt93=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:5: 'h'
                    {
                    char_literal250=(Token)match(input,196,FOLLOW_196_in_hour2175);  
                    stream_196.add(char_literal250);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:9: 'hr'
                    {
                    string_literal251=(Token)match(input,197,FOLLOW_197_in_hour2177);  
                    stream_197.add(string_literal251);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:14: 'hrs'
                    {
                    string_literal252=(Token)match(input,198,FOLLOW_198_in_hour2179);  
                    stream_198.add(string_literal252);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:20: 'hour'
                    {
                    string_literal253=(Token)match(input,199,FOLLOW_199_in_hour2181);  
                    stream_199.add(string_literal253);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:27: 'hours'
                    {
                    string_literal254=(Token)match(input,200,FOLLOW_200_in_hour2183);  
                    stream_200.add(string_literal254);


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
            // 399:2: -> HOUR
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal255=null;
        Token string_literal256=null;
        Token string_literal257=null;
        Token string_literal258=null;

        CommonTree string_literal255_tree=null;
        CommonTree string_literal256_tree=null;
        CommonTree string_literal257_tree=null;
        CommonTree string_literal258_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 181:
                {
                alt94=1;
                }
                break;
            case 201:
                {
                alt94=2;
                }
                break;
            case 202:
                {
                alt94=3;
                }
                break;
            case 203:
                {
                alt94=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:5: 'min'
                    {
                    string_literal255=(Token)match(input,181,FOLLOW_181_in_minute2201);  
                    stream_181.add(string_literal255);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:11: 'mins'
                    {
                    string_literal256=(Token)match(input,201,FOLLOW_201_in_minute2203);  
                    stream_201.add(string_literal256);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:18: 'minute'
                    {
                    string_literal257=(Token)match(input,202,FOLLOW_202_in_minute2205);  
                    stream_202.add(string_literal257);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:27: 'minutes'
                    {
                    string_literal258=(Token)match(input,203,FOLLOW_203_in_minute2207);  
                    stream_203.add(string_literal258);


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
            // 404:2: -> MINUTE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal259=null;
        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal262=null;
        Token string_literal263=null;

        CommonTree char_literal259_tree=null;
        CommonTree string_literal260_tree=null;
        CommonTree string_literal261_tree=null;
        CommonTree string_literal262_tree=null;
        CommonTree string_literal263_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 204:
                {
                alt95=1;
                }
                break;
            case 205:
                {
                alt95=2;
                }
                break;
            case 206:
                {
                alt95=3;
                }
                break;
            case 207:
                {
                alt95=4;
                }
                break;
            case 208:
                {
                alt95=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:5: 's'
                    {
                    char_literal259=(Token)match(input,204,FOLLOW_204_in_second2225);  
                    stream_204.add(char_literal259);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:9: 'sec'
                    {
                    string_literal260=(Token)match(input,205,FOLLOW_205_in_second2227);  
                    stream_205.add(string_literal260);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:15: 'secs'
                    {
                    string_literal261=(Token)match(input,206,FOLLOW_206_in_second2229);  
                    stream_206.add(string_literal261);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:22: 'second'
                    {
                    string_literal262=(Token)match(input,207,FOLLOW_207_in_second2231);  
                    stream_207.add(string_literal262);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:31: 'seconds'
                    {
                    string_literal263=(Token)match(input,208,FOLLOW_208_in_second2233);  
                    stream_208.add(string_literal263);


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
            // 409:2: -> SECOND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:412:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal264=null;
        flipsParser.durationValue_return durationValue265 = null;


        CommonTree string_literal264_tree=null;
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:4: 'for' durationValue
            {
            string_literal264=(Token)match(input,209,FOLLOW_209_in_duration2250);  
            stream_209.add(string_literal264);

            pushFollow(FOLLOW_durationValue_in_duration2252);
            durationValue265=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue265.getTree());


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
            // 414:2: -> ^( DURATION durationValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:414:5: ^( DURATION durationValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:417:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue266 = null;

        flipsParser.timeUnit_return timeUnit267 = null;

        flipsParser.integerValue_return integerValue268 = null;

        flipsParser.hour_return hour269 = null;

        flipsParser.numericValue_return numericValue270 = null;

        flipsParser.minute_return minute271 = null;

        flipsParser.second_return second272 = null;

        flipsParser.integerValue_return integerValue273 = null;

        flipsParser.hour_return hour274 = null;

        flipsParser.integerValue_return integerValue275 = null;

        flipsParser.minute_return minute276 = null;

        flipsParser.numericValue_return numericValue277 = null;

        flipsParser.second_return second278 = null;

        flipsParser.integerValue_return integerValue279 = null;

        flipsParser.minute_return minute280 = null;

        flipsParser.numericValue_return numericValue281 = null;

        flipsParser.second_return second282 = null;

        flipsParser.timeFormat_return timeFormat283 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt97=5;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2272);
                    numericValue266=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue266.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2274);
                    timeUnit267=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit267.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2279);
                    integerValue268=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue268.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2281);
                    hour269=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour269.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2283);
                    numericValue270=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue270.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:35: ( minute | second )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==181||(LA96_0>=201 && LA96_0<=203)) ) {
                        alt96=1;
                    }
                    else if ( ((LA96_0>=204 && LA96_0<=208)) ) {
                        alt96=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2286);
                            minute271=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute271.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2288);
                            second272=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second272.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:420:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2294);
                    integerValue273=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue273.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2296);
                    hour274=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour274.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2298);
                    integerValue275=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue275.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2300);
                    minute276=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute276.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2302);
                    numericValue277=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue277.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2304);
                    second278=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second278.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:421:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2309);
                    integerValue279=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue279.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2311);
                    minute280=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute280.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2313);
                    numericValue281=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue281.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2315);
                    second282=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second282.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:422:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2320);
                    timeFormat283=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat283.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:427:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection284 = null;

        flipsParser.relativeDirection_return relativeDirection285 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:428:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt98=2;
            switch ( input.LA(1) ) {
            case 204:
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
                {
                alt98=1;
                }
                break;
            case Turning:
                {
                int LA98_2 = input.LA(2);

                if ( ((LA98_2>=252 && LA98_2<=257)) ) {
                    alt98=2;
                }
                else if ( ((LA98_2>=FloatingPointLiteral && LA98_2<=HexLiteral)||LA98_2==204||(LA98_2>=210 && LA98_2<=240)) ) {
                    alt98=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA98_3 = input.LA(2);

                if ( ((LA98_3>=FloatingPointLiteral && LA98_3<=HexLiteral)||LA98_3==204||(LA98_3>=210 && LA98_3<=240)) ) {
                    alt98=1;
                }
                else if ( ((LA98_3>=252 && LA98_3<=257)) ) {
                    alt98=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:428:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2333);
                    fixedDirection284=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection284.getTree());


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
                    // 429:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:5: ^( DIRECTION FIXED fixedDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2349);
                    relativeDirection285=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection285.getTree());


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
                    // 431:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:431:5: ^( DIRECTION RELATIVE relativeDirection )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning289=null;
        Token Heading290=null;
        flipsParser.cardinalDirection_return cardinalDirection286 = null;

        flipsParser.ordinalDirection_return ordinalDirection287 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection288 = null;

        flipsParser.cardinalDirection_return cardinalDirection291 = null;

        flipsParser.ordinalDirection_return ordinalDirection292 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection293 = null;

        flipsParser.angularValue_return angularValue294 = null;


        CommonTree Turning289_tree=null;
        CommonTree Heading290_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 204:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
                {
                alt101=1;
                }
                break;
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
                {
                alt101=2;
                }
                break;
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
                {
                alt101=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt101=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2371);
                    cardinalDirection286=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection286.getTree());


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
                    // 436:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:437:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2381);
                    ordinalDirection287=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection287.getTree());


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
                    // 438:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2391);
                    subOrdinalDirection288=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection288.getTree());


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
                    // 440:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:4: ( Turning | Heading )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==Turning) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==Heading) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:5: Turning
                            {
                            Turning289=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2402);  
                            stream_Turning.add(Turning289);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:13: Heading
                            {
                            Heading290=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2404);  
                            stream_Heading.add(Heading290);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt100=4;
                    switch ( input.LA(1) ) {
                    case 204:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                        {
                        alt100=1;
                        }
                        break;
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                        {
                        alt100=2;
                        }
                        break;
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
                        {
                        alt100=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt100=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }

                    switch (alt100) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2408);
                            cardinalDirection291=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection291.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2410);
                            ordinalDirection292=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection292.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2412);
                            subOrdinalDirection293=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection293.getTree());

                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2414);
                            angularValue294=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue294.getTree());

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
                    // 442:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:63: ( angularValue )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:445:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning295=null;
        Token Heading296=null;
        flipsParser.leftRightDirection_return leftRightDirection297 = null;

        flipsParser.angularValue_return angularValue298 = null;


        CommonTree Turning295_tree=null;
        CommonTree Heading296_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( Turning | Heading )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==Turning) ) {
                alt102=1;
            }
            else if ( (LA102_0==Heading) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:5: Turning
                    {
                    Turning295=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2442);  
                    stream_Turning.add(Turning295);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:13: Heading
                    {
                    Heading296=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2444);  
                    stream_Heading.add(Heading296);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2447);
            leftRightDirection297=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection297.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2449);
            angularValue298=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue298.getTree());


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
            // 447:2: -> leftRightDirection angularValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:450:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection299 = null;

        flipsParser.eastWestDirection_return eastWestDirection300 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:2: ( northSouthDirection | eastWestDirection )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==204||(LA103_0>=210 && LA103_0<=212)) ) {
                alt103=1;
            }
            else if ( ((LA103_0>=213 && LA103_0<=216)) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2467);
                    northSouthDirection299=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection299.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:452:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2472);
                    eastWestDirection300=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection300.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:455:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal301=null;
        Token string_literal302=null;
        Token char_literal303=null;
        Token string_literal304=null;

        CommonTree char_literal301_tree=null;
        CommonTree string_literal302_tree=null;
        CommonTree char_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=210 && LA106_0<=211)) ) {
                alt106=1;
            }
            else if ( (LA106_0==204||LA106_0==212) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:4: ( 'n' | 'north' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:4: ( 'n' | 'north' )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==210) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==211) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:5: 'n'
                            {
                            char_literal301=(Token)match(input,210,FOLLOW_210_in_northSouthDirection2484);  
                            stream_210.add(char_literal301);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:9: 'north'
                            {
                            string_literal302=(Token)match(input,211,FOLLOW_211_in_northSouthDirection2486);  
                            stream_211.add(string_literal302);


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
                    // 457:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:4: ( 's' | 'south' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:4: ( 's' | 'south' )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==204) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==212) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:5: 's'
                            {
                            char_literal303=(Token)match(input,204,FOLLOW_204_in_northSouthDirection2498);  
                            stream_204.add(char_literal303);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:9: 'south'
                            {
                            string_literal304=(Token)match(input,212,FOLLOW_212_in_northSouthDirection2500);  
                            stream_212.add(string_literal304);


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
                    // 459:2: -> SOUTH
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal305=null;
        Token string_literal306=null;
        Token char_literal307=null;
        Token string_literal308=null;

        CommonTree char_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree char_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=213 && LA109_0<=214)) ) {
                alt109=1;
            }
            else if ( ((LA109_0>=215 && LA109_0<=216)) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:4: ( 'e' | 'east' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:4: ( 'e' | 'east' )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==213) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==214) ) {
                        alt107=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:5: 'e'
                            {
                            char_literal305=(Token)match(input,213,FOLLOW_213_in_eastWestDirection2518);  
                            stream_213.add(char_literal305);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:9: 'east'
                            {
                            string_literal306=(Token)match(input,214,FOLLOW_214_in_eastWestDirection2520);  
                            stream_214.add(string_literal306);


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
                    // 464:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:4: ( 'w' | 'west' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:4: ( 'w' | 'west' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==215) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==216) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:5: 'w'
                            {
                            char_literal307=(Token)match(input,215,FOLLOW_215_in_eastWestDirection2532);  
                            stream_215.add(char_literal307);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:9: 'west'
                            {
                            string_literal308=(Token)match(input,216,FOLLOW_216_in_eastWestDirection2534);  
                            stream_216.add(string_literal308);


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
                    // 466:2: -> WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal309=null;
        Token string_literal310=null;
        Token string_literal311=null;
        Token string_literal312=null;
        Token string_literal313=null;
        Token string_literal314=null;
        Token string_literal315=null;
        Token string_literal316=null;

        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        CommonTree string_literal313_tree=null;
        CommonTree string_literal314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree string_literal316_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 217:
            case 218:
                {
                alt114=1;
                }
                break;
            case 219:
            case 220:
                {
                alt114=2;
                }
                break;
            case 221:
            case 222:
                {
                alt114=3;
                }
                break;
            case 223:
            case 224:
                {
                alt114=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:4: ( 'ne' | 'northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:4: ( 'ne' | 'northeast' )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==217) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==218) ) {
                        alt110=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:5: 'ne'
                            {
                            string_literal309=(Token)match(input,217,FOLLOW_217_in_ordinalDirection2552);  
                            stream_217.add(string_literal309);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:10: 'northeast'
                            {
                            string_literal310=(Token)match(input,218,FOLLOW_218_in_ordinalDirection2554);  
                            stream_218.add(string_literal310);


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
                    // 471:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:4: ( 'se' | 'southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:4: ( 'se' | 'southeast' )
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==219) ) {
                        alt111=1;
                    }
                    else if ( (LA111_0==220) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:5: 'se'
                            {
                            string_literal311=(Token)match(input,219,FOLLOW_219_in_ordinalDirection2568);  
                            stream_219.add(string_literal311);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:10: 'southeast'
                            {
                            string_literal312=(Token)match(input,220,FOLLOW_220_in_ordinalDirection2570);  
                            stream_220.add(string_literal312);


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
                    // 473:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:4: ( 'sw' | 'southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:4: ( 'sw' | 'southwest' )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==221) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==222) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:5: 'sw'
                            {
                            string_literal313=(Token)match(input,221,FOLLOW_221_in_ordinalDirection2584);  
                            stream_221.add(string_literal313);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:10: 'southwest'
                            {
                            string_literal314=(Token)match(input,222,FOLLOW_222_in_ordinalDirection2586);  
                            stream_222.add(string_literal314);


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
                    // 475:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:4: ( 'nw' | 'northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:4: ( 'nw' | 'northwest' )
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==223) ) {
                        alt113=1;
                    }
                    else if ( (LA113_0==224) ) {
                        alt113=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }
                    switch (alt113) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:5: 'nw'
                            {
                            string_literal315=(Token)match(input,223,FOLLOW_223_in_ordinalDirection2600);  
                            stream_223.add(string_literal315);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:10: 'northwest'
                            {
                            string_literal316=(Token)match(input,224,FOLLOW_224_in_ordinalDirection2602);  
                            stream_224.add(string_literal316);


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
                    // 477:2: -> NORTH WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:480:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal317=null;
        Token string_literal318=null;
        Token string_literal319=null;
        Token string_literal320=null;
        Token string_literal321=null;
        Token string_literal322=null;
        Token string_literal323=null;
        Token string_literal324=null;
        Token string_literal325=null;
        Token string_literal326=null;
        Token string_literal327=null;
        Token string_literal328=null;
        Token string_literal329=null;
        Token string_literal330=null;
        Token string_literal331=null;
        Token string_literal332=null;

        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        CommonTree string_literal319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree string_literal321_tree=null;
        CommonTree string_literal322_tree=null;
        CommonTree string_literal323_tree=null;
        CommonTree string_literal324_tree=null;
        CommonTree string_literal325_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree string_literal327_tree=null;
        CommonTree string_literal328_tree=null;
        CommonTree string_literal329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree string_literal331_tree=null;
        CommonTree string_literal332_tree=null;
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt123=8;
            switch ( input.LA(1) ) {
            case 225:
            case 226:
                {
                alt123=1;
                }
                break;
            case 227:
            case 228:
                {
                alt123=2;
                }
                break;
            case 229:
            case 230:
                {
                alt123=3;
                }
                break;
            case 231:
            case 232:
                {
                alt123=4;
                }
                break;
            case 233:
            case 234:
                {
                alt123=5;
                }
                break;
            case 235:
            case 236:
                {
                alt123=6;
                }
                break;
            case 237:
            case 238:
                {
                alt123=7;
                }
                break;
            case 239:
            case 240:
                {
                alt123=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:4: ( 'nne' | 'north-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:4: ( 'nne' | 'north-northeast' )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==225) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==226) ) {
                        alt115=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:5: 'nne'
                            {
                            string_literal317=(Token)match(input,225,FOLLOW_225_in_subOrdinalDirection2622);  
                            stream_225.add(string_literal317);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:11: 'north-northeast'
                            {
                            string_literal318=(Token)match(input,226,FOLLOW_226_in_subOrdinalDirection2624);  
                            stream_226.add(string_literal318);


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
                    // 482:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( 'ene' | 'east-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( 'ene' | 'east-northeast' )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==227) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==228) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:5: 'ene'
                            {
                            string_literal319=(Token)match(input,227,FOLLOW_227_in_subOrdinalDirection2640);  
                            stream_227.add(string_literal319);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:11: 'east-northeast'
                            {
                            string_literal320=(Token)match(input,228,FOLLOW_228_in_subOrdinalDirection2642);  
                            stream_228.add(string_literal320);


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
                    // 484:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:4: ( 'ese' | 'east-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:4: ( 'ese' | 'east-southeast' )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==229) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==230) ) {
                        alt117=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:5: 'ese'
                            {
                            string_literal321=(Token)match(input,229,FOLLOW_229_in_subOrdinalDirection2658);  
                            stream_229.add(string_literal321);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:11: 'east-southeast'
                            {
                            string_literal322=(Token)match(input,230,FOLLOW_230_in_subOrdinalDirection2660);  
                            stream_230.add(string_literal322);


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
                    // 486:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:4: ( 'sse' | 'south-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:4: ( 'sse' | 'south-southeast' )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==231) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==232) ) {
                        alt118=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:5: 'sse'
                            {
                            string_literal323=(Token)match(input,231,FOLLOW_231_in_subOrdinalDirection2676);  
                            stream_231.add(string_literal323);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:11: 'south-southeast'
                            {
                            string_literal324=(Token)match(input,232,FOLLOW_232_in_subOrdinalDirection2678);  
                            stream_232.add(string_literal324);


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
                    // 488:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:4: ( 'ssw' | 'south-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:4: ( 'ssw' | 'south-southwest' )
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==233) ) {
                        alt119=1;
                    }
                    else if ( (LA119_0==234) ) {
                        alt119=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 0, input);

                        throw nvae;
                    }
                    switch (alt119) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:5: 'ssw'
                            {
                            string_literal325=(Token)match(input,233,FOLLOW_233_in_subOrdinalDirection2694);  
                            stream_233.add(string_literal325);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:11: 'south-southwest'
                            {
                            string_literal326=(Token)match(input,234,FOLLOW_234_in_subOrdinalDirection2696);  
                            stream_234.add(string_literal326);


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
                    // 490:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:4: ( 'wsw' | 'west-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:4: ( 'wsw' | 'west-southwest' )
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==235) ) {
                        alt120=1;
                    }
                    else if ( (LA120_0==236) ) {
                        alt120=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 120, 0, input);

                        throw nvae;
                    }
                    switch (alt120) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:5: 'wsw'
                            {
                            string_literal327=(Token)match(input,235,FOLLOW_235_in_subOrdinalDirection2712);  
                            stream_235.add(string_literal327);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:11: 'west-southwest'
                            {
                            string_literal328=(Token)match(input,236,FOLLOW_236_in_subOrdinalDirection2714);  
                            stream_236.add(string_literal328);


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
                    // 492:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:4: ( 'wnw' | 'west-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:4: ( 'wnw' | 'west-northwest' )
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==237) ) {
                        alt121=1;
                    }
                    else if ( (LA121_0==238) ) {
                        alt121=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }
                    switch (alt121) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:5: 'wnw'
                            {
                            string_literal329=(Token)match(input,237,FOLLOW_237_in_subOrdinalDirection2730);  
                            stream_237.add(string_literal329);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:11: 'west-northwest'
                            {
                            string_literal330=(Token)match(input,238,FOLLOW_238_in_subOrdinalDirection2732);  
                            stream_238.add(string_literal330);


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
                    // 494:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'nnw' | 'north-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'nnw' | 'north-northwest' )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==239) ) {
                        alt122=1;
                    }
                    else if ( (LA122_0==240) ) {
                        alt122=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }
                    switch (alt122) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:5: 'nnw'
                            {
                            string_literal331=(Token)match(input,239,FOLLOW_239_in_subOrdinalDirection2748);  
                            stream_239.add(string_literal331);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:11: 'north-northwest'
                            {
                            string_literal332=(Token)match(input,240,FOLLOW_240_in_subOrdinalDirection2750);  
                            stream_240.add(string_literal332);


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
                    // 496:2: -> NORTH NORTH WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:499:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning333=null;
        flipsParser.clockDirection_return clockDirection334 = null;


        CommonTree Turning333_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: ( Turning )? clockDirection
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: ( Turning )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==Turning) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: Turning
                    {
                    Turning333=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection2771);  
                    stream_Turning.add(Turning333);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection2774);
            clockDirection334=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection334.getTree());


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
            // 501:2: -> ^( DIRECTION TURN clockDirection )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:501:5: ^( DIRECTION TURN clockDirection )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal335=null;
        Token string_literal336=null;
        Token char_literal337=null;
        Token string_literal338=null;
        Token string_literal339=null;
        Token string_literal340=null;
        Token string_literal341=null;
        Token char_literal342=null;
        Token string_literal343=null;
        Token string_literal344=null;
        Token string_literal345=null;

        CommonTree char_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree char_literal337_tree=null;
        CommonTree string_literal338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree string_literal341_tree=null;
        CommonTree char_literal342_tree=null;
        CommonTree string_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        CommonTree string_literal345_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( ((LA127_0>=241 && LA127_0<=247)) ) {
                alt127=1;
            }
            else if ( ((LA127_0>=248 && LA127_0<=251)) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt125=7;
                    switch ( input.LA(1) ) {
                    case 241:
                        {
                        alt125=1;
                        }
                        break;
                    case 242:
                        {
                        alt125=2;
                        }
                        break;
                    case 243:
                        {
                        alt125=3;
                        }
                        break;
                    case 244:
                        {
                        alt125=4;
                        }
                        break;
                    case 245:
                        {
                        alt125=5;
                        }
                        break;
                    case 246:
                        {
                        alt125=6;
                        }
                        break;
                    case 247:
                        {
                        alt125=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 125, 0, input);

                        throw nvae;
                    }

                    switch (alt125) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:5: 'u'
                            {
                            char_literal335=(Token)match(input,241,FOLLOW_241_in_upDownDirection2797);  
                            stream_241.add(char_literal335);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:9: 'up'
                            {
                            string_literal336=(Token)match(input,242,FOLLOW_242_in_upDownDirection2799);  
                            stream_242.add(string_literal336);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:14: 'c'
                            {
                            char_literal337=(Token)match(input,243,FOLLOW_243_in_upDownDirection2801);  
                            stream_243.add(char_literal337);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:18: 'climb'
                            {
                            string_literal338=(Token)match(input,244,FOLLOW_244_in_upDownDirection2803);  
                            stream_244.add(string_literal338);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:26: 'climbing'
                            {
                            string_literal339=(Token)match(input,245,FOLLOW_245_in_upDownDirection2805);  
                            stream_245.add(string_literal339);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:37: 'ascend'
                            {
                            string_literal340=(Token)match(input,246,FOLLOW_246_in_upDownDirection2807);  
                            stream_246.add(string_literal340);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:46: 'ascending'
                            {
                            string_literal341=(Token)match(input,247,FOLLOW_247_in_upDownDirection2809);  
                            stream_247.add(string_literal341);


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
                    // 506:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt126=4;
                    switch ( input.LA(1) ) {
                    case 248:
                        {
                        alt126=1;
                        }
                        break;
                    case 249:
                        {
                        alt126=2;
                        }
                        break;
                    case 250:
                        {
                        alt126=3;
                        }
                        break;
                    case 251:
                        {
                        alt126=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }

                    switch (alt126) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:5: 'd'
                            {
                            char_literal342=(Token)match(input,248,FOLLOW_248_in_upDownDirection2821);  
                            stream_248.add(char_literal342);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:9: 'down'
                            {
                            string_literal343=(Token)match(input,249,FOLLOW_249_in_upDownDirection2823);  
                            stream_249.add(string_literal343);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:16: 'descend'
                            {
                            string_literal344=(Token)match(input,250,FOLLOW_250_in_upDownDirection2825);  
                            stream_250.add(string_literal344);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:26: 'descending'
                            {
                            string_literal345=(Token)match(input,251,FOLLOW_251_in_upDownDirection2827);  
                            stream_251.add(string_literal345);


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
                    // 508:2: -> DESCEND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:511:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal346=null;
        Token string_literal347=null;
        Token string_literal348=null;
        Token char_literal349=null;
        Token string_literal350=null;
        Token string_literal351=null;

        CommonTree char_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        CommonTree string_literal348_tree=null;
        CommonTree char_literal349_tree=null;
        CommonTree string_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=252 && LA130_0<=254)) ) {
                alt130=1;
            }
            else if ( ((LA130_0>=255 && LA130_0<=257)) ) {
                alt130=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:4: ( 'l' | 'left' | 'port' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:4: ( 'l' | 'left' | 'port' )
                    int alt128=3;
                    switch ( input.LA(1) ) {
                    case 252:
                        {
                        alt128=1;
                        }
                        break;
                    case 253:
                        {
                        alt128=2;
                        }
                        break;
                    case 254:
                        {
                        alt128=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;
                    }

                    switch (alt128) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:5: 'l'
                            {
                            char_literal346=(Token)match(input,252,FOLLOW_252_in_leftRightDirection2845);  
                            stream_252.add(char_literal346);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:9: 'left'
                            {
                            string_literal347=(Token)match(input,253,FOLLOW_253_in_leftRightDirection2847);  
                            stream_253.add(string_literal347);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:16: 'port'
                            {
                            string_literal348=(Token)match(input,254,FOLLOW_254_in_leftRightDirection2849);  
                            stream_254.add(string_literal348);


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
                    // 513:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:4: ( 'r' | 'right' | 'starboard' )
                    int alt129=3;
                    switch ( input.LA(1) ) {
                    case 255:
                        {
                        alt129=1;
                        }
                        break;
                    case 256:
                        {
                        alt129=2;
                        }
                        break;
                    case 257:
                        {
                        alt129=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }

                    switch (alt129) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:5: 'r'
                            {
                            char_literal349=(Token)match(input,255,FOLLOW_255_in_leftRightDirection2861);  
                            stream_255.add(char_literal349);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:9: 'right'
                            {
                            string_literal350=(Token)match(input,256,FOLLOW_256_in_leftRightDirection2863);  
                            stream_256.add(string_literal350);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:17: 'starboard'
                            {
                            string_literal351=(Token)match(input,257,FOLLOW_257_in_leftRightDirection2865);  
                            stream_257.add(string_literal351);


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
                    // 515:2: -> RIGHT
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal352=null;
        Token string_literal353=null;
        Token string_literal354=null;
        Token string_literal355=null;

        CommonTree string_literal352_tree=null;
        CommonTree string_literal353_tree=null;
        CommonTree string_literal354_tree=null;
        CommonTree string_literal355_tree=null;
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=258 && LA133_0<=259)) ) {
                alt133=1;
            }
            else if ( ((LA133_0>=260 && LA133_0<=261)) ) {
                alt133=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:4: ( 'cw' | 'clockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:4: ( 'cw' | 'clockwise' )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==258) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==259) ) {
                        alt131=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:5: 'cw'
                            {
                            string_literal352=(Token)match(input,258,FOLLOW_258_in_clockDirection2883);  
                            stream_258.add(string_literal352);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:10: 'clockwise'
                            {
                            string_literal353=(Token)match(input,259,FOLLOW_259_in_clockDirection2885);  
                            stream_259.add(string_literal353);


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
                    // 520:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:4: ( 'ccw' | 'counterclockwise' )
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:5: 'ccw'
                            {
                            string_literal354=(Token)match(input,260,FOLLOW_260_in_clockDirection2897);  
                            stream_260.add(string_literal354);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:11: 'counterclockwise'
                            {
                            string_literal355=(Token)match(input,261,FOLLOW_261_in_clockDirection2899);  
                            stream_261.add(string_literal355);


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
                    // 522:2: -> COUNTERCLOCKWISE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal357=null;
        Token string_literal358=null;
        Token string_literal359=null;
        Token string_literal360=null;
        Token char_literal362=null;
        Token char_literal364=null;
        Token string_literal366=null;
        Token string_literal367=null;
        Token string_literal368=null;
        Token string_literal369=null;
        flipsParser.numericValue_return numericValue356 = null;

        flipsParser.integerValue_return integerValue361 = null;

        flipsParser.numericValue_return numericValue363 = null;

        flipsParser.numericValue_return numericValue365 = null;


        CommonTree string_literal357_tree=null;
        CommonTree string_literal358_tree=null;
        CommonTree string_literal359_tree=null;
        CommonTree string_literal360_tree=null;
        CommonTree char_literal362_tree=null;
        CommonTree char_literal364_tree=null;
        CommonTree string_literal366_tree=null;
        CommonTree string_literal367_tree=null;
        CommonTree string_literal368_tree=null;
        CommonTree string_literal369_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt136=3;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=BinaryLiteral && LA136_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 262:
                case 263:
                case 264:
                case 265:
                    {
                    alt136=1;
                    }
                    break;
                case 248:
                    {
                    alt136=2;
                    }
                    break;
                case 267:
                case 268:
                case 269:
                case 270:
                    {
                    alt136=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 136, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA136_0==FloatingPointLiteral) ) {
                int LA136_2 = input.LA(2);

                if ( ((LA136_2>=267 && LA136_2<=270)) ) {
                    alt136=3;
                }
                else if ( ((LA136_2>=262 && LA136_2<=265)) ) {
                    alt136=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 136, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue2916);
                    numericValue356=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue356.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt134=4;
                    switch ( input.LA(1) ) {
                    case 262:
                        {
                        alt134=1;
                        }
                        break;
                    case 263:
                        {
                        alt134=2;
                        }
                        break;
                    case 264:
                        {
                        alt134=3;
                        }
                        break;
                    case 265:
                        {
                        alt134=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 134, 0, input);

                        throw nvae;
                    }

                    switch (alt134) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:18: 'deg'
                            {
                            string_literal357=(Token)match(input,262,FOLLOW_262_in_angularValue2919);  
                            stream_262.add(string_literal357);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:24: 'degs'
                            {
                            string_literal358=(Token)match(input,263,FOLLOW_263_in_angularValue2921);  
                            stream_263.add(string_literal358);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:31: 'degree'
                            {
                            string_literal359=(Token)match(input,264,FOLLOW_264_in_angularValue2923);  
                            stream_264.add(string_literal359);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:40: 'degrees'
                            {
                            string_literal360=(Token)match(input,265,FOLLOW_265_in_angularValue2925);  
                            stream_265.add(string_literal360);


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
                    // 527:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:528:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue2938);
                    integerValue361=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue361.getTree());
                    char_literal362=(Token)match(input,248,FOLLOW_248_in_angularValue2940);  
                    stream_248.add(char_literal362);

                    pushFollow(FOLLOW_numericValue_in_angularValue2942);
                    numericValue363=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue363.getTree());
                    char_literal364=(Token)match(input,266,FOLLOW_266_in_angularValue2944);  
                    stream_266.add(char_literal364);



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
                    // 529:2: -> integerValue DEGREE numericValue MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue2960);
                    numericValue365=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue365.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt135=4;
                    switch ( input.LA(1) ) {
                    case 267:
                        {
                        alt135=1;
                        }
                        break;
                    case 268:
                        {
                        alt135=2;
                        }
                        break;
                    case 269:
                        {
                        alt135=3;
                        }
                        break;
                    case 270:
                        {
                        alt135=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }

                    switch (alt135) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:18: 'rad'
                            {
                            string_literal366=(Token)match(input,267,FOLLOW_267_in_angularValue2963);  
                            stream_267.add(string_literal366);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:24: 'rads'
                            {
                            string_literal367=(Token)match(input,268,FOLLOW_268_in_angularValue2965);  
                            stream_268.add(string_literal367);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:31: 'radian'
                            {
                            string_literal368=(Token)match(input,269,FOLLOW_269_in_angularValue2967);  
                            stream_269.add(string_literal368);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:40: 'radians'
                            {
                            string_literal369=(Token)match(input,270,FOLLOW_270_in_angularValue2969);  
                            stream_270.add(string_literal369);


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
                    // 531:2: -> numericValue RADIAN
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:1: waypoint : ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier371=null;
        flipsParser.geoCoordinate_return geoCoordinate370 = null;


        CommonTree Identifier371_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:2: ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=FloatingPointLiteral && LA137_0<=HexLiteral)||(LA137_0>=271 && LA137_0<=272)) ) {
                alt137=1;
            }
            else if ( (LA137_0==Identifier) ) {
                alt137=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint2990);
                    geoCoordinate370=geoCoordinate();

                    state._fsp--;

                    stream_geoCoordinate.add(geoCoordinate370.getTree());


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
                    // 538:2: -> geoCoordinate
                    {
                        adaptor.addChild(root_0, stream_geoCoordinate.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: Identifier
                    {
                    Identifier371=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint3000);  
                    stream_Identifier.add(Identifier371);



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
                    // 540:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:5: ^( WAYPOINT Identifier )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:1: geoCoordinate : latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) ;
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude372 = null;


        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:4: latitudeLongitude
            {
            pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate3020);
            latitudeLongitude372=latitudeLongitude();

            state._fsp--;

            stream_latitudeLongitude.add(latitudeLongitude372.getTree());


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
            // 545:2: -> ^( GEOCOORDINATE latitudeLongitude )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:5: ^( GEOCOORDINATE latitudeLongitude )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

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
        return retval;
    }
    // $ANTLR end "geoCoordinate"

    public static class latitudeLongitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:548:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal374=null;
        Token char_literal376=null;
        Token char_literal377=null;
        Token char_literal378=null;
        Token char_literal379=null;
        Token char_literal380=null;
        Token char_literal381=null;
        Token char_literal382=null;
        Token char_literal383=null;
        Token char_literal384=null;
        Token char_literal385=null;
        Token char_literal386=null;
        Token char_literal387=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection373 = null;

        flipsParser.eastWestDirection_return eastWestDirection375 = null;


        CommonTree char_literal374_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree char_literal377_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree char_literal379_tree=null;
        CommonTree char_literal380_tree=null;
        CommonTree char_literal381_tree=null;
        CommonTree char_literal382_tree=null;
        CommonTree char_literal383_tree=null;
        CommonTree char_literal384_tree=null;
        CommonTree char_literal385_tree=null;
        CommonTree char_literal386_tree=null;
        CommonTree char_literal387_tree=null;
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt147=5;
            alt147 = dfa147.predict(input);
            switch (alt147) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3042);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3044);
                    northSouthDirection373=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection373.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:49: ( ',' )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==102) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:49: ','
                            {
                            char_literal374=(Token)match(input,102,FOLLOW_102_in_latitudeLongitude3046);  
                            stream_102.add(char_literal374);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3051);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3053);
                    eastWestDirection375=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection375.getTree());


                    // AST REWRITE
                    // elements: northSouthDirection, y, eastWestDirection, x
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
                    // 550:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:40: ^( LONGITUDE $y eastWestDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: ( '+' )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==271) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: '+'
                            {
                            char_literal376=(Token)match(input,271,FOLLOW_271_in_latitudeLongitude3079);  
                            stream_271.add(char_literal376);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3084);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:34: ( ',' )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==102) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:34: ','
                            {
                            char_literal377=(Token)match(input,102,FOLLOW_102_in_latitudeLongitude3086);  
                            stream_102.add(char_literal377);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:39: ( '+' )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==271) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:39: '+'
                            {
                            char_literal378=(Token)match(input,271,FOLLOW_271_in_latitudeLongitude3089);  
                            stream_271.add(char_literal378);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3094);
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
                    // 552:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal379=(Token)match(input,272,FOLLOW_272_in_latitudeLongitude3120);  
                    stream_272.add(char_literal379);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3124);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:33: ( ',' )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==102) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:33: ','
                            {
                            char_literal380=(Token)match(input,102,FOLLOW_102_in_latitudeLongitude3126);  
                            stream_102.add(char_literal380);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:38: ( '+' )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==271) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:38: '+'
                            {
                            char_literal381=(Token)match(input,271,FOLLOW_271_in_latitudeLongitude3129);  
                            stream_271.add(char_literal381);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3134);
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
                    // 554:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:4: ( '+' )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==271) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:4: '+'
                            {
                            char_literal382=(Token)match(input,271,FOLLOW_271_in_latitudeLongitude3160);  
                            stream_271.add(char_literal382);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3165);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:34: ( ',' )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==102) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:34: ','
                            {
                            char_literal383=(Token)match(input,102,FOLLOW_102_in_latitudeLongitude3167);  
                            stream_102.add(char_literal383);


                            }
                            break;

                    }

                    char_literal384=(Token)match(input,272,FOLLOW_272_in_latitudeLongitude3170);  
                    stream_272.add(char_literal384);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3174);
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
                    // 556:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:26: ^( LONGITUDE $y WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal385=(Token)match(input,272,FOLLOW_272_in_latitudeLongitude3200);  
                    stream_272.add(char_literal385);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3204);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:33: ( ',' )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==102) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:33: ','
                            {
                            char_literal386=(Token)match(input,102,FOLLOW_102_in_latitudeLongitude3206);  
                            stream_102.add(char_literal386);


                            }
                            break;

                    }

                    char_literal387=(Token)match(input,272,FOLLOW_272_in_latitudeLongitude3209);  
                    stream_272.add(char_literal387);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3213);
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
                    // 558:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:26: ^( LONGITUDE $y WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:561:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue388 = null;

        flipsParser.angularValue_return angularValue389 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( ((LA148_0>=BinaryLiteral && LA148_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 262:
                case 263:
                case 264:
                case 265:
                case 267:
                case 268:
                case 269:
                case 270:
                    {
                    alt148=2;
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
                case 95:
                case 96:
                case 101:
                case 102:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 120:
                case 121:
                case 123:
                case 124:
                case 127:
                case 148:
                case 149:
                case 204:
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
                case 261:
                case 271:
                case 272:
                    {
                    alt148=1;
                    }
                    break;
                case 248:
                    {
                    switch ( input.LA(3) ) {
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA148_6 = input.LA(4);

                        if ( ((LA148_6>=130 && LA148_6<=147)||(LA148_6>=150 && LA148_6<=167)) ) {
                            alt148=1;
                        }
                        else if ( (LA148_6==266) ) {
                            alt148=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA148_7 = input.LA(4);

                        if ( ((LA148_7>=130 && LA148_7<=147)||(LA148_7>=150 && LA148_7<=167)) ) {
                            alt148=1;
                        }
                        else if ( (LA148_7==266) ) {
                            alt148=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case To:
                    case FlightLevel:
                        {
                        alt148=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 148, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA148_0==FloatingPointLiteral) ) {
                int LA148_2 = input.LA(2);

                if ( ((LA148_2>=262 && LA148_2<=265)||(LA148_2>=267 && LA148_2<=270)) ) {
                    alt148=2;
                }
                else if ( (LA148_2==EOF||(LA148_2>=Identifier && LA148_2<=With)||(LA148_2>=Turning && LA148_2<=HexLiteral)||(LA148_2>=95 && LA148_2<=96)||(LA148_2>=101 && LA148_2<=102)||(LA148_2>=111 && LA148_2<=118)||(LA148_2>=120 && LA148_2<=121)||(LA148_2>=123 && LA148_2<=124)||LA148_2==127||(LA148_2>=148 && LA148_2<=149)||LA148_2==204||(LA148_2>=209 && LA148_2<=261)||(LA148_2>=271 && LA148_2<=272)) ) {
                    alt148=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 148, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3245);
                    numericValue388=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue388.getTree());


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
                    // 563:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:564:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3257);
                    angularValue389=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue389.getTree());

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

    public static class numericValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral391=null;
        flipsParser.integerValue_return integerValue390 = null;


        CommonTree FloatingPointLiteral391_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:2: ( integerValue | FloatingPointLiteral )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=BinaryLiteral && LA149_0<=HexLiteral)) ) {
                alt149=1;
            }
            else if ( (LA149_0==FloatingPointLiteral) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3270);
                    integerValue390=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue390.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:571:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral391=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3275); 
                    FloatingPointLiteral391_tree = (CommonTree)adaptor.create(FloatingPointLiteral391);
                    adaptor.addChild(root_0, FloatingPointLiteral391_tree);


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:574:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set392=null;

        CommonTree set392_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:575:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set392=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set392));
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:581:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal394=null;
        Token string_literal395=null;
        flipsParser.numericValue_return numericValue393 = null;


        CommonTree char_literal394_tree=null;
        CommonTree string_literal395_tree=null;
        RewriteRuleTokenStream stream_274=new RewriteRuleTokenStream(adaptor,"token 274");
        RewriteRuleTokenStream stream_273=new RewriteRuleTokenStream(adaptor,"token 273");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3312);
            numericValue393=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue393.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:17: ( '%' | 'percent' )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==273) ) {
                alt150=1;
            }
            else if ( (LA150_0==274) ) {
                alt150=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:18: '%'
                    {
                    char_literal394=(Token)match(input,273,FOLLOW_273_in_percentValue3315);  
                    stream_273.add(char_literal394);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:22: 'percent'
                    {
                    string_literal395=(Token)match(input,274,FOLLOW_274_in_percentValue3317);  
                    stream_274.add(string_literal395);


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
            // 583:2: -> numericValue PERCENT
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


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA147 dfa147 = new DFA147(this);
    static final String DFA29_eotS =
        "\76\uffff";
    static final String DFA29_eofS =
        "\17\uffff\7\5\2\uffff\11\5\5\uffff\7\13\2\uffff\11\13\3\5\3\13";
    static final String DFA29_minS =
        "\1\113\1\116\1\uffff\2\u0096\2\uffff\1\116\2\uffff\1\112\1\uffff"+
        "\2\u0082\1\uffff\7\112\2\u009e\11\112\1\170\2\121\2\uffff\7\112"+
        "\2\u009e\17\112";
    static final String DFA29_maxS =
        "\1\u0101\1\u00ba\1\uffff\2\u0112\2\uffff\1\u0081\2\uffff\1\u0110"+
        "\1\uffff\2\u0112\1\uffff\7\u0101\2\u00a0\11\u0101\1\176\2\u0110"+
        "\2\uffff\7\u0101\2\u00a0\17\u0101";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\2\uffff"+
        "\1\3\25\uffff\1\10\1\1\30\uffff";
    static final String DFA29_specialS =
        "\76\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\12\1\1\1\7\1\uffff\2\2\1\4\4\3\37\uffff\2\6\1\uffff\2\6\1"+
            "\uffff\2\10\117\uffff\1\2\4\uffff\1\11\37\2\13\13\6\5",
            "\1\13\2\uffff\1\15\4\14\41\uffff\1\13\5\uffff\5\13\63\uffff"+
            "\6\16",
            "",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\16\140\uffff\2\16",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\16\140\uffff\2\16",
            "",
            "",
            "\1\13\2\uffff\5\13\41\uffff\1\41\5\uffff\5\13",
            "",
            "",
            "\1\44\3\uffff\1\13\2\uffff\1\43\4\42\41\uffff\1\13\5\uffff"+
            "\5\13\u008d\uffff\2\44",
            "",
            "\22\13\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\57"+
            "\1\60\1\61\1\56\1\62\1\63\1\64\1\65\1\66\1\67\2\uffff\7\16\16"+
            "\uffff\5\45\115\uffff\2\16",
            "\22\13\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\57"+
            "\1\60\1\61\1\56\1\62\1\63\1\64\1\65\1\66\1\67\2\uffff\7\16\140"+
            "\uffff\2\16",
            "",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\1\70\1\71\1\72",
            "\1\30\1\31\1\32",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\2\6\3\uffff\2\13",
            "\5\44\20\uffff\1\44\33\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\43\uffff\1\44\15\uffff\4\44\1\uffff\6\44",
            "\5\44\20\uffff\1\44\33\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\61\uffff\4\44\1\uffff\6\44",
            "",
            "",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\1\73\1\74\1\75",
            "\1\57\1\60\1\61",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\31\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\31\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13"
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
            return "168:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA34_eotS =
        "\151\uffff";
    static final String DFA34_eofS =
        "\42\uffff\7\10\2\uffff\11\10\4\uffff\7\10\2\uffff\14\10\1\5\3\10"+
        "\2\uffff\7\10\2\uffff\11\10\1\5\3\10";
    static final String DFA34_minS =
        "\1\113\1\112\2\u0096\2\uffff\1\116\2\uffff\2\121\2\uffff\7\u0095"+
        "\2\u009e\11\u0095\1\121\2\u0082\7\112\2\u009e\11\112\1\uffff\3\u0095"+
        "\7\112\2\u009e\20\112\2\u0096\7\112\2\u009e\15\112";
    static final String DFA34_maxS =
        "\1\u0105\1\u0110\2\u0112\2\uffff\1\u0095\2\uffff\2\u0112\2\uffff"+
        "\7\u00b2\2\u00a0\11\u00b2\1\u0095\2\u00a7\7\u0105\2\u00a0\11\u0105"+
        "\1\uffff\3\u00b2\7\u0105\2\u00a0\20\u0105\2\u0112\7\u0105\2\u00a0"+
        "\15\u0105";
    static final String DFA34_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\1\2\47\uffff\1\1\64"+
        "\uffff";
    static final String DFA34_specialS =
        "\151\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\10\1\1\1\6\1\uffff\1\4\1\uffff\1\3\4\2\51\uffff\1\5\24\uffff"+
            "\2\5\73\uffff\1\7\37\uffff\13\10\6\uffff\4\4",
            "\1\13\3\uffff\1\10\2\uffff\1\12\4\11\41\uffff\1\10\5\uffff"+
            "\5\10\63\uffff\6\14\124\uffff\2\13",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\14\140\uffff\2\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\14\140\uffff\2\14",
            "",
            "",
            "\1\10\2\uffff\1\41\4\40\41\uffff\1\10\5\uffff\2\10\1\37\2\10"+
            "\23\uffff\1\5",
            "",
            "",
            "\5\13\20\uffff\1\13\33\uffff\22\10\2\uffff\1\42\1\43\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\53\1\54\1\55\1\52\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\2\uffff\7\14\16\uffff\5\64\10\uffff\1\13\5\uffff"+
            "\3\13\43\uffff\1\13\15\uffff\4\13\1\uffff\6\13\2\14",
            "\5\13\20\uffff\1\13\33\uffff\22\10\2\uffff\1\42\1\43\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\53\1\54\1\55\1\52\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\2\uffff\7\14\33\uffff\1\13\5\uffff\3\13\61\uffff"+
            "\4\13\1\uffff\6\13\2\14",
            "",
            "",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\65\1\66\1\67",
            "\1\26\1\27\1\30",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\5\5\52\uffff\2\10\23\uffff\1\5",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\112\1\113\1\114",
            "\1\53\1\54\1\55",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\116\1\117\1\120",
            "\1\101\1\102\1\103",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\31\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\140\uffff\2\5",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\140\uffff\2\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\1\146\1\147\1\150",
            "\1\134\1\135\1\136",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\31\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\31\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10"
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
            return "195:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA43_eotS =
        "\16\uffff";
    static final String DFA43_eofS =
        "\16\uffff";
    static final String DFA43_minS =
        "\14\113\2\uffff";
    static final String DFA43_maxS =
        "\1\u00fb\13\125\2\uffff";
    static final String DFA43_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA43_specialS =
        "\16\uffff}>";
    static final String[] DFA43_transitionS = {
            "\3\14\u00a3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "229:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA76_eotS =
        "\65\uffff";
    static final String DFA76_eofS =
        "\65\uffff";
    static final String DFA76_minS =
        "\1\121\2\u0096\11\u00a8\7\u00b1\2\u009e\11\u00b1\4\uffff\2\u00b5"+
        "\3\u00b1\16\u00a8";
    static final String DFA76_maxS =
        "\1\125\2\u0112\11\u00a9\7\u00b2\2\u00a0\11\u00b2\4\uffff\2\u00d0"+
        "\3\u00b2\16\u00a9";
    static final String DFA76_acceptS =
        "\36\uffff\1\4\1\3\1\2\1\1\23\uffff";
    static final String DFA76_specialS =
        "\65\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\2\4\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\140\uffff\1\3\1\4",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\140\uffff\1\3\1\4",
            "\1\37\1\36",
            "\1\37\1\36",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
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
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40",
            "\1\41\1\40"
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "317:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA90_eotS =
        "\14\uffff";
    static final String DFA90_eofS =
        "\5\uffff\1\11\4\uffff\2\11";
    static final String DFA90_minS =
        "\1\122\1\u00bf\1\122\2\uffff\1\112\1\121\3\uffff\2\112";
    static final String DFA90_maxS =
        "\1\125\1\u00c3\1\125\2\uffff\1\u0105\1\125\3\uffff\2\u0105";
    static final String DFA90_acceptS =
        "\3\uffff\1\2\1\4\2\uffff\1\1\1\3\1\5\2\uffff";
    static final String DFA90_specialS =
        "\14\uffff}>";
    static final String[] DFA90_transitionS = {
            "\4\1",
            "\2\3\2\4\1\2",
            "\4\5",
            "",
            "",
            "\4\11\1\uffff\7\11\31\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\7\2\10\1\6\10\uffff\1"+
            "\11\4\uffff\65\11",
            "\1\13\4\12",
            "",
            "",
            "",
            "\4\11\1\uffff\7\11\31\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\7\2\10\11\uffff\1\11"+
            "\4\uffff\65\11",
            "\4\11\1\uffff\7\11\31\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\7\2\10\11\uffff\1\11"+
            "\4\uffff\65\11"
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "372:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA97_eotS =
        "\32\uffff";
    static final String DFA97_eofS =
        "\3\uffff\5\2\1\uffff\4\2\4\uffff\4\25\5\uffff";
    static final String DFA97_minS =
        "\1\121\1\u00b5\1\uffff\5\112\1\uffff\4\112\4\u0096\4\112\2\uffff"+
        "\2\u0096\1\uffff";
    static final String DFA97_maxS =
        "\1\125\1\u00d0\1\uffff\5\u0105\1\uffff\4\u0105\4\u0112\4\u0105\2"+
        "\uffff\2\u0112\1\uffff";
    static final String DFA97_acceptS =
        "\2\uffff\1\1\5\uffff\1\5\14\uffff\1\2\1\4\2\uffff\1\3";
    static final String DFA97_specialS =
        "\32\uffff}>";
    static final String[] DFA97_transitionS = {
            "\1\2\4\1",
            "\1\11\15\uffff\1\10\1\3\1\4\1\5\1\6\1\7\1\12\1\13\1\14\5\2",
            "",
            "\4\2\1\uffff\2\2\1\16\4\15\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "",
            "\4\2\1\uffff\2\2\1\20\4\17\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\31\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\22\2\2\uffff\7\2\4\uffff\1\21\23\uffff\1\22\1\23\1\24\5\25"+
            "\100\uffff\2\2",
            "\22\2\2\uffff\7\2\4\uffff\1\25\23\uffff\10\25\100\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\100\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\100\uffff\2\2",
            "\4\25\1\uffff\2\25\1\30\4\27\31\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\31\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\31\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\31\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "",
            "",
            "\22\25\2\uffff\7\25\33\uffff\5\31\100\uffff\2\25",
            "\22\25\2\uffff\7\25\33\uffff\5\31\100\uffff\2\25",
            ""
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
            return "417:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA147_eotS =
        "\64\uffff";
    static final String DFA147_eofS =
        "\64\uffff";
    static final String DFA147_minS =
        "\16\121\1\uffff\1\121\2\uffff\4\121\2\u010a\17\121\1\uffff\4\121"+
        "\1\uffff\1\121\4\u010a\2\121";
    static final String DFA147_maxS =
        "\3\u0110\2\125\4\u0110\1\125\4\u0110\1\uffff\1\u0110\2\uffff\4\u0110"+
        "\2\u010a\4\u0110\1\125\4\u0110\1\125\5\u0110\1\uffff\4\u0110\1\uffff"+
        "\1\u0110\4\u010a\2\u0110";
    static final String DFA147_acceptS =
        "\16\uffff\1\1\1\uffff\1\4\1\2\25\uffff\1\3\4\uffff\1\5\7\uffff";
    static final String DFA147_specialS =
        "\64\uffff}>";
    static final String[] DFA147_transitionS = {
            "\1\2\4\1\u00b9\uffff\1\3\1\4",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\43\uffff\1"+
            "\11\15\uffff\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14\1\15\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\61\uffff\1"+
            "\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14\1\15\1\21\1\20",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\1\27\4\26",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "",
            "\5\21\u00b9\uffff\1\21\1\20",
            "",
            "",
            "\5\21\20\uffff\1\17\u0091\uffff\1\34\15\uffff\1\30\1\31\1\32"+
            "\1\33\1\uffff\1\35\1\36\1\37\1\40\1\21\1\20",
            "\5\21\20\uffff\1\17\u009f\uffff\1\30\1\31\1\32\1\33\1\uffff"+
            "\1\35\1\36\1\37\1\40\1\21\1\20",
            "\5\47\20\uffff\1\46\u0091\uffff\1\41\15\uffff\1\50\1\51\1\52"+
            "\1\53\1\uffff\1\42\1\43\1\44\1\45\1\47\1\54",
            "\5\47\20\uffff\1\46\u009f\uffff\1\50\1\51\1\52\1\53\1\uffff"+
            "\1\42\1\43\1\44\1\45\1\47\1\54",
            "\1\55",
            "\1\55",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\1\57\4\56",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\1\61\4\60",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\u00b9\uffff\1\47\1\54",
            "",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54",
            "",
            "\5\21\20\uffff\1\17\145\uffff\1\16\5\uffff\3\16\72\uffff\1"+
            "\21\1\20",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\21\20\uffff\1\17\u00a8\uffff\1\21\1\20",
            "\5\47\20\uffff\1\46\u00a8\uffff\1\47\1\54"
    };

    static final short[] DFA147_eot = DFA.unpackEncodedString(DFA147_eotS);
    static final short[] DFA147_eof = DFA.unpackEncodedString(DFA147_eofS);
    static final char[] DFA147_min = DFA.unpackEncodedStringToUnsignedChars(DFA147_minS);
    static final char[] DFA147_max = DFA.unpackEncodedStringToUnsignedChars(DFA147_maxS);
    static final short[] DFA147_accept = DFA.unpackEncodedString(DFA147_acceptS);
    static final short[] DFA147_special = DFA.unpackEncodedString(DFA147_specialS);
    static final short[][] DFA147_transition;

    static {
        int numStates = DFA147_transitionS.length;
        DFA147_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA147_transition[i] = DFA.unpackEncodedString(DFA147_transitionS[i]);
        }
    }

    class DFA147 extends DFA {

        public DFA147(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 147;
            this.eot = DFA147_eot;
            this.eof = DFA147_eof;
            this.min = DFA147_min;
            this.max = DFA147_max;
            this.accept = DFA147_accept;
            this.special = DFA147_special;
            this.transition = DFA147_transition;
        }
        public String getDescription() {
            return "548:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan401 = new BitSet(new long[]{0x0000000000000002L,0x001F800180000400L});
    public static final BitSet FOLLOW_command_in_flightPlan404 = new BitSet(new long[]{0x0000000000000002L,0x001F800000000400L});
    public static final BitSet FOLLOW_defineCommand_in_define431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_defineCommand453 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_96_in_defineCommand455 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_97_in_defineCommand459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_98_in_defineCommand461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_99_in_defineCommand463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue482 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineCommandValue484 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue488 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_101_in_defineCommandValue492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_102_in_defineCommandValue494 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000400L});
    public static final BitSet FOLLOW_101_in_defineCommandValue496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue501 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineCommandValue503 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue507 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue531 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineCommandValue533 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue537 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue539 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue543 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_defineCommandValue545 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_101_in_defineCommandValue549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_102_in_defineCommandValue551 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000400L});
    public static final BitSet FOLLOW_101_in_defineCommandValue553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue558 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineCommandValue560 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue564 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue566 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue570 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_defineCommandValue572 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_95_in_defineSensor608 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_96_in_defineSensor610 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_105_in_defineSensor614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_106_in_defineSensor616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_107_in_defineSensor618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue637 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineSensorValue639 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue643 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_101_in_defineSensorValue647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_102_in_defineSensorValue649 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000400L});
    public static final BitSet FOLLOW_101_in_defineSensorValue651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue656 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineSensorValue658 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue662 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_95_in_defineWaypoint693 = new BitSet(new long[]{0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_96_in_defineWaypoint695 = new BitSet(new long[]{0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_108_in_defineWaypoint699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_109_in_defineWaypoint701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_110_in_defineWaypoint703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue722 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue724 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue726 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_101_in_defineWaypointValue730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_102_in_defineWaypointValue732 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000400L});
    public static final BitSet FOLLOW_101_in_defineWaypointValue734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue739 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue741 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue743 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000400L});
    public static final BitSet FOLLOW_flyCommand_in_command770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_flyCommand797 = new BitSet(new long[]{0x0000000000000002L,0x1B600000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFE1000L,0x0000000000000003L});
    public static final BitSet FOLLOW_112_in_flyCommand799 = new BitSet(new long[]{0x0000000000000002L,0x1B600000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFE1000L,0x0000000000000003L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand802 = new BitSet(new long[]{0x0000000000000002L,0x1B600000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFE1000L,0x0000000000000003L});
    public static final BitSet FOLLOW_time_in_flyCommandValue824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue859 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue861 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_101_in_flyCommandValue865 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_102_in_flyCommandValue867 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_101_in_flyCommandValue869 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue873 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_turnCommand898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x0001FFFFFFFC1000L});
    public static final BitSet FOLLOW_114_in_turnCommand900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x0001FFFFFFFC1000L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x0001FFFFFFFC1000L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_loiterCommand937 = new BitSet(new long[]{0x0000000000000002L,0x9B600000003FB800L,0x0000000000300000L,0xFFFFFFFFFFFE1000L,0x000000000000003FL});
    public static final BitSet FOLLOW_116_in_loiterCommand939 = new BitSet(new long[]{0x0000000000000002L,0x9B600000003FB800L,0x0000000000300000L,0xFFFFFFFFFFFE1000L,0x000000000000003FL});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand942 = new BitSet(new long[]{0x0000000000000002L,0x9B600000003FB800L,0x0000000000300000L,0xFFFFFFFFFFFE1000L,0x000000000000003FL});
    public static final BitSet FOLLOW_time_in_loiterCommandValue964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue989 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1026 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_executeCommand1028 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1030 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_102_in_executeCommand1033 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1035 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_104_in_executeCommand1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_pitch1070 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_118_in_pitch1072 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1090 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_pitch1092 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_pitch1097 = new BitSet(new long[]{0x0000000000000000L,0x04000000003E0000L});
    public static final BitSet FOLLOW_121_in_pitch1099 = new BitSet(new long[]{0x0000000000000000L,0x04000000003E0000L});
    public static final BitSet FOLLOW_122_in_pitch1102 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_roll1126 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_124_in_roll1128 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_roll1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1173 = new BitSet(new long[]{0x0000000000000000L,0xE0800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1175 = new BitSet(new long[]{0x0000000000000000L,0xE0800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1177 = new BitSet(new long[]{0x0000000000000000L,0xE0800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_119_in_fixedAltitude1182 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_125_in_fixedAltitude1186 = new BitSet(new long[]{0x0000000000000000L,0xE4800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_126_in_fixedAltitude1188 = new BitSet(new long[]{0x0000000000000000L,0xE4800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_127_in_fixedAltitude1191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_fixedAltitude1195 = new BitSet(new long[]{0x0000000000000000L,0xE4800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_129_in_fixedAltitude1197 = new BitSet(new long[]{0x0000000000000000L,0xE4800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_122_in_fixedAltitude1201 = new BitSet(new long[]{0x0000000000000000L,0xE0800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1228 = new BitSet(new long[]{0x0000000000000000L,0xE0800000003E4000L,0x0000000000000003L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000FFFFCL});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_pressureUnit1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_pressureUnit1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_pressureUnit1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pressureUnit1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_pressureUnit1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_pressureUnit1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_pressureUnit1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pressureUnit1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_pressureUnit1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_pressureUnit1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_pressureUnit1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_pressureUnit1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_pressureUnit1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_pressureUnit1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_pressureUnit1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_pressureUnit1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_pressureUnit1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_pressureUnit1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_radius1414 = new BitSet(new long[]{0x0000000000000000L,0x80000000003E0000L,0x0000000000200000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_With_in_radius1416 = new BitSet(new long[]{0x0000000000000000L,0x80000000003E0000L,0x0000000000200000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_127_in_radius1420 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000200000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_149_in_radius1424 = new BitSet(new long[]{0x0000000000000000L,0x04000000003E0000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_122_in_radius1426 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_distanceValue_in_radius1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_radius1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1454 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_distanceValue_in_distance1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000FFFFC00000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_distanceUnit1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_distanceUnit1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_distanceUnit1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_distanceUnit1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_distanceUnit1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_distanceUnit1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_158_in_distanceUnit1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_distanceUnit1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_distanceUnit1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_distanceUnit1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_158_in_distanceUnit1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_distanceUnit1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_distanceUnit1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_distanceUnit1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_distanceUnit1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_distanceUnit1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_distanceUnit1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_distanceUnit1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_distanceUnit1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1636 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_relativeSpeed1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_169_in_relativeSpeed1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_relativeSpeed1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_169_in_relativeSpeed1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001FCFFFFC00000L});
    public static final BitSet FOLLOW_speedUnit_in_speedValue1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_speedUnit1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_speedUnit1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_speedUnit1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_speedUnit1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_speedUnit1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_speedUnit1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_speedUnit1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_177_in_speedUnit1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x000000000001FFF0L});
    public static final BitSet FOLLOW_178_in_speedUnit1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x000000000001FFF0L});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x07E0000000000000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_179_in_optimalSpeed1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_optimalSpeed1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_optimalUnit1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_optimalUnit1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_optimalUnit1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_optimalUnit1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_optimalUnit1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_optimalUnit1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed1911 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x7800000000000000L});
    public static final BitSet FOLLOW_187_in_throttleSpeed1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_throttleSpeed1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_throttleSpeed1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_throttleSpeed1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1958 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_timeValue_in_time1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_timeValue1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_timeValue1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue1993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_timeValue1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_timeValue1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_193_in_timeValue2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_timeValue2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_193_in_timeValue2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_timeValue2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_timeFormat2089 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_timeFormat2115 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_timeFormat2121 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_hour2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_hour2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_hour2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_hour2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_hour2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_minute2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_minute2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_minute2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_minute2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_second2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_second2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_second2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_second2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_second2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_duration2250 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_durationValue_in_duration2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x000000000001FFF0L});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_hour_in_durationValue2281 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x000000000001FFF0L});
    public static final BitSet FOLLOW_minute_in_durationValue2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_hour_in_durationValue2296 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_minute_in_durationValue2300 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x000000000001FFF0L});
    public static final BitSet FOLLOW_second_in_durationValue2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_minute_in_durationValue2311 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x000000000001FFF0L});
    public static final BitSet FOLLOW_second_in_durationValue2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2402 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0001FFFFFFFC1000L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2404 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0001FFFFFFFC1000L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2447 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_northSouthDirection2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_northSouthDirection2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_northSouthDirection2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_northSouthDirection2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_eastWestDirection2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_eastWestDirection2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_eastWestDirection2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_eastWestDirection2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_ordinalDirection2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_ordinalDirection2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_ordinalDirection2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_ordinalDirection2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_ordinalDirection2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_ordinalDirection2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_ordinalDirection2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_ordinalDirection2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_subOrdinalDirection2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_subOrdinalDirection2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_subOrdinalDirection2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_subOrdinalDirection2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_subOrdinalDirection2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_subOrdinalDirection2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_subOrdinalDirection2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_subOrdinalDirection2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_subOrdinalDirection2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_subOrdinalDirection2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_subOrdinalDirection2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_subOrdinalDirection2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_subOrdinalDirection2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_subOrdinalDirection2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_subOrdinalDirection2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_subOrdinalDirection2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_upDownDirection2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_upDownDirection2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_upDownDirection2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_upDownDirection2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_upDownDirection2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_upDownDirection2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_upDownDirection2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_upDownDirection2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_upDownDirection2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_upDownDirection2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_upDownDirection2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_leftRightDirection2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_leftRightDirection2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_leftRightDirection2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_leftRightDirection2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_leftRightDirection2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_leftRightDirection2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_clockDirection2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_clockDirection2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_clockDirection2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_clockDirection2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_262_in_angularValue2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_angularValue2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_264_in_angularValue2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_angularValue2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_248_in_angularValue2940 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_266_in_angularValue2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_267_in_angularValue2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_angularValue2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_angularValue2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_angularValue2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000001C1000L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3044 = new BitSet(new long[]{0x0000000000000000L,0x00000040003E0000L});
    public static final BitSet FOLLOW_102_in_latitudeLongitude3046 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FC1000L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_latitudeLongitude3079 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3084 = new BitSet(new long[]{0x0000000000000000L,0x00000040003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_102_in_latitudeLongitude3086 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_271_in_latitudeLongitude3089 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_latitudeLongitude3120 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3124 = new BitSet(new long[]{0x0000000000000000L,0x00000040003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_102_in_latitudeLongitude3126 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_271_in_latitudeLongitude3129 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_latitudeLongitude3160 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3165 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_102_in_latitudeLongitude3167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_272_in_latitudeLongitude3170 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_latitudeLongitude3200 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3204 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_102_in_latitudeLongitude3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_272_in_latitudeLongitude3209 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_273_in_percentValue3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_274_in_percentValue3317 = new BitSet(new long[]{0x0000000000000002L});

}