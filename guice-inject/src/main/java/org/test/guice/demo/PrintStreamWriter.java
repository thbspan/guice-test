package org.test.guice.demo;

import jakarta.inject.Inject;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    @Inject
    public PrintStreamWriter(PrintStream destination) {
        super();
        this.destination = destination;
    }

    @Override
    public void write(String String) {
        destination.println(String);
    }
}
