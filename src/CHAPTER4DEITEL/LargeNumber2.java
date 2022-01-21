package CHAPTER4DEITEL;

import java.util.Scanner;

public class LargeNumber2 {

        public static void main(String[] args) {
            int count = 1;
            int number = 0;
            int large1 = 0;
            int large2 = 0;


            Scanner input = new Scanner(System.in);

            while (count <= 3){

                System.out.println("enter number");
                number = input.nextInt();
                System.out.println(number);

                count = count + 1;

                if (number >= large1 && number >= large2)
                    large1 = number;

                    if (number >= large2 && number < large1)
                        large2 = number;




            }
            System.out.println("largest number is " + large1);
            System.out.println("Second largest number is " + large2);


        }
    }
