package com.company.DesignPattern.Decorator.CoffeeShop;

public class Espresso extends Beverage {
    public  Espresso(){
        description="Expresso is good for health";
    }


    @Override
    public double getCost() {
        return 10.0;
    }
}
