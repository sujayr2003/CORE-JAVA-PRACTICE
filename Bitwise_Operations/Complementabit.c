#include<stdio.h>
int main(){
    int num=32;
    int pos =15;
    //Before Complementing
    for(int i=31;i>=0;i--){
        printf("%d",(num>>i)&1);
    }
    //After Complementing
    num=num^(1<<pos);
    printf("\n");
    for(int i=31;i>=0;i--){
        printf("%d",(num>>i)&1);
    }
    printf("\n");
}
