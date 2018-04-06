package com.example.syl.AndroidDesignPatterns.decorator_example.java.decorations;

import com.example.syl.AndroidDesignPatterns.decorator_example.java.Product;
import com.example.syl.AndroidDesignPatterns.decorator_example.java.ProductDecorator;

public class ProductImage extends ProductDecorator{

    public ProductImage(Product product) {
        super(product);
    }

    @Override
    public void makeProduct() {
        super.makeProduct();
        System.out.println("Product with image");
    }
}