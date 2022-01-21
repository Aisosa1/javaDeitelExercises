package CHAPTER3DITEL;

public class Account2 {
    private String accountName;
    private double accountBalance;
    private String displayAccount;

    public Account2 (String accountName, double accountBalance){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void setAccountName (String name){
        accountName = name;
    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountBalance (double balance){
        accountBalance = balance;
    }
    public double getAccountBalance (){
        return accountBalance;
    }

    public static void setDisplayAccount (String displayAccount){
        displayAccount = displayAccount;

    }


    public String displayAccount (){
        displayAccount = getAccountName() + " " + getAccountBalance();
        return displayAccount;
    }

    public void setDeposit(double deposit) {
        if (deposit > 0.0);
        accountBalance = accountBalance + deposit;
    }
}
