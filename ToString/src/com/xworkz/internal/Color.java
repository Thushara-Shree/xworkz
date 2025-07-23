package com.xworkz.internal;


    public class Color {
        private String name;
        private String hexCode;
        private String type; // e.g., Primary, Secondary, Neutral

        public Color(String name, String hexCode, String type) {
            this.name = name;
            this.hexCode = hexCode;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Color Name: " + name + ", Hex Code: " + hexCode + ", Type: " + type;
        }
    }


