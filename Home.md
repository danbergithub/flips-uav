# FLIPS #

A Flight Instruction Processing System for Unmanned Aerial Vehicles

# What Is It? #

FLIPS is a programming language for defining UAV missions and flight behaviors. High-level missions are compiled into a hardware-independent instruction set architecture (ISA), which you can freely implement on your own UAV platforms. The goal is to provide a better layer of abstraction between the user and the flight hardware.

Here's how it works:

  1. The user will specify a mission in the high-level FLIPS language.
  1. The mission is compiled into FLIPS Assembly, which contains low-level flight instructions (according to the FLIPS ISA).
  1. The FLIPS Assembly code is then translated into hardware-specific radio packets, C/C++ code, etc. specific to your UAV platform.
  1. Your UAV platform implements the FLIPS ISA, which provides instructions to update PID control loop parameters, setpoints, actuator positions, flight sequences, conditional and repetitive flight behaviors, communications, sensors, and others.
  1. The UAV executes the mission.

Since the language is hardware-independent, you can share your missions with others; even if they are using different hardware. By developing a library of flight behaviors and missions, UAV projects using FLIPS can try out new missions and flight behaviors quickly and easily. The UAV community as a whole will benefit from a common library of mission-level code.

# What Does A Mission Look Like? #

A mission's syntax should be highly readable and easy to understand, without the complexity of a traditional programming language. Have a look:

```
waypoints
  SanfordStadium = 84.324n 98.433w
  Boyd = 84.234n 98.843w
  Home = 84.523n 98.823w

commands
  TakeAPicture = 0x01       // Command 1
  DeployTheParachute = 0b10 // Command 2

Takeoff
fly to 78.754n 32.463w for 1 hour 12 sec
fly to 78.754 -32.463 for 1:00:12
fly to 78d 45' n 32d 27' w for 3612s
fly ssw at 7.3m/s for 3 min
fly heading 242 deg at cruise speed for 10 minutes descending 50 ft
fly to SanfordStadium at max speed at fl250
TakeAPicture
fly to Boyd at 75.3% throttle
TakeAPicture
loiter clockwise at 15mph for 37 seconds
go to Home
fly at 0 percent power
DeployTheParachute
Land
```

The mission above is then compiled into the following flight instructions, which can be understood by the flight hardware:

```
$INCLUDE takeoff.uav     // Include Source File 'takeoff.uav'
POS   X GEO -32.463      // 32.463 W Longitude
POS   Y GEO 78.754       // 78.754 N Latitude
TIM REL 3612.0           // 3612.0 s (1:00:12) Duration
FLY                      // Execute
POS   X GEO -32.463      // 32.463 W Longitude
POS   Y GEO 78.754       // 78.754 N Latitude
TIM REL 3612.0           // 3612.0 s (1:00:12) Duration
FLY                      // Execute
POS   X GEO -32.45       // 32.45 W Longitude
POS   Y GEO 78.75        // 78.75 N Latitude
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
POS   X GEO -98.433      // SANFORDSTADIUM / 98.433 W Longitude
POS   Y GEO 84.324       // SANFORDSTADIUM / 84.324 N Latitude
SPD AIR OPT MAX          // Maximum Air Speed
POS   Z FIX -7620.0      // 7620.0 m (25000.0 ft) Altitude
FLY                      // Execute
CMD 1                    // TAKEAPICTURE / Command #1
POS   X GEO -98.843      // BOYD / 98.843 W Longitude
POS   Y GEO 84.234       // BOYD / 84.234 N Latitude
ACT THR FIX 75.3         // 75.3% Throttle
FLY                      // Execute
CMD 1                    // TAKEAPICTURE / Command #1
DIR CW                   // Clockwise Loiter Direction
SPD AIR FIX 6.7056       // 6.7056 m/s (15.0 mph) Air Speed
TIM REL 37.0             // 37.0 s (0:00:37) Duration
LTR                      // Execute Loiter
POS   X GEO -98.823      // HOME / 98.823 W Longitude
POS   Y GEO 84.523       // HOME / 84.523 N Latitude
FLY                      // Execute
ACT THR FIX 0.0          // 0.0% Throttle
FLY                      // Execute
CMD 2                    // DEPLOYTHEPARACHUTE / Command #2
$INCLUDE land.uav        // Include Source File 'land.uav'
```