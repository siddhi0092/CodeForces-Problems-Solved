import java.util.*;
public class prob16_281A {
    public static void main(String[] args) {
        
        //take string input
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split("");

        if (Character.isUpperCase(s.charAt(0))){
            System.out.println(s);
        }
        else{
            arr[0] = arr[0].toUpperCase();
            String result = String.join("", arr);
            System.out.println(result);
        }

    }
}
