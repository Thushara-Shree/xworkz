package com.xworkz.internal;



    public class Mobile {
        private String brand;
        private String model;
        private int storage;

        public Mobile(String brand, String model, int storage) {
            this.brand = brand;
            this.model = model;
            this.storage = storage;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB";
        }
    }



