package com.seocho507.paymentjava.payment.adapter.out.persistent.repository;

import com.seocho507.paymentjava.payment.domain.PaymentEvent;
import reactor.core.publisher.Mono;

public interface PaymentRepository {
    Mono<Void> save(PaymentEvent paymentEvent);

}
