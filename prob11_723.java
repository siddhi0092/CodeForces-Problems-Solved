import java.util.Arrays;
import java.util.Scanner;

public class prob11_723 {
    public static void main(String[] args){
        //arrange them in ascending order
        // and then check the distance between the biggest and the smallest no. and the middle will be the min . distance they have to travel


        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Minimum distance = largest - smallest
        int ans = arr[2] - arr[0];

        System.out.println(ans);
    }
}
