package com.demo.stage3;

import com.demo.OrerInfo;
import org.springframework.stereotype.Component;

@Component
public class Notifier {
    public void sendReceipt(OrerInfo orerInfo) {
        System.out.println("Receipt sent to customer '" + orerInfo.getCustomerName() + "' via email..");
    }
}
