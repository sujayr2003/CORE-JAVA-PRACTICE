//left-aligned number pyramid - descending
#include<stdio.h>
int main(){
    int i,j,rows=5;
    for(i=1;i<=rows;i++){
        for(j=1;j<=rows-i+1;j++){
        printf("%d",j);
        }
    printf("\n");
    }
}
//left-aligned number pyramid - ascending
/*#include<stdio.h>
int main(){
    int i,j,rows=5;
    for(i=1;i<=rows;i++){
        for(j=1;j<=i;j++){
        printf("%d",j);
        }
    printf("\n");
    }
}*/