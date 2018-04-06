package com.example.syl.AndroidDesignPatterns.decorator_example.java;

import com.example.syl.AndroidDesignPatterns.decorator_example.java.decorations.ProductImage;
import com.example.syl.AndroidDesignPatterns.decorator_example.java.decorations.ProductTitle;
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.BaseProductKotlin;
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.ProductKotlin;
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.decorations.ProductImageKotlin;
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.decorations.ProductTitleKotlin;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void shouldReturnStringWithoutDecorationsJava(){
        Product product = new BaseProduct();
        assertEquals(product.makeProduct(), "base product");
    }

    @Test
    public void shouldReturnStringWithImageJava(){
        Product product = new ProductImage(new BaseProduct());
        assertEquals(product.makeProduct(), "base product with image");
    }

    @Test
    public void shouldReturnStringWithTitleJava(){
        Product product = new ProductTitle(new BaseProduct());
        assertEquals(product.makeProduct(), "base product with title");
    }

    @Test
    public void shouldReturnStringWithEveryDecorationJava(){
        Product product = new ProductImage(new ProductTitle(new BaseProduct()));
        assertEquals(product.makeProduct(), "base product with title with image");
    }

    @Test
    public void shouldReturnStringWithoutDecorationsKotlin(){
        ProductKotlin product = new BaseProductKotlin();
        assertEquals(product.makeProduct(), "base product kotlin");
    }

    @Test
    public void shouldReturnStringWithImageKotlin(){
        ProductKotlin product = new ProductImageKotlin(new BaseProductKotlin());
        assertEquals(product.makeProduct(), "base product kotlin with image");
    }

    @Test
    public void shouldReturnStringWithTitleKotlin(){
        ProductKotlin product = new ProductTitleKotlin(new BaseProductKotlin());
        assertEquals(product.makeProduct(), "base product kotlin with title");
    }

    @Test
    public void shouldReturnStringWithEveryDecorationKotlin(){
        ProductKotlin product = new ProductImageKotlin(new ProductTitleKotlin(new BaseProductKotlin()));
        assertEquals(product.makeProduct(), "base product kotlin with title with image");
    }
}