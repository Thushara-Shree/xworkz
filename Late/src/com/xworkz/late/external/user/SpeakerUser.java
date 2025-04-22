package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Speaker;

public class SpeakerUser {
    private Speaker speaker;

    public SpeakerUser(Speaker speaker) {
        this.speaker = speaker;
    }

    public void useSpeaker() {
        if (speaker != null) {
            speaker.playSound();
        } else {
            System.out.println("Speaker is not initialized.");
        }
    }
}
