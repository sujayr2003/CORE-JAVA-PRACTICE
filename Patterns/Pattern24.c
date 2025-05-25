#include<stdio.h>
int main(){
    int i,j;
    int space=0;
    char ch='A';
    for(i=5;i>=1;i--){
        for(j=1;j<=i;j++){
            printf("%c",(ch+j)-1);
        }
        for(int s=space;s>=1;s--){
            printf(" ");
        }
        for(j=i;j>=1;j--){
            printf("%c",(ch+j)-1);
        }
    space=space+2;
    printf("\n");
    }
}