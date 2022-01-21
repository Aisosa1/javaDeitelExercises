package CHAPTER3DITEL;

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

Invoice sale1 = new Invoice("tge001", "electronics", 0, 0.0 );

        Scanner input = new Scanner(System.in);
        System.out.println("enter quantity");
        int quantity = input.nextInt();
        sale1.setQuantity(quantity);
        System.out.println(sale1.getQuantity());

        System.out.println("enter price");
        double price = input.nextDouble();
        sale1.setPrice(price);
        System.out.println(sale1.getPrice());

        double amount = price * quantity;
        sale1.getInvoiceAmount();
            System.out.println("price is " + amount);

    }


}
