package com.xworkz.intermal;

public class Space {

    public void localSatellite() {
        System.out.println("Running local Satellite in Space");

        Satellite satellite = new Satellite();
        satellite.setType(Type.COMMUNICATION);
        satellite.setCost(10);
        satellite.setWeight(5679);
        satellite.setLoadCapacity(675);

        System.out.println(satellite.getType());
        System.out.println(satellite.getCost());
        System.out.println(satellite.getType());
        System.out.println(satellite.getLoadCapacity());

    }

    public void satelliteArray() {
        System.out.println("Running satelliteArrray in Space ");
        Satellite satellite = new Satellite();
        satellite.setType(Type.METEOROLOGICAL);
        satellite.setCost(6358);
        satellite.setWeight(6438);
        satellite.setLoadCapacity(5482);

        Satellite satellite1 = new Satellite();
        satellite.setType(Type.NAVIGATION);
        satellite.setCost(6355);
        satellite.setWeight(8738);
        satellite.setLoadCapacity(3682);

        Satellite[] satellites = {satellite, satellite1};

        for (Satellite ref : satellites) {
            System.out.println(satellite.getType());
            System.out.println(satellite.getCost());
            System.out.println(satellite.getType());
            System.out.println(satellite.getLoadCapacity());

        }
    }

    public void satelliteParameter(Satellite satellite) {
        System.out.println("Running satelliteParameter in Space ");
        if (satellite != null) {
            System.out.println(satellite.getType());
            System.out.println(satellite.getCost());
            System.out.println(satellite.getType());
            System.out.println(satellite.getLoadCapacity());

        }
    }

    public void satelliteArrayParameter(Satellite[] satellites) {
        System.out.println("Running satelliteArrrayParameter in Space ");
        if (satellites != null) {
            for (Satellite ref : satellites) {
                System.out.println(ref.getType());
                System.out.println(ref.getCost());
                System.out.println(ref.getType());
                System.out.println(ref.getLoadCapacity());

            }


        }
    }
}