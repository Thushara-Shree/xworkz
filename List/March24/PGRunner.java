package com.xworkz.March24;

import com.xworkz.March24_1.MenPG;

public class PGRunner {
    public static void main(String[] args) {

        PG pg=new PG();
        LadiesPG ladiesPG=new LadiesPG(pg);
        ladiesPG.displayPG();
        ladiesPG.runPG();

        MenPG menPG=new MenPG(pg);
        menPG.menPGRunner();
    }
}
