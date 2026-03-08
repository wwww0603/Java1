package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Greeter logic.
 */
public class AppTest {
    @Test
    void testGreetingMessage() {
        Greeter g = new Greeter("Hi");
        assertEquals("Hi, Student!", g.greet("Student"));
    }
}
