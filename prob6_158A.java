// Next Round

import java.util.Scanner;

public class prob6_158A{
    public static void main(String[] args){
        int[] input = new int[2]; //taking the input of the first 2 ele
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<2; i++){
            input[i] = sc.nextInt();
        }

        int n = input[0];
        int k = input[1];

        int[] ele = new int[n];

        //Enter the rest of the array

        for(int i = 0; i<n; i++){
            ele[i] = sc.nextInt();
        }

        //check if the element in the array is greater than the given val
        int count = 0;
        for(int i = 0; i<n; i++){
            if(ele[i] > 0){
                if(ele[i] >= ele[k-1]){
                    count++;
                }
            }             
            else if(ele[i] == 0){
                break;
            }
            else if(ele[i] < 0){
                break;
            }
        }

        System.out.println(count);
        sc.close();
    }

}
