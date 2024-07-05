import java.util.*;
class program17{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the pattern number (1-3): ");
        int patternNumber = in.nextInt();

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
            default:
                System.out.println("Invalid pattern number. Please enter a number between 1 and 3.");
                break;
        }

        in.close();
    }

    // Method to print pattern 1
    private static void printPattern1() {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print pattern 2
    private static void printPattern2() {
        System.out.println("Pattern 2:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print pattern 3
    private static void printPattern3() {
        System.out.println("Pattern 3:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}