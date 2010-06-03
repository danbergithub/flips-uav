import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class flipsCompiler {
  public static void main(String args[]) throws
                                         Exception {
    compile(args[0]);
  }
  
  public static void compile(String filename) throws
                                              Exception {
    // File Input
    CharStream input = new ANTLRFileStream(filename);
    
    // Assembly Lexer
    flipsTargetUGALexer lex = new flipsTargetUGALexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    
    // Assembly Parser and Code Generator
    flipsTargetUGAParser parser = new flipsTargetUGAParser(tokens);
    parser.flightPlan();
    
    // Binary Output
    try {
      FileChannel channel = new FileOutputStream(filename.replace(".asm",".bin"),false).getChannel();
      channel.write(parser.output);
      channel.close();
    }
    catch (IOException e) {}
  }
}
