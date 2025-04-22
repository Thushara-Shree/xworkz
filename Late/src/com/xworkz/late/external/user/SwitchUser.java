package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Switch;

public class SwitchUser {
    private Switch sw;

    public SwitchUser(Switch sw) {
        this.sw = sw;
    }

    public void useSwitch() {
        if (sw != null) {
            sw.turnOn();
        } else {
            System.out.println("Switch is not initialized.");
        }
    }
}
