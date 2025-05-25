#include<stdio.h>
int main(){
    int i,j,s;
    char ch='A';
    for(i=4;i>0;i--){
        for(s=0;s<5-i+1;s++){
            printf(" ");
        }
        for(j=0;j<=i;j++){
            printf("%c ",ch+j);
        }
        printf("\n");
    }
    for(i=0;i<5;i++){
        for(s=0;s<5-i+1;s++){
            printf(" ");
        }
        for(j=0;j<=i;j++){

            printf("%c ",ch+j);

        }
        printf("\n");
    }

}