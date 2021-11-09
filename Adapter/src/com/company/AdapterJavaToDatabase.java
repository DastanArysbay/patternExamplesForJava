package com.company;

public class AdapterJavaToDatabase extends javaApplication implements Database{

    @Override
    public void insert() {
        savingObject();
    }

    @Override
    public void update() {
        updatingObject();
    }

    @Override
    public void select() {
        loadingObject();
    }

    @Override
    public void delete() {
        deletingObject();
    }
}
