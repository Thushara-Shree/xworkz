package com.xworkz.internal;

public class BedInfo {

        private Bed bed;
        private String owner;
        private String room;

        public BedInfo(Bed bed, String owner, String room) {
            this.bed = bed;
            this.owner = owner;
            this.room = room;
        }

        @Override
        public String toString() {
            return "Bed Info:\n" +
                    bed.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Room: " + room;
        }
    }


