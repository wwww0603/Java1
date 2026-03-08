package com.example;

/**
 * Logic class for generating greeting messages.
 */
public class Greeter {
    private final String prefix;

    public Greeter(String prefix) {
        this.prefix = prefix;
    }

    public String greet(String name) {
        return prefix + ", " + name + "!";
    }
}
