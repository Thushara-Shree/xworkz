package com.xworkz.intermal;

public class SatelliteRunner {
    public static void main(String[] args) {

        Satellite satellite=new Satellite();
        Space space=new Space();
        space.localSatellite();
        space.satelliteArray();
        space.satelliteParameter(satellite);

        Satellite satellite1 = new Satellite();
        satellite.setType(Type.OBSERVATION);
        satellite.setCost(562);
        satellite.setWeight(6362);
        satellite.setLoadCapacity(1967);

        Satellite satellite2 = new Satellite();
        satellite.setType(Type.METEOROLOGICAL);
        satellite.setCost(8474);
        satellite.setWeight(8265);
        satellite.setLoadCapacity(8264);

        Satellite[] satellites={satellite1,satellite2};
        space.satelliteArrayParameter(satellites);
    }
}
