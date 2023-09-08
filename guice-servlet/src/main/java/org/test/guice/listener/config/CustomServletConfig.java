package org.test.guice.listener.config;

import com.google.inject.servlet.ServletModule;
import org.test.guice.servlet.MainServlet;

public class CustomServletConfig extends ServletModule {

    @Override
    protected void configureServlets() {
        serve("/*").with(MainServlet.class);
    }
}
