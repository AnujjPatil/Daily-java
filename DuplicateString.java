import java.util.*;

public class DuplicateString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];
        System.out.println("Enter" + size +  "names:");
        for(int i=0 ; i<size ; i++){
            names[i]=sc.nextLine();

    }

    Set<String> uniqueNames = new LinkedHashSet<>(Arrays.asList(names));

 
   System.out.println(uniqueNames);
}


} 