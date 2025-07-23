package com.xworkz.internal;

import com.xworkz.external.HeadPhone;

public class WirelessHeadphone implements HeadPhone {

    @Override
    public void playMusic() {
        System.out.println("Playing music through the wireless headphone.");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting the volume of the wireless headphone.");
    }

    @Override
    public void connect() {
        System.out.println("Connecting the wireless headphone via Bluetooth.");
    }

    @Override
    public void ear() {
        HeadPhone.super.ear();
    }
}
