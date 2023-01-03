package com.company.DesignPattern.Decorator.Deco;

import com.company.DesignPattern.Decorator.Interface.Database;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompressionDecorator implements Database {
    private  Database database;

    @Override
    public String read() {

        String value=database.read();

        return Decopress(value);
    }

    private String Decopress(String value) {

        return value+"__Decopress__";
    }

    @Override
    public void write(String str) {
        String compress=CpomressFile(str);
        database.write(compress);

    }

    private String CpomressFile(String str) {

        return str+"__compressValue__";
    }
}
