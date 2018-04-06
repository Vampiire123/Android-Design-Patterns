package com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.language

import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.StrategyKotlin

class EnglishKotlin: StrategyKotlin {
    override fun sayHello(): String {
        return "Hey there!"
    }
}