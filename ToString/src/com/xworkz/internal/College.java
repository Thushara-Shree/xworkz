package com.xworkz.internal;



    public class College {
        private int students;
        private String departments;
        private int hostels;

        public College(int students, String departments, int hostels) {
            this.students = students;
            this.departments = departments;
            this.hostels = hostels;
        }

        @Override
        public String toString() {
            return "Students: " + this.students + ", Departments: " + this.departments + ", Hostels: " + this.hostels;
        }
    }


