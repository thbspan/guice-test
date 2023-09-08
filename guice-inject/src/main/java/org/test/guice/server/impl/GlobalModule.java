package org.test.guice.server.impl;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class GlobalModule extends AbstractModule {

    @Override
    protected void configure() {
        // adds EUR , USD support
        Multibinder<String> currencyBinder = Multibinder.newSetBinder(binder(), String.class);

        currencyBinder.addBinding()
                .toInstance("EUR");

        currencyBinder.addBinding()
                .toInstance("USD");
    }
}
