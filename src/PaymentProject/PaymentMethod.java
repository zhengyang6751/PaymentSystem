package PaymentProject;

public abstract class PaymentMethod {
    private String accountNumber;
    private String nameOnAccount;
    private double availableBalance;

    public PaymentMethod(String accountNumber, String nameOnAccount) {
        this.accountNumber = accountNumber;
        this.nameOnAccount = nameOnAccount;
        this.availableBalance = 0.0;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getNameOnAccount() { return nameOnAccount; }
    public double getAvailableBalance() { return availableBalance; }
    public void setAvailableBalance(double balance) {  }
}
