package com.xworkz.internal;

public class Jail {

        private String location;
        private int capacity;
        private boolean isHighSecurity;

        public Jail(String location, int capacity, boolean isHighSecurity) {
            this.location = location;
            this.capacity = capacity;
            this.isHighSecurity = isHighSecurity;
        }

        @Override
        public String toString() {
            return "Location: " + location + ", Capacity: " + capacity + ", High Security: " + (isHighSecurity ? "Yes" : "No");
        }
    }


