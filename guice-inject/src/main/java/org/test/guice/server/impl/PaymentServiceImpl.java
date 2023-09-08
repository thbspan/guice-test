package org.test.guice.server.impl;

import com.google.common.cache.Cache;
import jakarta.inject.Inject;
import org.test.guice.server.PaymentService;

public class PaymentServiceImpl implements PaymentService {

    private final Cache<String, String> cache;

    @Inject
    public PaymentServiceImpl(Cache<String, String> cache) {
        super();
        this.cache = cache;
    }

    @Logged
    @Override
    public void pay(long orderId, long price, Long sessionId) {

    }

    void putCache(String key, String value) {
        cache.put(key, value);
    }
}
