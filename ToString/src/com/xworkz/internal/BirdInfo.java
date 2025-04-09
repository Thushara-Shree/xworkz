package com.xworkz.internal;

public class BirdInfo {
    private Bird bird;
    private String location;
    private String sound;

    public BirdInfo(Bird bird, String location, String sound) {
        this.bird = bird;
        this.location = location;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Bird Info:\n" +
                bird.toString() + "\n" +
                "Location: " + location + "\n" +
                "Sound: " + sound;
    }
}

