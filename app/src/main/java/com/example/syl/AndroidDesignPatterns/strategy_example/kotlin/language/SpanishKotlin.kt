package com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.language

import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.StrategyKotlin

class SpanishKotlin: StrategyKotlin {
    override fun sayHello(): String {
        return "¡Buenos días!"
    }
}