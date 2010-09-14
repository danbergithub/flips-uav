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
    boolean debug = false;
    
    // Select an input stream
    if (args.length == 1) {
      if (args[0].equals("-d")) {
        // Enter debug mode
        debug = true;
        
        // Read stdin
        input = new ANTLRInputStream(System.in);
      }
      else {
        // Read file
        input = new ANTLRFileStream(args[0]);
      }
    }
    else if (args.length == 2) {
      // Read flag
      if (args[0].equals("-d")) {
        debug = true;
      }
      
      // Read file
      input = new ANTLRFileStream(args[1]);
    }
    else {
      // Read stdin
      input = new ANTLRInputStream(System.in);
    }
    
    // Print the compiled result
    System.out.print(compile(input,
                             debug));
  }

  public static String compile(CharStream input,
                               boolean debug) throws
                                              Exception {
    // Lexer
    flipsLexer lexer = new flipsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    // Parser and AST Construction
    flipsParser parser = new flipsParser(tokens);
    flipsParser.flightPlan_return root = parser.flightPlan();
    CommonTree tree = root.tree;
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    
    // Unit Conversion
    flipsUnitConversion unitConversion = new flipsUnitConversion(nodes);
    if (debug) {
      System.out.println("-- BEFORE UNIT CONVERSION --");
      System.out.println(tree.toStringTree());
      System.out.println();
      System.out.println("-- UNIT CONVERSION --");
      tree = (CommonTree)unitConversion.downup(tree, true);
      System.out.println();
      System.out.println("-- AFTER UNIT CONVERSION--");
      System.out.println(tree.toStringTree());
      System.out.println();
    }
    else {
      tree = (CommonTree)unitConversion.downup(tree, false);
    }
    
    // Semantic Check and Unit Conversion
    SymbolTable symbols = new SymbolTable();
    flipsAssembly walker = new flipsAssembly(nodes);
    walker.flightPlan(symbols);
    
    if (debug) {
      System.out.println("-- FINAL OUTPUT --");
    }
    return walker.output.toString();
  }
}
