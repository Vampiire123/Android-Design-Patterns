package com.example.syl.android_design_patterns.strategy_example.java;

public class Language {

    private Strategy strategy;

    public Language(Strategy strategy){
        this.strategy = strategy;
    }

    public String sayHelloFromStrategy(){
        return strategy.sayHello();
    }
}