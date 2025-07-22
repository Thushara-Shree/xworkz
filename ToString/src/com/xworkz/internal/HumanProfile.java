package com.xworkz.internal;

public class HumanProfile {

        private  String human;
        private String occupation;
        private String nationality;

        public HumanProfile(String human, String occupation, String nationality) {
            this.human = human;
            this.occupation = occupation;
            this.nationality = nationality;
        }

        @Override
        public String toString() {
            return "Human Profile:\n" +
                    human.toString() + "\n" +
                    "Occupation: " + occupation + "\n" +
                    "Nationality: " + nationality;
        }
    }

