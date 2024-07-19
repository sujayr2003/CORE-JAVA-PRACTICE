//5 rules to display paaterns in java
//For the outer loop count the number of lines of pattern to display
//For the inner loop focus on the columns and somehow connect the columns to the rows
//Print the number/symbol inside the inner loop
//Use empty print statement outside innner loop
//Observe symmentry 
//import java.util.*;
class program17{
    public static void main(String args[]){
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter the pattern number (1-22): ");
        int patternNumber = 0;
        for(int i =1;i<=22;i++){
            patternNumber=i;
        switch (patternNumber) {
            case 1:
                printPattern1();
                break;
            case 2:
                printPattern2();
                break;
            case 3:
                printPattern3();
                break;
            case 4:
                printPattern4();
                break;
            case 5:
                printPattern5();
                break;
            case 6:
                printPattern6();
                break;
            case 7:
                printPattern7();
                break;
            case 8:
                printPattern8();
                break;
            case 9:
                printPattern9();
                break;
            case 10:
                printPattern10();
                break;
            case 11:
                printPattern11();
                break;
            case 12:
                printPattern12();
                break;
            case 13:
                printPattern13();
                break;
            case 14:
                printPattern14();
                break;
            case 15:
                printPattern15();
                break;
            case 16:
                printPattern16();
                break;
            case 17:
                printPattern17();
                break;
            case 18:
                printPattern18();
                break;
            case 19:
                printPattern19();
                break;
            case 20:
                printPattern20();
                break;
            case 21:
                printPattern21();
                break;
            case 22:
                printPattern22();
                break;            
            default:
                System.out.println("");
                break;
        }
    }

        //in.close();
    }

    
    static void printPattern1() {
        System.out.println("Pattern 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //1-5(5-1+1)
    //2-4(5-2+1)
    //3-3(5-3+1)
    //4-2(5-4+1)
    //5-1(5-5+1)
    static void printPattern2() {                      
        System.out.println("Pattern 2:");
        for (int i = 1; i <=5; i++) {
            for (int j = 0; j < 5-i+1; j++) {
                System.out.print("* ");          
            }
            System.out.println();
        }
    }


    static void printPattern3(){
        System.out.println("Pattern 3:");
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void printPattern4(){
        System.out.println("Pattern 4:");
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(j);
            }
            System.out.println();
        }
    }


    static void printPattern5(){
        System.out.println("Pattern 5:");
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(i);
            }
            System.out.println();
        }
    }


    static void printPattern6(){
        System.out.println("Pattern 6");
        for(int i =1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                    System.out.print(j);
            }
            System.out.println();
        }   
    }


    //space star space
    // 4    1(2*0+1)    4(5-0-1)
    // 3    3(2*1+1)    3(5-1-1)
    // 2    5(2*2+1)    2(5-2-1)
    // 1    7(2*3+1)    1(5-3-1)
    // 0    9(2*4+1)    0(5-4-1)
    // n-i-1  2*i+1     n-i-1


    static void printPattern7(){
        System.out.println("Pattern 7");
        for(int i =0;i<5;i++){
            for(int j =0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }                   
    
    
    static void printPattern8(){
        System.out.println("Pattern 8");
        for(int i =5;i>=1;i--){
            for(int j =0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void printPattern9(){
        System.out.println("Pattern 9");
        for(int i =0;i<5;i++){
            for(int j =0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =5;i>=1;i--){
            for(int j =0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void printPattern10(){
        System.out.println("Pattern 10");
        for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j =1;j<4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void printPattern11(){
        System.out.println("Pattern 11");
        int start=1;
        for(int i=0;i<5;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0;j<i+1;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    static void printPattern12(){
        System.out.println("Pattern 12");
        //1       1
        //12     21
        //123   321
        //12344321
        int space=2*(4-1);
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
        System.out.println();
        space=space-2;
        }
        
    }
    static void printPattern13(){
        int num=1;
        System.out.println("Pattern 13");
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    static void printPattern14(){
        System.out.println("Pattern 14");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    static void printPattern15(){
        System.out.println("Pattern 15");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    static void printPattern16(){
        System.out.println("Pattern 16");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
    static void printPattern17(){
        System.out.println("Pattern 17");
        for(int i =0;i<5;i++){
            for(int j =0;j<5-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j =0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void printPattern18(){
        System.out.println("Pattern 18");
        for(int i =1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)(70-j));
            }
        System.out.println();
        }      
    }
    static void printPattern19(){
        System.out.println("Pattern 19");
        int space1=0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j<5-i; j++) {
                System.out.print("*");
            }
            
            for(int j =0;j<space1;j++){
                System.out.print(" ");
            }

            for(int j = 0; j<5-i; j++) {
                System.out.print("*");
            }

            System.out.println();
            space1=space1+2;
        }
        int space2=2*(5-1);
        for(int i = 0; i<5; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }

        for(int j = 0; j<space2; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
            space2=space2-2;
        }
    }
    static void printPattern20(){
        System.out.println("Pattern 20");
        int space=2*5-2;
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space=space-2;
            System.out.println();
        }
        int space2=3;
        for(int i=0;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=space2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=4-i;j++){
                System.out.print("*");
            }  
            System.out.println();
            space2=space2+2;
        }
    }
    static void printPattern21(){
        System.out.println("Pattern 21");
        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==0||j==0||i==3||j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printPattern22(){
        System.out.println("Pattern 22");
        for(int i =0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0||j==0||i==6||j==6){
                    System.out.print("4");
                }
                else if(i==1||j==1||i==5||j==5){
                    System.out.print("3");
                }
                else if(i==2||j==2||i==4||j==4){
                    System.out.print("2");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}


