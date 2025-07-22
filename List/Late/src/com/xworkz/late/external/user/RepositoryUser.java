package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Repository;

public class RepositoryUser {
    private Repository repository;

    public RepositoryUser(Repository repository) {
        this.repository = repository;
    }

    public void useRepository() {
        if (repository != null) {
            repository.saveData();
        } else {
            System.out.println("Repository is not initialized.");
        }
    }
}
