package com.xworkz.internal;

public class ArtInfo {
    private String art;
    private String artist;
    private String location;

    public ArtInfo(String art, String artist, String location) {
        this.art = art;
        this.artist = artist;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Art Info:\n" +
                art.toString() + "\n" +
                "Artist: " + artist + "\n" +
                "Location: " + location;
    }
}

