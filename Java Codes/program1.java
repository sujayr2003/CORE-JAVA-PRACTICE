import java.util.*;
class program1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1. for calculating simple interest");
        System.out.println("Enter 2. for calculating compound intreset");
        int k = in.nextInt();
        switch(k){
            case 1:
                System.out.println("Enter the principle amount");
                double principle = in.nextDouble();
                System.out.println("Enter the rate of interest");
                double rate=in.nextDouble();
                System.out.println("Enter the time");
                double time=in.nextDouble();
                double simpleinterest = (principle*time*rate)/100;
                System.out.format("The calculated simple interest is = %.2f",simpleinterest);
                break;
            case 2:
                System.out.println("Enter the principle amount");
                double p=in.nextDouble();
                System.out.println("Enter the annual interest rate");
                double r=in.nextDouble();
                System.out.println("Enter the no of terms");
                double nt=in.nextDouble();
                double compoundinterest=p*Math.pow(1+(r/100),nt);
                System.out.format("The calculated compund intresest is = %.2f",compoundinterest);
                break;
            default:
                 System.out.println("Invalid input");
        }
        in.close();
   }
}