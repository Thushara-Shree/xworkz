package com.xworkz.collection.dto;

public class JuiceDTO {

    private String name;
    private int price;
    private String type;
    private String flavor;
    private int count;
    private String color;
    private String expiryDate;

    public JuiceDTO(String name, int price, String type, String flavor, int count, String color, String expiryDate) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.flavor = flavor;
        this.count = count;
        this.color = color;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "JuiceDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", flavor='" + flavor + '\'' +
                ", count=" + count +
                ", color='" + color + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
