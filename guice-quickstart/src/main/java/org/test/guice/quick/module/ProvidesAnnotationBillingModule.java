package org.test.guice.quick.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.test.guice.quick.BaseProcessor;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.impl.AnnotationBillingService;
import org.test.guice.quick.impl.CreditCardProcessor;
import org.test.guice.quick.impl.PayType;

public class ProvidesAnnotationBillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BaseProcessor.class).annotatedWith(PayType.class)
                .to(CreditCardProcessor.class);
    }

    @Provides
    BillingService billingService(@PayType BaseProcessor baseProcessor) {
        return new AnnotationBillingService(baseProcessor);
    }
}
