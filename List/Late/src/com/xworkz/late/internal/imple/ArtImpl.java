package com.xworkz.late.internal.imple;

public class ArtImpl implements Art {

    public ArtImpl() {
        System.out.println("ArtImpl object created.");
    }

    @Override
    public void createArtwork() {
        System.out.println("Creating a beautiful piece of artwork...");
    }
}
