public class program47 {
    public static void main(String args[]){
     try{
         String str = "Hello";
         System.out.println(str.substring(7)); 
     }
     catch(Exception e){
          System.out.println("Exception");
          System.out.println(e);
          e.printStackTrace();
     }
     finally{
          System.out.println("Code has finised executing\n");
     }
 }
 }