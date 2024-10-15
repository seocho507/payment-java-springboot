package com.seocho507.paymentjava.payment.adapter.in.web.api;

import com.seocho507.paymentjava.common.WebAdapter;
import com.seocho507.paymentjava.payment.adapter.in.web.request.TossPaymentConfirmRequest;
import com.seocho507.paymentjava.payment.adapter.in.web.response.ApiResponse;
import com.seocho507.paymentjava.payment.application.port.in.PaymentConfirmCommand;
import com.seocho507.paymentjava.payment.application.service.PaymentConfirmService;
import com.seocho507.paymentjava.payment.domain.PaymentConfirmResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@WebAdapter
@RestController("/api/v1/payment/toss")
public class TossPaymentController {

    private final PaymentConfirmService paymentConfirmService;

    @PostMapping("/confirm")
    public Mono<ResponseEntity<ApiResponse<PaymentConfirmResult>>> confirm(@RequestBody TossPaymentConfirmRequest request) {
        final PaymentConfirmCommand command = PaymentConfirmCommand.of(request.paymentId(), request.orderId(), request.amount());

        return paymentConfirmService.confirm(command)
                .map(result -> ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK, "", result)));
    }
}
