package com.xworkz.late.internal.imple;

public class CouncilImpl implements Council {

    public CouncilImpl() {
        System.out.println("CouncilImpl object created.");
    }

    @Override
    public void holdMeeting() {
        System.out.println("Holding a council meeting...");
    }
}
