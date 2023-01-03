package com.company.DesignPattern.Decorator.CoffeeShop;

public class Decaf extends Beverage {

    public  Decaf(){
        description="Decaf";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
