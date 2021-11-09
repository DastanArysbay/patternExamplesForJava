package com.company;

public class Main {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.select();
        database.update();
        database.delete();
    }
}
