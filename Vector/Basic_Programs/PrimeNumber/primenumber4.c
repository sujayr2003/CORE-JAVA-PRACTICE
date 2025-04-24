#include<stdio.h>
#include<math.h>
int isPrime(int n);
int main(){
    int count=0;
  for(int i=2;i<=100;i++){
      if (isPrime(i)&&isPrime(i+2)){
          printf("(%d,%d)\n",i,i+2);
          count=count+1;
  }
  }
  printf("%d",count);
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