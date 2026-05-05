package com.java2.objectorientedprog.inheritance;

public class Order {
    Payment payment;
    public Order(Payment payment){
        this.payment=payment;
    }
    public boolean processorder(double amount){
        return payment.pay(amount);
    }

}
