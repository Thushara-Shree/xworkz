package com.xworkz.internal;


    public class MobileDetails {
        private String mobile;
        private String owner;
        private String purchaseDate;

        public MobileDetails(String mobile, String owner, String purchaseDate) {
            this.mobile = mobile;
            this.owner = owner;
            this.purchaseDate = purchaseDate;
        }

        @Override
        public String toString() {
            return "Mobile Details:\n" +
                    mobile.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Purchase Date: " + purchaseDate;
        }
    }


