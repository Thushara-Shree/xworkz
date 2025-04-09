package com.xworkz.internal;


    public class Human {
        private String name;
        private int age;
        private String gender;

        public Human(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
        }
    }


