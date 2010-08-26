import java.util.Map;
import java.util.HashMap;

public class SymbolTable implements Scope {
  Map<String, Symbol> symbols = new HashMap<String, Symbol>();
  
  public SymbolTable() {
    initTypeSystem();
  }
  
  protected void initTypeSystem() {
    define(new BuiltInTypeSymbol("flightplan"));
    define(new BuiltInTypeSymbol("command"));
    define(new BuiltInTypeSymbol("sensor"));
    define(new BuiltInTypeSymbol("waypoint"));
    define(new BuiltInTypeSymbol("altitude"));
    define(new BuiltInTypeSymbol("pressure"));
    define(new BuiltInTypeSymbol("distance"));
    define(new BuiltInTypeSymbol("speed"));
    define(new BuiltInTypeSymbol("throttle"));
    define(new BuiltInTypeSymbol("time"));
    define(new BuiltInTypeSymbol("duration"));
    define(new BuiltInTypeSymbol("angularrate"));
    define(new BuiltInTypeSymbol("angle"));
    define(new BuiltInTypeSymbol("percent"));
  }

  public String getScopeName() {
    return "global";
  }
  
  public Scope getEnclosingScope() {
    return null;
  }
  
  public void define(Symbol symbol) {
    symbols.put(symbol.name,
                symbol);
  }
  
  public Symbol resolve(String name) {
    return symbols.get(name);
  }
  
  public String toString() {
    return getScopeName() + ":" + symbols;
  }
}
