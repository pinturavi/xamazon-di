package com.demo.stage1;

public class CustomerProcessor {
    public void updateCustomerOrder(String customerName, String product) {
        final CustomerRepository customerRepository = new CustomerRepository();
        final ProductRepository productRepository = new ProductRepository();

        customerRepository.save(customerName);
        productRepository.save(product);
    }
}
