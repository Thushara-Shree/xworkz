package com.xworkz.Casting;

import com.xworkz.external.Chess;
import com.xworkz.internal.Charger;
import com.xworkz.internal.Game;

public class Ludo {

    public void dice(Game game){
        game.practice();
        game.timing();
        game.organise();
        game.play();
        game.compitation();

        if(game instanceof Chess){
            Chess chess=(Chess) game;
            chess.coins();
        }
    }
}
