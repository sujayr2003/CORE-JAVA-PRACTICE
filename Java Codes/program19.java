
import java.util.*;
class program19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = fact(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }

    // Recursive method to compute factorial
    public static long fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
    
