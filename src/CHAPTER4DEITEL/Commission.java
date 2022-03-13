package CHAPTER4DEITEL;
//
import java.util.Scanner;
//
public class Commission {
    public static void main(String[] args) {
//        int itemCount = 0;
//        int pay = 200;
//        double total = 0;
//
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("input item value or enter -1 to exit");
//        double itemValue = input.nextDouble();
//
//        while (itemValue != -1){
//
//            total = total + itemValue;
//
//            itemCount = itemCount + 1;
//
//            System.out.println("input item value or enter -1 to exit");
//            itemValue = input.nextDouble();
//        }
//
//
//        if (itemCount != 0){
//
//        System.out.println(itemCount);
//            System.out.println(itemValue);
//
//            double percentage = total * 9/100;
//
//            System.out.println("sales percentage is " + percentage);
//
//            double totalMoney = pay + percentage;
//
//            System.out.println("worker earnings is " + totalMoney);
//
//            System.out.println();
//
//        System.out.println("total amount sold is " + total);
//        System.out.println((-5)*(-10)*(-20));
//        int a = 4;
//        int n = 0;
//        System.out.print(++n);
//        System.out.print(n++);
//        System.out.print(n++);

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int total = 0;

        for (int i = 1; i <= 4; i--) {
            total = scanner.nextInt();
            total = total - 1;
            System.out.print(total);
        }

        int counter = 1;

        while (counter > 20) {
            counter -= 1;

        }
    }
//        System.out.println(a++ + a); // 5
//        System.out.println(b); // 5
    }

//}
