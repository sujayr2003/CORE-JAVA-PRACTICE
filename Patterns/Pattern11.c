#include<stdio.h>
int main(){
    int i,j,x,y;
    for(i=0;i<5;i++){
        x=i+1;
        y=4;
        for(j=0;j<=i;j++){
            printf("%d ",x);
            x=x+y;
            y--;
        }
        printf("\n");
    }
}