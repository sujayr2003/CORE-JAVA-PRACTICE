// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main Class
public class program48 {

    // Method that uses throws to declare that it might throw MyCustomException
    public static void checkNumber(int number) throws CustomException {
        if (number < 0) {
            
            throw new CustomException("Number cannot be negative");
        } else {
            System.out.println("Number is: " + number);
        }
    }
    public static void main(String[] args) {
        try {
            
            checkNumber(5);
            checkNumber(-10);
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}