package card;

public class DebitCard extends Cards {

    private String cardNumber;

    private String expiryDate;

    private int securityNumber;

    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;

    }

    public String getCardNumber() {
        return this.getMainCardNumber();
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getExpiryDate() {
        return this.getMainExpiryDate();
    }

    public int getSecurityNumber() {
        return this.getMainSecurityNumber();
    }

    public String scan() {
        return "Payment Complete";
    }
}
