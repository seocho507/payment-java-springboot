package com.seocho507.paymentjava.payment.domain;

import java.util.List;
import java.util.Optional;

public record PaymentEvent(
        Long id,
        Long buyerId,
        String orderId,
        String orderName,
        Long paymentId,
        PaymentType paymentType,
        Long approvedAt,
        Long canceledAt,
        List<PaymentOrder> paymentOrders,
        Optional<Boolean> isPaymentDone
) {
}
