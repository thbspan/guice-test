package org.test.guice.guice.boot.controller;

import com.google.inject.AbstractModule;
import com.google.inject.servlet.ServletModule;
import org.springframework.context.ApplicationContext;

public class SpringAwareServletModule extends AbstractModule {

    private final ApplicationContext context;

    public SpringAwareServletModule(ApplicationContext context) {
        this.context = context;
    }

    @Override
    protected void configure() {
        install(new ServletModule());
        bind(ApplicationContext.class).toInstance(context);
    }
}
