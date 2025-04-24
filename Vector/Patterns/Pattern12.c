#include <stdio.h>

int main() {
    int i, j, rows = 4;
    char ch = 'A';

    for(i = rows; i >= 0; i--) {
        // Print leading spaces
        for(j = 0; j < rows - i; j++) {
            printf(" ");
        }
        for(j = 0; j <=i; j++) {
            printf("%c", ch + j);
        }
        for(j = 0; j < rows - i; j++) {
            printf(" ");
        }
        printf("\n");
    }
    return 0;
}
