package com.company.DesignPattern.Decorator.CoffeeShop;

import lombok.Getter;
import lombok.Setter;


//Beverage is an abstract class,
//subclassed by all beverages
//offered in the coffee shop
@Getter
@Setter
public  abstract class Beverage {

    String description = "Unknown Beverage";
    public abstract double getCost();

}
