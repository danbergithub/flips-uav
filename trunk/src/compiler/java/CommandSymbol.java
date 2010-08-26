public class CommandSymbol extends Symbol {
  int value;
  int parameters;
  
  public CommandSymbol(String name) {
    super(name,
          new BuiltInTypeSymbol("command"));
  }
  
  public CommandSymbol(String name,
                       int value) {
    this(name);
    this.value = value;
  }
  
  public CommandSymbol(String name,
                       int value,
                       int parameters) {
    this(name,
         value);
    this.parameters = parameters;
  }
  
  public int getValue() {
    return value;
  }
  
  public int getParameters() {
    return parameters;
  }
  
  public String toString() {
    return "<" + getName() + ":" + getType() + ":" + getValue() + ":" + getParameters() + ">";
  }
}
