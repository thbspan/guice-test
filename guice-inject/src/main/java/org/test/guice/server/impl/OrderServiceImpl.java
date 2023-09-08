package org.test.guice.server.impl;

import jakarta.inject.Inject;
import org.test.guice.server.OrderService;
import org.test.guice.server.PaymentService;
import org.test.guice.server.PriceService;

public class OrderServiceImpl implements OrderService {
    // Dependencies
    // 产品价格  Product price
    private final PriceService priceService;
    // 最后付款  Final payment
    private final PaymentService paymentService;
    // 获取相关Session信息  Get related session information
    private final SessionManager sessionManager;

    // States
    private Long ordersPaid = 0L;

    @Inject
    public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
        super();
        this.priceService = priceService;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }

    @Logged
    public void sendToPayment(long orderId) {
        long price = priceService.getPrice(orderId);
        paymentService.pay(orderId, price, sessionManager.getSessionId());
        ordersPaid = ordersPaid + 1;

        // 查看方法是否真实的执行核心业务逻辑
        // To see if the method actually executes the core business logic
        throw new RuntimeException("Price=" + price
                + ". SessionId="
                + sessionManager.getSessionId()
                + ". ordersPaid= " + ordersPaid);
    }
}
