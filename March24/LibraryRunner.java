package com.xworkz.March24;

import com.xworkz.March24_1.Study;

public class LibraryRunner {
    public static void main(String[] args) {

        Library library=new Library();
        Maintenance maintenance=new Maintenance(library);
        maintenance.cleanliness();
        maintenance.silence();

        Study study=new Study(library);
        study.Seat();

    }
}
