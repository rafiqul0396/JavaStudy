package com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract;

import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.DarkButton;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.DarkCheckBox;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.DarkFormFactory;

import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.Button1;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.CheckBox;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.FormFactoryInterface;
import com.company.DesignPattern.Factory.factoryMethod.FactoryFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    private FormFactoryInterface factory1;

    @Before
    void  setUp(){
        factory1 = new DarkFormFactory();
    }

    @Test
    void  FactoryTest(){
        Button1 dark_btn=factory1.createButton();
        CheckBox dark_chkbox=factory1.createCheckbox();
        assertTrue("this is checking the object of dark button creation",dark_btn instanceof DarkButton);
        assertTrue("this is checking the object of dark button creation",dark_chkbox instanceof DarkCheckBox);

    }
}
