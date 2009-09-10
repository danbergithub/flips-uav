#include <stdio.h>

unsigned char CommGetChar() {
  return 0x01;
}

unsigned char CommGetChar0() {
  return 0x3F;
}

unsigned char CommGetChar1() {
  return 0x9E;
}

unsigned char CommGetChar2() {
  return 0x06;
}

unsigned char CommGetChar3() {
  return 0x52;
}

unsigned int CommGetUnsignedInt() {
  unsigned int value = 0;
  
  value |= CommGetChar0() << 24;
  value |= CommGetChar1() << 16;
  value |= CommGetChar2() << 8;
  value |= CommGetChar3();
  
  return value;
}

float CommGetFloat() {
  unsigned int value = 0;
  
  value |= CommGetChar0() << 24;
  value |= CommGetChar1() << 16;
  value |= CommGetChar2() << 8;
  value |= CommGetChar3();
  
  return *(float*)&value;
}

void ParseFLIPS() {
	unsigned char instruction= CommGetChar();
  switch (instruction) {
    
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
      
    case 92: // CMD value
      printf("CMD %d\n", CommGetUnsignedInt());
      break;
      
    case 93: // TOF
      printf("TOF\n");
      break;
      
    // POSITION INSTRUCTIONS
    
    case 1: // POS X FIX value
      printf("POS   X FIX %f\n", CommGetFloat());
      break;
    
    case 2: // POS X REL value
      printf("POS   X REL %f\n", CommGetFloat());
      break;
    
    case 3: // POS Y FIX value
      printf("POS   Y FIX %f\n", CommGetFloat());
      break;
      
    case 4: // POS Y REL value
      printf("POS   Y REL %f\n", CommGetFloat());
      break;
      
    case 5: // POS Z FIX value
      printf("POS   Z FIX %f\n", CommGetFloat());
      break;
      
    case 6: // POS Z REL value
      printf("POS   Z REL %f\n", CommGetFloat());
      break;
      
    case 7: // POS ROL FIX value
      printf("POS ROL FIX %f\n", CommGetFloat());
      break;
      
    case 8: // POS ROL REL value
      printf("POS ROL REL %f\n", CommGetFloat());
      break;
      
    case 9: // POS PIT FIX value
      printf("POS PIT FIX %f\n", CommGetFloat());
      break;
      
    case 10: // POS PIT REL value
      printf("POS PIT REL %f\n", CommGetFloat());
      break;
      
    case 11: // POS YAW FIX value
      printf("POS YAW FIX %f\n", CommGetFloat());
      break;
      
    case 12: // POS YAW REL value
      printf("POS YAW REL %f\n", CommGetFloat());
      break;
      
    case 13: // POS PRE FIX value
      printf("POS PRE FIX %f\n", CommGetFloat());
      break;
      
    case 14: // POS PRE REL value
      printf("POS PRE REL %f\n", CommGetFloat());
      break;
      
    // VELOCITY INSTRUCTIONS
    
    case 15: // VEL X FIX value
      printf("VEL   X FIX %f\n", CommGetFloat());
      break;
      
    case 16: // VEL X REL value
      printf("VEL   X REL %f\n", CommGetFloat());
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
      printf("VEL   Y FIX %f\n", CommGetFloat());
      break;
      
    case 21: // VEL Y REL value
      printf("VEL   Y REL %f\n", CommGetFloat());
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
      printf("VEL   Z FIX %f\n", CommGetFloat());
      break;
      
    case 26: // VEL Z REL value
      printf("VEL   Z REL %f\n", CommGetFloat());
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
      printf("VEL ROL FIX %f\n", CommGetFloat());
      break;
      
    case 31: // VEL ROL REL value
      printf("VEL ROL REL %f\n", CommGetFloat());
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
      printf("VEL PIT FIX %f\n", CommGetFloat());
      break;
      
    case 36: // VEL PIT REL value
      printf("VEL PIT REL %f\n", CommGetFloat());
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
      printf("VEL YAW FIX %f\n", CommGetFloat());
      break;
      
    case 41: // VEL YAW REL value
      printf("VEL YAW REL %f\n", CommGetFloat());
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
      printf("VEL PRE FIX %f\n", CommGetFloat());
      break;
      
    case 46: // VEL PRE REL value
      printf("VEL PRE REL %f\n", CommGetFloat());
      break;
      
    // SPEED INSTRUCTIONS
    
    case 47: // SPD AIR FIX value
      printf("SPD AIR FIX %f\n", CommGetFloat());
      break;
      
    case 48: // SPD AIR REL value
      printf("SPD AIR REL %f\n", CommGetFloat());
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
      printf("SPD GND FIX %f\n", CommGetFloat());
      break;
      
    case 53: // SPD GND REL value
      printf("SPD GND REL %f\n", CommGetFloat());
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
      printf("ACT ELE FIX %f\n", CommGetFloat());
      break;
      
    case 58: // ACT ELE REL value
      printf("ACT ELE REL %f\n", CommGetFloat());
      break;
      
    case 59: // ACT ELE OPT
      printf("ACT ELE OPT\n");
      break;
      
    case 60: // ACT AIL FIX value
      printf("ACT AIL FIX %f\n", CommGetFloat());
      break;
      
    case 61: // ACT AIL REL value
      printf("ACT AIL REL %f\n", CommGetFloat());
      break;
      
    case 62: // ACT AIL OPT
      printf("ACT AIL OPT\n");
      break;
      
    case 63: // ACT RUD FIX value
      printf("ACT RUD FIX %f\n", CommGetFloat());
      break;
      
    case 64: // ACT RUD REL value
      printf("ACT RUD REL %f\n", CommGetFloat());
      break;
      
    case 65: // ACT RUD OPT
      printf("ACT RUD OPT\n");
      break;
      
    case 66: // ACT FLA FIX value
      printf("ACT FLA FIX %f\n", CommGetFloat());
      break;
      
    case 67: // ACT FLA REL value
      printf("ACT FLA REL %f\n", CommGetFloat());
      break;
      
    case 68: // ACT FLA OPT
      printf("ACT FLA OPT\n");
      break;
      
    case 69: // ACT THR FIX value
      printf("ACT THR FIX %f\n", CommGetFloat());
      break;
      
    case 70: // ACT THR REL value
      printf("ACT THR REL %f\n", CommGetFloat());
      break;
      
    case 71: // ACT THR OPT
      printf("ACT THR OPT\n");
      break;
    
    // TRIM INSTRUCTIONS
    
    case 72: // TRI ELE FIX value
      printf("TRI ELE FIX %f\n", CommGetFloat());
      break;
      
    case 73: // TRI ELE REL value
      printf("TRI ELE REL %f\n", CommGetFloat());
      break;
      
    case 74: // TRI AIL FIX value
      printf("TRI AIL FIX %f\n", CommGetFloat());
      break;
      
    case 75: // TRI AIL REL value
      printf("TRI AIL REL %f\n", CommGetFloat());
      break;
      
    case 76: // TRI RUD FIX value
      printf("TRI RUD FIX %f\n", CommGetFloat());
      break;
      
    case 77: // TRI RUD REL value
      printf("TRI RUD REL %f\n", CommGetFloat());
      break;
      
    case 78: // TRI FLA FIX value
      printf("TRI FLA FIX %f\n", CommGetFloat());
      break;
      
    case 79: // TRI FLA REL value
      printf("TRI FLA REL %f\n", CommGetFloat());
      break;
      
    case 80: // TRI THR FIX value
      printf("TRI THR FIX %f\n", CommGetFloat());
      break;
      
    case 81: // TRI THR REL value
      printf("TRI THR REL %f\n", CommGetFloat());
      break;
    
    // TIME INSTRUCTIONS
    
    case 82: // TIM FIX value
      printf("TIM FIX %f\n", CommGetFloat());
      break;
      
    case 83: // TRI REL value
      printf("TIM REL %f\n", CommGetFloat());
      break;
      
    case 84: // RAD value
      printf("RAD %f\n", CommGetFloat());
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
      
    default:
      break;
  }
}

int main() {
  ParseFLIPS();
}