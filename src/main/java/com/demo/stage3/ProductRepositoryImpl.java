package com.demo.stage3;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public void save(String product) {
        System.out.println("inventory updated for product " + product );
    }
}
