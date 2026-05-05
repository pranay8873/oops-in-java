package com.java2.objectorientedprog.inheritance;

public class DebitCard extends Payment{
    public DebitCard(String id, String customerName, String paymentDate, String mode){
        super(id,customerName,paymentDate, mode);
        System.out.println("you have selected Debit card mode for payment");
    }
    public boolean pay(double amount){
        super.paymentDetails();
        System.out.println("payment done using Debit card "+amount);
        return true;
    }
}
