package com.example.syl.AndroidDesignPatterns.strategy_example.java

import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.LanguageKotlin
import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.language.EnglishKotlin
import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.language.SpanishKotlin

import org.junit.Test

import org.junit.Assert.*

class LanguageKotlinTest {

    @Test
    fun shouldReturnGreetingInSpanish() {
        val languageKotlin = LanguageKotlin(SpanishKotlin())
        assertEquals(languageKotlin.sayHelloFromStrategy(), "¡Buenos días!")
    }

    @Test
    fun shouldReturnGreetingInEnglish() {
        val languageKotlin = LanguageKotlin(EnglishKotlin())
        assertEquals(languageKotlin.sayHelloFromStrategy(), "Hey there!")
    }
}