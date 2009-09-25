/*
 Copyright (c) 2007-2009 Robert Eunice
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
    
    case 89: // TOF
      printf("TOF\n");
      break;
      
    case 90: // FLY
      printf("FLY\n");
      break;
      
    case 91: // LTR
      printf("LTR\n");
      break;
      
    case 92: { // CMD value
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
      
    case 93: // LND
      printf("LND\n");
      break;
      
    // POSITION INSTRUCTIONS
    
    case 1: // POS X FIX value
      PositionX.Desired = FLIPSLoadFloat();
      printf("POS   X FIX %f\n", PositionX.Desired);
      break;
      
    case 2: // POS X REL value
      PositionX.Desired += FLIPSLoadFloat();
      printf("POS   X REL %f\n", PositionX.Desired);
      break;
      
    case 3: // POS Y FIX value
      PositionY.Desired = FLIPSLoadFloat();
      printf("POS   Y FIX %f\n", PositionY.Desired);
      break;
      
    case 4: // POS Y REL value
      PositionY.Desired += FLIPSLoadFloat();
      printf("POS   Y REL %f\n", PositionY.Desired);
      break;
      
    case 5: // POS Z FIX value
      PositionZ.Desired = FLIPSLoadFloat();
      printf("POS   Z FIX %f\n", PositionZ.Desired);
      break;
      
    case 6: // POS Z REL value
      PositionZ.Desired += FLIPSLoadFloat();
      printf("POS   Z REL %f\n", PositionZ.Desired);
      break;
      
    case 7: // POS ROL FIX value
      PositionRoll.Desired = FLIPSLoadFloat();
      printf("POS ROL FIX %f\n", PositionRoll.Desired);
      break;
      
    case 8: // POS ROL REL value
      PositionRoll.Desired += FLIPSLoadFloat();
      printf("POS ROL REL %f\n", PositionRoll.Desired);
      break;
      
    case 9: // POS PIT FIX value
      PositionPitch.Desired = FLIPSLoadFloat();
      printf("POS PIT FIX %f\n", PositionPitch.Desired);
      break;
      
    case 10: // POS PIT REL value
      PositionPitch.Desired += FLIPSLoadFloat();
      printf("POS PIT REL %f\n", PositionPitch.Desired);
      break;
      
    case 11: // POS YAW FIX value
      PositionYaw.Desired = FLIPSLoadFloat();
      printf("POS YAW FIX %f\n", PositionYaw.Desired);
      break;
      
    case 12: // POS YAW REL value
      PositionYaw.Desired += FLIPSLoadFloat();
      printf("POS YAW REL %f\n", PositionYaw.Desired);
      break;
      
    case 13: // POS PRE FIX value
      PositionPressure.Desired = FLIPSLoadFloat();
      printf("POS PRE FIX %f\n", PositionPressure.Desired);
      break;
      
    case 14: // POS PRE REL value
      PositionPressure.Desired += FLIPSLoadFloat();
      printf("POS PRE REL %f\n", PositionPressure.Desired);
      break;
      
    // VELOCITY INSTRUCTIONS
    
    case 15: // VEL X FIX value
      VelocityX.Desired = FLIPSLoadFloat();
      printf("VEL   X FIX %f\n", VelocityX.Desired);
      break;
      
    case 16: // VEL X REL value
      VelocityX.Desired += FLIPSLoadFloat();
      printf("VEL   X REL %f\n", VelocityX.Desired);
      break;
      
    case 17: // VEL X OPT MIN
      printf("VEL   X OPT MIN\n");
      break;
      
    case 18: // VEL X OPT CRU
      printf("VEL   X OPT CRU\n");
      break;
      
    case 19: // VEL X OPT MAX
      printf("VEL   X OPT MAX\n");
      break;
      
    case 20: // VEL Y FIX value
      VelocityY.Desired = FLIPSLoadFloat();
      printf("VEL   Y FIX %f\n", VelocityY.Desired);
      break;
      
    case 21: // VEL Y REL value
      VelocityY.Desired += FLIPSLoadFloat();
      printf("VEL   Y REL %f\n", VelocityY.Desired);
      break;
      
    case 22: // VEL Y OPT MIN
      printf("VEL   Y OPT MIN\n");
      break;
      
    case 23: // VEL Y OPT CRU
      printf("VEL   Y OPT CRU\n");
      break;
      
    case 24: // VEL Y OPT MAX
      printf("VEL   Y OPT MAX\n");
      break;
      
    case 25: // VEL Z FIX value
      VelocityZ.Desired = FLIPSLoadFloat();
      printf("VEL   Z FIX %f\n", VelocityZ.Desired);
      break;
      
    case 26: // VEL Z REL value
      VelocityZ.Desired += FLIPSLoadFloat();
      printf("VEL   Z REL %f\n", VelocityZ.Desired);
      break;
      
    case 27: // VEL Z OPT MIN
      printf("VEL   Z OPT MIN\n");
      break;
      
    case 28: // VEL Z OPT CRU
      printf("VEL   Z OPT CRU\n");
      break;
      
    case 29: // VEL Z OPT MAX
      printf("VEL   Z OPT MAX\n");
      break;
      
    case 30: // VEL ROL FIX value
      VelocityRoll.Desired = FLIPSLoadFloat();
      printf("VEL ROL FIX %f\n", VelocityRoll.Desired);
      break;
      
    case 31: // VEL ROL REL value
      VelocityRoll.Desired += FLIPSLoadFloat();
      printf("VEL ROL REL %f\n", VelocityRoll.Desired);
      break;
      
    case 32: // VEL ROL OPT MIN
      printf("VEL ROL OPT MIN\n");
      break;
      
    case 33: // VEL ROL OPT CRU
      printf("VEL ROL OPT CRU\n");
      break;
      
    case 34: // VEL ROL OPT MAX
      printf("VEL ROL OPT MAX\n");
      break;
      
    case 35: // VEL PIT FIX value
      VelocityPitch.Desired = FLIPSLoadFloat();
      printf("VEL PIT FIX %f\n", VelocityPitch.Desired);
      break;
      
    case 36: // VEL PIT REL value
      VelocityPitch.Desired += FLIPSLoadFloat();
      printf("VEL PIT REL %f\n", VelocityPitch.Desired);
      break;
      
    case 37: // VEL PIT OPT MIN
      printf("VEL PIT OPT MIN\n");
      break;
      
    case 38: // VEL PIT OPT CRU
      printf("VEL PIT OPT CRU\n");
      break;
      
    case 39: // VEL PIT OPT MAX
      printf("VEL PIT OPT MAX\n");
      break;
      
    case 40: // VEL YAW FIX value
      VelocityYaw.Desired = FLIPSLoadFloat();
      printf("VEL YAW FIX %f\n", VelocityYaw.Desired);
      break;
      
    case 41: // VEL YAW REL value
      VelocityYaw.Desired += FLIPSLoadFloat();
      printf("VEL YAW REL %f\n", VelocityYaw.Desired);
      break;
      
    case 42: // VEL YAW OPT MIN
      printf("VEL YAW OPT MIN\n");
      break;
      
    case 43: // VEL YAW OPT CRU
      printf("VEL YAW OPT CRU\n");
      break;
      
    case 44: // VEL YAW OPT MAX
      printf("VEL YAW OPT MAX\n");
      break;
      
    case 45: // VEL PRE FIX value
      VelocityPressure.Desired = FLIPSLoadFloat();
      printf("VEL PRE FIX %f\n", VelocityPressure.Desired);
      break;
      
    case 46: // VEL PRE REL value
      VelocityPressure.Desired += FLIPSLoadFloat();
      printf("VEL PRE REL %f\n", VelocityPressure.Desired);
      break;
      
    // SPEED INSTRUCTIONS
    
    case 47: // SPD AIR FIX value
      SpeedAir.Desired = FLIPSLoadFloat();
      printf("SPD AIR FIX %f\n", SpeedAir.Desired);
      break;
      
    case 48: // SPD AIR REL value
      SpeedAir.Desired += FLIPSLoadFloat();
      printf("SPD AIR REL %f\n", SpeedAir.Desired);
      break;
      
    case 49: // SPD AIR OPT MIN
      printf("SPD AIR OPT MIN\n");
      break;
      
    case 50: // SPD AIR OPT CRU
      printf("SPD AIR OPT CRU\n");
      break;
      
    case 51: // SPD AIR OPT MAX
      printf("SPD AIR OPT MAX\n");
      break;
      
    case 52: // SPD GND FIX value
      SpeedGround.Desired = FLIPSLoadFloat();
      printf("SPD GND FIX %f\n", SpeedGround.Desired);
      break;
      
    case 53: // SPD GND REL value
      SpeedGround.Desired += FLIPSLoadFloat();
      printf("SPD GND REL %f\n", SpeedGround.Desired);
      break;
      
    case 54: // SPD GND OPT MIN
      printf("SPD GND OPT MIN\n");
      break;
      
    case 55: // SPD GND OPT CRU
      printf("SPD GND OPT CRU\n");
      break;
      
    case 56: // SPD GND OPT MAX
      printf("SPD GND OPT MAX\n");
      break;
      
    // ACTUATOR INSTRUCTIONS
    
    case 57: // ACT ELE FIX value
      Elevator.Desired = FLIPSLoadFloat();
      printf("ACT ELE FIX %f\n", Elevator.Desired);
      break;
      
    case 58: // ACT ELE REL value
      Elevator.Desired += FLIPSLoadFloat();
      printf("ACT ELE REL %f\n", Elevator.Desired);
      break;
      
    case 59: // ACT ELE OPT
      printf("ACT ELE OPT\n");
      break;
      
    case 60: // ACT AIL FIX value
      Aileron.Desired = FLIPSLoadFloat();
      printf("ACT AIL FIX %f\n", Aileron.Desired);
      break;
      
    case 61: // ACT AIL REL value
      Aileron.Desired += FLIPSLoadFloat();
      printf("ACT AIL REL %f\n", Aileron.Desired);
      break;
      
    case 62: // ACT AIL OPT
      printf("ACT AIL OPT\n");
      break;
      
    case 63: // ACT RUD FIX value
      Rudder.Desired = FLIPSLoadFloat();
      printf("ACT RUD FIX %f\n", Rudder.Desired);
      break;
      
    case 64: // ACT RUD REL value
      Rudder.Desired += FLIPSLoadFloat();
      printf("ACT RUD REL %f\n", Rudder.Desired);
      break;
      
    case 65: // ACT RUD OPT
      printf("ACT RUD OPT\n");
      break;
      
    case 66: // ACT FLA FIX value
      Flap.Desired = FLIPSLoadFloat();
      printf("ACT FLA FIX %f\n", Flap.Desired);
      break;
      
    case 67: // ACT FLA REL value
      Flap.Desired += FLIPSLoadFloat();
      printf("ACT FLA REL %f\n", Flap.Desired);
      break;
      
    case 68: // ACT FLA OPT
      printf("ACT FLA OPT\n");
      break;
      
    case 69: // ACT THR FIX value
      Throttle.Desired = FLIPSLoadFloat();
      printf("ACT THR FIX %f\n", Throttle.Desired);
      break;
      
    case 70: // ACT THR REL value
      Throttle.Desired += FLIPSLoadFloat();
      printf("ACT THR REL %f\n", Throttle.Desired);
      break;
      
    case 71: // ACT THR OPT
      printf("ACT THR OPT\n");
      break;
      
    // TRIM INSTRUCTIONS
    
    case 72: // TRI ELE FIX value
      Elevator.Trim = FLIPSLoadFloat();
      printf("TRI ELE FIX %f\n", Elevator.Trim);
      break;
      
    case 73: // TRI ELE REL value
      Elevator.Trim += FLIPSLoadFloat();
      printf("TRI ELE REL %f\n", Elevator.Trim);
      break;
      
    case 74: // TRI AIL FIX value
      Aileron.Trim = FLIPSLoadFloat();
      printf("TRI AIL FIX %f\n", Aileron.Trim);
      break;
      
    case 75: // TRI AIL REL value
      Aileron.Trim += FLIPSLoadFloat();
      printf("TRI AIL REL %f\n", Aileron.Trim);
      break;
      
    case 76: // TRI RUD FIX value
      Rudder.Trim = FLIPSLoadFloat();
      printf("TRI RUD FIX %f\n", Rudder.Trim);
      break;
      
    case 77: // TRI RUD REL value
      Rudder.Trim += FLIPSLoadFloat();
      printf("TRI RUD REL %f\n", Rudder.Trim);
      break;
      
    case 78: // TRI FLA FIX value
      Flap.Trim = FLIPSLoadFloat();
      printf("TRI FLA FIX %f\n", Flap.Trim);
      break;
      
    case 79: // TRI FLA REL value
      Flap.Trim += FLIPSLoadFloat();
      printf("TRI FLA REL %f\n", Flap.Trim);
      break;
      
    case 80: // TRI THR FIX value
      Throttle.Trim = FLIPSLoadFloat();
      printf("TRI THR FIX %f\n", Throttle.Trim);
      break;
      
    case 81: // TRI THR REL value
      Throttle.Trim += FLIPSLoadFloat();
      printf("TRI THR REL %f\n", Throttle.Trim);
      break;
      
    // TIME INSTRUCTIONS
    
    case 82: // TIM FIX value
      printf("TIM FIX %f\n", FLIPSLoadFloat());
      break;
      
    case 83: // TIM REL value
      printf("TIM REL %f\n", FLIPSLoadFloat());
      break;
      
    case 84: // RAD value
      printf("RAD %f\n", FLIPSLoadFloat());
      break;
      
    case 85: // DIR L
      printf("DIR L\n");
      break;
      
    case 86: // DIR R
      printf("DIR R\n");
      break;
      
    case 87: // DIR CW
      printf("DIR CW\n");
      break;
      
    case 88: // DIR CCW
      printf("DIR CCW\n");
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
