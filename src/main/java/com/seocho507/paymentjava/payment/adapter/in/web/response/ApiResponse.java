package com.seocho507.paymentjava.payment.adapter.in.web.response;

import org.springframework.http.HttpStatus;

import java.util.Optional;

public record ApiResponse<T>(
        HttpStatus status,
        String message,
        Optional<T> data
) {
    public ApiResponse(HttpStatus status, String message) {
        this(status, message, Optional.empty());
    }

    public ApiResponse(HttpStatus status, String message, T data) {
        this(status, message, Optional.ofNullable(data));
    }
}