package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Whatsapp;

public class Text {

    Whatsapp whatsapp;

    public Text(Whatsapp whatsapp){
        this.whatsapp=whatsapp;
        System.out.println("Running Text Const");
    }

    public void messages(){
        if(this.whatsapp!=null){
            this.whatsapp.chat();
        }
        else{
            System.out.println("null");
        }

    }
}
