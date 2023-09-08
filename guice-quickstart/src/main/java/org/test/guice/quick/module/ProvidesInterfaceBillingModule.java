package org.test.guice.quick.module;

import com.google.inject.AbstractModule;
import org.test.guice.quick.BaseProcessor;
import org.test.guice.quick.BillingService;
import org.test.guice.quick.impl.CreditCardProcessor;
import org.test.guice.quick.impl.PayType;
import org.test.guice.quick.impl.ProvideInterfaceBillingService;

public class ProvidesInterfaceBillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(BaseProcessor.class).annotatedWith(PayType.class)
                .to(CreditCardProcessor.class);
        bind(BillingService.class).toProvider(ProvideInterfaceBillingService.class);
    }

}
