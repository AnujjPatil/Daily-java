import java.util.*;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();

        // System.out.println(isAnagram(str1, str2));
    String s1 = "listen";
    String s2 = "sileno";    

    if(s1.length() != s2.length()){
        System.out.println("False");
        return;
            
    }

        char[] String1 = s1.toCharArray();
         char[] String2 = s2.toCharArray();

         Arrays.sort(String1);
            Arrays.sort(String2);

       System.out.println(Arrays.equals(String1, String2));  

    }

    // static boolean isAnagram(String s1, String s2){

    // if(s1.length() != s2.length()){
    //     return false;
    // }

    //     char[] String1 = s1.toCharArray();
    //      char[] String2 = s2.toCharArray();

    //      Arrays.sort(String1);
    //         Arrays.sort(String2);

    //         return Arrays.equals(String1, String2);
    // }
}
