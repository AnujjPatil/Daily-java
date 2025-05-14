import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
  
//method1
        // StringBuilder reverse=new StringBuilder();

        // for(int i=str.length()-1; i>=0; i--){
        //     reverse.append(str.charAt(i));
        // }

        // System.out.println(reverse);

        System.out.println(reverse(str));
    }


     static String reverse(String str){
       
        int start=0;
        int end=str.length()-1;

         StringBuilder rev=new StringBuilder(str);
        while(start<end){
            char temp=rev.charAt(start);
            rev.setCharAt(start, rev.charAt(end));
            rev.setCharAt(end, temp);
            start++;
            end--;
        }

        return rev.toString();



//method 3
        // rev.reverse();
        // return rev.toString();
           



    }


    

    
}
