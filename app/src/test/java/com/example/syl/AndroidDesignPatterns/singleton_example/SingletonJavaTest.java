package com.example.syl.AndroidDesignPatterns.singleton_example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SingletonJavaTest {

    Singleton singleton;

    @Before
    public void setUp() throws Exception {
        singleton = Singleton.getInstance();
    }

    @Test
    public void javaSingletonMustBeUnique(){
        Singleton secondSingleton = Singleton.getInstance();

        assertEquals(singleton, secondSingleton);
    }
}