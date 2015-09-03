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

### High-Level Code ###

A mission's syntax should be highly readable and easy to understand, without the complexity of a traditional programming language:

```
commands
  Normal = 0
  Takeoff = 1
  Inverted = 2
  Hover = 4
  RollLeft = 8
  RollRight = 16
  Trigger = 32
  Loiter = 64
  Land = 128
  LoiterAndLand = 192

waypoints
  Atlanta = 33.748995 -84.387982
  NewYork = 40.714269 -74.005973
  London = 51.00652 -0.126708

  SECorner = (100m, 0m)
  NECorner = (100m, 100m)
  NWCorner = (0m, 100m)
  SWCorner = (0m, 0m)

Takeoff
fly to Atlanta at 50 meters
Normal
fly to NewYork
fly at 1000 feet
Inverted
fly to London
fly to Atlanta at 250 feet

// waypoints.h Example Course
Normal
fly to SECorner at 75 meters
fly to NECorner
Inverted
fly to NWCorner
Normal
fly to SWCorner
LoiterAndLand
fly to (50m, 50m)
```

### Assembly Code ###

The mission is then compiled into the following primitive flight instructions:

```
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
```

### Binary Code ###

Which can then be compiled/compressed into binary code to be sent to the aircraft wirelessly:

```
170 = AA
1 = 1
5 -84.387982 = 5 C2 A8 C6 A6
8 33.748995 = 8 42 6 FE F9
9 -50.0 = 9 C2 48 0 0
1 = 1
0 = 0
5 -74.005973 = 5 C2 94 3 F
8 40.714269 = 8 42 22 DB 69
1 = 1
9 -304.8 = 9 C3 98 66 66
1 = 1
2 = 2
5 -0.126708 = 5 BE 1 BF BE
8 51.00652 = 8 42 4C 6 AD
1 = 1
5 -84.387982 = 5 C2 A8 C6 A6
8 33.748995 = 8 42 6 FE F9
9 -76.2 = 9 C2 98 66 66
1 = 1
0 = 0
3 100.0 = 3 42 C8 0 0
6 0.0 = 6 0 0 0 0
9 -75.0 = 9 C2 96 0 0
1 = 1
3 100.0 = 3 42 C8 0 0
6 100.0 = 6 42 C8 0 0
1 = 1
2 = 2
3 0.0 = 3 0 0 0 0
6 100.0 = 6 42 C8 0 0
1 = 1
0 = 0
3 0.0 = 3 0 0 0 0
6 0.0 = 6 0 0 0 0
1 = 1
192 = C0
3 50.0 = 3 42 48 0 0
6 50.0 = 6 42 48 0 0
1 = 1
255 = FF
```

### Compile-Time Code ###

Or it can be included as a fixed mission at compile-time in your code:

```
const struct waypointDef waypoints[] = {
                                         { { -843879819, 337489950, 50 } , 1 } ,
                                         { { -740059730, 407142690, 50 } , 0 } ,
                                         { { -740059730, 407142690, 304 } , 0 } ,
                                         { { -1267079, 510065200, 304 } , 2 } ,
                                         { { -843879819, 337489950, 76 } , 2 } ,
                                         { { 100, 0, 75 } , 0 } ,
                                         { { 100, 100, 75 } , 0 } ,
                                         { { 0, 100, 75 } , 2 } ,
                                         { { 0, 0, 75 } , 0 } ,
                                         { { 50, 50, 75 } , 192 } ,
                                       } ;
```

### Interpreter / Virtual Machine ###

Or the binary code can be interpreted in firmware and executed by the aircraft:

```
FLIPS: BEGIN PROGRAM
F_TAKEOFF
POS   X GEO -84.387985
POS   Y GEO 33.748997
POS   Z FIX -50.000000
FLY
F_NORMAL
POS   X GEO -74.005974
POS   Y GEO 40.714268
FLY
POS   Z FIX -304.799988
FLY
F_INVERTED
POS   X GEO -0.126708
POS   Y GEO 51.006519
FLY
POS   X GEO -84.387985
POS   Y GEO 33.748997
POS   Z FIX -76.199997
FLY
F_NORMAL
POS   X FIX 100.000000
POS   Y FIX 0.000000
POS   Z FIX -75.000000
FLY
POS   X FIX 100.000000
POS   Y FIX 100.000000
FLY
F_INVERTED
POS   X FIX 0.000000
POS   Y FIX 100.000000
FLY
F_NORMAL
POS   X FIX 0.000000
POS   Y FIX 0.000000
FLY
F_LOITER + F_LAND
POS   X FIX 50.000000
POS   Y FIX 50.000000
FLY
FLIPS: END PROGRAM
FLIPS: HALT
```