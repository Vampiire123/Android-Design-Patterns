package com.example.syl.AndroidDesignPatterns.strategy_example.java;

import com.example.syl.AndroidDesignPatterns.strategy_example.java.language.English;
import com.example.syl.AndroidDesignPatterns.strategy_example.java.language.Spanish;
import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.LanguageKotlin;
import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.language.EnglishKotlin;
import com.example.syl.AndroidDesignPatterns.strategy_example.kotlin.language.SpanishKotlin;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageTest {

    @Test
    public void shouldReturnGreetingInSpanishJava(){
        Language language = new Language(new Spanish());
        assertEquals(language.sayHelloFromStrategy(), "¡Buenos días!");
    }

    @Test
    public void shouldReturnGreetingInEnglishJava(){
        Language language = new Language(new English());
        assertEquals(language.sayHelloFromStrategy(), "Hello there!");
    }

    @Test
    public void shouldReturnGreetingInSpanishKotlin(){
        LanguageKotlin languageKotlin = new LanguageKotlin(new SpanishKotlin());
        assertEquals(languageKotlin.sayHelloFromStrategy(), "¡Buenos días!");
    }

    @Test
    public void shouldReturnGreetingInEnglishKotlin(){
        LanguageKotlin languageKotlin = new LanguageKotlin(new EnglishKotlin());
        assertEquals(languageKotlin.sayHelloFromStrategy(), "Hey there!");
    }
}