package com.xworkz.internal;

public class DeviceInfo {
    private String device;
    private String brand;
    private String owner;

    public DeviceInfo(String device, String brand, String owner) {
        this.device = device;
        this.brand = brand;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Device Info:\n" +
                device.toString() + "\n" +
                "Brand: " + brand + "\n" +
                "Owner: " + owner;
    }
}

