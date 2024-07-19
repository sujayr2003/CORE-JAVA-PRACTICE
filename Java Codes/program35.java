
public class program35{
    static void eat(){
        System.out.println("Animal is eating");
    }
    public void run(){
        System.out.println("Animal is running");
    }
    public static void main(String[] args) {
        program35.eat();
        program35 a = new program35();
        a.run();
    }
}
