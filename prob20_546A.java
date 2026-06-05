//Soldier and Bananas

import java.util.Scanner;
public class prob20_546A {
    public static void main(String[] args){
        //input 3 integers
        //k - the cost of the first banana
        //n - initial number of dollars the soldier has
        //w - no. of bananas he wants

        Scanner sc = new Scanner(System.in);

        //take 3 numbers input

        int[] arr = new int[3];

        for(int i =0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        int k = arr[0];
        int n = arr[1];
        int w = arr[2];

        //cost for the number of bananas 
        int sum = 0;
        for(int i =1; i<=w; i++){
            sum += i*k;
        }

        if(sum == n || sum < n){
            System.out.println("0");
            return;
        }
        else if(sum > n){
            System.out.println(sum-n);
            return;
        }

    }
}
