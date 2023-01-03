package com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract;


import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.Button1;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.CheckBox;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.FormFactoryInterface;

public class LightFormFactory implements FormFactoryInterface {
    @Override
    public Button1 createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LightCheckBox();
    }
}
