#include<stdio.h>
int factorial(int num);
int isStrong(int num);
int main(){
    int num;
    scanf("%d",&num);//145
    if(isStrong(num)){
        printf("%d is a strong number\n",num);
    }
    else{
        printf("%d is not a strong number\n",num);
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