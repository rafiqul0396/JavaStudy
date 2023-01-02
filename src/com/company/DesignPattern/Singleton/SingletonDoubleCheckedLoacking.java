package com.company.DesignPattern.Singleton;

public class SingletonDoubleCheckedLoacking {
    private static SingletonDoubleCheckedLoacking uniqueInstance;

    private SingletonDoubleCheckedLoacking() {
    }

    public static SingletonDoubleCheckedLoacking getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLoacking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLoacking();
                }
            }
        }
        return uniqueInstance;
    }
}