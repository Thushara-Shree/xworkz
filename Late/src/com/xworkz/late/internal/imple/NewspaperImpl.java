package com.xworkz.late.internal.imple;

public class NewspaperImpl implements Newspaper{

    public NewspaperImpl(){
        super();
        System.out.println("Running NewspaperImpl const");
    }

    @Override
    public void headlines() {
        System.out.println("Running headlines");
    }
}
