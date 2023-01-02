package com.company.DesignPattern.Singleton;

public class SingletonEagerlyLoading {
 //Go ahead and create an
 //instance of Singleton in
 //a static initializer. This
 //code is guaranteed to be
 //thread safe!
    private static SingletonEagerlyLoading uniqueInstance = new SingletonEagerlyLoading();

    private SingletonEagerlyLoading() {
    }

    public static SingletonEagerlyLoading getInstance() {
//We’ve already got an
//instance, so just return it
     return uniqueInstance;
    }
}