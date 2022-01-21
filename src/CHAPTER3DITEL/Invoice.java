package CHAPTER3DITEL;

public class Invoice {

    private String serialNo;
    private String description;
    private int quantity;
    private double price;
    private double amount;

    public Invoice(String serialNo, String description, int quantity, double price){
        this.serialNo = serialNo;
        this.description = description;
        this.quantity = quantity;
        this.price = price;

        }
        public void setSerialNo(String serialNo){
            this.serialNo = serialNo;
    }
    public String getSerialNo (){
        return serialNo;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setQuantity (int quantity){
        if (quantity > 0)
        this.quantity = quantity;
    }

    public int getQuantity (){
        return quantity;
    }

    public void setPrice (double price){
        if (price > 0.0)
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public double getInvoiceAmount(){
        return amount;
    }

}
