import java.util.*;

public class ArrayReverse{
   
public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for(int i=0; i<n; i++){
        arr[i] =sc.nextInt();
    }


    
int start = 0;
int end=arr.length-1;


while(start<end){
    // we put start in temp that is 2 for ex {2, 3 ,5 ,6 ,7}
    int temp = arr[start];
    // we put end element in start that is  7
    arr[start]=arr[end];
    arr[end]= temp; // that is 2 
    start++;
    end--;
}
System.out.println(Arrays.toString(arr));

}


}