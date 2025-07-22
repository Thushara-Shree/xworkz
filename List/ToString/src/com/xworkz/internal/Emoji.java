package com.xworkz.internal;

public class Emoji {
    private String symbol;
    private String meaning;
    private boolean isAnimated;

    public Emoji(String symbol, String meaning, boolean isAnimated) {
        this.symbol = symbol;
        this.meaning = meaning;
        this.isAnimated = isAnimated;
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol + ", Meaning: " + meaning + ", Animated: " + (isAnimated ? "Yes" : "No");
    }
}
