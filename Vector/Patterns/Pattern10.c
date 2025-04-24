//center-aligned three pyramid - ascending
#include<stdio.h>
int main(){
    int i,j,s=0,rows=6;
    for(i=0;i<rows;i++){
        for(s=0;s<=rows-i;s++){
            printf(" ");
        }
        for(j=1;j<=2*i-1;j++){
            if (j==1 || j==2*i-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
    printf("\n");
    }
    for(i=rows;i>=1;i--){
        for(s=0;s<=rows-i;s++){
            printf(" ");
        }
        
        for(j=1;j<=2*i-1;j++){
            if (j==1 || j==2*i-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
    printf("\n");
    }
}