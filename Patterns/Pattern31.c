#include<stdio.h>
int main(){
    int i,j;
    int x=0;
    for(i=1;i<=5;i++){
        for(j=1;j<=5-i+1;j++){
            if(j%2==0){
                printf("* ");
            }
            else{
                x++;
                printf("%d ",x);
            }
        
        }
        printf("\n");
    }
}