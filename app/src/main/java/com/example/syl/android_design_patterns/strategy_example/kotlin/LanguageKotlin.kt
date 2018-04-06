package com.example.syl.android_design_patterns.strategy_example.kotlin

class LanguageKotlin {

    private val strategy: StrategyKotlin

    constructor(strategy: StrategyKotlin){
        this.strategy = strategy
    }

    fun sayHelloFromStrategy(): String{
        return strategy.sayHello()
    }
}