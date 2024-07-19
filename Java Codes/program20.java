import java.util.*;
class program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is armstrong or not: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.out.println(number + " is not an armstrong number.");
        }

        scanner.close();
    }

   
    public static boolean isArmstrong(int n) {
    int temp, digit=0, rem=0, sum=0;     
    temp=n;   
    while(temp!=0)    
    {   
    temp = temp/10;   
    digit++;   
    }   
    temp=n; 
    while(temp!=0)   
    {   
    rem = temp % 10;   
    sum +=  (Math.pow(rem, digit));   
    temp = temp/10;   
   }  
   if(n==sum)   
   return true;      
   else return false;   
    }
}
