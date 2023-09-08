package org.test.guice.quick.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.test.guice.quick.BaseProcessor;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.impl.CreditCardProcessor;
import org.test.guice.quick.impl.RealBillingService;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(BaseProcessor.class).annotatedWith(Names.named("CreditCard"))
                .to(CreditCardProcessor.class);
        bind(BillingService.class).to(RealBillingService.class);
    }
}
