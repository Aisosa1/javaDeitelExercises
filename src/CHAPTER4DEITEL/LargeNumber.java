package CHAPTER4DEITEL;

import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        int count = 1;
        int number = 0;
        int large = 0;


        Scanner input = new Scanner(System.in);

        while (count <= 3){

            System.out.println("enter number");
            number = input.nextInt();
            System.out.println(number);

            count = count + 1;

            if (number > large){
                large = number;
            }

        }
                System.out.println("largest number is " + large);


    }
}
