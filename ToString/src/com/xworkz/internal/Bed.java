package com.xworkz.internal;



    public class Bed {
        private String size;
        private String material;
        private boolean hasStorage;

        public Bed(String size, String material, boolean hasStorage) {
            this.size = size;
            this.material = material;
            this.hasStorage = hasStorage;
        }

        @Override
        public String toString() {
            return "Size: " + size + ", Material: " + material + ", Storage: " + (hasStorage ? "Yes" : "No");
        }
    }


