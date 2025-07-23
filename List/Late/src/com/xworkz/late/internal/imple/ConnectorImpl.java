package com.xworkz.late.internal.imple;



public class ConnectorImpl implements Connector {

    public ConnectorImpl(){
        super();
        System.out.println("Running ConnectImpl inside constructor");
    }

    @Override
    public void run() {
        System.out.println("Running run in ConnectorImpl");

    }
}
