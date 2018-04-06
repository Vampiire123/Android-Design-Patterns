package com.example.syl.AndroidDesignPatterns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.syl.AndroidDesignPatterns.decorator_example.java.BaseProduct
import com.example.syl.AndroidDesignPatterns.decorator_example.java.decorations.ProductImage
import com.example.syl.AndroidDesignPatterns.decorator_example.java.decorations.ProductTitle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productImageTitle = ProductTitle(ProductImage(BaseProduct()))
        productImageTitle.makeProduct()
    }
}