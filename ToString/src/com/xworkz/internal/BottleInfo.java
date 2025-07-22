package com.xworkz.internal;



    public class BottleInfo {
        private String bottle;
        private String owner;
        private String color;

        public BottleInfo(String bottle, String owner, String color) {
            this.bottle = bottle;
            this.owner = owner;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Bottle Info:\n" +
                    bottle.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Color: " + color;
        }
    }


