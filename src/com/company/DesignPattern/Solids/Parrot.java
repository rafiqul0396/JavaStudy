package com.company.DesignPattern.Solids;

public class Parrot extends Bird {

    public Parrot(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nParrot is flying");
    }

    public static class hello {
    }
}