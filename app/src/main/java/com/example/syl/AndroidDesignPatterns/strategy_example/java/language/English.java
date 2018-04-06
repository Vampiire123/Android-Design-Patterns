package com.example.syl.AndroidDesignPatterns.strategy_example.java.language;

import android.util.Log;

import com.example.syl.AndroidDesignPatterns.strategy_example.java.Strategy;

public class English implements Strategy {
    @Override
    public String sayHello() {
        return "Hello there!";
    }
}