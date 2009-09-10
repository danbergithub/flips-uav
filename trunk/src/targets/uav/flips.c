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