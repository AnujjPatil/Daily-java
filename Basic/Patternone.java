public class Patternone {
    public static void main(String[] args){
      one(5);
        
    }



    static void one(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }



    
    static void two(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    
    static void three(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void four(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
