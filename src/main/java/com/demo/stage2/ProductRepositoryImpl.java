package com.demo.stage2;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public void save(String product) {
        System.out.println("inventory updated for product " + product );
    }
}
