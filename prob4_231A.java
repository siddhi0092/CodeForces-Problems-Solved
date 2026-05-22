// Team
//either create t arrays of size 3 , or create one t dimensional array 
//we will try both the ways 

//by creating t arrays

// import java.util.*;
// public class prob4_231A {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         //Enter the Number of problems 
//         int t = sc.nextInt();
//         int ans = 0;

//         for (int i = 0; i<t; i++){
//             //Enter the elements in array
//             int[] arr = new int[3];
//             for (int j = 0; j<3; j++){
//                 arr[j] = sc.nextInt();
//             }

//             int count = 0;
//             //traversing the array
//             for(int j = 0; j<3; j++){
//                 if (arr[j] == 1){
//                     count++;
//                 }
//             }
//             if (count > 1){
//                 ans++;
//             }
//         }
//         System.out.println(ans);
//     }
// }


//By creating 2D arrays

import java.util.*;
public class prob4_231A {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        //Enter the number of problems

        int t = sc.nextInt();

        //initialize a 2D array
        int[][] arr = new int[t][3];

        //Entering Elements in the array
        for (int j = 0; j<t; j++){
            for (int k = 0; k< 3; k++){
                arr[j][k] = sc.nextInt();
            }
        }

        //traversing through the array
        
        for (int j = 0; j<t; j++){
            int count = 0;
            for (int k = 0; k< 3; k++){
                if (arr[j][k] == 1){
                    count++;
                }
            }
            if (count > 1){
                ans++;
            }
        }
        System.out.println(ans);

    }
}