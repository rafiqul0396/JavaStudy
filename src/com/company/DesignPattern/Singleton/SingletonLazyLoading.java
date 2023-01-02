package com.company.DesignPattern.Singleton;

public class SingletonLazyLoading {
    // step-3: instance variable
    private static SingletonLazyLoading insance;

    //step -1 : constructor hiding
    private SingletonLazyLoading(){

    }
     //step-2: global  acess Point
    public  static SingletonLazyLoading getInstance(){
        // step-4: if present return instance else set and return instance
        if(insance==null){
            insance= new SingletonLazyLoading();
        }
        return insance;

    }

}
