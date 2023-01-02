package com.company.DesignPattern.Solids.Animal;

public class Cat extends Animal {
    // The constructor initializes all objects
    public Cat() {
        // Executes the parents constructor
        // Every class has a constructor whether you make it or not
        super();
        // Sets bark for all Dog objects by default
        setSound("Meow");


    }
}
