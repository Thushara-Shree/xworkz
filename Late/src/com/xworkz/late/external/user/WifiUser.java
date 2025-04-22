package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Wifi;

public class WifiUser {
    private Wifi wifi;

    public WifiUser(Wifi wifi) {
        this.wifi = wifi;
    }

    public void useWiFi() {
        if (wifi != null) {
            wifi.connect();
        } else {
            System.out.println("WiFi is not initialized.");
        }
    }
}
