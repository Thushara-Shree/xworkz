package com.xworkz.internal;


    public class Box {
        private String material;
        private int length;
        private boolean isSealed;

        public Box(String material, int length, boolean isSealed) {
            this.material = material;
            this.length = length;
            this.isSealed = isSealed;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Length: " + length + "cm, Sealed: " + (isSealed ? "Yes" : "No");
        }
    }


