package com.xworkz.internal;

public class Game {
    private String title;
    private String genre;
    private boolean isMultiplayer;

    public Game(String title, String genre, boolean isMultiplayer) {
        this.title = title;
        this.genre = genre;
        this.isMultiplayer = isMultiplayer;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Multiplayer: " + (isMultiplayer ? "Yes" : "No");
    }
}

