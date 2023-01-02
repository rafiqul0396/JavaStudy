package com.company.DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class BacgroundRegistry {
    private Map<Backgroundobject,BackgroundObjects> registry= new HashMap<>();
    public  void store(Backgroundobject type,BackgroundObjects backgroundObjects){
        registry.put(type,backgroundObjects);

    }
    public  BackgroundObjects get(Backgroundobject type){
        return  registry.get(type);
    }
}
