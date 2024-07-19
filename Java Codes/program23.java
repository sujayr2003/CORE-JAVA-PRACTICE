import java.util.*;
public class program23 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =in.nextInt();
        int rev=0,rem=0,temp=n;
        while(temp!=0){
          rem=temp%10;
          rev=rev*10+rem;
          temp=temp/10;
        }
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        in.close();

    }
}
