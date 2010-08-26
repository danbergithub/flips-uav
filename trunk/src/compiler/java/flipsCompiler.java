import java.io.IOException;
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
    // Lexer
    flipsLexer lexer = new flipsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    // Parser and AST Construction
    flipsParser parser = new flipsParser(tokens);
    flipsParser.flightPlan_return root = parser.flightPlan();
    CommonTree tree = root.tree;
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    
    // Semantic Check and Unit Conversion
    SymbolTable symbols = new SymbolTable();
    flipsAssembly walker = new flipsAssembly(nodes);
    walker.flightPlan(symbols);
    
    return walker.output.toString();
  }
}
