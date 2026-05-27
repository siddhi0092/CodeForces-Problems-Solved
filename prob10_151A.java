//Soft Drinking

import java.util.Scanner;
public class prob10_151A {
    public static void main(String[] args){
    //n friends
    //k bottles
    //L ml each bottle
    //c limes
    //d slices
    //p grams of salt

    //nl ml of drink each friend
    // one slice of lime 
    //np gm of salt
    
    //no. of ml available = k x L
    //no. of slices = c x d

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0; i<8; i++){
            arr[i] = sc.nextInt();
        }

        //calculation
         int n = arr[0];
        int k = arr[1];
        int l = arr[2];
        int c = arr[3];
        int d = arr[4];
        int p = arr[5];
        int nl = arr[6]; // drink per friend per toast
        int np = arr[7]; // salt per friend per toast

        int totalDrink = k * l;
        int totalSlices = c * d;
        int totalSalt = p;

        int toastsFromDrink = totalDrink / (n * nl);
        int toastsFromLime = totalSlices / n;
        int toastsFromSalt = totalSalt / (n * np);

        int toastsPerFriend = Math.min(toastsFromDrink, Math.min(toastsFromLime, toastsFromSalt));

        System.out.println(toastsPerFriend);
        sc.close();

    }
}
