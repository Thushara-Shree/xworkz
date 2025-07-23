package com.xworkz.internal;

public class Chocolate {

        private String name;
        private double price;
        private String brand;

        public Chocolate(String name, double price, String brand) {
            this.name = name;
            this.price = price;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Chocolate Name: " + name + ", Price: $" + price + ", Brand: " + brand;
        }
    }


