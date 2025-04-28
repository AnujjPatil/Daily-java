package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();

      int[] arr = new int[n];

      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      Insertion(arr);
      System.out.println(Arrays.toString(arr));
    }



    static void Insertion(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            for(int j=i+1; j>0; j--){
        if(arr[j]<arr[j-1]){
            swap(arr, j, j-1);
        }
        else{
            break;
        }
            }
        }
    }



    static void swap(int[] arr, int start, int end){
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
    }
}
