import java.util.*;
class program3 {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    System.out.print("Enter first integer: ");
    num1 = sc.nextInt();
    System.out.print("Enter second integer: ");
    num2 = sc.nextInt();
    sc.close();
    System.out.println("Before swapping:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("After swapping with temporary variable:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    System.out.println("Now swapping the variables back without using temporary variable");
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    System.out.println("The present state of num1 and num2");
    System.out.println("num1 =" + num1);
    System.out.println("num2 =" + num2);
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    System.out.println("After swapping without temporary variable:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    }
}
