abstract class print{
    abstract void run();
}
class program32 extends print{
    void run(){
        System.out.println("This is an example of abstract class in Java");
    }
    public static void main(String[] args) {
        program32 obj = new program32();
        obj.run();
    }
}
