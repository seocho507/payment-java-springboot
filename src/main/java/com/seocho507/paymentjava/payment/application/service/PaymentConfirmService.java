package com.seocho507.paymentjava.payment.application.service;

import com.seocho507.paymentjava.common.UseCase;
import com.seocho507.paymentjava.payment.application.port.in.PaymentConfirmCommand;
import com.seocho507.paymentjava.payment.application.port.in.PaymentConfirmUseCase;
import com.seocho507.paymentjava.payment.application.port.out.PaymentStatusUpdatePort;
import com.seocho507.paymentjava.payment.domain.PaymentConfirmResult;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@UseCase
public class PaymentConfirmService implements PaymentConfirmUseCase {

    private final PaymentStatusUpdatePort paymentStatusUpdatePort;

    @Override
    public Mono<PaymentConfirmResult> confirm(PaymentConfirmCommand command) {
        return null; // TODO : Implement
    }
}
