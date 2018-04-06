package com.example.syl.AndroidDesignPatterns.decorator_example.kotlin

abstract class ProductDecoratorKotlin(productKotlin: ProductKotlin) : ProductKotlin{

    private val product: ProductKotlin = productKotlin

    override fun makeProduct(): String{
        return this.product.makeProduct()
    }
}