package com.xworkz.internal;


    public class Bird {
        private String species;
        private String color;
        private boolean canFly;

        public Bird(String species, String color, boolean canFly) {
            this.species = species;
            this.color = color;
            this.canFly = canFly;
        }

        @Override
        public String toString() {
            return "Species: " + species + ", Color: " + color + ", Can Fly: " + (canFly ? "Yes" : "No");
        }
    }


