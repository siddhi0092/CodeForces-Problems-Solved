//Helpful Maths
import java.io.BufferedReader; //is a built-in Java class used to read text from an input stream
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; //is a utility class in Java that provides various methods for manipulating arrays, such as sorting and searching.

public class prob15_339A {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //nextLine works perfectly fine

        String s = reader.readLine();

        String[] numbers = s.split("\\+");

        Arrays.sort(numbers);

        System.out.println(String.join("+", numbers));
    }
}
