package CHAPTER4DEITEL;

import java.util.Scanner;

public class SquareAstericks {
    public static void main(String[] args) {

        int num,num_ast;
        String asterisk= "*";

        Scanner pal = new Scanner(System.in);

        System.out.println("Enter number of asterisk: ");
        num_ast = pal.nextInt();

        num=0;
        while(num < num_ast)
        {
            System.out.println(asterisk);
            asterisk += "*";
            num++;
        }
    }
}
