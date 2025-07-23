package com.xworkz.internal;



    public class BoxInfo {
        private String box;
        private String owner;
        private String purpose;

        public BoxInfo(String box, String owner, String purpose) {
            this.box = box;
            this.owner = owner;
            this.purpose = purpose;
        }

        @Override
        public String toString() {
            return "Box Info:\n" +
                    box.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Purpose: " + purpose;
        }
    }


