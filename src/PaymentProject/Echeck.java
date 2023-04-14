package PaymentProject;
public class Echeck extends PaymentMethod {
    private String routingNumber;

    public Echeck(String accountNumber, String nameOnAccount, String routingNumber) {
        super(accountNumber, nameOnAccount);
        this.routingNumber = routingNumber;
    }
    public PaymentProcessor.Status ElectronicCheck(){
        PaymentProcessor processor = new PaymentProcessor();
        return processor.processEcheck(this.getAccountNumber(), this.getRoutingNumber());
    }
    public String getRoutingNumber() { return routingNumber; }
}

