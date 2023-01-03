package com.company.DesignPattern.Decorator;

import com.company.DesignPattern.Decorator.Deco.CompressionDecorator;
import com.company.DesignPattern.Decorator.Deco.EncriptionDecorator;
import com.company.DesignPattern.Decorator.Interface.Database;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseTest {


    private Database database=null;
    @Before
    public void SetUp(){
        database=new SimpleDatabase();
    }

    @Test
    public  void testBase(){
        String value=database.read();
        String expected;
        assertEquals(" if this is equal with baseDatabase",expected="Base",value);
    }
    @Test
    public  void CompressionTest(){
        Database compressed=new CompressionDecorator(database);
        String value=compressed.read();
        String expected;
        assertEquals(" if this is equal with baseDatabase",expected="Base__Decopress__",value);

    }
    @Test
    public  void EncriptionTest(){
        Database encription=new EncriptionDecorator(database);
        String value=encription.read();
        String expected;
        assertEquals(" if this is equal with baseDatabase",expected="Base__decripted__",value);

    }

    @Test
    public  void compressionEncriptionTest(){
        Database db=new  EncriptionDecorator(new CompressionDecorator(database));
        String value=db.read();
        String expected;
        assertEquals(" if this is equal with baseDatabase",expected="Base__Decopress____decripted__",value);

    }
}
