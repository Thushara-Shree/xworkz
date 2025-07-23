package com.xworkz.March24;

public class FastFood {

    Food food;

    public  FastFood(Food food){
        this.food=food;
    }
    public void DisplayFastFood(){
        if(food!=null)
            this.food.Indian();

        System.out.println(this.food.sweet);
    }
    public void RunyFastFood(){
        if(food!=null)
            this.food.Chinese();

        System.out.println(this.food.salty);
    }


}
