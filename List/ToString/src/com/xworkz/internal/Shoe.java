package com.xworkz.internal;

public class Shoe {

        private String brand;
        private int size;
        private String color;

        public Shoe(String brand, int size, String color) {
            this.brand = brand;
            this.size = size;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Size: " + size + ", Color: " + color;
        }
    }


