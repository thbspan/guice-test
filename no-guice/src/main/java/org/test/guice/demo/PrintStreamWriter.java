package org.test.guice.demo;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {

    private final PrintStream destination;

    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    @Override
    public void write(String String) {
        destination.println(String);
    }
}
