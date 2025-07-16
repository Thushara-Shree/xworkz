package com.xworkz.map.dto;

public class JewelleryDTO {

    private String type;
    private String material;
    private double weightInGrams;
    private String gemstone;
    private double price;

    public JewelleryDTO() {
    }

    public JewelleryDTO(String type, String material, double weightInGrams, String gemstone, double price) {
        this.type = type;
        this.material = material;
        this.weightInGrams = weightInGrams;
        this.gemstone = gemstone;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getGemstone() {
        return gemstone;
    }

    public void setGemstone(String gemstone) {
        this.gemstone = gemstone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "JewelleryDTO{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", weightInGrams=" + weightInGrams +
                ", gemstone='" + gemstone + '\'' +
                ", price=" + price +
                '}';
    }
}
