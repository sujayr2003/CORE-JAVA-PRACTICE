import java.util.*;
class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int count = sc .nextInt();

        System.out.println("Fibonacci sequence up to " + count + " terms:");


        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
