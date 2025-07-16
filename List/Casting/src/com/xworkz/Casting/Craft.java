package com.xworkz.Casting;

import com.xworkz.external.Tissue;
import com.xworkz.internal.Paper;

public class Craft {

    public void fold(Paper paper){
        paper.thickness();
        paper.color();
        paper.smoothness();
        paper.origin();
        paper.quality();

        if(paper instanceof Tissue){
            Tissue tissue=(Tissue) paper;
            tissue.color();
        }


    }
}
