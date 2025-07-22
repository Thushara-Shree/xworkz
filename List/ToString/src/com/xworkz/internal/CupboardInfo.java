package com.xworkz.internal;



    public class CupboardInfo {
        private Cupboard cupboard;
        private String owner;
        private String location;

        public CupboardInfo(Cupboard cupboard, String owner, String location) {
            this.cupboard = cupboard;
            this.owner = owner;
            this.location = location;
        }

        @Override
        public String toString() {
            return "Cupboard Info:\n" +
                    cupboard.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Location: " + location;
        }
    }


