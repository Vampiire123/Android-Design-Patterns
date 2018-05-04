package com.example.syl.AndroidDesignPatterns.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserJavaTest {

    @Test
    public void builderSetWorks(){
        User user = new User.UserBuilder("firstname").age(10).mobile("mobile").build();

        assertEquals("firstname", user.getFirstName());
        assertEquals(10, user.getAge());
        assertEquals("mobile", user.getMobile());
    }

    @Test
    public void normalMethodSetWorks(){
        User user = new User("firstname", 10, "mobile");

        assertEquals("firstname", user.getFirstName());
        assertEquals(10, user.getAge());
        assertEquals("mobile", user.getMobile());
    }
}