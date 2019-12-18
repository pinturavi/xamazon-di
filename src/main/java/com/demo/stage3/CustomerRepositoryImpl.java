package com.demo.stage3;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void save(String customerName) {
        System.out.println("customer purchase saved for customer " + customerName );
    }
}
