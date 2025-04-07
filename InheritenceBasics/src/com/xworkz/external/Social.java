package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Social extends Subject {

    public Social(){
        super();
        System.out.println("Running const Social");
    }

    public void history(){
        System.out.println("Running history in subject");
    }

}
