#include<stdio.h>
#define pf printf
int main(){
    int x=10;
    int n=5;
    pf("Setting a bit\n");
    x|=(1<<n);
    pf("%d\n",x);
    pf("Clearing a bit\n");
    x&=~(1<<n);
    pf("%d\n",x);
    pf("Toggling a bit\n");
    x^=(1<<n);
    pf("%d\n",x);
}
