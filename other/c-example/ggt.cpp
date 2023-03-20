#include <stdio.h> 

// was müsste gemacht werden (konzept):
// -> zwei zahlen, erste kleiner als zweite
// -> solange modulo bis 0, do while oder while
// -> ergebnis wäre der ggt

// int ggt(int zahl1, int zahl2) {
//   i = zahl2;
//   do {
//   } while(zahl1 % i == 0);
// }

// int funktion(int zahl1, int zahl2):
// erg = True;
// int i = 1;
// do {
//     if (zahl1 % i == 0 && zahl2 % i == 0) {
//         temp = i;
//         i++;
//     } else {
//         erg = False;
//     }
// }while (erg)
// return i;

int ggt(int zahl1, int zahl2)
{
    int rest, ggt;
    rest=0;
    do {
        ggt= rest;
        rest = zahl1 % zahl2;
        zahl1 = zahl2;
        zahl2 =rest;
    }while(rest !=0);
    return ggt;
}

int main() {
  int a,b;
  while (1) {
    printf("Gib zwei ganze Zahlen ein:  ");
    if ( scanf("%d %d", &a, &b) != 2 ) {
      printf("Eingabefehler\n ");
      break;
    }
    printf("ggt(%d,%d) = %d\n", a, b, ggt(a,b)); 
    //printf("ggt(%d,%d) = ??\n", a, b);
  }
  return 0;
}