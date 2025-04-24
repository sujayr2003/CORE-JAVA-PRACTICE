//center-aligned pyramid - ascending
//#include<stdio.h>
/*int main(){
    int i,j,s=0,rows=5;
    for(i=0;i<rows;i++){
        for(s=0;s<=rows-i;s++){
            printf(" ");
        }
        for(j=0;j<=i;j++){
        printf("* ");
        }
    printf("\n");
    }
}*/
//center-aligned pyramid - descending
#include<stdio.h>
int main(){
    int i,j,s=0,rows=5;
    for(i=0;i<rows;i++){
        for(s=0;s<=i;s++){
            printf(" ");
        }
        for(j=1;j<=rows-i;j++){
        printf("* ");
        }
    printf("\n");
    }
}