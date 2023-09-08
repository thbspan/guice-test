package org.test.guice.demo;

import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.test.guice.MyApplet;

public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
        super();
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString(){
        destination.write( stringProvider.get() );
    }

    public void run() {
        writeString();
    }
}