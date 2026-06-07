//wrong subtraction

import java.util.Scanner;

public class prob22_977A {
    public static void main(String[] args){
        //n - the number from which tanya will subtract  
        // k - number of subtractions correspondingly

        //check if the last digit is 0 -> if yes divide by 10. if no then less 1
        Scanner sc = new Scanner(System.in);
        
        // n - the number from which tanya will subtract
        // k - number of subtractions correspondingly
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // check if the last digit is 0 -> if yes divide by 10. if no then less 1
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else {
                n = n - 1;
            }
        }
        
        System.out.println(n);
        sc.close();
    }
}