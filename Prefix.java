import java.util.*;


public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
       
        int arr[]=new int[n];
        int a = arr[0];
        int b=arr[1];

        System.out.println("Enter array elements: ");
        for(int i=0; i<=n; i++){
            arr[i]=sc.nextInt();
            System.out.println(a);
            int sum = a+b;
           a=b;
           b=sum;
        
        }
       
    }
}
