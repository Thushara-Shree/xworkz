package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Studio;

public class StudioUser {
    private Studio studio;

    public StudioUser(Studio studio) {
        this.studio = studio;
    }

    public void useStudio() {
        if (studio != null) {
            studio.record();
        } else {
            System.out.println("Studio is not initialized.");
        }
    }
}
