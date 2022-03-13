package E_store;

public class Seller extends UserInfo{

    private UserAdress add;


    public Seller(String name, String mail, String passCode, double phoneNumber, E_store.UserAdress add) {
        super("Mr. Patrick Chike", "patrick01@gmail.com",
                "password01",457669433);
        this.add = add;
    }
}
