package com.xworkz.internal;

public class Laptop {
        private String brand;
        private String processor;
        private int ramSize;

        public Laptop(String brand, String processor, int ramSize) {
            this.brand = brand;
            this.processor = processor;
            this.ramSize = ramSize;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Processor: " + processor + ", RAM: " + ramSize + "GB";
        }
    }

