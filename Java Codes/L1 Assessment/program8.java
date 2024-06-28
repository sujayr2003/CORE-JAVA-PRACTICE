import java.util.*;
class program8 {
    
    public static double calculateSpeed(double distance, double time) {
        return distance / time;
    }

    public static double calculateDistance(double speed, double time) {
        return speed * time;
    }

    public static double calculateTime(double distance, double speed) {
        return distance / speed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Speed Calculator");
        System.out.println("1. Calculate Speed");
        System.out.println("2. Calculate Distance");
        System.out.println("3. Calculate Time");
        System.out.print("Choose an option (1/2/3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter distance (in meters): ");
                double distance = sc.nextDouble();
                System.out.print("Enter time (in seconds): ");
                double time = sc.nextDouble();
                double speed = calculateSpeed(distance, time);
                System.out.println("Speed = " + speed + " meters/second");
                break;
            case 2:
                System.out.print("Enter speed (in meters/second): ");
                speed = sc.nextDouble();
                System.out.print("Enter time (in seconds): ");
                time = sc.nextDouble();
                distance = calculateDistance(speed, time);
                System.out.println("Distance = " + distance + " meters");
                break;
            case 3:
                System.out.print("Enter distance (in meters): ");
                distance = sc.nextDouble();
                System.out.print("Enter speed (in meters/second): ");
                speed = sc.nextDouble();
                time = calculateTime(distance, speed);
                System.out.println("Time = " + time + " seconds");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        sc.close();
    }
}

