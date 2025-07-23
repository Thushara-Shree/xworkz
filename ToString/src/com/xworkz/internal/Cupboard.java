package com.xworkz.internal;



    public class Cupboard {
        private String material;
        private int shelves;
        private boolean hasLock;

        public Cupboard(String material, int shelves, boolean hasLock) {
            this.material = material;
            this.shelves = shelves;
            this.hasLock = hasLock;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Shelves: " + shelves + ", Lock: " + (hasLock ? "Yes" : "No");
        }
    }


