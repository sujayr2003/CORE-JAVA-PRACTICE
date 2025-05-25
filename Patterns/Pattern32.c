#include<stdio.h>
int main(){
    int i,j,s;
    for(i=1;i<=5;i++){
        for(j=1;j<=5-i+1;j++){
            if(i%2==0){
                printf("x");
            }
            else{
                printf("*");
            }
        
        }
        printf("\n");
    }
}