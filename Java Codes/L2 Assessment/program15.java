import java.util.*;
class program15 {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of units consumed:");
    int units = in.nextInt();
    double price =0;
    if (units <= 100) {
        price=units * 10;
    }
    else if (units <= 200) {
        price = (100 * 10) + (units - 100)*15;
    }
    else if (units <= 300) {
        price = (100 * 10) + (100 * 15) + (units - 200)*20;
    }
    else if (units > 300) {
        price = (100 * 10) + (100 * 15) + (100 * 20)+ (units - 300)* 25;
    }
    System.out.println("The total price is: " + price);
    in.close();
  }
}

