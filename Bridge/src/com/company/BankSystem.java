package com.company;

public class BankSystem extends Program{
    protected BankSystem(Developer developer){
        super(developer);
    }
    @Override
    public void developerProgram() {
        System.out.println("Bank system development in process...");
        developer.wrideCode();;
    }
}
