CMD 1                    // ENABLECAMERA / Command #1
POS   X GEO -84.376091   // ATLANTA / 84.376091 W Longitude
POS   Y GEO 33.884245    // ATLANTA / 33.884245 N Latitude
FLY                      // Execute
CMD 3                    // TAKEAPICTURE / Command #3
CMD 5                    // SENDPICTURECONFIRMATION / Command #5
POS YAW FIX 0.0          // 0.0 deg Heading
TIM REL 28.5             // 28.5 s (0:00:28.500) Duration
FLY                      // Execute
CMD PAR 180.0            // 180.0 Command Parameter
CMD 4                    // PANCAMERA / Command #4
CMD 3                    // TAKEAPICTURE / Command #3
CMD 5                    // SENDPICTURECONFIRMATION / Command #5
CMD 2                    // DISABLECAMERA / Command #2
