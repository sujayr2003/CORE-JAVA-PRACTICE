#include<stdio.h>
int main(){
    int num,temp,rev=0,rem=0;
    scanf("%d",&num);
    temp=num;
    while(temp!=0){
        rem = temp%10;
        rev =rev*10+rem;
        temp/=10;
    }
    printf("%d\n",rev);
}