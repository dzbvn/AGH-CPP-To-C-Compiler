#include <stdio.h>
void wypisz () {
    printf( "Wypisz" );
}
int main () {
    if ( 1 || 0 ) {
        wypisz ();
    }
    return 0 ;
}
