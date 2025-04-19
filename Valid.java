import java.util.*;

public class Valid {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String s; 
        s=sc.nextLine();


        int star=0;
        int hash=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                star++;
            }
            else if(s.charAt(i)=='#'){
                hash++;
            }
        }
        System.out.println(star-hash);
        
        // if(star>hash){
        //     System.out.println(star-hash);
        // }
        // else if(star<hash){
        //     System.out.println(star-hash);
        // }
        // else{
        //     System.out.println(0);
        // }

        sc.close();
    }
}
