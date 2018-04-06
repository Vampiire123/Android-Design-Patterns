package com.example.syl.android_design_patterns.strategy_example.kotlin.language

import com.example.syl.android_design_patterns.strategy_example.kotlin.StrategyKotlin

class SpanishKotlin: StrategyKotlin {
    override fun sayHello(): String {
        return "¡Buenos días!"
    }
}