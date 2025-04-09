package com.xworkz.internal;


    public class FlowerInfo {
        private String flower;
        private String gardenName;
        private String season;

        public FlowerInfo(String flower, String gardenName, String season) {
            this.flower = flower;
            this.gardenName = gardenName;
            this.season = season;
        }

        @Override
        public String toString() {
            return "Flower Info:\n" +
                    flower.toString() + "\n" +
                    "Garden: " + gardenName + "\n" +
                    "Season: " + season;
        }
    }

