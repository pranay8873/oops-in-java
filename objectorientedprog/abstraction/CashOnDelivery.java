package com.java2.objectorientedprog.abstraction;

public class CashOnDelivery extends Payment {
    public CashOnDelivery(String id, String customerName, String paymentDate, String mode){
        super(id,customerName,paymentDate, mode);
        System.out.println("you have selected COD mode for payment");
    }
    @Override
    public boolean pay(double amount){
        super.paymentDetails();
        System.out.println("payment done At the time of delivery cash to be collected : "+amount);
        return true;
    }
}
