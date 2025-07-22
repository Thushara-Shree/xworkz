package com.xworkz.internal;

import com.xworkz.external.Canteen;

public class CollegeCanteen implements Canteen {

    @Override
    public void serveFood() {
        System.out.println("Serving food to the students in the canteen.");
    }

    @Override
    public void cleanTables() {
        System.out.println("Cleaning the tables in the canteen.");
    }

    @Override
    public void closeCanteen() {
        System.out.println("Closing the canteen for the day.");
    }

    @Override
    public void food() {
        Canteen.super.food();
    }
}

