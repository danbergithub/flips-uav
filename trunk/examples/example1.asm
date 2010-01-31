$INCLUDE takeoff.uav     // Include The File 'takeoff.uav'
POS   Z FIX -60.96       // 60.96 m (200.0 ft) Altitude
SPD AIR OPT MAX          // Maximum Air Speed
FLY                      // Execute
POS YAW FIX 230.1        // 230.1 deg Heading
TIM REL 60.0             // 60.0 s (0:01:00) Duration
FLY                      // Execute
POS   X FIX -84.0252     // 84.0252 W Longitude
POS   Y FIX 35.8962      // 35.8962 N Latitude
SPD AIR FIX 11.176       // 11.176 m/s (25.0 mph) Air Speed
FLY                      // Execute
DIR CW                   // Clockwise Loiter Direction
POS   X FIX -84.0985     // 84.0985 W Longitude
POS   Y FIX 34.2623      // 34.2623 N Latitude
TIM REL 30.0             // 30.0 s (0:00:30) Duration
RAD 30.48                // 30.48 m (100.0 ft) Radius
LTR                      // Execute Loiter
POS YAW FIX 90.0         // 90.0 deg Heading
SPD AIR OPT CRU          // Cruise Air Speed
TIM REL 180.0            // 180.0 s (0:03:00) Duration
FLY                      // Execute
TIM REL 45.0             // 45.0 s (0:00:45) Duration
POS ROL FIX 20.0         // 20.0 deg Roll
POS PIT FIX 10.0         // 10.0 deg Pitch
FLY                      // Execute
POS   X FIX -84.2522     // 84.2522 W Longitude
POS   Y FIX 36.9852      // 36.9852 N Latitude
SPD AIR FIX 8.180832     // 8.180832 m/s (18.3 mph) Air Speed
FLY                      // Execute
POS   X FIX -84.25       // 84.25 W Longitude
POS   Y FIX 34.59        // 34.59 N Latitude
POS   X FIX -84.95       // 84.95 W Longitude
POS   Y FIX 34.52        // 34.52 N Latitude
POS   X FIX -84.89       // 84.89 W Longitude
POS   Y FIX 34.252       // 34.252 N Latitude
SPD AIR FIX 8.9408       // 8.9408 m/s (20.0 mph) Air Speed
FLY                      // Execute
POS   Z FIX -60.96       // 60.96 m (200.0 ft) Altitude
FLY                      // Execute
POS   X FIX -84.0252     // HOME / 84.0252 W Longitude
POS   Y FIX 35.8962      // HOME / 35.8962 N Latitude
SPD AIR FIX 6.7056       // 6.7056 m/s (15.0 mph) Air Speed
FLY                      // Execute
TIM REL 3600.0           // 3600.0 s (1:00:00) Duration
SPD AIR FIX 10.0         // 10.0 m/s (22.37 mph) Air Speed
POS   Z FIX -9.144       // 9.144 m (30.0 ft) Altitude
POS PIT FIX 10.0         // 10.0 deg Pitch
POS ROL FIX 5.0          // 5.0 deg Roll
FLY                      // Execute
TIM REL 120.0            // 120.0 s (0:02:00) Duration
POS   Z FIX -35.052      // 35.052 m (115.0 ft) Altitude
LTR                      // Execute Loiter
SPD AIR OPT MIN          // Minimum Air Speed
FLY                      // Execute
$INCLUDE land.uav        // Include The File 'land.uav'
