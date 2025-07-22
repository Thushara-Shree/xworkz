package com.xworkz.internal;

public class GameInfo {
    private Game game;
    private String platform;
    private int rating;

    public GameInfo(Game game, String platform, int rating) {
        this.game = game;
        this.platform = platform;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Game Info:\n" +
                game.toString() + "\n" +
                "Platform: " + platform + "\n" +
                "Rating: " + rating + "/10";
    }
}

