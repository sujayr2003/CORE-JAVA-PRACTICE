#include<stdio.h>
int main(){
    int i,j;
    for(i=0;i<5;i++){
        for(j=1;j<5-i+1;j++){
            printf("%d",j);
        }
        printf("\n");
    }
}