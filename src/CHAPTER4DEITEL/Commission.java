package CHAPTER4DEITEL;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        int itemCount = 0;
        int pay = 200;
        double total = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("input item value or enter -1 to exit");
        double itemValue = input.nextDouble();

        while (itemValue != -1){

            total = total + itemValue;

            itemCount = itemCount + 1;

            System.out.println("input item value or enter -1 to exit");
            itemValue = input.nextDouble();
        }


        if (itemCount != 0){

        System.out.println(itemCount);
            System.out.println(itemValue);

            double percentage = total * 9/100;

            System.out.println("sales percentage is " + percentage);

            double totalMoney = pay + percentage;

            System.out.println("worker earnings is " + totalMoney);

            System.out.println();

        System.out.println("total amount sold is " + total);
        }
    }
}
