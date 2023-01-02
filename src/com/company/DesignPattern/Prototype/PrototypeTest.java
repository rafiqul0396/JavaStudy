package com.company.DesignPattern.Prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class PrototypeTest {
    @Test
    public  void  TestClone() {
        //step3- create a prototype
        BackgroundObjects prototye = new BackgroundObjects(1, 1, 12, 13, Backgroundobject.TREE);
        // step 4: clone the prototype as required for forest

        List<BackgroundObjects> forest = new ArrayList<>();
        BackgroundObjects clone = prototye.clone();
        for (int i = 0; i < 1000; i++) {
            BackgroundObjects treeClone = prototye.clone();
            treeClone.setX(new Random().nextInt());
            treeClone.setY(new Random().nextInt());
            forest.add(treeClone);

        }
        //System.out.println(forest);
        assertNotNull("if clone method should be call ,clone should not be null", clone);
        clone.setY(1);
        clone.setX(1);
        assertNotEquals("if the clone method call then not equal", prototye, clone);

    }
        @Test
        public void testCloneObjectWithRegistry() {

            // Initialise registry
            BacgroundRegistry registry = new BacgroundRegistry();

            // Step 4 - Create a prototype object
            BackgroundObjects prototype = new BackgroundObjects(100, 200, 100, 200, Backgroundobject.TREE);


        }

}
