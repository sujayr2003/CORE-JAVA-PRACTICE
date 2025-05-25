#include<stdio.h>
int main(){
    int x=15;
    int y=-15;
    int result1,result2;
    result1=(x>>(sizeof(int)*8-1))&1?puts("negative"):puts("positive");
    printf("\n");
    result2=(y>>(sizeof(int)*8-1))&1?puts("negative"):puts("positive");
    //printf("%d",result1);
    //printf("%d",result2);
}