package PaymentProject;

public class PaymentProcessor {
    public enum Status {AUTHORIZATION_FAILED, CHARGE_FAILED, SUCCESS};

    public PaymentProcessor() {
    }

    public Status processPayment(String accountNumber, double amount, String cvv) {
        // Check if account is valid and has enough credit
        boolean isAuthorized = false;
        isAuthorized = this.checkAuthorization(accountNumber, cvv);
        if (!isAuthorized) {
            return Status.AUTHORIZATION_FAILED;
        }

        // Charge the account
        boolean isCharged = chargeAccount(accountNumber, cvv, amount);
        if (!isCharged) {
            return Status.CHARGE_FAILED;
        }

        return Status.SUCCESS;
    }
    public Status AskRefund(String accountNumber, String cvv) {
        // refund the given amount from the card
        // return true if the refund is successful, false otherwise
        PaymentCompany p = new PaymentCompany(accountNumber, cvv);
        if(checkAuthorization(accountNumber, cvv)) {
            p.Refund();
            return Status.SUCCESS;
        }
        else return Status.AUTHORIZATION_FAILED;
    }
    public Status AskPartialRefund(String accountNumber, String cvv, double amount) {
        // refund the given amount from the card
        // return true if the refund is successful, false otherwise
        PaymentCompany p = new PaymentCompany(accountNumber, cvv, amount);
        if(checkAuthorization(accountNumber, cvv)) {
            p.PartialRefund();
            return Status.SUCCESS;
        }
        else return Status.AUTHORIZATION_FAILED;
    }
    public Status processEcheck(String accountNumber, String routingNumber){
        Bank bank = new Bank(accountNumber, routingNumber);
        if(bank.ProcessEcheck()) return Status.SUCCESS;
        return Status.CHARGE_FAILED;
    }
    public Status processPaypal(String accountNumber, String routingNumber){
        boolean isAuthorized = false;
        isAuthorized = this.checkPaypal(accountNumber, routingNumber);
        if (!isAuthorized) {
            return Status.AUTHORIZATION_FAILED;
        }

        Paypal p = new Paypal(accountNumber, routingNumber);
        boolean isCharged = p.processPaypal();
        if (!isCharged) {
            return Status.CHARGE_FAILED;
        }

        return Status.SUCCESS;
    }
    private boolean checkAuthorization(String accountNumber, String cvv) {
        // TODO: Implement authorization logic
        PaymentCompany p = new PaymentCompany(accountNumber, cvv);
        boolean b = p.isAuthorized();
        if(b) return true;
        return false;
    }

    private boolean chargeAccount(String accountNumber, String cvv, double amount) {
        // TODO: Implement charging logic
        PaymentCompany p = new PaymentCompany(accountNumber, cvv, amount);
        boolean b = p.isBalanceEnough();
        if(b) return true;
        return false;
    }
    private boolean checkPaypal(String accountNumber, String password){
        Paypal p = new Paypal(accountNumber, password);
        if(p.login()) return true;
        return false;
    }

}
