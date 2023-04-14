package PaymentProject;

public class Credit extends PaymentMethod {
    private String expirationDate;
    private String cvv;

    public Credit(String accountNumber, String nameOnAccount, String expirationDate, String cvv) {
        super(accountNumber, nameOnAccount);
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getExpirationDate() { return expirationDate; }
    public String getCvv() { return cvv; }
    public PaymentProcessor.Status payment(){
        PaymentProcessor processor = new PaymentProcessor();
        return processor.processPayment(this.getAccountNumber(), this.getAvailableBalance(), this.getCvv());
    }
}
