package com.xworkz.internal;

public class Oil {
    private String type;
    private String source;
    private boolean isEdible;

    public Oil(String type, String source, boolean isEdible) {
        this.type = type;
        this.source = source;
        this.isEdible = isEdible;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Source: " + source + ", Edible: " + (isEdible ? "Yes" : "No");
    }
}
