package Basic;
import java.util.*;

public class Simplecount{
    public static void main(String[] args) {
    int n = 123456;
    int ans= count(n);
    System.out.println(ans);
    
    }

    public static int count(int n){
        int count=0;
    while(n>0){
    count = count +1;//whenever we remove a  digit  increment count
    n =n/10;
    }
    return count;
    }
}