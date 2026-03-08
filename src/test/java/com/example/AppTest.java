package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
    @Test
    void testGreet() {
        Greeter g = new Greeter("Hi");
        assertEquals("Hi, Ada!", g.greet("Ada"));
    }
}
