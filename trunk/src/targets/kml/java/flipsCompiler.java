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
    flipsTargetKmlLexer lex = new flipsTargetKmlLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    
    // Assembly Parser and Code Generator
    flipsTargetKmlParser parser = new flipsTargetKmlParser(tokens);
    parser.flightPlan();
    
    System.out.println(parser.output.toString());
    
    // KML Output
    try {
      BufferedWriter channel = new BufferedWriter(new FileWriter(filename.replace(".asm",".kml"))); 
      channel.write(parser.output.toString());
      channel.close();
    }
    catch (IOException e) {}
  }
}
