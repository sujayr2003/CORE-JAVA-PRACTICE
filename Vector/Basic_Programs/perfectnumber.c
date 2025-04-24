#include<stdio.h>
int main(){
    int num,sum=0,i;
    scanf("%d",&num);//28
    for(i=1;i<num;i++){
        if (num%i==0)
        sum+=i;
    }
    if (sum==num){
       printf("%d is a perfect number\n",num);
    }
    else{
        printf("%d is not a perfect number\n",num);
    }
}