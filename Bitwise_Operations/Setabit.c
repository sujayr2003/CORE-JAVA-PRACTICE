#include<stdio.h>
int main(){
    int num=32;
    int pos =15;
    int MSB=(8*sizeof(num))-1;
    printf("%d\n",MSB);
    //Before Setting
    for(int i=MSB;i>=0;i--){
        printf("%d",(num>>i)&1);
    }
    printf("\n");
    num=num|(1<<pos);
    //After Setting
    for(int i=MSB;i>=0;i--){
        printf("%d",(num>>i)&1);
    }
    printf("\n");
}