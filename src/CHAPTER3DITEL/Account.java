package CHAPTER3DITEL;

public class Account {

    private String name;
    private double balance;
    private double pin;
    private double withdraw;

    public Account(String accountName, double accountBalance, double accountPin) {

        name = accountName;
        balance = accountBalance;
        pin = accountPin;
    }

    public void setName(String accountName) {

        name = accountName;
    }

    public String getName() {
        return name;
    }

    public void setPin(double accountPin) {
        pin = accountPin;
    }

    public double getPin() {

        return pin;
    }

    public double getBalance() {

        return balance;
    }


    public void fixDeposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void setWithdraw(double withdraw) {
        if (withdraw > 0.0 && withdraw <= balance)
            balance = balance - withdraw;
    }

    public double getWithdraw() {
        if (withdraw > balance) {
            return 0;
        }
        return balance;
    }

}
