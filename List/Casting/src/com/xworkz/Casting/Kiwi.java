package com.xworkz.Casting;

import com.xworkz.external.Apple;
import com.xworkz.internal.Fruit;

public class Kiwi {

    public void sour(Fruit fruit){
        fruit.salad();
        fruit.icecream();
        fruit.eat();
        fruit.juice();
        fruit.jam();

        if(fruit instanceof Apple){
            Apple apple=(Apple) fruit;
            apple.eat();
        }
    }
}
