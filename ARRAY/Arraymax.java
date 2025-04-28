
import java.util.*;

public class Arraymax {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();

int arr[]= new int[size];
for(int i=0; i<size; i++){
    arr[i]=sc.nextInt();
}
reverse(arr);
System.out.println(Arrays.toString(arr));

int ans = max(arr);
System.out.println(ans);

}
// Array max
static int max(int arr[]){
    int max = arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]>max){
            max =arr[i];
        }
    }
    return max;
}

//Array reverse
static void reverse(int arr[] ){
    int start =0;
    int end= arr.length -1;
   // until pointers overlap or cross
    while(start<end){
        swap(arr, start,end);
        start++;
        end--;
    }
}

//Array Swap
static void swap(int arr[] , int i, int j){
    int temp =arr[i];
    arr[i]= arr[j];
    arr[j] = temp;
    
}


}