package com.demo.stage3;

public interface BillingProcessor {
    void processPayment(String customerName, String creditCard, double price);
}
