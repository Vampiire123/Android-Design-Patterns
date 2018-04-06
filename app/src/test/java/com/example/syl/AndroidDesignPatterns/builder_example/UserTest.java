package com.example.syl.AndroidDesignPatterns.builder_example;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void javaBuilderSetWorks(){
        User user = new User.UserBuilder("firstname").age(10).mobile("mobile").build();

        assertEquals("firstname", user.getFirstName());
        assertEquals(10, user.getAge());
        assertEquals("mobile", user.getMobile());
    }

    @Test
    public void kotlinBuilderSetWorks(){
        UserKotlin user = new UserKotlin.UserKotlinBuilder("firstname").age(10).mobile("mobile").build();

        assertEquals("firstname", user.getFirstname());
        assertEquals(10, user.getAge());
        assertEquals("mobile", user.getMobile());
    }

    @Test
    public void javaNormalMethodSetWorks(){
        User user = new User("firstname", 10, "mobile");

        assertEquals("firstname", user.getFirstName());
        assertEquals(10, user.getAge());
        assertEquals("mobile", user.getMobile());
    }

    @Test
    public void kotlinNormalMethodSetWorks(){
        UserKotlin user = new UserKotlin("firstname", 10, "mobile");

        assertEquals("firstname", user.getFirstname());
        assertEquals(10, user.getAge());
        assertEquals("mobile", user.getMobile());
    }
}