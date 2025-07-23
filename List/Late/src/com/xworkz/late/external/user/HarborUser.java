package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Harbor;

public class HarborUser {
    private Harbor harbor;

    public HarborUser(Harbor harbor) {
        this.harbor = harbor;
    }

    public void useHarbor() {
        if (harbor != null) {
            harbor.dock();
        } else {
            System.out.println("Harbor is not initialized.");
        }
    }
}

