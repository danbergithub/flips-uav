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
#include "flipsdecode.c"

void ConfigureFLIPS() {
  FLIPS.Memory = FLIPSMemory[0]; // Assign main memory
  FLIPSBuffer.Memory = FLIPSMemory[1]; // Assign buffer memory
  FLIPS.PC = -1; // Reset the program counter
  FLIPSBuffer.PC = -1; // Reset the program counter
  FLIPS.Status = 0; // Halt
  FLIPSBuffer.Status = 0; // Buffer is not ready for processing
}

void FLIPSReceive(const uint_fast8_t instruction) {
  if (instruction == 0xAA) { // Beginning of the program
    FLIPSBuffer.PC = -1; // Reset the program counter
    FLIPSBuffer.Status = 0; // Buffer is not ready for processing
  }
  else if (instruction == 0xCC) { // Found a reserved character
    FLIPSBuffer.Status = 2; // Buffer is processing a reserved character
  }
  else if (FLIPSBuffer.Status == 2) { // Process the reserved character
    if (instruction == 0x00) {
      FLIPSBuffer.Memory[FLIPSBuffer.PC] = 0xAA; // Replace [0xCC 0x00] with [0xAA]
    }
    else if (instruction == 0x01) {
      FLIPSBuffer.Memory[FLIPSBuffer.PC] = 0xCC; // Replace [0xCC 0x01] with [0xCC]
    }
    else if (instruction == 0x02) {
      FLIPSBuffer.Memory[FLIPSBuffer.PC] = 0xFF; // Replace [0xCC 0x02] with [0xFF]
    }
    FLIPSBuffer.Status = 0; // Buffer is not ready for processing
    return;
  }
  else if (instruction == 0xFF) { // End of the program
    FLIPSBuffer.Status = 1; // Buffer is ready for processing
  }
  else {
    FLIPSBuffer.Status = 0; // Buffer is not ready for processing
  }
  FLIPSBuffer.Memory[++FLIPSBuffer.PC] = instruction; // Place the instruction into memory
}

void FLIPSExecute() {
  // Check the buffer for a new program
  if (FLIPSBuffer.Status == 1) {
    // Check to see if the new program is valid
    if (FLIPSChecksumValid()) {
      // Load the new program into main memory by swapping memory banks
      if (FLIPS.Memory == FLIPSMemory[0]) {
        FLIPS.Memory = FLIPSMemory[1];
        FLIPSBuffer.Memory = FLIPSMemory[0];
      }
      else {
        FLIPS.Memory = FLIPSMemory[0];
        FLIPSBuffer.Memory = FLIPSMemory[1];
      }
      FLIPS.PC = -1; // Reset the program counter
      FLIPS.Status = 0; // Halt
      FLIPS.IR = FLIPS.Memory[++FLIPS.PC]; // Instruction Fetch
      FLIPSDecode(); // Instruction Decode
    }
  }
  
  while (FLIPS.Status == 1) { // Continue
    FLIPS.IR = FLIPS.Memory[++FLIPS.PC]; // Instruction Fetch
    FLIPSDecode(); // Instruction Decode
  }
}

static uint_fast8_t FLIPSChecksumValid() {
  return 1;
}

static uint_fast32_t FLIPSLoadUInt32() {
  uint_fast32_t value = 0;
  
  value |= FLIPS.Memory[++FLIPS.PC] << 24;
  value |= FLIPS.Memory[++FLIPS.PC] << 16;
  value |= FLIPS.Memory[++FLIPS.PC] << 8;
  value |= FLIPS.Memory[++FLIPS.PC];
  
  return value;
}

static uint_fast16_t FLIPSLoadUInt16() {
  uint_fast16_t value = 0;
  
  value |= FLIPS.Memory[++FLIPS.PC] << 8;
  value |= FLIPS.Memory[++FLIPS.PC];
  
  return value;
}

static uint_fast8_t FLIPSLoadUInt8() {
  uint_fast8_t value = 0;
  
  value |= FLIPS.Memory[++FLIPS.PC];
  
  return value;
}

static float FLIPSLoadFloat() {
  uint_fast32_t value = FLIPSLoadUInt32();
  
  return *(float*)&value;
}
