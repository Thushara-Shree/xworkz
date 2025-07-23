package com.xworkz.internal;



    public class ChipsPacket {
        private String chips;
        private String brand;
        private String packedDate;

        public ChipsPacket(String chips, String brand, String packedDate) {
            this.chips = chips;
            this.brand = brand;
            this.packedDate = packedDate;
        }

        @Override
        public String toString() {
            return "Chips Packet:\n" +
                    chips.toString() + "\n" +
                    "Brand: " + brand + "\n" +
                    "Packed Date: " + packedDate;
        }
    }


