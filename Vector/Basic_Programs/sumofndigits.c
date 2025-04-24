#include<stdio.h>
int main(){
    int num,temp,sum=0;
    scanf("%d",&num);
    temp=num;
    while(temp!=0){
        int rem=temp%10;
        sum += rem;
        temp /= 10;
    }
    printf("The sum of all the digits for the number %d is = %d\n",num,sum);

}