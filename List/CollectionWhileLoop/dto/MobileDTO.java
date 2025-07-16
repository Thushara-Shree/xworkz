package com.xworkz.collection.dto;

public class MobileDTO {

    private String brand;
    private String model;
    private String operatingSystem;
    private int ramSize;
    private int storageSize;
    private double screenSize;
    private double price;

    public MobileDTO(String brand, String model, String operatingSystem, int ramSize, int storageSize, double screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobileDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
}
