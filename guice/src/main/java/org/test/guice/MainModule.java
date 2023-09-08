package org.test.guice;

import com.google.inject.AbstractModule;
import org.test.guice.demo.HelloWorldModule;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }

}
