package com.xworkz.late.internal.imple;

public class RepositoryImpl implements Repository {

    public RepositoryImpl() {
        System.out.println("RepositoryImpl object created.");
    }

    @Override
    public void saveData() {
        System.out.println("Saving data to the repository...");
    }
}
