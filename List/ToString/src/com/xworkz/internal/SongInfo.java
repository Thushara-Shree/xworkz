package com.xworkz.internal;

public class SongInfo {
    private String song;
    private String album;
    private String genre;

    public SongInfo(String song, String album, String genre) {
        this.song = song;
        this.album = album;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song Info:\n" +
                song.toString() + "\n" +
                "Album: " + album + "\n" +
                "Genre: " + genre;
    }
}

