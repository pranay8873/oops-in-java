package com.java2.objectorientedprog.inheritance;

public class UPIPayment extends Payment{
    public UPIPayment(String id, String customerName, String paymentDate, String mode){
        super(id,customerName,paymentDate, mode);
        System.out.println("you have selected UPI mode for payment");
    }
    public boolean pay(double amount){
        super.paymentDetails();
        System.out.println("payment done Through UPI : "+amount);
        return true;
    }
}
