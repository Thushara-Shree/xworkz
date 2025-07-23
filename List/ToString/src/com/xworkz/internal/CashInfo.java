package com.xworkz.internal;

public class CashInfo {
    private Cash cash;
    private String source;
    private String usage;

    public CashInfo(Cash cash, String source, String usage) {
        this.cash = cash;
        this.source = source;
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Cash Info:\n" +
                cash.toString() + "\n" +
                "Source: " + source + "\n" +
                "Usage: " + usage;
    }
}

