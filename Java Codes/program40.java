import java.io.*;
public class program40{
    public static void main(String[] args){
        File file = new File("sample1.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully. Name of the file is: "+file.getName());
            }
            else{
                System.out.println("File already exists. Name of the file is: "+file.getName());
                file.delete();
            }
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}