package com.xworkz.collection.dto;

public class LaptopDTO {

    private String brand;
    private String model;
    private int ramSize;
    private int storageSize;
    private String processor;
    private double screenSize;
    private double price;

    public LaptopDTO(String brand, String model, int ramSize, int storageSize, String processor, double screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.processor = processor;
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

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
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
        return "LaptopDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
}
