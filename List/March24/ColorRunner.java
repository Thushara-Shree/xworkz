package com.xworkz.March24;

import com.xworkz.March24_1.WaterColor;

public class ColorRunner {
    public static void main(String[] args) {

        Color color=new Color();
        Shade shade=new Shade(color);
        shade.displayColor();
        shade.runColor();

        WaterColor waterColor=new WaterColor(color);
        waterColor.RunWaterColor();
    }

}
