package com.example.syl.AndroidDesignPatterns.singleton

import org.junit.Before
import org.junit.Test

import junit.framework.Assert.assertEquals

class SingletonKotlinTest {

    internal var singletonKotlin: SingletonKotlin? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        singletonKotlin = SingletonKotlin.instance
    }

    @Test
    fun kotlinSingletonMustBeUnique() {
        val secondSingleton = SingletonKotlin.instance

        assertEquals(singletonKotlin, secondSingleton)
    }
}