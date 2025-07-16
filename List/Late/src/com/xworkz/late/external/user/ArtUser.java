package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Art;

public class ArtUser {
    private Art art;

    public ArtUser(Art art) {
        this.art = art;
    }

    public void useArt() {
        if (art != null) {
            art.createArtwork();
        } else {
            System.out.println("Art is not initialized.");
        }
    }
}
