//Domino Piling

import java.util.*;
public class prob7_50A{
    public static void main(String[] args){
        //Math.floorDiv(,)
        Scanner sc = new Scanner(System.in);

        int[] val = new int[2];

        //taking the input
        for(int i =0; i< 2; i++){
            val[i] = sc.nextInt();
        }

        //calculating

        int row = val[0];
        int cols = val[1];
        int ans = 0;
        if ((row*cols) % 2 == 0 ){ //even number
            ans = (row*cols) / 2;
        }
        else{
            ans = Math.floorDiv((row*cols),2);
        }
        System.out.println(ans);
    }
}