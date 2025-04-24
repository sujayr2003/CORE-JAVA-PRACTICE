#include<stdio.h>
#include<math.h>
int noofdigits(int n);
int isArmstrong(int n);
int main(){
    int num;
    scanf("%d",&num);
    if(isArmstrong(num)){
        printf("%d is an armstrong number\n",num);
    }
    else{
        printf("%d is not an armstrong number\n",num);
    }
}
int noofdigits(int n){
    int temp=n,count=0;
    while(temp!=0){
        count++;
        temp/=10;
    }
    return count;
}
int isArmstrong(int n){
    int temp=n,sum=0,rem=0;
    int digits=noofdigits(n);
    while(temp!=0){
        rem=temp%10;
        sum+=pow(rem,digits);
        temp/=10;
    }
    return sum==n;
}