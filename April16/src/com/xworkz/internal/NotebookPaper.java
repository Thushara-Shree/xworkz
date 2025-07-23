package com.xworkz.internal;

import com.xworkz.external.Paper;

public class NotebookPaper implements Paper {

    @Override
    public void write() {
        System.out.println("Writing on the notebook paper.");
    }

    @Override
    public void tear() {
        System.out.println("Tearing the notebook paper.");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling the notebook paper.");
    }
}

