#include<stdio.h>
int main(){
    float num = 127.6;
    char *p = (char*)&num;
    p=p+3;
    for(int i =0;i<4;i++){
        for(int j=7;j>0;j--){
            printf("%d",*p>>j&1);
        }
        p--;
    }
}