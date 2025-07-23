package com.xworkz.internal;



    public class Calender {
        private String year;
        private String type;
        private boolean isLeapYear;

        public Calender(String year, String type, boolean isLeapYear) {
            this.year = year;
            this.type = type;
            this.isLeapYear = isLeapYear;
        }

        @Override
        public String toString() {
            return "Year: " + year + ", Type: " + type + ", Leap Year: " + (isLeapYear ? "Yes" : "No");
        }
    }


