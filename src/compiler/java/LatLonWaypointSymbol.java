public class LatLonWaypointSymbol extends Symbol {
  double latitude;
  double longitude;
  
  public LatLonWaypointSymbol(String name) {
    super(name,
          new BuiltInTypeSymbol("waypoint"));
  }
  
  public LatLonWaypointSymbol(String name,
                              double latitude,
                              double longitude) {
    this(name);
    this.latitude = latitude;
    this.longitude = longitude;
  }
  
  public double getLatitude() {
    return latitude;
  }
  
  public double getLongitude() {
    return longitude;
  }
  
  public String getNorthSouth() {
    return latitude >= 0 ? "N" : "S";
  }

  public String getEastWest() {
    return longitude >= 0 ? "E" : "W";
  }
  
  public String toString() {
    return "<" + getName() + ":" + getType() + ":" + getLatitude() + ":" + getLongitude() + ">";
  }
}
