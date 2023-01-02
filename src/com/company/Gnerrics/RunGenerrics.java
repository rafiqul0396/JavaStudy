package com.company.Gnerrics;

public class RunGenerrics {
    public static void main(String[] args) {
        Pairs<Float> p=new Pairs<>();
        p.setA(10.0f);
        p.setB(20.0f);
        System.out.println(p.getA());
        System.out.println(p.getB());


        Pairs<String> p1=new Pairs<>();
        p1.setA("hello");
        p1.setB("World");
        System.out.println(p1.getA());
        System.out.println(p1.getB());


        //objects
        Pairs p3= new Pairs();
        p3.setB("hello");
        p3.setA(12);
        System.out.println(p3.getA());
        System.out.println(p3.getB());


    }
}
