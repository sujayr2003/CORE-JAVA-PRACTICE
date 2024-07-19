
public class program46 {
   public static void main(String args[]){
    try{
        String str = null;
        System.out.println(str.length());

    }
    catch(NullPointerException e){
         System.out.println("Null Pointer Exception\n"+e);
         System.out.println(e);
         e.printStackTrace();
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
