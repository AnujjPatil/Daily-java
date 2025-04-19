package DSA;
import java.util.*;

public class Binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int[] nums = new int[n];
                                                                        
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int target =sc.nextInt();
        System.out.println(search(nums, target));

    }

    static int search(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
int  mid= start + (end-start)/2;

if(target < arr[mid]){
  end =mid-1;
        }
        else if(target > arr[mid]){
            start = mid+1;
    }
    else{
        return mid;
    }

}

return -1;
    }
}
