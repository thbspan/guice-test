package org.test.guice.quick.impl;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.test.guice.quick.BaseProcessor;
import org.test.guice.quick.BillingService;

public class RealBillingService implements BillingService {

    private final BaseProcessor baseProcessor;

    @Inject
    public RealBillingService(@Named("CreditCard") BaseProcessor baseProcessor) {
        this.baseProcessor = baseProcessor;
    }

    @Override
    public void bill() {
        System.out.printf("use type %s to pay bill", baseProcessor.process());
    }
}
