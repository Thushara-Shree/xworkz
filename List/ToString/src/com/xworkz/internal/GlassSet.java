package com.xworkz.internal;

public class GlassSet {

        private String glass;
        private int quantity;
        private String owner;

        public GlassSet(String glass, int quantity, String owner) {
            this.glass = glass;
            this.quantity = quantity;
            this.owner = owner;
        }

        @Override
        public String toString() {
            return "Glass Set:\n" +
                    glass.toString() + "\n" +
                    "Quantity: " + quantity + "\n" +
                    "Owner: " + owner;
        }
    }


