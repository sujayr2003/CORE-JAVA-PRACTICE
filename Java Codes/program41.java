import java.io.*;
public class program41 {
    public static void main(String[] args){
    File file = new File("C:\\Users\\Mypc\\Desktop\\Java Codes");
    try{
        if(file.createNewFile()){
            System.out.println("File created successfully. Name of the file is: "+file.getName());
        }
        else{
            System.out.println("File already exists. Name of the file is: "+file.getName());
            String[] files = file.list(); 
  
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i]); 
            }
        } 
    } catch (IOException e){
        System.out.println("An error occurred");
        e.printStackTrace();
    }
  }
}
