package com.xworkz.internal;

public class ChocolateBox {

        private Chocolate chocolate;
        private int quantity;
        private String packedBy;

        public ChocolateBox(Chocolate chocolate, int quantity, String packedBy) {
            this.chocolate = chocolate;
            this.quantity = quantity;
            this.packedBy = packedBy;
        }

        @Override
        public String toString() {
            return "Chocolate Box Details:\n" +
                    chocolate.toString() + "\n" +
                    "Quantity: " + quantity + "\n" +
                    "Packed by: " + packedBy;
        }
    }

