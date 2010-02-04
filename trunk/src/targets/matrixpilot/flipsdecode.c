/*
 Copyright (c) 2007-2010 Robert Eunice
 All rights reserved.
 
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
 notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
 notice, this list of conditions and the following disclaimer in the
 documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
 derived from this software without specific prior written permission.
 
 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

#include "flips.h"
#include <inttypes.h>
#include <stdio.h>

typedef struct {
  uint_fast8_t Enabled; // Enabled/Disabled
  float Desired; // Desired Value
} ControllerData;

static volatile ControllerData PositionX;
static volatile ControllerData PositionY;
static volatile ControllerData PositionZ;
static volatile ControllerData PositionRoll;
static volatile ControllerData PositionPitch;
static volatile ControllerData PositionYaw;
static volatile ControllerData PositionPressure;

static volatile ControllerData VelocityX;
static volatile ControllerData VelocityY;
static volatile ControllerData VelocityZ;
static volatile ControllerData VelocityRoll;
static volatile ControllerData VelocityPitch;
static volatile ControllerData VelocityYaw;
static volatile ControllerData VelocityPressure;

static volatile ControllerData SpeedAir;
static volatile ControllerData SpeedGround;

typedef struct {
  float Desired; // Desired Position
  float Trim; // Actual Position
} ActuatorData;

static volatile ActuatorData Elevator;
static volatile ActuatorData Aileron;
static volatile ActuatorData Rudder;
static volatile ActuatorData Flap;
static volatile ActuatorData Throttle;

static void FLIPSDecode() {
  // Instruction Decode
  switch (FLIPS.IR) {
    
    // RESERVED INSTRUCTIONS
    
    case 0xAA: // BEGIN PROGRAM
      printf("FLIPS: BEGIN PROGRAM\n");
      FLIPS.Status = 1; // Continue
      break;
      
    case 0xFF: // END PROGRAM
      printf("FLIPS: END PROGRAM\n");
      FLIPS.Status = 0; // Halt
      break;
      
    // GENERAL INSTRUCTIONS
      
    case 1: // FLY
      printf("FLY\n");
      break;
      
    case 2: { // CMD value
      uint_fast16_t command = FLIPSLoadUInt16();
      printf("CMD %d\n", command);
      
      // Command Decode
      switch (command) {
        default:
          printf("FLIPS: UNKNOWN COMMAND\n");
          FLIPS.Status = 1; // Continue
          break;
      }
      
      break;
    }
      
    // POSITION INSTRUCTIONS
    
    case 3: // POS X FIX value
      PositionX.Desired = FLIPSLoadFloat();
      printf("POS   X FIX %f\n", PositionX.Desired);
      break;
      
    case 4: // POS X REL value
      PositionX.Desired += FLIPSLoadFloat();
      printf("POS   X REL %f\n", PositionX.Desired);
      break;
      
    case 5: // POS Y FIX value
      PositionY.Desired = FLIPSLoadFloat();
      printf("POS   Y FIX %f\n", PositionY.Desired);
      break;
      
    case 6: // POS Y REL value
      PositionY.Desired += FLIPSLoadFloat();
      printf("POS   Y REL %f\n", PositionY.Desired);
      break;
      
    case 7: // POS Z FIX value
      PositionZ.Desired = FLIPSLoadFloat();
      printf("POS   Z FIX %f\n", PositionZ.Desired);
      break;
      
    case 8: // POS Z REL value
      PositionZ.Desired += FLIPSLoadFloat();
      printf("POS   Z REL %f\n", PositionZ.Desired);
      break;
      
    case 9: // POS PRE FIX value
      PositionPressure.Desired = FLIPSLoadFloat();
      printf("POS PRE FIX %f\n", PositionPressure.Desired);
      break;
      
    case 10: // POS PRE REL value
      PositionPressure.Desired += FLIPSLoadFloat();
      printf("POS PRE REL %f\n", PositionPressure.Desired);
      break;
      
    // UNKNOWN INSTRUCTIONS
    
    default:
      printf("FLIPS: UNKNOWN INSTRUCTION\n");
      FLIPS.Status = 1; // Continue
      break;
  }
  
  if (FLIPS.Status == 0) {
    printf("FLIPS: HALT\n");
  }
}
