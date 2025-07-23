package com.xworkz.internal;

public class AlcoholInfo {
    private Alcohol alcohol;
    private String originCountry;
    private int volume;

    public AlcoholInfo(Alcohol alcohol, String originCountry, int volume) {
        this.alcohol = alcohol;
        this.originCountry = originCountry;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Alcohol Info:\n" +
                alcohol.toString() + "\n" +
                "Origin: " + originCountry + "\n" +
                "Volume: " + volume + "ml";
    }
}

