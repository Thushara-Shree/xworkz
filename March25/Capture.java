package com.xworkz.intermal;

public class Capture {
    public void localCamera(){
        System.out.println("Running local Camera in Capture");
        Camera camera=new Camera();
        camera.setBrand("Canon");
        camera.setPrice(7836);
        camera.setCameraType(CameraType.DSLR);
        camera.setConnectivity("long range");

        System.out.println("The Camera brand is: "+camera.getBrand());
        System.out.println("The price is: "+camera.getPrice());
        System.out.println("Camera Type is: "+camera.getCameraType());
        System.out.println("The Connectivity is: "+camera.getConnectivity());

    }
    public void cameraArray(){
        System.out.println("Running cameraArray in Capture");
        Camera camera=new Camera();
        camera.setBrand("Nikon");
        camera.setPrice(3693);
        camera.setCameraType(CameraType.ACTION);
        camera.setConnectivity("long range");

        Camera camera1=new Camera();
        camera1.setBrand("Sony");
        camera1.setPrice(16311);
        camera1.setCameraType(CameraType.INSTANT);
        camera1.setConnectivity("long range");

        Camera[] cameras={camera,camera1};
        for(Camera ref:cameras){
            System.out.println("The Camera brand is: "+ref.getBrand());
            System.out.println("The price is: "+ref.getPrice());
            System.out.println("Camera Type is: "+ref.getCameraType());
            System.out.println("The Connectivity is: "+ref.getConnectivity());

        }

    }

    public void parameterCamera(Camera camera){
        System.out.println("Running parameterCamera in Capture");
        if(camera!=null){

            System.out.println("The Camera brand is: "+camera.getBrand());
            System.out.println("The price is: "+camera.getPrice());
            System.out.println("Camera Type is: "+camera.getCameraType());
            System.out.println("The Connectivity is: "+camera.getConnectivity());

        }

    }
    public void arrayParameterCamera(Camera[] camera){
        System.out.println("Running arrayParameterCamera in Capture");
        if(camera!=null){

            for (Camera cameras:camera){
                System.out.println("The Camera brand is: "+cameras.getBrand());
                System.out.println("The price is: "+cameras.getPrice());
                System.out.println("Camera Type is: "+cameras.getCameraType());
                System.out.println("The Connectivity is: "+cameras.getConnectivity());


            }
        }


    }



}
