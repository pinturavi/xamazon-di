package com.demo.stage1;

import com.demo.OrerInfo;

public class Commerce {

    public void processOrder(OrerInfo orerInfo) {
        final BillingProcessor billingProcessor = new BillingProcessor();
        final CustomerProcessor customerProcessor = new CustomerProcessor();
        final Notifier notifier = new Notifier();

        billingProcessor.processPayment(orerInfo.getCustomerName(), orerInfo.getCreditCard(), orerInfo.getPrice());
        customerProcessor.updateCustomerOrder(orerInfo.getCustomerName(), orerInfo.getProduct());
        notifier.sendReceipt(orerInfo);
    }
}
