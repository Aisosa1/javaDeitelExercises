package Chapter4.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int sum = 0;
        int score = 0;
        int [] numbers = new int[10];
        double average = 0.0;



        for (count = 0; count < 2; count++){
        System.out.println("enter your score");
         score = scanner.nextInt();
            sum = sum + score;

            if ( max < score){

                max = score;
            }
            if (min > score){
                min = score;
            }

average = sum/(10 * 1.0);
        }
        System.out.println(score + " ");

            Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
            System.out.println("total sum is " + sum);

        System.out.println("maximum number is " + max);
        System.out.println("minimum number is " + min);
        System.out.println("average number is" + average);



    }
}
