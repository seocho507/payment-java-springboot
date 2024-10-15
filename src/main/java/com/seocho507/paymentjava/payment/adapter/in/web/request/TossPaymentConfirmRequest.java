package com.seocho507.paymentjava.payment.adapter.in.web.request;

import java.math.BigDecimal;

public record TossPaymentConfirmRequest(
        Long paymentId,
        Long orderId,
        BigDecimal amount
) {
}
