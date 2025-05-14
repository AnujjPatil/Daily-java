import java.util.Arrays;

public class Sortstring {
    public static void main(String[] args) {
        String str ="helloworld";
        System.out.println("String before sorting: " + str);
    //    System.out.println( isSorted(str));

char[] arr = str.toCharArray();
Arrays.sort(arr);
System.out.println("String after sorting: " + new String(arr)); 
        

    }
//  static String isSorted(String str){
//         char[] arr = str.toCharArray();
//         Arrays.sort(arr);
        
//         return new String(arr);
//     }

}
