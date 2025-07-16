package com.xworkz.internal;

import com.xworkz.external.Social;

public class CommunitySocial implements Social {

    @Override
    public void interact() {
        System.out.println("Interacting with people in the community.");
    }

    @Override
    public void organizeEvent() {
        System.out.println("Organizing a social event for the community.");
    }

    @Override
    public void helpOthers() {
        System.out.println("Helping others in need within the community.");
    }

    @Override
    public void subject() {
        Social.super.subject();
    }
}
