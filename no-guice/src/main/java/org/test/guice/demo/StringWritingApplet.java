package org.test.guice.demo;

import org.test.guice.MyApplet;

public class StringWritingApplet implements MyApplet {

    private final MyDestination destination;
    private final StringProvider stringProvider;

    public StringWritingApplet(MyDestination destination, StringProvider stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    public void run() {
        writeString();
    }
}
