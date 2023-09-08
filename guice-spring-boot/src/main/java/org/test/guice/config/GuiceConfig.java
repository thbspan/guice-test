package org.test.guice.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.test.guice.guice.boot.controller.SpringAwareServletModule;
import org.test.guice.guice.boot.greeting.GreetingHandler;
import org.test.guice.guice.boot.greeting.HelloWorldWebModule;

@Configuration
public class GuiceConfig {

    @Bean
    Injector injector(ApplicationContext context){
        return Guice.createInjector(new HelloWorldWebModule(),
                new SpringAwareServletModule(context));
    }

    @Bean
    @RequestScope
    GreetingHandler greetingHandler(Injector injector){
        return injector.getInstance(GreetingHandler.class);
    }
}
