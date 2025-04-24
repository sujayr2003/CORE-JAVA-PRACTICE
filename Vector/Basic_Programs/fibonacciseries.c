#include<stdio.h>
int fibonacci(int num);
int main(){
    int num,i,count=0;
    scanf("%d",&num);
    printf("The fibonacci series upto %d is:\n",num);
    for(i=1;i<=num;i++){
    printf("%d ",fibonacci(i));
    count++;
    }
    printf("\nThe number of teerms in fibonacci series = %d",count);
}
int fibonacci(int num){
    if (num==0)
       return 0;
    if (num ==1 || num ==2)
       return 1;
    else
       return fibonacci(num-1)+fibonacci(num-2);
}