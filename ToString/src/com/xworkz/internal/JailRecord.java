package com.xworkz.internal;


    public class JailRecord {
        private String jail;
        private String inCharge;
        private String recordDate;

        public JailRecord(String jail, String inCharge, String recordDate) {
            this.jail = jail;
            this.inCharge = inCharge;
            this.recordDate = recordDate;
        }

        @Override
        public String toString() {
            return "Jail Record:\n" +
                    jail.toString() + "\n" +
                    "In-Charge: " + inCharge + "\n" +
                    "Record Date: " + recordDate;
        }
    }


