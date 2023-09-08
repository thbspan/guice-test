package org.test.guice.quick.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.test.guice.quick.Application;
import org.test.guice.quick.module.MyApplicationModule;

public class ApplicationTest {
    private static Injector injector;

    @BeforeAll
    public static void init() {
        injector = Guice.createInjector(new MyApplicationModule());
    }

    @Test
    void testMyApp() {
        Assertions.assertAll(() -> {
            Application myApp = injector.getInstance(Application.class);
            myApp.work();
        });
    }
}
