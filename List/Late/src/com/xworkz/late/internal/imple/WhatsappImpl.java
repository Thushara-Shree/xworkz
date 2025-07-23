package com.xworkz.late.internal.imple;

public class WhatsappImpl implements Whatsapp {

    public WhatsappImpl(){
        super();
        System.out.println("Running WhatsappImpl const");
    }

    @Override
    public void chat() {
        System.out.println("Running chat in WhatsappImpl");
    }
}
