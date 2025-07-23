package com.xworkz.intermal;

public class CammeraRunner {
    public static void main(String[] args) {
        Camera camera=new Camera();
        Capture capture=new Capture();
        capture.localCamera();
        capture.cameraArray();
        capture.parameterCamera(camera);

        Camera camera1=new Camera();
        camera1.setBrand("Panasonic");
        camera1.setPrice(36721);
        camera1.setCameraType(CameraType.INSTANT);
        camera1.setConnectivity("long range");

        Camera camera2=new Camera();
        camera2.setBrand("Leica");
        camera2.setPrice(73617);
        camera2.setCameraType(CameraType.RETRO);
        camera2.setConnectivity("long range");

        Camera[] cameras={camera,camera1};
        capture.arrayParameterCamera(cameras);
    }
}
