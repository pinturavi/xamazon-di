package com.demo.stage3;

import com.demo.OrerInfo;
import org.springframework.stereotype.Component;

@Component
public class Commerce {

    private final BillingProcessor billingProcessor;
    private final CustomerProcessor customerProcessor;
    private final Notifier notifier;

    public Commerce(BillingProcessor billingProcessor, CustomerProcessor customerProcessor, Notifier notifier) {
        this.billingProcessor = billingProcessor;
        this.customerProcessor = customerProcessor;
        this.notifier = notifier;
    }


    public void processOrder(OrerInfo orerInfo) {
        billingProcessor.processPayment(orerInfo.getCustomerName(), orerInfo.getCreditCard(), orerInfo.getPrice());
        customerProcessor.updateCustomerOrder(orerInfo.getCustomerName(), orerInfo.getProduct());
        notifier.sendReceipt(orerInfo);
    }
}
