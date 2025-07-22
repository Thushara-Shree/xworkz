package com.xworkz.internal;

public class Art {
    private String title;
    private String medium;
    private int year;

    public Art(String title, String medium, int year) {
        this.title = title;
        this.medium = medium;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Medium: " + medium + ", Year: " + year;
    }
}

