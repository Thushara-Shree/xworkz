package com.xworkz.Casting;

import com.xworkz.external.WhiteBoard;
import com.xworkz.internal.Board;

public class Blackboard {

    public void chalk(Board board){
        board.write();
        board.teach();
        board.marker();
        board.erase();
        board.duster();

        if(board instanceof WhiteBoard){
            WhiteBoard whiteBoard=(WhiteBoard)board;
            whiteBoard.clean();
        }
    }
}
