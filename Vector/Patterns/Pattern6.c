//Upper and Lower Half Pyramid with both halves
#include<stdio.h>
int main(){
    int i,j,s=0,rows=5;
    char ch = 'A';
    for(i=0;i<rows;i++){
        for(s=0;s<=i;s++){
            printf(" ");
        }
        for(j=1;j<=rows-i;j++){
        printf("%c ",ch+j-1);
        }
    printf("\n");
    }
    for(i=2;i<rows;i++){
        for(s=0;s<=rows-i;s++){
            printf(" ");
        }
        for(j=1;j<=i;j++){
        printf("%c ",ch+j-1);
        }
    printf("\n");
    }
}