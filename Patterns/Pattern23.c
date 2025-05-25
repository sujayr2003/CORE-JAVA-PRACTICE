#include<stdio.h>
int main(){
    int i,j;
    int space=2*(5-1);
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
            printf("%d",j);
        }
        for(int s=1;s<=space;s++){
            printf(" ");
        }
        for(j=i;j>=1;j--){
            printf("%d",j);
        }
    space=space-2;
    printf("\n");
    }
}