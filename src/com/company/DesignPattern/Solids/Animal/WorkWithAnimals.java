package com.company.DesignPattern.Solids.Animal;

public class WorkWithAnimals {
    int justANum = 10;


    static  void callAnmila(Animal ani){
        System.out.println(ani.getSound());
    }
    public static void main(String[] args) {

        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);


        // Everything is pass by value
        // The original is not effected by changes in methods

        int randNum = 10;
        fido.changeVar(randNum);
        System.out.println("randNum after method call: " + randNum);


        Animal doggy= new Dog();
        Animal cat= new Cat();
        System.out.println(cat.getSound());
        System.out.println(doggy.getSound());
        // we can store in different objects in animals
        // we have
        Animal[] animal= new Animal[3];
        animal[0]=doggy;
        animal[1]=cat;
        System.out.println(animal[0].getSound());

        // we can call a method that define different types of objects

        callAnmila(doggy);


        // You can't reference methods, or fields that aren't in Animal
        // if you do, you'll have to cast to the required object
        ((Dog) doggy).digHole();

    }
}
