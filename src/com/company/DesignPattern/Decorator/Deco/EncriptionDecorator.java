package com.company.DesignPattern.Decorator.Deco;


import com.company.DesignPattern.Decorator.Interface.Database;
import lombok.AllArgsConstructor;

// step4: create the concreate   decorator and extend the base decorator
@AllArgsConstructor
public class EncriptionDecorator implements Database {
    private  Database database;

    // decription this method
    @Override
    public String read() {
        
        String value=database.read();
        return decrept(value);
    }

    private String decrept(String value) {
        return  value+"__decripted__";
    }

    // encripting this method
    @Override
    public void write(String str) {

        String encripted=encripted(str);
        database.write(encripted);

    }

    private String encripted(String str) {
        return "encripted";
    }
}
