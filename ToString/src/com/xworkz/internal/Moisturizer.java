package com.xworkz.internal;



    public class Moisturizer {
        private String brand;
        private int quantity;
        private boolean isForDrySkin;

        public Moisturizer(String brand, int quantity, boolean isForDrySkin) {
            this.brand = brand;
            this.quantity = quantity;
            this.isForDrySkin = isForDrySkin;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Quantity: " + quantity + "ml, For Dry Skin: " + (isForDrySkin ? "Yes" : "No");
        }
    }


