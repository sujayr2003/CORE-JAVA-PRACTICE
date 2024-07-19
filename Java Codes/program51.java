// Basic interface
interface A {
    void eat();

    void sleep();
}
interface Sound{
    void makeSound();
}
// Class implementing multiple interfaces
class program51 implements A, Sound{
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void sleep() {
        System.out.println("The dog sleeps.");
    }

    public void makeSound() {
        System.out.println("The dog barks.");
    }
    public static void main(String[] args) {
        program51 obj = new program51();
        obj.eat();
        obj.sleep();
        obj.makeSound();

    }
}
