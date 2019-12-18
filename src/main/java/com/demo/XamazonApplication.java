package com.demo;



import com.demo.stage1.CustomerRepository;
import com.demo.stage1.Notifier;
import com.demo.stage1.ProductRepository;
import com.demo.stage2.*;
import com.demo.stage3.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class XamazonApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option: ");
        System.out.println("Stage 1");
        System.out.println("Stage 2");
        System.out.println("Stage 3");
        final int choice = scanner.nextInt();

        OrerInfo orerInfo = new OrerInfo(
                "Ravi",
                "ravi.s@abc.com",
                "iphone 11",
                10000,
                "456789090"
        );
        System.out.println();
        System.out.println("Processing Order .....");
        System.out.println();
        switch (choice) {
            case 1:
                final com.demo.stage1.Commerce commerce1 = new com.demo.stage1.Commerce();
                commerce1.processOrder(orerInfo);
                break;

            case 2:
                final Commerce commerce2 = new Commerce(
                        new BillingProcessorImpl(),
                        new CustomerProcessorImpl(new CustomerRepositoryImpl(), new ProductRepositoryImpl()),
                        new Notifier());

                commerce2.processOrder(orerInfo);
                break;

            case 3:
                ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
                final com.demo.stage3.Commerce commerce3 = context.getBean(com.demo.stage3.Commerce.class);
                commerce3.processOrder(orerInfo);
                break;
            default:
                throw new IllegalArgumentException("Enter a right option");

        }
    }
}
