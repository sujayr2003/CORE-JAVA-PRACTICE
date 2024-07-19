
public class program29 {
     public static void main(String args[]){
        int n = 29;
        //Math methods in java
        System.out.println("Math.abs(n): "+Math.abs(n));
        System.out.println("Math.ceil(n): "+Math.ceil(n));
        System.out.println("Math.floor(n): "+Math.floor(n));
        System.out.println("Math.max(10,20): "+Math.max(10,20));
        System.out.println("Math.min(10,20): "+Math.min(10,20));
        System.out.println("Math.pow(2,3): "+Math.pow(2,3));
        System.out.println("Math.sqrt(25): "+Math.sqrt(25));
        System.out.println("Math.cbrt(27): "+Math.cbrt(27));
        System.out.println("Math.round(3.6): "+Math.round(3.6));
        System.out.println("Math.round(3.4): "+Math.round(3.4));
        System.out.println("Math.random(): "+Math.random());
        System.out.println("Math.random()*100: "+Math.random()*100);
        System.out.println("Math.random()*1000: "+Math.random()*1000);
        System.out.println("Math.random()*10000: "+Math.random()*10000);

        //Rounding off in java
        float f = 3.6f;
        Double d =3.5d;
        System.out.format("Rounding off 3.6: %.2f\n",f);
        System.out.format("Rounding off 3.5: %.2f\n",d);
        System.out.println(String.format("%.2f",f));
        System.out.println(String.format("%.2f",d));

        //More Math methods in Java
        System.out.println("Math.sin(90): "+Math.sin(90));
        System.out.println("Math.cos(90): "+Math.cos(90));
        System.out.println("Math.tan(45): "+Math.tan(45));
        System.out.println("Math.asin(1): "+Math.asin(1));
        System.out.println("Math.acos(1): "+Math.acos(1));
        System.out.println("Math.atan(1): "+Math.atan(1));
        System.out.println("Math.sinh(90): "+Math.sinh(90));
        System.out.println("Math.cosh(90): "+Math.cosh(90));
        System.out.println("Math.tanh(45): "+Math.tanh(45));
        System.out.println("Math.toDegrees(1): "+Math.toDegrees(1));
        System.out.println("Math.toRadians(1): "+Math.toRadians(1));
        System.out.println("Math.log(1): "+Math.log(1));
        System.out.println("Math.log10(1): "+Math.log10(1));
        System.out.println("Math.exp(1): "+Math.exp(1));
        System.out.println("Math.expm1(1): "+Math.expm1(1));
        System.out.println("Math.log1p(1): "+Math.log1p(1));
        System.out.println("Math.IEEEremainder(10,3): "+Math.IEEEremainder(10,3));
        System.out.println("Math.hypot(3,4): "+Math.hypot(3,4));
        System.out.println("Math.atan2(1,1): "+Math.atan2(1,1));
        System.out.println("Math.nextAfter(10,3): "+Math.nextAfter(10,3));
        System.out.println("Math.nextUp(10): "+Math.nextUp(10));
        System.out.println("Math.nextDown(10): "+Math.nextDown(10));
        System.out.println("Math.scalb(10,3): "+Math.scalb(10,3));
        System.out.println("Math.ulp(10): "+Math.ulp(10));
        System.out.println("Math.signum(10): "+Math.signum(10));
        System.out.println("Math.copySign(10,-3): "+Math.copySign(10,-3));
        System.out.println("Math.getExponent(10): "+Math.getExponent(10));
     }    
}
