#include<stdio.h>
int factorial(int num);
int isStrong(int num);
int main(){
    int i;
    //scanf("%d",&num);
    for (i=1;i<100000;i++)
    if(isStrong(i)){
        printf("%d ",i);
    }
}
int factorial(int num){
    if (num<=1)
       return 1;
    else
       return num*factorial(num-1);
}
int isStrong(int num){
    int temp=num,sum=0,rem=0;
    while(temp!=0){
        rem=temp%10;
        sum+=factorial(rem);
        temp/=10;
    }
    return sum == num;
}