package com.seocho507.paymentjava.payment.domain;

import java.math.BigDecimal;
import java.util.Optional;

public record PaymentOrder(
        Long id,
        Long paymentEventId,
        Long orderId,
        Long productId,
        Long sellerId,
        BigDecimal amount,
        PaymentStatus status,
        Optional<Boolean> isLedgerUpdated,
        Optional<Boolean> isWalletUpdated) {

}
