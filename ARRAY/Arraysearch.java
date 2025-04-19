package ARRAY;

//program to search an element in an array

import java.util.*;
import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[]= new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n ; i++){
            arr[i]= sc.nextInt();
        }

    System.out.print("Enter the element to search: ");
     int  x = sc.nextInt();
        
     for(int i=0; i<n ; i++){
                    if(arr[i]==x){
                        System.out.println("Element found at index: " + i);
                        return;      
                    } 
                 }
                 System.out.println("-1");
       
        }
    }




// import java.util.*;
// import java.util.Scanner;

// public class Arraysearch {
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[]= new int[n];
        
//         System.out.print("Enter the elements of the array: ");
//         for(int i=0; i<n ; i++){
//             arr[i]= sc.nextInt();
//         }
        
//         System.out.print("Enter the element to search: ");
//         int x = sc.nextInt();

//         for(int i=0; i<n ; i++){
//             if(arr[i]==x){
//                 System.out.println("Element found at index: " + i);
//                 return;      
//             } 
//         }
//         System.out.println("Element not found");
//     }

    
// }
    

