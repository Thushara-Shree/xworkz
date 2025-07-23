package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Paper;

public class PaperUser {
    private Paper paper;

    public PaperUser(Paper paper) {
        this.paper = paper;
    }

    public void usePaper() {
        if (paper != null) {
            paper.write();
        } else {
            System.out.println("Paper is not initialized.");
        }
    }
}
