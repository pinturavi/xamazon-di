package com.demo.stage3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BillingProcessorImpl implements BillingProcessor {
    @Override
    public void processPayment(String customerName, String creditCard, double price) {
        System.out.println("processing the payment...");
        System.out.println("Payment processed for customer " + customerName + " on credit card "+  creditCard + " for " + price);
    }
}
