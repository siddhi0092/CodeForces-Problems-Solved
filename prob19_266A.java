//stones on the table

/*
Two pointer approach?

1) you compare all the adjacent, basically 3 pointer, mid, left and right, 

2) first comparison, that left and right should not be equal, if yes, remove mid. if not, dont remove the mid. and count while removing 

*/

import java.util.Scanner;
public class prob19_266A {
    public static void main(String[] args){

        //no. of stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        String[] arr = s.split("");

        if (arr.length <= 1){
            System.out.println("0");
            return;
        }

        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            if (arr[i].equals(arr[i+1])){
                count++;
            }
        }
        System.out.println(count);
    }
}
