//left-aligned pyramid - descending
/*#include<stdio.h>
int main(){
    int i,j,rows=5;
    for(i=0;i<rows;i++){
        for(j=0;j<rows-i;j++){
        printf("*");
        }
    printf("\n");
    }
}*/
//left-aligned pyramid - ascending
#include<stdio.h>
int main(){
    int i,j,rows=5;
    for(i=0;i<rows;i++){
        for(j=0;j<=i;j++){
        printf("*");
        }
    printf("\n");
    }
}