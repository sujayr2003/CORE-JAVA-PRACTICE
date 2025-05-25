#include<stdio.h>
int main(){
    int i,j,s;
    for(i=0;i<5;i++){
        for(s=0;s<5-i+1;s++){
            printf(" ");
        }
        for(j=0;j<=i;j++){
            printf("* ");
        }
        printf("\n");
    }
}