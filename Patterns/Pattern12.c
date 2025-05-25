#include<stdio.h>
int main(){
    char ch='A';
    for(int i=0;i<5;i++,ch++){
        for(int j=0;j<i+1;j++){
            printf("%c",ch);
        }
        printf("\n");
    }
}