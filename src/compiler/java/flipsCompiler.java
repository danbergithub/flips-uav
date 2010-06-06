import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class flipsCompiler {
  public static void main(String args[]) throws
                                         Exception {
    if (args.length == 0) {
      System.out.println("Usage: ./flips <filename>");
    }
    else {
      try {
        System.out.print(compile(args[0]));
      }
      catch (IOException ex) {
        System.out.println("File not found.");
      }
    }
  }

  public static String compile(String filename) throws
                                                Exception {
    // File Input
    CharStream input = new ANTLRFileStream(filename);
    
    // Lexer
    flipsLexer lex = new flipsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    
    // Parser and AST Construction
    flipsParser parser = new flipsParser(tokens);
    flipsParser.flightPlan_return root = parser.flightPlan();
    CommonTree tree = root.tree;
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    
    // Semantic Check and Unit Conversion
    flipsAssembly walker = new flipsAssembly(nodes);
    walker.flightPlan();
    
    return walker.output.toString();
  }
}

