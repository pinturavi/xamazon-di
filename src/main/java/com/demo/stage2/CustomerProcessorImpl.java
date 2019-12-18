package com.demo.stage2;



public class CustomerProcessorImpl implements CustomerProcessor {

    private final CustomerRepository customerRepository;

    private final ProductRepository productRepository;

    public CustomerProcessorImpl(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void updateCustomerOrder(String customerName, String product) {
        customerRepository.save(customerName);
        productRepository.save(product);
    }
}
