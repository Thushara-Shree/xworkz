package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Agency;

public class StudyAbroad {

    Agency agency;

    public StudyAbroad(Agency agency){
        this.agency=agency;
        System.out.println("Running StudyAbroad const");
    }

    public void travel(){
        if (this.agency!=null){
            this.agency.fly();
        }
        else {
            System.out.println("Null");
        }
    }
}
