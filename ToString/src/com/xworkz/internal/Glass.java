package com.xworkz.internal;

public class Glass {

        private String material;
        private int capacity;
        private boolean isTransparent;

        public Glass(String material, int capacity, boolean isTransparent) {
            this.material = material;
            this.capacity = capacity;
            this.isTransparent = isTransparent;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Capacity: " + capacity + "ml, Transparent: " + (isTransparent ? "Yes" : "No");
        }
    }


