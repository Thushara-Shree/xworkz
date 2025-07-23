package com.xworkz.internal;

public class Dance {
    private String style;
    private String originCountry;
    private boolean isTraditional;

    public Dance(String style, String originCountry, boolean isTraditional) {
        this.style = style;
        this.originCountry = originCountry;
        this.isTraditional = isTraditional;
    }

    @Override
    public String toString() {
        return "Style: " + style + ", Origin Country: " + originCountry + ", Traditional: " + (isTraditional ? "Yes" : "No");
    }
}

