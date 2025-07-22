package com.xworkz.late.external.user;


import com.xworkz.late.internal.imple.Council;

public class CouncilUser {
    private Council council;

    public CouncilUser(Council council) {
        this.council = council;
    }

    public void useCouncil() {
        if (council != null) {
            council.holdMeeting();
        } else {
            System.out.println("Council is not initialized.");
        }
    }
}