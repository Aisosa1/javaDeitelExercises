package CHAPTER4DEITEL;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {

        int counter = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);







        while (number > 1 && number % 2 == 0)  {
            System.out.println("enter figure");
            number = input.nextInt();

        System.out.println(number);
                counter = counter + 1;


        }
    }


}
