#include<stdio.h>
#include<math.h>
int isPrime(int n);
int main(){
    int num=2,count=0;
    //scanf("%d",&num);//num=100
    while(count<100){
        if(isPrime(num)){
            printf("%d ",num);
            count++;
        }
    num++;
    }
}
int isPrime(int n){
    int i;
    if (n==0||n==1)
    return 0;
       if (n==0||n==1)
       return 1;
    for(i=2;i<=sqrt(n);i++){
        if (n%i==0)
           return 0;
    }
    return 1;
}