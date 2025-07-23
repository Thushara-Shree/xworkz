package com.xworkz.late.internal.imple;

public class SpeakerImpl implements Speaker {

    public SpeakerImpl() {
        System.out.println("SpeakerImpl object created.");
    }

    @Override
    public void playSound() {
        System.out.println("Playing sound through the speaker...");
    }
}
