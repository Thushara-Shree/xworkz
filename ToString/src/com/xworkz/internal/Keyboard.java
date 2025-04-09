package com.xworkz.internal;

public class Keyboard {
    private String type;
    private String layout;
    private boolean isWireless;

    public Keyboard(String type, String layout, boolean isWireless) {
        this.type = type;
        this.layout = layout;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Layout: " + layout + ", Wireless: " + (isWireless ? "Yes" : "No");
    }
}
