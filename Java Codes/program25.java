import java.util.*;
public class program25 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        in.close();
        int i=0,j=str.length()-1;
        while(i<j){
            if (str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palindrome");
                break;
            }
            else{
                System.out.println("Palindrome");
                break;
            }
        }

    }
}
