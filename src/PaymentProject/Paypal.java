package PaymentProject;
public class Paypal{
    static String defaultAccountNumber;
    static String defaultPassword;
    String accountNumber;
    String password;
    public Paypal(String accountNumber, String password){
        this.accountNumber = accountNumber;
        this.password = password;
    }
    public boolean login(){
        if(accountNumber == defaultAccountNumber && password == defaultPassword) return true;
        return false;
    }
    public boolean processPaypal(){
        // TODO: use paypal to process payment
        return true;
    }
}
