//2209B
/* 

Problem Statement : 
For each index i, find the maximum number of indices j such that j>i and |ai−k|>|aj−k| , over all possible integer values of k

Understanding the problem:

given condition: |ai−k| -> means the dist of a[i] from k



*/

import java.util.*;
public class prob{
    public static void main(String[] args){

        //Enter the no. of test cases

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        //Enter the no. of elements in the array
        
        int n = sc.nextInt();

        //Enter the elements in the array

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if (n== 1){
            System.out.println("0");
        }

        

        //Solve the Problem

    }
}

//not completed