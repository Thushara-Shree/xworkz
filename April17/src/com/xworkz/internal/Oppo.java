package com.xworkz.internal;

import com.xworkz.external.Poco;

public class Oppo implements Poco {

    @Override
    public void camera() {
        System.out.println("Running camera in Oppo");
    }

    @Override
    public void features() {
        System.out.println("Running features in Oppo");
    }

    @Override
    public void version() {
        System.out.println("Running version in Oppo");
    }

    @Override
    public void pixel() {
        Poco.super.pixel();
    }
}
