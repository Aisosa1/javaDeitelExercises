package CHAPTER4DEITEL;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {

        int figure = 0;
        int rowCount = 1;

        Scanner input = new Scanner(System.in);

        while (rowCount <= 5){

            System.out.println("enter figure");
            figure = input.nextInt();

            rowCount = rowCount + 1;


        }



    }
}
