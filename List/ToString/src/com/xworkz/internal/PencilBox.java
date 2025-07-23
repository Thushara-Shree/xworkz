package com.xworkz.internal;

public class PencilBox {

        private  String pencil;
        private int quantity;
        private String owner;

        public PencilBox( String pencil, int quantity, String owner) {
            this.pencil = pencil;
            this.quantity = quantity;
            this.owner = owner;
        }

        @Override
        public String toString() {
            return "Pencil Box Details:\n" +
                    pencil.toString() + "\n" +
                    "Quantity: " + quantity + "\n" +
                    "Owner: " + owner;
        }
    }


