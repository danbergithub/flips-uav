#ifndef FLIPS_H
#define FLIPS_H

#include <inttypes.h>

typedef struct {
  uint_fast8_t Memory[4096]; // Memory
  uint_fast16_t PC; // Program Counter
} FLIPSData;

volatile FLIPSData FLIPSMemory0;
volatile FLIPSData FLIPSMemory1;
volatile FLIPSData *FLIPS;
volatile FLIPSData *FLIPSBuffer;
volatile uint_fast8_t FLIPSBufferReady;

void ConfigureFLIPS();
void FLIPSReceive(const uint_fast8_t instruction);
void FLIPSExecute();
static uint_fast8_t FLIPSChecksumValid();

static uint_fast32_t FLIPSLoadUInt32();
static uint_fast16_t FLIPSLoadUInt16();
static uint_fast8_t FLIPSLoadUInt8();
static float FLIPSLoadFloat();

static uint_fast32_t FLIPSLoadUInt32PC(volatile uint_fast16_t *PC);
static uint_fast16_t FLIPSLoadUInt16PC(volatile uint_fast16_t *PC);
static uint_fast8_t FLIPSLoadUInt8PC(volatile uint_fast16_t *PC);
static float FLIPSLoadFloatPC(volatile uint_fast16_t *PC);

#endif
