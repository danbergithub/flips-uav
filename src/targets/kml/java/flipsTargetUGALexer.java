// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsTargetUGA.g 2010-06-03 02:07:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class flipsTargetUGALexer extends Lexer {
    public static final int AIL=25;
    public static final int FIX=10;
    public static final int THR=28;
    public static final int FLA=27;
    public static final int OctalLiteral=39;
    public static final int SPD=20;
    public static final int AIR=21;
    public static final int Exponent=48;
    public static final int LineComment=51;
    public static final int YAW=17;
    public static final int PRE=18;
    public static final int EOF=-1;
    public static final int HexDigit=47;
    public static final int Identifier=42;
    public static final int ROL=15;
    public static final int TIM=30;
    public static final int T__52=52;
    public static final int Comment=50;
    public static final int POS=8;
    public static final int RAD=31;
    public static final int ELE=24;
    public static final int PAR=7;
    public static final int GEO=12;
    public static final int HexLiteral=41;
    public static final int ACT=23;
    public static final int GND=22;
    public static final int L=33;
    public static final int VEL=19;
    public static final int TRI=29;
    public static final int CMD=6;
    public static final int PIT=16;
    public static final int REL=11;
    public static final int R=34;
    public static final int Digit=44;
    public static final int DecimalLiteral=40;
    public static final int Y=13;
    public static final int X=9;
    public static final int CCW=36;
    public static final int Z=14;
    public static final int StringLiteral=43;
    public static final int CW=35;
    public static final int WS=49;
    public static final int FLY=4;
    public static final int RUD=26;
    public static final int DIR=32;
    public static final int LTR=5;
    public static final int BinaryLiteral=38;
    public static final int NonZeroDigit=45;
    public static final int BinaryDigit=46;
    public static final int FloatingPointLiteral=37;

    // delegates
    // delegators

    public flipsTargetUGALexer() {;} 
    public flipsTargetUGALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public flipsTargetUGALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "flipsTargetUGA.g"; }

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:7:7: ( '-' )
            // flipsTargetUGA.g:7:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "FLY"
    public final void mFLY() throws RecognitionException {
        try {
            int _type = FLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:264:5: ( 'fly' | 'FLY' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='f') ) {
                alt1=1;
            }
            else if ( (LA1_0=='F') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // flipsTargetUGA.g:264:7: 'fly'
                    {
                    match("fly"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:264:13: 'FLY'
                    {
                    match("FLY"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLY"

    // $ANTLR start "LTR"
    public final void mLTR() throws RecognitionException {
        try {
            int _type = LTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:265:5: ( 'ltr' | 'LTR' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='l') ) {
                alt2=1;
            }
            else if ( (LA2_0=='L') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // flipsTargetUGA.g:265:7: 'ltr'
                    {
                    match("ltr"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:265:13: 'LTR'
                    {
                    match("LTR"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTR"

    // $ANTLR start "FIX"
    public final void mFIX() throws RecognitionException {
        try {
            int _type = FIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:267:5: ( 'fix' | 'FIX' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='f') ) {
                alt3=1;
            }
            else if ( (LA3_0=='F') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // flipsTargetUGA.g:267:7: 'fix'
                    {
                    match("fix"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:267:13: 'FIX'
                    {
                    match("FIX"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIX"

    // $ANTLR start "REL"
    public final void mREL() throws RecognitionException {
        try {
            int _type = REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:268:5: ( 'rel' | 'REL' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='r') ) {
                alt4=1;
            }
            else if ( (LA4_0=='R') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // flipsTargetUGA.g:268:7: 'rel'
                    {
                    match("rel"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:268:13: 'REL'
                    {
                    match("REL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REL"

    // $ANTLR start "POS"
    public final void mPOS() throws RecognitionException {
        try {
            int _type = POS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:270:5: ( 'pos' | 'POS' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='p') ) {
                alt5=1;
            }
            else if ( (LA5_0=='P') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // flipsTargetUGA.g:270:7: 'pos'
                    {
                    match("pos"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:270:13: 'POS'
                    {
                    match("POS"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POS"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            int _type = X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:271:3: ( 'x' | 'X' )
            // flipsTargetUGA.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            int _type = Y;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:272:3: ( 'y' | 'Y' )
            // flipsTargetUGA.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            int _type = Z;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:273:3: ( 'z' | 'Z' )
            // flipsTargetUGA.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "GEO"
    public final void mGEO() throws RecognitionException {
        try {
            int _type = GEO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:274:5: ( 'geo' | 'GEO' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='g') ) {
                alt6=1;
            }
            else if ( (LA6_0=='G') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // flipsTargetUGA.g:274:7: 'geo'
                    {
                    match("geo"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:274:13: 'GEO'
                    {
                    match("GEO"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GEO"

    // $ANTLR start "ROL"
    public final void mROL() throws RecognitionException {
        try {
            int _type = ROL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:275:5: ( 'rol' | 'ROL' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='r') ) {
                alt7=1;
            }
            else if ( (LA7_0=='R') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // flipsTargetUGA.g:275:7: 'rol'
                    {
                    match("rol"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:275:13: 'ROL'
                    {
                    match("ROL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROL"

    // $ANTLR start "PIT"
    public final void mPIT() throws RecognitionException {
        try {
            int _type = PIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:276:5: ( 'pit' | 'PIT' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='p') ) {
                alt8=1;
            }
            else if ( (LA8_0=='P') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // flipsTargetUGA.g:276:7: 'pit'
                    {
                    match("pit"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:276:13: 'PIT'
                    {
                    match("PIT"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIT"

    // $ANTLR start "YAW"
    public final void mYAW() throws RecognitionException {
        try {
            int _type = YAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:277:5: ( 'yaw' | 'YAW' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='y') ) {
                alt9=1;
            }
            else if ( (LA9_0=='Y') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // flipsTargetUGA.g:277:7: 'yaw'
                    {
                    match("yaw"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:277:13: 'YAW'
                    {
                    match("YAW"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YAW"

    // $ANTLR start "PRE"
    public final void mPRE() throws RecognitionException {
        try {
            int _type = PRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:278:5: ( 'pre' | 'PRE' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='p') ) {
                alt10=1;
            }
            else if ( (LA10_0=='P') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // flipsTargetUGA.g:278:7: 'pre'
                    {
                    match("pre"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:278:13: 'PRE'
                    {
                    match("PRE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRE"

    // $ANTLR start "VEL"
    public final void mVEL() throws RecognitionException {
        try {
            int _type = VEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:280:5: ( 'vel' | 'VEL' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='v') ) {
                alt11=1;
            }
            else if ( (LA11_0=='V') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // flipsTargetUGA.g:280:7: 'vel'
                    {
                    match("vel"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:280:13: 'VEL'
                    {
                    match("VEL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VEL"

    // $ANTLR start "SPD"
    public final void mSPD() throws RecognitionException {
        try {
            int _type = SPD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:282:5: ( 'spd' | 'SPD' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='s') ) {
                alt12=1;
            }
            else if ( (LA12_0=='S') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // flipsTargetUGA.g:282:7: 'spd'
                    {
                    match("spd"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:282:13: 'SPD'
                    {
                    match("SPD"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPD"

    // $ANTLR start "AIR"
    public final void mAIR() throws RecognitionException {
        try {
            int _type = AIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:283:5: ( 'air' | 'AIR' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='a') ) {
                alt13=1;
            }
            else if ( (LA13_0=='A') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // flipsTargetUGA.g:283:7: 'air'
                    {
                    match("air"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:283:13: 'AIR'
                    {
                    match("AIR"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AIR"

    // $ANTLR start "GND"
    public final void mGND() throws RecognitionException {
        try {
            int _type = GND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:284:5: ( 'gnd' | 'GND' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='g') ) {
                alt14=1;
            }
            else if ( (LA14_0=='G') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // flipsTargetUGA.g:284:7: 'gnd'
                    {
                    match("gnd"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:284:13: 'GND'
                    {
                    match("GND"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GND"

    // $ANTLR start "ACT"
    public final void mACT() throws RecognitionException {
        try {
            int _type = ACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:286:5: ( 'act' | 'ACT' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='a') ) {
                alt15=1;
            }
            else if ( (LA15_0=='A') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // flipsTargetUGA.g:286:7: 'act'
                    {
                    match("act"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:286:13: 'ACT'
                    {
                    match("ACT"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACT"

    // $ANTLR start "ELE"
    public final void mELE() throws RecognitionException {
        try {
            int _type = ELE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:287:5: ( 'ele' | 'ELE' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='e') ) {
                alt16=1;
            }
            else if ( (LA16_0=='E') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // flipsTargetUGA.g:287:7: 'ele'
                    {
                    match("ele"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:287:13: 'ELE'
                    {
                    match("ELE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELE"

    // $ANTLR start "AIL"
    public final void mAIL() throws RecognitionException {
        try {
            int _type = AIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:288:5: ( 'ail' | 'AIL' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='a') ) {
                alt17=1;
            }
            else if ( (LA17_0=='A') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // flipsTargetUGA.g:288:7: 'ail'
                    {
                    match("ail"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:288:13: 'AIL'
                    {
                    match("AIL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AIL"

    // $ANTLR start "RUD"
    public final void mRUD() throws RecognitionException {
        try {
            int _type = RUD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:289:5: ( 'rud' | 'RUD' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='r') ) {
                alt18=1;
            }
            else if ( (LA18_0=='R') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // flipsTargetUGA.g:289:7: 'rud'
                    {
                    match("rud"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:289:13: 'RUD'
                    {
                    match("RUD"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RUD"

    // $ANTLR start "FLA"
    public final void mFLA() throws RecognitionException {
        try {
            int _type = FLA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:290:5: ( 'fla' | 'FLA' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='f') ) {
                alt19=1;
            }
            else if ( (LA19_0=='F') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // flipsTargetUGA.g:290:7: 'fla'
                    {
                    match("fla"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:290:13: 'FLA'
                    {
                    match("FLA"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLA"

    // $ANTLR start "THR"
    public final void mTHR() throws RecognitionException {
        try {
            int _type = THR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:291:5: ( 'thr' | 'THR' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='t') ) {
                alt20=1;
            }
            else if ( (LA20_0=='T') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // flipsTargetUGA.g:291:7: 'thr'
                    {
                    match("thr"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:291:13: 'THR'
                    {
                    match("THR"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THR"

    // $ANTLR start "TRI"
    public final void mTRI() throws RecognitionException {
        try {
            int _type = TRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:293:5: ( 'tri' | 'TRI' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='t') ) {
                alt21=1;
            }
            else if ( (LA21_0=='T') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // flipsTargetUGA.g:293:7: 'tri'
                    {
                    match("tri"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:293:13: 'TRI'
                    {
                    match("TRI"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRI"

    // $ANTLR start "CMD"
    public final void mCMD() throws RecognitionException {
        try {
            int _type = CMD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:295:5: ( 'cmd' | 'CMD' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='c') ) {
                alt22=1;
            }
            else if ( (LA22_0=='C') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // flipsTargetUGA.g:295:7: 'cmd'
                    {
                    match("cmd"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:295:13: 'CMD'
                    {
                    match("CMD"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CMD"

    // $ANTLR start "PAR"
    public final void mPAR() throws RecognitionException {
        try {
            int _type = PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:296:5: ( 'par' | 'PAR' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='p') ) {
                alt23=1;
            }
            else if ( (LA23_0=='P') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // flipsTargetUGA.g:296:7: 'par'
                    {
                    match("par"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:296:13: 'PAR'
                    {
                    match("PAR"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAR"

    // $ANTLR start "TIM"
    public final void mTIM() throws RecognitionException {
        try {
            int _type = TIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:298:5: ( 'tim' | 'TIM' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='t') ) {
                alt24=1;
            }
            else if ( (LA24_0=='T') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // flipsTargetUGA.g:298:7: 'tim'
                    {
                    match("tim"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:298:13: 'TIM'
                    {
                    match("TIM"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIM"

    // $ANTLR start "RAD"
    public final void mRAD() throws RecognitionException {
        try {
            int _type = RAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:300:5: ( 'rad' | 'RAD' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='r') ) {
                alt25=1;
            }
            else if ( (LA25_0=='R') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // flipsTargetUGA.g:300:7: 'rad'
                    {
                    match("rad"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:300:13: 'RAD'
                    {
                    match("RAD"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAD"

    // $ANTLR start "DIR"
    public final void mDIR() throws RecognitionException {
        try {
            int _type = DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:301:5: ( 'dir' | 'DIR' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='d') ) {
                alt26=1;
            }
            else if ( (LA26_0=='D') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // flipsTargetUGA.g:301:7: 'dir'
                    {
                    match("dir"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:301:13: 'DIR'
                    {
                    match("DIR"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIR"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            int _type = L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:302:3: ( 'l' | 'L' )
            // flipsTargetUGA.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            int _type = R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:303:3: ( 'r' | 'R' )
            // flipsTargetUGA.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "CW"
    public final void mCW() throws RecognitionException {
        try {
            int _type = CW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:304:4: ( 'cw' | 'CW' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='c') ) {
                alt27=1;
            }
            else if ( (LA27_0=='C') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // flipsTargetUGA.g:304:6: 'cw'
                    {
                    match("cw"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:304:11: 'CW'
                    {
                    match("CW"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CW"

    // $ANTLR start "CCW"
    public final void mCCW() throws RecognitionException {
        try {
            int _type = CCW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:305:5: ( 'ccw' | 'CCW' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='c') ) {
                alt28=1;
            }
            else if ( (LA28_0=='C') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // flipsTargetUGA.g:305:7: 'ccw'
                    {
                    match("ccw"); 


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:305:13: 'CCW'
                    {
                    match("CCW"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CCW"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:310:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // flipsTargetUGA.g:310:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // flipsTargetUGA.g:310:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // flipsTargetUGA.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:313:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // flipsTargetUGA.g:313:5: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // flipsTargetUGA.g:313:9: (~ ( '\"' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // flipsTargetUGA.g:313:10: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // flipsTargetUGA.g:318:7: ( '0' .. '9' )
            // flipsTargetUGA.g:318:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "NonZeroDigit"
    public final void mNonZeroDigit() throws RecognitionException {
        try {
            // flipsTargetUGA.g:322:2: ( '1' .. '9' )
            // flipsTargetUGA.g:322:4: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NonZeroDigit"

    // $ANTLR start "BinaryDigit"
    public final void mBinaryDigit() throws RecognitionException {
        try {
            // flipsTargetUGA.g:326:2: ( '0' | '1' )
            // flipsTargetUGA.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "BinaryDigit"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // flipsTargetUGA.g:329:9: ( Digit | 'a' .. 'f' | 'A' .. 'F' )
            // flipsTargetUGA.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "BinaryLiteral"
    public final void mBinaryLiteral() throws RecognitionException {
        try {
            int _type = BinaryLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:332:2: ( '0' ( 'b' | 'B' ) ( BinaryDigit )+ )
            // flipsTargetUGA.g:332:4: '0' ( 'b' | 'B' ) ( BinaryDigit )+
            {
            match('0'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // flipsTargetUGA.g:332:18: ( BinaryDigit )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='1')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // flipsTargetUGA.g:332:18: BinaryDigit
            	    {
            	    mBinaryDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BinaryLiteral"

    // $ANTLR start "OctalLiteral"
    public final void mOctalLiteral() throws RecognitionException {
        try {
            int _type = OctalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:335:2: ( '0' ( '0' .. '7' )+ )
            // flipsTargetUGA.g:335:4: '0' ( '0' .. '7' )+
            {
            match('0'); 
            // flipsTargetUGA.g:335:8: ( '0' .. '7' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='7')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // flipsTargetUGA.g:335:9: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OctalLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:338:2: ( '0' | NonZeroDigit ( Digit )* )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='0') ) {
                alt34=1;
            }
            else if ( ((LA34_0>='1' && LA34_0<='9')) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // flipsTargetUGA.g:338:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:338:8: NonZeroDigit ( Digit )*
                    {
                    mNonZeroDigit(); 
                    // flipsTargetUGA.g:338:21: ( Digit )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>='0' && LA33_0<='9')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // flipsTargetUGA.g:338:21: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "HexLiteral"
    public final void mHexLiteral() throws RecognitionException {
        try {
            int _type = HexLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:341:2: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
            // flipsTargetUGA.g:341:4: '0' ( 'x' | 'X' ) ( HexDigit )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // flipsTargetUGA.g:341:18: ( HexDigit )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')||(LA35_0>='A' && LA35_0<='F')||(LA35_0>='a' && LA35_0<='f')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // flipsTargetUGA.g:341:18: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HexLiteral"

    // $ANTLR start "FloatingPointLiteral"
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            int _type = FloatingPointLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:344:2: ( ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // flipsTargetUGA.g:344:4: ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // flipsTargetUGA.g:344:4: ( Digit )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>='0' && LA36_0<='9')) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // flipsTargetUGA.g:344:4: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    match('.'); 
                    // flipsTargetUGA.g:344:15: ( Digit )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>='0' && LA37_0<='9')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // flipsTargetUGA.g:344:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // flipsTargetUGA.g:344:22: ( Exponent )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='E'||LA38_0=='e') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // flipsTargetUGA.g:344:22: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // flipsTargetUGA.g:345:17: '.' ( Digit )+ ( Exponent )?
                    {
                    match('.'); 
                    // flipsTargetUGA.g:345:21: ( Digit )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>='0' && LA39_0<='9')) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // flipsTargetUGA.g:345:21: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    // flipsTargetUGA.g:345:28: ( Exponent )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='E'||LA40_0=='e') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // flipsTargetUGA.g:345:28: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // flipsTargetUGA.g:346:11: ( Digit )+ Exponent
                    {
                    // flipsTargetUGA.g:346:11: ( Digit )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>='0' && LA41_0<='9')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // flipsTargetUGA.g:346:11: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    mExponent(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FloatingPointLiteral"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // flipsTargetUGA.g:350:9: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // flipsTargetUGA.g:350:11: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // flipsTargetUGA.g:350:21: ( '+' | '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='+'||LA43_0=='-') ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // flipsTargetUGA.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // flipsTargetUGA.g:350:32: ( Digit )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='0' && LA44_0<='9')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // flipsTargetUGA.g:350:32: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:354:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+ )
            // flipsTargetUGA.g:354:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+
            {
            // flipsTargetUGA.g:354:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>='\t' && LA45_0<='\n')||(LA45_0>='\f' && LA45_0<='\r')||LA45_0==' ') ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // flipsTargetUGA.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:358:9: ( '/*' ( options {greedy=FALSE; } : . )* '*/' )
            // flipsTargetUGA.g:358:11: '/*' ( options {greedy=FALSE; } : . )* '*/'
            {
            match("/*"); 

            // flipsTargetUGA.g:358:16: ( options {greedy=FALSE; } : . )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0=='*') ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1=='/') ) {
                        int LA46_3 = input.LA(3);

                        if ( ((LA46_3>='\u0000' && LA46_3<='\uFFFF')) ) {
                            alt46=1;
                        }


                    }
                    else if ( ((LA46_1>='\u0000' && LA46_1<='.')||(LA46_1>='0' && LA46_1<='\uFFFF')) ) {
                        alt46=1;
                    }


                }
                else if ( ((LA46_0>='\u0000' && LA46_0<=')')||(LA46_0>='+' && LA46_0<='\uFFFF')) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // flipsTargetUGA.g:358:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "LineComment"
    public final void mLineComment() throws RecognitionException {
        try {
            int _type = LineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // flipsTargetUGA.g:361:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // flipsTargetUGA.g:361:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // flipsTargetUGA.g:361:9: (~ ( '\\n' | '\\r' ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='\u0000' && LA47_0<='\t')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\uFFFF')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // flipsTargetUGA.g:361:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // flipsTargetUGA.g:361:23: ( '\\r' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='\r') ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // flipsTargetUGA.g:361:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LineComment"

    public void mTokens() throws RecognitionException {
        // flipsTargetUGA.g:1:8: ( T__52 | FLY | LTR | FIX | REL | POS | X | Y | Z | GEO | ROL | PIT | YAW | PRE | VEL | SPD | AIR | GND | ACT | ELE | AIL | RUD | FLA | THR | TRI | CMD | PAR | TIM | RAD | DIR | L | R | CW | CCW | Identifier | StringLiteral | BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral | FloatingPointLiteral | WS | Comment | LineComment )
        int alt49=44;
        alt49 = dfa49.predict(input);
        switch (alt49) {
            case 1 :
                // flipsTargetUGA.g:1:10: T__52
                {
                mT__52(); 

                }
                break;
            case 2 :
                // flipsTargetUGA.g:1:16: FLY
                {
                mFLY(); 

                }
                break;
            case 3 :
                // flipsTargetUGA.g:1:20: LTR
                {
                mLTR(); 

                }
                break;
            case 4 :
                // flipsTargetUGA.g:1:24: FIX
                {
                mFIX(); 

                }
                break;
            case 5 :
                // flipsTargetUGA.g:1:28: REL
                {
                mREL(); 

                }
                break;
            case 6 :
                // flipsTargetUGA.g:1:32: POS
                {
                mPOS(); 

                }
                break;
            case 7 :
                // flipsTargetUGA.g:1:36: X
                {
                mX(); 

                }
                break;
            case 8 :
                // flipsTargetUGA.g:1:38: Y
                {
                mY(); 

                }
                break;
            case 9 :
                // flipsTargetUGA.g:1:40: Z
                {
                mZ(); 

                }
                break;
            case 10 :
                // flipsTargetUGA.g:1:42: GEO
                {
                mGEO(); 

                }
                break;
            case 11 :
                // flipsTargetUGA.g:1:46: ROL
                {
                mROL(); 

                }
                break;
            case 12 :
                // flipsTargetUGA.g:1:50: PIT
                {
                mPIT(); 

                }
                break;
            case 13 :
                // flipsTargetUGA.g:1:54: YAW
                {
                mYAW(); 

                }
                break;
            case 14 :
                // flipsTargetUGA.g:1:58: PRE
                {
                mPRE(); 

                }
                break;
            case 15 :
                // flipsTargetUGA.g:1:62: VEL
                {
                mVEL(); 

                }
                break;
            case 16 :
                // flipsTargetUGA.g:1:66: SPD
                {
                mSPD(); 

                }
                break;
            case 17 :
                // flipsTargetUGA.g:1:70: AIR
                {
                mAIR(); 

                }
                break;
            case 18 :
                // flipsTargetUGA.g:1:74: GND
                {
                mGND(); 

                }
                break;
            case 19 :
                // flipsTargetUGA.g:1:78: ACT
                {
                mACT(); 

                }
                break;
            case 20 :
                // flipsTargetUGA.g:1:82: ELE
                {
                mELE(); 

                }
                break;
            case 21 :
                // flipsTargetUGA.g:1:86: AIL
                {
                mAIL(); 

                }
                break;
            case 22 :
                // flipsTargetUGA.g:1:90: RUD
                {
                mRUD(); 

                }
                break;
            case 23 :
                // flipsTargetUGA.g:1:94: FLA
                {
                mFLA(); 

                }
                break;
            case 24 :
                // flipsTargetUGA.g:1:98: THR
                {
                mTHR(); 

                }
                break;
            case 25 :
                // flipsTargetUGA.g:1:102: TRI
                {
                mTRI(); 

                }
                break;
            case 26 :
                // flipsTargetUGA.g:1:106: CMD
                {
                mCMD(); 

                }
                break;
            case 27 :
                // flipsTargetUGA.g:1:110: PAR
                {
                mPAR(); 

                }
                break;
            case 28 :
                // flipsTargetUGA.g:1:114: TIM
                {
                mTIM(); 

                }
                break;
            case 29 :
                // flipsTargetUGA.g:1:118: RAD
                {
                mRAD(); 

                }
                break;
            case 30 :
                // flipsTargetUGA.g:1:122: DIR
                {
                mDIR(); 

                }
                break;
            case 31 :
                // flipsTargetUGA.g:1:126: L
                {
                mL(); 

                }
                break;
            case 32 :
                // flipsTargetUGA.g:1:128: R
                {
                mR(); 

                }
                break;
            case 33 :
                // flipsTargetUGA.g:1:130: CW
                {
                mCW(); 

                }
                break;
            case 34 :
                // flipsTargetUGA.g:1:133: CCW
                {
                mCCW(); 

                }
                break;
            case 35 :
                // flipsTargetUGA.g:1:137: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 36 :
                // flipsTargetUGA.g:1:148: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 37 :
                // flipsTargetUGA.g:1:162: BinaryLiteral
                {
                mBinaryLiteral(); 

                }
                break;
            case 38 :
                // flipsTargetUGA.g:1:176: OctalLiteral
                {
                mOctalLiteral(); 

                }
                break;
            case 39 :
                // flipsTargetUGA.g:1:189: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 40 :
                // flipsTargetUGA.g:1:204: HexLiteral
                {
                mHexLiteral(); 

                }
                break;
            case 41 :
                // flipsTargetUGA.g:1:215: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 42 :
                // flipsTargetUGA.g:1:236: WS
                {
                mWS(); 

                }
                break;
            case 43 :
                // flipsTargetUGA.g:1:239: Comment
                {
                mComment(); 

                }
                break;
            case 44 :
                // flipsTargetUGA.g:1:247: LineComment
                {
                mLineComment(); 

                }
                break;

        }

    }


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA42_eotS =
        "\5\uffff";
    static final String DFA42_eofS =
        "\5\uffff";
    static final String DFA42_minS =
        "\2\56\3\uffff";
    static final String DFA42_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA42_specialS =
        "\5\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "343:1: FloatingPointLiteral : ( ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent );";
        }
    }
    static final String DFA49_eotS =
        "\2\uffff\2\36\2\52\2\60\2\36\1\75\1\77\1\100\2\36\1\77\16\36\2\uffff"+
        "\2\140\3\uffff\5\36\1\uffff\5\36\1\uffff\14\36\1\uffff\1\36\2\uffff"+
        "\26\36\1\u0096\2\36\1\u0096\3\36\3\uffff\1\u009c\1\140\2\uffff\1"+
        "\u009d\1\u009e\1\u009f\1\u009d\1\u009e\1\u009f\2\u00a0\1\u00a1\1"+
        "\u00a2\1\u00a3\1\u00a4\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1"+
        "\u00a6\1\u00a7\1\u00a8\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1"+
        "\u00aa\1\u00ab\1\u00aa\1\u00ab\1\u00a9\2\u00ac\2\u00ad\1\u00ae\1"+
        "\u00af\1\u00b0\1\u00ae\1\u00af\1\u00b0\2\u00b1\1\u00b2\1\u00b3\1"+
        "\u00b4\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\uffff\1\u00b6\1\u00b5\1"+
        "\u00b6\2\u00b7\34\uffff";
    static final String DFA49_eofS =
        "\u00b8\uffff";
    static final String DFA49_minS =
        "\1\11\1\uffff\1\151\1\111\4\60\1\141\1\101\3\60\1\145\1\105\1\60"+
        "\1\145\1\105\1\160\1\120\1\143\1\103\1\154\1\114\1\150\1\110\1\143"+
        "\1\103\1\151\1\111\2\uffff\2\56\2\uffff\1\52\1\141\1\170\1\101\1"+
        "\130\1\162\1\uffff\1\122\2\154\2\144\1\uffff\2\114\2\104\1\163\1"+
        "\164\1\145\1\162\1\123\1\124\1\105\1\122\1\uffff\1\167\2\uffff\1"+
        "\157\1\144\1\117\1\104\1\127\1\154\1\114\1\144\1\104\1\154\1\164"+
        "\1\114\1\124\1\145\1\105\1\162\1\151\1\155\1\122\1\111\1\115\1\144"+
        "\1\60\1\167\1\104\1\60\1\127\1\162\1\122\3\uffff\2\56\2\uffff\61"+
        "\60\1\uffff\5\60\34\uffff";
    static final String DFA49_maxS =
        "\1\172\1\uffff\1\154\1\114\4\172\1\162\1\122\3\172\1\156\1\116\1"+
        "\172\1\145\1\105\1\160\1\120\1\151\1\111\1\154\1\114\1\162\1\122"+
        "\1\167\1\127\1\151\1\111\2\uffff\1\170\1\145\2\uffff\1\57\1\171"+
        "\1\170\1\131\1\130\1\162\1\uffff\1\122\2\154\2\144\1\uffff\2\114"+
        "\2\104\1\163\1\164\1\145\1\162\1\123\1\124\1\105\1\122\1\uffff\1"+
        "\167\2\uffff\1\157\1\144\1\117\1\104\1\127\1\154\1\114\1\144\1\104"+
        "\1\162\1\164\1\122\1\124\1\145\1\105\1\162\1\151\1\155\1\122\1\111"+
        "\1\115\1\144\1\172\1\167\1\104\1\172\1\127\1\162\1\122\3\uffff\2"+
        "\145\2\uffff\61\172\1\uffff\5\172\34\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\34\uffff\1\43\1\44\2\uffff\1\51\1\52\6\uffff\1\37\5"+
        "\uffff\1\40\14\uffff\1\7\1\uffff\1\10\1\11\35\uffff\1\45\1\50\1"+
        "\47\2\uffff\1\53\1\54\61\uffff\1\41\5\uffff\1\46\1\2\1\27\1\4\1"+
        "\3\1\5\1\13\1\26\1\35\1\6\1\14\1\16\1\33\1\15\1\12\1\22\1\17\1\20"+
        "\1\21\1\25\1\23\1\24\1\30\1\31\1\34\1\32\1\42\1\36";
    static final String DFA49_specialS =
        "\u00b8\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\43\1\uffff\2\43\22\uffff\1\43\1\uffff\1\37\12\uffff\1\1\1"+
            "\42\1\44\1\40\11\41\7\uffff\1\25\1\36\1\33\1\35\1\27\1\3\1\16"+
            "\4\36\1\5\3\36\1\11\1\36\1\7\1\23\1\31\1\36\1\21\1\36\1\12\1"+
            "\17\1\14\4\uffff\1\36\1\uffff\1\24\1\36\1\32\1\34\1\26\1\2\1"+
            "\15\4\36\1\4\3\36\1\10\1\36\1\6\1\22\1\30\1\36\1\20\1\36\1\12"+
            "\1\13\1\14",
            "",
            "\1\46\2\uffff\1\45",
            "\1\50\2\uffff\1\47",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\51\6\36",
            "\12\36\7\uffff\23\36\1\53\6\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\57\3\36\1\54\11"+
            "\36\1\55\5\36\1\56\5\36",
            "\12\36\7\uffff\1\64\3\36\1\61\11\36\1\62\5\36\1\63\5\36\4\uffff"+
            "\1\36\1\uffff\32\36",
            "\1\70\7\uffff\1\66\5\uffff\1\65\2\uffff\1\67",
            "\1\74\7\uffff\1\72\5\uffff\1\71\2\uffff\1\73",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\76\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\101\10\uffff\1\102",
            "\1\103\10\uffff\1\104",
            "\12\36\7\uffff\1\105\31\36\4\uffff\1\36\1\uffff\32\36",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\113\5\uffff\1\112",
            "\1\115\5\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120\1\122\10\uffff\1\121",
            "\1\123\1\125\10\uffff\1\124",
            "\1\130\11\uffff\1\126\11\uffff\1\127",
            "\1\133\11\uffff\1\131\11\uffff\1\132",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\42\1\uffff\10\141\2\42\10\uffff\1\136\2\uffff\1\42\22\uffff"+
            "\1\137\11\uffff\1\136\2\uffff\1\42\22\uffff\1\137",
            "\1\42\1\uffff\12\142\13\uffff\1\42\37\uffff\1\42",
            "",
            "",
            "\1\143\4\uffff\1\144",
            "\1\146\27\uffff\1\145",
            "\1\147",
            "\1\151\27\uffff\1\150",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\5\uffff\1\u0087",
            "\1\u0089",
            "\1\u008b\5\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0097",
            "\1\u0098",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "\1\42\1\uffff\10\141\2\42\13\uffff\1\42\37\uffff\1\42",
            "\1\42\1\uffff\12\142\13\uffff\1\42\37\uffff\1\42",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__52 | FLY | LTR | FIX | REL | POS | X | Y | Z | GEO | ROL | PIT | YAW | PRE | VEL | SPD | AIR | GND | ACT | ELE | AIL | RUD | FLA | THR | TRI | CMD | PAR | TIM | RAD | DIR | L | R | CW | CCW | Identifier | StringLiteral | BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral | FloatingPointLiteral | WS | Comment | LineComment );";
        }
    }
 

}