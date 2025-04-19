// Second largest element in an array 
//logic - we find the largest element first and then we find the second largest element considering current index is not equal to largest element


package ARRAY;
import java.util.Scanner;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = getSecondLargest(arr);
      
        
    }

    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int Largest = -1;
        
        int Secondlargest = -1;
        // find largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }

        // find second largest element
        for (int i = 0; i < n; i++) {

            // update second largest if current element is greater than second largest and
            // not equal to largest
            if (arr[i] > Secondlargest && arr[i] != Largest) {
                Secondlargest = arr[i];
            }
        }
        return Secondlargest;

    }
    
}
