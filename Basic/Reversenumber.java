package Basic;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    
            int rev =0;// rev will store our reverse number
        while(n>0){
            int rem = n%10; //stores last digit in rem
            rev = rev * 10 + rem;// we update the reverse
            n=n/10;//removes last number
        }
        System.out.println(rev);
    }
}
