package com.example.syl.AndroidDesignPatterns.strategy_example.java;

import com.example.syl.AndroidDesignPatterns.strategy_example.java.language.English;
import com.example.syl.AndroidDesignPatterns.strategy_example.java.language.Spanish;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageJavaTest {

    @Test
    public void shouldReturnGreetingInSpanish(){
        Language language = new Language(new Spanish());
        assertEquals(language.sayHelloFromStrategy(), "¡Buenos días!");
    }

    @Test
    public void shouldReturnGreetingInEnglish(){
        Language language = new Language(new English());
        assertEquals(language.sayHelloFromStrategy(), "Hello there!");
    }
}