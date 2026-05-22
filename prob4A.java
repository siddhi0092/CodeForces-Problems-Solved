//thoery: odd + even = odd; 


import java.util.*;
public class prob4A {
    public static void main(String[] args){
        //input the weight of the watermelon bought by the boys
        //each of the two part 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0 && n != 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

