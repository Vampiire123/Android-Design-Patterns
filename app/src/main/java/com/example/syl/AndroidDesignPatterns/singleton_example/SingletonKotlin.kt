package com.example.syl.AndroidDesignPatterns.singleton_example

class SingletonKotlin private constructor(){

    private object objectSingleton {
        val instance = SingletonKotlin()
    }

    companion object {
        val instance: SingletonKotlin = objectSingleton.instance
    }
}
