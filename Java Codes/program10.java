import java.util.*;
class program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();;
        if (number % 2 == 0) {
          System.out.println(number + " is even");
        } else {
          System.out.println(number + " is odd");
        }
        in.close();
      }
}
