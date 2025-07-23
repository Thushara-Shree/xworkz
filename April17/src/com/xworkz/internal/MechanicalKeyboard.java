package com.xworkz.internal;

import com.xworkz.external.Keyboard;

public class MechanicalKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Typing on the mechanical keyboard.");
    }

    @Override
    public void pressKey() {
        System.out.println("Pressing a key on the mechanical keyboard.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mechanical keyboard.");
    }

    @Override
    public void keys() {
        Keyboard.super.keys();
    }
}

