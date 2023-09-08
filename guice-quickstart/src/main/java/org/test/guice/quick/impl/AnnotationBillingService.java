package org.test.guice.quick.impl;

import jakarta.inject.Inject;
import org.test.guice.quick.BaseProcessor;
import org.test.guice.quick.BillingService;

public class AnnotationBillingService implements BillingService {

    private final BaseProcessor baseProcessor;

    @Inject
    public AnnotationBillingService(@PayType BaseProcessor baseProcessor) {
        this.baseProcessor = baseProcessor;
    }

    @Override
    public void bill() {
        System.out.printf("annotation use type %s to pay bill", baseProcessor.process());
    }
}
