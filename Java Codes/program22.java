import java.util.*;
public class program22 {
    public static String automorphic (int n){
        int sq=n*n;
        while(n>0){
            if(n%10!=sq%10){
                return "Not Automorphic";
            }
            n=n/10;
            sq=sq/10;
        }
        return "Automorphic";
    }
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n =in.nextInt();
    System.out.println(automorphic(n));
    in.close();
    }
}
