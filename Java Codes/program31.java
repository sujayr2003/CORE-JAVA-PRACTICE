
public class program31 {
public static void main(String[] args) {
    //Typecasting in Java
    int a = 10;
    double b = a;
    System.out.println("Implicit Typecasting: "+b);
    double c = 10.5;
    int d = (int)c;
    System.out.println("Explicit Typecasting: "+d);
    char ch = 'A';
    int e = ch;
    System.out.println("Implicit Typecasting: "+e);
    int f = 65;
    char g = (char)f;
    System.out.println("Explicit Typecasting: "+g);
    int h = 65;
    String i = String.valueOf(h);
    System.out.println("Explicit Typecasting: "+i);
    String j = "65";
    int k = Integer.parseInt(j);
    System.out.println("Explicit Typecasting: "+k);
    String l = "65.5";
    double m = Double.parseDouble(l);
    System.out.println("Explicit Typecasting: "+m);
    String n = "true";
    boolean o = Boolean.parseBoolean(n);
    System.out.println("Explicit Typecasting: "+o);
    String p = "A";
    char q = p.charAt(0);
    System.out.println("Explicit Typecasting: "+q);
    int r = 65;
    char s = (char)r;
    System.out.println("Explicit Typecasting: "+s);
    char t = 'A';
    int u = t;
    System.out.println("Implicit Typecasting: "+u);
}    
}
