package com.company.DesignPattern.Decorator;

import com.company.DesignPattern.Decorator.Interface.Database;


// step2: base product implemenation
public class SimpleDatabase implements Database {
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String str) {

        System.out.println(str);

    }


}
