package org.test.guice.server;

public interface OrderService {
    void sendToPayment(long orderId);
}
