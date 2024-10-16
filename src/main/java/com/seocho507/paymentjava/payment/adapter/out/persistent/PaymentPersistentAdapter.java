package com.seocho507.paymentjava.payment.adapter.out.persistent;

import com.seocho507.paymentjava.common.PersistentAdapter;
import com.seocho507.paymentjava.payment.application.port.out.CompletePaymentPort;
import com.seocho507.paymentjava.payment.application.port.out.LoadPaymentPort;
import com.seocho507.paymentjava.payment.application.port.out.PaymentStatusUpdatePort;
import reactor.core.publisher.Mono;

@PersistentAdapter
public class PaymentPersistentAdapter implements PaymentStatusUpdatePort, CompletePaymentPort, LoadPaymentPort {

    @Override
    public Mono<Boolean> updatePaymentStatus(Long paymentId, Long status) {
        return null;
    }
}
