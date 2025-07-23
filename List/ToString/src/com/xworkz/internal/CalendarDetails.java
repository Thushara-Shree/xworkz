package com.xworkz.internal;

public class CalendarDetails {

        private String calendar;
        private String createdBy;
        private String language;

        public CalendarDetails(String calendar, String createdBy, String language) {
            this.calendar = calendar;
            this.createdBy = createdBy;
            this.language = language;
        }

        @Override
        public String toString() {
            return "Calendar Details:\n" +
                    calendar.toString() + "\n" +
                    "Created By: " + createdBy + "\n" +
                    "Language: " + language;
        }
    }


