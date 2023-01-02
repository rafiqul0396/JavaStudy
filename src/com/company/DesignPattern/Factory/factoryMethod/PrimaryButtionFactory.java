package com.company.DesignPattern.Factory.factoryMethod;

import com.company.DesignPattern.Factory.Button12.Button;
import com.company.DesignPattern.Factory.Button12.PrimaryButton;

public class PrimaryButtionFactory implements BFacotry {
    @Override
    public Button createButton() {

        return new PrimaryButton();
    }
}
