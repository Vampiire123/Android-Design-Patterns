package com.example.syl.AndroidDesignPatterns.strategy_example.java.language;

import com.example.syl.AndroidDesignPatterns.strategy_example.java.Strategy;

public class Spanish implements Strategy {
    @Override
    public String sayHello() {
        return "¡Buenos días!";
    }
}