import java.io.FileWriter;
import java.io.FileReader;

public class program39 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("This is a sample text file");
            writer.close();
            System.out.println("Successfully wrote to the file.");
            FileReader reader = new FileReader("sample.txt");
            int data = reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}