package com.company.DesignPattern.Solids.Animal;

public class Dog extends Animal {

    // The constructor initializes all objects
    public Dog() {
        // Executes the parents constructor
        // Every class has a constructor whether you make it or not
        super();
        // Sets bark for all Dog objects by default
        setSound("Bark");
    }

    public void digHole() {


        System.out.println("Dug a hole");


    }

    public int changeVar(int randNum) {
        randNum = 12;
        System.out.println("randNum in method value: " + randNum);

       return randNum;
    }

}
