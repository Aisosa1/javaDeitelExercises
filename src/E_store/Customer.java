package E_store;

import java.util.ArrayList;

public class Customer extends UserInfo{

    private UserAdress add;
    private ArrayList<BillingInfo> billInfo;
    private ShoppingCart shoppingCart;


    public Customer(String name, String mail, String passCode, double phoneNumber) {
        super("Odilichukwu Peter", "odili@yahoo.com",
                "347yt5", 803457);
    }
}
