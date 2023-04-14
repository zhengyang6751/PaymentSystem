package PaymentProject;

import java.util.ArrayList;

public class Bank{

    String checkAccountNumber;
    String checkRoutingNumber;
    public Bank(String accountNumber, String routingNumber){
        checkAccountNumber = accountNumber;
        checkRoutingNumber = routingNumber;
    }
    public boolean ProcessEcheck(){
        // TODO: process this Echeck;
        return true;
    }
}
