//Boy or Girl

import java.util.*;

public class prob14_236A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        //use hashset

        HashSet<Character> uniquechar = new HashSet<>();

        for(int i =0; i< word.length(); i++){
            uniquechar.add(word.charAt(i));
        }

        if(uniquechar.size() % 2 != 0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
    }
}
