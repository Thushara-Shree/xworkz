package com.xworkz.internal;

public class Projector {
        private String brand;
        private int resolution;
        private boolean isWireless;

        public Projector(String brand, int resolution, boolean isWireless) {
            this.brand = brand;
            this.resolution = resolution;
            this.isWireless = isWireless;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Resolution: " + resolution + "p, Wireless: " + (isWireless ? "Yes" : "No");
        }
    }


