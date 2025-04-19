// find the count of elements whose value is greater than all of its proir elements 


import java.util.*;

public class Arraycount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
System.out.println(main(arr));
    }

//count the first element always- given in question
      static int main(int[] arr){
       int count = 1;
         int max=arr[0];
         for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                 count++;
             }
         }
      return count;
    }


}