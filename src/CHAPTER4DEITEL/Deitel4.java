package CHAPTER4DEITEL;

import java.util.Scanner;

public class Deitel4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int grade = input.nextInt();

        if (grade >= 90)
        System.out.println("A");
        else
            if (grade >= 80)
                System.out.println("B");
            else
                if (grade >= 70)
                    System.out.println("C");
                else
                    System.out.println("failed");
    }
}
