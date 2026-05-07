package com.java2.objectorientedprog.abstraction;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(String id, String customerName, String paymentDate, String mode){
        super(id,customerName,paymentDate, mode);
        System.out.println("you have selected credit card mode for payment");
    }

    public boolean pay(double amount){
        super.paymentDetails();
        System.out.println("payment done using credit card "+amount);
        return true;
    }
}
