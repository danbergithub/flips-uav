import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import java.io.IOException;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class flipsCompilerUI extends JFrame {
  StatusBar statusBar = new StatusBar();
  JTextArea sourceCode = new JTextArea();
  JTextArea assemblyCode = new JTextArea();
  Font courier = new Font("Courier",
                          Font.PLAIN, 
                          12);
  
  public static void main(String[] args) throws Exception {
    flipsCompilerUI win = new flipsCompilerUI();
    win.setSize(800, 600);
    win.setExtendedState(Frame.MAXIMIZED_BOTH);  
    win.setVisible(true);
  }
  
  public flipsCompilerUI() {
    // Initialize text areas
    sourceCode.setText(getSourceCodeSample());
    assemblyCode.setText("");
    sourceCode.setFont(courier);
    assemblyCode.setFont(courier);
    
    // Create scrolling areas
    JScrollPane sourceCodeArea = new JScrollPane(sourceCode);
    JScrollPane assemblyCodeArea = new JScrollPane(assemblyCode);
    
    // Add the scroll areas
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                          true,
                                          sourceCodeArea,
                                          assemblyCodeArea);
    splitPane.setOneTouchExpandable(true);
    splitPane.setDividerLocation(400);
    splitPane.setResizeWeight(0.5);
    this.getContentPane().add(splitPane,
                              BorderLayout.CENTER);
    
    // Add the compile button
    JButton compileButton = new JButton("Compile");
    compileButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          assemblyCode.setText(compile(sourceCode.getText()));
        }
        catch (Exception ex) {
          assemblyCode.setText(ex.getMessage());
        }
      }
    }); 
    this.getContentPane().add(compileButton,
                              BorderLayout.NORTH);
    
    // Add the status bar
    this.getContentPane().add(statusBar,
                              BorderLayout.SOUTH);
    
    // Set window properties
    this.setTitle("FLIPS Compiler");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setMinimumSize(new Dimension(200, 200));
    this.pack();
  }
  
  public class StatusBar extends JLabel {
    
    public StatusBar() {
      super();
      super.setPreferredSize(new Dimension(200, 16));
      setStatus("Ready");
    }
    
    public void setStatus(String status) {
      setText(" " + status);
    }
  }
  
  public static String getSourceCodeSample() {
    StringBuilder builder = new StringBuilder();
    
    builder.append("fly north at 10 m/s");
    
    return builder.toString();
  }
    
  public static String compile(String sourceCode) throws Exception {
    // File Input
    CharStream input = new ANTLRStringStream(sourceCode);
    
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
