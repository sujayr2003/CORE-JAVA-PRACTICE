import java.io.*;
public class program42 {
    public static void main(String[] args) {
     File file = new File("C:\\Users\\Mypc\\Desktop\\Java Codes\\Sample");
        if (file.mkdir()) { 
  
            System.out.println("Directory is created"); 
        } 
        else { 

            System.out.println("Directory cannot be created"); 
        } 
    } 
}
