import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob21_59A {
    public static void main(String[] args) throws IOException{
        //input 2 integers
        //n - number of soldiers
        //k - number of soldiers 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int upperCount = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCount++;
            }
        }
        if (upperCount > len / 2) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}