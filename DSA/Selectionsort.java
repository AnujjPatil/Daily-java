package DSA;

import java.util.*;
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements: ");
       int n=sc.nextInt();

       int[] arr= new int[n];

       for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }
     selectionSort(arr);
     System.out.println(Arrays.toString(arr));
      
       
    }


    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int last=n-i-1;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr, maxIndex,last);
        }
    
    }


    static void swap(int[] arr, int start, int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
       
    
}
