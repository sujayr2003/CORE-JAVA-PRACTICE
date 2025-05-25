#include<stdio.h>
int main(){
    int x = 56;
    int y = 24;
    printf("%d %d\n",x,y);
    x=x^y;
    y=x^y;
    x=x^y;
    //x=x+y;
    //y=x-y;
    //x=x-y;
    printf("%d %d\n",x,y);


}