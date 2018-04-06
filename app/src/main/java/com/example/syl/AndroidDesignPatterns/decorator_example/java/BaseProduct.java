package com.example.syl.AndroidDesignPatterns.decorator_example.java;

public class BaseProduct implements Product {

    @Override
    public void makeProduct() {
        System.out.println("base product");
    }
}