package com.company.DesignPattern.Decorator.Deco;


import com.company.DesignPattern.Decorator.Interface.Database;
import lombok.AllArgsConstructor;

// step3: create base decorator implementing product interface
@AllArgsConstructor
public class BaseDecorator implements Database {
    
    
    private  Database database;
    @Override
    public String read() {
        return database.read();
    }

    @Override
    public void write(String str) {
        database.write(str);

    }
}
