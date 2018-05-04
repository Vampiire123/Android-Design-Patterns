package com.example.syl.AndroidDesignPatterns.decorator.java;

import com.example.syl.AndroidDesignPatterns.decorator.java.decorations.ProductImage;
import com.example.syl.AndroidDesignPatterns.decorator.java.decorations.ProductTitle;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorJavaTest {

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
}