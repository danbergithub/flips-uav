$INCLUDE Takeoff.uav     // Include Source File 'Takeoff.uav'
POS   X GEO 32.463       // 32.463 E Longitude
POS   Y GEO 78.754       // 78.754 N Latitude
TIM REL 3612.0           // 3612.0 s (1:00:12) Duration
FLY                      // Execute
POS YAW FIX 202.5        // 202.5 deg Heading
SPD AIR FIX 7.3          // 7.3 m/s (16.33 mph) Air Speed
TIM REL 180.0            // 180.0 s (0:03:00) Duration
FLY                      // Execute
POS YAW FIX 242.0        // 242.0 deg Heading
SPD AIR OPT CRU          // Cruise Air Speed
POS   Z REL 15.24        // -15.24 m (-50.0 ft) Relative Altitude
TIM REL 600.0            // 600.0 s (0:10:00) Duration
FLY                      // Execute
SPD AIR OPT MAX          // Maximum Air Speed
POS   Z FIX -7620.0      // 7620.0 m (25000.0 ft) Altitude
POS   X GEO -122.176229  // LAKELAG / 122.176229 W Longitude
POS   Y GEO 37.42254297  // LAKELAG / 37.42254297 N Latitude
FLY                      // Execute
CMD 1                    // TAKEAPICTURE / Command #1
ACT THR FIX 75.3         // 75.3% Throttle
POS   X GEO -122.168719  // HISTORYCORNER / 122.168719 W Longitude
POS   Y GEO 37.428149    // HISTORYCORNER / 37.428149 N Latitude
FLY                      // Execute
CMD 1                    // TAKEAPICTURE / Command #1
DIR CW                   // Clockwise Loiter Direction
SPD AIR FIX 6.7056       // 6.7056 m/s (15.0 mph) Air Speed
TIM REL 37.0             // 37.0 s (0:00:37) Duration
LTR                      // Execute Loiter
POS   X GEO 98.823       // HOME / 98.823 E Longitude
POS   Y GEO 84.523       // HOME / 84.523 N Latitude
FLY                      // Execute
ACT THR FIX 0.0          // 0.0% Throttle
FLY                      // Execute
CMD 2                    // DEPLOYTHEPARACHUTE / Command #2
$INCLUDE Land.uav        // Include Source File 'Land.uav'
