package com.example.syl.AndroidDesignPatterns.decorator_example.java;

public class BaseProduct implements Product {

    @Override
    public String makeProduct() {
        return "base product";
    }
}