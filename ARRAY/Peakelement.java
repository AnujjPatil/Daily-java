
import java.util.*;

public class Peakelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int[] arr= new int[n];

        for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
        }

       int peakIndex = Peak(arr);

    //    boolean isPeak = false;

    //     if(peakIndex != -1){
    //         boolean leftCheck = (peakIndex == 0) || (arr[peakIndex] > arr[peakIndex - 1]);
    //         boolean rightCheck = (peakIndex == n - 1) || (arr[peakIndex] > arr[peakIndex + 1]);
    //         isPeak = leftCheck && rightCheck;
    //     }
        System.out.println(peakIndex);
    }


    public static int Peak(int[] arr){
        int n= arr.length;
        
        if(n == 1) return 0;

        if(arr[0]>arr[1]) return 0;                                                                                                                                                                                                                                                                                                                                                       

        if(arr[n-1]>arr[n-2])  return n-1;

        int start = 1;
        int end= n-2;
      while(start<=end){  
        int mid = start + (end - start)/2;

        if(arr[mid]>arr[mid + 1] && arr[mid]>arr[mid -1]) return mid;

        if(arr[mid]<arr[mid+1]) mid = mid +1;

        else mid = mid-1;
      }
      return -1;
    }
    
}
