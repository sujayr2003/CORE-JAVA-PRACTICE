#include<stdio.h>
int isPalindrome(int n);
int main(){
    int num;
    scanf("%d",&num);
    if (isPalindrome(num)){
        printf("The number %d is a palindrome number\n",num);
    }
    else{
        printf("The number %d is not a palindrome number\n",num);
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