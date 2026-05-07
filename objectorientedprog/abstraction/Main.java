package com.java2.objectorientedprog.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your option: ");
        System.out.println("1. Cash On Delivery");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. UPI ");
        System.out.println("Enter Your Choice: ");
        int choice = scanner.nextInt();
        Order order;
        Payment payment;
        double amount;
        int otp;
        switch (choice) {
            case 1:
                payment = new CashOnDelivery("1","Pranay","09-06-2024","cash_on_delivery");
                order = new Order(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (order.processorder(amount))
                    System.out.println("Order processed successfully using cash");
                break;
            case 2:
                payment = new CreditCardPayment("2","Pranay","01-04-2026","credit_card");
                order = new Order(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (order.processorder(amount))
                    System.out.println("Order processed successfully using credit card");

                break;
            case 3:
                payment = new DebitCard("3","Pranay","01-04-2026","debit_card");
                order = new Order(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (order.processorder(amount))
                    System.out.println("Order processed successfully using debit card");
                break;
            case 4:
                payment = new UPIPayment("4","Pranay","01-04-2026","upi");
                order = new Order(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (order.processorder(amount))
                    System.out.println("Order processed successfully using UPI");
                break;
            default:
                System.out.println("Invalid option");
        }


    }
}
