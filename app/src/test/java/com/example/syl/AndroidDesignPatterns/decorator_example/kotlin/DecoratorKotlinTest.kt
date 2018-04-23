package com.example.syl.AndroidDesignPatterns.decorator_example.kotlin
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.BaseProductKotlin
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.decorations.ProductImageKotlin
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.decorations.ProductTitleKotlin

import org.junit.Test

import org.junit.Assert.*

class DecoratorKotlinTest {

    @Test
    fun shouldReturnStringWithoutDecorationsKotlin() {
        val product = BaseProductKotlin()
        assertEquals(product.makeProduct(), "base product kotlin")
    }

    @Test
    fun shouldReturnStringWithImageKotlin() {
        val product = ProductImageKotlin(BaseProductKotlin())
        assertEquals(product.makeProduct(), "base product kotlin with image")
    }

    @Test
    fun shouldReturnStringWithTitleKotlin() {
        val product = ProductTitleKotlin(BaseProductKotlin())
        assertEquals(product.makeProduct(), "base product kotlin with title")
    }

    @Test
    fun shouldReturnStringWithEveryDecorationKotlin() {
        val product = ProductImageKotlin(ProductTitleKotlin(BaseProductKotlin()))
        assertEquals(product.makeProduct(), "base product kotlin with title with image")
    }
}