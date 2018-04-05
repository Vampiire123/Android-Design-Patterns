package com.example.syl.android_design_patterns.singleton_example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SingletonTest {

    Singleton singleton;
    SingletonKotlin singletonKotlin;

    @Before
    public void setUp() throws Exception {
        singleton = Singleton.getInstance();
        singletonKotlin = SingletonKotlin.Companion.getInstance();
    }

    @Test
    public void javaSingletonMustBeUnique(){
        Singleton singleton2 = Singleton.getInstance();

        assertEquals(singleton, singleton2);
    }

    @Test
    public void kotlinSingletonMustBeUnique(){
        SingletonKotlin singletonKotlin2 = SingletonKotlin.Companion.getInstance();

        assertEquals(singletonKotlin, singletonKotlin2);
    }
}