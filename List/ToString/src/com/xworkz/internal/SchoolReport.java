package com.xworkz.internal;


    public class SchoolReport {
        private String school;
        private String reportDate;
        private String preparedBy;

        public SchoolReport(String school, String reportDate, String preparedBy) {
            this.school = school;
            this.reportDate = reportDate;
            this.preparedBy = preparedBy;
        }

        @Override
        public String toString() {
            return "School Report\n" +
                    "Date: " + reportDate + "\n" +
                    "Prepared by: " + preparedBy + "\n" +
                    school.toString();
        }
    }


