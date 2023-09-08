package org.test.guice.quick.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.google.inject.Provides;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.module.ProvidesAnnotationBillingModule;

/**
 * 使用 @{@link Provides}注解和自定义注解绑定实例的测试类
 */
public class ProvidesAnnotationBillingServiceTest {
    private static Injector injector;

    @BeforeAll
    public static void init() {
        injector = Guice.createInjector(new ProvidesAnnotationBillingModule());
    }

    @Test
    void testProvidesAnnotationBill() {
        Assertions.assertAll(() -> {
            BillingService billingService = injector.getInstance(BillingService.class);
            billingService.bill();
        });
    }
}
