#include<stdio.h>
int main(){
    int i,j,x=0;
    for (i=0;i<5;i++){
        int x=1;
        for(j=0;j<=i;j++){
            x=x+i;
            printf("%d ",x);
        }
        printf("\n");
    }
}