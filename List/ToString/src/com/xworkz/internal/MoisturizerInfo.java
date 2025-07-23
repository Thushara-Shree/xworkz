package com.xworkz.internal;


    public class MoisturizerInfo {
        private String moisturizer;
        private String owner;
        private String expiryDate;

        public MoisturizerInfo(String moisturizer, String owner, String expiryDate) {
            this.moisturizer = moisturizer;
            this.owner = owner;
            this.expiryDate = expiryDate;
        }

        @Override
        public String toString() {
            return "Moisturizer Info:\n" +
                    moisturizer.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Expiry Date: " + expiryDate;
        }
    }


