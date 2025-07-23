package com.xworkz.internal;

import com.xworkz.external.River;

public class GangaRiver implements River {

    @Override
    public void flow() {
        System.out.println("The Ganga River is flowing.");
    }

    @Override
    public void bend() {
        System.out.println("The Ganga River bends around the mountains.");
    }

    @Override
    public void provideWater() {
        System.out.println("The Ganga River provides water to millions of people.");
    }

    @Override
    public void run() {
        River.super.run();
    }
}

