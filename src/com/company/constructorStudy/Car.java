package com.company.constructorStudy;

public class Car extends  Vichale{


    public void print(){
        System.out.println("this is car class print");
    }

    public static void main(String[] args) {
        Car v= (Car) new Vichale();
        v.print();
    }
}
