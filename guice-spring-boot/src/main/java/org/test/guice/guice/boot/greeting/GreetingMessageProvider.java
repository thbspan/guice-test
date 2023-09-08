package org.test.guice.guice.boot.greeting;

import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.test.guice.guice.boot.persistence.SampleDao;

public class GreetingMessageProvider implements Provider<String> {
    private final RequestParams params;
    private final SampleDao sampleDao;

    @Inject
    public GreetingMessageProvider(RequestParams params, SampleDao sampleDao) {
        this.params = params;
        this.sampleDao = sampleDao;
    }

    @Override
    public String get() {
        sampleDao.getPersonData(params.getGreetingName());
        return "Hello " + params.getGreetingName();
    }
}
