//Consructor Inheritnace for Employee Management program in java
class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Employee1 extends Employee{
    float salary;
    Employee1(int id, String name, float salary){
        super(id, name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
class Employee2 extends Employee1{
    Employee2(int id, String name, float salary){
        super(id, name, salary);
    }
    @Override
    void display(){
        System.out.println(id+"[]"+name+"[]"+salary);
    }
}

public class program34 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(101, "John", 50000);
        Employee e = new Employee(102, "Smith");
        Employee2 e2 = new Employee2(103, "Karan", 60000);
        e1.display();
        System.out.println(e.id+" "+e.name);
        e2.display();

    }
}

