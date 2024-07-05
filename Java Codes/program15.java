import java.util.*;
public class program15 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unit Conversion Menu:");
        System.out.println("1. Centimeters to Meters");
        System.out.println("2. Meters to Centimeters");
        System.out.println("3. Liters to Milliliters");
        System.out.println("4. Milliliters to Liters");
        System.out.println("5. Kelvin to Celsius");
        System.out.print("Choose an option (1-5): ");
        
        int choice = sc.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        double convertedValue = 0.0;
        
        switch (choice) {
            case 1:
                convertedValue = centimetersToMeters(value);
                System.out.printf("%.2f centimeters is %.2f meters\n", value, convertedValue);
                break;
            case 2:
                convertedValue = metersToCentimeters(value);
                System.out.printf("%.2f meters is %.2f centimeters\n", value, convertedValue);
                break;
            case 3:
                convertedValue = litersToMilliliters(value);
                System.out.printf("%.2f liters is %.2f milliliters\n", value, convertedValue);
                break;
            case 4:
                convertedValue = millilitersToLiters(value);
                System.out.printf("%.2f milliliters is %.2f liters\n", value, convertedValue);
                break;
            case 5:
                convertedValue = kelvinToCelsius(value);
                System.out.printf("%.2f Kelvin is %.2f Celsius\n", value, convertedValue);
                break;
            default:
                System.out.println("Invalid choice. Please select an option from 1 to 5.");
                break;
            
        }
        sc.close();
    }

    public static double centimetersToMeters(double cm) {
        return cm / 100;
    }

    public static double metersToCentimeters(double m) {
        return m * 100;
    }

    public static double litersToMilliliters(double l) {
        return l * 1000;
    }

    public static double millilitersToLiters(double ml) {
        return ml / 1000;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
}

