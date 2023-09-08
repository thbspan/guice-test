package org.test.guice.demo;

import jakarta.inject.Inject;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {

    private final PrintStream destination;

    @Inject
    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    @Override
    public void write(String string) {
        destination.println(string);
    }
}
