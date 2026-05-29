//Petya and Strings

import java.util.Scanner;

public class prob13_112A {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];

        for(int i = 0; i< 2; i++){
            arr[i] = sc.nextLine();
        }

        int result = arr[0].compareToIgnoreCase(arr[1]);
        if(result < 0){  //the first string comes before te second string
            System.out.println("-1");
        }
        else if (result > 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
