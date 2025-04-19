import java.util.*;

    
public class Balloon {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();

//initializing the answer
char ans='\0';
//creating the array
char arr[] =new char[n];
//taking the input
for(int i=0;i<n;i++){
    arr[i]=sc.next().charAt(0);
}

HashMap<Character,Integer> map =new HashMap<>();

//putting the elements in the map
for(int i=0;i<n;i++){
    map.put(arr[i], map.getOrDefault(arr[i],0)+1);
}

//checking the odd frequency element
for(int i=0;i<n;i++){
    if(map.get(arr[i])%2!=0){
      ans=arr[i];
      break;
    }
    
}

if(ans=='\0'){
    System.out.println("all are even");
}
else{
    System.out.println(ans);
}
}
}