package CHAPTER3DITEL;

import java.util.Scanner;

public class Account2Test {
    public static void main(String[] args) {
    /*    Account2 peterAccount = new Account2("Peter Eno-obong", 0.0);
        Account2 babeAccount = new Account2("Aisosa Yemisi", 0.0);

        Scanner input = new Scanner(System.in);

        System.out.println("enter name");
        String accountName = input.next();
        System.out.println(accountName);
        System.out.println("initial account balance is " + peterAccount.getAccountBalance());

        System.out.println("enter first deposit");
        double deposit = input.nextDouble();
        peterAccount.setDeposit(deposit);
        System.out.println("enter second deposit");
        deposit = input.nextDouble();
        peterAccount.setDeposit(deposit);

        System.out.println("current balance is " + peterAccount.getAccountBalance());

        System.out.println();






        System.out.println(babeAccount.displayAccount()); */
    }
    public static void displayAccount (String display){
        Account2 peterAccount = new Account2("Peter Eno-obong", 0.0);

        System.out.println(peterAccount.displayAccount());

    }
}
