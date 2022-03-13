package E_store;

import java.util.ArrayList;

public class CreditCardInfo {
    private String cardName;
    private double cardNumber;
    private int cardCvv;
    private int expirationYear;
    private int expirationMonth;
    private ArrayList<CardType> type;

    public CreditCardInfo (String cardName, double cardNumber, int cardCvv, int expirationMonth, int expirationYear){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardCvv = cardCvv;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }
}
