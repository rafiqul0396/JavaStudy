package com.company.DesignPattern.Factory.factoryMethod;

public class FactoryFactory {

    public  static  BFacotry createFactory(String type){
        switch (type){
            case "primary":
                return  new PrimaryButtionFactory();
            case "round":
                return  new RoundButtonFactory();
        }
        throw  new RuntimeException("this is invalid input");

    }
}
