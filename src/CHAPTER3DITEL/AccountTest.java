package CHAPTER3DITEL;

import java.util.Scanner;

public class AccountTest {


        public static void main(String[] args) {
            Account myAccount1 = new Account("success Wisdom", 0.0, 4567);


            System.out.printf("Name is: %s%n balance is: %.2f%n pin is: %f ",myAccount1.getName(), myAccount1.getBalance(), myAccount1.getPin());
            System.out.println();

            Scanner input = new Scanner(System.in);

            System.out.println("enter deposit amount");

            double depositAmount = input.nextDouble();
            System.out.println(depositAmount);
            myAccount1.fixDeposit(depositAmount);

            System.out.println("enter deposit");
            depositAmount = input.nextDouble();
            System.out.println(depositAmount);
            myAccount1.fixDeposit(depositAmount);

            System.out.println("balance is " + myAccount1.getBalance());

            System.out.println("enter withdrawal amount");
            double withdraw = input.nextDouble();
            myAccount1.getWithdraw();
            myAccount1.setWithdraw(withdraw);

            System.out.println("balance is " + myAccount1.getBalance());







        }




    }

