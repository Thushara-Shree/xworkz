package com.xworkz.internal;

public class NailPolish {
    private String color;
    private String finish;
    private boolean isQuickDry;

    public NailPolish(String color, String finish, boolean isQuickDry) {
        this.color = color;
        this.finish = finish;
        this.isQuickDry = isQuickDry;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Finish: " + finish + ", Quick Dry: " + (isQuickDry ? "Yes" : "No");
    }
}

