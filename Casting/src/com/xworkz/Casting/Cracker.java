package com.xworkz.Casting;

import com.xworkz.external.WeTwo;
import com.xworkz.internal.MatchBox;

public class Cracker {

    public void burn(MatchBox matchBox){
        matchBox.price();
        matchBox.sell();
        matchBox.color();
        matchBox.manufacture();
        matchBox.buy();

        if(matchBox instanceof WeTwo){
            WeTwo weTwo=(WeTwo)matchBox;
            weTwo.company();
        }
    }
}
