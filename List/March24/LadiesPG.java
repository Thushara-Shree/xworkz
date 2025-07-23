package com.xworkz.March24;

public class LadiesPG {

    PG pg;

    public LadiesPG(PG pg) {
        this.pg = pg;
    }

    public void runPG() {
        if (this.pg != null) {
            this.pg.floor();
            System.out.println("The location of PG is:"+this.pg.location);
        }
    }

        public void displayPG()
    {
        if (this.pg != null) {
            this.pg.meal();
            System.out.println("The PG fees is: "+this.pg.fees);
        }
    }

}
