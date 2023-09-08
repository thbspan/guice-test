package org.test.guice.server.impl;

import com.google.inject.Guice;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CacheTest {

    @Inject
    PaymentServiceImpl paymentService;
    @Inject
    PriceServiceImpl priceService;

    @BeforeEach
    public void setUp() {
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }

    @Test
    void testCache() {
        paymentService.putCache("testValue", "testValue");
        String cacheValue = priceService.getCacheValue("testValue");
        assertEquals("testValue", cacheValue);
    }
}
