package com.xworkz.internal;

public class LaptopDetails {


        private String laptop;
        private double price;
        private String owner;

        public LaptopDetails(String laptop, double price, String owner) {
            this.laptop = laptop;
            this.price = price;
            this.owner = owner;
        }

        @Override
        public String toString() {
            return "Laptop Details:\n" +
                    laptop.toString() + "\n" +
                    "Price: $" + price + "\n" +
                    "Owner: " + owner;
        }
    }


