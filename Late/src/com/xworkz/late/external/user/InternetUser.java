package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Internet;

public class InternetUser {
    private Internet internet;

    public InternetUser(Internet internet) {
        this.internet = internet;
    }

    public void useInternet() {
        if (internet != null) {
            internet.browse();
        } else {
            System.out.println("Internet is not initialized.");
        }
    }
}
