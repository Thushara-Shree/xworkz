package com.xworkz.internal;


    public class Juice {
        private String flavor;
        private int volume;
        private boolean isCold;

        public Juice(String flavor, int volume, boolean isCold) {
            this.flavor = flavor;
            this.volume = volume;
            this.isCold = isCold;
        }

        @Override
        public String toString() {
            return "Flavor: " + flavor + ", Volume: " + volume + "ml, Cold: " + (isCold ? "Yes" : "No");
        }
    }


