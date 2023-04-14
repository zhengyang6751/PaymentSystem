package PaymentProject;

public class PaypalAccount extends PaymentMethod{

        private String routingNumber;

        public PaypalAccount(String accountNumber, String name, String routingNumber) {
            super(accountNumber, name);
            this.routingNumber = routingNumber;
        }

        public String getRoutingNumber() { return routingNumber; }

        public PaymentProcessor.Status process(){
        PaymentProcessor processor = new PaymentProcessor();
        return processor.processPaypal(this.getAccountNumber(), this.getRoutingNumber());
    }
}
