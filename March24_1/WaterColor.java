package com.xworkz.March24_1;

import com.xworkz.March24.Color;

public class WaterColor {

    Color color;

    public WaterColor(Color color)
    {
        this.color=color;
    }

    public void RunWaterColor(){
        System.out.println("Running RunwaterColor in WaterColor");
        if(color!=null){
            this.color.red();
            System.out.println("The color belonging to light shade is: "+this.color.lightcolor);

        }
    }
}
