package DSA;
import java.util.*;;

public class Bubblesort {
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for( int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
      bubble(arr);
      System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
for(int i =0; i<arr.length-1; i++){
    for(int j=1; j<arr.length-i; j++){
        if(arr[j]<arr[j-1]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
        }

    }

}
    }
}
