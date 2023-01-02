package com.company.DesignPattern.Singleton;

// questions is : Can you help Choc-O-Holic improve their ChocolateBoiler class
//by turning it into a singleton?

public class ChocolateBoiler {
    // step2: make satic refrance in the
    private  static  ChocolateBoiler instance ;
    private boolean empty;
    private boolean boiled;
    // step-1:construcotor hiding
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
// step3 : create a method which return instance and check also
    public static ChocolateBoiler getInstance() {
        if(instance==null){
            instance=new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fi ll the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}