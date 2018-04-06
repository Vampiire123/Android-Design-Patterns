package com.example.syl.AndroidDesignPatterns.decorator_example.java.decorations;

import com.example.syl.AndroidDesignPatterns.decorator_example.java.Product;
import com.example.syl.AndroidDesignPatterns.decorator_example.java.ProductDecorator;

public class ProductTitle extends ProductDecorator{

    public ProductTitle(Product product) {
        super(product);
    }

    @Override
    public String makeProduct(){
        return super.makeProduct() + " with title";
    }
}