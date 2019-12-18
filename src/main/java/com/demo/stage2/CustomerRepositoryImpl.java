package com.demo.stage2;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void save(String customerName) {
        System.out.println("customer purchase saved for customer " + customerName );
    }
}
