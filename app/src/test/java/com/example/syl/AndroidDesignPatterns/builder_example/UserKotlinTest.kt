package com.example.syl.AndroidDesignPatterns.builder_example

import org.junit.Test

import org.junit.Assert.*

class UserKotlinTest {

    @Test
    fun builderSetWorks() {
        val user = UserKotlin.UserKotlinBuilder("firstname").age(10).mobile("mobile").build()

        assertEquals("firstname", user.firstname)
        assertEquals(10, user.age.toLong())
        assertEquals("mobile", user.mobile)
    }

    @Test
    fun normalMethodSetWorks() {
        val user = UserKotlin("firstname", 10, "mobile")

        assertEquals("firstname", user.firstname)
        assertEquals(10, user.age.toLong())
        assertEquals("mobile", user.mobile)
    }
}