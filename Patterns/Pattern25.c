#include<stdio.h>

int main(){
    int i,j;
    int space=0;
    char ch='A';
    ch=ch+5;
    for(i=0;i<=5;i++){
        for(j=-5;j<=5;j++){
            if(j>-i&&j<i){
                printf(" ");
            }
            else{
            if(j>0){
               printf("%c",ch-j);
            }
            else { 
                printf("%c",ch+j);
             }
           }
        }
    printf("\n");
    }
}