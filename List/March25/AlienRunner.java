package com.xworkz.intermal;

public class AlienRunner {
    public static void main(String[] args) {


        Alien alien = new Alien("Draco", "1 / 4 / 2001", "Tiny dwarf creature");
        UFO ufo = new UFO();
        ufo.spherical();
        ufo.parameterAlien(alien);
        ufo.arraySpherical();

        Alien[] aliens=new Alien[2];

        aliens[0]=new Alien("Luna","9/9/2009","mystical creature");
        aliens[1]=new Alien("Hagrid","8/2/2004","looks like a wild animal");
        ufo.alienArrayParameter(aliens);




    }
}