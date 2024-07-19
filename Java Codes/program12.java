import java.util.*;
class program12 {
   public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    int minimumVotingAge = 18;
    if (age >= minimumVotingAge) {
      System.out.println("Eligible to vote and use lp card");
    } else {
      System.out.println("Not eligible to vote and not use lp card");
    }
    in.close();
   } 
}
