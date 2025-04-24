#include <stdio.h>

int main() {
    int rows = 5;
    int spaces = 0;

    for (int i = rows; i >= 1; i--) {
        // Left side: 1 to i
        for (int j = 1; j <= i; j++) {
            printf("%d", j);
        }

        // Middle spaces
        for (int j = 1; j <= spaces; j++) {
            printf(" ");
        }
        printf("%d",rows+1);
        // Right side: i down to 1
        for (int j = i; j >= 1; j--) {
            printf("%d", j);
        }

        printf("\n");
        spaces += 2;  // Increase space by 2 each row
    }

    return 0;
}