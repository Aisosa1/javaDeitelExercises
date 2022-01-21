package CHAPTER2DEITEL;

import java.util.Scanner;

public class Deitel2 {
    public static void main(String[] args) {

// 2.3
        int e;
        int thisIsAVariable;
        int q76354;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer");
        int variable = input.nextInt();

        System.out.println("this is a java program");
        System.out.printf("%s%n%s%n","this is a java","program");

        if (variable != 7)
            System.out.println("variable is not equal to 7");

        // 2.4

int x;
int y;
int z;
int result;

        System.out.println("enter first integer");
        x = input.nextInt();
        System.out.println("enter second integer");
        y = input.nextInt();
        System.out.println("enter third integer");
        z = input.nextInt();

        result = x + y + z;

        System.out.println("the product is " + result);

        // 2.8
// this program performs a simple payroll calculation
        System.out.print("enter an integer ");
        int c = 10;
        int b = 12;
        int a = b + c;

        // 2.14

        System.out.println("1 2 3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");

        // 2.15

        System.out.println("enter first integer");
        int sum1 = input.nextInt();
        System.out.println("enter second integer");
        int sum2 = input.nextInt();

        System.out.print(sum1);
        System.out.println(sum2);
        System.out.println(sum1 + sum2);

        int quotient = sum1/sum2;

        System.out.println(quotient);

        // 2.16

        System.out.println("enter first integer");
        int sumInteger1 = input.nextInt();
        System.out.println("enter second integer");
        int sumInteger = input.nextInt();

        if (sumInteger1 > sumInteger)
            System.out.println(sumInteger1 + " is larger");

        if (sumInteger1 == sumInteger)
            System.out.println("these numbers are equal");

        // 2.17
        System.out.println("enter first integer");
        int sumInteger0 = input.nextInt();
        System.out.println("enter second integer");
        int sumInteger12 = input.nextInt();
        System.out.println("enter third integer");
        int sumInteger32 = input.nextInt();

        int product = sumInteger0 + sumInteger12 + sumInteger32;
        System.out.println( "total sum is " + product);

        int average1 = product/3;

        System.out.println("average number is " + average1);

        if (sumInteger0 > sumInteger12 && sumInteger0 > sumInteger32)
            System.out.println("largest number is " + sumInteger0);

        if (sumInteger12 > sumInteger0 && sumInteger12 > sumInteger32)
            System.out.println( "largest number is " + sumInteger12);
        if (sumInteger32 > sumInteger0 && sumInteger32 > sumInteger12)
            System.out.println("largest number is " + sumInteger32);

        if (sumInteger0 < sumInteger12 && sumInteger0 < sumInteger32)
            System.out.println("lowest number is " + sumInteger0);
        if (sumInteger12 < sumInteger0 && sumInteger12 < sumInteger32)
            System.out.println("lowest number is " + sumInteger12);
        if (sumInteger32 < sumInteger0 && sumInteger32 < sumInteger12)
            System.out.println("lowest number is " + sumInteger32);

        // 2.18

        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");


        System.out.println("   ***    ");
        System.out.println(" *     *  ");
        System.out.println("*       * ");
        System.out.println("*       * ");
        System.out.println("*       * ");
        System.out.println("*       * ");
        System.out.println("*       * ");
        System.out.println(" *     *  ");
        System.out.println("   ***    ");

        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");


        System.out.println("     *     ");
        System.out.println("    * *    ");
        System.out.println("   *   *   ");
        System.out.println("  *     *  ");
        System.out.println(" *       * ");
        System.out.println("  *     *  ");
        System.out.println("   *   *   ");
        System.out.println("    * *    ");
        System.out.println("     *     ");

// 2.19
        System.out.printf("*%n**%n***%n****%n*****%n");

        // 2.20
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");

        // 2.21
        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");

        // 2.22
        System.out.print("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.print("****");
        System.out.println("**");

        // 2.23
        System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");

        // 2.24
            System.out.println("enter first integer");
            int sumInteger101 = input.nextInt();
            System.out.println("enter second integer");
            int sumInteger222 = input.nextInt();
            System.out.println("enter third integer");
            int sumInteger323 = input.nextInt();
            System.out.println("enter fourth integer");
            int sumInteger300 = input.nextInt();
            System.out.println("enter fifth integer");
            int sumInteger301 = input.nextInt();

            if (sumInteger101 > sumInteger222 && sumInteger101 > sumInteger323 &&
                    sumInteger101 > sumInteger300 && sumInteger101 > sumInteger301)
                    System.out.println("largest number is " + sumInteger101);

            if (sumInteger222 > sumInteger101 && sumInteger222 > sumInteger323 && sumInteger222 > sumInteger300
                    && sumInteger222 > sumInteger301)
                    System.out.println( "largest number is " + sumInteger222);

            if (sumInteger323 > sumInteger101 && sumInteger323 > sumInteger222
                    && sumInteger323 > sumInteger300 && sumInteger323 > sumInteger301)
                    System.out.println("largest number is " + sumInteger323);

            if (sumInteger300 > sumInteger323 && sumInteger300 > sumInteger101 && sumInteger300 > sumInteger222
                    && sumInteger300 > sumInteger301)
                    System.out.println("largest number is " + sumInteger300);

            if (sumInteger301 > sumInteger101 && sumInteger301 > sumInteger222 && sumInteger301 > sumInteger323
                    && sumInteger301 > sumInteger300)
                    System.out.println("largest number is " + sumInteger301);

            if (sumInteger101 < sumInteger222 && sumInteger101 < sumInteger323
                    && sumInteger101 < sumInteger300 && sumInteger101 < sumInteger301)
                    System.out.println("lowest number is " + sumInteger101);

            if (sumInteger222 < sumInteger101 && sumInteger222 < sumInteger323 && sumInteger222 < sumInteger300
                    && sumInteger222 < sumInteger301)
                    System.out.println("lowest number is " + sumInteger222);

            if (sumInteger323 < sumInteger101 && sumInteger323 < sumInteger222 && sumInteger323 < sumInteger300
                    && sumInteger323 < sumInteger301)
                    System.out.println("lowest number is " + sumInteger323);

            if (sumInteger300 < sumInteger323 && sumInteger300 < sumInteger101 && sumInteger300 < sumInteger222
                    && sumInteger300 < sumInteger301)
                    System.out.println("lowest number is " + sumInteger300);

            if (sumInteger301 < sumInteger101 && sumInteger301 < sumInteger222 && sumInteger301 < sumInteger323
                    && sumInteger301 < sumInteger300)
                    System.out.println("lowest number is " + sumInteger301);

            // 2.25
        int number20 = input.nextInt();
        if (number20 % 2 == 0)
            System.out.println("number is odd");

        // 2.26
        System.out.println("enter first digit");
        int number1 = input.nextInt();

        System.out.println("enter second digit");
        int number2 = input.nextInt();

        System.out.printf("%d %d%n", number1, number2);

        if (number1 % number2 == 0)
            System.out.println("result");

        // 2.17

        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");





    }

}
