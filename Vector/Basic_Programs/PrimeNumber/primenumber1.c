#include<stdio.h>
#include<math.h>
int isPrime(int n);
int main(){
    int num;
    scanf("%d",&num);
    if (isPrime(num)){
        printf("The number %d is a prime number\n",num);
    }
    else{
        printf("The number %d is not a prime number\n",num);
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