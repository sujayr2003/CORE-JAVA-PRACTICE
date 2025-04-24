#include<stdio.h>
#include<math.h>
int isPrime(int n);
int main(){
    int num,i;
    scanf("%d",&num);//num = 100
    for(i=0;i<num;i++){
        if(isPrime(i)){
            printf("%d ",i);
        }
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