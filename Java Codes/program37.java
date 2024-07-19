//static String	valueOf(boolean b)
//Returns the string representation of the boolean argument.
//static String	valueOf(char c)
//Returns the string representation of the char argument.
//static String	valueOf(char[] data)
//Returns the string representation of the char array argument.
//static String	valueOf(char[] data, int offset, int count)
//Returns the string representation of a specific subarray of the char array argument.
//static String	valueOf(double d)
//Returns the string representation of the double argument.
//static String	valueOf(float f)
//Returns the string representation of the float argument.
//static String	valueOf(int i)
//Returns the string representation of the int argument.
//static String	valueOf(long l)
//Returns the string representation of the long argument.
//static String	valueOf(Object obj)
//Returns the string representation of the Object argument.

//Using valueOf() method

public class program37{
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        char[] data = {'a','b','c','d'};
        double d = 100.0;
        float f = 10.0f;
        int i = 100;
        long l = 100000;
        Object obj = new Object();
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(data));
        System.out.println(String.valueOf(data, 1, 2));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(obj));
    }
}
