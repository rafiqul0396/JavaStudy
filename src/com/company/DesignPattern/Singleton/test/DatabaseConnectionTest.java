package com.company.DesignPattern.Singleton.test;

import com.company.DesignPattern.Singleton.SingletonEagerlyLoading;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {
    
    @Test
    public void test() {

        SingletonEagerlyLoading pool = SingletonEagerlyLoading.getInstance();
        //ConnectionPool pool2 = ConnectionPool.getInstance();

        assertNotNull("If a new instance is created, it should be the same as the older one", pool );
        SingletonEagerlyLoading pool2 = SingletonEagerlyLoading.getInstance();
        assertEquals("if the equal or not",pool,pool2);

    }
}