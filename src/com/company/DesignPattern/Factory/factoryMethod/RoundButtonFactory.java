package com.company.DesignPattern.Factory.factoryMethod;

import com.company.DesignPattern.Factory.Button12.Button;
import com.company.DesignPattern.Factory.Button12.RoundButton;


// step-4: create a concreate factory classes
public class RoundButtonFactory implements BFacotry {
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
