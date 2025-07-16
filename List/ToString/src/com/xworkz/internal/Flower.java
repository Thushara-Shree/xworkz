package com.xworkz.internal;



    public class Flower {
        private String name;
        private String color;
        private boolean hasFragrance;

        public Flower(String name, String color, boolean hasFragrance) {
            this.name = name;
            this.color = color;
            this.hasFragrance = hasFragrance;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Color: " + color + ", Fragrance: " + (hasFragrance ? "Yes" : "No");
        }
    }


