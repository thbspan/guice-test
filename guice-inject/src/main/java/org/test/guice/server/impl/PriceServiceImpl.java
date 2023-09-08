package org.test.guice.server.impl;

import com.google.common.cache.Cache;
import jakarta.inject.Inject;
import org.test.guice.server.PriceService;

import java.util.Set;

public class PriceServiceImpl implements PriceService {

    private final Set<String> supportedCurrencies;
    private final Cache<String,String> cache;

    @Inject
    public PriceServiceImpl(Set<String> supportedCurrencies,Cache<String,String> cache) {
        this.supportedCurrencies = supportedCurrencies;
        this.cache = cache;
    }

    @Override
    public long getPrice(long orderId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    String getCacheValue(String key){
        return cache.getIfPresent(key);
    }
}
