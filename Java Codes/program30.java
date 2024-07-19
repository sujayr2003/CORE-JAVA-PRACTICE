import java.util.*;
public class program30 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner methods in java
        
        int num = in.nextInt();
        System.out.println("Number is: "+num);
        double d = in.nextDouble();
        System.out.println("Double is: "+d);
        String str = in.nextLine();
        System.out.println("String is: "+str);
        char ch = in.next().charAt(0);
        System.out.println("Character is: "+ch);
        byte b = in.nextByte();
        System.out.println("Byte is: "+b);
        short s = in.nextShort();
        System.out.println("Short is: "+s);
        long l = in.nextLong();
        System.out.println("Long is: "+l);
        float f = in.nextFloat();
        System.out.println("Float is: "+f);
        boolean bool = in.nextBoolean();
        System.out.println("Boolean is: "+bool);
        String str1=in.next();
        System.out.println("String is: "+str1);
        char ch1 = in.next().charAt(0);
        System.out.println("Character is: "+ch1);
        in.close();
     }    
}
