#include<stdio.h>
int main(){
    int num1=12;
    int num2=13;
    int result1,result2;
    result1=(num1&1)?puts("odd"):puts("even");
    result2=(num2&1)?puts("odd"):puts("even");
}