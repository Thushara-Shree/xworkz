package com.xworkz.internal;

public class EmojiInfo {
    private Emoji emoji;
    private String category;
    private String platform;

    public EmojiInfo(Emoji emoji, String category, String platform) {
        this.emoji = emoji;
        this.category = category;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Emoji Info:\n" +
                emoji.toString() + "\n" +
                "Category: " + category + "\n" +
                "Platform: " + platform;
    }
}
