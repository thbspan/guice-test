package org.test.guice;

import com.google.inject.AbstractModule;
import org.test.guice.demo.HelloWorldModule;
import org.test.guice.print.PrintLineModule;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new HelloWorldModule());
        install(new PrintLineModule());
    }
}
