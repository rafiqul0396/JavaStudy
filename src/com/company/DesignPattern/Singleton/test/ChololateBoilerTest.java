package com.company.DesignPattern.Singleton.test;

import com.company.DesignPattern.Singleton.ChocolateBoiler;
import org.junit.Test;

public class ChololateBoilerTest {
    @Test
    public  void test(){
        ChocolateBoiler bolier=ChocolateBoiler.getInstance();
        bolier.boil();
    }
}
