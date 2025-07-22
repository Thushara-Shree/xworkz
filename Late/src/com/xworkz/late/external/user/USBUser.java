package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.USB;

public class USBUser {
    private USB usb;

    public USBUser(USB usb) {
        this.usb = usb;
    }

    public void useUSB() {
        if (usb != null) {
            usb.transferData();
        } else {
            System.out.println("USB is not initialized.");
        }
    }
}
