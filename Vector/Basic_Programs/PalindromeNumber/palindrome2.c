#include<stdio.h>
int isPalindrome(int n);
int main(){
    int i;
    //scanf("%d",&num);//num = 100
    for(i=0;i<100000;i++){
        if(isPalindrome(i)){
            printf("%d ",i);
        }
    }

}
int isPalindrome(int n){
    int rem=0,rev=0,temp=n;
    while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
    }
    return n==rev;
}