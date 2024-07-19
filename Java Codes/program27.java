
public class program27 {
public static void main(String args[]){
StringBuffer obj1 = new StringBuffer();
StringBuilder obj2 = new StringBuilder();

//String Buffer methods
    obj1.append("Hello");
    obj1.append(" World");
    System.out.println(obj1);
    System.out.println(obj1.toString());
    obj1.insert(5," Java");
    System.out.println(obj1);
    obj1.replace(5,10," Python");
    System.out.println(obj1);
    obj1.delete(5,12);
    System.out.println(obj1);
    obj1.reverse();
    System.out.println(obj1);
    System.out.println(obj1.capacity());
    obj1.ensureCapacity(50);
    System.out.println(obj1.capacity());
    System.out.println("-----------------------------------------------------------------------------------");
    //String Builder methods
    obj2.append("Hello");
    obj2.append(" World");
    System.out.println(obj2);
    System.out.println(obj2.toString());
    obj2.insert(5," Java");
    System.out.println(obj2);
    obj2.replace(5,10," Python");
    System.out.println(obj2);
    obj2.delete(5,12);
    System.out.println(obj2);
    obj2.reverse();
    System.out.println(obj2);
    System.out.println(obj2.capacity());
    obj2.ensureCapacity(50);
    System.out.println(obj2.capacity());

    }
}