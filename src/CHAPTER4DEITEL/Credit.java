package CHAPTER4DEITEL;

public class Credit {

      private int accountNumber;
        private int beginningBalance;
       private int charge ;
       private int credit;
       private int limit;
       private int newBalance;

        public Credit (int accountNumber, int beginningBalance, int charge, int credit, int limit){
                this.accountNumber = accountNumber;
                this.beginningBalance = beginningBalance;
                this. charge = charge;
                this.credit = credit;
                this.limit = limit;


            newBalance = beginningBalance + charge - credit;
        }

                public void setNewBalance (int newBalance){
            this.newBalance = newBalance;
                }

    public double getNewBalance() {
            if (newBalance <= limit);
            return newBalance;
        }

    public void setAccountNumber (int accountNumber){
                this.accountNumber = accountNumber;
        }

        public int getAccountNumber(){
                return accountNumber;
        }

        public void setBeginningBalance(int beginningBalance) {
                this.beginningBalance = beginningBalance;
        }

        public int getBeginningBalance() {
                return beginningBalance;
        }

        public void setCharge(int charge) {
                this.charge = charge;
        }

        public int getCharge() {
                return charge;
        }

        public void setCredit(int credit) {
                this.credit = credit;
        }

        public int getCredit() {
                return credit;
        }

        public void setLimit(int limit) {
                this.limit = limit;
        }

        public int getLimit() {
                return limit;
        }
}
