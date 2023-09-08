package org.test.guice.guice.boot.greeting;

import com.google.inject.AbstractModule;
import org.test.guice.guice.MyApplet;
import org.test.guice.guice.demo.MyDestination;
import org.test.guice.guice.demo.Output;
import org.test.guice.guice.demo.StringWritingApplet;

public class HelloWorldWebModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(MyApplet.class).to(StringWritingApplet.class);
        bind(MyDestination.class).to(WebDestination.class);
        bind(String.class).annotatedWith(Output.class).toProvider(GreetingMessageProvider.class);
    }
}
