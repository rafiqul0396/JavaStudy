package com.company.DesignPattern.Decorator.CoffeeShop;

public class HouseBlend extends Beverage {
    public  HouseBlend(){
        description="House Blend Coffee";
    }


    @Override
    public double getCost() {
        System.out.println("this HouseBlend coffee cost is rs.20");
        return  20.0;

    }


}
