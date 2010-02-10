// $ANTLR 3.2 Sep 23, 2009 12:02:23 flips.g 2010-02-09 23:40:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'repeat'", "'wait'", "'time'", "'times'", "'continuously'", "'forever'", "'until'", "'while'", "'the'", "'tim'", "'is'", "'dir'", "'direction'", "'spd'", "'speed'", "'dst'", "'distance'", "'pit'", "'pitch'", "'rol'", "'roll'", "'alt'", "'altitude'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'/'", "'per'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
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
    public static final int SOUTH=72;
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
    public static final int To=82;
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
    public static final int KILOMETER=44;
    public static final int T__255=255;
    public static final int EQ=75;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int SENSOR=8;
    public static final int T__138=138;
    public static final int GE=80;
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
    public static final int YARD=50;
    public static final int T__282=282;
    public static final int T__283=283;
    public static final int T__141=141;
    public static final int T__280=280;
    public static final int T__142=142;
    public static final int T__281=281;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=84;
    public static final int DURATION=28;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__305=305;
    public static final int T__126=126;
    public static final int CRUISE=65;
    public static final int T__306=306;
    public static final int T__125=125;
    public static final int T__307=307;
    public static final int T__128=128;
    public static final int T__308=308;
    public static final int T__127=127;
    public static final int WS=99;
    public static final int T__301=301;
    public static final int T__302=302;
    public static final int T__129=129;
    public static final int T__303=303;
    public static final int OPTIMAL=22;
    public static final int T__304=304;
    public static final int BinaryLiteral=89;
    public static final int BinaryDigit=96;
    public static final int THROTTLE=23;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=88;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=78;
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
    public static final int HexDigit=97;
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
    public static final int HexLiteral=92;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=83;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=54;
    public static final int RELATIVE=15;
    public static final int T__102=102;
    public static final int EAST=73;
    public static final int HOUR=38;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=18;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=94;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=47;
    public static final int T__227=227;
    public static final int NonZeroDigit=95;
    public static final int NORTH=71;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=70;
    public static final int T__230=230;
    public static final int WEEK=36;
    public static final int LT=77;
    public static final int OctalLiteral=90;
    public static final int LATITUDE=32;
    public static final int ATMOSPHERE=68;
    public static final int DAY=37;
    public static final int Identifier=81;
    public static final int COMMAND=6;
    public static final int Comment=100;
    public static final int MILLIBAR=67;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=56;
    public static final int FlightLevel=85;
    public static final int INCH=52;
    public static final int NE=76;
    public static final int SECOND=40;
    public static final int CLIMB=69;
    public static final int ROLL=16;
    public static final int HOUR24=27;
    public static final int RADIAN=42;
    public static final int PASCAL=62;
    public static final int DEGREE=41;
    public static final int TURN=13;
    public static final int SLOWER=21;
    public static final int FLY=9;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int PM=26;
    public static final int FURLONG=49;
    public static final int LONGITUDE=33;
    public static final int PRESSURE=59;
    public static final int YEAR=34;
    public static final int MILE=48;
    public static final int LineComment=101;
    public static final int Exponent=98;
    public static final int DEFINE=5;
    public static final int WEST=74;
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
    public static final int Heading=87;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=93;
    public static final int DecimalLiteral=91;
    public static final int T__175=175;
    public static final int FLIGHTPLAN=4;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int Turning=86;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=60;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=55;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MAXIMUM=64;
    public static final int MINUTE=39;
    public static final int T__169=169;
    public static final int LE=79;
    public static final int BAR=66;

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
    // flips.g:116:1: flightPlan : ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.statement_return statement2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        try {
            // flips.g:117:2: ( ( define )* ( statement )* -> ^( FLIGHTPLAN ( define )* ( statement )* ) )
            // flips.g:117:4: ( define )* ( statement )*
            {
            // flips.g:117:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=102 && LA1_0<=104)||(LA1_0>=110 && LA1_0<=115)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // flips.g:117:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan436);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // flips.g:117:12: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=116 && LA2_0<=117)||(LA2_0>=139 && LA2_0<=144)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // flips.g:117:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_flightPlan439);
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
            // 118:2: -> ^( FLIGHTPLAN ( define )* ( statement )* )
            {
                // flips.g:118:5: ^( FLIGHTPLAN ( define )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // flips.g:118:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // flips.g:118:26: ( statement )*
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
    // flips.g:123:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineSensor_return defineSensor4 = null;

        flipsParser.defineWaypoint_return defineWaypoint5 = null;



        try {
            // flips.g:124:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 102:
            case 103:
            case 104:
                {
                alt3=1;
                }
                break;
            case 110:
            case 111:
            case 112:
                {
                alt3=2;
                }
                break;
            case 113:
            case 114:
            case 115:
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
                    // flips.g:124:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define466);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:125:4: defineSensor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineSensor_in_define471);
                    defineSensor4=defineSensor();

                    state._fsp--;

                    adaptor.addChild(root_0, defineSensor4.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:126:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define476);
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
    // flips.g:129:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
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
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // flips.g:130:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // flips.g:130:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // flips.g:130:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt4=1;
                }
                break;
            case 103:
                {
                alt4=2;
                }
                break;
            case 104:
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
                    // flips.g:130:5: 'cmd'
                    {
                    string_literal6=(Token)match(input,102,FOLLOW_102_in_defineCommand488);  
                    stream_102.add(string_literal6);


                    }
                    break;
                case 2 :
                    // flips.g:130:11: 'command'
                    {
                    string_literal7=(Token)match(input,103,FOLLOW_103_in_defineCommand490);  
                    stream_103.add(string_literal7);


                    }
                    break;
                case 3 :
                    // flips.g:130:21: 'commands'
                    {
                    string_literal8=(Token)match(input,104,FOLLOW_104_in_defineCommand492);  
                    stream_104.add(string_literal8);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand495);
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
            // 131:2: -> defineCommandValue
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
    // flips.g:134:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flips.g:135:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==105) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=102 && LA11_3<=104)||(LA11_3>=106 && LA11_3<=107)||(LA11_3>=110 && LA11_3<=117)||(LA11_3>=139 && LA11_3<=144)) ) {
                            alt11=1;
                        }
                        else if ( (LA11_3==108) ) {
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
                    // flips.g:135:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue511);  
                    stream_Identifier.add(Identifier10);

                    char_literal11=(Token)match(input,105,FOLLOW_105_in_defineCommandValue513);  
                    stream_105.add(char_literal11);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue515);
                    integerValue12=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue12.getTree());
                    // flips.g:135:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==105) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=106 && LA7_0<=107)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // flips.g:135:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // flips.g:135:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==106) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==107) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // flips.g:135:34: 'and'
                    	            {
                    	            string_literal13=(Token)match(input,106,FOLLOW_106_in_defineCommandValue519);  
                    	            stream_106.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:135:40: ',' ( 'and' )?
                    	            {
                    	            char_literal14=(Token)match(input,107,FOLLOW_107_in_defineCommandValue521);  
                    	            stream_107.add(char_literal14);

                    	            // flips.g:135:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==106) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // flips.g:135:44: 'and'
                    	                    {
                    	                    string_literal15=(Token)match(input,106,FOLLOW_106_in_defineCommandValue523);  
                    	                    stream_106.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue528);  
                    	    stream_Identifier.add(Identifier16);

                    	    char_literal17=(Token)match(input,105,FOLLOW_105_in_defineCommandValue530);  
                    	    stream_105.add(char_literal17);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue532);
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
                    // 136:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_integerValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_integerValue.hasNext() ) {
                            // flips.g:136:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // flips.g:136:25: ^( COMMAND integerValue )
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
                    // flips.g:137:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue555);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,105,FOLLOW_105_in_defineCommandValue557);  
                    stream_105.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue561);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal21=(Token)match(input,108,FOLLOW_108_in_defineCommandValue563);  
                    stream_108.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue567);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,109,FOLLOW_109_in_defineCommandValue569);  
                    stream_109.add(char_literal22);

                    // flips.g:137:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==105) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=106 && LA10_0<=107)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // flips.g:137:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // flips.g:137:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==106) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==107) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // flips.g:137:63: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,106,FOLLOW_106_in_defineCommandValue573);  
                    	            stream_106.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:137:69: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,107,FOLLOW_107_in_defineCommandValue575);  
                    	            stream_107.add(char_literal24);

                    	            // flips.g:137:73: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==106) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // flips.g:137:73: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,106,FOLLOW_106_in_defineCommandValue577);  
                    	                    stream_106.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue582);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,105,FOLLOW_105_in_defineCommandValue584);  
                    	    stream_105.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue588);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal28=(Token)match(input,108,FOLLOW_108_in_defineCommandValue590);  
                    	    stream_108.add(char_literal28);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue594);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal29=(Token)match(input,109,FOLLOW_109_in_defineCommandValue596);  
                    	    stream_109.add(char_literal29);


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
                    // 138:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_cmd.hasNext()||stream_par.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_cmd.hasNext()||stream_par.hasNext() ) {
                            // flips.g:138:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // flips.g:138:25: ^( COMMAND $cmd PARAMETER $par)
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
    // flips.g:141:1: defineSensor : ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue ;
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
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_defineSensorValue=new RewriteRuleSubtreeStream(adaptor,"rule defineSensorValue");
        try {
            // flips.g:142:2: ( ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue )
            // flips.g:142:4: ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue
            {
            // flips.g:142:4: ( 'sen' | 'sensor' | 'sensors' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt12=1;
                }
                break;
            case 111:
                {
                alt12=2;
                }
                break;
            case 112:
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
                    // flips.g:142:5: 'sen'
                    {
                    string_literal30=(Token)match(input,110,FOLLOW_110_in_defineSensor632);  
                    stream_110.add(string_literal30);


                    }
                    break;
                case 2 :
                    // flips.g:142:11: 'sensor'
                    {
                    string_literal31=(Token)match(input,111,FOLLOW_111_in_defineSensor634);  
                    stream_111.add(string_literal31);


                    }
                    break;
                case 3 :
                    // flips.g:142:20: 'sensors'
                    {
                    string_literal32=(Token)match(input,112,FOLLOW_112_in_defineSensor636);  
                    stream_112.add(string_literal32);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor639);
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
            // 143:2: -> defineSensorValue
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
    // flips.g:146:1: defineSensorValue : Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ ;
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
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flips.g:147:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // flips.g:147:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue655);  
            stream_Identifier.add(Identifier34);

            char_literal35=(Token)match(input,105,FOLLOW_105_in_defineSensorValue657);  
            stream_105.add(char_literal35);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue661);
            sen=integerValue();

            state._fsp--;

            stream_integerValue.add(sen.getTree());
            // flips.g:147:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==105) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=106 && LA15_0<=107)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // flips.g:147:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue
            	    {
            	    // flips.g:147:37: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==106) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==107) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // flips.g:147:38: 'and'
            	            {
            	            string_literal36=(Token)match(input,106,FOLLOW_106_in_defineSensorValue665);  
            	            stream_106.add(string_literal36);


            	            }
            	            break;
            	        case 2 :
            	            // flips.g:147:44: ',' ( 'and' )?
            	            {
            	            char_literal37=(Token)match(input,107,FOLLOW_107_in_defineSensorValue667);  
            	            stream_107.add(char_literal37);

            	            // flips.g:147:48: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==106) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // flips.g:147:48: 'and'
            	                    {
            	                    string_literal38=(Token)match(input,106,FOLLOW_106_in_defineSensorValue669);  
            	                    stream_106.add(string_literal38);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue674);  
            	    stream_Identifier.add(Identifier39);

            	    char_literal40=(Token)match(input,105,FOLLOW_105_in_defineSensorValue676);  
            	    stream_105.add(char_literal40);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue680);
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
            // 148:2: -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_sen.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_sen.hasNext() ) {
                    // flips.g:148:5: ^( DEFINE Identifier ^( SENSOR $sen) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    // flips.g:148:25: ^( SENSOR $sen)
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
    // flips.g:151:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
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
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // flips.g:152:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // flips.g:152:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // flips.g:152:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt16=1;
                }
                break;
            case 114:
                {
                alt16=2;
                }
                break;
            case 115:
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
                    // flips.g:152:5: 'wpt'
                    {
                    string_literal41=(Token)match(input,113,FOLLOW_113_in_defineWaypoint711);  
                    stream_113.add(string_literal41);


                    }
                    break;
                case 2 :
                    // flips.g:152:11: 'waypoint'
                    {
                    string_literal42=(Token)match(input,114,FOLLOW_114_in_defineWaypoint713);  
                    stream_114.add(string_literal42);


                    }
                    break;
                case 3 :
                    // flips.g:152:22: 'waypoints'
                    {
                    string_literal43=(Token)match(input,115,FOLLOW_115_in_defineWaypoint715);  
                    stream_115.add(string_literal43);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint718);
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
            // 153:2: -> defineWaypointValue
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
    // flips.g:156:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
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
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // flips.g:157:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // flips.g:157:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier45=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue734);  
            stream_Identifier.add(Identifier45);

            char_literal46=(Token)match(input,105,FOLLOW_105_in_defineWaypointValue736);  
            stream_105.add(char_literal46);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue738);
            geoCoordinate47=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate47.getTree());
            // flips.g:157:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Identifier) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==105) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>=106 && LA19_0<=107)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // flips.g:157:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // flips.g:157:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt18=3;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==106) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==107) ) {
            	        alt18=2;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // flips.g:157:35: 'and'
            	            {
            	            string_literal48=(Token)match(input,106,FOLLOW_106_in_defineWaypointValue742);  
            	            stream_106.add(string_literal48);


            	            }
            	            break;
            	        case 2 :
            	            // flips.g:157:41: ',' ( 'and' )?
            	            {
            	            char_literal49=(Token)match(input,107,FOLLOW_107_in_defineWaypointValue744);  
            	            stream_107.add(char_literal49);

            	            // flips.g:157:45: ( 'and' )?
            	            int alt17=2;
            	            int LA17_0 = input.LA(1);

            	            if ( (LA17_0==106) ) {
            	                alt17=1;
            	            }
            	            switch (alt17) {
            	                case 1 :
            	                    // flips.g:157:45: 'and'
            	                    {
            	                    string_literal50=(Token)match(input,106,FOLLOW_106_in_defineWaypointValue746);  
            	                    stream_106.add(string_literal50);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue751);  
            	    stream_Identifier.add(Identifier51);

            	    char_literal52=(Token)match(input,105,FOLLOW_105_in_defineWaypointValue753);  
            	    stream_105.add(char_literal52);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue755);
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
            // 158:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_geoCoordinate.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_geoCoordinate.hasNext() ) {
                    // flips.g:158:5: ^( DEFINE Identifier geoCoordinate )
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
    // flips.g:163:1: statement : ( command | 'repeat' ( statement )* repeat | 'wait' condition );
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
            // flips.g:164:2: ( command | 'repeat' ( statement )* repeat | 'wait' condition )
            int alt21=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                {
                alt21=1;
                }
                break;
            case 116:
                {
                alt21=2;
                }
                break;
            case 117:
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
                    // flips.g:164:4: command
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_command_in_statement782);
                    command54=command();

                    state._fsp--;

                    adaptor.addChild(root_0, command54.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:165:4: 'repeat' ( statement )* repeat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal55=(Token)match(input,116,FOLLOW_116_in_statement787); 
                    string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    // flips.g:165:13: ( statement )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Identifier||(LA20_0>=116 && LA20_0<=117)||(LA20_0>=139 && LA20_0<=144)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // flips.g:165:13: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement789);
                    	    statement56=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_repeat_in_statement792);
                    repeat57=repeat();

                    state._fsp--;

                    adaptor.addChild(root_0, repeat57.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:166:4: 'wait' condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal58=(Token)match(input,117,FOLLOW_117_in_statement797); 
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);

                    pushFollow(FOLLOW_condition_in_statement799);
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
    // flips.g:169:1: repeat : ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition );
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
            // flips.g:170:2: ( integerValue ( 'time' | 'times' ) | 'continuously' duration | 'forever' | condition )
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
            case 120:
                {
                alt22=2;
                }
                break;
            case 121:
                {
                alt22=3;
                }
                break;
            case 122:
            case 123:
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
                    // flips.g:170:4: integerValue ( 'time' | 'times' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_repeat810);
                    integerValue60=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue60.getTree());
                    set61=(Token)input.LT(1);
                    if ( (input.LA(1)>=118 && input.LA(1)<=119) ) {
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
                    // flips.g:171:4: 'continuously' duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal62=(Token)match(input,120,FOLLOW_120_in_repeat821); 
                    string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);

                    pushFollow(FOLLOW_duration_in_repeat823);
                    duration63=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration63.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:172:4: 'forever'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal64=(Token)match(input,121,FOLLOW_121_in_repeat828); 
                    string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
                    adaptor.addChild(root_0, string_literal64_tree);


                    }
                    break;
                case 4 :
                    // flips.g:173:4: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condition_in_repeat833);
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
    // flips.g:176:1: condition : ( 'until' conditionValue | 'while' conditionValue );
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
            // flips.g:177:2: ( 'until' conditionValue | 'while' conditionValue )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==122) ) {
                alt23=1;
            }
            else if ( (LA23_0==123) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // flips.g:177:4: 'until' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal66=(Token)match(input,122,FOLLOW_122_in_condition844); 
                    string_literal66_tree = (CommonTree)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition846);
                    conditionValue67=conditionValue();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionValue67.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:178:4: 'while' conditionValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal68=(Token)match(input,123,FOLLOW_123_in_condition851); 
                    string_literal68_tree = (CommonTree)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);

                    pushFollow(FOLLOW_conditionValue_in_condition853);
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
    // flips.g:181:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );
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
            // flips.g:182:2: ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue )
            int alt38=9;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // flips.g:182:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:182:4: ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==118||(LA25_0>=124 && LA25_0<=125)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // flips.g:182:5: ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' )
                            {
                            // flips.g:182:5: ( 'the' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==124) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // flips.g:182:5: 'the'
                                    {
                                    string_literal70=(Token)match(input,124,FOLLOW_124_in_conditionValue865); 
                                    string_literal70_tree = (CommonTree)adaptor.create(string_literal70);
                                    adaptor.addChild(root_0, string_literal70_tree);


                                    }
                                    break;

                            }

                            set71=(Token)input.LT(1);
                            if ( input.LA(1)==118||input.LA(1)==125 ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set71));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set72=(Token)input.LT(1);
                            if ( input.LA(1)==105||input.LA(1)==126 ) {
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

                    pushFollow(FOLLOW_timeValue_in_conditionValue882);
                    timeValue73=timeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, timeValue73.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:183:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:183:4: ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==124||(LA27_0>=127 && LA27_0<=128)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // flips.g:183:5: ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' )
                            {
                            // flips.g:183:5: ( 'the' )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==124) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // flips.g:183:5: 'the'
                                    {
                                    string_literal74=(Token)match(input,124,FOLLOW_124_in_conditionValue888); 
                                    string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
                                    adaptor.addChild(root_0, string_literal74_tree);


                                    }
                                    break;

                            }

                            set75=(Token)input.LT(1);
                            if ( (input.LA(1)>=127 && input.LA(1)<=128) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set75));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set76=(Token)input.LT(1);
                            if ( input.LA(1)==105||input.LA(1)==126 ) {
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

                    pushFollow(FOLLOW_fixedDirection_in_conditionValue905);
                    fixedDirection77=fixedDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedDirection77.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:184:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:184:4: ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==124||(LA29_0>=129 && LA29_0<=130)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // flips.g:184:5: ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' )
                            {
                            // flips.g:184:5: ( 'the' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==124) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // flips.g:184:5: 'the'
                                    {
                                    string_literal78=(Token)match(input,124,FOLLOW_124_in_conditionValue911); 
                                    string_literal78_tree = (CommonTree)adaptor.create(string_literal78);
                                    adaptor.addChild(root_0, string_literal78_tree);


                                    }
                                    break;

                            }

                            set79=(Token)input.LT(1);
                            if ( (input.LA(1)>=129 && input.LA(1)<=130) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set79));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set80=(Token)input.LT(1);
                            if ( input.LA(1)==105||input.LA(1)==126 ) {
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

                    pushFollow(FOLLOW_speedValue_in_conditionValue928);
                    speedValue81=speedValue();

                    state._fsp--;

                    adaptor.addChild(root_0, speedValue81.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:185:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:185:4: ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) )
                    // flips.g:185:5: ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' )
                    {
                    // flips.g:185:5: ( 'the' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==124) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // flips.g:185:5: 'the'
                            {
                            string_literal82=(Token)match(input,124,FOLLOW_124_in_conditionValue934); 
                            string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
                            adaptor.addChild(root_0, string_literal82_tree);


                            }
                            break;

                    }

                    set83=(Token)input.LT(1);
                    if ( (input.LA(1)>=131 && input.LA(1)<=132) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set83));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set84=(Token)input.LT(1);
                    if ( input.LA(1)==105||input.LA(1)==126 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set84));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_distanceValue_in_conditionValue950);
                    distanceValue85=distanceValue();

                    state._fsp--;

                    adaptor.addChild(root_0, distanceValue85.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:186:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:186:4: ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) )
                    // flips.g:186:5: ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' )
                    {
                    // flips.g:186:5: ( 'the' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==124) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // flips.g:186:5: 'the'
                            {
                            string_literal86=(Token)match(input,124,FOLLOW_124_in_conditionValue956); 
                            string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                            adaptor.addChild(root_0, string_literal86_tree);


                            }
                            break;

                    }

                    set87=(Token)input.LT(1);
                    if ( (input.LA(1)>=133 && input.LA(1)<=134) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set87));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set88=(Token)input.LT(1);
                    if ( input.LA(1)==105||input.LA(1)==126 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue972);
                    angularValue89=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue89.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:187:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:187:4: ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) )
                    // flips.g:187:5: ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' )
                    {
                    // flips.g:187:5: ( 'the' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==124) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // flips.g:187:5: 'the'
                            {
                            string_literal90=(Token)match(input,124,FOLLOW_124_in_conditionValue978); 
                            string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                            adaptor.addChild(root_0, string_literal90_tree);


                            }
                            break;

                    }

                    set91=(Token)input.LT(1);
                    if ( (input.LA(1)>=135 && input.LA(1)<=136) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set92=(Token)input.LT(1);
                    if ( input.LA(1)==105||input.LA(1)==126 ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }

                    pushFollow(FOLLOW_angularValue_in_conditionValue994);
                    angularValue93=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue93.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:188:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:188:4: ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=113 && LA34_0<=114)||LA34_0==124) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // flips.g:188:5: ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' )
                            {
                            // flips.g:188:5: ( 'the' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==124) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // flips.g:188:5: 'the'
                                    {
                                    string_literal94=(Token)match(input,124,FOLLOW_124_in_conditionValue1000); 
                                    string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
                                    adaptor.addChild(root_0, string_literal94_tree);


                                    }
                                    break;

                            }

                            set95=(Token)input.LT(1);
                            if ( (input.LA(1)>=113 && input.LA(1)<=114) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set95));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set96=(Token)input.LT(1);
                            if ( input.LA(1)==105||input.LA(1)==126 ) {
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

                    pushFollow(FOLLOW_waypoint_in_conditionValue1017);
                    waypoint97=waypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, waypoint97.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:189:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // flips.g:189:4: ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==124||(LA36_0>=137 && LA36_0<=138)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // flips.g:189:5: ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' )
                            {
                            // flips.g:189:5: ( 'the' )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==124) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // flips.g:189:5: 'the'
                                    {
                                    string_literal98=(Token)match(input,124,FOLLOW_124_in_conditionValue1023); 
                                    string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
                                    adaptor.addChild(root_0, string_literal98_tree);


                                    }
                                    break;

                            }

                            set99=(Token)input.LT(1);
                            if ( (input.LA(1)>=137 && input.LA(1)<=138) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set99));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            set100=(Token)input.LT(1);
                            if ( input.LA(1)==105||input.LA(1)==126 ) {
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

                    pushFollow(FOLLOW_altitudeValue_in_conditionValue1040);
                    altitudeValue101=altitudeValue();

                    state._fsp--;

                    adaptor.addChild(root_0, altitudeValue101.getTree());

                    }
                    break;
                case 9 :
                    // flips.g:190:4: Identifier ( '=' | 'is' )? numericValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_conditionValue1045); 
                    Identifier102_tree = (CommonTree)adaptor.create(Identifier102);
                    adaptor.addChild(root_0, Identifier102_tree);

                    // flips.g:190:15: ( '=' | 'is' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==105||LA37_0==126) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // flips.g:
                            {
                            set103=(Token)input.LT(1);
                            if ( input.LA(1)==105||input.LA(1)==126 ) {
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

                    pushFollow(FOLLOW_numericValue_in_conditionValue1054);
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
    // flips.g:195:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand105 = null;

        flipsParser.turnCommand_return turnCommand106 = null;

        flipsParser.loiterCommand_return loiterCommand107 = null;

        flipsParser.executeCommand_return executeCommand108 = null;



        try {
            // flips.g:196:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 139:
            case 140:
                {
                alt39=1;
                }
                break;
            case 141:
            case 142:
                {
                alt39=2;
                }
                break;
            case 143:
            case 144:
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
                    // flips.g:196:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command1067);
                    flyCommand105=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand105.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:197:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command1072);
                    turnCommand106=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand106.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:198:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command1077);
                    loiterCommand107=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand107.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:199:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command1082);
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
    // flips.g:202:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        flipsParser.flyCommandValue_return flyCommandValue111 = null;


        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // flips.g:203:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // flips.g:203:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // flips.g:203:4: ( 'fly' | 'go' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==139) ) {
                alt40=1;
            }
            else if ( (LA40_0==140) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // flips.g:203:5: 'fly'
                    {
                    string_literal109=(Token)match(input,139,FOLLOW_139_in_flyCommand1094);  
                    stream_139.add(string_literal109);


                    }
                    break;
                case 2 :
                    // flips.g:203:11: 'go'
                    {
                    string_literal110=(Token)match(input,140,FOLLOW_140_in_flyCommand1096);  
                    stream_140.add(string_literal110);


                    }
                    break;

            }

            // flips.g:203:17: ( flyCommandValue )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=BinaryLiteral && LA41_0<=HexLiteral)) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==170||(LA41_2>=172 && LA41_2<=198)||(LA41_2>=201 && LA41_2<=208)||(LA41_2>=316 && LA41_2<=317)) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>=To && LA41_0<=With)||(LA41_0>=Turning && LA41_0<=FloatingPointLiteral)||(LA41_0>=133 && LA41_0<=136)||(LA41_0>=146 && LA41_0<=147)||(LA41_0>=211 && LA41_0<=216)||LA41_0==237||LA41_0==248||(LA41_0>=253 && LA41_0<=300)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // flips.g:203:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand1099);
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
            // 204:2: -> ^( FLY ( flyCommandValue )* )
            {
                // flips.g:204:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // flips.g:204:11: ( flyCommandValue )*
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
    // flips.g:207:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
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
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // flips.g:208:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt45=9;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // flips.g:208:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue1121);
                    time112=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time112.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:209:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue1126);
                    direction113=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction113.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:210:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue1131);
                    speed114=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed114.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:211:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue1136);
                    distance115=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance115.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:212:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue1141);
                    pitch116=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch116.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:213:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue1146);
                    roll117=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll117.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:214:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue1151);
                    duration118=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration118.getTree());

                    }
                    break;
                case 8 :
                    // flips.g:215:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To119=(Token)match(input,To,FOLLOW_To_in_flyCommandValue1156);  
                    stream_To.add(To119);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue1158);
                    waypoint120=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint120.getTree());
                    // flips.g:215:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=106 && LA44_0<=107)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // flips.g:215:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // flips.g:215:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==106) ) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==107) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // flips.g:215:18: 'and'
                    	            {
                    	            string_literal121=(Token)match(input,106,FOLLOW_106_in_flyCommandValue1162);  
                    	            stream_106.add(string_literal121);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // flips.g:215:24: ',' ( 'and' )?
                    	            {
                    	            char_literal122=(Token)match(input,107,FOLLOW_107_in_flyCommandValue1164);  
                    	            stream_107.add(char_literal122);

                    	            // flips.g:215:28: ( 'and' )?
                    	            int alt42=2;
                    	            int LA42_0 = input.LA(1);

                    	            if ( (LA42_0==106) ) {
                    	                alt42=1;
                    	            }
                    	            switch (alt42) {
                    	                case 1 :
                    	                    // flips.g:215:28: 'and'
                    	                    {
                    	                    string_literal123=(Token)match(input,106,FOLLOW_106_in_flyCommandValue1166);  
                    	                    stream_106.add(string_literal123);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue1170);
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
                    // 216:2: -> ( waypoint )+
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
                    // flips.g:217:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue1183);
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
    // flips.g:220:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal126=null;
        Token string_literal127=null;
        flipsParser.turnCommandValue_return turnCommandValue128 = null;


        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // flips.g:221:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // flips.g:221:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // flips.g:221:4: ( 'trn' | 'turn' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==141) ) {
                alt46=1;
            }
            else if ( (LA46_0==142) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // flips.g:221:5: 'trn'
                    {
                    string_literal126=(Token)match(input,141,FOLLOW_141_in_turnCommand1195);  
                    stream_141.add(string_literal126);


                    }
                    break;
                case 2 :
                    // flips.g:221:11: 'turn'
                    {
                    string_literal127=(Token)match(input,142,FOLLOW_142_in_turnCommand1197);  
                    stream_142.add(string_literal127);


                    }
                    break;

            }

            // flips.g:221:19: ( turnCommandValue )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=Turning && LA47_0<=Heading)||LA47_0==248||(LA47_0>=254 && LA47_0<=284)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // flips.g:221:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand1200);
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
            // 222:2: -> ^( FLY ( turnCommandValue )* )
            {
                // flips.g:222:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // flips.g:222:11: ( turnCommandValue )*
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
    // flips.g:225:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction129 = null;



        try {
            // flips.g:226:2: ( direction )
            // flips.g:226:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue1222);
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
    // flips.g:229:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        flipsParser.loiterCommandValue_return loiterCommandValue132 = null;


        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // flips.g:230:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // flips.g:230:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // flips.g:230:4: ( 'ltr' | 'loiter' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==143) ) {
                alt48=1;
            }
            else if ( (LA48_0==144) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // flips.g:230:5: 'ltr'
                    {
                    string_literal130=(Token)match(input,143,FOLLOW_143_in_loiterCommand1234);  
                    stream_143.add(string_literal130);


                    }
                    break;
                case 2 :
                    // flips.g:230:11: 'loiter'
                    {
                    string_literal131=(Token)match(input,144,FOLLOW_144_in_loiterCommand1236);  
                    stream_144.add(string_literal131);


                    }
                    break;

            }

            // flips.g:230:21: ( loiterCommandValue )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=BinaryLiteral && LA49_0<=HexLiteral)) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==170||(LA49_2>=172 && LA49_2<=198)||(LA49_2>=201 && LA49_2<=208)||(LA49_2>=316 && LA49_2<=317)) ) {
                        alt49=1;
                    }


                }
                else if ( ((LA49_0>=To && LA49_0<=With)||LA49_0==Turning||LA49_0==FloatingPointLiteral||LA49_0==149||(LA49_0>=170 && LA49_0<=171)||(LA49_0>=211 && LA49_0<=216)||LA49_0==237||LA49_0==253||(LA49_0>=285 && LA49_0<=294)||(LA49_0>=301 && LA49_0<=304)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // flips.g:230:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand1239);
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
            // 231:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // flips.g:231:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // flips.g:231:14: ( loiterCommandValue )*
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
    // flips.g:234:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
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
            // flips.g:235:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt50=7;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // flips.g:235:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue1261);
                    time133=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time133.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:236:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue1266);
                    speed134=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed134.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:237:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue1271);
                    loiterDirection135=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection135.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:238:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue1276);
                    radius136=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius136.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:239:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue1281);
                    duration137=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration137.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:240:4: At waypoint
                    {
                    At138=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue1286);  
                    stream_At.add(At138);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue1288);
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
                    // 241:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:242:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue1298);
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
    // flips.g:245:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
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
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:246:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Identifier) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==108) ) {
                    alt52=2;
                }
                else if ( (LA52_1==EOF||LA52_1==Identifier||(LA52_1>=BinaryLiteral && LA52_1<=HexLiteral)||(LA52_1>=116 && LA52_1<=117)||(LA52_1>=120 && LA52_1<=123)||(LA52_1>=139 && LA52_1<=144)) ) {
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
                    // flips.g:246:4: Identifier
                    {
                    Identifier141=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1309);  
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
                    // 247:2: -> ^( EXECUTE Identifier )
                    {
                        // flips.g:247:5: ^( EXECUTE Identifier )
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
                    // flips.g:248:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier142=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1323);  
                    stream_Identifier.add(Identifier142);

                    char_literal143=(Token)match(input,108,FOLLOW_108_in_executeCommand1325);  
                    stream_108.add(char_literal143);

                    pushFollow(FOLLOW_numericValue_in_executeCommand1327);
                    numericValue144=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue144.getTree());
                    // flips.g:248:32: ( ',' numericValue )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==107) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // flips.g:248:33: ',' numericValue
                    	    {
                    	    char_literal145=(Token)match(input,107,FOLLOW_107_in_executeCommand1330);  
                    	    stream_107.add(char_literal145);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand1332);
                    	    numericValue146=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue146.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    char_literal147=(Token)match(input,109,FOLLOW_109_in_executeCommand1337);  
                    stream_109.add(char_literal147);



                    // AST REWRITE
                    // elements: Identifier, numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 249:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // flips.g:249:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // flips.g:249:26: ^( PARAMETER numericValue )
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
    // flips.g:254:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
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
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // flips.g:255:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=133 && LA57_0<=134)) ) {
                alt57=1;
            }
            else if ( (LA57_0==With||(LA57_0>=146 && LA57_0<=147)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // flips.g:255:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // flips.g:255:4: ( 'pit' | 'pitch' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==133) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==134) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // flips.g:255:5: 'pit'
                            {
                            string_literal148=(Token)match(input,133,FOLLOW_133_in_pitch1367);  
                            stream_133.add(string_literal148);


                            }
                            break;
                        case 2 :
                            // flips.g:255:11: 'pitch'
                            {
                            string_literal149=(Token)match(input,134,FOLLOW_134_in_pitch1369);  
                            stream_134.add(string_literal149);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1372);
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
                    // 256:2: -> ^( PITCH angularValue )
                    {
                        // flips.g:256:5: ^( PITCH angularValue )
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
                    // flips.g:257:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // flips.g:257:4: ( With 'an' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==With) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // flips.g:257:5: With 'an'
                            {
                            With151=(Token)match(input,With,FOLLOW_With_in_pitch1387);  
                            stream_With.add(With151);

                            string_literal152=(Token)match(input,145,FOLLOW_145_in_pitch1389);  
                            stream_145.add(string_literal152);


                            }
                            break;

                    }

                    // flips.g:257:17: ( 'aoa' | 'angle of attack' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==146) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==147) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // flips.g:257:18: 'aoa'
                            {
                            string_literal153=(Token)match(input,146,FOLLOW_146_in_pitch1394);  
                            stream_146.add(string_literal153);


                            }
                            break;
                        case 2 :
                            // flips.g:257:24: 'angle of attack'
                            {
                            string_literal154=(Token)match(input,147,FOLLOW_147_in_pitch1396);  
                            stream_147.add(string_literal154);


                            }
                            break;

                    }

                    // flips.g:257:43: ( 'of' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==148) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // flips.g:257:43: 'of'
                            {
                            string_literal155=(Token)match(input,148,FOLLOW_148_in_pitch1399);  
                            stream_148.add(string_literal155);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1402);
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
                    // 258:2: -> ^( PITCH angularValue )
                    {
                        // flips.g:258:5: ^( PITCH angularValue )
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
    // flips.g:261:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal157=null;
        Token string_literal158=null;
        flipsParser.angularValue_return angularValue159 = null;


        CommonTree string_literal157_tree=null;
        CommonTree string_literal158_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // flips.g:262:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // flips.g:262:4: ( 'rol' | 'roll' ) angularValue
            {
            // flips.g:262:4: ( 'rol' | 'roll' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==135) ) {
                alt58=1;
            }
            else if ( (LA58_0==136) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // flips.g:262:5: 'rol'
                    {
                    string_literal157=(Token)match(input,135,FOLLOW_135_in_roll1423);  
                    stream_135.add(string_literal157);


                    }
                    break;
                case 2 :
                    // flips.g:262:11: 'roll'
                    {
                    string_literal158=(Token)match(input,136,FOLLOW_136_in_roll1425);  
                    stream_136.add(string_literal158);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1428);
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
            // 263:2: -> ^( ROLL angularValue )
            {
                // flips.g:263:5: ^( ROLL angularValue )
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
    // flips.g:268:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude160 = null;

        flipsParser.relativeAltitude_return relativeAltitude161 = null;



        try {
            // flips.g:269:2: ( fixedAltitude | relativeAltitude )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // flips.g:269:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1450);
                    fixedAltitude160=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude160.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:270:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1455);
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
    // flips.g:273:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
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
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // flips.g:274:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // flips.g:274:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // flips.g:274:4: ( ( upDownDirection )? To | At | With )
            int alt61=3;
            switch ( input.LA(1) ) {
            case To:
            case 237:
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
                    // flips.g:274:5: ( upDownDirection )? To
                    {
                    // flips.g:274:5: ( upDownDirection )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==237||(LA60_0>=285 && LA60_0<=294)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // flips.g:274:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1467);
                            upDownDirection162=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection162.getTree());

                            }
                            break;

                    }

                    To163=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1470);  
                    stream_To.add(To163);


                    }
                    break;
                case 2 :
                    // flips.g:274:25: At
                    {
                    At164=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1472);  
                    stream_At.add(At164);


                    }
                    break;
                case 3 :
                    // flips.g:274:28: With
                    {
                    With165=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1474);  
                    stream_With.add(With165);


                    }
                    break;

            }

            // flips.g:274:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=137 && LA68_0<=138)||LA68_0==145||(LA68_0>=149 && LA68_0<=151)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // flips.g:274:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // flips.g:274:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=137 && LA66_0<=138)||LA66_0==145) ) {
                        alt66=1;
                    }
                    else if ( ((LA66_0>=149 && LA66_0<=151)) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // flips.g:274:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // flips.g:274:36: ( 'an' )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==145) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // flips.g:274:36: 'an'
                                    {
                                    string_literal166=(Token)match(input,145,FOLLOW_145_in_fixedAltitude1479);  
                                    stream_145.add(string_literal166);


                                    }
                                    break;

                            }

                            // flips.g:274:42: ( 'alt' | 'altitude' )
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==137) ) {
                                alt63=1;
                            }
                            else if ( (LA63_0==138) ) {
                                alt63=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                throw nvae;
                            }
                            switch (alt63) {
                                case 1 :
                                    // flips.g:274:43: 'alt'
                                    {
                                    string_literal167=(Token)match(input,137,FOLLOW_137_in_fixedAltitude1483);  
                                    stream_137.add(string_literal167);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:274:49: 'altitude'
                                    {
                                    string_literal168=(Token)match(input,138,FOLLOW_138_in_fixedAltitude1485);  
                                    stream_138.add(string_literal168);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // flips.g:274:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // flips.g:274:61: ( 'a' )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==149) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // flips.g:274:61: 'a'
                                    {
                                    char_literal169=(Token)match(input,149,FOLLOW_149_in_fixedAltitude1488);  
                                    stream_149.add(char_literal169);


                                    }
                                    break;

                            }

                            // flips.g:274:66: ( 'pres' | 'pressure' )
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==150) ) {
                                alt65=1;
                            }
                            else if ( (LA65_0==151) ) {
                                alt65=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 0, input);

                                throw nvae;
                            }
                            switch (alt65) {
                                case 1 :
                                    // flips.g:274:67: 'pres'
                                    {
                                    string_literal170=(Token)match(input,150,FOLLOW_150_in_fixedAltitude1492);  
                                    stream_150.add(string_literal170);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:274:74: 'pressure'
                                    {
                                    string_literal171=(Token)match(input,151,FOLLOW_151_in_fixedAltitude1494);  
                                    stream_151.add(string_literal171);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // flips.g:274:87: ( 'of' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==148) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // flips.g:274:87: 'of'
                            {
                            string_literal172=(Token)match(input,148,FOLLOW_148_in_fixedAltitude1498);  
                            stream_148.add(string_literal172);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1503);
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
            // 275:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // flips.g:275:5: ^( ALTITUDE FIXED altitudeValue )
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
    // flips.g:278:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection174 = null;

        flipsParser.altitudeValue_return altitudeValue175 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // flips.g:279:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // flips.g:279:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1525);
            upDownDirection174=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection174.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1527);
            altitudeValue175=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue175.getTree());


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
            // 280:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // flips.g:280:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // flips.g:283:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
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
            // flips.g:284:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt69=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==170||(LA69_1>=172 && LA69_1<=198)) ) {
                    alt69=1;
                }
                else if ( ((LA69_1>=152 && LA69_1<=169)) ) {
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

                if ( (LA69_2==170||(LA69_2>=172 && LA69_2<=198)) ) {
                    alt69=1;
                }
                else if ( ((LA69_2>=152 && LA69_2<=169)) ) {
                    alt69=2;
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
                    // flips.g:284:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1551);
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
                    // 285:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:286:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1563);
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
                    // 287:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:288:4: FlightLevel
                    {
                    FlightLevel178=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1575);  
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
                    // 289:2: -> FLIGHTLEVEL FlightLevel
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
    // flips.g:292:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue179 = null;

        flipsParser.pressureUnit_return pressureUnit180 = null;



        try {
            // flips.g:293:2: ( numericValue pressureUnit )
            // flips.g:293:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1593);
            numericValue179=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue179.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1595);
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
    // flips.g:296:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
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
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // flips.g:297:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 152:
            case 153:
            case 154:
                {
                alt76=1;
                }
                break;
            case 155:
            case 156:
            case 157:
                {
                alt76=2;
                }
                break;
            case 158:
            case 159:
            case 160:
                {
                alt76=3;
                }
                break;
            case 161:
            case 162:
                {
                alt76=4;
                }
                break;
            case 163:
            case 164:
            case 165:
                {
                alt76=5;
                }
                break;
            case 166:
            case 167:
            case 168:
            case 169:
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
                    // flips.g:297:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // flips.g:297:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt70=3;
                    switch ( input.LA(1) ) {
                    case 152:
                        {
                        alt70=1;
                        }
                        break;
                    case 153:
                        {
                        alt70=2;
                        }
                        break;
                    case 154:
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
                            // flips.g:297:5: 'kpa'
                            {
                            string_literal181=(Token)match(input,152,FOLLOW_152_in_pressureUnit1607);  
                            stream_152.add(string_literal181);


                            }
                            break;
                        case 2 :
                            // flips.g:297:11: 'kilopascal'
                            {
                            string_literal182=(Token)match(input,153,FOLLOW_153_in_pressureUnit1609);  
                            stream_153.add(string_literal182);


                            }
                            break;
                        case 3 :
                            // flips.g:297:24: 'kilopascals'
                            {
                            string_literal183=(Token)match(input,154,FOLLOW_154_in_pressureUnit1611);  
                            stream_154.add(string_literal183);


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
                    // 298:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:299:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // flips.g:299:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 155:
                        {
                        alt71=1;
                        }
                        break;
                    case 156:
                        {
                        alt71=2;
                        }
                        break;
                    case 157:
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
                            // flips.g:299:5: 'hpa'
                            {
                            string_literal184=(Token)match(input,155,FOLLOW_155_in_pressureUnit1623);  
                            stream_155.add(string_literal184);


                            }
                            break;
                        case 2 :
                            // flips.g:299:11: 'hectopascal'
                            {
                            string_literal185=(Token)match(input,156,FOLLOW_156_in_pressureUnit1625);  
                            stream_156.add(string_literal185);


                            }
                            break;
                        case 3 :
                            // flips.g:299:25: 'hectopascals'
                            {
                            string_literal186=(Token)match(input,157,FOLLOW_157_in_pressureUnit1627);  
                            stream_157.add(string_literal186);


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
                    // 300:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:301:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // flips.g:301:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case 158:
                        {
                        alt72=1;
                        }
                        break;
                    case 159:
                        {
                        alt72=2;
                        }
                        break;
                    case 160:
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
                            // flips.g:301:5: 'pa'
                            {
                            string_literal187=(Token)match(input,158,FOLLOW_158_in_pressureUnit1639);  
                            stream_158.add(string_literal187);


                            }
                            break;
                        case 2 :
                            // flips.g:301:10: 'pascal'
                            {
                            string_literal188=(Token)match(input,159,FOLLOW_159_in_pressureUnit1641);  
                            stream_159.add(string_literal188);


                            }
                            break;
                        case 3 :
                            // flips.g:301:19: 'pascals'
                            {
                            string_literal189=(Token)match(input,160,FOLLOW_160_in_pressureUnit1643);  
                            stream_160.add(string_literal189);


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
                    // 302:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:303:4: ( 'bar' | 'bars' )
                    {
                    // flips.g:303:4: ( 'bar' | 'bars' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==161) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==162) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // flips.g:303:5: 'bar'
                            {
                            string_literal190=(Token)match(input,161,FOLLOW_161_in_pressureUnit1655);  
                            stream_161.add(string_literal190);


                            }
                            break;
                        case 2 :
                            // flips.g:303:11: 'bars'
                            {
                            string_literal191=(Token)match(input,162,FOLLOW_162_in_pressureUnit1657);  
                            stream_162.add(string_literal191);


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
                    // 304:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:305:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // flips.g:305:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt74=3;
                    switch ( input.LA(1) ) {
                    case 163:
                        {
                        alt74=1;
                        }
                        break;
                    case 164:
                        {
                        alt74=2;
                        }
                        break;
                    case 165:
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
                            // flips.g:305:5: 'mbar'
                            {
                            string_literal192=(Token)match(input,163,FOLLOW_163_in_pressureUnit1669);  
                            stream_163.add(string_literal192);


                            }
                            break;
                        case 2 :
                            // flips.g:305:12: 'millibar'
                            {
                            string_literal193=(Token)match(input,164,FOLLOW_164_in_pressureUnit1671);  
                            stream_164.add(string_literal193);


                            }
                            break;
                        case 3 :
                            // flips.g:305:23: 'millibars'
                            {
                            string_literal194=(Token)match(input,165,FOLLOW_165_in_pressureUnit1673);  
                            stream_165.add(string_literal194);


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
                    // 306:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:307:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // flips.g:307:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt75=4;
                    switch ( input.LA(1) ) {
                    case 166:
                        {
                        alt75=1;
                        }
                        break;
                    case 167:
                        {
                        alt75=2;
                        }
                        break;
                    case 168:
                        {
                        alt75=3;
                        }
                        break;
                    case 169:
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
                            // flips.g:307:5: 'atm'
                            {
                            string_literal195=(Token)match(input,166,FOLLOW_166_in_pressureUnit1685);  
                            stream_166.add(string_literal195);


                            }
                            break;
                        case 2 :
                            // flips.g:307:11: 'atms'
                            {
                            string_literal196=(Token)match(input,167,FOLLOW_167_in_pressureUnit1687);  
                            stream_167.add(string_literal196);


                            }
                            break;
                        case 3 :
                            // flips.g:307:18: 'atmosphere'
                            {
                            string_literal197=(Token)match(input,168,FOLLOW_168_in_pressureUnit1689);  
                            stream_168.add(string_literal197);


                            }
                            break;
                        case 4 :
                            // flips.g:307:31: 'atmospheres'
                            {
                            string_literal198=(Token)match(input,169,FOLLOW_169_in_pressureUnit1691);  
                            stream_169.add(string_literal198);


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
                    // 308:2: -> ATMOSPHERE
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
    // flips.g:313:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
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
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:314:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // flips.g:314:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // flips.g:314:4: ( 'in' | With )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==170) ) {
                alt77=1;
            }
            else if ( (LA77_0==With) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // flips.g:314:5: 'in'
                    {
                    string_literal199=(Token)match(input,170,FOLLOW_170_in_radius1711);  
                    stream_170.add(string_literal199);


                    }
                    break;
                case 2 :
                    // flips.g:314:10: With
                    {
                    With200=(Token)match(input,With,FOLLOW_With_in_radius1713);  
                    stream_With.add(With200);


                    }
                    break;

            }

            // flips.g:314:17: ( 'a' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==149) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // flips.g:314:17: 'a'
                    {
                    char_literal201=(Token)match(input,149,FOLLOW_149_in_radius1717);  
                    stream_149.add(char_literal201);


                    }
                    break;

            }

            // flips.g:314:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==171) ) {
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
                    // flips.g:314:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal202=(Token)match(input,171,FOLLOW_171_in_radius1721);  
                    stream_171.add(string_literal202);

                    // flips.g:314:32: ( 'of' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==148) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // flips.g:314:32: 'of'
                            {
                            string_literal203=(Token)match(input,148,FOLLOW_148_in_radius1723);  
                            stream_148.add(string_literal203);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1726);
                    distanceValue204=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue204.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:314:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1728);
                    distanceValue205=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue205.getTree());
                    string_literal206=(Token)match(input,171,FOLLOW_171_in_radius1730);  
                    stream_171.add(string_literal206);


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
            // 315:2: -> ^( RADIUS distanceValue )
            {
                // flips.g:315:5: ^( RADIUS distanceValue )
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
    // flips.g:318:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection207 = null;

        flipsParser.distanceValue_return distanceValue208 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:319:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // flips.g:319:4: ( leftRightDirection )? distanceValue
            {
            // flips.g:319:4: ( leftRightDirection )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=295 && LA81_0<=300)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // flips.g:319:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1751);
                    leftRightDirection207=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection207.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1754);
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
            // 320:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // flips.g:320:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // flips.g:320:16: ( leftRightDirection )?
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
    // flips.g:323:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue209 = null;

        flipsParser.distanceUnit_return distanceUnit210 = null;



        try {
            // flips.g:324:2: ( numericValue distanceUnit )
            // flips.g:324:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1777);
            numericValue209=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue209.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1779);
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
    // flips.g:327:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'cm' | 'centimeter' | 'centimeters' ) -> CENTIMETER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'f' | 'fur' | 'furlong' | 'furlongs' ) -> FURLONG | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT | ( 'in' | 'inch' | 'inches' ) -> INCH );
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
        Token char_literal229=null;
        Token string_literal230=null;
        Token string_literal231=null;
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
        CommonTree char_literal229_tree=null;
        CommonTree string_literal230_tree=null;
        CommonTree string_literal231_tree=null;
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
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
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
            // flips.g:328:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'cm' | 'centimeter' | 'centimeters' ) -> CENTIMETER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'f' | 'fur' | 'furlong' | 'furlongs' ) -> FURLONG | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT | ( 'in' | 'inch' | 'inches' ) -> INCH )
            int alt93=9;
            switch ( input.LA(1) ) {
            case 172:
            case 173:
            case 174:
                {
                alt93=1;
                }
                break;
            case 175:
            case 176:
            case 177:
                {
                alt93=2;
                }
                break;
            case 178:
            case 179:
            case 180:
                {
                alt93=3;
                }
                break;
            case 181:
            case 182:
                {
                alt93=4;
                }
                break;
            case 183:
            case 184:
            case 185:
            case 186:
                {
                alt93=5;
                }
                break;
            case 187:
            case 188:
            case 189:
            case 190:
                {
                alt93=6;
                }
                break;
            case 191:
            case 192:
            case 193:
                {
                alt93=7;
                }
                break;
            case 194:
            case 195:
            case 196:
                {
                alt93=8;
                }
                break;
            case 170:
            case 197:
            case 198:
                {
                alt93=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // flips.g:328:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // flips.g:328:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt82=3;
                    switch ( input.LA(1) ) {
                    case 172:
                        {
                        alt82=1;
                        }
                        break;
                    case 173:
                        {
                        alt82=2;
                        }
                        break;
                    case 174:
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
                            // flips.g:328:5: 'km'
                            {
                            string_literal211=(Token)match(input,172,FOLLOW_172_in_distanceUnit1791);  
                            stream_172.add(string_literal211);


                            }
                            break;
                        case 2 :
                            // flips.g:328:10: 'kilometer'
                            {
                            string_literal212=(Token)match(input,173,FOLLOW_173_in_distanceUnit1793);  
                            stream_173.add(string_literal212);


                            }
                            break;
                        case 3 :
                            // flips.g:328:22: 'kilometers'
                            {
                            string_literal213=(Token)match(input,174,FOLLOW_174_in_distanceUnit1795);  
                            stream_174.add(string_literal213);


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
                    // 329:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:330:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // flips.g:330:4: ( 'm' | 'meter' | 'meters' )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case 175:
                        {
                        alt83=1;
                        }
                        break;
                    case 176:
                        {
                        alt83=2;
                        }
                        break;
                    case 177:
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
                            // flips.g:330:5: 'm'
                            {
                            char_literal214=(Token)match(input,175,FOLLOW_175_in_distanceUnit1807);  
                            stream_175.add(char_literal214);


                            }
                            break;
                        case 2 :
                            // flips.g:330:9: 'meter'
                            {
                            string_literal215=(Token)match(input,176,FOLLOW_176_in_distanceUnit1809);  
                            stream_176.add(string_literal215);


                            }
                            break;
                        case 3 :
                            // flips.g:330:17: 'meters'
                            {
                            string_literal216=(Token)match(input,177,FOLLOW_177_in_distanceUnit1811);  
                            stream_177.add(string_literal216);


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
                    // 331:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:332:4: ( 'cm' | 'centimeter' | 'centimeters' )
                    {
                    // flips.g:332:4: ( 'cm' | 'centimeter' | 'centimeters' )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case 178:
                        {
                        alt84=1;
                        }
                        break;
                    case 179:
                        {
                        alt84=2;
                        }
                        break;
                    case 180:
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
                            // flips.g:332:5: 'cm'
                            {
                            string_literal217=(Token)match(input,178,FOLLOW_178_in_distanceUnit1823);  
                            stream_178.add(string_literal217);


                            }
                            break;
                        case 2 :
                            // flips.g:332:10: 'centimeter'
                            {
                            string_literal218=(Token)match(input,179,FOLLOW_179_in_distanceUnit1825);  
                            stream_179.add(string_literal218);


                            }
                            break;
                        case 3 :
                            // flips.g:332:23: 'centimeters'
                            {
                            string_literal219=(Token)match(input,180,FOLLOW_180_in_distanceUnit1827);  
                            stream_180.add(string_literal219);


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
                    // 333:2: -> CENTIMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CENTIMETER, "CENTIMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:334:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // flips.g:334:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==181) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==182) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // flips.g:334:5: 'nm'
                            {
                            string_literal220=(Token)match(input,181,FOLLOW_181_in_distanceUnit1839);  
                            stream_181.add(string_literal220);


                            }
                            break;
                        case 2 :
                            // flips.g:334:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal221=(Token)match(input,182,FOLLOW_182_in_distanceUnit1841);  
                            stream_182.add(string_literal221);

                            // flips.g:334:21: ( 'mi' | 'mile' | 'miles' )
                            int alt85=3;
                            switch ( input.LA(1) ) {
                            case 183:
                                {
                                alt85=1;
                                }
                                break;
                            case 184:
                                {
                                alt85=2;
                                }
                                break;
                            case 185:
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
                                    // flips.g:334:22: 'mi'
                                    {
                                    string_literal222=(Token)match(input,183,FOLLOW_183_in_distanceUnit1844);  
                                    stream_183.add(string_literal222);


                                    }
                                    break;
                                case 2 :
                                    // flips.g:334:27: 'mile'
                                    {
                                    string_literal223=(Token)match(input,184,FOLLOW_184_in_distanceUnit1846);  
                                    stream_184.add(string_literal223);


                                    }
                                    break;
                                case 3 :
                                    // flips.g:334:34: 'miles'
                                    {
                                    string_literal224=(Token)match(input,185,FOLLOW_185_in_distanceUnit1848);  
                                    stream_185.add(string_literal224);


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
                    // 335:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:336:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // flips.g:336:4: ( 'statute' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==186) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // flips.g:336:5: 'statute'
                            {
                            string_literal225=(Token)match(input,186,FOLLOW_186_in_distanceUnit1863);  
                            stream_186.add(string_literal225);


                            }
                            break;

                    }

                    // flips.g:336:17: ( 'mi' | 'mile' | 'miles' )
                    int alt88=3;
                    switch ( input.LA(1) ) {
                    case 183:
                        {
                        alt88=1;
                        }
                        break;
                    case 184:
                        {
                        alt88=2;
                        }
                        break;
                    case 185:
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
                            // flips.g:336:18: 'mi'
                            {
                            string_literal226=(Token)match(input,183,FOLLOW_183_in_distanceUnit1868);  
                            stream_183.add(string_literal226);


                            }
                            break;
                        case 2 :
                            // flips.g:336:23: 'mile'
                            {
                            string_literal227=(Token)match(input,184,FOLLOW_184_in_distanceUnit1870);  
                            stream_184.add(string_literal227);


                            }
                            break;
                        case 3 :
                            // flips.g:336:30: 'miles'
                            {
                            string_literal228=(Token)match(input,185,FOLLOW_185_in_distanceUnit1872);  
                            stream_185.add(string_literal228);


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
                    // 337:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:338:4: ( 'f' | 'fur' | 'furlong' | 'furlongs' )
                    {
                    // flips.g:338:4: ( 'f' | 'fur' | 'furlong' | 'furlongs' )
                    int alt89=4;
                    switch ( input.LA(1) ) {
                    case 187:
                        {
                        alt89=1;
                        }
                        break;
                    case 188:
                        {
                        alt89=2;
                        }
                        break;
                    case 189:
                        {
                        alt89=3;
                        }
                        break;
                    case 190:
                        {
                        alt89=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }

                    switch (alt89) {
                        case 1 :
                            // flips.g:338:5: 'f'
                            {
                            char_literal229=(Token)match(input,187,FOLLOW_187_in_distanceUnit1884);  
                            stream_187.add(char_literal229);


                            }
                            break;
                        case 2 :
                            // flips.g:338:9: 'fur'
                            {
                            string_literal230=(Token)match(input,188,FOLLOW_188_in_distanceUnit1886);  
                            stream_188.add(string_literal230);


                            }
                            break;
                        case 3 :
                            // flips.g:338:15: 'furlong'
                            {
                            string_literal231=(Token)match(input,189,FOLLOW_189_in_distanceUnit1888);  
                            stream_189.add(string_literal231);


                            }
                            break;
                        case 4 :
                            // flips.g:338:25: 'furlongs'
                            {
                            string_literal232=(Token)match(input,190,FOLLOW_190_in_distanceUnit1890);  
                            stream_190.add(string_literal232);


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
                    // 339:2: -> FURLONG
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FURLONG, "FURLONG"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:340:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // flips.g:340:4: ( 'yd' | 'yard' | 'yards' )
                    int alt90=3;
                    switch ( input.LA(1) ) {
                    case 191:
                        {
                        alt90=1;
                        }
                        break;
                    case 192:
                        {
                        alt90=2;
                        }
                        break;
                    case 193:
                        {
                        alt90=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }

                    switch (alt90) {
                        case 1 :
                            // flips.g:340:5: 'yd'
                            {
                            string_literal233=(Token)match(input,191,FOLLOW_191_in_distanceUnit1902);  
                            stream_191.add(string_literal233);


                            }
                            break;
                        case 2 :
                            // flips.g:340:10: 'yard'
                            {
                            string_literal234=(Token)match(input,192,FOLLOW_192_in_distanceUnit1904);  
                            stream_192.add(string_literal234);


                            }
                            break;
                        case 3 :
                            // flips.g:340:17: 'yards'
                            {
                            string_literal235=(Token)match(input,193,FOLLOW_193_in_distanceUnit1906);  
                            stream_193.add(string_literal235);


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
                    // 341:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // flips.g:342:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // flips.g:342:4: ( 'ft' | 'foot' | 'feet' )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case 194:
                        {
                        alt91=1;
                        }
                        break;
                    case 195:
                        {
                        alt91=2;
                        }
                        break;
                    case 196:
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
                            // flips.g:342:5: 'ft'
                            {
                            string_literal236=(Token)match(input,194,FOLLOW_194_in_distanceUnit1918);  
                            stream_194.add(string_literal236);


                            }
                            break;
                        case 2 :
                            // flips.g:342:10: 'foot'
                            {
                            string_literal237=(Token)match(input,195,FOLLOW_195_in_distanceUnit1920);  
                            stream_195.add(string_literal237);


                            }
                            break;
                        case 3 :
                            // flips.g:342:17: 'feet'
                            {
                            string_literal238=(Token)match(input,196,FOLLOW_196_in_distanceUnit1922);  
                            stream_196.add(string_literal238);


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
                    // 343:2: -> FOOT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // flips.g:344:4: ( 'in' | 'inch' | 'inches' )
                    {
                    // flips.g:344:4: ( 'in' | 'inch' | 'inches' )
                    int alt92=3;
                    switch ( input.LA(1) ) {
                    case 170:
                        {
                        alt92=1;
                        }
                        break;
                    case 197:
                        {
                        alt92=2;
                        }
                        break;
                    case 198:
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
                            // flips.g:344:5: 'in'
                            {
                            string_literal239=(Token)match(input,170,FOLLOW_170_in_distanceUnit1934);  
                            stream_170.add(string_literal239);


                            }
                            break;
                        case 2 :
                            // flips.g:344:10: 'inch'
                            {
                            string_literal240=(Token)match(input,197,FOLLOW_197_in_distanceUnit1936);  
                            stream_197.add(string_literal240);


                            }
                            break;
                        case 3 :
                            // flips.g:344:17: 'inches'
                            {
                            string_literal241=(Token)match(input,198,FOLLOW_198_in_distanceUnit1938);  
                            stream_198.add(string_literal241);


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
                    // 345:2: -> INCH
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
    // flips.g:350:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed242 = null;

        flipsParser.relativeSpeed_return relativeSpeed243 = null;

        flipsParser.optimalSpeed_return optimalSpeed244 = null;

        flipsParser.throttleSpeed_return throttleSpeed245 = null;



        try {
            // flips.g:351:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt94=4;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // flips.g:351:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1957);
                    fixedSpeed242=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed242.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:352:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1962);
                    relativeSpeed243=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed243.getTree());

                    }
                    break;
                case 3 :
                    // flips.g:353:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed1967);
                    optimalSpeed244=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed244.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:354:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1972);
                    throttleSpeed245=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed245.getTree());

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
    // flips.g:357:1: fixedSpeed : ( At )? speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At246=null;
        flipsParser.speedValue_return speedValue247 = null;


        CommonTree At246_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // flips.g:358:2: ( ( At )? speedValue -> ^( SPEED FIXED speedValue ) )
            // flips.g:358:4: ( At )? speedValue
            {
            // flips.g:358:4: ( At )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==At) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // flips.g:358:4: At
                    {
                    At246=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1983);  
                    stream_At.add(At246);


                    }
                    break;

            }

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1986);
            speedValue247=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue247.getTree());


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
            // 359:2: -> ^( SPEED FIXED speedValue )
            {
                // flips.g:359:5: ^( SPEED FIXED speedValue )
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
    // flips.g:362:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal249=null;
        Token string_literal251=null;
        Token string_literal253=null;
        Token string_literal255=null;
        flipsParser.speedValue_return speedValue248 = null;

        flipsParser.speedValue_return speedValue250 = null;

        flipsParser.percentValue_return percentValue252 = null;

        flipsParser.percentValue_return percentValue254 = null;


        CommonTree string_literal249_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree string_literal255_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // flips.g:363:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt96=4;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // flips.g:363:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed2008);
                    speedValue248=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue248.getTree());
                    string_literal249=(Token)match(input,199,FOLLOW_199_in_relativeSpeed2010);  
                    stream_199.add(string_literal249);



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
                    // 364:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // flips.g:364:5: ^( SPEED RELATIVE FASTER speedValue )
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
                    // flips.g:365:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed2028);
                    speedValue250=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue250.getTree());
                    string_literal251=(Token)match(input,200,FOLLOW_200_in_relativeSpeed2030);  
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
                    // 366:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // flips.g:366:5: ^( SPEED RELATIVE SLOWER speedValue )
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
                    // flips.g:367:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed2048);
                    percentValue252=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue252.getTree());
                    string_literal253=(Token)match(input,199,FOLLOW_199_in_relativeSpeed2050);  
                    stream_199.add(string_literal253);



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
                    // 368:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // flips.g:368:5: ^( SPEED RELATIVE FASTER percentValue )
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
                    // flips.g:369:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed2068);
                    percentValue254=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue254.getTree());
                    string_literal255=(Token)match(input,200,FOLLOW_200_in_relativeSpeed2070);  
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
                    // 370:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // flips.g:370:5: ^( SPEED RELATIVE SLOWER percentValue )
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
    // flips.g:373:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue256 = null;

        flipsParser.speedUnit_return speedUnit257 = null;



        try {
            // flips.g:374:2: ( numericValue speedUnit )
            // flips.g:374:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue2094);
            numericValue256=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue256.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue2096);
            speedUnit257=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit257.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // flips.g:377:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | 'fpf' -> FURLONG FORTNIGHT | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal258=null;
        Token string_literal259=null;
        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal262=null;
        Token string_literal263=null;
        Token string_literal264=null;
        Token string_literal265=null;
        Token char_literal267=null;
        Token string_literal268=null;
        flipsParser.distanceUnit_return distanceUnit266 = null;

        flipsParser.timeUnit_return timeUnit269 = null;


        CommonTree string_literal258_tree=null;
        CommonTree string_literal259_tree=null;
        CommonTree string_literal260_tree=null;
        CommonTree string_literal261_tree=null;
        CommonTree string_literal262_tree=null;
        CommonTree string_literal263_tree=null;
        CommonTree string_literal264_tree=null;
        CommonTree string_literal265_tree=null;
        CommonTree char_literal267_tree=null;
        CommonTree string_literal268_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // flips.g:378:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | 'fpf' -> FURLONG FORTNIGHT | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 201:
                {
                alt99=1;
                }
                break;
            case 202:
                {
                alt99=2;
                }
                break;
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
                {
                alt99=3;
                }
                break;
            case 208:
                {
                alt99=4;
                }
                break;
            case 170:
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
            case 196:
            case 197:
            case 198:
                {
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // flips.g:378:4: 'kph'
                    {
                    string_literal258=(Token)match(input,201,FOLLOW_201_in_speedUnit2107);  
                    stream_201.add(string_literal258);



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
                    // 379:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:380:4: 'mph'
                    {
                    string_literal259=(Token)match(input,202,FOLLOW_202_in_speedUnit2119);  
                    stream_202.add(string_literal259);



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
                    // 381:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:382:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // flips.g:382:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt97=5;
                    switch ( input.LA(1) ) {
                    case 203:
                        {
                        alt97=1;
                        }
                        break;
                    case 204:
                        {
                        alt97=2;
                        }
                        break;
                    case 205:
                        {
                        alt97=3;
                        }
                        break;
                    case 206:
                        {
                        alt97=4;
                        }
                        break;
                    case 207:
                        {
                        alt97=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }

                    switch (alt97) {
                        case 1 :
                            // flips.g:382:5: 'kn'
                            {
                            string_literal260=(Token)match(input,203,FOLLOW_203_in_speedUnit2132);  
                            stream_203.add(string_literal260);


                            }
                            break;
                        case 2 :
                            // flips.g:382:10: 'kt'
                            {
                            string_literal261=(Token)match(input,204,FOLLOW_204_in_speedUnit2134);  
                            stream_204.add(string_literal261);


                            }
                            break;
                        case 3 :
                            // flips.g:382:15: 'kts'
                            {
                            string_literal262=(Token)match(input,205,FOLLOW_205_in_speedUnit2136);  
                            stream_205.add(string_literal262);


                            }
                            break;
                        case 4 :
                            // flips.g:382:21: 'knot'
                            {
                            string_literal263=(Token)match(input,206,FOLLOW_206_in_speedUnit2138);  
                            stream_206.add(string_literal263);


                            }
                            break;
                        case 5 :
                            // flips.g:382:28: 'knots'
                            {
                            string_literal264=(Token)match(input,207,FOLLOW_207_in_speedUnit2140);  
                            stream_207.add(string_literal264);


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
                    // 383:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:384:4: 'fpf'
                    {
                    string_literal265=(Token)match(input,208,FOLLOW_208_in_speedUnit2155);  
                    stream_208.add(string_literal265);



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
                    // 385:2: -> FURLONG FORTNIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FURLONG, "FURLONG"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FORTNIGHT, "FORTNIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:386:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit2167);
                    distanceUnit266=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit266.getTree());
                    // flips.g:386:17: ( '/' | 'per' )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==209) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==210) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // flips.g:386:18: '/'
                            {
                            char_literal267=(Token)match(input,209,FOLLOW_209_in_speedUnit2170);  
                            stream_209.add(char_literal267);


                            }
                            break;
                        case 2 :
                            // flips.g:386:22: 'per'
                            {
                            string_literal268=(Token)match(input,210,FOLLOW_210_in_speedUnit2172);  
                            stream_210.add(string_literal268);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit2175);
                    timeUnit269=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit269.getTree());


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
                    // 387:2: -> distanceUnit timeUnit
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
    // flips.g:390:1: optimalSpeed : ( At )? optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At270=null;
        Token string_literal272=null;
        Token string_literal273=null;
        flipsParser.optimalUnit_return optimalUnit271 = null;


        CommonTree At270_tree=null;
        CommonTree string_literal272_tree=null;
        CommonTree string_literal273_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // flips.g:391:2: ( ( At )? optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // flips.g:391:4: ( At )? optimalUnit ( 'spd' | 'speed' )
            {
            // flips.g:391:4: ( At )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==At) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // flips.g:391:4: At
                    {
                    At270=(Token)match(input,At,FOLLOW_At_in_optimalSpeed2193);  
                    stream_At.add(At270);


                    }
                    break;

            }

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed2196);
            optimalUnit271=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit271.getTree());
            // flips.g:391:20: ( 'spd' | 'speed' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==129) ) {
                alt101=1;
            }
            else if ( (LA101_0==130) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // flips.g:391:21: 'spd'
                    {
                    string_literal272=(Token)match(input,129,FOLLOW_129_in_optimalSpeed2199);  
                    stream_129.add(string_literal272);


                    }
                    break;
                case 2 :
                    // flips.g:391:27: 'speed'
                    {
                    string_literal273=(Token)match(input,130,FOLLOW_130_in_optimalSpeed2201);  
                    stream_130.add(string_literal273);


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
            // 392:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                // flips.g:392:5: ^( SPEED OPTIMAL optimalUnit )
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
    // flips.g:395:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal274=null;
        Token string_literal275=null;
        Token string_literal276=null;
        Token string_literal277=null;
        Token string_literal278=null;
        Token string_literal279=null;

        CommonTree string_literal274_tree=null;
        CommonTree string_literal275_tree=null;
        CommonTree string_literal276_tree=null;
        CommonTree string_literal277_tree=null;
        CommonTree string_literal278_tree=null;
        CommonTree string_literal279_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");

        try {
            // flips.g:396:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt105=3;
            switch ( input.LA(1) ) {
            case 211:
            case 212:
                {
                alt105=1;
                }
                break;
            case 213:
            case 214:
                {
                alt105=2;
                }
                break;
            case 215:
            case 216:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // flips.g:396:4: ( 'min' | 'minimum' )
                    {
                    // flips.g:396:4: ( 'min' | 'minimum' )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==211) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==212) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // flips.g:396:5: 'min'
                            {
                            string_literal274=(Token)match(input,211,FOLLOW_211_in_optimalUnit2225);  
                            stream_211.add(string_literal274);


                            }
                            break;
                        case 2 :
                            // flips.g:396:11: 'minimum'
                            {
                            string_literal275=(Token)match(input,212,FOLLOW_212_in_optimalUnit2227);  
                            stream_212.add(string_literal275);


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
                    // 397:2: -> MINIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:398:4: ( 'cru' | 'cruise' )
                    {
                    // flips.g:398:4: ( 'cru' | 'cruise' )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==213) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==214) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // flips.g:398:5: 'cru'
                            {
                            string_literal276=(Token)match(input,213,FOLLOW_213_in_optimalUnit2239);  
                            stream_213.add(string_literal276);


                            }
                            break;
                        case 2 :
                            // flips.g:398:11: 'cruise'
                            {
                            string_literal277=(Token)match(input,214,FOLLOW_214_in_optimalUnit2241);  
                            stream_214.add(string_literal277);


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
                    // 399:2: -> CRUISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:400:4: ( 'max' | 'maximum' )
                    {
                    // flips.g:400:4: ( 'max' | 'maximum' )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==215) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==216) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // flips.g:400:5: 'max'
                            {
                            string_literal278=(Token)match(input,215,FOLLOW_215_in_optimalUnit2253);  
                            stream_215.add(string_literal278);


                            }
                            break;
                        case 2 :
                            // flips.g:400:11: 'maximum'
                            {
                            string_literal279=(Token)match(input,216,FOLLOW_216_in_optimalUnit2255);  
                            stream_216.add(string_literal279);


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
                    // 401:2: -> MAXIMUM
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
    // flips.g:404:1: throttleSpeed : ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At280=null;
        Token string_literal282=null;
        Token string_literal283=null;
        Token string_literal284=null;
        Token string_literal285=null;
        flipsParser.throttleValue_return throttleValue281 = null;


        CommonTree At280_tree=null;
        CommonTree string_literal282_tree=null;
        CommonTree string_literal283_tree=null;
        CommonTree string_literal284_tree=null;
        CommonTree string_literal285_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // flips.g:405:2: ( ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // flips.g:405:4: ( At )? throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            // flips.g:405:4: ( At )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==At) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // flips.g:405:4: At
                    {
                    At280=(Token)match(input,At,FOLLOW_At_in_throttleSpeed2272);  
                    stream_At.add(At280);


                    }
                    break;

            }

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed2275);
            throttleValue281=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue281.getTree());
            // flips.g:405:22: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 217:
                {
                alt107=1;
                }
                break;
            case 218:
                {
                alt107=2;
                }
                break;
            case 219:
                {
                alt107=3;
                }
                break;
            case 220:
                {
                alt107=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // flips.g:405:23: 'pwr'
                    {
                    string_literal282=(Token)match(input,217,FOLLOW_217_in_throttleSpeed2278);  
                    stream_217.add(string_literal282);


                    }
                    break;
                case 2 :
                    // flips.g:405:29: 'power'
                    {
                    string_literal283=(Token)match(input,218,FOLLOW_218_in_throttleSpeed2280);  
                    stream_218.add(string_literal283);


                    }
                    break;
                case 3 :
                    // flips.g:405:37: 'thr'
                    {
                    string_literal284=(Token)match(input,219,FOLLOW_219_in_throttleSpeed2282);  
                    stream_219.add(string_literal284);


                    }
                    break;
                case 4 :
                    // flips.g:405:43: 'throttle'
                    {
                    string_literal285=(Token)match(input,220,FOLLOW_220_in_throttleSpeed2284);  
                    stream_220.add(string_literal285);


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
            // 406:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // flips.g:406:5: ^( SPEED THROTTLE throttleValue )
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
    // flips.g:409:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue286 = null;



        try {
            // flips.g:410:2: ( percentValue )
            // flips.g:410:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue2307);
            percentValue286=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue286.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // flips.g:415:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At287=null;
        flipsParser.timeValue_return timeValue288 = null;


        CommonTree At287_tree=null;

        try {
            // flips.g:416:2: ( At timeValue )
            // flips.g:416:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At287=(Token)match(input,At,FOLLOW_At_in_time2320); 
            At287_tree = (CommonTree)adaptor.create(At287);
            adaptor.addChild(root_0, At287_tree);

            pushFollow(FOLLOW_timeValue_in_time2322);
            timeValue288=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue288.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // flips.g:419:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal290=null;
        Token string_literal291=null;
        Token string_literal293=null;
        Token string_literal294=null;
        Token string_literal296=null;
        Token string_literal297=null;
        Token string_literal299=null;
        Token string_literal300=null;
        flipsParser.timeFormat_return timeFormat289 = null;

        flipsParser.integerValue_return integerValue292 = null;

        flipsParser.timeFormat_return timeFormat295 = null;

        flipsParser.integerValue_return integerValue298 = null;

        flipsParser.timeFormat_return timeFormat301 = null;


        CommonTree string_literal290_tree=null;
        CommonTree string_literal291_tree=null;
        CommonTree string_literal293_tree=null;
        CommonTree string_literal294_tree=null;
        CommonTree string_literal296_tree=null;
        CommonTree string_literal297_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // flips.g:420:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt112=5;
            alt112 = dfa112.predict(input);
            switch (alt112) {
                case 1 :
                    // flips.g:420:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2333);
                    timeFormat289=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat289.getTree());
                    // flips.g:420:15: ( 'am' | 'a.m.' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==221) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==222) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // flips.g:420:16: 'am'
                            {
                            string_literal290=(Token)match(input,221,FOLLOW_221_in_timeValue2336);  
                            stream_221.add(string_literal290);


                            }
                            break;
                        case 2 :
                            // flips.g:420:21: 'a.m.'
                            {
                            string_literal291=(Token)match(input,222,FOLLOW_222_in_timeValue2338);  
                            stream_222.add(string_literal291);


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
                    // 421:2: -> ^( TIME timeFormat AM )
                    {
                        // flips.g:421:5: ^( TIME timeFormat AM )
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
                    // flips.g:422:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2355);
                    integerValue292=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue292.getTree());
                    // flips.g:422:17: ( 'am' | 'a.m.' )
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==221) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==222) ) {
                        alt109=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }
                    switch (alt109) {
                        case 1 :
                            // flips.g:422:18: 'am'
                            {
                            string_literal293=(Token)match(input,221,FOLLOW_221_in_timeValue2358);  
                            stream_221.add(string_literal293);


                            }
                            break;
                        case 2 :
                            // flips.g:422:23: 'a.m.'
                            {
                            string_literal294=(Token)match(input,222,FOLLOW_222_in_timeValue2360);  
                            stream_222.add(string_literal294);


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
                    // 423:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // flips.g:423:5: ^( TIME integerValue HOUR AM )
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
                    // flips.g:424:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2379);
                    timeFormat295=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat295.getTree());
                    // flips.g:424:15: ( 'pm' | 'p.m.' )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==223) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==224) ) {
                        alt110=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // flips.g:424:16: 'pm'
                            {
                            string_literal296=(Token)match(input,223,FOLLOW_223_in_timeValue2382);  
                            stream_223.add(string_literal296);


                            }
                            break;
                        case 2 :
                            // flips.g:424:21: 'p.m.'
                            {
                            string_literal297=(Token)match(input,224,FOLLOW_224_in_timeValue2384);  
                            stream_224.add(string_literal297);


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
                    // 425:2: -> ^( TIME timeFormat PM )
                    {
                        // flips.g:425:5: ^( TIME timeFormat PM )
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
                    // flips.g:426:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2401);
                    integerValue298=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue298.getTree());
                    // flips.g:426:17: ( 'pm' | 'p.m.' )
                    int alt111=2;
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

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // flips.g:426:18: 'pm'
                            {
                            string_literal299=(Token)match(input,223,FOLLOW_223_in_timeValue2404);  
                            stream_223.add(string_literal299);


                            }
                            break;
                        case 2 :
                            // flips.g:426:23: 'p.m.'
                            {
                            string_literal300=(Token)match(input,224,FOLLOW_224_in_timeValue2406);  
                            stream_224.add(string_literal300);


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
                    // 427:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // flips.g:427:5: ^( TIME integerValue HOUR PM )
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
                    // flips.g:428:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2425);
                    timeFormat301=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat301.getTree());


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
                    // 429:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // flips.g:429:5: ^( TIME timeFormat HOUR24 )
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
    // flips.g:432:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal302=null;
        Token char_literal303=null;
        Token char_literal304=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal302_tree=null;
        CommonTree char_literal303_tree=null;
        CommonTree char_literal304_tree=null;
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:433:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=BinaryLiteral && LA113_0<=HexLiteral)) ) {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==225) ) {
                    int LA113_2 = input.LA(3);

                    if ( ((LA113_2>=BinaryLiteral && LA113_2<=HexLiteral)) ) {
                        int LA113_3 = input.LA(4);

                        if ( (LA113_3==225) ) {
                            alt113=2;
                        }
                        else if ( (LA113_3==EOF||(LA113_3>=Identifier && LA113_3<=With)||(LA113_3>=Turning && LA113_3<=HexLiteral)||(LA113_3>=116 && LA113_3<=117)||(LA113_3>=120 && LA113_3<=123)||(LA113_3>=133 && LA113_3<=136)||(LA113_3>=139 && LA113_3<=144)||(LA113_3>=146 && LA113_3<=147)||LA113_3==149||(LA113_3>=170 && LA113_3<=171)||(LA113_3>=211 && LA113_3<=216)||(LA113_3>=221 && LA113_3<=224)||LA113_3==237||LA113_3==248||(LA113_3>=253 && LA113_3<=304)) ) {
                            alt113=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 113, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // flips.g:433:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2449);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal302=(Token)match(input,225,FOLLOW_225_in_timeFormat2451);  
                    stream_225.add(char_literal302);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2455);
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
                    // 434:2: -> $hr HOUR $min MINUTE
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
                    // flips.g:435:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2475);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal303=(Token)match(input,225,FOLLOW_225_in_timeFormat2477);  
                    stream_225.add(char_literal303);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2481);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal304=(Token)match(input,225,FOLLOW_225_in_timeFormat2483);  
                    stream_225.add(char_literal304);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2487);
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
                    // 436:2: -> $hr HOUR $min MINUTE $s SECOND
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
    // flips.g:439:1: timeUnit : ( ( 'y' | 'yr' | 'yrs' | 'year' | 'years' ) -> YEAR | ( 'f' | 'fortnight' | 'fortnights' ) -> FORTNIGHT | ( 'wk' | 'wks' | 'week' | 'weeks' ) -> WEEK | ( 'd' | 'day' | 'days' ) -> DAY | hour | minute | second );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal305=null;
        Token string_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token char_literal310=null;
        Token string_literal311=null;
        Token string_literal312=null;
        Token string_literal313=null;
        Token string_literal314=null;
        Token string_literal315=null;
        Token string_literal316=null;
        Token char_literal317=null;
        Token string_literal318=null;
        Token string_literal319=null;
        flipsParser.hour_return hour320 = null;

        flipsParser.minute_return minute321 = null;

        flipsParser.second_return second322 = null;


        CommonTree char_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        CommonTree string_literal313_tree=null;
        CommonTree string_literal314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree char_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        CommonTree string_literal319_tree=null;
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
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
            // flips.g:440:2: ( ( 'y' | 'yr' | 'yrs' | 'year' | 'years' ) -> YEAR | ( 'f' | 'fortnight' | 'fortnights' ) -> FORTNIGHT | ( 'wk' | 'wks' | 'week' | 'weeks' ) -> WEEK | ( 'd' | 'day' | 'days' ) -> DAY | hour | minute | second )
            int alt118=7;
            switch ( input.LA(1) ) {
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
                {
                alt118=1;
                }
                break;
            case 187:
            case 231:
            case 232:
                {
                alt118=2;
                }
                break;
            case 233:
            case 234:
            case 235:
            case 236:
                {
                alt118=3;
                }
                break;
            case 237:
            case 238:
            case 239:
                {
                alt118=4;
                }
                break;
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
                {
                alt118=5;
                }
                break;
            case 211:
            case 245:
            case 246:
            case 247:
                {
                alt118=6;
                }
                break;
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
                {
                alt118=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // flips.g:440:4: ( 'y' | 'yr' | 'yrs' | 'year' | 'years' )
                    {
                    // flips.g:440:4: ( 'y' | 'yr' | 'yrs' | 'year' | 'years' )
                    int alt114=5;
                    switch ( input.LA(1) ) {
                    case 226:
                        {
                        alt114=1;
                        }
                        break;
                    case 227:
                        {
                        alt114=2;
                        }
                        break;
                    case 228:
                        {
                        alt114=3;
                        }
                        break;
                    case 229:
                        {
                        alt114=4;
                        }
                        break;
                    case 230:
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
                            // flips.g:440:5: 'y'
                            {
                            char_literal305=(Token)match(input,226,FOLLOW_226_in_timeUnit2518);  
                            stream_226.add(char_literal305);


                            }
                            break;
                        case 2 :
                            // flips.g:440:9: 'yr'
                            {
                            string_literal306=(Token)match(input,227,FOLLOW_227_in_timeUnit2520);  
                            stream_227.add(string_literal306);


                            }
                            break;
                        case 3 :
                            // flips.g:440:14: 'yrs'
                            {
                            string_literal307=(Token)match(input,228,FOLLOW_228_in_timeUnit2522);  
                            stream_228.add(string_literal307);


                            }
                            break;
                        case 4 :
                            // flips.g:440:20: 'year'
                            {
                            string_literal308=(Token)match(input,229,FOLLOW_229_in_timeUnit2524);  
                            stream_229.add(string_literal308);


                            }
                            break;
                        case 5 :
                            // flips.g:440:27: 'years'
                            {
                            string_literal309=(Token)match(input,230,FOLLOW_230_in_timeUnit2526);  
                            stream_230.add(string_literal309);


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
                    // 441:2: -> YEAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YEAR, "YEAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:442:4: ( 'f' | 'fortnight' | 'fortnights' )
                    {
                    // flips.g:442:4: ( 'f' | 'fortnight' | 'fortnights' )
                    int alt115=3;
                    switch ( input.LA(1) ) {
                    case 187:
                        {
                        alt115=1;
                        }
                        break;
                    case 231:
                        {
                        alt115=2;
                        }
                        break;
                    case 232:
                        {
                        alt115=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }

                    switch (alt115) {
                        case 1 :
                            // flips.g:442:5: 'f'
                            {
                            char_literal310=(Token)match(input,187,FOLLOW_187_in_timeUnit2538);  
                            stream_187.add(char_literal310);


                            }
                            break;
                        case 2 :
                            // flips.g:442:9: 'fortnight'
                            {
                            string_literal311=(Token)match(input,231,FOLLOW_231_in_timeUnit2540);  
                            stream_231.add(string_literal311);


                            }
                            break;
                        case 3 :
                            // flips.g:442:21: 'fortnights'
                            {
                            string_literal312=(Token)match(input,232,FOLLOW_232_in_timeUnit2542);  
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
                    // 443:2: -> FORTNIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FORTNIGHT, "FORTNIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:444:4: ( 'wk' | 'wks' | 'week' | 'weeks' )
                    {
                    // flips.g:444:4: ( 'wk' | 'wks' | 'week' | 'weeks' )
                    int alt116=4;
                    switch ( input.LA(1) ) {
                    case 233:
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
                    case 236:
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
                            // flips.g:444:5: 'wk'
                            {
                            string_literal313=(Token)match(input,233,FOLLOW_233_in_timeUnit2554);  
                            stream_233.add(string_literal313);


                            }
                            break;
                        case 2 :
                            // flips.g:444:10: 'wks'
                            {
                            string_literal314=(Token)match(input,234,FOLLOW_234_in_timeUnit2556);  
                            stream_234.add(string_literal314);


                            }
                            break;
                        case 3 :
                            // flips.g:444:16: 'week'
                            {
                            string_literal315=(Token)match(input,235,FOLLOW_235_in_timeUnit2558);  
                            stream_235.add(string_literal315);


                            }
                            break;
                        case 4 :
                            // flips.g:444:23: 'weeks'
                            {
                            string_literal316=(Token)match(input,236,FOLLOW_236_in_timeUnit2560);  
                            stream_236.add(string_literal316);


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
                    // 445:2: -> WEEK
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEEK, "WEEK"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:446:4: ( 'd' | 'day' | 'days' )
                    {
                    // flips.g:446:4: ( 'd' | 'day' | 'days' )
                    int alt117=3;
                    switch ( input.LA(1) ) {
                    case 237:
                        {
                        alt117=1;
                        }
                        break;
                    case 238:
                        {
                        alt117=2;
                        }
                        break;
                    case 239:
                        {
                        alt117=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }

                    switch (alt117) {
                        case 1 :
                            // flips.g:446:5: 'd'
                            {
                            char_literal317=(Token)match(input,237,FOLLOW_237_in_timeUnit2572);  
                            stream_237.add(char_literal317);


                            }
                            break;
                        case 2 :
                            // flips.g:446:9: 'day'
                            {
                            string_literal318=(Token)match(input,238,FOLLOW_238_in_timeUnit2574);  
                            stream_238.add(string_literal318);


                            }
                            break;
                        case 3 :
                            // flips.g:446:15: 'days'
                            {
                            string_literal319=(Token)match(input,239,FOLLOW_239_in_timeUnit2576);  
                            stream_239.add(string_literal319);


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
                    // 447:2: -> DAY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DAY, "DAY"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:448:4: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2587);
                    hour320=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour320.getTree());

                    }
                    break;
                case 6 :
                    // flips.g:449:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2592);
                    minute321=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute321.getTree());

                    }
                    break;
                case 7 :
                    // flips.g:450:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2597);
                    second322=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second322.getTree());

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
    // flips.g:453:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal323=null;
        Token string_literal324=null;
        Token string_literal325=null;
        Token string_literal326=null;
        Token string_literal327=null;

        CommonTree char_literal323_tree=null;
        CommonTree string_literal324_tree=null;
        CommonTree string_literal325_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree string_literal327_tree=null;
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");

        try {
            // flips.g:454:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // flips.g:454:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // flips.g:454:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt119=5;
            switch ( input.LA(1) ) {
            case 240:
                {
                alt119=1;
                }
                break;
            case 241:
                {
                alt119=2;
                }
                break;
            case 242:
                {
                alt119=3;
                }
                break;
            case 243:
                {
                alt119=4;
                }
                break;
            case 244:
                {
                alt119=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // flips.g:454:5: 'h'
                    {
                    char_literal323=(Token)match(input,240,FOLLOW_240_in_hour2609);  
                    stream_240.add(char_literal323);


                    }
                    break;
                case 2 :
                    // flips.g:454:9: 'hr'
                    {
                    string_literal324=(Token)match(input,241,FOLLOW_241_in_hour2611);  
                    stream_241.add(string_literal324);


                    }
                    break;
                case 3 :
                    // flips.g:454:14: 'hrs'
                    {
                    string_literal325=(Token)match(input,242,FOLLOW_242_in_hour2613);  
                    stream_242.add(string_literal325);


                    }
                    break;
                case 4 :
                    // flips.g:454:20: 'hour'
                    {
                    string_literal326=(Token)match(input,243,FOLLOW_243_in_hour2615);  
                    stream_243.add(string_literal326);


                    }
                    break;
                case 5 :
                    // flips.g:454:27: 'hours'
                    {
                    string_literal327=(Token)match(input,244,FOLLOW_244_in_hour2617);  
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
            // 455:2: -> HOUR
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
    // flips.g:458:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal328=null;
        Token string_literal329=null;
        Token string_literal330=null;
        Token string_literal331=null;

        CommonTree string_literal328_tree=null;
        CommonTree string_literal329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree string_literal331_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");

        try {
            // flips.g:459:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // flips.g:459:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // flips.g:459:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 211:
                {
                alt120=1;
                }
                break;
            case 245:
                {
                alt120=2;
                }
                break;
            case 246:
                {
                alt120=3;
                }
                break;
            case 247:
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
                    // flips.g:459:5: 'min'
                    {
                    string_literal328=(Token)match(input,211,FOLLOW_211_in_minute2635);  
                    stream_211.add(string_literal328);


                    }
                    break;
                case 2 :
                    // flips.g:459:11: 'mins'
                    {
                    string_literal329=(Token)match(input,245,FOLLOW_245_in_minute2637);  
                    stream_245.add(string_literal329);


                    }
                    break;
                case 3 :
                    // flips.g:459:18: 'minute'
                    {
                    string_literal330=(Token)match(input,246,FOLLOW_246_in_minute2639);  
                    stream_246.add(string_literal330);


                    }
                    break;
                case 4 :
                    // flips.g:459:27: 'minutes'
                    {
                    string_literal331=(Token)match(input,247,FOLLOW_247_in_minute2641);  
                    stream_247.add(string_literal331);


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
            // 460:2: -> MINUTE
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
    // flips.g:463:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal332=null;
        Token string_literal333=null;
        Token string_literal334=null;
        Token string_literal335=null;
        Token string_literal336=null;

        CommonTree char_literal332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree string_literal334_tree=null;
        CommonTree string_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");

        try {
            // flips.g:464:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // flips.g:464:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // flips.g:464:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt121=5;
            switch ( input.LA(1) ) {
            case 248:
                {
                alt121=1;
                }
                break;
            case 249:
                {
                alt121=2;
                }
                break;
            case 250:
                {
                alt121=3;
                }
                break;
            case 251:
                {
                alt121=4;
                }
                break;
            case 252:
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
                    // flips.g:464:5: 's'
                    {
                    char_literal332=(Token)match(input,248,FOLLOW_248_in_second2659);  
                    stream_248.add(char_literal332);


                    }
                    break;
                case 2 :
                    // flips.g:464:9: 'sec'
                    {
                    string_literal333=(Token)match(input,249,FOLLOW_249_in_second2661);  
                    stream_249.add(string_literal333);


                    }
                    break;
                case 3 :
                    // flips.g:464:15: 'secs'
                    {
                    string_literal334=(Token)match(input,250,FOLLOW_250_in_second2663);  
                    stream_250.add(string_literal334);


                    }
                    break;
                case 4 :
                    // flips.g:464:22: 'second'
                    {
                    string_literal335=(Token)match(input,251,FOLLOW_251_in_second2665);  
                    stream_251.add(string_literal335);


                    }
                    break;
                case 5 :
                    // flips.g:464:31: 'seconds'
                    {
                    string_literal336=(Token)match(input,252,FOLLOW_252_in_second2667);  
                    stream_252.add(string_literal336);


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
            // 465:2: -> SECOND
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
    // flips.g:468:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal337=null;
        flipsParser.durationValue_return durationValue338 = null;


        CommonTree string_literal337_tree=null;
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // flips.g:469:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // flips.g:469:4: 'for' durationValue
            {
            string_literal337=(Token)match(input,253,FOLLOW_253_in_duration2684);  
            stream_253.add(string_literal337);

            pushFollow(FOLLOW_durationValue_in_duration2686);
            durationValue338=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue338.getTree());


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
            // 470:2: -> ^( DURATION durationValue )
            {
                // flips.g:470:5: ^( DURATION durationValue )
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
    // flips.g:473:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue339 = null;

        flipsParser.timeUnit_return timeUnit340 = null;

        flipsParser.integerValue_return integerValue341 = null;

        flipsParser.hour_return hour342 = null;

        flipsParser.numericValue_return numericValue343 = null;

        flipsParser.minute_return minute344 = null;

        flipsParser.second_return second345 = null;

        flipsParser.integerValue_return integerValue346 = null;

        flipsParser.hour_return hour347 = null;

        flipsParser.integerValue_return integerValue348 = null;

        flipsParser.minute_return minute349 = null;

        flipsParser.numericValue_return numericValue350 = null;

        flipsParser.second_return second351 = null;

        flipsParser.integerValue_return integerValue352 = null;

        flipsParser.minute_return minute353 = null;

        flipsParser.numericValue_return numericValue354 = null;

        flipsParser.second_return second355 = null;

        flipsParser.timeFormat_return timeFormat356 = null;



        try {
            // flips.g:474:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt123=5;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // flips.g:474:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2706);
                    numericValue339=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue339.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2708);
                    timeUnit340=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit340.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:475:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2713);
                    integerValue341=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue341.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2715);
                    hour342=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour342.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2717);
                    numericValue343=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue343.getTree());
                    // flips.g:475:35: ( minute | second )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==211||(LA122_0>=245 && LA122_0<=247)) ) {
                        alt122=1;
                    }
                    else if ( ((LA122_0>=248 && LA122_0<=252)) ) {
                        alt122=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }
                    switch (alt122) {
                        case 1 :
                            // flips.g:475:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2720);
                            minute344=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute344.getTree());

                            }
                            break;
                        case 2 :
                            // flips.g:475:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2722);
                            second345=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second345.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // flips.g:476:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2728);
                    integerValue346=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue346.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2730);
                    hour347=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour347.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2732);
                    integerValue348=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue348.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2734);
                    minute349=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute349.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2736);
                    numericValue350=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue350.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2738);
                    second351=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second351.getTree());

                    }
                    break;
                case 4 :
                    // flips.g:477:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2743);
                    integerValue352=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue352.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2745);
                    minute353=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute353.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2747);
                    numericValue354=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue354.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2749);
                    second355=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second355.getTree());

                    }
                    break;
                case 5 :
                    // flips.g:478:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2754);
                    timeFormat356=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat356.getTree());

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
    // flips.g:483:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection357 = null;

        flipsParser.relativeDirection_return relativeDirection358 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // flips.g:484:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt124=2;
            switch ( input.LA(1) ) {
            case 248:
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
                {
                alt124=1;
                }
                break;
            case Turning:
                {
                int LA124_2 = input.LA(2);

                if ( ((LA124_2>=FloatingPointLiteral && LA124_2<=HexLiteral)||LA124_2==248||(LA124_2>=254 && LA124_2<=284)) ) {
                    alt124=1;
                }
                else if ( ((LA124_2>=295 && LA124_2<=300)) ) {
                    alt124=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA124_3 = input.LA(2);

                if ( ((LA124_3>=295 && LA124_3<=300)) ) {
                    alt124=2;
                }
                else if ( ((LA124_3>=FloatingPointLiteral && LA124_3<=HexLiteral)||LA124_3==248||(LA124_3>=254 && LA124_3<=284)) ) {
                    alt124=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // flips.g:484:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2767);
                    fixedDirection357=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection357.getTree());


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
                    // 485:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // flips.g:485:5: ^( DIRECTION FIXED fixedDirection )
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
                    // flips.g:486:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2783);
                    relativeDirection358=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection358.getTree());


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
                    // 487:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // flips.g:487:5: ^( DIRECTION RELATIVE relativeDirection )
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
    // flips.g:490:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning362=null;
        Token Heading363=null;
        flipsParser.cardinalDirection_return cardinalDirection359 = null;

        flipsParser.ordinalDirection_return ordinalDirection360 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection361 = null;

        flipsParser.cardinalDirection_return cardinalDirection364 = null;

        flipsParser.ordinalDirection_return ordinalDirection365 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection366 = null;

        flipsParser.angularValue_return angularValue367 = null;


        CommonTree Turning362_tree=null;
        CommonTree Heading363_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // flips.g:491:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt127=4;
            switch ( input.LA(1) ) {
            case 248:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 260:
                {
                alt127=1;
                }
                break;
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
            case 266:
            case 267:
            case 268:
                {
                alt127=2;
                }
                break;
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
                {
                alt127=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt127=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // flips.g:491:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2805);
                    cardinalDirection359=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection359.getTree());


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
                    // 492:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:493:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2815);
                    ordinalDirection360=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection360.getTree());


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
                    // 494:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:495:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2825);
                    subOrdinalDirection361=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection361.getTree());


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
                    // 496:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:497:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // flips.g:497:4: ( Turning | Heading )
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==Turning) ) {
                        alt125=1;
                    }
                    else if ( (LA125_0==Heading) ) {
                        alt125=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 125, 0, input);

                        throw nvae;
                    }
                    switch (alt125) {
                        case 1 :
                            // flips.g:497:5: Turning
                            {
                            Turning362=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2836);  
                            stream_Turning.add(Turning362);


                            }
                            break;
                        case 2 :
                            // flips.g:497:13: Heading
                            {
                            Heading363=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2838);  
                            stream_Heading.add(Heading363);


                            }
                            break;

                    }

                    // flips.g:497:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt126=4;
                    switch ( input.LA(1) ) {
                    case 248:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        {
                        alt126=1;
                        }
                        break;
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                    case 267:
                    case 268:
                        {
                        alt126=2;
                        }
                        break;
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
                        {
                        alt126=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
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
                            // flips.g:497:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2842);
                            cardinalDirection364=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection364.getTree());

                            }
                            break;
                        case 2 :
                            // flips.g:497:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2844);
                            ordinalDirection365=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection365.getTree());

                            }
                            break;
                        case 3 :
                            // flips.g:497:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2846);
                            subOrdinalDirection366=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection366.getTree());

                            }
                            break;
                        case 4 :
                            // flips.g:497:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2848);
                            angularValue367=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue367.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: subOrdinalDirection, ordinalDirection, cardinalDirection, angularValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 498:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // flips.g:498:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // flips.g:498:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // flips.g:498:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // flips.g:498:63: ( angularValue )?
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
    // flips.g:501:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning368=null;
        Token Heading369=null;
        flipsParser.leftRightDirection_return leftRightDirection370 = null;

        flipsParser.angularValue_return angularValue371 = null;


        CommonTree Turning368_tree=null;
        CommonTree Heading369_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // flips.g:502:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // flips.g:502:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // flips.g:502:4: ( Turning | Heading )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==Turning) ) {
                alt128=1;
            }
            else if ( (LA128_0==Heading) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // flips.g:502:5: Turning
                    {
                    Turning368=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2876);  
                    stream_Turning.add(Turning368);


                    }
                    break;
                case 2 :
                    // flips.g:502:13: Heading
                    {
                    Heading369=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2878);  
                    stream_Heading.add(Heading369);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2881);
            leftRightDirection370=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection370.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2883);
            angularValue371=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue371.getTree());


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
            // 503:2: -> leftRightDirection angularValue
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
    // flips.g:506:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection372 = null;

        flipsParser.eastWestDirection_return eastWestDirection373 = null;



        try {
            // flips.g:507:2: ( northSouthDirection | eastWestDirection )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==248||(LA129_0>=254 && LA129_0<=256)) ) {
                alt129=1;
            }
            else if ( ((LA129_0>=257 && LA129_0<=260)) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // flips.g:507:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2901);
                    northSouthDirection372=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection372.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:508:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2906);
                    eastWestDirection373=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection373.getTree());

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
    // flips.g:511:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
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
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // flips.g:512:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=254 && LA132_0<=255)) ) {
                alt132=1;
            }
            else if ( (LA132_0==248||LA132_0==256) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // flips.g:512:4: ( 'n' | 'north' )
                    {
                    // flips.g:512:4: ( 'n' | 'north' )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==254) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==255) ) {
                        alt130=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }
                    switch (alt130) {
                        case 1 :
                            // flips.g:512:5: 'n'
                            {
                            char_literal374=(Token)match(input,254,FOLLOW_254_in_northSouthDirection2918);  
                            stream_254.add(char_literal374);


                            }
                            break;
                        case 2 :
                            // flips.g:512:9: 'north'
                            {
                            string_literal375=(Token)match(input,255,FOLLOW_255_in_northSouthDirection2920);  
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
                    // 513:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:514:4: ( 's' | 'south' )
                    {
                    // flips.g:514:4: ( 's' | 'south' )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==248) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==256) ) {
                        alt131=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // flips.g:514:5: 's'
                            {
                            char_literal376=(Token)match(input,248,FOLLOW_248_in_northSouthDirection2932);  
                            stream_248.add(char_literal376);


                            }
                            break;
                        case 2 :
                            // flips.g:514:9: 'south'
                            {
                            string_literal377=(Token)match(input,256,FOLLOW_256_in_northSouthDirection2934);  
                            stream_256.add(string_literal377);


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
                    // 515:2: -> SOUTH
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
    // flips.g:518:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal378=null;
        Token string_literal379=null;
        Token char_literal380=null;
        Token string_literal381=null;

        CommonTree char_literal378_tree=null;
        CommonTree string_literal379_tree=null;
        CommonTree char_literal380_tree=null;
        CommonTree string_literal381_tree=null;
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");

        try {
            // flips.g:519:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( ((LA135_0>=257 && LA135_0<=258)) ) {
                alt135=1;
            }
            else if ( ((LA135_0>=259 && LA135_0<=260)) ) {
                alt135=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // flips.g:519:4: ( 'e' | 'east' )
                    {
                    // flips.g:519:4: ( 'e' | 'east' )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==257) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==258) ) {
                        alt133=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // flips.g:519:5: 'e'
                            {
                            char_literal378=(Token)match(input,257,FOLLOW_257_in_eastWestDirection2952);  
                            stream_257.add(char_literal378);


                            }
                            break;
                        case 2 :
                            // flips.g:519:9: 'east'
                            {
                            string_literal379=(Token)match(input,258,FOLLOW_258_in_eastWestDirection2954);  
                            stream_258.add(string_literal379);


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
                    // 520:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:521:4: ( 'w' | 'west' )
                    {
                    // flips.g:521:4: ( 'w' | 'west' )
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==259) ) {
                        alt134=1;
                    }
                    else if ( (LA134_0==260) ) {
                        alt134=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 134, 0, input);

                        throw nvae;
                    }
                    switch (alt134) {
                        case 1 :
                            // flips.g:521:5: 'w'
                            {
                            char_literal380=(Token)match(input,259,FOLLOW_259_in_eastWestDirection2966);  
                            stream_259.add(char_literal380);


                            }
                            break;
                        case 2 :
                            // flips.g:521:9: 'west'
                            {
                            string_literal381=(Token)match(input,260,FOLLOW_260_in_eastWestDirection2968);  
                            stream_260.add(string_literal381);


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
                    // 522:2: -> WEST
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
    // flips.g:525:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal382=null;
        Token string_literal383=null;
        Token string_literal384=null;
        Token string_literal385=null;
        Token string_literal386=null;
        Token string_literal387=null;
        Token string_literal388=null;
        Token string_literal389=null;

        CommonTree string_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        CommonTree string_literal384_tree=null;
        CommonTree string_literal385_tree=null;
        CommonTree string_literal386_tree=null;
        CommonTree string_literal387_tree=null;
        CommonTree string_literal388_tree=null;
        CommonTree string_literal389_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");

        try {
            // flips.g:526:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt140=4;
            switch ( input.LA(1) ) {
            case 261:
            case 262:
                {
                alt140=1;
                }
                break;
            case 263:
            case 264:
                {
                alt140=2;
                }
                break;
            case 265:
            case 266:
                {
                alt140=3;
                }
                break;
            case 267:
            case 268:
                {
                alt140=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // flips.g:526:4: ( 'ne' | 'northeast' )
                    {
                    // flips.g:526:4: ( 'ne' | 'northeast' )
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==261) ) {
                        alt136=1;
                    }
                    else if ( (LA136_0==262) ) {
                        alt136=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 136, 0, input);

                        throw nvae;
                    }
                    switch (alt136) {
                        case 1 :
                            // flips.g:526:5: 'ne'
                            {
                            string_literal382=(Token)match(input,261,FOLLOW_261_in_ordinalDirection2986);  
                            stream_261.add(string_literal382);


                            }
                            break;
                        case 2 :
                            // flips.g:526:10: 'northeast'
                            {
                            string_literal383=(Token)match(input,262,FOLLOW_262_in_ordinalDirection2988);  
                            stream_262.add(string_literal383);


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
                    // 527:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:528:4: ( 'se' | 'southeast' )
                    {
                    // flips.g:528:4: ( 'se' | 'southeast' )
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==263) ) {
                        alt137=1;
                    }
                    else if ( (LA137_0==264) ) {
                        alt137=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;
                    }
                    switch (alt137) {
                        case 1 :
                            // flips.g:528:5: 'se'
                            {
                            string_literal384=(Token)match(input,263,FOLLOW_263_in_ordinalDirection3002);  
                            stream_263.add(string_literal384);


                            }
                            break;
                        case 2 :
                            // flips.g:528:10: 'southeast'
                            {
                            string_literal385=(Token)match(input,264,FOLLOW_264_in_ordinalDirection3004);  
                            stream_264.add(string_literal385);


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
                    // 529:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:530:4: ( 'sw' | 'southwest' )
                    {
                    // flips.g:530:4: ( 'sw' | 'southwest' )
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==265) ) {
                        alt138=1;
                    }
                    else if ( (LA138_0==266) ) {
                        alt138=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;
                    }
                    switch (alt138) {
                        case 1 :
                            // flips.g:530:5: 'sw'
                            {
                            string_literal386=(Token)match(input,265,FOLLOW_265_in_ordinalDirection3018);  
                            stream_265.add(string_literal386);


                            }
                            break;
                        case 2 :
                            // flips.g:530:10: 'southwest'
                            {
                            string_literal387=(Token)match(input,266,FOLLOW_266_in_ordinalDirection3020);  
                            stream_266.add(string_literal387);


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
                    // 531:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:532:4: ( 'nw' | 'northwest' )
                    {
                    // flips.g:532:4: ( 'nw' | 'northwest' )
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==267) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==268) ) {
                        alt139=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }
                    switch (alt139) {
                        case 1 :
                            // flips.g:532:5: 'nw'
                            {
                            string_literal388=(Token)match(input,267,FOLLOW_267_in_ordinalDirection3034);  
                            stream_267.add(string_literal388);


                            }
                            break;
                        case 2 :
                            // flips.g:532:10: 'northwest'
                            {
                            string_literal389=(Token)match(input,268,FOLLOW_268_in_ordinalDirection3036);  
                            stream_268.add(string_literal389);


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
                    // 533:2: -> NORTH WEST
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
    // flips.g:536:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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
        Token string_literal402=null;
        Token string_literal403=null;
        Token string_literal404=null;
        Token string_literal405=null;

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
        CommonTree string_literal402_tree=null;
        CommonTree string_literal403_tree=null;
        CommonTree string_literal404_tree=null;
        CommonTree string_literal405_tree=null;
        RewriteRuleTokenStream stream_281=new RewriteRuleTokenStream(adaptor,"token 281");
        RewriteRuleTokenStream stream_280=new RewriteRuleTokenStream(adaptor,"token 280");
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_284=new RewriteRuleTokenStream(adaptor,"token 284");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleTokenStream stream_283=new RewriteRuleTokenStream(adaptor,"token 283");
        RewriteRuleTokenStream stream_274=new RewriteRuleTokenStream(adaptor,"token 274");
        RewriteRuleTokenStream stream_273=new RewriteRuleTokenStream(adaptor,"token 273");
        RewriteRuleTokenStream stream_282=new RewriteRuleTokenStream(adaptor,"token 282");
        RewriteRuleTokenStream stream_275=new RewriteRuleTokenStream(adaptor,"token 275");
        RewriteRuleTokenStream stream_276=new RewriteRuleTokenStream(adaptor,"token 276");
        RewriteRuleTokenStream stream_277=new RewriteRuleTokenStream(adaptor,"token 277");
        RewriteRuleTokenStream stream_278=new RewriteRuleTokenStream(adaptor,"token 278");
        RewriteRuleTokenStream stream_279=new RewriteRuleTokenStream(adaptor,"token 279");
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");

        try {
            // flips.g:537:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt149=8;
            switch ( input.LA(1) ) {
            case 269:
            case 270:
                {
                alt149=1;
                }
                break;
            case 271:
            case 272:
                {
                alt149=2;
                }
                break;
            case 273:
            case 274:
                {
                alt149=3;
                }
                break;
            case 275:
            case 276:
                {
                alt149=4;
                }
                break;
            case 277:
            case 278:
                {
                alt149=5;
                }
                break;
            case 279:
            case 280:
                {
                alt149=6;
                }
                break;
            case 281:
            case 282:
                {
                alt149=7;
                }
                break;
            case 283:
            case 284:
                {
                alt149=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // flips.g:537:4: ( 'nne' | 'north-northeast' )
                    {
                    // flips.g:537:4: ( 'nne' | 'north-northeast' )
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==269) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==270) ) {
                        alt141=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }
                    switch (alt141) {
                        case 1 :
                            // flips.g:537:5: 'nne'
                            {
                            string_literal390=(Token)match(input,269,FOLLOW_269_in_subOrdinalDirection3056);  
                            stream_269.add(string_literal390);


                            }
                            break;
                        case 2 :
                            // flips.g:537:11: 'north-northeast'
                            {
                            string_literal391=(Token)match(input,270,FOLLOW_270_in_subOrdinalDirection3058);  
                            stream_270.add(string_literal391);


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
                    // 538:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:539:4: ( 'ene' | 'east-northeast' )
                    {
                    // flips.g:539:4: ( 'ene' | 'east-northeast' )
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==271) ) {
                        alt142=1;
                    }
                    else if ( (LA142_0==272) ) {
                        alt142=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;
                    }
                    switch (alt142) {
                        case 1 :
                            // flips.g:539:5: 'ene'
                            {
                            string_literal392=(Token)match(input,271,FOLLOW_271_in_subOrdinalDirection3074);  
                            stream_271.add(string_literal392);


                            }
                            break;
                        case 2 :
                            // flips.g:539:11: 'east-northeast'
                            {
                            string_literal393=(Token)match(input,272,FOLLOW_272_in_subOrdinalDirection3076);  
                            stream_272.add(string_literal393);


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
                    // 540:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // flips.g:541:4: ( 'ese' | 'east-southeast' )
                    {
                    // flips.g:541:4: ( 'ese' | 'east-southeast' )
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==273) ) {
                        alt143=1;
                    }
                    else if ( (LA143_0==274) ) {
                        alt143=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 143, 0, input);

                        throw nvae;
                    }
                    switch (alt143) {
                        case 1 :
                            // flips.g:541:5: 'ese'
                            {
                            string_literal394=(Token)match(input,273,FOLLOW_273_in_subOrdinalDirection3092);  
                            stream_273.add(string_literal394);


                            }
                            break;
                        case 2 :
                            // flips.g:541:11: 'east-southeast'
                            {
                            string_literal395=(Token)match(input,274,FOLLOW_274_in_subOrdinalDirection3094);  
                            stream_274.add(string_literal395);


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
                    // 542:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // flips.g:543:4: ( 'sse' | 'south-southeast' )
                    {
                    // flips.g:543:4: ( 'sse' | 'south-southeast' )
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==275) ) {
                        alt144=1;
                    }
                    else if ( (LA144_0==276) ) {
                        alt144=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 0, input);

                        throw nvae;
                    }
                    switch (alt144) {
                        case 1 :
                            // flips.g:543:5: 'sse'
                            {
                            string_literal396=(Token)match(input,275,FOLLOW_275_in_subOrdinalDirection3110);  
                            stream_275.add(string_literal396);


                            }
                            break;
                        case 2 :
                            // flips.g:543:11: 'south-southeast'
                            {
                            string_literal397=(Token)match(input,276,FOLLOW_276_in_subOrdinalDirection3112);  
                            stream_276.add(string_literal397);


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
                    // 544:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // flips.g:545:4: ( 'ssw' | 'south-southwest' )
                    {
                    // flips.g:545:4: ( 'ssw' | 'south-southwest' )
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==277) ) {
                        alt145=1;
                    }
                    else if ( (LA145_0==278) ) {
                        alt145=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 0, input);

                        throw nvae;
                    }
                    switch (alt145) {
                        case 1 :
                            // flips.g:545:5: 'ssw'
                            {
                            string_literal398=(Token)match(input,277,FOLLOW_277_in_subOrdinalDirection3128);  
                            stream_277.add(string_literal398);


                            }
                            break;
                        case 2 :
                            // flips.g:545:11: 'south-southwest'
                            {
                            string_literal399=(Token)match(input,278,FOLLOW_278_in_subOrdinalDirection3130);  
                            stream_278.add(string_literal399);


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
                    // 546:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // flips.g:547:4: ( 'wsw' | 'west-southwest' )
                    {
                    // flips.g:547:4: ( 'wsw' | 'west-southwest' )
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==279) ) {
                        alt146=1;
                    }
                    else if ( (LA146_0==280) ) {
                        alt146=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 146, 0, input);

                        throw nvae;
                    }
                    switch (alt146) {
                        case 1 :
                            // flips.g:547:5: 'wsw'
                            {
                            string_literal400=(Token)match(input,279,FOLLOW_279_in_subOrdinalDirection3146);  
                            stream_279.add(string_literal400);


                            }
                            break;
                        case 2 :
                            // flips.g:547:11: 'west-southwest'
                            {
                            string_literal401=(Token)match(input,280,FOLLOW_280_in_subOrdinalDirection3148);  
                            stream_280.add(string_literal401);


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
                    // 548:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // flips.g:549:4: ( 'wnw' | 'west-northwest' )
                    {
                    // flips.g:549:4: ( 'wnw' | 'west-northwest' )
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==281) ) {
                        alt147=1;
                    }
                    else if ( (LA147_0==282) ) {
                        alt147=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 147, 0, input);

                        throw nvae;
                    }
                    switch (alt147) {
                        case 1 :
                            // flips.g:549:5: 'wnw'
                            {
                            string_literal402=(Token)match(input,281,FOLLOW_281_in_subOrdinalDirection3164);  
                            stream_281.add(string_literal402);


                            }
                            break;
                        case 2 :
                            // flips.g:549:11: 'west-northwest'
                            {
                            string_literal403=(Token)match(input,282,FOLLOW_282_in_subOrdinalDirection3166);  
                            stream_282.add(string_literal403);


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
                    // 550:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // flips.g:551:4: ( 'nnw' | 'north-northwest' )
                    {
                    // flips.g:551:4: ( 'nnw' | 'north-northwest' )
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==283) ) {
                        alt148=1;
                    }
                    else if ( (LA148_0==284) ) {
                        alt148=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;
                    }
                    switch (alt148) {
                        case 1 :
                            // flips.g:551:5: 'nnw'
                            {
                            string_literal404=(Token)match(input,283,FOLLOW_283_in_subOrdinalDirection3182);  
                            stream_283.add(string_literal404);


                            }
                            break;
                        case 2 :
                            // flips.g:551:11: 'north-northwest'
                            {
                            string_literal405=(Token)match(input,284,FOLLOW_284_in_subOrdinalDirection3184);  
                            stream_284.add(string_literal405);


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
                    // 552:2: -> NORTH NORTH WEST
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
    // flips.g:555:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning406=null;
        flipsParser.clockDirection_return clockDirection407 = null;


        CommonTree Turning406_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // flips.g:556:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // flips.g:556:4: ( Turning )? clockDirection
            {
            // flips.g:556:4: ( Turning )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==Turning) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // flips.g:556:4: Turning
                    {
                    Turning406=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection3205);  
                    stream_Turning.add(Turning406);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection3208);
            clockDirection407=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection407.getTree());


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
            // 557:2: -> ^( DIRECTION TURN clockDirection )
            {
                // flips.g:557:5: ^( DIRECTION TURN clockDirection )
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
    // flips.g:560:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal408=null;
        Token string_literal409=null;
        Token char_literal410=null;
        Token string_literal411=null;
        Token string_literal412=null;
        Token string_literal413=null;
        Token string_literal414=null;
        Token char_literal415=null;
        Token string_literal416=null;
        Token string_literal417=null;
        Token string_literal418=null;

        CommonTree char_literal408_tree=null;
        CommonTree string_literal409_tree=null;
        CommonTree char_literal410_tree=null;
        CommonTree string_literal411_tree=null;
        CommonTree string_literal412_tree=null;
        CommonTree string_literal413_tree=null;
        CommonTree string_literal414_tree=null;
        CommonTree char_literal415_tree=null;
        CommonTree string_literal416_tree=null;
        CommonTree string_literal417_tree=null;
        CommonTree string_literal418_tree=null;
        RewriteRuleTokenStream stream_288=new RewriteRuleTokenStream(adaptor,"token 288");
        RewriteRuleTokenStream stream_289=new RewriteRuleTokenStream(adaptor,"token 289");
        RewriteRuleTokenStream stream_286=new RewriteRuleTokenStream(adaptor,"token 286");
        RewriteRuleTokenStream stream_287=new RewriteRuleTokenStream(adaptor,"token 287");
        RewriteRuleTokenStream stream_294=new RewriteRuleTokenStream(adaptor,"token 294");
        RewriteRuleTokenStream stream_293=new RewriteRuleTokenStream(adaptor,"token 293");
        RewriteRuleTokenStream stream_285=new RewriteRuleTokenStream(adaptor,"token 285");
        RewriteRuleTokenStream stream_290=new RewriteRuleTokenStream(adaptor,"token 290");
        RewriteRuleTokenStream stream_292=new RewriteRuleTokenStream(adaptor,"token 292");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");
        RewriteRuleTokenStream stream_291=new RewriteRuleTokenStream(adaptor,"token 291");

        try {
            // flips.g:561:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=285 && LA153_0<=291)) ) {
                alt153=1;
            }
            else if ( (LA153_0==237||(LA153_0>=292 && LA153_0<=294)) ) {
                alt153=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // flips.g:561:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // flips.g:561:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt151=7;
                    switch ( input.LA(1) ) {
                    case 285:
                        {
                        alt151=1;
                        }
                        break;
                    case 286:
                        {
                        alt151=2;
                        }
                        break;
                    case 287:
                        {
                        alt151=3;
                        }
                        break;
                    case 288:
                        {
                        alt151=4;
                        }
                        break;
                    case 289:
                        {
                        alt151=5;
                        }
                        break;
                    case 290:
                        {
                        alt151=6;
                        }
                        break;
                    case 291:
                        {
                        alt151=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 151, 0, input);

                        throw nvae;
                    }

                    switch (alt151) {
                        case 1 :
                            // flips.g:561:5: 'u'
                            {
                            char_literal408=(Token)match(input,285,FOLLOW_285_in_upDownDirection3231);  
                            stream_285.add(char_literal408);


                            }
                            break;
                        case 2 :
                            // flips.g:561:9: 'up'
                            {
                            string_literal409=(Token)match(input,286,FOLLOW_286_in_upDownDirection3233);  
                            stream_286.add(string_literal409);


                            }
                            break;
                        case 3 :
                            // flips.g:561:14: 'c'
                            {
                            char_literal410=(Token)match(input,287,FOLLOW_287_in_upDownDirection3235);  
                            stream_287.add(char_literal410);


                            }
                            break;
                        case 4 :
                            // flips.g:561:18: 'climb'
                            {
                            string_literal411=(Token)match(input,288,FOLLOW_288_in_upDownDirection3237);  
                            stream_288.add(string_literal411);


                            }
                            break;
                        case 5 :
                            // flips.g:561:26: 'climbing'
                            {
                            string_literal412=(Token)match(input,289,FOLLOW_289_in_upDownDirection3239);  
                            stream_289.add(string_literal412);


                            }
                            break;
                        case 6 :
                            // flips.g:561:37: 'ascend'
                            {
                            string_literal413=(Token)match(input,290,FOLLOW_290_in_upDownDirection3241);  
                            stream_290.add(string_literal413);


                            }
                            break;
                        case 7 :
                            // flips.g:561:46: 'ascending'
                            {
                            string_literal414=(Token)match(input,291,FOLLOW_291_in_upDownDirection3243);  
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
                    // 562:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:563:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // flips.g:563:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt152=4;
                    switch ( input.LA(1) ) {
                    case 237:
                        {
                        alt152=1;
                        }
                        break;
                    case 292:
                        {
                        alt152=2;
                        }
                        break;
                    case 293:
                        {
                        alt152=3;
                        }
                        break;
                    case 294:
                        {
                        alt152=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 152, 0, input);

                        throw nvae;
                    }

                    switch (alt152) {
                        case 1 :
                            // flips.g:563:5: 'd'
                            {
                            char_literal415=(Token)match(input,237,FOLLOW_237_in_upDownDirection3255);  
                            stream_237.add(char_literal415);


                            }
                            break;
                        case 2 :
                            // flips.g:563:9: 'down'
                            {
                            string_literal416=(Token)match(input,292,FOLLOW_292_in_upDownDirection3257);  
                            stream_292.add(string_literal416);


                            }
                            break;
                        case 3 :
                            // flips.g:563:16: 'descend'
                            {
                            string_literal417=(Token)match(input,293,FOLLOW_293_in_upDownDirection3259);  
                            stream_293.add(string_literal417);


                            }
                            break;
                        case 4 :
                            // flips.g:563:26: 'descending'
                            {
                            string_literal418=(Token)match(input,294,FOLLOW_294_in_upDownDirection3261);  
                            stream_294.add(string_literal418);


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
                    // 564:2: -> DESCEND
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
    // flips.g:567:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal419=null;
        Token string_literal420=null;
        Token string_literal421=null;
        Token char_literal422=null;
        Token string_literal423=null;
        Token string_literal424=null;

        CommonTree char_literal419_tree=null;
        CommonTree string_literal420_tree=null;
        CommonTree string_literal421_tree=null;
        CommonTree char_literal422_tree=null;
        CommonTree string_literal423_tree=null;
        CommonTree string_literal424_tree=null;
        RewriteRuleTokenStream stream_300=new RewriteRuleTokenStream(adaptor,"token 300");
        RewriteRuleTokenStream stream_297=new RewriteRuleTokenStream(adaptor,"token 297");
        RewriteRuleTokenStream stream_298=new RewriteRuleTokenStream(adaptor,"token 298");
        RewriteRuleTokenStream stream_299=new RewriteRuleTokenStream(adaptor,"token 299");
        RewriteRuleTokenStream stream_296=new RewriteRuleTokenStream(adaptor,"token 296");
        RewriteRuleTokenStream stream_295=new RewriteRuleTokenStream(adaptor,"token 295");

        try {
            // flips.g:568:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( ((LA156_0>=295 && LA156_0<=297)) ) {
                alt156=1;
            }
            else if ( ((LA156_0>=298 && LA156_0<=300)) ) {
                alt156=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // flips.g:568:4: ( 'l' | 'left' | 'port' )
                    {
                    // flips.g:568:4: ( 'l' | 'left' | 'port' )
                    int alt154=3;
                    switch ( input.LA(1) ) {
                    case 295:
                        {
                        alt154=1;
                        }
                        break;
                    case 296:
                        {
                        alt154=2;
                        }
                        break;
                    case 297:
                        {
                        alt154=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 154, 0, input);

                        throw nvae;
                    }

                    switch (alt154) {
                        case 1 :
                            // flips.g:568:5: 'l'
                            {
                            char_literal419=(Token)match(input,295,FOLLOW_295_in_leftRightDirection3279);  
                            stream_295.add(char_literal419);


                            }
                            break;
                        case 2 :
                            // flips.g:568:9: 'left'
                            {
                            string_literal420=(Token)match(input,296,FOLLOW_296_in_leftRightDirection3281);  
                            stream_296.add(string_literal420);


                            }
                            break;
                        case 3 :
                            // flips.g:568:16: 'port'
                            {
                            string_literal421=(Token)match(input,297,FOLLOW_297_in_leftRightDirection3283);  
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
                    // 569:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:570:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // flips.g:570:4: ( 'r' | 'right' | 'starboard' )
                    int alt155=3;
                    switch ( input.LA(1) ) {
                    case 298:
                        {
                        alt155=1;
                        }
                        break;
                    case 299:
                        {
                        alt155=2;
                        }
                        break;
                    case 300:
                        {
                        alt155=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 155, 0, input);

                        throw nvae;
                    }

                    switch (alt155) {
                        case 1 :
                            // flips.g:570:5: 'r'
                            {
                            char_literal422=(Token)match(input,298,FOLLOW_298_in_leftRightDirection3295);  
                            stream_298.add(char_literal422);


                            }
                            break;
                        case 2 :
                            // flips.g:570:9: 'right'
                            {
                            string_literal423=(Token)match(input,299,FOLLOW_299_in_leftRightDirection3297);  
                            stream_299.add(string_literal423);


                            }
                            break;
                        case 3 :
                            // flips.g:570:17: 'starboard'
                            {
                            string_literal424=(Token)match(input,300,FOLLOW_300_in_leftRightDirection3299);  
                            stream_300.add(string_literal424);


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
                    // 571:2: -> RIGHT
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
    // flips.g:574:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal425=null;
        Token string_literal426=null;
        Token string_literal427=null;
        Token string_literal428=null;

        CommonTree string_literal425_tree=null;
        CommonTree string_literal426_tree=null;
        CommonTree string_literal427_tree=null;
        CommonTree string_literal428_tree=null;
        RewriteRuleTokenStream stream_302=new RewriteRuleTokenStream(adaptor,"token 302");
        RewriteRuleTokenStream stream_301=new RewriteRuleTokenStream(adaptor,"token 301");
        RewriteRuleTokenStream stream_304=new RewriteRuleTokenStream(adaptor,"token 304");
        RewriteRuleTokenStream stream_303=new RewriteRuleTokenStream(adaptor,"token 303");

        try {
            // flips.g:575:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( ((LA159_0>=301 && LA159_0<=302)) ) {
                alt159=1;
            }
            else if ( ((LA159_0>=303 && LA159_0<=304)) ) {
                alt159=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // flips.g:575:4: ( 'cw' | 'clockwise' )
                    {
                    // flips.g:575:4: ( 'cw' | 'clockwise' )
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==301) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==302) ) {
                        alt157=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }
                    switch (alt157) {
                        case 1 :
                            // flips.g:575:5: 'cw'
                            {
                            string_literal425=(Token)match(input,301,FOLLOW_301_in_clockDirection3317);  
                            stream_301.add(string_literal425);


                            }
                            break;
                        case 2 :
                            // flips.g:575:10: 'clockwise'
                            {
                            string_literal426=(Token)match(input,302,FOLLOW_302_in_clockDirection3319);  
                            stream_302.add(string_literal426);


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
                    // 576:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:577:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // flips.g:577:4: ( 'ccw' | 'counterclockwise' )
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==303) ) {
                        alt158=1;
                    }
                    else if ( (LA158_0==304) ) {
                        alt158=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 158, 0, input);

                        throw nvae;
                    }
                    switch (alt158) {
                        case 1 :
                            // flips.g:577:5: 'ccw'
                            {
                            string_literal427=(Token)match(input,303,FOLLOW_303_in_clockDirection3331);  
                            stream_303.add(string_literal427);


                            }
                            break;
                        case 2 :
                            // flips.g:577:11: 'counterclockwise'
                            {
                            string_literal428=(Token)match(input,304,FOLLOW_304_in_clockDirection3333);  
                            stream_304.add(string_literal428);


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
                    // 578:2: -> COUNTERCLOCKWISE
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
    // flips.g:581:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal430=null;
        Token string_literal431=null;
        Token string_literal432=null;
        Token string_literal433=null;
        Token char_literal435=null;
        Token char_literal437=null;
        Token string_literal439=null;
        Token string_literal440=null;
        Token string_literal441=null;
        Token string_literal442=null;
        flipsParser.numericValue_return numericValue429 = null;

        flipsParser.integerValue_return integerValue434 = null;

        flipsParser.numericValue_return numericValue436 = null;

        flipsParser.numericValue_return numericValue438 = null;


        CommonTree string_literal430_tree=null;
        CommonTree string_literal431_tree=null;
        CommonTree string_literal432_tree=null;
        CommonTree string_literal433_tree=null;
        CommonTree char_literal435_tree=null;
        CommonTree char_literal437_tree=null;
        CommonTree string_literal439_tree=null;
        CommonTree string_literal440_tree=null;
        CommonTree string_literal441_tree=null;
        CommonTree string_literal442_tree=null;
        RewriteRuleTokenStream stream_306=new RewriteRuleTokenStream(adaptor,"token 306");
        RewriteRuleTokenStream stream_305=new RewriteRuleTokenStream(adaptor,"token 305");
        RewriteRuleTokenStream stream_312=new RewriteRuleTokenStream(adaptor,"token 312");
        RewriteRuleTokenStream stream_308=new RewriteRuleTokenStream(adaptor,"token 308");
        RewriteRuleTokenStream stream_313=new RewriteRuleTokenStream(adaptor,"token 313");
        RewriteRuleTokenStream stream_307=new RewriteRuleTokenStream(adaptor,"token 307");
        RewriteRuleTokenStream stream_310=new RewriteRuleTokenStream(adaptor,"token 310");
        RewriteRuleTokenStream stream_311=new RewriteRuleTokenStream(adaptor,"token 311");
        RewriteRuleTokenStream stream_309=new RewriteRuleTokenStream(adaptor,"token 309");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:582:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt162=3;
            int LA162_0 = input.LA(1);

            if ( ((LA162_0>=BinaryLiteral && LA162_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 305:
                case 306:
                case 307:
                case 308:
                    {
                    alt162=1;
                    }
                    break;
                case 310:
                case 311:
                case 312:
                case 313:
                    {
                    alt162=3;
                    }
                    break;
                case 237:
                    {
                    alt162=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 162, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA162_0==FloatingPointLiteral) ) {
                int LA162_2 = input.LA(2);

                if ( ((LA162_2>=305 && LA162_2<=308)) ) {
                    alt162=1;
                }
                else if ( ((LA162_2>=310 && LA162_2<=313)) ) {
                    alt162=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 162, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // flips.g:582:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3350);
                    numericValue429=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue429.getTree());
                    // flips.g:582:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt160=4;
                    switch ( input.LA(1) ) {
                    case 305:
                        {
                        alt160=1;
                        }
                        break;
                    case 306:
                        {
                        alt160=2;
                        }
                        break;
                    case 307:
                        {
                        alt160=3;
                        }
                        break;
                    case 308:
                        {
                        alt160=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 160, 0, input);

                        throw nvae;
                    }

                    switch (alt160) {
                        case 1 :
                            // flips.g:582:18: 'deg'
                            {
                            string_literal430=(Token)match(input,305,FOLLOW_305_in_angularValue3353);  
                            stream_305.add(string_literal430);


                            }
                            break;
                        case 2 :
                            // flips.g:582:24: 'degs'
                            {
                            string_literal431=(Token)match(input,306,FOLLOW_306_in_angularValue3355);  
                            stream_306.add(string_literal431);


                            }
                            break;
                        case 3 :
                            // flips.g:582:31: 'degree'
                            {
                            string_literal432=(Token)match(input,307,FOLLOW_307_in_angularValue3357);  
                            stream_307.add(string_literal432);


                            }
                            break;
                        case 4 :
                            // flips.g:582:40: 'degrees'
                            {
                            string_literal433=(Token)match(input,308,FOLLOW_308_in_angularValue3359);  
                            stream_308.add(string_literal433);


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
                    // 583:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:584:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue3372);
                    integerValue434=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue434.getTree());
                    char_literal435=(Token)match(input,237,FOLLOW_237_in_angularValue3374);  
                    stream_237.add(char_literal435);

                    pushFollow(FOLLOW_numericValue_in_angularValue3376);
                    numericValue436=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue436.getTree());
                    char_literal437=(Token)match(input,309,FOLLOW_309_in_angularValue3378);  
                    stream_309.add(char_literal437);



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
                    // 585:2: -> integerValue DEGREE numericValue MINUTE
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
                    // flips.g:586:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue3394);
                    numericValue438=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue438.getTree());
                    // flips.g:586:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt161=4;
                    switch ( input.LA(1) ) {
                    case 310:
                        {
                        alt161=1;
                        }
                        break;
                    case 311:
                        {
                        alt161=2;
                        }
                        break;
                    case 312:
                        {
                        alt161=3;
                        }
                        break;
                    case 313:
                        {
                        alt161=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 161, 0, input);

                        throw nvae;
                    }

                    switch (alt161) {
                        case 1 :
                            // flips.g:586:18: 'rad'
                            {
                            string_literal439=(Token)match(input,310,FOLLOW_310_in_angularValue3397);  
                            stream_310.add(string_literal439);


                            }
                            break;
                        case 2 :
                            // flips.g:586:24: 'rads'
                            {
                            string_literal440=(Token)match(input,311,FOLLOW_311_in_angularValue3399);  
                            stream_311.add(string_literal440);


                            }
                            break;
                        case 3 :
                            // flips.g:586:31: 'radian'
                            {
                            string_literal441=(Token)match(input,312,FOLLOW_312_in_angularValue3401);  
                            stream_312.add(string_literal441);


                            }
                            break;
                        case 4 :
                            // flips.g:586:40: 'radians'
                            {
                            string_literal442=(Token)match(input,313,FOLLOW_313_in_angularValue3403);  
                            stream_313.add(string_literal442);


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
                    // 587:2: -> numericValue RADIAN
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
    // flips.g:592:1: waypoint : ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier444=null;
        flipsParser.geoCoordinate_return geoCoordinate443 = null;


        CommonTree Identifier444_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // flips.g:593:2: ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( ((LA163_0>=FloatingPointLiteral && LA163_0<=HexLiteral)||LA163_0==108||(LA163_0>=314 && LA163_0<=315)) ) {
                alt163=1;
            }
            else if ( (LA163_0==Identifier) ) {
                alt163=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // flips.g:593:4: geoCoordinate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_geoCoordinate_in_waypoint3424);
                    geoCoordinate443=geoCoordinate();

                    state._fsp--;

                    adaptor.addChild(root_0, geoCoordinate443.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:594:4: Identifier
                    {
                    Identifier444=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint3429);  
                    stream_Identifier.add(Identifier444);



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
                    // 595:2: -> ^( WAYPOINT Identifier )
                    {
                        // flips.g:595:5: ^( WAYPOINT Identifier )
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
    // flips.g:598:1: geoCoordinate : ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) );
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude445 = null;

        flipsParser.distanceCoordinate_return distanceCoordinate446 = null;


        RewriteRuleSubtreeStream stream_distanceCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule distanceCoordinate");
        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // flips.g:599:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( ((LA164_0>=FloatingPointLiteral && LA164_0<=HexLiteral)||(LA164_0>=314 && LA164_0<=315)) ) {
                alt164=1;
            }
            else if ( (LA164_0==108) ) {
                alt164=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // flips.g:599:4: latitudeLongitude
                    {
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate3449);
                    latitudeLongitude445=latitudeLongitude();

                    state._fsp--;

                    stream_latitudeLongitude.add(latitudeLongitude445.getTree());


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
                    // 600:2: -> ^( GEOCOORDINATE latitudeLongitude )
                    {
                        // flips.g:600:5: ^( GEOCOORDINATE latitudeLongitude )
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
                    // flips.g:601:4: distanceCoordinate
                    {
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate3463);
                    distanceCoordinate446=distanceCoordinate();

                    state._fsp--;

                    stream_distanceCoordinate.add(distanceCoordinate446.getTree());


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
                    // 602:2: -> ^( GEOCOORDINATE distanceCoordinate )
                    {
                        // flips.g:602:5: ^( GEOCOORDINATE distanceCoordinate )
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
    // flips.g:605:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal448=null;
        Token char_literal450=null;
        Token char_literal451=null;
        Token char_literal452=null;
        Token char_literal453=null;
        Token char_literal454=null;
        Token char_literal455=null;
        Token char_literal456=null;
        Token char_literal457=null;
        Token char_literal458=null;
        Token char_literal459=null;
        Token char_literal460=null;
        Token char_literal461=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection447 = null;

        flipsParser.eastWestDirection_return eastWestDirection449 = null;


        CommonTree char_literal448_tree=null;
        CommonTree char_literal450_tree=null;
        CommonTree char_literal451_tree=null;
        CommonTree char_literal452_tree=null;
        CommonTree char_literal453_tree=null;
        CommonTree char_literal454_tree=null;
        CommonTree char_literal455_tree=null;
        CommonTree char_literal456_tree=null;
        CommonTree char_literal457_tree=null;
        CommonTree char_literal458_tree=null;
        CommonTree char_literal459_tree=null;
        CommonTree char_literal460_tree=null;
        CommonTree char_literal461_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_314=new RewriteRuleTokenStream(adaptor,"token 314");
        RewriteRuleTokenStream stream_315=new RewriteRuleTokenStream(adaptor,"token 315");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // flips.g:606:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt174=5;
            alt174 = dfa174.predict(input);
            switch (alt174) {
                case 1 :
                    // flips.g:606:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3485);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3487);
                    northSouthDirection447=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection447.getTree());
                    // flips.g:606:49: ( ',' )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==107) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // flips.g:606:49: ','
                            {
                            char_literal448=(Token)match(input,107,FOLLOW_107_in_latitudeLongitude3489);  
                            stream_107.add(char_literal448);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3494);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3496);
                    eastWestDirection449=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection449.getTree());


                    // AST REWRITE
                    // elements: y, northSouthDirection, x, eastWestDirection
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
                    // 607:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // flips.g:607:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:607:40: ^( LONGITUDE $y eastWestDirection )
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
                    // flips.g:608:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // flips.g:608:4: ( '+' )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==314) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // flips.g:608:4: '+'
                            {
                            char_literal450=(Token)match(input,314,FOLLOW_314_in_latitudeLongitude3522);  
                            stream_314.add(char_literal450);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3527);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:608:34: ( ',' )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==107) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // flips.g:608:34: ','
                            {
                            char_literal451=(Token)match(input,107,FOLLOW_107_in_latitudeLongitude3529);  
                            stream_107.add(char_literal451);


                            }
                            break;

                    }

                    // flips.g:608:39: ( '+' )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==314) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // flips.g:608:39: '+'
                            {
                            char_literal452=(Token)match(input,314,FOLLOW_314_in_latitudeLongitude3532);  
                            stream_314.add(char_literal452);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3537);
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
                    // 609:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // flips.g:609:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:609:26: ^( LONGITUDE $y EAST )
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
                    // flips.g:610:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal453=(Token)match(input,315,FOLLOW_315_in_latitudeLongitude3563);  
                    stream_315.add(char_literal453);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3567);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:610:33: ( ',' )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==107) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // flips.g:610:33: ','
                            {
                            char_literal454=(Token)match(input,107,FOLLOW_107_in_latitudeLongitude3569);  
                            stream_107.add(char_literal454);


                            }
                            break;

                    }

                    // flips.g:610:38: ( '+' )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==314) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // flips.g:610:38: '+'
                            {
                            char_literal455=(Token)match(input,314,FOLLOW_314_in_latitudeLongitude3572);  
                            stream_314.add(char_literal455);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3577);
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
                    // 611:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // flips.g:611:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:611:26: ^( LONGITUDE $y EAST )
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
                    // flips.g:612:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // flips.g:612:4: ( '+' )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==314) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // flips.g:612:4: '+'
                            {
                            char_literal456=(Token)match(input,314,FOLLOW_314_in_latitudeLongitude3603);  
                            stream_314.add(char_literal456);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3608);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:612:34: ( ',' )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==107) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // flips.g:612:34: ','
                            {
                            char_literal457=(Token)match(input,107,FOLLOW_107_in_latitudeLongitude3610);  
                            stream_107.add(char_literal457);


                            }
                            break;

                    }

                    char_literal458=(Token)match(input,315,FOLLOW_315_in_latitudeLongitude3613);  
                    stream_315.add(char_literal458);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3617);
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
                    // 613:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // flips.g:613:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:613:26: ^( LONGITUDE $y WEST )
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
                    // flips.g:614:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal459=(Token)match(input,315,FOLLOW_315_in_latitudeLongitude3643);  
                    stream_315.add(char_literal459);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3647);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // flips.g:614:33: ( ',' )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==107) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // flips.g:614:33: ','
                            {
                            char_literal460=(Token)match(input,107,FOLLOW_107_in_latitudeLongitude3649);  
                            stream_107.add(char_literal460);


                            }
                            break;

                    }

                    char_literal461=(Token)match(input,315,FOLLOW_315_in_latitudeLongitude3652);  
                    stream_315.add(char_literal461);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3656);
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
                    // 615:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // flips.g:615:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:615:26: ^( LONGITUDE $y WEST )
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
    // flips.g:618:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue462 = null;

        flipsParser.angularValue_return angularValue463 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:619:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( ((LA175_0>=BinaryLiteral && LA175_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 305:
                case 306:
                case 307:
                case 308:
                case 310:
                case 311:
                case 312:
                case 313:
                    {
                    alt175=2;
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
                case 102:
                case 103:
                case 104:
                case 106:
                case 107:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 120:
                case 121:
                case 122:
                case 123:
                case 133:
                case 134:
                case 135:
                case 136:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 146:
                case 147:
                case 149:
                case 170:
                case 171:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                case 248:
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
                case 302:
                case 303:
                case 304:
                case 314:
                case 315:
                    {
                    alt175=1;
                    }
                    break;
                case 237:
                    {
                    switch ( input.LA(3) ) {
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA175_6 = input.LA(4);

                        if ( ((LA175_6>=152 && LA175_6<=170)||(LA175_6>=172 && LA175_6<=198)) ) {
                            alt175=1;
                        }
                        else if ( (LA175_6==309) ) {
                            alt175=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 175, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA175_7 = input.LA(4);

                        if ( ((LA175_7>=152 && LA175_7<=170)||(LA175_7>=172 && LA175_7<=198)) ) {
                            alt175=1;
                        }
                        else if ( (LA175_7==309) ) {
                            alt175=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 175, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case To:
                    case FlightLevel:
                        {
                        alt175=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 175, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 175, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA175_0==FloatingPointLiteral) ) {
                int LA175_2 = input.LA(2);

                if ( (LA175_2==EOF||(LA175_2>=Identifier && LA175_2<=With)||(LA175_2>=Turning && LA175_2<=HexLiteral)||(LA175_2>=102 && LA175_2<=104)||(LA175_2>=106 && LA175_2<=107)||(LA175_2>=110 && LA175_2<=117)||(LA175_2>=120 && LA175_2<=123)||(LA175_2>=133 && LA175_2<=136)||(LA175_2>=139 && LA175_2<=144)||(LA175_2>=146 && LA175_2<=147)||LA175_2==149||(LA175_2>=170 && LA175_2<=171)||(LA175_2>=211 && LA175_2<=216)||LA175_2==237||LA175_2==248||(LA175_2>=253 && LA175_2<=304)||(LA175_2>=314 && LA175_2<=315)) ) {
                    alt175=1;
                }
                else if ( ((LA175_2>=305 && LA175_2<=308)||(LA175_2>=310 && LA175_2<=313)) ) {
                    alt175=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 175, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // flips.g:619:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3688);
                    numericValue462=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue462.getTree());


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
                    // 620:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // flips.g:621:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3700);
                    angularValue463=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue463.getTree());

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
    // flips.g:624:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );
    public final flipsParser.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsParser.distanceCoordinate_return retval = new flipsParser.distanceCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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
        Token char_literal480=null;
        Token char_literal481=null;
        Token char_literal482=null;
        Token char_literal483=null;
        flipsParser.distanceValue_return x = null;

        flipsParser.distanceValue_return y = null;


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
        CommonTree char_literal480_tree=null;
        CommonTree char_literal481_tree=null;
        CommonTree char_literal482_tree=null;
        CommonTree char_literal483_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_314=new RewriteRuleTokenStream(adaptor,"token 314");
        RewriteRuleTokenStream stream_315=new RewriteRuleTokenStream(adaptor,"token 315");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // flips.g:625:2: ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) )
            int alt180=4;
            alt180 = dfa180.predict(input);
            switch (alt180) {
                case 1 :
                    // flips.g:625:4: '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal464=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3711);  
                    stream_108.add(char_literal464);

                    // flips.g:625:8: ( '+' )?
                    int alt176=2;
                    int LA176_0 = input.LA(1);

                    if ( (LA176_0==314) ) {
                        alt176=1;
                    }
                    switch (alt176) {
                        case 1 :
                            // flips.g:625:8: '+'
                            {
                            char_literal465=(Token)match(input,314,FOLLOW_314_in_distanceCoordinate3713);  
                            stream_314.add(char_literal465);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3718);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal466=(Token)match(input,107,FOLLOW_107_in_distanceCoordinate3720);  
                    stream_107.add(char_literal466);

                    // flips.g:625:33: ( '+' )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==314) ) {
                        alt177=1;
                    }
                    switch (alt177) {
                        case 1 :
                            // flips.g:625:33: '+'
                            {
                            char_literal467=(Token)match(input,314,FOLLOW_314_in_distanceCoordinate3722);  
                            stream_314.add(char_literal467);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3727);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal468=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3729);  
                    stream_109.add(char_literal468);



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
                    // 626:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST )
                    {
                        // flips.g:626:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:626:26: ^( DISTANCE $x EAST )
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
                    // flips.g:627:4: '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal469=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3755);  
                    stream_108.add(char_literal469);

                    char_literal470=(Token)match(input,315,FOLLOW_315_in_distanceCoordinate3757);  
                    stream_315.add(char_literal470);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3761);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal471=(Token)match(input,107,FOLLOW_107_in_distanceCoordinate3763);  
                    stream_107.add(char_literal471);

                    // flips.g:627:32: ( '+' )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==314) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // flips.g:627:32: '+'
                            {
                            char_literal472=(Token)match(input,314,FOLLOW_314_in_distanceCoordinate3765);  
                            stream_314.add(char_literal472);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3770);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal473=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3772);  
                    stream_109.add(char_literal473);



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
                    // 628:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST )
                    {
                        // flips.g:628:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:628:26: ^( DISTANCE $x WEST )
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
                    // flips.g:629:4: '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal474=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3798);  
                    stream_108.add(char_literal474);

                    // flips.g:629:8: ( '+' )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==314) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // flips.g:629:8: '+'
                            {
                            char_literal475=(Token)match(input,314,FOLLOW_314_in_distanceCoordinate3800);  
                            stream_314.add(char_literal475);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3805);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal476=(Token)match(input,107,FOLLOW_107_in_distanceCoordinate3807);  
                    stream_107.add(char_literal476);

                    char_literal477=(Token)match(input,315,FOLLOW_315_in_distanceCoordinate3809);  
                    stream_315.add(char_literal477);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3813);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal478=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3815);  
                    stream_109.add(char_literal478);



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
                    // 630:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST )
                    {
                        // flips.g:630:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:630:26: ^( DISTANCE $x EAST )
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
                    // flips.g:631:4: '(' '-' x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal479=(Token)match(input,108,FOLLOW_108_in_distanceCoordinate3841);  
                    stream_108.add(char_literal479);

                    char_literal480=(Token)match(input,315,FOLLOW_315_in_distanceCoordinate3843);  
                    stream_315.add(char_literal480);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3847);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal481=(Token)match(input,107,FOLLOW_107_in_distanceCoordinate3849);  
                    stream_107.add(char_literal481);

                    char_literal482=(Token)match(input,315,FOLLOW_315_in_distanceCoordinate3851);  
                    stream_315.add(char_literal482);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3855);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal483=(Token)match(input,109,FOLLOW_109_in_distanceCoordinate3857);  
                    stream_109.add(char_literal483);



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
                    // 632:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST )
                    {
                        // flips.g:632:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // flips.g:632:26: ^( DISTANCE $x WEST )
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
    // flips.g:637:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral485=null;
        flipsParser.integerValue_return integerValue484 = null;


        CommonTree FloatingPointLiteral485_tree=null;

        try {
            // flips.g:638:2: ( integerValue | FloatingPointLiteral )
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( ((LA181_0>=BinaryLiteral && LA181_0<=HexLiteral)) ) {
                alt181=1;
            }
            else if ( (LA181_0==FloatingPointLiteral) ) {
                alt181=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }
            switch (alt181) {
                case 1 :
                    // flips.g:638:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3891);
                    integerValue484=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue484.getTree());

                    }
                    break;
                case 2 :
                    // flips.g:639:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral485=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3896); 
                    FloatingPointLiteral485_tree = (CommonTree)adaptor.create(FloatingPointLiteral485);
                    adaptor.addChild(root_0, FloatingPointLiteral485_tree);


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
    // flips.g:642:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set486=null;

        CommonTree set486_tree=null;

        try {
            // flips.g:643:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set486=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set486));
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
    // flips.g:649:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal488=null;
        Token string_literal489=null;
        flipsParser.numericValue_return numericValue487 = null;


        CommonTree char_literal488_tree=null;
        CommonTree string_literal489_tree=null;
        RewriteRuleTokenStream stream_316=new RewriteRuleTokenStream(adaptor,"token 316");
        RewriteRuleTokenStream stream_317=new RewriteRuleTokenStream(adaptor,"token 317");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flips.g:650:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // flips.g:650:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3933);
            numericValue487=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue487.getTree());
            // flips.g:650:17: ( '%' | 'percent' )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==316) ) {
                alt182=1;
            }
            else if ( (LA182_0==317) ) {
                alt182=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }
            switch (alt182) {
                case 1 :
                    // flips.g:650:18: '%'
                    {
                    char_literal488=(Token)match(input,316,FOLLOW_316_in_percentValue3936);  
                    stream_316.add(char_literal488);


                    }
                    break;
                case 2 :
                    // flips.g:650:22: 'percent'
                    {
                    string_literal489=(Token)match(input,317,FOLLOW_317_in_percentValue3938);  
                    stream_317.add(string_literal489);


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
            // 651:2: -> numericValue PERCENT
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
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA174 dfa174 = new DFA174(this);
    protected DFA180 dfa180 = new DFA180(this);
    static final String DFA38_eotS =
        "\56\uffff";
    static final String DFA38_eofS =
        "\13\uffff\1\12\1\uffff\12\14\2\uffff\20\14\1\52\1\uffff\3\14";
    static final String DFA38_minS =
        "\1\121\1\161\1\uffff\1\130\2\uffff\1\130\4\uffff\1\121\1\uffff\12"+
        "\121\2\u00b7\21\121\1\uffff\3\121";
    static final String DFA38_maxS =
        "\1\u013b\1\u008a\1\uffff\1\u013b\2\uffff\1\u013b\4\uffff\1\u0090"+
        "\1\uffff\12\u00d2\2\u00b9\20\u00d2\1\u0090\1\uffff\3\u00d2";
    static final String DFA38_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10"+
        "\35\uffff\1\11\3\uffff";
    static final String DFA38_specialS =
        "\56\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\13\3\uffff\1\14\2\4\1\6\4\3\17\uffff\1\12\4\uffff\2\12\3"+
            "\uffff\1\2\5\uffff\1\1\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11\2\14"+
            "\155\uffff\1\4\5\uffff\37\4\35\uffff\2\12",
            "\2\12\3\uffff\1\2\6\uffff\1\2\1\uffff\2\4\2\5\2\7\2\10\2\11"+
            "\2\14",
            "",
            "\5\12\16\uffff\1\12\54\uffff\22\14\1\46\1\uffff\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1"+
            "\30\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1"+
            "\50\2\uffff\10\5\14\uffff\5\2\13\uffff\1\12\12\uffff\1\12\5"+
            "\uffff\3\12\60\uffff\4\12\1\uffff\6\12",
            "",
            "",
            "\5\12\16\uffff\1\12\54\uffff\22\14\1\46\1\uffff\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1"+
            "\30\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\47\1"+
            "\50\2\uffff\10\5\47\uffff\1\12\5\uffff\3\12\60\uffff\4\12\1"+
            "\uffff\6\12",
            "",
            "",
            "",
            "",
            "\1\12\6\uffff\1\52\4\51\14\uffff\1\52\12\uffff\2\12\2\uffff"+
            "\4\12\2\uffff\1\52\14\uffff\6\12",
            "",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\53\1\54\1\55",
            "\1\31\1\32\1\33",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\52\7\uffff\4\52\27\uffff\2\52\2\12\4\52\17\uffff\6\52",
            "",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5",
            "\1\14\7\uffff\4\14\27\uffff\2\14\2\uffff\4\14\17\uffff\6\14"+
            "\100\uffff\2\5"
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
            return "181:1: conditionValue : ( ( ( 'the' )? ( 'tim' | 'time' ) ( '=' | 'is' ) )? timeValue | ( ( 'the' )? ( 'dir' | 'direction' ) ( '=' | 'is' ) )? fixedDirection | ( ( 'the' )? ( 'spd' | 'speed' ) ( '=' | 'is' ) )? speedValue | ( ( 'the' )? ( 'dst' | 'distance' ) ( '=' | 'is' ) ) distanceValue | ( ( 'the' )? ( 'pit' | 'pitch' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'rol' | 'roll' ) ( '=' | 'is' ) ) angularValue | ( ( 'the' )? ( 'wpt' | 'waypoint' ) ( '=' | 'is' ) )? waypoint | ( ( 'the' )? ( 'alt' | 'altitude' ) ( '=' | 'is' ) )? altitudeValue | Identifier ( '=' | 'is' )? numericValue );";
        }
    }
    static final String DFA45_eotS =
        "\122\uffff";
    static final String DFA45_eofS =
        "\17\uffff\12\6\2\uffff\20\6\5\uffff\12\14\2\uffff\20\14\3\6\3\14";
    static final String DFA45_minS =
        "\1\122\1\125\1\uffff\2\u00aa\3\uffff\1\125\2\uffff\1\121\1\uffff"+
        "\2\u0098\12\121\2\u00b7\20\121\1\u0089\2\130\2\uffff\12\121\2\u00b7"+
        "\26\121";
    static final String DFA45_maxS =
        "\1\u012c\1\u00d8\1\uffff\2\u013d\3\uffff\1\u0097\2\uffff\1\u013b"+
        "\1\uffff\2\u013d\12\u012c\2\u00b9\20\u012c\1\u0093\2\u013b\2\uffff"+
        "\12\u012c\2\u00b9\26\u012c";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\41"+
        "\uffff\1\10\1\1\42\uffff";
    static final String DFA45_specialS =
        "\122\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\13\1\1\1\10\1\uffff\2\2\1\4\4\3\50\uffff\2\7\2\11\11\uffff"+
            "\2\7\77\uffff\6\5\24\uffff\1\14\12\uffff\1\2\4\uffff\1\12\37"+
            "\2\12\14\6\6",
            "\1\14\2\uffff\1\16\4\15\54\uffff\2\14\6\uffff\1\14\3\uffff"+
            "\3\14\73\uffff\6\5",
            "",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\10\5\153\uffff\2\5",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\10\5\153\uffff\2\5",
            "",
            "",
            "",
            "\1\14\2\uffff\5\14\54\uffff\2\14\6\uffff\1\53\3\uffff\3\14",
            "",
            "",
            "\1\56\3\uffff\1\14\2\uffff\1\55\4\54\17\uffff\1\56\34\uffff"+
            "\2\14\6\uffff\1\14\3\uffff\3\14\u00a2\uffff\2\56",
            "",
            "\22\14\1\111\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71\1\72\1\74\1\75\1\76\1\73\1\77\1\100\1\101\1\102\1"+
            "\103\1\104\1\105\1\106\1\107\1\110\1\112\1\113\2\uffff\10\5"+
            "\14\uffff\5\57\132\uffff\2\5",
            "\22\14\1\111\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71\1\72\1\74\1\75\1\76\1\73\1\77\1\100\1\101\1\102\1"+
            "\103\1\104\1\105\1\106\1\107\1\110\1\112\1\113\2\uffff\10\5"+
            "\153\uffff\2\5",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\1\114\1\115\1\116",
            "\1\33\1\34\1\35",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\2\14\7\uffff\2\7",
            "\5\56\16\uffff\1\56\54\uffff\23\14\1\uffff\33\14\46\uffff\1"+
            "\56\12\uffff\1\56\5\uffff\3\56\60\uffff\4\56\1\uffff\6\56",
            "\5\56\16\uffff\1\56\54\uffff\23\14\1\uffff\33\14\61\uffff\1"+
            "\56\5\uffff\3\56\60\uffff\4\56\1\uffff\6\56",
            "",
            "",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\1\117\1\120\1\121",
            "\1\74\1\75\1\76",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\75\uffff\2\5\6\6\24\uffff\1\6\12\uffff\1\6"+
            "\4\uffff\60\6",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14",
            "\4\14\1\uffff\7\14\27\uffff\2\14\2\uffff\4\14\11\uffff\4\14"+
            "\2\uffff\6\14\1\uffff\2\14\75\uffff\2\5\6\14\24\uffff\1\14\12"+
            "\uffff\1\14\4\uffff\60\14"
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
            return "207:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA50_eotS =
        "\u0091\uffff";
    static final String DFA50_eofS =
        "\55\uffff\12\11\2\uffff\20\11\3\uffff\12\11\2\uffff\23\11\1\6\3"+
        "\11\2\uffff\12\11\2\uffff\20\11\1\6\3\11";
    static final String DFA50_minS =
        "\1\122\1\121\2\u00aa\3\uffff\1\125\2\uffff\2\130\1\uffff\12\u00ab"+
        "\2\u00b7\20\u00ab\1\130\2\u0098\1\uffff\12\121\2\u00b7\20\121\3"+
        "\u00ab\12\121\2\u00b7\27\121\1\166\1\u00aa\12\121\2\u00b7\24\121";
    static final String DFA50_maxS =
        "\1\u0130\1\u013b\2\u013d\3\uffff\1\u00ab\2\uffff\2\u013d\1\uffff"+
        "\12\u00d2\2\u00b9\20\u00d2\1\u00ab\2\u00c6\1\uffff\12\u0130\2\u00b9"+
        "\20\u0130\3\u00d2\12\u0130\2\u00b9\27\u0130\2\u013d\12\u0130\2\u00b9"+
        "\24\u0130";
    static final String DFA50_acceptS =
        "\4\uffff\1\2\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\37\uffff\1\1\144"+
        "\uffff";
    static final String DFA50_specialS =
        "\u0091\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\11\1\1\1\7\1\uffff\1\5\1\uffff\1\3\4\2\70\uffff\1\6\24\uffff"+
            "\2\6\47\uffff\6\4\24\uffff\1\11\17\uffff\1\10\37\uffff\12\11"+
            "\6\uffff\4\5",
            "\1\14\3\uffff\1\11\2\uffff\1\13\4\12\17\uffff\1\14\34\uffff"+
            "\2\11\6\uffff\1\11\3\uffff\3\11\73\uffff\6\4\141\uffff\2\14",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\10\4\153\uffff\2\4",
            "\1\46\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\31\1\32\1\33\1\30\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\47\1\50\2\uffff\10\4\153\uffff\2\4",
            "",
            "",
            "",
            "\1\11\2\uffff\1\53\4\52\54\uffff\2\11\6\uffff\1\11\3\uffff"+
            "\1\51\2\11\23\uffff\1\6",
            "",
            "",
            "\5\14\16\uffff\1\14\54\uffff\22\11\1\106\1\uffff\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73"+
            "\1\70\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\107\1\110\2\uffff\10\4\14\uffff\5\54\13\uffff\1\14\12\uffff"+
            "\1\14\5\uffff\3\14\60\uffff\4\14\1\uffff\6\14\2\4",
            "\5\14\16\uffff\1\14\54\uffff\22\11\1\106\1\uffff\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73"+
            "\1\70\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
            "\1\107\1\110\2\uffff\10\4\47\uffff\1\14\5\uffff\3\14\60\uffff"+
            "\4\14\1\uffff\6\14\2\4",
            "",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\111\1\112\1\113",
            "\1\31\1\32\1\33",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\5\6\71\uffff\2\11\23\uffff\1\6",
            "\22\11\1\145\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\130\1\131\1\132\1\127\1\133\1"+
            "\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\146\1"+
            "\147",
            "\22\11\1\145\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\130\1\131\1\132\1\127\1\133\1"+
            "\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\146\1"+
            "\147",
            "",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\1\150\1\151\1\152",
            "\1\71\1\72\1\73",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\1\6\45\uffff\2\4",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\1\154\1\155\1\156",
            "\1\130\1\131\1\132",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\2\11\45\uffff\2\4\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\6\1\uffff\1\6\1\uffff\1\160\4\157\27\uffff\2\6\2\uffff\4"+
            "\6\17\uffff\6\6\3\uffff\1\11\1\6\24\uffff\2\6\47\uffff\6\6\24"+
            "\uffff\1\6\17\uffff\1\6\37\uffff\12\6\6\uffff\4\6",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\153\47\uffff\6\11"+
            "\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4\11",
            "\2\6\62\uffff\1\u008a\1\uffff\1\161\1\162\1\163\1\164\1\165"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\174"+
            "\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087"+
            "\1\u0088\1\u0089\1\u008b\1\u008c\2\uffff\10\6\153\uffff\2\6",
            "\1\u008a\1\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167"+
            "\1\170\1\171\1\172\1\173\1\175\1\176\1\177\1\174\1\u0080\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089"+
            "\1\u008b\1\u008c\2\uffff\10\6\153\uffff\2\6",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\1\u008e\1\u008f\1\u0090",
            "\1\175\1\176\1\177",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\6\1\uffff\1\6\1\uffff\1\160\4\157\27\uffff\2\6\2\uffff\4"+
            "\6\17\uffff\6\6\3\uffff\1\11\1\6\24\uffff\2\6\47\uffff\6\6\24"+
            "\uffff\1\6\17\uffff\1\6\37\uffff\12\6\6\uffff\4\6",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11",
            "\4\11\1\uffff\1\11\1\uffff\5\11\27\uffff\2\11\2\uffff\4\11"+
            "\17\uffff\6\11\4\uffff\1\11\24\uffff\1\11\1\u008d\45\uffff\2"+
            "\6\6\11\24\uffff\1\11\17\uffff\1\11\37\uffff\12\11\6\uffff\4"+
            "\11"
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
            return "234:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA59_eotS =
        "\16\uffff";
    static final String DFA59_eofS =
        "\16\uffff";
    static final String DFA59_minS =
        "\14\122\2\uffff";
    static final String DFA59_maxS =
        "\1\u0126\13\134\2\uffff";
    static final String DFA59_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA59_specialS =
        "\16\uffff}>";
    static final String[] DFA59_transitionS = {
            "\3\14\u0098\uffff\1\10\57\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
            "\1\11\1\12\1\13",
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
            return "268:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA94_eotS =
        "\122\uffff";
    static final String DFA94_eofS =
        "\7\uffff\10\56\46\uffff\35\56";
    static final String DFA94_minS =
        "\1\123\1\130\2\u00aa\1\uffff\2\u00aa\10\121\12\u00d1\2\u00b7\20"+
        "\u00d1\2\u00c7\3\uffff\2\u00bb\3\u00d1\35\121";
    static final String DFA94_maxS =
        "\2\u00d8\2\u013d\1\uffff\2\u013d\10\u0130\12\u00d2\2\u00b9\20\u00d2"+
        "\2\u00dc\3\uffff\2\u00fc\3\u00d2\35\u0130";
    static final String DFA94_acceptS =
        "\4\uffff\1\3\50\uffff\1\4\1\1\1\2\42\uffff";
    static final String DFA94_specialS =
        "\122\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\1\4\uffff\1\3\4\2\166\uffff\6\4",
            "\1\6\4\5\166\uffff\6\4",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\153\uffff\1\53\1\54",
            "\1\50\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\31\1\33\1\34\1\35\1\32\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\51\1\52\2\uffff\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\153\uffff\1\53\1\54",
            "",
            "\1\56\1\uffff\33\56\2\uffff\10\56\153\uffff\2\55",
            "\1\56\1\uffff\33\56\2\uffff\10\56\153\uffff\2\55",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\62\1\63\1\64",
            "\1\33\1\34\1\35",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\2\57\20\uffff\4\55",
            "\2\57\20\uffff\4\55",
            "",
            "",
            "",
            "\1\72\27\uffff\1\111\16\uffff\1\65\1\66\1\67\1\70\1\71\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121",
            "\1\72\27\uffff\1\111\16\uffff\1\65\1\66\1\67\1\70\1\71\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\60\1\61",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56",
            "\4\56\1\uffff\7\56\27\uffff\2\56\2\uffff\4\56\11\uffff\4\56"+
            "\2\uffff\6\56\1\uffff\2\56\1\uffff\1\56\24\uffff\2\56\33\uffff"+
            "\2\57\12\uffff\6\56\24\uffff\1\56\12\uffff\1\56\4\uffff\64\56"
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "350:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );";
        }
    }
    static final String DFA96_eotS =
        "\117\uffff";
    static final String DFA96_eofS =
        "\117\uffff";
    static final String DFA96_minS =
        "\1\130\2\u00aa\10\u00c7\12\u00d1\2\u00b7\20\u00d1\2\u00c7\2\uffff"+
        "\2\u00bb\3\u00d1\2\uffff\35\u00c7";
    static final String DFA96_maxS =
        "\1\134\2\u013d\10\u00c8\12\u00d2\2\u00b9\20\u00d2\2\u00c8\2\uffff"+
        "\2\u00fc\3\u00d2\2\uffff\35\u00c8";
    static final String DFA96_acceptS =
        "\51\uffff\1\2\1\1\5\uffff\1\3\1\4\35\uffff";
    static final String DFA96_specialS =
        "\117\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\2\4\1",
            "\1\44\1\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\27\1\30\1\31\1\26\1\32\1\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\45\1\46\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\153\uffff\1\47\1\50",
            "\1\44\1\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\27\1\30\1\31\1\26\1\32\1\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\45\1\46\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\153\uffff\1\47\1\50",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\55\1\56\1\57",
            "\1\27\1\30\1\31",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\60\1\61",
            "\1\60\1\61",
            "",
            "",
            "\1\67\27\uffff\1\106\16\uffff\1\62\1\63\1\64\1\65\1\66\1\70"+
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
            "\1\104\1\105\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116",
            "\1\67\27\uffff\1\106\16\uffff\1\62\1\63\1\64\1\65\1\66\1\70"+
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
            "\1\104\1\105\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\53\1\54",
            "",
            "",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51",
            "\1\52\1\51"
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "362:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA112_eotS =
        "\14\uffff";
    static final String DFA112_eofS =
        "\5\uffff\1\6\4\uffff\2\6";
    static final String DFA112_minS =
        "\1\131\1\u00dd\1\131\2\uffff\1\121\2\uffff\1\130\1\uffff\2\121";
    static final String DFA112_maxS =
        "\1\134\1\u00e1\1\134\2\uffff\1\u0130\2\uffff\1\134\1\uffff\2\u0130";
    static final String DFA112_acceptS =
        "\3\uffff\1\4\1\2\1\uffff\1\5\1\1\1\uffff\1\3\2\uffff";
    static final String DFA112_specialS =
        "\14\uffff}>";
    static final String[] DFA112_transitionS = {
            "\4\1",
            "\2\4\2\3\1\2",
            "\4\5",
            "",
            "",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\1\uffff\1\6\24\uffff\2\6\47\uffff\6\6\4\uffff"+
            "\2\7\2\11\1\10\13\uffff\1\6\12\uffff\1\6\4\uffff\64\6",
            "",
            "",
            "\1\13\4\12",
            "",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\1\uffff\1\6\24\uffff\2\6\47\uffff\6\6\4\uffff"+
            "\2\7\2\11\14\uffff\1\6\12\uffff\1\6\4\uffff\64\6",
            "\4\6\1\uffff\7\6\27\uffff\2\6\2\uffff\4\6\11\uffff\4\6\2\uffff"+
            "\6\6\1\uffff\2\6\1\uffff\1\6\24\uffff\2\6\47\uffff\6\6\4\uffff"+
            "\2\7\2\11\14\uffff\1\6\12\uffff\1\6\4\uffff\64\6"
    };

    static final short[] DFA112_eot = DFA.unpackEncodedString(DFA112_eotS);
    static final short[] DFA112_eof = DFA.unpackEncodedString(DFA112_eofS);
    static final char[] DFA112_min = DFA.unpackEncodedStringToUnsignedChars(DFA112_minS);
    static final char[] DFA112_max = DFA.unpackEncodedStringToUnsignedChars(DFA112_maxS);
    static final short[] DFA112_accept = DFA.unpackEncodedString(DFA112_acceptS);
    static final short[] DFA112_special = DFA.unpackEncodedString(DFA112_specialS);
    static final short[][] DFA112_transition;

    static {
        int numStates = DFA112_transitionS.length;
        DFA112_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA112_transition[i] = DFA.unpackEncodedString(DFA112_transitionS[i]);
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = DFA112_eot;
            this.eof = DFA112_eof;
            this.min = DFA112_min;
            this.max = DFA112_max;
            this.accept = DFA112_accept;
            this.special = DFA112_special;
            this.transition = DFA112_transition;
        }
        public String getDescription() {
            return "419:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA123_eotS =
        "\32\uffff";
    static final String DFA123_eofS =
        "\4\uffff\11\2\5\uffff\4\26\4\uffff";
    static final String DFA123_minS =
        "\1\130\1\u00bb\2\uffff\11\121\1\166\1\u00aa\1\166\1\u00aa\1\uffff"+
        "\4\121\1\uffff\1\166\1\u00aa\1\uffff";
    static final String DFA123_maxS =
        "\1\134\1\u00fc\2\uffff\11\u0130\4\u013d\1\uffff\4\u0130\1\uffff"+
        "\2\u013d\1\uffff";
    static final String DFA123_acceptS =
        "\2\uffff\1\1\1\5\15\uffff\1\4\4\uffff\1\2\2\uffff\1\3";
    static final String DFA123_specialS =
        "\32\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\2\4\1",
            "\1\2\27\uffff\1\4\15\uffff\1\3\16\2\1\10\1\11\1\12\1\13\1\14"+
            "\1\5\1\6\1\7\5\2",
            "",
            "",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\2\2\2\uffff\4\2\11\uffff"+
            "\4\2\2\uffff\6\2\1\uffff\2\2\1\uffff\1\2\24\uffff\2\2\47\uffff"+
            "\6\2\24\uffff\1\2\12\uffff\1\2\4\uffff\64\2",
            "\2\2\62\uffff\1\2\1\uffff\33\2\2\uffff\10\2\47\uffff\5\21\77"+
            "\uffff\2\2",
            "\1\2\1\uffff\33\2\2\uffff\10\2\47\uffff\5\21\77\uffff\2\2",
            "\2\2\62\uffff\1\2\1\uffff\33\2\2\uffff\10\2\2\uffff\1\22\41"+
            "\uffff\1\23\1\24\1\25\5\26\77\uffff\2\2",
            "\1\2\1\uffff\33\2\2\uffff\10\2\2\uffff\1\26\41\uffff\10\26"+
            "\77\uffff\2\2",
            "",
            "\4\26\1\uffff\2\26\1\30\4\27\27\uffff\2\26\2\uffff\4\26\11"+
            "\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24\uffff"+
            "\2\26\47\uffff\6\26\24\uffff\1\26\12\uffff\1\26\4\uffff\64\26",
            "\4\26\1\uffff\2\26\1\30\4\27\27\uffff\2\26\2\uffff\4\26\11"+
            "\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24\uffff"+
            "\2\26\47\uffff\6\26\24\uffff\1\26\12\uffff\1\26\4\uffff\64\26",
            "\4\26\1\uffff\2\26\1\30\4\27\27\uffff\2\26\2\uffff\4\26\11"+
            "\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24\uffff"+
            "\2\26\47\uffff\6\26\24\uffff\1\26\12\uffff\1\26\4\uffff\64\26",
            "\4\26\1\uffff\2\26\1\30\4\27\27\uffff\2\26\2\uffff\4\26\11"+
            "\uffff\4\26\2\uffff\6\26\1\uffff\2\26\1\uffff\1\26\24\uffff"+
            "\2\26\47\uffff\6\26\24\uffff\1\26\12\uffff\1\26\4\uffff\64\26",
            "",
            "\2\26\62\uffff\1\26\1\uffff\33\26\2\uffff\10\26\47\uffff\5"+
            "\31\77\uffff\2\26",
            "\1\26\1\uffff\33\26\2\uffff\10\26\47\uffff\5\31\77\uffff\2"+
            "\26",
            ""
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "473:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA174_eotS =
        "\64\uffff";
    static final String DFA174_eofS =
        "\64\uffff";
    static final String DFA174_minS =
        "\6\130\1\uffff\11\130\2\uffff\4\130\2\u0135\17\130\1\uffff\4\130"+
        "\1\uffff\1\130\4\u0135\2\130";
    static final String DFA174_maxS =
        "\3\u013b\2\134\1\u013b\1\uffff\10\u013b\1\134\2\uffff\4\u013b\2"+
        "\u0135\10\u013b\2\134\5\u013b\1\uffff\4\u013b\1\uffff\1\u013b\4"+
        "\u0135\2\u013b";
    static final String DFA174_acceptS =
        "\6\uffff\1\4\11\uffff\1\2\1\1\25\uffff\1\3\4\uffff\1\5\7\uffff";
    static final String DFA174_specialS =
        "\64\uffff}>";
    static final String[] DFA174_transitionS = {
            "\1\2\4\1\u00dd\uffff\1\3\1\4",
            "\5\20\16\uffff\1\5\u0081\uffff\1\17\12\uffff\1\21\5\uffff\3"+
            "\21\60\uffff\1\7\1\10\1\11\1\12\1\uffff\1\13\1\14\1\15\1\16"+
            "\1\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\60\uffff\1"+
            "\7\1\10\1\11\1\12\1\uffff\1\13\1\14\1\15\1\16\1\20\1\6",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\20\u00dd\uffff\1\20\1\6",
            "",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\1\27\4\26",
            "",
            "",
            "\5\20\16\uffff\1\5\u0081\uffff\1\40\103\uffff\1\30\1\31\1\32"+
            "\1\33\1\uffff\1\34\1\35\1\36\1\37\1\20\1\6",
            "\5\20\16\uffff\1\5\u00c5\uffff\1\30\1\31\1\32\1\33\1\uffff"+
            "\1\34\1\35\1\36\1\37\1\20\1\6",
            "\5\47\16\uffff\1\46\u0081\uffff\1\41\103\uffff\1\50\1\51\1"+
            "\52\1\53\1\uffff\1\42\1\43\1\44\1\45\1\47\1\54",
            "\5\47\16\uffff\1\46\u00c5\uffff\1\50\1\51\1\52\1\53\1\uffff"+
            "\1\42\1\43\1\44\1\45\1\47\1\54",
            "\1\55",
            "\1\55",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\1\57\4\56",
            "\1\61\4\60",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\u00dd\uffff\1\47\1\54",
            "",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54",
            "",
            "\5\20\16\uffff\1\5\u008c\uffff\1\21\5\uffff\3\21\71\uffff\1"+
            "\20\1\6",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\20\16\uffff\1\5\u00ce\uffff\1\20\1\6",
            "\5\47\16\uffff\1\46\u00ce\uffff\1\47\1\54"
    };

    static final short[] DFA174_eot = DFA.unpackEncodedString(DFA174_eotS);
    static final short[] DFA174_eof = DFA.unpackEncodedString(DFA174_eofS);
    static final char[] DFA174_min = DFA.unpackEncodedStringToUnsignedChars(DFA174_minS);
    static final char[] DFA174_max = DFA.unpackEncodedStringToUnsignedChars(DFA174_maxS);
    static final short[] DFA174_accept = DFA.unpackEncodedString(DFA174_acceptS);
    static final short[] DFA174_special = DFA.unpackEncodedString(DFA174_specialS);
    static final short[][] DFA174_transition;

    static {
        int numStates = DFA174_transitionS.length;
        DFA174_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA174_transition[i] = DFA.unpackEncodedString(DFA174_transitionS[i]);
        }
    }

    class DFA174 extends DFA {

        public DFA174(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 174;
            this.eot = DFA174_eot;
            this.eof = DFA174_eof;
            this.min = DFA174_min;
            this.max = DFA174_max;
            this.accept = DFA174_accept;
            this.special = DFA174_special;
            this.transition = DFA174_transition;
        }
        public String getDescription() {
            return "605:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA180_eotS =
        "\114\uffff";
    static final String DFA180_eofS =
        "\114\uffff";
    static final String DFA180_minS =
        "\1\154\3\130\4\u00aa\12\153\2\u00b7\32\153\2\u00b7\20\153\1\130"+
        "\3\153\1\130\3\153\4\uffff";
    static final String DFA180_maxS =
        "\1\154\1\u013b\2\134\4\u00c6\12\153\2\u00b9\32\153\2\u00b9\20\153"+
        "\1\u013b\3\153\1\u013b\3\153\4\uffff";
    static final String DFA180_acceptS =
        "\110\uffff\1\3\1\1\1\4\1\2";
    static final String DFA180_specialS =
        "\114\uffff}>";
    static final String[] DFA180_transitionS = {
            "\1\1",
            "\1\5\4\4\u00dd\uffff\1\3\1\2",
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
            "\5\111\u00dd\uffff\1\111\1\110",
            "\1\100",
            "\1\100",
            "\1\100",
            "\5\113\u00dd\uffff\1\113\1\112",
            "\1\104",
            "\1\104",
            "\1\104",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA180_eot = DFA.unpackEncodedString(DFA180_eotS);
    static final short[] DFA180_eof = DFA.unpackEncodedString(DFA180_eofS);
    static final char[] DFA180_min = DFA.unpackEncodedStringToUnsignedChars(DFA180_minS);
    static final char[] DFA180_max = DFA.unpackEncodedStringToUnsignedChars(DFA180_maxS);
    static final short[] DFA180_accept = DFA.unpackEncodedString(DFA180_acceptS);
    static final short[] DFA180_special = DFA.unpackEncodedString(DFA180_specialS);
    static final short[][] DFA180_transition;

    static {
        int numStates = DFA180_transitionS.length;
        DFA180_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA180_transition[i] = DFA.unpackEncodedString(DFA180_transitionS[i]);
        }
    }

    class DFA180 extends DFA {

        public DFA180(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 180;
            this.eot = DFA180_eot;
            this.eof = DFA180_eof;
            this.min = DFA180_min;
            this.max = DFA180_max;
            this.accept = DFA180_accept;
            this.special = DFA180_special;
            this.transition = DFA180_transition;
        }
        public String getDescription() {
            return "624:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan436 = new BitSet(new long[]{0x0000000000000002L,0x003FC1C000020000L,0x000000000001F800L});
    public static final BitSet FOLLOW_statement_in_flightPlan439 = new BitSet(new long[]{0x0000000000000002L,0x0030000000020000L,0x000000000001F800L});
    public static final BitSet FOLLOW_defineCommand_in_define466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_defineCommand488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_103_in_defineCommand490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_104_in_defineCommand492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue511 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineCommandValue513 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue515 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_107_in_defineCommandValue521 = new BitSet(new long[]{0x0000000000000000L,0x0000040000020000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue528 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineCommandValue530 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue532 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue555 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineCommandValue557 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue561 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_defineCommandValue563 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue567 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_defineCommandValue569 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_107_in_defineCommandValue575 = new BitSet(new long[]{0x0000000000000000L,0x0000040000020000L});
    public static final BitSet FOLLOW_106_in_defineCommandValue577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue582 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineCommandValue584 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue588 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_defineCommandValue590 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue594 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_defineCommandValue596 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_110_in_defineSensor632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_111_in_defineSensor634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_112_in_defineSensor636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue655 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineSensorValue657 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue661 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_106_in_defineSensorValue665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_107_in_defineSensorValue667 = new BitSet(new long[]{0x0000000000000000L,0x0000040000020000L});
    public static final BitSet FOLLOW_106_in_defineSensorValue669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue674 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineSensorValue676 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue680 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_113_in_defineWaypoint711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_114_in_defineWaypoint713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_115_in_defineWaypoint715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue734 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineWaypointValue736 = new BitSet(new long[]{0x0000000000000000L,0x000010001F000000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue738 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_106_in_defineWaypointValue742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_107_in_defineWaypointValue744 = new BitSet(new long[]{0x0000000000000000L,0x0000040000020000L});
    public static final BitSet FOLLOW_106_in_defineWaypointValue746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue751 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defineWaypointValue753 = new BitSet(new long[]{0x0000000000000000L,0x000010001F000000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue755 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000020000L});
    public static final BitSet FOLLOW_command_in_statement782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_statement787 = new BitSet(new long[]{0x0000000000000000L,0x0F3000001E020000L,0x000000000001F800L});
    public static final BitSet FOLLOW_statement_in_statement789 = new BitSet(new long[]{0x0000000000000000L,0x0F3000001E020000L,0x000000000001F800L});
    public static final BitSet FOLLOW_repeat_in_statement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_statement797 = new BitSet(new long[]{0x0000000000000000L,0x0F3000001E020000L,0x000000000001F800L});
    public static final BitSet FOLLOW_condition_in_statement799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_repeat810 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_set_in_repeat812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_repeat821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_duration_in_repeat823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_repeat828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_repeat833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_condition844 = new BitSet(new long[]{0x0000000000000000L,0xB04610001FE20000L,0x00000000000007FFL,0xC100000000000000L,0x0C0000001FFFFFFFL});
    public static final BitSet FOLLOW_conditionValue_in_condition846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_condition851 = new BitSet(new long[]{0x0000000000000000L,0xB04610001FE20000L,0x00000000000007FFL,0xC100000000000000L,0x0C0000001FFFFFFFL});
    public static final BitSet FOLLOW_conditionValue_in_condition853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue865 = new BitSet(new long[]{0x0000000000000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue868 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue874 = new BitSet(new long[]{0x0000000000000000L,0x304000001E000000L});
    public static final BitSet FOLLOW_timeValue_in_conditionValue882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue888 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_conditionValue891 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue897 = new BitSet(new long[]{0x0000000000000000L,0x9000000000C00000L,0x0000000000000001L,0xC100000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_fixedDirection_in_conditionValue905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_conditionValue914 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue920 = new BitSet(new long[]{0x0000000000000000L,0x100000001F000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_speedValue_in_conditionValue928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_conditionValue937 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue943 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_conditionValue950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_conditionValue959 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue965 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_set_in_conditionValue981 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue987 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_angularValue_in_conditionValue994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue1000 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1003 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1009 = new BitSet(new long[]{0x0000000000000000L,0x100610001F020000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_waypoint_in_conditionValue1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_conditionValue1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_conditionValue1026 = new BitSet(new long[]{0x0000000000000000L,0x4000020000000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1032 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000000600L});
    public static final BitSet FOLLOW_altitudeValue_in_conditionValue1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_conditionValue1045 = new BitSet(new long[]{0x0000000000000000L,0x400002001F000000L});
    public static final BitSet FOLLOW_set_in_conditionValue1047 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_conditionValue1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flyCommand_in_command1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_flyCommand1094 = new BitSet(new long[]{0x0000000000000002L,0x900000001FDC0000L,0x00000000000C01E7L,0xE100200001F80000L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_140_in_flyCommand1096 = new BitSet(new long[]{0x0000000000000002L,0x900000001FDC0000L,0x00000000000C01E7L,0xE100200001F80000L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand1099 = new BitSet(new long[]{0x0000000000000002L,0x900000001FDC0000L,0x00000000000C01E7L,0xE100200001F80000L,0x00001FFFFFFFFFFFL});
    public static final BitSet FOLLOW_time_in_flyCommandValue1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue1156 = new BitSet(new long[]{0x0000000000000000L,0x100610001F020000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1158 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000000000L});
    public static final BitSet FOLLOW_106_in_flyCommandValue1162 = new BitSet(new long[]{0x0000000000000000L,0x100610001F020000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_107_in_flyCommandValue1164 = new BitSet(new long[]{0x0000000000000000L,0x100614001F020000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_106_in_flyCommandValue1166 = new BitSet(new long[]{0x0000000000000000L,0x100610001F020000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue1170 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_turnCommand1195 = new BitSet(new long[]{0x0000000000000002L,0x9000000000C00000L,0x0000000000000001L,0xC100000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_142_in_turnCommand1197 = new BitSet(new long[]{0x0000000000000002L,0x9000000000C00000L,0x0000000000000001L,0xC100000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand1200 = new BitSet(new long[]{0x0000000000000002L,0x9000000000C00000L,0x0000000000000001L,0xC100000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_direction_in_turnCommandValue1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_loiterCommand1234 = new BitSet(new long[]{0x0000000000000002L,0x900000001FDC0000L,0x00000C00002C01E7L,0xE100200001F80000L,0x0001FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_144_in_loiterCommand1236 = new BitSet(new long[]{0x0000000000000002L,0x900000001FDC0000L,0x00000C00002C01E7L,0xE100200001F80000L,0x0001FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand1239 = new BitSet(new long[]{0x0000000000000002L,0x900000001FDC0000L,0x00000C00002C01E7L,0xE100200001F80000L,0x0001FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_time_in_loiterCommandValue1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue1286 = new BitSet(new long[]{0x0000000000000000L,0x100610001F020000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1323 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_executeCommand1325 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1327 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_executeCommand1330 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1332 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_executeCommand1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pitch1367 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_134_in_pitch1369 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_pitch1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_146_in_pitch1394 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_147_in_pitch1396 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_pitch1399 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_roll1423 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_136_in_roll1425 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_angularValue_in_roll1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1470 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000E20600L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1472 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000E20600L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1474 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000E20600L});
    public static final BitSet FOLLOW_145_in_fixedAltitude1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_137_in_fixedAltitude1483 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000100600L});
    public static final BitSet FOLLOW_138_in_fixedAltitude1485 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000100600L});
    public static final BitSet FOLLOW_149_in_fixedAltitude1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_150_in_fixedAltitude1492 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000100600L});
    public static final BitSet FOLLOW_151_in_fixedAltitude1494 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000100600L});
    public static final BitSet FOLLOW_148_in_fixedAltitude1498 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000000600L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1525 = new BitSet(new long[]{0x0000000000000000L,0x100000001F200000L,0x0000000000000600L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003FFFF000000L});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pressureUnit1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pressureUnit1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pressureUnit1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_pressureUnit1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_pressureUnit1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_pressureUnit1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pressureUnit1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_pressureUnit1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_pressureUnit1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pressureUnit1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pressureUnit1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pressureUnit1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_pressureUnit1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_pressureUnit1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_pressureUnit1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_pressureUnit1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_pressureUnit1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_pressureUnit1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_radius1711 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000080000200000L});
    public static final BitSet FOLLOW_With_in_radius1713 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000080000200000L});
    public static final BitSet FOLLOW_149_in_radius1717 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_radius1721 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_radius1723 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_radius1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1751 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFFFF40000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_distanceUnit1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_distanceUnit1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_distanceUnit1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_distanceUnit1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_distanceUnit1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_distanceUnit1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_distanceUnit1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_distanceUnit1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_distanceUnit1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_distanceUnit1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_distanceUnit1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_183_in_distanceUnit1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_distanceUnit1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_distanceUnit1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_distanceUnit1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_183_in_distanceUnit1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_distanceUnit1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_distanceUnit1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_distanceUnit1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_distanceUnit1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_distanceUnit1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_distanceUnit1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_distanceUnit1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_distanceUnit1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_distanceUnit1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_distanceUnit1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_distanceUnit1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_distanceUnit1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_distanceUnit1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_distanceUnit1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_distanceUnit1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1983 = new BitSet(new long[]{0x0000000000000000L,0x100000001F000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_relativeSpeed2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_relativeSpeed2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_relativeSpeed2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed2068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_relativeSpeed2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFFFF40000000000L,0x000000000001FE7FL});
    public static final BitSet FOLLOW_speedUnit_in_speedValue2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_speedUnit2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_speedUnit2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_speedUnit2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_speedUnit2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_speedUnit2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_speedUnit2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_speedUnit2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_speedUnit2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_209_in_speedUnit2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x1FFFFFFC00080000L});
    public static final BitSet FOLLOW_210_in_speedUnit2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x1FFFFFFC00080000L});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed2196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_optimalSpeed2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_optimalSpeed2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_optimalUnit2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_optimalUnit2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_optimalUnit2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_optimalUnit2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_optimalUnit2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_optimalUnit2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed2272 = new BitSet(new long[]{0x0000000000000000L,0x100000001F080000L,0x0000000000000006L,0x0000000001F80000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_217_in_throttleSpeed2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_throttleSpeed2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_throttleSpeed2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_throttleSpeed2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time2320 = new BitSet(new long[]{0x0000000000000000L,0x304000001E000000L});
    public static final BitSet FOLLOW_timeValue_in_time2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_221_in_timeValue2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_timeValue2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_221_in_timeValue2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_timeValue2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_223_in_timeValue2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_timeValue2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_223_in_timeValue2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_timeValue2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_225_in_timeFormat2451 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_225_in_timeFormat2477 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_225_in_timeFormat2483 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_timeUnit2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_timeUnit2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_timeUnit2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_timeUnit2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_timeUnit2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_timeUnit2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_timeUnit2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_timeUnit2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_timeUnit2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_timeUnit2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_timeUnit2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_timeUnit2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_timeUnit2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_timeUnit2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_timeUnit2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_hour2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_hour2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_hour2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_hour2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_hour2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_minute2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_minute2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_minute2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_minute2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_second2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_second2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_second2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_second2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_second2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_duration2684 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_durationValue_in_duration2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x1FFFFFFC00080000L});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x001F000000000000L});
    public static final BitSet FOLLOW_hour_in_durationValue2715 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x1FFFFFFC00080000L});
    public static final BitSet FOLLOW_minute_in_durationValue2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x001F000000000000L});
    public static final BitSet FOLLOW_hour_in_durationValue2730 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00E0000000080000L});
    public static final BitSet FOLLOW_minute_in_durationValue2734 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x1FFFFFFC00080000L});
    public static final BitSet FOLLOW_second_in_durationValue2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00E0000000080000L});
    public static final BitSet FOLLOW_minute_in_durationValue2745 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x1FFFFFFC00080000L});
    public static final BitSet FOLLOW_second_in_durationValue2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2836 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0xC100000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2838 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0xC100000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00001F8000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00001F8000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2881 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_northSouthDirection2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_northSouthDirection2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_northSouthDirection2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_northSouthDirection2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_eastWestDirection2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_eastWestDirection2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_eastWestDirection2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_eastWestDirection2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_ordinalDirection2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_ordinalDirection2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_ordinalDirection3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_264_in_ordinalDirection3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_ordinalDirection3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_ordinalDirection3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_ordinalDirection3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_ordinalDirection3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_subOrdinalDirection3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_subOrdinalDirection3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_subOrdinalDirection3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_subOrdinalDirection3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_273_in_subOrdinalDirection3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_274_in_subOrdinalDirection3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_275_in_subOrdinalDirection3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_276_in_subOrdinalDirection3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_277_in_subOrdinalDirection3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_278_in_subOrdinalDirection3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_279_in_subOrdinalDirection3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_280_in_subOrdinalDirection3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_subOrdinalDirection3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_282_in_subOrdinalDirection3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_283_in_subOrdinalDirection3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_284_in_subOrdinalDirection3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection3205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0001E00000000000L});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_285_in_upDownDirection3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_286_in_upDownDirection3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_287_in_upDownDirection3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_288_in_upDownDirection3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_289_in_upDownDirection3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_290_in_upDownDirection3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_291_in_upDownDirection3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_upDownDirection3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_292_in_upDownDirection3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_293_in_upDownDirection3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_294_in_upDownDirection3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_295_in_leftRightDirection3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_296_in_leftRightDirection3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_297_in_leftRightDirection3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_298_in_leftRightDirection3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_299_in_leftRightDirection3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_300_in_leftRightDirection3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_301_in_clockDirection3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_302_in_clockDirection3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_303_in_clockDirection3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_304_in_clockDirection3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x001E000000000000L});
    public static final BitSet FOLLOW_305_in_angularValue3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_306_in_angularValue3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_307_in_angularValue3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_308_in_angularValue3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue3372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_237_in_angularValue3374 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_309_in_angularValue3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue3394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x03C0000000000000L});
    public static final BitSet FOLLOW_310_in_angularValue3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_311_in_angularValue3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_312_in_angularValue3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_313_in_angularValue3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xC100000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3487 = new BitSet(new long[]{0x0000000000000000L,0x000008001F000000L});
    public static final BitSet FOLLOW_107_in_latitudeLongitude3489 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xC100000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_314_in_latitudeLongitude3522 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3527 = new BitSet(new long[]{0x0000000000000000L,0x000008001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_107_in_latitudeLongitude3529 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_314_in_latitudeLongitude3532 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_315_in_latitudeLongitude3563 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3567 = new BitSet(new long[]{0x0000000000000000L,0x000008001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_107_in_latitudeLongitude3569 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_314_in_latitudeLongitude3572 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_314_in_latitudeLongitude3603 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3608 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_107_in_latitudeLongitude3610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_latitudeLongitude3613 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_315_in_latitudeLongitude3643 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3647 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_107_in_latitudeLongitude3649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_latitudeLongitude3652 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3711 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_314_in_distanceCoordinate3713 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3718 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_distanceCoordinate3720 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_314_in_distanceCoordinate3722 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3727 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_distanceCoordinate3757 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3761 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_distanceCoordinate3763 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_314_in_distanceCoordinate3765 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3770 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3798 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_314_in_distanceCoordinate3800 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3805 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_distanceCoordinate3807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_distanceCoordinate3809 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3813 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_distanceCoordinate3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_distanceCoordinate3843 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3847 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_distanceCoordinate3849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_315_in_distanceCoordinate3851 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3855 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_distanceCoordinate3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_316_in_percentValue3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_317_in_percentValue3938 = new BitSet(new long[]{0x0000000000000002L});

}