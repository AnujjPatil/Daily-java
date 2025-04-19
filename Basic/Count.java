package Basic;
import java.util.Scanner;
import java.util.*;
public class Count {
   public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

     int count=0; int s=n;
     while(n>0){
        int rem =n%10; //gives us last digit of the number and stores in rem
        // if the last digit is not 0 and the number is divisible by the last digit then increment count
        // if the last digit is 0 then we dont want to increment count
        if(rem!=0 && s%rem==0)
        {
         count++;
             }    
             //remove the last digit of the number
            // by dividing the number by 10
            // for example 1234/10 = 123.4 => 123
            n =n/10;
            }

 System.out.println(count);


   }
}
