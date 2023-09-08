package org.test.guice.server.impl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.util.Modules;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.test.guice.server.OrderService;
import org.test.guice.server.PriceService;

import java.util.List;
import java.util.Set;

public class OrderServiceImplTest {

    @Inject
    private OrderService orderService;

    @Inject
    private PriceService priceService;

    @BeforeEach
    public void setUp() {
        Guice.createInjector(Modules.override(new ServerModule())
                /*new AbstractModule() {
                    @Override
                    protected void configure() {
                        bind(PriceService.class).toInstance(new PriceServiceImpl(){
                            @Override
                            public long getPrice(long orderId) {
                                return 567L;
                            }
                        });
                    }}*/
                .with(new AbstractModule() {
                    @Override
                    protected void configure() {
                        bind(PriceService.class).to(PriceServiceMock.class);
                    }
                })
        ).injectMembers(this);
    }

    @Test
    void testSendToPayment() {
        Assertions.assertThrowsExactly(RuntimeException.class,
                () -> orderService.sendToPayment(789L));
    }

    @Test
    void testSupportedCurrencies() {
        Assertions.assertIterableEquals(priceService.getSupportedCurrencies().stream().sorted().toList(),
                List.of("CNY", "EUR", "USD"));
    }
}

class PriceServiceMock extends PriceServiceImpl {
    @Inject
    public PriceServiceMock(Set<String> supportedCurrencies) {
        super(supportedCurrencies, null);
    }

    @Override
    public long getPrice(long orderId) {
        return 567L;
    }
}
