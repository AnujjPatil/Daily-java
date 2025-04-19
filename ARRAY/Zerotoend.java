//time complxity O(n)

package ARRAY;
import java.util.Scanner;

import java.util.Arrays;
public class Zerotoend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;

            }
        }
        ;
        System.out.println(Arrays.toString(arr));
    }
}
