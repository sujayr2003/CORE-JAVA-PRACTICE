#include<stdio.h>
int main(){
    int num=64;
    int i,j;
    for(int i=31;i>=0;i--){
        printf("%d",(num>>i)&1);
    }
    int x = num>>i&1;
    int y = num>>j&1;
    for(i=0,j=7;i<j;i++,j--){
        if(x != y){
            num=num^1<<i;
            num=num^i<<j;
        }
    }
    printf("\n");
    for(int i=31;i>=0;i--){
        printf("%d",(num>>i)&1);
    }

}