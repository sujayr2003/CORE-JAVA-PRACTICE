#include<stdio.h>
int main(){
    int i,j,rows=5;
    for(i=0;i<rows;i++){
        if (i%2==0){
            for(j=0;j<rows-i;j++){
            printf("*");
            }
        }
        else{
            for(j=0;j<rows-i;j++){
                printf("x");
                }
        }

    printf("\n");
    }
}