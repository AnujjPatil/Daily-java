package DSA;
import java.util.*;

public class Linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
       
         int target = sc.nextInt();
         System.out.println(search(nums, target));
    }

    static int search(int[] arr, int target){
     if(arr.length ==0){
        return -1;
     }

     for(int i=0; i<arr.length; i++){
     int element = arr[i];
     if(element == target){
        return i;
     }

    }

return -1;
    }
}
