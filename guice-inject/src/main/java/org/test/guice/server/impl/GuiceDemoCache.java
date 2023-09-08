package org.test.guice.server.impl;

import com.google.common.cache.AbstractCache;
import jakarta.inject.Singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Singleton
public class GuiceDemoCache extends AbstractCache<String, String> {

    private final ConcurrentMap<String, String> keyValues = new ConcurrentHashMap<>();

    @Override
    public String getIfPresent(Object key) {
        return keyValues.get(key);
    }

    @Override
    public void put(String key, String value) {
        keyValues.put(key, value);
    }
}
