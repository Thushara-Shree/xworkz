package com.xworkz;

public class Medical {

    public void cold(Dolo650 dolo650){
        System.out.println("Running Medical  class");
        if(dolo650!=null){
            dolo650.fever();
        }
        else{
            System.out.println("Reference is pointing to null");
        }

    }
}
