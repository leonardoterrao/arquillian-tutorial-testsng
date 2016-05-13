package org.arquillian.example;

import java.io.PrintStream;

public class Greeter {

    public void greet(PrintStream printStream, String name) {
        printStream.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }

}