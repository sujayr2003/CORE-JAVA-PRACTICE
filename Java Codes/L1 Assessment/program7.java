import java.util.*;
class program7{

    static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    static double calculateCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }

    static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ohm's Law Calculator");
        System.out.println("1. Calculate Voltage (V)");
        System.out.println("2. Calculate Current (I)");
        System.out.println("3. Calculate Resistance (R)");
        System.out.print("Choose an option (1/2/3): ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter current (I) in amperes: ");
                double current = sc.nextDouble();
                System.out.print("Enter resistance (R) in ohms: ");
                double resistance = sc.nextDouble();
                double voltage = calculateVoltage(current, resistance);
                System.out.println("Voltage (V) = " + voltage + " volts");
                break;
            case 2:
                System.out.print("Enter voltage (V) in volts: ");
                voltage = sc.nextDouble();
                System.out.print("Enter resistance (R) in ohms: ");
                resistance = sc.nextDouble();
                current = calculateCurrent(voltage, resistance);
                System.out.println("Current (I) = " + current + " amperes");
                break;
            case 3:
                System.out.print("Enter voltage (V) in volts: ");
                voltage = sc.nextDouble();
                System.out.print("Enter current (I) in amperes: ");
                current = sc.nextDouble();
                resistance = calculateResistance(voltage, current);
                System.out.println("Resistance (R) = " + resistance + " ohms");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        
        sc.close();
    }
}
