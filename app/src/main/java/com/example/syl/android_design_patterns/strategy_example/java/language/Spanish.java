package com.example.syl.android_design_patterns.strategy_example.java.language;

import com.example.syl.android_design_patterns.strategy_example.java.Strategy;

public class Spanish implements Strategy {
    @Override
    public String sayHello() {
        return "¡Buenos días!";
    }
}