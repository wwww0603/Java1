package com.example;

/**
 * Main application class. 
 * Demonstrates object instantiation outside the logic class.
 */
public class App {
    public static void main(String[] args) {
        // Instantiate the Greeter object
        Greeter greeter = new Greeter("Hello");

        // Handle command-line arguments
        String who = (args.length > 0) ? args[0] : "world";

        // Print the result to the console
        System.out.println(greeter.greet(who));
    }
}
