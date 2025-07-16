package com.xworkz.Casting;


import com.xworkz.external.Studio;
import com.xworkz.internal.Music;

public class Song {

    public void tune(Music music){
        music.metal();
        music.band();
        music.rockMusic();
        music.musicType();
        music.classical();

        if(music instanceof Studio){
            Studio studio=(Studio)music;
            studio.band();

        }

    }
}
