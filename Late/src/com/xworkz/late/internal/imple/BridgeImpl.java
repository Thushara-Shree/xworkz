package com.xworkz.late.internal.imple;

public class BridgeImpl implements Bridge{

    public BridgeImpl(){
        super();
        System.out.println("Running BridgeImpl const");
    }

    @Override
    public void road() {
        System.out.println("Running road in BridgeImpl");
    }
}
