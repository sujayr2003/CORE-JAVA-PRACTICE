import java.util.*;
class program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if(n==0||n==1){
            return false;
        }
        else{
            for(int i =2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
