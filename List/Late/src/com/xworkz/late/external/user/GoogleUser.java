package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Google;

public class GoogleUser {
    private Google google;

    public GoogleUser(Google google) {
        this.google = google;
    }

    public void useGoogle() {
        if (google != null) {
            google.search();
        } else {
            System.out.println("Google is not initialized.");
        }
    }
}
