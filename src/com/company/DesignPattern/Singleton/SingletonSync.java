package com.company.DesignPattern.Singleton;

public class SingletonSync {
    private static SingletonSync uniqueInstance;

    // other useful instance variables here
    private SingletonSync() {
    }
//By adding the synchronized keyword to
//getInstance(), we force every thread to
//wait its turn before it can enter the
//method. That is, no two threads may
//enter the method at the same time.
    public static synchronized SingletonSync getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync();
        }
        return uniqueInstance;
    }
    // other useful methods here
}