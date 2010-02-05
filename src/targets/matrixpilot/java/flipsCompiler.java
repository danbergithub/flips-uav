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
    System.out.println("Generating assembly code...");
    
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
    
    // Assembly Output
    try {
      BufferedWriter channel = new BufferedWriter(new FileWriter(filename + ".asm"));
      channel.write(walker.output.toString());
      channel.close();
    }
    catch (IOException e) {}
    
    System.out.println(walker.output.toString());
    
    System.out.println("Generating binary code...");
    
    // File Input
    CharStream input2 = new ANTLRFileStream(filename + ".asm");
    
    // Assembly Lexer
    flipsMatrixPilotLexer lex2 = new flipsMatrixPilotLexer(input2);
    CommonTokenStream tokens2 = new CommonTokenStream(lex2);
    
    // Assembly Parser and Code Generator
    flipsMatrixPilotParser parser2 = new flipsMatrixPilotParser(tokens2);
    parser2.flightPlan();
    
    // Binary Output
    try {
      FileChannel channel = new FileOutputStream(filename + ".bin",false).getChannel();
      channel.write(parser2.output);
      channel.close();
    }
    catch (IOException e) {}
    
    System.out.println();
    System.out.println("Generating waypoints.h file...");
    
    // waypoints.h Output
    try {
      BufferedWriter channel = new BufferedWriter(new FileWriter(filename + ".h"));
      channel.write(parser2.waypoints.toString());
      channel.close();
    }
    catch (IOException e) {}
    
    System.out.println(parser2.waypoints.toString());
  }
}
