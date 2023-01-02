package com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract;


import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.Button1;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.CheckBox;
import com.company.DesignPattern.Factory.AbstractFactoryPattern.ButtonAbstract.Interfaces.FormFactoryInterface;

public class DarkFormFactory implements FormFactoryInterface {
    @Override
    public Button1 createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new DarkCheckBox();
    }
}
