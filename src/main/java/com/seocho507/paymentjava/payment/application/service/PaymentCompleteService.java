package com.seocho507.paymentjava.payment.application.service;

import com.seocho507.paymentjava.common.UseCase;
import com.seocho507.paymentjava.payment.application.port.in.PaymentCompleteUseCase;
import com.seocho507.paymentjava.payment.application.port.out.CompletePaymentPort;
import com.seocho507.paymentjava.payment.application.port.out.LoadPaymentPort;
import com.seocho507.paymentjava.payment.domain.WalletEventMessage;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@UseCase
public class PaymentCompleteService implements PaymentCompleteUseCase {

    private final CompletePaymentPort completePaymentPort;
    private final LoadPaymentPort loadPaymentPort;


    @Override
    public Mono<Void> completePayment(WalletEventMessage walletEventMessage) {
        return null;
    }
}
