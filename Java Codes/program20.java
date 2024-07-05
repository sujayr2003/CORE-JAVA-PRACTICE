import java.util.*;
class program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is automorphic: ");
        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

   
    public static boolean isAutomorphic(int n) {
        
        int square = n * n;

        
        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n /= 10;
            square /= 10;
        }

        return true;
    }
}
