public class DistanceWaypointSymbol extends Symbol {
  double x;
  double y;
  
  public DistanceWaypointSymbol(String name) {
    super(name,
          new BuiltInTypeSymbol("waypoint"));
  }
  
  public DistanceWaypointSymbol(String name,
                                double x,
                                double y) {
    this(name);
    this.x = x;
    this.y = y;
  }
  
  public double getX() {
    return x;
  }
  
  public double getY() {
    return y;
  }
  
  public String getNorthSouth() {
    return y >= 0 ? "N" : "S";
  }

  public String getEastWest() {
    return x >= 0 ? "E" : "W";
  }
  
  public String toString() {
    return "<" + getName() + ":" + getType() + ":" + getX() + ":" + getY() + ">";
  }
}
