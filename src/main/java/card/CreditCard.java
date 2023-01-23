package card;

public class CreditCard extends Cards {
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

    public String getCardNumber() {
        return this.getMainCardNumber();
    }

    public String getExpiryDate() {
        return this.getMainExpiryDate();
    }

    public int getSecurityNumber() {
        return this.getMainSecurityNumber();
    }

    public String scan() {
        return "Payment Successful";
    }
}
