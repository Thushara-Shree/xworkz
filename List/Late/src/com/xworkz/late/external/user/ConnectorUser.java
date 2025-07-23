package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Connector;

public class ConnectorUser {

    Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Running const Connector user");
    }

    public void execute(){
        if(this.connector!=null){
            this.connector.run();
        }
        else
            System.out.println("The value is null");
    }

}
