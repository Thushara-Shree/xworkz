package com.xworkz.late.internal.imple;

public class WifiImpl implements Wifi {

    public WifiImpl() {
        System.out.println("WiFiImpl object created.");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to WiFi...");
    }
}
