#include<stdio.h>
int main(){
    int x,y,i;
    scanf("%d %d",&x,&y);
    double result = 1.0;
    if(y<0){
        y=-y;
        for(i=0;i<y;i++){
            result*=x;
        }
        result=1/result;
    }
    else{
        for(i=0;i<y;i++){
            result*=x;
        }
    }
    printf("%0.2lf\n",result);
}