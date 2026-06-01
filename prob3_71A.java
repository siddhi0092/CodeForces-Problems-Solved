//Way too  long words

import java.util.*;
public class prob3_71A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Enter the number of test cases
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<t; i++){
            
            //Enter the word
            String word = sc.nextLine();

            String[] letter = word.split(""); //array of strings // regex stands for regular expression, it is like a tool, it comes in a package as well
            
            int n = letter.length;
            if (n <= 10){
                System.out.println(word);
            }
            else{
                // if letter is a string -> char first = letter.charAt(0);
                // if letter is an array of string -> char first = letter[0].charAt(0);

                char first = letter[0].charAt(0);
                char last = letter[n-1].charAt(0);  //.charAt is the index of the character 
                int count = 0;
                for (int j = 1; j<n-1; j++){
                    count++;
                }
                // final is a strictly reserved keyword used to declare constants.
                String result = "" + first + count + last;
                System.out.println(result);
            }

        }
        
    }
}
