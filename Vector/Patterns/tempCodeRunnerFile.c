#include<stdio.h>
int main(){
    int i,j,rows=5,s;
    for(i=0;i<rows;i++){
        for(s=0;s<rows-i-1;s++){
            printf(" ");
        }
        for(j=0;j<i+1;j++){
        printf("* ");
        }
    printf("\n");
    }
}