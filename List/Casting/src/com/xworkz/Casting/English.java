package com.xworkz.Casting;

import com.xworkz.external.Hindi;
import com.xworkz.internal.Language;

public class English {

    public void use(Language language){
        language.state();
        language.talk();
        language.speak();
        language.region();
        language.area();

        if(language instanceof Hindi){
            Hindi hindi=new Hindi();
            hindi.bilingual();
        }
    }
}
