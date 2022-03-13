package PurchaseReceipt;

public class MartReceipt {
        private String productName;
        private double price;
        private int quantity;
        private double totalPrice;

        public MartReceipt(String productName, double price, int quantity, double totalPrice) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
            this.totalPrice = totalPrice;
        }

        @Override
        public String toString() {
            return
                    productName + "\t\t\t\t" +
                            quantity + "\t\t     "+
                            price + "\t"+
                            totalPrice
                    ;
        }
    }

