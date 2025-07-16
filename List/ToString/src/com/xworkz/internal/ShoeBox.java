package com.xworkz.internal;


    public class ShoeBox {
        private String shoe;
        private String packedBy;
        private String label;

        public ShoeBox(String shoe, String packedBy, String label) {
            this.shoe = shoe;
            this.packedBy = packedBy;
            this.label = label;
        }

        @Override
        public String toString() {
            return "Shoe Box:\n" +
                    shoe.toString() + "\n" +
                    "Packed by: " + packedBy + "\n" +
                    "Label: " + label;
        }
    }


