package com.demo.stage2;

public interface BillingProcessor {
    void processPayment(String customerName, String creditCard, double price);
}
