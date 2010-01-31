$INCLUDE takeoff.uav     // Include The File 'takeoff.uav'
POS   X FIX -32.463      // 32.463 W Longitude
POS   Y FIX 78.754       // 78.754 N Latitude
TIM REL 3612.0           // 3612.0 s (1:00:12) Duration
FLY                      // Execute
POS   X FIX -32.463      // 32.463 W Longitude
POS   Y FIX 78.754       // 78.754 N Latitude
TIM REL 3612.0           // 3612.0 s (1:00:12) Duration
FLY                      // Execute
TIM REL 3612.0           // 3612.0 s (1:00:12) Duration
FLY                      // Execute
POS YAW FIX 202.5        // 202.5 deg Heading
SPD AIR FIX 7.3          // 7.3 m/s (16.33 mph) Air Speed
TIM REL 180.0            // 180.0 s (0:03:00) Duration
FLY                      // Execute
POS YAW FIX 242.0        // 242.0 deg Heading
SPD AIR OPT CRU          // Cruise Air Speed
TIM REL 600.0            // 600.0 s (0:10:00) Duration
POS   Z REL 15.24        // -15.24 m (-50.0 ft) Relative Altitude
FLY                      // Execute
POS   X FIX -98.433      // SANFORDSTADIUM / 98.433 W Longitude
POS   Y FIX 84.324       // SANFORDSTADIUM / 84.324 N Latitude
SPD AIR OPT MAX          // Maximum Air Speed
POS   Z FIX -7620.0      // 7620.0 m (25000.0 ft) Altitude
FLY                      // Execute
CMD 2                    // TAKEAPICTURE / Command #2
POS   X FIX -98.843      // BOYD / 98.843 W Longitude
POS   Y FIX 84.234       // BOYD / 84.234 N Latitude
ACT THR FIX 75.3         // 75.3% Throttle
FLY                      // Execute
CMD 2                    // TAKEAPICTURE / Command #2
DIR CW                   // Clockwise Loiter Direction
SPD AIR FIX 6.7056       // 6.7056 m/s (15.0 mph) Air Speed
TIM REL 37.0             // 37.0 s (0:00:37) Duration
LTR                      // Execute Loiter
POS   X FIX -98.823      // HOME / 98.823 W Longitude
POS   Y FIX 84.523       // HOME / 84.523 N Latitude
FLY                      // Execute
ACT THR FIX 0.0          // 0.0% Throttle
FLY                      // Execute
CMD 2                    // DEPLOYTHEPARACHUTE / Command #2
$INCLUDE land.uav        // Include The File 'land.uav'
