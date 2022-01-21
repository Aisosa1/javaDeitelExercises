package CHAPTER4DEITEL;

import java.util.Scanner;

public class CreditTest {
    public static void main(String[] args) {
        Credit customer1 = new Credit(4567,5000, 5600, 4000, 2000);
        Credit customer2 = new Credit(5555, 3000,2500,7000,14000);
        Credit customer3 = new Credit(1111,1000,1700,6000,10000);

        Scanner input = new Scanner(System.in);

            System.out.println(customer1.getNewBalance());
            if (customer1.getNewBalance() > customer1.getLimit())
                System.out.println("credit limit exceeded");

        System.out.println("new balance is " + customer2.getNewBalance());


    }
}
