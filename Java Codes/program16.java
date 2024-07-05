import java.util.Scanner;
class program16 {

    static double balance = 1000;
    static final int PIN = 1234;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPIN = sc.nextInt();
        if (validatePIN(enteredPIN)) {
            System.out.println("PIN accepted. Welcome to the ATM.");
        boolean quit = false;

        while (!quit) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option from 1 to 4.");
                    break;
            }
        }
    } else {
        System.out.println("Invalid PIN. Please try again.");
    }
}
    static boolean validatePIN(int enteredPIN) {
        return enteredPIN == PIN;
    }

    static void checkBalance() {
        System.out.printf("Your current balance: $%.2f\n", balance);
    }

    static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f\n", amount);
            checkBalance();
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrawn $%.2f\n", amount);
            checkBalance();
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal amount exceeds balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}