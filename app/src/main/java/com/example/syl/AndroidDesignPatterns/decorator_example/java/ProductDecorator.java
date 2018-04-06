package com.example.syl.AndroidDesignPatterns.decorator_example.java;

public class ProductDecorator implements Product {

    protected Product product;

    public ProductDecorator(Product product){
        this.product = product;
    }

    @Override
    public void makeProduct() {
        this.product.makeProduct();
    }
}