package com.example.syl.AndroidDesignPatterns.strategy.java

import com.example.syl.AndroidDesignPatterns.strategy.kotlin.LanguageKotlin
import com.example.syl.AndroidDesignPatterns.strategy.kotlin.language.EnglishKotlin
import com.example.syl.AndroidDesignPatterns.strategy.kotlin.language.SpanishKotlin

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