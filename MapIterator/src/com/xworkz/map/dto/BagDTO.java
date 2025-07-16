package com.xworkz.map.dto;

public class BagDTO {

    private String brand;
    private String color;
    private String material;
    private double price;
    private int capacityInLiters;
    private boolean waterproof;
    private int numberOfCompartments;
    private double weightInKg;
    private String type;
    private String zipperType;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setCapacityInLiters(int capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZipperType() {
        return zipperType;
    }

    public void setZipperType(String zipperType) {
        this.zipperType = zipperType;
    }

    public BagDTO(String brand, String color, String material, double price, int capacityInLiters, boolean waterproof, int numberOfCompartments, double weightInKg, String type, String zipperType) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.price = price;
        this.capacityInLiters = capacityInLiters;
        this.waterproof = waterproof;
        this.numberOfCompartments = numberOfCompartments;
        this.weightInKg = weightInKg;
        this.type = type;
        this.zipperType = zipperType;
    }

    public BagDTO() {
    }

    @Override
    public String toString() {
        return "BagDTO{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", capacityInLiters=" + capacityInLiters +
                ", waterproof=" + waterproof +
                ", numberOfCompartments=" + numberOfCompartments +
                ", weightInKg=" + weightInKg +
                ", type='" + type + '\'' +
                ", zipperType='" + zipperType + '\'' +
                '}';
    }
}
