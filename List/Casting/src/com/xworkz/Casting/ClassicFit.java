package com.xworkz.Casting;

import com.xworkz.external.CultFit;
import com.xworkz.internal.FitnessBrand;

public class ClassicFit {

    public void course(FitnessBrand fitnessBrand){
        fitnessBrand.sell();
        fitnessBrand.set();
        fitnessBrand.gift();
        fitnessBrand.buy();
        fitnessBrand.price();

        if(fitnessBrand instanceof CultFit){
            CultFit cultFit=(CultFit) fitnessBrand;
            cultFit.body();
        }
    }
}
