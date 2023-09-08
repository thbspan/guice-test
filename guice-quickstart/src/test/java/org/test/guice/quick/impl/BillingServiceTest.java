package org.test.guice.quick.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jakarta.inject.Named;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.module.BillingModule;

/**
 * 使用 @{@link Named}注解来指定名称的测试类
 */
public class BillingServiceTest {

    private static Injector injector;

    @BeforeAll
    public static void init() {
        injector = Guice.createInjector(new BillingModule());
    }

    @Test
    void testBill() {
        Assertions.assertAll(() -> {
            BillingService billingService = injector.getInstance(BillingService.class);
            billingService.bill();
        });
    }
}
