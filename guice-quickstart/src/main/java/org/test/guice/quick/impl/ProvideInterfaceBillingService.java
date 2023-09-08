package org.test.guice.quick.impl;

import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.test.guice.quick.BaseProcessor;
import org.test.guice.quick.BillingService;

public class ProvideInterfaceBillingService implements Provider<BillingService> {

    private final BaseProcessor baseProcessor;

    @Inject
    public ProvideInterfaceBillingService(@PayType BaseProcessor baseProcessor) {
        this.baseProcessor = baseProcessor;
    }

    @Override
    public BillingService get() {
        return () -> System.out.printf("provide interface use type %s to pay bill", baseProcessor.process());
    }
}
