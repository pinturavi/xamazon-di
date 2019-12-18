package com.demo.stage1;

import com.demo.OrerInfo;

public class Notifier {
    public void sendReceipt(OrerInfo orerInfo) {
        System.out.println("Receipt sent to customer '" + orerInfo.getCustomerName() + "' via email..");
    }
}
