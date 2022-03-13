package E_store;

public class UserInfo {
    private String name;
    private String mail;
    private UserAdress add;
    private String passCode;
    private double phoneNumber;

    public UserInfo(String name, String mail, String passCode, double phoneNumber){
        this.name = name;
        this.mail = mail;
        this.passCode = passCode;
        this.phoneNumber = phoneNumber;
    }
}
