import java.util.*;
class program2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("Enter five integers:");
        System.out.print("Enter first integer: ");
        num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        num2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        num3 = sc.nextInt();
        System.out.print("Enter fourth integer: ");
        num4 = sc.nextInt();
        System.out.print("Enter fifth integer: ");
        num5 = sc.nextInt();
        sc.close();
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
