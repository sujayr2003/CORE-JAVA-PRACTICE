#include<stdio.h>
int main(){
    int num1=63;
    int num2=64;
    int result1,result2;
    result1=((num1>0)&&(num1&num1-1))?puts("Not a Power of 2"):puts("Power of 2");
    result2=((num2>0)&&(num2&num2-1))?puts("Not a Power of 2"):puts("Power of 2");
}