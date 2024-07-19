class Car {
    void sound() {
        System.out.println("Car uses horn");
    }

    void consume() {
        System.out.println("Car consumes fuel");
    }
}


class Bike extends Car {
    // Run-time polymorphism (method overriding)
    @Override
    void sound() {
        System.out.println("Bike uses silencer");
    }

    void energy() {
        System.out.println("Bike consumes petrol");
    }
}

class CTP{
    // Compile-time polymorphism (method overloading)
    void display(int a) {
        System.out.println("Display method called with int: " + a);
    }

    void display(String a) {
        System.out.println("Display method called with String: " + a);
    }
}

public class program53 {
    public static void main(String[] args) {
    
        CTP obj = new CTP();
        obj.display(10);
        obj.display("Hello");
        Bike b = new Bike();
        b.sound();
        b.energy();


    }
}
