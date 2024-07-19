
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void run(){
        System.out.println("Animal is running");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
    void run(){
        System.out.println("Dog is running");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat is eating");
    }
    void run(){
        System.out.println("Cat is running");
    }
}

public class program33 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.run();
        Dog d = new Dog();
        d.eat();
        d.run();
        Cat c = new Cat();
        c.eat();
        c.run();
    }
}