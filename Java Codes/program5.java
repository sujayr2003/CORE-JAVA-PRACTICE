import java.util.*;
class program5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area Calculation Options:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Equilateral Triangle");
        System.out.println("7. Trapezium");
        System.out.println("8. Rhombus");
        System.out.print("Choose a shape (1-8): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + circleArea);
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;

            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is: " + squareArea);
                break;

            case 4:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;

            case 5:
                System.out.print("Enter the base of the parallelogram: ");
                double pBase = scanner.nextDouble();
                System.out.print("Enter the height of the parallelogram: ");
                double pHeight = scanner.nextDouble();
                double parallelogramArea = pBase * pHeight;
                System.out.println("The area of the parallelogram is: " + parallelogramArea);
                break;

            case 6:
                System.out.print("Enter the side length of the equilateral triangle: ");
                double eqSide = scanner.nextDouble();
                double equilateralTriangleArea = (Math.sqrt(3) / 4) * (eqSide * eqSide);
                System.out.println("The area of the equilateral triangle is: " + equilateralTriangleArea);
                break;
            case 7:
                System.out.print("Enter the length of the first parallel side (a) of the trapezium: ");
                double a = scanner.nextDouble();
                System.out.print("Enter the length of the second parallel side (b) of the trapezium: ");
                double b = scanner.nextDouble();
                System.out.print("Enter the height of the trapezium: ");
                double h = scanner.nextDouble();
                double trapeziumArea = 0.5 * (a + b) * h;
                System.out.println("The area of the trapezium is: " + trapeziumArea);
                break;
            case 8:
                System.out.print("Enter the length of the first diagonal (d1) of the rhombus: ");
                double d1 = scanner.nextDouble();
                System.out.print("Enter the length of the second diagonal (d2) of the rhombus: ");
                double d2 = scanner.nextDouble();
                double rhombusArea = 0.5 * d1 * d2;
                System.out.println("The area of the rhombus is: " + rhombusArea);
                break;
            default:
                System.out.println("Invalid choice. Please choose an option between 1 and 8.");
                break;
        }

        scanner.close();

    }
}
