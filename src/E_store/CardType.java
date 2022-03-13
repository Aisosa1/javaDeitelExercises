package E_store;

public enum CardType {
    MASTERCARD("Odilichukwu peter",55876545,678,12,2025),
    VISA("Madubuike Steven", 12345678,897,01,2023),
    VERVE("Grace Stephenie",1234567,987,02,2022),
    AMERICANEXPRESS("Jubilee Dike", 7654328,323,10,2026),
    ;

    private String cardName;
    private double cardNumber;
    private int cardCvv;
    private int expirationMonth;;
    private int expirationYear;

    CardType(String cardName, double cardNumber, int cardCvv, int expirationMonth, int expirationYear){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardCvv = cardCvv;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;


    }
}
