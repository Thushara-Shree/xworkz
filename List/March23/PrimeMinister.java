package com.xworkz.refandvariable;

public class PrimeMinister {

    String name;
    String country;
    int age;
    char gender;
    Minister[] minister = new Minister[]{new Minister("Siddaramaiah", "chief minister", 76, "Karnataka"),
            new Minister("Devandra Fadnavis", "chief minister", 54, "Maharastra"),
            new Minister("Nirmala Sitaraman", "finance minister", 65, "India")};

    PrimeMinister(String name, String country, int age, char gender ) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.gender = gender;


    }

    void display() {
        System.out.println("Running display method in Prime Minister class");
        System.out.println("name of Prime Minister is " + this.name + " belonging to " + this.country + " his age is " + this.age +
                "the gender is " + this.gender);

        if (minister != null) {
            for (Minister ref : minister) {
                ref.display();
            }
        }
    }
}
