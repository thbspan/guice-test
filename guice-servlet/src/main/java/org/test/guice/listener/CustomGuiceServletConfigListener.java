package org.test.guice.listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import org.test.guice.listener.config.CustomServletConfig;

public class CustomGuiceServletConfigListener extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new CustomServletConfig());
    }
}
