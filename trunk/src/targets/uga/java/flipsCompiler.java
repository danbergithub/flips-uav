import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class flipsCompiler {
  public static void main(String args[]) throws
                                         Exception {
    CharStream input = null;
    
    // Select an input stream
    if (args.length > 0) {
      // Read file
      input = new ANTLRFileStream(args[0]);
    }
    else {
      // Read stdin
      input = new ANTLRInputStream(System.in);
    }
    
    // Print the compiled result
    System.out.print(compile(input));
  }
  
  public static String compile(CharStream input) throws
                                                 Exception {
    // Assembly Lexer
    flipsTargetUGALexer lexer = new flipsTargetUGALexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    // Assembly Parser and Code Generator
    flipsTargetUGAParser parser = new flipsTargetUGAParser(tokens);
    parser.flightPlan();
    
    // return parser.debug.toString();
    byte[] bytes = new byte[parser.output.remaining()];
    parser.output.get(bytes,
                      0,
                      bytes.length);
    return new String(bytes);
  }
}
