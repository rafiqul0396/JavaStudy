package com.company.DesignPattern.Factory.Button12;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ButtonFactoryTest {


    @Test
    public void  setup(){
       // buttonFactory= FactoryFactory.createFactory("round");

    }
    @Test
    public void CtreatTest(){
        Button button=ButtonFactory.createButtonFactory(Platform.ANDROID);
        assertTrue("if plaform is andriod button should be primary",button instanceof PrimaryButton);

    }
    @Test
    public  void  factoryMethodTest(){
       // Button primary=buttonFactory.createButton();
       // assertTrue("if plaform is andriod button should be primary",primary instanceof RoundButton);


    }
}
