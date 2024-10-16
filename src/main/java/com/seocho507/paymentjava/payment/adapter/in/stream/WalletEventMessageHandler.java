package com.seocho507.paymentjava.payment.adapter.in.stream;

import com.seocho507.paymentjava.common.StreamAdapter;
import com.seocho507.paymentjava.payment.application.port.in.PaymentCompleteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@StreamAdapter
@Configuration
public class WalletEventMessageHandler {

    private final PaymentCompleteUseCase paymentCompleteUseCase;
}
