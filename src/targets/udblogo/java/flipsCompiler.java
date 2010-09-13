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
    flipsTargetUdbLogoLexer lexer = new flipsTargetUdbLogoLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    // Assembly Parser and Code Generator
    flipsTargetUdbLogoParser parser = new flipsTargetUdbLogoParser(tokens);
    parser.flightPlan();
    
    return parser.output.toString();
  }
}
