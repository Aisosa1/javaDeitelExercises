package PurchaseReceipt;


import java.util.ArrayList;
import java.util.Scanner;

public class MartReceiptDriver {

        private static Scanner scanner = new Scanner(System.in);
        private static ArrayList<MartReceipt> catalogs = new ArrayList<MartReceipt>();

        public static void main(String[] args) {

//        String userInput;
            calculatePriceOf();
            displayCatalog();



        }

        private static void calculatePriceOf() {
            String userInput;
            do {
                System.out.println("What do you want to buy");
                String productName = scanner.nextLine();

                System.out.println("How much is it ");
                double amount = scanner.nextDouble();
                System.out.println("Total Quantity: ");
                int quantity = scanner.nextInt();

                double total = amount * quantity;

                MartReceipt group = new MartReceipt(productName, amount, quantity,total);
                catalogs.add(group);
                System.out.println("What Else????");
                scanner.nextLine();
                userInput = scanner.nextLine();
            }
            while(userInput.charAt(0)=='y');
        }

        public static void displayCatalog(){
            System.out.println("""
                        MALL MART!
                        10, Sabo, Yaba
                Product Name\tQuantity\tPrice\tTotal""");
            for (MartReceipt catalog: catalogs) {
                System.out.println(catalog.toString());
            }
        }



    }