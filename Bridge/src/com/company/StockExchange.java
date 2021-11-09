package com.company;

public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Stock Exchage development in progres...");
        developer.wrideCode();
    }

}
