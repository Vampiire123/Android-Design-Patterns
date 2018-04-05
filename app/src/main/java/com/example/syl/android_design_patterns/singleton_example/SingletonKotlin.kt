package com.example.syl.android_design_patterns.singleton_example

class SingletonKotlin private constructor(){

    private object objectSingleton {
        val instance = SingletonKotlin()
    }

    companion object {
        val instance: SingletonKotlin = objectSingleton.instance
    }
}
