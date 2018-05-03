package com.example.syl.AndroidDesignPatterns.memento_example.Kotlin

import com.example.syl.AndroidDesignPatterns.memento_example.java.CareTaker
import com.example.syl.AndroidDesignPatterns.memento_example.java.Originator
import junit.framework.Assert.assertEquals
import org.junit.Test

class MementoKotlinTest {

    @Test
    fun `should create a memento`(){
        var originator = Originator()
        var careTaker = CareTaker()

        originator.state = "state 1"
        careTaker.add(originator.saveStateToMemento())

        assertEquals(careTaker.get(0).state, "state 1")
    }

    @Test
    fun `should return to previous memento`(){
        var originator = Originator()
        var careTaker = CareTaker()

        originator.state = "state 1"
        careTaker.add(originator.saveStateToMemento())
        originator.state = "state 2"
        careTaker.add(originator.saveStateToMemento())
        originator.state = "state 3"
        careTaker.add(originator.saveStateToMemento())

        originator.getStateFromMemento(careTaker.get(1))
        assertEquals(originator.state, "state 2")
    }
}