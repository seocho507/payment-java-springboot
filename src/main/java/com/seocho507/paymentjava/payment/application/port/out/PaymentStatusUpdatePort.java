package com.seocho507.paymentjava.payment.application.port.out;

import reactor.core.publisher.Mono;

public interface PaymentStatusUpdatePort {

    Mono<Boolean> updatePaymentStatus(Long paymentId, Long status);
}
