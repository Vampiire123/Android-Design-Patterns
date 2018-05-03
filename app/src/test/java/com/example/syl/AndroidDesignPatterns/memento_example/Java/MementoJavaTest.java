package com.example.syl.AndroidDesignPatterns.memento_example.Java;

import com.example.syl.AndroidDesignPatterns.memento_example.java.CareTaker;
import com.example.syl.AndroidDesignPatterns.memento_example.java.Originator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MementoJavaTest {

    @Test
    public void shouldCreateAMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state 1");
        careTaker.add(originator.saveStateToMemento());

        assertEquals(careTaker.get(0).getState(), "state 1");
    }

    @Test
    public void shouldReturnToPreviousMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state 1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state 2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state 3");
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(1));

        assertEquals(originator.getState(), "state 2");
    }
}
