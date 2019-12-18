package com.demo.stage2;

public class BillingProcessorImpl implements BillingProcessor {
    @Override
    public void processPayment(String customerName, String creditCard, double price) {
        System.out.println("processing the payment...");
        System.out.println("Payment processed for customer " + customerName + " on credit card "+  creditCard + " for " + price);
    }
}
