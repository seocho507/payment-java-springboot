package com.seocho507.paymentjava.payment.application.port.in;

import com.seocho507.paymentjava.payment.domain.PaymentConfirmResult;
import reactor.core.publisher.Mono;

public interface PaymentConfirmUseCase {
    Mono<PaymentConfirmResult> confirm(PaymentConfirmCommand command);
}
