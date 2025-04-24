#include<stdio.h>
int factorial(int num);
int main(){
    int num,i;
    scanf("%d",&num);
    printf("The factorial of %d is = %d",num,factorial(num));
}
int factorial(int num){
    if (num==0 || num ==1)
       return 1;
    else
       return num*factorial(num-1);
}