package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Set;

public class SetUser {
    private Set set;

    public SetUser(Set set) {
        this.set = set;
    }

    public void useSet() {
        if (set != null) {
            set.addItem();
        } else {
            System.out.println("Set is not initialized.");
        }
    }
}
