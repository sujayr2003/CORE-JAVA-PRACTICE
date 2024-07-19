public class program44 {
    public static void main(String args[]){
        try{
            int num =3;
            int div =num/0;
            System.out.println(div);
        }
        catch(NumberFormatException|ArithmeticException e){
            System.out.println("Exception");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
