#include<stdio.h>
int main(){
    int i,j,rows=5;
    int x=1;
    for(i=0;i<rows;i++){
        for(j=0;j<rows-i;j++){
            if(j%2==0)
               printf("%d",x++);
            else{
                printf("*");
            }
        }
    printf("\n");
    }
}