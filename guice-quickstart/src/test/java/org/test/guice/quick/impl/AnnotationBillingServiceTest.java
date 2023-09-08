package org.test.guice.quick.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.module.AnnotationBillingModule;

public class AnnotationBillingServiceTest {

    private static Injector injector;

    @BeforeAll
    public static void init() {
        injector = Guice.createInjector(new AnnotationBillingModule());
    }

    @Test
    void testAnnotationBill() {
        Assertions.assertAll(() -> {
            BillingService billingService = injector.getInstance(BillingService.class);
            billingService.bill();
        });
    }
}
