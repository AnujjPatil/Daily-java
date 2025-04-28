//find duplicate values of array of integer values
// logic: we use nested loop to check if any element is equal to any other element in the array. if yes then we print the duplicate value and break the loop
// Outer Loop (i):
// Runs from i = 0 to i = n-1.

// Inner Loop (j):
// For every i, j runs from i + 1 to n - 1.
import java.util.Scanner;

public class Arrayduplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE SIZE OF ARRAY");
        int n = sc.nextInt();
   
        int[] arr = new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

//for every i means if i=0 it will check from j=1 to n 
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                  if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                  }

            }
        }
  
        



    }
}
