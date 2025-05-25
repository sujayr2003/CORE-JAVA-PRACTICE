#include<stdio.h>
int main(){
    int num=259;
    int i,j;
    for(int i=31;i>=0;i--){
        printf("%d",(num>>i)&1);
    }
    int p1=4;
    int p2=1;
    int x = num>>p1&1;
    int y = num>>p2&1;
    if(x != y){
        num=num^1<<p1;
        num=num^1<<p2;
    }
    printf("\n");
    for(int i=31;i>=0;i--){
        printf("%d",(num>>i)&1);
    }

}