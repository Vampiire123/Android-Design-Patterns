package com.example.syl.AndroidDesignPatterns.decorator_example.java;

public abstract class ProductDecorator implements Product {

    protected Product product;

    public ProductDecorator(Product product){
        this.product = product;
    }

    @Override
    public String makeProduct() {
        return this.product.makeProduct();
    }
}