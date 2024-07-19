import java.util.*;
class program4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Conversion Menu:");
            System.out.println("1. Miles to Kilometers");
            System.out.println("2. Kilometers to Miles");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Fahrenheit to Celsius");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter miles: ");
                    double miles = sc.nextDouble();
                    double kilometers = milesToKilometers(miles);
                    System.out.format("%.2f miles is %.2f kilometers.%n", miles, kilometers);
                    break;
                case 2:
                    System.out.print("Enter kilometers: ");
                    double km = sc.nextDouble();
                    double mi = kilometersToMiles(km);
                    System.out.format("%.2f kilometers is %.2f miles.%n", km, mi);
                    break;
                case 3:
                    System.out.print("Enter Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.format("%.2f Celsius is %.2f Fahrenheit.%n", celsius, fahrenheit);
                    break;
                case 4:
                    System.out.print("Enter Fahrenheit: ");
                    double fahr = sc.nextDouble();
                    double cels = fahrenheitToCelsius(fahr);
                    System.out.format("%.2f Fahrenheit is %.2f Celsius.%n", fahr, cels);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
            System.out.println();
        } while (choice != 5);
        sc.close();
    }
    static double milesToKilometers(double miles) {
        return miles * 1.6;
    }
    static double kilometersToMiles(double kilometers) {
        return kilometers / 1.6;
    }
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
