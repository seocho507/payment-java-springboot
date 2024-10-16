package com.seocho507.paymentjava.payment.application.port.in;

import com.seocho507.paymentjava.payment.domain.WalletEventMessage;
import reactor.core.publisher.Mono;

public interface PaymentCompleteUseCase {

    Mono<Void> completePayment(WalletEventMessage walletEventMessage);
}
