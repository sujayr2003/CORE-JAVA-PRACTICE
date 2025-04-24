#include<stdio.h>
#include<math.h>
int isPrime(int n);
int main(){
    int num=2,count=0;
    while(count<100){
        if(isPrime(num)){
            //printf("%d",num);
            count++;
            if (count==50)
               printf("%d",num);
        }
        num++;
    }
}
int isPrime(int n){
    int i;
    if (n==0||n==1)
        return 0;
    for(i=2;i<=sqrt(n);i++){
        if (n%i==0)
           return 0;
    }
    return 1;
}