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

#ifndef FLIPS_H
#define FLIPS_H

#include <inttypes.h>

typedef struct {
  volatile uint_fast8_t *Memory; // Memory Bank Pointer
  uint_fast16_t PC; // Program Counter
  uint_fast8_t Status; // Processing Status
} FLIPSBufferData;

typedef struct {
  volatile uint_fast8_t *Memory; // Memory Bank Pointer
  uint_fast16_t PC; // Program Counter
  uint_fast8_t IR; // Instruction Register
  uint_fast32_t Register[8]; // 8 32-bit Integer Registers
  float RegisterFP[8]; // 8 Floating-Point Registers
  uint_fast8_t Status; // Processing Status
} FLIPSProcessorData;

volatile uint_fast8_t FLIPSMemory[2][4096]; // 2 4KB Memory Banks

volatile FLIPSProcessorData FLIPS;
volatile FLIPSBufferData FLIPSBuffer;

void ConfigureFLIPS();
void FLIPSReceive(const uint_fast8_t instruction);
void FLIPSExecute();
static void FLIPSDecode();
static uint_fast8_t FLIPSChecksumValid();

static uint_fast32_t FLIPSLoadUInt32();
static uint_fast16_t FLIPSLoadUInt16();
static uint_fast8_t FLIPSLoadUInt8();
static float FLIPSLoadFloat();

#endif
