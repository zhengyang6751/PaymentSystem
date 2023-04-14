package PaymentProject;

import java.util.ArrayList;

public class PaymentCompany{
    static ArrayList<PaymentMethod> clients = new ArrayList<>();
    private String accountNumber;
    private String cvv;
    private double amount;
    public PaymentCompany(String accountNumber, String cvv, double amount) {
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.amount = amount;
    }
    public PaymentCompany(String accountNumber, String cvv) {
        this.accountNumber = accountNumber;
        this.cvv = cvv;
    }
    public boolean isAuthorized(){
        // TODO: search if there is a client in the database;
        return true;
    }
    public boolean isBalanceEnough(){
        if(isAuthorized()) {
            // TODO: if there is a client in the database, verify if there is enough balance;
            return true;
        }
        return false;
    }
    public boolean Refund(){
        // TODO: Refund for clients;
        return true;
    }
    public boolean PartialRefund(){
        // TODO: Partial refund for clients;
        return true;
    }
}