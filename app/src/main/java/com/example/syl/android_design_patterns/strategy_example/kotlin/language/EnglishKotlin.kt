package com.example.syl.android_design_patterns.strategy_example.kotlin.language

import com.example.syl.android_design_patterns.strategy_example.kotlin.StrategyKotlin

class EnglishKotlin: StrategyKotlin {
    override fun sayHello(): String {
        return "Hey there!"
    }
}