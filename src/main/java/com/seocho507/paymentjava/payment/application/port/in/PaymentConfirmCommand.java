package com.seocho507.paymentjava.payment.application.port.in;

import java.math.BigDecimal;

public record PaymentConfirmCommand(
        Long paymentId,
        Long orderId,
        BigDecimal amount
) {
    public static PaymentConfirmCommand of(Long paymentId, Long orderId, BigDecimal amount) {
        return new PaymentConfirmCommand(paymentId, orderId, amount);
    }
}
