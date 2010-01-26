#include "flips.h"
#include <stdio.h>

int main() {
  ConfigureFLIPS();
  
  FILE *file = fopen("example2.bin","r");
  char byte;
  if (file != NULL) {
    do {
      byte = fgetc(file);
      FLIPSReceive(byte);
    }
    while (byte != EOF);
    fclose(file);
    
    FLIPSExecute();
  }
  else {
    printf("File not found.");
  }

  return 0;
}
