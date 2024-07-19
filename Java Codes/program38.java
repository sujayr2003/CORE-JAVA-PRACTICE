import java.io.File;
import java.io.IOException;

public class program38 {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File created successfully.Name of the File is: "+file.getName());
            }
            else{
                System.out.println("File already exists.Name of the File is: "+file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        if(file.exists()){
            System.out.println("File name: "+file.getName());
            System.out.println("Absolute path: "+file.getAbsolutePath());
            System.out.println("Writeable: "+file.canWrite());
            System.out.println("Readable: "+file.canRead());
            System.out.println("File size in bytes: "+file.length());
            System.out.println("Successfully wrote to the file.");

        }
        else{
            System.out.println("File does not exist");
        }
    }
}
