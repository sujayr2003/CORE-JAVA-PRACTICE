#include<stdio.h>
#include<math.h>
int noofdigits(int n);
int isArmstrong(int n);
int main(){
    int i;
    //scanf("%d",&num);
    for (i=1;i<100000;i++)
    if(isArmstrong(i)){
        printf("%d ",i);
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