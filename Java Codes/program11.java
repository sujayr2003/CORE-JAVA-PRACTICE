import java.util.*;
class program11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
    
        if (year % 4 == 0) {
          if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " is not a leap year");
          } else {
            System.out.println(year + " is a leap year");
          }
        } else {
          System.out.println(year + " is not a leap year");
        }
        in.close();
      }
}

