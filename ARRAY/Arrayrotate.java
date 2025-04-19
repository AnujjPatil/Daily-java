package ARRAY;

import java.util.Scanner;

public class Arrayrotate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           int n=sc.nextInt();

           int[]  arr = new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }

              int d=sc.nextInt();

              rotate(arr,d);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
              
    }


    public static void rotate(int[] arr, int d){
        int n = arr.length;
        
        d = d % n; // In case d is greater than n

        reverse(arr, 0, d-1);               

        reverse(arr,d, n-1);

        reverse(arr,0,n-1);

//clockwise  
//if array is of size 7 then n-d = 7-3 = 4 to 7-1 = 6
        // reverse(arr, n - d, n - 1); // Step 1: Reverse last d elements if array
        // reverse(arr, 0, n - d - 1); // Step 2: Reverse first n - d elements
        // reverse(arr, 0, n - 1);     // Step 3: Reverse the whole array
    }


    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
