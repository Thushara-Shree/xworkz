package com.xworkz.internal;

public class Cash {
    private String currency;
    private int amount;
    private boolean isPhysical;

    public Cash(String currency, int amount, boolean isPhysical) {
        this.currency = currency;
        this.amount = amount;
        this.isPhysical = isPhysical;
    }

    @Override
    public String toString() {
        return "Currency: " + currency + ", Amount: " + amount + ", Physical: " + (isPhysical ? "Yes" : "No");
    }
}

