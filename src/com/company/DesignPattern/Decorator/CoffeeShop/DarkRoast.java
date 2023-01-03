package com.company.DesignPattern.Decorator.CoffeeShop;

public class DarkRoast extends Beverage {


    public  DarkRoast(){
        description="Dark Roast Coffee";
    }
    @Override
    public double getCost() {
        return 30.0;
    }
}
