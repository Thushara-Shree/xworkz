package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Cable;

public class CableUser {
    private Cable cable;

    public CableUser(Cable cable) {
        this.cable = cable;
    }

    public void useCable() {
        if (cable != null) {
            cable.transmitSignal();
        } else {
            System.out.println("Cable is not initialized.");
        }
    }
}
