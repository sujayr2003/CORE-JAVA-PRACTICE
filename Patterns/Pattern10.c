#include<stdio.h>
int main(){
    int i,j,x=0;
    for(i=0;i<=5;i++){
        if(i%2==0){
            x=1;
        }
        else{
            x=2;
        }
        for(j=0;j<i+1;j++,x=x+2){
            printf("%d ",x);
        }
        printf("\n");
    }
}