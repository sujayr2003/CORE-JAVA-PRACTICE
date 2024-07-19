import java.util.*;
public class program24 {
    //with return type and parameters
    public static int add1(int a,int b){
        return a+b;
    }
    //without return type with parameters
    public static void add2(int a,int b){
        System.out.println(a+b);
    }
    //with return type without parameters
    public static int factorial(){
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        int fact =1;
        int n = 5;
        //int n = in.nextInt();
        //in.close();
        if (n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;
    }
    //without return type without parameters

    public static void print(){
        System.out.println("Hello World");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 =in.nextInt();
        int n2=in.nextInt();
        in.close();
        System.out.println(add1(n1,n2));
        add2(n1,n2);
        System.out.println(factorial());
        print();
    }
}
