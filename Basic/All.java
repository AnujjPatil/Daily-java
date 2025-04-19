package Basic;

import java.util.Scanner;

public class All {
    public static void main(String[] args){
   

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

     //fibonacci
        // int a= 0;
        // int b= 1;
        
        // for(int i=0; i<n;i++){
        //     System.out.println(a);
        //     int sum = a+b;
        //     a =b;
        //     b=sum;
        
        // }
         

        //count
        // int count=0;
        // while(n>0){
        //    n=n/10;
        //    count++;

        // }
        // System.out.println(count);


        //prime
        // if(n<=1){
        //     return false;
        // }

        // for(int i=2; i*i<=n; i++){
        //     if(n%i==0){
        //         return false;
        //     }
        // }
        // return true;


        //arm strong
        // int original =n;
        // int sum=0;
        // while(n>0){
        //     int rem=n%10;
        //     sum= sum +(rem*rem*rem);
        //     n=n/10;
        // }

        // if(sum==original){
        //     return true;
        // }
        // return false;
       

//        //palindrome
//        int original =n;
//        int rev=0;
//        while(n>0){
//         int rem =n%10;
//         rev=rev*10+rem;
//         n=n/10;
//        }

//          if(original==rev){
//           System.out.println(rev);
//     }


//factorial
//    int fact=1;

//    for(int i=1; i<=n; i++){
//        fact=fact*i;
//    }
//    System.out.println(fact);


}
}