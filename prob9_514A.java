//Chewbacca and number

import java.util.*;

public class prob9_514A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  // Use long for numbers up to 10^18
        
        // Convert to string to get digits easily
        String numStr = Long.toString(n);
        int digits = numStr.length();
        
        int[] arr = new int[digits];
        
        // Store digits in correct order (left to right)
        for (int i = 0; i < digits; i++) {
            arr[i] = numStr.charAt(i) - '0';
        }
        
        // Process each digit
        for (int i = 0; i < digits; i++) {
            if (i == 0) {  // First digit
                if (arr[i] >= 5 && arr[i] != 9) {
                    arr[i] = 9 - arr[i];
                }
            } else {  // Other digits
                if (arr[i] >= 5) {
                    arr[i] = 9 - arr[i];
                }
            }
        }
        
        // Build the result string
        String str = "";
        for (int i = 0; i < digits; i++) {
            str = str + arr[i];  // Now this works (concatenates)
        }
        
        System.out.println(str);
    }
}