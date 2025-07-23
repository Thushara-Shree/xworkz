package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Charger;

public class ChargerUser {
    private Charger charger;

    public ChargerUser(Charger charger) {
        this.charger = charger;
    }

    public void useCharger() {
        if (charger != null) {
            charger.charge();
        } else {
            System.out.println("Charger is not initialized.");
        }
    }
}
