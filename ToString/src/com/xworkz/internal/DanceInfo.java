package com.xworkz.internal;

public class DanceInfo {
    private Dance dance;
    private String performer;
    private String occasion;

    public DanceInfo(Dance dance, String performer, String occasion) {
        this.dance = dance;
        this.performer = performer;
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        return "Dance Info:\n" +
                dance.toString() + "\n" +
                "Performer: " + performer + "\n" +
                "Occasion: " + occasion;
    }
}

