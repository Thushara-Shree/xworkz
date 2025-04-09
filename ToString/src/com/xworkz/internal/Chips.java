package com.xworkz.internal;

public class Chips {


        private String flavor;
        private int weight;
        private boolean isSpicy;

        public Chips(String flavor, int weight, boolean isSpicy) {
            this.flavor = flavor;
            this.weight = weight;
            this.isSpicy = isSpicy;
        }

        @Override
        public String toString() {
            return "Flavor: " + flavor + ", Weight: " + weight + "g, Spicy: " + (isSpicy ? "Yes" : "No");
        }
    }




