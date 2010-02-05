CMD 1                    // TAKEOFF / Command #1
POS   X GEO -84.387982   // ATLANTA / 84.387982 W Longitude
POS   Y GEO 33.748995    // ATLANTA / 33.748995 N Latitude
POS   Z FIX -50.0        // 50.0 m (164.04199475065616 ft) Altitude
FLY                      // Execute
CMD 0                    // NORMAL / Command #0
POS   X GEO -74.005973   // NEWYORK / 74.005973 W Longitude
POS   Y GEO 40.714269    // NEWYORK / 40.714269 N Latitude
FLY                      // Execute
POS   Z FIX -304.8       // 304.8 m (1000.0 ft) Altitude
FLY                      // Execute
CMD 2                    // INVERTED / Command #2
POS   X GEO -0.126708    // LONDON / 0.126708 W Longitude
POS   Y GEO 51.00652     // LONDON / 51.00652 N Latitude
FLY                      // Execute
POS   X GEO -84.387982   // ATLANTA / 84.387982 W Longitude
POS   Y GEO 33.748995    // ATLANTA / 33.748995 N Latitude
POS   Z FIX -76.2        // 76.2 m (250.0 ft) Altitude
FLY                      // Execute
CMD 0                    // NORMAL / Command #0
POS   X FIX 100.0        // SECORNER / 100.0 m (328.0839895013123 ft) E Distance
POS   Y FIX 0.0          // SECORNER / 0.0 m (0.0 ft) N Distance
POS   Z FIX -75.0        // 75.0 m (246.06299212598424 ft) Altitude
FLY                      // Execute
POS   X FIX 100.0        // NECORNER / 100.0 m (328.0839895013123 ft) E Distance
POS   Y FIX 100.0        // NECORNER / 100.0 m (328.0839895013123 ft) N Distance
FLY                      // Execute
CMD 2                    // INVERTED / Command #2
POS   X FIX 0.0          // NWCORNER / 0.0 m (0.0 ft) E Distance
POS   Y FIX 100.0        // NWCORNER / 100.0 m (328.0839895013123 ft) N Distance
FLY                      // Execute
CMD 0                    // NORMAL / Command #0
POS   X FIX 0.0          // SWCORNER / 0.0 m (0.0 ft) E Distance
POS   Y FIX 0.0          // SWCORNER / 0.0 m (0.0 ft) N Distance
FLY                      // Execute
CMD 192                  // LOITERANDLAND / Command #192
POS   X FIX 50.0         // 50.0 m (164.04199475065616 ft) E Distance
POS   Y FIX 50.0         // 50.0 m (164.04199475065616 ft) N Distance
FLY                      // Execute
