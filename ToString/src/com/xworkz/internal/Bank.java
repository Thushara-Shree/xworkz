package com.xworkz.internal;

public class Bank {
    private String name;
    private String branch;
    private boolean isNationalized;

    public Bank(String name, String branch, boolean isNationalized) {
        this.name = name;
        this.branch = branch;
        this.isNationalized = isNationalized;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Branch: " + branch + ", Nationalized: " + (isNationalized ? "Yes" : "No");
    }
}

