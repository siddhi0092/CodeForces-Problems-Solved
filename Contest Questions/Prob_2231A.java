// import java.util.*;
// public class prob2231A{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         //Number of Test Cases
//         int t = sc.nextInt();

//         for(int i = 0; i<t; i++){
//             int n = sc.nextInt();  //Enter the size of the array
//             int[] arr = new int[n];  //Initialize the array 

//             if(n==1){
//                 System.out.println("1");
//                 continue;
//             }

//             for (int j = 2; j<n; j++){
//                 arr[j] = 2*j + 1;
//             }

//             arr[1] = n;
//             arr[0] = 2*n;

//             StringBuilder sb = new StringBuilder();
//             for(int j = 0; j < n; j++){
//                 sb.append(arr[j]);
//                 if(j < n-1){
//                     sb.append(" ");
//                 }
//             }
//             System.out.println(sb);

//         }
//     }
// }


import java.util.Scanner;
 
public class Prob_2231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = 2 * n - i;
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + (i == n - 1 ? "\n" : " "));
            }
        }
        
        sc.close();
    }
}