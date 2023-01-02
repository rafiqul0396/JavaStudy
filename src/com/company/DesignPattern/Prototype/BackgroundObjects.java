package com.company.DesignPattern.Prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
// step-2: create a concreate class
public class BackgroundObjects implements  GraphicalObjects {

    private  int x;
    private  int y;
    private  int width;
    private  int height;
    private  Backgroundobject type;


    //step 2.5- we implement the clone method
    @Override
    public BackgroundObjects clone() {
        return new BackgroundObjects(x,y,width,height,type);
    }
}
