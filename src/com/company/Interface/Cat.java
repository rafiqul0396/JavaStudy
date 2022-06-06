package com.company.Interface;

public class Cat implements NoiseMaker, FoodEater{
    @Override
    public void eat() {
        System.out.println("meows appreciatively");
    }

    @Override
    public String makeNoise() {
        return "meow";
    }

    public static void main(String[] args) {
        NoiseMaker noiseMaker = new Cat(); // Valid
        FoodEater foodEater = new Cat(); // Valid
        Cat cat = new Cat(); // valid
        foodEater.eat();
        System.out.println(noiseMaker.makeNoise());

        //Cat invalid1 = new NoiseMaker(); // Invalid
       // Cat invalid2 = new FoodEater(); // Invalid
    }
}
