import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class kml2flips {
  public static void main(String args[]) throws
                                         Exception {
    if (args.length == 0) {
      System.out.println("Usage: ./kml2flips <filename>");
    }
    else {
      try {
        convert(args[0]);
      }
      catch (IOException ex) {
        System.out.println("File not found.");
      }
    }
  }
  
  public static void convert(String filename) throws
                                              Exception {
    // Read the KML file
    StringBuffer buffer = new StringBuffer(1024);
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    char[] chars = new char[1024];
    int numRead = 0;
    while ((numRead = reader.read(chars)) != -1) {
      String data = String.valueOf(chars, 0, numRead);
      buffer.append(data);
      chars = new char[1024];
    }
    reader.close();
    
    // Configure output strings
    StringBuilder waypoints = new StringBuilder();
    StringBuilder statements = new StringBuilder();
    StringBuilder inline = new StringBuilder();
    int waypointCount = 0;
    
    // Find the coordinates
    Pattern pattern = Pattern.compile("(-?\\d*(.\\d*)?,){2}-?\\d*(.\\d*)?\\s");
    Matcher matcher = pattern.matcher(buffer.toString());
    while (matcher.find()) {
      waypointCount++;
      String[] coord = matcher.group().split(",");
      waypoints.append("Waypoint" + waypointCount + " = " + coord[1] + " " + coord[0] + "\n");
      statements.append("fly to Waypoint" + waypointCount);
      inline.append("fly to " + coord[1] + " " + coord[0]);
      if (!coord[2].equals("0 ")) {
        statements.append(" at " + coord[2].trim() + "m");
        inline.append(" at " + coord[2].trim() + "m");
      }
      statements.append("\n");
      inline.append("\n");
    }
    
    // System.out.println(waypoints.toString());
    // System.out.println(statements.toString());
    System.out.println(inline.toString());
  }
}
