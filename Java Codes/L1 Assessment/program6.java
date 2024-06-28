import java.util.*;
class program6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Volume Calculation Options:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        System.out.println("4. Cube");
        System.out.println("5. Rectangular Prism (Cuboid)");
        System.out.println("6. Pyramid");
        System.out.print("Choose a shape (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                System.out.println("The volume of the sphere is: " + sphereVolume);
                break;

            case 2:
   
                System.out.print("Enter the radius of the cylinder: ");
                double cylRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylHeight = scanner.nextDouble();
                double cylinderVolume = Math.PI * Math.pow(cylRadius, 2) * cylHeight;
                System.out.println("The volume of the cylinder is: " + cylinderVolume);
                break;

            case 3:
   
                System.out.print("Enter the radius of the cone: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double coneHeight = scanner.nextDouble();
                double coneVolume = (1.0 / 3.0) * Math.PI * Math.pow(coneRadius, 2) * coneHeight;
                System.out.println("The volume of the cone is: " + coneVolume);
                break;

            case 4:
   
                System.out.print("Enter the side length of the cube: ");
                double cubeSide = scanner.nextDouble();
                double cubeVolume = Math.pow(cubeSide, 3);
                System.out.println("The volume of the cube is: " + cubeVolume);
                break;

            case 5:
  
                System.out.print("Enter the length of the rectangular prism: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangular prism: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangular prism: ");
                double height = scanner.nextDouble();
                double rectangularPrismVolume = length * width * height;
                System.out.println("The volume of the rectangular prism is: " + rectangularPrismVolume);
                break;

            case 6:
 
                System.out.print("Enter the base length of the pyramid: ");
                double baseLength = scanner.nextDouble();
                System.out.print("Enter the base width of the pyramid: ");
                double baseWidth = scanner.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double pyramidHeight = scanner.nextDouble();
                double pyramidVolume = (1.0 / 3.0) * baseLength * baseWidth * pyramidHeight;
                System.out.println("The volume of the pyramid is: " + pyramidVolume);
                break;

            default:
                System.out.println("Invalid choice. Please choose an option between 1 and 6.");
                break;
        }

        scanner.close();
    }
}
