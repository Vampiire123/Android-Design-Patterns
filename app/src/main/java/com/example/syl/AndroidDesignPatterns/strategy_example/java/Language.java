package com.example.syl.AndroidDesignPatterns.strategy_example.java;

public class Language {

    private Strategy strategy;

    public Language(Strategy strategy){
        this.strategy = strategy;
    }

    public String sayHelloFromStrategy(){
        return strategy.sayHello();
    }
}