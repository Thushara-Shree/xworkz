package com.xworkz.intermal;

public class UFO {

    public void spherical(){
        System.out.println("Running spherical in UFO");
        Alien alien=new Alien("Harry","16/4/2005","Green color creature");
        System.out.println("The alien was seen by: "+alien.getSeenby());
        System.out.println("The alien was seen on: "+alien.getSeenDate());
        System.out.println("The description of alien is: "+alien.getDescribe());

    }

    public  void arraySpherical() {
        System.out.println("Running array spherical in UFO");
        Alien[] aliens = new Alien[2];

        aliens[0] = new Alien("Ron", "7 / 01 / 2004", "shape shifting creature");
        aliens[1] = new Alien("Hermione", "9 / 06 / 2011", "looks similar to human figure");

        if (aliens != null) {
            for (Alien alien : aliens) {
                System.out.println("The alien was seen by: " + alien.getSeenby());
                System.out.println("The alien was seen on: " + alien.getSeenDate());
                System.out.println("The description of alien is: " + alien.getDescribe());

            }


        }
    }

        public void parameterAlien(Alien alien)
        {
            System.out.println("Running parameter Alien in UFO");
            System.out.println("The alien was seen by: "+alien.getSeenby());
            System.out.println("The alien was seen on: "+alien.getSeenDate());
            System.out.println("The description of alien is: "+alien.getDescribe());


        }
        public void alienArrayParameter(Alien[] aliens){
            System.out.println("Running alienArrayParameter in UFO");
            if(aliens!=null){
                for(Alien alien:aliens){
                    System.out.println("The alien was seen by: "+alien.getSeenby());
                    System.out.println("The alien was seen on: "+alien.getSeenDate());
                    System.out.println("The description of alien is: "+alien.getDescribe());
                }

            }

        }


    }



