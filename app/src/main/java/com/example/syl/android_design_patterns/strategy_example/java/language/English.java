package com.example.syl.android_design_patterns.strategy_example.java.language;

import android.util.Log;

import com.example.syl.android_design_patterns.strategy_example.java.Strategy;

public class English implements Strategy {
    @Override
    public String sayHello() {
        return "Hello there!";
    }
}