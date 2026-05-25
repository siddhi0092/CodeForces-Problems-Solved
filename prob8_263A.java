// Beautiful Matrix
import java.util.Scanner;
public class prob8_263A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input a 5 x 5 matrix

        int[][] arr = new int[5][5];

        for(int i =0; i<5; i++){
            for (int j = 0; j< 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // we need to bring the 1 to the center which is arr[2][2], we need to calculate the number of steps needed for it 

        // if arr[i] > 2, we need to i-2
        // if arr[i] < 2, we need to 2-i
        // if arr[j] > 2.. same follows
        int calc = 0;
        for(int i =0; i<5; i++){
            for (int j = 0; j< 5; j++){
                if (arr[i][j] == 1){
                    if (i>2){
                        calc += i - 2;
                    }
                    else if(i<2){
                        calc += 2 -i;
                    }
                    if (j > 2){
                        calc += j-2;
                    }
                    else if (j < 2){
                        calc += 2 - j;
                    } 
                }
            }
        }
        System.out.println(calc);
    }
}


//another method is you can directly calculate while taking in the input