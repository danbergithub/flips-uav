// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g 2010-01-31 07:31:16

  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsAssembly extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'def'", "'define'", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'spd'", "'speed'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'¡'", "'deg'", "'degs'", "'degree'", "'degrees'", "'''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
    };
    public static final int DIRECTION=11;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=13;
    public static final int T__262=262;
    public static final int T__263=263;
    public static final int T__160=160;
    public static final int T__260=260;
    public static final int GEOCOORDINATE=30;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=64;
    public static final int T__264=264;
    public static final int FOOT=44;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
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
    public static final int T__255=255;
    public static final int KILOMETER=39;
    public static final int T__256=256;
    public static final int EQ=67;
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
    public static final int T__137=137;
    public static final int GE=72;
    public static final int T__136=136;
    public static final int YARD=43;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int DURATION=27;
    public static final int With=76;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int CRUISE=57;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=91;
    public static final int T__129=129;
    public static final int OPTIMAL=21;
    public static final int BinaryLiteral=81;
    public static final int THROTTLE=22;
    public static final int BinaryDigit=88;
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
    public static final int TURN=12;
    public static final int DEGREE=36;
    public static final int PASCAL=54;
    public static final int FLY=8;
    public static final int T__200=200;
    public static final int SLOWER=20;
    public static final int T__201=201;
    public static final int PM=25;
    public static final int LONGITUDE=32;
    public static final int PRESSURE=51;
    public static final int MILE=42;
    public static final int Exponent=90;
    public static final int LineComment=93;
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
    public static final int T__190=190;
    public static final int SPEED=18;
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
    public static final int FLIGHTPLAN=4;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int Turning=78;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=52;
    public static final int T__176=176;
    public static final int CLOCKWISE=47;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=9;
    public static final int MAXIMUM=56;
    public static final int MINUTE=34;
    public static final int T__169=169;
    public static final int BAR=58;
    public static final int LE=71;

    // delegates
    // delegators


        public flipsAssembly(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsAssembly(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return flipsAssembly.tokenNames; }
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g"; }


      HashMap<String,Integer> commands = new HashMap<String,Integer>();
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:103:1: flightPlan : ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final void flightPlan() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:104:2: ( ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:104:4: ^( FLIGHTPLAN ( define )* ( command )* )
            {
            match(input,FLIGHTPLAN,FOLLOW_FLIGHTPLAN_in_flightPlan63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:104:17: ( define )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DEFINE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:104:17: define
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

                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:104:25: ( command )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=FLY && LA2_0<=EXECUTE)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:104:25: command
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:108:1: define : ( defineCommand | defineWaypoint );
    public final void define() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:109:2: ( defineCommand | defineWaypoint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DEFINE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==Identifier) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==COMMAND) ) {
                            alt3=1;
                        }
                        else if ( (LA3_3==GEOCOORDINATE) ) {
                            alt3=2;
                        }
                        else {
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:109:4: defineCommand
                    {
                    pushFollow(FOLLOW_defineCommand_in_define81);
                    defineCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:110:4: defineWaypoint
                    {
                    pushFollow(FOLLOW_defineWaypoint_in_define86);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:113:1: defineCommand : ^( DEFINE name= Identifier ^( COMMAND x= integerValue ) ) ;
    public final void defineCommand() throws RecognitionException {
        CommonTree name=null;
        int x = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:114:2: ( ^( DEFINE name= Identifier ^( COMMAND x= integerValue ) ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:114:4: ^( DEFINE name= Identifier ^( COMMAND x= integerValue ) )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_defineCommand98); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineCommand102); 
            match(input,COMMAND,FOLLOW_COMMAND_in_defineCommand105); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_integerValue_in_defineCommand109);
            x=integerValue();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            addCommand(name.getText(),x);

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


    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:118:1: defineWaypoint : ^( DEFINE name= Identifier geo= geoCoordinate ) ;
    public final void defineWaypoint() throws RecognitionException {
        CommonTree name=null;
        flipsAssembly.geoCoordinate_return geo = null;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:119:2: ( ^( DEFINE name= Identifier geo= geoCoordinate ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:119:4: ^( DEFINE name= Identifier geo= geoCoordinate )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_defineWaypoint127); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_defineWaypoint131); 
            pushFollow(FOLLOW_geoCoordinate_in_defineWaypoint135);
            geo=geoCoordinate();

            state._fsp--;


            match(input, Token.UP, null); 
            addWaypoint(name.getText(),geo.latitude,geo.longitude);

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:125:1: command : ( flyCommand | loiterCommand | executeCommand );
    public final void command() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:126:2: ( flyCommand | loiterCommand | executeCommand )
            int alt4=3;
            switch ( input.LA(1) ) {
            case FLY:
                {
                alt4=1;
                }
                break;
            case LOITER:
                {
                alt4=2;
                }
                break;
            case EXECUTE:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:126:4: flyCommand
                    {
                    pushFollow(FOLLOW_flyCommand_in_command153);
                    flyCommand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:127:4: loiterCommand
                    {
                    pushFollow(FOLLOW_loiterCommand_in_command158);
                    loiterCommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:128:4: executeCommand
                    {
                    pushFollow(FOLLOW_executeCommand_in_command163);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:133:1: flyCommand : ^( FLY ( flyCommandValue )* ) ;
    public final void flyCommand() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:134:2: ( ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:134:4: ^( FLY ( flyCommandValue )* )
            {
            match(input,FLY,FOLLOW_FLY_in_flyCommand177); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:134:10: ( flyCommandValue )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==DIRECTION||(LA5_0>=ROLL && LA5_0<=SPEED)||LA5_0==TIME||LA5_0==DURATION||(LA5_0>=WAYPOINT && LA5_0<=GEOCOORDINATE)||LA5_0==DISTANCE) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:134:10: flyCommandValue
                	    {
                	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand179);
                	    flyCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop5;
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:138:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude );
    public final void flyCommandValue() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:139:2: ( time | direction | speed | distance | pitch | roll | duration | waypoint | altitude )
            int alt6=9;
            switch ( input.LA(1) ) {
            case TIME:
                {
                alt6=1;
                }
                break;
            case DIRECTION:
                {
                alt6=2;
                }
                break;
            case SPEED:
                {
                alt6=3;
                }
                break;
            case DISTANCE:
                {
                alt6=4;
                }
                break;
            case PITCH:
                {
                alt6=5;
                }
                break;
            case ROLL:
                {
                alt6=6;
                }
                break;
            case DURATION:
                {
                alt6=7;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt6=8;
                }
                break;
            case ALTITUDE:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:139:4: time
                    {
                    pushFollow(FOLLOW_time_in_flyCommandValue196);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:140:4: direction
                    {
                    pushFollow(FOLLOW_direction_in_flyCommandValue201);
                    direction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:141:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_flyCommandValue206);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:142:4: distance
                    {
                    pushFollow(FOLLOW_distance_in_flyCommandValue211);
                    distance();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:143:4: pitch
                    {
                    pushFollow(FOLLOW_pitch_in_flyCommandValue216);
                    pitch();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:144:4: roll
                    {
                    pushFollow(FOLLOW_roll_in_flyCommandValue221);
                    roll();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:145:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_flyCommandValue226);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:146:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_flyCommandValue231);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:147:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_flyCommandValue236);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:150:1: loiterCommand : ^( LOITER ( loiterCommandValue )* ) ;
    public final void loiterCommand() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:151:2: ( ^( LOITER ( loiterCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:151:4: ^( LOITER ( loiterCommandValue )* )
            {
            match(input,LOITER,FOLLOW_LOITER_in_loiterCommand248); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:151:13: ( loiterCommandValue )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==DIRECTION||(LA7_0>=ALTITUDE && LA7_0<=SPEED)||LA7_0==TIME||(LA7_0>=DURATION && LA7_0<=GEOCOORDINATE)) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:151:13: loiterCommandValue
                	    {
                	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand250);
                	    loiterCommandValue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop7;
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:155:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | waypoint | altitude );
    public final void loiterCommandValue() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:156:2: ( time | speed | loiterDirection | radius | duration | waypoint | altitude )
            int alt8=7;
            switch ( input.LA(1) ) {
            case TIME:
                {
                alt8=1;
                }
                break;
            case SPEED:
                {
                alt8=2;
                }
                break;
            case DIRECTION:
                {
                alt8=3;
                }
                break;
            case RADIUS:
                {
                alt8=4;
                }
                break;
            case DURATION:
                {
                alt8=5;
                }
                break;
            case WAYPOINT:
            case GEOCOORDINATE:
                {
                alt8=6;
                }
                break;
            case ALTITUDE:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:156:4: time
                    {
                    pushFollow(FOLLOW_time_in_loiterCommandValue267);
                    time();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:157:4: speed
                    {
                    pushFollow(FOLLOW_speed_in_loiterCommandValue272);
                    speed();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:158:4: loiterDirection
                    {
                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue277);
                    loiterDirection();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:159:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_loiterCommandValue282);
                    radius();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:160:4: duration
                    {
                    pushFollow(FOLLOW_duration_in_loiterCommandValue287);
                    duration();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:161:4: waypoint
                    {
                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue292);
                    waypoint();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:162:4: altitude
                    {
                    pushFollow(FOLLOW_altitude_in_loiterCommandValue297);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:165:1: executeCommand : ^( EXECUTE x= Identifier ) ;
    public final void executeCommand() throws RecognitionException {
        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:166:2: ( ^( EXECUTE x= Identifier ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:166:4: ^( EXECUTE x= Identifier )
            {
            match(input,EXECUTE,FOLLOW_EXECUTE_in_executeCommand309); 

            match(input, Token.DOWN, null); 
            x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_executeCommand313); 

            match(input, Token.UP, null); 

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
        return ;
    }
    // $ANTLR end "executeCommand"


    // $ANTLR start "pitch"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:181:1: pitch : ^( PITCH x= convertAngle ) ;
    public final void pitch() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:182:2: ( ^( PITCH x= convertAngle ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:182:4: ^( PITCH x= convertAngle )
            {
            match(input,PITCH,FOLLOW_PITCH_in_pitch331); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertAngle_in_pitch335);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:186:1: roll : ^( ROLL x= convertAngle ) ;
    public final void roll() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:187:2: ( ^( ROLL x= convertAngle ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:187:4: ^( ROLL x= convertAngle )
            {
            match(input,ROLL,FOLLOW_ROLL_in_roll352); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertAngle_in_roll356);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:193:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );
    public final void altitude() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:194:2: ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:194:4: ^( ALTITUDE FIXED DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude375); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude377); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude379); 
                    pushFollow(FOLLOW_convertDistance_in_altitude383);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:196:4: ^( ALTITUDE FIXED PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude394); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude396); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude398); 
                    pushFollow(FOLLOW_convertPressure_in_altitude402);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE FIX " + y, y + " kPa Pressure Altitude");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:198:4: ^( ALTITUDE FIXED x= convertFlightLevel )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude413); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_altitude415); 
                    pushFollow(FOLLOW_convertFlightLevel_in_altitude419);
                    x=convertFlightLevel();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z FIX " + -x, mToft(x) + "Altitude");

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:200:4: ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude430); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude432); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude434); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude436); 
                    pushFollow(FOLLOW_convertDistance_in_altitude440);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + -x, mToft(x) + "Relative Altitude");

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:202:4: ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude451); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude453); 
                    match(input,CLIMB,FOLLOW_CLIMB_in_altitude455); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude457); 
                    pushFollow(FOLLOW_convertPressure_in_altitude461);
                    y=convertPressure();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS PRE REL " + -y, -y + " kPa Relative Pressure Altitude");

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:204:4: ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude472); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude474); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude476); 
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_altitude478); 
                    pushFollow(FOLLOW_convertDistance_in_altitude482);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Z REL " + x, mToft(-x) + "Relative Altitude");

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:206:4: ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure )
                    {
                    match(input,ALTITUDE,FOLLOW_ALTITUDE_in_altitude493); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_altitude495); 
                    match(input,DESCEND,FOLLOW_DESCEND_in_altitude497); 
                    match(input,PRESSURE,FOLLOW_PRESSURE_in_altitude499); 
                    pushFollow(FOLLOW_convertPressure_in_altitude503);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:212:1: distance : ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) );
    public final void distance() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:213:2: ( ^( DISTANCE x= convertDistance ) | ^( DISTANCE LEFT x= convertDistance ) | ^( DISTANCE RIGHT x= convertDistance ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DISTANCE) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case LEFT:
                        {
                        alt10=2;
                        }
                        break;
                    case RIGHT:
                        {
                        alt10=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt10=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:213:4: ^( DISTANCE x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance522); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertDistance_in_distance526);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   X REL " + x, mToft(x) + "Relative Distance");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:215:4: ^( DISTANCE LEFT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance537); 

                    match(input, Token.DOWN, null); 
                    match(input,LEFT,FOLLOW_LEFT_in_distance539); 
                    pushFollow(FOLLOW_convertDistance_in_distance543);
                    x=convertDistance();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS   Y REL " + -x, mToft(-x) + "Relative Left Distance");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:217:4: ^( DISTANCE RIGHT x= convertDistance )
                    {
                    match(input,DISTANCE,FOLLOW_DISTANCE_in_distance554); 

                    match(input, Token.DOWN, null); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_distance556); 
                    pushFollow(FOLLOW_convertDistance_in_distance560);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:221:1: radius : ^( RADIUS x= convertDistance ) ;
    public final void radius() throws RecognitionException {
        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:222:2: ( ^( RADIUS x= convertDistance ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:222:4: ^( RADIUS x= convertDistance )
            {
            match(input,RADIUS,FOLLOW_RADIUS_in_radius577); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertDistance_in_radius581);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:228:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) );
    public final void speed() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:229:2: ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) )
            int alt11=9;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:229:4: ^( SPEED FIXED x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed600); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_speed602); 
                    pushFollow(FOLLOW_convertSpeed_in_speed606);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR FIX " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Air Speed");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:231:4: ^( SPEED RELATIVE FASTER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed617); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed619); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed621); 
                    pushFollow(FOLLOW_convertSpeed_in_speed625);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + x, x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:233:4: ^( SPEED RELATIVE SLOWER x= convertSpeed )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed636); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed638); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed640); 
                    pushFollow(FOLLOW_convertSpeed_in_speed644);
                    x=convertSpeed();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("SPD AIR REL " + -x, -x + " m/s (" + (Math.round(x / 1609.344 * 3600 * 100) / 100f) + " mph) Relative Air Speed");

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:235:4: ^( SPEED RELATIVE FASTER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed655); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed657); 
                    match(input,FASTER,FOLLOW_FASTER_in_speed659); 
                    pushFollow(FOLLOW_percentValue_in_speed663);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:236:4: ^( SPEED RELATIVE SLOWER x= percentValue )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed670); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_speed672); 
                    match(input,SLOWER,FOLLOW_SLOWER_in_speed674); 
                    pushFollow(FOLLOW_percentValue_in_speed678);
                    x=percentValue();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:237:4: ^( SPEED OPTIMAL MINIMUM )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed685); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed687); 
                    match(input,MINIMUM,FOLLOW_MINIMUM_in_speed689); 

                    match(input, Token.UP, null); 
                    emit("SPD AIR OPT MIN", "Minimum Air Speed");

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:239:4: ^( SPEED OPTIMAL CRUISE )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed700); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed702); 
                    match(input,CRUISE,FOLLOW_CRUISE_in_speed704); 

                    match(input, Token.UP, null); 
                    emit("SPD AIR OPT CRU", "Cruise Air Speed");

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:241:4: ^( SPEED OPTIMAL MAXIMUM )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed715); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTIMAL,FOLLOW_OPTIMAL_in_speed717); 
                    match(input,MAXIMUM,FOLLOW_MAXIMUM_in_speed719); 

                    match(input, Token.UP, null); 
                    emit("SPD AIR OPT MAX", "Maximum Air Speed");

                    }
                    break;
                case 9 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:243:4: ^( SPEED THROTTLE y= convertThrottle )
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_speed730); 

                    match(input, Token.DOWN, null); 
                    match(input,THROTTLE,FOLLOW_THROTTLE_in_speed732); 
                    pushFollow(FOLLOW_convertThrottle_in_speed736);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:249:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );
    public final void time() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:250:2: ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:250:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time755); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time759);
                    x=convertTime();

                    state._fsp--;

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:250:25: (y= convertTime (z= convertTime )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=FloatingPointLiteral && LA13_0<=HexLiteral)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:250:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time764);
                            y=convertTime();

                            state._fsp--;

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:250:40: (z= convertTime )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( ((LA12_0>=FloatingPointLiteral && LA12_0<=HexLiteral)) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:250:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time769);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,AM,FOLLOW_AM_in_time775); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z), (x + y + z) + " s (" + sToHHMMSS(x + y + z) + " AM) Time");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:253:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time790); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time794);
                    x=convertTime();

                    state._fsp--;

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:253:25: (y= convertTime (z= convertTime )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=FloatingPointLiteral && LA15_0<=HexLiteral)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:253:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time799);
                            y=convertTime();

                            state._fsp--;

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:253:40: (z= convertTime )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0>=FloatingPointLiteral && LA14_0<=HexLiteral)) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:253:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time804);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,PM,FOLLOW_PM_in_time810); 

                    match(input, Token.UP, null); 
                    x = (x == 43200d) ? 0d : x;
                    emit("TIM FIX " + (x + y + z + 43200d), (x + y + z + 43200d) + " s (" + sToHHMMSS(x + y + z) + " PM) Time");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:256:4: ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time825); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertTime_in_time829);
                    x=convertTime();

                    state._fsp--;

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:256:25: (y= convertTime (z= convertTime )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=FloatingPointLiteral && LA17_0<=HexLiteral)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:256:26: y= convertTime (z= convertTime )?
                            {
                            pushFollow(FOLLOW_convertTime_in_time834);
                            y=convertTime();

                            state._fsp--;

                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:256:40: (z= convertTime )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( ((LA16_0>=FloatingPointLiteral && LA16_0<=HexLiteral)) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:256:41: z= convertTime
                                    {
                                    pushFollow(FOLLOW_convertTime_in_time839);
                                    z=convertTime();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,HOUR24,FOLLOW_HOUR24_in_time845); 

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:260:1: duration : ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) ;
    public final void duration() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;

        double z = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:2: ( ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:4: ^( DURATION x= convertTime (y= convertTime (z= convertTime )? )? )
            {
            match(input,DURATION,FOLLOW_DURATION_in_duration862); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_convertTime_in_duration866);
            x=convertTime();

            state._fsp--;

            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:29: (y= convertTime (z= convertTime )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=FloatingPointLiteral && LA20_0<=HexLiteral)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:30: y= convertTime (z= convertTime )?
                    {
                    pushFollow(FOLLOW_convertTime_in_duration871);
                    y=convertTime();

                    state._fsp--;

                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:44: (z= convertTime )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=FloatingPointLiteral && LA19_0<=HexLiteral)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:261:45: z= convertTime
                            {
                            pushFollow(FOLLOW_convertTime_in_duration876);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:267:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );
    public final void direction() throws RecognitionException {
        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:268:2: ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:268:4: ^( DIRECTION FIXED x= convertCardinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction899); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction901); 
                    pushFollow(FOLLOW_convertCardinalDirection_in_direction905);
                    x=convertCardinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:270:4: ^( DIRECTION FIXED x= convertOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction916); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction918); 
                    pushFollow(FOLLOW_convertOrdinalDirection_in_direction922);
                    x=convertOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:272:4: ^( DIRECTION FIXED x= convertSubOrdinalDirection )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction933); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction935); 
                    pushFollow(FOLLOW_convertSubOrdinalDirection_in_direction939);
                    x=convertSubOrdinalDirection();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + x, x + " deg Heading");

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:274:4: ^( DIRECTION FIXED y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction950); 

                    match(input, Token.DOWN, null); 
                    match(input,FIXED,FOLLOW_FIXED_in_direction952); 
                    pushFollow(FOLLOW_convertAngle_in_direction956);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW FIX " + y, y + " deg Heading");

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:276:4: ^( DIRECTION RELATIVE LEFT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction967); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction969); 
                    match(input,LEFT,FOLLOW_LEFT_in_direction971); 
                    pushFollow(FOLLOW_convertAngle_in_direction975);
                    y=convertAngle();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    emit("POS YAW REL " + -y, -y + " deg Yaw");

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:278:4: ^( DIRECTION RELATIVE RIGHT y= convertAngle )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_direction986); 

                    match(input, Token.DOWN, null); 
                    match(input,RELATIVE,FOLLOW_RELATIVE_in_direction988); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_direction990); 
                    pushFollow(FOLLOW_convertAngle_in_direction994);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:282:1: turnDirection : ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) );
    public final void turnDirection() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:283:2: ( ^( DIRECTION TURN LEFT ) | ^( DIRECTION TURN RIGHT ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DIRECTION) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==TURN) ) {
                        int LA22_3 = input.LA(4);

                        if ( (LA22_3==LEFT) ) {
                            alt22=1;
                        }
                        else if ( (LA22_3==RIGHT) ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 3, input);

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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:283:4: ^( DIRECTION TURN LEFT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1011); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1013); 
                    match(input,LEFT,FOLLOW_LEFT_in_turnDirection1015); 

                    match(input, Token.UP, null); 
                    emit("DIR L", "Left Turn Direction");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:285:4: ^( DIRECTION TURN RIGHT )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_turnDirection1026); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_turnDirection1028); 
                    match(input,RIGHT,FOLLOW_RIGHT_in_turnDirection1030); 

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:289:1: loiterDirection : ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) );
    public final void loiterDirection() throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:290:2: ( ^( DIRECTION TURN CLOCKWISE ) | ^( DIRECTION TURN COUNTERCLOCKWISE ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DIRECTION) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==TURN) ) {
                        int LA23_3 = input.LA(4);

                        if ( (LA23_3==CLOCKWISE) ) {
                            alt23=1;
                        }
                        else if ( (LA23_3==COUNTERCLOCKWISE) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:290:4: ^( DIRECTION TURN CLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1047); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1049); 
                    match(input,CLOCKWISE,FOLLOW_CLOCKWISE_in_loiterDirection1051); 

                    match(input, Token.UP, null); 
                    emit("DIR CW", "Clockwise Loiter Direction");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:292:4: ^( DIRECTION TURN COUNTERCLOCKWISE )
                    {
                    match(input,DIRECTION,FOLLOW_DIRECTION_in_loiterDirection1062); 

                    match(input, Token.DOWN, null); 
                    match(input,TURN,FOLLOW_TURN_in_loiterDirection1064); 
                    match(input,COUNTERCLOCKWISE,FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1066); 

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:298:1: waypoint : (geo= geoCoordinate | ^( WAYPOINT x= Identifier ) );
    public final void waypoint() throws RecognitionException {
        CommonTree x=null;
        flipsAssembly.geoCoordinate_return geo = null;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:299:2: (geo= geoCoordinate | ^( WAYPOINT x= Identifier ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GEOCOORDINATE) ) {
                alt24=1;
            }
            else if ( (LA24_0==WAYPOINT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:299:4: geo= geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1086);
                    geo=geoCoordinate();

                    state._fsp--;

                    String ns = geo.latitude >= 0 ? "N" : "S";
                    String ew = geo.longitude >= 0 ? "E" : "W";
                    emit("POS   X FIX " + geo.longitude, Math.abs(geo.longitude) + " " + ew + " Longitude");
                    emit("POS   Y FIX " + geo.latitude, Math.abs(geo.latitude) + " " + ns + " Latitude");

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:304:4: ^( WAYPOINT x= Identifier )
                    {
                    match(input,WAYPOINT,FOLLOW_WAYPOINT_in_waypoint1108); 

                    match(input, Token.DOWN, null); 
                    x=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_waypoint1112); 

                    match(input, Token.UP, null); 

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
        return ;
    }
    // $ANTLR end "waypoint"

    public static class geoCoordinate_return extends TreeRuleReturnScope {
        public double latitude;
        public double longitude;
    };

    // $ANTLR start "geoCoordinate"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:320:1: geoCoordinate returns [double latitude, double longitude] : ^( GEOCOORDINATE x= latitude y= longitude ) ;
    public final flipsAssembly.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsAssembly.geoCoordinate_return retval = new flipsAssembly.geoCoordinate_return();
        retval.start = input.LT(1);

        double x = 0.0;

        double y = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:321:2: ( ^( GEOCOORDINATE x= latitude y= longitude ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:321:4: ^( GEOCOORDINATE x= latitude y= longitude )
            {
            match(input,GEOCOORDINATE,FOLLOW_GEOCOORDINATE_in_geoCoordinate1132); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_latitude_in_geoCoordinate1136);
            x=latitude();

            state._fsp--;

            pushFollow(FOLLOW_longitude_in_geoCoordinate1140);
            y=longitude();

            state._fsp--;


            match(input, Token.UP, null); 
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
    // $ANTLR end "geoCoordinate"


    // $ANTLR start "latitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:326:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );
    public final double latitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:327:2: ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:327:4: ^( LATITUDE x= convertAngle NORTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1165); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1169);
                    x=convertAngle();

                    state._fsp--;

                    match(input,NORTH,FOLLOW_NORTH_in_latitude1171); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:329:4: ^( LATITUDE x= convertAngle SOUTH )
                    {
                    match(input,LATITUDE,FOLLOW_LATITUDE_in_latitude1182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_latitude1186);
                    x=convertAngle();

                    state._fsp--;

                    match(input,SOUTH,FOLLOW_SOUTH_in_latitude1188); 

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:333:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );
    public final double longitude() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:334:2: ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:334:4: ^( LONGITUDE x= convertAngle EAST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1209); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1213);
                    x=convertAngle();

                    state._fsp--;

                    match(input,EAST,FOLLOW_EAST_in_longitude1215); 

                    match(input, Token.UP, null); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:336:4: ^( LONGITUDE x= convertAngle WEST )
                    {
                    match(input,LONGITUDE,FOLLOW_LONGITUDE_in_longitude1226); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_convertAngle_in_longitude1230);
                    x=convertAngle();

                    state._fsp--;

                    match(input,WEST,FOLLOW_WEST_in_longitude1232); 

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


    // $ANTLR start "convertTime"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:343:1: convertTime returns [double r] : (x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND );
    public final double convertTime() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:344:2: (x= numericValue HOUR | x= numericValue MINUTE | x= numericValue SECOND )
            int alt27=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                switch ( input.LA(2) ) {
                case HOUR:
                    {
                    alt27=1;
                    }
                    break;
                case MINUTE:
                    {
                    alt27=2;
                    }
                    break;
                case SECOND:
                    {
                    alt27=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

                }
                break;
            case OctalLiteral:
                {
                switch ( input.LA(2) ) {
                case SECOND:
                    {
                    alt27=3;
                    }
                    break;
                case HOUR:
                    {
                    alt27=1;
                    }
                    break;
                case MINUTE:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }

                }
                break;
            case DecimalLiteral:
                {
                switch ( input.LA(2) ) {
                case SECOND:
                    {
                    alt27=3;
                    }
                    break;
                case HOUR:
                    {
                    alt27=1;
                    }
                    break;
                case MINUTE:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }

                }
                break;
            case HexLiteral:
                {
                switch ( input.LA(2) ) {
                case MINUTE:
                    {
                    alt27=2;
                    }
                    break;
                case SECOND:
                    {
                    alt27=3;
                    }
                    break;
                case HOUR:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }

                }
                break;
            case FloatingPointLiteral:
                {
                switch ( input.LA(2) ) {
                case SECOND:
                    {
                    alt27=3;
                    }
                    break;
                case HOUR:
                    {
                    alt27=1;
                    }
                    break;
                case MINUTE:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:344:4: x= numericValue HOUR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1257);
                    x=numericValue();

                    state._fsp--;

                    match(input,HOUR,FOLLOW_HOUR_in_convertTime1259); 
                    r = x * 3600d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:346:4: x= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1270);
                    x=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertTime1272); 
                    r = x * 60d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:348:4: x= numericValue SECOND
                    {
                    pushFollow(FOLLOW_numericValue_in_convertTime1283);
                    x=numericValue();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertTime1285); 
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
        return r;
    }
    // $ANTLR end "convertTime"


    // $ANTLR start "convertDistance"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:353:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );
    public final double convertDistance() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:354:2: (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT )
            int alt28=6;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:354:4: x= numericValue KILOMETER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1307);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistance1309); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:356:4: x= numericValue METER
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1320);
                    x=numericValue();

                    state._fsp--;

                    match(input,METER,FOLLOW_METER_in_convertDistance1322); 
                    r = x;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:358:4: x= numericValue NAUTICAL MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1333);
                    x=numericValue();

                    state._fsp--;

                    match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistance1335); 
                    match(input,MILE,FOLLOW_MILE_in_convertDistance1337); 
                    r = x * 1852d;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:360:4: x= numericValue MILE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1348);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILE,FOLLOW_MILE_in_convertDistance1350); 
                    r = x * 1609.344d;

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:362:4: x= numericValue YARD
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1361);
                    x=numericValue();

                    state._fsp--;

                    match(input,YARD,FOLLOW_YARD_in_convertDistance1363); 
                    r = x * 0.9144d;

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:364:4: x= numericValue FOOT
                    {
                    pushFollow(FOLLOW_numericValue_in_convertDistance1374);
                    x=numericValue();

                    state._fsp--;

                    match(input,FOOT,FOLLOW_FOOT_in_convertDistance1376); 
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
        return r;
    }
    // $ANTLR end "convertDistance"


    // $ANTLR start "convertFlightLevel"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:369:1: convertFlightLevel returns [double r] : FLIGHTLEVEL x= FlightLevel ;
    public final double convertFlightLevel() throws RecognitionException {
        double r = 0.0;

        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:370:2: ( FLIGHTLEVEL x= FlightLevel )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:370:4: FLIGHTLEVEL x= FlightLevel
            {
            match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1396); 
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel1400); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:376:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );
    public final double convertPressure() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:377:2: (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE )
            int alt29=6;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:377:4: x= numericValue KILOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1426);
                    x=numericValue();

                    state._fsp--;

                    match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressure1428); 
                    r = x * 1000d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:379:4: x= numericValue HECTOPASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1439);
                    x=numericValue();

                    state._fsp--;

                    match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressure1441); 
                    r = x * 100d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:381:4: x= numericValue PASCAL
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1452);
                    x=numericValue();

                    state._fsp--;

                    match(input,PASCAL,FOLLOW_PASCAL_in_convertPressure1454); 
                    r = x;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:383:4: x= numericValue BAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1465);
                    x=numericValue();

                    state._fsp--;

                    match(input,BAR,FOLLOW_BAR_in_convertPressure1467); 
                    r = x * 100000d;

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:385:4: x= numericValue MILLIBAR
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1478);
                    x=numericValue();

                    state._fsp--;

                    match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressure1480); 
                    r = x * 100d;

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:387:4: x= numericValue ATMOSPHERE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertPressure1491);
                    x=numericValue();

                    state._fsp--;

                    match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressure1493); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:392:1: convertSpeed returns [double r] : (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND );
    public final double convertSpeed() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:393:2: (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:393:4: x= convertDistance HOUR
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1515);
                    x=convertDistance();

                    state._fsp--;

                    match(input,HOUR,FOLLOW_HOUR_in_convertSpeed1517); 
                    r = x / 3600d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:395:4: x= convertDistance MINUTE
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1528);
                    x=convertDistance();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertSpeed1530); 
                    r = x / 60d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:397:4: x= convertDistance SECOND
                    {
                    pushFollow(FOLLOW_convertDistance_in_convertSpeed1541);
                    x=convertDistance();

                    state._fsp--;

                    match(input,SECOND,FOLLOW_SECOND_in_convertSpeed1543); 
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
        return r;
    }
    // $ANTLR end "convertSpeed"


    // $ANTLR start "convertThrottle"
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:402:1: convertThrottle returns [double r] : x= percentValue ;
    public final double convertThrottle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:403:2: (x= percentValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:403:4: x= percentValue
            {
            pushFollow(FOLLOW_percentValue_in_convertThrottle1565);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:408:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE min= numericValue MINUTE | x= numericValue RADIAN );
    public final double convertAngle() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;

        int deg = 0;

        double min = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:409:2: (x= numericValue DEGREE | deg= integerValue DEGREE min= numericValue MINUTE | x= numericValue RADIAN )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:409:4: x= numericValue DEGREE
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle1587);
                    x=numericValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1589); 
                    r = x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:411:4: deg= integerValue DEGREE min= numericValue MINUTE
                    {
                    pushFollow(FOLLOW_integerValue_in_convertAngle1600);
                    deg=integerValue();

                    state._fsp--;

                    match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1602); 
                    pushFollow(FOLLOW_numericValue_in_convertAngle1606);
                    min=numericValue();

                    state._fsp--;

                    match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1608); 
                    r = deg + min/60d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:413:4: x= numericValue RADIAN
                    {
                    pushFollow(FOLLOW_numericValue_in_convertAngle1619);
                    x=numericValue();

                    state._fsp--;

                    match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle1621); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:418:1: convertCardinalDirection returns [double r] : ( NORTH | EAST | SOUTH | WEST );
    public final double convertCardinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:419:2: ( NORTH | EAST | SOUTH | WEST )
            int alt32=4;
            switch ( input.LA(1) ) {
            case NORTH:
                {
                alt32=1;
                }
                break;
            case EAST:
                {
                alt32=2;
                }
                break;
            case SOUTH:
                {
                alt32=3;
                }
                break;
            case WEST:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:419:4: NORTH
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertCardinalDirection1641); 
                    r = 0d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:421:4: EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertCardinalDirection1650); 
                    r = 90d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:423:4: SOUTH
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertCardinalDirection1659); 
                    r = 180d;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:425:4: WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertCardinalDirection1668); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:430:1: convertOrdinalDirection returns [double r] : ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST );
    public final double convertOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:431:2: ( NORTH EAST | SOUTH EAST | SOUTH WEST | NORTH WEST )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NORTH) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EAST) ) {
                    alt33=1;
                }
                else if ( (LA33_1==WEST) ) {
                    alt33=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==SOUTH) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EAST) ) {
                    alt33=2;
                }
                else if ( (LA33_2==WEST) ) {
                    alt33=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:431:4: NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection1688); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection1690); 
                    r = 45d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:433:4: SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection1699); 
                    match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection1701); 
                    r = 135d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:435:4: SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection1710); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection1712); 
                    r = 225d;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:437:4: NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection1721); 
                    match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection1723); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:442:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );
    public final double convertSubOrdinalDirection() throws RecognitionException {
        double r = 0.0;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:443:2: ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST )
            int alt34=8;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:443:4: NORTH NORTH EAST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1743); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1745); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1747); 
                    r = 22.5d;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:445:4: EAST NORTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1756); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1758); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1760); 
                    r = 67.5d;

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:447:4: EAST SOUTH EAST
                    {
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1769); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1771); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1773); 
                    r = 112.5d;

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:449:4: SOUTH SOUTH EAST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1782); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1784); 
                    match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection1786); 
                    r = 157.5d;

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:451:4: SOUTH SOUTH WEST
                    {
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1795); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1797); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1799); 
                    r = 202.5d;

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:453:4: WEST SOUTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1808); 
                    match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection1810); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1812); 
                    r = 247.5d;

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:455:4: WEST NORTH WEST
                    {
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1821); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1823); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1825); 
                    r = 292.5d;

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:457:4: NORTH NORTH WEST
                    {
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1834); 
                    match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection1836); 
                    match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection1838); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:461:1: convertDirection[double r] : ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) );
    public final void convertDirection(double r) throws RecognitionException {
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:462:2: ( ( CLIMB | RIGHT | CLOCKWISE ) | ( DESCEND | LEFT | COUNTERCLOCKWISE ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:467:1: numericValue returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final double numericValue() throws RecognitionException {
        double r = 0.0;

        CommonTree y=null;
        int x = 0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:468:2: (x= integerValue | y= FloatingPointLiteral )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=BinaryLiteral && LA35_0<=HexLiteral)) ) {
                alt35=1;
            }
            else if ( (LA35_0==FloatingPointLiteral) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:468:4: x= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_numericValue1889);
                    x=integerValue();

                    state._fsp--;

                    r = (double) x;

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:470:4: y= FloatingPointLiteral
                    {
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1900); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:474:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final int integerValue() throws RecognitionException {
        int r = 0;

        CommonTree x=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:475:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt36=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt36=1;
                }
                break;
            case OctalLiteral:
                {
                alt36=2;
                }
                break;
            case DecimalLiteral:
                {
                alt36=3;
                }
                break;
            case HexLiteral:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:475:4: x= BinaryLiteral
                    {
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue1921); 
                    r = Integer.parseInt(x.getText().substring(2),2);

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:477:4: x= OctalLiteral
                    {
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue1932); 
                    r = Integer.parseInt(x.getText().substring(1),8);

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:479:4: x= DecimalLiteral
                    {
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue1943); 
                    r = Integer.parseInt(x.getText());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:481:4: x= HexLiteral
                    {
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue1954); 
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:485:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final double percentValue() throws RecognitionException {
        double r = 0.0;

        double x = 0.0;


        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:486:2: (x= numericValue PERCENT )
            // /Users/reunice/Documents/flips-uav/src/compiler/flipsAssembly.g:486:4: x= numericValue PERCENT
            {
            pushFollow(FOLLOW_numericValue_in_percentValue1975);
            x=numericValue();

            state._fsp--;

            match(input,PERCENT,FOLLOW_PERCENT_in_percentValue1977); 
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA9_eotS =
        "\16\uffff";
    static final String DFA9_eofS =
        "\16\uffff";
    static final String DFA9_minS =
        "\1\21\1\2\1\15\1\46\1\75\3\uffff\2\46\4\uffff";
    static final String DFA9_maxS =
        "\1\21\1\2\1\16\1\63\1\76\3\uffff\2\63\4\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7";
    static final String DFA9_specialS =
        "\16\uffff}>";
    static final String[] DFA9_transitionS = {
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "193:1: altitude : ( ^( ALTITUDE FIXED DISTANCE x= convertDistance ) | ^( ALTITUDE FIXED PRESSURE y= convertPressure ) | ^( ALTITUDE FIXED x= convertFlightLevel ) | ^( ALTITUDE RELATIVE CLIMB DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE CLIMB PRESSURE y= convertPressure ) | ^( ALTITUDE RELATIVE DESCEND DISTANCE x= convertDistance ) | ^( ALTITUDE RELATIVE DESCEND PRESSURE y= convertPressure ) );";
        }
    }
    static final String DFA11_eotS =
        "\32\uffff";
    static final String DFA11_eofS =
        "\32\uffff";
    static final String DFA11_minS =
        "\1\22\1\2\1\15\1\uffff\1\23\1\67\1\uffff\2\120\3\uffff\12\47\4\uffff";
    static final String DFA11_maxS =
        "\1\22\1\2\1\26\1\uffff\1\24\1\71\1\uffff\2\124\3\uffff\12\61\4\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\1\2\uffff\1\11\2\uffff\1\6\1\7\1\10\12\uffff\1\2\1\4"+
        "\1\3\1\5";
    static final String DFA11_specialS =
        "\32\uffff}>";
    static final String[] DFA11_transitionS = {
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
            "\6\30\4\uffff\1\31",
            "\6\30\4\uffff\1\31",
            "\6\30\4\uffff\1\31",
            "\6\30\4\uffff\1\31",
            "\6\30\4\uffff\1\31",
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
            return "228:1: speed : ( ^( SPEED FIXED x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= convertSpeed ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) | ^( SPEED RELATIVE FASTER x= percentValue ) | ^( SPEED RELATIVE SLOWER x= percentValue ) | ^( SPEED OPTIMAL MINIMUM ) | ^( SPEED OPTIMAL CRUISE ) | ^( SPEED OPTIMAL MAXIMUM ) | ^( SPEED THROTTLE y= convertThrottle ) );";
        }
    }
    static final String DFA18_eotS =
        "\36\uffff";
    static final String DFA18_eofS =
        "\36\uffff";
    static final String DFA18_minS =
        "\1\27\1\2\1\120\5\41\3\30\5\41\3\uffff\3\30\5\41\3\30";
    static final String DFA18_maxS =
        "\1\27\1\2\1\124\5\43\3\124\5\43\3\uffff\3\124\5\43\3\32";
    static final String DFA18_acceptS =
        "\20\uffff\1\1\1\2\1\3\13\uffff";
    static final String DFA18_specialS =
        "\36\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\11\1\10\1\12",
            "\1\11\1\10\1\12",
            "\1\11\1\10\1\12",
            "\1\11\1\10\1\12",
            "\1\11\1\10\1\12",
            "\1\20\1\21\1\22\65\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\20\1\21\1\22\65\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\20\1\21\1\22\65\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\23\1\25\1\24",
            "\1\23\1\25\1\24",
            "\1\23\1\25\1\24",
            "\1\23\1\25\1\24",
            "\1\23\1\25\1\24",
            "",
            "",
            "",
            "\1\20\1\21\1\22\65\uffff\1\32\1\26\1\27\1\30\1\31",
            "\1\20\1\21\1\22\65\uffff\1\32\1\26\1\27\1\30\1\31",
            "\1\20\1\21\1\22\65\uffff\1\32\1\26\1\27\1\30\1\31",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\35\1\34\1\33",
            "\1\20\1\21\1\22",
            "\1\20\1\21\1\22",
            "\1\20\1\21\1\22"
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
            return "249:1: time : ( ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? AM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? PM ) | ^( TIME x= convertTime (y= convertTime (z= convertTime )? )? HOUR24 ) );";
        }
    }
    static final String DFA21_eotS =
        "\17\uffff";
    static final String DFA21_eofS =
        "\17\uffff";
    static final String DFA21_minS =
        "\1\13\1\2\1\15\1\77\1\55\4\3\6\uffff";
    static final String DFA21_maxS =
        "\1\13\1\2\1\16\1\124\1\56\2\102\2\100\6\uffff";
    static final String DFA21_acceptS =
        "\11\uffff\1\4\1\5\1\6\1\2\1\3\1\1";
    static final String DFA21_specialS =
        "\17\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\1\6\1\7\1\10\15\uffff\5\11",
            "\1\12\1\13",
            "\1\16\73\uffff\1\15\1\uffff\2\14",
            "\1\16\74\uffff\1\15\2\14",
            "\1\16\73\uffff\2\15",
            "\1\16\73\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "267:1: direction : ( ^( DIRECTION FIXED x= convertCardinalDirection ) | ^( DIRECTION FIXED x= convertOrdinalDirection ) | ^( DIRECTION FIXED x= convertSubOrdinalDirection ) | ^( DIRECTION FIXED y= convertAngle ) | ^( DIRECTION RELATIVE LEFT y= convertAngle ) | ^( DIRECTION RELATIVE RIGHT y= convertAngle ) );";
        }
    }
    static final String DFA25_eotS =
        "\23\uffff";
    static final String DFA25_eofS =
        "\23\uffff";
    static final String DFA25_minS =
        "\1\37\1\2\1\120\5\44\3\77\5\42\2\uffff\1\77";
    static final String DFA25_maxS =
        "\1\37\1\2\1\124\5\45\1\124\2\100\5\42\2\uffff\1\100";
    static final String DFA25_acceptS =
        "\20\uffff\1\1\1\2\1\uffff";
    static final String DFA25_specialS =
        "\23\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\20\1\21\17\uffff\1\17\1\13\1\14\1\15\1\16",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "",
            "",
            "\1\20\1\21"
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
            return "326:1: latitude returns [double r] : ( ^( LATITUDE x= convertAngle NORTH ) | ^( LATITUDE x= convertAngle SOUTH ) );";
        }
    }
    static final String DFA26_eotS =
        "\23\uffff";
    static final String DFA26_eofS =
        "\23\uffff";
    static final String DFA26_minS =
        "\1\40\1\2\1\120\5\44\3\101\5\42\2\uffff\1\101";
    static final String DFA26_maxS =
        "\1\40\1\2\1\124\5\45\1\124\2\102\5\42\2\uffff\1\102";
    static final String DFA26_acceptS =
        "\20\uffff\1\2\1\1\1\uffff";
    static final String DFA26_specialS =
        "\23\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\11",
            "\1\21\1\20\15\uffff\1\17\1\13\1\14\1\15\1\16",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "333:1: longitude returns [double r] : ( ^( LONGITUDE x= convertAngle EAST ) | ^( LONGITUDE x= convertAngle WEST ) );";
        }
    }
    static final String DFA28_eotS =
        "\14\uffff";
    static final String DFA28_eofS =
        "\14\uffff";
    static final String DFA28_minS =
        "\1\120\5\47\6\uffff";
    static final String DFA28_maxS =
        "\1\124\5\54\6\uffff";
    static final String DFA28_acceptS =
        "\6\uffff\1\4\1\6\1\2\1\5\1\1\1\3";
    static final String DFA28_specialS =
        "\14\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\12\1\10\1\13\1\6\1\11\1\7",
            "\1\12\1\10\1\13\1\6\1\11\1\7",
            "\1\12\1\10\1\13\1\6\1\11\1\7",
            "\1\12\1\10\1\13\1\6\1\11\1\7",
            "\1\12\1\10\1\13\1\6\1\11\1\7",
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
            return "353:1: convertDistance returns [double r] : (x= numericValue KILOMETER | x= numericValue METER | x= numericValue NAUTICAL MILE | x= numericValue MILE | x= numericValue YARD | x= numericValue FOOT );";
        }
    }
    static final String DFA29_eotS =
        "\14\uffff";
    static final String DFA29_eofS =
        "\14\uffff";
    static final String DFA29_minS =
        "\1\120\5\64\6\uffff";
    static final String DFA29_maxS =
        "\1\124\5\74\6\uffff";
    static final String DFA29_acceptS =
        "\6\uffff\1\1\1\6\1\4\1\2\1\5\1\3";
    static final String DFA29_specialS =
        "\14\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\6\1\11\1\13\3\uffff\1\10\1\12\1\7",
            "\1\6\1\11\1\13\3\uffff\1\10\1\12\1\7",
            "\1\6\1\11\1\13\3\uffff\1\10\1\12\1\7",
            "\1\6\1\11\1\13\3\uffff\1\10\1\12\1\7",
            "\1\6\1\11\1\13\3\uffff\1\10\1\12\1\7",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "376:1: convertPressure returns [double r] : (x= numericValue KILOPASCAL | x= numericValue HECTOPASCAL | x= numericValue PASCAL | x= numericValue BAR | x= numericValue MILLIBAR | x= numericValue ATMOSPHERE );";
        }
    }
    static final String DFA30_eotS =
        "\20\uffff";
    static final String DFA30_eofS =
        "\20\uffff";
    static final String DFA30_minS =
        "\1\120\5\47\5\41\1\52\3\uffff\1\41";
    static final String DFA30_maxS =
        "\1\124\5\54\5\43\1\52\3\uffff\1\43";
    static final String DFA30_acceptS =
        "\14\uffff\1\1\1\3\1\2\1\uffff";
    static final String DFA30_specialS =
        "\20\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\10\1\6\1\13\1\12\1\11\1\7",
            "\1\10\1\6\1\13\1\12\1\11\1\7",
            "\1\10\1\6\1\13\1\12\1\11\1\7",
            "\1\10\1\6\1\13\1\12\1\11\1\7",
            "\1\10\1\6\1\13\1\12\1\11\1\7",
            "\1\14\1\16\1\15",
            "\1\14\1\16\1\15",
            "\1\14\1\16\1\15",
            "\1\14\1\16\1\15",
            "\1\14\1\16\1\15",
            "\1\17",
            "",
            "",
            "",
            "\1\14\1\16\1\15"
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
            return "392:1: convertSpeed returns [double r] : (x= convertDistance HOUR | x= convertDistance MINUTE | x= convertDistance SECOND );";
        }
    }
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\120\5\44\1\uffff\1\3\2\uffff";
    static final String DFA31_maxS =
        "\1\124\5\45\1\uffff\1\124\2\uffff";
    static final String DFA31_acceptS =
        "\6\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\5\1\1\1\2\1\3\1\4",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\10\1\6",
            "",
            "\1\10\73\uffff\4\10\15\uffff\5\11",
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
            return "408:1: convertAngle returns [double r] : (x= numericValue DEGREE | deg= integerValue DEGREE min= numericValue MINUTE | x= numericValue RADIAN );";
        }
    }
    static final String DFA34_eotS =
        "\17\uffff";
    static final String DFA34_eofS =
        "\17\uffff";
    static final String DFA34_minS =
        "\3\77\1\100\1\77\1\101\2\uffff\1\101\6\uffff";
    static final String DFA34_maxS =
        "\1\102\1\77\3\100\1\102\2\uffff\1\102\6\uffff";
    static final String DFA34_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\6\1\7\1\1\1\10\1\4\1\5";
    static final String DFA34_specialS =
        "\17\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "442:1: convertSubOrdinalDirection returns [double r] : ( NORTH NORTH EAST | EAST NORTH EAST | EAST SOUTH EAST | SOUTH SOUTH EAST | SOUTH SOUTH WEST | WEST SOUTH WEST | WEST NORTH WEST | NORTH NORTH WEST );";
        }
    }
 

    public static final BitSet FOLLOW_FLIGHTPLAN_in_flightPlan63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_define_in_flightPlan65 = new BitSet(new long[]{0x0000000000000728L});
    public static final BitSet FOLLOW_command_in_flightPlan68 = new BitSet(new long[]{0x0000000000000708L});
    public static final BitSet FOLLOW_defineCommand_in_define81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_defineCommand98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineCommand102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMAND_in_defineCommand105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_defineCommand109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINE_in_defineWaypoint127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypoint131 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypoint135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flyCommand_in_command153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLY_in_flyCommand177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand179 = new BitSet(new long[]{0x0000004068878808L});
    public static final BitSet FOLLOW_time_in_flyCommandValue196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOITER_in_loiterCommand248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand250 = new BitSet(new long[]{0x0000004078878808L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_executeCommand309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PITCH_in_pitch331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_pitch335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROLL_in_roll352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_roll356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude377 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude379 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude396 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude398 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_altitude415 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_convertFlightLevel_in_altitude419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude432 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude434 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude436 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude453 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLIMB_in_altitude455 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude457 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude474 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude476 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DISTANCE_in_altitude478 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertDistance_in_altitude482 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTITUDE_in_altitude493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_altitude495 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DESCEND_in_altitude497 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_PRESSURE_in_altitude499 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertPressure_in_altitude503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_distance526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_distance539 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertDistance_in_distance543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_distance554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_in_distance556 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertDistance_in_distance560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RADIUS_in_radius577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertDistance_in_radius581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_speed602 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FASTER_in_speed621 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed638 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SLOWER_in_speed640 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertSpeed_in_speed644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed657 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FASTER_in_speed659 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_percentValue_in_speed663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_speed672 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SLOWER_in_speed674 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_percentValue_in_speed678 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed687 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_MINIMUM_in_speed689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed702 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_CRUISE_in_speed704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTIMAL_in_speed717 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_MAXIMUM_in_speed719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_speed730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THROTTLE_in_speed732 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertThrottle_in_speed736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time759 = new BitSet(new long[]{0x0000000001000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_time764 = new BitSet(new long[]{0x0000000001000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_time769 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_AM_in_time775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time794 = new BitSet(new long[]{0x0000000002000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_time799 = new BitSet(new long[]{0x0000000002000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_time804 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PM_in_time810 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_time829 = new BitSet(new long[]{0x0000000004000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_time834 = new BitSet(new long[]{0x0000000004000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_time839 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_HOUR24_in_time845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DURATION_in_duration862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertTime_in_duration866 = new BitSet(new long[]{0x0000000000000008L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_duration871 = new BitSet(new long[]{0x0000000000000008L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertTime_in_duration876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction901 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_convertCardinalDirection_in_direction905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction918 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_convertOrdinalDirection_in_direction922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction935 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_convertSubOrdinalDirection_in_direction939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_direction952 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertAngle_in_direction956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction967 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction969 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_in_direction971 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertAngle_in_direction975 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_direction986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_direction988 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RIGHT_in_direction990 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_convertAngle_in_direction994 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1013 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_in_turnDirection1015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_turnDirection1026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_turnDirection1028 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RIGHT_in_turnDirection1030 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1049 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CLOCKWISE_in_loiterDirection1051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_loiterDirection1062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TURN_in_loiterDirection1064 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_COUNTERCLOCKWISE_in_loiterDirection1066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAYPOINT_in_waypoint1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEOCOORDINATE_in_geoCoordinate1132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_latitude_in_geoCoordinate1136 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_longitude_in_geoCoordinate1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1169 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_NORTH_in_latitude1171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LATITUDE_in_latitude1182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_latitude1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SOUTH_in_latitude1188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_longitude1215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LONGITUDE_in_longitude1226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_longitude1230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_longitude1232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1257 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_HOUR_in_convertTime1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1270 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertTime1283 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SECOND_in_convertTime1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1307 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistance1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1320 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_METER_in_convertDistance1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1333 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistance1335 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1348 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistance1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1361 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YARD_in_convertDistance1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance1374 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FOOT_in_convertDistance1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1426 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressure1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1439 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressure1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1452 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressure1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1465 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_BAR_in_convertPressure1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1478 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressure1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1491 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressure1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1515 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_HOUR_in_convertSpeed1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertSpeed1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_convertSpeed1541 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SECOND_in_convertSpeed1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_convertThrottle1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1587 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1600 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1602 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1606 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1619 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertCardinalDirection1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertCardinalDirection1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertCardinalDirection1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertCardinalDirection1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1743 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1756 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1821 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1834 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_convertDirection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue1975 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue1977 = new BitSet(new long[]{0x0000000000000002L});

}