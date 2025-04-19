package Basic;
import java.util.*;

public class Prime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        boolean ans2 = isArmstrong(n);
        System.out.println(ans2);
    }

 static boolean isArmstrong(int n){
    int original = n;
    int sum =0;
    while(n>0){ 
        int rem = n%10;
        sum = sum + (rem*rem*rem);
        n =n/10;
    }
    if(sum == original){
        return true;
    }
    return false;
 }

 static boolean isPrime(int n){
    if(n <= 1){
        return false;
    }

    for(int i = 2; i * i <= n; i++){
        if(n % i == 0){
            return false;
        }
    }

    return true; 
}

    
    static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }


    static boolean isOdd(int n){
        if(n % 2 != 0){
            return true;
        }
        return false;
    }

   static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(original == rev){
            return true;
        }
        return false;
    }

}