public class program45 {
    public static void main(String args[]){
    try{
        int[] arr = {8,9,10,11,12};
        arr[5]=4;
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bounds exception\n"+e);
    }
    finally{
        System.out.println("Code has finised executing\n");
    }
   }
}
