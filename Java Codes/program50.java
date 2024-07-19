class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Single-level inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Multilevel inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

// Hierarchical inheritance
class Wolf extends Animal {
    void howl() {
        System.out.println("The wolf howls.");
    }
}

class program50 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat(); 
        dog.bark(); 

        Puppy puppy = new Puppy();
        puppy.eat(); 
        puppy.bark(); 
        puppy.weep(); 

    
        Wolf wolf = new Wolf();
        wolf.eat(); 
        wolf.howl(); 
    }
}