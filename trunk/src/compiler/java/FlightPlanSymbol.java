import java.io.IOException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class FlightPlanSymbol extends Symbol {
  String filename;
  
  public FlightPlanSymbol(String name,
                          String filename) {
    super(name,
          new BuiltInTypeSymbol("flightplan"));
    this.filename = filename;
    
    // Remove double quotes contained in the filename token
    if (filename != null) {
      this.filename = filename.replace("\"","");
    }
  }
  
  public String getFilename() {
    return filename;
  }
  
  public String compile() throws IOException,
                                 RecognitionException {
    // Read file
    CharStream input = new ANTLRFileStream(getFilename());
    
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
    
    return walker.output.toString().trim();
  }
  
  public String toString() {
    if (filename != null) {
      return "<" + getName() + ":" + getType() + ":\"" + getFilename() + "\"" + ">";
    }
    
    return super.toString();
  }
}
