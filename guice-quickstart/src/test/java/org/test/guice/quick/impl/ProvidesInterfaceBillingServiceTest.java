package org.test.guice.quick.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jakarta.inject.Provider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.module.ProvidesInterfaceBillingModule;

/**
 * 使用{@link Provider}接口的测试类
 */
public class ProvidesInterfaceBillingServiceTest {

    private static Injector injector;

    @BeforeAll
    public static void init() {
        injector = Guice.createInjector(new ProvidesInterfaceBillingModule());
    }

    @Test
    void testProvidesAnnotationBill() {
        Assertions.assertAll(() -> {
            BillingService billingService = injector.getInstance(BillingService.class);
            billingService.bill();
        });
    }
}
