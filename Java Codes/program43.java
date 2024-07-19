import java.util.*;
public class program43 {
    public static int[] BubbleSort(int[] arr){
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){//for n elements, n-1 passes are required
            for(int j=0;j<n-i-1;j++){//for each pass, n-i-1 comparisons are required
                if(arr[j+1]<arr[j]){//arr[j+1]>arr[j] for descending order
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static String BinarySearch(int[] arr,int n){
        int low=0,high=arr.length-1;
        while(low<=high){
           int mid = (low+high)/2;
              if(arr[mid]==n){
                  return "Element found at index "+mid;
              }
              else if(arr[mid]>n){
                  high=mid-1;
              }
              else{
                  low=mid+1;

            }
        }
        return "Element not found";
    }
    public static String LinearSearch(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return "Element found at index "+i;
            }
        }
        return "Element not found";
    }
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    in.close();
    int sorted_arr[] = BubbleSort(arr);
    for(int i=0;i<n;i++){
        System.out.print(sorted_arr[i]+" ");
    }
    System.out.println(BinarySearch(sorted_arr, 1));
    System.out.println(LinearSearch(sorted_arr, 1));
  }
}
