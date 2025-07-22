package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Office;

public class OfficeUser {
    private Office office;

    public OfficeUser(Office office) {
        this.office = office;
    }

    public void useOffice() {
        if (office != null) {
            office.work();
        } else {
            System.out.println("Office is not initialized.");
        }
    }
}
