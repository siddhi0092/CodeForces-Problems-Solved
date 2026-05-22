//Prob 282A
//Bit++

import java.util.*;
public class prob5_282A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Number of Statements in the program

        int t = sc.nextInt();
        sc.nextLine();
        int X = 0; // initially the value of x is zero

        //Initialize the array of Strings to input t values

        String[] arr = new String[t];

        //input the elements in the String array
        for(int i = 0; i<t; i++){
            arr[i] = sc.nextLine();
        }

        //check if the elements match the following conditions
        int count = 0;

        for (int i =0; i<t; i++){
            if (arr[i].equals("X++") || arr[i].equals("++X") ){  //if you use == it compares references(memory locations) 
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(count);
    }
}