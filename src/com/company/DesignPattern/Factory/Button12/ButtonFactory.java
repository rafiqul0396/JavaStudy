package com.company.DesignPattern.Factory.Button12;


//step-3:create a fuctory class
public class ButtonFactory {

    // step4: create a static factory method
    // requirements : Accepts a paramter
    // return the product interface
    public  static  Button createButtonFactory(Platform platform){
        switch (platform){
            case IOS :
                return  new RoundButton();
            case ANDROID:
                return  new PrimaryButton();
            case MAC_OS:
                return  new RoundButton();
            case WINDOWS:
                return new PrimaryButton();
        }
        throw  new RuntimeException("invalid platform");


    }


}
