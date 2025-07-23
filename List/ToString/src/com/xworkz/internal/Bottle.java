package com.xworkz.internal;



    public class Bottle {
        private String material;
        private int capacity;
        private boolean isReusable;

        public Bottle(String material, int capacity, boolean isReusable) {
            this.material = material;
            this.capacity = capacity;
            this.isReusable = isReusable;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Capacity: " + capacity + "ml, Reusable: " + (isReusable ? "Yes" : "No");
        }
    }


