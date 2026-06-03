//Bear and Big Brother

import java.util.Scanner;
public class prob17_791A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //taking input
        int[] arr = new int[2];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int limak = arr[0];
        int bob = arr[1];
        int count = 0;
        while(limak <= bob){
            limak *= 3; //weight triples
            bob *= 2;
            count += 1;
        }

        System.out.println(count);
        sc.close();
    }
}