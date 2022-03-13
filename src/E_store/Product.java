package E_store;

public class Product {
    private String name;
    private String id;
    private double price;
    private String productDescription;
    private ProductCategory category;

    public Product (String name, String id, double price, String productDescription, ProductCategory category){
        this.name = name;
        this.id = id;
        this.price = price;
        this.productDescription = productDescription;
        this.category = category;

    }

}
